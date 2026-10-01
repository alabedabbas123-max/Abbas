package sun.reflect;

import java.lang.reflect.InvocationTargetException;

public interface MethodAccessor {
    Object invoke(Object obj, Object[] objArr) throws IllegalArgumentException, InvocationTargetException;
}
