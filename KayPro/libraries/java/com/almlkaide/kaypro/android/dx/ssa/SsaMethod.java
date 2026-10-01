package com.almlkaide.kaypro.android.dx.ssa;

import com.almlkaide.kaypro.android.dx.rop.code.BasicBlockList;
import com.almlkaide.kaypro.android.dx.rop.code.Insn;
import com.almlkaide.kaypro.android.dx.rop.code.PlainInsn;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.RopMethod;
import com.almlkaide.kaypro.android.dx.rop.code.Rops;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;
import com.almlkaide.kaypro.android.dx.util.IntList;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public final class SsaMethod {
    private boolean backMode = false;
    private ArrayList<SsaBasicBlock> blocks;
    private int borrowedSpareRegisters;
    private SsaInsn[] definitionList;
    private int entryBlockIndex;
    private int exitBlockIndex;
    private final boolean isStatic;
    private int maxLabel;
    private final int paramWidth;
    private int registerCount;
    private int spareRegisterBase;
    private List<SsaInsn>[] unmodifiableUseList;
    private ArrayList<SsaInsn>[] useList;

    public static SsaMethod newFromRopMethod(RopMethod ropMethod, int i, boolean z) {
        SsaMethod ssaMethod = new SsaMethod(ropMethod, i, z);
        ssaMethod.convertRopToSsaBlocks(ropMethod);
        return ssaMethod;
    }

    SsaMethod(RopMethod ropMethod, int i, boolean z) {
        this.paramWidth = i;
        this.isStatic = z;
        this.maxLabel = ropMethod.getBlocks().getMaxLabel();
        this.registerCount = ropMethod.getBlocks().getRegCount();
        this.spareRegisterBase = this.registerCount;
    }

    static BitSet bitSetFromLabelList(BasicBlockList basicBlockList, IntList intList) {
        BitSet bitSet = new BitSet(basicBlockList.size());
        int size = intList.size();
        for (int i = 0; i < size; i++) {
            bitSet.set(basicBlockList.indexOfLabel(intList.m7231get(i)));
        }
        return bitSet;
    }

    public static IntList indexListFromLabelList(BasicBlockList basicBlockList, IntList intList) {
        IntList intList2 = new IntList(intList.size());
        int size = intList.size();
        for (int i = 0; i < size; i++) {
            intList2.m7230add(basicBlockList.indexOfLabel(intList.m7231get(i)));
        }
        return intList2;
    }

    private void convertRopToSsaBlocks(RopMethod ropMethod) {
        int size = ropMethod.getBlocks().size();
        this.blocks = new ArrayList<>(size + 2);
        for (int i = 0; i < size; i++) {
            this.blocks.add(SsaBasicBlock.newFromRop(ropMethod, i, this));
        }
        this.entryBlockIndex = this.blocks.get(ropMethod.getBlocks().indexOfLabel(ropMethod.getFirstLabel())).insertNewPredecessor().getIndex();
        this.exitBlockIndex = -1;
    }

    void makeExitBlock() {
        if (this.exitBlockIndex >= 0) {
            throw new RuntimeException("must be called at most once");
        }
        this.exitBlockIndex = this.blocks.size();
        int i = this.exitBlockIndex;
        int i2 = this.maxLabel;
        this.maxLabel = i2 + 1;
        SsaBasicBlock ssaBasicBlock = new SsaBasicBlock(i, i2, this);
        this.blocks.add(ssaBasicBlock);
        Iterator<SsaBasicBlock> it = this.blocks.iterator();
        while (it.hasNext()) {
            it.next().exitBlockFixup(ssaBasicBlock);
        }
        if (ssaBasicBlock.getPredecessors().cardinality() == 0) {
            this.blocks.remove(this.exitBlockIndex);
            this.exitBlockIndex = -1;
            this.maxLabel--;
        }
    }

    private static SsaInsn getGoto(SsaBasicBlock ssaBasicBlock) {
        return new NormalSsaInsn(new PlainInsn(Rops.GOTO, SourcePosition.NO_INFO, (RegisterSpec) null, RegisterSpecList.EMPTY), ssaBasicBlock);
    }

    public SsaBasicBlock makeNewGotoBlock() {
        int size = this.blocks.size();
        int i = this.maxLabel;
        this.maxLabel = i + 1;
        SsaBasicBlock ssaBasicBlock = new SsaBasicBlock(size, i, this);
        ssaBasicBlock.getInsns().add(getGoto(ssaBasicBlock));
        this.blocks.add(ssaBasicBlock);
        return ssaBasicBlock;
    }

    public int getEntryBlockIndex() {
        return this.entryBlockIndex;
    }

    public SsaBasicBlock getEntryBlock() {
        return this.blocks.get(this.entryBlockIndex);
    }

    public int getExitBlockIndex() {
        return this.exitBlockIndex;
    }

    public SsaBasicBlock getExitBlock() {
        return this.exitBlockIndex < 0 ? (SsaBasicBlock) null : this.blocks.get(this.exitBlockIndex);
    }

    public int blockIndexToRopLabel(int i) {
        if (i < 0) {
            return -1;
        }
        return this.blocks.get(i).getRopLabel();
    }

    public int getRegCount() {
        return this.registerCount;
    }

    public int getParamWidth() {
        return this.paramWidth;
    }

    public boolean isStatic() {
        return this.isStatic;
    }

    public int borrowSpareRegister(int i) {
        int i2 = this.spareRegisterBase + this.borrowedSpareRegisters;
        this.borrowedSpareRegisters += i;
        this.registerCount = Math.max(this.registerCount, i2 + i);
        return i2;
    }

    public void returnSpareRegisters() {
        this.borrowedSpareRegisters = 0;
    }

    public ArrayList<SsaBasicBlock> getBlocks() {
        return this.blocks;
    }

    public BitSet computeReachability() {
        int size = this.blocks.size();
        BitSet bitSet = new BitSet(size);
        BitSet bitSet2 = new BitSet(size);
        bitSet.set(getEntryBlock().getIndex());
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(0);
            if (iNextSetBit != -1) {
                bitSet2.set(iNextSetBit);
                bitSet.or(this.blocks.get(iNextSetBit).getSuccessors());
                bitSet.andNot(bitSet2);
            } else {
                return bitSet2;
            }
        }
    }

    public void mapRegisters(RegisterMapper registerMapper) {
        Iterator<SsaBasicBlock> it = getBlocks().iterator();
        while (it.hasNext()) {
            Iterator<SsaInsn> it2 = it.next().getInsns().iterator();
            while (it2.hasNext()) {
                it2.next().mapRegisters(registerMapper);
            }
        }
        this.registerCount = registerMapper.getNewRegisterCount();
        this.spareRegisterBase = this.registerCount;
    }

    public SsaInsn getDefinitionForRegister(int i) {
        if (this.backMode) {
            throw new RuntimeException("No def list in back mode");
        }
        if (this.definitionList != null) {
            return this.definitionList[i];
        }
        this.definitionList = new SsaInsn[getRegCount()];
        forEachInsn(new SsaInsn.Visitor(this) {
            private final SsaMethod this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void visitMoveInsn(NormalSsaInsn normalSsaInsn) {
                this.this$0.definitionList[normalSsaInsn.getResult().getReg()] = normalSsaInsn;
            }

            @Override
            public void visitPhiInsn(PhiInsn phiInsn) {
                this.this$0.definitionList[phiInsn.getResult().getReg()] = phiInsn;
            }

            @Override
            public void visitNonMoveInsn(NormalSsaInsn normalSsaInsn) {
                if (normalSsaInsn.getResult() != null) {
                    this.this$0.definitionList[normalSsaInsn.getResult().getReg()] = normalSsaInsn;
                }
            }
        });
        return this.definitionList[i];
    }

    private void buildUseList() {
        if (this.backMode) {
            throw new RuntimeException("No use list in back mode");
        }
        this.useList = new ArrayList[this.registerCount];
        for (int i = 0; i < this.registerCount; i++) {
            this.useList[i] = new ArrayList<>();
        }
        forEachInsn(new SsaInsn.Visitor(this) {
            private final SsaMethod this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void visitMoveInsn(NormalSsaInsn normalSsaInsn) {
                addToUses(normalSsaInsn);
            }

            @Override
            public void visitPhiInsn(PhiInsn phiInsn) {
                addToUses(phiInsn);
            }

            @Override
            public void visitNonMoveInsn(NormalSsaInsn normalSsaInsn) {
                addToUses(normalSsaInsn);
            }

            private void addToUses(SsaInsn ssaInsn) {
                RegisterSpecList sources = ssaInsn.getSources();
                int size = sources.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.this$0.useList[sources.m7188get(i2).getReg()].add(ssaInsn);
                }
            }
        });
        this.unmodifiableUseList = new List[this.registerCount];
        for (int i2 = 0; i2 < this.registerCount; i2++) {
            this.unmodifiableUseList[i2] = Collections.unmodifiableList(this.useList[i2]);
        }
    }

    void onSourceChanged(SsaInsn ssaInsn, RegisterSpec registerSpec, RegisterSpec registerSpec2) {
        if (this.useList != null) {
            if (registerSpec != null) {
                this.useList[registerSpec.getReg()].remove(ssaInsn);
            }
            int reg = registerSpec2.getReg();
            if (this.useList.length <= reg) {
                this.useList = (ArrayList[]) null;
            } else {
                this.useList[reg].add(ssaInsn);
            }
        }
    }

    void onSourcesChanged(SsaInsn ssaInsn, RegisterSpecList registerSpecList) {
        if (this.useList != null) {
            if (registerSpecList != null) {
                removeFromUseList(ssaInsn, registerSpecList);
            }
            RegisterSpecList sources = ssaInsn.getSources();
            int size = sources.size();
            for (int i = 0; i < size; i++) {
                this.useList[sources.m7188get(i).getReg()].add(ssaInsn);
            }
        }
    }

    private void removeFromUseList(SsaInsn ssaInsn, RegisterSpecList registerSpecList) {
        if (registerSpecList != null) {
            int size = registerSpecList.size();
            for (int i = 0; i < size; i++) {
                if (!this.useList[registerSpecList.m7188get(i).getReg()].remove(ssaInsn)) {
                    throw new RuntimeException("use not found");
                }
            }
        }
    }

    void onInsnAdded(SsaInsn ssaInsn) {
        onSourcesChanged(ssaInsn, (RegisterSpecList) null);
        updateOneDefinition(ssaInsn, (RegisterSpec) null);
    }

    void onInsnRemoved(SsaInsn ssaInsn) {
        if (this.useList != null) {
            removeFromUseList(ssaInsn, ssaInsn.getSources());
        }
        RegisterSpec result = ssaInsn.getResult();
        if (this.definitionList == null || result == null) {
            return;
        }
        this.definitionList[result.getReg()] = (SsaInsn) null;
    }

    public void onInsnsChanged() {
        this.definitionList = (SsaInsn[]) null;
        this.useList = (ArrayList[]) null;
        this.unmodifiableUseList = (List[]) null;
    }

    void updateOneDefinition(SsaInsn ssaInsn, RegisterSpec registerSpec) {
        if (this.definitionList != null) {
            if (registerSpec != null) {
                this.definitionList[registerSpec.getReg()] = (SsaInsn) null;
            }
            RegisterSpec result = ssaInsn.getResult();
            if (result != null) {
                if (this.definitionList[result.getReg()] != null) {
                    throw new RuntimeException("Duplicate add of insn");
                }
                this.definitionList[result.getReg()] = ssaInsn;
            }
        }
    }

    public List<SsaInsn> getUseListForRegister(int i) {
        if (this.unmodifiableUseList == null) {
            buildUseList();
        }
        return this.unmodifiableUseList[i];
    }

    public ArrayList<SsaInsn>[] getUseListCopy() {
        if (this.useList == null) {
            buildUseList();
        }
        ArrayList<SsaInsn>[] arrayListArr = new ArrayList[this.registerCount];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.registerCount) {
                arrayListArr[i2] = new ArrayList<>(this.useList[i2]);
                i = i2 + 1;
            } else {
                return arrayListArr;
            }
        }
    }

    public boolean isRegALocal(RegisterSpec registerSpec) {
        SsaInsn definitionForRegister = getDefinitionForRegister(registerSpec.getReg());
        if (definitionForRegister == null) {
            return false;
        }
        if (definitionForRegister.getLocalAssignment() != null) {
            return true;
        }
        Iterator<SsaInsn> it = getUseListForRegister(registerSpec.getReg()).iterator();
        while (it.hasNext()) {
            Insn originalRopInsn = it.next().getOriginalRopInsn();
            if (originalRopInsn != null && originalRopInsn.getOpcode().getOpcode() == 54) {
                return true;
            }
        }
        return false;
    }

    void setNewRegCount(int i) {
        this.registerCount = i;
        this.spareRegisterBase = this.registerCount;
        onInsnsChanged();
    }

    public int makeNewSsaReg() {
        int i = this.registerCount;
        this.registerCount = i + 1;
        this.spareRegisterBase = this.registerCount;
        onInsnsChanged();
        return i;
    }

    public void forEachInsn(SsaInsn.Visitor visitor) {
        Iterator<SsaBasicBlock> it = this.blocks.iterator();
        while (it.hasNext()) {
            it.next().forEachInsn(visitor);
        }
    }

    public void forEachPhiInsn(PhiInsn.Visitor visitor) {
        Iterator<SsaBasicBlock> it = this.blocks.iterator();
        while (it.hasNext()) {
            it.next().forEachPhiInsn(visitor);
        }
    }

    public void forEachBlockDepthFirst(boolean z, SsaBasicBlock.Visitor visitor) {
        BitSet bitSet = new BitSet(this.blocks.size());
        Stack stack = new Stack();
        SsaBasicBlock exitBlock = z ? getExitBlock() : getEntryBlock();
        if (exitBlock != null) {
            stack.add((SsaBasicBlock) null);
            stack.add(exitBlock);
            while (stack.size() > 0) {
                SsaBasicBlock ssaBasicBlock = (SsaBasicBlock) stack.pop();
                SsaBasicBlock ssaBasicBlock2 = (SsaBasicBlock) stack.pop();
                if (!bitSet.get(ssaBasicBlock.getIndex())) {
                    BitSet predecessors = z ? ssaBasicBlock.getPredecessors() : ssaBasicBlock.getSuccessors();
                    for (int iNextSetBit = predecessors.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = predecessors.nextSetBit(iNextSetBit + 1)) {
                        stack.add(ssaBasicBlock);
                        stack.add(this.blocks.get(iNextSetBit));
                    }
                    bitSet.set(ssaBasicBlock.getIndex());
                    visitor.visitBlock(ssaBasicBlock, ssaBasicBlock2);
                }
            }
        }
    }

    public void forEachBlockDepthFirstDom(SsaBasicBlock.Visitor visitor) {
        BitSet bitSet = new BitSet(getBlocks().size());
        Stack stack = new Stack();
        stack.add(getEntryBlock());
        while (stack.size() > 0) {
            SsaBasicBlock ssaBasicBlock = (SsaBasicBlock) stack.pop();
            ArrayList<SsaBasicBlock> domChildren = ssaBasicBlock.getDomChildren();
            if (!bitSet.get(ssaBasicBlock.getIndex())) {
                for (int size = domChildren.size() - 1; size >= 0; size--) {
                    stack.add(domChildren.get(size));
                }
                bitSet.set(ssaBasicBlock.getIndex());
                visitor.visitBlock(ssaBasicBlock, (SsaBasicBlock) null);
            }
        }
    }

    public void deleteInsns(Set<SsaInsn> set) {
        for (SsaInsn ssaInsn : set) {
            SsaBasicBlock block = ssaInsn.getBlock();
            ArrayList<SsaInsn> insns = block.getInsns();
            for (int size = insns.size() - 1; size >= 0; size--) {
                SsaInsn ssaInsn2 = insns.get(size);
                if (ssaInsn == ssaInsn2) {
                    onInsnRemoved(ssaInsn2);
                    insns.remove(size);
                    break;
                }
            }
            int size2 = insns.size();
            SsaInsn ssaInsn3 = size2 == 0 ? (SsaInsn) null : insns.get(size2 - 1);
            if (block != getExitBlock() && (size2 == 0 || ssaInsn3.getOriginalRopInsn() == null || ssaInsn3.getOriginalRopInsn().getOpcode().getBranchingness() == 1)) {
                insns.add(SsaInsn.makeFromRop(new PlainInsn(Rops.GOTO, SourcePosition.NO_INFO, (RegisterSpec) null, RegisterSpecList.EMPTY), block));
                BitSet successors = block.getSuccessors();
                for (int iNextSetBit = successors.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = successors.nextSetBit(iNextSetBit + 1)) {
                    if (iNextSetBit != block.getPrimarySuccessorIndex()) {
                        block.removeSuccessor(iNextSetBit);
                    }
                }
            }
        }
    }

    public void setBackMode() {
        this.backMode = true;
        this.useList = (ArrayList[]) null;
        this.definitionList = (SsaInsn[]) null;
    }
}
