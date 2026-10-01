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
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (this.FH >= this.DW) { $pc0 = 5; continue $sw0; }
                        return true;
                    }
                    case 5: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public T next() {
            T r0 = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if (hasNext() == false) { $pc1 = 7; continue $sw1; }
                        r0 = (T) this.v5.j6(this.FH, this.j6);
                        this.FH++;
                        this.Hw = true;
                        return r0;
                    }
                    case 7: {
                        throw new java.util.NoSuchElementException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void remove() {
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        if (this.Hw == false) { $pc2 = 7; continue $sw2; }
                        this.FH--;
                        this.DW--;
                        this.Hw = false;
                        this.v5.j6(this.FH);
                        return;
                    }
                    case 7: {
                        throw new java.lang.IllegalStateException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            int r0 = 0;
            java.util.Iterator<? extends java.util.Map.Entry<K, V>> r6 = null;
            java.util.Map.Entry<K, V> r1 = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        r0 = this.j6.FH();
                        r6 = r5.iterator();
                        $pc3 = 4; continue $sw3;
                    }
                    case 4: {
                        if (r6.hasNext() == false) { $pc3 = 7; continue $sw3; }
                        r1 = r6.next();
                        this.j6.j6(r1.getKey(), r1.getValue());
                        { $pc3 = 4; continue $sw3; }
                    }
                    case 7: {
                        if (r0 == this.j6.FH()) { $pc3 = 9; continue $sw3; }
                        return true;
                    }
                    case 9: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void clear() {
            this.j6.j6();
        }

        @Override
        public boolean contains(java.lang.Object r4) {
            java.util.Map.Entry r5 = null;
            int r0 = 0;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        if ((r4 instanceof java.util.Map.Entry) == true) { $pc4 = 5; continue $sw4; }
                        return false;
                    }
                    case 5: {
                        r5 = (java.util.Map.Entry) r4;
                        r0 = this.j6.j6(r5.getKey());
                        if (r0 >= 0) { $pc4 = 9; continue $sw4; }
                        return false;
                    }
                    case 9: {
                        return abcd.ClassN.j6(this.j6.j6(r0, 1), r5.getValue());
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean containsAll(java.util.Collection<?> r2) {
            java.util.Iterator<?> r3 = null;
            java.lang.Throwable $ex5 = null;
            int $pc5 = -1;
            $sw5: while (true) {
                switch ($pc5) {
                    case -1: {
                        r3 = r2.iterator();
                        $pc5 = 4; continue $sw5;
                    }
                    case 4: {
                        if (r3.hasNext() == false) { $pc5 = 9; continue $sw5; }
                        if (contains(r3.next()) == true) { $pc5 = 4; continue $sw5; }
                        return false;
                    }
                    case 9: {
                        return true;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean equals(java.lang.Object r1) {
            return abcd.r.j6(this, r1);
        }

        @Override
        public int hashCode() {
            int r0 = 0;
            int r3 = 0;
            java.lang.Object r4 = null;
            java.lang.Object r5 = null;
            int r6 = 0;
            int r7 = 0;
            java.lang.Throwable $ex6 = null;
            int $pc6 = -1;
            $sw6: while (true) {
                switch ($pc6) {
                    case -1: {
                        r0 = this.j6.FH() - 1;
                        r3 = 0;
                        $pc6 = 3; continue $sw6;
                    }
                    case 3: {
                        if (r0 < 0) { $pc6 = 12; continue $sw6; }
                        r4 = this.j6.j6(r0, 0);
                        r5 = this.j6.j6(r0, 1);
                        if (r4 != null) { $pc6 = 7; continue $sw6; }
                        r6 = 0;
                        $pc6 = 8; continue $sw6;
                    }
                    case 8: {
                        if (r5 != null) { $pc6 = 10; continue $sw6; }
                        r7 = 0;
                        $pc6 = 11; continue $sw6;
                    }
                    case 11: {
                        r3 = r3 + (r6 ^ r7);
                        r0 = r0 - 1;
                        { $pc6 = 3; continue $sw6; }
                    }
                    case 10: {
                        r7 = r5.hashCode();
                        { $pc6 = 11; continue $sw6; }
                    }
                    case 7: {
                        r6 = r4.hashCode();
                        { $pc6 = 8; continue $sw6; }
                    }
                    case 12: {
                        return r3;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean isEmpty() {
            java.lang.Throwable $ex7 = null;
            int $pc7 = -1;
            $sw7: while (true) {
                switch ($pc7) {
                    case -1: {
                        if (this.j6.FH() != 0) { $pc7 = 5; continue $sw7; }
                        return true;
                    }
                    case 5: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            java.lang.Throwable $ex8 = null;
            int $pc8 = -1;
            $sw8: while (true) {
                switch ($pc8) {
                    case -1: {
                        if (this.j6.j6(r2) < 0) { $pc8 = 5; continue $sw8; }
                        return true;
                    }
                    case 5: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            int r0 = 0;
            int r2 = 0;
            java.lang.Object r3 = null;
            int r4 = 0;
            java.lang.Throwable $ex9 = null;
            int $pc9 = -1;
            $sw9: while (true) {
                switch ($pc9) {
                    case -1: {
                        r0 = this.j6.FH() - 1;
                        r2 = 0;
                        $pc9 = 3; continue $sw9;
                    }
                    case 3: {
                        if (r0 < 0) { $pc9 = 9; continue $sw9; }
                        r3 = this.j6.j6(r0, 0);
                        if (r3 != null) { $pc9 = 7; continue $sw9; }
                        r4 = 0;
                        $pc9 = 8; continue $sw9;
                    }
                    case 8: {
                        r2 = r2 + r4;
                        r0 = r0 - 1;
                        { $pc9 = 3; continue $sw9; }
                    }
                    case 7: {
                        r4 = r3.hashCode();
                        { $pc9 = 8; continue $sw9; }
                    }
                    case 9: {
                        return r2;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean isEmpty() {
            java.lang.Throwable $ex10 = null;
            int $pc10 = -1;
            $sw10: while (true) {
                switch ($pc10) {
                    case -1: {
                        if (this.j6.FH() != 0) { $pc10 = 5; continue $sw10; }
                        return true;
                    }
                    case 5: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public java.util.Iterator<K> iterator() {
            return new abcd.r.a(this.j6, 0);
        }

        @Override
        public boolean remove(java.lang.Object r2) {
            int r3 = 0;
            java.lang.Throwable $ex11 = null;
            int $pc11 = -1;
            $sw11: while (true) {
                switch ($pc11) {
                    case -1: {
                        r3 = this.j6.j6(r2);
                        if (r3 < 0) { $pc11 = 6; continue $sw11; }
                        this.j6.j6(r3);
                        return true;
                    }
                    case 6: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            java.util.Map.Entry r6 = null;
            java.lang.Throwable $ex12 = null;
            int $pc12 = -1;
            $sw12: while (true) {
                switch ($pc12) {
                    case -1: {
                        if (this.FH == false) { $pc12 = 14; continue $sw12; }
                        if ((r5 instanceof java.util.Map.Entry) == true) { $pc12 = 7; continue $sw12; }
                        return false;
                    }
                    case 7: {
                        r6 = (java.util.Map.Entry) r5;
                        if (abcd.ClassN.j6(r6.getKey(), this.Hw.j6(this.DW, 0)) == true) { $pc12 = 10; continue $sw12; }
                        return false;
                    }
                    case 10: {
                        if (abcd.ClassN.j6(r6.getValue(), this.Hw.j6(this.DW, 1)) == false) { $pc12 = 16; continue $sw12; }
                        return true;
                    }
                    case 16: {
                        return false;
                    }
                    case 14: {
                        throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public K getKey() {
            java.lang.Throwable $ex13 = null;
            int $pc13 = -1;
            $sw13: while (true) {
                switch ($pc13) {
                    case -1: {
                        if (this.FH == false) { $pc13 = 7; continue $sw13; }
                        return (K) this.Hw.j6(this.DW, 0);
                    }
                    case 7: {
                        throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public V getValue() {
            java.lang.Throwable $ex14 = null;
            int $pc14 = -1;
            $sw14: while (true) {
                switch ($pc14) {
                    case -1: {
                        if (this.FH == false) { $pc14 = 7; continue $sw14; }
                        return (V) this.Hw.j6(this.DW, 1);
                    }
                    case 7: {
                        throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean hasNext() {
            java.lang.Throwable $ex15 = null;
            int $pc15 = -1;
            $sw15: while (true) {
                switch ($pc15) {
                    case -1: {
                        if (this.DW >= this.j6) { $pc15 = 5; continue $sw15; }
                        return true;
                    }
                    case 5: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public final int hashCode() {
            int r2 = 0;
            java.lang.Object r0 = null;
            java.lang.Object r1 = null;
            int r3 = 0;
            java.lang.Throwable $ex16 = null;
            int $pc16 = -1;
            $sw16: while (true) {
                switch ($pc16) {
                    case -1: {
                        if (this.FH == false) { $pc16 = 14; continue $sw16; }
                        r2 = 0;
                        r0 = this.Hw.j6(this.DW, 0);
                        r1 = this.Hw.j6(this.DW, 1);
                        if (r0 != null) { $pc16 = 7; continue $sw16; }
                        r3 = 0;
                        $pc16 = 8; continue $sw16;
                    }
                    case 8: {
                        if (r1 == null) { $pc16 = 12; continue $sw16; }
                        r2 = r1.hashCode();
                        $pc16 = 12; continue $sw16;
                    }
                    case 12: {
                        return r3 ^ r2;
                    }
                    case 7: {
                        r3 = r0.hashCode();
                        { $pc16 = 8; continue $sw16; }
                    }
                    case 14: {
                        throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public java.lang.Object next() {
            next();
            return this;
        }

        @Override
        public java.util.Map.Entry<K, V> next() {
            java.lang.Throwable $ex17 = null;
            int $pc17 = -1;
            $sw17: while (true) {
                switch ($pc17) {
                    case -1: {
                        if (hasNext() == false) { $pc17 = 7; continue $sw17; }
                        this.DW++;
                        this.FH = true;
                        return this;
                    }
                    case 7: {
                        throw new java.util.NoSuchElementException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void remove() {
            java.lang.Throwable $ex18 = null;
            int $pc18 = -1;
            $sw18: while (true) {
                switch ($pc18) {
                    case -1: {
                        if (this.FH == false) { $pc18 = 7; continue $sw18; }
                        this.Hw.j6(this.DW);
                        this.DW--;
                        this.j6--;
                        this.FH = false;
                        return;
                    }
                    case 7: {
                        throw new java.lang.IllegalStateException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public V setValue(V r3) {
            java.lang.Throwable $ex19 = null;
            int $pc19 = -1;
            $sw19: while (true) {
                switch ($pc19) {
                    case -1: {
                        if (this.FH == false) { $pc19 = 7; continue $sw19; }
                        return (V) this.Hw.j6(this.DW, r3);
                    }
                    case 7: {
                        throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            java.lang.Throwable $ex20 = null;
            int $pc20 = -1;
            $sw20: while (true) {
                switch ($pc20) {
                    case -1: {
                        if (this.j6.DW(r2) < 0) { $pc20 = 5; continue $sw20; }
                        return true;
                    }
                    case 5: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean containsAll(java.util.Collection<?> r2) {
            java.util.Iterator<?> r3 = null;
            java.lang.Throwable $ex21 = null;
            int $pc21 = -1;
            $sw21: while (true) {
                switch ($pc21) {
                    case -1: {
                        r3 = r2.iterator();
                        $pc21 = 4; continue $sw21;
                    }
                    case 4: {
                        if (r3.hasNext() == false) { $pc21 = 9; continue $sw21; }
                        if (contains(r3.next()) == true) { $pc21 = 4; continue $sw21; }
                        return false;
                    }
                    case 9: {
                        return true;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean isEmpty() {
            java.lang.Throwable $ex22 = null;
            int $pc22 = -1;
            $sw22: while (true) {
                switch ($pc22) {
                    case -1: {
                        if (this.j6.FH() != 0) { $pc22 = 5; continue $sw22; }
                        return true;
                    }
                    case 5: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public java.util.Iterator<V> iterator() {
            return new abcd.r.a(this.j6, 1);
        }

        @Override
        public boolean remove(java.lang.Object r2) {
            int r3 = 0;
            java.lang.Throwable $ex23 = null;
            int $pc23 = -1;
            $sw23: while (true) {
                switch ($pc23) {
                    case -1: {
                        r3 = this.j6.DW(r2);
                        if (r3 < 0) { $pc23 = 6; continue $sw23; }
                        this.j6.j6(r3);
                        return true;
                    }
                    case 6: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean removeAll(java.util.Collection<?> r6) {
            int r0 = 0;
            int r1 = 0;
            boolean r2 = false;
            java.lang.Throwable $ex24 = null;
            int $pc24 = -1;
            $sw24: while (true) {
                switch ($pc24) {
                    case -1: {
                        r0 = this.j6.FH();
                        r1 = 0;
                        r2 = false;
                        $pc24 = 3; continue $sw24;
                    }
                    case 3: {
                        if (r1 >= r0) { $pc24 = 8; continue $sw24; }
                        if (r6.contains(this.j6.j6(r1, 1)) == false) { $pc24 = 7; continue $sw24; }
                        this.j6.j6(r1);
                        r1 = r1 - 1;
                        r0 = r0 - 1;
                        r2 = true;
                        $pc24 = 7; continue $sw24;
                    }
                    case 7: {
                        r1 = r1 + 1;
                        { $pc24 = 3; continue $sw24; }
                    }
                    case 8: {
                        return r2;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean retainAll(java.util.Collection<?> r6) {
            int r0 = 0;
            int r1 = 0;
            boolean r2 = false;
            java.lang.Throwable $ex25 = null;
            int $pc25 = -1;
            $sw25: while (true) {
                switch ($pc25) {
                    case -1: {
                        r0 = this.j6.FH();
                        r1 = 0;
                        r2 = false;
                        $pc25 = 3; continue $sw25;
                    }
                    case 3: {
                        if (r1 >= r0) { $pc25 = 8; continue $sw25; }
                        if (r6.contains(this.j6.j6(r1, 1)) == true) { $pc25 = 7; continue $sw25; }
                        this.j6.j6(r1);
                        r1 = r1 - 1;
                        r0 = r0 - 1;
                        r2 = true;
                        $pc25 = 7; continue $sw25;
                    }
                    case 7: {
                        r1 = r1 + 1;
                        { $pc25 = 3; continue $sw25; }
                    }
                    case 8: {
                        return r2;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
        int r0 = 0;
        java.util.Iterator<?> r4 = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = -1;
        $sw26: while (true) {
            switch ($pc26) {
                case -1: {
                    r0 = r2.size();
                    r4 = r3.iterator();
                    $pc26 = 4; continue $sw26;
                }
                case 4: {
                    if (r4.hasNext() == false) { $pc26 = 7; continue $sw26; }
                    r2.remove(r4.next());
                    { $pc26 = 4; continue $sw26; }
                }
                case 7: {
                    if (r0 == r2.size()) { $pc26 = 9; continue $sw26; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static <K, V> boolean FH(java.util.Map<K, V> r3, java.util.Collection<?> r4) {
        int r0 = 0;
        java.util.Iterator<K> r1 = null;
        java.lang.Throwable $ex27 = null;
        int $pc27 = -1;
        $sw27: while (true) {
            switch ($pc27) {
                case -1: {
                    r0 = r3.size();
                    r1 = r3.keySet().iterator();
                    $pc27 = 4; continue $sw27;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc27 = 9; continue $sw27; }
                    if (r4.contains(r1.next()) == true) { $pc27 = 4; continue $sw27; }
                    r1.remove();
                    { $pc27 = 4; continue $sw27; }
                }
                case 9: {
                    if (r0 == r3.size()) { $pc27 = 11; continue $sw27; }
                    return true;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static <K, V> boolean j6(java.util.Map<K, V> r1, java.util.Collection<?> r2) {
        java.util.Iterator<?> r3 = null;
        java.lang.Throwable $ex28 = null;
        int $pc28 = -1;
        $sw28: while (true) {
            switch ($pc28) {
                case -1: {
                    r3 = r2.iterator();
                    $pc28 = 4; continue $sw28;
                }
                case 4: {
                    if (r3.hasNext() == false) { $pc28 = 9; continue $sw28; }
                    if (r1.containsKey(r3.next()) == true) { $pc28 = 4; continue $sw28; }
                    return false;
                }
                case 9: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static <T> boolean j6(java.util.Set<T> r4, java.lang.Object r5) {
        java.util.Set r6 = null;
        java.lang.Throwable $ex29 = null;
        int $pc29 = -1;
        $sw29: while (true) {
            switch ($pc29) {
                case -1: {
                    if (r4 != r5) { $pc29 = 6; continue $sw29; }
                    return true;
                }
                case 6: {
                    if ((r5 instanceof java.util.Set) == false) { $pc29 = 15; continue $sw29; }
                    r6 = (java.util.Set) r5;
                    if (r4.size() != r6.size()) { $pc29 = 13; continue $sw29; }
                    if (r4.containsAll(r6) == false) { $pc29 = 13; continue $sw29; }
                    return true;
                }
                case 13: {
                    return false;
                }
                case 15: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract int DW(java.lang.Object r1);

    protected abstract java.util.Map<K, V> DW();

    public java.lang.Object[] DW(int r5) {
        int r0 = 0;
        java.lang.Object[] r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex30 = null;
        int $pc30 = -1;
        $sw30: while (true) {
            switch ($pc30) {
                case -1: {
                    r0 = FH();
                    r1 = new java.lang.Object[r0];
                    r2 = 0;
                    $pc30 = 3; continue $sw30;
                }
                case 3: {
                    if (r2 >= r0) { $pc30 = 5; continue $sw30; }
                    r1[r2] = j6(r2, r5);
                    r2 = r2 + 1;
                    { $pc30 = 3; continue $sw30; }
                }
                case 5: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract int FH();

    public java.util.Set<java.util.Map.Entry<K, V>> Hw() {
        java.lang.Throwable $ex31 = null;
        int $pc31 = -1;
        $sw31: while (true) {
            switch ($pc31) {
                case -1: {
                    if (this.j6 != null) { $pc31 = 6; continue $sw31; }
                    this.j6 = new abcd.r.b(this);
                    $pc31 = 6; continue $sw31;
                }
                case 6: {
                    return this.j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.Collection<V> Zo() {
        java.lang.Throwable $ex32 = null;
        int $pc32 = -1;
        $sw32: while (true) {
            switch ($pc32) {
                case -1: {
                    if (this.FH != null) { $pc32 = 6; continue $sw32; }
                    this.FH = new abcd.r.e(this);
                    $pc32 = 6; continue $sw32;
                }
                case 6: {
                    return this.FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract int j6(java.lang.Object r1);

    protected abstract java.lang.Object j6(int r1, int r2);

    protected abstract V j6(int r1, V r2);

    protected abstract void j6();

    protected abstract void j6(int r1);

    protected abstract void j6(K r1, V r2);

    public <T> T[] j6(T[] r4, int r5) {
        int r0 = 0;
        int r1 = 0;
        T[] r6 = null;
        java.lang.Throwable $ex33 = null;
        int $pc33 = -1;
        $sw33: while (true) {
            switch ($pc33) {
                case -1: {
                    r0 = FH();
                    if (r4.length >= r0) { $pc33 = 5; continue $sw33; }
                    r4 = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(r4.getClass().getComponentType(), r0));
                    $pc33 = 5; continue $sw33;
                }
                case 5: {
                    r1 = 0;
                    $pc33 = 6; continue $sw33;
                }
                case 6: {
                    if (r1 >= r0) { $pc33 = 9; continue $sw33; }
                    r6 = r4;
                    r6[r1] = j6(r1, r5);
                    r1 = r1 + 1;
                    { $pc33 = 6; continue $sw33; }
                }
                case 9: {
                    if (r4.length <= r0) { $pc33 = 11; continue $sw33; }
                    r4[r0] = null;
                    $pc33 = 11; continue $sw33;
                }
                case 11: {
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.Set<K> v5() {
        java.lang.Throwable $ex34 = null;
        int $pc34 = -1;
        $sw34: while (true) {
            switch ($pc34) {
                case -1: {
                    if (this.DW != null) { $pc34 = 6; continue $sw34; }
                    this.DW = new abcd.r.c(this);
                    $pc34 = 6; continue $sw34;
                }
                case 6: {
                    return this.DW;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
