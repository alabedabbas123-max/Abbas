package sun.reflect.annotation;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.HashMap;
import java.util.Map;
import sun.misc.SharedSecrets;

public class AnnotationType {
    private boolean inherited;
    private RetentionPolicy retention;
    private final Map<String, Class> memberTypes = new HashMap();
    private final Map<String, Object> memberDefaults = new HashMap();
    private final Map<String, Method> members = new HashMap();

    public static synchronized AnnotationType getInstance(Class annotationClass) {
        AnnotationType result;
        result = SharedSecrets.getJavaLangAccess().getAnnotationType(annotationClass);
        if (result == null) {
            result = new AnnotationType(annotationClass);
        }
        return result;
    }

    private AnnotationType(final Class<?> annotationClass) {
        this.retention = RetentionPolicy.RUNTIME;
        this.inherited = false;
        if (!annotationClass.isAnnotation()) {
            throw new IllegalArgumentException("Not an annotation type");
        }
        Method[] methods = (Method[]) AccessController.doPrivileged(new PrivilegedAction<Method[]>() {
            @Override
            public Method[] run() {
                return annotationClass.getDeclaredMethods();
            }
        });
        for (Method method : methods) {
            if (method.getParameterTypes().length != 0) {
                throw new IllegalArgumentException(method + " has params");
            }
            String name = method.getName();
            this.memberTypes.put(name, invocationHandlerReturnType(method.getReturnType()));
            this.members.put(name, method);
            Object defaultValue = method.getDefaultValue();
            if (defaultValue != null) {
                this.memberDefaults.put(name, defaultValue);
            }
            this.members.put(name, method);
        }
        SharedSecrets.getJavaLangAccess().setAnnotationType(annotationClass, this);
        if (annotationClass != Retention.class && annotationClass != Inherited.class) {
            Retention ret = (Retention) annotationClass.getAnnotation(Retention.class);
            this.retention = ret == null ? RetentionPolicy.CLASS : ret.value();
            this.inherited = annotationClass.isAnnotationPresent(Inherited.class);
        }
    }

    public static Class invocationHandlerReturnType(Class type) {
        if (type == Byte.TYPE) {
            return Byte.class;
        }
        if (type == Character.TYPE) {
            return Character.class;
        }
        if (type == Double.TYPE) {
            return Double.class;
        }
        if (type == Float.TYPE) {
            return Float.class;
        }
        if (type == Integer.TYPE) {
            return Integer.class;
        }
        if (type == Long.TYPE) {
            return Long.class;
        }
        if (type == Short.TYPE) {
            return Short.class;
        }
        if (type == Boolean.TYPE) {
            return Boolean.class;
        }
        return type;
    }

    public Map<String, Class> memberTypes() {
        return this.memberTypes;
    }

    public Map<String, Method> members() {
        return this.members;
    }

    public Map<String, Object> memberDefaults() {
        return this.memberDefaults;
    }

    public RetentionPolicy retention() {
        return this.retention;
    }

    public boolean isInherited() {
        return this.inherited;
    }

    public String toString() {
        StringBuffer s = new StringBuffer("Annotation Type:\n");
        s.append("   Member types: " + this.memberTypes + "\n");
        s.append("   Member defaults: " + this.memberDefaults + "\n");
        s.append("   Retention policy: " + this.retention + "\n");
        StringBuilder sb = new StringBuilder();
        sb.append("   Inherited: ");
        sb.append(this.inherited);
        s.append(sb.toString());
        return s.toString();
    }
}
