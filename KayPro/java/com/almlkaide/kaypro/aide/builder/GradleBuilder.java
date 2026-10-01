package com.almlkaide.kaypro.aide.builder;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ResourceUtils;
import com.blankj.utilcode.util.SPStaticUtils;
import com.almlkaide.kaypro.aide.builder.data.BuildInfo;
import com.almlkaide.kaypro.aide.builder.task.UnInstallTask;
import com.almlkaide.kaypro.aide.util.ProjectUtils;
import com.almlkaide.kaypro.util.Utils;
import com.scott.dev.ShellServer;
import java.io.File;
import java.io.FileFilter;

public class GradleBuilder {
    private static final long BUSYBOX_VERSION = 1;
    private final Context mContext;

    public GradleBuilder(Context context) {
        this.mContext = context;
    }

    public ShellServer newShell() {
        ShellServer shellServer = new ShellServer((ShellServer.Callback) null, "sh", getHome().getAbsolutePath());
        File fileCurrentProject = ProjectUtils.currentProject();
        if (fileCurrentProject != null) {
            shellServer.append(String.format("export AIDE_CUR_PROJECT=%s\n", fileCurrentProject.getAbsolutePath()));
        }
        File busybox = getBusybox();
        if (busybox != null) {
            shellServer.append(String.format("export BUSYBOX=%s\n", busybox.getAbsolutePath()), false);
        }
        shellServer.start();
        return shellServer;
    }

    private File getBusybox() {
        File parentFile = this.mContext.getFilesDir().getParentFile();
        File file = new File(parentFile, "bin/busybox");
        if (file.exists() && file.isDirectory()) {
            FileUtils.deleteAllInDir(file);
            file.delete();
        }
        if (!SPStaticUtils.contains("busyboxArch") || !SPStaticUtils.getString("busyboxArch", "").equals(Utils.getArch())) {
            FileUtils.delete(file);
        }
        if (!file.exists() || SPStaticUtils.getLong("BUSYBOX_VERSION", 0) < 1) {
            FileUtils.delete(file);
            String str = (String) null;
            String arch = Utils.getArch();
            if (arch.equals("arm") || arch.equals("arm64") || arch.equals("x86") || arch.equals("x86_64")) {
                str = arch;
            }
            LogUtils.iTag("hardware architecture", new Object[]{arch});
            if (str == null) {
                LogUtils.iTag("Unsupported architecture", new Object[]{arch});
            } else if (ResourceUtils.copyFileFromAssets(Utils.getAssetsDataFile(new StringBuffer().append("busybox/").append(str).toString()), parentFile.getAbsolutePath())) {
                SPStaticUtils.put("busyboxArch", str);
                if (file.setExecutable(true)) {
                    SPStaticUtils.put("BUSYBOX_VERSION", 1L);
                } else {
                    LogUtils.e(new Object[]{"setExecutable failed"});
                }
            } else {
                FileUtils.delete(file);
                LogUtils.e(new Object[]{"copyBusybox failed"});
            }
        } else if (!file.canExecute()) {
            file.setExecutable(true);
        }
        return file;
    }

    public File getHome() {
        File file = new File(this.mContext.getFilesDir(), "BuildTools");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public File getBin() {
        File file = new File(getHome(), "bin");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public void build(Activity activity, String str, String str2) {
        BuildDialogFragment buildDialogFragment = new BuildDialogFragment();
        Bundle bundle = new Bundle();
        BuildInfo buildInfo = new BuildInfo();
        buildInfo.setProject(str);
        if ("gradle assembleRelease".equals(str2)) {
            buildInfo.setBuildType(1);
        } else {
            buildInfo.setBuildType(0);
        }
        bundle.putParcelable("buildInfo", buildInfo);
        buildDialogFragment.setArguments(bundle);
        compiling(activity, buildDialogFragment, str2, str);
    }

    public void compiling(Activity activity, BaseBuildDialogFragment baseBuildDialogFragment, String str, String str2) {
        baseBuildDialogFragment.addDialogListener(new MessageDialogFragment.DialogListener(this, newShell(), baseBuildDialogFragment, str2, str) {
            private final GradleBuilder this$0;
            private final String val$cmd;
            private final BaseBuildDialogFragment val$dialog;
            private final String val$project;
            private final ShellServer val$shell;

            {
                this.this$0 = this;
                this.val$shell = shellServer;
                this.val$dialog = baseBuildDialogFragment;
                this.val$project = str2;
                this.val$cmd = str;
            }

            @Override
            public void onShow(MessageDialogFragment messageDialogFragment, AlertDialog alertDialog) {
                this.val$shell.addCallback(this.val$dialog);
                this.val$shell.append("cd ".concat(this.val$project));
                this.val$shell.append(this.val$cmd);
            }

            @Override
            public void onDismiss(MessageDialogFragment messageDialogFragment, AlertDialog alertDialog) {
                this.val$shell.removeCallback(this.val$dialog);
                this.val$shell.exit();
            }
        });
        baseBuildDialogFragment.show(activity.getFragmentManager(), baseBuildDialogFragment.getClass().getName());
    }

    public void install(Activity activity, String str) {
        LogUtils.iTag("install dir", new Object[]{str});
        ShellServer shellServerNewShell = newShell();
        InstallDialogFragment installDialogFragment = new InstallDialogFragment();
        installDialogFragment.addDialogListener(new MessageDialogFragment.DialogListener(this, shellServerNewShell, installDialogFragment, str) {
            private final GradleBuilder this$0;
            private final InstallDialogFragment val$dialog;
            private final String val$link;
            private final ShellServer val$shell;

            {
                this.this$0 = this;
                this.val$shell = shellServerNewShell;
                this.val$dialog = installDialogFragment;
                this.val$link = str;
            }

            @Override
            public void onShow(MessageDialogFragment messageDialogFragment, AlertDialog alertDialog) {
                File[] fileArrListFiles;
                this.val$shell.addCallback(this.val$dialog);
                File file = new File(this.val$link);
                if (file.isDirectory()) {
                    fileArrListFiles = file.listFiles(new FileFilter(this) {
                        private final AnonymousClass100000002 this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override
                        public boolean accept(File file2) {
                            return file2.isFile() && file2.getName().endsWith(".tar.xz");
                        }
                    });
                } else {
                    fileArrListFiles = new File[]{file};
                }
                if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                    this.val$shell.append("echo listFiles == null || listFiles.length == 0", false);
                    return;
                }
                this.val$shell.append(new StringBuffer().append("echo ").append(Utils.isCN() ? "正在安装，请稍等... " : "Installing...").toString(), false);
                this.val$shell.append("cd $HOME&&cd ..", false);
                for (File file2 : fileArrListFiles) {
                    this.val$shell.append("$BUSYBOX tar xJf " + file2.getAbsolutePath(), false);
                }
                this.val$shell.append(new StringBuffer().append("echo ").append(Utils.isCN() ? "安装结束" : "Install finished！").toString(), false);
                this.val$shell.append("echo ___EXIT___", false);
            }

            @Override
            public void onDismiss(MessageDialogFragment messageDialogFragment, AlertDialog alertDialog) {
                this.val$shell.removeCallback(this.val$dialog);
                this.val$shell.exit();
            }
        });
        installDialogFragment.setOnInstallListener(new InstallDialogFragment.OnInstallListener(this) {
            private final GradleBuilder this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onInstallFinish(InstallDialogFragment installDialogFragment2) {
                installDialogFragment2.setCancelable(true);
            }
        });
        installDialogFragment.show(activity.getFragmentManager(), "InstallDialogFragment");
    }

    public void uninstall(Activity activity) {
        new UnInstallTask(activity).execute(new String[]{getHome().getAbsolutePath()});
    }
}
