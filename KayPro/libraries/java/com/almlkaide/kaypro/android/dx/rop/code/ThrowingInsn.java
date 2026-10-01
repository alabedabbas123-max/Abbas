package com.almlkaide.kaypro.android.dx.rop.code;

import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeList;

public final class ThrowingInsn extends Insn {
    private final TypeList catches;

    public static String toCatchString(TypeList typeList) {
        StringBuilder sb = new StringBuilder(100);
        sb.append("catch");
        int size = typeList.size();
        for (int i = 0; i < size; i++) {
            sb.append(" ");
            sb.append(typeList.getType(i).toHuman());
        }
        return sb.toString();
    }

    public ThrowingInsn(Rop c1681Rop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, TypeList typeList) {
        super(c1681Rop, sourcePosition, (RegisterSpec) null, registerSpecList);
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
        return toCatchString(this.catches);
    }

    @Override
    public TypeList getCatches() {
        return this.catches;
    }

    @Override
    public void accept(Insn.Visitor visitor) {
        visitor.visitThrowingInsn(this);
    }

    @Override
    public Insn withAddedCatch(Type type) {
        return new ThrowingInsn(getOpcode(), getPosition(), getSources(), this.catches.withAddedType(type));
    }

    @Override
    public Insn withRegisterOffset(int i) {
        return new ThrowingInsn(getOpcode(), getPosition(), getSources().withOffset(i), this.catches);
    }

    @Override
    public Insn withNewRegisters(RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        return new ThrowingInsn(getOpcode(), getPosition(), registerSpecList, this.catches);
    }
}
