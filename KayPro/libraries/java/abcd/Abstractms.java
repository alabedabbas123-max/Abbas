package abcd;

public abstract class Abstractms implements abcd.Interfacelu, java.lang.Comparable<abcd.Abstractms> {
    public Abstractms() {
    }

    protected abstract int DW(abcd.Abstractms r1);

    public abstract boolean Hw();

    public abstract java.lang.String Zo();

    @Override
    public int compareTo(abcd.Abstractms r1) {
        return j6(r1);
    }

    public final int j6(abcd.Abstractms r3) {
        java.lang.Class<?> r0 = getClass();
        java.lang.Class<?> r1 = r3.getClass();
        if (r0 == r1) goto L7;
        return r0.getName().compareTo(r1.getName());
    L7:
        return DW(r3);
    }
}
