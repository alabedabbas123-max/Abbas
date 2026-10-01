package com.almlkaide.kaypro.aide.builder;

import android.app.AlertDialog;
import android.os.Bundle;
import com.almlkaide.kaypro.util.Utils;

public class UnInstallDialogFragment extends MessageDialogFragment {
    private OnUnInstallListener mOnUnInstallListener;

    public interface OnUnInstallListener {
        void onUnInstallFinish(UnInstallDialogFragment unInstallDialogFragment);
    }

    @Override
    public void onCreateDialogBuilder(Bundle bundle, AlertDialog.Builder builder) {
        super.onCreateDialogBuilder(bundle, builder);
        builder.setTitle(Utils.isCN() ? "卸载后端" : "Uninstall");
        setCancelable(false);
    }

    public void setOnUnInstallListener(OnUnInstallListener onUnInstallListener) {
        this.mOnUnInstallListener = onUnInstallListener;
    }

    @Override
    public void output(CharSequence charSequence) {
        if (this.mEditor != null) {
            this.mEditor.post(new Runnable(this, charSequence) {
                private final UnInstallDialogFragment this$0;
                private final CharSequence val$output;

                {
                    this.this$0 = this;
                    this.val$output = charSequence;
                }

                @Override
                public void run() {
                    if (this.val$output.equals("___EXIT___\n")) {
                        if (this.this$0.mOnUnInstallListener != null) {
                            this.this$0.mOnUnInstallListener.onUnInstallFinish(this.this$0);
                            return;
                        }
                        return;
                    }
                    this.this$0.setText(this.val$output);
                }
            });
        }
    }
}
