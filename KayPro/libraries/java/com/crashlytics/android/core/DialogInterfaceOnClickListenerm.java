package com.crashlytics.android.core;

class DialogInterfaceOnClickListenerm implements android.content.DialogInterface.OnClickListener {
    final com.crashlytics.android.core.ClassN.b DW;
    final com.crashlytics.android.core.ClassN.a j6;

    DialogInterfaceOnClickListenerm(com.crashlytics.android.core.ClassN.a r1, com.crashlytics.android.core.ClassN.b r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    @Override
    public void onClick(android.content.DialogInterface r2, int r3) {
        this.j6.j6(true);
        this.DW.j6(true);
        r2.dismiss();
    }
}
