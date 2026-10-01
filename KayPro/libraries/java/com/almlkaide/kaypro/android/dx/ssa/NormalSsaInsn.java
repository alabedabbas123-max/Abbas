package com.almlkaide.kaypro.android.dx.ssa;

import com.almlkaide.kaypro.android.dx.rop.code.Rop;
import com.almlkaide.kaypro.android.dx.rop.code.Insn;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;

public final class NormalSsaInsn extends SsaInsn implements Cloneable {
    private Insn insn;

    @Override
    public SsaInsn clone() {
        return clone();
    }

    NormalSsaInsn(Insn insn, SsaBasicBlock ssaBasicBlock) {
        super(insn.getResult(), ssaBasicBlock);
        this.insn = insn;
    }

    @Override
    public final void mapSourceRegisters(RegisterMapper registerMapper) {
        RegisterSpecList sources = this.insn.getSources();
        RegisterSpecList registerSpecListM7208map = registerMapper.m7208map(sources);
        if (registerSpecListM7208map != sources) {
            this.insn = this.insn.withNewRegisters(getResult(), registerSpecListM7208map);
            getBlock().getParent().onSourcesChanged(this, sources);
        }
    }

    public final void changeOneSource(int i, RegisterSpec registerSpec) {
        RegisterSpecList sources = this.insn.getSources();
        int size = sources.size();
        RegisterSpecList registerSpecList = new RegisterSpecList(size);
        int i2 = 0;
        while (i2 < size) {
            registerSpecList.m7189set(i2, i2 == i ? registerSpec : sources.m7188get(i2));
            i2++;
        }
        registerSpecList.setImmutable();
        RegisterSpec registerSpecM7188get = sources.m7188get(i);
        if (registerSpecM7188get.getReg() != registerSpec.getReg()) {
            getBlock().getParent().onSourceChanged(this, registerSpecM7188get, registerSpec);
        }
        this.insn = this.insn.withNewRegisters(getResult(), registerSpecList);
    }

    public final void setNewSources(RegisterSpecList registerSpecList) {
        if (this.insn.getSources().size() != registerSpecList.size()) {
            throw new RuntimeException("Sources counts don't match");
        }
        this.insn = this.insn.withNewRegisters(getResult(), registerSpecList);
    }

    @Override
    public NormalSsaInsn clone() {
        return (NormalSsaInsn) super.clone();
    }

    @Override
    public RegisterSpecList getSources() {
        return this.insn.getSources();
    }

    @Override
    public String toHuman() {
        return toRopInsn().toHuman();
    }

    @Override
    public Insn toRopInsn() {
        return this.insn.withNewRegisters(getResult(), this.insn.getSources());
    }

    @Override
    public Rop getOpcode() {
        return this.insn.getOpcode();
    }

    @Override
    public Insn getOriginalRopInsn() {
        return this.insn;
    }

    @Override
    public RegisterSpec getLocalAssignment() {
        RegisterSpec result;
        if (this.insn.getOpcode().getOpcode() == 54) {
            result = this.insn.getSources().m7188get(0);
        } else {
            result = getResult();
        }
        if (result == null) {
            return (RegisterSpec) null;
        }
        return result.getLocalItem() == null ? (RegisterSpec) null : result;
    }

    public void upgradeToLiteral() {
        RegisterSpecList sources = this.insn.getSources();
        this.insn = this.insn.withSourceLiteral();
        getBlock().getParent().onSourcesChanged(this, sources);
    }

    @Override
    public boolean isNormalMoveInsn() {
        return this.insn.getOpcode().getOpcode() == 2;
    }

    @Override
    public boolean isMoveException() {
        return this.insn.getOpcode().getOpcode() == 4;
    }

    @Override
    public boolean canThrow() {
        return this.insn.canThrow();
    }

    @Override
    public void accept(SsaInsn.Visitor visitor) {
        if (isNormalMoveInsn()) {
            visitor.visitMoveInsn(this);
        } else {
            visitor.visitNonMoveInsn(this);
        }
    }

    @Override
    public boolean isPhiOrMove() {
        return isNormalMoveInsn();
    }

    @Override
    public boolean hasSideEffect() {
        Rop opcode = getOpcode();
        if (opcode.getBranchingness() != 1) {
            return true;
        }
        boolean z = Optimizer.getPreserveLocals() && getLocalAssignment() != null;
        switch (opcode.getOpcode()) {
            case 2:
            case 5:
            case 55:
                return z;
            default:
                return true;
        }
    }
}
