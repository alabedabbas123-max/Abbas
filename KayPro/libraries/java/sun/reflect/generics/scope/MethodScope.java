package sun.reflect.generics.scope;

import java.lang.reflect.Method;

public class MethodScope extends AbstractScope<Method> {
    private MethodScope(Method m) {
        super(m);
    }

    private Class<?> getEnclosingClass() {
        return getRecvr().getDeclaringClass();
    }

    @Override
    protected Scope computeEnclosingScope() {
        return ClassScope.make(getEnclosingClass());
    }

    public static MethodScope make(Method m) {
        return new MethodScope(m);
    }
}
