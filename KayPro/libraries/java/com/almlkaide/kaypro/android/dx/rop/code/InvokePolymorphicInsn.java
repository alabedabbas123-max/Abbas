package com.almlkaide.kaypro.android.dx.rop.code;

import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstNat;
import com.almlkaide.kaypro.android.dx.rop.cst.CstProtoRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeList;

public class InvokePolymorphicInsn extends Insn {
    private final CstMethodRef callSiteMethod;
    private final CstProtoRef callSiteProto;
    private final TypeList catches;
    private final CstMethodRef polymorphicMethod;
    private static final CstString DEFAULT_DESCRIPTOR = new CstString("([Ljava/lang/Object;)Ljava/lang/Object;");
    private static final CstString VARHANDLE_SET_DESCRIPTOR = new CstString("([Ljava/lang/Object;)V");
    private static final CstString VARHANDLE_COMPARE_AND_SET_DESCRIPTOR = new CstString("([Ljava/lang/Object;)Z");

    public InvokePolymorphicInsn(Rop c1681Rop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, TypeList typeList, CstMethodRef cstMethodRef) {
        super(c1681Rop, sourcePosition, (RegisterSpec) null, registerSpecList);
        if (c1681Rop.getBranchingness() != 6) {
            throw new IllegalArgumentException(new StringBuffer().append("opcode with invalid branchingness: ").append(c1681Rop.getBranchingness()).toString());
        }
        if (typeList == null) {
            throw new NullPointerException("catches == null");
        }
        this.catches = typeList;
        if (cstMethodRef == null) {
            throw new NullPointerException("callSiteMethod == null");
        }
        if (!cstMethodRef.isSignaturePolymorphic()) {
            throw new IllegalArgumentException("callSiteMethod is not signature polymorphic");
        }
        this.callSiteMethod = cstMethodRef;
        this.polymorphicMethod = makePolymorphicMethod(cstMethodRef);
        this.callSiteProto = makeCallSiteProto(cstMethodRef);
    }

    @Override
    public TypeList getCatches() {
        return this.catches;
    }

    @Override
    public void accept(Insn.Visitor visitor) {
        visitor.visitInvokePolymorphicInsn(this);
    }

    @Override
    public Insn withAddedCatch(Type type) {
        return new InvokePolymorphicInsn(getOpcode(), getPosition(), getSources(), this.catches.withAddedType(type), getCallSiteMethod());
    }

    @Override
    public Insn withRegisterOffset(int i) {
        return new InvokePolymorphicInsn(getOpcode(), getPosition(), getSources().withOffset(i), this.catches, getCallSiteMethod());
    }

    @Override
    public Insn withNewRegisters(RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        return new InvokePolymorphicInsn(getOpcode(), getPosition(), registerSpecList, this.catches, getCallSiteMethod());
    }

    public CstMethodRef getCallSiteMethod() {
        return this.callSiteMethod;
    }

    public CstMethodRef getPolymorphicMethod() {
        return this.polymorphicMethod;
    }

    public CstProtoRef getCallSiteProto() {
        return this.callSiteProto;
    }

    @Override
    public String getInlineString() {
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(getPolymorphicMethod().toString()).append(" ").toString()).append(getCallSiteProto().toString()).toString()).append(" ").toString()).append(ThrowingInsn.toCatchString(this.catches)).toString();
    }

    private static CstMethodRef makePolymorphicMethod(CstMethodRef cstMethodRef) {
        CstType definingClass = cstMethodRef.getDefiningClass();
        CstString name = cstMethodRef.getNat().getName();
        String string = cstMethodRef.getNat().getName().getString();
        if (definingClass.equals(CstType.METHOD_HANDLE) && (string.equals("invoke") || string.equals("invokeExact"))) {
            return new CstMethodRef(definingClass, new CstNat(name, DEFAULT_DESCRIPTOR));
        }
        if (definingClass.equals(CstType.VAR_HANDLE)) {
            if (!string.equals("compareAndExchange") && !string.equals("compareAndExchangeAcquire") && !string.equals("compareAndExchangeRelease") && !string.equals("get") && !string.equals("getAcquire") && !string.equals("getAndAdd") && !string.equals("getAndAddAcquire") && !string.equals("getAndAddRelease") && !string.equals("getAndBitwiseAnd") && !string.equals("getAndBitwiseAndAcquire") && !string.equals("getAndBitwiseAndRelease") && !string.equals("getAndBitwiseOr") && !string.equals("getAndBitwiseOrAcquire") && !string.equals("getAndBitwiseOrRelease") && !string.equals("getAndBitwiseXor") && !string.equals("getAndBitwiseXorAcquire") && !string.equals("getAndBitwiseXorRelease") && !string.equals("getAndSet") && !string.equals("getAndSetAcquire") && !string.equals("getAndSetRelease") && !string.equals("getOpaque") && !string.equals("getVolatile")) {
                if (!string.equals("set") && !string.equals("setOpaque") && !string.equals("setRelease") && !string.equals("setVolatile")) {
                    if (string.equals("compareAndSet") || string.equals("weakCompareAndSet") || string.equals("weakCompareAndSetAcquire") || string.equals("weakCompareAndSetPlain") || string.equals("weakCompareAndSetRelease")) {
                        return new CstMethodRef(definingClass, new CstNat(name, VARHANDLE_COMPARE_AND_SET_DESCRIPTOR));
                    }
                } else {
                    return new CstMethodRef(definingClass, new CstNat(name, VARHANDLE_SET_DESCRIPTOR));
                }
            } else {
                return new CstMethodRef(definingClass, new CstNat(name, DEFAULT_DESCRIPTOR));
            }
        }
        throw new IllegalArgumentException(new StringBuffer().append("Unknown signature polymorphic method: ").append(cstMethodRef.toHuman()).toString());
    }

    private static CstProtoRef makeCallSiteProto(CstMethodRef cstMethodRef) {
        return new CstProtoRef(cstMethodRef.getPrototype(true));
    }
}
