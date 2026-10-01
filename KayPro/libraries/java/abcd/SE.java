package abcd;

public abstract class SE {
    private final java.util.Collection<abcd.ME> j6;

    public SE(KK<abcd.ME> r1) {
        this.j6 = r1.j6();
    }

    public SE(java.util.Collection<abcd.ME> r1) {
        this.j6 = abcd.NE.j6(r1);
    }

    public void DW() {
        java.util.Iterator<abcd.ME> r0 = this.j6.iterator();
    L4:
        if (r0.hasNext() == false) goto L5;
        abcd.ME r1 = r0.next();
        if (r1.j6().Zo() == false) goto L4;
        if (r1.Hw() == false) goto L4;
        boolean r2 = true;
    L11:
        java.io.StringWriter r3 = new java.io.StringWriter();
        if (r2 == false) goto L17;
        r3.write("# pack-refs with:");
        if (r2 == false) goto L16;
        r3.write(" peeled");
    L16:
        r3.write(10);
    L17:
        char[] r4 = new char[40];
        java.util.Iterator<abcd.ME> r5 = this.j6.iterator();
    L19:
        if (r5.hasNext() == false) goto L20;
        abcd.ME r6 = r5.next();
        if (r6.j6() != abcd.ME.a.FH) goto L19;
        r6.DW().j6(r4, r3);
        r3.write(32);
        r3.write(r6.getName());
        r3.write(10);
        if (r6.FH() == null) goto L19;
        r3.write(94);
        r6.FH().j6(r4, r3);
        r3.write(10);
        goto L19
    L20:
        j6("packed-refs", abcd.hE.j6(r3.toString()));
        return;
    L5:
        r2 = false;
        goto L11
    }

    public void j6() {
        java.io.StringWriter r0 = new java.io.StringWriter();
        char[] r1 = new char[40];
        java.util.Iterator<abcd.ME> r2 = this.j6.iterator();
    L4:
        if (r2.hasNext() == false) goto L5;
        abcd.ME r3 = r2.next();
        if ("HEAD".equals(r3.getName()) == true) goto L4;
        r3.DW().j6(r1, r0);
        r0.write(9);
        r0.write(r3.getName());
        r0.write(10);
        if (r3.FH() == null) goto L4;
        r3.FH().j6(r1, r0);
        r0.write(9);
        r0.write(r3.getName());
        r0.write("^{}\n");
        goto L4
    L5:
        j6("info/refs", abcd.hE.j6(r0.toString()));
    }

    protected abstract void j6(java.lang.String r1, byte[] r2);
}
