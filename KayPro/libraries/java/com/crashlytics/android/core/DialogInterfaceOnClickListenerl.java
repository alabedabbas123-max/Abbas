package com.crashlytics.android.core;

class DialogInterfaceOnClickListenerl implements android.content.DialogInterface.OnClickListener {
    final com.crashlytics.android.core.ClassN.b j6;

    DialogInterfaceOnClickListenerl(com.crashlytics.android.core.ClassN.b r1) {
        this.j6 = r1;
    }

    @Override
    public void onClick(android.content.DialogInterface r2, int r3) {
        this.j6.j6(false);
        r2.dismiss();
    }
}
