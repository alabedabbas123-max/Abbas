package com.almlkaide.kaypro.assetsmanager.project;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.aide.common.ab;
import com.almlkaide.kaypro.assetsmanager.util.CodeGenerator;
import com.almlkaide.kaypro.assetsmanager.util.FileUtil;
import com.almlkaide.kaypro.aide.util.AIDEUtils;
import com.almlkaide.kaypro.aide.util.ProjectUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class AddCustomActivityTemplateDialog {
    private LinearLayout base;
    private String getPackage;
    private String getPackageManifest;
    private String importPackageR;
    private ab<String> mAbVar;
    private Activity mActivity;
    private EditText mActivityName;
    private String mCreateDir;
    private EditText mLabelName;
    private String mTamplate;
    private EditText mXmlName;

    public AddCustomActivityTemplateDialog(Activity activity, String str, ab<String> abVar, String str2) {
        this.mActivity = activity;
        this.mCreateDir = str;
        this.mAbVar = abVar;
        this.mTamplate = str2;
    }

    public void showDialog() {
        new AlertDialog.Builder(this.mActivity).setTitle("Adjust Activity").setView(getContentView()).setNeutralButton("Help", new DialogInterface.OnClickListener(this) {
            private final AddCustomActivityTemplateDialog this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                new AlertDialog.Builder(this.this$0.mActivity).setTitle("Help").setMessage("You must set titles without extension e.g. myactivity").setPositiveButton("Ok", new DialogInterface.OnClickListener(this) {
                    private final AnonymousClass100000001 this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public void onClick(DialogInterface dialogInterface2, int i2) {
                    }
                }).create().show();
            }
        }).setPositiveButton("Add", new DialogInterface.OnClickListener(this) {
            private final AddCustomActivityTemplateDialog this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (this.this$0.mActivityName.getText().toString().equals("")) {
                    this.this$0.mActivityName.setError("Empty");
                    return;
                }
                if (this.this$0.mXmlName.getText().toString().equals("")) {
                    this.this$0.mXmlName.setError("Empty");
                    return;
                }
                if (!this.this$0.mLabelName.getText().toString().equals("")) {
                    try {
                        this.this$0.androidManifest(this.this$0.mActivityName.getText().toString(), this.this$0.mLabelName.getText().toString());
                    } catch (Exception e) {
                        Toast.makeText(this.this$0.mActivity, e.toString(), 0).show();
                    }
                    FileUtil.writeFile(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(ProjectUtils.getRes(ProjectUtils.getCurrentProject()).toString()).append("/layout/").toString()).append(this.this$0.mXmlName.getText().toString()).toString()).append(".xml").toString(), this.this$0.LoadData("templates/basicxml.xml"));
                    FileUtil.writeFile(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(this.this$0.mCreateDir).append("/").toString()).append(this.this$0.mActivityName.getText().toString()).toString()).append(".java").toString(), CodeGenerator.getBasicActivityCode(this.this$0.getPackage, this.this$0.mActivityName.getText().toString()));
                    AIDEUtils.openFile(new File(new StringBuffer().append(new StringBuffer().append(ProjectUtils.getRes(ProjectUtils.getCurrentProject()).toString()).append("/").toString()).append(this.this$0.mXmlName.getText().toString()).toString()));
                    AIDEUtils.openFile(new File(new StringBuffer().append(new StringBuffer().append(this.this$0.mCreateDir).append("/").toString()).append(this.this$0.mActivityName.getText().toString()).toString()));
                    AIDEUtils.reLoadFileBrowser();
                    dialogInterface.dismiss();
                    return;
                }
                this.this$0.mLabelName.setError("Empty");
            }
        }).setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).create().show();
    }

    class AnonymousClass100000000 implements DialogInterface.OnClickListener {
        private final AddCustomActivityTemplateDialog this$0;

        AnonymousClass100000000(AddCustomActivityTemplateDialog addCustomActivityTemplateDialog) {
            this.this$0 = addCustomActivityTemplateDialog;
        }

        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.this$0.mActivityName.getText().toString().equals("")) {
                this.this$0.mActivityName.setError("Empty");
                return;
            }
            if (this.this$0.mXmlName.getText().toString().equals("")) {
                this.this$0.mXmlName.setError("Empty");
                return;
            }
            if (!this.this$0.mLabelName.getText().toString().equals("")) {
                try {
                    AddCustomActivityTemplateDialog.access$1000012(this.this$0, this.this$0.mActivityName.getText().toString(), this.this$0.mLabelName.getText().toString());
                } catch (Exception e) {
                    Toast.makeText(this.this$0.mActivity, e.toString(), 0).show();
                }
                FileUtil.writeFile(new StringBuffer().append(new StringBuffer().append(ProjectUtils.getRes(ProjectUtils.getCurrentProject()).toString()).append("/").toString()).append(this.this$0.mXmlName.getText().toString()).toString(), CodeGenerator.getBasicXMLCode());
                FileUtil.writeFile(new StringBuffer().append(new StringBuffer().append(this.this$0.mCreateDir).append("/").toString()).append(this.this$0.mActivityName.getText().toString()).toString(), CodeGenerator.getBasicActivityCode(this.this$0.getPackage, this.this$0.mActivityName.getText().toString()));
                AIDEUtils.openFile(new File(new StringBuffer().append(new StringBuffer().append(ProjectUtils.getRes(ProjectUtils.getCurrentProject()).toString()).append("/").toString()).append(this.this$0.mXmlName.getText().toString()).toString()));
                AIDEUtils.openFile(new File(new StringBuffer().append(new StringBuffer().append(this.this$0.mCreateDir).append("/").toString()).append(this.this$0.mActivityName.getText().toString()).toString()));
                dialogInterface.dismiss();
                return;
            }
            this.this$0.mLabelName.setError("Empty");
        }
    }

    public String LoadData(String str) {
        String str2 = "";
        try {
            InputStream inputStreamOpen = this.mActivity.getAssets().open(str);
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            str2 = new String(bArr);
        } catch (IOException e) {
        }
        return str2;
    }

    public View getContentView() {
        this.base = new LinearLayout(this.mActivity);
        this.base.setPadding(dp2px(24.0f), dp2px(10.0f), dp2px(24.0f), 0);
        this.base.setOrientation(1);
        this.base.addView(getTextView("Activity Name"), -1, -2);
        this.mActivityName = new EditText(this.mActivity);
        this.mActivityName.setHint("Activity Name");
        this.mActivityName.setTextSize(18.0f);
        this.mActivityName.setSingleLine(true);
        this.base.addView(this.mActivityName, -1, -2);
        this.base.addView(getTextView("Xml file name"), -1, -2);
        this.mXmlName = new EditText(this.mActivity);
        this.mXmlName.setHint("Xml File Name");
        this.mXmlName.setTextSize(18.0f);
        this.mXmlName.setSingleLine(true);
        this.base.addView(this.mXmlName, -1, -2);
        this.base.addView(getTextView("Label"), -1, -2);
        this.mLabelName = new EditText(this.mActivity);
        this.mLabelName.setHint("Label");
        this.mLabelName.setTextSize(18.0f);
        this.mLabelName.setSingleLine(true);
        this.base.addView(this.mLabelName, -1, -2);
        return this.base;
    }

    public TextView getTextView(String str) {
        TextView textView = new TextView(this.mActivity);
        textView.setText(new StringBuffer().append(str).append(":").toString());
        textView.setTextSize(18.0f);
        textView.setPadding(7, 7, 7, 11);
        return textView;
    }

    public void androidManifest(String str, String str2) throws Exception {
        String str3;
        String file = FileUtil.readFile(new StringBuffer().append(ProjectUtils.getCurrentProject().toString()).append("/src/main/AndroidManifest.xml").toString());
        this.getPackageManifest = file.split("package=\"")[1].split("\"")[0];
        this.getPackage = new StringBuffer().append(this.mCreateDir.replace("/", ".")).append("end").toString().split("java.")[1].split("end")[0];
        this.importPackageR = new StringBuffer().append(new StringBuffer().append("\nimport ").append(this.getPackageManifest).toString()).append(".R;").toString();
        String string = new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(strSpace(8)).append("<activity%n").toString()).append(strSpace(12)).toString()).append("android:name=\"%s\"%n").toString()).append(strSpace(12)).toString()).append("android:label=\"%s\"/>%n").toString()).append(strSpace(4)).toString()).append("</application>").toString();
        String[] strArrSplit = file.split("\n");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < strArrSplit.length) {
                String str4 = strArrSplit[i2];
                if (str4.contains("</application>")) {
                    if (this.getPackage.equals(this.getPackageManifest) || !this.getPackage.contains(this.getPackageManifest)) {
                        if (this.getPackage.equals(this.getPackageManifest)) {
                            str3 = String.format(string, new StringBuffer().append(".").append(str).toString(), str2);
                        } else {
                            str3 = String.format(string, new StringBuffer().append(new StringBuffer().append(this.getPackage).append(".").toString()).append(str).toString(), str2);
                        }
                    } else {
                        str3 = String.format(string, new StringBuffer().append(new StringBuffer().append(this.getPackage.split(this.getPackageManifest)[1]).append(".").toString()).append(str).toString(), str2);
                    }
                    sb.append(new StringBuffer().append(str3).append(System.lineSeparator()).toString());
                } else {
                    sb.append(new StringBuffer().append(str4).append(System.lineSeparator()).toString());
                }
                i = i2 + 1;
            } else {
                FileUtil.writeFile(new StringBuffer().append(ProjectUtils.getCurrentProject()).append("/src/main/AndroidManifest.xml").toString(), sb.toString());
                return;
            }
        }
    }

    public static int dp2px(float f) {
        return (int) (0.5f + (Resources.getSystem().getDisplayMetrics().density * f));
    }

    private String strSpace(int i) {
        String string = "";
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < i) {
                string = new StringBuffer().append(string).append(" ").toString();
                i2 = i3 + 1;
            } else {
                return string;
            }
        }
    }
}
