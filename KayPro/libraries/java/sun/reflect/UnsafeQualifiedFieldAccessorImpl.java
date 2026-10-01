package sun.reflect;

import java.lang.reflect.Field;

abstract class UnsafeQualifiedFieldAccessorImpl extends UnsafeFieldAccessorImpl {
    protected final boolean isReadOnly;

    UnsafeQualifiedFieldAccessorImpl(Field field, boolean isReadOnly) {
        super(field);
        this.isReadOnly = isReadOnly;
    }
}
