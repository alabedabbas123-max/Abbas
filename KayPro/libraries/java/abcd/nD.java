package abcd;

public class nD extends abcd.yD {
    public nD(abcd.HJ r2, java.lang.String r3) {
        super(r2 + ": " + r3);
    }

    public nD(java.lang.String r1) {
        super(r1);
    }

    public nD(java.lang.String r1, java.lang.Throwable r2) {
        super(r1);
        initCause(r2);
    }
}
