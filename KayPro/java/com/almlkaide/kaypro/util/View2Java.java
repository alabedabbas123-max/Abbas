package com.almlkaide.kaypro.util;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import com.baidu.mobstat.Config;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Locale;
import org.apache.commons.io.IOUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class View2Java {
    private static final String[] items = {"add field", "add private", "add m", "root view", "root Activity", "type conversion"};
    private static final boolean[] checkedItems_default = {true, true, true, false, true, false};
    private static final boolean[] checkedItems = new boolean[items.length];

    public static SharedPreferences getSp() {
        return Utils.getSp("View2Java");
    }

    public static void showDialog(Activity activity, String str) {
        for (int i = 0; i < items.length; i++) {
            checkedItems[i] = getSp().getBoolean(items[i].replace(" ", "_"), checkedItems_default[i]);
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setTitle(Utils.isCN() ? "配置" : "Configured").setMultiChoiceItems(items, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i2, boolean z) {
                View2Java.getSp().edit().putBoolean(View2Java.items[i2].replace(" ", "_"), z).commit();
            }
        }).setPositiveButton(Utils.isCN() ? "生成" : "Generate", (DialogInterface.OnClickListener) null).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
        alertDialogCreate.show();
        alertDialogCreate.getButton(-1).setOnClickListener(new View.OnClickListener(alertDialogCreate, str, activity) {
            private final Activity val$activity;
            private final AlertDialog val$dialog;
            private final String val$xmlcode;

            {
                this.val$dialog = alertDialogCreate;
                this.val$xmlcode = str;
                this.val$activity = activity;
            }

            @Override
            public void onClick(View view) {
                if (!View2Java.checkedItems[3] || !View2Java.checkedItems[4]) {
                    this.val$dialog.hide();
                    try {
                        String code = View2Java.getCode(this.val$xmlcode, View2Java.checkedItems);
                        AlertDialog alertDialogCreate2 = new AlertDialog.Builder(this.val$activity).setTitle(Utils.isCN() ? "生成结果(长按可复制)" : "Generate results (long press to copy)").setMessage(code.trim().length() == 0 ? "no code" : code).setPositiveButton(R.string.copy, new DialogInterface.OnClickListener(this, code, this.val$dialog) {
                            private final AnonymousClass100000003 this$0;
                            private final AlertDialog val$dialog;
                            private final String val$result;

                            {
                                this.this$0 = this;
                                this.val$result = code;
                                this.val$dialog = alertDialog;
                            }

                            @Override
                            public void onClick(DialogInterface dialogInterface, int i2) {
                                Utils.copyToClipboard(this.val$result);
                                this.val$dialog.dismiss();
                            }
                        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
                        alertDialogCreate2.show();
                        alertDialogCreate2.setOnDismissListener(new DialogInterface.OnDismissListener(this, this.val$dialog) {
                            private final AnonymousClass100000003 this$0;
                            private final AlertDialog val$dialog;

                            {
                                this.this$0 = this;
                                this.val$dialog = alertDialog;
                            }

                            @Override
                            public void onDismiss(DialogInterface dialogInterface) {
                                this.val$dialog.show();
                            }
                        });
                        Utils.setMessageIsSelectable(alertDialogCreate2);
                        return;
                    } catch (XmlPullParserException e) {
                        Utils.showExDialog(this.val$activity, Utils.isCN() ? "解析XML布局出错" : "Error parsing XML layout", e);
                        return;
                    } catch (Throwable th) {
                        Utils.showExDialog(this.val$activity, th);
                        return;
                    }
                }
                Toasty.warning(Utils.isCN() ? "root View 和 root Activity 不能同时选择" : "Root view and root activity cannot be selected at the same time").show();
            }
        });
    }

    public static String getCode(String str, boolean[] zArr) throws Throwable {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        while (xmlPullParserNewPullParser.getEventType() != 1) {
            String name = xmlPullParserNewPullParser.getName();
            if (!TextUtils.isEmpty(name) && xmlPullParserNewPullParser.getAttributeCount() > 0) {
                for (int i = 0; i < xmlPullParserNewPullParser.getAttributeCount(); i++) {
                    if ("android:id".equals(xmlPullParserNewPullParser.getAttributeName(i))) {
                        String attributeValue = xmlPullParserNewPullParser.getAttributeValue(i);
                        if (attributeValue.startsWith("@") && attributeValue.contains(":id/")) {
                            String strSubstring = attributeValue.substring(1);
                            if (!TextUtils.isEmpty(strSubstring)) {
                                arrayList.add(name);
                                arrayList2.add(strSubstring.replace(":id/", ".R.id."));
                            }
                        } else {
                            int iIndexOf = attributeValue.indexOf("/");
                            if (iIndexOf >= 0) {
                                attributeValue = attributeValue.substring(iIndexOf + 1);
                            }
                            if (!TextUtils.isEmpty(attributeValue)) {
                                arrayList.add(name);
                                arrayList2.add(new StringBuffer().append("R.id.").append(attributeValue).toString());
                            }
                        }
                    }
                }
                xmlPullParserNewPullParser.next();
            }
            xmlPullParserNewPullParser.next();
        }
        boolean z = zArr[0];
        boolean z2 = zArr[1];
        boolean z3 = zArr[2];
        boolean z4 = zArr[3];
        boolean z5 = zArr[4];
        boolean z6 = zArr[5];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= arrayList.size()) {
                break;
            }
            String str2 = (String) arrayList.get(i3);
            String str3 = (String) arrayList2.get(i3);
            String viewName = getViewName(str2);
            String idName = getIdName(str3, z3);
            if (z) {
                if (z2) {
                    stringBuffer2.append("private ");
                }
                stringBuffer2.append(String.format("%1$s %2$s;\n", viewName, idName));
            }
            stringBuffer.append("    ");
            if (!z) {
                stringBuffer.append(viewName);
                stringBuffer.append(" ");
            } else if (z4) {
                stringBuffer.append("this.");
            }
            stringBuffer.append(idName);
            stringBuffer.append(" = ");
            if (z6) {
                stringBuffer.append(String.format("(%s)", viewName));
            }
            if (z4) {
                stringBuffer.append("view.");
            } else if (z5) {
                stringBuffer.append("activity.");
            }
            stringBuffer.append(String.format("findViewById(%s);\n", str3));
            i2 = i3 + 1;
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        if (stringBuffer.length() > 0) {
            stringBuffer3.append("private void initView(");
            if (z4) {
                stringBuffer3.append("View view");
            } else if (z5) {
                stringBuffer3.append("Activity activity");
            }
            stringBuffer3.append(") {\n");
            stringBuffer3.append(stringBuffer);
            stringBuffer3.append("}");
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        if (z) {
            stringBuffer4.append(stringBuffer2);
            stringBuffer4.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        stringBuffer4.append(stringBuffer3);
        return stringBuffer4.toString().trim();
    }

    private static String getIdName(String str, boolean z) {
        String string;
        String strSubstring = str.lastIndexOf(".") >= 0 ? str.substring(str.lastIndexOf(".") + 1) : str;
        if (z) {
            if (strSubstring.length() <= 1) {
                string = strSubstring.toUpperCase(Locale.ENGLISH);
            } else {
                string = new StringBuffer().append(strSubstring.substring(0, 1).toUpperCase(Locale.ENGLISH)).append(strSubstring.substring(1)).toString();
            }
            if (string.startsWith("M") && string.length() > 1) {
                string = string.substring(1);
            }
            return new StringBuffer().append(Config.MODEL).append(string).toString();
        }
        return strSubstring;
    }

    private static String getViewName(String str) {
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf >= 0) {
            return str.substring(iLastIndexOf + 1);
        }
        return str;
    }
}
