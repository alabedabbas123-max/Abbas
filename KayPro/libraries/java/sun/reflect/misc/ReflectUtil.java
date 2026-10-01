package sun.reflect.misc;

import java.lang.reflect.Modifier;
import sun.reflect.Reflection;

public final class ReflectUtil {
    private ReflectUtil() {
    }

    public static Class forName(String name) throws ClassNotFoundException {
        checkPackageAccess(name);
        return Class.forName(name);
    }

    public static Object newInstance(Class cls) throws IllegalAccessException, InstantiationException {
        checkPackageAccess(cls);
        return cls.newInstance();
    }

    public static void ensureMemberAccess(Class currentClass, Class memberClass, Object target, int modifiers) throws IllegalAccessException {
        if (target == null && Modifier.isProtected(modifiers)) {
            int mods = (modifiers & (-5)) | 1;
            Reflection.ensureMemberAccess(currentClass, memberClass, target, mods);
            try {
                Reflection.ensureMemberAccess(currentClass, memberClass, target, mods & (-2));
                return;
            } catch (IllegalAccessException e) {
                if (isSubclassOf(currentClass, memberClass)) {
                    return;
                } else {
                    throw e;
                }
            }
        }
        Reflection.ensureMemberAccess(currentClass, memberClass, target, modifiers);
    }

    private static boolean isSubclassOf(Class queryClass, Class ofClass) {
        while (queryClass != null) {
            if (queryClass == ofClass) {
                return true;
            }
            queryClass = queryClass.getSuperclass();
        }
        return false;
    }

    public static void checkPackageAccess(Class clazz) {
        checkPackageAccess(clazz.getName());
    }

    public static void checkPackageAccess(String name) {
        int b;
        SecurityManager s = System.getSecurityManager();
        if (s != null) {
            String cname = name.replace('/', '.');
            if (cname.startsWith("[") && (b = cname.lastIndexOf(91) + 2) > 1 && b < cname.length()) {
                cname = cname.substring(b);
            }
            int i = cname.lastIndexOf(46);
            if (i != -1) {
                s.checkPackageAccess(cname.substring(0, i));
            }
        }
    }

    public static boolean isPackageAccessible(Class clazz) {
        try {
            checkPackageAccess(clazz);
            return true;
        } catch (SecurityException e) {
            return false;
        }
    }
}
