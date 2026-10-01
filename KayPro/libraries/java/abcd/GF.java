package abcd;

public abstract class GF {
    private java.util.Locale effectiveLocale;
    private java.util.ResourceBundle resourceBundle;

    public GF() {
    }

    void j6(java.util.Locale r8) {
        java.lang.Class<?> r0 = getClass();
        this.resourceBundle = java.util.ResourceBundle.getBundle(r0.getName(), r8);     // Catch: java.util.MissingResourceException -> L21
        this.effectiveLocale = this.resourceBundle.getLocale();
        java.lang.reflect.Field[] r1 = r0.getFields();
        int r2 = r1.length;
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L6;
        java.lang.reflect.Field r4 = r1[r3];
        if (r4.getType().equals(java.lang.String.class) == false) goto L20;
        r4.set(this, this.resourceBundle.getString(r4.getName()));     // Catch: java.lang.IllegalAccessException -> L11 java.lang.IllegalArgumentException -> L14 java.util.MissingResourceException -> L17
    L11:
        e = move-exception;
        throw new java.lang.Error(e);
    L14:
        e = move-exception;
        throw new java.lang.Error(e);
    L17:
        e = move-exception;
        throw new abcd.xD(r0, r8, r4.getName(), e);
    L20:
        r3 = r3 + 1;
        goto L5
    L6:
        return;
    L21:
        e = move-exception;
        throw new abcd.wD(r0, r8, e);
    }
}
