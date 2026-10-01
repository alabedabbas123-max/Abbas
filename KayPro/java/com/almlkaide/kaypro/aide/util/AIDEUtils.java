package com.almlkaide.kaypro.aide.util;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.TextView;
import android.support.v4.widget.DrawerLayout;
import com.aide.ui.AIDEEditor;
import com.aide.ui.AIDEEditorPager;
import com.aide.ui.U;
import com.aide.ui.browsers.BrowserPager;
import com.aide.ui.browsers.FileBrowser;
import com.aide.ui.build.android.B;
import com.aide.ui.views.CodeEditText;
import com.aide.ui.views.SplitView;
import com.aide.ui.views.editor.OConsole;
import com.aide.ui.views.editor.OEditor;
import com.baidu.mobstat.Config;
import com.blankj.utilcode.util.ReflectUtils;
import com.almlkaide.kaypro.aide.AideMainActivity;
import com.almlkaide.kaypro.aide.AideR;
import com.almlkaide.kaypro.util.Utils;
import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AIDEUtils {
    public static void addToEditor(String str) {
        int i = 0;
        OEditor oEditorView = getOEditorView();
        if (oEditorView == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (i2 < str.length()) {
                i = str.charAt(i2) == '\n' ? i3 + 1 : i3;
                i2++;
            } else {
                int caretLine = oEditorView.getCaretLine();
                oEditorView.getEditorModel().j6(oEditorView.getCaretColumn(), oEditorView.getCaretLine(), oEditorView.tp(), oEditorView.getTabSize(), new StringReader(str), oEditorView);
                oEditorView.gn(caretLine, i3 + caretLine);
                return;
            }
        }
    }

    public static boolean isCurrentEditorIsNull() {
        return getCurrentEditorFile() == null;
    }

    public static boolean isCurrentProjectIsNull() {
        return ProjectUtils.getCurrentProject() == null;
    }

    public static void openProject(String str, List<File> list) {
        File file = new File(str);
        closeProjects();
        if (file.exists() && file.isDirectory()) {
            U.vy().Ws(str);
        }
        setFileBrowserCurrentDir(str);
        if (list == null || list.isEmpty()) {
            return;
        }
        openFile(list);
        setCurrentFiles(list);
    }

    public static void closeProjects() {
        U.vy().v5();
        U.J8().Hw();
    }

    public static void setFileBrowserCurrentDir(String str) {
        U.J8().j6(str);
        getFileBrowserService().edit().putString("CurrentDir", str).commit();
    }

    public static String getFileBrowserCurrentDir() {
        try {
            return ((TextView) getFileBrowser().findViewById(AideR.C1673id.browserHeaderLabel)).getText().toString();
        } catch (Throwable th) {
            return getFileBrowserService().getString("CurrentDir", (String) null);
        }
    }

    public static SplitView getSplitView() {
        return getMainActivity().findViewById(AideR.C1673id.mainSplitView);
    }

    public static void openSplit(boolean z) {
        ReflectUtils.reflect(getSplitView()).method("openSplit", new Object[]{new Boolean(z)});
    }

    public static void closeSplit(boolean z) {
        ReflectUtils.reflect(getSplitView()).method("closeSplit", new Object[]{new Boolean(z)});
    }

    public static DrawerLayout getMainDrawerLayout() {
        return (DrawerLayout) getMainActivity().findViewById(AideR.C1673id.mainDrawerLayout);
    }

    public static BrowserPager getBrowserPager() {
        return getMainActivity().findViewById(AideR.C1673id.mainBrowserPager);
    }

    public static boolean isDrawerOpen() {
        DrawerLayout mainDrawerLayout = getMainDrawerLayout();
        if (mainDrawerLayout != null) {
            return ((Boolean) ReflectUtils.reflect(mainDrawerLayout).method("isDrawerOpen", new Object[]{new Integer(8388611)}).get()).booleanValue();
        }
        return false;
    }

    public static void toggleSplit() {
        if (getMainDrawerLayout() != null) {
            if (isDrawerOpen()) {
                closeSplit(true);
                return;
            } else {
                openSplit(true);
                return;
            }
        }
        ReflectUtils.reflect(getSplitView()).method("toggleSplit", new Object[]{(Runnable) null});
    }

    public static void updateBuild(Object obj, String str) {
        Utils.runOnUiThread(getMainActivity(), new Runnable(obj, str) {
            private final Object val$a;
            private final String val$msg;

            {
                this.val$a = obj;
                this.val$msg = str;
            }

            @Override
            public void run() {
                ReflectUtils.reflect("com.aide.ui.build.android.fb").method("j6", new Object[]{(B) ReflectUtils.reflect(this.val$a).field(Config.APP_VERSION_CODE).get(), this.val$msg, new Integer(50), new Boolean(false)});
            }
        });
    }

    public static void openFile(File file) {
        ReflectUtils.reflect(getMainActivity()).method("Hw", new Object[]{file.getAbsolutePath()});
    }

    public static void openFile(List<File> list) {
        openFile((File[]) list.toArray(new File[0]));
    }

    public static void openFile(File... fileArr) {
        for (File file : fileArr) {
            openFile(file);
        }
        if (fileArr.length > 0) {
            openFile(fileArr[0]);
        }
    }

    public static void initQuickKey() {
        ReflectUtils.reflect(getMainActivity()).method("FN");
    }

    public static AideMainActivity getMainActivity() {
        return (AideMainActivity) Utils.getMainActivity();
    }

    public static void reLoadFileBrowser() {
        FileBrowser fileBrowser = getFileBrowser();
        if (fileBrowser == null) {
            return;
        }
        ReflectUtils.reflect(fileBrowser).method("Zo");
    }

    public static FileBrowser getFileBrowser() {
        return getBrowserPager().getFileBrowser();
    }

    public static AIDEEditorPager getAIDEEditorPager() {
        return getMainActivity().findViewById(AideR.C1673id.mainCodePageView);
    }

    public static AIDEEditor getCurrentEditor() {
        try {
            return (AIDEEditor) ReflectUtils.reflect(getAIDEEditorPager()).method("getCurrentEditor").get();
        } catch (Throwable th) {
            return (AIDEEditor) null;
        }
    }

    public static CodeEditText getCodeEditText() {
        return getCurrentEditor();
    }

    public static Object getCodeEditText_c() {
        try {
            return ReflectUtils.reflect(getCurrentEditor()).method("getOEditorView").get();
        } catch (Throwable th) {
            return (Object) null;
        }
    }

    public static OEditor getOEditorView() {
        return (OEditor) getCodeEditText_c();
    }

    public static OConsole getOConsole() {
        return getOEditorView();
    }

    public static boolean checkEditorFileParentName(String str) {
        try {
            return getCurrentEditorFile().getParentFile().getName().startsWith(str);
        } catch (Throwable th) {
            return false;
        }
    }

    public static boolean checkEditorFileName(String str) {
        try {
            return getCurrentEditorFile().getName().equals(str);
        } catch (Throwable th) {
            return false;
        }
    }

    public static boolean checkEditorFileNameSuffix(String str) {
        try {
            return getCurrentEditorFile().getName().endsWith(str);
        } catch (Throwable th) {
            return false;
        }
    }

    public static File getCurrentEditorFile() {
        String filePath;
        AIDEEditor currentEditor = getCurrentEditor();
        if (currentEditor != null && (filePath = currentEditor.getFilePath()) != null) {
            return new File(filePath);
        }
        return (File) null;
    }

    public static SharedPreferences getProjectService() {
        return Utils.getSp("ProjectService");
    }

    public static String getCurrentAppHome() {
        return getProjectService().getString("CurrentAppHome", (String) null);
    }

    public static void setCurrentAppHome(String str) {
        getProjectService().edit().putString("CurrentAppHome", str).commit();
    }

    public static SharedPreferences getFileBrowserService() {
        return Utils.getSp("FileBrowserService");
    }

    public static SharedPreferences getOpenFileService() {
        return Utils.getSp("OpenFileService");
    }

    public static void appendOpenFile(File file, int i) {
        if (file != null) {
            List<File> currentFiles = getCurrentFiles();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < currentFiles.size()) {
                    if (!currentFiles.get(i3).getAbsolutePath().equals(file.getAbsolutePath())) {
                        arrayList.add(currentFiles.get(i3));
                    }
                    i2 = i3 + 1;
                } else {
                    arrayList.add(i, file);
                    setCurrentFiles(arrayList);
                    return;
                }
            }
        }
    }

    public static boolean isAddedOpenFile(File file) {
        if (file == null) {
            return false;
        }
        Iterator<File> it = getCurrentFiles().iterator();
        while (it.hasNext()) {
            if (it.next().getAbsolutePath().equals(file.getAbsolutePath())) {
                return true;
            }
        }
        return false;
    }

    public static void setCurrentFiles(List<File> list) {
        if (list != null) {
            StringBuffer stringBuffer = new StringBuffer();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < list.size()) {
                    File file = list.get(i2);
                    if (file.exists() && file.isFile()) {
                        if (i2 > 0) {
                            stringBuffer.append(";");
                        }
                        stringBuffer.append(file.getAbsolutePath());
                    }
                    i = i2 + 1;
                } else {
                    getOpenFileService().edit().putString("CurrentFiles", stringBuffer.toString()).commit();
                    return;
                }
            }
        }
    }

    public static List<File> getCurrentFiles() {
        ArrayList arrayList = new ArrayList();
        for (String str : getOpenFileService().getString("CurrentFiles", "").split(";")) {
            if (str.trim().length() != 0 && str.startsWith("/")) {
                arrayList.add(new File(str));
            }
        }
        return arrayList;
    }

    public static void setIsLightTheme(boolean z) {
        Utils.getSp().edit().putBoolean("light_theme", z).commit();
    }

    public static void notifyThemeChanged() {
        setIsLightTheme(!Utils.getSp().getBoolean("light_theme", true));
        setIsLightTheme(Utils.getSp().getBoolean("light_theme", true) ? false : true);
    }

    public static boolean isLightTheme() {
        if (isTrainerMode()) {
            return true;
        }
        return Utils.getSp().getBoolean("light_theme", true);
    }

    public static boolean isTrainerMode() {
        return Utils.getApp().getSharedPreferences("TrainerMode", 0).getBoolean("Mode", false);
    }

    public static boolean isUseProguard() {
        return Utils.getSp().getBoolean("use_proguard", false);
    }

    public static void launcherPermissionEditor(Context context, String str) {
        try {
            Intent intent = new Intent(context, Class.forName("com.almlkaide.kaypro.aide.application.activity.permission.ManifestActivity"));
            intent.putExtra(Config.FEED_LIST_ITEM_PATH, str);
            Utils.startActivity(context, intent);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }
}
