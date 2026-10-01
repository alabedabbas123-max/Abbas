package com.luajava;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;

public final class LuaJavaAPI {
    private static Class<?> ArrayList_class;
    private static Class<?> Character_class;
    private static Class<?> HashMap_class;
    private static Class<?> List_class;
    private static Class<?> LuaFunction_class;
    private static Class<?> LuaObject_class;
    private static Class<?> LuaState_class;
    private static Class<?> LuaTable_class;
    private static Class<?> Map_class;
    private static Class<?> Number_class;
    private static Class<?> String_class;
    public static HashMap<String, Method[]> methodsMap = new HashMap<>();
    public static HashMap<String, Method[]> methodCache = new HashMap<>();

    static {
        try {
            LuaState_class = Class.forName("com.luajava.LuaState");
            try {
                String_class = Class.forName("java.lang.String");
                try {
                    List_class = Class.forName("java.util.List");
                    try {
                        ArrayList_class = Class.forName("java.util.ArrayList");
                        try {
                            HashMap_class = Class.forName("java.util.HashMap");
                            try {
                                Map_class = Class.forName("java.util.Map");
                                try {
                                    LuaFunction_class = Class.forName("com.luajava.LuaFunction");
                                    try {
                                        LuaObject_class = Class.forName("com.luajava.LuaObject");
                                        try {
                                            LuaTable_class = Class.forName("com.luajava.LuaTable");
                                            try {
                                                Number_class = Class.forName("java.lang.Number");
                                                try {
                                                    Character_class = Class.forName("java.lang.Character");
                                                } catch (ClassNotFoundException e) {
                                                    throw new NoClassDefFoundError(e.getMessage());
                                                }
                                            } catch (ClassNotFoundException e2) {
                                                throw new NoClassDefFoundError(e2.getMessage());
                                            }
                                        } catch (ClassNotFoundException e3) {
                                            throw new NoClassDefFoundError(e3.getMessage());
                                        }
                                    } catch (ClassNotFoundException e4) {
                                        throw new NoClassDefFoundError(e4.getMessage());
                                    }
                                } catch (ClassNotFoundException e5) {
                                    throw new NoClassDefFoundError(e5.getMessage());
                                }
                            } catch (ClassNotFoundException e6) {
                                throw new NoClassDefFoundError(e6.getMessage());
                            }
                        } catch (ClassNotFoundException e7) {
                            throw new NoClassDefFoundError(e7.getMessage());
                        }
                    } catch (ClassNotFoundException e8) {
                        throw new NoClassDefFoundError(e8.getMessage());
                    }
                } catch (ClassNotFoundException e9) {
                    throw new NoClassDefFoundError(e9.getMessage());
                }
            } catch (ClassNotFoundException e10) {
                throw new NoClassDefFoundError(e10.getMessage());
            }
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError(e11.getMessage());
        }
    }

    LuaJavaAPI() {
    }

    private static String argError(LuaState luaState, String str, int i, Class cls) throws LuaException {
        throw new LuaException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("bad argument to '").append(str).toString()).append("' (").toString()).append(cls.getName()).toString()).append(" expected, got ").toString()).append(typeName(luaState, 3)).toString()).append(" value)").toString());
    }

    public static int asTable(long j, Object obj) throws LuaException {
        LuaState existingState = LuaStateFactory.getExistingState(j);
        synchronized (existingState) {
            try {
                existingState.newTable();
                if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i <= length - 1; i++) {
                        existingState.pushObjectValue(Array.get(obj, i));
                        existingState.rawSetI(-2, i + 1);
                    }
                } else if (obj instanceof Collection) {
                    Iterator it = ((Collection) obj).iterator();
                    int i2 = 1;
                    while (it.hasNext()) {
                        existingState.pushObjectValue(it.next());
                        existingState.rawSetI(-2, i2);
                        i2++;
                    }
                } else if (obj instanceof Map) {
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        existingState.pushObjectValue(entry.getKey());
                        existingState.pushObjectValue(entry.getValue());
                        existingState.setTable(-3);
                    }
                }
                existingState.pushValue(-1);
            } catch (Exception e) {
                throw new LuaException(new StringBuffer().append("can not astable: ").append(e.getMessage()).toString());
            }
        }
        return 1;
    }

    public static int callMethod(long j, Object obj, String str) throws LuaException {
        boolean z;
        LuaState existingState = LuaStateFactory.getExistingState(j);
        synchronized (existingState) {
            Method[] methodArr = methodCache.get(str);
            int top = existingState.getTop();
            Object[] objArr = new Object[top];
            Method method = (Method) null;
            for (int i = 0; i < methodArr.length; i++) {
                Class<?>[] parameterTypes = methodArr[i].getParameterTypes();
                if (parameterTypes.length == top) {
                    for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                        try {
                            objArr[i2] = compareTypes(existingState, parameterTypes[i2], i2 + 1);
                        } catch (Exception e) {
                            z = false;
                        }
                    }
                    z = true;
                    if (z) {
                        method = methodArr[i];
                        break;
                    }
                }
            }
            if (method == null) {
                StringBuilder sb = new StringBuilder();
                for (Method method2 : methodArr) {
                    sb.append(method2.toString());
                    sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                }
                throw new LuaException(new StringBuffer().append("Invalid method call. Invalid Parameters.\n").append(sb.toString()).toString());
            }
            try {
                if (!Modifier.isPublic(method.getModifiers())) {
                    method.setAccessible(true);
                }
                Object objInvoke = method.invoke(obj, objArr);
                if (objInvoke == null && method.getReturnType().equals(Void.TYPE)) {
                    return 0;
                }
                existingState.pushObjectValue(objInvoke);
                return 1;
            } catch (Exception e2) {
                throw new LuaException(e2);
            }
        }
    }

    public static int checkClass(LuaState luaState, Object obj, String str) throws LuaException {
        int i = 0;
        synchronized (luaState) {
            if (obj instanceof Class) {
                Class<?>[] classes = ((Class) obj).getClasses();
                for (int i2 = 0; i2 < classes.length; i2++) {
                    if (classes[i2].getSimpleName().equals(str)) {
                        luaState.pushJavaObject(classes[i2]);
                        i = 3;
                    }
                }
            }
        }
        return i;
    }

    public static int checkField(LuaState luaState, Object obj, String str) throws LuaException {
        Class<?> cls;
        boolean z;
        synchronized (luaState) {
            if (obj instanceof Class) {
                cls = (Class) obj;
                z = true;
            } else {
                cls = obj.getClass();
                z = false;
            }
            try {
                Field field = cls.getField(str);
                if (field == null) {
                    return 0;
                }
                if (z && !Modifier.isStatic(field.getModifiers())) {
                    return 0;
                }
                try {
                    if (!Modifier.isPublic(field.getModifiers())) {
                        field.setAccessible(true);
                    }
                    luaState.pushObjectValue(field.get(obj));
                    return Modifier.isFinal(field.getModifiers()) ? 5 : 1;
                } catch (Exception e) {
                    throw new LuaException(e);
                }
            } catch (NoSuchFieldException e2) {
                return 0;
            }
        }
    }

    public static int checkMethod(LuaState luaState, Object obj, String str) throws LuaException {
        Class<?> cls;
        boolean z;
        synchronized (luaState) {
            if (obj instanceof Class) {
                cls = (Class) obj;
                z = true;
            } else {
                cls = obj.getClass();
                z = false;
            }
            String name = cls.getName();
            String string = luaState.toString(-1);
            Method[] methodArr = methodCache.get(string);
            if (methodArr == null) {
                Method[] methods = methodsMap.get(name);
                if (methods == null) {
                    methods = cls.getMethods();
                    methodsMap.put(name, methods);
                }
                Method[] methodArr2 = methods;
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < methodArr2.length; i++) {
                    if (methodArr2[i].getName().equals(str) && (!z || Modifier.isStatic(methodArr2[i].getModifiers()))) {
                        arrayList.add(methodArr2[i]);
                    }
                }
                if (arrayList.isEmpty() && z) {
                    Method[] methods2 = cls.getClass().getMethods();
                    for (int i2 = 0; i2 < methods2.length; i2++) {
                        if (methods2[i2].getName().equals(str)) {
                            arrayList.add(methods2[i2]);
                        }
                    }
                }
                methodArr = new Method[arrayList.size()];
                arrayList.toArray(methodArr);
                methodCache.put(string, methodArr);
            }
            return methodArr.length == 0 ? 0 : 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0114  */
    private static Object compareTypes(LuaState luaState, Class<?> cls, int i) throws LuaException {
        Object luaObject;
        boolean z;
        boolean z2 = false;
        boolean z3 = true;
        Object objCreateMap = (Object) null;
        switch (luaState.type(i)) {
            case 0:
                luaObject = (Object) null;
                z2 = true;
                break;
            case 1:
                if (cls.isPrimitive()) {
                    if (cls != Boolean.TYPE) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else if (cls.isAssignableFrom(Boolean.TYPE)) {
                    z = true;
                } else {
                    z = false;
                }
                luaObject = new Boolean(luaState.toBoolean(i));
                z2 = z;
                break;
            case 2:
            default:
                throw new LuaException("Invalid Parameters.");
            case 3:
                Number numberConvertLuaNumber = luaState.isInteger(i) ? LuaState.convertLuaNumber(new Long(luaState.toInteger(i)), cls) : LuaState.convertLuaNumber(new Double(luaState.toNumber(i)), cls);
                z2 = numberConvertLuaNumber != null;
                luaObject = numberConvertLuaNumber;
                break;
            case 4:
                if (cls.isAssignableFrom(String_class)) {
                    objCreateMap = luaState.toString(i);
                    z2 = true;
                }
                luaObject = objCreateMap;
                break;
            case 5:
                if (cls.isAssignableFrom(LuaTable_class)) {
                    objCreateMap = luaState.getLuaObject(i);
                } else if (cls.isArray()) {
                    objCreateMap = createArray(luaState, cls.getComponentType(), i);
                } else if (cls.isInterface()) {
                    objCreateMap = createProxyObject(luaState, cls, i);
                } else if (Map_class.isAssignableFrom(cls)) {
                    objCreateMap = createMap(luaState, cls, i);
                } else {
                    z3 = false;
                }
                luaObject = objCreateMap;
                z2 = z3;
                break;
            case 6:
                if (cls.isAssignableFrom(LuaFunction_class)) {
                    objCreateMap = luaState.getLuaObject(i);
                    z2 = true;
                }
                luaObject = objCreateMap;
                break;
            case 7:
                if (luaState.isObject(i)) {
                    Object objectFromUserdata = luaState.getObjectFromUserdata(i);
                    if (objectFromUserdata == null) {
                        luaObject = (Object) null;
                    } else if ((cls.isPrimitive() && (Number_class.isAssignableFrom(objectFromUserdata.getClass()) || Character_class.isAssignableFrom(objectFromUserdata.getClass()))) || cls.isAssignableFrom(objectFromUserdata.getClass())) {
                        luaObject = objectFromUserdata;
                    } else {
                        luaObject = objCreateMap;
                        z3 = false;
                    }
                } else if (cls.isAssignableFrom(LuaObject_class)) {
                    luaObject = luaState.getLuaObject(i);
                } else {
                    luaObject = objCreateMap;
                    z3 = false;
                }
                z2 = z3;
                break;
        }
        if (z2) {
            return luaObject;
        }
        throw new LuaException("Invalid Parameter.");
    }

    public static int createArray(long j, String str) throws LuaException {
        int iCreateArray;
        LuaState existingState = LuaStateFactory.getExistingState(j);
        synchronized (existingState) {
            iCreateArray = createArray(existingState, (Class<?>) javaBindClass(str));
        }
        return iCreateArray;
    }

    private static int createArray(LuaState luaState, Class<?> cls) throws LuaException {
        synchronized (luaState) {
            luaState.pushJavaObject(createArray(luaState, cls, 2));
        }
        return 1;
    }

    private static Object createArray(LuaState luaState, Class<?> cls, int i) throws LuaException {
        Object objNewInstance;
        int i2 = 1;
        synchronized (luaState) {
            try {
                int iObjLen = luaState.objLen(i);
                objNewInstance = Array.newInstance(cls, iObjLen);
                if (cls == String_class) {
                    while (i2 <= iObjLen) {
                        luaState.pushNumber(i2);
                        luaState.getTable(i);
                        Array.set(objNewInstance, i2 - 1, luaState.toString(-1));
                        luaState.m7091pop(1);
                        i2++;
                    }
                } else if (cls == Double.TYPE) {
                    while (i2 <= iObjLen) {
                        luaState.pushNumber(i2);
                        luaState.getTable(i);
                        Array.set(objNewInstance, i2 - 1, new Double(luaState.toNumber(-1)));
                        luaState.m7091pop(1);
                        i2++;
                    }
                } else if (cls == Float.TYPE) {
                    while (i2 <= iObjLen) {
                        luaState.pushNumber(i2);
                        luaState.getTable(i);
                        Array.set(objNewInstance, i2 - 1, new Float((float) luaState.toNumber(-1)));
                        luaState.m7091pop(1);
                        i2++;
                    }
                } else if (cls == Long.TYPE) {
                    while (i2 <= iObjLen) {
                        luaState.pushNumber(i2);
                        luaState.getTable(i);
                        Array.set(objNewInstance, i2 - 1, new Long(luaState.toInteger(-1)));
                        luaState.m7091pop(1);
                        i2++;
                    }
                } else if (cls == Integer.TYPE) {
                    while (i2 <= iObjLen) {
                        luaState.pushNumber(i2);
                        luaState.getTable(i);
                        Array.set(objNewInstance, i2 - 1, new Integer((int) luaState.toInteger(-1)));
                        luaState.m7091pop(1);
                        i2++;
                    }
                } else if (cls == Short.TYPE) {
                    while (i2 <= iObjLen) {
                        luaState.pushNumber(i2);
                        luaState.getTable(i);
                        Array.set(objNewInstance, i2 - 1, new Short((short) luaState.toInteger(-1)));
                        luaState.m7091pop(1);
                        i2++;
                    }
                } else if (cls == Character.TYPE) {
                    while (i2 <= iObjLen) {
                        luaState.pushNumber(i2);
                        luaState.getTable(i);
                        Array.set(objNewInstance, i2 - 1, new Character((char) luaState.toInteger(-1)));
                        luaState.m7091pop(1);
                        i2++;
                    }
                } else if (cls == Byte.TYPE) {
                    while (i2 <= iObjLen) {
                        luaState.pushNumber(i2);
                        luaState.getTable(i);
                        Array.set(objNewInstance, i2 - 1, new Byte((byte) luaState.toInteger(-1)));
                        luaState.m7091pop(1);
                        i2++;
                    }
                } else {
                    while (i2 <= iObjLen) {
                        luaState.pushNumber(i2);
                        luaState.getTable(i);
                        Array.set(objNewInstance, i2 - 1, compareTypes(luaState, cls, -1));
                        luaState.m7091pop(1);
                        i2++;
                    }
                }
            } catch (Exception e) {
                throw new LuaException(e);
            }
        }
        return objNewInstance;
    }

    private static int createList(LuaState luaState, Class<?> cls) throws LuaException {
        synchronized (luaState) {
            luaState.pushJavaObject(createList(luaState, cls, 2));
        }
        return 1;
    }

    private static Object createList(LuaState luaState, Class<?> cls, int i) throws LuaException {
        List list;
        synchronized (luaState) {
            int iObjLen = luaState.objLen(i);
            try {
                if (cls.equals(List_class)) {
                    cls = ArrayList_class;
                }
                list = (List) cls.newInstance();
                for (int i2 = 1; i2 <= iObjLen; i2++) {
                    luaState.pushNumber(i2);
                    luaState.getTable(i);
                    list.add(luaState.toJavaObject(-1));
                    luaState.m7091pop(1);
                }
            } catch (Exception e) {
                throw new LuaException(e);
            }
        }
        return list;
    }

    private static int createMap(LuaState luaState, Class<?> cls) throws LuaException {
        synchronized (luaState) {
            luaState.pushJavaObject(createMap(luaState, cls, 2));
        }
        return 1;
    }

    private static Object createMap(LuaState luaState, Class<?> cls, int i) throws LuaException {
        Map map;
        synchronized (luaState) {
            try {
                if (cls.equals(Map_class)) {
                    cls = HashMap_class;
                }
                map = (Map) cls.newInstance();
                luaState.pushNil();
                while (luaState.next(i) != 0) {
                    map.put(luaState.toJavaObject(-2), luaState.toJavaObject(-1));
                    luaState.m7091pop(1);
                }
            } catch (Exception e) {
                throw new LuaException(e);
            }
        }
        return map;
    }

    public static int createProxy(long j, String str) throws LuaException {
        int iCreateProxyObject;
        LuaState existingState = LuaStateFactory.getExistingState(j);
        synchronized (existingState) {
            iCreateProxyObject = createProxyObject(existingState, str);
        }
        return iCreateProxyObject;
    }

    private static int createProxyObject(LuaState luaState, Class cls) throws LuaException {
        synchronized (luaState) {
            luaState.pushJavaObject(createProxyObject(luaState, cls, 2));
        }
        return 1;
    }

    private static int createProxyObject(LuaState luaState, String str) throws LuaException {
        synchronized (luaState) {
            try {
                luaState.pushJavaObject(luaState.getLuaObject(2).createProxy(str));
            } catch (Exception e) {
                throw new LuaException(e);
            }
        }
        return 1;
    }

    private static Object createProxyObject(LuaState luaState, Class cls, int i) throws LuaException {
        Object objCreateProxy;
        synchronized (luaState) {
            try {
                objCreateProxy = luaState.getLuaObject(i).createProxy(cls);
            } catch (Exception e) {
                throw new LuaException(e);
            }
        }
        return objCreateProxy;
    }

    public static int getArrayValue(long j, Object obj, int i) throws LuaException {
        Object obj2;
        LuaState existingState = LuaStateFactory.getExistingState(j);
        synchronized (existingState) {
            if (obj.getClass().isArray()) {
                obj2 = Array.get(obj, i);
            } else if (obj instanceof List) {
                obj2 = ((List) obj).get(i);
            } else {
                if (!(obj instanceof Map)) {
                    throw new LuaException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("can not get ").append(obj.getClass().getName()).toString()).append(" value in ").toString()).append(i).toString());
                }
                obj2 = ((Map) obj).get(new Integer(i));
            }
            existingState.pushObjectValue(obj2);
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0054 A[Catch: all -> 0x007a, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0009, B:7:0x0010, B:22:0x0045, B:23:0x004f, B:26:0x0054, B:27:0x005a, B:29:0x005d, B:30:0x0079, B:54:0x00bc, B:56:0x00cd, B:58:0x00d3, B:59:0x00da, B:63:0x00e2, B:64:0x00e5, B:61:0x00dc, B:62:0x00e1, B:40:0x0093, B:42:0x009e, B:44:0x00a3, B:48:0x00a9, B:50:0x00ac, B:10:0x0013, B:11:0x0019, B:14:0x0020, B:16:0x0023, B:17:0x0029, B:18:0x0040, B:38:0x0089, B:39:0x0092, B:35:0x007e, B:36:0x0087), top: B:72:0x0003, inners: #1, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0093 A[Catch: all -> 0x007a, TRY_ENTER, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0009, B:7:0x0010, B:22:0x0045, B:23:0x004f, B:26:0x0054, B:27:0x005a, B:29:0x005d, B:30:0x0079, B:54:0x00bc, B:56:0x00cd, B:58:0x00d3, B:59:0x00da, B:63:0x00e2, B:64:0x00e5, B:61:0x00dc, B:62:0x00e1, B:40:0x0093, B:42:0x009e, B:44:0x00a3, B:48:0x00a9, B:50:0x00ac, B:10:0x0013, B:11:0x0019, B:14:0x0020, B:16:0x0023, B:17:0x0029, B:18:0x0040, B:38:0x0089, B:39:0x0092, B:35:0x007e, B:36:0x0087), top: B:72:0x0003, inners: #1, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bc A[Catch: all -> 0x007a, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0009, B:7:0x0010, B:22:0x0045, B:23:0x004f, B:26:0x0054, B:27:0x005a, B:29:0x005d, B:30:0x0079, B:54:0x00bc, B:56:0x00cd, B:58:0x00d3, B:59:0x00da, B:63:0x00e2, B:64:0x00e5, B:61:0x00dc, B:62:0x00e1, B:40:0x0093, B:42:0x009e, B:44:0x00a3, B:48:0x00a9, B:50:0x00ac, B:10:0x0013, B:11:0x0019, B:14:0x0020, B:16:0x0023, B:17:0x0029, B:18:0x0040, B:38:0x0089, B:39:0x0092, B:35:0x007e, B:36:0x0087), top: B:72:0x0003, inners: #1, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00d3 A[Catch: all -> 0x007a, TRY_ENTER, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0009, B:7:0x0010, B:22:0x0045, B:23:0x004f, B:26:0x0054, B:27:0x005a, B:29:0x005d, B:30:0x0079, B:54:0x00bc, B:56:0x00cd, B:58:0x00d3, B:59:0x00da, B:63:0x00e2, B:64:0x00e5, B:61:0x00dc, B:62:0x00e1, B:40:0x0093, B:42:0x009e, B:44:0x00a3, B:48:0x00a9, B:50:0x00ac, B:10:0x0013, B:11:0x0019, B:14:0x0020, B:16:0x0023, B:17:0x0029, B:18:0x0040, B:38:0x0089, B:39:0x0092, B:35:0x007e, B:36:0x0087), top: B:72:0x0003, inners: #1, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e2 A[Catch: all -> 0x007a, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0009, B:7:0x0010, B:22:0x0045, B:23:0x004f, B:26:0x0054, B:27:0x005a, B:29:0x005d, B:30:0x0079, B:54:0x00bc, B:56:0x00cd, B:58:0x00d3, B:59:0x00da, B:63:0x00e2, B:64:0x00e5, B:61:0x00dc, B:62:0x00e1, B:40:0x0093, B:42:0x009e, B:44:0x00a3, B:48:0x00a9, B:50:0x00ac, B:10:0x0013, B:11:0x0019, B:14:0x0020, B:16:0x0023, B:17:0x0029, B:18:0x0040, B:38:0x0089, B:39:0x0092, B:35:0x007e, B:36:0x0087), top: B:72:0x0003, inners: #1, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x009e A[SYNTHETIC] */
    private static int getObjInstance(LuaState luaState, Class<?> cls) throws LuaException {
        Object[] objArr;
        Constructor<?>[] constructors;
        Constructor<?> constructor;
        int i;
        Object objNewInstance;
        StringBuilder sb;
        int i2;
        Class<?>[] parameterTypes;
        int i3;
        boolean z;
        synchronized (luaState) {
            int top = luaState.getTop();
            if (top == 1) {
                try {
                    luaState.pushJavaObject(cls.newInstance());
                } catch (Exception e) {
                    try {
                        if (Class.forName("android.view.View").isAssignableFrom(cls)) {
                            try {
                                Class<?>[] clsArr = new Class[1];
                                try {
                                    clsArr[0] = Class.forName("android.content.Context");
                                    luaState.pushJavaObject(cls.getConstructor(clsArr).newInstance(luaState.getContext()));
                                } catch (ClassNotFoundException e2) {
                                    throw new NoClassDefFoundError(e2.getMessage());
                                }
                            } catch (Exception e3) {
                                objArr = new Object[top - 1];
                                constructors = cls.getConstructors();
                                constructor = (Constructor) null;
                                for (i = 0; i < constructors.length; i++) {
                                    parameterTypes = constructors[i].getParameterTypes();
                                    if (parameterTypes.length == top - 1) {
                                        for (i3 = 0; i3 < parameterTypes.length; i3++) {
                                            try {
                                                objArr[i3] = compareTypes(luaState, parameterTypes[i3], i3 + 2);
                                            } catch (Exception e4) {
                                                z = false;
                                            }
                                        }
                                        z = true;
                                        if (z) {
                                            constructor = constructors[i];
                                            break;
                                        }
                                    }
                                }
                                if (constructor != null) {
                                    sb = new StringBuilder();
                                    for (Constructor<?> constructor2 : constructors) {
                                        sb.append(constructor2.toString());
                                        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                                    }
                                    throw new LuaException(new StringBuffer().append("Invalid constructor method call. Invalid Parameters.\n").append(sb.toString()).toString());
                                }
                                try {
                                    objNewInstance = constructor.newInstance(objArr);
                                    if (objNewInstance == null) {
                                        throw new LuaException("Couldn't instantiate java Object");
                                    }
                                    luaState.pushJavaObject(objNewInstance);
                                } catch (Exception e5) {
                                    throw new LuaException(e5);
                                }
                            }
                        } else {
                            objArr = new Object[top - 1];
                            constructors = cls.getConstructors();
                            constructor = (Constructor) null;
                            while (i < constructors.length) {
                                parameterTypes = constructors[i].getParameterTypes();
                                if (parameterTypes.length == top - 1) {
                                    while (i3 < parameterTypes.length) {
                                        objArr[i3] = compareTypes(luaState, parameterTypes[i3], i3 + 2);
                                    }
                                    z = true;
                                    if (z) {
                                        constructor = constructors[i];
                                        break;
                                    }
                                }
                            }
                            if (constructor != null) {
                                sb = new StringBuilder();
                                while (i2 < constructors.length) {
                                    sb.append(constructor2.toString());
                                    sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                                }
                                throw new LuaException(new StringBuffer().append("Invalid constructor method call. Invalid Parameters.\n").append(sb.toString()).toString());
                            }
                            objNewInstance = constructor.newInstance(objArr);
                            if (objNewInstance == null) {
                                throw new LuaException("Couldn't instantiate java Object");
                            }
                            luaState.pushJavaObject(objNewInstance);
                        }
                    } catch (ClassNotFoundException e6) {
                        throw new NoClassDefFoundError(e6.getMessage());
                    }
                }
                return 1;
            }
            objArr = new Object[top - 1];
            constructors = cls.getConstructors();
            constructor = (Constructor) null;
            while (i < constructors.length) {
                parameterTypes = constructors[i].getParameterTypes();
                if (parameterTypes.length == top - 1) {
                    while (i3 < parameterTypes.length) {
                        objArr[i3] = compareTypes(luaState, parameterTypes[i3], i3 + 2);
                    }
                    z = true;
                    if (z) {
                        constructor = constructors[i];
                        break;
                    }
                }
            }
            if (constructor != null) {
                objNewInstance = constructor.newInstance(objArr);
                if (objNewInstance == null) {
                    throw new LuaException("Couldn't instantiate java Object");
                }
                luaState.pushJavaObject(objNewInstance);
                return 1;
            }
            sb = new StringBuilder();
            while (i2 < constructors.length) {
                sb.append(constructor2.toString());
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            throw new LuaException(new StringBuffer().append("Invalid constructor method call. Invalid Parameters.\n").append(sb.toString()).toString());
        }
    }

    public static Class javaBindClass(String str) throws LuaException {
        try {
            return Class.forName(str);
        } catch (Exception e) {
            if (str.equals("boolean")) {
                return Boolean.TYPE;
            }
            if (str.equals("byte")) {
                return Byte.TYPE;
            }
            if (str.equals("char")) {
                return Character.TYPE;
            }
            if (str.equals("short")) {
                return Short.TYPE;
            }
            if (str.equals("int")) {
                return Integer.TYPE;
            }
            if (str.equals("long")) {
                return Long.TYPE;
            }
            if (str.equals("float")) {
                return Float.TYPE;
            }
            if (str.equals("double")) {
                return Double.TYPE;
            }
            throw new LuaException(new StringBuffer().append("Class not found: ").append(str).toString());
        }
    }

    public static int javaCreate(long j, Class<?> cls) throws LuaException {
        int iCreateArray;
        LuaState existingState = LuaStateFactory.getExistingState(j);
        synchronized (existingState) {
            if (cls.isInterface()) {
                iCreateArray = createProxyObject(existingState, cls);
            } else if (cls.isPrimitive()) {
                iCreateArray = createArray(existingState, cls);
            } else if (List_class.isAssignableFrom(cls)) {
                iCreateArray = createList(existingState, cls);
            } else if (Map_class.isAssignableFrom(cls)) {
                iCreateArray = createMap(existingState, cls);
            } else if (existingState.objLen(-1) == 0) {
                iCreateArray = createArray(existingState, cls);
            } else {
                iCreateArray = cls.isAssignableFrom(new LuaTable(existingState, -1).get(new Integer(1)).getClass()) ? createArray(existingState, cls) : getObjInstance(existingState, cls);
            }
        }
        return iCreateArray;
    }

    public static int javaEquals(long j, Object obj, Object obj2) throws LuaException {
        LuaState existingState = LuaStateFactory.getExistingState(j);
        synchronized (existingState) {
            existingState.pushBoolean(obj.equals(obj2));
        }
        return 1;
    }

    public static int javaGetter(LuaState luaState, Object obj, String str) throws LuaException {
        Class<?> cls;
        boolean z;
        synchronized (luaState) {
            if (obj instanceof Map) {
                luaState.pushObjectValue(((Map) obj).get(str));
                return 1;
            }
            if (obj instanceof Class) {
                cls = (Class) obj;
                z = true;
            } else {
                cls = obj.getClass();
                z = false;
            }
            try {
                Method method = cls.getMethod(new StringBuffer().append("get").append(str).toString(), new Class[0]);
                if (z && !Modifier.isStatic(method.getModifiers())) {
                    return 0;
                }
                try {
                    Object objInvoke = method.invoke(obj, new Object[0]);
                    if (objInvoke instanceof CharSequence) {
                        luaState.pushString(objInvoke.toString());
                    } else {
                        luaState.pushObjectValue(objInvoke);
                    }
                    return 1;
                } catch (Exception e) {
                    throw new LuaException(e);
                }
            } catch (NoSuchMethodException e2) {
                return 0;
            }
        }
    }

    public static int javaLoadLib(long j, String str, String str2) throws LuaException {
        LuaState existingState = LuaStateFactory.getExistingState(j);
        synchronized (existingState) {
            try {
                try {
                    Object objInvoke = Class.forName(str).getMethod(str2, LuaState_class).invoke((Object) null, existingState);
                    if (objInvoke == null || !(objInvoke instanceof Integer)) {
                        return 0;
                    }
                    return ((Integer) objInvoke).intValue();
                } catch (Exception e) {
                    throw new LuaException(new StringBuffer().append("Error on calling method. Library could not be loaded. ").append(e.getMessage()).toString());
                }
            } catch (ClassNotFoundException e2) {
                throw new LuaException(e2);
            }
        }
    }

    public static int javaNew(long j, Class<?> cls) throws LuaException {
        int primitive;
        LuaState existingState = LuaStateFactory.getExistingState(j);
        synchronized (existingState) {
            primitive = cls.isPrimitive() ? toPrimitive(existingState, cls, -1) : getObjInstance(existingState, cls);
        }
        return primitive;
    }

    public static int javaNewInstance(long j, String str) throws LuaException {
        int primitive;
        LuaState existingState = LuaStateFactory.getExistingState(j);
        synchronized (existingState) {
            Class clsJavaBindClass = javaBindClass(str);
            primitive = clsJavaBindClass.isPrimitive() ? toPrimitive(existingState, clsJavaBindClass, -1) : getObjInstance(existingState, clsJavaBindClass);
        }
        return primitive;
    }

    public static int javaObjectLength(long j, Object obj) throws LuaException {
        int size;
        LuaState existingState = LuaStateFactory.getExistingState(j);
        synchronized (existingState) {
            try {
                if (obj instanceof CharSequence) {
                    size = ((CharSequence) obj).length();
                } else if (obj instanceof Collection) {
                    size = ((Collection) obj).size();
                } else {
                    size = obj instanceof Map ? ((Map) obj).size() : Array.getLength(obj);
                }
                existingState.pushInteger(size);
            } catch (Exception e) {
                throw new LuaException(e);
            }
        }
        return 1;
    }

    private static int javaSetListener(LuaState luaState, Object obj, String str, Method[] methodArr, boolean z) throws LuaException {
        synchronized (luaState) {
            String string = new StringBuffer().append(new StringBuffer().append("setOn").append(str.substring(2)).toString()).append("Listener").toString();
            for (Method method : methodArr) {
                if (method.getName().equals(string) && (!z || Modifier.isStatic(method.getModifiers()))) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1 && parameterTypes[0].isInterface()) {
                        luaState.newTable();
                        luaState.pushValue(-2);
                        luaState.setField(-2, str);
                        try {
                            method.invoke(obj, luaState.getLuaObject(-1).createProxy(parameterTypes[0]));
                            return 1;
                        } catch (Exception e) {
                            throw new LuaException(e);
                        }
                    }
                }
            }
            return 0;
        }
    }

    private static int javaSetMethod(LuaState luaState, Object obj, String str, Method[] methodArr, boolean z) throws LuaException {
        synchronized (luaState) {
            String string = new StringBuffer().append("set").append(str).toString();
            StringBuilder sb = new StringBuilder();
            for (Method method : methodArr) {
                if (method.getName().equals(string) && (!z || Modifier.isStatic(method.getModifiers()))) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        try {
                            try {
                                method.invoke(obj, compareTypes(luaState, parameterTypes[0], -1));
                                return 1;
                            } catch (Exception e) {
                                throw new LuaException(e);
                            }
                        } catch (LuaException e2) {
                            sb.append(parameterTypes[0]);
                            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (sb.length() > 0) {
                throw new LuaException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("Invalid setter ").append(str).toString()).append(". Invalid Parameters.\n").toString()).append(sb.toString()).toString()).append(luaState.typeName(-1)).toString());
            }
            return 0;
        }
    }

    public static int javaSetter(LuaState luaState, Object obj, String str) throws LuaException {
        Class<?> cls;
        boolean z = true;
        synchronized (luaState) {
            if (obj instanceof Map) {
                ((Map) obj).put(str, luaState.toJavaObject(3));
                return 1;
            }
            if (obj instanceof Class) {
                cls = (Class) obj;
            } else {
                cls = obj.getClass();
                z = false;
            }
            String name = cls.getName();
            Method[] methods = methodsMap.get(name);
            if (methods == null) {
                methods = cls.getMethods();
                methodsMap.put(name, methods);
            }
            if (str.length() > 2 && str.substring(0, 2).equals("on") && luaState.type(-1) == 6) {
                return javaSetListener(luaState, obj, str, methods, z);
            }
            return javaSetMethod(luaState, obj, str, methods, z);
        }
    }

    public static int javaToString(long j, Object obj) throws LuaException {
        LuaState existingState = LuaStateFactory.getExistingState(j);
        synchronized (existingState) {
            try {
                if (obj == null) {
                    existingState.pushString("null");
                } else {
                    existingState.pushString(obj.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 1;
    }

    public static int newArray(long j, Class<?> cls) throws LuaException {
        LuaState existingState = LuaStateFactory.getExistingState(j);
        synchronized (existingState) {
            try {
                int top = existingState.getTop();
                int[] iArr = new int[top - 1];
                for (int i = 0; i < top - 1; i++) {
                    iArr[i] = (int) existingState.toInteger(i + 2);
                }
                existingState.pushJavaObject(Array.newInstance(cls, iArr));
            } catch (Exception e) {
                throw new LuaException(new StringBuffer().append("can not create a array: ").append(e.getMessage()).toString());
            }
        }
        return 1;
    }

    public static int newArray(long j, Class<?> cls, int i) throws LuaException {
        LuaState existingState = LuaStateFactory.getExistingState(j);
        synchronized (existingState) {
            try {
                existingState.pushJavaObject(Array.newInstance(cls, i));
            } catch (Exception e) {
                throw new LuaException(new StringBuffer().append("can not create a array: ").append(e.getMessage()).toString());
            }
        }
        return 1;
    }

    public static int objectCall(long j, Object obj) throws LuaException {
        int i;
        LuaState existingState = LuaStateFactory.getExistingState(j);
        synchronized (existingState) {
            if (obj instanceof LuaMetaTable) {
                int top = existingState.getTop();
                Object[] objArr = new Object[top - 1];
                for (int i2 = 2; i2 <= top; i2++) {
                    objArr[i2 - 2] = existingState.toJavaObject(i2);
                }
                existingState.pushObjectValue(((LuaMetaTable) obj).__call(objArr));
                i = 1;
            } else {
                i = 0;
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    public static int objectIndex(long j, Object obj, String str, int i) throws LuaException {
        int iCheckField;
        int i2 = 6;
        LuaState existingState = LuaStateFactory.getExistingState(j);
        synchronized (existingState) {
            if (i != 0) {
                i2 = i == 0 ? iCheckField : iCheckField;
            } else if (checkMethod(existingState, obj, str) != 0) {
                i2 = 2;
            } else if ((i == 0 && i != 1 && i != 5) || (iCheckField = checkField(existingState, obj, str)) == 0) {
                if ((i == 0 || i == 4) && javaGetter(existingState, obj, str) != 0) {
                    i2 = 4;
                } else if ((i == 0 || i == 3) && checkClass(existingState, obj, str) != 0) {
                    i2 = 3;
                } else if ((i == 0 || i == 6) && (obj instanceof LuaMetaTable)) {
                    existingState.pushObjectValue(((LuaMetaTable) obj).__index(str));
                } else {
                    i2 = 0;
                }
            }
            throw th;
        }
        return i2;
    }

    public static int objectNewIndex(long j, Object obj, String str) throws LuaException {
        int i = 1;
        LuaState existingState = LuaStateFactory.getExistingState(j);
        synchronized (existingState) {
            if (setFieldValue(existingState, obj, str) == 0 && javaSetter(existingState, obj, str) == 0) {
                i = 0;
            }
        }
        return i;
    }

    public static int setArrayValue(long j, Object obj, int i) throws LuaException {
        LuaState existingState = LuaStateFactory.getExistingState(j);
        synchronized (existingState) {
            if (obj.getClass().isArray()) {
                Class<?> componentType = obj.getClass().getComponentType();
                try {
                    Array.set(obj, i, compareTypes(existingState, componentType, 3));
                } catch (LuaException e) {
                    argError(existingState, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(obj.getClass().getName()).append(" [").toString()).append(i).toString()).append("]").toString(), 3, componentType);
                }
            } else if (obj instanceof List) {
                ((List) obj).set(i, existingState.toJavaObject(3));
            } else {
                if (!(obj instanceof Map)) {
                    throw new LuaException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("can not set ").append(obj.getClass().getName()).toString()).append(" value: ").toString()).append(existingState.toJavaObject(3)).toString()).append(" in ").toString()).append(i).toString());
                }
                ((Map) obj).put(new Integer(i), existingState.toJavaObject(3));
            }
        }
        return 0;
    }

    public static int setFieldValue(LuaState luaState, Object obj, String str) throws LuaException {
        Class<?> cls;
        boolean z;
        synchronized (luaState) {
            if (obj == null) {
                return 0;
            }
            if (obj instanceof Class) {
                cls = (Class) obj;
                z = true;
            } else {
                cls = obj.getClass();
                z = false;
            }
            try {
                Field field = cls.getField(str);
                if (field == null) {
                    return 0;
                }
                if (z && !Modifier.isStatic(field.getModifiers())) {
                    return 0;
                }
                Class<?> type = field.getType();
                try {
                    if (!Modifier.isPublic(field.getModifiers())) {
                        field.setAccessible(true);
                    }
                    field.set(obj, compareTypes(luaState, type, 3));
                } catch (LuaException e) {
                    argError(luaState, str, 3, type);
                } catch (Exception e2) {
                    throw new LuaException(e2);
                }
                return 1;
            } catch (NoSuchFieldException e3) {
                return 0;
            }
        }
    }

    private static int toPrimitive(LuaState luaState, Class cls, int i) throws LuaException {
        Object bool = (Object) null;
        if (cls == Character.TYPE && luaState.type(i) == 4) {
            String string = luaState.toString(i);
            bool = string.length() == 1 ? new Character(string.charAt(0)) : string.toCharArray();
        } else {
            if (!luaState.isNumber(i)) {
                throw new LuaException(new StringBuffer().append(luaState.toString(i)).append(" is not number").toString());
            }
            if (cls == Double.TYPE) {
                bool = new Double(luaState.toNumber(i));
            } else if (cls == Float.TYPE) {
                bool = new Float((float) luaState.toNumber(i));
            } else if (cls == Long.TYPE) {
                bool = new Long(luaState.toInteger(i));
            } else if (cls == Integer.TYPE) {
                bool = new Integer((int) luaState.toInteger(i));
            } else if (cls == Short.TYPE) {
                bool = new Short((short) luaState.toInteger(i));
            } else if (cls == Character.TYPE) {
                bool = new Character((char) luaState.toInteger(i));
            } else if (cls == Byte.TYPE) {
                bool = new Byte((byte) luaState.toInteger(i));
            } else if (cls == Boolean.TYPE) {
                bool = new Boolean(luaState.toBoolean(i));
            }
        }
        luaState.pushJavaObject(bool);
        return 1;
    }

    private static String typeName(LuaState luaState, int i) throws LuaException {
        if (luaState.isObject(i)) {
            return luaState.getObjectFromUserdata(i).getClass().getName();
        }
        switch (luaState.type(i)) {
            case 1:
                return "boolean";
            case 2:
            case 7:
                return "userdata";
            case 3:
                return "number";
            case 4:
                return "string";
            case 5:
                return "table";
            case 6:
                return "function";
            case 8:
                return "thread";
            default:
                return "unkown";
        }
    }
}
