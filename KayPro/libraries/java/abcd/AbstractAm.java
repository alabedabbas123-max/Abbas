package abcd;

public abstract class AbstractAm implements abcd.Interfaceon {
    private final java.lang.String j6;

    public AbstractAm(java.lang.String r2) {
        if (r2 == null) goto L7;
        this.j6 = r2;
        return;
    L7:
        throw new java.lang.NullPointerException("name == null");
    }

    @Override
    public java.lang.String getName() {
        return this.j6;
    }
}
