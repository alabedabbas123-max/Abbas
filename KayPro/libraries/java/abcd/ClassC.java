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
            if (this.DW == true) goto L5;
            c.c<K, V> r0 = this.j6;
            if (r0 != null) goto L12;
        L14:
            return false;
        L12:
            if (r0.j6 == null) goto L14;
            return true;
        L5:
            if (abcd.ClassC.j6(this.FH) != null) goto L16;
            return false;
        L16:
            return true;
        }

        @Override
        public java.lang.Object next() {
            return next();
        }

        @Override
        public java.util.Map.Entry<K, V> next() {
            if (this.DW == false) goto L5;
            this.DW = false;
            this.j6 = abcd.ClassC.j6(this.FH);
        L11:
            return this.j6;
        L5:
            c.c<K, V> r0 = this.j6;
            if (r0 == null) goto L8;
            c.c<K, V> r1 = r0.j6;
        L9:
            this.j6 = r1;
            goto L11
        L8:
            r1 = null;
            goto L9
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
            c.c<K, V> r0 = this.DW;
            c.c<K, V> r1 = this.j6;
            if (r0 == r1) goto L8;
            if (r1 != null) goto L7;
            return null;
        L7:
            return j6(r0);
        L8:
            return null;
        }

        @Override
        public boolean hasNext() {
            if (this.DW == null) goto L5;
            return true;
        L5:
            return false;
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
        if (r6 != this) goto L6;
        return true;
    L6:
        if ((r6 instanceof abcd.ClassC) == true) goto L8;
        return false;
    L8:
        abcd.ClassC r7 = (abcd.ClassC) r6;
        if (size() == r7.size()) goto L11;
        return false;
    L11:
        java.util.Iterator<java.util.Map.Entry<K, V>> r1 = iterator();
        java.util.Iterator<java.util.Map.Entry<K, V>> r8 = r7.iterator();
    L13:
        if (r1.hasNext() == false) goto L24;
        if (r8.hasNext() == false) goto L24;
        java.util.Map.Entry<K, V> r3 = r1.next();
        java.util.Map.Entry<K, V> r4 = r8.next();
        if (r3 != null) goto L19;
        if (r4 == null) goto L19;
    L22:
        return false;
    L19:
        if (r3 == null) goto L13;
        if (r3.equals(r4) == true) goto L13;
    L24:
        if (r1.hasNext() == false) goto L26;
    L28:
        return false;
    L26:
        if (r8.hasNext() == true) goto L28;
        return true;
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
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append("[");
        java.util.Iterator<java.util.Map.Entry<K, V>> r1 = iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        r0.append(r1.next().toString());
        if (r1.hasNext() == false) goto L4;
        r0.append(", ");
        goto L4
    L8:
        r0.append("]");
        return r0.toString();
    }
}
