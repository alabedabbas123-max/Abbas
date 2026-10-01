package sun.reflect;

import java.lang.reflect.Field;

class UnsafeQualifiedStaticLongFieldAccessorImpl extends UnsafeQualifiedStaticFieldAccessorImpl {
    UnsafeQualifiedStaticLongFieldAccessorImpl(Field field, boolean isReadOnly) {
        super(field, isReadOnly);
    }

    @Override
    public Object mo552get(Object obj) throws IllegalArgumentException {
        return new Long(getLong(obj));
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
        return unsafe.getLongVolatile(this.base, this.fieldOffset);
    }

    @Override
    public float getFloat(Object obj) throws IllegalArgumentException {
        return getLong(obj);
    }

    @Override
    public double getDouble(Object obj) throws IllegalArgumentException {
        return getLong(obj);
    }

    @Override
    public void mo553set(Object obj, Object value) throws IllegalAccessException, IllegalArgumentException {
        if (this.isReadOnly) {
            throwFinalFieldIllegalAccessException(value);
        }
        if (value == null) {
            throwSetIllegalArgumentException(value);
        }
        if (value instanceof Byte) {
            unsafe.putLongVolatile(this.base, this.fieldOffset, ((Byte) value).byteValue());
            return;
        }
        if (value instanceof Short) {
            unsafe.putLongVolatile(this.base, this.fieldOffset, ((Short) value).shortValue());
            return;
        }
        if (value instanceof Character) {
            unsafe.putLongVolatile(this.base, this.fieldOffset, ((Character) value).charValue());
            return;
        }
        if (value instanceof Integer) {
            unsafe.putLongVolatile(this.base, this.fieldOffset, ((Integer) value).intValue());
        } else if (value instanceof Long) {
            unsafe.putLongVolatile(this.base, this.fieldOffset, ((Long) value).longValue());
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
        setLong(obj, b);
    }

    @Override
    public void setChar(Object obj, char c) throws IllegalAccessException, IllegalArgumentException {
        setLong(obj, c);
    }

    @Override
    public void setShort(Object obj, short s) throws IllegalAccessException, IllegalArgumentException {
        setLong(obj, s);
    }

    @Override
    public void setInt(Object obj, int i) throws IllegalAccessException, IllegalArgumentException {
        setLong(obj, i);
    }

    @Override
    public void setLong(Object obj, long l) throws IllegalAccessException, IllegalArgumentException {
        if (this.isReadOnly) {
            throwFinalFieldIllegalAccessException(l);
        }
        unsafe.putLongVolatile(this.base, this.fieldOffset, l);
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
