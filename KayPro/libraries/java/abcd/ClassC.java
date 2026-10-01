package abcd;

public class ClassC<K, V> implements java.lang.Iterable<java.util.Map.Entry<K, V>> {
    private c.c<K, V> DW;
    private java.util.WeakHashMap<c.f<K, V>, java.lang.Boolean> FH;
    private int Hw;
    private c.c<K, V> j6;

    static class a<K, V> extends c.e<K, V> {
        a(c.c<K, V> r1, c.c<K, V> r2) {
            super(r1, r2);
        }

        c.c<K, V> j6(c.c<K, V> r1) {
            return r1.j6;
        }
    }

    private static class b<K, V> extends c.e<K, V> {
        b(c.c<K, V> r1, c.c<K, V> r2) {
            super(r1, r2);
        }

        c.c<K, V> j6(c.c<K, V> r1) {
            return r1.DW;
        }
    }

    static class C0005c<K, V> implements java.util.Map.Entry<K, V> {
        c.c<K, V> DW;
        c.c<K, V> j6;
    }

    private class d implements java.util.Iterator<java.util.Map.Entry<K, V>>, c.f<K, V> {
        private boolean DW;
        final abcd.ClassC FH;
        private c.c<K, V> j6;

        private d(abcd.ClassC r1) {
            this.FH = r1;
            this.DW = true;
        }

        d(abcd.ClassC r1, abcd.ClassB r2) {
            this(r1);
        }

        @Override
        public boolean hasNext() {
            c.c<K, V> r0 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (this.DW == true) { $pc0 = 5; continue $sw0; }
                        r0 = this.j6;
                        if (r0 != null) { $pc0 = 12; continue $sw0; }
                        $pc0 = 14; continue $sw0;
                    }
                    case 14: {
                        return false;
                    }
                    case 12: {
                        if (r0.j6 == null) { $pc0 = 14; continue $sw0; }
                        return true;
                    }
                    case 5: {
                        if (abcd.ClassC.j6(this.FH) != null) { $pc0 = 16; continue $sw0; }
                        return false;
                    }
                    case 16: {
                        return true;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public java.lang.Object next() {
            return next();
        }

        @Override
        public java.util.Map.Entry<K, V> next() {
            c.c<K, V> r0 = null;
            c.c<K, V> r1 = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if (this.DW == false) { $pc1 = 5; continue $sw1; }
                        this.DW = false;
                        this.j6 = abcd.ClassC.j6(this.FH);
                        $pc1 = 11; continue $sw1;
                    }
                    case 11: {
                        return this.j6;
                    }
                    case 5: {
                        r0 = this.j6;
                        if (r0 == null) { $pc1 = 8; continue $sw1; }
                        r1 = r0.j6;
                        $pc1 = 9; continue $sw1;
                    }
                    case 9: {
                        this.j6 = r1;
                        { $pc1 = 11; continue $sw1; }
                    }
                    case 8: {
                        r1 = null;
                        { $pc1 = 9; continue $sw1; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    private static abstract class e<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>>, c.f<K, V> {
        c.c<K, V> DW;
        c.c<K, V> j6;

        e(c.c<K, V> r1, c.c<K, V> r2) {
            this.j6 = r2;
            this.DW = r1;
        }

        private c.c<K, V> j6() {
            c.c<K, V> r0 = null;
            c.c<K, V> r1 = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r0 = this.DW;
                        r1 = this.j6;
                        if (r0 == r1) { $pc2 = 8; continue $sw2; }
                        if (r1 != null) { $pc2 = 7; continue $sw2; }
                        return null;
                    }
                    case 7: {
                        return j6(r0);
                    }
                    case 8: {
                        return null;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean hasNext() {
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        if (this.DW == null) { $pc3 = 5; continue $sw3; }
                        return true;
                    }
                    case 5: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        abstract c.c<K, V> j6(c.c<K, V> r1);

        @Override
        public java.lang.Object next() {
            return next();
        }

        @Override
        public java.util.Map.Entry<K, V> next() {
            c.c<K, V> r0 = this.DW;
            this.DW = j6();
            return r0;
        }
    }

    interface f<K, V> {
    }

    public ClassC() {
        this.FH = new java.util.WeakHashMap();
        this.Hw = 0;
    }

    static abcd.ClassC.C0005c j6(abcd.ClassC r0) {
        return r0.j6;
    }

    public c<K, V>.d DW() {
        c.f<K, V> r0 = new abcd.ClassC.d(this, null);
        this.FH.put(r0, false);
        return r0;
    }

    public java.util.Map.Entry<K, V> FH() {
        return this.DW;
    }

    public java.util.Iterator<java.util.Map.Entry<K, V>> descendingIterator() {
        c.f<K, V> r0 = new abcd.ClassC.b(this.DW, this.j6);
        this.FH.put(r0, false);
        return r0;
    }

    public boolean equals(java.lang.Object r6) {
        abcd.ClassC r7 = null;
        java.util.Iterator<java.util.Map.Entry<K, V>> r1 = null;
        java.util.Iterator<java.util.Map.Entry<K, V>> r8 = null;
        java.util.Map.Entry<K, V> r3 = null;
        java.util.Map.Entry<K, V> r4 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r6 != this) { $pc4 = 6; continue $sw4; }
                    return true;
                }
                case 6: {
                    if ((r6 instanceof abcd.ClassC) == true) { $pc4 = 8; continue $sw4; }
                    return false;
                }
                case 8: {
                    r7 = (abcd.ClassC) r6;
                    if (size() == r7.size()) { $pc4 = 11; continue $sw4; }
                    return false;
                }
                case 11: {
                    r1 = iterator();
                    r8 = r7.iterator();
                    $pc4 = 13; continue $sw4;
                }
                case 13: {
                    if (r1.hasNext() == false) { $pc4 = 24; continue $sw4; }
                    if (r8.hasNext() == false) { $pc4 = 24; continue $sw4; }
                    r3 = r1.next();
                    r4 = r8.next();
                    if (r3 != null) { $pc4 = 19; continue $sw4; }
                    if (r4 == null) { $pc4 = 19; continue $sw4; }
                    $pc4 = 22; continue $sw4;
                }
                case 22: {
                    return false;
                }
                case 19: {
                    if (r3 == null) { $pc4 = 13; continue $sw4; }
                    if (r3.equals(r4) == true) { $pc4 = 13; continue $sw4; }
                    $pc4 = 24; continue $sw4;
                }
                case 24: {
                    if (r1.hasNext() == false) { $pc4 = 26; continue $sw4; }
                    $pc4 = 28; continue $sw4;
                }
                case 28: {
                    return false;
                }
                case 26: {
                    if (r8.hasNext() == true) { $pc4 = 28; continue $sw4; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
        c.f<K, V> r0 = new abcd.ClassC.a(this.j6, this.DW);
        this.FH.put(r0, false);
        return r0;
    }

    public java.util.Map.Entry<K, V> j6() {
        return this.j6;
    }

    public int size() {
        return this.Hw;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        java.util.Iterator<java.util.Map.Entry<K, V>> r1 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r0.append("[");
                    r1 = iterator();
                    $pc5 = 4; continue $sw5;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc5 = 8; continue $sw5; }
                    r0.append(r1.next().toString());
                    if (r1.hasNext() == false) { $pc5 = 4; continue $sw5; }
                    r0.append(", ");
                    { $pc5 = 4; continue $sw5; }
                }
                case 8: {
                    r0.append("]");
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
