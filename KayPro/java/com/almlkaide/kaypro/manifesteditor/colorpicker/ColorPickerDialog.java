package com.almlkaide.kaypro.manifesteditor.colorpicker;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import androidx.core.provider.FontsContractCompat;
import com.almlkaide.kaypro.manifesteditor.colorpicker.widgets.ClassB;
import com.aide.common.ma;

public class ColorPickerDialog extends ma implements DialogInterface.OnClickListener {

    private final String f3577a;

    private final int f3578b;

    private final InterfaceC1346a f3579c;

    private final boolean f3580d;

    private ClassB f3581e;

    public interface InterfaceC1346a {
        void m5743a(int i, String str);
    }

    public ColorPickerDialog(String str, int i, InterfaceC1346a interfaceC1346a) {
        this.f3577a = str;
        this.f3578b = i;
        this.f3579c = interfaceC1346a;
        this.f3580d = false;
    }

    public ColorPickerDialog(String str, String str2, InterfaceC1346a interfaceC1346a) {
        this.f3577a = str;
        if (str2 == null || str2.equals("")) {
            this.f3578b = -16777216;
        } else {
            this.f3578b = Color.parseColor(str2);
        }
        this.f3579c = interfaceC1346a;
        this.f3580d = true;
    }

    protected Dialog m5742j6(Activity activity) {
        this.f3581e = new ClassB(activity);
        this.f3581e.setColor(this.f3578b);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(this.f3581e).setTitle(this.f3577a).setCancelable(false).setPositiveButton("Ok", this).setNegativeButton("Cancel", this);
        if (this.f3580d) {
            builder.setNeutralButton("None", this);
        }
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.getWindow().setSoftInputMode(2);
        return alertDialogCreate;
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case FontsContractCompat.FontRequestCallback.FAIL_REASON_FONT_LOAD_ERROR:
                this.f3579c.m5743a(0, null);
                break;
            case -1:
                int color = this.f3581e.getColor();
                this.f3579c.m5743a(color, String.format("#%08X", Integer.valueOf(color)));
                break;
        }
        dialogInterface.cancel();
    }
}
