package abcd;

public class ClassK<K, V> extends x<K, V> implements java.util.Map<K, V> {
    r<K, V> gn;

    public ClassK() {
    }

    public ClassK(int r1) {
        super(r1);
    }

    private r<K, V> DW() {
        if (this.gn != null) goto L6;
        this.gn = new abcd.ClassJ(this);
    L6:
        return this.gn;
    }

    @Override
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return DW().Hw();
    }

    public boolean j6(java.util.Collection<?> r1) {
        return abcd.r.FH(this, r1);
    }

    @Override
    public java.util.Set<K> keySet() {
        return DW().v5();
    }

    @Override
    public void putAll(java.util.Map<? extends K, ? extends V> r3) {
        j6(this.VH + r3.size());
        java.util.Iterator<java.util.Map.Entry<? extends K, ? extends V>> r4 = r3.entrySet().iterator();
    L4:
        if (r4.hasNext() == false) goto L6;
        java.util.Map.Entry<? extends K, ? extends V> r0 = r4.next();
        put(r0.getKey(), r0.getValue());
        goto L4
    }

    @Override
    public java.util.Collection<V> values() {
        return DW().Zo();
    }
}
