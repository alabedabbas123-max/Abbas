package sun.reflect;

import java.lang.reflect.Field;

abstract class UnsafeQualifiedStaticFieldAccessorImpl extends UnsafeStaticFieldAccessorImpl {
    protected final boolean isReadOnly;

    UnsafeQualifiedStaticFieldAccessorImpl(Field field, boolean isReadOnly) {
        super(field);
        this.isReadOnly = isReadOnly;
    }
}
