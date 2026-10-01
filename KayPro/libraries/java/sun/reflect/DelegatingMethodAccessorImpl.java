package sun.reflect;

import java.lang.reflect.InvocationTargetException;

class DelegatingMethodAccessorImpl extends MethodAccessorImpl {
    private MethodAccessorImpl delegate;

    DelegatingMethodAccessorImpl(MethodAccessorImpl delegate) {
        setDelegate(delegate);
    }

    @Override
    public Object invoke(Object obj, Object[] args) throws IllegalArgumentException, InvocationTargetException {
        return this.delegate.invoke(obj, args);
    }

    void setDelegate(MethodAccessorImpl delegate) {
        this.delegate = delegate;
    }
}
