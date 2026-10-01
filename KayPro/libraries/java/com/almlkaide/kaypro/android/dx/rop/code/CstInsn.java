package com.almlkaide.kaypro.android.dx.rop.code;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;

public abstract class CstInsn extends Insn {

    private final Constant f5056cst;

    public CstInsn(Rop c1681Rop, SourcePosition sourcePosition, RegisterSpec registerSpec, RegisterSpecList registerSpecList, Constant constant) {
        super(c1681Rop, sourcePosition, registerSpec, registerSpecList);
        if (constant == null) {
            throw new NullPointerException("cst == null");
        }
        this.f5056cst = constant;
    }

    @Override
    public String getInlineString() {
        return this.f5056cst.toHuman();
    }

    public Constant getConstant() {
        return this.f5056cst;
    }

    @Override
    public boolean contentEquals(Insn insn) {
        return super.contentEquals(insn) && this.f5056cst.equals(((CstInsn) insn).getConstant());
    }
}
