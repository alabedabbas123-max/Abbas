package abcd;

public final class ClassD {
    static final abcd.ClassD.e j6 = null;

    static class a extends abcd.ClassD.e {
        private static boolean DW;
        private static java.lang.reflect.Method j6;

        a() {
        }

        @Override
        public boolean j6(android.graphics.drawable.Drawable r7, int r8) {
            java.lang.reflect.Method r0 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (DW == false) { $pc0 = 18; continue $sw0; }
                        $pc0 = 11; continue $sw0;
                    }
                    case 11: {
                        r0 = j6;
                        if (r0 != null) { $pc0 = 20; continue $sw0; }
                        $pc0 = 17; continue $sw0;
                    }
                    case 17: {
                        return false;
                    }
                    case 20: {
                        try {
                            r0.invoke(r7, new java.lang.Object[]{java.lang.Integer.valueOf(r8)});
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.Exception) { $pc0 = 15; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        return true;
                    }
                    case 15: {
                        e = $ex0;
                        android.util.Log.i("DrawableCompatApi17", "Failed to invoke setLayoutDirection(int) via reflection", e);
                        j6 = null;
                        { $pc0 = 17; continue $sw0; }
                    }
                    case 18: {
                        $pc0 = 10; continue $sw0;
                    }
                    case 8: {
                        e = $ex0;
                        android.util.Log.i("DrawableCompatApi17", "Failed to retrieve setLayoutDirection(int) method", e);
                        $pc0 = 10; continue $sw0;
                    }
                    case 10: {
                        DW = true;
                        { $pc0 = 11; continue $sw0; }
                    }
                    case 6: {
                        try {
                            j6 = android.graphics.drawable.Drawable.class.getDeclaredMethod("setLayoutDirection", new java.lang.Class[]{java.lang.Integer.TYPE});
                            j6.setAccessible(true);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.NoSuchMethodException) { $pc0 = 8; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        { $pc0 = 10; continue $sw0; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static class b extends abcd.ClassD.a {
        b() {
        }

        @Override
        public android.graphics.drawable.Drawable DW(android.graphics.drawable.Drawable r2) {
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if ((r2 instanceof abcd.Interfacei) == false) { $pc1 = 5; continue $sw1; }
                        return r2;
                    }
                    case 5: {
                        return new abcd.ClassG(r2);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean j6(android.graphics.drawable.Drawable r1) {
            return r1.isAutoMirrored();
        }
    }

    static class c extends abcd.ClassD.b {
        c() {
        }

        @Override
        public android.graphics.drawable.Drawable DW(android.graphics.drawable.Drawable r2) {
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        if ((r2 instanceof abcd.Interfacei) == false) { $pc2 = 5; continue $sw2; }
                        return r2;
                    }
                    case 5: {
                        return new abcd.ClassH(r2);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void j6(android.graphics.drawable.Drawable r1, android.content.res.ColorStateList r2) {
            r1.setTintList(r2);
        }

        @Override
        public void j6(android.graphics.drawable.Drawable r1, android.graphics.PorterDuff.Mode r2) {
            r1.setTintMode(r2);
        }
    }

    static class C0006d extends abcd.ClassD.c {
        C0006d() {
        }

        @Override
        public android.graphics.drawable.Drawable DW(android.graphics.drawable.Drawable r1) {
            return r1;
        }

        @Override
        public boolean j6(android.graphics.drawable.Drawable r1, int r2) {
            return r1.setLayoutDirection(r2);
        }
    }

    static class e {
        e() {
        }

        public android.graphics.drawable.Drawable DW(android.graphics.drawable.Drawable r2) {
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        if ((r2 instanceof abcd.Interfacei) == false) { $pc3 = 5; continue $sw3; }
                        return r2;
                    }
                    case 5: {
                        return new abcd.ClassF(r2);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void j6(android.graphics.drawable.Drawable r2, android.content.res.ColorStateList r3) {
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        if ((r2 instanceof abcd.Interfacei) == false) { $pc4 = 6; continue $sw4; }
                        ((abcd.Interfacei) r2).setTintList(r3);
                        return;
                    }
                    case 6: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void j6(android.graphics.drawable.Drawable r2, android.graphics.PorterDuff.Mode r3) {
            java.lang.Throwable $ex5 = null;
            int $pc5 = -1;
            $sw5: while (true) {
                switch ($pc5) {
                    case -1: {
                        if ((r2 instanceof abcd.Interfacei) == false) { $pc5 = 6; continue $sw5; }
                        ((abcd.Interfacei) r2).setTintMode(r3);
                        return;
                    }
                    case 6: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public boolean j6(android.graphics.drawable.Drawable r1) {
            return false;
        }

        public boolean j6(android.graphics.drawable.Drawable r1, int r2) {
            return false;
        }
    }

    static {
        int r0 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = android.os.Build.VERSION.SDK_INT;
                    if (r0 < 23) { $pc6 = 6; continue $sw6; }
                    j6 = new abcd.ClassD.C0006d();
                    return;
                }
                case 6: {
                    if (r0 < 21) { $pc6 = 9; continue $sw6; }
                    j6 = new abcd.ClassD.c();
                    return;
                }
                case 9: {
                    if (r0 < 19) { $pc6 = 12; continue $sw6; }
                    j6 = new abcd.ClassD.b();
                    return;
                }
                case 12: {
                    if (r0 < 17) { $pc6 = 14; continue $sw6; }
                    j6 = new abcd.ClassD.a();
                    return;
                }
                case 14: {
                    j6 = new abcd.ClassD.e();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static android.graphics.drawable.Drawable DW(android.graphics.drawable.Drawable r1) {
        return j6.DW(r1);
    }

    public static void j6(android.graphics.drawable.Drawable r1, android.content.res.ColorStateList r2) {
        j6.j6(r1, r2);
    }

    public static void j6(android.graphics.drawable.Drawable r1, android.graphics.PorterDuff.Mode r2) {
        j6.j6(r1, r2);
    }

    public static boolean j6(android.graphics.drawable.Drawable r1) {
        return j6.j6(r1);
    }

    public static boolean j6(android.graphics.drawable.Drawable r1, int r2) {
        return j6.j6(r1, r2);
    }
}
