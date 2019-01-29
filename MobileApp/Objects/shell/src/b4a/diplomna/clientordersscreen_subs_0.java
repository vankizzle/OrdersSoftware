package b4a.diplomna;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clientordersscreen_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (clientordersscreen) ","clientordersscreen",6,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("asview")) { return __ref.runUserSub(false, "clientordersscreen","asview", __ref);}
 BA.debugLineNum = 71;BA.debugLine="Public Sub AsView As View";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="Return ScreenPnl";
Debug.ShouldStop(128);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_screenpnl").getObject());
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildui(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildUI (clientordersscreen) ","clientordersscreen",6,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("buildui")) { return __ref.runUserSub(false, "clientordersscreen","buildui", __ref);}
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 45;BA.debugLine="Public Sub BuildUI";
Debug.ShouldStop(4096);
 BA.debugLineNum = 47;BA.debugLine="ScreenPnl.Color = AppColors.DarkGray";
Debug.ShouldStop(16384);
__ref.getField(false,"_screenpnl").runVoidMethod ("setColor",clientordersscreen._appcolors._darkgray);
 BA.debugLineNum = 48;BA.debugLine="ScreenPnl.AddView(Header,0,0,100%x,5%y)";
Debug.ShouldStop(32768);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_header").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(clientordersscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(clientordersscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 49;BA.debugLine="Header.Color = AppColors.FadedDarkRed";
Debug.ShouldStop(65536);
__ref.getField(false,"_header").runVoidMethod ("setColor",clientordersscreen._appcolors._fadeddarkred);
 BA.debugLineNum = 50;BA.debugLine="FakePnl.Color = AppColors.White";
Debug.ShouldStop(131072);
__ref.getField(false,"_fakepnl").runVoidMethod ("setColor",clientordersscreen._appcolors._white);
 BA.debugLineNum = 52;BA.debugLine="Dim bc As Bitmap";
Debug.ShouldStop(524288);
_bc = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 53;BA.debugLine="bc.Initialize(File.DirAssets,\"optbutton.png\")";
Debug.ShouldStop(1048576);
_bc.runVoidMethod ("Initialize",(Object)(clientordersscreen.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("optbutton.png")));
 BA.debugLineNum = 54;BA.debugLine="SettingsButton.SetBackgroundImage(bc)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_settingsbutton").runVoidMethod ("SetBackgroundImageNew",(Object)((_bc.getObject())));
 BA.debugLineNum = 55;BA.debugLine="Header.AddView(SettingsButton,0,0 + 2dip,10%x,5%y";
Debug.ShouldStop(4194304);
__ref.getField(false,"_header").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_settingsbutton").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0),clientordersscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1)),(Object)(clientordersscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {clientordersscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba")),clientordersscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "-",1, 1)));
 BA.debugLineNum = 56;BA.debugLine="ScreenPnl.AddView(SettingsMenuLogin.AsView,-15%x,";
Debug.ShouldStop(8388608);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, -(double) (0 + clientordersscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba")).<Integer>get().intValue()))),(Object)(clientordersscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(clientordersscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(clientordersscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 57;BA.debugLine="ScreenPnl.AddView(CartOrders.AsView,5%x,45%y,90%x";
Debug.ShouldStop(16777216);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_cartorders").runClassMethod (b4a.diplomna.orderscart.class, "_asview").getObject())),(Object)(clientordersscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(clientordersscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 45)),__ref.getField(false, "ba"))),(Object)(clientordersscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))),(Object)(clientordersscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 44)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 58;BA.debugLine="ScreenPnl.AddView(FakePnl,5%x - 2dip,10%y - 2dip,";
Debug.ShouldStop(33554432);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_fakepnl").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {clientordersscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba")),clientordersscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {clientordersscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba")),clientordersscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {clientordersscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba")),clientordersscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {clientordersscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 24)),__ref.getField(false, "ba")),clientordersscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)));
 BA.debugLineNum = 59;BA.debugLine="ScreenPnl.AddView(OrderInfoVisual.AsView,5%x,10%y";
Debug.ShouldStop(67108864);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_orderinfovisual").runClassMethod (b4a.diplomna.orderinfovisualizer.class, "_asview").getObject())),(Object)(clientordersscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(clientordersscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(clientordersscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),__ref.getField(false, "ba"))),(Object)(clientordersscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 24)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private ScreenPnl As Panel";
clientordersscreen._screenpnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_screenpnl",clientordersscreen._screenpnl);
 //BA.debugLineNum = 3;BA.debugLine="Private Header As Panel";
clientordersscreen._header = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_header",clientordersscreen._header);
 //BA.debugLineNum = 4;BA.debugLine="Private SettingsButton As Button";
clientordersscreen._settingsbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_settingsbutton",clientordersscreen._settingsbutton);
 //BA.debugLineNum = 5;BA.debugLine="Private SettingsMenuLogin As SettingsMenu";
clientordersscreen._settingsmenulogin = RemoteObject.createNew ("b4a.diplomna.settingsmenu");__ref.setField("_settingsmenulogin",clientordersscreen._settingsmenulogin);
 //BA.debugLineNum = 7;BA.debugLine="Private test As Button";
clientordersscreen._test = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_test",clientordersscreen._test);
 //BA.debugLineNum = 9;BA.debugLine="Public CartOrders As OrdersCart";
clientordersscreen._cartorders = RemoteObject.createNew ("b4a.diplomna.orderscart");__ref.setField("_cartorders",clientordersscreen._cartorders);
 //BA.debugLineNum = 10;BA.debugLine="Public OrderInfoVisual As OrderInfoVisualizer";
clientordersscreen._orderinfovisual = RemoteObject.createNew ("b4a.diplomna.orderinfovisualizer");__ref.setField("_orderinfovisual",clientordersscreen._orderinfovisual);
 //BA.debugLineNum = 12;BA.debugLine="Public FakePnl As Panel";
clientordersscreen._fakepnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_fakepnl",clientordersscreen._fakepnl);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hidesettings(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HideSettings (clientordersscreen) ","clientordersscreen",6,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("hidesettings")) { return __ref.runUserSub(false, "clientordersscreen","hidesettings", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Public Sub HideSettings";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="If SettingsMenuLogin.AsView.Left = 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runMethod(true,"getLeft"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 41;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
Debug.ShouldStop(256);
__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(int.class, -(double) (0 + clientordersscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba")).<Integer>get().intValue()))),(Object)(clientordersscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(clientordersscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(clientordersscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 };
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clientordersscreen) ","clientordersscreen",6,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "clientordersscreen","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="ScreenPnl.Initialize(\"\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_screenpnl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 18;BA.debugLine="Header.Initialize(\"\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_header").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 19;BA.debugLine="SettingsButton.Initialize(\"Settings\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_settingsbutton").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Settings")));
 BA.debugLineNum = 20;BA.debugLine="SettingsMenuLogin.Initialize(2)";
Debug.ShouldStop(524288);
__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 21;BA.debugLine="CartOrders.Initialize";
Debug.ShouldStop(1048576);
__ref.getField(false,"_cartorders").runClassMethod (b4a.diplomna.orderscart.class, "_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 22;BA.debugLine="OrderInfoVisual.Initialize";
Debug.ShouldStop(2097152);
__ref.getField(false,"_orderinfovisual").runClassMethod (b4a.diplomna.orderinfovisualizer.class, "_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 24;BA.debugLine="test.Initialize(\"test\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_test").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("test")));
 BA.debugLineNum = 25;BA.debugLine="test.Color = Colors.Red";
Debug.ShouldStop(16777216);
__ref.getField(false,"_test").runVoidMethod ("setColor",clientordersscreen.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 26;BA.debugLine="test.Text = \"TEST\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_test").runMethod(true,"setText",BA.ObjectToCharSequence("TEST"));
 BA.debugLineNum = 27;BA.debugLine="ScreenPnl.AddView(test,0%x,5%y,10%x,5%y)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_screenpnl").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_test").getObject())),(Object)(clientordersscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(clientordersscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(clientordersscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(clientordersscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 29;BA.debugLine="FakePnl.Initialize(\"\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_fakepnl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 31;BA.debugLine="BuildUI";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.diplomna.clientordersscreen.class, "_buildui");
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settings_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Settings_Click (clientordersscreen) ","clientordersscreen",6,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("settings_click")) { return __ref.runUserSub(false, "clientordersscreen","settings_click", __ref);}
 BA.debugLineNum = 63;BA.debugLine="Public Sub Settings_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="If SettingsMenuLogin.AsView.Left = -15%x Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runMethod(true,"getLeft"),BA.numberCast(double.class, -(double) (0 + clientordersscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba")).<Integer>get().intValue())))) { 
 BA.debugLineNum = 65;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,0";
Debug.ShouldStop(1);
__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(int.class, 0)),(Object)(clientordersscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(clientordersscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(clientordersscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 }else 
{ BA.debugLineNum = 66;BA.debugLine="else if SettingsMenuLogin.AsView.Left = 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runMethod(true,"getLeft"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 67;BA.debugLine="SettingsMenuLogin.AsView.SetLayoutAnimated(500,-";
Debug.ShouldStop(4);
__ref.getField(false,"_settingsmenulogin").runClassMethod (b4a.diplomna.settingsmenu.class, "_asview").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(int.class, -(double) (0 + clientordersscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba")).<Integer>get().intValue()))),(Object)(clientordersscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(clientordersscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(clientordersscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 }}
;
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _test_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("test_Click (clientordersscreen) ","clientordersscreen",6,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("test_click")) { return __ref.runUserSub(false, "clientordersscreen","test_click", __ref);}
 BA.debugLineNum = 34;BA.debugLine="Public Sub test_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="CartOrders.TestWithFakes";
Debug.ShouldStop(4);
__ref.getField(false,"_cartorders").runClassMethod (b4a.diplomna.orderscart.class, "_testwithfakes");
 BA.debugLineNum = 36;BA.debugLine="CartOrders.BuildCart";
Debug.ShouldStop(8);
__ref.getField(false,"_cartorders").runClassMethod (b4a.diplomna.orderscart.class, "_buildcart");
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}