package com.almlkaide.kaypro.aide;

import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ReflectUtils;
import com.blankj.utilcode.util.ThrowableUtils;
import com.almlkaide.kaypro.aide.api.ApiManager;
import java.io.File;
import java.util.List;

public class ApkBuilderManager {
    public static void proxyBuildApking(Object obj, List<String> list) {
        try {
            LogUtils.i(new Object[]{"### BuildApking Start ###"});
            ReflectUtils reflectUtilsReflect = ReflectUtils.reflect(obj);
            File fileByPath = FileUtils.getFileByPath((String) reflectUtilsReflect.field("EQ").get());
            File file = new File(new StringBuffer().append(fileByPath).append("-unsigned").toString());
            LogUtils.iTag("apkFile", new Object[]{fileByPath.getAbsolutePath()});
            LogUtils.iTag("unsignedApkFile", new Object[]{file.getAbsolutePath()});
            LogUtils.iTag("开始构建", new Object[]{list});
            reflectUtilsReflect.method("j6_", new Object[]{list}).get();
            LogUtils.eTag("unsignedApkFile exists", new Object[]{new Boolean(file.exists())});
            LogUtils.i(new Object[]{"### BuildApking End ###"});
            ApiManager.getIMainActivity().onBeforeSigningAPK(file, obj);
        } catch (Throwable th) {
            LogUtils.eTag("BuildApking Error", new Object[]{th});
            throw new RuntimeException(ThrowableUtils.getFullStackTrace(th));
        }
    }

    public static List<String> proxyDexing(Object obj) {
        try {
            LogUtils.iTag("### Dexing Start ###", new Object[0]);
            List<String> list = (List) ReflectUtils.reflect(obj).method("FH_").get();
            LogUtils.iTag("Dex list", new Object[]{list});
            LogUtils.iTag("### Dexing End ###", new Object[0]);
            return list;
        } catch (Throwable th) {
            LogUtils.eTag("Dexing Error", new Object[]{th});
            throw new RuntimeException(ThrowableUtils.getFullStackTrace(th));
        }
    }
}
