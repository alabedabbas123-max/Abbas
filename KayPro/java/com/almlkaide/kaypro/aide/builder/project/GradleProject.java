package com.almlkaide.kaypro.aide.builder.project;

import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.StringUtils;
import com.google.gson.Gson;
import com.almlkaide.kaypro.data.OutputApk;
import java.io.File;

public class GradleProject {
    public final File outputsApkDebugDir;
    public final File outputsApkDir;
    public final File outputsApkReleaseDir;
    public final File projectFile;

    public GradleProject(File file) {
        this.projectFile = file;
        this.outputsApkDir = new File(file, "build/outputs/apk");
        this.outputsApkDebugDir = new File(this.outputsApkDir, "debug");
        this.outputsApkReleaseDir = new File(this.outputsApkDir, "release");
    }

    public OutputApk getOutputApk(File file) {
        OutputApk[] outputApks = getOutputApks(file);
        return (outputApks == null || outputApks.length == 0) ? (OutputApk) null : outputApks[0];
    }

    public OutputApk[] getOutputApks(File file) {
        File file2 = new File(file, "output.json");
        LogUtils.iTag("output.json", new Object[]{file2});
        try {
            return (OutputApk[]) new Gson().fromJson(FileIOUtils.readFile2String(file2), (Class) Class.forName("[Lcom.almlkaide.kaypro.data.OutputApk;"));
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public File getOutputApkFile(File file) {
        OutputApk outputApk = getOutputApk(file);
        if (outputApk != null && !StringUtils.isEmpty(outputApk.getPath())) {
            return new File(file, outputApk.getPath());
        }
        return (File) null;
    }
}
