package io.fabric.sdk.android;

public class b implements io.fabric.sdk.android.m {
    private int j6;

    public b() {
        this.j6 = 4;
    }

    public b(int r1) {
        this.j6 = r1;
    }

    @Override
    public void DW(java.lang.String r2, java.lang.String r3) {
        FH(r2, r3, null);
    }

    @Override
    public void DW(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
        if (j6(r2, 5) == false) goto L6;
        android.util.Log.w(r2, r3, r4);
        return;
    }

    @Override
    public void FH(java.lang.String r2, java.lang.String r3) {
        v5(r2, r3, null);
    }

    @Override
    public void FH(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
        if (j6(r2, 6) == false) goto L6;
        android.util.Log.e(r2, r3, r4);
        return;
    }

    @Override
    public void Hw(java.lang.String r2, java.lang.String r3) {
        j6(r2, r3, null);
    }

    public void Hw(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
        if (j6(r2, 4) == false) goto L6;
        android.util.Log.i(r2, r3, r4);
        return;
    }

    @Override
    public void j6(int r2, java.lang.String r3, java.lang.String r4) {
        j6(r2, r3, r4, false);
    }

    @Override
    public void j6(int r1, java.lang.String r2, java.lang.String r3, boolean r4) {
        if (r4 == false) goto L4;
    L5:
        android.util.Log.println(r1, r2, r3);
        return;
    L4:
        if (j6(r2, r1) == true) goto L5;
    }

    @Override
    public void j6(java.lang.String r2, java.lang.String r3) {
        DW(r2, r3, null);
    }

    @Override
    public void j6(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
        if (j6(r2, 3) == false) goto L6;
        android.util.Log.d(r2, r3, r4);
        return;
    }

    @Override
    public boolean j6(java.lang.String r2, int r3) {
        if (this.j6 > r3) goto L5;
    L8:
        return true;
    L5:
        if (android.util.Log.isLoggable(r2, r3) == true) goto L8;
        return false;
    }

    @Override
    public void v5(java.lang.String r2, java.lang.String r3) {
        Hw(r2, r3, null);
    }

    public void v5(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
        if (j6(r2, 2) == false) goto L6;
        android.util.Log.v(r2, r3, r4);
        return;
    }
}
