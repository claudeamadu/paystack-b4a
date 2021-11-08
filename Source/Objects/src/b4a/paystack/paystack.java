package b4a.paystack;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class paystack extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.paystack.paystack");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.paystack.paystack.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _pub_key = "";
public String _event = "";
public Object _instance = null;
public anywheresoftware.b4a.objects.ActivityWrapper _page = null;
public anywheresoftware.b4a.objects.WebViewWrapper _paymentpage = null;
public b4a.paystack.jarfileloader _jarfile = null;
public String _pagecurrenttitle = "";
public anywheresoftware.b4a.objects.IME _ime = null;
public uk.co.martinpearman.b4a.webkit.DefaultJavascriptInterface _js = null;
public uk.co.martinpearman.b4a.webkit.DefaultWebViewClient _webclient = null;
public uk.co.martinpearman.b4a.webkit.WebViewExtras _paymentpageextra = null;
public uk.co.martinpearman.b4a.webkit.DefaultWebChromeClient _chrome = null;
public uk.co.martinpearman.b4a.httpcookiemanager.B4ACookieManager _cookiemanager = null;
public boolean _loaded = false;
public String _referencecode = "";
public String _accescode = "";
public String _amountcurrency = "";
public String _currency_ghs = "";
public String _currency_ngn = "";
public String _currency_zar = "";
public String _currency_usd = "";
public b4a.paystack.main _main = null;
public b4a.paystack.starter _starter = null;
public b4a.paystack.httputils2service _httputils2service = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private PUB_KEY As String";
_pub_key = "";
 //BA.debugLineNum = 7;BA.debugLine="Private Event As String";
_event = "";
 //BA.debugLineNum = 8;BA.debugLine="Private Instance As Object";
_instance = new Object();
 //BA.debugLineNum = 10;BA.debugLine="Private Page As Activity";
_page = new anywheresoftware.b4a.objects.ActivityWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private PaymentPage As WebView";
_paymentpage = new anywheresoftware.b4a.objects.WebViewWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private JarFile As JarFileLoader";
_jarfile = new b4a.paystack.jarfileloader();
 //BA.debugLineNum = 13;BA.debugLine="Private PageCurrentTitle As String";
_pagecurrenttitle = "";
 //BA.debugLineNum = 14;BA.debugLine="Private IME As IME";
_ime = new anywheresoftware.b4a.objects.IME();
 //BA.debugLineNum = 17;BA.debugLine="Private JS As DefaultJavascriptInterface";
_js = new uk.co.martinpearman.b4a.webkit.DefaultJavascriptInterface();
 //BA.debugLineNum = 18;BA.debugLine="Private WebClient As DefaultWebViewClient";
_webclient = new uk.co.martinpearman.b4a.webkit.DefaultWebViewClient();
 //BA.debugLineNum = 19;BA.debugLine="Private PaymentPageExtra As WebViewExtras";
_paymentpageextra = new uk.co.martinpearman.b4a.webkit.WebViewExtras();
 //BA.debugLineNum = 20;BA.debugLine="Private Chrome As DefaultWebChromeClient";
_chrome = new uk.co.martinpearman.b4a.webkit.DefaultWebChromeClient();
 //BA.debugLineNum = 21;BA.debugLine="Private CookieManager As CookieManager";
_cookiemanager = new uk.co.martinpearman.b4a.httpcookiemanager.B4ACookieManager();
 //BA.debugLineNum = 25;BA.debugLine="Private Loaded As Boolean = False";
_loaded = __c.False;
 //BA.debugLineNum = 28;BA.debugLine="Private ReferenceCode As String";
_referencecode = "";
 //BA.debugLineNum = 29;BA.debugLine="Private AccesCode As String";
_accescode = "";
 //BA.debugLineNum = 30;BA.debugLine="Private AmountCurrency As String";
_amountcurrency = "";
 //BA.debugLineNum = 33;BA.debugLine="Public CURRENCY_GHS As String = \"GHS\"";
_currency_ghs = "GHS";
 //BA.debugLineNum = 34;BA.debugLine="Public CURRENCY_NGN As String = \"NGN\"";
_currency_ngn = "NGN";
 //BA.debugLineNum = 35;BA.debugLine="Public CURRENCY_ZAR As String = \"ZAR\"";
_currency_zar = "ZAR";
 //BA.debugLineNum = 36;BA.debugLine="Public CURRENCY_USD As String = \"USD\"";
_currency_usd = "USD";
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public String  _ime_heightchanged(int _newheight,int _oldheight) throws Exception{
 //BA.debugLineNum = 342;BA.debugLine="Sub IME_HeightChanged(NewHeight As Int, OldHeight";
 //BA.debugLineNum = 343;BA.debugLine="PaymentPage.Height = PaymentPage.Height - NewHeig";
_paymentpage.setHeight((int) (_paymentpage.getHeight()-_newheight));
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,String _eventname,String _key,Object _module,anywheresoftware.b4a.objects.ActivityWrapper _activity) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
 //BA.debugLineNum = 46;BA.debugLine="Public Sub Initialize(EventName As String,Key As S";
 //BA.debugLineNum = 47;BA.debugLine="JarFile.Initialize(False)";
_jarfile._initialize /*String*/ (ba,__c.False);
 //BA.debugLineNum = 48;BA.debugLine="IME.Initialize(\"IME\")";
_ime.Initialize("IME");
 //BA.debugLineNum = 49;BA.debugLine="Event = EventName";
_event = _eventname;
 //BA.debugLineNum = 51;BA.debugLine="Instance = Module";
_instance = _module;
 //BA.debugLineNum = 52;BA.debugLine="Page = Activity";
_page = _activity;
 //BA.debugLineNum = 53;BA.debugLine="PUB_KEY = Key'GetValueFromManifest(\"co.paystack.a";
_pub_key = _key;
 //BA.debugLineNum = 55;BA.debugLine="PaymentPage.Initialize(\"PaymentPage\")";
_paymentpage.Initialize(ba,"PaymentPage");
 //BA.debugLineNum = 56;BA.debugLine="PaymentPageExtra.Initialize(PaymentPage)";
_paymentpageextra.Initialize((android.webkit.WebView)(_paymentpage.getObject()));
 //BA.debugLineNum = 57;BA.debugLine="CookieManager.SetAcceptCookies(True)";
_cookiemanager.SetAcceptCookies(__c.True);
 //BA.debugLineNum = 58;BA.debugLine="CookieManager.SetAcceptFileSchemeCookies(True)";
_cookiemanager.SetAcceptFileSchemeCookies(__c.True);
 //BA.debugLineNum = 59;BA.debugLine="PaymentPage.Visible = False";
_paymentpage.setVisible(__c.False);
 //BA.debugLineNum = 60;BA.debugLine="PaymentPage.SendToBack";
_paymentpage.SendToBack();
 //BA.debugLineNum = 61;BA.debugLine="JS.Initialize";
_js.Initialize(ba);
 //BA.debugLineNum = 62;BA.debugLine="WebClient.Initialize(\"PaymentPage\")";
_webclient.Initialize(ba,"PaymentPage");
 //BA.debugLineNum = 63;BA.debugLine="Chrome.Initialize(\"Chrome\")";
_chrome.Initialize(ba,"Chrome");
 //BA.debugLineNum = 64;BA.debugLine="PaymentPageExtra.AddJavascriptInterface(JS,\"B4A\")";
_paymentpageextra.AddJavascriptInterface((Object)(_js),"B4A");
 //BA.debugLineNum = 65;BA.debugLine="PaymentPageExtra.SetWebViewClient(WebClient)";
_paymentpageextra.SetWebViewClient((android.webkit.WebViewClient)(_webclient.getObject()));
 //BA.debugLineNum = 66;BA.debugLine="PaymentPageExtra.SetWebChromeClient(Chrome)";
_paymentpageextra.SetWebChromeClient((android.webkit.WebChromeClient)(_chrome.getObject()));
 //BA.debugLineNum = 67;BA.debugLine="PaymentPageExtra.JavaScriptEnabled = True";
_paymentpageextra.setJavaScriptEnabled(__c.True);
 //BA.debugLineNum = 68;BA.debugLine="PaymentPageExtra.ZoomEnabled = False";
_paymentpageextra.setZoomEnabled(__c.False);
 //BA.debugLineNum = 70;BA.debugLine="For Each v As View In Page.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group21 = _page.GetAllViewsRecursive();
final int groupLen21 = group21.getSize()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(group21.Get(index21)));
 //BA.debugLineNum = 71;BA.debugLine="If v == PaymentPage Then";
if ((_v).equals((android.view.View)(_paymentpage.getObject()))) { 
 }else {
 //BA.debugLineNum = 74;BA.debugLine="Page.AddView(PaymentPage,0,0,100%x,100%y)";
_page.AddView((android.view.View)(_paymentpage.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 };
 }
};
 //BA.debugLineNum = 77;BA.debugLine="PageCurrentTitle = Activity.Title";
_pagecurrenttitle = BA.ObjectToString(_activity.getTitle());
 //BA.debugLineNum = 78;BA.debugLine="Activity.Title = \"Paystack\"";
_activity.setTitle(BA.ObjectToCharSequence("Paystack"));
 //BA.debugLineNum = 83;BA.debugLine="PaymentPageExtra.LoadHtml($\" <!doctype html> <htm";
_paymentpageextra.LoadHtml(("\n"+"<!doctype html>\n"+"<html>\n"+"<head>\n"+"	<title>Paystack</title>\n"+"	<script>\n"+"		function setCookie(cname, cvalue, exdays) {\n"+"		  const d = new Date();\n"+"		  d.setTime(d.getTime() + (exdays*24*60*60*1000));\n"+"		  let expires = \"expires=\"+ d.toUTCString();\n"+"		  document.cookie = cname + \"=\" + cvalue + \";\" + expires + \";path=/\";\n"+"		}\n"+"		setCookie('SameSite', 'Secure', 1);\n"+"	</script>\n"+"</head>\n"+"<body>\n"+"	<script>\n"+"		function Pay(key,email,amount,ref,label,currency){\n"+"			let handler = PaystackPop.setup({\n"+"				key: key,\n"+"				email: email,\n"+"				amount: amount * 100,\n"+"				ref: ref+Math.floor((Math.random() * 1000000000) + 1),\n"+"				label: label,\n"+"				currency: currency,\n"+"				onClose: function(){\n"+"					B4A.CallSub(\"Message\",true,\"Paystack\",\"Payment Cancelled\",\"cancelled\");\n"+"				},\n"+"				callback: function(response){	\n"+"					if(response.status == 'success'){\n"+"						B4A.CallSub(\"Message\",true,\"Paystack\",\"Payment of \"+currency+amount+\" Successul\",\"success\");\n"+"					}else{\n"+"						B4A.CallSub(\"Message\",true,\"Paystack\",\"Error: \"+response.status,\"error\");\n"+"					}\n"+"				}\n"+"			});\n"+"			handler.openIframe();\n"+"		}\n"+"	</script>\n"+"	<script type=\"text/javascript\" src=\"https://js.paystack.co/v1/inline.js\"></script>\n"+"</script>\n"+"</body>\n"+"</html>\n"+"	"));
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _initializetransaction(String _email,int _amount,String _reference,String _label,String _currency) throws Exception{
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
 //BA.debugLineNum = 197;BA.debugLine="Public Sub InitializeTransaction(Email As String,";
 //BA.debugLineNum = 211;BA.debugLine="If Loaded == True Then";
if (_loaded==__c.True) { 
 //BA.debugLineNum = 212;BA.debugLine="ReferenceCode = Reference";
_referencecode = _reference;
 //BA.debugLineNum = 213;BA.debugLine="PaymentPageExtra.ExecuteJavascript(\"Pay('\"&PUB_K";
_paymentpageextra.ExecuteJavascript("Pay('"+_pub_key+"','"+_email+"',"+BA.NumberToString(_amount)+",'"+_reference+"','"+_label+"','"+_currency+"');");
 //BA.debugLineNum = 214;BA.debugLine="For Each v As View In Page.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group4 = _page.GetAllViewsRecursive();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(group4.Get(index4)));
 //BA.debugLineNum = 215;BA.debugLine="If v.Visible == True Then";
if (_v.getVisible()==__c.True) { 
 //BA.debugLineNum = 216;BA.debugLine="v.Visible = False";
_v.setVisible(__c.False);
 };
 }
};
 //BA.debugLineNum = 219;BA.debugLine="PaymentPageExtra.BringToFront";
_paymentpageextra.BringToFront();
 //BA.debugLineNum = 220;BA.debugLine="PaymentPageExtra.Visible = True";
_paymentpageextra.setVisible(__c.True);
 //BA.debugLineNum = 221;BA.debugLine="SetNavigationBarColor(Colors.RGB(189,229,244))";
_setnavigationbarcolor(__c.Colors.RGB((int) (189),(int) (229),(int) (244)));
 };
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return "";
}
public String  _message(String _title,String _text,String _state) throws Exception{
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
 //BA.debugLineNum = 347;BA.debugLine="Private Sub Message(Title As String, Text As Strin";
 //BA.debugLineNum = 348;BA.debugLine="Msgbox2Async(Text, Title, \"\", \"Ok\", \"\", JarFile.L";
__c.Msgbox2Async(BA.ObjectToCharSequence(_text),BA.ObjectToCharSequence(_title),"","Ok","",_jarfile._loadbitmapfromjar /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ("paystack-logo.png"),ba,__c.True);
 //BA.debugLineNum = 349;BA.debugLine="If PaymentPage.Visible == True Then";
if (_paymentpage.getVisible()==__c.True) { 
 //BA.debugLineNum = 350;BA.debugLine="For Each v As View In Page.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group3 = _page.GetAllViewsRecursive();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(group3.Get(index3)));
 //BA.debugLineNum = 351;BA.debugLine="If v.Visible == False Then";
if (_v.getVisible()==__c.False) { 
 //BA.debugLineNum = 352;BA.debugLine="v.Visible = True";
_v.setVisible(__c.True);
 };
 }
};
 //BA.debugLineNum = 355;BA.debugLine="PaymentPage.SendToBack";
_paymentpage.SendToBack();
 //BA.debugLineNum = 356;BA.debugLine="PaymentPage.Visible = False";
_paymentpage.setVisible(__c.False);
 //BA.debugLineNum = 357;BA.debugLine="Page.Title = PageCurrentTitle";
_page.setTitle(BA.ObjectToCharSequence(_pagecurrenttitle));
 };
 //BA.debugLineNum = 361;BA.debugLine="CallSub3(Instance,Event&\"_TransactionStatus\",Refe";
__c.CallSubNew3(ba,_instance,_event+"_TransactionStatus",(Object)(_referencecode),(Object)(_state));
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
return "";
}
public boolean  _paymentpage_overrideurl(String _url) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Private Sub PaymentPage_OverrideUrl (Url As String";
 //BA.debugLineNum = 184;BA.debugLine="Log(Url)";
__c.LogImpl("11114113",_url,0);
 //BA.debugLineNum = 185;BA.debugLine="If Url.Contains(\"api.com\") Then";
if (_url.contains("api.com")) { 
 };
 //BA.debugLineNum = 188;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return false;
}
public String  _paymentpage_pagefinished(String _url) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Private Sub PaymentPage_PageFinished (Url As Strin";
 //BA.debugLineNum = 156;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
 //BA.debugLineNum = 157;BA.debugLine="Loaded = True";
_loaded = __c.True;
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return "";
}
public String  _setnavigationbarcolor(int _clr) throws Exception{
anywheresoftware.b4a.phone.Phone _p = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _window = null;
 //BA.debugLineNum = 329;BA.debugLine="Private Sub SetNavigationBarColor(clr As Int)";
 //BA.debugLineNum = 330;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
 //BA.debugLineNum = 331;BA.debugLine="If p.SdkVersion >= 21 Then  'versão 5.0";
if (_p.getSdkVersion()>=21) { 
 //BA.debugLineNum = 332;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 333;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(ba);
 //BA.debugLineNum = 334;BA.debugLine="Dim window As JavaObject = jo.RunMethodJO(\"getWi";
_window = new anywheresoftware.b4j.object.JavaObject();
_window = _jo.RunMethodJO("getWindow",(Object[])(__c.Null));
 //BA.debugLineNum = 335;BA.debugLine="window.RunMethod(\"addFlags\", Array (0x80000000))";
_window.RunMethod("addFlags",new Object[]{(Object)(0x80000000)});
 //BA.debugLineNum = 336;BA.debugLine="window.RunMethod(\"clearFlags\", Array (0x04000000";
_window.RunMethod("clearFlags",new Object[]{(Object)(0x04000000)});
 //BA.debugLineNum = 337;BA.debugLine="window.RunMethod(\"setNavigationBarColor\", Array(";
_window.RunMethod("setNavigationBarColor",new Object[]{(Object)(_clr)});
 //BA.debugLineNum = 338;BA.debugLine="window.RunMethod(\"setStatusBarColor\", Array(clr)";
_window.RunMethod("setStatusBarColor",new Object[]{(Object)(_clr)});
 };
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
