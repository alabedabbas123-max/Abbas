package com.caverock.androidsvg;

import android.graphics.Canvas;
import java.lang.reflect.Method;

@SuppressWarnings("JavaReflectionMemberAccess")
class CanvasLegacy {
    static final int MATRIX_SAVE_FLAG;
    private static final Method SAVE;

    static {
        try {
            try {
                MATRIX_SAVE_FLAG = ((Integer) Class.forName("android.graphics.Canvas").getField("MATRIX_SAVE_FLAG").get((Object) null)).intValue();
                try {
                    SAVE = Class.forName("android.graphics.Canvas").getMethod("save", Integer.TYPE);
                } catch (ClassNotFoundException e) {
                    throw new NoClassDefFoundError(e.getMessage());
                }
            } catch (ClassNotFoundException e2) {
                throw new NoClassDefFoundError(e2.getMessage());
            }
        } catch (Throwable th) {
            throw sneakyThrow(th);
        }
    }

    static void save(Canvas canvas, int i) {
        try {
            SAVE.invoke(canvas, new Integer(i));
        } catch (Throwable th) {
            throw sneakyThrow(th);
        }
    }

    private static RuntimeException sneakyThrow(Throwable th) {
        if (th == null) {
            throw new NullPointerException("t");
        }
        return (RuntimeException) sneakyThrow0(th);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> T sneakyThrow0(Throwable th) throws Throwable {
        throw th;
    }
}
