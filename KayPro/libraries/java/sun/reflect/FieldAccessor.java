package sun.reflect;

public interface FieldAccessor {
    Object mo552get(Object obj) throws IllegalArgumentException;

    boolean getBoolean(Object obj) throws IllegalArgumentException;

    byte getByte(Object obj) throws IllegalArgumentException;

    char getChar(Object obj) throws IllegalArgumentException;

    double getDouble(Object obj) throws IllegalArgumentException;

    float getFloat(Object obj) throws IllegalArgumentException;

    int getInt(Object obj) throws IllegalArgumentException;

    long getLong(Object obj) throws IllegalArgumentException;

    short getShort(Object obj) throws IllegalArgumentException;

    void mo553set(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException;

    void setBoolean(Object obj, boolean z) throws IllegalAccessException, IllegalArgumentException;

    void setByte(Object obj, byte b) throws IllegalAccessException, IllegalArgumentException;

    void setChar(Object obj, char c) throws IllegalAccessException, IllegalArgumentException;

    void setDouble(Object obj, double d) throws IllegalAccessException, IllegalArgumentException;

    void setFloat(Object obj, float f) throws IllegalAccessException, IllegalArgumentException;

    void setInt(Object obj, int i) throws IllegalAccessException, IllegalArgumentException;

    void setLong(Object obj, long j) throws IllegalAccessException, IllegalArgumentException;

    void setShort(Object obj, short s) throws IllegalAccessException, IllegalArgumentException;
}
