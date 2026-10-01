package abcd;

public class CP extends java.lang.Exception {
    private java.lang.Throwable j6;

    public CP(java.lang.String r1) {
        super(r1);
    }

    public CP(java.lang.String r1, java.lang.Throwable r2) {
        super(r1);
        this.j6 = r2;
    }

    @Override
    public java.lang.Throwable getCause() {
        return this.j6;
    }
}
