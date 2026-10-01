package abcd;

public class JL {
    private final int DW;
    private final byte[][] FH;
    private final java.io.InputStream j6;

    public JL(java.io.InputStream r2) {
        this(r2, abcd.OM.j6(r2));
    }

    public JL(java.io.InputStream r1, int r2) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = new byte[11][];
    }

    private void j6(boolean r3) {
        java.io.InputStream r0 = this.j6;
        if ((r0 instanceof abcd.JM) == false) goto L6;
        ((abcd.JM) r0).DW(r3);
        return;
    }

    abcd.rL DW() {
        abcd.rL r0 = new abcd.rL();
    L3:
        abcd.InterfaceqL r1 = j6();
        if (r1 == null) goto L5;
        if ((r1 instanceof abcd.IM) == true) goto L8;
        r0.j6(r1.DW());
        goto L3
    L8:
        r0.j6(((abcd.IM) r1).j6());
        goto L3
    L5:
        return r0;
    }

    abcd.EL j6(boolean r4, int r5) {
        if (r4 == false) goto L5;
        abcd.rL r6 = DW();
        if ((this.j6 instanceof abcd.JM) == false) goto L14;
        if (r6.j6() != 1) goto L12;
        return new abcd.YL(true, r5, r6.j6(0));
    L12:
        return new abcd.YL(false, r5, abcd.QL.j6(r6));
    L14:
        if (r6.j6() != 1) goto L17;
        return new abcd.yM(true, r5, r6.j6(0));
    L17:
        return new abcd.yM(false, r5, abcd.hM.j6(r6));
    L5:
        return new abcd.yM(false, r5, new abcd.pM(((abcd.HM) this.j6).DW()));
    }

    public abcd.InterfaceqL j6() {
        int r0 = this.j6.read();
        if (r0 != (-1)) goto L6;
        return null;
    L6:
        boolean r1 = false;
        j6(false);
        int r2 = abcd.C1419vL.DW(this.j6, r0);
        if ((r0 & 32) == 0) goto L9;
        r1 = true;
    L9:
        int r3 = abcd.C1419vL.j6(this.j6, this.DW);
        if (r3 >= 0) goto L24;
        if (r1 == false) goto L23;
        abcd.JL r4 = new abcd.JL(new abcd.JM(this.j6, this.DW), this.DW);
        if ((r0 & 64) == 0) goto L17;
        return new abcd.PL(r2, r4);
    L17:
        if ((r0 & 128) == 0) goto L21;
        return new abcd.ZL(true, r2, r4);
    L21:
        return r4.j6(r2);
    L23:
        throw new java.io.IOException("indefinite length primitive encoding encountered");
    L24:
        abcd.HM r5 = new abcd.HM(this.j6, r3);
        if ((r0 & 64) == 0) goto L29;
        return new abcd.aM(r1, r2, r5.DW());
    L29:
        if ((r0 & 128) == 0) goto L33;
        return new abcd.ZL(r1, r2, new abcd.JL(r5));
    L33:
        if (r1 == false) goto L51;
        if (r2 == 4) goto L50;
        if (r2 == 8) goto L48;
        if (r2 == 16) goto L46;
        if (r2 != 17) goto L44;
        return new abcd.wM(new abcd.JL(r5));
    L44:
        throw new java.io.IOException("unknown tag " + r2 + " encountered");
    L46:
        return new abcd.uM(new abcd.JL(r5));
    L48:
        return new abcd.gM(new abcd.JL(r5));
    L50:
        return new abcd.TL(new abcd.JL(r5));
    L51:
        if (r2 == 4) goto L58;
        return abcd.C1419vL.j6(r2, r5, this.FH);
    L54:
        e = move-exception;
        throw new abcd.tL("corrupted stream detected", e);
    L58:
        return new abcd.qM(r5);
    }

    abcd.InterfaceqL j6(int r4) {
        if (r4 == 4) goto L19;
        if (r4 == 8) goto L17;
        if (r4 == 16) goto L15;
        if (r4 != 17) goto L13;
        return new abcd.XL(this);
    L13:
        throw new abcd.tL("unknown BER object encountered: 0x" + java.lang.Integer.toHexString(r4));
    L15:
        return new abcd.VL(this);
    L17:
        return new abcd.gM(this);
    L19:
        return new abcd.TL(this);
    }
}
