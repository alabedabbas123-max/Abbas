package sun.reflect;

import java.security.AccessController;
import java.security.PrivilegedAction;
import sun.misc.Unsafe;

class ClassDefiner {
    static final Unsafe unsafe = Unsafe.getUnsafe();

    ClassDefiner() {
    }

    static Class defineClass(String name, byte[] bytes, int off, int len, final ClassLoader parentClassLoader) {
        ClassLoader newLoader = (ClassLoader) AccessController.doPrivileged(new PrivilegedAction() {
            @Override
            public Object run() {
                return new ClassDefiner2(parentClassLoader);
            }
        });
        return unsafe.defineClass(name, bytes, off, len, newLoader, null);
    }
}
