package com.almlkaide.kaypro.android.dx.cf.code;

import com.almlkaide.kaypro.android.dx.cf.iface.Method;
import com.almlkaide.kaypro.android.dx.cf.iface.MethodList;
import com.almlkaide.kaypro.android.dx.rop.code.AccessFlags;
import com.almlkaide.kaypro.android.dx.rop.code.Rop;
import com.almlkaide.kaypro.android.dx.rop.code.FillArrayDataInsn;
import com.almlkaide.kaypro.android.dx.rop.code.Insn;
import com.almlkaide.kaypro.android.dx.rop.code.InvokePolymorphicInsn;
import com.almlkaide.kaypro.android.dx.rop.code.PlainCstInsn;
import com.almlkaide.kaypro.android.dx.rop.code.PlainInsn;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.Rops;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;
import com.almlkaide.kaypro.android.dx.rop.code.SwitchInsn;
import com.almlkaide.kaypro.android.dx.rop.code.ThrowingCstInsn;
import com.almlkaide.kaypro.android.dx.rop.code.ThrowingInsn;
import com.almlkaide.kaypro.android.dx.rop.code.TranslationAdvice;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstCallSiteRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstFieldRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInteger;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstNat;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeBearer;
import com.almlkaide.kaypro.android.dx.rop.type.TypeList;
import com.almlkaide.kaypro.android.dx.util.IntList;
import java.util.ArrayList;

final class RopperMachine extends ValueAwareMachine {
    private static final CstType ARRAY_REFLECT_TYPE = new CstType(Type.internClassName("java/lang/reflect/Array"));
    private static final CstMethodRef MULTIANEWARRAY_METHOD = new CstMethodRef(ARRAY_REFLECT_TYPE, new CstNat(new CstString("newInstance"), new CstString(new StringBuffer().append("(Ljava/lang/Class;[I)").append("Ljava/lang/Object;").toString())));
    private final TranslationAdvice advice;
    private boolean blockCanThrow;
    private TypeList catches;
    private boolean catchesUsed;
    private int extraBlockCount;
    private boolean hasJsr;
    private final ArrayList<Insn> insns;
    private final int maxLocals;
    private final ConcreteMethod method;
    private final MethodList methods;
    private int primarySuccessorIndex;
    private ReturnAddress returnAddress;
    private Rop returnOp;
    private SourcePosition returnPosition;
    private boolean returns;
    private final Ropper ropper;

    public RopperMachine(Ropper ropper, ConcreteMethod concreteMethod, TranslationAdvice translationAdvice, MethodList methodList) {
        super(concreteMethod.getEffectiveDescriptor());
        if (methodList == null) {
            throw new NullPointerException("methods == null");
        }
        if (ropper == null) {
            throw new NullPointerException("ropper == null");
        }
        if (translationAdvice == null) {
            throw new NullPointerException("advice == null");
        }
        this.ropper = ropper;
        this.method = concreteMethod;
        this.methods = methodList;
        this.advice = translationAdvice;
        this.maxLocals = concreteMethod.getMaxLocals();
        this.insns = new ArrayList<>(25);
        this.catches = (TypeList) null;
        this.catchesUsed = false;
        this.returns = false;
        this.primarySuccessorIndex = -1;
        this.extraBlockCount = 0;
        this.blockCanThrow = false;
        this.returnOp = (Rop) null;
        this.returnPosition = (SourcePosition) null;
    }

    public ArrayList<Insn> getInsns() {
        return this.insns;
    }

    public Rop getReturnOp() {
        return this.returnOp;
    }

    public SourcePosition getReturnPosition() {
        return this.returnPosition;
    }

    public void startBlock(TypeList typeList) {
        this.catches = typeList;
        this.insns.clear();
        this.catchesUsed = false;
        this.returns = false;
        this.primarySuccessorIndex = 0;
        this.extraBlockCount = 0;
        this.blockCanThrow = false;
        this.hasJsr = false;
        this.returnAddress = (ReturnAddress) null;
    }

    public boolean wereCatchesUsed() {
        return this.catchesUsed;
    }

    public boolean returns() {
        return this.returns;
    }

    public int getPrimarySuccessorIndex() {
        return this.primarySuccessorIndex;
    }

    public int getExtraBlockCount() {
        return this.extraBlockCount;
    }

    public boolean canThrow() {
        return this.blockCanThrow;
    }

    public boolean hasJsr() {
        return this.hasJsr;
    }

    public boolean hasRet() {
        return this.returnAddress != null;
    }

    public ReturnAddress getReturnAddress() {
        return this.returnAddress;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x03ac  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void mo7135run(Frame frame, int i, int i2) {
        RegisterSpecList registerSpecListMake;
        Insn plainInsn;
        RegisterSpec registerSpec;
        Rop c1681RopRopFor;
        Constant constantIntern;
        Constant constant;
        RegisterSpecList registerSpecListWithoutFirst;
        int i3;
        Constant constantMake;
        Insn plainInsn2;
        Insn plainCstInsn;
        Type returnType;
        ThrowingCstInsn throwingCstInsn;
        int size = frame.getStack().size() + this.maxLocals;
        RegisterSpecList sources = getSources(i2, size);
        int size2 = sources.size();
        super.mo7135run(frame, i, i2);
        SourcePosition sourcePositionMakeSourcePosistion = this.method.makeSourcePosistion(i);
        RegisterSpec localTarget = getLocalTarget(i2 == 54);
        int iResultCount = resultCount();
        if (iResultCount == 0) {
            RegisterSpec registerSpec2 = (RegisterSpec) null;
            switch (i2) {
                case 87:
                case 88:
                    return;
                default:
                    localTarget = registerSpec2;
                    break;
            }
        } else if (localTarget == null) {
            if (iResultCount == 1) {
                localTarget = RegisterSpec.make(size, result(0));
            } else {
                int firstTempStackReg = this.ropper.getFirstTempStackReg();
                RegisterSpec[] registerSpecArr = new RegisterSpec[size2];
                for (int i4 = 0; i4 < size2; i4++) {
                    RegisterSpec registerSpecM7188get = sources.m7188get(i4);
                    TypeBearer typeBearer = registerSpecM7188get.getTypeBearer();
                    RegisterSpec registerSpecWithReg = registerSpecM7188get.withReg(firstTempStackReg);
                    this.insns.add(new PlainInsn(Rops.opMove(typeBearer), sourcePositionMakeSourcePosistion, registerSpecWithReg, registerSpecM7188get));
                    registerSpecArr[i4] = registerSpecWithReg;
                    firstTempStackReg += registerSpecM7188get.getCategory();
                }
                for (int auxInt = getAuxInt(); auxInt != 0; auxInt >>= 4) {
                    RegisterSpec registerSpec3 = registerSpecArr[(auxInt & 15) - 1];
                    TypeBearer typeBearer2 = registerSpec3.getTypeBearer();
                    this.insns.add(new PlainInsn(Rops.opMove(typeBearer2), sourcePositionMakeSourcePosistion, registerSpec3.withReg(size), registerSpec3));
                    size += typeBearer2.getType().getCategory();
                }
                return;
            }
        }
        TypeBearer typeBearer3 = localTarget != null ? localTarget : Type.VOID;
        Constant auxCst = getAuxCst();
        if (i2 == 197) {
            this.blockCanThrow = true;
            this.extraBlockCount = 6;
            RegisterSpec registerSpecMake = RegisterSpec.make(localTarget.getNextReg(), Type.INT_ARRAY);
            this.insns.add(new ThrowingCstInsn(Rops.opFilledNewArray(Type.INT_ARRAY, size2), sourcePositionMakeSourcePosistion, sources, this.catches, CstType.INT_ARRAY));
            this.insns.add(new PlainInsn(Rops.opMoveResult(Type.INT_ARRAY), sourcePositionMakeSourcePosistion, registerSpecMake, RegisterSpecList.EMPTY));
            int i5 = 0;
            Type classType = ((CstType) auxCst).getClassType();
            while (i5 < size2) {
                i5++;
                classType = classType.getComponentType();
            }
            RegisterSpec registerSpecMake2 = RegisterSpec.make(localTarget.getReg(), Type.CLASS);
            if (classType.isPrimitive()) {
                throwingCstInsn = new ThrowingCstInsn(Rops.GET_STATIC_OBJECT, sourcePositionMakeSourcePosistion, RegisterSpecList.EMPTY, this.catches, CstFieldRef.forPrimitiveType(classType));
            } else {
                throwingCstInsn = new ThrowingCstInsn(Rops.CONST_OBJECT, sourcePositionMakeSourcePosistion, RegisterSpecList.EMPTY, this.catches, new CstType(classType));
            }
            this.insns.add(throwingCstInsn);
            this.insns.add(new PlainInsn(Rops.opMoveResultPseudo(registerSpecMake2.getType()), sourcePositionMakeSourcePosistion, registerSpecMake2, RegisterSpecList.EMPTY));
            RegisterSpec registerSpecMake3 = RegisterSpec.make(localTarget.getReg(), Type.OBJECT);
            this.insns.add(new ThrowingCstInsn(Rops.opInvokeStatic(MULTIANEWARRAY_METHOD.getPrototype()), sourcePositionMakeSourcePosistion, RegisterSpecList.make(registerSpecMake2, registerSpecMake), this.catches, MULTIANEWARRAY_METHOD));
            this.insns.add(new PlainInsn(Rops.opMoveResult(MULTIANEWARRAY_METHOD.getPrototype().getReturnType()), sourcePositionMakeSourcePosistion, registerSpecMake3, RegisterSpecList.EMPTY));
            i2 = 192;
            registerSpecListMake = RegisterSpecList.make(registerSpecMake3);
        } else if (i2 == 168) {
            this.hasJsr = true;
            return;
        } else {
            if (i2 == 169) {
                try {
                    this.returnAddress = (ReturnAddress) m7114arg(0);
                    return;
                } catch (ClassCastException e) {
                    throw new RuntimeException("Argument to RET was not a ReturnAddress", e);
                }
            }
            registerSpecListMake = sources;
        }
        int iJopToRopOpcode = jopToRopOpcode(i2, auxCst);
        Rop c1681RopRopFor2 = Rops.ropFor(iJopToRopOpcode, typeBearer3, registerSpecListMake, auxCst);
        Insn insn = (Insn) null;
        if (localTarget != null && c1681RopRopFor2.isCallLike()) {
            this.extraBlockCount++;
            if (c1681RopRopFor2.getOpcode() == 59) {
                returnType = ((CstCallSiteRef) auxCst).getReturnType();
            } else {
                returnType = ((CstMethodRef) auxCst).getPrototype().getReturnType();
            }
            plainInsn = new PlainInsn(Rops.opMoveResult(returnType), sourcePositionMakeSourcePosistion, localTarget, RegisterSpecList.EMPTY);
            registerSpec = (RegisterSpec) null;
        } else if (localTarget == null || !c1681RopRopFor2.canThrow()) {
            plainInsn = insn;
            registerSpec = localTarget;
        } else {
            this.extraBlockCount++;
            plainInsn = new PlainInsn(Rops.opMoveResultPseudo(localTarget.getTypeBearer()), sourcePositionMakeSourcePosistion, localTarget, RegisterSpecList.EMPTY);
            registerSpec = (RegisterSpec) null;
        }
        if (iJopToRopOpcode == 41) {
            c1681RopRopFor = c1681RopRopFor2;
            constantIntern = CstType.intern(c1681RopRopFor2.getResult());
        } else if (auxCst == null && size2 == 2) {
            TypeBearer typeBearer4 = registerSpecListMake.m7188get(0).getTypeBearer();
            TypeBearer typeBearer5 = registerSpecListMake.m7188get(1).getTypeBearer();
            if ((typeBearer5.isConstant() || typeBearer4.isConstant()) && this.advice.hasConstantOperation(c1681RopRopFor2, registerSpecListMake.m7188get(0), registerSpecListMake.m7188get(1))) {
                if (typeBearer5.isConstant()) {
                    Constant constant2 = (Constant) typeBearer5;
                    registerSpecListWithoutFirst = registerSpecListMake.withoutLast();
                    if (c1681RopRopFor2.getOpcode() == 15) {
                        constantMake = CstInteger.make(-((CstInteger) typeBearer5).getValue());
                        i3 = 14;
                    } else {
                        i3 = iJopToRopOpcode;
                        constantMake = constant2;
                    }
                    iJopToRopOpcode = i3;
                    constant = constantMake;
                } else {
                    constant = (Constant) typeBearer4;
                    registerSpecListWithoutFirst = registerSpecListMake.withoutFirst();
                }
                c1681RopRopFor = Rops.ropFor(iJopToRopOpcode, typeBearer3, registerSpecListWithoutFirst, constant);
                constantIntern = constant;
                registerSpecListMake = registerSpecListWithoutFirst;
            } else {
                c1681RopRopFor = c1681RopRopFor2;
                constantIntern = auxCst;
            }
        } else {
            c1681RopRopFor = c1681RopRopFor2;
            constantIntern = auxCst;
        }
        SwitchList auxCases = getAuxCases();
        ArrayList<Constant> initValues = getInitValues();
        boolean zCanThrow = c1681RopRopFor.canThrow();
        this.blockCanThrow |= zCanThrow;
        if (auxCases != null) {
            if (auxCases.size() == 0) {
                PlainInsn plainInsn3 = new PlainInsn(Rops.GOTO, sourcePositionMakeSourcePosistion, (RegisterSpec) null, RegisterSpecList.EMPTY);
                this.primarySuccessorIndex = 0;
                plainInsn2 = plainInsn3;
            } else {
                IntList values = auxCases.getValues();
                plainInsn2 = new SwitchInsn(c1681RopRopFor, sourcePositionMakeSourcePosistion, registerSpec, registerSpecListMake, values);
                this.primarySuccessorIndex = values.size();
            }
        } else if (iJopToRopOpcode == 33) {
            if (registerSpecListMake.size() != 0) {
                RegisterSpec registerSpecM7188get2 = registerSpecListMake.m7188get(0);
                TypeBearer typeBearer6 = registerSpecM7188get2.getTypeBearer();
                if (registerSpecM7188get2.getReg() != 0) {
                    this.insns.add(new PlainInsn(Rops.opMove(typeBearer6), sourcePositionMakeSourcePosistion, RegisterSpec.make(0, typeBearer6), registerSpecM7188get2));
                }
            }
            PlainInsn plainInsn4 = new PlainInsn(Rops.GOTO, sourcePositionMakeSourcePosistion, (RegisterSpec) null, RegisterSpecList.EMPTY);
            this.primarySuccessorIndex = 0;
            updateReturnOp(c1681RopRopFor, sourcePositionMakeSourcePosistion);
            this.returns = true;
            plainInsn2 = plainInsn4;
        } else if (constantIntern != null) {
            if (zCanThrow) {
                if (c1681RopRopFor.getOpcode() == 58) {
                    plainCstInsn = makeInvokePolymorphicInsn(c1681RopRopFor, sourcePositionMakeSourcePosistion, registerSpecListMake, this.catches, constantIntern);
                } else {
                    plainCstInsn = new ThrowingCstInsn(c1681RopRopFor, sourcePositionMakeSourcePosistion, registerSpecListMake, this.catches, constantIntern);
                }
                this.catchesUsed = true;
                this.primarySuccessorIndex = this.catches.size();
            } else {
                plainCstInsn = new PlainCstInsn(c1681RopRopFor, sourcePositionMakeSourcePosistion, registerSpec, registerSpecListMake, constantIntern);
            }
            plainInsn2 = plainCstInsn;
        } else if (zCanThrow) {
            plainInsn2 = new ThrowingInsn(c1681RopRopFor, sourcePositionMakeSourcePosistion, registerSpecListMake, this.catches);
            this.catchesUsed = true;
            if (i2 == 191) {
                this.primarySuccessorIndex = -1;
            } else {
                this.primarySuccessorIndex = this.catches.size();
            }
        } else {
            plainInsn2 = new PlainInsn(c1681RopRopFor, sourcePositionMakeSourcePosistion, registerSpec, registerSpecListMake);
        }
        this.insns.add(plainInsn2);
        if (plainInsn != null) {
            this.insns.add(plainInsn);
        }
        if (initValues != null) {
            this.extraBlockCount++;
            this.insns.add(new FillArrayDataInsn(Rops.FILL_ARRAY_DATA, sourcePositionMakeSourcePosistion, RegisterSpecList.make(plainInsn.getResult()), initValues, constantIntern));
        }
    }

    private RegisterSpecList getSources(int i, int i2) {
        RegisterSpecList registerSpecList;
        int iArgCount = argCount();
        if (iArgCount == 0) {
            return RegisterSpecList.EMPTY;
        }
        int localIndex = getLocalIndex();
        if (localIndex >= 0) {
            registerSpecList = new RegisterSpecList(1);
            registerSpecList.m7189set(0, RegisterSpec.make(localIndex, m7114arg(0)));
        } else {
            registerSpecList = new RegisterSpecList(iArgCount);
            for (int i3 = 0; i3 < iArgCount; i3++) {
                RegisterSpec registerSpecMake = RegisterSpec.make(i2, m7114arg(i3));
                registerSpecList.m7189set(i3, registerSpecMake);
                i2 += registerSpecMake.getCategory();
            }
            switch (i) {
                case 79:
                    if (iArgCount != 3) {
                        throw new RuntimeException("shouldn't happen");
                    }
                    RegisterSpec registerSpecM7188get = registerSpecList.m7188get(0);
                    RegisterSpec registerSpecM7188get2 = registerSpecList.m7188get(1);
                    registerSpecList.m7189set(0, registerSpecList.m7188get(2));
                    registerSpecList.m7189set(1, registerSpecM7188get);
                    registerSpecList.m7189set(2, registerSpecM7188get2);
                    break;
                    break;
                case 181:
                    if (iArgCount != 2) {
                        throw new RuntimeException("shouldn't happen");
                    }
                    RegisterSpec registerSpecM7188get3 = registerSpecList.m7188get(0);
                    registerSpecList.m7189set(0, registerSpecList.m7188get(1));
                    registerSpecList.m7189set(1, registerSpecM7188get3);
                    break;
                    break;
            }
        }
        registerSpecList.setImmutable();
        return registerSpecList;
    }

    private void updateReturnOp(Rop c1681Rop, SourcePosition sourcePosition) {
        if (c1681Rop == null) {
            throw new NullPointerException("op == null");
        }
        if (sourcePosition == null) {
            throw new NullPointerException("pos == null");
        }
        if (this.returnOp == null) {
            this.returnOp = c1681Rop;
            this.returnPosition = sourcePosition;
        } else {
            if (this.returnOp != c1681Rop) {
                throw new SimException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("return op mismatch: ").append(c1681Rop).toString()).append(", ").toString()).append(this.returnOp).toString());
            }
            if (sourcePosition.getLine() > this.returnPosition.getLine()) {
                this.returnPosition = sourcePosition;
            }
        }
    }

    private int jopToRopOpcode(int i, Constant constant) {
        switch (i) {
            case 0:
                return 1;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case ByteOps.ISTORE_3:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 98:
            case 99:
            case 101:
            case 102:
            case 103:
            case 105:
            case 106:
            case 107:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 117:
            case 118:
            case 119:
            case 121:
            case 123:
            case 125:
            case 127:
            case 129:
            case 131:
            case 168:
            case 169:
            case 170:
            case 173:
            case 174:
            case 175:
            case 176:
            case 196:
            case 197:
            default:
                throw new RuntimeException("shouldn't happen");
            case 18:
            case 20:
                return 5;
            case 21:
            case 54:
                return 2;
            case 46:
                return 38;
            case 79:
                return 39;
            case 96:
            case 132:
                return 14;
            case 100:
                return 15;
            case 104:
                return 16;
            case 108:
                return 17;
            case 112:
                return 18;
            case 116:
                return 19;
            case 120:
                return 23;
            case 122:
                return 24;
            case 124:
                return 25;
            case 126:
                return 20;
            case 128:
                return 21;
            case 130:
                return 22;
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
                return 29;
            case 145:
                return 30;
            case 146:
                return 31;
            case 147:
                return 32;
            case 148:
            case 149:
            case 151:
                return 27;
            case 150:
            case 152:
                return 28;
            case 153:
            case 159:
            case 165:
            case 198:
                return 7;
            case 154:
            case 160:
            case 166:
            case 199:
                return 8;
            case 155:
            case 161:
                return 9;
            case 156:
            case 162:
                return 10;
            case 157:
            case 163:
                return 12;
            case 158:
            case 164:
                return 11;
            case 167:
                return 6;
            case 171:
                return 13;
            case 172:
            case 177:
                return 33;
            case 178:
                return 46;
            case 179:
                return 48;
            case 180:
                return 45;
            case 181:
                return 47;
            case 182:
                CstMethodRef cstMethodRef = (CstMethodRef) constant;
                if (cstMethodRef.getDefiningClass().equals(this.method.getDefiningClass())) {
                    for (int i2 = 0; i2 < this.methods.size(); i2++) {
                        Method methodMo7140get = this.methods.mo7140get(i2);
                        if (AccessFlags.isPrivate(methodMo7140get.getAccessFlags()) && cstMethodRef.getNat().equals(methodMo7140get.getNat())) {
                            return 52;
                        }
                    }
                }
                if (cstMethodRef.isSignaturePolymorphic()) {
                    return 58;
                }
                return 50;
            case 183:
                CstMethodRef cstMethodRef2 = (CstMethodRef) constant;
                return (cstMethodRef2.isInstanceInit() || cstMethodRef2.getDefiningClass().equals(this.method.getDefiningClass())) ? 52 : 51;
            case 184:
                return 49;
            case 185:
                return 53;
            case 186:
                return 59;
            case 187:
                return 40;
            case 188:
            case 189:
                return 41;
            case 190:
                return 34;
            case 191:
                return 35;
            case 192:
                return 43;
            case 193:
                return 44;
            case 194:
                return 36;
            case 195:
                return 37;
        }
    }

    private Insn makeInvokePolymorphicInsn(Rop c1681Rop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, TypeList typeList, Constant constant) {
        return new InvokePolymorphicInsn(c1681Rop, sourcePosition, registerSpecList, typeList, (CstMethodRef) constant);
    }
}
