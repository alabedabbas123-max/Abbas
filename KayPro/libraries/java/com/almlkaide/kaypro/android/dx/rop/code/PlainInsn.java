package com.almlkaide.kaypro.android.dx.rop.code;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInteger;
import com.almlkaide.kaypro.android.dx.rop.type.StdTypeList;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeBearer;
import com.almlkaide.kaypro.android.dx.rop.type.TypeList;

public final class PlainInsn extends Insn {
    public PlainInsn(Rop c1681Rop, SourcePosition sourcePosition, RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        super(c1681Rop, sourcePosition, registerSpec, registerSpecList);
        switch (c1681Rop.getBranchingness()) {
            case 5:
            case 6:
                throw new IllegalArgumentException(new StringBuffer().append("opcode with invalid branchingness: ").append(c1681Rop.getBranchingness()).toString());
            default:
                if (registerSpec == null || c1681Rop.getBranchingness() == 1) {
                    return;
                } else {
                    throw new IllegalArgumentException("can't mix branchingness with result");
                }
        }
    }

    public PlainInsn(Rop c1681Rop, SourcePosition sourcePosition, RegisterSpec registerSpec, RegisterSpec registerSpec2) {
        this(c1681Rop, sourcePosition, registerSpec, RegisterSpecList.make(registerSpec2));
    }

    @Override
    public TypeList getCatches() {
        return StdTypeList.EMPTY;
    }

    @Override
    public void accept(Insn.Visitor visitor) {
        visitor.visitPlainInsn(this);
    }

    @Override
    public Insn withAddedCatch(Type type) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override
    public Insn withRegisterOffset(int i) {
        return new PlainInsn(getOpcode(), getPosition(), getResult().withOffset(i), getSources().withOffset(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public Insn withSourceLiteral() {
        Constant constantMake;
        RegisterSpecList sources = getSources();
        int size = sources.size();
        if (size != 0) {
            TypeBearer typeBearer = sources.m7188get(size - 1).getTypeBearer();
            if (!typeBearer.isConstant()) {
                TypeBearer typeBearer2 = sources.m7188get(0).getTypeBearer();
                if (size == 2 && typeBearer2.isConstant()) {
                    Constant constant = (Constant) typeBearer2;
                    RegisterSpecList registerSpecListWithoutFirst = sources.withoutFirst();
                    return new PlainCstInsn(Rops.ropFor(getOpcode().getOpcode(), getResult(), registerSpecListWithoutFirst, constant), getPosition(), getResult(), registerSpecListWithoutFirst, constant);
                }
                return this;
            }
            Constant constant2 = (Constant) typeBearer;
            RegisterSpecList registerSpecListWithoutLast = sources.withoutLast();
            try {
                int opcode = getOpcode().getOpcode();
                if (opcode == 15 && (constant2 instanceof CstInteger)) {
                    opcode = 14;
                    constantMake = CstInteger.make(-((CstInteger) constant2).getValue());
                } else {
                    constantMake = constant2;
                }
                return new PlainCstInsn(Rops.ropFor(opcode, getResult(), registerSpecListWithoutLast, constantMake), getPosition(), getResult(), registerSpecListWithoutLast, constantMake);
            } catch (IllegalArgumentException e) {
                return this;
            }
        }
        return this;
    }

    @Override
    public Insn withNewRegisters(RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        return new PlainInsn(getOpcode(), getPosition(), registerSpec, registerSpecList);
    }
}
