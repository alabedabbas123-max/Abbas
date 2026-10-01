package sun.reflect;

import java.lang.reflect.Field;

class UnsafeQualifiedCharacterFieldAccessorImpl extends UnsafeQualifiedFieldAccessorImpl {
    UnsafeQualifiedCharacterFieldAccessorImpl(Field field, boolean isReadOnly) {
        super(field, isReadOnly);
    }

    @Override
    public Object mo552get(Object obj) throws IllegalArgumentException {
        return new Character(getChar(obj));
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
        ensureObj(obj);
        return unsafe.getCharVolatile(obj, this.fieldOffset);
    }

    @Override
    public short getShort(Object obj) throws IllegalArgumentException {
        throw newGetShortIllegalArgumentException();
    }

    @Override
    public int getInt(Object obj) throws IllegalArgumentException {
        return getChar(obj);
    }

    @Override
    public long getLong(Object obj) throws IllegalArgumentException {
        return getChar(obj);
    }

    @Override
    public float getFloat(Object obj) throws IllegalArgumentException {
        return getChar(obj);
    }

    @Override
    public double getDouble(Object obj) throws IllegalArgumentException {
        return getChar(obj);
    }

    @Override
    public void mo553set(Object obj, Object value) throws IllegalAccessException, IllegalArgumentException {
        ensureObj(obj);
        if (this.isReadOnly) {
            throwFinalFieldIllegalAccessException(value);
        }
        if (value == null) {
            throwSetIllegalArgumentException(value);
        }
        if (value instanceof Character) {
            unsafe.putCharVolatile(obj, this.fieldOffset, ((Character) value).charValue());
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
        throwSetIllegalArgumentException(b);
    }

    @Override
    public void setChar(Object obj, char c) throws IllegalAccessException, IllegalArgumentException {
        ensureObj(obj);
        if (this.isReadOnly) {
            throwFinalFieldIllegalAccessException(c);
        }
        unsafe.putCharVolatile(obj, this.fieldOffset, c);
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
