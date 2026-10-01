package abcd;

public final class Dy implements abcd.Fy {
    private long DW;
    private long j6;

    public Dy() {
        this.j6 = 1;
        this.DW = 0;
    }

    @Override
    public long getValue() {
        return (this.DW << 16) | this.j6;
    }

    @Override
    public void j6(long r5) {
        this.j6 = r5 & 65535;
        this.DW = (r5 >> 16) & 65535;
    }

    @Override
    public void reset() {
        this.j6 = 1;
        this.DW = 0;
    }

    @Override
    public void update(byte[] r11, int r12, int r13) {
        if (r13 != 1) goto L6;
        this.j6 += (long) (r11[r12] & 255);
        long r14 = this.DW;
        long r3 = this.j6;
        this.DW = r14 + r3;
        this.j6 = r3 % 65521;
        this.DW %= 65521;
        return;
    L6:
        int r0 = r13 / 5552;
        int r15 = r13 % 5552;
    L7:
        int r4 = r0 - 1;
        if (r0 <= 0) goto L9;
        int r1 = r12;
        int r16 = 5552;
    L15:
        int r5 = r16 - 1;
        if (r16 <= 0) goto L17;
        this.j6 += (long) (r11[r1] & 255);
        this.DW += this.j6;
        r1 = r1 + 1;
        r16 = r5;
        goto L15
    L17:
        this.j6 %= 65521;
        this.DW %= 65521;
        r12 = r1;
        r0 = r4;
    L9:
        int r2 = r15 - 1;
        if (r15 <= 0) goto L11;
        this.j6 += (long) (r11[r12] & 255);
        this.DW += this.j6;
        r12 = r12 + 1;
        r15 = r2;
        goto L9
    L11:
        this.j6 %= 65521;
        this.DW %= 65521;
    }
}
