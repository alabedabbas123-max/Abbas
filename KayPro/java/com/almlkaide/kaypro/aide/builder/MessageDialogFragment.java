package com.almlkaide.kaypro.aide.builder;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.androlua.LuaEditor;
import com.blankj.utilcode.util.SizeUtils;
import com.scott.dev.ShellServer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.IOUtils;

public class MessageDialogFragment extends DialogFragment implements DialogInterface.OnShowListener, ShellServer.Callback {
    public static final String FRAGMENT_TAG = "MessageDialogFragment";
    protected boolean isShowing;
    protected Activity mActivity;
    protected AlertDialog mDialog;
    protected LuaEditor mEditor;
    protected List<DialogListener> mDialogListener = new ArrayList();
    private final SpannableStringBuilder tempMsg = new SpannableStringBuilder();

    public interface DialogListener {
        void onDismiss(MessageDialogFragment messageDialogFragment, AlertDialog alertDialog);

        void onShow(MessageDialogFragment messageDialogFragment, AlertDialog alertDialog);
    }

    public void onCreateDialog(Bundle bundle, AlertDialog alertDialog) {
    }

    public void onCreateDialogBuilder(Bundle bundle, AlertDialog.Builder builder) {
    }

    public boolean isShowing() {
        return this.isShowing;
    }

    public MessageDialogFragment addDialogListener(DialogListener dialogListener) {
        if (dialogListener != null) {
            this.mDialogListener.add(dialogListener);
        }
        return this;
    }

    public MessageDialogFragment removeDialogListener(DialogListener dialogListener) {
        if (dialogListener != null) {
            this.mDialogListener.remove(dialogListener);
        }
        return this;
    }

    public void setDialogTitle(CharSequence charSequence) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            setArguments(arguments);
        }
        arguments.putCharSequence("dialogTitle", charSequence);
    }

    public CharSequence getDialogTitle() {
        Bundle arguments = getArguments();
        return arguments == null ? (CharSequence) null : arguments.getCharSequence("dialogTitle");
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mActivity = getActivity();
    }

    public LuaEditor createLuaEditor() {
        LuaEditor luaEditor = new LuaEditor(this.mActivity);
        luaEditor.setWordWrap(false);
        luaEditor.scrollTo(0, 0);
        luaEditor.scrollBy(0, 0);
        luaEditor.setTextSize(SizeUtils.dp2px(15));
        luaEditor.setPadding(0, SizeUtils.dp2px(8), 0, 0);
        return luaEditor;
    }

    @Override
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.mActivity);
        builder.setTitle(getDialogTitle());
        this.mEditor = createLuaEditor();
        builder.setView(this.mEditor);
        onCreateDialogBuilder(bundle, builder);
        this.mDialog = builder.create();
        this.mDialog.setOnShowListener(new DialogInterface.OnShowListener(this) {
            private final MessageDialogFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onShow(DialogInterface dialogInterface) {
                this.this$0.isShowing = true;
                this.this$0.onShow(dialogInterface);
            }
        });
        onCreateDialog(bundle, this.mDialog);
        return this.mDialog;
    }

    @Override
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.isShowing = false;
        Iterator<DialogListener> it = this.mDialogListener.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(this, this.mDialog);
        }
    }

    public void output(CharSequence charSequence) {
        if (this.mEditor != null) {
            this.mEditor.post(new Runnable(this, charSequence) {
                private final MessageDialogFragment this$0;
                private final CharSequence val$output;

                {
                    this.this$0 = this;
                    this.val$output = charSequence;
                }

                @Override
                public void run() {
                    this.this$0.append(this.val$output);
                }
            });
        }
    }

    @Override
    public void onShow(DialogInterface dialogInterface) {
        Iterator<DialogListener> it = this.mDialogListener.iterator();
        while (it.hasNext()) {
            it.next().onShow(this, this.mDialog);
        }
    }

    public CharSequence getText() {
        return this.mEditor == null ? this.tempMsg : this.mEditor.getText();
    }

    public void setText(CharSequence charSequence) {
        if (charSequence != null) {
            if (this.mEditor != null) {
                this.mEditor.setText(charSequence);
            }
            fullScrollToBottom();
        }
    }

    public void append(CharSequence charSequence) {
        if (charSequence != null) {
            if (!isShowing()) {
                this.tempMsg.append(charSequence);
                return;
            }
            int length = this.mEditor.getText().length();
            if (length >= 1) {
                length--;
            }
            if (this.mEditor != null) {
                this.mEditor.insert(length, charSequence.toString());
            }
            fullScrollToBottom();
        }
    }

    public void append(CharSequence charSequence, int i) {
        if (charSequence != null) {
            if (i != 0) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                spannableStringValueOf.setSpan(new ForegroundColorSpan(i), 0, spannableStringValueOf.length(), 33);
                append(spannableStringValueOf);
                return;
            }
            append(charSequence);
        }
    }

    public void appendError(CharSequence charSequence) {
        append(charSequence, -65536);
    }

    public void appendWarning(CharSequence charSequence) {
        append(charSequence, -16776961);
    }

    public void appendComment(CharSequence charSequence) {
        append(charSequence, -13070788);
    }

    public void appendLine() {
        append(IOUtils.LINE_SEPARATOR_UNIX);
    }

    public void appendLine(CharSequence charSequence) {
        append(charSequence);
        appendLine();
    }

    public void fullScrollToBottom() {
        if (this.mEditor != null) {
            this.mEditor.post(new Runnable(this) {
                private final MessageDialogFragment this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public void run() {
                    int rowCount = this.this$0.mEditor.getText().getRowCount();
                    if (rowCount >= 1) {
                        rowCount--;
                    }
                    this.this$0.mEditor.gotoLine(rowCount);
                }
            });
        }
    }
}
