package com.almlkaide.kaypro.android.dx.ssa;

import com.almlkaide.kaypro.android.dx.rop.code.Rop;
import com.almlkaide.kaypro.android.dx.rop.code.Insn;
import com.almlkaide.kaypro.android.dx.rop.code.LocalItem;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeBearer;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class PhiInsn extends SsaInsn {
    private final ArrayList<Operand> operands;
    private final int ropResultReg;
    private RegisterSpecList sources;

    public interface Visitor {
        void visitPhiInsn(PhiInsn phiInsn);
    }

    @Override
    public SsaInsn clone() {
        return clone();
    }

    public PhiInsn(RegisterSpec registerSpec, SsaBasicBlock ssaBasicBlock) {
        super(registerSpec, ssaBasicBlock);
        this.operands = new ArrayList<>();
        this.ropResultReg = registerSpec.getReg();
    }

    public PhiInsn(int i, SsaBasicBlock ssaBasicBlock) {
        super(RegisterSpec.make(i, Type.VOID), ssaBasicBlock);
        this.operands = new ArrayList<>();
        this.ropResultReg = i;
    }

    @Override
    public PhiInsn clone() {
        throw new UnsupportedOperationException("can't clone phi");
    }

    public void updateSourcesToDefinitions(SsaMethod ssaMethod) {
        for (Operand operand : this.operands) {
            operand.regSpec = operand.regSpec.withType(ssaMethod.getDefinitionForRegister(operand.regSpec.getReg()).getResult().getType());
        }
        this.sources = (RegisterSpecList) null;
    }

    public void changeResultType(TypeBearer typeBearer, LocalItem localItem) {
        setResult(RegisterSpec.makeLocalOptional(getResult().getReg(), typeBearer, localItem));
    }

    public int getRopResultReg() {
        return this.ropResultReg;
    }

    public void addPhiOperand(RegisterSpec registerSpec, SsaBasicBlock ssaBasicBlock) {
        this.operands.add(new Operand(registerSpec, ssaBasicBlock.getIndex(), ssaBasicBlock.getRopLabel()));
        this.sources = (RegisterSpecList) null;
    }

    public void removePhiRegister(RegisterSpec registerSpec) {
        ArrayList arrayList = new ArrayList();
        for (Operand operand : this.operands) {
            if (operand.regSpec.getReg() == registerSpec.getReg()) {
                arrayList.add(operand);
            }
        }
        this.operands.removeAll(arrayList);
        this.sources = (RegisterSpecList) null;
    }

    public int predBlockIndexForSourcesIndex(int i) {
        return this.operands.get(i).blockIndex;
    }

    @Override
    public Rop getOpcode() {
        return (Rop) null;
    }

    @Override
    public Insn getOriginalRopInsn() {
        return (Insn) null;
    }

    @Override
    public boolean canThrow() {
        return false;
    }

    @Override
    public RegisterSpecList getSources() {
        if (this.sources != null) {
            return this.sources;
        }
        if (this.operands.size() == 0) {
            return RegisterSpecList.EMPTY;
        }
        int size = this.operands.size();
        this.sources = new RegisterSpecList(size);
        for (int i = 0; i < size; i++) {
            this.sources.m7189set(i, this.operands.get(i).regSpec);
        }
        this.sources.setImmutable();
        return this.sources;
    }

    @Override
    public boolean isRegASource(int i) {
        Iterator<Operand> it = this.operands.iterator();
        while (it.hasNext()) {
            if (it.next().regSpec.getReg() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean areAllOperandsEqual() {
        if (this.operands.size() == 0) {
            return true;
        }
        int reg = this.operands.get(0).regSpec.getReg();
        Iterator<Operand> it = this.operands.iterator();
        while (it.hasNext()) {
            if (reg != it.next().regSpec.getReg()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void mapSourceRegisters(RegisterMapper registerMapper) {
        for (Operand operand : this.operands) {
            RegisterSpec registerSpec = operand.regSpec;
            operand.regSpec = registerMapper.mo7199map(registerSpec);
            if (registerSpec != operand.regSpec) {
                getBlock().getParent().onSourceChanged(this, registerSpec, operand.regSpec);
            }
        }
        this.sources = (RegisterSpecList) null;
    }

    @Override
    public Insn toRopInsn() {
        throw new IllegalArgumentException("Cannot convert phi insns to rop form");
    }

    public List<SsaBasicBlock> predBlocksForReg(int i, SsaMethod ssaMethod) {
        ArrayList arrayList = new ArrayList();
        for (Operand operand : this.operands) {
            if (operand.regSpec.getReg() == i) {
                arrayList.add(ssaMethod.getBlocks().get(operand.blockIndex));
            }
        }
        return arrayList;
    }

    @Override
    public boolean isPhiOrMove() {
        return true;
    }

    @Override
    public boolean hasSideEffect() {
        return Optimizer.getPreserveLocals() && getLocalAssignment() != null;
    }

    @Override
    public void accept(SsaInsn.Visitor visitor) {
        visitor.visitPhiInsn(this);
    }

    @Override
    public String toHuman() {
        return toHumanWithInline((String) null);
    }

    protected final String toHumanWithInline(String str) {
        StringBuilder sb = new StringBuilder(80);
        sb.append(SourcePosition.NO_INFO);
        sb.append(": phi");
        if (str != null) {
            sb.append("(");
            sb.append(str);
            sb.append(")");
        }
        RegisterSpec result = getResult();
        if (result == null) {
            sb.append(" .");
        } else {
            sb.append(" ");
            sb.append(result.toHuman());
        }
        sb.append(" <-");
        int size = getSources().size();
        if (size == 0) {
            sb.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                sb.append(" ");
                sb.append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(this.sources.m7188get(i).toHuman()).append("[b=").toString()).append(Hex.m7225u2(this.operands.get(i).ropLabel)).toString()).append("]").toString());
            }
        }
        return sb.toString();
    }

    private static class Operand {
        public final int blockIndex;
        public RegisterSpec regSpec;
        public final int ropLabel;

        public Operand(RegisterSpec registerSpec, int i, int i2) {
            this.regSpec = registerSpec;
            this.blockIndex = i;
            this.ropLabel = i2;
        }
    }
}
