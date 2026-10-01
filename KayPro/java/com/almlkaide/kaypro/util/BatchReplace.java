package com.almlkaide.kaypro.util;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.blankj.utilcode.util.FileIOUtils;
import java.io.File;

public class BatchReplace {

    public interface Listener {
        boolean onReplace(File file);
    }

    public static void showDialog(Activity activity, String str) {
        boolean zIsCN = Utils.isCN();
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(Utils.dp2px(24), 0, Utils.dp2px(24), 0);
        EditText editText = new EditText(activity);
        editText.setHint(zIsCN ? "目录或文件" : "Directory or file");
        if (str != null) {
            editText.setText(str);
        }
        EditText editText2 = new EditText(activity);
        editText2.setHint(zIsCN ? "原内容" : "Old content");
        EditText editText3 = new EditText(activity);
        editText3.setHint(zIsCN ? "新内容" : "New content");
        EditText editText4 = new EditText(activity);
        editText4.setHint(zIsCN ? "后缀过滤 .java|.xml，可空" : "Suffix filter .java|.xml, can be empty");
        CheckBox checkBox = new CheckBox(activity);
        checkBox.setText(zIsCN ? "替换子目录" : "Replace subdirectory");
        checkBox.setChecked(true);
        linearLayout.addView(editText, -1, -2);
        linearLayout.addView(editText2, -1, -2);
        linearLayout.addView(editText3, -1, -2);
        linearLayout.addView(editText4, -1, -2);
        linearLayout.addView(checkBox, -1, -2);
        ScrollView scrollView = new ScrollView(activity);
        scrollView.addView(linearLayout);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setTitle(zIsCN ? "批量替换" : "Batch Replace").setView(scrollView).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
        alertDialogCreate.show();
        alertDialogCreate.getButton(-1).setOnClickListener(new View.OnClickListener(checkBox, editText, editText2, editText3, editText4, zIsCN, activity) {
            private String[] filter;
            private String news;

            private String f5091old;
            private String targetDir;
            private final Activity val$activity;
            private final CheckBox val$cb;
            private final EditText val$et;
            private final EditText val$et_filtration;
            private final EditText val$et_new;
            private final EditText val$et_old;
            private final boolean val$isCN;

            {
                this.val$cb = checkBox;
                this.val$et = editText;
                this.val$et_old = editText2;
                this.val$et_new = editText3;
                this.val$et_filtration = editText4;
                this.val$isCN = zIsCN;
                this.val$activity = activity;
            }

            private void replace(File file, Listener listener) {
                String file2String;
                int i = 0;
                if (file.isFile()) {
                    if (this.filter != null) {
                        for (String str2 : this.filter) {
                            if (str2.trim().length() != 0 && file.getName().endsWith(str2)) {
                                i = 1;
                                break;
                            }
                        }
                    } else {
                        i = 1;
                    }
                    if (i != 0 && (file2String = FileIOUtils.readFile2String(file)) != null && file2String.contains(this.f5091old) && listener.onReplace(file)) {
                        FileIOUtils.writeFileFromString(file, file2String.replace(this.f5091old, this.news));
                        return;
                    }
                    return;
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    while (i < fileArrListFiles.length) {
                        File file2 = fileArrListFiles[i];
                        if (!file2.isDirectory()) {
                            replace(file2, listener);
                        } else if (this.val$cb.isChecked()) {
                            replace(file2, listener);
                        }
                        i++;
                    }
                }
            }

            @Override
            public void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.targetDir = this.val$et.getText().toString();
                this.f5091old = this.val$et_old.getText().toString();
                this.news = this.val$et_new.getText().toString();
                this.filter = this.val$et_filtration.getText().toString().trim().length() == 0 ? (String[]) null : this.val$et_filtration.getText().toString().split("|");
                if (this.targetDir.trim().length() == 0 || !new File(this.targetDir).exists()) {
                    this.val$et.setError(this.val$isCN ? "路径不存在" : "path does not exist");
                    return;
                }
                if (this.f5091old.length() == 0) {
                    this.val$et_old.setError(this.val$isCN ? "请输入要替换的内容" : "Please enter what to replace");
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer();
                replace(new File(this.targetDir), new Listener(this, stringBuffer) {
                    private final AnonymousClass100000002 this$0;
                    private final StringBuffer val$sb;

                    {
                        this.this$0 = this;
                        this.val$sb = stringBuffer;
                    }

                    @Override
                    public boolean onReplace(File file) {
                        this.val$sb.append(new StringBuffer().append("\nFile:").append(file.getAbsolutePath()).toString());
                        return true;
                    }
                });
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(new StringBuffer().append(this.val$isCN ? "耗时" : "time consuming").append(System.currentTimeMillis() - jCurrentTimeMillis).toString());
                stringBuffer2.append("ms\n");
                stringBuffer2.append(stringBuffer.toString());
                new AlertDialog.Builder(this.val$activity).setTitle(this.val$isCN ? "替换完成" : "Replacement complete").setMessage(stringBuffer2.toString()).setPositiveButton(R.string.copy, new DialogInterface.OnClickListener(this, stringBuffer2) {
                    private final AnonymousClass100000002 this$0;
                    private final StringBuffer val$msg;

                    {
                        this.this$0 = this;
                        this.val$msg = stringBuffer2;
                    }

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Utils.copyToClipboard(this.val$msg.toString());
                    }
                }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create().show();
            }
        });
    }
}
