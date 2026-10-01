package sun.reflect;

import java.lang.reflect.InvocationTargetException;

class InstantiationExceptionConstructorAccessorImpl extends ConstructorAccessorImpl {
    private String message;

    InstantiationExceptionConstructorAccessorImpl(String message) {
        this.message = message;
    }

    @Override
    public Object newInstance(Object[] args) throws InstantiationException, IllegalArgumentException, InvocationTargetException {
        if (this.message == null) {
            throw new InstantiationException();
        }
        throw new InstantiationException(this.message);
    }
}
