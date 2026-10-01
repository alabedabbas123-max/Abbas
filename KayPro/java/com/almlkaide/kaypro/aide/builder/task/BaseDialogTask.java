package com.almlkaide.kaypro.aide.builder.task;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.ScrollView;
import android.widget.TextView;
import com.almlkaide.kaypro.aide.project.jsonbean.Project;

public abstract class BaseDialogTask<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    protected final Context mContext;
    protected AlertDialog mDialog;
    protected TextView mMessageText;
    protected ScrollView mScrollView;

    @Override
    protected abstract Result doInBackground(Params[] paramsArr);

    protected void onBuildDialog(AlertDialog.Builder builder) {
    }

    public BaseDialogTask(Context context) {
        this.mContext = context;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        AlertDialog.Builder builder = new AlertDialog.Builder(this.mContext);
        builder.setMessage(" ");
        onBuildDialog(builder);
        this.mDialog = builder.create();
        this.mDialog.show();
        this.mMessageText = (TextView) this.mDialog.findViewById(R.id.message);
        this.mScrollView = (ScrollView) this.mDialog.findViewById(this.mContext.getResources().getIdentifier("scrollView", "id", Project.ANDROID));
    }

    public BaseDialogTask apend(CharSequence charSequence) {
        if (this.mMessageText != null) {
            this.mMessageText.post(new Runnable(this, charSequence) {
                private final BaseDialogTask this$0;
                private final CharSequence val$s;

                {
                    this.this$0 = this;
                    this.val$s = charSequence;
                }

                @Override
                public void run() {
                    this.this$0.mMessageText.append(this.val$s);
                    this.this$0.fullScrollToBottom();
                }
            });
        }
        return this;
    }

    public BaseDialogTask setText(CharSequence charSequence) {
        if (this.mMessageText != null) {
            this.mMessageText.post(new Runnable(this, charSequence) {
                private final BaseDialogTask this$0;
                private final CharSequence val$s;

                {
                    this.this$0 = this;
                    this.val$s = charSequence;
                }

                @Override
                public void run() {
                    this.this$0.mMessageText.setText(this.val$s);
                }
            });
        }
        return this;
    }

    public void fullScrollToBottom() {
        if (this.mScrollView != null) {
            this.mScrollView.post(new Runnable(this) {
                private final BaseDialogTask this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public void run() {
                    this.this$0.mScrollView.fullScroll(130);
                }
            });
        }
    }
}
