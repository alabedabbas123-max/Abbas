package sun.reflect;

import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

class AccessorGenerator implements ClassFileConstants {

    protected static final short f624S0 = 0;

    protected static final short f625S1 = 1;

    protected static final short f626S2 = 2;

    protected static final short f627S3 = 3;

    protected static final short f628S4 = 4;

    protected static final short f629S5 = 5;

    protected static final short f630S6 = 6;

    protected ClassFileAssembler f631asm;
    protected short booleanCtorIdx;
    protected short booleanIdx;
    protected short booleanUnboxIdx;
    protected short byteCtorIdx;
    protected short byteIdx;
    protected short byteUnboxIdx;
    protected short characterCtorIdx;
    protected short characterIdx;
    protected short characterUnboxIdx;
    protected short classCastClass;
    protected short codeIdx;
    protected short doubleCtorIdx;
    protected short doubleIdx;
    protected short doubleUnboxIdx;
    protected short exceptionsIdx;
    protected short floatCtorIdx;
    protected short floatIdx;
    protected short floatUnboxIdx;
    protected short illegalArgumentClass;
    private ClassFileAssembler illegalArgumentCodeBuffer;
    protected short illegalArgumentCtorIdx;
    protected short illegalArgumentStringCtorIdx;
    protected short initIdx;
    protected short initNameAndTypeIdx;
    protected short initStringNameAndTypeIdx;
    protected short integerCtorIdx;
    protected short integerIdx;
    protected short integerUnboxIdx;
    protected short invocationTargetClass;
    protected short invocationTargetCtorIdx;
    protected short longCtorIdx;
    protected short longIdx;
    protected short longUnboxIdx;
    protected int modifiers;
    protected short nullPointerClass;
    protected short nullPointerCtorIdx;
    protected short objectClass;
    protected short shortCtorIdx;
    protected short shortIdx;
    protected short shortUnboxIdx;
    protected short superClass;
    protected short superCtorIdx;
    protected short targetClass;
    protected short thisClass;
    protected short throwableClass;
    protected short toStringIdx;
    static final Unsafe unsafe = Unsafe.getUnsafe();
    protected static final Class[] primitiveTypes = {Boolean.TYPE, Byte.TYPE, Character.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE};
    protected final short NUM_COMMON_CPOOL_ENTRIES = 30;
    protected final short NUM_BOXING_CPOOL_ENTRIES = 72;

    AccessorGenerator() {
    }

    protected void emitCommonConstantPoolEntries() {
        this.f631asm.emitConstantPoolUTF8("java/lang/Throwable");
        ClassFileAssembler classFileAssembler = this.f631asm;
        classFileAssembler.emitConstantPoolClass(classFileAssembler.m551cpi());
        this.throwableClass = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("java/lang/ClassCastException");
        ClassFileAssembler classFileAssembler2 = this.f631asm;
        classFileAssembler2.emitConstantPoolClass(classFileAssembler2.m551cpi());
        this.classCastClass = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("java/lang/NullPointerException");
        ClassFileAssembler classFileAssembler3 = this.f631asm;
        classFileAssembler3.emitConstantPoolClass(classFileAssembler3.m551cpi());
        this.nullPointerClass = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("java/lang/IllegalArgumentException");
        ClassFileAssembler classFileAssembler4 = this.f631asm;
        classFileAssembler4.emitConstantPoolClass(classFileAssembler4.m551cpi());
        this.illegalArgumentClass = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("java/lang/reflect/InvocationTargetException");
        ClassFileAssembler classFileAssembler5 = this.f631asm;
        classFileAssembler5.emitConstantPoolClass(classFileAssembler5.m551cpi());
        this.invocationTargetClass = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("<init>");
        this.initIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("()V");
        ClassFileAssembler classFileAssembler6 = this.f631asm;
        classFileAssembler6.emitConstantPoolNameAndType(this.initIdx, classFileAssembler6.m551cpi());
        short sM551cpi = this.f631asm.m551cpi();
        this.initNameAndTypeIdx = sM551cpi;
        this.f631asm.emitConstantPoolMethodref(this.nullPointerClass, sM551cpi);
        this.nullPointerCtorIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolMethodref(this.illegalArgumentClass, this.initNameAndTypeIdx);
        this.illegalArgumentCtorIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("(Ljava/lang/String;)V");
        ClassFileAssembler classFileAssembler7 = this.f631asm;
        classFileAssembler7.emitConstantPoolNameAndType(this.initIdx, classFileAssembler7.m551cpi());
        short sM551cpi2 = this.f631asm.m551cpi();
        this.initStringNameAndTypeIdx = sM551cpi2;
        this.f631asm.emitConstantPoolMethodref(this.illegalArgumentClass, sM551cpi2);
        this.illegalArgumentStringCtorIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("(Ljava/lang/Throwable;)V");
        ClassFileAssembler classFileAssembler8 = this.f631asm;
        classFileAssembler8.emitConstantPoolNameAndType(this.initIdx, classFileAssembler8.m551cpi());
        ClassFileAssembler classFileAssembler9 = this.f631asm;
        classFileAssembler9.emitConstantPoolMethodref(this.invocationTargetClass, classFileAssembler9.m551cpi());
        this.invocationTargetCtorIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolMethodref(this.superClass, this.initNameAndTypeIdx);
        this.superCtorIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("java/lang/Object");
        ClassFileAssembler classFileAssembler10 = this.f631asm;
        classFileAssembler10.emitConstantPoolClass(classFileAssembler10.m551cpi());
        this.objectClass = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("toString");
        this.f631asm.emitConstantPoolUTF8("()Ljava/lang/String;");
        ClassFileAssembler classFileAssembler11 = this.f631asm;
        classFileAssembler11.emitConstantPoolNameAndType(m547sub(classFileAssembler11.m551cpi(), (short) 1), this.f631asm.m551cpi());
        ClassFileAssembler classFileAssembler12 = this.f631asm;
        classFileAssembler12.emitConstantPoolMethodref(this.objectClass, classFileAssembler12.m551cpi());
        this.toStringIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("Code");
        this.codeIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("Exceptions");
        this.exceptionsIdx = this.f631asm.m551cpi();
    }

    protected void emitBoxingContantPoolEntries() {
        this.f631asm.emitConstantPoolUTF8("java/lang/Boolean");
        ClassFileAssembler classFileAssembler = this.f631asm;
        classFileAssembler.emitConstantPoolClass(classFileAssembler.m551cpi());
        this.booleanIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("(Z)V");
        ClassFileAssembler classFileAssembler2 = this.f631asm;
        classFileAssembler2.emitConstantPoolNameAndType(this.initIdx, classFileAssembler2.m551cpi());
        ClassFileAssembler classFileAssembler3 = this.f631asm;
        classFileAssembler3.emitConstantPoolMethodref(m547sub(classFileAssembler3.m551cpi(), f626S2), this.f631asm.m551cpi());
        this.booleanCtorIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("booleanValue");
        this.f631asm.emitConstantPoolUTF8("()Z");
        ClassFileAssembler classFileAssembler4 = this.f631asm;
        classFileAssembler4.emitConstantPoolNameAndType(m547sub(classFileAssembler4.m551cpi(), (short) 1), this.f631asm.m551cpi());
        ClassFileAssembler classFileAssembler5 = this.f631asm;
        classFileAssembler5.emitConstantPoolMethodref(m547sub(classFileAssembler5.m551cpi(), f630S6), this.f631asm.m551cpi());
        this.booleanUnboxIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("java/lang/Byte");
        ClassFileAssembler classFileAssembler6 = this.f631asm;
        classFileAssembler6.emitConstantPoolClass(classFileAssembler6.m551cpi());
        this.byteIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("(B)V");
        ClassFileAssembler classFileAssembler7 = this.f631asm;
        classFileAssembler7.emitConstantPoolNameAndType(this.initIdx, classFileAssembler7.m551cpi());
        ClassFileAssembler classFileAssembler8 = this.f631asm;
        classFileAssembler8.emitConstantPoolMethodref(m547sub(classFileAssembler8.m551cpi(), f626S2), this.f631asm.m551cpi());
        this.byteCtorIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("byteValue");
        this.f631asm.emitConstantPoolUTF8("()B");
        ClassFileAssembler classFileAssembler9 = this.f631asm;
        classFileAssembler9.emitConstantPoolNameAndType(m547sub(classFileAssembler9.m551cpi(), (short) 1), this.f631asm.m551cpi());
        ClassFileAssembler classFileAssembler10 = this.f631asm;
        classFileAssembler10.emitConstantPoolMethodref(m547sub(classFileAssembler10.m551cpi(), f630S6), this.f631asm.m551cpi());
        this.byteUnboxIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("java/lang/Character");
        ClassFileAssembler classFileAssembler11 = this.f631asm;
        classFileAssembler11.emitConstantPoolClass(classFileAssembler11.m551cpi());
        this.characterIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("(C)V");
        ClassFileAssembler classFileAssembler12 = this.f631asm;
        classFileAssembler12.emitConstantPoolNameAndType(this.initIdx, classFileAssembler12.m551cpi());
        ClassFileAssembler classFileAssembler13 = this.f631asm;
        classFileAssembler13.emitConstantPoolMethodref(m547sub(classFileAssembler13.m551cpi(), f626S2), this.f631asm.m551cpi());
        this.characterCtorIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("charValue");
        this.f631asm.emitConstantPoolUTF8("()C");
        ClassFileAssembler classFileAssembler14 = this.f631asm;
        classFileAssembler14.emitConstantPoolNameAndType(m547sub(classFileAssembler14.m551cpi(), (short) 1), this.f631asm.m551cpi());
        ClassFileAssembler classFileAssembler15 = this.f631asm;
        classFileAssembler15.emitConstantPoolMethodref(m547sub(classFileAssembler15.m551cpi(), f630S6), this.f631asm.m551cpi());
        this.characterUnboxIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("java/lang/Double");
        ClassFileAssembler classFileAssembler16 = this.f631asm;
        classFileAssembler16.emitConstantPoolClass(classFileAssembler16.m551cpi());
        this.doubleIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("(D)V");
        ClassFileAssembler classFileAssembler17 = this.f631asm;
        classFileAssembler17.emitConstantPoolNameAndType(this.initIdx, classFileAssembler17.m551cpi());
        ClassFileAssembler classFileAssembler18 = this.f631asm;
        classFileAssembler18.emitConstantPoolMethodref(m547sub(classFileAssembler18.m551cpi(), f626S2), this.f631asm.m551cpi());
        this.doubleCtorIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("doubleValue");
        this.f631asm.emitConstantPoolUTF8("()D");
        ClassFileAssembler classFileAssembler19 = this.f631asm;
        classFileAssembler19.emitConstantPoolNameAndType(m547sub(classFileAssembler19.m551cpi(), (short) 1), this.f631asm.m551cpi());
        ClassFileAssembler classFileAssembler20 = this.f631asm;
        classFileAssembler20.emitConstantPoolMethodref(m547sub(classFileAssembler20.m551cpi(), f630S6), this.f631asm.m551cpi());
        this.doubleUnboxIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("java/lang/Float");
        ClassFileAssembler classFileAssembler21 = this.f631asm;
        classFileAssembler21.emitConstantPoolClass(classFileAssembler21.m551cpi());
        this.floatIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("(F)V");
        ClassFileAssembler classFileAssembler22 = this.f631asm;
        classFileAssembler22.emitConstantPoolNameAndType(this.initIdx, classFileAssembler22.m551cpi());
        ClassFileAssembler classFileAssembler23 = this.f631asm;
        classFileAssembler23.emitConstantPoolMethodref(m547sub(classFileAssembler23.m551cpi(), f626S2), this.f631asm.m551cpi());
        this.floatCtorIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("floatValue");
        this.f631asm.emitConstantPoolUTF8("()F");
        ClassFileAssembler classFileAssembler24 = this.f631asm;
        classFileAssembler24.emitConstantPoolNameAndType(m547sub(classFileAssembler24.m551cpi(), (short) 1), this.f631asm.m551cpi());
        ClassFileAssembler classFileAssembler25 = this.f631asm;
        classFileAssembler25.emitConstantPoolMethodref(m547sub(classFileAssembler25.m551cpi(), f630S6), this.f631asm.m551cpi());
        this.floatUnboxIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("java/lang/Integer");
        ClassFileAssembler classFileAssembler26 = this.f631asm;
        classFileAssembler26.emitConstantPoolClass(classFileAssembler26.m551cpi());
        this.integerIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("(I)V");
        ClassFileAssembler classFileAssembler27 = this.f631asm;
        classFileAssembler27.emitConstantPoolNameAndType(this.initIdx, classFileAssembler27.m551cpi());
        ClassFileAssembler classFileAssembler28 = this.f631asm;
        classFileAssembler28.emitConstantPoolMethodref(m547sub(classFileAssembler28.m551cpi(), f626S2), this.f631asm.m551cpi());
        this.integerCtorIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("intValue");
        this.f631asm.emitConstantPoolUTF8("()I");
        ClassFileAssembler classFileAssembler29 = this.f631asm;
        classFileAssembler29.emitConstantPoolNameAndType(m547sub(classFileAssembler29.m551cpi(), (short) 1), this.f631asm.m551cpi());
        ClassFileAssembler classFileAssembler30 = this.f631asm;
        classFileAssembler30.emitConstantPoolMethodref(m547sub(classFileAssembler30.m551cpi(), f630S6), this.f631asm.m551cpi());
        this.integerUnboxIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("java/lang/Long");
        ClassFileAssembler classFileAssembler31 = this.f631asm;
        classFileAssembler31.emitConstantPoolClass(classFileAssembler31.m551cpi());
        this.longIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("(J)V");
        ClassFileAssembler classFileAssembler32 = this.f631asm;
        classFileAssembler32.emitConstantPoolNameAndType(this.initIdx, classFileAssembler32.m551cpi());
        ClassFileAssembler classFileAssembler33 = this.f631asm;
        classFileAssembler33.emitConstantPoolMethodref(m547sub(classFileAssembler33.m551cpi(), f626S2), this.f631asm.m551cpi());
        this.longCtorIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("longValue");
        this.f631asm.emitConstantPoolUTF8("()J");
        ClassFileAssembler classFileAssembler34 = this.f631asm;
        classFileAssembler34.emitConstantPoolNameAndType(m547sub(classFileAssembler34.m551cpi(), (short) 1), this.f631asm.m551cpi());
        ClassFileAssembler classFileAssembler35 = this.f631asm;
        classFileAssembler35.emitConstantPoolMethodref(m547sub(classFileAssembler35.m551cpi(), f630S6), this.f631asm.m551cpi());
        this.longUnboxIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("java/lang/Short");
        ClassFileAssembler classFileAssembler36 = this.f631asm;
        classFileAssembler36.emitConstantPoolClass(classFileAssembler36.m551cpi());
        this.shortIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("(S)V");
        ClassFileAssembler classFileAssembler37 = this.f631asm;
        classFileAssembler37.emitConstantPoolNameAndType(this.initIdx, classFileAssembler37.m551cpi());
        ClassFileAssembler classFileAssembler38 = this.f631asm;
        classFileAssembler38.emitConstantPoolMethodref(m547sub(classFileAssembler38.m551cpi(), f626S2), this.f631asm.m551cpi());
        this.shortCtorIdx = this.f631asm.m551cpi();
        this.f631asm.emitConstantPoolUTF8("shortValue");
        this.f631asm.emitConstantPoolUTF8("()S");
        ClassFileAssembler classFileAssembler39 = this.f631asm;
        classFileAssembler39.emitConstantPoolNameAndType(m547sub(classFileAssembler39.m551cpi(), (short) 1), this.f631asm.m551cpi());
        ClassFileAssembler classFileAssembler40 = this.f631asm;
        classFileAssembler40.emitConstantPoolMethodref(m547sub(classFileAssembler40.m551cpi(), f630S6), this.f631asm.m551cpi());
        this.shortUnboxIdx = this.f631asm.m551cpi();
    }

    protected static short m546add(short s1, short s2) {
        return (short) (s1 + s2);
    }

    protected static short m547sub(short s1, short s2) {
        return (short) (s1 - s2);
    }

    protected boolean isStatic() {
        return Modifier.isStatic(this.modifiers);
    }

    protected static String getClassName(Class c, boolean addPrefixAndSuffixForNonPrimitiveTypes) {
        if (c.isPrimitive()) {
            if (c == Boolean.TYPE) {
                return "Z";
            }
            if (c == Byte.TYPE) {
                return "B";
            }
            if (c == Character.TYPE) {
                return "C";
            }
            if (c == Double.TYPE) {
                return "D";
            }
            if (c == Float.TYPE) {
                return "F";
            }
            if (c == Integer.TYPE) {
                return "I";
            }
            if (c == Long.TYPE) {
                return "J";
            }
            if (c == Short.TYPE) {
                return "S";
            }
            if (c == Void.TYPE) {
                return "V";
            }
            throw new InternalError("Should have found primitive type");
        }
        if (c.isArray()) {
            return "[" + getClassName(c.getComponentType(), true);
        }
        if (addPrefixAndSuffixForNonPrimitiveTypes) {
            return internalize("L" + c.getName() + ";");
        }
        return internalize(c.getName());
    }

    private static String internalize(String className) {
        return className.replace('.', '/');
    }

    protected void emitConstructor() {
        ClassFileAssembler cb = new ClassFileAssembler();
        cb.setMaxLocals(1);
        cb.opc_aload_0();
        cb.opc_invokespecial(this.superCtorIdx, 0, 0);
        cb.opc_return();
        emitMethod(this.initIdx, cb.getMaxLocals(), cb, null, null);
    }

    protected void emitMethod(short nameIdx, int numArgs, ClassFileAssembler code, ClassFileAssembler exceptionTable, short[] checkedExceptionIndices) {
        int codeLen = code.getLength();
        int excLen = 0;
        if (exceptionTable != null) {
            excLen = exceptionTable.getLength();
            if (excLen % 8 != 0) {
                throw new IllegalArgumentException("Illegal exception table");
            }
        }
        int attrLen = codeLen + 12 + excLen;
        int excLen2 = excLen / 8;
        this.f631asm.emitShort((short) 1);
        this.f631asm.emitShort(nameIdx);
        this.f631asm.emitShort(m546add(nameIdx, (short) 1));
        if (checkedExceptionIndices != null) {
            this.f631asm.emitShort(f626S2);
        } else {
            this.f631asm.emitShort((short) 1);
        }
        this.f631asm.emitShort(this.codeIdx);
        this.f631asm.emitInt(attrLen);
        this.f631asm.emitShort(code.getMaxStack());
        this.f631asm.emitShort((short) Math.max(numArgs, (int) code.getMaxLocals()));
        this.f631asm.emitInt(codeLen);
        this.f631asm.append(code);
        this.f631asm.emitShort((short) excLen2);
        if (exceptionTable != null) {
            this.f631asm.append(exceptionTable);
        }
        this.f631asm.emitShort(f624S0);
        if (checkedExceptionIndices != null) {
            this.f631asm.emitShort(this.exceptionsIdx);
            this.f631asm.emitInt((checkedExceptionIndices.length * 2) + 2);
            this.f631asm.emitShort((short) checkedExceptionIndices.length);
            for (short s : checkedExceptionIndices) {
                this.f631asm.emitShort(s);
            }
        }
    }

    protected short indexForPrimitiveType(Class type) {
        if (type == Boolean.TYPE) {
            return this.booleanIdx;
        }
        if (type == Byte.TYPE) {
            return this.byteIdx;
        }
        if (type == Character.TYPE) {
            return this.characterIdx;
        }
        if (type == Double.TYPE) {
            return this.doubleIdx;
        }
        if (type == Float.TYPE) {
            return this.floatIdx;
        }
        if (type == Integer.TYPE) {
            return this.integerIdx;
        }
        if (type == Long.TYPE) {
            return this.longIdx;
        }
        if (type == Short.TYPE) {
            return this.shortIdx;
        }
        throw new InternalError("Should have found primitive type");
    }

    protected short ctorIndexForPrimitiveType(Class type) {
        if (type == Boolean.TYPE) {
            return this.booleanCtorIdx;
        }
        if (type == Byte.TYPE) {
            return this.byteCtorIdx;
        }
        if (type == Character.TYPE) {
            return this.characterCtorIdx;
        }
        if (type == Double.TYPE) {
            return this.doubleCtorIdx;
        }
        if (type == Float.TYPE) {
            return this.floatCtorIdx;
        }
        if (type == Integer.TYPE) {
            return this.integerCtorIdx;
        }
        if (type == Long.TYPE) {
            return this.longCtorIdx;
        }
        if (type == Short.TYPE) {
            return this.shortCtorIdx;
        }
        throw new InternalError("Should have found primitive type");
    }

    protected static boolean canWidenTo(Class type, Class otherType) {
        if (!type.isPrimitive()) {
            return false;
        }
        if (type == Boolean.TYPE) {
            if (otherType == Boolean.TYPE) {
                return true;
            }
        } else if (type == Byte.TYPE) {
            if (otherType == Byte.TYPE || otherType == Short.TYPE || otherType == Integer.TYPE || otherType == Long.TYPE || otherType == Float.TYPE || otherType == Double.TYPE) {
                return true;
            }
        } else if (type == Short.TYPE) {
            if (otherType == Short.TYPE || otherType == Integer.TYPE || otherType == Long.TYPE || otherType == Float.TYPE || otherType == Double.TYPE) {
                return true;
            }
        } else if (type == Character.TYPE) {
            if (otherType == Character.TYPE || otherType == Integer.TYPE || otherType == Long.TYPE || otherType == Float.TYPE || otherType == Double.TYPE) {
                return true;
            }
        } else if (type == Integer.TYPE) {
            if (otherType == Integer.TYPE || otherType == Long.TYPE || otherType == Float.TYPE || otherType == Double.TYPE) {
                return true;
            }
        } else if (type == Long.TYPE) {
            if (otherType == Long.TYPE || otherType == Float.TYPE || otherType == Double.TYPE) {
                return true;
            }
        } else if (type == Float.TYPE) {
            if (otherType == Float.TYPE || otherType == Double.TYPE) {
                return true;
            }
        } else if (type == Double.TYPE && otherType == Double.TYPE) {
            return true;
        }
        return false;
    }

    protected static void emitWideningBytecodeForPrimitiveConversion(ClassFileAssembler cb, Class fromType, Class toType) {
        if (fromType == Byte.TYPE || fromType == Short.TYPE || fromType == Character.TYPE || fromType == Integer.TYPE) {
            if (toType == Long.TYPE) {
                cb.opc_i2l();
                return;
            } else if (toType == Float.TYPE) {
                cb.opc_i2f();
                return;
            } else {
                if (toType == Double.TYPE) {
                    cb.opc_i2d();
                    return;
                }
                return;
            }
        }
        if (fromType == Long.TYPE) {
            if (toType == Float.TYPE) {
                cb.opc_l2f();
                return;
            } else {
                if (toType == Double.TYPE) {
                    cb.opc_l2d();
                    return;
                }
                return;
            }
        }
        if (fromType == Float.TYPE && toType == Double.TYPE) {
            cb.opc_f2d();
        }
    }

    protected short unboxingMethodForPrimitiveType(Class primType) {
        if (primType == Boolean.TYPE) {
            return this.booleanUnboxIdx;
        }
        if (primType == Byte.TYPE) {
            return this.byteUnboxIdx;
        }
        if (primType == Character.TYPE) {
            return this.characterUnboxIdx;
        }
        if (primType == Short.TYPE) {
            return this.shortUnboxIdx;
        }
        if (primType == Integer.TYPE) {
            return this.integerUnboxIdx;
        }
        if (primType == Long.TYPE) {
            return this.longUnboxIdx;
        }
        if (primType == Float.TYPE) {
            return this.floatUnboxIdx;
        }
        if (primType == Double.TYPE) {
            return this.doubleUnboxIdx;
        }
        throw new InternalError("Illegal primitive type " + primType.getName());
    }

    protected static boolean isPrimitive(Class c) {
        return c.isPrimitive() && c != Void.TYPE;
    }

    protected int typeSizeInStackSlots(Class c) {
        if (c == Void.TYPE) {
            return 0;
        }
        if (c == Long.TYPE || c == Double.TYPE) {
            return 2;
        }
        return 1;
    }

    protected ClassFileAssembler illegalArgumentCodeBuffer() {
        if (this.illegalArgumentCodeBuffer == null) {
            ClassFileAssembler classFileAssembler = new ClassFileAssembler();
            this.illegalArgumentCodeBuffer = classFileAssembler;
            classFileAssembler.opc_new(this.illegalArgumentClass);
            this.illegalArgumentCodeBuffer.opc_dup();
            this.illegalArgumentCodeBuffer.opc_invokespecial(this.illegalArgumentCtorIdx, 0, 0);
            this.illegalArgumentCodeBuffer.opc_athrow();
        }
        return this.illegalArgumentCodeBuffer;
    }
}
