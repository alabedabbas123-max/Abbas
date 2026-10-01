package abcd;

public abstract class FL extends abcd.EL {
    protected java.util.Vector j6;

    protected FL() {
        this.j6 = new java.util.Vector();
    }

    protected FL(abcd.InterfaceqL r2) {
        this.j6 = new java.util.Vector();
        this.j6.addElement(r2);
    }

    protected FL(abcd.rL r4) {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.j6 = new java.util.Vector();
                    r0 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0 == r4.j6()) { $pc0 = 5; continue $sw0; }
                    this.j6.addElement(r4.j6(r0));
                    r0 = r0 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected FL(abcd.InterfaceqL[] r4) {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.j6 = new java.util.Vector();
                    r0 = 0;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r0 == r4.length) { $pc1 = 5; continue $sw1; }
                    this.j6.addElement(r4[r0]);
                    r0 = r0 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.FL j6(abcd.LL r2, boolean r3) {
        abcd.EL r4 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r3 == false) { $pc2 = 10; continue $sw2; }
                    if (r2.we() == false) { $pc2 = 8; continue $sw2; }
                    r4 = r2.u7();
                    r4.DW();
                    return j6(r4);
                }
                case 8: {
                    throw new java.lang.IllegalArgumentException("object implicit - explicit expected.");
                }
                case 10: {
                    if (r2.we() == false) { $pc2 = 18; continue $sw2; }
                    if ((r2 instanceof abcd.YL) == false) { $pc2 = 16; continue $sw2; }
                    return new abcd.UL(r2.u7());
                }
                case 16: {
                    return new abcd.EM(r2.u7());
                }
                case 18: {
                    if ((r2.u7() instanceof abcd.FL) == false) { $pc2 = 22; continue $sw2; }
                    return (abcd.FL) r2.u7();
                }
                case 22: {
                    throw new java.lang.IllegalArgumentException("unknown object in getInstance: " + r2.getClass().getName());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.FL j6(java.lang.Object r3) {
        abcd.EL r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r3 == null) { $pc3 = 26; continue $sw3; }
                    if ((r3 instanceof abcd.FL) == true) { $pc3 = 26; continue $sw3; }
                    if ((r3 instanceof abcd.GL) == false) { $pc3 = 11; continue $sw3; }
                    return j6(((abcd.GL) r3).DW());
                }
                case 11: {
                    if ((r3 instanceof byte[]) == false) { $pc3 = 18; continue $sw3; }
                    return j6(abcd.EL.j6((byte[]) r3));
                }
                case 14: {
                    e = $ex3;
                    throw new java.lang.IllegalArgumentException("failed to construct sequence from byte[]: " + e.getMessage());
                }
                case 18: {
                    if ((r3 instanceof abcd.InterfaceqL) == false) { $pc3 = 24; continue $sw3; }
                    r0 = ((abcd.InterfaceqL) r3).DW();
                    if ((r0 instanceof abcd.FL) == false) { $pc3 = 24; continue $sw3; }
                    return (abcd.FL) r0;
                }
                case 24: {
                    throw new java.lang.IllegalArgumentException("unknown object in getInstance: " + r3.getClass().getName());
                }
                case 26: {
                    return (abcd.FL) r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.InterfaceqL j6(java.util.Enumeration r1) {
        return (abcd.InterfaceqL) r1.nextElement();
    }

    public abcd.InterfaceqL[] EQ() {
        abcd.InterfaceqL[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = new abcd.InterfaceqL[tp()];
                    r1 = 0;
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r1 == tp()) { $pc4 = 5; continue $sw4; }
                    r0[r1] = j6(r1);
                    r1 = r1 + 1;
                    { $pc4 = 4; continue $sw4; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    abcd.EL VH() {
        abcd.tM r0 = new abcd.tM();
        r0.j6 = this.j6;
        return r0;
    }

    @Override
    boolean Zo() {
        return true;
    }

    @Override
    abcd.EL gn() {
        abcd.EM r0 = new abcd.EM();
        r0.j6 = this.j6;
        return r0;
    }

    @Override
    public int hashCode() {
        java.util.Enumeration r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = u7();
                    r1 = tp();
                    $pc5 = 4; continue $sw5;
                }
                case 4: {
                    if (r0.hasMoreElements() == false) { $pc5 = 5; continue $sw5; }
                    r1 = (r1 * 17) ^ j6(r0).hashCode();
                    { $pc5 = 4; continue $sw5; }
                }
                case 5: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.InterfaceqL j6(int r2) {
        return (abcd.InterfaceqL) this.j6.elementAt(r2);
    }

    @Override
    boolean j6(abcd.EL r5) {
        abcd.FL r6 = null;
        java.util.Enumeration r0 = null;
        java.util.Enumeration r7 = null;
        abcd.InterfaceqL r2 = null;
        abcd.InterfaceqL r3 = null;
        abcd.EL r4 = null;
        abcd.EL r8 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if ((r5 instanceof abcd.FL) == true) { $pc6 = 5; continue $sw6; }
                    return false;
                }
                case 5: {
                    r6 = (abcd.FL) r5;
                    if (tp() == r6.tp()) { $pc6 = 8; continue $sw6; }
                    return false;
                }
                case 8: {
                    r0 = u7();
                    r7 = r6.u7();
                    $pc6 = 10; continue $sw6;
                }
                case 10: {
                    if (r0.hasMoreElements() == false) { $pc6 = 11; continue $sw6; }
                    r2 = j6(r0);
                    r3 = j6(r7);
                    r4 = r2.DW();
                    r8 = r3.DW();
                    if (r4 == r8) { $pc6 = 10; continue $sw6; }
                    if (r4.equals(r8) == true) { $pc6 = 10; continue $sw6; }
                    return false;
                }
                case 11: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return this.j6.toString();
    }

    public int tp() {
        return this.j6.size();
    }

    public java.util.Enumeration u7() {
        return this.j6.elements();
    }
}
