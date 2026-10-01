package com.almlkaide.kaypro.android.dx.rop.code;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.type.StdTypeList;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeList;

public final class PlainCstInsn extends CstInsn {
    public PlainCstInsn(Rop c1681Rop, SourcePosition sourcePosition, RegisterSpec registerSpec, RegisterSpecList registerSpecList, Constant constant) {
        super(c1681Rop, sourcePosition, registerSpec, registerSpecList, constant);
        if (c1681Rop.getBranchingness() != 1) {
            throw new IllegalArgumentException(new StringBuffer().append("opcode with invalid branchingness: ").append(c1681Rop.getBranchingness()).toString());
        }
    }

    @Override
    public TypeList getCatches() {
        return StdTypeList.EMPTY;
    }

    @Override
    public void accept(Insn.Visitor visitor) {
        visitor.visitPlainCstInsn(this);
    }

    @Override
    public Insn withAddedCatch(Type type) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override
    public Insn withRegisterOffset(int i) {
        return new PlainCstInsn(getOpcode(), getPosition(), getResult().withOffset(i), getSources().withOffset(i), getConstant());
    }

    @Override
    public Insn withNewRegisters(RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        return new PlainCstInsn(getOpcode(), getPosition(), registerSpec, registerSpecList, getConstant());
    }
}
