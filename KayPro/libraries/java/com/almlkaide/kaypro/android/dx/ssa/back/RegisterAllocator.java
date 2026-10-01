package com.almlkaide.kaypro.android.dx.ssa.back;

import com.almlkaide.kaypro.android.dx.rop.code.PlainInsn;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.Rops;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;
import com.almlkaide.kaypro.android.dx.ssa.NormalSsaInsn;
import com.almlkaide.kaypro.android.dx.ssa.RegisterMapper;
import com.almlkaide.kaypro.android.dx.ssa.SsaBasicBlock;
import com.almlkaide.kaypro.android.dx.ssa.SsaInsn;
import com.almlkaide.kaypro.android.dx.ssa.SsaMethod;
import com.almlkaide.kaypro.android.dx.util.IntIterator;
import java.util.ArrayList;

public abstract class RegisterAllocator {
    protected final InterferenceGraph interference;
    protected final SsaMethod ssaMeth;

    public abstract RegisterMapper allocateRegisters();

    public abstract boolean wantsParamsMovedHigh();

    public RegisterAllocator(SsaMethod ssaMethod, InterferenceGraph interferenceGraph) {
        this.ssaMeth = ssaMethod;
        this.interference = interferenceGraph;
    }

    protected final int getCategoryForSsaReg(int i) {
        SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i);
        if (definitionForRegister == null) {
            return 1;
        }
        return definitionForRegister.getResult().getCategory();
    }

    protected final RegisterSpec getDefinitionSpecForSsaReg(int i) {
        SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i);
        return definitionForRegister == null ? (RegisterSpec) null : definitionForRegister.getResult();
    }

    protected boolean isDefinitionMoveParam(int i) {
        SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i);
        return (definitionForRegister instanceof NormalSsaInsn) && ((NormalSsaInsn) definitionForRegister).getOpcode().getOpcode() == 3;
    }

    protected final RegisterSpec insertMoveBefore(SsaInsn ssaInsn, RegisterSpec registerSpec) {
        SsaBasicBlock block = ssaInsn.getBlock();
        ArrayList<SsaInsn> insns = block.getInsns();
        int iIndexOf = insns.indexOf(ssaInsn);
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("specified insn is not in this block");
        }
        if (iIndexOf != insns.size() - 1) {
            throw new IllegalArgumentException(new StringBuffer().append("Adding move here not supported:").append(ssaInsn.toHuman()).toString());
        }
        RegisterSpec registerSpecMake = RegisterSpec.make(this.ssaMeth.makeNewSsaReg(), registerSpec.getTypeBearer());
        insns.add(iIndexOf, SsaInsn.makeFromRop(new PlainInsn(Rops.opMove(registerSpecMake.getType()), SourcePosition.NO_INFO, registerSpecMake, RegisterSpecList.make(registerSpec)), block));
        int reg = registerSpecMake.getReg();
        IntIterator it = block.getLiveOutRegs().iterator();
        while (it.hasNext()) {
            this.interference.m7212add(reg, it.next());
        }
        RegisterSpecList sources = ssaInsn.getSources();
        int size = sources.size();
        for (int i = 0; i < size; i++) {
            this.interference.m7212add(reg, sources.m7188get(i).getReg());
        }
        this.ssaMeth.onInsnsChanged();
        return registerSpecMake;
    }
}
