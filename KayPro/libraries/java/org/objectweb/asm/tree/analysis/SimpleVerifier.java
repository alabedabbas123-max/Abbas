package org.objectweb.asm.tree.analysis;

import java.util.List;
import org.apache.commons.io.FilenameUtils;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class SimpleVerifier extends BasicVerifier {
    static Class class$java$lang$Object = class$("java.lang.Object");
    private final Type currentClass;
    private final List currentClassInterfaces;
    private final Type currentSuperClass;
    private final boolean isInterface;
    private ClassLoader loader;

    public SimpleVerifier() {
        this(null, null, false);
    }

    protected SimpleVerifier(int i, Type type, Type type2, List list, boolean z) {
        super(i);
        this.loader = getClass().getClassLoader();
        this.currentClass = type;
        this.currentSuperClass = type2;
        this.currentClassInterfaces = list;
        this.isInterface = z;
    }

    public SimpleVerifier(Type type, Type type2, List list, boolean z) {
        this(Opcodes.ASM5, type, type2, list, z);
    }

    public SimpleVerifier(Type type, Type type2, boolean z) {
        this(type, type2, null, z);
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    protected Class getClass(Type type) {
        try {
            return type.getSort() == 9 ? Class.forName(type.getDescriptor().replace('/', FilenameUtils.EXTENSION_SEPARATOR), false, this.loader) : Class.forName(type.getClassName(), false, this.loader);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e.toString());
        }
    }

    @Override
    protected BasicValue getElementValue(BasicValue basicValue) throws AnalyzerException {
        Type type = basicValue.getType();
        if (type != null) {
            if (type.getSort() == 9) {
                return newValue(Type.getType(type.getDescriptor().substring(1)));
            }
            if ("Lnull;".equals(type.getDescriptor())) {
                return basicValue;
            }
        }
        throw new Error("Internal error");
    }

    protected Type getSuperClass(Type type) {
        if (this.currentClass != null && type.equals(this.currentClass)) {
            return this.currentSuperClass;
        }
        Class superclass = getClass(type).getSuperclass();
        if (superclass == null) {
            return null;
        }
        return Type.getType(superclass);
    }

    @Override
    protected boolean isArrayValue(BasicValue basicValue) {
        Type type = basicValue.getType();
        return type != null && ("Lnull;".equals(type.getDescriptor()) || type.getSort() == 9);
    }

    protected boolean isAssignableFrom(Type type, Type type2) {
        if (type.equals(type2)) {
            return true;
        }
        if (this.currentClass != null && type.equals(this.currentClass)) {
            if (getSuperClass(type2) == null) {
                return false;
            }
            if (this.isInterface) {
                return type2.getSort() == 10 || type2.getSort() == 9;
            }
            return isAssignableFrom(type, getSuperClass(type2));
        }
        if (this.currentClass == null || !type2.equals(this.currentClass)) {
            Class cls = getClass(type);
            if (cls.isInterface()) {
                cls = class$java$lang$Object;
            }
            return cls.isAssignableFrom(getClass(type2));
        }
        if (isAssignableFrom(type, this.currentSuperClass)) {
            return true;
        }
        if (this.currentClassInterfaces != null) {
            for (int i = 0; i < this.currentClassInterfaces.size(); i++) {
                if (isAssignableFrom(type, (Type) this.currentClassInterfaces.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    protected boolean isInterface(Type type) {
        return (this.currentClass == null || !type.equals(this.currentClass)) ? getClass(type).isInterface() : this.isInterface;
    }

    @Override
    protected boolean isSubTypeOf(BasicValue basicValue, BasicValue basicValue2) {
        Type type = basicValue2.getType();
        Type type2 = basicValue.getType();
        switch (type.getSort()) {
            case 5:
            case 6:
            case 7:
            case 8:
                return type2.equals(type);
            case 9:
            case 10:
                if ("Lnull;".equals(type2.getDescriptor())) {
                    return true;
                }
                if (type2.getSort() == 10 || type2.getSort() == 9) {
                    return isAssignableFrom(type, type2);
                }
                return false;
            default:
                throw new Error("Internal error");
        }
    }

    @Override
    public BasicValue merge(BasicValue basicValue, BasicValue basicValue2) {
        if (basicValue.equals(basicValue2)) {
            return basicValue;
        }
        Type type = basicValue.getType();
        Type type2 = basicValue2.getType();
        if (type == null || !((type.getSort() == 10 || type.getSort() == 9) && type2 != null && (type2.getSort() == 10 || type2.getSort() == 9))) {
            return BasicValue.UNINITIALIZED_VALUE;
        }
        if ("Lnull;".equals(type.getDescriptor())) {
            return basicValue2;
        }
        if ("Lnull;".equals(type2.getDescriptor()) || isAssignableFrom(type, type2)) {
            return basicValue;
        }
        if (isAssignableFrom(type2, type)) {
            return basicValue2;
        }
        while (type != null && !isInterface(type)) {
            type = getSuperClass(type);
            if (isAssignableFrom(type, type2)) {
                return newValue(type);
            }
        }
        return BasicValue.REFERENCE_VALUE;
    }

    @Override
    public Value merge(Value value, Value value2) {
        return merge((BasicValue) value, (BasicValue) value2);
    }

    @Override
    public BasicValue newValue(Type type) {
        if (type == null) {
            return BasicValue.UNINITIALIZED_VALUE;
        }
        boolean z = type.getSort() == 9;
        if (z) {
            switch (type.getElementType().getSort()) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return new BasicValue(type);
            }
        }
        BasicValue basicValueNewValue = super.newValue(type);
        if (!BasicValue.REFERENCE_VALUE.equals(basicValueNewValue)) {
            return basicValueNewValue;
        }
        if (!z) {
            return new BasicValue(type);
        }
        String descriptor = newValue(type.getElementType()).getType().getDescriptor();
        for (int i = 0; i < type.getDimensions(); i++) {
            descriptor = new StringBuffer().append('[').append(descriptor).toString();
        }
        return new BasicValue(Type.getType(descriptor));
    }

    @Override
    public Value newValue(Type type) {
        return newValue(type);
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.loader = classLoader;
    }
}
