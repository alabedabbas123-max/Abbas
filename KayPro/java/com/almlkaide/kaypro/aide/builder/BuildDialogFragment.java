package com.almlkaide.kaypro.aide.builder;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.androlua.LuaEditor;
import com.almlkaide.kaypro.aide.builder.project.GradleProject;
import com.almlkaide.kaypro.aide.filebrowser.FileOptions;
import com.almlkaide.kaypro.util.Utils;
import java.io.File;

public class BuildDialogFragment extends BaseBuildDialogFragment {
    @Override
    public void onBuildSuccessful() {
        super.onBuildSuccessful();
        boolean zIsCN = Utils.isCN();
        File apkFile = getApkFile();
        LuaEditor luaEditorCreateLuaEditor = createLuaEditor();
        luaEditorCreateLuaEditor.setText(getText());
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this.mActivity).setTitle(zIsCN ? "构建成功" : "Build Successful").setView(luaEditorCreateLuaEditor).setPositiveButton(zIsCN ? "安装" : "Install", new DialogInterface.OnClickListener(this, apkFile) {
            private final BuildDialogFragment this$0;
            private final File val$apkFile;

            {
                this.this$0 = this;
                this.val$apkFile = apkFile;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                FileOptions.installApk(this.this$0.mActivity, this.val$apkFile);
            }
        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setNeutralButton(zIsCN ? "查看" : "View", new DialogInterface.OnClickListener(this, apkFile) {
            private final BuildDialogFragment this$0;
            private final File val$apkFile;

            {
                this.this$0 = this;
                this.val$apkFile = apkFile;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                this.this$0.showApkInfoDialog(this.val$apkFile);
            }
        }).create();
        alertDialogCreate.show();
        Utils.fullScrollToBottom(alertDialogCreate);
        Utils.setMessageIsSelectable(alertDialogCreate);
        this.mDialog.dismiss();
    }

    private File getApkFile() {
        GradleProject gradleProject = new GradleProject(new File(this.buildInfo.getProject()));
        if (this.buildInfo.getBuildType() == 1) {
            return gradleProject.getOutputApkFile(gradleProject.outputsApkReleaseDir);
        }
        if (this.buildInfo.getBuildType() == 0) {
            return gradleProject.getOutputApkFile(gradleProject.outputsApkDebugDir);
        }
        return (File) null;
    }

    @Override
    public void onBuildFailed() {
        super.onBuildFailed();
        LuaEditor luaEditorCreateLuaEditor = createLuaEditor();
        luaEditorCreateLuaEditor.setText(getText());
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this.mActivity).setTitle(Utils.isCN() ? "构建失败" : "Build Failed").setView(luaEditorCreateLuaEditor).setPositiveButton(R.string.copy, new DialogInterface.OnClickListener(this, luaEditorCreateLuaEditor) {
            private final BuildDialogFragment this$0;
            private final LuaEditor val$editor;

            {
                this.this$0 = this;
                this.val$editor = luaEditorCreateLuaEditor;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Utils.copyToClipboard(this.val$editor.getText().toString());
            }
        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
        alertDialogCreate.show();
        Utils.fullScrollToBottom(alertDialogCreate);
        Utils.setMessageIsSelectable(alertDialogCreate);
        this.mDialog.dismiss();
    }

    public void showApkInfoDialog(File file) {
        FileOptions.showApkInfoDialog(this.mActivity, file);
    }
}
