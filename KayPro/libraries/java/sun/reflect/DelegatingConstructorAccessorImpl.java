package sun.reflect;

import java.lang.reflect.InvocationTargetException;

class DelegatingConstructorAccessorImpl extends ConstructorAccessorImpl {
    private ConstructorAccessorImpl delegate;

    DelegatingConstructorAccessorImpl(ConstructorAccessorImpl delegate) {
        setDelegate(delegate);
    }

    @Override
    public Object newInstance(Object[] args) throws InstantiationException, IllegalArgumentException, InvocationTargetException {
        return this.delegate.newInstance(args);
    }

    void setDelegate(ConstructorAccessorImpl delegate) {
        this.delegate = delegate;
    }
}
