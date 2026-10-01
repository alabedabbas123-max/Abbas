package sun.misc;

import sun.nio.ch.Interruptible;
import sun.reflect.ConstantPool;
import sun.reflect.annotation.AnnotationType;

public interface JavaLangAccess {
    void blockedOn(Thread thread, Interruptible interruptible);

    AnnotationType getAnnotationType(Class cls);

    ConstantPool getConstantPool(Class cls);

    <E extends Enum<E>> E[] getEnumConstantsShared(Class<E> cls);

    void setAnnotationType(Class cls, AnnotationType annotationType);
}
