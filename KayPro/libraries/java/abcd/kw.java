package abcd;

public final class kw extends dalvik.system.DexClassLoader {
    private final boolean j6;

    private static class a<E> implements java.util.Enumeration<E> {
        private int DW;
        private java.util.Enumeration<E>[] j6;

        public a(java.util.Enumeration<E>[] r2) {
            this.DW = 0;
            this.j6 = r2;
        }

        private boolean j6() {
        L2:
            int r0 = this.DW;
            java.util.Enumeration<E>[] r1 = this.j6;
            if (r0 >= r1.length) goto L10;
            if (r1[r0] == null) goto L9;
            if (r1[r0].hasMoreElements() == false) goto L9;
            return true;
        L9:
            this.DW++;
            goto L2
        L10:
            return false;
        }

        @Override
        public boolean hasMoreElements() {
            return j6();
        }

        @Override
        public E nextElement() {
            if (j6() == false) goto L7;
            return this.j6[this.DW].nextElement();
        L7:
            throw new java.util.NoSuchElementException();
        }
    }

    public kw(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.ClassLoader r4, boolean r5) {
        super(r1, r2, r3, r4);
        this.j6 = r5;
    }

    @Override
    public java.net.URL getResource(java.lang.String r3) {
        java.net.URL r0 = java.lang.Object.class.getClassLoader().getResource(r3);
        if (r0 == null) goto L5;
        return r0;
    L5:
        java.net.URL r1 = findResource(r3);
        if (r1 == null) goto L9;
        return r1;
    L9:
        if (this.j6 == false) goto L15;
        java.lang.ClassLoader r2 = getParent();
        if (r2 != null) goto L14;
        return null;
    L14:
        return r2.getResource(r3);
    L15:
        return null;
    }

    @Override
    public java.util.Enumeration<java.net.URL> getResources(java.lang.String r4) {
        java.util.Enumeration[] r0 = new java.util.Enumeration[3];
        r0[0] = java.lang.Object.class.getClassLoader().getResources(r4);
        r0[1] = findResources(r4);
        if (getParent() != null) goto L5;
    L8:
        java.util.Enumeration<java.net.URL> r5 = null;
    L9:
        r0[2] = r5;
        return new abcd.kw.a(r0);
    L5:
        if (this.j6 == false) goto L8;
        r5 = getParent().getResources(r4);
        goto L9
    }

    @Override
    protected java.lang.Class<?> loadClass(java.lang.String r2, boolean r3) {
        java.lang.Class<?> r4 = findLoadedClass(r2);
        if (r4 == null) goto L13;
        return r4;
    L13:
        return java.lang.Object.class.getClassLoader().loadClass(r2);
    L7:
        return findClass(r2);
    L9:
        e = move-exception;
        return getParent().loadClass(r2);
    L12:
        throw e;
    }
}
