package com.almlkaide.kaypro.util;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.view.Menu;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.graphics.ColorUtils;
import com.aide.ui.MainActivity;
import com.blankj.utilcode.util.ClipboardUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ReflectUtils;
import com.almlkaide.kaypro.aide.project.jsonbean.Project;
import com.almlkaide.kaypro.aide.util.AIDEUtils;
import com.almlkaide.kaypro.aide.util.ResUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Locale;
import org.apache.commons.io.IOUtils;

public class Utils {
    public static final String ASSETS_DATA_DIR = "data/";
    public static final File SDCARD_AIDE = new File(Environment.getExternalStorageDirectory(), ".aide");
    public static final File SDCARD_DATA_DIR = new File(SDCARD_AIDE, "data");

    public static Application f5095app;
    public static MainActivity mainActivity;
    static String sArch;
    private static Toast toast;

    public static String read2String(Reader reader) {
        try {
            return tryRead2String(reader);
        } catch (IOException e) {
            return (String) null;
        }
    }

    public static String tryRead2String(Reader reader) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = (BufferedReader) null;
        try {
            bufferedReader = new BufferedReader(reader);
            try {
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (stringBuffer.length() != 0) {
                        stringBuffer.append('\n');
                    }
                    stringBuffer.append(line);
                }
                String string = stringBuffer.toString();
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                    }
                }
                return string;
            } catch (Throwable th) {
                th = th;
                if (bufferedReader == null) {
                    throw th;
                }
                try {
                    bufferedReader.close();
                    throw th;
                } catch (IOException e2) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = bufferedReader2;
        }
    }

    public static String getArch(String str) {
        if (str.length() <= 0) {
            return "unknown";
        }
        switch (str.toLowerCase().charAt(0)) {
            case 'a':
                if (str.equals("amd64")) {
                    return "x86_64";
                }
                return str.contains("64") ? "arm64" : "arm";
            case 'i':
            case 'x':
                return str.contains("64") ? "x86_64" : "x86";
            case 'm':
                return str.contains("64") ? "mips64" : "mips";
            default:
                return "unknown";
        }
    }

    public static String getArch() {
        if (sArch == null) {
            sArch = getArch(System.getProperty("os.arch"));
        }
        return sArch;
    }

    public static void fullScrollToBottom(AlertDialog alertDialog) {
        if (alertDialog != null) {
            fullScrollToBottom((ScrollView) alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("scrollView", "id", Project.ANDROID)));
        }
    }

    public static void fullScrollToBottom(ScrollView scrollView) {
        if (scrollView != null) {
            scrollView.fullScroll(130);
        }
    }

    public static void logObject(String str, Object obj) {
        try {
            Class<?> cls = obj.getClass();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(new StringBuffer().append("\nObject：").append(cls.getCanonicalName()).toString());
            stringBuffer.append(new StringBuffer().append("\nObject#toString()：").append(obj.toString()).toString());
            stringBuffer.append("\n[DeclaredFields]\n");
            Field[] fields = cls.getFields();
            for (int i = 0; fields != null && i < fields.length; i++) {
                Field field = fields[i];
                field.setAccessible(true);
                if (i > 0) {
                    stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
                }
                stringBuffer.append(field.getName());
                stringBuffer.append("=");
                try {
                    if (Modifier.isStatic(field.getModifiers())) {
                        stringBuffer.append(new StringBuffer().append(field.get((Object) null)).append("").toString());
                    } else {
                        stringBuffer.append(new StringBuffer().append(field.get(obj)).append("").toString());
                    }
                } catch (Exception e) {
                    stringBuffer.append(new StringBuffer().append("error:").append(e).toString());
                }
            }
            stringBuffer.append("\n\n[DeclaredMethods]\n");
            Method[] methods = cls.getMethods();
            for (int i2 = 0; methods != null && i2 < methods.length; i2++) {
                Method method = methods[i2];
                method.setAccessible(true);
                if (method.getParameterTypes().length == 0 && method.getReturnType() != Void.TYPE) {
                    if (i2 > 0) {
                        stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
                    }
                    stringBuffer.append(method.getName());
                    stringBuffer.append("=");
                    try {
                        if (Modifier.isStatic(method.getModifiers())) {
                            stringBuffer.append(new StringBuffer().append(method.invoke((Object) null, new Object[0])).append("").toString());
                        } else {
                            stringBuffer.append(new StringBuffer().append(method.invoke(obj, new Object[0])).append("").toString());
                        }
                    } catch (Exception e2) {
                        stringBuffer.append(new StringBuffer().append("error:").append(e2).toString());
                    }
                }
            }
            LogUtils.iTag(str, new Object[]{stringBuffer.toString()});
        } catch (Throwable th) {
        }
    }

    public static boolean isLightColor(int i) {
        return ColorUtils.calculateLuminance(i) >= 0.65d;
    }

    public static boolean isCN() {
        String language;
        Resources resources = getApp().getResources();
        if (AIDEUtils.getMainActivity() != null) {
            resources = AIDEUtils.getMainActivity().getResources();
        }
        Locale locale = resources.getConfiguration().locale;
        if (locale != null && (language = locale.getLanguage()) != null) {
            return "zh".equals(language.toLowerCase(Locale.ENGLISH));
        }
        return false;
    }

    public static void setApp(Application application) {
        f5095app = application;
    }

    public static Application getApp() {
        return f5095app;
    }

    public static void setMainActivity(MainActivity mainActivity2) {
        mainActivity = mainActivity2;
    }

    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    public static View getRootView(View view) {
        while (true) {
            View view2 = (View) view.getParent();
            if (view2 == null) {
                return view2;
            }
            view = view2;
        }
    }

    public static void setSystemStatusBarLight(Activity activity, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            View decorView = activity.getWindow().getDecorView();
            if (z) {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            } else {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
            }
        }
    }

    public static int getColorAccent(Context context) {
        if (Build.VERSION.SDK_INT < 21) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true);
        return typedValue.data;
    }

    public static int getColorBackground(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        return typedValue.data;
    }

    public static Spanned fromHtml(String str) {
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, 0) : Html.fromHtml(str);
    }

    public static void setAlertDialogMovementMethod(AlertDialog alertDialog) {
        TextView textView = (TextView) alertDialog.findViewById(R.id.message);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public static void setMessageIsSelectable(AlertDialog alertDialog) {
        setMessageIsSelectable(alertDialog, true);
    }

    public static void setMessageIsSelectable(AlertDialog alertDialog, boolean z) {
        TextView textView = (TextView) alertDialog.findViewById(R.id.message);
        if (textView != null) {
            textView.setTextIsSelectable(z);
        }
    }

    public static String getFileNamePrefix(String str) {
        int iLastIndexOf = str.lastIndexOf(".");
        return iLastIndexOf >= 0 ? str.substring(0, iLastIndexOf) : (String) null;
    }

    public static String getFileNameSuffix(String str) {
        int iLastIndexOf = str.lastIndexOf(".");
        return iLastIndexOf >= 0 ? str.substring(iLastIndexOf) : (String) null;
    }

    public static int getColorFromResources(int i) {
        return getApp().getResources().getColor(i);
    }

    public static void setOptionalIconsVisible(Menu menu, boolean z) {
        try {
            ReflectUtils.reflect(menu).method("setOptionalIconsVisible", new Object[]{new Boolean(z)});
        } catch (Throwable th) {
        }
    }

    public static String toUpperCaseFirst(String str) {
        if (str != null && str.length() != 0) {
            char[] charArray = str.toCharArray();
            charArray[0] = Character.toUpperCase(charArray[0]);
            return String.valueOf(charArray);
        }
        return str;
    }

    public static String toLowerCaseFirst(String str) {
        if (str != null && str.length() != 0) {
            char[] charArray = str.toCharArray();
            charArray[0] = Character.toLowerCase(charArray[0]);
            return String.valueOf(charArray);
        }
        return str;
    }

    public static void startActivity(Context context, Class<?> cls) {
        startActivity(context, cls, false);
    }

    public static void startActivity(Context context, Class<?> cls, boolean z) {
        Intent intent = new Intent(context, cls);
        if (z || (Build.VERSION.SDK_INT < 24 && !(context instanceof Activity))) {
            intent.addFlags(268435456);
        }
        startActivity(context, intent);
    }

    public static void startActivity(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable th) {
            showExDialog(context, th);
        }
    }

    public static Toast toast(Object obj) {
        return toast(obj.toString());
    }

    public static Toast toast(Throwable th) {
        return toast(th, false);
    }

    public static Toast toast(Throwable th, boolean z) {
        return toastError(z ? getStackTrace(th) : th.getMessage());
    }

    public static Toast toast(String str) {
        if (toast != null) {
            toast.cancel();
        }
        toast = Toasty.toast(getApp(), str, 0);
        toast.show();
        return toast;
    }

    public static Toast toastError(String str) {
        if (toast != null) {
            toast.cancel();
        }
        toast = Toasty.error(str, 0);
        toast.show();
        return toast;
    }

    public static File getSdDataFile() {
        return SDCARD_DATA_DIR;
    }

    public static File getSdDataFile(String str) {
        return new File(getSdDataFile(), str);
    }

    public static File getSdDataLocationFile(String str) {
        return ResUtils.getLocaleFile(new File(getSdDataFile(), str));
    }

    public static File getSdConfigFile(String str) {
        return new File(getSdDataFile("config"), str);
    }

    public static String getAssetsDataFile() {
        return ASSETS_DATA_DIR;
    }

    public static String getAssetsDataFile(String str) {
        return new StringBuffer().append(getAssetsDataFile()).append(str).toString();
    }

    public static String getAssetsConfigFile(String str) {
        return new StringBuffer().append(getAssetsDataFile("config/")).append(str).toString();
    }

    public static void runOnUiThread(Activity activity, Runnable runnable) {
        activity.runOnUiThread(runnable);
    }

    public static SharedPreferences getSp() {
        return PreferenceManager.getDefaultSharedPreferences(getApp());
    }

    public static SharedPreferences getSp(String str) {
        return getApp().getSharedPreferences(str, 0);
    }

    public static int dp2px(float f) {
        return (int) ((Resources.getSystem().getDisplayMetrics().density * f) + 0.5f);
    }

    public static void openUrl(String str) {
        startActivity(getApp(), new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
    }

    public static void showExDialog(Context context, Throwable th) {
        showExDialog(context, isCN() ? "发生错误" : "Error", th);
    }

    public static void showExDialog(Context context, String str, Throwable th) {
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setTitle(str).setMessage(th.toString() == null ? (String) null : th.toString().trim()).setPositiveButton(R.string.copy, new DialogInterface.OnClickListener(th) {
            private final Throwable val$e;

            {
                this.val$e = th;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Utils.copyToClipboard(this.val$e.getMessage());
            }
        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setNeutralButton(isCN() ? "详情" : "Detail", new DialogInterface.OnClickListener(context, th) {
            private final Context val$activity;
            private final Throwable val$e;

            {
                this.val$activity = context;
                this.val$e = th;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                AlertDialog alertDialogCreate2 = new AlertDialog.Builder(this.val$activity).setTitle(Utils.isCN() ? "错误详情" : "Error Detail").setMessage(Utils.getStackTrace(this.val$e)).setPositiveButton(R.string.copy, new DialogInterface.OnClickListener(this, this.val$e) {
                    private final AnonymousClass100000002 this$0;
                    private final Throwable val$e;

                    {
                        this.this$0 = this;
                        this.val$e = th;
                    }

                    @Override
                    public void onClick(DialogInterface dialogInterface2, int i2) {
                        Utils.copyToClipboard(Utils.getStackTrace(this.val$e));
                    }
                }).setNegativeButton(Utils.getApp().getString(R.string.cancel), (DialogInterface.OnClickListener) null).create();
                alertDialogCreate2.show();
                Utils.setMessageIsSelectable(alertDialogCreate2);
            }
        }).create();
        alertDialogCreate.show();
        setMessageIsSelectable(alertDialogCreate);
    }

    public static String getStackTrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void copyToClipboard(CharSequence charSequence) {
        copyToClipboard(charSequence, true);
    }

    public static void copyToClipboard(CharSequence charSequence, boolean z) {
        ClipboardUtils.copyText(charSequence);
        if (z) {
            toast(isCN() ? "已复制到剪贴板" : "Clipboard to copied");
        }
    }

    public static String subString(String str, String str2, String str3) {
        String strSubstring;
        try {
            if (str2 != null && str3 != null) {
                strSubstring = str.substring(str.indexOf(str2) + str2.length(), str.indexOf(str3));
            } else if (str2 == null && str3 != null) {
                strSubstring = str.substring(0, str.indexOf(str3));
            } else {
                if (str2 != null && str3 == null) {
                    strSubstring = str.substring(str.indexOf(str2) + str2.length(), str.length());
                }
                return (String) null;
            }
            return strSubstring;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showMsgDialog(Activity activity, String str, String str2) {
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setTitle(str).setMessage(str2).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).create();
        alertDialogCreate.show();
        setMessageIsSelectable(alertDialogCreate);
    }
}
