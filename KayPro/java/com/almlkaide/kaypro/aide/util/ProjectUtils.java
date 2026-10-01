package com.almlkaide.kaypro.aide.util;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import com.baidu.mobstat.Config;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ImageUtils;
import com.almlkaide.kaypro.aide.application.App;
import com.almlkaide.kaypro.aide.project.jsonbean.Project;
import com.almlkaide.kaypro.util.Utils;
import com.tencent.mm.util.TypedValue;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class ProjectUtils {
    public static final String MANIFEST_MIN_SDK_VERSION = "android:minSdkVersion";
    public static final String MANIFEST_PACKAGE = "package";
    public static final String MANIFEST_TARGET_SDK_VERSION = "android:targetSdkVersion";
    public static final String MANIFEST_VERSION_CODE = "android:versionCode";
    public static final String MANIFEST_VERSION_NAME = "android:versionName";

    public static File getAppProjects() {
        String string = Utils.getSp().getString("project_home", getDefaultAppProjects().getAbsolutePath());
        if (string == null || !string.startsWith("/")) {
            return getDefaultAppProjects();
        }
        File fileNewFile = newFile(string);
        return fileNewFile == null ? getDefaultAppProjects() : fileNewFile;
    }

    public static File getDefaultAppProjects() {
        return newFile(Environment.getExternalStorageDirectory(), "AppProjects");
    }

    public static File currentProject() {
        return getCurrentProject();
    }

    public static File getCurrentProject() {
        return newFile(AIDEUtils.getCurrentAppHome());
    }

    public static File getProjectFile(File file, String str) {
        return newFile(file, str);
    }

    public static File getBuild(File file) {
        return getProjectFile(file, "build");
    }

    public static File getBuild(File file, String str) {
        return newFile(getBuild(file), str);
    }

    public static File getBin(File file) {
        if (isGradleProject(file)) {
            return getBuild(file, "bin");
        }
        if (isEclipseProject(file)) {
            return newFile(file, "bin");
        }
        if (isJavaProject(file)) {
            return newFile(file, "bin");
        }
        return (File) null;
    }

    public static File getBin(File file, String str) {
        return newFile(getBin(file), str);
    }

    public static File getBinClassesDebug(File file) {
        return getBin(file, "classesdebug");
    }

    public static File getBinClassesDebug(File file, String str) {
        return newFile(getBinClassesDebug(file), str);
    }

    public static File getBinClassesRelease(File file) {
        return getBin(file, "classesrelease");
    }

    public static File getBinClassesRelease(File file, String str) {
        return newFile(getBinClassesRelease(file), str);
    }

    public static File getBinInjectedManifest(File file) {
        return getBin(file, "injected/AndroidManifest.xml");
    }

    public static File getBinJarDex(File file) {
        return getBin(file, "jardex");
    }

    public static File getBinJarDex(File file, String str) {
        return newFile(getBinJarDex(file), str);
    }

    public static File getBinResourcesAp(File file) {
        return getBin(file, "resources.ap_");
    }

    public static File getLibs(File file) {
        return getProjectFile(file, "libs");
    }

    public static File getLibs(File file, String str) {
        return newFile(getLibs(file), str);
    }

    public static File getAssets(File file) {
        return getMain(file, "assets");
    }

    public static File getAssets(File file, String str) {
        return newFile(getAssets(file), str);
    }

    public static File getSrcJava(File file) {
        if (isGradleProject(file)) {
            return getMain(file, "java");
        }
        if (isEclipseProject(file)) {
            return newFile(file, "src");
        }
        if (isJavaProject(file)) {
            return newFile(file, "src");
        }
        return (File) null;
    }

    public static File getSrcJava(File file, String str) {
        return newFile(getSrcJava(file), str);
    }

    public static File getSrcJavaPkg(File file) {
        String packageName = getPackageName(file);
        return packageName == null ? (File) null : newFile(getSrcJava(file), packageName.replace(".", "/"));
    }

    public static File getRes(File file) {
        return getMain(file, "res");
    }

    public static File getRes(File file, String str) {
        return newFile(getRes(file), str);
    }

    public static File getAndroidManifest(File file) {
        return getMain(file, "AndroidManifest.xml");
    }

    public static String getPackageNameFromManifest(File file) {
        return getManifestValue(file, "package");
    }

    public static String getVersionNameFromManifest(File file) {
        return getManifestValue(file, "android:versionName");
    }

    public static String getPackageName(File file) {
        String packageNameFromManifest = getPackageNameFromManifest(getAndroidManifest(file));
        return packageNameFromManifest != null ? packageNameFromManifest : getPackageNameFromManifest(getBinInjectedManifest(file));
    }

    public static String getVersionName(File file) {
        String versionNameFromManifest = getVersionNameFromManifest(getAndroidManifest(file));
        return versionNameFromManifest != null ? versionNameFromManifest : getVersionNameFromManifest(getBinInjectedManifest(file));
    }

    public static File getProguardFile(File file) {
        File fileNewFile = newFile(file, "proguard-rules.pro");
        if (!isExists(fileNewFile)) {
            File fileNewFile2 = newFile(file, "proguard-project.txt");
            return !isExists(fileNewFile2) ? (File) null : fileNewFile2;
        }
        return fileNewFile;
    }

    public static File getMain(File file) {
        if (isGradleProject(file)) {
            return newFile(file, "src/main");
        }
        return (isEclipseProject(file) || isJavaProject(file)) ? file : (File) null;
    }

    public static File getMain(File file, String str) {
        return newFile(getMain(file), str);
    }

    public static boolean isAndroidProject(File file) {
        return isGradleProject(file) || isEclipseProject(file);
    }

    public static boolean isGradleProject(File file) {
        return file != null && new File(file, "build.gradle").exists() && new File(file, "src").exists();
    }

    public static boolean isEclipseProject(File file) {
        return file != null && newFile(file, "AndroidManifest.xml").exists() && newFile(file, "src").exists();
    }

    public static boolean isJavaProject(File file) {
        File fileNewFile = newFile(file, ".classpath");
        File fileNewFile2 = newFile(file, "src");
        return file != null && !isAndroidProject(file) && fileNewFile.exists() && fileNewFile2.exists() && fileNewFile2.isDirectory();
    }

    private static File newFile(String str) {
        try {
            return new File(str);
        } catch (Throwable th) {
            return (File) null;
        }
    }

    private static File newFile(File file, String str) {
        if (file != null && str != null && str.length() != 0) {
            try {
                return new File(file, str);
            } catch (Throwable th) {
            }
        }
        return (File) null;
    }

    private static boolean isExists(File file) {
        return file != null && file.exists();
    }

    public static String getManifestValue(File file, String str) {
        if (MANIFEST_PACKAGE.equals(str) || MANIFEST_VERSION_CODE.equals(str) || MANIFEST_VERSION_NAME.equals(str)) {
            return getManifestAttributeValueByName(file, (String) null, str);
        }
        if (MANIFEST_MIN_SDK_VERSION.equals(str) || MANIFEST_TARGET_SDK_VERSION.equals(str)) {
            return getManifestAttributeValueByName(file, "uses-sdk", str);
        }
        return (String) null;
    }

    public static String getManifestAttributeValueByName(File file, String str, String str2) {
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new FileInputStream(file), "utf-8");
            while (xmlPullParserNewPullParser.next() != 1) {
                if ("manifest".equals(xmlPullParserNewPullParser.getName())) {
                    if (str == null) {
                        for (int i = 0; i < xmlPullParserNewPullParser.getAttributeCount(); i++) {
                            if (str2.equals(xmlPullParserNewPullParser.getAttributeName(i))) {
                                return xmlPullParserNewPullParser.getAttributeValue(i);
                            }
                        }
                    } else {
                        xmlPullParserNewPullParser.next();
                    }
                } else if (str != null && str.equals(xmlPullParserNewPullParser.getName())) {
                    for (int i2 = 0; i2 < xmlPullParserNewPullParser.getAttributeCount(); i2++) {
                        if (str2.equals(xmlPullParserNewPullParser.getAttributeName(i2))) {
                            return xmlPullParserNewPullParser.getAttributeValue(i2);
                        }
                    }
                }
                xmlPullParserNewPullParser.next();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return (String) null;
    }

    public static String getAppLabelFromProject(File file) {
        return getAppLabelFromManifest(getAndroidManifest(file));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0011, code lost:
    
        r0 = (java.lang.String) null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getAppLabelFromManifest(File file) {
        String nodeValue;
        int i = 0;
        try {
            if (!file.exists() || !file.isFile()) {
                nodeValue = (String) null;
                break;
            }
            NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file).getElementsByTagName("manifest");
            if (elementsByTagName.getLength() == 0) {
                nodeValue = (String) null;
                break;
            }
            NodeList childNodes = elementsByTagName.item(0).getChildNodes();
            while (true) {
                int i2 = i;
                if (i2 < childNodes.getLength()) {
                    Node nodeItem = childNodes.item(i2);
                    if ("application".equals(nodeItem.getNodeName())) {
                        Node namedItem = nodeItem.getAttributes().getNamedItem("android:label");
                        if (namedItem != null) {
                            nodeValue = namedItem.getNodeValue();
                            if (nodeValue.startsWith("@android:string/")) {
                                Resources resources = App.getApp().getResources();
                                try {
                                    nodeValue = resources.getString(resources.getIdentifier(nodeValue.substring("@android:string/".length()), "string", Project.ANDROID));
                                    break;
                                } catch (Resources.NotFoundException e) {
                                    i = i2 + 1;
                                }
                            } else {
                                if (!nodeValue.startsWith("@string/") || (nodeValue = getAppLabelFromStrings(new File(file.getParentFile(), "res/values/strings.xml"), nodeValue.substring(nodeValue.indexOf("/") + 1))) == null) {
                                    break;
                                    break;
                                }
                                nodeValue = nodeValue.replace("\\", "");
                                break;
                            }
                        } else {
                            nodeValue = (String) null;
                            break;
                        }
                    }
                    i = i2 + 1;
                } else {
                    nodeValue = (String) null;
                    break;
                }
            }
        } catch (Throwable th) {
            nodeValue = (String) null;
            break;
        }
        return nodeValue;
    }

    public static String getAppLabelFromStrings(File file, String str) {
        Node namedItem;
        try {
            if (!file.exists() || !file.isFile()) {
                return (String) null;
            }
            NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file).getElementsByTagName("resources");
            if (elementsByTagName.getLength() == 0) {
                return (String) null;
            }
            NodeList childNodes = elementsByTagName.item(0).getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node nodeItem = childNodes.item(i);
                if ("string".equals(nodeItem.getNodeName()) && (namedItem = nodeItem.getAttributes().getNamedItem("name")) != null && str.equals(namedItem.getNodeValue())) {
                    String textContent = nodeItem.getTextContent();
                    if (textContent.startsWith("@android:string/")) {
                        Resources resources = App.getApp().getResources();
                        try {
                            return resources.getString(resources.getIdentifier(textContent.substring("@android:string/".length()), "string", Project.ANDROID));
                        } catch (Resources.NotFoundException e) {
                        }
                    } else {
                        if (textContent.startsWith("@string/")) {
                            return getAppLabelFromStrings(file, textContent.substring(textContent.indexOf("/") + 1));
                        }
                        return textContent;
                    }
                }
            }
            return (String) null;
        } catch (Throwable th) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0019, code lost:
    
        r0 = (android.graphics.drawable.Drawable) null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Drawable getAppIconFromManifest(File file) {
        Drawable bitmapDrawable;
        int i = 0;
        try {
            Resources resources = App.getApp().getResources();
            if (!file.exists() || !file.isFile()) {
                bitmapDrawable = (Drawable) null;
                break;
            }
            NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file).getElementsByTagName("manifest");
            if (elementsByTagName.getLength() == 0) {
                bitmapDrawable = (Drawable) null;
                break;
            }
            NodeList childNodes = elementsByTagName.item(0).getChildNodes();
            while (true) {
                int i2 = i;
                if (i2 < childNodes.getLength()) {
                    Node nodeItem = childNodes.item(i2);
                    if ("application".equals(nodeItem.getNodeName())) {
                        Node namedItem = nodeItem.getAttributes().getNamedItem("android:icon");
                        if (namedItem == null) {
                            bitmapDrawable = (Drawable) null;
                            break;
                        }
                        String nodeValue = namedItem.getNodeValue();
                        if (nodeValue.startsWith("@") && nodeValue.contains(Config.TRACE_TODAY_VISIT_SPLIT) && nodeValue.contains("/")) {
                            try {
                                bitmapDrawable = resources.getDrawable(resources.getIdentifier(Utils.subString(nodeValue, "/", (String) null), Utils.subString(nodeValue, Config.TRACE_TODAY_VISIT_SPLIT, "/"), Utils.subString(nodeValue, "@", Config.TRACE_TODAY_VISIT_SPLIT)));
                                break;
                            } catch (Resources.NotFoundException e) {
                                i = i2 + 1;
                            }
                        } else {
                            if (nodeValue.startsWith("@") && nodeValue.contains("/")) {
                                File file2 = new File(file.getParentFile(), "res");
                                String strSubstring = nodeValue.substring(1);
                                String appIconFromRes = getAppIconFromRes(file2, strSubstring.substring(0, strSubstring.indexOf("/")), nodeValue.substring(nodeValue.indexOf("/") + 1));
                                if (appIconFromRes != null) {
                                    bitmapDrawable = new BitmapDrawable(ImageUtils.getBitmap(FileUtils.getFileByPath(appIconFromRes)));
                                    break;
                                }
                                bitmapDrawable = (BitmapDrawable) null;
                                break;
                            }
                            bitmapDrawable = (Drawable) null;
                            break;
                        }
                    }
                    i = i2 + 1;
                } else {
                    bitmapDrawable = (Drawable) null;
                    break;
                }
            }
        } catch (Throwable th) {
            bitmapDrawable = (Drawable) null;
            break;
        }
        return bitmapDrawable;
    }

    public static String getAppIconFromRes(File file, String str, String str2) {
        System.out.println(str);
        File[] fileArrListFiles = file.listFiles(new FileFilter(str) {
            private final String val$folder;

            {
                this.val$folder = str;
            }

            @Override
            public boolean accept(File file2) {
                return file2.isDirectory() && (file2.getName().equals(this.val$folder) || file2.getName().startsWith(new StringBuffer().append(this.val$folder).append("-").toString()));
            }
        });
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                File[] fileArrListFiles2 = file2.listFiles(new FileFilter(str2) {
                    private final String val$name;

                    {
                        this.val$name = str2;
                    }

                    @Override
                    public boolean accept(File file3) {
                        return file3.isFile() && (file3.getName().equals(this.val$name) || file3.getName().startsWith(new StringBuffer().append(this.val$name).append(".").toString())) && !file3.getName().endsWith(TypedValue.XML_FILE);
                    }
                });
                if (fileArrListFiles2 != null && fileArrListFiles2.length > 0) {
                    return fileArrListFiles2[0].getAbsolutePath();
                }
            }
        }
        return (String) null;
    }
}
