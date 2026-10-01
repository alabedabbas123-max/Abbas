package sun.reflect;

import java.lang.reflect.Field;

class UnsafeDoubleFieldAccessorImpl extends UnsafeFieldAccessorImpl {
    UnsafeDoubleFieldAccessorImpl(Field field) {
        super(field);
    }

    @Override
    public Object mo552get(Object obj) throws IllegalArgumentException {
        return new Double(getDouble(obj));
    }

    @Override
    public boolean getBoolean(Object obj) throws IllegalArgumentException {
        throw newGetBooleanIllegalArgumentException();
    }

    @Override
    public byte getByte(Object obj) throws IllegalArgumentException {
        throw newGetByteIllegalArgumentException();
    }

    @Override
    public char getChar(Object obj) throws IllegalArgumentException {
        throw newGetCharIllegalArgumentException();
    }

    @Override
    public short getShort(Object obj) throws IllegalArgumentException {
        throw newGetShortIllegalArgumentException();
    }

    @Override
    public int getInt(Object obj) throws IllegalArgumentException {
        throw newGetIntIllegalArgumentException();
    }

    @Override
    public long getLong(Object obj) throws IllegalArgumentException {
        throw newGetLongIllegalArgumentException();
    }

    @Override
    public float getFloat(Object obj) throws IllegalArgumentException {
        throw newGetFloatIllegalArgumentException();
    }

    @Override
    public double getDouble(Object obj) throws IllegalArgumentException {
        ensureObj(obj);
        return unsafe.getDouble(obj, this.fieldOffset);
    }

    @Override
    public void mo553set(Object obj, Object value) throws IllegalAccessException, IllegalArgumentException {
        ensureObj(obj);
        if (this.isFinal) {
            throwFinalFieldIllegalAccessException(value);
        }
        if (value == null) {
            throwSetIllegalArgumentException(value);
        }
        if (value instanceof Byte) {
            unsafe.putDouble(obj, this.fieldOffset, ((Byte) value).byteValue());
            return;
        }
        if (value instanceof Short) {
            unsafe.putDouble(obj, this.fieldOffset, ((Short) value).shortValue());
            return;
        }
        if (value instanceof Character) {
            unsafe.putDouble(obj, this.fieldOffset, ((Character) value).charValue());
            return;
        }
        if (value instanceof Integer) {
            unsafe.putDouble(obj, this.fieldOffset, ((Integer) value).intValue());
            return;
        }
        if (value instanceof Long) {
            unsafe.putDouble(obj, this.fieldOffset, ((Long) value).longValue());
            return;
        }
        if (value instanceof Float) {
            unsafe.putDouble(obj, this.fieldOffset, ((Float) value).floatValue());
        } else if (value instanceof Double) {
            unsafe.putDouble(obj, this.fieldOffset, ((Double) value).doubleValue());
        } else {
            throwSetIllegalArgumentException(value);
        }
    }

    @Override
    public void setBoolean(Object obj, boolean z) throws IllegalAccessException, IllegalArgumentException {
        throwSetIllegalArgumentException(z);
    }

    @Override
    public void setByte(Object obj, byte b) throws IllegalAccessException, IllegalArgumentException {
        setDouble(obj, b);
    }

    @Override
    public void setChar(Object obj, char c) throws IllegalAccessException, IllegalArgumentException {
        setDouble(obj, c);
    }

    @Override
    public void setShort(Object obj, short s) throws IllegalAccessException, IllegalArgumentException {
        setDouble(obj, s);
    }

    @Override
    public void setInt(Object obj, int i) throws IllegalAccessException, IllegalArgumentException {
        setDouble(obj, i);
    }

    @Override
    public void setLong(Object obj, long l) throws IllegalAccessException, IllegalArgumentException {
        setDouble(obj, l);
    }

    @Override
    public void setFloat(Object obj, float f) throws IllegalAccessException, IllegalArgumentException {
        setDouble(obj, f);
    }

    @Override
    public void setDouble(Object obj, double d) throws IllegalAccessException, IllegalArgumentException {
        ensureObj(obj);
        if (this.isFinal) {
            throwFinalFieldIllegalAccessException(d);
        }
        unsafe.putDouble(obj, this.fieldOffset, d);
    }
}
