package sun.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public interface LangReflectAccess {
    <T> Constructor<T> copyConstructor(Constructor<T> constructor);

    Field copyField(Field field);

    Method copyMethod(Method method);

    ConstructorAccessor getConstructorAccessor(Constructor constructor);

    byte[] getConstructorAnnotations(Constructor constructor);

    byte[] getConstructorParameterAnnotations(Constructor constructor);

    String getConstructorSignature(Constructor constructor);

    int getConstructorSlot(Constructor constructor);

    MethodAccessor getMethodAccessor(Method method);

    <T> Constructor<T> newConstructor(Class<T> cls, Class[] clsArr, Class[] clsArr2, int i, int i2, String str, byte[] bArr, byte[] bArr2);

    Field newField(Class cls, String str, Class cls2, int i, int i2, String str2, byte[] bArr);

    Method newMethod(Class cls, String str, Class[] clsArr, Class cls2, Class[] clsArr2, int i, int i2, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3);

    void setConstructorAccessor(Constructor constructor, ConstructorAccessor constructorAccessor);

    void setMethodAccessor(Method method, MethodAccessor methodAccessor);
}
