package abcd;

public class DM extends abcd.CL {
    public DM(java.io.OutputStream r1) {
        super(r1);
    }

    @Override
    public void j6(abcd.InterfaceqL r2) {
        if (r2 == null) goto L6;
        r2.DW().gn().j6(this);
        return;
    L6:
        throw new java.io.IOException("null object detected");
    }
}
