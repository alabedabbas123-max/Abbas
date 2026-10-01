package abcd;

public class SN {
    private abcd.AN DW;
    private abcd.yN j6;

    public SN(abcd.yN r1) {
        this.j6 = r1;
        this.DW = r1.VH().v5();
    }

    public SN(byte[] r1) {
        this(j6(r1));
    }

    private static abcd.yN j6(byte[] r3) {
        return abcd.yN.j6(abcd.EL.j6(r3));
    L8:
        e = move-exception;
        throw new abcd.RN("malformed data: " + e.getMessage(), e);
    L5:
        e = move-exception;
        throw new abcd.RN("malformed data: " + e.getMessage(), e);
    }

    public boolean equals(java.lang.Object r2) {
        if (r2 != this) goto L6;
        return true;
    L6:
        if ((r2 instanceof abcd.SN) == true) goto L10;
        return false;
    L10:
        return this.j6.equals(((abcd.SN) r2).j6);
    }

    public int hashCode() {
        return this.j6.hashCode();
    }

    public abcd.yN j6() {
        return this.j6;
    }
}
