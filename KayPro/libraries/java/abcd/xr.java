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
        java.util.Vector r0 = new java.util.Vector(r3.size());
        r0.setSize(r3.size());
        java.util.Iterator<java.util.Map.Entry<T, java.lang.Integer>> r4 = r3.entrySet().iterator();
    L4:
        if (r4.hasNext() == false) goto L6;
        java.util.Map.Entry<T, java.lang.Integer> r1 = r4.next();
        r0.set(r1.getValue().intValue(), r1.getKey());
        goto L4
    L6:
        return r0;
    }

    private void DW(abcd.yr r4) {
        this.J0 = j6(this.QX.v5().aM, this.J0, new abcd.rr(this), r4);
    }

    private void DW(abcd.yr r21, abcd.iq r22) {
        abcd.Gn.a r3 = r22.j6().VH;
        if (r3.Hw() == false) goto L15;
        abcd.iq.a r4 = r22.DW(r3.FH);
        int r6 = 0;
    L6:
        if (r6 >= r3.DW) goto L19;
        abcd.aq r7 = r4.J0();
        int r8 = r21.tp(r7.u7());
        if (j6(r8) == true) goto L14;
        int r9 = r7.DW();
        if (r9 == 0) goto L12;
        int r17 = j6(r21.j6(r22.DW(r9).tp()));
    L13:
        j6(r8, new abcd.aq(null, 0, r8, r7.j6(), r21.tp(r7.gn()), r21.EQ(r7.Hw()), r21.u7(r7.Zo()), r17, 0, r21.v5(r7.VH())));
        goto L14
    L12:
        r17 = 0;
    L14:
        r6 = r6 + 1;
        goto L6
    L19:
        return;
    }

    private void FH() {
        if (this.j6 == false) goto L6;
        return;
    L6:
        throw new java.lang.IllegalStateException("Too many classes / methods / fields / strings.\nConsider using \"multidexenabled true\" or \"minsdkversion 21\" in gradle files");
    }

    private void FH(int r9) {
        java.util.Iterator<abcd._p> r0 = this.J8.keySet().iterator();
    L4:
        if (r0.hasNext() == false) goto L12;
        abcd._p.b[] r1 = r0.next().j6();
        int r2 = r1.length;
        int r4 = 0;
    L6:
        if (r4 >= r2) goto L4;
        abcd._p.b r5 = r1[r4];
        if (r5.DW() == (-1)) goto L10;
        r5.j6(r5.DW() + r9);
    L11:
        r4 = r4 + 1;
        goto L6
    L10:
        r5.j6(0);
        goto L11
    }

    private void FH(abcd.yr r4) {
        this.EQ = j6(this.QX.v5().tp, this.EQ, new abcd.qr(this), r4);
    }

    private void Hw() {
        abcd.Dr r1 = new abcd.Dr();
        this.J8 = j6(this.QX.v5().we, this.J8, new abcd.sr(this, r1), null);
        java.util.HashMap<java.lang.Integer, abcd.aq> r2 = new java.util.HashMap();
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, abcd.aq>> r3 = this.Ws.entrySet().iterator();
    L4:
        if (r3.hasNext() == false) goto L10;
        java.util.Map.Entry<java.lang.Integer, abcd.aq> r4 = r3.next();
        java.lang.Integer r5 = r4.getKey();
        abcd.aq r6 = r4.getValue();
        int r9 = r5.intValue();
        int r10 = r6.j6();
        int r11 = r6.gn();
        int r12 = r6.Hw();
        int r13 = r6.Zo();
        int r14 = r6.DW();
        if (r6.FH() != 0) goto L8;
        int r16 = 0;
    L9:
        int r15 = r16;
        r2.put(r5, new abcd.aq(null, 0, r9, r10, r11, r12, r13, r14, r15, r6.VH()));
        goto L4
    L8:
        r16 = r1.j6(r6.FH());
        goto L9
    L10:
        this.Ws = r2;
    }

    private void Hw(abcd.yr r4) {
        this.tp = j6(this.QX.v5().EQ, this.tp, new abcd.pr(this), r4);
    }

    private void VH() {
        abcd.hr r0 = this.QX;
        int r1 = r0.j6(r0.v5().J8, this.DW.j6(), this.DW.FH(), this.DW.DW()).tp();
        abcd.Dr r2 = new abcd.Dr();
        this.FH.DW.DW();
    L4:
        if (this.FH.DW.j6() == false) goto L6;
        int r3 = this.FH.DW.FH();
        int r4 = r3 + r1;
        r2.DW(r4, this.FH.DW.Hw());
        goto L4
    L6:
        this.FH = r2;
    }

    private void VH(abcd.yr r6) {
        abcd.Dr r0 = new abcd.Dr(this.Hw.FH());
        this.Hw.DW.DW();
    L4:
        if (this.Hw.DW.j6() == false) goto L6;
        int r1 = this.Hw.DW.FH();
        int r2 = this.Hw.DW.Hw();
        r0.DW(r6.u7(r1), r2);
        goto L4
    L6:
        int[] r3 = j6(r0);
        j6(r3, new abcd.nr(this));
        this.Hw.j6();
        int r4 = 0;
    L8:
        if (r4 >= r3.length) goto L10;
        this.Hw.DW(r3[r4], r4);
        r6.tp(r0.j6(r3[r4]), r4);
        r4 = r4 + 1;
        goto L8
    }

    private void Zo() {
        abcd.Dr r6 = new abcd.Dr();
        java.util.HashMap r0 = j6(this.gn);
        abcd.Fr r7 = new abcd.Fr();
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, abcd.aq>> r1 = this.Ws.entrySet().iterator();
    L3:
        int r8 = 0;
        if (r1.hasNext() == false) goto L20;
        java.util.Map.Entry<java.lang.Integer, abcd.aq> r2 = r1.next();
        int r3 = r2.getKey().intValue();
        abcd.aq r4 = r2.getValue();
        r7.DW(r3);
        int r5 = r4.gn();
        if (r5 == 0) goto L11;
        if (this.Ws.containsKey(java.lang.Integer.valueOf(r5)) == false) goto L11;
        r6.DW(r3, r5);
    L11:
        if (r4.Hw() == 0) goto L3;
        short[] r9 = ((abcd.fr) r0.get(java.lang.Integer.valueOf(r4.Hw()))).Hw();
        int r10 = r9.length;
    L13:
        if (r8 >= r10) goto L3;
        short r11 = r9[r8];
        if (r11 == 0) goto L19;
        if (this.Ws.containsKey(java.lang.Short.valueOf(r11)) == false) goto L19;
        r6.DW(r3, r11);
    L19:
        r8 = r8 + 1;
        goto L13
    L20:
        java.util.ArrayList r12 = new java.util.ArrayList();
        abcd.Fr r13 = new abcd.Fr();
        r7.FH.DW();
    L22:
        if (r7.FH.j6() == false) goto L24;
        j6(r7.FH.FH(), r13, r12, r7, r6);
        goto L22
    L24:
        abcd.hr r14 = this.QX;
        abcd.hr.a r15 = r14.FH(r14.v5().VH);
    L26:
        if (r8 >= r12.size()) goto L28;
        this.Ws.get(r12.get(r8)).j6(r15);
        r8 = r8 + 1;
        goto L26
    }

    private void Zo(abcd.yr r4) {
        this.we = j6(this.QX.v5().XL, this.we, new abcd.tr(this), r4);
    }

    private void gn() {
        abcd.hr r0 = this.QX;
        abcd.hr.a r1 = r0.FH(r0.v5().DW);
        int[] r2 = j6(this.FH);
        int r3 = 0;
    L4:
        if (r3 >= r2.length) goto L6;
        r1.writeInt(r2[r3]);
        r3 = r3 + 1;
        goto L4
    }

    private void gn(abcd.yr r9) {
        if (this.gn.size() != 0) goto L5;
        return;
    L5:
        java.util.HashMap r0 = new java.util.HashMap();
        java.util.Vector r1 = new java.util.Vector(this.gn.size());
        r1.setSize(this.gn.size());
        java.util.Iterator<java.util.Map.Entry<abcd.fr, java.lang.Integer>> r2 = this.gn.entrySet().iterator();
    L7:
        if (r2.hasNext() == false) goto L9;
        java.util.Map.Entry<abcd.fr, java.lang.Integer> r3 = r2.next();
        abcd.fr r4 = r3.getKey();
        int r5 = r3.getValue().intValue();
        abcd.fr r6 = r9.j6(r4);
        r0.put(r6, java.lang.Integer.valueOf(r5));
        r1.set(r5 - 1, r6);
        goto L7
    L9:
        this.gn = null;
        java.util.Collections.sort(r1);
        java.util.HashMap r7 = new java.util.HashMap();
        abcd.Dr r8 = new abcd.Dr();
        int r10 = 0;
        r8.DW(0, 0);
        int r11 = 0;
    L11:
        if (r11 >= r1.size()) goto L13;
        abcd.fr r12 = (abcd.fr) r1.get(r11);
        r11 = r11 + 1;
        r8.DW(r11, ((java.lang.Integer) r0.get(r12)).intValue());
        r7.put(r12, java.lang.Integer.valueOf(r11));
        goto L11
    L13:
        java.util.HashMap<abcd.fr, java.lang.Integer> r13 = new java.util.HashMap();
        abcd.hr r14 = this.QX;
        abcd.hr.a r15 = r14.j6(r14.v5().u7);
    L15:
        if (r10 >= r1.size()) goto L17;
        abcd.fr r16 = (abcd.fr) r1.get(r10);
        int r17 = r15.u7();
        r13.put(r16, java.lang.Integer.valueOf(r17));
        r10 = r10 + 1;
        r9.EQ(r8.j6(r10), r17);
        r15.j6(r16);
        goto L15
    L17:
        this.gn = r13;
        this.QX.DW(r1.size());
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
        if (r10.size() != 0) goto L5;
        return r10;
    L5:
        abcd.hr.a r13 = this.QX.j6(r9);
        org.codehaus.groovy.ast.tools.WideningCategories.AnonymousClass1 r0 = (java.util.HashMap<T, java.lang.Integer>) new java.util.HashMap();
        java.util.Iterator<java.util.Map.Entry<T, java.lang.Integer>> r7 = r10.entrySet().iterator();
    L7:
        if (r7.hasNext() == false) goto L9;
        java.util.Map.Entry<T, java.lang.Integer> r1 = r7.next();
        java.lang.Object r3 = r11.j6(r1.getKey(), r12);
        int r5 = r13.u7();
        r0.put(r3, java.lang.Integer.valueOf(r5));
        r11.j6(r13, r3, r1.getValue().intValue(), r5, r12);
        goto L7
    L9:
        this.QX.DW(r10.size());
        return r0;
    }

    private <K, V> java.util.HashMap<V, K> j6(java.util.HashMap<K, V> r4) {
        java.util.HashMap<V, K> r0 = new java.util.HashMap();
        java.util.Iterator<java.util.Map.Entry<K, V>> r5 = r4.entrySet().iterator();
    L4:
        if (r5.hasNext() == false) goto L6;
        java.util.Map.Entry<K, V> r1 = r5.next();
        r0.put(r1.getValue(), r1.getKey());
        goto L4
    L6:
        return r0;
    }

    private static <T extends java.lang.Comparable<T>> java.util.HashMap<T, java.lang.Integer> j6(java.util.HashMap<T, java.lang.Integer> r4, abcd.yr r5, xr.a<T> r6) {
        java.util.HashMap r0 = new java.util.HashMap(r4.size());
        java.util.Iterator<java.util.Map.Entry<T, java.lang.Integer>> r1 = r4.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        java.util.Map.Entry<T, java.lang.Integer> r2 = r1.next();
        T r3 = r2.getKey();
        int r7 = r2.getValue().intValue();
        r0.put(r6.j6(r3, r5), java.lang.Integer.valueOf(r7));
        goto L4
    L6:
        java.util.List r8 = DW(r0);
        java.util.Collections.sort(r8);
        org.codehaus.groovy.ast.tools.WideningCategories.AnonymousClass1 r9 = (java.util.HashMap<T, java.lang.Integer>) new java.util.HashMap(r4.size());
        int r10 = 0;
    L8:
        if (r10 >= r8.size()) goto L10;
        r9.put(r8.get(r10), java.lang.Integer.valueOf(r10));
        r6.j6(((java.lang.Integer) r0.get(r8.get(r10))).intValue(), r10);
        r10 = r10 + 1;
        goto L8
    L10:
        return r9;
    }

    private void j6(int r9, abcd.Fr r10, java.util.List<java.lang.Integer> r11, abcd.Fr r12, abcd.Dr r13) {
        if (r10.j6(r9) == true) goto L17;
        r10.DW(r9);
        abcd.Dr.a r0 = r13.DW();
        r0.j6(r9);
    L6:
        if (r0.j6() == false) goto L10;
        int r3 = r0.Hw();
        if (r12.j6(r3) == false) goto L6;
        j6(r3, r10, r11, r12, r13);
        goto L6
    L10:
        r11.add(java.lang.Integer.valueOf(r9));
        return;
    }

    private void j6(abcd.Dr r5, int r6, abcd.bq.a r7, abcd.yr r8) {
        int r0 = this.XL.EQ() - r6;
        r5.DW(r7.FH(), r0);
        int r9 = r7.DW();
        int[] r10 = r7.Hw();
        int[] r11 = r7.j6();
        if (r9 == (-1)) goto L5;
        this.XL.VH(-r10.length);
    L6:
        int r1 = 0;
    L8:
        if (r1 >= r10.length) goto L10;
        this.XL.DW(r8.tp(r10[r1]));
        this.XL.DW(r11[r1]);
        r1 = r1 + 1;
        goto L8
    L10:
        if (r9 == (-1)) goto L14;
        this.XL.DW(r9);
        return;
    L14:
        return;
    L5:
        this.XL.VH(r10.length);
        goto L6
    }

    private void j6(abcd.iq.a r5, abcd.yr r6) {
        this.aM.DW(r5.rN());
        int r0 = r5.rN();
        this.aM.DW(r0);
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        this.aM.gn(r6.u7(r5.er()));
        r1 = r1 + 1;
    L5:
        byte r2 = r5.readByte();
        this.aM.writeByte(r2);
        if (r2 != 9) goto L7;
        this.aM.gn(r6.u7(r5.er()));
        goto L5
    L7:
        switch(r2) {
            case 0: goto L15;
            case 1: goto L14;
            case 2: goto L13;
            case 3: goto L10;
            case 4: goto L10;
            case 5: goto L9;
            case 6: goto L9;
            default: goto L5;
        };
    L9:
        this.aM.DW(r5.rN());
        goto L5
    L10:
        this.aM.DW(r5.rN());
        this.aM.gn(r6.u7(r5.er()));
        this.aM.gn(r6.tp(r5.er()));
        if (r2 != 4) goto L5;
        this.aM.gn(r6.u7(r5.er()));
        goto L5
    L13:
        this.aM.VH(r5.U2());
        goto L5
    L14:
        this.aM.DW(r5.rN());
        goto L5
    L15:
        this.QX.v5().Ws.DW++;
    }

    private void j6(abcd.iq r8, abcd.bq r9, abcd.yr r10) {
        this.XL.VH();
        this.XL.u7(r9.Zo());
        this.XL.u7(r9.FH());
        this.XL.u7(r9.v5());
        abcd.bq.b[] r0 = r9.VH();
        this.XL.u7(r0.length);
        int r1 = r9.DW();
        int r2 = 0;
        if (r1 == 0) goto L5;
        abcd.iq.a r11 = r8.DW(r1);
        int r3 = this.aM.u7();
        j6(r11, r10);
        this.XL.writeInt(r3);
    L6:
        short[] r12 = r9.Hw();
        abcd.Br.j6(r12, r10);
        this.XL.writeInt(r12.length);
        this.XL.j6(r12);
        if (r0.length > 0) goto L9;
    L18:
        this.XL.Zo();
        return;
    L9:
        if ((r12.length % 2) != 1) goto L11;
        this.XL.j6(0);
    L11:
        int r13 = this.XL.EQ();
        this.XL.Zo(r0.length * 8);
        abcd.bq.a[] r14 = r9.j6();
        int r4 = this.XL.EQ();
        this.XL.DW(r14.length);
        abcd.Dr r5 = new abcd.Dr();
        int r6 = r14.length;
        int r7 = 0;
    L12:
        if (r7 >= r6) goto L14;
        j6(r5, r4, r14[r7], r10);
        r7 = r7 + 1;
        goto L12
    L14:
        int r15 = this.XL.EQ();
        this.XL.v5(r13);
        int r16 = r0.length;
    L15:
        if (r2 >= r16) goto L17;
        abcd.bq.b r17 = r0[r2];
        this.XL.writeInt(r17.FH());
        this.XL.u7(r17.DW());
        this.XL.u7(r5.j6(r17.j6()));
        r2 = r2 + 1;
        goto L15
    L17:
        this.XL.v5(r15);
        goto L18
    L5:
        this.XL.writeInt(0);
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> void j6(abcd.ir.a r2, java.util.HashMap<T, java.lang.Integer> r3, xr.b<T> r4) {
        abcd.hr.a r5 = this.QX.FH(r2);
        java.util.Iterator r6 = DW(r3).iterator();
    L4:
        if (r6.hasNext() == false) goto L6;
        r4.j6(r5, r6.next());
        goto L4
    }

    private void j6(abcd.yr r5) {
        java.util.HashMap<java.lang.Integer, abcd.aq> r0 = new java.util.HashMap();
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, abcd.aq>> r1 = this.Ws.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        java.util.Map.Entry<java.lang.Integer, abcd.aq> r2 = r1.next();
        int r3 = r2.getKey().intValue();
        abcd.aq r4 = r2.getValue();
        r0.put(java.lang.Integer.valueOf(r5.tp(r3)), r5.j6(r4));
        goto L4
    L6:
        this.Ws = r0;
    }

    private void j6(abcd.yr r9, abcd.iq r10) {
        abcd.Fr r0 = new abcd.Fr();
        abcd.Gn.a r1 = r10.j6().VH;
        if (r1.Hw() == false) goto L13;
        abcd.iq.a r2 = r10.DW(r1.FH);
        int r3 = 0;
    L6:
        if (r3 >= r1.DW) goto L18;
        abcd.aq r4 = r2.J0();
        int r5 = r9.tp(r4.u7());
        if (r0.j6(r5) == true) goto L12;
        if (r4.FH() == 0) goto L12;
        abcd._p r6 = r9.j6(r10.j6(r4));
        j6(r6.DW(), r9, r10);
        j6(r6.v5(), r9, r10);
        int r7 = j6(r6);
        abcd.aq r8 = j6(r5, this.Ws.get(java.lang.Integer.valueOf(r5)), r7);
        this.Ws.put(java.lang.Integer.valueOf(r5), r8);
    L12:
        r3 = r3 + 1;
        goto L6
    L18:
        return;
    }

    private static void j6(int[] r5, int r6, int r7, abcd.xr.c r8) {
        if (r6 >= r7) goto L22;
        int r0 = r5[((r7 - r6) / 2) + r6];
        int r1 = r6;
        int r2 = r7;
    L4:
        if (r1 > r2) goto L13;
    L6:
        if (r8.j6(r5[r1], r0) >= 0) goto L9;
        r1 = r1 + 1;
    L9:
        if (r8.j6(r0, r5[r2]) >= 0) goto L11;
        r2 = r2 - 1;
        goto L9
    L11:
        if (r1 > r2) goto L4;
        int r3 = r5[r2];
        r5[r2] = r5[r1];
        r5[r1] = r3;
        r1 = r1 + 1;
        r2 = r2 - 1;
        goto L4
    L13:
        j6(r5, r6, r2, r8);
        j6(r5, r1, r7, r8);
        return;
    }

    public static void j6(int[] r2, abcd.xr.c r3) {
        j6(r2, 0, r2.length - 1, r3);
    }

    private void j6(abcd._p.b[] r6, abcd.yr r7, abcd.iq r8) {
        int r0 = 0;
    L4:
        if (r0 >= r6.length) goto L10;
        abcd._p.b r1 = r6[r0];
        if (r1.DW() == 0) goto L8;
        int r2 = j6(r1, r7, r8);
        r6[r0] = new abcd._p.b(r1.FH(), r1.j6(), r2);
    L9:
        r0 = r0 + 1;
        goto L4
    L8:
        r6[r0] = new abcd._p.b(r1.FH(), r1.j6(), -1);
        goto L9
    }

    private static int[] j6(abcd.Dr r3) {
        int[] r0 = new int[r3.FH()];
        r3.DW.DW();
    L4:
        if (r3.DW.j6() == false) goto L6;
        r0[r3.DW.Hw()] = r3.DW.FH();
        goto L4
    L6:
        return r0;
    }

    private void u7() {
        abcd.hr r0 = this.QX;
        abcd.hr.a r1 = r0.FH(r0.v5().FH);
        int[] r2 = j6(this.Hw);
        int r3 = 0;
    L4:
        if (r3 >= r2.length) goto L6;
        r1.writeInt(r2[r3]);
        r3 = r3 + 1;
        goto L4
    }

    private void u7(abcd.yr r6) {
        int[] r0 = j6(this.FH);
        j6(r0, new abcd.mr(this));
        abcd.Dr r1 = new abcd.Dr(r0.length);
        int r2 = 0;
    L4:
        if (r2 >= r0.length) goto L6;
        r1.DW(r0[r2], r2);
        r6.u7(this.FH.j6(r0[r2]), r2);
        r2 = r2 + 1;
        goto L4
    L6:
        this.FH = r1;
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
        int r0 = this.Hw.j6(r3);
        if (r0 != (-1)) goto L6;
        FH();
        int r1 = this.Hw.FH();
        this.Hw.DW(r3, r1);
        return r1;
    L6:
        return r0;
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
        java.lang.Integer r0 = this.u7.get(r4);
        if (r0 != null) goto L6;
        FH();
        abcd.Vp r5 = DW(r4);
        r0 = java.lang.Integer.valueOf(this.u7.size() + 1);
        this.u7.put(r5, java.lang.Integer.valueOf(r0.intValue()));
    L6:
        return r0.intValue();
    }

    public int j6(abcd.Wp r4) {
        int r0 = this.J0.size() + 1;
        this.J0.put(r4, java.lang.Integer.valueOf(r0));
        return r0;
    }

    public int j6(abcd.Xp r4) {
        java.lang.Integer r0 = this.tp.get(r4);
        if (r0 != null) goto L6;
        FH();
        r0 = java.lang.Integer.valueOf(this.tp.size() + 1);
        this.tp.put(r4, java.lang.Integer.valueOf(r0.intValue()));
    L6:
        return r0.intValue();
    }

    public int j6(abcd.Yp r4) {
        java.lang.Integer r0 = this.EQ.get(r4);
        if (r0 != null) goto L6;
        FH();
        r0 = java.lang.Integer.valueOf(this.EQ.size() + 1);
        this.EQ.put(r4, java.lang.Integer.valueOf(r0.intValue()));
    L6:
        return r0.intValue();
    }

    public int j6(abcd._p r4) {
        int r0 = this.J8.size() + 1;
        this.J8.put(r4, java.lang.Integer.valueOf(r0));
        return r0;
    }

    public int j6(abcd.fr r4) {
        java.lang.Integer r0 = this.gn.get(r4);
        if (r0 != null) goto L6;
        FH();
        abcd.fr r5 = DW(r4);
        r0 = java.lang.Integer.valueOf(this.gn.size() + 1);
        this.gn.put(r5, java.lang.Integer.valueOf(r0.intValue()));
    L6:
        return r0.intValue();
    }

    public int j6(abcd.jq r4) {
        java.lang.Integer r0 = this.we.get(r4);
        if (r0 != null) goto L6;
        FH();
        r0 = java.lang.Integer.valueOf(this.we.size() + 1);
        this.we.put(r4, java.lang.Integer.valueOf(r0.intValue()));
    L6:
        return r0.intValue();
    }

    public int j6(abcd.lq r4) {
        java.lang.Integer r0 = this.Zo.get(r4);
        if (r0 != null) goto L6;
        FH();
        abcd.lq r5 = DW(r4);
        r0 = java.lang.Integer.valueOf(this.Zo.size());
        this.Zo.put(r5, java.lang.Integer.valueOf(r0.intValue()));
    L6:
        return r0.intValue();
    }

    public int j6(abcd.nq r4) {
        java.lang.Integer r0 = this.VH.get(r4);
        if (r0 != null) goto L6;
        FH();
        abcd.nq r5 = DW(r4);
        r0 = java.lang.Integer.valueOf(this.VH.size());
        this.VH.put(r5, java.lang.Integer.valueOf(r0.intValue()));
    L6:
        return r0.intValue();
    }

    public int j6(abcd.qq r4) {
        java.lang.Integer r0 = this.v5.get(r4);
        if (r0 != null) goto L6;
        FH();
        abcd.qq r5 = DW(r4);
        r0 = java.lang.Integer.valueOf(this.v5.size());
        this.v5.put(r5, java.lang.Integer.valueOf(r0.intValue()));
    L6:
        return r0.intValue();
    }

    public int j6(byte[] r2, int r3) {
        int r4 = this.DW.j6(r2, r3);
        int r5 = this.FH.j6(r4);
        if (r5 != (-1)) goto L6;
        FH();
        int r6 = this.FH.FH();
        this.FH.DW(r4, r6);
        return r6;
    L6:
        return r5;
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
