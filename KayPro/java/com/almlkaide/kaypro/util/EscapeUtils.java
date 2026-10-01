package com.almlkaide.kaypro.util;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public abstract class EscapeUtils {

    public static final EscapeUtils f5093XML = new XMLEscape();

    public abstract String escapeText(String str);

    public abstract String unEscapeText(String str);

    public static void showDialog(Activity activity, String str, EscapeUtils escapeUtils) {
        try {
            if (escapeUtils.getClass().getSuperclass().getCanonicalName().equals(Class.forName("java.lang.Object").getCanonicalName())) {
                return;
            }
            escapeUtils.showDialog(activity, str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public void showDialog(Activity activity, String str) {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(Utils.dp2px(24), 0, Utils.dp2px(24), 0);
        EditText editText = new EditText(activity);
        if (str != null) {
            editText.setText(str);
        }
        linearLayout.addView(editText, -1, -2);
        ScrollView scrollView = new ScrollView(activity);
        scrollView.addView(linearLayout, -1, -1);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setTitle(Utils.isCN() ? "XML转义" : "XML escape").setView(scrollView).setPositiveButton(Utils.isCN() ? "转义" : "Escape", (DialogInterface.OnClickListener) null).setNegativeButton(Utils.isCN() ? "反转义" : "Invert escape", (DialogInterface.OnClickListener) null).setNeutralButton(R.string.copy, (DialogInterface.OnClickListener) null).create();
        alertDialogCreate.show();
        alertDialogCreate.setOnKeyListener(new DialogInterface.OnKeyListener(this, alertDialogCreate) {
            private final EscapeUtils this$0;
            private final AlertDialog val$dialog;

            {
                this.this$0 = this;
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
        alertDialogCreate.getButton(-1).setOnClickListener(new View.OnClickListener(this, editText) {
            private final EscapeUtils this$0;
            private final EditText val$input;

            {
                this.this$0 = this;
                this.val$input = editText;
            }

            @Override
            public void onClick(View view) {
                this.val$input.setText(this.this$0.escapeText(this.val$input.getText().toString()));
            }
        });
        alertDialogCreate.getButton(-2).setOnClickListener(new View.OnClickListener(this, editText) {
            private final EscapeUtils this$0;
            private final EditText val$input;

            {
                this.this$0 = this;
                this.val$input = editText;
            }

            @Override
            public void onClick(View view) {
                this.val$input.setText(this.this$0.unEscapeText(this.val$input.getText().toString()));
            }
        });
        alertDialogCreate.getButton(-3).setOnClickListener(new View.OnClickListener(this, editText) {
            private final EscapeUtils this$0;
            private final EditText val$input;

            {
                this.this$0 = this;
                this.val$input = editText;
            }

            @Override
            public void onClick(View view) {
                Utils.copyToClipboard(this.val$input.getText().toString());
            }
        });
    }
}
