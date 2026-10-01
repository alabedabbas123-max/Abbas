package abcd;

public abstract class HL extends abcd.EL {
    private boolean DW;
    private java.util.Vector j6;

    protected HL() {
        this.j6 = new java.util.Vector();
        this.DW = false;
    }

    protected HL(abcd.InterfaceqL r2) {
        this.j6 = new java.util.Vector();
        this.DW = false;
        this.j6.addElement(r2);
    }

    protected HL(abcd.rL r4, boolean r5) {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.j6 = new java.util.Vector();
                    r0 = 0;
                    this.DW = false;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0 == r4.j6()) { $pc0 = 5; continue $sw0; }
                    this.j6.addElement(r4.j6(r0));
                    r0 = r0 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 5: {
                    if (r5 == false) { $pc0 = 10; continue $sw0; }
                    EQ();
                    return;
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected HL(abcd.InterfaceqL[] r4, boolean r5) {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.j6 = new java.util.Vector();
                    r0 = 0;
                    this.DW = false;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r0 == r4.length) { $pc1 = 5; continue $sw1; }
                    this.j6.addElement(r4[r0]);
                    r0 = r0 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 5: {
                    if (r5 == false) { $pc1 = 10; continue $sw1; }
                    EQ();
                    return;
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.HL j6(abcd.LL r2, boolean r3) {
        abcd.FL r4 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r3 == false) { $pc2 = 10; continue $sw2; }
                    if (r2.we() == false) { $pc2 = 8; continue $sw2; }
                    return (abcd.HL) r2.u7();
                }
                case 8: {
                    throw new java.lang.IllegalArgumentException("object implicit - explicit expected.");
                }
                case 10: {
                    if (r2.we() == false) { $pc2 = 18; continue $sw2; }
                    if ((r2 instanceof abcd.YL) == false) { $pc2 = 16; continue $sw2; }
                    return new abcd.WL(r2.u7());
                }
                case 16: {
                    return new abcd.FM(r2.u7());
                }
                case 18: {
                    if ((r2.u7() instanceof abcd.HL) == true) { $pc2 = 20; continue $sw2; }
                    new abcd.rL();
                    if ((r2.u7() instanceof abcd.FL) == false) { $pc2 = 30; continue $sw2; }
                    r4 = (abcd.FL) r2.u7();
                    if ((r2 instanceof abcd.YL) == false) { $pc2 = 28; continue $sw2; }
                    return new abcd.WL(r4.EQ());
                }
                case 28: {
                    return new abcd.FM(r4.EQ());
                }
                case 30: {
                    throw new java.lang.IllegalArgumentException("unknown object in getInstance: " + r2.getClass().getName());
                }
                case 20: {
                    return (abcd.HL) r2.u7();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.HL j6(java.lang.Object r3) {
        abcd.EL r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r3 == null) { $pc3 = 26; continue $sw3; }
                    if ((r3 instanceof abcd.HL) == true) { $pc3 = 26; continue $sw3; }
                    if ((r3 instanceof abcd.IL) == false) { $pc3 = 11; continue $sw3; }
                    return j6(((abcd.IL) r3).DW());
                }
                case 11: {
                    if ((r3 instanceof byte[]) == false) { $pc3 = 18; continue $sw3; }
                    return j6(abcd.EL.j6((byte[]) r3));
                }
                case 14: {
                    e = $ex3;
                    throw new java.lang.IllegalArgumentException("failed to construct set from byte[]: " + e.getMessage());
                }
                case 18: {
                    if ((r3 instanceof abcd.InterfaceqL) == false) { $pc3 = 24; continue $sw3; }
                    r0 = ((abcd.InterfaceqL) r3).DW();
                    if ((r0 instanceof abcd.HL) == false) { $pc3 = 24; continue $sw3; }
                    return (abcd.HL) r0;
                }
                case 24: {
                    throw new java.lang.IllegalArgumentException("unknown object in getInstance: " + r3.getClass().getName());
                }
                case 26: {
                    return (abcd.HL) r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.InterfaceqL j6(java.util.Enumeration r1) {
        abcd.InterfaceqL r2 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r2 = (abcd.InterfaceqL) r1.nextElement();
                    if (r2 == null) { $pc4 = 5; continue $sw4; }
                    return r2;
                }
                case 5: {
                    return abcd.mM.j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean j6(byte[] r7, byte[] r8) {
        int r0 = 0;
        int r2 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = java.lang.Math.min(r7.length, r8.length);
                    r2 = 0;
                    $pc5 = 4; continue $sw5;
                }
                case 4: {
                    if (r2 == r0) { $pc5 = 6; continue $sw5; }
                    if (r7[r2] != r8[r2]) { $pc5 = 12; continue $sw5; }
                    r2 = r2 + 1;
                    { $pc5 = 4; continue $sw5; }
                }
                case 12: {
                    if ((r7[r2] & 255) >= (r8[r2] & 255)) { $pc5 = 14; continue $sw5; }
                    return true;
                }
                case 14: {
                    return false;
                }
                case 6: {
                    if (r0 != r7.length) { $pc5 = 8; continue $sw5; }
                    return true;
                }
                case 8: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private byte[] j6(abcd.InterfaceqL r3) {
        java.io.ByteArrayOutputStream r0 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = new java.io.ByteArrayOutputStream();
                    try {
                        new abcd.CL(r0).j6(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.io.IOException) { $pc6 = 6; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r0.toByteArray();
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("cannot encode object added to SET");
                }
                case 6: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void EQ() {
        int r2 = 0;
        boolean r1 = false;
        int r3 = 0;
        byte[] r4 = null;
        int r5 = 0;
        boolean r6 = false;
        int r7 = 0;
        byte[] r8 = null;
        java.lang.Object r9 = null;
        java.util.Vector r10 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (this.DW == true) { $pc7 = 17; continue $sw7; }
                    this.DW = true;
                    if (this.j6.size() <= 1) { $pc7 = 22; continue $sw7; }
                    r2 = this.j6.size() - 1;
                    r1 = true;
                    $pc7 = 7; continue $sw7;
                }
                case 7: {
                    if (r1 == false) { $pc7 = 23; continue $sw7; }
                    r3 = 0;
                    r4 = j6((abcd.InterfaceqL) this.j6.elementAt(0));
                    r5 = 0;
                    r6 = false;
                    $pc7 = 10; continue $sw7;
                }
                case 10: {
                    if (r3 == r2) { $pc7 = 11; continue $sw7; }
                    r7 = r3 + 1;
                    r8 = j6((abcd.InterfaceqL) this.j6.elementAt(r7));
                    if (j6(r4, r8) == false) { $pc7 = 15; continue $sw7; }
                    r4 = r8;
                    $pc7 = 16; continue $sw7;
                }
                case 16: {
                    r3 = r7;
                    { $pc7 = 10; continue $sw7; }
                }
                case 15: {
                    r9 = this.j6.elementAt(r3);
                    r10 = this.j6;
                    r10.setElementAt(r10.elementAt(r7), r3);
                    this.j6.setElementAt(r9, r7);
                    r5 = r3;
                    r6 = true;
                    { $pc7 = 16; continue $sw7; }
                }
                case 11: {
                    r2 = r5;
                    r1 = r6;
                    { $pc7 = 7; continue $sw7; }
                }
                case 23: {
                    return;
                }
                case 22: {
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    abcd.EL VH() {
        abcd.vM r0 = null;
        java.util.Vector r1 = null;
        int r2 = 0;
        abcd.vM r3 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (this.DW == false) { $pc8 = 6; continue $sw8; }
                    r0 = new abcd.vM();
                    r0.j6 = this.j6;
                    return r0;
                }
                case 6: {
                    r1 = new java.util.Vector();
                    r2 = 0;
                    $pc8 = 8; continue $sw8;
                }
                case 8: {
                    if (r2 == this.j6.size()) { $pc8 = 9; continue $sw8; }
                    r1.addElement(this.j6.elementAt(r2));
                    r2 = r2 + 1;
                    { $pc8 = 8; continue $sw8; }
                }
                case 9: {
                    r3 = new abcd.vM();
                    r3.j6 = r1;
                    r3.EQ();
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    boolean Zo() {
        return true;
    }

    @Override
    abcd.EL gn() {
        abcd.FM r0 = new abcd.FM();
        r0.j6 = this.j6;
        return r0;
    }

    @Override
    public int hashCode() {
        java.util.Enumeration r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = u7();
                    r1 = tp();
                    $pc9 = 4; continue $sw9;
                }
                case 4: {
                    if (r0.hasMoreElements() == false) { $pc9 = 5; continue $sw9; }
                    r1 = (r1 * 17) ^ j6(r0).hashCode();
                    { $pc9 = 4; continue $sw9; }
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
        abcd.HL r6 = null;
        java.util.Enumeration r0 = null;
        java.util.Enumeration r7 = null;
        abcd.InterfaceqL r2 = null;
        abcd.InterfaceqL r3 = null;
        abcd.EL r4 = null;
        abcd.EL r8 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if ((r5 instanceof abcd.HL) == true) { $pc10 = 5; continue $sw10; }
                    return false;
                }
                case 5: {
                    r6 = (abcd.HL) r5;
                    if (tp() == r6.tp()) { $pc10 = 8; continue $sw10; }
                    return false;
                }
                case 8: {
                    r0 = u7();
                    r7 = r6.u7();
                    $pc10 = 10; continue $sw10;
                }
                case 10: {
                    if (r0.hasMoreElements() == false) { $pc10 = 11; continue $sw10; }
                    r2 = j6(r0);
                    r3 = j6(r7);
                    r4 = r2.DW();
                    r8 = r3.DW();
                    if (r4 == r8) { $pc10 = 10; continue $sw10; }
                    if (r4.equals(r8) == true) { $pc10 = 10; continue $sw10; }
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
