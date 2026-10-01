package abcd;

class CH {
    private final int DW;
    private final java.lang.ref.ReferenceQueue<byte[]> FH;
    private long Hw;
    private final long j6;

    static class a extends java.lang.ref.SoftReference<byte[]> {
        final int j6;

        a(byte[] r1, java.lang.ref.ReferenceQueue<byte[]> r2) {
            super(r1, r2);
            this.j6 = r1.length;
        }
    }

    CH(abcd.NH r3) {
        this.j6 = r3.Hw();
        this.DW = r3.FH();
        this.FH = new java.lang.ref.ReferenceQueue();
    }

    private void j6() {
    L2:
        abcd.CH.a r0 = (abcd.CH.a) this.FH.poll();
        if (r0 == null) goto L4;
        this.Hw -= (long) r0.j6;
        goto L2
    }

    abcd.CH.a j6(byte[] r3, int r4, int r5) {
        byte[] r6 = j6(r3, r4);
        if (r5 == r6.length) goto L6;
        this.Hw -= (long) r5;
        this.Hw += (long) r6.length;
    L6:
        return new abcd.CH.a(r6, this.FH);
    }

    void j6(int r5) {
        this.Hw -= (long) r5;
    }

    boolean j6(int r11, abcd.MH r12, abcd.MH r13) {
        long r0 = this.j6;
        if (0 >= r0) goto L12;
        long r7 = r11;
        if (r0 >= (this.Hw + r7)) goto L12;
        j6();
        long r1 = this.j6;
        if (0 >= r1) goto L12;
        if (r1 >= (this.Hw + r7)) goto L12;
        return false;
    L12:
        if (r11 >= this.DW) goto L16;
        this.Hw += (long) r11;
        return true;
    L16:
        if ((r11 >> 10) >= ((r12.gW() >> 20) + (r13.gW() >> 21))) goto L19;
        this.Hw += (long) r11;
        return true;
    L19:
        return false;
    }

    byte[] j6(byte[] r3, int r4) {
        if (r3.length == r4) goto L6;
        byte[] r0 = new byte[r4];
        java.lang.System.arraycopy(r3, 0, r0, 0, r4);
        return r0;
    L6:
        return r3;
    }
}
