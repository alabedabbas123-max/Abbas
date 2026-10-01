package sun.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class NativeMethodAccessorImpl extends MethodAccessorImpl {
    private Method method;
    private int numInvocations;
    private DelegatingMethodAccessorImpl parent;

    private static native Object invoke0(Method method, Object obj, Object[] objArr);

    NativeMethodAccessorImpl(Method method) {
        this.method = method;
    }

    @Override
    public Object invoke(Object obj, Object[] args) throws IllegalArgumentException, InvocationTargetException {
        int i = this.numInvocations + 1;
        this.numInvocations = i;
        if (i > ReflectionFactory.inflationThreshold()) {
            MethodAccessorImpl acc = (MethodAccessorImpl) new MethodAccessorGenerator().generateMethod(this.method.getDeclaringClass(), this.method.getName(), this.method.getParameterTypes(), this.method.getReturnType(), this.method.getExceptionTypes(), this.method.getModifiers());
            this.parent.setDelegate(acc);
        }
        return invoke0(this.method, obj, args);
    }

    void setParent(DelegatingMethodAccessorImpl parent) {
        this.parent = parent;
    }
}
