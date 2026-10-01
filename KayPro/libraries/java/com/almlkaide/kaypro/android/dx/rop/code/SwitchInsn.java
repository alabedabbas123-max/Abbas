package com.almlkaide.kaypro.android.dx.rop.code;

import com.almlkaide.kaypro.android.dx.rop.type.StdTypeList;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeList;
import com.almlkaide.kaypro.android.dx.util.IntList;

public final class SwitchInsn extends Insn {
    private final IntList cases;

    public SwitchInsn(Rop c1681Rop, SourcePosition sourcePosition, RegisterSpec registerSpec, RegisterSpecList registerSpecList, IntList intList) {
        super(c1681Rop, sourcePosition, registerSpec, registerSpecList);
        if (c1681Rop.getBranchingness() != 5) {
            throw new IllegalArgumentException("bogus branchingness");
        }
        if (intList == null) {
            throw new NullPointerException("cases == null");
        }
        this.cases = intList;
    }

    @Override
    public String getInlineString() {
        return this.cases.toString();
    }

    @Override
    public TypeList getCatches() {
        return StdTypeList.EMPTY;
    }

    @Override
    public void accept(Insn.Visitor visitor) {
        visitor.visitSwitchInsn(this);
    }

    @Override
    public Insn withAddedCatch(Type type) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override
    public Insn withRegisterOffset(int i) {
        return new SwitchInsn(getOpcode(), getPosition(), getResult().withOffset(i), getSources().withOffset(i), this.cases);
    }

    @Override
    public boolean contentEquals(Insn insn) {
        return false;
    }

    @Override
    public Insn withNewRegisters(RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        return new SwitchInsn(getOpcode(), getPosition(), registerSpec, registerSpecList, this.cases);
    }

    public IntList getCases() {
        return this.cases;
    }
}
