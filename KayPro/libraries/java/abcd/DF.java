package abcd;

class DF {
    private static final java.util.Map<java.util.Locale, java.util.Map<java.lang.Class, abcd.GF>> j6 = null;

    static {
        j6 = new java.util.HashMap();
    }

    static synchronized <T extends abcd.GF> T j6(java.util.Locale r3, java.lang.Class<T> r4) {
        monitor-enter(abcd.DF.class);
        java.util.Map r1 = j6.get(r3);     // Catch: java.lang.Throwable -> L12 java.lang.IllegalAccessException -> L14 java.lang.InstantiationException -> L17
        if (r1 != null) goto L7;
        r1 = new java.util.HashMap();     // Catch: java.lang.Throwable -> L12 java.lang.IllegalAccessException -> L14 java.lang.InstantiationException -> L17
        j6.put(r3, (java.util.Map<java.lang.Class, abcd.GF>) r1);     // Catch: java.lang.Throwable -> L12 java.lang.IllegalAccessException -> L14 java.lang.InstantiationException -> L17
    L7:
        T r2 = (T) r1.get(r4);     // Catch: java.lang.Throwable -> L12 java.lang.IllegalAccessException -> L14 java.lang.InstantiationException -> L17
        if (r2 != null) goto L10;
        r2 = r4.newInstance();     // Catch: java.lang.Throwable -> L12 java.lang.IllegalAccessException -> L14 java.lang.InstantiationException -> L17
        r2.j6(r3);     // Catch: java.lang.Throwable -> L12 java.lang.IllegalAccessException -> L14 java.lang.InstantiationException -> L17
        r1.put(r4, r2);     // Catch: java.lang.Throwable -> L12 java.lang.IllegalAccessException -> L14 java.lang.InstantiationException -> L17
    L10:
        monitor-exit(abcd.DF.class);
        return r2;
    L12:
        th = move-exception;
        throw th;
    L14:
        e = move-exception;
        throw new java.lang.Error(e);     // Catch: java.lang.Throwable -> L12
    L17:
        e = move-exception;
        throw new java.lang.Error(e);     // Catch: java.lang.Throwable -> L12
    }
}
