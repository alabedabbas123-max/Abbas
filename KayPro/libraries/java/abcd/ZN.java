package abcd;

public class ZN implements abcd.InterfacefO {
    private final byte[] DW;
    private final abcd.zL j6;

    public ZN(abcd.zL r1, byte[] r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    public ZN(byte[] r3) {
        this(new abcd.zL(abcd.TM.j6.tp()), r3);
    }

    @Override
    public abcd.zL getContentType() {
        return this.j6;
    }

    @Override
    public void j6(java.io.OutputStream r2) {
        r2.write(this.DW);
    }
}
