package com.almlkaide.kaypro.aide.builder;

import android.app.AlertDialog;
import android.os.Bundle;
import com.almlkaide.kaypro.util.Utils;

public class InstallDialogFragment extends MessageDialogFragment {
    private OnInstallListener mOnInstallListener;

    public interface OnInstallListener {
        void onInstallFinish(InstallDialogFragment installDialogFragment);
    }

    @Override
    public void onCreateDialogBuilder(Bundle bundle, AlertDialog.Builder builder) {
        super.onCreateDialogBuilder(bundle, builder);
        builder.setTitle(Utils.isCN() ? "安装后端" : "Install");
    }

    public void setOnInstallListener(OnInstallListener onInstallListener) {
        this.mOnInstallListener = onInstallListener;
    }

    @Override
    public void output(CharSequence charSequence) {
        if (this.mEditor != null) {
            this.mEditor.post(new Runnable(this, charSequence) {
                private final InstallDialogFragment this$0;
                private final CharSequence val$output;

                {
                    this.this$0 = this;
                    this.val$output = charSequence;
                }

                @Override
                public void run() {
                    if (this.val$output.equals("___EXIT___\n")) {
                        if (this.this$0.mOnInstallListener != null) {
                            this.this$0.mOnInstallListener.onInstallFinish(this.this$0);
                            return;
                        }
                        return;
                    }
                    this.this$0.append(this.val$output);
                }
            });
        }
    }
}
