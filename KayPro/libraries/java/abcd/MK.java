package abcd;

public class MK extends java.util.AbstractMap<java.lang.String, abcd.ME> {
    private KK<abcd.ME> DW;
    private KK<abcd.ME> FH;
    private KK<abcd.ME> Hw;
    private java.util.Set<java.util.Map.Entry<java.lang.String, abcd.ME>> VH;
    private boolean Zo;
    private final java.lang.String j6;
    private int v5;

    private class a implements java.util.Map.Entry<java.lang.String, abcd.ME> {
        final abcd.MK DW;
        private abcd.ME j6;

        a(abcd.MK r1, abcd.ME r2) {
            this.DW = r1;
            this.j6 = r2;
        }

        @Override
        public boolean equals(java.lang.Object r3) {
            if ((r3 instanceof java.util.Map.Entry) == false) goto L17;
            java.util.Map.Entry r4 = (java.util.Map.Entry) r3;
            java.lang.Object r0 = r4.getKey();
            java.lang.Object r5 = r4.getValue();
            if ((r0 instanceof java.lang.String) == true) goto L7;
            return false;
        L7:
            if ((r5 instanceof abcd.ME) == false) goto L20;
            abcd.ME r6 = (abcd.ME) r5;
            if (r6.getName().equals(this.j6.getName()) == false) goto L21;
            abcd.yE r7 = r6.DW();
            abcd.yE r1 = this.j6.DW();
            if (r7 == null) goto L22;
            if (r1 != null) goto L14;
            return false;
        L14:
            if (abcd.YD.j6(r7, r1) == false) goto L24;
            return true;
        L24:
            return false;
        L22:
            return false;
        L21:
            return false;
        L20:
            return false;
        L17:
            return false;
        }

        @Override
        public java.lang.String getKey() {
            return getKey2();
        }

        @Override
        public java.lang.String getKey2() {
            return abcd.MK.j6(this.DW, this.j6);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public abcd.ME getValue() {
            return this.j6;
        }

        @Override
        public abcd.ME getValue() {
            return getValue();
        }

        @Override
        public int hashCode() {
            return getKey2().hashCode();
        }

        public abcd.ME j6(abcd.ME r3) {
            abcd.ME r0 = this.DW.j6(getKey2(), r3);
            this.j6 = r3;
            return r0;
        }

        @Override
        public abcd.ME setValue(abcd.ME r1) {
            return j6(r1);
        }

        public java.lang.String toString() {
            return this.j6.toString();
        }
    }

    private class b implements java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.ME>> {
        private int DW;
        private int FH;
        private java.util.Map.Entry<java.lang.String, abcd.ME> Hw;
        private int j6;
        final abcd.MK v5;

        b(abcd.MK r3) {
            this.v5 = r3;
            if (abcd.MK.DW(r3).length() <= 0) goto L6;
            this.j6 = -(abcd.MK.FH(r3).DW(abcd.MK.DW(r3)) + 1);
            this.DW = -(abcd.MK.Hw(r3).DW(abcd.MK.DW(r3)) + 1);
            this.FH = -(abcd.MK.v5(r3).DW(abcd.MK.DW(r3)) + 1);
            return;
        }

        private abcd.MK.a DW(abcd.ME r3) {
            if (r3.getName().startsWith(abcd.MK.DW(this.v5)) == true) goto L5;
            this.j6 = abcd.MK.FH(this.v5).size();
            this.DW = abcd.MK.Hw(this.v5).size();
            this.FH = abcd.MK.v5(this.v5).size();
            return null;
        L5:
            return new abcd.MK.a(this.v5, r3);
        }

        private abcd.ME j6(abcd.ME r3) {
            if (this.FH >= abcd.MK.v5(this.v5).size()) goto L12;
            abcd.ME r0 = abcd.MK.v5(this.v5).get(this.FH);
            int r1 = abcd.NE.DW(r3, r0);
            if (r1 != 0) goto L8;
            this.FH++;
            return r0;
        L8:
            if (r1 <= 0) goto L12;
            throw new java.lang.IllegalStateException();
        L12:
            return r3;
        }

        @Override
        public boolean hasNext() {
            if (this.Hw != null) goto L6;
            this.Hw = j6();
        L6:
            if (this.Hw == null) goto L9;
            return true;
        L9:
            return false;
        }

        public java.util.Map.Entry<java.lang.String, abcd.ME> j6() {
            if (this.j6 >= abcd.MK.FH(this.v5).size()) goto L15;
            if (this.DW >= abcd.MK.Hw(this.v5).size()) goto L15;
            abcd.ME r0 = abcd.MK.FH(this.v5).get(this.j6);
            abcd.ME r1 = abcd.MK.Hw(this.v5).get(this.DW);
            int r2 = abcd.NE.DW(r0, r1);
            if (r2 >= 0) goto L10;
            this.j6++;
            return DW(r0);
        L10:
            if (r2 != 0) goto L12;
            this.j6++;
        L12:
            this.DW++;
            return DW(j6(r1));
        L15:
            if (this.DW >= abcd.MK.Hw(this.v5).size()) goto L19;
            abcd.KK r3 = abcd.MK.Hw(this.v5);
            int r4 = this.DW;
            this.DW = r4 + 1;
            return DW(j6(r3.get(r4)));
        L19:
            if (this.j6 >= abcd.MK.FH(this.v5).size()) goto L22;
            abcd.KK r5 = abcd.MK.FH(this.v5);
            int r6 = this.j6;
            this.j6 = r6 + 1;
            return DW(r5.get(r6));
        L22:
            return null;
        }

        @Override
        public java.util.Map.Entry<java.lang.String, abcd.ME> next() {
            return next2();
        }

        @Override
        public java.util.Map.Entry<java.lang.String, abcd.ME> next2() {
            if (hasNext() == false) goto L7;
            java.util.Map.Entry<java.lang.String, abcd.ME> r0 = this.Hw;
            this.Hw = j6();
            return r0;
        L7:
            throw new java.util.NoSuchElementException();
        }

        @Override
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MK(java.lang.String r1, KK<? extends abcd.ME> r2, KK<? extends abcd.ME> r3, KK<? extends abcd.ME> r4) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
    }

    static java.lang.String DW(abcd.MK r0) {
        return r0.j6;
    }

    static void DW(abcd.MK r0, abcd.KK r1) {
        r0.FH = r1;
    }

    static abcd.KK FH(abcd.MK r0) {
        return r0.DW;
    }

    static void FH(abcd.MK r0, abcd.KK r1) {
        r0.Hw = r1;
    }

    static abcd.KK Hw(abcd.MK r0) {
        return r0.FH;
    }

    static boolean Zo(abcd.MK r0) {
        return r0.Zo;
    }

    static int j6(abcd.MK r0) {
        return r0.v5;
    }

    private java.lang.String j6(abcd.ME r2) {
        java.lang.String r3 = r2.getName();
        if (this.j6.length() > 0) goto L5;
        return r3;
    L5:
        return r3.substring(this.j6.length());
    }

    static java.lang.String j6(abcd.MK r0, abcd.ME r1) {
        return r0.j6(r1);
    }

    private java.lang.String j6(java.lang.String r3) {
        if (this.j6.length() > 0) goto L5;
        return r3;
    L5:
        return java.lang.String.valueOf(this.j6) + r3;
    }

    static void j6(abcd.MK r0, int r1) {
        r0.v5 = r1;
    }

    static void j6(abcd.MK r0, abcd.KK r1) {
        r0.DW = r1;
    }

    static void j6(abcd.MK r0, boolean r1) {
        r0.Zo = r1;
    }

    static abcd.KK v5(abcd.MK r0) {
        return r0.Hw;
    }

    @Override
    public boolean containsKey(java.lang.Object r1) {
        if (get(r1) == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override
    public java.util.Set<java.util.Map.Entry<java.lang.String, abcd.ME>> entrySet() {
        if (this.VH != null) goto L6;
        this.VH = new abcd.LK(this);
    L6:
        return this.VH;
    }

    @Override
    public abcd.ME get(java.lang.Object r2) {
        java.lang.String r3 = j6((java.lang.String) r2);
        abcd.ME r0 = this.Hw.FH(r3);
        if (r0 != null) goto L5;
        r0 = this.FH.FH(r3);
    L5:
        if (r0 == null) goto L7;
        return r0;
    L7:
        return this.DW.FH(r3);
    }

    @Override
    public java.lang.Object get(java.lang.Object r1) {
        return get(r1);
    }

    @Override
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    public abcd.ME j6(java.lang.String r5, abcd.ME r6) {
        java.lang.String r0 = j6(r5);
        if (r0.equals(r6.getName()) == false) goto L18;
        if (this.Hw.isEmpty() == true) goto L11;
        java.util.Iterator<abcd.ME> r1 = this.Hw.iterator();
    L8:
        if (r1.hasNext() == false) goto L9;
        abcd.ME r2 = r1.next();
        this.FH = this.FH.j6(r2);
        goto L8
    L9:
        this.Hw = abcd.KK.DW();
    L11:
        int r3 = this.FH.DW(r0);
        if (r3 < 0) goto L15;
        abcd.ME r7 = this.FH.FH(r0);
        this.FH = this.FH.DW(r3, r6);
        return r7;
    L15:
        abcd.ME r8 = get(r5);
        this.FH = this.FH.j6(r3, r6);
        this.Zo = false;
        return r8;
    L18:
        throw new java.lang.IllegalArgumentException();
    }

    @Override
    public java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
        return j6((java.lang.String) r1, (abcd.ME) r2);
    }

    @Override
    public abcd.ME remove(java.lang.Object r5) {
        java.lang.String r6 = j6((java.lang.String) r5);
        int r0 = this.DW.DW(r6);
        if (r0 < 0) goto L5;
        abcd.ME r2 = this.DW.FH(r6);
        this.DW = this.DW.remove(r0);
        this.Zo = false;
    L6:
        int r1 = this.FH.DW(r6);
        if (r1 < 0) goto L9;
        r2 = this.FH.FH(r6);
        this.FH = this.FH.remove(r1);
        this.Zo = false;
    L9:
        int r3 = this.Hw.DW(r6);
        if (r3 < 0) goto L13;
        abcd.ME r4 = this.Hw.FH(r6);
        this.Hw = this.Hw.remove(r3);
        this.Zo = false;
        return r4;
    L13:
        return r2;
    L5:
        r2 = null;
        goto L6
    }

    @Override
    public java.lang.Object remove(java.lang.Object r1) {
        return remove(r1);
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append('[');
        java.util.Iterator<abcd.ME> r1 = values().iterator();
        boolean r2 = true;
    L4:
        if (r1.hasNext() == false) goto L5;
        abcd.ME r3 = r1.next();
        if (r2 == false) goto L10;
        r2 = false;
    L11:
        r0.append(r3);
        goto L4
    L10:
        r0.append(", ");
        goto L11
    L5:
        r0.append(']');
        return r0.toString();
    }
}
