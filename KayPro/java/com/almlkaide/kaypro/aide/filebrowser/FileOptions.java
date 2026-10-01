package com.almlkaide.kaypro.aide.filebrowser;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Build;
import android.text.format.Formatter;
import androidx.core.content.pm.PackageInfoCompat;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.IntentUtils;
import com.almlkaide.kaypro.aide.application.FileProvider;
import com.almlkaide.kaypro.util.Utils;
import java.io.File;
import java.util.Calendar;
import java.util.Locale;

public class FileOptions {
    public static void openImage(Context context, File file) {
        Uri uriFromFile;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        if (Build.VERSION.SDK_INT >= 24) {
            uriFromFile = FileProvider.getUriForFile(file);
            intent.addFlags(1);
        } else {
            uriFromFile = Uri.fromFile(file);
        }
        intent.setDataAndType(uriFromFile, "image/*");
        try {
            context.startActivity(intent);
        } catch (Throwable th) {
            Utils.showExDialog(context, th);
        }
    }

    public static AlertDialog showApkInfoDialog(Context context, File file) {
        PackageInfo packageInfo;
        boolean z;
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageArchiveInfo = (file != null && file.exists() && file.isFile()) ? packageManager.getPackageArchiveInfo(file.getAbsolutePath(), 0) : (PackageInfo) null;
        if (packageArchiveInfo == null) {
            AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setTitle(Utils.isCN() ? "APK不存在或损坏" : "APK does not exist or is corrupted").setMessage(file == null ? (String) null : file.getAbsolutePath()).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).create();
            alertDialogCreate.show();
            Utils.setMessageIsSelectable(alertDialogCreate);
            return alertDialogCreate;
        }
        ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
        try {
            packageInfo = packageManager.getPackageInfo(packageArchiveInfo.packageName, 0);
            if (packageInfo.applicationInfo.sourceDir != null) {
                try {
                    applicationInfo = packageInfo.applicationInfo;
                    z = true;
                } catch (Throwable th) {
                    applicationInfo.sourceDir = file.getAbsolutePath();
                    applicationInfo.publicSourceDir = file.getAbsolutePath();
                    z = false;
                }
            } else {
                z = false;
                packageInfo = packageArchiveInfo;
            }
        } catch (Throwable th2) {
            packageInfo = packageArchiveInfo;
        }
        boolean zIsCN = Utils.isCN();
        StringBuilder sb = new StringBuilder();
        sb.append(zIsCN ? "包名：" : "packageName: ").append(packageInfo.packageName);
        sb.append(zIsCN ? "\n版本名：" : "\nversionName: ").append(packageInfo.versionName);
        sb.append(zIsCN ? "\n版本号：" : "\nversionCode: ").append(PackageInfoCompat.getLongVersionCode(packageInfo));
        sb.append(zIsCN ? "\n应用大小：" : "\napkSize: ").append(Formatter.formatFileSize(context, FileUtils.getFileLength(file.getAbsolutePath())).toUpperCase(Locale.ENGLISH)).append(String.format(" (%d)", new Long(FileUtils.getFileLength(applicationInfo.sourceDir))));
        sb.append(zIsCN ? "\n最小支持SDK：" : "minSdkVersion: ").append(Build.VERSION.SDK_INT >= 24 ? applicationInfo.minSdkVersion : getMinSdkVersion(applicationInfo.sourceDir));
        sb.append(zIsCN ? "\n目标SDK版本：" : "\ntargetSdkVersion: ").append(applicationInfo.targetSdkVersion);
        sb.append(zIsCN ? "\n是否已安装：" : "Installed: ").append(z);
        if (z) {
            sb.append(zIsCN ? "\n首次安装时间：" : "\nfirstInstallTime: ").append(formatTime(packageInfo.firstInstallTime));
            sb.append(zIsCN ? "\n最后安装时间：" : "\nlastUpdateTime: ").append(formatTime(packageInfo.lastUpdateTime));
        } else {
            sb.append(zIsCN ? "\n最后修改时间：" : "\nlastModifyTime: ").append(formatTime(file.lastModified()));
        }
        if (z) {
            sb.append(zIsCN ? "\n应用路径：" : "\napkPath: ").append(applicationInfo.sourceDir);
        }
        sb.append(zIsCN ? "\n来源路径：" : "\napkPath: ").append(file.getAbsolutePath());
        AlertDialog alertDialogCreate2 = new AlertDialog.Builder(context).setIcon(applicationInfo.loadIcon(packageManager)).setTitle(applicationInfo.loadLabel(packageManager)).setMessage(sb).setPositiveButton(Utils.isCN() ? "安装" : "Install", new DialogInterface.OnClickListener(context, file) {
            private final Context val$context;
            private final File val$file;

            {
                this.val$context = context;
                this.val$file = file;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                FileOptions.installApk(this.val$context, this.val$file);
            }
        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
        alertDialogCreate2.show();
        Utils.setMessageIsSelectable(alertDialogCreate2);
        return alertDialogCreate2;
    }

    public static int getMinSdkVersion(String str) {
        try {
            try {
                AssetManager assetManager = (AssetManager) Class.forName("android.content.res.AssetManager").newInstance();
                Class<?> cls = assetManager.getClass();
                Class<?>[] clsArr = new Class[1];
                try {
                    clsArr[0] = Class.forName("java.lang.String");
                    XmlResourceParser xmlResourceParserOpenXmlResourceParser = assetManager.openXmlResourceParser(((Integer) cls.getMethod("addAssetPath", clsArr).invoke(assetManager, str)).intValue(), "AndroidManifest.xml");
                    while (xmlResourceParserOpenXmlResourceParser.next() != 1) {
                        if (xmlResourceParserOpenXmlResourceParser.getEventType() == 2 && xmlResourceParserOpenXmlResourceParser.getName().equals("uses-sdk")) {
                            for (int i = 0; i < xmlResourceParserOpenXmlResourceParser.getAttributeCount(); i++) {
                                if (xmlResourceParserOpenXmlResourceParser.getAttributeName(i).equals("minSdkVersion")) {
                                    return xmlResourceParserOpenXmlResourceParser.getAttributeIntValue(i, -1);
                                }
                            }
                        }
                    }
                } catch (ClassNotFoundException e) {
                    throw new NoClassDefFoundError(e.getMessage());
                }
            } catch (ClassNotFoundException e2) {
                throw new NoClassDefFoundError(e2.getMessage());
            }
        } catch (Throwable th) {
        }
        return 0;
    }

    public static String formatTime(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return calendar.getTime().toLocaleString();
    }

    public static void installApk(Context context, File file) {
        if (file == null) {
            Utils.toastError("file is null");
            return;
        }
        if (file.exists()) {
            if (!file.isFile()) {
                Utils.toastError("It's not a file.");
                return;
            }
            Intent installAppIntent = IntentUtils.getInstallAppIntent(file);
            installAppIntent.addFlags(268435456);
            Utils.startActivity(context, installAppIntent);
            return;
        }
        Utils.toastError(String.format(Utils.isCN() ? "文件未找到：%s" : "File not found:%s", file.getAbsolutePath()));
    }
}
