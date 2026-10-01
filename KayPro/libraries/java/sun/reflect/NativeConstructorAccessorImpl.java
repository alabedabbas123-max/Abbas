package sun.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class NativeConstructorAccessorImpl extends ConstructorAccessorImpl {

    private Constructor f635c;
    private int numInvocations;
    private DelegatingConstructorAccessorImpl parent;

    private static native Object newInstance0(Constructor constructor, Object[] objArr) throws InstantiationException, IllegalArgumentException, InvocationTargetException;

    NativeConstructorAccessorImpl(Constructor c) {
        this.f635c = c;
    }

    @Override
    public Object newInstance(Object[] args) throws InstantiationException, IllegalArgumentException, InvocationTargetException {
        int i = this.numInvocations + 1;
        this.numInvocations = i;
        if (i > ReflectionFactory.inflationThreshold()) {
            ConstructorAccessorImpl acc = (ConstructorAccessorImpl) new MethodAccessorGenerator().generateConstructor(this.f635c.getDeclaringClass(), this.f635c.getParameterTypes(), this.f635c.getExceptionTypes(), this.f635c.getModifiers());
            this.parent.setDelegate(acc);
        }
        return newInstance0(this.f635c, args);
    }

    void setParent(DelegatingConstructorAccessorImpl parent) {
        this.parent = parent;
    }
}
