package com.almlkaide.kaypro.manifesteditor.ndk;

import android.app.Activity;
import android.content.DialogInterface;
import android.widget.EditText;

class DialogInterfaceOnClickListenera implements DialogInterface.OnClickListener {

    private final Activity f3717a;

    private final EditText f3718b;

    DialogInterfaceOnClickListenera(Activity activity, EditText editText) {
        this.f3717a = activity;
        this.f3718b = editText;
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        InstallNdk.m5809b(this.f3717a, this.f3718b.getText().toString());
    }
}
