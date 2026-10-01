package sun.reflect;

import java.security.AccessController;
import java.security.PrivilegedAction;

class MethodAccessorGenerator extends AccessorGenerator {
    private static final short NUM_BASE_CPOOL_ENTRIES = 12;
    private static final short NUM_METHODS = 2;
    private static final short NUM_SERIALIZATION_CPOOL_ENTRIES = 2;
    private Class declaringClass;
    private boolean forSerialization;
    private short invokeDescriptorIdx;
    private short invokeIdx;
    private boolean isConstructor;
    private short nonPrimitiveParametersBaseIdx;
    private Class[] parameterTypes;
    private Class returnType;
    private short targetMethodRef;
    private static volatile int methodSymnum = 0;
    private static volatile int constructorSymnum = 0;
    private static volatile int serializationConstructorSymnum = 0;

    MethodAccessorGenerator() {
    }

    public MethodAccessor generateMethod(Class declaringClass, String name, Class[] parameterTypes, Class returnType, Class[] checkedExceptions, int modifiers) {
        return (MethodAccessor) generate(declaringClass, name, parameterTypes, returnType, checkedExceptions, modifiers, false, false, null);
    }

    public ConstructorAccessor generateConstructor(Class declaringClass, Class[] parameterTypes, Class[] checkedExceptions, int modifiers) {
        return (ConstructorAccessor) generate(declaringClass, "<init>", parameterTypes, Void.TYPE, checkedExceptions, modifiers, true, false, null);
    }

    public SerializationConstructorAccessorImpl generateSerializationConstructor(Class declaringClass, Class[] parameterTypes, Class[] checkedExceptions, int modifiers, Class targetConstructorClass) {
        return (SerializationConstructorAccessorImpl) generate(declaringClass, "<init>", parameterTypes, Void.TYPE, checkedExceptions, modifiers, true, true, targetConstructorClass);
    }

    private MagicAccessorImpl generate(final Class declaringClass, String name, Class[] parameterTypes, Class returnType, Class[] checkedExceptions, int modifiers, boolean isConstructor, boolean forSerialization, Class serializationTargetClass) {
        Class[] clsArr = parameterTypes;
        ByteVector vec = ByteVectorFactory.create();
        this.f631asm = new ClassFileAssembler(vec);
        this.declaringClass = declaringClass;
        this.parameterTypes = clsArr;
        this.returnType = returnType;
        this.modifiers = modifiers;
        this.isConstructor = isConstructor;
        this.forSerialization = forSerialization;
        this.f631asm.emitMagicAndVersion();
        short numCPEntries = 42;
        boolean usesPrimitives = usesPrimitiveTypes();
        if (usesPrimitives) {
            numCPEntries = (short) (42 + 72);
        }
        if (forSerialization) {
            numCPEntries = (short) (numCPEntries + 2);
        }
        short numCPEntries2 = (short) (((short) (numNonPrimitiveParameterTypes() * 2)) + numCPEntries);
        this.f631asm.emitShort(m546add(numCPEntries2, (short) 1));
        final String generatedName = generateName(isConstructor, forSerialization);
        this.f631asm.emitConstantPoolUTF8(generatedName);
        this.f631asm.emitConstantPoolClass(this.f631asm.m551cpi());
        this.thisClass = this.f631asm.m551cpi();
        if (isConstructor) {
            if (forSerialization) {
                this.f631asm.emitConstantPoolUTF8("sun/reflect/SerializationConstructorAccessorImpl");
            } else {
                this.f631asm.emitConstantPoolUTF8("sun/reflect/ConstructorAccessorImpl");
            }
        } else {
            this.f631asm.emitConstantPoolUTF8("sun/reflect/MethodAccessorImpl");
        }
        this.f631asm.emitConstantPoolClass(this.f631asm.m551cpi());
        this.superClass = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8(getClassName(declaringClass, false));
        this.f631asm.emitConstantPoolClass(this.f631asm.m551cpi());
        this.targetClass = this.f631asm.m551cpi();
        short serializationTargetClassIdx = 0;
        if (forSerialization) {
            this.f631asm.emitConstantPoolUTF8(getClassName(serializationTargetClass, false));
            this.f631asm.emitConstantPoolClass(this.f631asm.m551cpi());
            serializationTargetClassIdx = this.f631asm.m551cpi();
        }
        this.f631asm.emitConstantPoolUTF8(name);
        this.f631asm.emitConstantPoolUTF8(buildInternalSignature());
        this.f631asm.emitConstantPoolNameAndType(m547sub(this.f631asm.m551cpi(), (short) 1), this.f631asm.m551cpi());
        if (isInterface()) {
            this.f631asm.emitConstantPoolInterfaceMethodref(this.targetClass, this.f631asm.m551cpi());
        } else if (forSerialization) {
            this.f631asm.emitConstantPoolMethodref(serializationTargetClassIdx, this.f631asm.m551cpi());
        } else {
            this.f631asm.emitConstantPoolMethodref(this.targetClass, this.f631asm.m551cpi());
        }
        this.targetMethodRef = this.f631asm.m551cpi();
        if (isConstructor) {
            this.f631asm.emitConstantPoolUTF8("newInstance");
        } else {
            this.f631asm.emitConstantPoolUTF8("invoke");
        }
        this.invokeIdx = this.f631asm.m551cpi();
        if (isConstructor) {
            this.f631asm.emitConstantPoolUTF8("([Ljava/lang/Object;)Ljava/lang/Object;");
        } else {
            this.f631asm.emitConstantPoolUTF8("(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        }
        this.invokeDescriptorIdx = this.f631asm.m551cpi();
        this.nonPrimitiveParametersBaseIdx = m546add(this.f631asm.m551cpi(), (short) 2);
        int i = 0;
        while (i < clsArr.length) {
            Class c = clsArr[i];
            if (!isPrimitive(c)) {
                this.f631asm.emitConstantPoolUTF8(getClassName(c, false));
                this.f631asm.emitConstantPoolClass(this.f631asm.m551cpi());
            }
            i++;
            clsArr = parameterTypes;
        }
        emitCommonConstantPoolEntries();
        if (usesPrimitives) {
            emitBoxingContantPoolEntries();
        }
        if (this.f631asm.m551cpi() != numCPEntries2) {
            throw new InternalError("Adjust this code (cpi = " + ((int) this.f631asm.m551cpi()) + ", numCPEntries = " + ((int) numCPEntries2) + ")");
        }
        this.f631asm.emitShort((short) 1);
        this.f631asm.emitShort(this.thisClass);
        this.f631asm.emitShort(this.superClass);
        this.f631asm.emitShort((short) 0);
        this.f631asm.emitShort((short) 0);
        this.f631asm.emitShort((short) 2);
        emitConstructor();
        emitInvoke();
        this.f631asm.emitShort((short) 0);
        vec.trim();
        final byte[] bytes = vec.getData();
        return (MagicAccessorImpl) AccessController.doPrivileged(new PrivilegedAction() {
            @Override
            public Object run() {
                try {
                    return ClassDefiner.defineClass(generatedName, bytes, 0, bytes.length, declaringClass.getClassLoader()).newInstance();
                } catch (IllegalAccessException e) {
                    throw ((InternalError) new InternalError().initCause(e));
                } catch (InstantiationException e2) {
                    throw ((InternalError) new InternalError().initCause(e2));
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0082  */
    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00db  */
    /* JADX WARN: Code duplicated, block: B:41:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:48:0x0102  */
    /* JADX WARN: Code duplicated, block: B:50:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x010e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0115  */
    /* JADX WARN: Code duplicated, block: B:55:0x0119  */
    /* JADX WARN: Code duplicated, block: B:58:0x0130  */
    /* JADX WARN: Code duplicated, block: B:59:0x0134  */
    /* JADX WARN: Code duplicated, block: B:63:0x0154  */
    /* JADX WARN: Code duplicated, block: B:66:0x0171  */
    /* JADX WARN: Code duplicated, block: B:69:0x017f  */
    /* JADX WARN: Code duplicated, block: B:72:0x018a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0190  */
    /* JADX WARN: Code duplicated, block: B:75:0x0196  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:85:0x01df  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:93:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x014f A[SYNTHETIC] */
    private void emitInvoke() {
        short illegalArgStartPC;
        Label successLabel;
        int i;
        short paramTypeCPIdx;
        Label nextParamLabel;
        byte count;
        Class[] clsArr;
        Class paramType;
        Label l;
        Label nextParamLabel2;
        int j;
        Class c;
        if (this.parameterTypes.length > 65535) {
            throw new InternalError("Can't handle more than 65535 parameters");
        }
        ClassFileAssembler cb = new ClassFileAssembler();
        if (this.isConstructor) {
            cb.setMaxLocals(2);
        } else {
            cb.setMaxLocals(3);
        }
        if (this.isConstructor) {
            cb.opc_new(this.targetClass);
            cb.opc_dup();
        } else {
            if (isPrimitive(this.returnType)) {
                cb.opc_new(indexForPrimitiveType(this.returnType));
                cb.opc_dup();
            }
            if (!isStatic()) {
                cb.opc_aload_1();
                Label l2 = new Label();
                cb.opc_ifnonnull(l2);
                cb.opc_new(this.nullPointerClass);
                cb.opc_dup();
                cb.opc_invokespecial(this.nullPointerCtorIdx, 0, 0);
                cb.opc_athrow();
                l2.bind();
                short illegalArgStartPC2 = cb.getLength();
                cb.opc_aload_1();
                cb.opc_checkcast(this.targetClass);
                illegalArgStartPC = illegalArgStartPC2;
            }
            successLabel = new Label();
            if (this.parameterTypes.length == 0) {
                if (this.isConstructor) {
                    cb.opc_aload_1();
                } else {
                    cb.opc_aload_2();
                }
                cb.opc_ifnull(successLabel);
            }
            if (this.isConstructor) {
                cb.opc_aload_1();
            } else {
                cb.opc_aload_2();
            }
            cb.opc_arraylength();
            cb.opc_sipush((short) this.parameterTypes.length);
            cb.opc_if_icmpeq(successLabel);
            cb.opc_new(this.illegalArgumentClass);
            cb.opc_dup();
            cb.opc_invokespecial(this.illegalArgumentCtorIdx, 0, 0);
            cb.opc_athrow();
            successLabel.bind();
            short paramTypeCPIdx2 = this.nonPrimitiveParametersBaseIdx;
            i = 0;
            paramTypeCPIdx = paramTypeCPIdx2;
            nextParamLabel = null;
            count = 1;
            while (true) {
                clsArr = this.parameterTypes;
                if (i < clsArr.length) {
                    paramType = clsArr[i];
                    count = (byte) (((byte) typeSizeInStackSlots(paramType)) + count);
                    if (nextParamLabel != null) {
                        nextParamLabel.bind();
                        nextParamLabel = null;
                    }
                    if (this.isConstructor) {
                        cb.opc_aload_1();
                    } else {
                        cb.opc_aload_2();
                    }
                    cb.opc_sipush((short) i);
                    cb.opc_aaload();
                    if (isPrimitive(paramType)) {
                        if (this.isConstructor) {
                            cb.opc_astore_2();
                        } else {
                            cb.opc_astore_3();
                        }
                        l = null;
                        nextParamLabel2 = new Label();
                        for (j = 0; j < primitiveTypes.length; j++) {
                            c = primitiveTypes[j];
                            if (!canWidenTo(c, paramType)) {
                                if (l != null) {
                                    l.bind();
                                }
                                if (this.isConstructor) {
                                    cb.opc_aload_2();
                                } else {
                                    cb.opc_aload_3();
                                }
                                cb.opc_instanceof(indexForPrimitiveType(c));
                                l = new Label();
                                cb.opc_ifeq(l);
                                if (this.isConstructor) {
                                    cb.opc_aload_2();
                                } else {
                                    cb.opc_aload_3();
                                }
                                cb.opc_checkcast(indexForPrimitiveType(c));
                                cb.opc_invokevirtual(unboxingMethodForPrimitiveType(c), 0, typeSizeInStackSlots(c));
                                emitWideningBytecodeForPrimitiveConversion(cb, c, paramType);
                                cb.opc_goto(nextParamLabel2);
                            }
                        }
                        if (l != null) {
                            throw new InternalError("Must have found at least identity conversion");
                        }
                        l.bind();
                        cb.opc_new(this.illegalArgumentClass);
                        cb.opc_dup();
                        cb.opc_invokespecial(this.illegalArgumentCtorIdx, 0, 0);
                        cb.opc_athrow();
                        nextParamLabel = nextParamLabel2;
                    } else {
                        cb.opc_checkcast(paramTypeCPIdx);
                        paramTypeCPIdx = m546add(paramTypeCPIdx, (short) 2);
                    }
                    i++;
                } else {
                    if (nextParamLabel != null) {
                        nextParamLabel.bind();
                    }
                    short invokeStartPC = cb.getLength();
                    if (this.isConstructor) {
                        cb.opc_invokespecial(this.targetMethodRef, count, 0);
                    } else if (isStatic()) {
                        cb.opc_invokestatic(this.targetMethodRef, count, typeSizeInStackSlots(this.returnType));
                    } else if (isInterface()) {
                        cb.opc_invokeinterface(this.targetMethodRef, count, count, typeSizeInStackSlots(this.returnType));
                    } else {
                        cb.opc_invokevirtual(this.targetMethodRef, count, typeSizeInStackSlots(this.returnType));
                    }
                    short invokeEndPC = cb.getLength();
                    if (!this.isConstructor) {
                        if (isPrimitive(this.returnType)) {
                            cb.opc_invokespecial(ctorIndexForPrimitiveType(this.returnType), typeSizeInStackSlots(this.returnType), 0);
                        } else if (this.returnType == Void.TYPE) {
                            cb.opc_aconst_null();
                        }
                    }
                    cb.opc_areturn();
                    short classCastHandler = cb.getLength();
                    cb.setStack(1);
                    cb.opc_invokespecial(this.toStringIdx, 0, 1);
                    cb.opc_new(this.illegalArgumentClass);
                    cb.opc_dup_x1();
                    cb.opc_swap();
                    cb.opc_invokespecial(this.illegalArgumentStringCtorIdx, 1, 0);
                    cb.opc_athrow();
                    short invocationTargetHandler = cb.getLength();
                    cb.setStack(1);
                    cb.opc_new(this.invocationTargetClass);
                    cb.opc_dup_x1();
                    cb.opc_swap();
                    cb.opc_invokespecial(this.invocationTargetCtorIdx, 1, 0);
                    cb.opc_athrow();
                    ClassFileAssembler exc = new ClassFileAssembler();
                    exc.emitShort(illegalArgStartPC);
                    exc.emitShort(invokeStartPC);
                    exc.emitShort(classCastHandler);
                    exc.emitShort(this.classCastClass);
                    exc.emitShort(illegalArgStartPC);
                    exc.emitShort(invokeStartPC);
                    exc.emitShort(classCastHandler);
                    exc.emitShort(this.nullPointerClass);
                    exc.emitShort(invokeStartPC);
                    exc.emitShort(invokeEndPC);
                    exc.emitShort(invocationTargetHandler);
                    exc.emitShort(this.throwableClass);
                    emitMethod(this.invokeIdx, cb.getMaxLocals(), cb, exc, new short[]{this.invocationTargetClass});
                    return;
                }
            }
        }
        illegalArgStartPC = 0;
        successLabel = new Label();
        if (this.parameterTypes.length == 0) {
            if (this.isConstructor) {
                cb.opc_aload_1();
            } else {
                cb.opc_aload_2();
            }
            cb.opc_ifnull(successLabel);
        }
        if (this.isConstructor) {
            cb.opc_aload_1();
        } else {
            cb.opc_aload_2();
        }
        cb.opc_arraylength();
        cb.opc_sipush((short) this.parameterTypes.length);
        cb.opc_if_icmpeq(successLabel);
        cb.opc_new(this.illegalArgumentClass);
        cb.opc_dup();
        cb.opc_invokespecial(this.illegalArgumentCtorIdx, 0, 0);
        cb.opc_athrow();
        successLabel.bind();
        short paramTypeCPIdx3 = this.nonPrimitiveParametersBaseIdx;
        i = 0;
        paramTypeCPIdx = paramTypeCPIdx3;
        nextParamLabel = null;
        count = 1;
        while (true) {
            clsArr = this.parameterTypes;
            if (i < clsArr.length) {
                paramType = clsArr[i];
                count = (byte) (((byte) typeSizeInStackSlots(paramType)) + count);
                if (nextParamLabel != null) {
                    nextParamLabel.bind();
                    nextParamLabel = null;
                }
                if (this.isConstructor) {
                    cb.opc_aload_1();
                } else {
                    cb.opc_aload_2();
                }
                cb.opc_sipush((short) i);
                cb.opc_aaload();
                if (isPrimitive(paramType)) {
                    if (this.isConstructor) {
                        cb.opc_astore_2();
                    } else {
                        cb.opc_astore_3();
                    }
                    l = null;
                    nextParamLabel2 = new Label();
                    while (j < primitiveTypes.length) {
                        c = primitiveTypes[j];
                        if (!canWidenTo(c, paramType)) {
                            if (l != null) {
                                l.bind();
                            }
                            if (this.isConstructor) {
                                cb.opc_aload_2();
                            } else {
                                cb.opc_aload_3();
                            }
                            cb.opc_instanceof(indexForPrimitiveType(c));
                            l = new Label();
                            cb.opc_ifeq(l);
                            if (this.isConstructor) {
                                cb.opc_aload_2();
                            } else {
                                cb.opc_aload_3();
                            }
                            cb.opc_checkcast(indexForPrimitiveType(c));
                            cb.opc_invokevirtual(unboxingMethodForPrimitiveType(c), 0, typeSizeInStackSlots(c));
                            emitWideningBytecodeForPrimitiveConversion(cb, c, paramType);
                            cb.opc_goto(nextParamLabel2);
                        }
                    }
                    if (l != null) {
                        throw new InternalError("Must have found at least identity conversion");
                    }
                    l.bind();
                    cb.opc_new(this.illegalArgumentClass);
                    cb.opc_dup();
                    cb.opc_invokespecial(this.illegalArgumentCtorIdx, 0, 0);
                    cb.opc_athrow();
                    nextParamLabel = nextParamLabel2;
                } else {
                    cb.opc_checkcast(paramTypeCPIdx);
                    paramTypeCPIdx = m546add(paramTypeCPIdx, (short) 2);
                }
                i++;
            } else {
                if (nextParamLabel != null) {
                    nextParamLabel.bind();
                }
                short invokeStartPC2 = cb.getLength();
                if (this.isConstructor) {
                    cb.opc_invokespecial(this.targetMethodRef, count, 0);
                } else if (isStatic()) {
                    cb.opc_invokestatic(this.targetMethodRef, count, typeSizeInStackSlots(this.returnType));
                } else if (isInterface()) {
                    cb.opc_invokeinterface(this.targetMethodRef, count, count, typeSizeInStackSlots(this.returnType));
                } else {
                    cb.opc_invokevirtual(this.targetMethodRef, count, typeSizeInStackSlots(this.returnType));
                }
                short invokeEndPC2 = cb.getLength();
                if (!this.isConstructor) {
                    if (isPrimitive(this.returnType)) {
                        cb.opc_invokespecial(ctorIndexForPrimitiveType(this.returnType), typeSizeInStackSlots(this.returnType), 0);
                    } else if (this.returnType == Void.TYPE) {
                        cb.opc_aconst_null();
                    }
                }
                cb.opc_areturn();
                short classCastHandler2 = cb.getLength();
                cb.setStack(1);
                cb.opc_invokespecial(this.toStringIdx, 0, 1);
                cb.opc_new(this.illegalArgumentClass);
                cb.opc_dup_x1();
                cb.opc_swap();
                cb.opc_invokespecial(this.illegalArgumentStringCtorIdx, 1, 0);
                cb.opc_athrow();
                short invocationTargetHandler2 = cb.getLength();
                cb.setStack(1);
                cb.opc_new(this.invocationTargetClass);
                cb.opc_dup_x1();
                cb.opc_swap();
                cb.opc_invokespecial(this.invocationTargetCtorIdx, 1, 0);
                cb.opc_athrow();
                ClassFileAssembler exc2 = new ClassFileAssembler();
                exc2.emitShort(illegalArgStartPC);
                exc2.emitShort(invokeStartPC2);
                exc2.emitShort(classCastHandler2);
                exc2.emitShort(this.classCastClass);
                exc2.emitShort(illegalArgStartPC);
                exc2.emitShort(invokeStartPC2);
                exc2.emitShort(classCastHandler2);
                exc2.emitShort(this.nullPointerClass);
                exc2.emitShort(invokeStartPC2);
                exc2.emitShort(invokeEndPC2);
                exc2.emitShort(invocationTargetHandler2);
                exc2.emitShort(this.throwableClass);
                emitMethod(this.invokeIdx, cb.getMaxLocals(), cb, exc2, new short[]{this.invocationTargetClass});
                return;
            }
        }
    }

    private boolean usesPrimitiveTypes() {
        if (this.returnType.isPrimitive()) {
            return true;
        }
        int i = 0;
        while (true) {
            Class[] clsArr = this.parameterTypes;
            if (i < clsArr.length) {
                if (clsArr[i].isPrimitive()) {
                    return true;
                }
                i++;
            } else {
                return false;
            }
        }
    }

    private int numNonPrimitiveParameterTypes() {
        int num = 0;
        int i = 0;
        while (true) {
            Class[] clsArr = this.parameterTypes;
            if (i < clsArr.length) {
                if (!clsArr[i].isPrimitive()) {
                    num++;
                }
                i++;
            } else {
                return num;
            }
        }
    }

    private boolean isInterface() {
        return this.declaringClass.isInterface();
    }

    private String buildInternalSignature() {
        StringBuffer buf = new StringBuffer();
        buf.append("(");
        int i = 0;
        while (true) {
            Class[] clsArr = this.parameterTypes;
            if (i < clsArr.length) {
                buf.append(getClassName(clsArr[i], true));
                i++;
            } else {
                buf.append(")");
                buf.append(getClassName(this.returnType, true));
                return buf.toString();
            }
        }
    }

    private static synchronized String generateName(boolean isConstructor, boolean forSerialization) {
        try {
            if (isConstructor) {
                if (forSerialization) {
                    int num = serializationConstructorSymnum + 1;
                    serializationConstructorSymnum = num;
                    return "sun/reflect/GeneratedSerializationConstructorAccessor" + num;
                }
                int num2 = constructorSymnum + 1;
                constructorSymnum = num2;
                return "sun/reflect/GeneratedConstructorAccessor" + num2;
            }
            int num3 = methodSymnum + 1;
            methodSymnum = num3;
            return "sun/reflect/GeneratedMethodAccessor" + num3;
        } catch (Throwable th) {
            throw th;
        }
    }
}
