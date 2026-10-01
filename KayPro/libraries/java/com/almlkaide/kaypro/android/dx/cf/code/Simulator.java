package com.almlkaide.kaypro.android.dx.cf.code;

import com.almlkaide.kaypro.android.dx.dex.DexOptions;
import com.almlkaide.kaypro.android.dx.rop.code.LocalItem;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstFieldRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInteger;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInterfaceMethodRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInvokeDynamic;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodHandle;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstProtoRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.type.Prototype;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.util.ArrayList;

public class Simulator {
    private static boolean $assertionsDisabled = false;
    private static final String LOCAL_MISMATCH_ERROR = "This is symptomatic of .class transformation tools that ignore local variable information.";
    private final BytecodeArray code;
    private final DexOptions dexOptions;
    private final LocalVariableList localVariables;
    private final Machine machine;
    private ConcreteMethod method;
    private final SimVisitor visitor;

    static {
        try {
            $assertionsDisabled = !Class.forName("com.almlkaide.kaypro.android.dx.cf.code.Simulator").desiredAssertionStatus();
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public Simulator(Machine machine, ConcreteMethod concreteMethod, DexOptions dexOptions) {
        if (machine == null) {
            throw new NullPointerException("machine == null");
        }
        if (concreteMethod == null) {
            throw new NullPointerException("method == null");
        }
        if (dexOptions == null) {
            throw new NullPointerException("dexOptions == null");
        }
        this.machine = machine;
        this.code = concreteMethod.getCode();
        this.method = concreteMethod;
        this.localVariables = concreteMethod.getLocalVariables();
        this.visitor = new SimVisitor(this);
        this.dexOptions = dexOptions;
        if (concreteMethod.isDefaultOrStaticInterfaceMethod()) {
            checkInterfaceMethodDeclaration(concreteMethod);
        }
    }

    public void simulate(ByteBlock byteBlock, Frame frame) {
        int end = byteBlock.getEnd();
        this.visitor.setFrame(frame);
        try {
            int start = byteBlock.getStart();
            while (start < end) {
                int instruction = this.code.parseInstruction(start, this.visitor);
                this.visitor.setPreviousOffset(start);
                start += instruction;
            }
        } catch (SimException e) {
            frame.annotate(e);
            throw e;
        }
    }

    public int simulate(int i, Frame frame) {
        this.visitor.setFrame(frame);
        return this.code.parseInstruction(i, this.visitor);
    }

    public static SimException illegalTos() {
        return new SimException(new StringBuffer().append("stack mismatch: illegal ").append("top-of-stack for opcode").toString());
    }

    public static Type requiredArrayTypeFor(Type type, Type type2) {
        if (type2 == Type.KNOWN_NULL) {
            return type.isReference() ? Type.KNOWN_NULL : type.getArrayType();
        }
        if (type == Type.OBJECT && type2.isArray() && type2.getComponentType().isReference()) {
            return type2;
        }
        if (type == Type.BYTE && type2 == Type.BOOLEAN_ARRAY) {
            return Type.BOOLEAN_ARRAY;
        }
        return type.getArrayType();
    }

    private class SimVisitor implements BytecodeArray.Visitor {
        private Frame frame = (Frame) null;
        private final Machine machine;
        private int previousOffset;
        private final Simulator this$0;

        public SimVisitor(Simulator simulator) {
            this.this$0 = simulator;
            this.machine = this.this$0.machine;
        }

        public void setFrame(Frame frame) {
            if (frame == null) {
                throw new NullPointerException("frame == null");
            }
            this.frame = frame;
        }

        @Override
        public void visitInvalid(int i, int i2, int i3) {
            throw new SimException(new StringBuffer().append("invalid opcode ").append(Hex.m7224u1(i)).toString());
        }

        @Override
        public void visitNoArgs(int i, int i2, int i3, Type type) {
            int i4;
            Type componentType;
            switch (i) {
                case 0:
                    this.machine.clearArgs();
                    break;
                case 46:
                    Type typeRequiredArrayTypeFor = Simulator.requiredArrayTypeFor(type, this.frame.getStack().peekType(1));
                    Type componentType2 = typeRequiredArrayTypeFor == Type.KNOWN_NULL ? Type.KNOWN_NULL : typeRequiredArrayTypeFor.getComponentType();
                    this.machine.popArgs(this.frame, typeRequiredArrayTypeFor, Type.f5078INT);
                    type = componentType2;
                    break;
                case 79:
                    ExecutionStack stack = this.frame.getStack();
                    int i5 = type.isCategory1() ? 2 : 3;
                    Type typePeekType = stack.peekType(i5);
                    boolean zPeekLocal = stack.peekLocal(i5);
                    Type typeRequiredArrayTypeFor2 = Simulator.requiredArrayTypeFor(type, typePeekType);
                    if (zPeekLocal) {
                        componentType = typeRequiredArrayTypeFor2 == Type.KNOWN_NULL ? Type.KNOWN_NULL : typeRequiredArrayTypeFor2.getComponentType();
                    } else {
                        componentType = type;
                    }
                    this.machine.popArgs(this.frame, typeRequiredArrayTypeFor2, Type.f5078INT, componentType);
                    type = componentType;
                    break;
                case 87:
                    if (this.frame.getStack().peekType(0).isCategory2()) {
                        throw Simulator.illegalTos();
                    }
                    this.machine.popArgs(this.frame, 1);
                    break;
                    break;
                case 88:
                case 92:
                    ExecutionStack stack2 = this.frame.getStack();
                    if (stack2.peekType(0).isCategory2()) {
                        this.machine.popArgs(this.frame, 1);
                        i4 = 17;
                    } else if (stack2.peekType(1).isCategory1()) {
                        this.machine.popArgs(this.frame, 2);
                        i4 = 8481;
                    } else {
                        throw Simulator.illegalTos();
                    }
                    if (i == 92) {
                        this.machine.auxIntArg(i4);
                    }
                    break;
                case 89:
                    if (this.frame.getStack().peekType(0).isCategory2()) {
                        throw Simulator.illegalTos();
                    }
                    this.machine.popArgs(this.frame, 1);
                    this.machine.auxIntArg(17);
                    break;
                    break;
                case 90:
                    ExecutionStack stack3 = this.frame.getStack();
                    if (!stack3.peekType(0).isCategory1() || !stack3.peekType(1).isCategory1()) {
                        throw Simulator.illegalTos();
                    }
                    this.machine.popArgs(this.frame, 2);
                    this.machine.auxIntArg(530);
                    break;
                    break;
                case 91:
                    ExecutionStack stack4 = this.frame.getStack();
                    if (stack4.peekType(0).isCategory2()) {
                        throw Simulator.illegalTos();
                    }
                    if (stack4.peekType(1).isCategory2()) {
                        this.machine.popArgs(this.frame, 2);
                        this.machine.auxIntArg(530);
                    } else if (stack4.peekType(2).isCategory1()) {
                        this.machine.popArgs(this.frame, 3);
                        this.machine.auxIntArg(12819);
                    } else {
                        throw Simulator.illegalTos();
                    }
                    break;
                    break;
                case 93:
                    ExecutionStack stack5 = this.frame.getStack();
                    if (stack5.peekType(0).isCategory2()) {
                        if (stack5.peekType(2).isCategory2()) {
                            throw Simulator.illegalTos();
                        }
                        this.machine.popArgs(this.frame, 2);
                        this.machine.auxIntArg(530);
                    } else {
                        if (stack5.peekType(1).isCategory2() || stack5.peekType(2).isCategory2()) {
                            throw Simulator.illegalTos();
                        }
                        this.machine.popArgs(this.frame, 3);
                        this.machine.auxIntArg(205106);
                    }
                    break;
                case 94:
                    ExecutionStack stack6 = this.frame.getStack();
                    if (stack6.peekType(0).isCategory2()) {
                        if (stack6.peekType(2).isCategory2()) {
                            this.machine.popArgs(this.frame, 2);
                            this.machine.auxIntArg(530);
                        } else if (stack6.peekType(3).isCategory1()) {
                            this.machine.popArgs(this.frame, 3);
                            this.machine.auxIntArg(12819);
                        } else {
                            throw Simulator.illegalTos();
                        }
                    } else if (stack6.peekType(1).isCategory1()) {
                        if (stack6.peekType(2).isCategory2()) {
                            this.machine.popArgs(this.frame, 3);
                            this.machine.auxIntArg(205106);
                        } else if (stack6.peekType(3).isCategory1()) {
                            this.machine.popArgs(this.frame, 4);
                            this.machine.auxIntArg(4399427);
                        } else {
                            throw Simulator.illegalTos();
                        }
                    } else {
                        throw Simulator.illegalTos();
                    }
                    break;
                case 95:
                    ExecutionStack stack7 = this.frame.getStack();
                    if (!stack7.peekType(0).isCategory1() || !stack7.peekType(1).isCategory1()) {
                        throw Simulator.illegalTos();
                    }
                    this.machine.popArgs(this.frame, 2);
                    this.machine.auxIntArg(18);
                    break;
                    break;
                case 96:
                case 100:
                case 104:
                case 108:
                case 112:
                case 126:
                case 128:
                case 130:
                    this.machine.popArgs(this.frame, type, type);
                    break;
                case 116:
                    this.machine.popArgs(this.frame, type);
                    break;
                case 120:
                case 122:
                case 124:
                    this.machine.popArgs(this.frame, type, Type.f5078INT);
                    break;
                case 133:
                case 134:
                case 135:
                case 145:
                case 146:
                case 147:
                    this.machine.popArgs(this.frame, Type.f5078INT);
                    break;
                case 136:
                case 137:
                case 138:
                    this.machine.popArgs(this.frame, Type.LONG);
                    break;
                case 139:
                case 140:
                case 141:
                    this.machine.popArgs(this.frame, Type.FLOAT);
                    break;
                case 142:
                case 143:
                case 144:
                    this.machine.popArgs(this.frame, Type.DOUBLE);
                    break;
                case 148:
                    this.machine.popArgs(this.frame, Type.LONG, Type.LONG);
                    break;
                case 149:
                case 150:
                    this.machine.popArgs(this.frame, Type.FLOAT, Type.FLOAT);
                    break;
                case 151:
                case 152:
                    this.machine.popArgs(this.frame, Type.DOUBLE, Type.DOUBLE);
                    break;
                case 172:
                    Type typePeekType2 = type == Type.OBJECT ? this.frame.getStack().peekType(0) : type;
                    this.machine.popArgs(this.frame, type);
                    checkReturnType(typePeekType2);
                    break;
                case 177:
                    this.machine.clearArgs();
                    checkReturnType(Type.VOID);
                    break;
                case 190:
                    Type typePeekType3 = this.frame.getStack().peekType(0);
                    if (!typePeekType3.isArrayOrKnownNull()) {
                        this.this$0.fail(new StringBuffer().append("type mismatch: expected array type but encountered ").append(typePeekType3.toHuman()).toString());
                    }
                    this.machine.popArgs(this.frame, Type.OBJECT);
                    break;
                case 191:
                case 194:
                case 195:
                    this.machine.popArgs(this.frame, Type.OBJECT);
                    break;
                default:
                    visitInvalid(i, i2, i3);
                    return;
            }
            this.machine.auxType(type);
            this.machine.mo7135run(this.frame, i2, i);
        }

        private void checkReturnType(Type type) {
            Type returnType = this.machine.getPrototype().getReturnType();
            if (Merger.isPossiblyAssignableFrom(returnType, type)) {
                return;
            }
            this.this$0.fail(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("return type mismatch: prototype ").append("indicates ").toString()).append(returnType.toHuman()).toString()).append(", but encountered type ").toString()).append(type.toHuman()).toString());
        }

        @Override
        public void visitLocal(int i, int i2, int i3, int i4, Type type, int i5) {
            Type type2;
            LocalVariableList.Item itemPcAndIndexToLocal = this.this$0.localVariables.pcAndIndexToLocal(i == 54 ? i2 + i3 : i2, i4);
            if (itemPcAndIndexToLocal != null) {
                Type type3 = itemPcAndIndexToLocal.getType();
                if (type3.getBasicFrameType() != type.getBasicFrameType()) {
                    type2 = type;
                    itemPcAndIndexToLocal = (LocalVariableList.Item) null;
                } else {
                    type2 = type3;
                }
            } else {
                type2 = type;
            }
            switch (i) {
                case 21:
                case 169:
                    this.machine.localArg(this.frame, i4);
                    this.machine.localInfo(itemPcAndIndexToLocal != null);
                    this.machine.auxType(type);
                    break;
                case 54:
                    LocalItem localItem = itemPcAndIndexToLocal == null ? (LocalItem) null : itemPcAndIndexToLocal.getLocalItem();
                    this.machine.popArgs(this.frame, type);
                    this.machine.auxType(type);
                    this.machine.localTarget(i4, type2, localItem);
                    break;
                case 132:
                    LocalItem localItem2 = itemPcAndIndexToLocal == null ? (LocalItem) null : itemPcAndIndexToLocal.getLocalItem();
                    this.machine.localArg(this.frame, i4);
                    this.machine.localTarget(i4, type2, localItem2);
                    this.machine.auxType(type);
                    this.machine.auxIntArg(i5);
                    this.machine.auxCstArg(CstInteger.make(i5));
                    break;
                default:
                    visitInvalid(i, i2, i3);
                    return;
            }
            this.machine.mo7135run(this.frame, i2, i);
        }

        @Override
        public void visitConstant(int i, int i2, int i3, Constant constant, int i4) {
            Constant methodRef;
            switch (i) {
                case 18:
                case 19:
                    if ((constant instanceof CstMethodHandle) || (constant instanceof CstProtoRef)) {
                        this.this$0.checkConstMethodHandleSupported(constant);
                    }
                    this.machine.clearArgs();
                    break;
                case 179:
                    this.machine.popArgs(this.frame, ((CstFieldRef) constant).getType());
                    break;
                case 180:
                case 192:
                case 193:
                    this.machine.popArgs(this.frame, Type.OBJECT);
                    break;
                case 181:
                    this.machine.popArgs(this.frame, Type.OBJECT, ((CstFieldRef) constant).getType());
                    break;
                case 182:
                case 183:
                case 184:
                case 185:
                    if (constant instanceof CstInterfaceMethodRef) {
                        methodRef = ((CstInterfaceMethodRef) constant).toMethodRef();
                        this.this$0.checkInvokeInterfaceSupported(i, (CstMethodRef) methodRef);
                    } else {
                        methodRef = constant;
                    }
                    if ((methodRef instanceof CstMethodRef) && ((CstMethodRef) methodRef).isSignaturePolymorphic()) {
                        this.this$0.checkInvokeSignaturePolymorphic(i);
                    }
                    this.machine.popArgs(this.frame, ((CstMethodRef) methodRef).getPrototype(i == 184));
                    constant = methodRef;
                    break;
                case 186:
                    this.this$0.checkInvokeDynamicSupported(i);
                    CstInvokeDynamic cstInvokeDynamic = (CstInvokeDynamic) constant;
                    this.machine.popArgs(this.frame, cstInvokeDynamic.getPrototype());
                    constant = cstInvokeDynamic.addReference();
                    break;
                case 189:
                    this.machine.popArgs(this.frame, Type.f5078INT);
                    break;
                case 197:
                    this.machine.popArgs(this.frame, Prototype.internInts(Type.VOID, i4));
                    break;
                default:
                    this.machine.clearArgs();
                    break;
            }
            this.machine.auxIntArg(i4);
            this.machine.auxCstArg(constant);
            this.machine.mo7135run(this.frame, i2, i);
        }

        @Override
        public void visitBranch(int i, int i2, int i3, int i4) {
            switch (i) {
                case 153:
                case 154:
                case 155:
                case 156:
                case 157:
                case 158:
                    this.machine.popArgs(this.frame, Type.f5078INT);
                    break;
                case 159:
                case 160:
                case 161:
                case 162:
                case 163:
                case 164:
                    this.machine.popArgs(this.frame, Type.f5078INT, Type.f5078INT);
                    break;
                case 165:
                case 166:
                    this.machine.popArgs(this.frame, Type.OBJECT, Type.OBJECT);
                    break;
                case 167:
                case 168:
                case 200:
                case 201:
                    this.machine.clearArgs();
                    break;
                case 169:
                case 170:
                case 171:
                case 172:
                case 173:
                case 174:
                case 175:
                case 176:
                case 177:
                case 178:
                case 179:
                case 180:
                case 181:
                case 182:
                case 183:
                case 184:
                case 185:
                case 186:
                case 187:
                case 188:
                case 189:
                case 190:
                case 191:
                case 192:
                case 193:
                case 194:
                case 195:
                case 196:
                case 197:
                default:
                    visitInvalid(i, i2, i3);
                    return;
                case 198:
                case 199:
                    this.machine.popArgs(this.frame, Type.OBJECT);
                    break;
            }
            this.machine.auxTargetArg(i4);
            this.machine.mo7135run(this.frame, i2, i);
        }

        @Override
        public void visitSwitch(int i, int i2, int i3, SwitchList switchList, int i4) {
            this.machine.popArgs(this.frame, Type.f5078INT);
            this.machine.auxIntArg(i4);
            this.machine.auxSwitchArg(switchList);
            this.machine.mo7135run(this.frame, i2, i);
        }

        @Override
        public void visitNewarray(int i, int i2, CstType cstType, ArrayList<Constant> arrayList) {
            this.machine.popArgs(this.frame, Type.f5078INT);
            this.machine.auxInitValues(arrayList);
            this.machine.auxCstArg(cstType);
            this.machine.mo7135run(this.frame, i, 188);
        }

        @Override
        public void setPreviousOffset(int i) {
            this.previousOffset = i;
        }

        @Override
        public int getPreviousOffset() {
            return this.previousOffset;
        }
    }

    public void checkConstMethodHandleSupported(Constant constant) {
        if (this.dexOptions.apiIsSupported(28)) {
            return;
        }
        fail(String.format(new StringBuffer().append("invalid constant type %s requires --min-sdk-version >= %d ").append("(currently %d)").toString(), constant.typeName(), new Integer(28), new Integer(this.dexOptions.minSdkVersion)));
    }

    public void checkInvokeDynamicSupported(int i) {
        if (this.dexOptions.apiIsSupported(26)) {
            return;
        }
        fail(String.format(new StringBuffer().append("invalid opcode %02x - invokedynamic requires ").append("--min-sdk-version >= %d (currently %d)").toString(), new Integer(i), new Integer(26), new Integer(this.dexOptions.minSdkVersion)));
    }

    public void checkInvokeInterfaceSupported(int i, CstMethodRef cstMethodRef) {
        boolean zApiIsSupported;
        if (i != 185 && !this.dexOptions.apiIsSupported(24)) {
            boolean z = this.dexOptions.allowAllInterfaceMethodInvokes;
            if (i == 184) {
                zApiIsSupported = z & this.dexOptions.apiIsSupported(21);
            } else {
                if (!$assertionsDisabled && i != 183 && i != 182) {
                    throw new AssertionError();
                }
                zApiIsSupported = z;
            }
            String str = i == 184 ? "static" : "default";
            if (zApiIsSupported) {
                warn(String.format(new StringBuffer().append("invoking a %s interface method %s.%s strictly requires ").append("--min-sdk-version >= %d (experimental at current API level %d)").toString(), str, cstMethodRef.getDefiningClass().toHuman(), cstMethodRef.getNat().toHuman(), new Integer(24), new Integer(this.dexOptions.minSdkVersion)));
            } else {
                fail(String.format(new StringBuffer().append("invoking a %s interface method %s.%s strictly requires ").append("--min-sdk-version >= %d (blocked at current API level %d)").toString(), str, cstMethodRef.getDefiningClass().toHuman(), cstMethodRef.getNat().toHuman(), new Integer(24), new Integer(this.dexOptions.minSdkVersion)));
            }
        }
    }

    private void checkInterfaceMethodDeclaration(ConcreteMethod concreteMethod) {
        if (this.dexOptions.apiIsSupported(24)) {
            return;
        }
        String string = new StringBuffer().append("defining a %s interface method requires --min-sdk-version >= %d (currently %d)").append(" for interface methods: %s.%s").toString();
        Object[] objArr = new Object[5];
        objArr[0] = concreteMethod.isStaticMethod() ? "static" : "default";
        objArr[1] = new Integer(24);
        objArr[2] = new Integer(this.dexOptions.minSdkVersion);
        objArr[3] = concreteMethod.getDefiningClass().toHuman();
        objArr[4] = concreteMethod.getNat().toHuman();
        warn(String.format(string, objArr));
    }

    public void checkInvokeSignaturePolymorphic(int i) {
        if (!this.dexOptions.apiIsSupported(26)) {
            fail(String.format("invoking a signature-polymorphic requires --min-sdk-version >= %d (currently %d)", new Integer(26), new Integer(this.dexOptions.minSdkVersion)));
        } else if (i != 182) {
            fail(new StringBuffer().append(new StringBuffer().append("Unsupported signature polymorphic invocation (").append(ByteOps.opName(i)).toString()).append(")").toString());
        }
    }

    public void fail(String str) {
        throw new SimException(String.format("ERROR in %s.%s: %s", this.method.getDefiningClass().toHuman(), this.method.getNat().toHuman(), str));
    }

    private void warn(String str) {
        this.dexOptions.f5022err.println(String.format("WARNING in %s.%s: %s", this.method.getDefiningClass().toHuman(), this.method.getNat().toHuman(), str));
    }
}
