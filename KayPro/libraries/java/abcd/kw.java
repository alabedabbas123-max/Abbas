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
            int r0 = 0;
            java.util.Enumeration<E>[] r1 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = 2;
            $sw0: while (true) {
                switch ($pc0) {
                    case 2: {
                        r0 = this.DW;
                        r1 = this.j6;
                        if (r0 >= r1.length) { $pc0 = 10; continue $sw0; }
                        if (r1[r0] == null) { $pc0 = 9; continue $sw0; }
                        if (r1[r0].hasMoreElements() == false) { $pc0 = 9; continue $sw0; }
                        return true;
                    }
                    case 9: {
                        this.DW++;
                        { $pc0 = 2; continue $sw0; }
                    }
                    case 10: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean hasMoreElements() {
            return j6();
        }

        @Override
        public E nextElement() {
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if (j6() == false) { $pc1 = 7; continue $sw1; }
                        return this.j6[this.DW].nextElement();
                    }
                    case 7: {
                        throw new java.util.NoSuchElementException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public kw(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.ClassLoader r4, boolean r5) {
        super(r1, r2, r3, r4);
        this.j6 = r5;
    }

    @Override
    public java.net.URL getResource(java.lang.String r3) {
        java.net.URL r0 = null;
        java.net.URL r1 = null;
        java.lang.ClassLoader r2 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = java.lang.Object.class.getClassLoader().getResource(r3);
                    if (r0 == null) { $pc2 = 5; continue $sw2; }
                    return r0;
                }
                case 5: {
                    r1 = findResource(r3);
                    if (r1 == null) { $pc2 = 9; continue $sw2; }
                    return r1;
                }
                case 9: {
                    if (this.j6 == false) { $pc2 = 15; continue $sw2; }
                    r2 = getParent();
                    if (r2 != null) { $pc2 = 14; continue $sw2; }
                    return null;
                }
                case 14: {
                    return r2.getResource(r3);
                }
                case 15: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.util.Enumeration<java.net.URL> getResources(java.lang.String r4) {
        java.util.Enumeration[] r0 = null;
        java.util.Enumeration<java.net.URL> r5 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = new java.util.Enumeration[3];
                    r0[0] = java.lang.Object.class.getClassLoader().getResources(r4);
                    r0[1] = findResources(r4);
                    if (getParent() != null) { $pc3 = 5; continue $sw3; }
                    $pc3 = 8; continue $sw3;
                }
                case 8: {
                    r5 = null;
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    r0[2] = r5;
                    return new abcd.kw.a(r0);
                }
                case 5: {
                    if (this.j6 == false) { $pc3 = 8; continue $sw3; }
                    r5 = getParent().getResources(r4);
                    { $pc3 = 9; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected java.lang.Class<?> loadClass(java.lang.String r2, boolean r3) {
        java.lang.Class<?> r4 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r4 = findLoadedClass(r2);
                    if (r4 == null) { $pc4 = 13; continue $sw4; }
                    return r4;
                }
                case 13: {
                    return java.lang.Object.class.getClassLoader().loadClass(r2);
                }
                case 7: {
                    return findClass(r2);
                }
                case 9: {
                    e = $ex4;
                    return getParent().loadClass(r2);
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
