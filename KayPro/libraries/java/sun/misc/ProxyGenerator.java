package sun.misc;

import com.sun.tools.javac.jvm.ClassFile;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class ProxyGenerator {
    static final boolean $assertionsDisabled = false;
    private static final int ACC_FINAL = 16;
    private static final int ACC_PRIVATE = 2;
    private static final int ACC_PUBLIC = 1;
    private static final int ACC_STATIC = 8;
    private static final int ACC_SUPER = 32;
    private static final int CLASSFILE_MAJOR_VERSION = 49;
    private static final int CLASSFILE_MINOR_VERSION = 0;
    private static final int CONSTANT_CLASS = 7;
    private static final int CONSTANT_DOUBLE = 6;
    private static final int CONSTANT_FIELD = 9;
    private static final int CONSTANT_FLOAT = 4;
    private static final int CONSTANT_INTEGER = 3;
    private static final int CONSTANT_INTERFACEMETHOD = 11;
    private static final int CONSTANT_LONG = 5;
    private static final int CONSTANT_METHOD = 10;
    private static final int CONSTANT_NAMEANDTYPE = 12;
    private static final int CONSTANT_STRING = 8;
    private static final int CONSTANT_UNICODE = 2;
    private static final int CONSTANT_UTF8 = 1;
    private static Method equalsMethod = null;
    private static final String handlerFieldName = "h";
    private static Method hashCodeMethod = null;
    private static final int opc_aastore = 83;
    private static final int opc_aconst_null = 1;
    private static final int opc_aload = 25;
    private static final int opc_aload_0 = 42;
    private static final int opc_anewarray = 189;
    private static final int opc_areturn = 176;
    private static final int opc_astore = 58;
    private static final int opc_astore_0 = 75;
    private static final int opc_athrow = 191;
    private static final int opc_bipush = 16;
    private static final int opc_checkcast = 192;
    private static final int opc_dload = 24;
    private static final int opc_dload_0 = 38;
    private static final int opc_dreturn = 175;
    private static final int opc_dup = 89;
    private static final int opc_fload = 23;
    private static final int opc_fload_0 = 34;
    private static final int opc_freturn = 174;
    private static final int opc_getfield = 180;
    private static final int opc_getstatic = 178;
    private static final int opc_iconst_0 = 3;
    private static final int opc_iload = 21;
    private static final int opc_iload_0 = 26;
    private static final int opc_invokeinterface = 185;
    private static final int opc_invokespecial = 183;
    private static final int opc_invokestatic = 184;
    private static final int opc_invokevirtual = 182;
    private static final int opc_ireturn = 172;
    private static final int opc_ldc = 18;
    private static final int opc_ldc_w = 19;
    private static final int opc_lload = 22;
    private static final int opc_lload_0 = 30;
    private static final int opc_lreturn = 173;
    private static final int opc_new = 187;
    private static final int opc_pop = 87;
    private static final int opc_putstatic = 179;
    private static final int opc_return = 177;
    private static final int opc_sipush = 17;
    private static final int opc_wide = 196;
    private static final boolean saveGeneratedFiles = false;
    private static final String superclassName = "java/lang/reflect/Proxy";
    private static Method toStringMethod;
    private String className;
    private Class[] interfaces;

    private ConstantPool f595cp = new ConstantPool();
    private List<FieldInfo> fields = new ArrayList();
    private List<MethodInfo> methods = new ArrayList();
    private Map<String, List<ProxyMethod>> proxyMethods = new HashMap();
    private int proxyMethodCount = 0;

    static {
        try {
            hashCodeMethod = Object.class.getMethod("hashCode", new Class[0]);
            equalsMethod = Object.class.getMethod("equals", Object.class);
            toStringMethod = Object.class.getMethod("toString", new Class[0]);
        } catch (NoSuchMethodException e) {
            throw new NoSuchMethodError(e.getMessage());
        }
    }

    static int access$408(ProxyGenerator x0) {
        int i = x0.proxyMethodCount;
        x0.proxyMethodCount = i + 1;
        return i;
    }

    public static byte[] generateProxyClass(String name, Class[] interfaces) {
        ProxyGenerator gen = new ProxyGenerator(name, interfaces);
        byte[] classFile = gen.generateClassFile();
        return classFile;
    }

    private ProxyGenerator(String className, Class[] interfaces) {
        this.className = className;
        this.interfaces = interfaces;
    }

    private byte[] generateClassFile() {
        addProxyMethod(hashCodeMethod, Object.class);
        addProxyMethod(equalsMethod, Object.class);
        addProxyMethod(toStringMethod, Object.class);
        int i = 0;
        while (true) {
            Class[] clsArr = this.interfaces;
            if (i >= clsArr.length) {
                break;
            }
            Method[] methods = clsArr[i].getMethods();
            for (Method method : methods) {
                addProxyMethod(method, this.interfaces[i]);
            }
            i++;
        }
        for (List<ProxyMethod> sigmethods : this.proxyMethods.values()) {
            checkReturnTypes(sigmethods);
        }
        try {
            this.methods.add(generateConstructor());
            for (List<ProxyMethod> sigmethods2 : this.proxyMethods.values()) {
                for (ProxyMethod pm : sigmethods2) {
                    this.fields.add(new FieldInfo(pm.methodFieldName, "Ljava/lang/reflect/Method;", 10));
                    this.methods.add(pm.generateMethod());
                }
            }
            this.methods.add(generateStaticInitializer());
            if (this.methods.size() > 65535) {
                throw new IllegalArgumentException("method limit exceeded");
            }
            if (this.fields.size() > 65535) {
                throw new IllegalArgumentException("field limit exceeded");
            }
            this.f595cp.getClass(dotToSlash(this.className));
            this.f595cp.getClass(superclassName);
            int i2 = 0;
            while (true) {
                Class[] clsArr2 = this.interfaces;
                if (i2 >= clsArr2.length) {
                    break;
                }
                this.f595cp.getClass(dotToSlash(clsArr2[i2].getName()));
                i2++;
            }
            this.f595cp.setReadOnly();
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            DataOutputStream dout = new DataOutputStream(bout);
            try {
                dout.writeInt(ClassFile.JAVA_MAGIC);
                dout.writeShort(0);
                dout.writeShort(49);
                this.f595cp.write(dout);
                dout.writeShort(49);
                dout.writeShort(this.f595cp.getClass(dotToSlash(this.className)));
                dout.writeShort(this.f595cp.getClass(superclassName));
                dout.writeShort(this.interfaces.length);
                for (int i3 = 0; i3 < this.interfaces.length; i3++) {
                    dout.writeShort(this.f595cp.getClass(dotToSlash(this.interfaces[i3].getName())));
                }
                dout.writeShort(this.fields.size());
                for (FieldInfo f : this.fields) {
                    f.write(dout);
                }
                dout.writeShort(this.methods.size());
                for (MethodInfo m : this.methods) {
                    m.write(dout);
                }
                dout.writeShort(0);
                return bout.toByteArray();
            } catch (IOException e) {
                throw new InternalError("unexpected I/O Exception");
            }
        } catch (IOException e2) {
            throw new InternalError("unexpected I/O Exception");
        }
    }

    private void addProxyMethod(Method m, Class fromClass) {
        List<ProxyMethod> sigmethods;
        String name = m.getName();
        Class<?>[] parameterTypes = m.getParameterTypes();
        Class<?> returnType = m.getReturnType();
        Class<?>[] exceptionTypes = m.getExceptionTypes();
        String sig = name + getParameterDescriptors(parameterTypes);
        List<ProxyMethod> sigmethods2 = this.proxyMethods.get(sig);
        if (sigmethods2 != null) {
            for (ProxyMethod pm : sigmethods2) {
                if (returnType == pm.returnType) {
                    List<Class> legalExceptions = new ArrayList<>();
                    collectCompatibleTypes(exceptionTypes, pm.exceptionTypes, legalExceptions);
                    collectCompatibleTypes(pm.exceptionTypes, exceptionTypes, legalExceptions);
                    pm.exceptionTypes = new Class[legalExceptions.size()];
                    pm.exceptionTypes = (Class[]) legalExceptions.toArray(pm.exceptionTypes);
                    return;
                }
            }
            sigmethods = sigmethods2;
        } else {
            List<ProxyMethod> sigmethods3 = new ArrayList<>(3);
            this.proxyMethods.put(sig, sigmethods3);
            sigmethods = sigmethods3;
        }
        sigmethods.add(new ProxyMethod(name, parameterTypes, returnType, exceptionTypes, fromClass));
    }

    private static void checkReturnTypes(List<ProxyMethod> methods) {
        if (methods.size() < 2) {
            return;
        }
        LinkedList<Class> uncoveredReturnTypes = new LinkedList<>();
        for (ProxyMethod pm : methods) {
            Class<?> cls = pm.returnType;
            if (cls.isPrimitive()) {
                throw new IllegalArgumentException("methods with same signature " + getFriendlyMethodSignature(pm.methodName, pm.parameterTypes) + " but incompatible return types: " + cls.getName() + " and others");
            }
            boolean added = false;
            ListIterator<Class> liter = uncoveredReturnTypes.listIterator();
            while (true) {
                if (liter.hasNext()) {
                    Class next = liter.next();
                    if (cls.isAssignableFrom(next)) {
                        break;
                    }
                    if (next.isAssignableFrom(cls)) {
                        if (!added) {
                            liter.set(cls);
                            added = true;
                        } else {
                            liter.remove();
                        }
                    }
                } else {
                    if (!added) {
                        uncoveredReturnTypes.add(cls);
                        break;
                    }
                    break;
                }
            }
        }
        if (uncoveredReturnTypes.size() > 1) {
            ProxyMethod pm2 = methods.get(0);
            throw new IllegalArgumentException("methods with same signature " + getFriendlyMethodSignature(pm2.methodName, pm2.parameterTypes) + " but incompatible return types: " + uncoveredReturnTypes);
        }
    }

    private class FieldInfo {
        public int accessFlags;
        public String descriptor;
        public String name;

        public FieldInfo(String name, String descriptor, int accessFlags) {
            this.name = name;
            this.descriptor = descriptor;
            this.accessFlags = accessFlags;
            ProxyGenerator.this.f595cp.getUtf8(name);
            ProxyGenerator.this.f595cp.getUtf8(descriptor);
        }

        public void write(DataOutputStream out) throws IOException {
            out.writeShort(this.accessFlags);
            out.writeShort(ProxyGenerator.this.f595cp.getUtf8(this.name));
            out.writeShort(ProxyGenerator.this.f595cp.getUtf8(this.descriptor));
            out.writeShort(0);
        }
    }

    private static class ExceptionTableEntry {
        public short catchType;
        public short endPc;
        public short handlerPc;
        public short startPc;

        public ExceptionTableEntry(short startPc, short endPc, short handlerPc, short catchType) {
            this.startPc = startPc;
            this.endPc = endPc;
            this.handlerPc = handlerPc;
            this.catchType = catchType;
        }
    }

    private class MethodInfo {
        public int accessFlags;
        public short[] declaredExceptions;
        public String descriptor;
        public short maxLocals;
        public short maxStack;
        public String name;
        public ByteArrayOutputStream code = new ByteArrayOutputStream();
        public List<ExceptionTableEntry> exceptionTable = new ArrayList();

        public MethodInfo(String name, String descriptor, int accessFlags) {
            this.name = name;
            this.descriptor = descriptor;
            this.accessFlags = accessFlags;
            ProxyGenerator.this.f595cp.getUtf8(name);
            ProxyGenerator.this.f595cp.getUtf8(descriptor);
            ProxyGenerator.this.f595cp.getUtf8("Code");
            ProxyGenerator.this.f595cp.getUtf8("Exceptions");
        }

        public void write(DataOutputStream out) throws IOException {
            out.writeShort(this.accessFlags);
            out.writeShort(ProxyGenerator.this.f595cp.getUtf8(this.name));
            out.writeShort(ProxyGenerator.this.f595cp.getUtf8(this.descriptor));
            out.writeShort(2);
            out.writeShort(ProxyGenerator.this.f595cp.getUtf8("Code"));
            out.writeInt(this.code.size() + 12 + (this.exceptionTable.size() * 8));
            out.writeShort(this.maxStack);
            out.writeShort(this.maxLocals);
            out.writeInt(this.code.size());
            this.code.writeTo(out);
            out.writeShort(this.exceptionTable.size());
            for (ExceptionTableEntry e : this.exceptionTable) {
                out.writeShort(e.startPc);
                out.writeShort(e.endPc);
                out.writeShort(e.handlerPc);
                out.writeShort(e.catchType);
            }
            out.writeShort(0);
            out.writeShort(ProxyGenerator.this.f595cp.getUtf8("Exceptions"));
            out.writeInt((this.declaredExceptions.length * 2) + 2);
            out.writeShort(this.declaredExceptions.length);
            int i = 0;
            while (true) {
                short[] sArr = this.declaredExceptions;
                if (i < sArr.length) {
                    out.writeShort(sArr[i]);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private class ProxyMethod {
        public Class[] exceptionTypes;
        public Class fromClass;
        public String methodFieldName;
        public String methodName;
        public Class[] parameterTypes;
        public Class returnType;

        private ProxyMethod(String methodName, Class[] parameterTypes, Class returnType, Class[] exceptionTypes, Class fromClass) {
            this.methodName = methodName;
            this.parameterTypes = parameterTypes;
            this.returnType = returnType;
            this.exceptionTypes = exceptionTypes;
            this.fromClass = fromClass;
            this.methodFieldName = "m" + ProxyGenerator.access$408(ProxyGenerator.this);
        }

        public MethodInfo generateMethod() throws IOException {
            String desc = ProxyGenerator.getMethodDescriptor(this.parameterTypes, this.returnType);
            MethodInfo minfo = ProxyGenerator.this.new MethodInfo(this.methodName, desc, 17);
            int[] parameterSlot = new int[this.parameterTypes.length];
            int nextSlot = 1;
            for (int i = 0; i < parameterSlot.length; i++) {
                parameterSlot[i] = nextSlot;
                nextSlot += ProxyGenerator.getWordsPerType(this.parameterTypes[i]);
            }
            int i2 = nextSlot;
            DataOutputStream out = new DataOutputStream(minfo.code);
            ProxyGenerator.this.code_aload(0, out);
            out.writeByte(180);
            out.writeShort(ProxyGenerator.this.f595cp.getFieldRef(ProxyGenerator.superclassName, ProxyGenerator.handlerFieldName, "Ljava/lang/reflect/InvocationHandler;"));
            ProxyGenerator.this.code_aload(0, out);
            out.writeByte(178);
            out.writeShort(ProxyGenerator.this.f595cp.getFieldRef(ProxyGenerator.dotToSlash(ProxyGenerator.this.className), this.methodFieldName, "Ljava/lang/reflect/Method;"));
            Class[] clsArr = this.parameterTypes;
            if (clsArr.length > 0) {
                ProxyGenerator.this.code_ipush(clsArr.length, out);
                out.writeByte(189);
                out.writeShort(ProxyGenerator.this.f595cp.getClass("java/lang/Object"));
                for (int i3 = 0; i3 < this.parameterTypes.length; i3++) {
                    out.writeByte(89);
                    ProxyGenerator.this.code_ipush(i3, out);
                    codeWrapArgument(this.parameterTypes[i3], parameterSlot[i3], out);
                    out.writeByte(83);
                }
            } else {
                out.writeByte(1);
            }
            out.writeByte(185);
            out.writeShort(ProxyGenerator.this.f595cp.getInterfaceMethodRef("java/lang/reflect/InvocationHandler", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;"));
            out.writeByte(4);
            out.writeByte(0);
            if (this.returnType != Void.TYPE) {
                codeUnwrapReturnValue(this.returnType, out);
            } else {
                out.writeByte(87);
                out.writeByte(177);
            }
            short tryEnd = (short) minfo.code.size();
            List<Class> catchList = ProxyGenerator.computeUniqueCatchList(this.exceptionTypes);
            if (catchList.size() > 0) {
                for (Class ex : catchList) {
                    minfo.exceptionTable.add(new ExceptionTableEntry((short) 0, tryEnd, tryEnd, ProxyGenerator.this.f595cp.getClass(ProxyGenerator.dotToSlash(ex.getName()))));
                    desc = desc;
                }
                out.writeByte(191);
                short pc = (short) minfo.code.size();
                minfo.exceptionTable.add(new ExceptionTableEntry((short) 0, tryEnd, pc, ProxyGenerator.this.f595cp.getClass("java/lang/Throwable")));
                ProxyGenerator.this.code_astore(i2, out);
                out.writeByte(187);
                out.writeShort(ProxyGenerator.this.f595cp.getClass("java/lang/reflect/UndeclaredThrowableException"));
                out.writeByte(89);
                ProxyGenerator.this.code_aload(i2, out);
                out.writeByte(183);
                out.writeShort(ProxyGenerator.this.f595cp.getMethodRef("java/lang/reflect/UndeclaredThrowableException", "<init>", "(Ljava/lang/Throwable;)V"));
                out.writeByte(191);
            }
            if (minfo.code.size() > 65535) {
                throw new IllegalArgumentException("code size limit exceeded");
            }
            minfo.maxStack = (short) 10;
            minfo.maxLocals = (short) (i2 + 1);
            minfo.declaredExceptions = new short[this.exceptionTypes.length];
            for (int i4 = 0; i4 < this.exceptionTypes.length; i4++) {
                minfo.declaredExceptions[i4] = ProxyGenerator.this.f595cp.getClass(ProxyGenerator.dotToSlash(this.exceptionTypes[i4].getName()));
            }
            return minfo;
        }

        private void codeWrapArgument(Class type, int slot, DataOutputStream out) throws IOException {
            if (!type.isPrimitive()) {
                ProxyGenerator.this.code_aload(slot, out);
                return;
            }
            PrimitiveTypeInfo prim = PrimitiveTypeInfo.m541get(type);
            if (type == Integer.TYPE || type == Boolean.TYPE || type == Byte.TYPE || type == Character.TYPE || type == Short.TYPE) {
                ProxyGenerator.this.code_iload(slot, out);
            } else if (type == Long.TYPE) {
                ProxyGenerator.this.code_lload(slot, out);
            } else if (type == Float.TYPE) {
                ProxyGenerator.this.code_fload(slot, out);
            } else if (type == Double.TYPE) {
                ProxyGenerator.this.code_dload(slot, out);
            } else {
                throw new AssertionError();
            }
            out.writeByte(184);
            out.writeShort(ProxyGenerator.this.f595cp.getMethodRef(prim.wrapperClassName, "valueOf", prim.wrapperValueOfDesc));
        }

        private void codeUnwrapReturnValue(Class type, DataOutputStream out) throws IOException {
            if (type.isPrimitive()) {
                PrimitiveTypeInfo prim = PrimitiveTypeInfo.m541get(type);
                out.writeByte(192);
                out.writeShort(ProxyGenerator.this.f595cp.getClass(prim.wrapperClassName));
                out.writeByte(182);
                out.writeShort(ProxyGenerator.this.f595cp.getMethodRef(prim.wrapperClassName, prim.unwrapMethodName, prim.unwrapMethodDesc));
                if (type == Integer.TYPE || type == Boolean.TYPE || type == Byte.TYPE || type == Character.TYPE || type == Short.TYPE) {
                    out.writeByte(172);
                    return;
                }
                if (type == Long.TYPE) {
                    out.writeByte(173);
                    return;
                } else if (type == Float.TYPE) {
                    out.writeByte(174);
                    return;
                } else {
                    if (type == Double.TYPE) {
                        out.writeByte(175);
                        return;
                    }
                    throw new AssertionError();
                }
            }
            out.writeByte(192);
            out.writeShort(ProxyGenerator.this.f595cp.getClass(ProxyGenerator.dotToSlash(type.getName())));
            out.writeByte(176);
        }

        public void codeFieldInitialization(DataOutputStream out) throws IOException {
            ProxyGenerator.this.codeClassForName(this.fromClass, out);
            ProxyGenerator proxyGenerator = ProxyGenerator.this;
            proxyGenerator.code_ldc(proxyGenerator.f595cp.getString(this.methodName), out);
            ProxyGenerator.this.code_ipush(this.parameterTypes.length, out);
            out.writeByte(189);
            out.writeShort(ProxyGenerator.this.f595cp.getClass("java/lang/Class"));
            for (int i = 0; i < this.parameterTypes.length; i++) {
                out.writeByte(89);
                ProxyGenerator.this.code_ipush(i, out);
                if (!this.parameterTypes[i].isPrimitive()) {
                    ProxyGenerator.this.codeClassForName(this.parameterTypes[i], out);
                } else {
                    PrimitiveTypeInfo prim = PrimitiveTypeInfo.m541get(this.parameterTypes[i]);
                    out.writeByte(178);
                    out.writeShort(ProxyGenerator.this.f595cp.getFieldRef(prim.wrapperClassName, "TYPE", "Ljava/lang/Class;"));
                }
                out.writeByte(83);
            }
            out.writeByte(182);
            out.writeShort(ProxyGenerator.this.f595cp.getMethodRef("java/lang/Class", "getMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;"));
            out.writeByte(179);
            out.writeShort(ProxyGenerator.this.f595cp.getFieldRef(ProxyGenerator.dotToSlash(ProxyGenerator.this.className), this.methodFieldName, "Ljava/lang/reflect/Method;"));
        }
    }

    private MethodInfo generateConstructor() throws IOException {
        MethodInfo minfo = new MethodInfo("<init>", "(Ljava/lang/reflect/InvocationHandler;)V", 1);
        DataOutputStream out = new DataOutputStream(minfo.code);
        code_aload(0, out);
        code_aload(1, out);
        out.writeByte(183);
        out.writeShort(this.f595cp.getMethodRef(superclassName, "<init>", "(Ljava/lang/reflect/InvocationHandler;)V"));
        out.writeByte(177);
        minfo.maxStack = (short) 10;
        minfo.maxLocals = (short) 2;
        minfo.declaredExceptions = new short[0];
        return minfo;
    }

    private MethodInfo generateStaticInitializer() throws IOException {
        MethodInfo minfo = new MethodInfo("<clinit>", "()V", 8);
        DataOutputStream out = new DataOutputStream(minfo.code);
        for (List<ProxyMethod> sigmethods : this.proxyMethods.values()) {
            for (ProxyMethod pm : sigmethods) {
                pm.codeFieldInitialization(out);
            }
        }
        out.writeByte(177);
        short tryEnd = (short) minfo.code.size();
        minfo.exceptionTable.add(new ExceptionTableEntry((short) 0, tryEnd, tryEnd, this.f595cp.getClass("java/lang/NoSuchMethodException")));
        code_astore(1, out);
        out.writeByte(187);
        out.writeShort(this.f595cp.getClass("java/lang/NoSuchMethodError"));
        out.writeByte(89);
        code_aload(1, out);
        out.writeByte(182);
        out.writeShort(this.f595cp.getMethodRef("java/lang/Throwable", "getMessage", "()Ljava/lang/String;"));
        out.writeByte(183);
        out.writeShort(this.f595cp.getMethodRef("java/lang/NoSuchMethodError", "<init>", "(Ljava/lang/String;)V"));
        out.writeByte(191);
        short pc = (short) minfo.code.size();
        minfo.exceptionTable.add(new ExceptionTableEntry((short) 0, tryEnd, pc, this.f595cp.getClass("java/lang/ClassNotFoundException")));
        code_astore(1, out);
        out.writeByte(187);
        out.writeShort(this.f595cp.getClass("java/lang/NoClassDefFoundError"));
        out.writeByte(89);
        code_aload(1, out);
        out.writeByte(182);
        out.writeShort(this.f595cp.getMethodRef("java/lang/Throwable", "getMessage", "()Ljava/lang/String;"));
        out.writeByte(183);
        out.writeShort(this.f595cp.getMethodRef("java/lang/NoClassDefFoundError", "<init>", "(Ljava/lang/String;)V"));
        out.writeByte(191);
        if (minfo.code.size() > 65535) {
            throw new IllegalArgumentException("code size limit exceeded");
        }
        minfo.maxStack = (short) 10;
        minfo.maxLocals = (short) (1 + 1);
        minfo.declaredExceptions = new short[0];
        return minfo;
    }

    public void code_iload(int lvar, DataOutputStream out) throws IOException {
        codeLocalLoadStore(lvar, 21, 26, out);
    }

    public void code_lload(int lvar, DataOutputStream out) throws IOException {
        codeLocalLoadStore(lvar, 22, 30, out);
    }

    public void code_fload(int lvar, DataOutputStream out) throws IOException {
        codeLocalLoadStore(lvar, 23, 34, out);
    }

    public void code_dload(int lvar, DataOutputStream out) throws IOException {
        codeLocalLoadStore(lvar, 24, 38, out);
    }

    public void code_aload(int lvar, DataOutputStream out) throws IOException {
        codeLocalLoadStore(lvar, 25, 42, out);
    }

    public void code_astore(int lvar, DataOutputStream out) throws IOException {
        codeLocalLoadStore(lvar, 58, 75, out);
    }

    private void codeLocalLoadStore(int lvar, int opcode, int opcode_0, DataOutputStream out) throws IOException {
        if (lvar <= 3) {
            out.writeByte(opcode_0 + lvar);
            return;
        }
        if (lvar <= 255) {
            out.writeByte(opcode);
            out.writeByte(lvar & 255);
        } else {
            out.writeByte(196);
            out.writeByte(opcode);
            out.writeShort(65535 & lvar);
        }
    }

    public void code_ldc(int index, DataOutputStream out) throws IOException {
        if (index <= 255) {
            out.writeByte(18);
            out.writeByte(index & 255);
        } else {
            out.writeByte(19);
            out.writeShort(65535 & index);
        }
    }

    public void code_ipush(int value, DataOutputStream out) throws IOException {
        if (value >= -1 && value <= 5) {
            out.writeByte(value + 3);
            return;
        }
        if (value >= -128 && value <= 127) {
            out.writeByte(16);
            out.writeByte(value & 255);
        } else {
            if (value >= -32768 && value <= 32767) {
                out.writeByte(17);
                out.writeShort(65535 & value);
                return;
            }
            throw new AssertionError();
        }
    }

    public void codeClassForName(Class cl, DataOutputStream out) throws IOException {
        code_ldc(this.f595cp.getString(cl.getName()), out);
        out.writeByte(184);
        out.writeShort(this.f595cp.getMethodRef("java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;"));
    }

    public static String dotToSlash(String name) {
        return name.replace('.', '/');
    }

    public static String getMethodDescriptor(Class[] parameterTypes, Class returnType) {
        StringBuilder sb = new StringBuilder();
        sb.append(getParameterDescriptors(parameterTypes));
        sb.append(returnType == Void.TYPE ? "V" : getFieldType(returnType));
        return sb.toString();
    }

    private static String getParameterDescriptors(Class[] parameterTypes) {
        StringBuilder desc = new StringBuilder("(");
        for (Class cls : parameterTypes) {
            desc.append(getFieldType(cls));
        }
        desc.append(')');
        return desc.toString();
    }

    private static String getFieldType(Class type) {
        if (type.isPrimitive()) {
            return PrimitiveTypeInfo.m541get(type).baseTypeString;
        }
        if (type.isArray()) {
            return type.getName().replace('.', '/');
        }
        return "L" + dotToSlash(type.getName()) + ";";
    }

    private static String getFriendlyMethodSignature(String name, Class[] parameterTypes) {
        StringBuilder sig = new StringBuilder(name);
        sig.append('(');
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sig.append(',');
            }
            Class parameterType = parameterTypes[i];
            int dimensions = 0;
            while (parameterType.isArray()) {
                parameterType = parameterType.getComponentType();
                dimensions++;
            }
            sig.append(parameterType.getName());
            while (true) {
                int dimensions2 = dimensions - 1;
                if (dimensions > 0) {
                    sig.append("[]");
                    dimensions = dimensions2;
                }
            }
        }
        sig.append(')');
        return sig.toString();
    }

    public static int getWordsPerType(Class type) {
        if (type == Long.TYPE || type == Double.TYPE) {
            return 2;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void collectCompatibleTypes(Class[] from, Class[] clsArr, List<Class> list) {
        for (int i = 0; i < from.length; i++) {
            if (!list.contains(from[i])) {
                for (Class cls : clsArr) {
                    if (cls.isAssignableFrom(from[i])) {
                        list.add(from[i]);
                        break;
                    }
                }
            }
        }
    }

    public static List<Class> computeUniqueCatchList(Class[] exceptions) {
        List<Class> uniqueList = new ArrayList<>();
        uniqueList.add(Error.class);
        uniqueList.add(RuntimeException.class);
        for (Class ex : exceptions) {
            if (ex.isAssignableFrom(Throwable.class)) {
                uniqueList.clear();
                break;
            }
            if (Throwable.class.isAssignableFrom(ex)) {
                int j = 0;
                while (true) {
                    if (j < uniqueList.size()) {
                        Class cls = uniqueList.get(j);
                        if (cls.isAssignableFrom(ex)) {
                            break;
                        }
                        if (ex.isAssignableFrom(cls)) {
                            uniqueList.remove(j);
                        } else {
                            j++;
                        }
                    } else {
                        uniqueList.add(ex);
                        break;
                    }
                }
            }
        }
        return uniqueList;
    }

    private static class PrimitiveTypeInfo {
        static final boolean $assertionsDisabled = false;
        private static Map<Class, PrimitiveTypeInfo> table = new HashMap();
        public String baseTypeString;
        public String unwrapMethodDesc;
        public String unwrapMethodName;
        public String wrapperClassName;
        public String wrapperValueOfDesc;

        static {
            m540add(Byte.TYPE, Byte.class);
            m540add(Character.TYPE, Character.class);
            m540add(Double.TYPE, Double.class);
            m540add(Float.TYPE, Float.class);
            m540add(Integer.TYPE, Integer.class);
            m540add(Long.TYPE, Long.class);
            m540add(Short.TYPE, Short.class);
            m540add(Boolean.TYPE, Boolean.class);
        }

        private static void m540add(Class primitiveClass, Class wrapperClass) {
            table.put(primitiveClass, new PrimitiveTypeInfo(primitiveClass, wrapperClass));
        }

        private PrimitiveTypeInfo(Class primitiveClass, Class wrapperClass) {
            this.baseTypeString = Array.newInstance((Class<?>) primitiveClass, 0).getClass().getName().substring(1);
            this.wrapperClassName = ProxyGenerator.dotToSlash(wrapperClass.getName());
            this.wrapperValueOfDesc = "(" + this.baseTypeString + ")L" + this.wrapperClassName + ";";
            StringBuilder sb = new StringBuilder();
            sb.append(primitiveClass.getName());
            sb.append("Value");
            this.unwrapMethodName = sb.toString();
            this.unwrapMethodDesc = "()" + this.baseTypeString;
        }

        public static PrimitiveTypeInfo m541get(Class cl) {
            return table.get(cl);
        }
    }

    private static class ConstantPool {

        private Map<Object, Short> f596map;
        private List<Entry> pool;
        private boolean readOnly;

        private ConstantPool() {
            this.pool = new ArrayList(32);
            this.f596map = new HashMap(16);
            this.readOnly = false;
        }

        public short getUtf8(String s) {
            if (s == null) {
                throw null;
            }
            return getValue(s);
        }

        public short getInteger(int i) {
            return getValue(new Integer(i));
        }

        public short getFloat(float f) {
            return getValue(new Float(f));
        }

        public short getClass(String name) {
            short utf8Index = getUtf8(name);
            return getIndirect(new IndirectEntry(7, utf8Index));
        }

        public short getString(String s) {
            short utf8Index = getUtf8(s);
            return getIndirect(new IndirectEntry(8, utf8Index));
        }

        public short getFieldRef(String className, String name, String descriptor) {
            short classIndex = getClass(className);
            short nameAndTypeIndex = getNameAndType(name, descriptor);
            return getIndirect(new IndirectEntry(9, classIndex, nameAndTypeIndex));
        }

        public short getMethodRef(String className, String name, String descriptor) {
            short classIndex = getClass(className);
            short nameAndTypeIndex = getNameAndType(name, descriptor);
            return getIndirect(new IndirectEntry(10, classIndex, nameAndTypeIndex));
        }

        public short getInterfaceMethodRef(String className, String name, String descriptor) {
            short classIndex = getClass(className);
            short nameAndTypeIndex = getNameAndType(name, descriptor);
            return getIndirect(new IndirectEntry(11, classIndex, nameAndTypeIndex));
        }

        public short getNameAndType(String name, String descriptor) {
            short nameIndex = getUtf8(name);
            short descriptorIndex = getUtf8(descriptor);
            return getIndirect(new IndirectEntry(12, nameIndex, descriptorIndex));
        }

        public void setReadOnly() {
            this.readOnly = true;
        }

        public void write(OutputStream out) throws IOException {
            DataOutputStream dataOut = new DataOutputStream(out);
            dataOut.writeShort(this.pool.size() + 1);
            for (Entry e : this.pool) {
                e.write(dataOut);
            }
        }

        private short addEntry(Entry entry) {
            this.pool.add(entry);
            if (this.pool.size() >= 65535) {
                throw new IllegalArgumentException("constant pool size limit exceeded");
            }
            return (short) this.pool.size();
        }

        private short getValue(Object key) {
            Short index = this.f596map.get(key);
            if (index != null) {
                return index.shortValue();
            }
            if (this.readOnly) {
                throw new InternalError("late constant pool addition: " + key);
            }
            short i = addEntry(new ValueEntry(key));
            this.f596map.put(key, new Short(i));
            return i;
        }

        private short getIndirect(IndirectEntry e) {
            Short index = this.f596map.get(e);
            if (index != null) {
                return index.shortValue();
            }
            if (this.readOnly) {
                throw new InternalError("late constant pool addition");
            }
            short i = addEntry(e);
            this.f596map.put(e, new Short(i));
            return i;
        }

        private static abstract class Entry {
            public abstract void write(DataOutputStream dataOutputStream) throws IOException;

            private Entry() {
            }
        }

        private static class ValueEntry extends Entry {
            private Object value;

            public ValueEntry(Object value) {
                super();
                this.value = value;
            }

            @Override
            public void write(DataOutputStream out) throws IOException {
                Object obj = this.value;
                if (obj instanceof String) {
                    out.writeByte(1);
                    out.writeUTF((String) this.value);
                    return;
                }
                if (obj instanceof Integer) {
                    out.writeByte(3);
                    out.writeInt(((Integer) this.value).intValue());
                    return;
                }
                if (obj instanceof Float) {
                    out.writeByte(4);
                    out.writeFloat(((Float) this.value).floatValue());
                    return;
                }
                if (obj instanceof Long) {
                    out.writeByte(5);
                    out.writeLong(((Long) this.value).longValue());
                } else if (obj instanceof Double) {
                    out.writeDouble(6.0d);
                    out.writeDouble(((Double) this.value).doubleValue());
                } else {
                    throw new InternalError("bogus value entry: " + this.value);
                }
            }
        }

        private static class IndirectEntry extends Entry {
            private short index0;
            private short index1;

            private int f597tag;

            public IndirectEntry(int tag, short index) {
                super();
                this.f597tag = tag;
                this.index0 = index;
                this.index1 = (short) 0;
            }

            public IndirectEntry(int tag, short index0, short index1) {
                super();
                this.f597tag = tag;
                this.index0 = index0;
                this.index1 = index1;
            }

            @Override
            public void write(DataOutputStream out) throws IOException {
                out.writeByte(this.f597tag);
                out.writeShort(this.index0);
                int i = this.f597tag;
                if (i == 9 || i == 10 || i == 11 || i == 12) {
                    out.writeShort(this.index1);
                }
            }

            public int hashCode() {
                return this.f597tag + this.index0 + this.index1;
            }

            public boolean equals(Object obj) {
                if (obj instanceof IndirectEntry) {
                    IndirectEntry other = (IndirectEntry) obj;
                    if (this.f597tag == other.f597tag && this.index0 == other.index0 && this.index1 == other.index1) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        }
    }
}
