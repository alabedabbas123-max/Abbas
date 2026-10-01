package abcd;

public class tL extends java.io.IOException {
    private java.lang.Throwable j6;

    tL(java.lang.String r1) {
        super(r1);
    }

    tL(java.lang.String r1, java.lang.Throwable r2) {
        super(r1);
        this.j6 = r2;
    }

    @Override
    public java.lang.Throwable getCause() {
        return this.j6;
    }
}
