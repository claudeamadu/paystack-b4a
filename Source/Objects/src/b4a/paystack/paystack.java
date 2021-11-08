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
public boolean _popup = false;
public anywheresoftware.b4a.objects.PanelWrapper _popup_panel = null;
public uk.co.martinpearman.b4a.webkit.DefaultJavascriptInterface _js = null;
public uk.co.martinpearman.b4a.webkit.DefaultWebViewClient _webclient = null;
public uk.co.martinpearman.b4a.webkit.WebViewExtras _paymentpageextra = null;
public uk.co.martinpearman.b4a.webkit.DefaultWebChromeClient _chrome = null;
public uk.co.martinpearman.b4a.httpcookiemanager.B4ACookieManager _cookiemanager = null;
public boolean _loaded = false;
public boolean _showmessage = false;
public String _referencecode = "";
public String _accescode = "";
public String _amountcurrency = "";
public String _currency_ghs = "";
public String _currency_ngn = "";
public String _currency_zar = "";
public String _currency_usd = "";
public String _html = "";
public b4a.paystack.httputils2service _httputils2service = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private PUB_KEY As String";
_pub_key = "";
 //BA.debugLineNum = 8;BA.debugLine="Private Event As String";
_event = "";
 //BA.debugLineNum = 9;BA.debugLine="Private Instance As Object";
_instance = new Object();
 //BA.debugLineNum = 11;BA.debugLine="Private Page As Activity";
_page = new anywheresoftware.b4a.objects.ActivityWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private PaymentPage As WebView";
_paymentpage = new anywheresoftware.b4a.objects.WebViewWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private JarFile As JarFileLoader";
_jarfile = new b4a.paystack.jarfileloader();
 //BA.debugLineNum = 14;BA.debugLine="Private PageCurrentTitle As String";
_pagecurrenttitle = "";
 //BA.debugLineNum = 15;BA.debugLine="Private IME As IME";
_ime = new anywheresoftware.b4a.objects.IME();
 //BA.debugLineNum = 16;BA.debugLine="Private POPUP  As Boolean = False";
_popup = __c.False;
 //BA.debugLineNum = 17;BA.debugLine="Private POPUP_PANEL  As Panel";
_popup_panel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private JS As DefaultJavascriptInterface";
_js = new uk.co.martinpearman.b4a.webkit.DefaultJavascriptInterface();
 //BA.debugLineNum = 21;BA.debugLine="Private WebClient As DefaultWebViewClient";
_webclient = new uk.co.martinpearman.b4a.webkit.DefaultWebViewClient();
 //BA.debugLineNum = 22;BA.debugLine="Private PaymentPageExtra As WebViewExtras";
_paymentpageextra = new uk.co.martinpearman.b4a.webkit.WebViewExtras();
 //BA.debugLineNum = 23;BA.debugLine="Private Chrome As DefaultWebChromeClient";
_chrome = new uk.co.martinpearman.b4a.webkit.DefaultWebChromeClient();
 //BA.debugLineNum = 24;BA.debugLine="Private CookieManager As CookieManager";
_cookiemanager = new uk.co.martinpearman.b4a.httpcookiemanager.B4ACookieManager();
 //BA.debugLineNum = 25;BA.debugLine="Private Loaded As Boolean = False";
_loaded = __c.False;
 //BA.debugLineNum = 26;BA.debugLine="Public ShowMessage As Boolean = True";
_showmessage = __c.True;
 //BA.debugLineNum = 29;BA.debugLine="Private ReferenceCode As String";
_referencecode = "";
 //BA.debugLineNum = 30;BA.debugLine="Private AccesCode As String";
_accescode = "";
 //BA.debugLineNum = 31;BA.debugLine="Private AmountCurrency As String";
_amountcurrency = "";
 //BA.debugLineNum = 34;BA.debugLine="Public CURRENCY_GHS As String = \"GHS\"";
_currency_ghs = "GHS";
 //BA.debugLineNum = 35;BA.debugLine="Public CURRENCY_NGN As String = \"NGN\"";
_currency_ngn = "NGN";
 //BA.debugLineNum = 36;BA.debugLine="Public CURRENCY_ZAR As String = \"ZAR\"";
_currency_zar = "ZAR";
 //BA.debugLineNum = 37;BA.debugLine="Public CURRENCY_USD As String = \"USD\"";
_currency_usd = "USD";
 //BA.debugLineNum = 39;BA.debugLine="Private HTML As String = $\" <!doctype html> <html";
_html = ("\n"+"<!doctype html>\n"+"<html>\n"+"<head>\n"+"	<title>Paystack</title>\n"+"	<script>\n"+"		function setCookie(cname, cvalue, exdays) {\n"+"		  const d = new Date();\n"+"		  d.setTime(d.getTime() + (exdays*24*60*60*1000));\n"+"		  let expires = \"expires=\"+ d.toUTCString();\n"+"		  document.cookie = cname + \"=\" + cvalue + \";\" + expires + \";path=/\";\n"+"		}\n"+"		setCookie('SameSite', 'Secure', 1);\n"+"	</script>\n"+"</head>\n"+"<body>\n"+"	<script>\n"+"		function Pay(key,email,amount,ref,label,currency){\n"+"			let handler = PaystackPop.setup({\n"+"				key: key,\n"+"				email: email,\n"+"				amount: amount * 100,\n"+"				ref: ref+Math.floor((Math.random() * 1000000000) + 1),\n"+"				label: label,\n"+"				currency: currency,\n"+"				onClose: function(){\n"+"					B4A.CallSub(\"Message\",true,\"Paystack\",\"Payment Cancelled\",\"cancelled\");\n"+"				},\n"+"				callback: function(response){	\n"+"					if(response.status == 'success'){\n"+"						B4A.CallSub(\"Message\",true,\"Paystack\",\"Payment of \"+currency+amount+\" Successul\",\"success\");\n"+"					}else{\n"+"						B4A.CallSub(\"Message\",true,\"Paystack\",\"Error: \"+response.status,\"error\");\n"+"					}\n"+"				}\n"+"			});\n"+"			handler.openIframe();\n"+"		}\n"+"	</script>\n"+"	<script type=\"text/javascript\" src=\"https://js.paystack.co/v1/inline.js\"></script>\n"+"</script>\n"+"</body>\n"+"</html>\n"+"	");
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public String  _ime_heightchanged(int _newheight,int _oldheight) throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Sub IME_HeightChanged(NewHeight As Int, OldHeight";
 //BA.debugLineNum = 226;BA.debugLine="PaymentPage.Height = PaymentPage.Height - NewHeig";
_paymentpage.setHeight((int) (_paymentpage.getHeight()-_newheight));
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,String _eventname,String _key,Object _module,anywheresoftware.b4a.objects.ActivityWrapper _activity,boolean _pop) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
com.brandsum.shape _s = null;
com.brandsum.shapedrawable _sd = null;
 //BA.debugLineNum = 94;BA.debugLine="Public Sub Initialize(EventName As String,Key As S";
 //BA.debugLineNum = 95;BA.debugLine="JarFile.Initialize(False)";
_jarfile._initialize /*String*/ (ba,__c.False);
 //BA.debugLineNum = 96;BA.debugLine="IME.Initialize(\"IME\")";
_ime.Initialize("IME");
 //BA.debugLineNum = 97;BA.debugLine="Event = EventName";
_event = _eventname;
 //BA.debugLineNum = 99;BA.debugLine="Instance = Module";
_instance = _module;
 //BA.debugLineNum = 100;BA.debugLine="Page = Activity";
_page = _activity;
 //BA.debugLineNum = 101;BA.debugLine="PUB_KEY = Key'GetValueFromManifest(\"co.paystack.a";
_pub_key = _key;
 //BA.debugLineNum = 102;BA.debugLine="PaymentPage.Initialize(\"PaymentPage\")";
_paymentpage.Initialize(ba,"PaymentPage");
 //BA.debugLineNum = 103;BA.debugLine="PaymentPageExtra.Initialize(PaymentPage)";
_paymentpageextra.Initialize((android.webkit.WebView)(_paymentpage.getObject()));
 //BA.debugLineNum = 104;BA.debugLine="CookieManager.SetAcceptCookies(True)";
_cookiemanager.SetAcceptCookies(__c.True);
 //BA.debugLineNum = 105;BA.debugLine="CookieManager.SetAcceptFileSchemeCookies(True)";
_cookiemanager.SetAcceptFileSchemeCookies(__c.True);
 //BA.debugLineNum = 106;BA.debugLine="JS.Initialize";
_js.Initialize(ba);
 //BA.debugLineNum = 107;BA.debugLine="WebClient.Initialize(\"PaymentPage\")";
_webclient.Initialize(ba,"PaymentPage");
 //BA.debugLineNum = 108;BA.debugLine="Chrome.Initialize(\"Chrome\")";
_chrome.Initialize(ba,"Chrome");
 //BA.debugLineNum = 109;BA.debugLine="PaymentPageExtra.AddJavascriptInterface(JS,\"B4A\")";
_paymentpageextra.AddJavascriptInterface((Object)(_js),"B4A");
 //BA.debugLineNum = 110;BA.debugLine="PaymentPageExtra.SetWebViewClient(WebClient)";
_paymentpageextra.SetWebViewClient((android.webkit.WebViewClient)(_webclient.getObject()));
 //BA.debugLineNum = 111;BA.debugLine="PaymentPageExtra.SetWebChromeClient(Chrome)";
_paymentpageextra.SetWebChromeClient((android.webkit.WebChromeClient)(_chrome.getObject()));
 //BA.debugLineNum = 112;BA.debugLine="PaymentPageExtra.JavaScriptEnabled = True";
_paymentpageextra.setJavaScriptEnabled(__c.True);
 //BA.debugLineNum = 113;BA.debugLine="PaymentPageExtra.ZoomEnabled = False";
_paymentpageextra.setZoomEnabled(__c.False);
 //BA.debugLineNum = 115;BA.debugLine="PageCurrentTitle = Activity.Title";
_pagecurrenttitle = BA.ObjectToString(_activity.getTitle());
 //BA.debugLineNum = 116;BA.debugLine="Activity.Title = \"Paystack\"";
_activity.setTitle(BA.ObjectToCharSequence("Paystack"));
 //BA.debugLineNum = 118;BA.debugLine="If Pop == True Then";
if (_pop==__c.True) { 
 //BA.debugLineNum = 119;BA.debugLine="POPUP_PANEL.Initialize(\"POPUP_PANEL\")";
_popup_panel.Initialize(ba,"POPUP_PANEL");
 //BA.debugLineNum = 120;BA.debugLine="POPUP_PANEL.SendToBack";
_popup_panel.SendToBack();
 //BA.debugLineNum = 121;BA.debugLine="POPUP_PANEL.Visible = False";
_popup_panel.setVisible(__c.False);
 //BA.debugLineNum = 122;BA.debugLine="PaymentPageExtra.LoadHtml(HTML)";
_paymentpageextra.LoadHtml(_html);
 //BA.debugLineNum = 123;BA.debugLine="POPUP_PANEL.Width = 100%x";
_popup_panel.setWidth(__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 124;BA.debugLine="POPUP_PANEL.Height = 100%y";
_popup_panel.setHeight(__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 125;BA.debugLine="POPUP_PANEL.Color = Colors.ARGB(100,0,0,0)";
_popup_panel.setColor(__c.Colors.ARGB((int) (100),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 126;BA.debugLine="For Each v As View In Page.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group29 = _page.GetAllViewsRecursive();
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(group29.Get(index29)));
 //BA.debugLineNum = 127;BA.debugLine="If v == PaymentPage Then";
if ((_v).equals((android.view.View)(_paymentpage.getObject()))) { 
 }else {
 //BA.debugLineNum = 130;BA.debugLine="Page.AddView(POPUP_PANEL,0,0,100%x,100%y)";
_page.AddView((android.view.View)(_popup_panel.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 131;BA.debugLine="POPUP_PANEL.AddView(PaymentPage,POPUP_PANEL.Le";
_popup_panel.AddView((android.view.View)(_paymentpage.getObject()),(int) (_popup_panel.getLeft()+__c.DipToCurrent((int) (50))),(int) (_popup_panel.getTop()+__c.DipToCurrent((int) (80))),(int) (_popup_panel.getWidth()-__c.DipToCurrent((int) (100))),(int) (_popup_panel.getHeight()-__c.DipToCurrent((int) (160))));
 //BA.debugLineNum = 132;BA.debugLine="Dim s As Shape";
_s = new com.brandsum.shape();
 //BA.debugLineNum = 133;BA.debugLine="s.Initialize.CreateRoundRectShape(30,30,30,30)";
_s._initialize(ba)._createroundrectshape((int) (30),(int) (30),(int) (30),(int) (30));
 //BA.debugLineNum = 134;BA.debugLine="Dim sd As ShapeDrawable";
_sd = new com.brandsum.shapedrawable();
 //BA.debugLineNum = 135;BA.debugLine="sd.Initialize.SetShape(s).SetAlpha(100).SetCol";
_sd._initialize(ba)._setshape(_s)._setalpha((int) (100))._setcolor(__c.Colors.Blue)._setviewbackground((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_paymentpage.getObject())));
 };
 }
};
 }else {
 //BA.debugLineNum = 139;BA.debugLine="PaymentPage.Visible = False";
_paymentpage.setVisible(__c.False);
 //BA.debugLineNum = 140;BA.debugLine="PaymentPage.SendToBack";
_paymentpage.SendToBack();
 //BA.debugLineNum = 141;BA.debugLine="For Each v As View In Page.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group43 = _page.GetAllViewsRecursive();
final int groupLen43 = group43.getSize()
;int index43 = 0;
;
for (; index43 < groupLen43;index43++){
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(group43.Get(index43)));
 //BA.debugLineNum = 142;BA.debugLine="If v == PaymentPage Then";
if ((_v).equals((android.view.View)(_paymentpage.getObject()))) { 
 }else {
 //BA.debugLineNum = 145;BA.debugLine="Page.AddView(PaymentPage,0,0,100%x,100%y)";
_page.AddView((android.view.View)(_paymentpage.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 };
 }
};
 };
 //BA.debugLineNum = 149;BA.debugLine="PaymentPageExtra.LoadHtml(HTML)";
_paymentpageextra.LoadHtml(_html);
 //BA.debugLineNum = 150;BA.debugLine="If SubExists(Instance,Event&\"_Ready\") Then";
if (__c.SubExists(ba,_instance,_event+"_Ready")) { 
 //BA.debugLineNum = 151;BA.debugLine="CallSub2(Instance,Event&\"_Ready\",\"Ready\")";
__c.CallSubNew2(ba,_instance,_event+"_Ready",(Object)("Ready"));
 };
 //BA.debugLineNum = 153;BA.debugLine="POPUP = Pop";
_popup = _pop;
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public String  _initializetransaction(String _email,int _amount,String _reference,String _label,String _currency) throws Exception{
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
 //BA.debugLineNum = 184;BA.debugLine="Public Sub InitializeTransaction(Email As String,";
 //BA.debugLineNum = 185;BA.debugLine="If Loaded == True Then";
if (_loaded==__c.True) { 
 //BA.debugLineNum = 186;BA.debugLine="ReferenceCode = Reference";
_referencecode = _reference;
 //BA.debugLineNum = 187;BA.debugLine="PaymentPageExtra.ExecuteJavascript(\"Pay('\"&PUB_K";
_paymentpageextra.ExecuteJavascript("Pay('"+_pub_key+"','"+_email+"',"+BA.NumberToString(_amount)+",'"+_reference+"','"+_label+"','"+_currency+"');");
 //BA.debugLineNum = 188;BA.debugLine="If POPUP == False Then";
if (_popup==__c.False) { 
 //BA.debugLineNum = 189;BA.debugLine="For Each v As View In Page.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group5 = _page.GetAllViewsRecursive();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(group5.Get(index5)));
 //BA.debugLineNum = 190;BA.debugLine="If v.Visible == True Then";
if (_v.getVisible()==__c.True) { 
 //BA.debugLineNum = 191;BA.debugLine="v.Visible = False";
_v.setVisible(__c.False);
 };
 }
};
 //BA.debugLineNum = 194;BA.debugLine="PaymentPageExtra.BringToFront";
_paymentpageextra.BringToFront();
 //BA.debugLineNum = 195;BA.debugLine="PaymentPageExtra.Visible = True";
_paymentpageextra.setVisible(__c.True);
 }else {
 //BA.debugLineNum = 197;BA.debugLine="For Each v As View In Page.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group13 = _page.GetAllViewsRecursive();
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(group13.Get(index13)));
 //BA.debugLineNum = 198;BA.debugLine="If v.Visible == True Then";
if (_v.getVisible()==__c.True) { 
 //BA.debugLineNum = 199;BA.debugLine="v.Visible = False";
_v.setVisible(__c.False);
 };
 }
};
 //BA.debugLineNum = 202;BA.debugLine="POPUP_PANEL.BringToFront";
_popup_panel.BringToFront();
 //BA.debugLineNum = 203;BA.debugLine="POPUP_PANEL.SetVisibleAnimated(1000,True)";
_popup_panel.SetVisibleAnimated((int) (1000),__c.True);
 //BA.debugLineNum = 204;BA.debugLine="PaymentPage.SetVisibleAnimated(1000,True)";
_paymentpage.SetVisibleAnimated((int) (1000),__c.True);
 };
 //BA.debugLineNum = 206;BA.debugLine="SetNavigationBarColor(Colors.RGB(189,229,244))";
_setnavigationbarcolor(__c.Colors.RGB((int) (189),(int) (229),(int) (244)));
 };
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return "";
}
public String  _message(String _title,String _text,String _state) throws Exception{
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
 //BA.debugLineNum = 229;BA.debugLine="Private Sub Message(Title As String, Text As Strin";
 //BA.debugLineNum = 230;BA.debugLine="If ShowMessage == True Then";
if (_showmessage==__c.True) { 
 //BA.debugLineNum = 231;BA.debugLine="Msgbox2Async(Text, Title, \"\", \"Ok\", \"\", JarFile.";
__c.Msgbox2Async(BA.ObjectToCharSequence(_text),BA.ObjectToCharSequence(_title),"","Ok","",_jarfile._loadbitmapfromjar /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ("paystack-logo.png"),ba,__c.True);
 };
 //BA.debugLineNum = 233;BA.debugLine="If PaymentPage.Visible == True And POPUP == False";
if (_paymentpage.getVisible()==__c.True && _popup==__c.False) { 
 //BA.debugLineNum = 234;BA.debugLine="For Each v As View In Page.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group5 = _page.GetAllViewsRecursive();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(group5.Get(index5)));
 //BA.debugLineNum = 235;BA.debugLine="If v.Visible == False Then";
if (_v.getVisible()==__c.False) { 
 //BA.debugLineNum = 236;BA.debugLine="v.Visible = True";
_v.setVisible(__c.True);
 };
 }
};
 //BA.debugLineNum = 239;BA.debugLine="PaymentPage.SendToBack";
_paymentpage.SendToBack();
 //BA.debugLineNum = 240;BA.debugLine="PaymentPage.Visible = False";
_paymentpage.setVisible(__c.False);
 }else if(_paymentpage.getVisible()==__c.True && _popup==__c.True) { 
 //BA.debugLineNum = 242;BA.debugLine="For Each v As View In Page.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group13 = _page.GetAllViewsRecursive();
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(group13.Get(index13)));
 //BA.debugLineNum = 243;BA.debugLine="If v.Visible == False Then";
if (_v.getVisible()==__c.False) { 
 //BA.debugLineNum = 244;BA.debugLine="v.Visible = True";
_v.setVisible(__c.True);
 };
 }
};
 //BA.debugLineNum = 247;BA.debugLine="POPUP_PANEL.SendToBack";
_popup_panel.SendToBack();
 //BA.debugLineNum = 248;BA.debugLine="POPUP_PANEL.SetVisibleAnimated(1000,False)";
_popup_panel.SetVisibleAnimated((int) (1000),__c.False);
 };
 //BA.debugLineNum = 250;BA.debugLine="Page.Title = PageCurrentTitle";
_page.setTitle(BA.ObjectToCharSequence(_pagecurrenttitle));
 //BA.debugLineNum = 252;BA.debugLine="If SubExists(Instance,Event&\"_TransactionStatus\")";
if (__c.SubExists(ba,_instance,_event+"_TransactionStatus")) { 
 //BA.debugLineNum = 253;BA.debugLine="CallSub3(Instance,Event&\"_TransactionStatus\",Ref";
__c.CallSubNew3(ba,_instance,_event+"_TransactionStatus",(Object)(_referencecode),(Object)(_state));
 };
 //BA.debugLineNum = 255;BA.debugLine="If SubExists(Instance,Event&\"_TransactionResponse";
if (__c.SubExists(ba,_instance,_event+"_TransactionResponse")) { 
 //BA.debugLineNum = 256;BA.debugLine="CallSub3(Instance,Event&\"_TransactionResponse\",R";
__c.CallSubNew3(ba,_instance,_event+"_TransactionResponse",(Object)(_referencecode),(Object)(_state));
 };
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return "";
}
public boolean  _paymentpage_overrideurl(String _url) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Private Sub PaymentPage_OverrideUrl (Url As String";
 //BA.debugLineNum = 171;BA.debugLine="Log(Url)";
__c.LogImpl("21114113",_url,0);
 //BA.debugLineNum = 172;BA.debugLine="If Url.Contains(\"api.com\") Then";
if (_url.contains("api.com")) { 
 };
 //BA.debugLineNum = 175;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return false;
}
public String  _paymentpage_pagefinished(String _url) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Private Sub PaymentPage_PageFinished (Url As Strin";
 //BA.debugLineNum = 157;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
 //BA.debugLineNum = 158;BA.debugLine="Loaded = True";
_loaded = __c.True;
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return "";
}
public String  _setnavigationbarcolor(int _clr) throws Exception{
anywheresoftware.b4a.phone.Phone _p = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _window = null;
 //BA.debugLineNum = 212;BA.debugLine="Private Sub SetNavigationBarColor(clr As Int)";
 //BA.debugLineNum = 213;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
 //BA.debugLineNum = 214;BA.debugLine="If p.SdkVersion >= 21 Then  'versão 5.0";
if (_p.getSdkVersion()>=21) { 
 //BA.debugLineNum = 215;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 216;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(ba);
 //BA.debugLineNum = 217;BA.debugLine="Dim window As JavaObject = jo.RunMethodJO(\"getWi";
_window = new anywheresoftware.b4j.object.JavaObject();
_window = _jo.RunMethodJO("getWindow",(Object[])(__c.Null));
 //BA.debugLineNum = 218;BA.debugLine="window.RunMethod(\"addFlags\", Array (0x80000000))";
_window.RunMethod("addFlags",new Object[]{(Object)(0x80000000)});
 //BA.debugLineNum = 219;BA.debugLine="window.RunMethod(\"clearFlags\", Array (0x04000000";
_window.RunMethod("clearFlags",new Object[]{(Object)(0x04000000)});
 //BA.debugLineNum = 220;BA.debugLine="window.RunMethod(\"setNavigationBarColor\", Array(";
_window.RunMethod("setNavigationBarColor",new Object[]{(Object)(_clr)});
 //BA.debugLineNum = 221;BA.debugLine="window.RunMethod(\"setStatusBarColor\", Array(clr)";
_window.RunMethod("setStatusBarColor",new Object[]{(Object)(_clr)});
 };
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
