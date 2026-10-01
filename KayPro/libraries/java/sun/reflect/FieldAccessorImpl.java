package sun.reflect;

abstract class FieldAccessorImpl extends MagicAccessorImpl implements FieldAccessor {
    @Override
    public abstract Object mo552get(Object obj) throws IllegalArgumentException;

    @Override
    public abstract boolean getBoolean(Object obj) throws IllegalArgumentException;

    @Override
    public abstract byte getByte(Object obj) throws IllegalArgumentException;

    @Override
    public abstract char getChar(Object obj) throws IllegalArgumentException;

    @Override
    public abstract double getDouble(Object obj) throws IllegalArgumentException;

    @Override
    public abstract float getFloat(Object obj) throws IllegalArgumentException;

    @Override
    public abstract int getInt(Object obj) throws IllegalArgumentException;

    @Override
    public abstract long getLong(Object obj) throws IllegalArgumentException;

    @Override
    public abstract short getShort(Object obj) throws IllegalArgumentException;

    @Override
    public abstract void mo553set(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException;

    @Override
    public abstract void setBoolean(Object obj, boolean z) throws IllegalAccessException, IllegalArgumentException;

    @Override
    public abstract void setByte(Object obj, byte b) throws IllegalAccessException, IllegalArgumentException;

    @Override
    public abstract void setChar(Object obj, char c) throws IllegalAccessException, IllegalArgumentException;

    @Override
    public abstract void setDouble(Object obj, double d) throws IllegalAccessException, IllegalArgumentException;

    @Override
    public abstract void setFloat(Object obj, float f) throws IllegalAccessException, IllegalArgumentException;

    @Override
    public abstract void setInt(Object obj, int i) throws IllegalAccessException, IllegalArgumentException;

    @Override
    public abstract void setLong(Object obj, long j) throws IllegalAccessException, IllegalArgumentException;

    @Override
    public abstract void setShort(Object obj, short s) throws IllegalAccessException, IllegalArgumentException;

    FieldAccessorImpl() {
    }
}
