package abcd;

public class kO {
    private final abcd.WN DW;
    private final abcd.WN FH;
    private final abcd.InterfacevP Hw;
    private final abcd._N VH;
    private final abcd.InterfaceyP Zo;
    private byte[] gn;
    private final abcd.XM j6;
    private abcd.SN u7;
    private final abcd.InterfacezP v5;

    kO(abcd.XM r7, abcd.InterfacevP r8, abcd.AP r9, abcd._N r10) {
        this(r7, r8, r9, r10, false);
    }

    kO(abcd.XM r2, abcd.InterfacevP r3, abcd.AP r4, abcd._N r5, abcd.WN r6, abcd.WN r7) {
        this.Zo = new abcd.wP();
        this.gn = null;
        this.j6 = r2;
        this.Hw = r3;
        if (r4 == null) goto L5;
        this.v5 = r4.j6(this.Zo.j6(r3.DW()));
    L6:
        this.DW = r6;
        this.FH = r7;
        this.VH = r5;
        return;
    L5:
        this.v5 = null;
        goto L6
    }

    kO(abcd.XM r2, abcd.InterfacevP r3, abcd.AP r4, abcd._N r5, boolean r6) {
        this.Zo = new abcd.wP();
        this.gn = null;
        this.j6 = r2;
        this.Hw = r3;
        if (r4 == null) goto L5;
        this.v5 = r4.j6(this.Zo.j6(r3.DW()));
    L6:
        if (r6 == false) goto L8;
        this.DW = null;
        this.FH = null;
    L9:
        this.VH = r5;
        return;
    L8:
        this.DW = new abcd.iO();
        this.FH = null;
        goto L9
    L5:
        this.v5 = null;
        goto L6
    }

    public kO(abcd.kO r2, abcd.WN r3, abcd.WN r4) {
        this.Zo = new abcd.wP();
        this.gn = null;
        this.j6 = r2.j6;
        this.Hw = r2.Hw;
        this.v5 = r2.v5;
        this.VH = r2.VH;
        this.DW = r3;
        this.FH = r4;
    }

    private abcd.HL j6(abcd.RM r2) {
        if (r2 != null) goto L4;
        return null;
    L4:
        return new abcd.vM(r2.j6());
    }

    private java.util.Map j6(abcd.oM r3, abcd.wN r4, byte[] r5) {
        java.util.HashMap r0 = new java.util.HashMap();
        if (r3 == null) goto L5;
        r0.put("contentType", r3);
    L5:
        r0.put("digestAlgID", r4);
        r0.put("digest", r5.clone());
        return r0;
    }

    public java.io.OutputStream DW() {
        abcd.InterfacezP r0 = this.v5;
        if (r0 == null) goto L11;
        if (this.DW != null) goto L9;
        return new abcd.YP(r0.j6(), this.Hw.j6());
    L9:
        return r0.j6();
    L11:
        return this.Hw.j6();
    }

    public abcd.YM j6(abcd.zL r10) {
        abcd.HL r1 = null;
        if (this.DW == null) goto L6;
        abcd.wN r0 = this.v5.DW();     // Catch: java.io.IOException -> L15
        this.gn = this.v5.FH();     // Catch: java.io.IOException -> L15
        abcd.HL r2 = j6(this.DW.getAttributes(java.util.Collections.unmodifiableMap(j6(r10, this.v5.DW(), this.gn))));     // Catch: java.io.IOException -> L15
        java.io.OutputStream r3 = this.Hw.j6();     // Catch: java.io.IOException -> L15
        r3.write(r2.j6("DER"));     // Catch: java.io.IOException -> L15
        r3.close();     // Catch: java.io.IOException -> L15
        abcd.wN r4 = r0;
        abcd.HL r5 = r2;
    L10:
        byte[] r6 = this.Hw.FH();     // Catch: java.io.IOException -> L15
        if (this.FH == null) goto L13;
        java.util.Map r11 = j6(r10, r4, this.gn);     // Catch: java.io.IOException -> L15
        r11.put("encryptedDigest", r6.clone());     // Catch: java.io.IOException -> L15
        r1 = j6(this.FH.getAttributes(java.util.Collections.unmodifiableMap(r11)));     // Catch: java.io.IOException -> L15
    L13:
        abcd.HL r8 = r1;
        return new abcd.YM(this.j6, r4, r5, this.VH.j6(this.Hw.DW()), new abcd.pM(r6), r8);
    L6:
        if (this.v5 == null) goto L8;
        abcd.wN r7 = this.v5.DW();     // Catch: java.io.IOException -> L15
        this.gn = this.v5.FH();     // Catch: java.io.IOException -> L15
    L9:
        r4 = r7;
        r5 = null;
        goto L10
    L8:
        r7 = this.Zo.j6(this.Hw.DW());     // Catch: java.io.IOException -> L15
        this.gn = null;     // Catch: java.io.IOException -> L15
    L15:
        e = move-exception;
        throw new abcd.XN("encoding error.", e);
    }

    void j6(abcd.SN r1) {
        this.u7 = r1;
    }

    public byte[] j6() {
        byte[] r0 = this.gn;
        if (r0 != null) goto L5;
        return null;
    L5:
        return (byte[]) r0.clone();
    }
}
