package sun.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class BootstrapConstructorAccessorImpl extends ConstructorAccessorImpl {
    private Constructor constructor;

    BootstrapConstructorAccessorImpl(Constructor c) {
        this.constructor = c;
    }

    @Override
    public Object newInstance(Object[] args) throws IllegalArgumentException, InvocationTargetException {
        try {
            return UnsafeFieldAccessorImpl.unsafe.allocateInstance(this.constructor.getDeclaringClass());
        } catch (InstantiationException e) {
            throw new InvocationTargetException(e);
        }
    }
}
