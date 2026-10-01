package com.almlkaide.kaypro.assetsmanager.project;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.aide.common.ab;

public class SelectTamplateDialog {
    private ab<String> mAbVar;
    private Activity mActivity;
    private String mCreateDir;

    public SelectTamplateDialog(Activity activity, String str, ab<String> abVar) {
        this.mActivity = activity;
        this.mCreateDir = str;
        this.mAbVar = abVar;
    }

    public void showDialog() {
        new AlertDialog.Builder(this.mActivity).setTitle("Activity Tamplate").setSingleChoiceItems(new CharSequence[]{"Basic Activity", "NavigationView Activity", "BottomNavigation Activity", "Fullscreen Activity"}, 0, new DialogInterface.OnClickListener(this) {
            private final SelectTamplateDialog this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    new AddCustomActivityTemplateDialog(this.this$0.mActivity, this.this$0.mCreateDir, this.this$0.mAbVar, "basic").showDialog();
                    dialogInterface.dismiss();
                } else if (i == 1) {
                    dialogInterface.dismiss();
                } else if (i == 2) {
                    dialogInterface.dismiss();
                } else if (i == 3) {
                    dialogInterface.dismiss();
                }
            }
        }).create().show();
    }
}
