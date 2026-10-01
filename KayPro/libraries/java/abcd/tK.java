package abcd;

class tK extends abcd.AbstractrK {
    private static final java.lang.reflect.Method Hw = null;
    private static final java.lang.reflect.Method v5 = null;

    static {
        Hw = j6(java.io.File.class, "canExecute", new java.lang.Class[0]);
        v5 = j6(java.io.File.class, "setExecutable", new java.lang.Class[]{java.lang.Boolean.TYPE});
    }

    tK() {
    }

    static boolean gn() {
        if (Hw != null) goto L5;
        return false;
    L5:
        if (v5 == null) goto L10;
        return true;
    L10:
        return false;
    }

    private static java.lang.reflect.Method j6(java.lang.Class<?> r1, java.lang.String r2, java.lang.Class<?>... r3) {
        return r1.getMethod(r2, r3);
    L5:
        return null;
    }

    @Override
    public boolean Hw() {
        return false;
    }

    @Override
    public boolean j6(java.io.File r3) {
        return ((java.lang.Boolean) Hw.invoke(r3, null)).booleanValue();
    L7:
        e = move-exception;
        throw new java.lang.Error(e);
    L10:
        e = move-exception;
        throw new java.lang.Error(e);
    L4:
        e = move-exception;
        throw new java.lang.Error(e);
    }

    @Override
    public boolean j6(java.io.File r4, boolean r5) {
        return ((java.lang.Boolean) v5.invoke(r4, new java.lang.Object[]{java.lang.Boolean.valueOf(r5)})).booleanValue();
    L7:
        e = move-exception;
        throw new java.lang.Error(e);
    L10:
        e = move-exception;
        throw new java.lang.Error(e);
    L4:
        e = move-exception;
        throw new java.lang.Error(e);
    }

    @Override
    public boolean v5() {
        return true;
    }
}
