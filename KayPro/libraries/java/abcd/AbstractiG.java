package abcd;

public abstract class AbstractiG extends abcd.AE.a {
    int EQ;

    AbstractiG(abcd.YD r1) {
        super(r1);
    }

    public final boolean DW(abcd.fG r2) {
        int r0 = this.EQ;
        if ((r2.Hw & r0) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public abstract int aM();

    public final abcd.yE getId() {
        return this;
    }

    public final void j6(abcd.fG r2) {
        int r0 = this.EQ;
        this.EQ = r2.Hw | r0;
    }

    abstract void j6(abcd.qG r1);

    protected void j6(java.lang.StringBuilder r3) {
        char r1 = '-';
        if ((this.EQ & 32) == 0) goto L5;
        char r0 = 'o';
    L6:
        r3.append(r0);
        if ((this.EQ & 16) == 0) goto L9;
        char r2 = 't';
    L10:
        r3.append(r2);
        if ((this.EQ & 8) == 0) goto L13;
        char r4 = 'r';
    L14:
        r3.append(r4);
        if ((this.EQ & 4) == 0) goto L17;
        char r5 = 'u';
    L18:
        r3.append(r5);
        if ((this.EQ & 2) == 0) goto L21;
        char r6 = 's';
    L22:
        r3.append(r6);
        if ((this.EQ & 1) == 0) goto L25;
        r1 = 'p';
    L25:
        r3.append(r1);
        return;
    L21:
        r6 = '-';
        goto L22
    L17:
        r5 = '-';
        goto L18
    L13:
        r4 = '-';
        goto L14
    L9:
        r2 = '-';
        goto L10
    L5:
        r0 = '-';
        goto L6
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append(abcd.hE.DW(aM()));
        r0.append(' ');
        r0.append(we());
        r0.append(' ');
        j6(r0);
        return r0.toString();
    }
}
