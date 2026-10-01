package abcd;

public class EP extends java.lang.RuntimeException {
    private java.lang.Throwable j6;

    public EP(java.lang.String r1, java.lang.Throwable r2) {
        super(r1);
        this.j6 = r2;
    }

    @Override
    public java.lang.Throwable getCause() {
        return this.j6;
    }
}
