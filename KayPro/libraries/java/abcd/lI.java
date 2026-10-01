package abcd;

public class lI implements com.jcraft.jsch.UserInfo, com.jcraft.jsch.UIKeyboardInteractive {
    private final abcd.AbstractkI DW;
    private java.lang.String FH;
    private java.lang.String Hw;
    private final abcd.HJ j6;

    public lI(com.jcraft.jsch.Session r1, abcd.AbstractkI r2) {
        this.j6 = j6(r1);
        this.DW = r2;
    }

    private static abcd.HJ j6(com.jcraft.jsch.Session r2) {
        return new abcd.HJ().Hw("ssh").v5(r2.u7()).j6(r2.DW()).j6(r2.v5());
    }

    private abcd.AbstractjI.d v5(java.lang.String r3) {
        return new abcd.AbstractjI.d(r3, true);
    }

    @Override
    public void DW(java.lang.String r5) {
        this.DW.j6(this.j6, new abcd.AbstractjI[]{new abcd.AbstractjI.b(r5)});
    }

    @Override
    public boolean FH(java.lang.String r6) {
        abcd.AbstractjI.d r7 = v5(r6);
        if (this.DW.j6(this.j6, new abcd.AbstractjI[]{r7}) == false) goto L6;
        this.Hw = r7.DW();
        return true;
    L6:
        this.Hw = null;
        return false;
    }

    @Override
    public boolean Hw(java.lang.String r6) {
        abcd.AbstractjI.f r0 = new abcd.AbstractjI.f(r6);
        if (this.DW.j6(this.j6, new abcd.AbstractjI[]{r0}) == true) goto L5;
    L7:
        return false;
    L5:
        if (r0.DW() == false) goto L7;
        return true;
    }

    @Override
    public java.lang.String getPassword() {
        return this.FH;
    }

    @Override
    public java.lang.String j6() {
        return this.Hw;
    }

    @Override
    public boolean j6(java.lang.String r6) {
        abcd.AbstractjI.c r0 = new abcd.AbstractjI.c(r6);
        if (this.DW.j6(this.j6, new abcd.AbstractjI[]{r0}) == false) goto L6;
        this.FH = new java.lang.String(r0.FH());
        return true;
    L6:
        this.FH = null;
        return false;
    }

    @Override
    public java.lang.String[] j6(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String[] r8, boolean[] r9) {
        abcd.AbstractjI.d[] r10 = new abcd.AbstractjI.d[r8.length];
        int r11 = 0;
        int r0 = 0;
    L4:
        if (r0 >= r8.length) goto L5;
        r10[r0] = new abcd.AbstractjI.d(r8[r0], !r9[r0]);
        r0 = r0 + 1;
        goto L4
    L5:
        java.util.ArrayList r12 = new java.util.ArrayList();
        if (r7 != null) goto L8;
    L10:
        r12.addAll(java.util.Arrays.asList(r10));
        if (this.DW.j6(this.j6, r12) == true) goto L14;
        return null;
    L14:
        java.lang.String[] r1 = new java.lang.String[r10.length];
    L16:
        if (r11 >= r10.length) goto L17;
        r1[r11] = r10[r11].DW();
        r11 = r11 + 1;
        goto L16
    L17:
        return r1;
    L8:
        if (r7.length() <= 0) goto L10;
        r12.add(new abcd.AbstractjI.b(r7));
        goto L10
    }
}
