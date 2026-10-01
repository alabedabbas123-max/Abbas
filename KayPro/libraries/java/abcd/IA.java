package abcd;

public class IA implements java.lang.Cloneable {
    private static abcd.InterfacetA DW;
    private static byte[] j6;
    private int EQ;
    private abcd.LA FH;
    private short Hw;
    private java.lang.String J0;
    private byte[] J8;
    private int Mr;
    private java.lang.String QX;
    private long U2;
    private short VH;
    private short Ws;
    private short XL;
    private short Zo;
    private byte[] a8;
    private short aM;
    private short gn;
    private int j3;
    private abcd.KA lg;
    private int tp;
    private short u7;
    private short v5;
    private int we;

    static {
        j6 = new byte[4];
    }

    public IA(abcd.LA r3) {
        this.Ws = 0;
        this.U2 = -1;
        this.a8 = null;
        this.lg = null;
        this.FH = r3;
    }

    public IA(java.lang.String r4) {
        this.Ws = 0;
        this.U2 = -1;
        this.a8 = null;
        this.lg = null;
        this.J0 = r4;
        this.QX = "";
        this.VH = 8;
        this.J8 = new byte[0];
        j6(java.lang.System.currentTimeMillis());
    }

    private void DW(abcd.LA r10) {
        boolean r0 = false;
        short r3 = 0;
        short r4 = 0;
        short r5 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = tp().isDebugEnabled();
                    this.Hw = r10.Hw();
                    if (r0 == false) { $pc0 = 5; continue $sw0; }
                    DW.FH(java.lang.String.format("Version made by: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.Hw)}));
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    this.v5 = r10.Hw();
                    if (r0 == false) { $pc0 = 8; continue $sw0; }
                    DW.FH(java.lang.String.format("Version required: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.v5)}));
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    this.Zo = r10.Hw();
                    if (r0 == false) { $pc0 = 12; continue $sw0; }
                    DW.FH(java.lang.String.format("General purpose bits: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.Zo)}));
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    if ((this.Zo & 63473) != 0) { $pc0 = 63; continue $sw0; }
                    this.VH = r10.Hw();
                    if (r0 == false) { $pc0 = 16; continue $sw0; }
                    DW.FH(java.lang.String.format("Compression: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.VH)}));
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    this.gn = r10.Hw();
                    if (r0 == false) { $pc0 = 19; continue $sw0; }
                    DW.FH(java.lang.String.format("Modification time: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.gn)}));
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    this.u7 = r10.Hw();
                    if (r0 == false) { $pc0 = 22; continue $sw0; }
                    DW.FH(java.lang.String.format("Modification date: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.u7)}));
                    $pc0 = 22; continue $sw0;
                }
                case 22: {
                    this.tp = r10.FH();
                    if (r0 == false) { $pc0 = 25; continue $sw0; }
                    DW.FH(java.lang.String.format("CRC-32: 0x%04x", new java.lang.Object[]{java.lang.Integer.valueOf(this.tp)}));
                    $pc0 = 25; continue $sw0;
                }
                case 25: {
                    this.EQ = r10.FH();
                    if (r0 == false) { $pc0 = 28; continue $sw0; }
                    DW.FH(java.lang.String.format("Compressed size: 0x%04x", new java.lang.Object[]{java.lang.Integer.valueOf(this.EQ)}));
                    $pc0 = 28; continue $sw0;
                }
                case 28: {
                    this.we = r10.FH();
                    if (r0 == false) { $pc0 = 31; continue $sw0; }
                    DW.FH(java.lang.String.format("Size: 0x%04x", new java.lang.Object[]{java.lang.Integer.valueOf(this.we)}));
                    $pc0 = 31; continue $sw0;
                }
                case 31: {
                    r3 = r10.Hw();
                    if (r0 == false) { $pc0 = 34; continue $sw0; }
                    DW.FH(java.lang.String.format("File name length: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(r3)}));
                    $pc0 = 34; continue $sw0;
                }
                case 34: {
                    r4 = r10.Hw();
                    if (r0 == false) { $pc0 = 37; continue $sw0; }
                    DW.FH(java.lang.String.format("Extra length: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(r4)}));
                    $pc0 = 37; continue $sw0;
                }
                case 37: {
                    r5 = r10.Hw();
                    if (r0 == false) { $pc0 = 40; continue $sw0; }
                    DW.FH(java.lang.String.format("File comment length: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(r5)}));
                    $pc0 = 40; continue $sw0;
                }
                case 40: {
                    this.XL = r10.Hw();
                    if (r0 == false) { $pc0 = 43; continue $sw0; }
                    DW.FH(java.lang.String.format("Disk number start: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.XL)}));
                    $pc0 = 43; continue $sw0;
                }
                case 43: {
                    this.aM = r10.Hw();
                    if (r0 == false) { $pc0 = 46; continue $sw0; }
                    DW.FH(java.lang.String.format("Internal attributes: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.aM)}));
                    $pc0 = 46; continue $sw0;
                }
                case 46: {
                    this.j3 = r10.FH();
                    if (r0 == false) { $pc0 = 49; continue $sw0; }
                    DW.FH(java.lang.String.format("External attributes: 0x%08x", new java.lang.Object[]{java.lang.Integer.valueOf(this.j3)}));
                    $pc0 = 49; continue $sw0;
                }
                case 49: {
                    this.Mr = r10.FH();
                    if (r0 == false) { $pc0 = 52; continue $sw0; }
                    DW.FH(java.lang.String.format("Local header offset: 0x%08x", new java.lang.Object[]{java.lang.Integer.valueOf(this.Mr)}));
                    $pc0 = 52; continue $sw0;
                }
                case 52: {
                    this.J0 = r10.DW(r3);
                    if (r0 == false) { $pc0 = 55; continue $sw0; }
                    DW.FH("Filename: " + this.J0);
                    $pc0 = 55; continue $sw0;
                }
                case 55: {
                    this.J8 = r10.j6(r4);
                    this.QX = r10.DW(r5);
                    if (r0 == false) { $pc0 = 58; continue $sw0; }
                    DW.FH("File comment: " + this.QX);
                    $pc0 = 58; continue $sw0;
                }
                case 58: {
                    this.Zo = (short) (this.Zo & 2048);
                    if (this.we != 0) { $pc0 = 64; continue $sw0; }
                    this.EQ = 0;
                    this.VH = 0;
                    this.tp = 0;
                    return;
                }
                case 64: {
                    return;
                }
                case 63: {
                    throw new java.lang.IllegalStateException("Can't handle general purpose bits == " + java.lang.String.format("0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.Zo)}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.IA j6(abcd.LA r4) {
        abcd.IA r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r4.FH() == 33639248) { $pc1 = 6; continue $sw1; }
                    r4.j6(r4.DW() - 4);
                    return null;
                }
                case 6: {
                    r0 = new abcd.IA(r4);
                    r0.DW(r4);
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.InterfacetA tp() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (DW != null) { $pc2 = 6; continue $sw2; }
                    DW = abcd.uA.j6(abcd.IA.class.getName());
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    return DW;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public short DW() {
        return this.VH;
    }

    public void DW(abcd.NA r16) {
        long r3 = 0L;
        boolean r2 = false;
        abcd.KA r8 = null;
        short r9 = 0;
        short r10 = 0;
        byte[] r11 = null;
        int r12 = 0;
        byte[] r13 = null;
        int r14 = 0;
        int r5 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r3 = 0;
                    if (this.a8 == null) { $pc3 = 5; continue $sw3; }
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    this.Mr = r16.DW();
                    r2 = tp().isDebugEnabled();
                    if (r2 == false) { $pc3 = 12; continue $sw3; }
                    tp().FH(java.lang.String.format("Writing local header at 0x%08x - %s", new java.lang.Object[]{java.lang.Integer.valueOf(this.Mr), this.J0}));
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    r8 = this.lg;
                    if (r8 == null) { $pc3 = 15; continue $sw3; }
                    r8.close();
                    this.we = this.lg.DW();
                    this.a8 = ((java.io.ByteArrayOutputStream) this.lg.FH()).toByteArray();
                    this.EQ = this.a8.length;
                    this.tp = this.lg.j6();
                    $pc3 = 15; continue $sw3;
                }
                case 15: {
                    r16.j6(67324752);
                    r16.j6(this.v5);
                    r16.j6(this.Zo);
                    r16.j6(this.VH);
                    r16.j6(this.gn);
                    r16.j6(this.u7);
                    r16.j6(this.tp);
                    r16.j6(this.EQ);
                    r16.j6(this.we);
                    r16.j6((short) this.J0.length());
                    this.Ws = 0;
                    if (this.VH != 0) { $pc3 = 20; continue $sw3; }
                    r9 = (short) (((long) (((r16.DW() + 2) + this.J0.length()) + this.J8.length)) % 4);
                    if (r9 <= 0) { $pc3 = 20; continue $sw3; }
                    this.Ws = (short) (4 - r9);
                    $pc3 = 20; continue $sw3;
                }
                case 20: {
                    r16.j6((short) (this.J8.length + this.Ws));
                    r16.j6(this.J0);
                    r16.j6(this.J8);
                    r10 = this.Ws;
                    if (r10 <= 0) { $pc3 = 23; continue $sw3; }
                    r16.j6(j6, 0, r10);
                    $pc3 = 23; continue $sw3;
                }
                case 23: {
                    if (r2 == false) { $pc3 = 25; continue $sw3; }
                    tp().FH(java.lang.String.format("Data position 0x%08x", new java.lang.Object[]{java.lang.Integer.valueOf(r16.DW())}));
                    $pc3 = 25; continue $sw3;
                }
                case 25: {
                    r11 = this.a8;
                    if (r11 == null) { $pc3 = 30; continue $sw3; }
                    r16.j6(r11);
                    if (r2 == false) { $pc3 = 43; continue $sw3; }
                    tp().FH(java.lang.String.format("Wrote %d bytes", new java.lang.Object[]{java.lang.Integer.valueOf(this.a8.length)}));
                    return;
                }
                case 43: {
                    return;
                }
                case 30: {
                    if (r2 == false) { $pc3 = 32; continue $sw3; }
                    tp().FH(java.lang.String.format("Seeking to position 0x%08x", new java.lang.Object[]{java.lang.Long.valueOf(this.U2)}));
                    $pc3 = 32; continue $sw3;
                }
                case 32: {
                    this.FH.j6(this.U2);
                    r12 = java.lang.Math.min(this.EQ, 8096);
                    r13 = new byte[r12];
                    $pc3 = 33; continue $sw3;
                }
                case 33: {
                    r14 = this.EQ;
                    if (r3 == r14) { $pc3 = 49; continue $sw3; }
                    r5 = this.FH.FH.read(r13, 0, (int) java.lang.Math.min(((long) r14) - r3, r12));
                    if (r5 <= 0) { $pc3 = 42; continue $sw3; }
                    r16.j6(r13, 0, r5);
                    if (r2 == false) { $pc3 = 40; continue $sw3; }
                    tp().FH(java.lang.String.format("Wrote %d bytes", new java.lang.Object[]{java.lang.Integer.valueOf(r5)}));
                    $pc3 = 40; continue $sw3;
                }
                case 40: {
                    r3 = r3 + ((long) r5);
                    { $pc3 = 33; continue $sw3; }
                }
                case 42: {
                    throw new java.lang.IllegalStateException(java.lang.String.format("EOF reached while copying %s with %d bytes left to go", new java.lang.Object[]{this.J0, java.lang.Long.valueOf(((long) this.EQ) - r3)}));
                }
                case 49: {
                    return;
                }
                case 5: {
                    if (this.U2 >= 0) { $pc3 = 9; continue $sw3; }
                    if (this.FH == null) { $pc3 = 9; continue $sw3; }
                    Mr();
                    { $pc3 = 9; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String EQ() {
        return this.J0;
    }

    public int FH() {
        return this.tp;
    }

    public java.io.OutputStream J0() {
        this.lg = new abcd.KA(this.VH, new java.io.ByteArrayOutputStream());
        return this.lg;
    }

    public void Mr() {
        abcd.LA r0 = null;
        boolean r1 = false;
        short r4 = 0;
        short r5 = 0;
        short r6 = 0;
        short r7 = 0;
        short r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        short r12 = 0;
        short r13 = 0;
        java.lang.String r14 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.FH;
                    r1 = tp().isDebugEnabled();
                    r0.j6(this.Mr);
                    if (r1 == false) { $pc4 = 6; continue $sw4; }
                    tp().FH(java.lang.String.format("FILE POSITION: 0x%08x", new java.lang.Object[]{java.lang.Long.valueOf(r0.DW())}));
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if (r0.FH() != 67324752) { $pc4 = 45; continue $sw4; }
                    r4 = r0.Hw();
                    if (r1 == false) { $pc4 = 10; continue $sw4; }
                    DW.FH(java.lang.String.format("Version required: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(r4)}));
                    $pc4 = 10; continue $sw4;
                }
                case 10: {
                    r5 = r0.Hw();
                    if (r1 == false) { $pc4 = 13; continue $sw4; }
                    DW.FH(java.lang.String.format("General purpose bits: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(r5)}));
                    $pc4 = 13; continue $sw4;
                }
                case 13: {
                    r6 = r0.Hw();
                    if (r1 == false) { $pc4 = 16; continue $sw4; }
                    DW.FH(java.lang.String.format("Compression: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(r6)}));
                    $pc4 = 16; continue $sw4;
                }
                case 16: {
                    r7 = r0.Hw();
                    if (r1 == false) { $pc4 = 19; continue $sw4; }
                    DW.FH(java.lang.String.format("Modification time: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(r7)}));
                    $pc4 = 19; continue $sw4;
                }
                case 19: {
                    r8 = r0.Hw();
                    if (r1 == false) { $pc4 = 22; continue $sw4; }
                    DW.FH(java.lang.String.format("Modification date: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(r8)}));
                    $pc4 = 22; continue $sw4;
                }
                case 22: {
                    r9 = r0.FH();
                    if (r1 == false) { $pc4 = 25; continue $sw4; }
                    DW.FH(java.lang.String.format("CRC-32: 0x%04x", new java.lang.Object[]{java.lang.Integer.valueOf(r9)}));
                    $pc4 = 25; continue $sw4;
                }
                case 25: {
                    r10 = r0.FH();
                    if (r1 == false) { $pc4 = 28; continue $sw4; }
                    DW.FH(java.lang.String.format("Compressed size: 0x%04x", new java.lang.Object[]{java.lang.Integer.valueOf(r10)}));
                    $pc4 = 28; continue $sw4;
                }
                case 28: {
                    r11 = r0.FH();
                    if (r1 == false) { $pc4 = 31; continue $sw4; }
                    DW.FH(java.lang.String.format("Size: 0x%04x", new java.lang.Object[]{java.lang.Integer.valueOf(r11)}));
                    $pc4 = 31; continue $sw4;
                }
                case 31: {
                    r12 = r0.Hw();
                    if (r1 == false) { $pc4 = 34; continue $sw4; }
                    DW.FH(java.lang.String.format("File name length: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(r12)}));
                    $pc4 = 34; continue $sw4;
                }
                case 34: {
                    r13 = r0.Hw();
                    if (r1 == false) { $pc4 = 37; continue $sw4; }
                    DW.FH(java.lang.String.format("Extra length: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(r13)}));
                    $pc4 = 37; continue $sw4;
                }
                case 37: {
                    r14 = r0.DW(r12);
                    if (r1 == false) { $pc4 = 40; continue $sw4; }
                    DW.FH("Filename: " + r14);
                    $pc4 = 40; continue $sw4;
                }
                case 40: {
                    r0.j6(r13);
                    this.U2 = r0.DW();
                    if (r1 == false) { $pc4 = 46; continue $sw4; }
                    DW.FH(java.lang.String.format("Data position: 0x%08x", new java.lang.Object[]{java.lang.Long.valueOf(this.U2)}));
                    return;
                }
                case 46: {
                    return;
                }
                case 45: {
                    throw new java.lang.IllegalStateException(java.lang.String.format("Local header not found at pos=0x%08x, file=%s", new java.lang.Object[]{java.lang.Long.valueOf(r0.DW()), this.J0}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int QX() {
        return this.we;
    }

    public long XL() {
        short r0 = this.u7;
        int r3 = ((r0 >> 9) & 127) + 80;
        int r4 = ((r0 >> 5) & 15) - 1;
        int r5 = r0 & 31;
        short r1 = this.gn;
        return new java.util.Date(r3, r4, r5, (r1 >> 11) & 31, (r1 >> 5) & 63, (r1 << 1) & 62).getTime();
    }

    public abcd.LA aM() {
        return this.FH;
    }

    public long gn() {
        return this.U2;
    }

    public boolean j3() {
        return this.J0.endsWith("/");
    }

    public int j6() {
        return this.EQ;
    }

    public java.io.InputStream j6(java.io.OutputStream r6) {
        abcd.KA r0 = null;
        java.io.ByteArrayInputStream r7 = null;
        abcd.JA r1 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.lg;
                    if (r0 == null) { $pc5 = 9; continue $sw5; }
                    r0.close();
                    this.we = this.lg.DW();
                    this.a8 = ((java.io.ByteArrayOutputStream) this.lg.FH()).toByteArray();
                    this.EQ = this.a8.length;
                    this.tp = this.lg.j6();
                    this.lg = null;
                    r7 = new java.io.ByteArrayInputStream(this.a8);
                    if (this.VH != 0) { $pc5 = 8; continue $sw5; }
                    return r7;
                }
                case 8: {
                    return new java.util.zip.InflaterInputStream(new java.io.SequenceInputStream(r7, new java.io.ByteArrayInputStream(new byte[1])), new java.util.zip.Inflater(true));
                }
                case 9: {
                    r1 = new abcd.JA(this);
                    if (r6 == null) { $pc5 = 13; continue $sw5; }
                    r1.j6(r6);
                    $pc5 = 13; continue $sw5;
                }
                case 13: {
                    if (this.VH == 0) { $pc5 = 16; continue $sw5; }
                    r1.j6(true);
                    return new java.util.zip.InflaterInputStream(r1, new java.util.zip.Inflater(true));
                }
                case 16: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(long r3) {
        java.util.Date r0 = null;
        int r4 = 0;
        long r1 = 0L;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = new java.util.Date(r3);
                    r4 = r0.getYear() + 1900;
                    if (r4 >= 1980) { $pc6 = 5; continue $sw6; }
                    r1 = 2162688;
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    this.u7 = (short) (r1 >> 16);
                    this.gn = (short) (65535 & r1);
                    return;
                }
                case 5: {
                    r1 = ((((((r4 - 1980) << 25) | ((r0.getMonth() + 1) << 21)) | (r0.getDate() << 16)) | (r0.getHours() << 11)) | (r0.getMinutes() << 5)) | (r0.getSeconds() >> 1);
                    { $pc6 = 6; continue $sw6; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.NA r4) {
        short r0 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    tp().isDebugEnabled();
                    r4.j6(33639248);
                    r4.j6(this.Hw);
                    r4.j6(this.v5);
                    r4.j6(this.Zo);
                    r4.j6(this.VH);
                    r4.j6(this.gn);
                    r4.j6(this.u7);
                    r4.j6(this.tp);
                    r4.j6(this.EQ);
                    r4.j6(this.we);
                    r4.j6((short) this.J0.length());
                    r4.j6((short) (this.J8.length + this.Ws));
                    r4.j6((short) this.QX.length());
                    r4.j6(this.XL);
                    r4.j6(this.aM);
                    r4.j6(this.j3);
                    r4.j6(this.Mr);
                    r4.j6(this.J0);
                    r4.j6(this.J8);
                    r0 = this.Ws;
                    if (r0 <= 0) { $pc7 = 5; continue $sw7; }
                    r4.j6(j6, 0, r0);
                    $pc7 = 5; continue $sw7;
                }
                case 5: {
                    r4.j6(this.QX);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.io.InputStream u7() {
        return j6(null);
    }

    public byte[] v5() {
        byte[] r0 = null;
        byte[] r1 = null;
        java.io.InputStream r2 = null;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = this.a8;
                    if (r0 == null) { $pc8 = 5; continue $sw8; }
                    return r0;
                }
                case 5: {
                    r1 = new byte[this.we];
                    r2 = u7();
                    r3 = 0;
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    r4 = this.we;
                    if (r3 == r4) { $pc8 = 13; continue $sw8; }
                    r5 = r2.read(r1, r3, r4 - r3);
                    if (r5 < 0) { $pc8 = 12; continue $sw8; }
                    r3 = r3 + r5;
                    { $pc8 = 6; continue $sw8; }
                }
                case 12: {
                    throw new java.lang.IllegalStateException(java.lang.String.format("Read failed, expecting %d bytes, got %d instead", new java.lang.Object[]{java.lang.Integer.valueOf(this.we), java.lang.Integer.valueOf(r3)}));
                }
                case 13: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
