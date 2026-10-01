package com.almlkaide.kaypro.aide.builder;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.almlkaide.kaypro.aide.util.ProjectUtils;
import com.almlkaide.kaypro.util.Utils;
import com.scott.dev.ShellServer;
import java.io.File;

public class RunCommandDialog extends MessageDialogFragment {
    private String[] mCmds;
    private GradleBuilder mGradleBuilder;
    private ShellServer shell;

    public void setCmds(String... strArr) {
        this.mCmds = strArr;
    }

    public ShellServer getShell() {
        return this.shell;
    }

    @Override
    public void onCreateDialogBuilder(Bundle bundle, AlertDialog.Builder builder) {
        super.onCreateDialogBuilder(bundle, builder);
        if (getDialogTitle() == null) {
            builder.setTitle("Shell");
        }
        builder.setPositiveButton(Utils.isCN() ? "输入命令" : "Input command", (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(Utils.isCN() ? "关闭" : "Close", (DialogInterface.OnClickListener) null);
        builder.setOnKeyListener(new DialogInterface.OnKeyListener(this) {
            private final RunCommandDialog this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i != 4 || keyEvent.getAction() != 0) {
                    return false;
                }
                this.this$0.dismiss();
                return true;
            }
        });
        setCancelable(false);
    }

    @Override
    public void onCreateDialog(Bundle bundle, AlertDialog alertDialog) {
        super.onCreateDialog(bundle, alertDialog);
    }

    @Override
    public void onShow(DialogInterface dialogInterface) {
        super.onShow(dialogInterface);
        this.mGradleBuilder = new GradleBuilder(this.mDialog.getContext());
        this.shell = this.mGradleBuilder.newShell();
        this.shell.addCallback(this);
        File currentProject = ProjectUtils.getCurrentProject();
        if (currentProject != null) {
            this.shell.append(new StringBuffer().append("export AIDE_CUR_PROJECT=").append(currentProject.getAbsolutePath()).toString(), false);
            exec("cd ".concat(currentProject.getAbsolutePath()));
        }
        if (this.mCmds != null) {
            for (String str : this.mCmds) {
                exec(str);
            }
        }
        Button button = this.mDialog.getButton(-1);
        button.setOnClickListener(new View.OnClickListener(this, button) {
            private final RunCommandDialog this$0;
            private final Button val$positive;

            {
                this.this$0 = this;
                this.val$positive = button;
            }

            @Override
            public void onClick(View view) {
                this.this$0.positiveButtonClick(this.val$positive);
            }
        });
    }

    @Override
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.shell != null) {
            this.shell.exit();
        }
    }

    public void positiveButtonClick(Button button) {
        showRunGradleCommandDialog(button.getText());
    }

    public void exec(String... strArr) {
        for (String str : strArr) {
            exec(str);
        }
    }

    public void exec(String str) {
        if ("clear".equals(str)) {
            setText("");
        }
        this.shell.append(str);
    }

    void showRunGradleCommandDialog(CharSequence charSequence) {
        ScrollView scrollView = new ScrollView(this.mActivity);
        scrollView.setPadding(SizeUtils.dp2px(24), SizeUtils.dp2px(10), SizeUtils.dp2px(24), 0);
        EditText editText = new EditText(this.mActivity);
        editText.setHint(Utils.isCN() ? "输入命令行" : "Enter the command");
        scrollView.addView(editText, -1, -2);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this.mActivity).setTitle(charSequence).setView(scrollView).setPositiveButton(Utils.isCN() ? "运行" : "Run", new DialogInterface.OnClickListener(this, editText) {
            private final RunCommandDialog this$0;
            private final EditText val$input;

            {
                this.this$0 = this;
                this.val$input = editText;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                this.this$0.exec(this.val$input.getText().toString());
                KeyboardUtils.hideSoftInput(((AlertDialog) dialogInterface).getWindow());
            }
        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener(this, editText) {
            private final RunCommandDialog this$0;
            private final EditText val$input;

            {
                this.this$0 = this;
                this.val$input = editText;
            }

            @Override
            public void onShow(DialogInterface dialogInterface) {
                this.val$input.post(new Runnable(this, this.val$input) {
                    private final AnonymousClass100000004 this$0;
                    private final EditText val$input;

                    {
                        this.this$0 = this;
                        this.val$input = editText;
                    }

                    @Override
                    public void run() {
                        KeyboardUtils.showSoftInput(this.val$input);
                    }
                });
            }
        });
        alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener(this) {
            private final RunCommandDialog this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onDismiss(DialogInterface dialogInterface) {
                this.this$0.mDialog.show();
            }
        });
        this.mDialog.hide();
        alertDialogCreate.show();
    }
}
