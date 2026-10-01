package com.almlkaide.kaypro.android.dx.rop.code;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeList;

public final class ThrowingCstInsn extends CstInsn {
    private final TypeList catches;

    public ThrowingCstInsn(Rop c1681Rop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, TypeList typeList, Constant constant) {
        super(c1681Rop, sourcePosition, (RegisterSpec) null, registerSpecList, constant);
        if (c1681Rop.getBranchingness() != 6) {
            throw new IllegalArgumentException(new StringBuffer().append("opcode with invalid branchingness: ").append(c1681Rop.getBranchingness()).toString());
        }
        if (typeList == null) {
            throw new NullPointerException("catches == null");
        }
        this.catches = typeList;
    }

    @Override
    public String getInlineString() {
        Constant constant = getConstant();
        return new StringBuffer().append(new StringBuffer().append(constant instanceof CstString ? ((CstString) constant).toQuoted() : constant.toHuman()).append(" ").toString()).append(ThrowingInsn.toCatchString(this.catches)).toString();
    }

    @Override
    public TypeList getCatches() {
        return this.catches;
    }

    @Override
    public void accept(Insn.Visitor visitor) {
        visitor.visitThrowingCstInsn(this);
    }

    @Override
    public Insn withAddedCatch(Type type) {
        return new ThrowingCstInsn(getOpcode(), getPosition(), getSources(), this.catches.withAddedType(type), getConstant());
    }

    @Override
    public Insn withRegisterOffset(int i) {
        return new ThrowingCstInsn(getOpcode(), getPosition(), getSources().withOffset(i), this.catches, getConstant());
    }

    @Override
    public Insn withNewRegisters(RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        return new ThrowingCstInsn(getOpcode(), getPosition(), registerSpecList, this.catches, getConstant());
    }
}
