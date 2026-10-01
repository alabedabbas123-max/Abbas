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
        abcd.AbstractjI.d r7 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r7 = v5(r6);
                    if (this.DW.j6(this.j6, new abcd.AbstractjI[]{r7}) == false) { $pc0 = 6; continue $sw0; }
                    this.Hw = r7.DW();
                    return true;
                }
                case 6: {
                    this.Hw = null;
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean Hw(java.lang.String r6) {
        abcd.AbstractjI.f r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new abcd.AbstractjI.f(r6);
                    if (this.DW.j6(this.j6, new abcd.AbstractjI[]{r0}) == true) { $pc1 = 5; continue $sw1; }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (r0.DW() == false) { $pc1 = 7; continue $sw1; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        abcd.AbstractjI.c r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new abcd.AbstractjI.c(r6);
                    if (this.DW.j6(this.j6, new abcd.AbstractjI[]{r0}) == false) { $pc2 = 6; continue $sw2; }
                    this.FH = new java.lang.String(r0.FH());
                    return true;
                }
                case 6: {
                    this.FH = null;
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String[] j6(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String[] r8, boolean[] r9) {
        abcd.AbstractjI.d[] r10 = null;
        int r11 = 0;
        int r0 = 0;
        java.util.ArrayList r12 = null;
        java.lang.String[] r1 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r10 = new abcd.AbstractjI.d[r8.length];
                    r11 = 0;
                    r0 = 0;
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r0 >= r8.length) { $pc3 = 5; continue $sw3; }
                    r10[r0] = new abcd.AbstractjI.d(r8[r0], !r9[r0]);
                    r0 = r0 + 1;
                    { $pc3 = 4; continue $sw3; }
                }
                case 5: {
                    r12 = new java.util.ArrayList();
                    if (r7 != null) { $pc3 = 8; continue $sw3; }
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    r12.addAll(java.util.Arrays.asList(r10));
                    if (this.DW.j6(this.j6, r12) == true) { $pc3 = 14; continue $sw3; }
                    return null;
                }
                case 14: {
                    r1 = new java.lang.String[r10.length];
                    $pc3 = 16; continue $sw3;
                }
                case 16: {
                    if (r11 >= r10.length) { $pc3 = 17; continue $sw3; }
                    r1[r11] = r10[r11].DW();
                    r11 = r11 + 1;
                    { $pc3 = 16; continue $sw3; }
                }
                case 17: {
                    return r1;
                }
                case 8: {
                    if (r7.length() <= 0) { $pc3 = 10; continue $sw3; }
                    r12.add(new abcd.AbstractjI.b(r7));
                    { $pc3 = 10; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
