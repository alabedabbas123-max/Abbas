package abcd;

public class cO extends abcd.dO {
    private java.util.List ei;

    private class a {
        final java.lang.Object DW;
        final java.lang.String FH;
        final java.lang.String Hw;
        final abcd.WN Zo;
        final java.security.PrivateKey j6;
        final abcd.WN v5;

        abcd.kO j6(java.security.SecureRandom r4, java.security.Provider r5, boolean r6) {
            java.lang.String r0 = java.lang.String.valueOf(abcd.eO.j6.j6(this.FH)) + "with" + abcd.eO.j6.DW(this.Hw);
            abcd.nO r1 = new abcd.nO(new abcd.GP());
            if (r6 == false) goto L5;
            r1.j6(this.v5);
        L5:
            r1.j6(!r6);
            r1.DW(this.Zo);
            abcd.JP r7 = new abcd.JP(r0);     // Catch: java.lang.IllegalArgumentException -> L15
            r7.j6(r4);     // Catch: java.lang.IllegalArgumentException -> L15
            if (r5 == null) goto L9;
            r7.j6(r5);
        L9:
            abcd.InterfacevP r8 = r7.j6(this.j6);
            java.lang.Object r9 = this.DW;
            if ((r9 instanceof java.security.cert.X509Certificate) == false) goto L14;
            return r1.j6(r8, (java.security.cert.X509Certificate) r9);
        L14:
            return r1.j6(r8, (byte[]) r9);
        L15:
            e = move-exception;
            throw new java.security.NoSuchAlgorithmException(e.getMessage());
        }
    }

    public cO() {
        this.ei = new java.util.ArrayList();
    }

    public abcd.aO j6(abcd.InterfacefO r13, boolean r14) {
        if (this.ei.isEmpty() == false) goto L37;
        abcd.rL r0 = new abcd.rL();
        abcd.rL r1 = new abcd.rL();
        this.vy.clear();
        java.util.Iterator r2 = this.gW.iterator();
    L6:
        if (r2.hasNext() == false) goto L7;
        abcd.mO r3 = (abcd.mO) r2.next();
        r0.j6(abcd.eO.j6.j6(r3.j6()));
        r1.j6(r3.DW());
        goto L6
    L7:
        abcd.zL r4 = r13.getContentType();
        abcd.HL r5 = null;
        if (r13 == null) goto L19;
        if (r14 == false) goto L11;
        java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream();
    L12:
        java.io.OutputStream r7 = abcd.gO.j6(abcd.gO.j6(this.BT, r6));
        r13.j6(r7);     // Catch: java.io.IOException -> L16
        r7.close();     // Catch: java.io.IOException -> L16
        if (r14 == false) goto L19;
        abcd.SL r8 = new abcd.SL(r6.toByteArray());
    L20:
        java.util.Iterator r9 = this.BT.iterator();
    L22:
        if (r9.hasNext() == false) goto L24;
        abcd.kO r15 = (abcd.kO) r9.next();
        abcd.YM r10 = r15.j6(r4);
        r0.j6(r10.v5());
        r1.j6(r10);
        byte[] r16 = r15.j6();
        if (r16 == null) goto L22;
        this.vy.put(r10.v5().v5().tp(), r16);
        goto L22
    L24:
        if (this.er.size() == 0) goto L26;
        abcd.HL r11 = abcd.gO.j6(this.er);
    L28:
        if (this.yS.size() == 0) goto L30;
        r5 = abcd.gO.j6(this.yS);
    L30:
        abcd.UM r12 = new abcd.UM(r4, r8);
        return new abcd.aO(r13, new abcd.UM(abcd.TM.DW, new abcd.WM(new abcd.vM(r0), r12, r11, r5, new abcd.vM(r1))));
    L26:
        r11 = null;
    L16:
        e = move-exception;
        throw new abcd.XN("data processing exception: " + e.getMessage(), e);
    L11:
        r6 = null;
    L19:
        r8 = null;
        goto L20
    L37:
        throw new java.lang.IllegalStateException("this method can only be used with SignerInfoGenerator");
    }

    public abcd.aO j6(java.lang.String r7, abcd.YN r8, boolean r9, java.lang.String r10, boolean r11) {
        return j6(r7, r8, r9, abcd.gO.j6(r10), r11);
    }

    public abcd.aO j6(java.lang.String r5, abcd.YN r6, boolean r7, java.security.Provider r8, boolean r9) {
        if (r5 != null) goto L4;
        boolean r0 = true;
    L5:
        if (r0 == false) goto L7;
        abcd.zL r10 = null;
    L8:
        java.util.Iterator r1 = this.ei.iterator();
    L10:
        if (r1.hasNext() == false) goto L11;
        abcd.cO.a r2 = (abcd.cO.a) r1.next();
        this.BT.add(r2.j6(this.P8, r8, r9));     // Catch: java.security.cert.CertificateEncodingException -> L20 java.io.IOException -> L23 abcd.BP -> L26
    L26:
        e = move-exception;
        throw new abcd.XN("exception creating signerInf", e);
    L23:
        e = move-exception;
        throw new abcd.XN("exception encoding attributes", e);
    L20:
        e = move-exception;
        throw new abcd.XN("error creating sid.", e);
    L11:
        this.ei.clear();
        if (r6 == null) goto L16;
        return j6(new abcd.bO(this, r10, r6), r7);
    L16:
        return j6(new abcd.VN(r10), r7);
    L7:
        r10 = new abcd.zL(r5);
        goto L8
    L4:
        r0 = false;
        goto L5
    }
}
