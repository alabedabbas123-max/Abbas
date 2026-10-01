package sun.reflect.misc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class MethodUtil2 {
    MethodUtil2() {
    }

    private static Object invoke(Method m, Object obj, Object[] params) throws IllegalAccessException, InvocationTargetException {
        return m.invoke(obj, params);
    }
}
