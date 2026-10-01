package com.almlkaide.kaypro.aide.filebrowser;

import android.os.Environment;
import android.support.annotation.Keep;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ReflectUtils;
import com.almlkaide.kaypro.aide.util.AIDEUtils;
import com.almlkaide.kaypro.aide.util.ProjectUtils;
import java.io.File;

@Keep
public class FileItemManager {
    public static boolean isCreateProjectItemVisible(Object obj) {
        File fileByPath = FileUtils.getFileByPath(AIDEUtils.getFileBrowserCurrentDir());
        Boolean bool = (Boolean) ReflectUtils.reflect(obj).method("j6_", new Object[]{new Boolean(false)}).get();
        if (!bool.booleanValue() && fileByPath != null && fileByPath.getParentFile() != null && fileByPath.getParentFile().getAbsolutePath().equals(Environment.getExternalStorageDirectory().getAbsolutePath())) {
            bool = new Boolean(true);
        }
        return bool.booleanValue();
    }

    public static boolean isDirOpenable(File file) {
        return ProjectUtils.isAndroidProject(file) || ProjectUtils.isJavaProject(file);
    }

    public static boolean isInDir(String str, String str2) {
        return str2.startsWith(str);
    }
}
