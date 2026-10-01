package com.almlkaide.kaypro.assetsmanager.project;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.aide.common.ab;
import com.almlkaide.kaypro.aide.util.CreateClassDialog;

public class SelectOptionDialog {
    private ab<String> mAbVar;
    private Activity mActivity;
    private String mCreateDir;

    public SelectOptionDialog(Activity activity, String str, ab<String> abVar) {
        this.mActivity = activity;
        this.mCreateDir = str;
        this.mAbVar = abVar;
    }

    public void showDialog() {
        new AlertDialog.Builder(this.mActivity).setTitle("Action").setSingleChoiceItems(new CharSequence[]{"New class", "New activity"}, -1, new DialogInterface.OnClickListener(this) {
            private final SelectOptionDialog this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    new CreateClassDialog(this.this$0.mActivity, this.this$0.mCreateDir, this.this$0.mAbVar).showDialog();
                    dialogInterface.dismiss();
                } else if (i == 1) {
                    new SelectTamplateDialog(this.this$0.mActivity, this.this$0.mCreateDir, this.this$0.mAbVar).showDialog();
                    dialogInterface.dismiss();
                }
            }
        }).create().show();
    }
}
