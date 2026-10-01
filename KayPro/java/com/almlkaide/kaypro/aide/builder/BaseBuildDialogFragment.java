package com.almlkaide.kaypro.aide.builder;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Window;
import com.almlkaide.kaypro.aide.builder.data.BuildInfo;
import com.almlkaide.kaypro.util.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class BaseBuildDialogFragment extends MessageDialogFragment implements OnBuildListener {
    protected BuildInfo buildInfo;
    private List<OnBuildListener> mOnBuildListener = Collections.synchronizedList(new ArrayList());

    @Override
    public void onBuildCancel() {
    }

    @Override
    public void onBuildFailed() {
    }

    @Override
    public void onBuildSuccessful() {
    }

    public BuildInfo getBuildInfo() {
        return this.buildInfo;
    }

    public void addOnBuildListener(OnBuildListener onBuildListener) {
        this.mOnBuildListener.add(onBuildListener);
    }

    public void removeOnBuildListener(OnBuildListener onBuildListener) {
        this.mOnBuildListener.remove(onBuildListener);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.buildInfo = (BuildInfo) getArguments().getParcelable("buildInfo");
        setLockScreen(true);
    }

    @Override
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        setLockScreen(false);
    }

    @Override
    public void onCreateDialogBuilder(Bundle bundle, AlertDialog.Builder builder) {
        super.onCreateDialogBuilder(bundle, builder);
        setCancelable(false);
        builder.setTitle(String.format(Utils.isCN() ? "构建应用中..." : "Building...", new Object[0]));
        builder.setPositiveButton(R.string.cancel, new DialogInterface.OnClickListener(this) {
            private final BaseBuildDialogFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Iterator it = this.this$0.mOnBuildListener.iterator();
                while (it.hasNext()) {
                    ((OnBuildListener) it.next()).onBuildCancel();
                }
                this.this$0.onBuildCancel();
            }
        });
    }

    @Override
    public void output(CharSequence charSequence) {
        String string = charSequence.toString();
        if (this.mEditor != null) {
            this.mEditor.post(new Runnable(this, charSequence, string) {
                private final BaseBuildDialogFragment this$0;
                private final CharSequence val$output;
                private final String val$outputs;

                {
                    this.this$0 = this;
                    this.val$output = charSequence;
                    this.val$outputs = string;
                }

                @Override
                public void run() {
                    this.this$0.append(this.val$output);
                    if (this.val$outputs.contains("BUILD SUCCESSFUL")) {
                        Iterator it = this.this$0.mOnBuildListener.iterator();
                        while (it.hasNext()) {
                            ((OnBuildListener) it.next()).onBuildSuccessful();
                        }
                        this.this$0.onBuildSuccessful();
                        return;
                    }
                    if (this.val$outputs.contains("BUILD FAILED")) {
                        Iterator it2 = this.this$0.mOnBuildListener.iterator();
                        while (it2.hasNext()) {
                            ((OnBuildListener) it2.next()).onBuildFailed();
                        }
                        this.this$0.onBuildFailed();
                    }
                }
            });
        }
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    protected void setLockScreen(boolean z) {
        Window window = this.mActivity.getWindow();
        if (z) {
            window.addFlags(128);
        } else {
            window.clearFlags(128);
        }
    }
}
