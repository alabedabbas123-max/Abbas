package abcd;

public class rM extends abcd.CL {
    public rM(java.io.OutputStream r1) {
        super(r1);
    }

    @Override
    abcd.CL DW() {
        return this;
    }

    @Override
    abcd.CL j6() {
        return this;
    }

    @Override
    public void j6(abcd.InterfaceqL r2) {
        if (r2 == null) goto L6;
        r2.DW().VH().j6(this);
        return;
    L6:
        throw new java.io.IOException("null object detected");
    }
}
