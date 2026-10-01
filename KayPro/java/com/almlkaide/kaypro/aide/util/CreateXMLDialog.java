package com.almlkaide.kaypro.aide.util;

import abcd.Vl;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.aide.common.ab;
import com.blankj.utilcode.util.KeyboardUtils;
import com.almlkaide.kaypro.aide.AideR;
import com.almlkaide.kaypro.util.Utils;
import com.tencent.mm.util.TypedValue;
import java.io.File;
import java.io.IOException;

public class CreateXMLDialog {
    public static void showDialog(Activity activity, String str, ab<String> abVar) {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setPadding(Utils.dp2px(24), 0, Utils.dp2px(24), 0);
        EditText editText = new EditText(activity);
        linearLayout.addView(editText, -1, -1);
        File file = new File(str);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setTitle(Utils.isCN() ? "创建XML" : "Create XML").setView(linearLayout).setPositiveButton(Utils.isCN() ? "创建" : "create", (DialogInterface.OnClickListener) null).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
        alertDialogCreate.show();
        alertDialogCreate.getButton(-1).setOnClickListener(new View.OnClickListener(alertDialogCreate, editText, file, abVar) {
            private final ab val$abVar;
            private final File val$createInDirFile;
            private final AlertDialog val$dialog;
            private final EditText val$input;

            {
                this.val$dialog = alertDialogCreate;
                this.val$input = editText;
                this.val$createInDirFile = file;
                this.val$abVar = abVar;
            }

            @Override
            public void onClick(View view) {
                CreateXMLDialog.createXml(this.val$dialog, this.val$input, this.val$createInDirFile, this.val$abVar);
            }
        });
        editText.setHint(AideR.string.dialog_create_message);
        editText.setSingleLine(true);
        editText.setInputType(1);
        editText.setImeOptions(6);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener(alertDialogCreate, editText, file, abVar) {
            private final ab val$abVar;
            private final File val$createInDirFile;
            private final AlertDialog val$dialog;
            private final EditText val$input;

            {
                this.val$dialog = alertDialogCreate;
                this.val$input = editText;
                this.val$createInDirFile = file;
                this.val$abVar = abVar;
            }

            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == 6) {
                    CreateXMLDialog.createXml(this.val$dialog, this.val$input, this.val$createInDirFile, this.val$abVar);
                }
                return this.val$input.getError() != null;
            }
        });
        editText.post(new Runnable(editText) {
            private final EditText val$input;

            {
                this.val$input = editText;
            }

            @Override
            public void run() {
                KeyboardUtils.showSoftInput(this.val$input);
            }
        });
        alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener(activity) {
            private final Activity val$activity;

            {
                this.val$activity = activity;
            }

            @Override
            public void onDismiss(DialogInterface dialogInterface) {
                InputMethodManager inputMethodManager = (InputMethodManager) Utils.getApp().getSystemService("input_method");
                if (KeyboardUtils.isSoftInputVisible(this.val$activity)) {
                    inputMethodManager.toggleSoftInput(1, 0);
                }
            }
        });
    }

    public static void createXml(AlertDialog alertDialog, EditText editText, File file, ab<String> abVar) {
        String emptyResCode;
        String string = editText.getText().toString();
        if (TextUtils.isEmpty(string.trim())) {
            editText.setError(Utils.isCN() ? "无效输入" : "invalid input");
            return;
        }
        if (!string.endsWith(TypedValue.XML_FILE)) {
            string = new StringBuffer().append(string).append(TypedValue.XML_FILE).toString();
        }
        File file2 = new File(file, string);
        if (file2.exists()) {
            editText.setError(Utils.isCN() ? "文件已存在" : "file already exist");
            return;
        }
        try {
            if (file2.createNewFile()) {
                file2.delete();
            }
            if (file.getName().startsWith("layout")) {
                emptyResCode = getBasicLayoutCode();
            } else if (file.getName().startsWith("menu")) {
                emptyResCode = getBasicMenuCode();
            } else if (file.getName().startsWith("values")) {
                emptyResCode = getEmptyResCode();
            } else {
                emptyResCode = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n";
            }
            Vl.j6(file2.getAbsolutePath(), emptyResCode);
            abVar.j6(file2.getAbsolutePath());
            alertDialog.dismiss();
        } catch (IOException e) {
            editText.setError(Utils.isCN() ? "无法写入" : "Unable to write");
        }
    }

    private static String getBasicLayoutCode() {
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<LinearLayout\n\txmlns:android=\"http://schemas.android.com/apk/res/android\"\n\tandroid:orientation=\"vertical\"\n\tandroid:layout_width=\"match_parent\"\n\tandroid:layout_height=\"match_parent\">\n    \n</LinearLayout>";
    }

    private static String getBasicMenuCode() {
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<menu xmlns:android=\"http://schemas.android.com/apk/res/android\">\n    \n    <item\n        android:id=\"@+id/item\"\n        android:title=\"Item\"/>\n    \n</menu>";
    }

    private static String getEmptyResCode() {
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<resources>\n    \n</resources>";
    }
}
