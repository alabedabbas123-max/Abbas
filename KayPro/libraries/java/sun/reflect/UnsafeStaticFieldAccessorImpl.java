package sun.reflect;

import java.lang.reflect.Field;

abstract class UnsafeStaticFieldAccessorImpl extends UnsafeFieldAccessorImpl {
    protected Object base;

    static {
        Reflection.registerFieldsToFilter(UnsafeStaticFieldAccessorImpl.class, "base");
    }

    UnsafeStaticFieldAccessorImpl(Field field) {
        super(field);
        this.base = unsafe.staticFieldBase(field);
    }
}
