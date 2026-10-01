package sun.misc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.ProtectionDomain;
import sun.reflect.Reflection;

public final class Unsafe {
    public static final int INVALID_FIELD_OFFSET = -1;
    private static final Unsafe theUnsafe;

    private static native void registerNatives();

    public native int addressSize();

    public native Object allocateInstance(Class cls) throws InstantiationException;

    public native long allocateMemory(long j);

    public native int arrayBaseOffset(Class cls);

    public native int arrayIndexScale(Class cls);

    public final native boolean compareAndSwapInt(Object obj, long j, int i, int i2);

    public final native boolean compareAndSwapLong(Object obj, long j, long j2, long j3);

    public final native boolean compareAndSwapObject(Object obj, long j, Object obj2, Object obj3);

    public native void copyMemory(long j, long j2, long j3);

    public native Class defineClass(String str, byte[] bArr, int i, int i2);

    public native Class defineClass(String str, byte[] bArr, int i, int i2, ClassLoader classLoader, ProtectionDomain protectionDomain);

    public native void ensureClassInitialized(Class cls);

    public native void freeMemory(long j);

    public native long getAddress(long j);

    public native boolean getBoolean(Object obj, long j);

    public native boolean getBooleanVolatile(Object obj, long j);

    public native byte getByte(long j);

    public native byte getByte(Object obj, long j);

    public native byte getByteVolatile(Object obj, long j);

    public native char getChar(long j);

    public native char getChar(Object obj, long j);

    public native char getCharVolatile(Object obj, long j);

    public native double getDouble(long j);

    public native double getDouble(Object obj, long j);

    public native double getDoubleVolatile(Object obj, long j);

    public native float getFloat(long j);

    public native float getFloat(Object obj, long j);

    public native float getFloatVolatile(Object obj, long j);

    public native int getInt(long j);

    public native int getInt(Object obj, long j);

    public native int getIntVolatile(Object obj, long j);

    public native int getLoadAverage(double[] dArr, int i);

    public native long getLong(long j);

    public native long getLong(Object obj, long j);

    public native long getLongVolatile(Object obj, long j);

    public native Object getObject(Object obj, long j);

    public native Object getObjectVolatile(Object obj, long j);

    public native short getShort(long j);

    public native short getShort(Object obj, long j);

    public native short getShortVolatile(Object obj, long j);

    public native void monitorEnter(Object obj);

    public native void monitorExit(Object obj);

    public native long objectFieldOffset(Field field);

    public native int pageSize();

    public native void park(boolean z, long j);

    public native void putAddress(long j, long j2);

    public native void putBoolean(Object obj, long j, boolean z);

    public native void putBooleanVolatile(Object obj, long j, boolean z);

    public native void putByte(long j, byte b);

    public native void putByte(Object obj, long j, byte b);

    public native void putByteVolatile(Object obj, long j, byte b);

    public native void putChar(long j, char c);

    public native void putChar(Object obj, long j, char c);

    public native void putCharVolatile(Object obj, long j, char c);

    public native void putDouble(long j, double d);

    public native void putDouble(Object obj, long j, double d);

    public native void putDoubleVolatile(Object obj, long j, double d);

    public native void putFloat(long j, float f);

    public native void putFloat(Object obj, long j, float f);

    public native void putFloatVolatile(Object obj, long j, float f);

    public native void putInt(long j, int i);

    public native void putInt(Object obj, long j, int i);

    public native void putIntVolatile(Object obj, long j, int i);

    public native void putLong(long j, long j2);

    public native void putLong(Object obj, long j, long j2);

    public native void putLongVolatile(Object obj, long j, long j2);

    public native void putObject(Object obj, long j, Object obj2);

    public native void putObjectVolatile(Object obj, long j, Object obj2);

    public native void putOrderedInt(Object obj, long j, int i);

    public native void putOrderedLong(Object obj, long j, long j2);

    public native void putOrderedObject(Object obj, long j, Object obj2);

    public native void putShort(long j, short s);

    public native void putShort(Object obj, long j, short s);

    public native void putShortVolatile(Object obj, long j, short s);

    public native long reallocateMemory(long j, long j2);

    public native void setMemory(long j, long j2, byte b);

    public native Object staticFieldBase(Field field);

    public native long staticFieldOffset(Field field);

    public native void throwException(Throwable th);

    public native boolean tryMonitorEnter(Object obj);

    public native void unpark(Object obj);

    static {
        registerNatives();
        Reflection.registerMethodsToFilter(Unsafe.class, "getUnsafe");
        theUnsafe = new Unsafe();
    }

    private Unsafe() {
    }

    public static Unsafe getUnsafe() {
        Class cc = Reflection.getCallerClass(2);
        if (cc.getClassLoader() != null) {
            throw new SecurityException("Unsafe");
        }
        return theUnsafe;
    }

    @Deprecated
    public int getInt(Object o, int offset) {
        return getInt(o, offset);
    }

    @Deprecated
    public void putInt(Object o, int offset, int x) {
        putInt(o, offset, x);
    }

    @Deprecated
    public Object getObject(Object o, int offset) {
        return getObject(o, offset);
    }

    @Deprecated
    public void putObject(Object o, int offset, Object x) {
        putObject(o, offset, x);
    }

    @Deprecated
    public boolean getBoolean(Object o, int offset) {
        return getBoolean(o, offset);
    }

    @Deprecated
    public void putBoolean(Object o, int offset, boolean x) {
        putBoolean(o, offset, x);
    }

    @Deprecated
    public byte getByte(Object o, int offset) {
        return getByte(o, offset);
    }

    @Deprecated
    public void putByte(Object o, int offset, byte x) {
        putByte(o, offset, x);
    }

    @Deprecated
    public short getShort(Object o, int offset) {
        return getShort(o, offset);
    }

    @Deprecated
    public void putShort(Object o, int offset, short x) {
        putShort(o, offset, x);
    }

    @Deprecated
    public char getChar(Object o, int offset) {
        return getChar(o, offset);
    }

    @Deprecated
    public void putChar(Object o, int offset, char x) {
        putChar(o, offset, x);
    }

    @Deprecated
    public long getLong(Object o, int offset) {
        return getLong(o, offset);
    }

    @Deprecated
    public void putLong(Object o, int offset, long x) {
        putLong(o, offset, x);
    }

    @Deprecated
    public float getFloat(Object o, int offset) {
        return getFloat(o, offset);
    }

    @Deprecated
    public void putFloat(Object o, int offset, float x) {
        putFloat(o, offset, x);
    }

    @Deprecated
    public double getDouble(Object o, int offset) {
        return getDouble(o, offset);
    }

    @Deprecated
    public void putDouble(Object o, int offset, double x) {
        putDouble(o, offset, x);
    }

    @Deprecated
    public int fieldOffset(Field f) {
        if (Modifier.isStatic(f.getModifiers())) {
            return (int) staticFieldOffset(f);
        }
        return (int) objectFieldOffset(f);
    }

    @Deprecated
    public Object staticFieldBase(Class c) {
        Field[] fields = c.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            if (Modifier.isStatic(fields[i].getModifiers())) {
                return staticFieldBase(fields[i]);
            }
        }
        return null;
    }
}
