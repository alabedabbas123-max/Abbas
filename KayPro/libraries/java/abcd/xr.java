package abcd;

public class xr {
    private abcd.Gr DW;
    private java.util.HashMap<abcd.Yp, java.lang.Integer> EQ;
    private abcd.Dr FH;
    private abcd.Dr Hw;
    private java.util.HashMap<abcd.Wp, java.lang.Integer> J0;
    private java.util.HashMap<abcd._p, java.lang.Integer> J8;
    private abcd.hr QX;
    private java.util.HashMap<abcd.nq, java.lang.Integer> VH;
    private java.util.HashMap<java.lang.Integer, abcd.aq> Ws;
    private abcd.hr.a XL;
    private java.util.HashMap<abcd.lq, java.lang.Integer> Zo;
    private abcd.hr.a aM;
    private java.util.HashMap<abcd.fr, java.lang.Integer> gn;
    private boolean j6;
    private java.util.HashMap<abcd.Xp, java.lang.Integer> tp;
    private java.util.HashMap<abcd.Vp, java.lang.Integer> u7;
    private java.util.HashMap<abcd.qq, java.lang.Integer> v5;
    private java.util.HashMap<abcd.jq, java.lang.Integer> we;

    private interface a<T> {
        T j6(T r1, abcd.yr r2);

        void j6(int r1, int r2);
    }

    private interface b<T> {
        void j6(abcd.hr.a r1, T r2);
    }

    private interface c {
        int j6(int r1, int r2);
    }

    private interface d<T> {
        T j6(T r1, abcd.yr r2);

        void j6(abcd.hr.a r1, T r2, int r3, int r4, abcd.yr r5);
    }

    public xr() {
        this.j6 = true;
        this.DW = new abcd.Gr();
        this.FH = new abcd.Dr();
        this.Hw = new abcd.Dr();
        this.gn = new java.util.HashMap();
        this.v5 = new java.util.HashMap();
        this.Zo = new java.util.HashMap();
        this.VH = new java.util.HashMap();
        this.u7 = new java.util.HashMap();
        this.tp = new java.util.HashMap();
        this.EQ = new java.util.HashMap();
        this.we = new java.util.HashMap();
        this.J0 = new java.util.HashMap();
        this.J8 = new java.util.HashMap();
        this.Ws = new java.util.HashMap();
        this.QX = new abcd.hr();
    }

    private abcd.Vp DW(abcd.Vp r8) {
        return new abcd.Vp(null, r8.we(), r8.Zo(), r8.Hw(), r8.VH());
    }

    private abcd.fr DW(abcd.fr r3) {
        return new abcd.fr(null, r3.Hw());
    }

    private abcd.lq DW(abcd.lq r5) {
        return new abcd.lq(null, r5.Hw(), r5.VH(), r5.Zo());
    }

    private abcd.nq DW(abcd.nq r5) {
        return new abcd.nq(null, r5.Hw(), r5.VH(), r5.Zo());
    }

    private abcd.qq DW(abcd.qq r5) {
        return new abcd.qq(null, r5.VH(), r5.Zo(), r5.Hw());
    }

    private static <T> java.util.List<T> DW(java.util.HashMap<T, java.lang.Integer> r3) {
        java.util.Vector r0 = null;
        java.util.Iterator<java.util.Map.Entry<T, java.lang.Integer>> r4 = null;
        java.util.Map.Entry<T, java.lang.Integer> r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.util.Vector(r3.size());
                    r0.setSize(r3.size());
                    r4 = r3.entrySet().iterator();
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r4.hasNext() == false) { $pc0 = 6; continue $sw0; }
                    r1 = r4.next();
                    r0.set(r1.getValue().intValue(), r1.getKey());
                    { $pc0 = 4; continue $sw0; }
                }
                case 6: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(abcd.yr r4) {
        this.J0 = j6(this.QX.v5().aM, this.J0, new abcd.rr(this), r4);
    }

    private void DW(abcd.yr r21, abcd.iq r22) {
        abcd.Gn.a r3 = null;
        abcd.iq.a r4 = null;
        int r6 = 0;
        abcd.aq r7 = null;
        int r8 = 0;
        int r9 = 0;
        int r17 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r3 = r22.j6().VH;
                    if (r3.Hw() == false) { $pc1 = 15; continue $sw1; }
                    r4 = r22.DW(r3.FH);
                    r6 = 0;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (r6 >= r3.DW) { $pc1 = 19; continue $sw1; }
                    r7 = r4.J0();
                    r8 = r21.tp(r7.u7());
                    if (j6(r8) == true) { $pc1 = 14; continue $sw1; }
                    r9 = r7.DW();
                    if (r9 == 0) { $pc1 = 12; continue $sw1; }
                    r17 = j6(r21.j6(r22.DW(r9).tp()));
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    j6(r8, new abcd.aq(null, 0, r8, r7.j6(), r21.tp(r7.gn()), r21.EQ(r7.Hw()), r21.u7(r7.Zo()), r17, 0, r21.v5(r7.VH())));
                    { $pc1 = 14; continue $sw1; }
                }
                case 12: {
                    r17 = 0;
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    r6 = r6 + 1;
                    { $pc1 = 6; continue $sw1; }
                }
                case 19: {
                    return;
                }
                case 15: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.j6 == false) { $pc2 = 6; continue $sw2; }
                    return;
                }
                case 6: {
                    throw new java.lang.IllegalStateException("Too many classes / methods / fields / strings.\nConsider using \"multidexenabled true\" or \"minsdkversion 21\" in gradle files");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH(int r9) {
        java.util.Iterator<abcd._p> r0 = null;
        abcd._p.b[] r1 = null;
        int r2 = 0;
        int r4 = 0;
        abcd._p.b r5 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.J8.keySet().iterator();
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc3 = 12; continue $sw3; }
                    r1 = r0.next().j6();
                    r2 = r1.length;
                    r4 = 0;
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    if (r4 >= r2) { $pc3 = 4; continue $sw3; }
                    r5 = r1[r4];
                    if (r5.DW() == (-1)) { $pc3 = 10; continue $sw3; }
                    r5.j6(r5.DW() + r9);
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    r4 = r4 + 1;
                    { $pc3 = 6; continue $sw3; }
                }
                case 10: {
                    r5.j6(0);
                    { $pc3 = 11; continue $sw3; }
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH(abcd.yr r4) {
        this.EQ = j6(this.QX.v5().tp, this.EQ, new abcd.qr(this), r4);
    }

    private void Hw() {
        abcd.Dr r1 = null;
        java.util.HashMap<java.lang.Integer, abcd.aq> r2 = null;
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, abcd.aq>> r3 = null;
        java.util.Map.Entry<java.lang.Integer, abcd.aq> r4 = null;
        java.lang.Integer r5 = null;
        abcd.aq r6 = null;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        int r14 = 0;
        int r16 = 0;
        int r15 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r1 = new abcd.Dr();
                    this.J8 = j6(this.QX.v5().we, this.J8, new abcd.sr(this, r1), null);
                    r2 = new java.util.HashMap();
                    r3 = this.Ws.entrySet().iterator();
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r3.hasNext() == false) { $pc4 = 10; continue $sw4; }
                    r4 = r3.next();
                    r5 = r4.getKey();
                    r6 = r4.getValue();
                    r9 = r5.intValue();
                    r10 = r6.j6();
                    r11 = r6.gn();
                    r12 = r6.Hw();
                    r13 = r6.Zo();
                    r14 = r6.DW();
                    if (r6.FH() != 0) { $pc4 = 8; continue $sw4; }
                    r16 = 0;
                    $pc4 = 9; continue $sw4;
                }
                case 9: {
                    r15 = r16;
                    r2.put(r5, new abcd.aq(null, 0, r9, r10, r11, r12, r13, r14, r15, r6.VH()));
                    { $pc4 = 4; continue $sw4; }
                }
                case 8: {
                    r16 = r1.j6(r6.FH());
                    { $pc4 = 9; continue $sw4; }
                }
                case 10: {
                    this.Ws = r2;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Hw(abcd.yr r4) {
        this.tp = j6(this.QX.v5().EQ, this.tp, new abcd.pr(this), r4);
    }

    private void VH() {
        abcd.hr r0 = null;
        int r1 = 0;
        abcd.Dr r2 = null;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.QX;
                    r1 = r0.j6(r0.v5().J8, this.DW.j6(), this.DW.FH(), this.DW.DW()).tp();
                    r2 = new abcd.Dr();
                    this.FH.DW.DW();
                    $pc5 = 4; continue $sw5;
                }
                case 4: {
                    if (this.FH.DW.j6() == false) { $pc5 = 6; continue $sw5; }
                    r3 = this.FH.DW.FH();
                    r4 = r3 + r1;
                    r2.DW(r4, this.FH.DW.Hw());
                    { $pc5 = 4; continue $sw5; }
                }
                case 6: {
                    this.FH = r2;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void VH(abcd.yr r6) {
        abcd.Dr r0 = null;
        int r1 = 0;
        int r2 = 0;
        int[] r3 = null;
        int r4 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = new abcd.Dr(this.Hw.FH());
                    this.Hw.DW.DW();
                    $pc6 = 4; continue $sw6;
                }
                case 4: {
                    if (this.Hw.DW.j6() == false) { $pc6 = 6; continue $sw6; }
                    r1 = this.Hw.DW.FH();
                    r2 = this.Hw.DW.Hw();
                    r0.DW(r6.u7(r1), r2);
                    { $pc6 = 4; continue $sw6; }
                }
                case 6: {
                    r3 = j6(r0);
                    j6(r3, new abcd.nr(this));
                    this.Hw.j6();
                    r4 = 0;
                    $pc6 = 8; continue $sw6;
                }
                case 8: {
                    if (r4 >= r3.length) { $pc6 = 10; continue $sw6; }
                    this.Hw.DW(r3[r4], r4);
                    r6.tp(r0.j6(r3[r4]), r4);
                    r4 = r4 + 1;
                    { $pc6 = 8; continue $sw6; }
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Zo() {
        abcd.Dr r6 = null;
        java.util.HashMap r0 = null;
        abcd.Fr r7 = null;
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, abcd.aq>> r1 = null;
        int r8 = 0;
        java.util.Map.Entry<java.lang.Integer, abcd.aq> r2 = null;
        int r3 = 0;
        abcd.aq r4 = null;
        int r5 = 0;
        short[] r9 = null;
        int r10 = 0;
        short r11 = 0;
        java.util.ArrayList r12 = null;
        abcd.Fr r13 = null;
        abcd.hr r14 = null;
        abcd.hr.a r15 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r6 = new abcd.Dr();
                    r0 = j6(this.gn);
                    r7 = new abcd.Fr();
                    r1 = this.Ws.entrySet().iterator();
                    $pc7 = 3; continue $sw7;
                }
                case 3: {
                    r8 = 0;
                    if (r1.hasNext() == false) { $pc7 = 20; continue $sw7; }
                    r2 = r1.next();
                    r3 = r2.getKey().intValue();
                    r4 = r2.getValue();
                    r7.DW(r3);
                    r5 = r4.gn();
                    if (r5 == 0) { $pc7 = 11; continue $sw7; }
                    if (this.Ws.containsKey(java.lang.Integer.valueOf(r5)) == false) { $pc7 = 11; continue $sw7; }
                    r6.DW(r3, r5);
                    $pc7 = 11; continue $sw7;
                }
                case 11: {
                    if (r4.Hw() == 0) { $pc7 = 3; continue $sw7; }
                    r9 = ((abcd.fr) r0.get(java.lang.Integer.valueOf(r4.Hw()))).Hw();
                    r10 = r9.length;
                    $pc7 = 13; continue $sw7;
                }
                case 13: {
                    if (r8 >= r10) { $pc7 = 3; continue $sw7; }
                    r11 = r9[r8];
                    if (r11 == 0) { $pc7 = 19; continue $sw7; }
                    if (this.Ws.containsKey(java.lang.Short.valueOf(r11)) == false) { $pc7 = 19; continue $sw7; }
                    r6.DW(r3, r11);
                    $pc7 = 19; continue $sw7;
                }
                case 19: {
                    r8 = r8 + 1;
                    { $pc7 = 13; continue $sw7; }
                }
                case 20: {
                    r12 = new java.util.ArrayList();
                    r13 = new abcd.Fr();
                    r7.FH.DW();
                    $pc7 = 22; continue $sw7;
                }
                case 22: {
                    if (r7.FH.j6() == false) { $pc7 = 24; continue $sw7; }
                    j6(r7.FH.FH(), r13, r12, r7, r6);
                    { $pc7 = 22; continue $sw7; }
                }
                case 24: {
                    r14 = this.QX;
                    r15 = r14.FH(r14.v5().VH);
                    $pc7 = 26; continue $sw7;
                }
                case 26: {
                    if (r8 >= r12.size()) { $pc7 = 28; continue $sw7; }
                    this.Ws.get(r12.get(r8)).j6(r15);
                    r8 = r8 + 1;
                    { $pc7 = 26; continue $sw7; }
                }
                case 28: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Zo(abcd.yr r4) {
        this.we = j6(this.QX.v5().XL, this.we, new abcd.tr(this), r4);
    }

    private void gn() {
        abcd.hr r0 = null;
        abcd.hr.a r1 = null;
        int[] r2 = null;
        int r3 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = this.QX;
                    r1 = r0.FH(r0.v5().DW);
                    r2 = j6(this.FH);
                    r3 = 0;
                    $pc8 = 4; continue $sw8;
                }
                case 4: {
                    if (r3 >= r2.length) { $pc8 = 6; continue $sw8; }
                    r1.writeInt(r2[r3]);
                    r3 = r3 + 1;
                    { $pc8 = 4; continue $sw8; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void gn(abcd.yr r9) {
        java.util.HashMap r0 = null;
        java.util.Vector r1 = null;
        java.util.Iterator<java.util.Map.Entry<abcd.fr, java.lang.Integer>> r2 = null;
        java.util.Map.Entry<abcd.fr, java.lang.Integer> r3 = null;
        abcd.fr r4 = null;
        int r5 = 0;
        abcd.fr r6 = null;
        java.util.HashMap r7 = null;
        abcd.Dr r8 = null;
        int r10 = 0;
        int r11 = 0;
        abcd.fr r12 = null;
        java.util.HashMap<abcd.fr, java.lang.Integer> r13 = null;
        abcd.hr r14 = null;
        abcd.hr.a r15 = null;
        abcd.fr r16 = null;
        int r17 = 0;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (this.gn.size() != 0) { $pc9 = 5; continue $sw9; }
                    return;
                }
                case 5: {
                    r0 = new java.util.HashMap();
                    r1 = new java.util.Vector(this.gn.size());
                    r1.setSize(this.gn.size());
                    r2 = this.gn.entrySet().iterator();
                    $pc9 = 7; continue $sw9;
                }
                case 7: {
                    if (r2.hasNext() == false) { $pc9 = 9; continue $sw9; }
                    r3 = r2.next();
                    r4 = r3.getKey();
                    r5 = r3.getValue().intValue();
                    r6 = r9.j6(r4);
                    r0.put(r6, java.lang.Integer.valueOf(r5));
                    r1.set(r5 - 1, r6);
                    { $pc9 = 7; continue $sw9; }
                }
                case 9: {
                    this.gn = null;
                    java.util.Collections.sort(r1);
                    r7 = new java.util.HashMap();
                    r8 = new abcd.Dr();
                    r10 = 0;
                    r8.DW(0, 0);
                    r11 = 0;
                    $pc9 = 11; continue $sw9;
                }
                case 11: {
                    if (r11 >= r1.size()) { $pc9 = 13; continue $sw9; }
                    r12 = (abcd.fr) r1.get(r11);
                    r11 = r11 + 1;
                    r8.DW(r11, ((java.lang.Integer) r0.get(r12)).intValue());
                    r7.put(r12, java.lang.Integer.valueOf(r11));
                    { $pc9 = 11; continue $sw9; }
                }
                case 13: {
                    r13 = new java.util.HashMap();
                    r14 = this.QX;
                    r15 = r14.j6(r14.v5().u7);
                    $pc9 = 15; continue $sw9;
                }
                case 15: {
                    if (r10 >= r1.size()) { $pc9 = 17; continue $sw9; }
                    r16 = (abcd.fr) r1.get(r10);
                    r17 = r15.u7();
                    r13.put(r16, java.lang.Integer.valueOf(r17));
                    r10 = r10 + 1;
                    r9.EQ(r8.j6(r10), r17);
                    r15.j6(r16);
                    { $pc9 = 15; continue $sw9; }
                }
                case 17: {
                    this.gn = r13;
                    this.QX.DW(r1.size());
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int j6(abcd._p.b r2, abcd.yr r3, abcd.iq r4) {
        int r0 = this.XL.we();
        j6(r4, r4.j6(r2), r3);
        this.QX.v5().J0.DW++;
        return r0;
    }

    static abcd.Gr j6(abcd.xr r0) {
        return r0.DW;
    }

    private abcd.aq j6(int r13, abcd.aq r14, int r15) {
        return new abcd.aq(null, 0, r13, r14.j6(), r14.gn(), r14.Hw(), r14.Zo(), r14.DW(), r15, r14.VH());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> java.util.HashMap<T, java.lang.Integer> j6(abcd.ir.a r9, java.util.HashMap<T, java.lang.Integer> r10, xr.d<T> r11, abcd.yr r12) {
        abcd.hr.a r13 = null;
        org.codehaus.groovy.ast.tools.WideningCategories.AnonymousClass1 r0 = null;
        java.util.Iterator<java.util.Map.Entry<T, java.lang.Integer>> r7 = null;
        java.util.Map.Entry<T, java.lang.Integer> r1 = null;
        java.lang.Object r3 = null;
        int r5 = 0;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (r10.size() != 0) { $pc10 = 5; continue $sw10; }
                    return r10;
                }
                case 5: {
                    r13 = this.QX.j6(r9);
                    r0 = (java.util.HashMap<T, java.lang.Integer>) new java.util.HashMap();
                    r7 = r10.entrySet().iterator();
                    $pc10 = 7; continue $sw10;
                }
                case 7: {
                    if (r7.hasNext() == false) { $pc10 = 9; continue $sw10; }
                    r1 = r7.next();
                    r3 = r11.j6(r1.getKey(), r12);
                    r5 = r13.u7();
                    r0.put(r3, java.lang.Integer.valueOf(r5));
                    r11.j6(r13, r3, r1.getValue().intValue(), r5, r12);
                    { $pc10 = 7; continue $sw10; }
                }
                case 9: {
                    this.QX.DW(r10.size());
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private <K, V> java.util.HashMap<V, K> j6(java.util.HashMap<K, V> r4) {
        java.util.HashMap<V, K> r0 = null;
        java.util.Iterator<java.util.Map.Entry<K, V>> r5 = null;
        java.util.Map.Entry<K, V> r1 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = new java.util.HashMap();
                    r5 = r4.entrySet().iterator();
                    $pc11 = 4; continue $sw11;
                }
                case 4: {
                    if (r5.hasNext() == false) { $pc11 = 6; continue $sw11; }
                    r1 = r5.next();
                    r0.put(r1.getValue(), r1.getKey());
                    { $pc11 = 4; continue $sw11; }
                }
                case 6: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static <T extends java.lang.Comparable<T>> java.util.HashMap<T, java.lang.Integer> j6(java.util.HashMap<T, java.lang.Integer> r4, abcd.yr r5, xr.a<T> r6) {
        java.util.HashMap r0 = null;
        java.util.Iterator<java.util.Map.Entry<T, java.lang.Integer>> r1 = null;
        java.util.Map.Entry<T, java.lang.Integer> r2 = null;
        T r3 = null;
        int r7 = 0;
        java.util.List r8 = null;
        org.codehaus.groovy.ast.tools.WideningCategories.AnonymousClass1 r9 = null;
        int r10 = 0;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r0 = new java.util.HashMap(r4.size());
                    r1 = r4.entrySet().iterator();
                    $pc12 = 4; continue $sw12;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc12 = 6; continue $sw12; }
                    r2 = r1.next();
                    r3 = r2.getKey();
                    r7 = r2.getValue().intValue();
                    r0.put(r6.j6(r3, r5), java.lang.Integer.valueOf(r7));
                    { $pc12 = 4; continue $sw12; }
                }
                case 6: {
                    r8 = DW(r0);
                    java.util.Collections.sort(r8);
                    r9 = (java.util.HashMap<T, java.lang.Integer>) new java.util.HashMap(r4.size());
                    r10 = 0;
                    $pc12 = 8; continue $sw12;
                }
                case 8: {
                    if (r10 >= r8.size()) { $pc12 = 10; continue $sw12; }
                    r9.put(r8.get(r10), java.lang.Integer.valueOf(r10));
                    r6.j6(((java.lang.Integer) r0.get(r8.get(r10))).intValue(), r10);
                    r10 = r10 + 1;
                    { $pc12 = 8; continue $sw12; }
                }
                case 10: {
                    return r9;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(int r9, abcd.Fr r10, java.util.List<java.lang.Integer> r11, abcd.Fr r12, abcd.Dr r13) {
        abcd.Dr.a r0 = null;
        int r3 = 0;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    if (r10.j6(r9) == true) { $pc13 = 17; continue $sw13; }
                    r10.DW(r9);
                    r0 = r13.DW();
                    r0.j6(r9);
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    if (r0.j6() == false) { $pc13 = 10; continue $sw13; }
                    r3 = r0.Hw();
                    if (r12.j6(r3) == false) { $pc13 = 6; continue $sw13; }
                    j6(r3, r10, r11, r12, r13);
                    { $pc13 = 6; continue $sw13; }
                }
                case 10: {
                    r11.add(java.lang.Integer.valueOf(r9));
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.Dr r5, int r6, abcd.bq.a r7, abcd.yr r8) {
        int r0 = 0;
        int r9 = 0;
        int[] r10 = null;
        int[] r11 = null;
        int r1 = 0;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = this.XL.EQ() - r6;
                    r5.DW(r7.FH(), r0);
                    r9 = r7.DW();
                    r10 = r7.Hw();
                    r11 = r7.j6();
                    if (r9 == (-1)) { $pc14 = 5; continue $sw14; }
                    this.XL.VH(-r10.length);
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    r1 = 0;
                    $pc14 = 8; continue $sw14;
                }
                case 8: {
                    if (r1 >= r10.length) { $pc14 = 10; continue $sw14; }
                    this.XL.DW(r8.tp(r10[r1]));
                    this.XL.DW(r11[r1]);
                    r1 = r1 + 1;
                    { $pc14 = 8; continue $sw14; }
                }
                case 10: {
                    if (r9 == (-1)) { $pc14 = 14; continue $sw14; }
                    this.XL.DW(r9);
                    return;
                }
                case 14: {
                    return;
                }
                case 5: {
                    this.XL.VH(r10.length);
                    { $pc14 = 6; continue $sw14; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.iq.a r5, abcd.yr r6) {
        int r0 = 0;
        int r1 = 0;
        byte r2 = 0;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    this.aM.DW(r5.rN());
                    r0 = r5.rN();
                    this.aM.DW(r0);
                    r1 = 0;
                    $pc15 = 3; continue $sw15;
                }
                case 3: {
                    if (r1 >= r0) { $pc15 = 5; continue $sw15; }
                    this.aM.gn(r6.u7(r5.er()));
                    r1 = r1 + 1;
                    $pc15 = 5; continue $sw15;
                }
                case 5: {
                    r2 = r5.readByte();
                    this.aM.writeByte(r2);
                    if (r2 != 9) { $pc15 = 7; continue $sw15; }
                    this.aM.gn(r6.u7(r5.er()));
                    { $pc15 = 5; continue $sw15; }
                }
                case 7: {
                    switch(r2) {
                        case 0: { $pc15 = 15; continue $sw15; }
                        case 1: { $pc15 = 14; continue $sw15; }
                        case 2: { $pc15 = 13; continue $sw15; }
                        case 3: { $pc15 = 10; continue $sw15; }
                        case 4: { $pc15 = 10; continue $sw15; }
                        case 5: { $pc15 = 9; continue $sw15; }
                        case 6: { $pc15 = 9; continue $sw15; }
                        default: { $pc15 = 5; continue $sw15; }
                    };
                }
                case 9: {
                    this.aM.DW(r5.rN());
                    { $pc15 = 5; continue $sw15; }
                }
                case 10: {
                    this.aM.DW(r5.rN());
                    this.aM.gn(r6.u7(r5.er()));
                    this.aM.gn(r6.tp(r5.er()));
                    if (r2 != 4) { $pc15 = 5; continue $sw15; }
                    this.aM.gn(r6.u7(r5.er()));
                    { $pc15 = 5; continue $sw15; }
                }
                case 13: {
                    this.aM.VH(r5.U2());
                    { $pc15 = 5; continue $sw15; }
                }
                case 14: {
                    this.aM.DW(r5.rN());
                    { $pc15 = 5; continue $sw15; }
                }
                case 15: {
                    this.QX.v5().Ws.DW++;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.iq r8, abcd.bq r9, abcd.yr r10) {
        abcd.bq.b[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        abcd.iq.a r11 = null;
        int r3 = 0;
        short[] r12 = null;
        int r13 = 0;
        abcd.bq.a[] r14 = null;
        int r4 = 0;
        abcd.Dr r5 = null;
        int r6 = 0;
        int r7 = 0;
        int r15 = 0;
        int r16 = 0;
        abcd.bq.b r17 = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    this.XL.VH();
                    this.XL.u7(r9.Zo());
                    this.XL.u7(r9.FH());
                    this.XL.u7(r9.v5());
                    r0 = r9.VH();
                    this.XL.u7(r0.length);
                    r1 = r9.DW();
                    r2 = 0;
                    if (r1 == 0) { $pc16 = 5; continue $sw16; }
                    r11 = r8.DW(r1);
                    r3 = this.aM.u7();
                    j6(r11, r10);
                    this.XL.writeInt(r3);
                    $pc16 = 6; continue $sw16;
                }
                case 6: {
                    r12 = r9.Hw();
                    abcd.Br.j6(r12, r10);
                    this.XL.writeInt(r12.length);
                    this.XL.j6(r12);
                    if (r0.length > 0) { $pc16 = 9; continue $sw16; }
                    $pc16 = 18; continue $sw16;
                }
                case 18: {
                    this.XL.Zo();
                    return;
                }
                case 9: {
                    if ((r12.length % 2) != 1) { $pc16 = 11; continue $sw16; }
                    this.XL.j6(0);
                    $pc16 = 11; continue $sw16;
                }
                case 11: {
                    r13 = this.XL.EQ();
                    this.XL.Zo(r0.length * 8);
                    r14 = r9.j6();
                    r4 = this.XL.EQ();
                    this.XL.DW(r14.length);
                    r5 = new abcd.Dr();
                    r6 = r14.length;
                    r7 = 0;
                    $pc16 = 12; continue $sw16;
                }
                case 12: {
                    if (r7 >= r6) { $pc16 = 14; continue $sw16; }
                    j6(r5, r4, r14[r7], r10);
                    r7 = r7 + 1;
                    { $pc16 = 12; continue $sw16; }
                }
                case 14: {
                    r15 = this.XL.EQ();
                    this.XL.v5(r13);
                    r16 = r0.length;
                    $pc16 = 15; continue $sw16;
                }
                case 15: {
                    if (r2 >= r16) { $pc16 = 17; continue $sw16; }
                    r17 = r0[r2];
                    this.XL.writeInt(r17.FH());
                    this.XL.u7(r17.DW());
                    this.XL.u7(r5.j6(r17.j6()));
                    r2 = r2 + 1;
                    { $pc16 = 15; continue $sw16; }
                }
                case 17: {
                    this.XL.v5(r15);
                    { $pc16 = 18; continue $sw16; }
                }
                case 5: {
                    this.XL.writeInt(0);
                    { $pc16 = 6; continue $sw16; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> void j6(abcd.ir.a r2, java.util.HashMap<T, java.lang.Integer> r3, xr.b<T> r4) {
        abcd.hr.a r5 = null;
        java.util.Iterator r6 = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    r5 = this.QX.FH(r2);
                    r6 = DW(r3).iterator();
                    $pc17 = 4; continue $sw17;
                }
                case 4: {
                    if (r6.hasNext() == false) { $pc17 = 6; continue $sw17; }
                    r4.j6(r5, r6.next());
                    { $pc17 = 4; continue $sw17; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.yr r5) {
        java.util.HashMap<java.lang.Integer, abcd.aq> r0 = null;
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, abcd.aq>> r1 = null;
        java.util.Map.Entry<java.lang.Integer, abcd.aq> r2 = null;
        int r3 = 0;
        abcd.aq r4 = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    r0 = new java.util.HashMap();
                    r1 = this.Ws.entrySet().iterator();
                    $pc18 = 4; continue $sw18;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc18 = 6; continue $sw18; }
                    r2 = r1.next();
                    r3 = r2.getKey().intValue();
                    r4 = r2.getValue();
                    r0.put(java.lang.Integer.valueOf(r5.tp(r3)), r5.j6(r4));
                    { $pc18 = 4; continue $sw18; }
                }
                case 6: {
                    this.Ws = r0;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.yr r9, abcd.iq r10) {
        abcd.Fr r0 = null;
        abcd.Gn.a r1 = null;
        abcd.iq.a r2 = null;
        int r3 = 0;
        abcd.aq r4 = null;
        int r5 = 0;
        abcd._p r6 = null;
        int r7 = 0;
        abcd.aq r8 = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    r0 = new abcd.Fr();
                    r1 = r10.j6().VH;
                    if (r1.Hw() == false) { $pc19 = 13; continue $sw19; }
                    r2 = r10.DW(r1.FH);
                    r3 = 0;
                    $pc19 = 6; continue $sw19;
                }
                case 6: {
                    if (r3 >= r1.DW) { $pc19 = 18; continue $sw19; }
                    r4 = r2.J0();
                    r5 = r9.tp(r4.u7());
                    if (r0.j6(r5) == true) { $pc19 = 12; continue $sw19; }
                    if (r4.FH() == 0) { $pc19 = 12; continue $sw19; }
                    r6 = r9.j6(r10.j6(r4));
                    j6(r6.DW(), r9, r10);
                    j6(r6.v5(), r9, r10);
                    r7 = j6(r6);
                    r8 = j6(r5, this.Ws.get(java.lang.Integer.valueOf(r5)), r7);
                    this.Ws.put(java.lang.Integer.valueOf(r5), r8);
                    $pc19 = 12; continue $sw19;
                }
                case 12: {
                    r3 = r3 + 1;
                    { $pc19 = 6; continue $sw19; }
                }
                case 18: {
                    return;
                }
                case 13: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(int[] r5, int r6, int r7, abcd.xr.c r8) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    if (r6 >= r7) { $pc20 = 22; continue $sw20; }
                    r0 = r5[((r7 - r6) / 2) + r6];
                    r1 = r6;
                    r2 = r7;
                    $pc20 = 4; continue $sw20;
                }
                case 4: {
                    if (r1 > r2) { $pc20 = 13; continue $sw20; }
                    $pc20 = 6; continue $sw20;
                }
                case 6: {
                    if (r8.j6(r5[r1], r0) >= 0) { $pc20 = 9; continue $sw20; }
                    r1 = r1 + 1;
                    $pc20 = 9; continue $sw20;
                }
                case 9: {
                    if (r8.j6(r0, r5[r2]) >= 0) { $pc20 = 11; continue $sw20; }
                    r2 = r2 - 1;
                    { $pc20 = 9; continue $sw20; }
                }
                case 11: {
                    if (r1 > r2) { $pc20 = 4; continue $sw20; }
                    r3 = r5[r2];
                    r5[r2] = r5[r1];
                    r5[r1] = r3;
                    r1 = r1 + 1;
                    r2 = r2 - 1;
                    { $pc20 = 4; continue $sw20; }
                }
                case 13: {
                    j6(r5, r6, r2, r8);
                    j6(r5, r1, r7, r8);
                    return;
                }
                case 22: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(int[] r2, abcd.xr.c r3) {
        j6(r2, 0, r2.length - 1, r3);
    }

    private void j6(abcd._p.b[] r6, abcd.yr r7, abcd.iq r8) {
        int r0 = 0;
        abcd._p.b r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    r0 = 0;
                    $pc21 = 4; continue $sw21;
                }
                case 4: {
                    if (r0 >= r6.length) { $pc21 = 10; continue $sw21; }
                    r1 = r6[r0];
                    if (r1.DW() == 0) { $pc21 = 8; continue $sw21; }
                    r2 = j6(r1, r7, r8);
                    r6[r0] = new abcd._p.b(r1.FH(), r1.j6(), r2);
                    $pc21 = 9; continue $sw21;
                }
                case 9: {
                    r0 = r0 + 1;
                    { $pc21 = 4; continue $sw21; }
                }
                case 8: {
                    r6[r0] = new abcd._p.b(r1.FH(), r1.j6(), -1);
                    { $pc21 = 9; continue $sw21; }
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int[] j6(abcd.Dr r3) {
        int[] r0 = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = -1;
        $sw22: while (true) {
            switch ($pc22) {
                case -1: {
                    r0 = new int[r3.FH()];
                    r3.DW.DW();
                    $pc22 = 4; continue $sw22;
                }
                case 4: {
                    if (r3.DW.j6() == false) { $pc22 = 6; continue $sw22; }
                    r0[r3.DW.Hw()] = r3.DW.FH();
                    { $pc22 = 4; continue $sw22; }
                }
                case 6: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void u7() {
        abcd.hr r0 = null;
        abcd.hr.a r1 = null;
        int[] r2 = null;
        int r3 = 0;
        java.lang.Throwable $ex23 = null;
        int $pc23 = -1;
        $sw23: while (true) {
            switch ($pc23) {
                case -1: {
                    r0 = this.QX;
                    r1 = r0.FH(r0.v5().FH);
                    r2 = j6(this.Hw);
                    r3 = 0;
                    $pc23 = 4; continue $sw23;
                }
                case 4: {
                    if (r3 >= r2.length) { $pc23 = 6; continue $sw23; }
                    r1.writeInt(r2[r3]);
                    r3 = r3 + 1;
                    { $pc23 = 4; continue $sw23; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void u7(abcd.yr r6) {
        int[] r0 = null;
        abcd.Dr r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex24 = null;
        int $pc24 = -1;
        $sw24: while (true) {
            switch ($pc24) {
                case -1: {
                    r0 = j6(this.FH);
                    j6(r0, new abcd.mr(this));
                    r1 = new abcd.Dr(r0.length);
                    r2 = 0;
                    $pc24 = 4; continue $sw24;
                }
                case 4: {
                    if (r2 >= r0.length) { $pc24 = 6; continue $sw24; }
                    r1.DW(r0[r2], r2);
                    r6.u7(this.FH.j6(r0[r2]), r2);
                    r2 = r2 + 1;
                    { $pc24 = 4; continue $sw24; }
                }
                case 6: {
                    this.FH = r1;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void v5() {
        abcd.ir r0 = this.QX.v5();
        this.QX.j6(r0.j6, 112, 1);
        this.QX.j6(r0.DW, this.FH.FH() * 4, this.FH.FH());
        this.QX.j6(r0.FH, this.Hw.FH() * 4, this.Hw.FH());
        this.QX.j6(r0.Hw, this.v5.size() * 12, this.v5.size());
        this.QX.j6(r0.v5, this.Zo.size() * 8, this.Zo.size());
        this.QX.j6(r0.Zo, this.VH.size() * 8, this.VH.size());
        this.QX.j6(r0.VH, this.Ws.size() * 32, this.Ws.size());
        r0.yS = this.QX.Hw();
    }

    private void v5(abcd.yr r4) {
        this.u7 = j6(this.QX.v5().QX, this.u7, new abcd.or(this), r4);
    }

    public int DW(int r3) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex25 = null;
        int $pc25 = -1;
        $sw25: while (true) {
            switch ($pc25) {
                case -1: {
                    r0 = this.Hw.j6(r3);
                    if (r0 != (-1)) { $pc25 = 6; continue $sw25; }
                    FH();
                    r1 = this.Hw.FH();
                    this.Hw.DW(r3, r1);
                    return r1;
                }
                case 6: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW() {
        abcd.yr r6 = new abcd.yr(this.FH.FH(), this.Hw.FH(), this.v5.size(), this.Zo.size(), this.VH.size());
        v5();
        u7(r6);
        VH(r6);
        this.Zo = j6(this.Zo, r6, new abcd.jr(this, r6));
        gn(r6);
        this.v5 = j6(this.v5, r6, new abcd.kr(this, r6));
        this.VH = j6(this.VH, r6, new abcd.lr(this, r6));
        v5(r6);
        Hw(r6);
        FH(r6);
        DW(r6);
        Zo(r6);
        j6(r6);
        abcd.hr r0 = this.QX;
        this.aM = r0.j6(r0.v5().Ws);
        abcd.hr r1 = this.QX;
        this.XL = r1.DW(r1.v5().J0);
        this.j6 = false;
    }

    public void DW(abcd.iq r2) {
        j6(new abcd.C1612zr(this, r2).j6(), r2);
    }

    public int j6(abcd.Vp r4) {
        java.lang.Integer r0 = null;
        abcd.Vp r5 = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = -1;
        $sw26: while (true) {
            switch ($pc26) {
                case -1: {
                    r0 = this.u7.get(r4);
                    if (r0 != null) { $pc26 = 6; continue $sw26; }
                    FH();
                    r5 = DW(r4);
                    r0 = java.lang.Integer.valueOf(this.u7.size() + 1);
                    this.u7.put(r5, java.lang.Integer.valueOf(r0.intValue()));
                    $pc26 = 6; continue $sw26;
                }
                case 6: {
                    return r0.intValue();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(abcd.Wp r4) {
        int r0 = this.J0.size() + 1;
        this.J0.put(r4, java.lang.Integer.valueOf(r0));
        return r0;
    }

    public int j6(abcd.Xp r4) {
        java.lang.Integer r0 = null;
        java.lang.Throwable $ex27 = null;
        int $pc27 = -1;
        $sw27: while (true) {
            switch ($pc27) {
                case -1: {
                    r0 = this.tp.get(r4);
                    if (r0 != null) { $pc27 = 6; continue $sw27; }
                    FH();
                    r0 = java.lang.Integer.valueOf(this.tp.size() + 1);
                    this.tp.put(r4, java.lang.Integer.valueOf(r0.intValue()));
                    $pc27 = 6; continue $sw27;
                }
                case 6: {
                    return r0.intValue();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(abcd.Yp r4) {
        java.lang.Integer r0 = null;
        java.lang.Throwable $ex28 = null;
        int $pc28 = -1;
        $sw28: while (true) {
            switch ($pc28) {
                case -1: {
                    r0 = this.EQ.get(r4);
                    if (r0 != null) { $pc28 = 6; continue $sw28; }
                    FH();
                    r0 = java.lang.Integer.valueOf(this.EQ.size() + 1);
                    this.EQ.put(r4, java.lang.Integer.valueOf(r0.intValue()));
                    $pc28 = 6; continue $sw28;
                }
                case 6: {
                    return r0.intValue();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(abcd._p r4) {
        int r0 = this.J8.size() + 1;
        this.J8.put(r4, java.lang.Integer.valueOf(r0));
        return r0;
    }

    public int j6(abcd.fr r4) {
        java.lang.Integer r0 = null;
        abcd.fr r5 = null;
        java.lang.Throwable $ex29 = null;
        int $pc29 = -1;
        $sw29: while (true) {
            switch ($pc29) {
                case -1: {
                    r0 = this.gn.get(r4);
                    if (r0 != null) { $pc29 = 6; continue $sw29; }
                    FH();
                    r5 = DW(r4);
                    r0 = java.lang.Integer.valueOf(this.gn.size() + 1);
                    this.gn.put(r5, java.lang.Integer.valueOf(r0.intValue()));
                    $pc29 = 6; continue $sw29;
                }
                case 6: {
                    return r0.intValue();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(abcd.jq r4) {
        java.lang.Integer r0 = null;
        java.lang.Throwable $ex30 = null;
        int $pc30 = -1;
        $sw30: while (true) {
            switch ($pc30) {
                case -1: {
                    r0 = this.we.get(r4);
                    if (r0 != null) { $pc30 = 6; continue $sw30; }
                    FH();
                    r0 = java.lang.Integer.valueOf(this.we.size() + 1);
                    this.we.put(r4, java.lang.Integer.valueOf(r0.intValue()));
                    $pc30 = 6; continue $sw30;
                }
                case 6: {
                    return r0.intValue();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(abcd.lq r4) {
        java.lang.Integer r0 = null;
        abcd.lq r5 = null;
        java.lang.Throwable $ex31 = null;
        int $pc31 = -1;
        $sw31: while (true) {
            switch ($pc31) {
                case -1: {
                    r0 = this.Zo.get(r4);
                    if (r0 != null) { $pc31 = 6; continue $sw31; }
                    FH();
                    r5 = DW(r4);
                    r0 = java.lang.Integer.valueOf(this.Zo.size());
                    this.Zo.put(r5, java.lang.Integer.valueOf(r0.intValue()));
                    $pc31 = 6; continue $sw31;
                }
                case 6: {
                    return r0.intValue();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(abcd.nq r4) {
        java.lang.Integer r0 = null;
        abcd.nq r5 = null;
        java.lang.Throwable $ex32 = null;
        int $pc32 = -1;
        $sw32: while (true) {
            switch ($pc32) {
                case -1: {
                    r0 = this.VH.get(r4);
                    if (r0 != null) { $pc32 = 6; continue $sw32; }
                    FH();
                    r5 = DW(r4);
                    r0 = java.lang.Integer.valueOf(this.VH.size());
                    this.VH.put(r5, java.lang.Integer.valueOf(r0.intValue()));
                    $pc32 = 6; continue $sw32;
                }
                case 6: {
                    return r0.intValue();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(abcd.qq r4) {
        java.lang.Integer r0 = null;
        abcd.qq r5 = null;
        java.lang.Throwable $ex33 = null;
        int $pc33 = -1;
        $sw33: while (true) {
            switch ($pc33) {
                case -1: {
                    r0 = this.v5.get(r4);
                    if (r0 != null) { $pc33 = 6; continue $sw33; }
                    FH();
                    r5 = DW(r4);
                    r0 = java.lang.Integer.valueOf(this.v5.size());
                    this.v5.put(r5, java.lang.Integer.valueOf(r0.intValue()));
                    $pc33 = 6; continue $sw33;
                }
                case 6: {
                    return r0.intValue();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(byte[] r2, int r3) {
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        java.lang.Throwable $ex34 = null;
        int $pc34 = -1;
        $sw34: while (true) {
            switch ($pc34) {
                case -1: {
                    r4 = this.DW.j6(r2, r3);
                    r5 = this.FH.j6(r4);
                    if (r5 != (-1)) { $pc34 = 6; continue $sw34; }
                    FH();
                    r6 = this.FH.FH();
                    this.FH.DW(r4, r6);
                    return r6;
                }
                case 6: {
                    return r5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        abcd.hr r0 = this.QX;
        r0.FH(r0.v5().Ws.DW);
        abcd.hr r1 = this.QX;
        FH(r1.Hw(r1.v5().J0.DW));
        Hw();
        Zo();
        VH();
        gn();
        u7();
        j6(this.QX.v5().Hw, this.v5, new abcd.ur(this));
        j6(this.QX.v5().v5, this.Zo, new abcd.vr(this));
        j6(this.QX.v5().Zo, this.VH, new abcd.wr(this));
        this.QX.FH();
    }

    public void j6(int r2, abcd.aq r3) {
        this.Ws.put(java.lang.Integer.valueOf(r2), r3);
    }

    public void j6(abcd.iq r2) {
        DW(new abcd.C1612zr(this, r2).j6(), r2);
    }

    public void j6(java.io.OutputStream r2) {
        this.QX.j6(r2);
    }

    public boolean j6(int r2) {
        return this.Ws.containsKey(java.lang.Integer.valueOf(r2));
    }
}
