package abcd;

abstract class r<K, V> {
    r<K, V>.c DW;
    r<K, V>.e FH;
    r<K, V>.b j6;

    final class a<T> implements java.util.Iterator<T> {
        int DW;
        int FH;
        boolean Hw;
        final int j6;
        final abcd.r v5;

        a(abcd.r r2, int r3) {
            this.v5 = r2;
            this.Hw = false;
            this.j6 = r3;
            this.DW = r2.FH();
        }

        @Override
        public boolean hasNext() {
            if (this.FH >= this.DW) goto L5;
            return true;
        L5:
            return false;
        }

        @Override
        public T next() {
            if (hasNext() == false) goto L7;
            T r0 = (T) this.v5.j6(this.FH, this.j6);
            this.FH++;
            this.Hw = true;
            return r0;
        L7:
            throw new java.util.NoSuchElementException();
        }

        @Override
        public void remove() {
            if (this.Hw == false) goto L7;
            this.FH--;
            this.DW--;
            this.Hw = false;
            this.v5.j6(this.FH);
            return;
        L7:
            throw new java.lang.IllegalStateException();
        }
    }

    final class b implements java.util.Set<java.util.Map.Entry<K, V>> {
        final abcd.r j6;

        b(abcd.r r1) {
            this.j6 = r1;
        }

        @Override
        public boolean add(java.lang.Object r1) {
            j6((java.util.Map.Entry) r1);
            throw null;
        }

        @Override
        public boolean addAll(java.util.Collection<? extends java.util.Map.Entry<K, V>> r5) {
            int r0 = this.j6.FH();
            java.util.Iterator<? extends java.util.Map.Entry<K, V>> r6 = r5.iterator();
        L4:
            if (r6.hasNext() == false) goto L7;
            java.util.Map.Entry<K, V> r1 = r6.next();
            this.j6.j6(r1.getKey(), r1.getValue());
            goto L4
        L7:
            if (r0 == this.j6.FH()) goto L9;
            return true;
        L9:
            return false;
        }

        @Override
        public void clear() {
            this.j6.j6();
        }

        @Override
        public boolean contains(java.lang.Object r4) {
            if ((r4 instanceof java.util.Map.Entry) == true) goto L5;
            return false;
        L5:
            java.util.Map.Entry r5 = (java.util.Map.Entry) r4;
            int r0 = this.j6.j6(r5.getKey());
            if (r0 >= 0) goto L9;
            return false;
        L9:
            return abcd.ClassN.j6(this.j6.j6(r0, 1), r5.getValue());
        }

        @Override
        public boolean containsAll(java.util.Collection<?> r2) {
            java.util.Iterator<?> r3 = r2.iterator();
        L4:
            if (r3.hasNext() == false) goto L9;
            if (contains(r3.next()) == true) goto L4;
            return false;
        L9:
            return true;
        }

        @Override
        public boolean equals(java.lang.Object r1) {
            return abcd.r.j6(this, r1);
        }

        @Override
        public int hashCode() {
            int r0 = this.j6.FH() - 1;
            int r3 = 0;
        L3:
            if (r0 < 0) goto L12;
            java.lang.Object r4 = this.j6.j6(r0, 0);
            java.lang.Object r5 = this.j6.j6(r0, 1);
            if (r4 != null) goto L7;
            int r6 = 0;
        L8:
            if (r5 != null) goto L10;
            int r7 = 0;
        L11:
            r3 = r3 + (r6 ^ r7);
            r0 = r0 - 1;
            goto L3
        L10:
            r7 = r5.hashCode();
            goto L11
        L7:
            r6 = r4.hashCode();
            goto L8
        L12:
            return r3;
        }

        @Override
        public boolean isEmpty() {
            if (this.j6.FH() != 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Override
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return new abcd.r.d(this.j6);
        }

        public boolean j6(java.util.Map.Entry<K, V> r1) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override
        public boolean remove(java.lang.Object r1) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override
        public boolean removeAll(java.util.Collection<?> r1) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override
        public boolean retainAll(java.util.Collection<?> r1) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override
        public int size() {
            return this.j6.FH();
        }

        @Override
        public java.lang.Object[] toArray() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override
        public <T> T[] toArray(T[] r1) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    final class c implements java.util.Set<K> {
        final abcd.r j6;

        c(abcd.r r1) {
            this.j6 = r1;
        }

        @Override
        public boolean add(K r1) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override
        public boolean addAll(java.util.Collection<? extends K> r1) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override
        public void clear() {
            this.j6.j6();
        }

        @Override
        public boolean contains(java.lang.Object r2) {
            if (this.j6.j6(r2) < 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Override
        public boolean containsAll(java.util.Collection<?> r2) {
            return abcd.r.j6(this.j6.DW(), r2);
        }

        @Override
        public boolean equals(java.lang.Object r1) {
            return abcd.r.j6(this, r1);
        }

        @Override
        public int hashCode() {
            int r0 = this.j6.FH() - 1;
            int r2 = 0;
        L3:
            if (r0 < 0) goto L9;
            java.lang.Object r3 = this.j6.j6(r0, 0);
            if (r3 != null) goto L7;
            int r4 = 0;
        L8:
            r2 = r2 + r4;
            r0 = r0 - 1;
            goto L3
        L7:
            r4 = r3.hashCode();
            goto L8
        L9:
            return r2;
        }

        @Override
        public boolean isEmpty() {
            if (this.j6.FH() != 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Override
        public java.util.Iterator<K> iterator() {
            return new abcd.r.a(this.j6, 0);
        }

        @Override
        public boolean remove(java.lang.Object r2) {
            int r3 = this.j6.j6(r2);
            if (r3 < 0) goto L6;
            this.j6.j6(r3);
            return true;
        L6:
            return false;
        }

        @Override
        public boolean removeAll(java.util.Collection<?> r2) {
            return abcd.r.DW(this.j6.DW(), r2);
        }

        @Override
        public boolean retainAll(java.util.Collection<?> r2) {
            return abcd.r.FH(this.j6.DW(), r2);
        }

        @Override
        public int size() {
            return this.j6.FH();
        }

        @Override
        public java.lang.Object[] toArray() {
            return this.j6.DW(0);
        }

        @Override
        public <T> T[] toArray(T[] r3) {
            return (T[]) this.j6.j6(r3, 0);
        }
    }

    final class d implements java.util.Iterator<java.util.Map.Entry<K, V>>, java.util.Map.Entry<K, V> {
        int DW;
        boolean FH;
        final abcd.r Hw;
        int j6;

        d(abcd.r r2) {
            this.Hw = r2;
            this.FH = false;
            this.j6 = r2.FH() - 1;
            this.DW = -1;
        }

        @Override
        public final boolean equals(java.lang.Object r5) {
            if (this.FH == false) goto L14;
            if ((r5 instanceof java.util.Map.Entry) == true) goto L7;
            return false;
        L7:
            java.util.Map.Entry r6 = (java.util.Map.Entry) r5;
            if (abcd.ClassN.j6(r6.getKey(), this.Hw.j6(this.DW, 0)) == true) goto L10;
            return false;
        L10:
            if (abcd.ClassN.j6(r6.getValue(), this.Hw.j6(this.DW, 1)) == false) goto L16;
            return true;
        L16:
            return false;
        L14:
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override
        public K getKey() {
            if (this.FH == false) goto L7;
            return (K) this.Hw.j6(this.DW, 0);
        L7:
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override
        public V getValue() {
            if (this.FH == false) goto L7;
            return (V) this.Hw.j6(this.DW, 1);
        L7:
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override
        public boolean hasNext() {
            if (this.DW >= this.j6) goto L5;
            return true;
        L5:
            return false;
        }

        @Override
        public final int hashCode() {
            if (this.FH == false) goto L14;
            int r2 = 0;
            java.lang.Object r0 = this.Hw.j6(this.DW, 0);
            java.lang.Object r1 = this.Hw.j6(this.DW, 1);
            if (r0 != null) goto L7;
            int r3 = 0;
        L8:
            if (r1 == null) goto L12;
            r2 = r1.hashCode();
        L12:
            return r3 ^ r2;
        L7:
            r3 = r0.hashCode();
            goto L8
        L14:
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override
        public java.lang.Object next() {
            next();
            return this;
        }

        @Override
        public java.util.Map.Entry<K, V> next() {
            if (hasNext() == false) goto L7;
            this.DW++;
            this.FH = true;
            return this;
        L7:
            throw new java.util.NoSuchElementException();
        }

        @Override
        public void remove() {
            if (this.FH == false) goto L7;
            this.Hw.j6(this.DW);
            this.DW--;
            this.j6--;
            this.FH = false;
            return;
        L7:
            throw new java.lang.IllegalStateException();
        }

        @Override
        public V setValue(V r3) {
            if (this.FH == false) goto L7;
            return (V) this.Hw.j6(this.DW, r3);
        L7:
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final java.lang.String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class e implements java.util.Collection<V> {
        final abcd.r j6;

        e(abcd.r r1) {
            this.j6 = r1;
        }

        @Override
        public boolean add(V r1) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override
        public boolean addAll(java.util.Collection<? extends V> r1) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override
        public void clear() {
            this.j6.j6();
        }

        @Override
        public boolean contains(java.lang.Object r2) {
            if (this.j6.DW(r2) < 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Override
        public boolean containsAll(java.util.Collection<?> r2) {
            java.util.Iterator<?> r3 = r2.iterator();
        L4:
            if (r3.hasNext() == false) goto L9;
            if (contains(r3.next()) == true) goto L4;
            return false;
        L9:
            return true;
        }

        @Override
        public boolean isEmpty() {
            if (this.j6.FH() != 0) goto L5;
            return true;
        L5:
            return false;
        }

        @Override
        public java.util.Iterator<V> iterator() {
            return new abcd.r.a(this.j6, 1);
        }

        @Override
        public boolean remove(java.lang.Object r2) {
            int r3 = this.j6.DW(r2);
            if (r3 < 0) goto L6;
            this.j6.j6(r3);
            return true;
        L6:
            return false;
        }

        @Override
        public boolean removeAll(java.util.Collection<?> r6) {
            int r0 = this.j6.FH();
            int r1 = 0;
            boolean r2 = false;
        L3:
            if (r1 >= r0) goto L8;
            if (r6.contains(this.j6.j6(r1, 1)) == false) goto L7;
            this.j6.j6(r1);
            r1 = r1 - 1;
            r0 = r0 - 1;
            r2 = true;
        L7:
            r1 = r1 + 1;
            goto L3
        L8:
            return r2;
        }

        @Override
        public boolean retainAll(java.util.Collection<?> r6) {
            int r0 = this.j6.FH();
            int r1 = 0;
            boolean r2 = false;
        L3:
            if (r1 >= r0) goto L8;
            if (r6.contains(this.j6.j6(r1, 1)) == true) goto L7;
            this.j6.j6(r1);
            r1 = r1 - 1;
            r0 = r0 - 1;
            r2 = true;
        L7:
            r1 = r1 + 1;
            goto L3
        L8:
            return r2;
        }

        @Override
        public int size() {
            return this.j6.FH();
        }

        @Override
        public java.lang.Object[] toArray() {
            return this.j6.DW(1);
        }

        @Override
        public <T> T[] toArray(T[] r3) {
            return (T[]) this.j6.j6(r3, 1);
        }
    }

    r() {
    }

    public static <K, V> boolean DW(java.util.Map<K, V> r2, java.util.Collection<?> r3) {
        int r0 = r2.size();
        java.util.Iterator<?> r4 = r3.iterator();
    L4:
        if (r4.hasNext() == false) goto L7;
        r2.remove(r4.next());
        goto L4
    L7:
        if (r0 == r2.size()) goto L9;
        return true;
    L9:
        return false;
    }

    public static <K, V> boolean FH(java.util.Map<K, V> r3, java.util.Collection<?> r4) {
        int r0 = r3.size();
        java.util.Iterator<K> r1 = r3.keySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L9;
        if (r4.contains(r1.next()) == true) goto L4;
        r1.remove();
        goto L4
    L9:
        if (r0 == r3.size()) goto L11;
        return true;
    L11:
        return false;
    }

    public static <K, V> boolean j6(java.util.Map<K, V> r1, java.util.Collection<?> r2) {
        java.util.Iterator<?> r3 = r2.iterator();
    L4:
        if (r3.hasNext() == false) goto L9;
        if (r1.containsKey(r3.next()) == true) goto L4;
        return false;
    L9:
        return true;
    }

    public static <T> boolean j6(java.util.Set<T> r4, java.lang.Object r5) {
        if (r4 != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof java.util.Set) == false) goto L15;
        java.util.Set r6 = (java.util.Set) r5;
        if (r4.size() != r6.size()) goto L13;
        if (r4.containsAll(r6) == false) goto L13;
        return true;
    L13:
        return false;
    L15:
        return false;
    }

    protected abstract int DW(java.lang.Object r1);

    protected abstract java.util.Map<K, V> DW();

    public java.lang.Object[] DW(int r5) {
        int r0 = FH();
        java.lang.Object[] r1 = new java.lang.Object[r0];
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        r1[r2] = j6(r2, r5);
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    protected abstract int FH();

    public java.util.Set<java.util.Map.Entry<K, V>> Hw() {
        if (this.j6 != null) goto L6;
        this.j6 = new abcd.r.b(this);
    L6:
        return this.j6;
    }

    public java.util.Collection<V> Zo() {
        if (this.FH != null) goto L6;
        this.FH = new abcd.r.e(this);
    L6:
        return this.FH;
    }

    protected abstract int j6(java.lang.Object r1);

    protected abstract java.lang.Object j6(int r1, int r2);

    protected abstract V j6(int r1, V r2);

    protected abstract void j6();

    protected abstract void j6(int r1);

    protected abstract void j6(K r1, V r2);

    public <T> T[] j6(T[] r4, int r5) {
        int r0 = FH();
        if (r4.length >= r0) goto L5;
        r4 = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(r4.getClass().getComponentType(), r0));
    L5:
        int r1 = 0;
    L6:
        if (r1 >= r0) goto L9;
        T[] r6 = r4;
        r6[r1] = j6(r1, r5);
        r1 = r1 + 1;
        goto L6
    L9:
        if (r4.length <= r0) goto L11;
        r4[r0] = null;
    L11:
        return r4;
    }

    public java.util.Set<K> v5() {
        if (this.DW != null) goto L6;
        this.DW = new abcd.r.c(this);
    L6:
        return this.DW;
    }
}
