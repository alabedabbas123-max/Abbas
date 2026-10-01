package abcd;

public class yD extends java.io.IOException {
    public yD(abcd.HJ r3, java.lang.String r4) {
        super(r3.DW(null) + ": " + r4);
    }

    public yD(abcd.HJ r3, java.lang.String r4, java.lang.Throwable r5) {
        this(r3.DW(null) + ": " + r4, r5);
    }

    public yD(java.lang.String r1) {
        super(r1);
    }

    public yD(java.lang.String r1, java.lang.Throwable r2) {
        super(r1);
        initCause(r2);
    }
}
