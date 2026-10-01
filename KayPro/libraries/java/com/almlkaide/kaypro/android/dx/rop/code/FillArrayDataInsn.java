package com.almlkaide.kaypro.android.dx.rop.code;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.type.StdTypeList;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeList;
import java.util.ArrayList;

public final class FillArrayDataInsn extends Insn {
    private final Constant arrayType;
    private final ArrayList<Constant> initValues;

    public FillArrayDataInsn(Rop c1681Rop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, ArrayList<Constant> arrayList, Constant constant) {
        super(c1681Rop, sourcePosition, (RegisterSpec) null, registerSpecList);
        if (c1681Rop.getBranchingness() != 1) {
            throw new IllegalArgumentException(new StringBuffer().append("opcode with invalid branchingness: ").append(c1681Rop.getBranchingness()).toString());
        }
        this.initValues = arrayList;
        this.arrayType = constant;
    }

    @Override
    public TypeList getCatches() {
        return StdTypeList.EMPTY;
    }

    public ArrayList<Constant> getInitValues() {
        return this.initValues;
    }

    public Constant getConstant() {
        return this.arrayType;
    }

    @Override
    public void accept(Insn.Visitor visitor) {
        visitor.visitFillArrayDataInsn(this);
    }

    @Override
    public Insn withAddedCatch(Type type) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override
    public Insn withRegisterOffset(int i) {
        return new FillArrayDataInsn(getOpcode(), getPosition(), getSources().withOffset(i), this.initValues, this.arrayType);
    }

    @Override
    public Insn withNewRegisters(RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        return new FillArrayDataInsn(getOpcode(), getPosition(), registerSpecList, this.initValues, this.arrayType);
    }
}
