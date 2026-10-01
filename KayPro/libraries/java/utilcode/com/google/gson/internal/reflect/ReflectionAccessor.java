package utilcode.com.google.gson.internal.reflect;

import java.lang.reflect.AccessibleObject;
import utilcode.com.google.gson.internal.JavaVersion;

public abstract class ReflectionAccessor {
    private static final ReflectionAccessor instance;

    static {
        instance = JavaVersion.getMajorJavaVersion() < 9 ? new PreJava9ReflectionAccessor() : new UnsafeReflectionAccessor();
    }

    public static ReflectionAccessor getInstance() {
        return instance;
    }

    public abstract void makeAccessible(AccessibleObject accessibleObject);
}
