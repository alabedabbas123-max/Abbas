package abcd;

public abstract class KD<T extends abcd.LD> {
    private abcd.UE j6;

    public KD() {
    }

    public abstract java.lang.Class<T> j6();

    public abstract void j6(T r1);

    public void j6(abcd.UE r2) {
        if (this.j6 != null) goto L6;
        this.j6 = r2;
        return;
    }

    public java.lang.String toString() {
        java.lang.String r0 = getClass().getSimpleName();
        if (this.j6 != null) goto L6;
        return r0;
    L6:
        return java.lang.String.valueOf(r0) + "[" + this.j6 + "]";
    }
}
