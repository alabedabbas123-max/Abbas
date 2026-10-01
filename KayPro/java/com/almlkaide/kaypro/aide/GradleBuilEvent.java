package com.almlkaide.kaypro.aide;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.aide.ui.U;
import com.blankj.utilcode.util.KeyboardUtils;
import com.almlkaide.kaypro.aide.builder.GradleBuilder;
import com.almlkaide.kaypro.aide.builder.RunCommandDialog;
import com.almlkaide.kaypro.aide.api.SimpleIMainActivity;
import com.almlkaide.kaypro.aide.util.ProjectUtils;
import com.almlkaide.kaypro.util.KeyText;
import com.almlkaide.kaypro.util.Utils;
import java.io.File;
import java.util.ArrayList;

public class GradleBuilEvent extends SimpleIMainActivity {
    private AideMainActivity mActivity;
    private GradleBuilder mGradleBuilder;
    private Menu mOptionsMenu;

    public GradleBuilder getGradleBuilder() {
        return this.mGradleBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void onCreate(Activity activity, Bundle bundle) {
        super.onCreate(activity, bundle);
        this.mActivity = (AideMainActivity) activity;
        this.mGradleBuilder = new GradleBuilder(activity);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu) {
        this.mOptionsMenu = menu;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        File currentProject = ProjectUtils.getCurrentProject();
        if (currentProject != null && ProjectUtils.isGradleProject(currentProject) && AdvancedSetting.isEnableGradle()) {
            String absolutePath = currentProject.getAbsolutePath();
            switch (itemId) {
                case AideR.C1673id.mainMenuRebuild:
                case AideR.C1673id.mainMenuRun:
                    ArrayList arrayList = new ArrayList();
                    boolean zIsCN = Utils.isCN();
                    arrayList.add(new KeyText("default", zIsCN ? "默认构建器" : "Default builder"));
                    arrayList.add(new RunCmdOption(this, (String) null, "gradle clean", "gradle clean"));
                    arrayList.add(new KeyText("build", "gradle build"));
                    arrayList.add(new KeyText("assembleDebug", "gradle assembleDebug"));
                    arrayList.add(new KeyText("assembleRelease", "gradle assembleRelease"));
                    arrayList.add(new KeyText("runCommand", zIsCN ? "运行命令" : "Run command"));
                    CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
                    new AlertDialog.Builder(this.mActivity).setTitle(Utils.isCN() ? "选择构建器" : "Select builder").setItems(charSequenceArr, new DialogInterface.OnClickListener(this, charSequenceArr, menuItem, absolutePath) {
                        private final GradleBuilEvent this$0;
                        private final CharSequence[] val$items;
                        private final MenuItem val$menuItem;
                        private final String val$project;

                        {
                            this.this$0 = this;
                            this.val$items = charSequenceArr;
                            this.val$menuItem = menuItem;
                            this.val$project = absolutePath;
                        }

                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            KeyboardUtils.hideSoftInput(this.this$0.mActivity);
                            CharSequence charSequence = this.val$items[i];
                            if (charSequence instanceof RunCmdOption) {
                                RunCommandDialog runCommandDialog = new RunCommandDialog();
                                runCommandDialog.setCmds(((RunCmdOption) charSequence).f4933cmd);
                                runCommandDialog.show(this.this$0.mActivity.getFragmentManager(), "RunGradleCommandDialog");
                                return;
                            }
                            if (charSequence instanceof KeyText) {
                                String key = ((KeyText) charSequence).getKey();
                                if (key.equals("default")) {
                                    this.this$0.mActivity.superOnOptionsItemSelected(this.val$menuItem);
                                    return;
                                }
                                if (key.equals("build")) {
                                    this.this$0.saveFile();
                                    this.this$0.mGradleBuilder.build(this.this$0.mActivity, this.val$project, "gradle build");
                                    return;
                                }
                                if (key.equals("assembleDebug")) {
                                    this.this$0.saveFile();
                                    this.this$0.mGradleBuilder.build(this.this$0.mActivity, this.val$project, "gradle assembleDebug");
                                } else if (key.equals("assembleRelease")) {
                                    this.this$0.saveFile();
                                    this.this$0.mGradleBuilder.build(this.this$0.mActivity, this.val$project, "gradle assembleRelease");
                                } else if (key.equals("runCommand")) {
                                    new RunCommandDialog().show(this.this$0.mActivity.getFragmentManager(), "RunGradleCommandDialog");
                                }
                            }
                        }
                    }).create().show();
                    return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void saveFile() {
        U.er().j6(false, false);
    }

    private class Option extends KeyText {
        private final GradleBuilEvent this$0;

        public Option(GradleBuilEvent gradleBuilEvent, String str, CharSequence charSequence) {
            super(str, charSequence);
            this.this$0 = gradleBuilEvent;
        }
    }

    private class RunCmdOption extends KeyText {

        private String[] f4933cmd;
        private final GradleBuilEvent this$0;

        public RunCmdOption(GradleBuilEvent gradleBuilEvent, String str, CharSequence charSequence, String... strArr) {
            super(str, charSequence);
            this.this$0 = gradleBuilEvent;
            this.f4933cmd = strArr;
        }
    }
}
