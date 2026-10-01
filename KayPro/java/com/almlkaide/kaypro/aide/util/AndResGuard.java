package com.almlkaide.kaypro.aide.util;

import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.JsonUtils;
import com.almlkaide.kaypro.util.Utils;
import com.tencent.mm.resourceproguard.InputParam;
import com.tencent.mm.resourceproguard.Main;
import com.tencent.mm.util.TypedValue;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AndResGuard {
    public static void proguard(File file) throws Throwable {
        String file2String;
        File bin = ProjectUtils.getBin(file);
        File binResourcesAp = ProjectUtils.getBinResourcesAp(file);
        InputParam.Builder builder = new InputParam.Builder();
        builder.setWhiteList(new ArrayList<>());
        builder.setCompressFilePattern(new ArrayList<>());
        File file2 = new File(file, "proguard-resources.json");
        if (file2.exists() && file2.isFile() && (file2String = FileIOUtils.readFile2String(file2)) != null && file2String.trim().length() != 0) {
            String str = Utils.getApp().getPackageManager().getPackageArchiveInfo(binResourcesAp.getAbsolutePath(), 0).packageName;
            try {
                JSONObject jSONObject = new JSONObject(file2String);
                builder.setKeepRoot(JsonUtils.getBoolean(jSONObject, "keepRoot", false));
                String string = JsonUtils.getString(jSONObject, "fixedResName", (String) null);
                if (string != null && string.length() > 0) {
                    builder.setFixedResName(string);
                }
                String string2 = JsonUtils.getString(jSONObject, "mappingFile", (String) null);
                if (string2 != null) {
                    File file3 = new File(file, string2);
                    if (file3.exists() && file3.isFile()) {
                        builder.setMappingFile(file3);
                    }
                }
                JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "whiteList", (JSONArray) null);
                if (jSONArray != null) {
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(new StringBuffer().append(new StringBuffer().append(str).append(".").toString()).append(jSONArray.getString(i)).toString());
                    }
                    builder.setWhiteList(arrayList);
                }
                JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "compressFilePattern", (JSONArray) null);
                if (jSONArray2 != null) {
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        arrayList2.add(jSONArray2.getString(i2));
                    }
                    builder.setCompressFilePattern(arrayList2);
                }
            } catch (JSONException e) {
                if (Utils.isCN()) {
                    throw new JSONException(new StringBuffer().append("解析json出错，请检查json是否错误！：\n").append(e.getMessage()).toString());
                }
                throw new JSONException(new StringBuffer().append("Error parsing JSON, please check if JSON is wrong!：\n").append(e.getMessage()).toString());
            }
        }
        File file4 = new File(bin, "resources.apk");
        FileUtils.copy(binResourcesAp, file4);
        builder.setApkPath(file4.getAbsolutePath());
        File file5 = new File(bin, "andresguard");
        builder.setOutBuilder(file5.getAbsolutePath());
        try {
            Main.gradleRun(builder.create());
            File file6 = new File(file5, "resources_unsigned.apk");
            if (file6.exists()) {
                FileUtils.move(file6.getAbsolutePath(), binResourcesAp.getAbsolutePath());
            }
            FileUtils.delete(file4);
            FileUtils.deleteFilesInDirWithFilter(file5, new FileFilter() {
                @Override
                public boolean accept(File file7) {
                    return !file7.getName().endsWith(TypedValue.TXT_FILE);
                }
            });
        } catch (Throwable th) {
            FileUtils.delete(file4);
            FileUtils.deleteFilesInDirWithFilter(file5, new FileFilter() {
                @Override
                public boolean accept(File file7) {
                    return !file7.getName().endsWith(TypedValue.TXT_FILE);
                }
            });
            throw th;
        }
    }

    public static void delectResourcesAps() {
        File binResourcesAp = ProjectUtils.getBinResourcesAp(ProjectUtils.getCurrentProject());
        if (binResourcesAp == null || !binResourcesAp.exists()) {
            return;
        }
        binResourcesAp.delete();
    }
}
