package abcd;

public class ClassP extends java.io.Writer {
    private java.lang.StringBuilder DW;
    private final java.lang.String j6;

    public ClassP(java.lang.String r3) {
        this.DW = new java.lang.StringBuilder(128);
        this.j6 = r3;
    }

    private void j6() {
        if (this.DW.length() <= 0) goto L6;
        android.util.Log.d(this.j6, this.DW.toString());
        java.lang.StringBuilder r0 = this.DW;
        r0.delete(0, r0.length());
        return;
    }

    @Override
    public void close() {
        j6();
    }

    @Override
    public void flush() {
        j6();
    }

    @Override
    public void write(char[] r4, int r5, int r6) {
        int r0 = 0;
    L3:
        if (r0 >= r6) goto L9;
        char r1 = r4[r5 + r0];
        if (r1 != '\n') goto L7;
        j6();
    L8:
        r0 = r0 + 1;
        goto L3
    L7:
        this.DW.append(r1);
        goto L8
    }
}
