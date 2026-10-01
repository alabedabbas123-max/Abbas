package com.luajava;

import android.content.Context;

public class LuaState {
    private static Class<?> Byte_class = null;
    private static Class<?> Double_class = null;
    private static Class<?> Float_class = null;
    private static Class<?> Integer_class = null;
    public static final int LUAI_MAXSTACK = 1000000;
    private static final String LUAJAVA_LIB = "luajava";
    public static final int LUA_ERRERR = 6;
    public static final int LUA_ERRGCMM = 5;
    public static final int LUA_ERRMEM = 4;
    public static final int LUA_ERRRUN = 2;
    public static final int LUA_ERRSYNTAX = 3;
    public static final int LUA_GCCOLLECT = 2;
    public static final int LUA_GCCOUNT = 3;
    public static final int LUA_GCCOUNTB = 4;
    public static final int LUA_GCRESTART = 1;
    public static final int LUA_GCSETPAUSE = 6;
    public static final int LUA_GCSETSTEPMUL = 7;
    public static final int LUA_GCSTEP = 5;
    public static final int LUA_GCSTOP = 0;
    public static final int LUA_MULTRET = -1;
    public static final int LUA_OPEQ = 0;
    public static final int LUA_OPLE = 2;
    public static final int LUA_OPLT = 1;
    public static final int LUA_REGISTRYINDEX = -1001000;
    public static final int LUA_RIDX_GLOBALS = 2;
    public static final int LUA_RIDX_LAST = 2;
    public static final int LUA_RIDX_MAINTHREAD = 1;
    public static final int LUA_TBOOLEAN = 1;
    public static final int LUA_TFUNCTION = 6;
    public static final int LUA_TLIGHTUSERDATA = 2;
    public static final int LUA_TNIL = 0;
    public static final int LUA_TNONE = -1;
    public static final int LUA_TNUMBER = 3;
    public static final int LUA_TSTRING = 4;
    public static final int LUA_TTABLE = 5;
    public static final int LUA_TTHREAD = 8;
    public static final int LUA_TUSERDATA = 7;
    public static final int LUA_YIELD = 1;
    private static Class<?> Long_class;
    private static Class<?> Number_class;
    private static Class<?> Short_class;
    private long luaState;
    private Context mContext;

    static {
        try {
            Number_class = Class.forName("java.lang.Number");
            try {
                Byte_class = Class.forName("java.lang.Byte");
                try {
                    Short_class = Class.forName("java.lang.Short");
                    try {
                        Integer_class = Class.forName("java.lang.Integer");
                        try {
                            Long_class = Class.forName("java.lang.Long");
                            try {
                                Float_class = Class.forName("java.lang.Float");
                                try {
                                    Double_class = Class.forName("java.lang.Double");
                                    System.loadLibrary(LUAJAVA_LIB);
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
    }

    protected LuaState() {
        this.luaState = _newstate();
    }

    protected LuaState(long j) {
        this.luaState = j;
        LuaStateFactory.insertLuaState(this);
    }

    private native synchronized int _LargError(long j, int i, String str);

    private native synchronized int _LcallMeta(long j, int i, String str);

    private native synchronized void _LcheckAny(long j, int i);

    private native synchronized int _LcheckInteger(long j, int i);

    private native synchronized double _LcheckNumber(long j, int i);

    private native synchronized void _LcheckStack(long j, int i, String str);

    private native synchronized String _LcheckString(long j, int i);

    private native synchronized void _LcheckType(long j, int i, int i2);

    private native synchronized int _LdoFile(long j, String str);

    private native synchronized int _LdoString(long j, String str);

    private native synchronized int _LgetMetaField(long j, int i, String str);

    private native synchronized void _LgetMetatable(long j, String str);

    private native synchronized String _Lgsub(long j, String str, String str2, String str3);

    private native synchronized int _LloadBuffer(long j, byte[] bArr, long j2, String str);

    private native synchronized int _LloadFile(long j, String str);

    private native synchronized int _LloadString(long j, String str);

    private native synchronized int _LnewMetatable(long j, String str);

    private native synchronized int _LoptInteger(long j, int i, int i2);

    private native synchronized double _LoptNumber(long j, int i, double d);

    private native synchronized String _LoptString(long j, int i, String str);

    private native synchronized int _Lref(long j, int i);

    private native synchronized void _LunRef(long j, int i, int i2);

    private native synchronized void _Lwhere(long j, int i);

    private native synchronized void _call(long j, int i, int i2);

    private native synchronized int _checkStack(long j, int i);

    private native synchronized void _close(long j);

    private native synchronized int _compare(long j, int i, int i2, int i3);

    private native synchronized void _concat(long j, int i);

    private native synchronized void _copy(long j, int i, int i2);

    private native synchronized void _createTable(long j, int i, int i2);

    private native synchronized byte[] _dump(long j, int i);

    private native synchronized int _equal(long j, int i, int i2);

    private native synchronized int _error(long j);

    private native synchronized int m7089_gc(long j, int i, int i2);

    private native synchronized int _getField(long j, int i, String str);

    private native synchronized int _getGlobal(long j, String str);

    private native synchronized int _getI(long j, int i, long j2);

    private native synchronized int _getMetaTable(long j, int i);

    private native synchronized Object _getObjectFromUserdata(long j, int i) throws LuaException;

    private native synchronized int _getTable(long j, int i);

    private native synchronized int _getTop(long j);

    private native synchronized String _getUpValue(long j, int i, int i2);

    private native synchronized int _getUserValue(long j, int i);

    private native synchronized void _insert(long j, int i);

    private native synchronized int _isBoolean(long j, int i);

    private native synchronized int _isCFunction(long j, int i);

    private native synchronized int _isFunction(long j, int i);

    private native synchronized int _isInteger(long j, int i);

    private native synchronized boolean _isJavaFunction(long j, int i);

    private native synchronized int _isNil(long j, int i);

    private native synchronized int _isNone(long j, int i);

    private native synchronized int _isNoneOrNil(long j, int i);

    private native synchronized int _isNumber(long j, int i);

    private native synchronized boolean _isObject(long j, int i);

    private native synchronized int _isString(long j, int i);

    private native synchronized int _isTable(long j, int i);

    private native synchronized int _isThread(long j, int i);

    private native synchronized int _isUserdata(long j, int i);

    private native synchronized int _isYieldable(long j);

    private native synchronized int _lessThan(long j, int i, int i2);

    private native synchronized void _newTable(long j);

    private native synchronized long _newstate();

    private native synchronized long _newthread(long j);

    private native synchronized int _next(long j, int i);

    private native synchronized int _objlen(long j, int i);

    private native synchronized void _openBase(long j);

    private native synchronized void _openDebug(long j);

    private native synchronized void _openIo(long j);

    private native synchronized void _openLibs(long j);

    private native synchronized void _openLuajava(long j);

    private native synchronized void _openMath(long j);

    private native synchronized void _openOs(long j);

    private native synchronized void _openPackage(long j);

    private native synchronized void _openString(long j);

    private native synchronized void _openTable(long j);

    private native synchronized int _pcall(long j, int i, int i2, int i3);

    private native synchronized void _pop(long j, int i);

    private native synchronized void _pushBoolean(long j, int i);

    private native synchronized void _pushGlobalTable(long j);

    private native synchronized void _pushInteger(long j, long j2);

    private native synchronized void _pushJavaFunction(long j, JavaFunction javaFunction) throws LuaException;

    private native synchronized void _pushJavaObject(long j, Object obj);

    private native synchronized void _pushNil(long j);

    private native synchronized void _pushNumber(long j, double d);

    private native synchronized void _pushString(long j, String str);

    private native synchronized void _pushString(long j, byte[] bArr, int i);

    private native synchronized void _pushValue(long j, int i);

    private native synchronized int _rawGet(long j, int i);

    private native synchronized int _rawGetI(long j, int i, long j2);

    private native synchronized void _rawSet(long j, int i);

    private native synchronized void _rawSetI(long j, int i, long j2);

    private native synchronized int _rawequal(long j, int i, int i2);

    private native synchronized int _rawlen(long j, int i);

    private native synchronized void _remove(long j, int i);

    private native synchronized void _replace(long j, int i);

    private native synchronized int _resume(long j, long j2, int i);

    private native synchronized void _rotate(long j, int i, int i2);

    private native synchronized void _setField(long j, int i, String str);

    private native synchronized void _setGlobal(long j, String str);

    private native synchronized void _setI(long j, int i, long j2);

    private native synchronized int _setMetaTable(long j, int i);

    private native synchronized void _setTable(long j, int i);

    private native synchronized void _setTop(long j, int i);

    private native synchronized String _setUpValue(long j, int i, int i2);

    private native synchronized void _setUserValue(long j, int i);

    private native synchronized int _status(long j);

    private native synchronized int _strlen(long j, int i);

    private native synchronized int _toBoolean(long j, int i);

    private native synchronized long _toInteger(long j, int i);

    private native synchronized double _toNumber(long j, int i);

    private native synchronized String _toString(long j, int i);

    private native synchronized long _toThread(long j, int i);

    private native synchronized int _type(long j, int i);

    private native synchronized String _typeName(long j, int i);

    private native synchronized void _xmove(long j, long j2, int i);

    private native synchronized int _yield(long j, int i);

    public static Number convertLuaNumber(Double d, Class<?> cls) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return new Integer(d.intValue());
            }
            if (cls == Long.TYPE) {
                return new Long(d.longValue());
            }
            if (cls == Float.TYPE) {
                return new Float(d.floatValue());
            }
            if (cls == Double.TYPE) {
                return new Double(d.doubleValue());
            }
            if (cls == Byte.TYPE) {
                return new Byte(d.byteValue());
            }
            if (cls == Short.TYPE) {
                return new Short(d.shortValue());
            }
        } else if (cls.isAssignableFrom(Number_class)) {
            if (cls.isAssignableFrom(Integer_class)) {
                return new Integer(d.intValue());
            }
            if (cls.isAssignableFrom(Long_class)) {
                return new Long(d.longValue());
            }
            if (cls.isAssignableFrom(Float_class)) {
                return new Float(d.floatValue());
            }
            if (cls.isAssignableFrom(Double_class)) {
                return d;
            }
            if (cls.isAssignableFrom(Byte_class)) {
                return new Byte(d.byteValue());
            }
            if (cls.isAssignableFrom(Short_class)) {
                return new Short(d.shortValue());
            }
        }
        return (Number) null;
    }

    public static Number convertLuaNumber(Long l, Class<?> cls) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return new Integer(l.intValue());
            }
            if (cls == Long.TYPE) {
                return new Long(l.longValue());
            }
            if (cls == Float.TYPE) {
                return new Float(l.floatValue());
            }
            if (cls == Double.TYPE) {
                return new Double(l.doubleValue());
            }
            if (cls == Byte.TYPE) {
                return new Byte(l.byteValue());
            }
            if (cls == Short.TYPE) {
                return new Short(l.shortValue());
            }
        } else if (cls.isAssignableFrom(Number_class)) {
            if (cls.isAssignableFrom(Integer_class)) {
                return new Integer(l.intValue());
            }
            if (cls.isAssignableFrom(Long_class)) {
                return new Long(l.longValue());
            }
            if (cls.isAssignableFrom(Float_class)) {
                return new Float(l.floatValue());
            }
            if (cls.isAssignableFrom(Double_class)) {
                return l;
            }
            if (cls.isAssignableFrom(Byte_class)) {
                return new Byte(l.byteValue());
            }
            if (cls.isAssignableFrom(Short_class)) {
                return new Short(l.shortValue());
            }
        }
        return (Number) null;
    }

    public int LargError(int i, String str) {
        return _LargError(this.luaState, i, str);
    }

    public int LcallMeta(int i, String str) {
        return _LcallMeta(this.luaState, i, str);
    }

    public void LcheckAny(int i) {
        _LcheckAny(this.luaState, i);
    }

    public int LcheckInteger(int i) {
        return _LcheckInteger(this.luaState, i);
    }

    public double LcheckNumber(int i) {
        return _LcheckNumber(this.luaState, i);
    }

    public void LcheckStack(int i, String str) {
        _LcheckStack(this.luaState, i, str);
    }

    public String LcheckString(int i) {
        return _LcheckString(this.luaState, i);
    }

    public void LcheckType(int i, int i2) {
        _LcheckType(this.luaState, i, i2);
    }

    public int LdoFile(String str) {
        return _LdoFile(this.luaState, str);
    }

    public int LdoString(String str) {
        return _LdoString(this.luaState, str);
    }

    public int LgetMetaField(int i, String str) {
        return _LgetMetaField(this.luaState, i, str);
    }

    public void LgetMetatable(String str) {
        _LgetMetatable(this.luaState, str);
    }

    public String Lgsub(String str, String str2, String str3) {
        return _Lgsub(this.luaState, str, str2, str3);
    }

    public int LloadBuffer(byte[] bArr, String str) {
        return _LloadBuffer(this.luaState, bArr, bArr.length, str);
    }

    public int LloadFile(String str) {
        return _LloadFile(this.luaState, str);
    }

    public int LloadString(String str) {
        return _LloadString(this.luaState, str);
    }

    public int LnewMetatable(String str) {
        return _LnewMetatable(this.luaState, str);
    }

    public int LoptInteger(int i, int i2) {
        return _LoptInteger(this.luaState, i, i2);
    }

    public double LoptNumber(int i, double d) {
        return _LoptNumber(this.luaState, i, d);
    }

    public String LoptString(int i, String str) {
        return _LoptString(this.luaState, i, str);
    }

    public int Lref(int i) {
        return _Lref(this.luaState, i);
    }

    public void LunRef(int i, int i2) {
        _LunRef(this.luaState, i, i2);
    }

    public void Lwhere(int i) {
        _Lwhere(this.luaState, i);
    }

    public void call(int i, int i2) {
        _call(this.luaState, i, i2);
    }

    public int checkStack(int i) {
        return _checkStack(this.luaState, i);
    }

    public synchronized void close() {
        LuaStateFactory.removeLuaState(this.luaState);
        _close(this.luaState);
        this.luaState = 0;
    }

    public int compare(int i, int i2, int i3) {
        return _compare(this.luaState, i, i2, i3);
    }

    public void concat(int i) {
        _concat(this.luaState, i);
    }

    public void copy(int i, int i2) {
        _copy(this.luaState, i, i2);
    }

    public void createTable(int i, int i2) {
        _createTable(this.luaState, i, i2);
    }

    public byte[] dump(int i) {
        return _dump(this.luaState, i);
    }

    public int equal(int i, int i2) {
        return _equal(this.luaState, i, i2);
    }

    public int error() {
        return _error(this.luaState);
    }

    public int m7090gc(int i, int i2) {
        return m7089_gc(this.luaState, i, i2);
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getField(int i, String str) {
        return _getField(this.luaState, i, str);
    }

    public synchronized int getGlobal(String str) {
        return _getGlobal(this.luaState, str);
    }

    public int getI(int i, long j) {
        return _getI(this.luaState, i, j);
    }

    public LuaObject getLuaObject(int i) {
        if (isFunction(i)) {
            return new LuaFunction(this, i);
        }
        return isTable(i) ? new LuaTable(this, i) : new LuaObject(this, i);
    }

    public LuaObject getLuaObject(LuaObject luaObject, LuaObject luaObject2) throws LuaException {
        if (luaObject.getLuaState().getPointer() == this.luaState && luaObject.getLuaState().getPointer() == luaObject2.getLuaState().getPointer()) {
            return new LuaObject(luaObject, luaObject2);
        }
        throw new LuaException("Object must have the same LuaState as the parent!");
    }

    public LuaObject getLuaObject(LuaObject luaObject, Number number) throws LuaException {
        return new LuaObject(luaObject, number);
    }

    public LuaObject getLuaObject(LuaObject luaObject, String str) throws LuaException {
        return new LuaObject(luaObject, str);
    }

    public LuaObject getLuaObject(String str) {
        pushGlobalTable();
        pushString(str);
        rawGet(-2);
        LuaObject luaObject = getLuaObject(-1);
        m7091pop(2);
        return luaObject;
    }

    public int getMetaTable(int i) {
        return _getMetaTable(this.luaState, i);
    }

    public Object getObjectFromUserdata(int i) throws LuaException {
        return _getObjectFromUserdata(this.luaState, i);
    }

    public long getPointer() {
        return this.luaState;
    }

    public int getTable(int i) {
        return _getTable(this.luaState, i);
    }

    public int getTop() {
        return _getTop(this.luaState);
    }

    public String getUpValue(int i, int i2) {
        return _getUpValue(this.luaState, i, i2);
    }

    public int getUserValue(int i) {
        return _getUserValue(this.luaState, i);
    }

    public void insert(int i) {
        _insert(this.luaState, i);
    }

    public boolean isBoolean(int i) {
        return _isBoolean(this.luaState, i) != 0;
    }

    public boolean isCFunction(int i) {
        return _isCFunction(this.luaState, i) != 0;
    }

    public synchronized boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.luaState == ((long) 0);
        }
        return z;
    }

    public boolean isFunction(int i) {
        return _isFunction(this.luaState, i) != 0;
    }

    public boolean isInteger(int i) {
        return _isInteger(this.luaState, i) != 0;
    }

    public boolean isJavaFunction(int i) {
        return _isJavaFunction(this.luaState, i);
    }

    public boolean isNil(int i) {
        return _isNil(this.luaState, i) != 0;
    }

    public boolean isNone(int i) {
        return _isNone(this.luaState, i) != 0;
    }

    public boolean isNoneOrNil(int i) {
        return _isNoneOrNil(this.luaState, i) != 0;
    }

    public boolean isNumber(int i) {
        return _isNumber(this.luaState, i) != 0;
    }

    public boolean isObject(int i) {
        return _isObject(this.luaState, i);
    }

    public boolean isString(int i) {
        return _isString(this.luaState, i) != 0;
    }

    public boolean isTable(int i) {
        return _isTable(this.luaState, i) != 0;
    }

    public boolean isThread(int i) {
        return _isThread(this.luaState, i) != 0;
    }

    public boolean isUserdata(int i) {
        return _isUserdata(this.luaState, i) != 0;
    }

    public int isYieldable() {
        return _isYieldable(this.luaState);
    }

    public int lessThan(int i, int i2) {
        return _lessThan(this.luaState, i, i2);
    }

    public void newTable() {
        _newTable(this.luaState);
    }

    public LuaState newThread() {
        LuaState luaState = new LuaState(_newthread(this.luaState));
        LuaStateFactory.insertLuaState(luaState);
        return luaState;
    }

    public int next(int i) {
        return _next(this.luaState, i);
    }

    public int objLen(int i) {
        return _objlen(this.luaState, i);
    }

    public void openBase() {
        _openBase(this.luaState);
    }

    public void openDebug() {
        _openDebug(this.luaState);
    }

    public void openIo() {
        _openIo(this.luaState);
    }

    public void openLibs() {
        _openLibs(this.luaState);
        _openLuajava(this.luaState);
        pushPrimitive();
    }

    public void openLuajava() {
        _openLuajava(this.luaState);
        pushPrimitive();
    }

    public void openMath() {
        _openMath(this.luaState);
    }

    public void openOs() {
        _openOs(this.luaState);
    }

    public void openPackage() {
        _openPackage(this.luaState);
    }

    public void openString() {
        _openString(this.luaState);
    }

    public void openTable() {
        _openTable(this.luaState);
    }

    public int pcall(int i, int i2, int i3) {
        return _pcall(this.luaState, i, i2, i3);
    }

    public void m7091pop(int i) {
        _pop(this.luaState, i);
    }

    public void pushBoolean(boolean z) {
        _pushBoolean(this.luaState, z ? 1 : 0);
    }

    public void pushContext(Context context) {
        this.mContext = context;
    }

    public synchronized void pushGlobalTable() {
        _pushGlobalTable(this.luaState);
    }

    public void pushInteger(long j) {
        _pushInteger(this.luaState, j);
    }

    public void pushJavaFunction(JavaFunction javaFunction) throws LuaException {
        _pushJavaFunction(this.luaState, javaFunction);
    }

    public void pushJavaObject(Object obj) {
        _pushJavaObject(this.luaState, obj);
    }

    public void pushNil() {
        _pushNil(this.luaState);
    }

    public void pushNumber(double d) {
        _pushNumber(this.luaState, d);
    }

    public void pushObjectValue(Object obj) throws LuaException {
        if (obj == null) {
            pushNil();
            return;
        }
        if (obj instanceof Boolean) {
            pushBoolean(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Long) {
            pushInteger(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Integer) {
            pushInteger(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Short) {
            pushInteger(((Short) obj).shortValue());
            return;
        }
        if (obj instanceof Character) {
            pushInteger(((Character) obj).charValue());
            return;
        }
        if (obj instanceof Byte) {
            pushInteger(((Byte) obj).byteValue());
            return;
        }
        if (obj instanceof Float) {
            pushNumber(((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            pushNumber(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof String) {
            pushString((String) obj);
            return;
        }
        if (obj instanceof JavaFunction) {
            pushJavaFunction((JavaFunction) obj);
            return;
        }
        if (!(obj instanceof LuaObject)) {
            pushJavaObject(obj);
            return;
        }
        LuaObject luaObject = (LuaObject) obj;
        if (luaObject.getLuaState() == this) {
            luaObject.push();
        } else {
            pushJavaObject(luaObject);
        }
    }

    public void pushPrimitive() {
        pushJavaObject(Boolean.TYPE);
        setGlobal("boolean");
        pushJavaObject(Byte.TYPE);
        setGlobal("byte");
        pushJavaObject(Character.TYPE);
        setGlobal("char");
        pushJavaObject(Short.TYPE);
        setGlobal("short");
        pushJavaObject(Integer.TYPE);
        setGlobal("int");
        pushJavaObject(Long.TYPE);
        setGlobal("long");
        pushJavaObject(Float.TYPE);
        setGlobal("float");
        pushJavaObject(Double.TYPE);
        setGlobal("double");
    }

    public void pushString(String str) {
        if (str == null) {
            _pushNil(this.luaState);
        } else {
            _pushString(this.luaState, str);
        }
    }

    public void pushString(byte[] bArr) {
        if (bArr == null) {
            _pushNil(this.luaState);
        } else {
            _pushString(this.luaState, bArr, bArr.length);
        }
    }

    public void pushValue(int i) {
        _pushValue(this.luaState, i);
    }

    public int rawGet(int i) {
        return _rawGet(this.luaState, i);
    }

    public int rawGetI(int i, long j) {
        return _rawGetI(this.luaState, i, j);
    }

    public int rawLen(int i) {
        return _rawlen(this.luaState, i);
    }

    public void rawSet(int i) {
        _rawSet(this.luaState, i);
    }

    public void rawSetI(int i, long j) {
        _rawSetI(this.luaState, i, j);
    }

    public int rawequal(int i, int i2) {
        return _rawequal(this.luaState, i, i2);
    }

    public void remove(int i) {
        _remove(this.luaState, i);
    }

    public void replace(int i) {
        _replace(this.luaState, i);
    }

    public int resume(LuaState luaState, int i) {
        return _resume(this.luaState, luaState.getPointer(), i);
    }

    public void rotate(int i, int i2) {
        _rotate(this.luaState, i, i2);
    }

    public void setField(int i, String str) {
        _setField(this.luaState, i, str);
    }

    public synchronized void setGlobal(String str) {
        _setGlobal(this.luaState, str);
    }

    public void setI(int i, long j) {
        _setI(this.luaState, i, j);
    }

    public int setMetaTable(int i) {
        return _setMetaTable(this.luaState, i);
    }

    public void setTable(int i) {
        _setTable(this.luaState, i);
    }

    public void setTop(int i) {
        _setTop(this.luaState, i);
    }

    public String setUpValue(int i, int i2) {
        return _setUpValue(this.luaState, i, i2);
    }

    public void setUserValue(int i) {
        _setUserValue(this.luaState, i);
    }

    public int status() {
        return _status(this.luaState);
    }

    public int strLen(int i) {
        return _strlen(this.luaState, i);
    }

    public boolean toBoolean(int i) {
        return _toBoolean(this.luaState, i) != 0;
    }

    public long toInteger(int i) {
        return _toInteger(this.luaState, i);
    }

    public synchronized Object toJavaObject(int i) throws LuaException {
        Object objectFromUserdata;
        objectFromUserdata = (Object) null;
        if (isBoolean(i)) {
            objectFromUserdata = new Boolean(toBoolean(i));
        } else if (type(i) == 4) {
            objectFromUserdata = toString(i);
        } else if (isFunction(i) || isTable(i)) {
            objectFromUserdata = getLuaObject(i);
        } else if (type(i) == 3) {
            objectFromUserdata = isInteger(i) ? new Long(toInteger(i)) : new Double(toNumber(i));
        } else if (isUserdata(i)) {
            objectFromUserdata = isObject(i) ? getObjectFromUserdata(i) : getLuaObject(i);
        } else if (isNil(i)) {
            objectFromUserdata = (Object) null;
        }
        return objectFromUserdata;
    }

    public double toNumber(int i) {
        return _toNumber(this.luaState, i);
    }

    public String toString(int i) {
        return _toString(this.luaState, i);
    }

    public LuaState toThread(int i) {
        return new LuaState(_toThread(this.luaState, i));
    }

    public int type(int i) {
        return _type(this.luaState, i);
    }

    public String typeName(int i) {
        return _typeName(this.luaState, i);
    }

    public void xmove(LuaState luaState, int i) {
        _xmove(this.luaState, luaState.luaState, i);
    }

    public int yield(int i) {
        return _yield(this.luaState, i);
    }
}
