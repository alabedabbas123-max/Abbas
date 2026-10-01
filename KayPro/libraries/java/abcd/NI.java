package abcd;

public class NI extends abcd.AbstractzI {
    private java.util.Map<java.lang.String, abcd.YI> v5;

    public NI() {
        this.v5 = java.util.Collections.emptyMap();
    }

    public java.util.Collection<abcd.YI> FH() {
        return java.util.Collections.unmodifiableCollection(this.v5.values());
    }

    void j6(java.util.Map<java.lang.String, abcd.YI> r1) {
        this.v5 = r1;
    }
}
