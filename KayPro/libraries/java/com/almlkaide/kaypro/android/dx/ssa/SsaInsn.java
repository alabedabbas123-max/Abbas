package com.almlkaide.kaypro.android.dx.ssa;

import com.almlkaide.kaypro.android.dx.rop.code.Rop;
import com.almlkaide.kaypro.android.dx.rop.code.Insn;
import com.almlkaide.kaypro.android.dx.rop.code.LocalItem;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.util.ToHuman;

public abstract class SsaInsn implements ToHuman, Cloneable {
    private final SsaBasicBlock block;
    private RegisterSpec result;

    public interface Visitor {
        void visitMoveInsn(NormalSsaInsn normalSsaInsn);

        void visitNonMoveInsn(NormalSsaInsn normalSsaInsn);

        void visitPhiInsn(PhiInsn phiInsn);
    }

    public abstract void accept(Visitor visitor);

    public abstract boolean canThrow();

    public Object m9086clone() {
        return clone();
    }

    public abstract Rop getOpcode();

    public abstract Insn getOriginalRopInsn();

    public abstract RegisterSpecList getSources();

    public abstract boolean hasSideEffect();

    public abstract boolean isPhiOrMove();

    public abstract void mapSourceRegisters(RegisterMapper registerMapper);

    public abstract Insn toRopInsn();

    protected SsaInsn(RegisterSpec registerSpec, SsaBasicBlock ssaBasicBlock) {
        if (ssaBasicBlock == null) {
            throw new NullPointerException("block == null");
        }
        this.block = ssaBasicBlock;
        this.result = registerSpec;
    }

    public static SsaInsn makeFromRop(Insn insn, SsaBasicBlock ssaBasicBlock) {
        return new NormalSsaInsn(insn, ssaBasicBlock);
    }

    public SsaInsn clone() {
        try {
            return (SsaInsn) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("unexpected", e);
        }
    }

    public RegisterSpec getResult() {
        return this.result;
    }

    protected void setResult(RegisterSpec registerSpec) {
        if (registerSpec == null) {
            throw new NullPointerException("result == null");
        }
        this.result = registerSpec;
    }

    public SsaBasicBlock getBlock() {
        return this.block;
    }

    public boolean isResultReg(int i) {
        return this.result != null && this.result.getReg() == i;
    }

    public void changeResultReg(int i) {
        if (this.result != null) {
            this.result = this.result.withReg(i);
        }
    }

    public final void setResultLocal(LocalItem localItem) {
        if (localItem != this.result.getLocalItem()) {
            if (localItem == null || !localItem.equals(this.result.getLocalItem())) {
                this.result = RegisterSpec.makeLocalOptional(this.result.getReg(), this.result.getType(), localItem);
            }
        }
    }

    public final void mapRegisters(RegisterMapper registerMapper) {
        RegisterSpec registerSpec = this.result;
        this.result = registerMapper.mo7199map(this.result);
        this.block.getParent().updateOneDefinition(this, registerSpec);
        mapSourceRegisters(registerMapper);
    }

    public RegisterSpec getLocalAssignment() {
        return (this.result == null || this.result.getLocalItem() == null) ? (RegisterSpec) null : this.result;
    }

    public boolean isRegASource(int i) {
        return getSources().specForRegister(i) != null;
    }

    public boolean isNormalMoveInsn() {
        return false;
    }

    public boolean isMoveException() {
        return false;
    }
}
