package abcd;

public final class Rt implements abcd.St {
    private int DW;
    private final byte[] j6;

    public Rt(byte... r1) {
        this.j6 = r1;
    }

    @Override
    public byte readByte() {
        byte[] r0 = this.j6;
        int r1 = this.DW;
        this.DW = r1 + 1;
        return r0[r1];
    }
}
