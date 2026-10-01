package com.luajava;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LuaInvocationHandler implements InvocationHandler {

    private LuaState f4821L;

    private LuaObject f4822obj;
    private LuaObject print;

    public LuaInvocationHandler(LuaObject luaObject) {
        this.f4822obj = luaObject;
        this.f4821L = luaObject.f4823L;
        this.print = this.f4821L.getLuaObject("print");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d A[Catch: all -> 0x0040, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0019, B:8:0x0021, B:9:0x0027, B:20:0x0043, B:22:0x0049, B:23:0x004f, B:31:0x0068, B:32:0x006b, B:25:0x0055, B:26:0x005b, B:29:0x005e, B:30:0x0067, B:11:0x002d, B:12:0x0033, B:15:0x0036, B:16:0x003f, B:34:0x006d, B:35:0x0070, B:36:0x0076, B:38:0x007c, B:59:0x00ef, B:44:0x0090, B:46:0x0098, B:47:0x009e, B:68:0x010d, B:70:0x0113, B:71:0x0119, B:73:0x011f, B:74:0x0125, B:77:0x0129, B:78:0x0132, B:49:0x00a4, B:50:0x00aa, B:66:0x0103, B:67:0x010c, B:79:0x0133, B:61:0x00f5, B:63:0x00f9, B:57:0x00ba, B:40:0x0084, B:53:0x00ad, B:54:0x00b6), top: B:83:0x0005, inners: #1, #2, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0055 A[Catch: all -> 0x0040, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0019, B:8:0x0021, B:9:0x0027, B:20:0x0043, B:22:0x0049, B:23:0x004f, B:31:0x0068, B:32:0x006b, B:25:0x0055, B:26:0x005b, B:29:0x005e, B:30:0x0067, B:11:0x002d, B:12:0x0033, B:15:0x0036, B:16:0x003f, B:34:0x006d, B:35:0x0070, B:36:0x0076, B:38:0x007c, B:59:0x00ef, B:44:0x0090, B:46:0x0098, B:47:0x009e, B:68:0x010d, B:70:0x0113, B:71:0x0119, B:73:0x011f, B:74:0x0125, B:77:0x0129, B:78:0x0132, B:49:0x00a4, B:50:0x00aa, B:66:0x0103, B:67:0x010c, B:79:0x0133, B:61:0x00f5, B:63:0x00f9, B:57:0x00ba, B:40:0x0084, B:53:0x00ad, B:54:0x00b6), top: B:83:0x0005, inners: #1, #2, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a4 A[Catch: all -> 0x0040, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0019, B:8:0x0021, B:9:0x0027, B:20:0x0043, B:22:0x0049, B:23:0x004f, B:31:0x0068, B:32:0x006b, B:25:0x0055, B:26:0x005b, B:29:0x005e, B:30:0x0067, B:11:0x002d, B:12:0x0033, B:15:0x0036, B:16:0x003f, B:34:0x006d, B:35:0x0070, B:36:0x0076, B:38:0x007c, B:59:0x00ef, B:44:0x0090, B:46:0x0098, B:47:0x009e, B:68:0x010d, B:70:0x0113, B:71:0x0119, B:73:0x011f, B:74:0x0125, B:77:0x0129, B:78:0x0132, B:49:0x00a4, B:50:0x00aa, B:66:0x0103, B:67:0x010c, B:79:0x0133, B:61:0x00f5, B:63:0x00f9, B:57:0x00ba, B:40:0x0084, B:53:0x00ad, B:54:0x00b6), top: B:83:0x0005, inners: #1, #2, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0133 A[Catch: all -> 0x0040, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0019, B:8:0x0021, B:9:0x0027, B:20:0x0043, B:22:0x0049, B:23:0x004f, B:31:0x0068, B:32:0x006b, B:25:0x0055, B:26:0x005b, B:29:0x005e, B:30:0x0067, B:11:0x002d, B:12:0x0033, B:15:0x0036, B:16:0x003f, B:34:0x006d, B:35:0x0070, B:36:0x0076, B:38:0x007c, B:59:0x00ef, B:44:0x0090, B:46:0x0098, B:47:0x009e, B:68:0x010d, B:70:0x0113, B:71:0x0119, B:73:0x011f, B:74:0x0125, B:77:0x0129, B:78:0x0132, B:49:0x00a4, B:50:0x00aa, B:66:0x0103, B:67:0x010c, B:79:0x0133, B:61:0x00f5, B:63:0x00f9, B:57:0x00ba, B:40:0x0084, B:53:0x00ad, B:54:0x00b6), top: B:83:0x0005, inners: #1, #2, #5, #7 }] */
    @Override
    public Object invoke(Object obj, Method method, Object[] objArr) throws LuaException {
        LuaException luaException;
        Object obj2;
        Object num;
        Object objCall;
        synchronized (this.f4822obj.f4823L) {
            String name = method.getName();
            LuaObject field = this.f4822obj.getField(name);
            Class<?> returnType = method.getReturnType();
            if (!field.isNil()) {
                Object obj3 = (Object) null;
                try {
                    try {
                        if (returnType.equals(Class.forName("java.lang.Void")) || returnType.equals(Void.TYPE)) {
                            field.call(objArr);
                            objCall = (Object) null;
                        } else {
                            objCall = field.call(objArr);
                            if (objCall != null) {
                                try {
                                    if (objCall instanceof Double) {
                                        objCall = LuaState.convertLuaNumber((Double) objCall, returnType);
                                    }
                                } catch (LuaException e) {
                                    luaException = e;
                                    obj2 = objCall;
                                    this.print.call(new StringBuffer().append(new StringBuffer().append(name).append(" ").toString()).append(luaException.getMessage()).toString());
                                    num = obj2;
                                }
                            }
                        }
                        num = objCall;
                    } catch (LuaException e2) {
                        luaException = e2;
                        obj2 = obj3;
                    }
                    if (num == null) {
                        if (returnType.equals(Boolean.TYPE)) {
                            num = new Boolean(false);
                        } else {
                            try {
                                if (returnType.equals(Class.forName("java.lang.Boolean"))) {
                                    num = new Boolean(false);
                                } else {
                                    if (!returnType.isPrimitive()) {
                                        try {
                                            if (Class.forName("java.lang.Number").isAssignableFrom(returnType)) {
                                            }
                                        } catch (ClassNotFoundException e3) {
                                            throw new NoClassDefFoundError(e3.getMessage());
                                        }
                                    }
                                    num = new Integer(0);
                                }
                            } catch (ClassNotFoundException e4) {
                                throw new NoClassDefFoundError(e4.getMessage());
                            }
                        }
                    }
                } catch (ClassNotFoundException e5) {
                    throw new NoClassDefFoundError(e5.getMessage());
                }
            } else if (returnType.equals(Boolean.TYPE)) {
                num = new Boolean(false);
            } else {
                try {
                    if (returnType.equals(Class.forName("java.lang.Boolean"))) {
                        num = new Boolean(false);
                    } else if (returnType.isPrimitive()) {
                        num = new Integer(0);
                    } else {
                        try {
                            if (Class.forName("java.lang.Number").isAssignableFrom(returnType)) {
                                num = new Integer(0);
                            } else {
                                num = (Object) null;
                            }
                        } catch (ClassNotFoundException e6) {
                            throw new NoClassDefFoundError(e6.getMessage());
                        }
                    }
                } catch (ClassNotFoundException e7) {
                    throw new NoClassDefFoundError(e7.getMessage());
                }
            }
        }
        return num;
    }
}
