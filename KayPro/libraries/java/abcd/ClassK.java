package abcd;

public class ClassK<K, V> extends x<K, V> implements java.util.Map<K, V> {
    r<K, V> gn;

    public ClassK() {
    }

    public ClassK(int r1) {
        super(r1);
    }

    private r<K, V> DW() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.gn != null) { $pc0 = 6; continue $sw0; }
                    this.gn = new abcd.ClassJ(this);
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return this.gn;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.util.Iterator<java.util.Map.Entry<? extends K, ? extends V>> r4 = null;
        java.util.Map.Entry<? extends K, ? extends V> r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    j6(this.VH + r3.size());
                    r4 = r3.entrySet().iterator();
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r4.hasNext() == false) { $pc1 = 6; continue $sw1; }
                    r0 = r4.next();
                    put(r0.getKey(), r0.getValue());
                    { $pc1 = 4; continue $sw1; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.util.Collection<V> values() {
        return DW().Zo();
    }
}
