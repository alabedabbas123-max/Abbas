package abcd;

public final class hr {
    private int DW;
    private final java.util.List<abcd.hr.a> FH;
    private final abcd.ir j6;

    public final class a implements abcd.Tt {
        private int DW;
        private int FH;
        private int Hw;
        final abcd.hr Zo;
        private abcd.ir.a j6;
        private byte[] v5;

        private a(abcd.hr r1, abcd.ir.a r2) {
            this.Zo = r1;
            this.j6 = r2;
            this.DW = -1;
            this.FH = 0;
            this.Hw = Integer.MAX_VALUE;
        }

        private a(abcd.hr r1, abcd.ir.a r2, int r3) {
            this.Zo = r1;
            this.j6 = r2;
            this.DW = r3;
            this.FH = 0;
            this.Hw = Integer.MAX_VALUE;
        }

        private a(abcd.hr r1, abcd.ir.a r2, int r3, int r4) {
            this.Zo = r1;
            this.j6 = r2;
            this.DW = r3;
            this.FH = 0;
            this.Hw = r4;
        }

        a(abcd.hr r1, abcd.ir.a r2, int r3, int r4, abcd.gr r5) {
            this(r1, r2, r3, r4);
        }

        private a(abcd.hr r1, abcd.ir.a r2, int r3, int r4, byte[] r5) {
            this.Zo = r1;
            this.j6 = r2;
            this.v5 = r5;
            this.DW = r3;
            this.FH = r4;
            this.Hw = r4;
        }

        a(abcd.hr r1, abcd.ir.a r2, int r3, int r4, byte[] r5, abcd.gr r6) {
            this(r1, r2, r3, r4, r5);
        }

        a(abcd.hr r1, abcd.ir.a r2, int r3, abcd.gr r4) {
            this(r1, r2, r3);
        }

        a(abcd.hr r1, abcd.ir.a r2, abcd.gr r3) {
            this(r1, r2);
        }

        static int DW(abcd.hr.a r0) {
            return r0.Hw;
        }

        static int DW(abcd.hr.a r0, int r1) {
            r0.DW = r1;
            return r1;
        }

        static byte[] FH(abcd.hr.a r0) {
            return r0.v5;
        }

        static int Hw(abcd.hr.a r0) {
            return r0.DW;
        }

        static int j6(abcd.hr.a r0, int r1) {
            r0.FH = r1;
            return r1;
        }

        static abcd.ir.a j6(abcd.hr.a r0) {
            return r0.j6;
        }

        private void tp(int r4) {
            int r0 = this.Hw;
            if (r0 != Integer.MAX_VALUE) goto L15;
            if (this.v5 != null) goto L7;
            this.v5 = new byte[1024];
        L7:
            int r1 = this.FH + r4;
            byte[] r2 = this.v5;
            if (r1 <= r2.length) goto L19;
            int r3 = r2.length;
        L10:
            r3 = r3 * 2;
            if ((this.FH + r4) > r3) goto L10;
            byte[] r5 = new byte[r3];
            byte[] r6 = this.v5;
            java.lang.System.arraycopy(r6, 0, r5, 0, r6.length);
            this.v5 = r5;
            return;
        L19:
            return;
        L15:
            if (this.v5 != null) goto L18;
            this.v5 = new byte[r0];
        L18:
            if ((this.FH + r4) > this.Hw) goto L21;
            return;
        L21:
            throw new abcd.Ut("Section limit " + this.Hw + " exceeded");
        }

        public void DW(int r1) {
            abcd.eu.DW(this, r1);
        }

        public int EQ() {
            return this.FH;
        }

        public boolean J0() {
            if (this.DW < 0) goto L5;
            return true;
        L5:
            return false;
        }

        public boolean J8() {
            if (this.Hw == Integer.MAX_VALUE) goto L5;
            return true;
        L5:
            return false;
        }

        public void VH() {
            if ((this.FH & 3) != 0) goto L6;
            return;
        L6:
            throw new java.lang.IllegalStateException("Not four byte aligned!");
        }

        public void VH(int r1) {
            abcd.eu.j6(this, r1);
        }

        public void Zo() {
            int r0 = this.FH;
            this.FH = abcd.hr.j6(r0);
        L4:
            if (r0 >= this.FH) goto L6;
            this.v5[r0] = 0;
            r0 = r0 + 1;
            goto L4
        }

        public void Zo(int r2) {
            this.FH += r2;
        }

        public int gn() {
            Zo();
            this.Hw = this.FH;
            if (this.v5 != null) goto L6;
            this.v5 = new byte[0];
        L6:
            return this.FH;
        }

        public void gn(int r1) {
            DW(r1 + 1);
        }

        public void j6(abcd.fr r4) {
            short[] r5 = r4.Hw();
            writeInt(r5.length);
            int r0 = r5.length;
            int r1 = 0;
        L3:
            if (r1 >= r0) goto L5;
            j6(r5[r1]);
            r1 = r1 + 1;
            goto L3
        L5:
            Zo();
        }

        public void j6(short r5) {
            tp(2);
            byte[] r1 = this.v5;
            int r2 = this.FH;
            r1[r2] = (byte) r5;
            r1[r2 + 1] = (byte) (r5 >>> 8);
            this.FH = r2 + 2;
        }

        public void j6(short[] r4) {
            int r0 = r4.length;
            int r1 = 0;
        L3:
            if (r1 >= r0) goto L5;
            j6(r4[r1]);
            r1 = r1 + 1;
            goto L3
        }

        public int tp() {
            int r0 = this.DW;
            if (r0 == (-1)) goto L6;
            return r0;
        L6:
            throw new abcd.Ut("Can not get offset in not yet placed section");
        }

        public int u7() {
            int r0 = this.DW;
            if (r0 == (-1)) goto L7;
            return r0 + this.FH;
        L7:
            throw new abcd.Ut("Can not get offset in not yet placed section");
        }

        public void u7(int r4) {
            short r0 = (short) r4;
            if (r4 != (65535 & r0)) goto L7;
            j6(r0);
            return;
        L7:
            throw new java.lang.IllegalArgumentException("Expected an unsigned short: " + r4);
        }

        public void v5(int r1) {
            this.FH = r1;
        }

        public int we() {
            return this.FH;
        }

        public void write(byte[] r5) {
            tp(r5.length);
            java.lang.System.arraycopy(r5, 0, this.v5, this.FH, r5.length);
            this.FH += r5.length;
        }

        @Override
        public void writeByte(int r4) {
            tp(1);
            byte[] r0 = this.v5;
            int r1 = this.FH;
            this.FH = r1 + 1;
            r0[r1] = (byte) r4;
        }

        public void writeInt(int r6) {
            tp(4);
            byte[] r1 = this.v5;
            int r2 = this.FH;
            r1[r2] = (byte) r6;
            r1[r2 + 1] = (byte) (r6 >>> 8);
            r1[r2 + 2] = (byte) (r6 >>> 16);
            r1[r2 + 3] = (byte) (r6 >>> 24);
            this.FH = r2 + 4;
        }
    }

    public hr() {
        this.j6 = new abcd.ir();
        this.FH = new java.util.ArrayList();
    }

    private void Hw(abcd.ir.a r3) {
        int r0 = 0;
    L4:
        if (r0 >= this.FH.size()) goto L10;
        if (abcd.hr.a.j6(this.FH.get(r0)) == r3) goto L9;
        r0 = r0 + 1;
        goto L4
    L9:
        throw new java.lang.IllegalArgumentException("TOC section already added");
    }

    private void VH() {
        if (this.FH.isEmpty() == true) goto L11;
        java.util.List<abcd.hr.a> r0 = this.FH;
        if (r0.get(r0.size() - 1).J8() == false) goto L10;
        java.util.List<abcd.hr.a> r1 = this.FH;
        if (r1.get(r1.size() - 1).J0() == false) goto L10;
        return;
    L10:
        throw new java.lang.IllegalArgumentException("Can not append section when size of last section is still unknown or not placed");
    }

    private void Zo() {
        byte[] r0 = DW();
        abcd.hr.a r1 = this.FH.get(0);
        abcd.hr.a.j6(r1, 12);
        r1.write(r0);
        int r2 = j6();
        abcd.hr.a.j6(r1, 8);
        r1.writeInt(r2);
    }

    private void gn() {
        abcd.ir r0 = this.j6;
        int r1 = this.DW;
        r0.er = r1 - r0.yS;
        r0.a8 = r1;
        r0.j6(FH(r0.j6));
    }

    static int j6(int r0) {
        return v5(r0);
    }

    private void u7() {
        abcd.hr.a r0 = j6(this.j6.gn, ((this.FH.size() + 1) * 12) + 4, 1);
        java.util.ArrayList r1 = new java.util.ArrayList();
        java.util.Iterator<abcd.hr.a> r2 = this.FH.iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        r1.add(abcd.hr.a.j6(r2.next()));
        goto L4
    L6:
        this.j6.j6(r0, r1);
    }

    private static int v5(int r0) {
        return (r0 + 3) & (-4);
    }

    public abcd.hr.a DW(abcd.ir.a r3) {
        Hw(r3);
        abcd.hr.a r0 = new abcd.hr.a(this, r3, null);
        this.FH.add(r0);
        return r0;
    }

    public void DW(int r5) {
        if (this.FH.size() == 0) goto L15;
        int r0 = this.FH.size() - 1;
        abcd.hr.a r1 = this.FH.get(r0);
        if (r1.J8() == true) goto L13;
        int r2 = r1.gn();
        if (r2 != 0) goto L10;
        if (r5 != 0) goto L10;
        this.FH.remove(r0);
        return;
    L10:
        abcd.hr.a.j6(r1).FH = this.DW;
        abcd.hr.a.j6(r1).DW = r5;
        this.DW += r2;
        return;
    L13:
        throw new java.lang.IllegalStateException("Last section already finished");
    L15:
        throw new java.lang.IllegalStateException("No sections present");
    }

    public byte[] DW() {
        java.security.MessageDigest r0 = java.security.MessageDigest.getInstance("SHA-1");     // Catch: java.security.NoSuchAlgorithmException -> L12
        abcd.hr.a r2 = this.FH.get(0);
        r0.update(abcd.hr.a.FH(r2), 32, abcd.hr.a.DW(r2) - 32);
        int r1 = 1;
    L5:
        if (r1 >= this.FH.size()) goto L11;
        abcd.hr.a r3 = this.FH.get(r1);
        if (abcd.hr.a.DW(r3) <= 0) goto L9;
        r0.update(abcd.hr.a.FH(r3), 0, abcd.hr.a.DW(r3));
    L9:
        r1 = r1 + 1;
        goto L5
    L11:
        return r0.digest();
    L12:
        e = move-exception;
        throw new java.lang.RuntimeException(e);
    }

    public abcd.hr.a FH(abcd.ir.a r4) {
        int r0 = 0;
    L4:
        if (r0 >= this.FH.size()) goto L10;
        abcd.hr.a r1 = this.FH.get(r0);
        if (abcd.hr.a.j6(r1) == r4) goto L7;
        r0 = r0 + 1;
        goto L4
    L7:
        return r1;
    L10:
        throw new java.lang.IllegalArgumentException("TOC section not present");
    }

    public void FH() {
        u7();
        gn();
        Zo();
    }

    public void FH(int r5) {
        if (this.FH.size() < 2) goto L15;
        int r0 = this.FH.size() - 2;
        abcd.hr.a r1 = this.FH.get(r0);
        if (r1.J8() == true) goto L13;
        int r2 = r1.gn();
        if (r2 != 0) goto L10;
        if (r5 != 0) goto L10;
        this.FH.remove(r0);
        return;
    L10:
        abcd.hr.a.j6(r1).FH = this.DW;
        abcd.hr.a.j6(r1).DW = r5;
        this.DW += r2;
        return;
    L13:
        throw new java.lang.IllegalStateException("Second-to-last section already finished");
    L15:
        throw new java.lang.IllegalStateException("Less than two sections present");
    }

    public int Hw() {
        return this.DW;
    }

    public int Hw(int r5) {
        if (this.FH.size() == 0) goto L20;
        int r0 = this.FH.size() - 1;
        abcd.hr.a r1 = this.FH.get(r0);
        if (r1.J8() == true) goto L18;
        if (r1.J0() == true) goto L16;
        int r2 = r1.gn();
        if (r2 != 0) goto L13;
        if (r5 != 0) goto L13;
        this.FH.remove(r0);
        return 0;
    L13:
        abcd.hr.a.DW(r1, this.DW);
        abcd.hr.a.j6(r1).FH = this.DW;
        abcd.hr.a.j6(r1).DW = r5;
        this.DW += r2;
        return abcd.hr.a.Hw(r1);
    L16:
        throw new java.lang.IllegalStateException("Last section already placed");
    L18:
        throw new java.lang.IllegalStateException("Last section already finished");
    L20:
        throw new java.lang.IllegalStateException("No sections present");
    }

    public int j6() {
        java.util.zip.Adler32 r0 = new java.util.zip.Adler32();
        abcd.hr.a r1 = this.FH.get(0);
        r0.update(abcd.hr.a.FH(r1), 12, abcd.hr.a.DW(r1) - 12);
        int r2 = 1;
    L4:
        if (r2 >= this.FH.size()) goto L10;
        abcd.hr.a r3 = this.FH.get(r2);
        if (abcd.hr.a.DW(r3) <= 0) goto L8;
        r0.update(abcd.hr.a.FH(r3), 0, abcd.hr.a.DW(r3));
    L8:
        r2 = r2 + 1;
        goto L4
    L10:
        return (int) r0.getValue();
    }

    public abcd.hr.a j6(abcd.ir.a r4) {
        VH();
        Hw(r4);
        abcd.hr.a r0 = new abcd.hr.a(this, r4, this.DW, null);
        this.FH.add(r0);
        return r0;
    }

    public abcd.hr.a j6(abcd.ir.a r7, int r8, int r9) {
        VH();
        Hw(r7);
        int r10 = v5(r8);
        int r3 = this.DW;
        r7.FH = r3;
        r7.DW = r9;
        abcd.hr.a r11 = new abcd.hr.a(this, r7, r3, r10, null);
        this.DW += r10;
        this.FH.add(r11);
        return r11;
    }

    public abcd.hr.a j6(abcd.ir.a r8, byte[] r9, int r10, int r11) {
        VH();
        Hw(r8);
        int r12 = v5(r10);
        int r3 = this.DW;
        r8.FH = r3;
        r8.DW = r11;
        abcd.hr.a r13 = new abcd.hr.a(this, r8, r3, r12, r9, null);
        this.DW += r12;
        this.FH.add(r13);
        return r13;
    }

    public void j6(java.io.OutputStream r5) {
        java.util.Iterator<abcd.hr.a> r0 = this.FH.iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        abcd.hr.a r1 = r0.next();
        if (abcd.hr.a.DW(r1) <= 0) goto L4;
        r5.write(abcd.hr.a.FH(r1), 0, abcd.hr.a.DW(r1));
        goto L4
    }

    public abcd.ir v5() {
        return this.j6;
    }
}
