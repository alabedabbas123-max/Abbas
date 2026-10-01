package sun.reflect;

import java.lang.reflect.Field;

class UnsafeStaticByteFieldAccessorImpl extends UnsafeStaticFieldAccessorImpl {
    UnsafeStaticByteFieldAccessorImpl(Field field) {
        super(field);
    }

    @Override
    public Object mo552get(Object obj) throws IllegalArgumentException {
        return new Byte(getByte(obj));
    }

    @Override
    public boolean getBoolean(Object obj) throws IllegalArgumentException {
        throw newGetBooleanIllegalArgumentException();
    }

    @Override
    public byte getByte(Object obj) throws IllegalArgumentException {
        return unsafe.getByte(this.base, this.fieldOffset);
    }

    @Override
    public char getChar(Object obj) throws IllegalArgumentException {
        throw newGetCharIllegalArgumentException();
    }

    @Override
    public short getShort(Object obj) throws IllegalArgumentException {
        return getByte(obj);
    }

    @Override
    public int getInt(Object obj) throws IllegalArgumentException {
        return getByte(obj);
    }

    @Override
    public long getLong(Object obj) throws IllegalArgumentException {
        return getByte(obj);
    }

    @Override
    public float getFloat(Object obj) throws IllegalArgumentException {
        return getByte(obj);
    }

    @Override
    public double getDouble(Object obj) throws IllegalArgumentException {
        return getByte(obj);
    }

    @Override
    public void mo553set(Object obj, Object value) throws IllegalAccessException, IllegalArgumentException {
        if (this.isFinal) {
            throwFinalFieldIllegalAccessException(value);
        }
        if (value == null) {
            throwSetIllegalArgumentException(value);
        }
        if (value instanceof Byte) {
            unsafe.putByte(this.base, this.fieldOffset, ((Byte) value).byteValue());
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
        if (this.isFinal) {
            throwFinalFieldIllegalAccessException(b);
        }
        unsafe.putByte(this.base, this.fieldOffset, b);
    }

    @Override
    public void setChar(Object obj, char c) throws IllegalAccessException, IllegalArgumentException {
        throwSetIllegalArgumentException(c);
    }

    @Override
    public void setShort(Object obj, short s) throws IllegalAccessException, IllegalArgumentException {
        throwSetIllegalArgumentException(s);
    }

    @Override
    public void setInt(Object obj, int i) throws IllegalAccessException, IllegalArgumentException {
        throwSetIllegalArgumentException(i);
    }

    @Override
    public void setLong(Object obj, long l) throws IllegalAccessException, IllegalArgumentException {
        throwSetIllegalArgumentException(l);
    }

    @Override
    public void setFloat(Object obj, float f) throws IllegalAccessException, IllegalArgumentException {
        throwSetIllegalArgumentException(f);
    }

    @Override
    public void setDouble(Object obj, double d) throws IllegalAccessException, IllegalArgumentException {
        throwSetIllegalArgumentException(d);
    }
}
