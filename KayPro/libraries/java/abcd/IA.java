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
        boolean r0 = tp().isDebugEnabled();
        this.Hw = r10.Hw();
        if (r0 == false) goto L5;
        DW.FH(java.lang.String.format("Version made by: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.Hw)}));
    L5:
        this.v5 = r10.Hw();
        if (r0 == false) goto L8;
        DW.FH(java.lang.String.format("Version required: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.v5)}));
    L8:
        this.Zo = r10.Hw();
        if (r0 == false) goto L12;
        DW.FH(java.lang.String.format("General purpose bits: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.Zo)}));
    L12:
        if ((this.Zo & 63473) != 0) goto L63;
        this.VH = r10.Hw();
        if (r0 == false) goto L16;
        DW.FH(java.lang.String.format("Compression: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.VH)}));
    L16:
        this.gn = r10.Hw();
        if (r0 == false) goto L19;
        DW.FH(java.lang.String.format("Modification time: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.gn)}));
    L19:
        this.u7 = r10.Hw();
        if (r0 == false) goto L22;
        DW.FH(java.lang.String.format("Modification date: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.u7)}));
    L22:
        this.tp = r10.FH();
        if (r0 == false) goto L25;
        DW.FH(java.lang.String.format("CRC-32: 0x%04x", new java.lang.Object[]{java.lang.Integer.valueOf(this.tp)}));
    L25:
        this.EQ = r10.FH();
        if (r0 == false) goto L28;
        DW.FH(java.lang.String.format("Compressed size: 0x%04x", new java.lang.Object[]{java.lang.Integer.valueOf(this.EQ)}));
    L28:
        this.we = r10.FH();
        if (r0 == false) goto L31;
        DW.FH(java.lang.String.format("Size: 0x%04x", new java.lang.Object[]{java.lang.Integer.valueOf(this.we)}));
    L31:
        short r3 = r10.Hw();
        if (r0 == false) goto L34;
        DW.FH(java.lang.String.format("File name length: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(r3)}));
    L34:
        short r4 = r10.Hw();
        if (r0 == false) goto L37;
        DW.FH(java.lang.String.format("Extra length: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(r4)}));
    L37:
        short r5 = r10.Hw();
        if (r0 == false) goto L40;
        DW.FH(java.lang.String.format("File comment length: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(r5)}));
    L40:
        this.XL = r10.Hw();
        if (r0 == false) goto L43;
        DW.FH(java.lang.String.format("Disk number start: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.XL)}));
    L43:
        this.aM = r10.Hw();
        if (r0 == false) goto L46;
        DW.FH(java.lang.String.format("Internal attributes: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.aM)}));
    L46:
        this.j3 = r10.FH();
        if (r0 == false) goto L49;
        DW.FH(java.lang.String.format("External attributes: 0x%08x", new java.lang.Object[]{java.lang.Integer.valueOf(this.j3)}));
    L49:
        this.Mr = r10.FH();
        if (r0 == false) goto L52;
        DW.FH(java.lang.String.format("Local header offset: 0x%08x", new java.lang.Object[]{java.lang.Integer.valueOf(this.Mr)}));
    L52:
        this.J0 = r10.DW(r3);
        if (r0 == false) goto L55;
        DW.FH("Filename: " + this.J0);
    L55:
        this.J8 = r10.j6(r4);
        this.QX = r10.DW(r5);
        if (r0 == false) goto L58;
        DW.FH("File comment: " + this.QX);
    L58:
        this.Zo = (short) (this.Zo & 2048);
        if (this.we != 0) goto L64;
        this.EQ = 0;
        this.VH = 0;
        this.tp = 0;
        return;
    L64:
        return;
    L63:
        throw new java.lang.IllegalStateException("Can't handle general purpose bits == " + java.lang.String.format("0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(this.Zo)}));
    }

    public static abcd.IA j6(abcd.LA r4) {
        if (r4.FH() == 33639248) goto L6;
        r4.j6(r4.DW() - 4);
        return null;
    L6:
        abcd.IA r0 = new abcd.IA(r4);
        r0.DW(r4);
        return r0;
    }

    public static abcd.InterfacetA tp() {
        if (DW != null) goto L6;
        DW = abcd.uA.j6(abcd.IA.class.getName());
    L6:
        return DW;
    }

    public short DW() {
        return this.VH;
    }

    public void DW(abcd.NA r16) {
        long r3 = 0;
        if (this.a8 == null) goto L5;
    L9:
        this.Mr = r16.DW();
        boolean r2 = tp().isDebugEnabled();
        if (r2 == false) goto L12;
        tp().FH(java.lang.String.format("Writing local header at 0x%08x - %s", new java.lang.Object[]{java.lang.Integer.valueOf(this.Mr), this.J0}));
    L12:
        abcd.KA r8 = this.lg;
        if (r8 == null) goto L15;
        r8.close();
        this.we = this.lg.DW();
        this.a8 = ((java.io.ByteArrayOutputStream) this.lg.FH()).toByteArray();
        this.EQ = this.a8.length;
        this.tp = this.lg.j6();
    L15:
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
        if (this.VH != 0) goto L20;
        short r9 = (short) (((long) (((r16.DW() + 2) + this.J0.length()) + this.J8.length)) % 4);
        if (r9 <= 0) goto L20;
        this.Ws = (short) (4 - r9);
    L20:
        r16.j6((short) (this.J8.length + this.Ws));
        r16.j6(this.J0);
        r16.j6(this.J8);
        short r10 = this.Ws;
        if (r10 <= 0) goto L23;
        r16.j6(j6, 0, r10);
    L23:
        if (r2 == false) goto L25;
        tp().FH(java.lang.String.format("Data position 0x%08x", new java.lang.Object[]{java.lang.Integer.valueOf(r16.DW())}));
    L25:
        byte[] r11 = this.a8;
        if (r11 == null) goto L30;
        r16.j6(r11);
        if (r2 == false) goto L43;
        tp().FH(java.lang.String.format("Wrote %d bytes", new java.lang.Object[]{java.lang.Integer.valueOf(this.a8.length)}));
        return;
    L43:
        return;
    L30:
        if (r2 == false) goto L32;
        tp().FH(java.lang.String.format("Seeking to position 0x%08x", new java.lang.Object[]{java.lang.Long.valueOf(this.U2)}));
    L32:
        this.FH.j6(this.U2);
        int r12 = java.lang.Math.min(this.EQ, 8096);
        byte[] r13 = new byte[r12];
    L33:
        int r14 = this.EQ;
        if (r3 == r14) goto L49;
        int r5 = this.FH.FH.read(r13, 0, (int) java.lang.Math.min(((long) r14) - r3, r12));
        if (r5 <= 0) goto L42;
        r16.j6(r13, 0, r5);
        if (r2 == false) goto L40;
        tp().FH(java.lang.String.format("Wrote %d bytes", new java.lang.Object[]{java.lang.Integer.valueOf(r5)}));
    L40:
        r3 = r3 + ((long) r5);
        goto L33
    L42:
        throw new java.lang.IllegalStateException(java.lang.String.format("EOF reached while copying %s with %d bytes left to go", new java.lang.Object[]{this.J0, java.lang.Long.valueOf(((long) this.EQ) - r3)}));
    L49:
        return;
    L5:
        if (this.U2 >= 0) goto L9;
        if (this.FH == null) goto L9;
        Mr();
        goto L9
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
        abcd.LA r0 = this.FH;
        boolean r1 = tp().isDebugEnabled();
        r0.j6(this.Mr);
        if (r1 == false) goto L6;
        tp().FH(java.lang.String.format("FILE POSITION: 0x%08x", new java.lang.Object[]{java.lang.Long.valueOf(r0.DW())}));
    L6:
        if (r0.FH() != 67324752) goto L45;
        short r4 = r0.Hw();
        if (r1 == false) goto L10;
        DW.FH(java.lang.String.format("Version required: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(r4)}));
    L10:
        short r5 = r0.Hw();
        if (r1 == false) goto L13;
        DW.FH(java.lang.String.format("General purpose bits: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(r5)}));
    L13:
        short r6 = r0.Hw();
        if (r1 == false) goto L16;
        DW.FH(java.lang.String.format("Compression: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(r6)}));
    L16:
        short r7 = r0.Hw();
        if (r1 == false) goto L19;
        DW.FH(java.lang.String.format("Modification time: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(r7)}));
    L19:
        short r8 = r0.Hw();
        if (r1 == false) goto L22;
        DW.FH(java.lang.String.format("Modification date: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(r8)}));
    L22:
        int r9 = r0.FH();
        if (r1 == false) goto L25;
        DW.FH(java.lang.String.format("CRC-32: 0x%04x", new java.lang.Object[]{java.lang.Integer.valueOf(r9)}));
    L25:
        int r10 = r0.FH();
        if (r1 == false) goto L28;
        DW.FH(java.lang.String.format("Compressed size: 0x%04x", new java.lang.Object[]{java.lang.Integer.valueOf(r10)}));
    L28:
        int r11 = r0.FH();
        if (r1 == false) goto L31;
        DW.FH(java.lang.String.format("Size: 0x%04x", new java.lang.Object[]{java.lang.Integer.valueOf(r11)}));
    L31:
        short r12 = r0.Hw();
        if (r1 == false) goto L34;
        DW.FH(java.lang.String.format("File name length: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(r12)}));
    L34:
        short r13 = r0.Hw();
        if (r1 == false) goto L37;
        DW.FH(java.lang.String.format("Extra length: 0x%04x", new java.lang.Object[]{java.lang.Short.valueOf(r13)}));
    L37:
        java.lang.String r14 = r0.DW(r12);
        if (r1 == false) goto L40;
        DW.FH("Filename: " + r14);
    L40:
        r0.j6(r13);
        this.U2 = r0.DW();
        if (r1 == false) goto L46;
        DW.FH(java.lang.String.format("Data position: 0x%08x", new java.lang.Object[]{java.lang.Long.valueOf(this.U2)}));
        return;
    L46:
        return;
    L45:
        throw new java.lang.IllegalStateException(java.lang.String.format("Local header not found at pos=0x%08x, file=%s", new java.lang.Object[]{java.lang.Long.valueOf(r0.DW()), this.J0}));
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
        abcd.KA r0 = this.lg;
        if (r0 == null) goto L9;
        r0.close();
        this.we = this.lg.DW();
        this.a8 = ((java.io.ByteArrayOutputStream) this.lg.FH()).toByteArray();
        this.EQ = this.a8.length;
        this.tp = this.lg.j6();
        this.lg = null;
        java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream(this.a8);
        if (this.VH != 0) goto L8;
        return r7;
    L8:
        return new java.util.zip.InflaterInputStream(new java.io.SequenceInputStream(r7, new java.io.ByteArrayInputStream(new byte[1])), new java.util.zip.Inflater(true));
    L9:
        abcd.JA r1 = new abcd.JA(this);
        if (r6 == null) goto L13;
        r1.j6(r6);
    L13:
        if (this.VH == 0) goto L16;
        r1.j6(true);
        return new java.util.zip.InflaterInputStream(r1, new java.util.zip.Inflater(true));
    L16:
        return r1;
    }

    public void j6(long r3) {
        java.util.Date r0 = new java.util.Date(r3);
        int r4 = r0.getYear() + 1900;
        if (r4 >= 1980) goto L5;
        long r1 = 2162688;
    L6:
        this.u7 = (short) (r1 >> 16);
        this.gn = (short) (65535 & r1);
        return;
    L5:
        r1 = ((((((r4 - 1980) << 25) | ((r0.getMonth() + 1) << 21)) | (r0.getDate() << 16)) | (r0.getHours() << 11)) | (r0.getMinutes() << 5)) | (r0.getSeconds() >> 1);
        goto L6
    }

    public void j6(abcd.NA r4) {
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
        short r0 = this.Ws;
        if (r0 <= 0) goto L5;
        r4.j6(j6, 0, r0);
    L5:
        r4.j6(this.QX);
    }

    public java.io.InputStream u7() {
        return j6(null);
    }

    public byte[] v5() {
        byte[] r0 = this.a8;
        if (r0 == null) goto L5;
        return r0;
    L5:
        byte[] r1 = new byte[this.we];
        java.io.InputStream r2 = u7();
        int r3 = 0;
    L6:
        int r4 = this.we;
        if (r3 == r4) goto L13;
        int r5 = r2.read(r1, r3, r4 - r3);
        if (r5 < 0) goto L12;
        r3 = r3 + r5;
        goto L6
    L12:
        throw new java.lang.IllegalStateException(java.lang.String.format("Read failed, expecting %d bytes, got %d instead", new java.lang.Object[]{java.lang.Integer.valueOf(this.we), java.lang.Integer.valueOf(r3)}));
    L13:
        return r1;
    }
}
