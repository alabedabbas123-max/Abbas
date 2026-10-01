package sun.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.AccessController;
import java.security.Permission;
import java.security.PrivilegedAction;

public class ReflectionFactory {
    private static volatile LangReflectAccess langReflectAccess;
    private static boolean initted = false;
    private static Permission reflectionFactoryAccessPerm = new RuntimePermission("reflectionFactoryAccess");
    private static ReflectionFactory soleInstance = new ReflectionFactory();
    private static boolean noInflation = false;
    private static int inflationThreshold = 15;

    private ReflectionFactory() {
    }

    public static final class GetReflectionFactoryAction implements PrivilegedAction {
        @Override
        public Object run() {
            return ReflectionFactory.getReflectionFactory();
        }
    }

    public static ReflectionFactory getReflectionFactory() {
        SecurityManager security = System.getSecurityManager();
        if (security != null) {
            security.checkPermission(reflectionFactoryAccessPerm);
        }
        return soleInstance;
    }

    public void setLangReflectAccess(LangReflectAccess access) {
        langReflectAccess = access;
    }

    public FieldAccessor newFieldAccessor(Field field, boolean override) {
        checkInitted();
        return UnsafeFieldAccessorFactory.newFieldAccessor(field, override);
    }

    public MethodAccessor newMethodAccessor(Method method) {
        checkInitted();
        if (noInflation) {
            return new MethodAccessorGenerator().generateMethod(method.getDeclaringClass(), method.getName(), method.getParameterTypes(), method.getReturnType(), method.getExceptionTypes(), method.getModifiers());
        }
        NativeMethodAccessorImpl acc = new NativeMethodAccessorImpl(method);
        DelegatingMethodAccessorImpl res = new DelegatingMethodAccessorImpl(acc);
        acc.setParent(res);
        return res;
    }

    public ConstructorAccessor newConstructorAccessor(Constructor c) {
        checkInitted();
        Class declaringClass = c.getDeclaringClass();
        if (Modifier.isAbstract(declaringClass.getModifiers())) {
            return new InstantiationExceptionConstructorAccessorImpl(null);
        }
        if (declaringClass == Class.class) {
            return new InstantiationExceptionConstructorAccessorImpl("Can not instantiate java.lang.Class");
        }
        if (Reflection.isSubclassOf(declaringClass, ConstructorAccessorImpl.class)) {
            return new BootstrapConstructorAccessorImpl(c);
        }
        if (noInflation) {
            return new MethodAccessorGenerator().generateConstructor(c.getDeclaringClass(), c.getParameterTypes(), c.getExceptionTypes(), c.getModifiers());
        }
        NativeConstructorAccessorImpl acc = new NativeConstructorAccessorImpl(c);
        DelegatingConstructorAccessorImpl res = new DelegatingConstructorAccessorImpl(acc);
        acc.setParent(res);
        return res;
    }

    public Field newField(Class declaringClass, String name, Class type, int modifiers, int slot, String signature, byte[] annotations) {
        return langReflectAccess().newField(declaringClass, name, type, modifiers, slot, signature, annotations);
    }

    public Method newMethod(Class declaringClass, String name, Class[] parameterTypes, Class returnType, Class[] checkedExceptions, int modifiers, int slot, String signature, byte[] annotations, byte[] parameterAnnotations, byte[] annotationDefault) {
        return langReflectAccess().newMethod(declaringClass, name, parameterTypes, returnType, checkedExceptions, modifiers, slot, signature, annotations, parameterAnnotations, annotationDefault);
    }

    public Constructor newConstructor(Class declaringClass, Class[] parameterTypes, Class[] checkedExceptions, int modifiers, int slot, String signature, byte[] annotations, byte[] parameterAnnotations) {
        return langReflectAccess().newConstructor(declaringClass, parameterTypes, checkedExceptions, modifiers, slot, signature, annotations, parameterAnnotations);
    }

    public MethodAccessor getMethodAccessor(Method m) {
        return langReflectAccess().getMethodAccessor(m);
    }

    public void setMethodAccessor(Method m, MethodAccessor accessor) {
        langReflectAccess().setMethodAccessor(m, accessor);
    }

    public ConstructorAccessor getConstructorAccessor(Constructor c) {
        return langReflectAccess().getConstructorAccessor(c);
    }

    public void setConstructorAccessor(Constructor c, ConstructorAccessor accessor) {
        langReflectAccess().setConstructorAccessor(c, accessor);
    }

    public Method copyMethod(Method arg) {
        return langReflectAccess().copyMethod(arg);
    }

    public Field copyField(Field arg) {
        return langReflectAccess().copyField(arg);
    }

    public Constructor copyConstructor(Constructor arg) {
        return langReflectAccess().copyConstructor(arg);
    }

    public Constructor newConstructorForSerialization(Class classToInstantiate, Constructor constructorToCall) {
        if (constructorToCall.getDeclaringClass() == classToInstantiate) {
            return constructorToCall;
        }
        ConstructorAccessor acc = new MethodAccessorGenerator().generateSerializationConstructor(classToInstantiate, constructorToCall.getParameterTypes(), constructorToCall.getExceptionTypes(), constructorToCall.getModifiers(), constructorToCall.getDeclaringClass());
        Constructor c = newConstructor(constructorToCall.getDeclaringClass(), constructorToCall.getParameterTypes(), constructorToCall.getExceptionTypes(), constructorToCall.getModifiers(), langReflectAccess().getConstructorSlot(constructorToCall), langReflectAccess().getConstructorSignature(constructorToCall), langReflectAccess().getConstructorAnnotations(constructorToCall), langReflectAccess().getConstructorParameterAnnotations(constructorToCall));
        setConstructorAccessor(c, acc);
        return c;
    }

    static int inflationThreshold() {
        return inflationThreshold;
    }

    private static void checkInitted() {
        if (initted) {
            return;
        }
        AccessController.doPrivileged(new PrivilegedAction() {
            @Override
            public Object run() {
                if (System.out == null) {
                    return null;
                }
                String val = System.getProperty("sun.reflect.noInflation");
                if (val != null && val.equals("true")) {
                    boolean unused = ReflectionFactory.noInflation = true;
                }
                String val2 = System.getProperty("sun.reflect.inflationThreshold");
                if (val2 != null) {
                    try {
                        int unused2 = ReflectionFactory.inflationThreshold = Integer.parseInt(val2);
                    } catch (NumberFormatException e) {
                        throw ((RuntimeException) new RuntimeException("Unable to parse property sun.reflect.inflationThreshold").initCause(e));
                    }
                }
                boolean unused3 = ReflectionFactory.initted = true;
                return null;
            }
        });
    }

    private static LangReflectAccess langReflectAccess() {
        if (langReflectAccess == null) {
            Modifier.isPublic(1);
        }
        return langReflectAccess;
    }
}
