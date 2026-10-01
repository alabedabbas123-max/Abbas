package com.almlkaide.kaypro.util;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import org.apache.commons.io.IOUtils;

public class JavaEscape {
    public static void showDialog(Activity activity, String str) {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(Utils.dp2px(24), 0, Utils.dp2px(24), 0);
        EditText editText = new EditText(activity);
        if (str != null) {
            editText.setText(str);
        }
        CheckBox checkBox = new CheckBox(activity);
        checkBox.setText("appendLine");
        linearLayout.addView(editText, -1, -2);
        linearLayout.addView(checkBox);
        ScrollView scrollView = new ScrollView(activity);
        scrollView.addView(linearLayout, -1, -1);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setTitle(Utils.isCN() ? "代码转义" : "Code escape").setView(scrollView).setPositiveButton(Utils.isCN() ? "转义" : "Escape", (DialogInterface.OnClickListener) null).setNegativeButton(Utils.isCN() ? "反转义" : "Invert Escape", (DialogInterface.OnClickListener) null).setNeutralButton(R.string.copy, (DialogInterface.OnClickListener) null).create();
        alertDialogCreate.show();
        alertDialogCreate.setOnKeyListener(new DialogInterface.OnKeyListener(alertDialogCreate) {
            private final AlertDialog val$dialog;

            {
                this.val$dialog = alertDialogCreate;
            }

            @Override
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i == 4 && keyEvent.getAction() == 0) {
                    this.val$dialog.dismiss();
                    return false;
                }
                return false;
            }
        });
        alertDialogCreate.getButton(-1).setOnClickListener(new View.OnClickListener(editText, checkBox) {
            private final CheckBox val$cb;
            private final EditText val$input;

            {
                this.val$input = editText;
                this.val$cb = checkBox;
            }

            @Override
            public void onClick(View view) {
                this.val$input.setText(JavaEscape.escapeText(this.val$input.getText().toString(), this.val$cb.isChecked()));
            }
        });
        alertDialogCreate.getButton(-2).setOnClickListener(new View.OnClickListener(editText, checkBox) {
            private final CheckBox val$cb;
            private final EditText val$input;

            {
                this.val$input = editText;
                this.val$cb = checkBox;
            }

            @Override
            public void onClick(View view) {
                this.val$input.setText(JavaEscape.invertEscapeText(this.val$input.getText().toString(), this.val$cb.isChecked()));
            }
        });
        alertDialogCreate.getButton(-3).setOnClickListener(new View.OnClickListener(editText) {
            private final EditText val$input;

            {
                this.val$input = editText;
            }

            @Override
            public void onClick(View view) {
                Utils.copyToClipboard(this.val$input.getText().toString());
            }
        });
    }

    public static String escapeText(String str, boolean z) {
        String strReplace = str.replace("\\", "\\\\").replace("\"", "\\\"").replace("'", "\\'");
        if (z) {
            return strReplace.replace(IOUtils.LINE_SEPARATOR_UNIX, "\"\n + \"\\n");
        }
        return strReplace.replace(IOUtils.LINE_SEPARATOR_UNIX, "\\n");
    }

    public static String invertEscapeText(String str, boolean z) {
        String strReplace;
        if (z) {
            strReplace = str.replace("\"\n + \"\\n", IOUtils.LINE_SEPARATOR_UNIX);
        } else {
            strReplace = str.replace("\\n", IOUtils.LINE_SEPARATOR_UNIX);
        }
        return strReplace.replace("\\\\", "\\").replace("\\\"", "\"").replace("\\'", "'");
    }
}
