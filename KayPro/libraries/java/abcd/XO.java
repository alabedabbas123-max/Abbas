package abcd;

public class XO implements abcd.InterfaceqO {
    private byte[] j6;

    public XO(byte[] r3) {
        this(r3, 0, r3.length);
    }

    public XO(byte[] r3, int r4, int r5) {
        this.j6 = new byte[r5];
        java.lang.System.arraycopy(r3, r4, this.j6, 0, r5);
    }

    public byte[] j6() {
        return this.j6;
    }
}
