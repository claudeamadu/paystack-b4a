B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=11
@EndOfDesignText@
#Event: TransactionStatus(Reference As String,Status As String)
#Event: TransactionResponse(Reference As String,Response As String)
#Event: Ready(Status As String)

Sub Class_Globals
	'Class
	Private PUB_KEY As String
	Private Event As String
	Private Instance As Object
'	Private Java As Object
	Private Page As Activity
	Private PaymentPage As WebView
	Private JarFile As JarFileLoader
	Private PageCurrentTitle As String
	Private IME As IME
	Private POPUP  As Boolean = False
	Private POPUP_PANEL  As Panel
	
	'WebvView
	Private JS As DefaultJavascriptInterface
	Private WebClient As DefaultWebViewClient
	Private PaymentPageExtra As WebViewExtras
	Private Chrome As DefaultWebChromeClient
	Private CookieManager As CookieManager
	Private Loaded As Boolean = False
	Public ShowMessage As Boolean = True
	
	'Payment
	Private ReferenceCode As String
	Private AccesCode As String
	Private AmountCurrency As String
	
	'Currency
	Public CURRENCY_GHS As String = "GHS"
	Public CURRENCY_NGN As String = "NGN"
	Public CURRENCY_ZAR As String = "ZAR"
	Public CURRENCY_USD As String = "USD"
	
	Private HTML As String = $"
<!doctype html>
<html>
<head>
	<title>Paystack</title>
	<script>
		function setCookie(cname, cvalue, exdays) {
		  const d = new Date();
		  d.setTime(d.getTime() + (exdays*24*60*60*1000));
		  let expires = "expires="+ d.toUTCString();
		  document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/";
		}
		setCookie('SameSite', 'Secure', 1);
	</script>
</head>
<body>
	<script>
		function Pay(key,email,amount,ref,label,currency){
			let handler = PaystackPop.setup({
				key: key,
				email: email,
				amount: amount * 100,
				ref: ref+Math.floor((Math.random() * 1000000000) + 1),
				label: label,
				currency: currency,
				onClose: function(){
					B4A.CallSub("Message",true,"Paystack","Payment Cancelled","cancelled");
				},
				callback: function(response){	
					if(response.status == 'success'){
						B4A.CallSub("Message",true,"Paystack","Payment of "+currency+amount+" Successul","success");
					}else{
						B4A.CallSub("Message",true,"Paystack","Error: "+response.status,"error");
					}
				}
			});
			handler.openIframe();
		}
	</script>
	<script type="text/javascript" src="https://js.paystack.co/v1/inline.js"></script>
</script>
</body>
</html>
	"$
End Sub

'Initializes Paystack
'EventName - Event Name
'Key - Public Key
'Module - Current Module
'Activity - Current Activity
'Pop - Initilizes as a popup
'<code>
'Pay.Initialize("Pay","pk_test_xxxx",Me,Activity,False)
'</code>
Public Sub Initialize(EventName As String,Key As String, Module As Object, Activity As Activity,Pop As Boolean)
	JarFile.Initialize(False)
	IME.Initialize("IME")
	Event = EventName
'	Java = Jo
	Instance = Module
	Page = Activity
	PUB_KEY = Key'GetValueFromManifest("co.paystack.android.PublicKey")
	PaymentPage.Initialize("PaymentPage")
	PaymentPageExtra.Initialize(PaymentPage)
	CookieManager.SetAcceptCookies(True)
	CookieManager.SetAcceptFileSchemeCookies(True)
	JS.Initialize
	WebClient.Initialize("PaymentPage")
	Chrome.Initialize("Chrome")
	PaymentPageExtra.AddJavascriptInterface(JS,"B4A")
	PaymentPageExtra.SetWebViewClient(WebClient)
	PaymentPageExtra.SetWebChromeClient(Chrome)
	PaymentPageExtra.JavaScriptEnabled = True
	PaymentPageExtra.ZoomEnabled = False
	
	PageCurrentTitle = Activity.Title
	Activity.Title = "Paystack"
	
	If Pop == True Then
		POPUP_PANEL.Initialize("POPUP_PANEL")
		POPUP_PANEL.SendToBack
		POPUP_PANEL.Visible = False
		PaymentPageExtra.LoadHtml(HTML)
		POPUP_PANEL.Width = 100%x
		POPUP_PANEL.Height = 100%y
		POPUP_PANEL.Color = Colors.ARGB(100,0,0,0)
		For Each v As View In Page.GetAllViewsRecursive
			If v == PaymentPage Then
				'Nothing
			Else
				Page.AddView(POPUP_PANEL,0,0,100%x,100%y)
				POPUP_PANEL.AddView(PaymentPage,POPUP_PANEL.Left+50dip,POPUP_PANEL.Top+80dip,POPUP_PANEL.Width-100dip,POPUP_PANEL.Height-160dip)
				Dim s As Shape
				s.Initialize.CreateRoundRectShape(30,30,30,30)
				Dim sd As ShapeDrawable
				sd.Initialize.SetShape(s).SetAlpha(100).SetColor(Colors.Blue).SetViewBackground(PaymentPage)
			End If
		Next
	Else
		PaymentPage.Visible = False
		PaymentPage.SendToBack
		For Each v As View In Page.GetAllViewsRecursive
			If v == PaymentPage Then
				'Nothing
			Else
				Page.AddView(PaymentPage,0,0,100%x,100%y)
			End If
		Next
	End If
	PaymentPageExtra.LoadHtml(HTML)
	If SubExists(Instance,Event&"_Ready") Then
		CallSub2(Instance,Event&"_Ready","Ready")
	End If
	POPUP = Pop
End Sub

Private Sub PaymentPage_PageFinished (Url As String)
	ProgressDialogHide
	Loaded = True
End Sub

'Public Sub GetPublicKey As Object
'	Dim ctxt As JavaObject
'	ctxt.InitializeContext
'	Dim ApplicationInfo As JavaObject = ctxt.RunMethodJO("getPackageManager", Null).RunMethod("getApplicationInfo", _
'       Array(Application.PackageName, 0x00000080))
'	Dim bundle As JavaObject = ApplicationInfo.GetField("metaData")
'	Return bundle.RunMethod("getString", Array("co.paystack.android.PublicKey"))
'End Sub

Private Sub PaymentPage_OverrideUrl (Url As String) As Boolean
	Log(Url)
	If Url.Contains("api.com") Then
'		VerifyTransaction(ReferenceCode)
	End If
	Return True
End Sub

'Starts a transaction
'Email - Email of the payee
'Amount - Payment amount
'Reference - Reference of transaction
'Currency - Currency of transaction
'<code>Pay.InitializeTransaction("oxxxxx@gmail.com", 1,"test-1234",Pay.CURRENCY_USD)</code>
Public Sub InitializeTransaction(Email As String, Amount As Int,Reference As String,Label As String,Currency As String)
	If Loaded == True Then
	ReferenceCode = Reference
		PaymentPageExtra.ExecuteJavascript("Pay('"&PUB_KEY&"','"&Email&"',"&Amount&",'"&Reference&"','"&Label&"','"&Currency&"');")
		If POPUP == False Then
			For Each v As View In Page.GetAllViewsRecursive
				If v.Visible == True Then
					v.Visible = False
				End If
			Next
			PaymentPageExtra.BringToFront
			PaymentPageExtra.Visible = True
		Else
			For Each v As View In Page.GetAllViewsRecursive
				If v.Visible == True Then
					v.Visible = False
				End If
			Next
			POPUP_PANEL.BringToFront
			POPUP_PANEL.SetVisibleAnimated(1000,True)
			PaymentPage.SetVisibleAnimated(1000,True)
		End If
		SetNavigationBarColor(Colors.RGB(189,229,244))
'	Else
'		Message("Error","Failed to load","error")
	End If
End Sub

Private Sub SetNavigationBarColor(clr As Int)
	Dim p As Phone
	If p.SdkVersion >= 21 Then  'versão 5.0
		Dim jo As JavaObject
		jo.InitializeContext
		Dim window As JavaObject = jo.RunMethodJO("getWindow", Null)
		window.RunMethod("addFlags", Array (0x80000000))
		window.RunMethod("clearFlags", Array (0x04000000))
		window.RunMethod("setNavigationBarColor", Array(clr))
		window.RunMethod("setStatusBarColor", Array(clr))
	End If
End Sub

Sub IME_HeightChanged(NewHeight As Int, OldHeight As Int)
	PaymentPage.Height = PaymentPage.Height - NewHeight
End Sub

Private Sub Message(Title As String, Text As String,State As String)
	If ShowMessage == True Then
		Msgbox2Async(Text, Title, "", "Ok", "", JarFile.LoadBitmapFromJar("paystack-logo.png"), True)
	End If
	If PaymentPage.Visible == True And POPUP == False Then
		For Each v As View In Page.GetAllViewsRecursive
			If v.Visible == False Then
				v.Visible = True
			End If
		Next
		PaymentPage.SendToBack
		PaymentPage.Visible = False
	Else If PaymentPage.Visible == True And POPUP == True Then
		For Each v As View In Page.GetAllViewsRecursive
			If v.Visible == False Then
				v.Visible = True
			End If
		Next
		POPUP_PANEL.SendToBack
		POPUP_PANEL.SetVisibleAnimated(1000,False)
	End If
	Page.Title = PageCurrentTitle
	
	If SubExists(Instance,Event&"_TransactionStatus") Then
		CallSub3(Instance,Event&"_TransactionStatus",ReferenceCode,State)
	End If
	If SubExists(Instance,Event&"_TransactionResponse") Then
		CallSub3(Instance,Event&"_TransactionResponse",ReferenceCode,State)
	End If
End Sub