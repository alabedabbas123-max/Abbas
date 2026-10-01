package abcd;

public class XN extends java.lang.Exception {
    java.lang.Exception j6;

    public XN(java.lang.String r1, java.lang.Exception r2) {
        super(r1);
        this.j6 = r2;
    }

    @Override
    public java.lang.Throwable getCause() {
        return this.j6;
    }
}
