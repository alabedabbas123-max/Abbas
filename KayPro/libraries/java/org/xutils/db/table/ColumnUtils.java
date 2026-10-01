package org.xutils.db.table;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import org.xutils.common.util.LogUtil;
import org.xutils.db.converter.ColumnConverter;
import org.xutils.db.converter.ColumnConverterFactory;
import org.xutils.db.sqlite.ColumnDbType;

public final class ColumnUtils {
    private static final HashSet<Class<?>> BOOLEAN_TYPES = new HashSet<>(2);
    private static final HashSet<Class<?>> INTEGER_TYPES = new HashSet<>(2);
    private static final HashSet<Class<?>> AUTO_INCREMENT_TYPES = new HashSet<>(4);

    private ColumnUtils() {
    }

    static {
        BOOLEAN_TYPES.add(Boolean.TYPE);
        BOOLEAN_TYPES.add(Boolean.class);
        INTEGER_TYPES.add(Integer.TYPE);
        INTEGER_TYPES.add(Integer.class);
        AUTO_INCREMENT_TYPES.addAll(INTEGER_TYPES);
        AUTO_INCREMENT_TYPES.add(Long.TYPE);
        AUTO_INCREMENT_TYPES.add(Long.class);
    }

    public static boolean isAutoIdType(Class<?> cls) {
        return AUTO_INCREMENT_TYPES.contains(cls);
    }

    public static boolean isInteger(Class<?> cls) {
        return INTEGER_TYPES.contains(cls);
    }

    public static boolean isBoolean(Class<?> cls) {
        return BOOLEAN_TYPES.contains(cls);
    }

    public static boolean isTextColumnDbType(Object obj) {
        ColumnConverter columnConverter;
        return (obj == null || (columnConverter = ColumnConverterFactory.getColumnConverter(obj.getClass())) == null || !ColumnDbType.TEXT.equals(columnConverter.getColumnDbType())) ? false : true;
    }

    public static String convert2SafeExpr(Object obj) {
        String strValueOf = String.valueOf(obj);
        if (strValueOf.indexOf(39) != -1) {
            return strValueOf.replace("'", "''");
        }
        return strValueOf;
    }

    public static Object convert2DbValueIfNeeded(Object obj) {
        if (obj != null) {
            return ColumnConverterFactory.getColumnConverter(obj.getClass()).fieldValue2DbValue(obj);
        }
        return obj;
    }

    static Method findGetMethod(Class<?> cls, Field field) {
        if (Object.class.equals(cls)) {
            return null;
        }
        String name = field.getName();
        Method methodFindBooleanGetMethod = isBoolean(field.getType()) ? findBooleanGetMethod(cls, name) : null;
        if (methodFindBooleanGetMethod == null) {
            String str = "get" + name.substring(0, 1).toUpperCase();
            if (name.length() > 1) {
                str = str + name.substring(1);
            }
            try {
                methodFindBooleanGetMethod = cls.getDeclaredMethod(str, new Class[0]);
            } catch (NoSuchMethodException e) {
                LogUtil.m9043d(cls.getName() + "#" + str + " not exist");
            }
        }
        if (methodFindBooleanGetMethod == null) {
            return findGetMethod(cls.getSuperclass(), field);
        }
        return methodFindBooleanGetMethod;
    }

    static Method findSetMethod(Class<?> cls, Field field) {
        if (Object.class.equals(cls)) {
            return null;
        }
        String name = field.getName();
        Class<?> type = field.getType();
        Method methodFindBooleanSetMethod = isBoolean(type) ? findBooleanSetMethod(cls, name, type) : null;
        if (methodFindBooleanSetMethod == null) {
            String str = "set" + name.substring(0, 1).toUpperCase();
            if (name.length() > 1) {
                str = str + name.substring(1);
            }
            try {
                methodFindBooleanSetMethod = cls.getDeclaredMethod(str, type);
            } catch (NoSuchMethodException e) {
                LogUtil.m9043d(cls.getName() + "#" + str + " not exist");
            }
        }
        if (methodFindBooleanSetMethod == null) {
            return findSetMethod(cls.getSuperclass(), field);
        }
        return methodFindBooleanSetMethod;
    }

    private static Method findBooleanGetMethod(Class<?> cls, String str) {
        if (!str.startsWith("is")) {
            String str2 = "is" + str.substring(0, 1).toUpperCase();
            str = str.length() > 1 ? str2 + str.substring(1) : str2;
        }
        try {
            return cls.getDeclaredMethod(str, new Class[0]);
        } catch (NoSuchMethodException e) {
            LogUtil.m9043d(cls.getName() + "#" + str + " not exist");
            return null;
        }
    }

    private static Method findBooleanSetMethod(Class<?> cls, String str, Class<?> cls2) {
        String str2;
        if (str.startsWith("is") && str.length() > 2) {
            str2 = "set" + str.substring(2, 3).toUpperCase();
            if (str.length() > 3) {
                str2 = str2 + str.substring(3);
            }
        } else {
            str2 = "set" + str.substring(0, 1).toUpperCase();
            if (str.length() > 1) {
                str2 = str2 + str.substring(1);
            }
        }
        try {
            return cls.getDeclaredMethod(str2, cls2);
        } catch (NoSuchMethodException e) {
            LogUtil.m9043d(cls.getName() + "#" + str2 + " not exist");
            return null;
        }
    }
}
