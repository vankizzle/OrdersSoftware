package b4a.diplomna;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class uisizes {
private static uisizes mostCurrent = new uisizes();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static int _loginscrdefaultleft = 0;
public static int _loginscrdefaulttop = 0;
public static int _loginscrdefaultwidth = 0;
public static int _loginscrdefaultheight = 0;
public static int _edittextdefaultheight = 0;
public static int _scanbtndefaultleft = 0;
public static int _scanbtndefaulttop = 0;
public static int _scanbtndefaultwidth = 0;
public static int _scanbtndefaultheight = 0;
public static int _settingsspinnersleft = 0;
public static int _settingsspinnerstop = 0;
public static int _settingsspinnerswidth = 0;
public static int _settingsspinnersheight = 0;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.diplomna.main _main = null;
public b4a.diplomna.types _types = null;
public b4a.diplomna.support _support = null;
public b4a.diplomna.starter _starter = null;
public b4a.diplomna.data _data = null;
public static String  _initialize(anywheresoftware.b4a.BA _ba,boolean _is_landscape) throws Exception{
RDebugUtils.currentModule="uisizes";
if (Debug.shouldDelegate(null, "initialize"))
	 {return ((String) Debug.delegate(null, "initialize", new Object[] {_ba,_is_landscape}));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Public Sub Initialize(Is_Landscape As Boolean)";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="If Is_Landscape Then";
if (_is_landscape) { 
 }else {
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="LoginScrDefaultLeft = 30%x";
_loginscrdefaultleft = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (30),_ba);
RDebugUtils.currentLine=6225925;
 //BA.debugLineNum = 6225925;BA.debugLine="LoginScrDefaultTop = 0%y";
_loginscrdefaulttop = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),_ba);
RDebugUtils.currentLine=6225926;
 //BA.debugLineNum = 6225926;BA.debugLine="LoginScrDefaultWidth = 40%x";
_loginscrdefaultwidth = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (40),_ba);
RDebugUtils.currentLine=6225927;
 //BA.debugLineNum = 6225927;BA.debugLine="LoginScrDefaultHeight = 10%y";
_loginscrdefaultheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),_ba);
RDebugUtils.currentLine=6225928;
 //BA.debugLineNum = 6225928;BA.debugLine="EditTextDefaultHeight = 5%y";
_edittextdefaultheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),_ba);
RDebugUtils.currentLine=6225930;
 //BA.debugLineNum = 6225930;BA.debugLine="ScanBtnDefaultLeft = 30%x";
_scanbtndefaultleft = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (30),_ba);
RDebugUtils.currentLine=6225931;
 //BA.debugLineNum = 6225931;BA.debugLine="ScanBtnDefaultTop  = 90%y";
_scanbtndefaulttop = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (90),_ba);
RDebugUtils.currentLine=6225932;
 //BA.debugLineNum = 6225932;BA.debugLine="ScanBtnDefaultWidth = 40%x";
_scanbtndefaultwidth = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (40),_ba);
RDebugUtils.currentLine=6225933;
 //BA.debugLineNum = 6225933;BA.debugLine="ScanBtnDefaultHeight = 8%y";
_scanbtndefaultheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),_ba);
RDebugUtils.currentLine=6225935;
 //BA.debugLineNum = 6225935;BA.debugLine="SettingsSpinnersLeft = 2%x";
_settingsspinnersleft = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),_ba);
RDebugUtils.currentLine=6225936;
 //BA.debugLineNum = 6225936;BA.debugLine="SettingsSpinnersTop = 10%y";
_settingsspinnerstop = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),_ba);
RDebugUtils.currentLine=6225937;
 //BA.debugLineNum = 6225937;BA.debugLine="SettingsSpinnersWidth = 26%x";
_settingsspinnerswidth = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (26),_ba);
RDebugUtils.currentLine=6225938;
 //BA.debugLineNum = 6225938;BA.debugLine="SettingsSpinnersHeight = 3%y";
_settingsspinnersheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3),_ba);
 };
RDebugUtils.currentLine=6225940;
 //BA.debugLineNum = 6225940;BA.debugLine="End Sub";
return "";
}
}