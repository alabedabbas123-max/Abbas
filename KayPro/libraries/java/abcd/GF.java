package abcd;

public abstract class GF {
    private java.util.Locale effectiveLocale;
    private java.util.ResourceBundle resourceBundle;

    public GF() {
    }

    void j6(java.util.Locale r8) {
        java.lang.Class<?> r0 = null;
        java.lang.reflect.Field[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        java.lang.reflect.Field r4 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = getClass();
                    try {
                        this.resourceBundle = java.util.ResourceBundle.getBundle(r0.getName(), r8);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.util.MissingResourceException) { $pc0 = 21; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    this.effectiveLocale = this.resourceBundle.getLocale();
                    r1 = r0.getFields();
                    r2 = r1.length;
                    r3 = 0;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    if (r3 >= r2) { $pc0 = 6; continue $sw0; }
                    r4 = r1[r3];
                    if (r4.getType().equals(java.lang.String.class) == false) { $pc0 = 20; continue $sw0; }
                    try {
                        r4.set(this, this.resourceBundle.getString(r4.getName()));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.IllegalAccessException) { $pc0 = 11; continue $sw0; }
                        if ($t instanceof java.lang.IllegalArgumentException) { $pc0 = 14; continue $sw0; }
                        if ($t instanceof java.util.MissingResourceException) { $pc0 = 17; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 20; continue $sw0;
                }
                case 11: {
                    e = $ex0;
                    throw new java.lang.Error(e);
                }
                case 14: {
                    e = $ex0;
                    throw new java.lang.Error(e);
                }
                case 17: {
                    e = $ex0;
                    throw new abcd.xD(r0, r8, r4.getName(), e);
                }
                case 20: {
                    r3 = r3 + 1;
                    { $pc0 = 5; continue $sw0; }
                }
                case 6: {
                    return;
                }
                case 21: {
                    e = $ex0;
                    throw new abcd.wD(r0, r8, e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
