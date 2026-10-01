package sun.reflect;

import com.sun.tools.javac.jvm.ClassFile;

class ClassFileAssembler implements ClassFileConstants {
    private short cpIdx;
    private int maxLocals;
    private int maxStack;
    private int stack;

    private ByteVector f633vec;

    public ClassFileAssembler() {
        this(ByteVectorFactory.create());
    }

    public ClassFileAssembler(ByteVector vec) {
        this.cpIdx = (short) 0;
        this.stack = 0;
        this.maxStack = 0;
        this.maxLocals = 0;
        this.f633vec = vec;
    }

    public ByteVector getData() {
        return this.f633vec;
    }

    public short getLength() {
        return (short) this.f633vec.getLength();
    }

    public void emitMagicAndVersion() {
        emitInt(ClassFile.JAVA_MAGIC);
        emitShort((short) 0);
        emitShort((short) 49);
    }

    public void emitInt(int val) {
        emitByte((byte) (val >> 24));
        emitByte((byte) ((val >> 16) & 255));
        emitByte((byte) ((val >> 8) & 255));
        emitByte((byte) (val & 255));
    }

    public void emitShort(short val) {
        emitByte((byte) ((val >> 8) & 255));
        emitByte((byte) (val & 255));
    }

    void emitShort(short bci, short val) {
        this.f633vec.mo550put(bci, (byte) ((val >> 8) & 255));
        this.f633vec.mo550put(bci + 1, (byte) (val & 255));
    }

    public void emitByte(byte val) {
        this.f633vec.mo548add(val);
    }

    public void append(ClassFileAssembler asm) {
        append(asm.f633vec);
    }

    public void append(ByteVector vec) {
        for (int i = 0; i < vec.getLength(); i++) {
            emitByte(vec.mo549get(i));
        }
    }

    public short m551cpi() {
        short s = this.cpIdx;
        if (s == 0) {
            throw new RuntimeException("Illegal use of ClassFileAssembler");
        }
        return s;
    }

    public void emitConstantPoolUTF8(String str) {
        byte[] bytes = UTF8.encode(str);
        emitByte((byte) 1);
        emitShort((short) bytes.length);
        for (byte b : bytes) {
            emitByte(b);
        }
        int i = this.cpIdx;
        this.cpIdx = (short) (i + 1);
    }

    public void emitConstantPoolClass(short index) {
        emitByte((byte) 7);
        emitShort(index);
        this.cpIdx = (short) (this.cpIdx + 1);
    }

    public void emitConstantPoolNameAndType(short nameIndex, short typeIndex) {
        emitByte((byte) 12);
        emitShort(nameIndex);
        emitShort(typeIndex);
        this.cpIdx = (short) (this.cpIdx + 1);
    }

    public void emitConstantPoolFieldref(short classIndex, short nameAndTypeIndex) {
        emitByte((byte) 9);
        emitShort(classIndex);
        emitShort(nameAndTypeIndex);
        this.cpIdx = (short) (this.cpIdx + 1);
    }

    public void emitConstantPoolMethodref(short classIndex, short nameAndTypeIndex) {
        emitByte((byte) 10);
        emitShort(classIndex);
        emitShort(nameAndTypeIndex);
        this.cpIdx = (short) (this.cpIdx + 1);
    }

    public void emitConstantPoolInterfaceMethodref(short classIndex, short nameAndTypeIndex) {
        emitByte((byte) 11);
        emitShort(classIndex);
        emitShort(nameAndTypeIndex);
        this.cpIdx = (short) (this.cpIdx + 1);
    }

    public void emitConstantPoolString(short utf8Index) {
        emitByte((byte) 8);
        emitShort(utf8Index);
        this.cpIdx = (short) (this.cpIdx + 1);
    }

    private void incStack() {
        setStack(this.stack + 1);
    }

    private void decStack() {
        this.stack--;
    }

    public short getMaxStack() {
        return (short) this.maxStack;
    }

    public short getMaxLocals() {
        return (short) this.maxLocals;
    }

    public void setMaxLocals(int maxLocals) {
        this.maxLocals = maxLocals;
    }

    public int getStack() {
        return this.stack;
    }

    public void setStack(int value) {
        this.stack = value;
        if (value > this.maxStack) {
            this.maxStack = value;
        }
    }

    public void opc_aconst_null() {
        emitByte((byte) 1);
        incStack();
    }

    public void opc_sipush(short constant) {
        emitByte((byte) 17);
        emitShort(constant);
        incStack();
    }

    public void opc_ldc(byte cpIdx) {
        emitByte((byte) 18);
        emitByte(cpIdx);
        incStack();
    }

    public void opc_iload_0() {
        emitByte((byte) 26);
        if (this.maxLocals < 1) {
            this.maxLocals = 1;
        }
        incStack();
    }

    public void opc_iload_1() {
        emitByte((byte) 27);
        if (this.maxLocals < 2) {
            this.maxLocals = 2;
        }
        incStack();
    }

    public void opc_iload_2() {
        emitByte((byte) 28);
        if (this.maxLocals < 3) {
            this.maxLocals = 3;
        }
        incStack();
    }

    public void opc_iload_3() {
        emitByte((byte) 29);
        if (this.maxLocals < 4) {
            this.maxLocals = 4;
        }
        incStack();
    }

    public void opc_lload_0() {
        emitByte((byte) 30);
        if (this.maxLocals < 2) {
            this.maxLocals = 2;
        }
        incStack();
        incStack();
    }

    public void opc_lload_1() {
        emitByte((byte) 31);
        if (this.maxLocals < 3) {
            this.maxLocals = 3;
        }
        incStack();
        incStack();
    }

    public void opc_lload_2() {
        emitByte((byte) 32);
        if (this.maxLocals < 4) {
            this.maxLocals = 4;
        }
        incStack();
        incStack();
    }

    public void opc_lload_3() {
        emitByte(ClassFileConstants.opc_lload_3);
        if (this.maxLocals < 5) {
            this.maxLocals = 5;
        }
        incStack();
        incStack();
    }

    public void opc_fload_0() {
        emitByte(ClassFileConstants.opc_fload_0);
        if (this.maxLocals < 1) {
            this.maxLocals = 1;
        }
        incStack();
    }

    public void opc_fload_1() {
        emitByte(ClassFileConstants.opc_fload_1);
        if (this.maxLocals < 2) {
            this.maxLocals = 2;
        }
        incStack();
    }

    public void opc_fload_2() {
        emitByte(ClassFileConstants.opc_fload_2);
        if (this.maxLocals < 3) {
            this.maxLocals = 3;
        }
        incStack();
    }

    public void opc_fload_3() {
        emitByte(ClassFileConstants.opc_fload_3);
        if (this.maxLocals < 4) {
            this.maxLocals = 4;
        }
        incStack();
    }

    public void opc_dload_0() {
        emitByte(ClassFileConstants.opc_dload_0);
        if (this.maxLocals < 2) {
            this.maxLocals = 2;
        }
        incStack();
        incStack();
    }

    public void opc_dload_1() {
        emitByte(ClassFileConstants.opc_dload_1);
        if (this.maxLocals < 3) {
            this.maxLocals = 3;
        }
        incStack();
        incStack();
    }

    public void opc_dload_2() {
        emitByte(ClassFileConstants.opc_dload_2);
        if (this.maxLocals < 4) {
            this.maxLocals = 4;
        }
        incStack();
        incStack();
    }

    public void opc_dload_3() {
        emitByte(ClassFileConstants.opc_dload_3);
        if (this.maxLocals < 5) {
            this.maxLocals = 5;
        }
        incStack();
        incStack();
    }

    public void opc_aload_0() {
        emitByte(ClassFileConstants.opc_aload_0);
        if (this.maxLocals < 1) {
            this.maxLocals = 1;
        }
        incStack();
    }

    public void opc_aload_1() {
        emitByte(ClassFileConstants.opc_aload_1);
        if (this.maxLocals < 2) {
            this.maxLocals = 2;
        }
        incStack();
    }

    public void opc_aload_2() {
        emitByte(ClassFileConstants.opc_aload_2);
        if (this.maxLocals < 3) {
            this.maxLocals = 3;
        }
        incStack();
    }

    public void opc_aload_3() {
        emitByte(ClassFileConstants.opc_aload_3);
        if (this.maxLocals < 4) {
            this.maxLocals = 4;
        }
        incStack();
    }

    public void opc_aaload() {
        emitByte(ClassFileConstants.opc_aaload);
        decStack();
    }

    public void opc_astore_0() {
        emitByte(ClassFileConstants.opc_astore_0);
        if (this.maxLocals < 1) {
            this.maxLocals = 1;
        }
        decStack();
    }

    public void opc_astore_1() {
        emitByte(ClassFileConstants.opc_astore_1);
        if (this.maxLocals < 2) {
            this.maxLocals = 2;
        }
        decStack();
    }

    public void opc_astore_2() {
        emitByte(ClassFileConstants.opc_astore_2);
        if (this.maxLocals < 3) {
            this.maxLocals = 3;
        }
        decStack();
    }

    public void opc_astore_3() {
        emitByte(ClassFileConstants.opc_astore_3);
        if (this.maxLocals < 4) {
            this.maxLocals = 4;
        }
        decStack();
    }

    public void opc_pop() {
        emitByte(ClassFileConstants.opc_pop);
        decStack();
    }

    public void opc_dup() {
        emitByte(ClassFileConstants.opc_dup);
        incStack();
    }

    public void opc_dup_x1() {
        emitByte(ClassFileConstants.opc_dup_x1);
        incStack();
    }

    public void opc_swap() {
        emitByte(ClassFileConstants.opc_swap);
    }

    public void opc_i2l() {
        emitByte(ClassFileConstants.opc_i2l);
    }

    public void opc_i2f() {
        emitByte(ClassFileConstants.opc_i2f);
    }

    public void opc_i2d() {
        emitByte(ClassFileConstants.opc_i2d);
    }

    public void opc_l2f() {
        emitByte(ClassFileConstants.opc_l2f);
    }

    public void opc_l2d() {
        emitByte(ClassFileConstants.opc_l2d);
    }

    public void opc_f2d() {
        emitByte(ClassFileConstants.opc_f2d);
    }

    public void opc_ifeq(short bciOffset) {
        emitByte(ClassFileConstants.opc_ifeq);
        emitShort(bciOffset);
        decStack();
    }

    public void opc_ifeq(Label l) {
        short instrBCI = getLength();
        emitByte(ClassFileConstants.opc_ifeq);
        l.m554add(this, instrBCI, getLength(), getStack() - 1);
        emitShort((short) -1);
    }

    public void opc_if_icmpeq(short bciOffset) {
        emitByte(ClassFileConstants.opc_if_icmpeq);
        emitShort(bciOffset);
        setStack(getStack() - 2);
    }

    public void opc_if_icmpeq(Label l) {
        short instrBCI = getLength();
        emitByte(ClassFileConstants.opc_if_icmpeq);
        l.m554add(this, instrBCI, getLength(), getStack() - 2);
        emitShort((short) -1);
    }

    public void opc_goto(short bciOffset) {
        emitByte(ClassFileConstants.opc_goto);
        emitShort(bciOffset);
    }

    public void opc_goto(Label l) {
        short instrBCI = getLength();
        emitByte(ClassFileConstants.opc_goto);
        l.m554add(this, instrBCI, getLength(), getStack());
        emitShort((short) -1);
    }

    public void opc_ifnull(short bciOffset) {
        emitByte(ClassFileConstants.opc_ifnull);
        emitShort(bciOffset);
        decStack();
    }

    public void opc_ifnull(Label l) {
        short instrBCI = getLength();
        emitByte(ClassFileConstants.opc_ifnull);
        l.m554add(this, instrBCI, getLength(), getStack() - 1);
        emitShort((short) -1);
        decStack();
    }

    public void opc_ifnonnull(short bciOffset) {
        emitByte(ClassFileConstants.opc_ifnonnull);
        emitShort(bciOffset);
        decStack();
    }

    public void opc_ifnonnull(Label l) {
        short instrBCI = getLength();
        emitByte(ClassFileConstants.opc_ifnonnull);
        l.m554add(this, instrBCI, getLength(), getStack() - 1);
        emitShort((short) -1);
        decStack();
    }

    public void opc_ireturn() {
        emitByte(ClassFileConstants.opc_ireturn);
        setStack(0);
    }

    public void opc_lreturn() {
        emitByte(ClassFileConstants.opc_lreturn);
        setStack(0);
    }

    public void opc_freturn() {
        emitByte(ClassFileConstants.opc_freturn);
        setStack(0);
    }

    public void opc_dreturn() {
        emitByte(ClassFileConstants.opc_dreturn);
        setStack(0);
    }

    public void opc_areturn() {
        emitByte(ClassFileConstants.opc_areturn);
        setStack(0);
    }

    public void opc_return() {
        emitByte(ClassFileConstants.opc_return);
        setStack(0);
    }

    public void opc_getstatic(short fieldIndex, int fieldSizeInStackSlots) {
        emitByte(ClassFileConstants.opc_getstatic);
        emitShort(fieldIndex);
        setStack(getStack() + fieldSizeInStackSlots);
    }

    public void opc_putstatic(short fieldIndex, int fieldSizeInStackSlots) {
        emitByte(ClassFileConstants.opc_putstatic);
        emitShort(fieldIndex);
        setStack(getStack() - fieldSizeInStackSlots);
    }

    public void opc_getfield(short fieldIndex, int fieldSizeInStackSlots) {
        emitByte(ClassFileConstants.opc_getfield);
        emitShort(fieldIndex);
        setStack((getStack() + fieldSizeInStackSlots) - 1);
    }

    public void opc_putfield(short fieldIndex, int fieldSizeInStackSlots) {
        emitByte(ClassFileConstants.opc_putfield);
        emitShort(fieldIndex);
        setStack((getStack() - fieldSizeInStackSlots) - 1);
    }

    public void opc_invokevirtual(short methodIndex, int numArgs, int numReturnValues) {
        emitByte(ClassFileConstants.opc_invokevirtual);
        emitShort(methodIndex);
        setStack(((getStack() - numArgs) - 1) + numReturnValues);
    }

    public void opc_invokespecial(short methodIndex, int numArgs, int numReturnValues) {
        emitByte(ClassFileConstants.opc_invokespecial);
        emitShort(methodIndex);
        setStack(((getStack() - numArgs) - 1) + numReturnValues);
    }

    public void opc_invokestatic(short methodIndex, int numArgs, int numReturnValues) {
        emitByte(ClassFileConstants.opc_invokestatic);
        emitShort(methodIndex);
        setStack((getStack() - numArgs) + numReturnValues);
    }

    public void opc_invokeinterface(short methodIndex, int numArgs, byte count, int numReturnValues) {
        emitByte(ClassFileConstants.opc_invokeinterface);
        emitShort(methodIndex);
        emitByte(count);
        emitByte((byte) 0);
        setStack(((getStack() - numArgs) - 1) + numReturnValues);
    }

    public void opc_arraylength() {
        emitByte(ClassFileConstants.opc_arraylength);
    }

    public void opc_new(short classIndex) {
        emitByte(ClassFileConstants.opc_new);
        emitShort(classIndex);
        incStack();
    }

    public void opc_athrow() {
        emitByte(ClassFileConstants.opc_athrow);
        setStack(1);
    }

    public void opc_checkcast(short classIndex) {
        emitByte(ClassFileConstants.opc_checkcast);
        emitShort(classIndex);
    }

    public void opc_instanceof(short classIndex) {
        emitByte(ClassFileConstants.opc_instanceof);
        emitShort(classIndex);
    }
}
