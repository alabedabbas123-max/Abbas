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
            if (DW == false) goto L18;
        L11:
            java.lang.reflect.Method r0 = j6;
            if (r0 != null) goto L20;
        L17:
            return false;
        L20:
            r0.invoke(r7, new java.lang.Object[]{java.lang.Integer.valueOf(r8)});     // Catch: java.lang.Exception -> L15
            return true;
        L15:
            e = move-exception;
            android.util.Log.i("DrawableCompatApi17", "Failed to invoke setLayoutDirection(int) via reflection", e);
            j6 = null;
            goto L17
        L18:
        L8:
            e = move-exception;
            android.util.Log.i("DrawableCompatApi17", "Failed to retrieve setLayoutDirection(int) method", e);
        L10:
            DW = true;
            goto L11
        L6:
            j6 = android.graphics.drawable.Drawable.class.getDeclaredMethod("setLayoutDirection", new java.lang.Class[]{java.lang.Integer.TYPE});     // Catch: java.lang.NoSuchMethodException -> L8
            j6.setAccessible(true);     // Catch: java.lang.NoSuchMethodException -> L8
            goto L10
        }
    }

    static class b extends abcd.ClassD.a {
        b() {
        }

        @Override
        public android.graphics.drawable.Drawable DW(android.graphics.drawable.Drawable r2) {
            if ((r2 instanceof abcd.Interfacei) == false) goto L5;
            return r2;
        L5:
            return new abcd.ClassG(r2);
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
            if ((r2 instanceof abcd.Interfacei) == false) goto L5;
            return r2;
        L5:
            return new abcd.ClassH(r2);
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
            if ((r2 instanceof abcd.Interfacei) == false) goto L5;
            return r2;
        L5:
            return new abcd.ClassF(r2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void j6(android.graphics.drawable.Drawable r2, android.content.res.ColorStateList r3) {
            if ((r2 instanceof abcd.Interfacei) == false) goto L6;
            ((abcd.Interfacei) r2).setTintList(r3);
            return;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void j6(android.graphics.drawable.Drawable r2, android.graphics.PorterDuff.Mode r3) {
            if ((r2 instanceof abcd.Interfacei) == false) goto L6;
            ((abcd.Interfacei) r2).setTintMode(r3);
            return;
        }

        public boolean j6(android.graphics.drawable.Drawable r1) {
            return false;
        }

        public boolean j6(android.graphics.drawable.Drawable r1, int r2) {
            return false;
        }
    }

    static {
        int r0 = android.os.Build.VERSION.SDK_INT;
        if (r0 < 23) goto L6;
        j6 = new abcd.ClassD.C0006d();
        return;
    L6:
        if (r0 < 21) goto L9;
        j6 = new abcd.ClassD.c();
        return;
    L9:
        if (r0 < 19) goto L12;
        j6 = new abcd.ClassD.b();
        return;
    L12:
        if (r0 < 17) goto L14;
        j6 = new abcd.ClassD.a();
        return;
    L14:
        j6 = new abcd.ClassD.e();
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
