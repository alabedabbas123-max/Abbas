package abcd;

public class rF {
    public rF() {
    }

    public void j6(java.io.OutputStream r11, uF<abcd.tC> r12, java.util.List<java.lang.String> r13, java.lang.String r14) {
        if (r12.FH().size() != 3) goto L5;
        boolean r0 = true;
    L6:
        java.util.Iterator<abcd.qF> r1 = r12.iterator();
        java.lang.String r3 = null;
    L8:
        if (r1.hasNext() == false) goto L9;
        abcd.qF r4 = r1.next();
        abcd.tC r7 = (abcd.tC) r12.FH().get(r4.Hw());
        if (r3 == null) goto L18;
        if (r4.DW() == abcd.qF.a.FH) goto L18;
        r11.write((">>>>>>> " + r3 + "\n").getBytes(r14));
        r3 = null;
    L18:
        if (r4.DW() != abcd.qF.a.DW) goto L21;
        r11.write(("<<<<<<< " + r13.get(r4.Hw()) + "\n").getBytes(r14));
        r3 = r13.get(r4.Hw());
    L27:
        int r5 = r4.j6();
    L29:
        if (r5 >= r4.FH()) goto L8;
        r7.j6(r11, r5);
        r11.write(10);
        r5 = r5 + 1;
        goto L29
    L21:
        if (r4.DW() != abcd.qF.a.FH) goto L27;
        r3 = r13.get(r4.Hw());
        if (r0 == false) goto L25;
        java.lang.String r6 = "=======\n";
    L26:
        r11.write(r6.getBytes(r14));
        goto L27
    L25:
        r6 = "======= " + r3 + "\n";
        goto L26
    L9:
        if (r3 == null) goto L34;
        r11.write((">>>>>>> " + r3 + "\n").getBytes(r14));
        return;
    L34:
        return;
    L5:
        r0 = false;
        goto L6
    }
}
