package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;

public final class TargetInsn extends FixedSizeInsn {
    private CodeAddress target;

    public TargetInsn(Dop c1680Dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, CodeAddress codeAddress) {
        super(c1680Dop, sourcePosition, registerSpecList);
        if (codeAddress == null) {
            throw new NullPointerException("target == null");
        }
        this.target = codeAddress;
    }

    @Override
    public DalvInsn withOpcode(Dop c1680Dop) {
        return new TargetInsn(c1680Dop, getPosition(), getRegisters(), this.target);
    }

    @Override
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new TargetInsn(getOpcode(), getPosition(), registerSpecList, this.target);
    }

    public TargetInsn withNewTargetAndReversed(CodeAddress codeAddress) {
        return new TargetInsn(getOpcode().getOppositeTest(), getPosition(), getRegisters(), codeAddress);
    }

    public CodeAddress getTarget() {
        return this.target;
    }

    public int getTargetAddress() {
        return this.target.getAddress();
    }

    public int getTargetOffset() {
        return this.target.getAddress() - getAddress();
    }

    public boolean hasTargetOffset() {
        return hasAddress() && this.target.hasAddress();
    }

    @Override
    protected String argString() {
        return this.target == null ? "????" : this.target.identifierString();
    }
}
