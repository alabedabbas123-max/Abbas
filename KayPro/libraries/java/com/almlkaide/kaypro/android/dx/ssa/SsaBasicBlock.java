package com.almlkaide.kaypro.android.dx.ssa;

import com.baidu.mobstat.Config;
import com.almlkaide.kaypro.android.dx.rop.code.BasicBlock;
import com.almlkaide.kaypro.android.dx.rop.code.BasicBlockList;
import com.almlkaide.kaypro.android.dx.rop.code.Insn;
import com.almlkaide.kaypro.android.dx.rop.code.InsnList;
import com.almlkaide.kaypro.android.dx.rop.code.PlainInsn;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.RopMethod;
import com.almlkaide.kaypro.android.dx.rop.code.Rops;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;
import com.almlkaide.kaypro.android.dx.util.Hex;
import com.almlkaide.kaypro.android.dx.util.IntList;
import com.almlkaide.kaypro.android.dx.util.IntSet;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class SsaBasicBlock {
    public static final Comparator<SsaBasicBlock> LABEL_COMPARATOR = new LabelComparator();
    private final int index;
    private IntSet liveIn;
    private IntSet liveOut;
    private final SsaMethod parent;
    private BitSet predecessors;
    private final int ropLabel;
    private BitSet successors;
    private int primarySuccessor = -1;
    private int movesFromPhisAtEnd = 0;
    private int movesFromPhisAtBeginning = 0;
    private final ArrayList<SsaInsn> insns = new ArrayList<>();
    private IntList successorList = new IntList();
    private final ArrayList<SsaBasicBlock> domChildren = new ArrayList<>();

    public interface Visitor {
        void visitBlock(SsaBasicBlock ssaBasicBlock, SsaBasicBlock ssaBasicBlock2);
    }

    public SsaBasicBlock(int i, int i2, SsaMethod ssaMethod) {
        this.parent = ssaMethod;
        this.index = i;
        this.ropLabel = i2;
        this.predecessors = new BitSet(ssaMethod.getBlocks().size());
        this.successors = new BitSet(ssaMethod.getBlocks().size());
    }

    public static SsaBasicBlock newFromRop(RopMethod ropMethod, int i, SsaMethod ssaMethod) {
        BasicBlockList blocks = ropMethod.getBlocks();
        BasicBlock basicBlockM7181get = blocks.m7181get(i);
        SsaBasicBlock ssaBasicBlock = new SsaBasicBlock(i, basicBlockM7181get.getLabel(), ssaMethod);
        InsnList insns = basicBlockM7181get.getInsns();
        ssaBasicBlock.insns.ensureCapacity(insns.size());
        int size = insns.size();
        for (int i2 = 0; i2 < size; i2++) {
            ssaBasicBlock.insns.add(new NormalSsaInsn(insns.m7183get(i2), ssaBasicBlock));
        }
        ssaBasicBlock.predecessors = SsaMethod.bitSetFromLabelList(blocks, ropMethod.labelToPredecessors(basicBlockM7181get.getLabel()));
        ssaBasicBlock.successors = SsaMethod.bitSetFromLabelList(blocks, basicBlockM7181get.getSuccessors());
        ssaBasicBlock.successorList = SsaMethod.indexListFromLabelList(blocks, basicBlockM7181get.getSuccessors());
        if (ssaBasicBlock.successorList.size() != 0) {
            int primarySuccessor = basicBlockM7181get.getPrimarySuccessor();
            ssaBasicBlock.primarySuccessor = primarySuccessor < 0 ? -1 : blocks.indexOfLabel(primarySuccessor);
        }
        return ssaBasicBlock;
    }

    public void addDomChild(SsaBasicBlock ssaBasicBlock) {
        this.domChildren.add(ssaBasicBlock);
    }

    public ArrayList<SsaBasicBlock> getDomChildren() {
        return this.domChildren;
    }

    public void addPhiInsnForReg(int i) {
        this.insns.add(0, new PhiInsn(i, this));
    }

    public void addPhiInsnForReg(RegisterSpec registerSpec) {
        this.insns.add(0, new PhiInsn(registerSpec, this));
    }

    public void addInsnToHead(Insn insn) {
        SsaInsn ssaInsnMakeFromRop = SsaInsn.makeFromRop(insn, this);
        this.insns.add(getCountPhiInsns(), ssaInsnMakeFromRop);
        this.parent.onInsnAdded(ssaInsnMakeFromRop);
    }

    public void replaceLastInsn(Insn insn) {
        if (insn.getOpcode().getBranchingness() == 1) {
            throw new IllegalArgumentException("last insn must branch");
        }
        SsaInsn ssaInsn = this.insns.get(this.insns.size() - 1);
        SsaInsn ssaInsnMakeFromRop = SsaInsn.makeFromRop(insn, this);
        this.insns.set(this.insns.size() - 1, ssaInsnMakeFromRop);
        this.parent.onInsnRemoved(ssaInsn);
        this.parent.onInsnAdded(ssaInsnMakeFromRop);
    }

    public void forEachPhiInsn(PhiInsn.Visitor visitor) {
        int size = this.insns.size();
        for (int i = 0; i < size; i++) {
            SsaInsn ssaInsn = this.insns.get(i);
            if (!(ssaInsn instanceof PhiInsn)) {
                return;
            }
            visitor.visitPhiInsn((PhiInsn) ssaInsn);
        }
    }

    public void removeAllPhiInsns() {
        this.insns.subList(0, getCountPhiInsns()).clear();
    }

    private int getCountPhiInsns() {
        int size = this.insns.size();
        int i = 0;
        while (i < size && (this.insns.get(i) instanceof PhiInsn)) {
            i++;
        }
        return i;
    }

    public ArrayList<SsaInsn> getInsns() {
        return this.insns;
    }

    public List<SsaInsn> getPhiInsns() {
        return this.insns.subList(0, getCountPhiInsns());
    }

    public int getIndex() {
        return this.index;
    }

    public int getRopLabel() {
        return this.ropLabel;
    }

    public String getRopLabelString() {
        return Hex.m7225u2(this.ropLabel);
    }

    public BitSet getPredecessors() {
        return this.predecessors;
    }

    public BitSet getSuccessors() {
        return this.successors;
    }

    public IntList getSuccessorList() {
        return this.successorList;
    }

    public int getPrimarySuccessorIndex() {
        return this.primarySuccessor;
    }

    public int getPrimarySuccessorRopLabel() {
        return this.parent.blockIndexToRopLabel(this.primarySuccessor);
    }

    public SsaBasicBlock getPrimarySuccessor() {
        return this.primarySuccessor < 0 ? (SsaBasicBlock) null : this.parent.getBlocks().get(this.primarySuccessor);
    }

    public IntList getRopLabelSuccessorList() {
        IntList intList = new IntList(this.successorList.size());
        int size = this.successorList.size();
        for (int i = 0; i < size; i++) {
            intList.m7230add(this.parent.blockIndexToRopLabel(this.successorList.m7231get(i)));
        }
        return intList;
    }

    public SsaMethod getParent() {
        return this.parent;
    }

    public SsaBasicBlock insertNewPredecessor() {
        SsaBasicBlock ssaBasicBlockMakeNewGotoBlock = this.parent.makeNewGotoBlock();
        ssaBasicBlockMakeNewGotoBlock.predecessors = this.predecessors;
        ssaBasicBlockMakeNewGotoBlock.successors.set(this.index);
        ssaBasicBlockMakeNewGotoBlock.successorList.m7230add(this.index);
        ssaBasicBlockMakeNewGotoBlock.primarySuccessor = this.index;
        this.predecessors = new BitSet(this.parent.getBlocks().size());
        this.predecessors.set(ssaBasicBlockMakeNewGotoBlock.index);
        for (int iNextSetBit = ssaBasicBlockMakeNewGotoBlock.predecessors.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = ssaBasicBlockMakeNewGotoBlock.predecessors.nextSetBit(iNextSetBit + 1)) {
            this.parent.getBlocks().get(iNextSetBit).replaceSuccessor(this.index, ssaBasicBlockMakeNewGotoBlock.index);
        }
        return ssaBasicBlockMakeNewGotoBlock;
    }

    public SsaBasicBlock insertNewSuccessor(SsaBasicBlock ssaBasicBlock) {
        SsaBasicBlock ssaBasicBlockMakeNewGotoBlock = this.parent.makeNewGotoBlock();
        if (!this.successors.get(ssaBasicBlock.index)) {
            throw new RuntimeException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("Block ").append(ssaBasicBlock.getRopLabelString()).toString()).append(" not successor of ").toString()).append(getRopLabelString()).toString());
        }
        ssaBasicBlockMakeNewGotoBlock.predecessors.set(this.index);
        ssaBasicBlockMakeNewGotoBlock.successors.set(ssaBasicBlock.index);
        ssaBasicBlockMakeNewGotoBlock.successorList.m7230add(ssaBasicBlock.index);
        ssaBasicBlockMakeNewGotoBlock.primarySuccessor = ssaBasicBlock.index;
        for (int size = this.successorList.size() - 1; size >= 0; size--) {
            if (this.successorList.m7231get(size) == ssaBasicBlock.index) {
                this.successorList.m7234set(size, ssaBasicBlockMakeNewGotoBlock.index);
            }
        }
        if (this.primarySuccessor == ssaBasicBlock.index) {
            this.primarySuccessor = ssaBasicBlockMakeNewGotoBlock.index;
        }
        this.successors.clear(ssaBasicBlock.index);
        this.successors.set(ssaBasicBlockMakeNewGotoBlock.index);
        ssaBasicBlock.predecessors.set(ssaBasicBlockMakeNewGotoBlock.index);
        ssaBasicBlock.predecessors.set(this.index, this.successors.get(ssaBasicBlock.index));
        return ssaBasicBlockMakeNewGotoBlock;
    }

    public void replaceSuccessor(int i, int i2) {
        if (i != i2) {
            this.successors.set(i2);
            if (this.primarySuccessor == i) {
                this.primarySuccessor = i2;
            }
            for (int size = this.successorList.size() - 1; size >= 0; size--) {
                if (this.successorList.m7231get(size) == i) {
                    this.successorList.m7234set(size, i2);
                }
            }
            this.successors.clear(i);
            this.parent.getBlocks().get(i2).predecessors.set(this.index);
            this.parent.getBlocks().get(i).predecessors.clear(this.index);
        }
    }

    public void removeSuccessor(int i) {
        int i2 = 0;
        for (int size = this.successorList.size() - 1; size >= 0; size--) {
            if (this.successorList.m7231get(size) == i) {
                i2 = size;
            } else {
                this.primarySuccessor = this.successorList.m7231get(size);
            }
        }
        this.successorList.removeIndex(i2);
        this.successors.clear(i);
        this.parent.getBlocks().get(i).predecessors.clear(this.index);
    }

    public void exitBlockFixup(SsaBasicBlock ssaBasicBlock) {
        if (this != ssaBasicBlock && this.successorList.size() == 0) {
            this.successors.set(ssaBasicBlock.index);
            this.successorList.m7230add(ssaBasicBlock.index);
            this.primarySuccessor = ssaBasicBlock.index;
            ssaBasicBlock.predecessors.set(this.index);
        }
    }

    public void addMoveToEnd(RegisterSpec registerSpec, RegisterSpec registerSpec2) {
        if (this.successors.cardinality() > 1) {
            throw new IllegalStateException("Inserting a move to a block with multiple successors");
        }
        if (registerSpec.getReg() != registerSpec2.getReg()) {
            NormalSsaInsn normalSsaInsn = (NormalSsaInsn) this.insns.get(this.insns.size() - 1);
            if (normalSsaInsn.getResult() != null || normalSsaInsn.getSources().size() > 0) {
                int iNextSetBit = this.successors.nextSetBit(0);
                while (iNextSetBit >= 0) {
                    this.parent.getBlocks().get(iNextSetBit).addMoveToBeginning(registerSpec, registerSpec2);
                    iNextSetBit = this.successors.nextSetBit(iNextSetBit + 1);
                }
                return;
            }
            this.insns.add(this.insns.size() - 1, new NormalSsaInsn(new PlainInsn(Rops.opMove(registerSpec.getType()), SourcePosition.NO_INFO, registerSpec, RegisterSpecList.make(registerSpec2)), this));
            this.movesFromPhisAtEnd++;
        }
    }

    public void addMoveToBeginning(RegisterSpec registerSpec, RegisterSpec registerSpec2) {
        if (registerSpec.getReg() != registerSpec2.getReg()) {
            this.insns.add(getCountPhiInsns(), new NormalSsaInsn(new PlainInsn(Rops.opMove(registerSpec.getType()), SourcePosition.NO_INFO, registerSpec, RegisterSpecList.make(registerSpec2)), this));
            this.movesFromPhisAtBeginning++;
        }
    }

    private static void setRegsUsed(BitSet bitSet, RegisterSpec registerSpec) {
        bitSet.set(registerSpec.getReg());
        if (registerSpec.getCategory() > 1) {
            bitSet.set(registerSpec.getReg() + 1);
        }
    }

    private static boolean checkRegUsed(BitSet bitSet, RegisterSpec registerSpec) {
        int reg = registerSpec.getReg();
        return bitSet.get(reg) || (registerSpec.getCategory() == 2 && bitSet.get(reg + 1));
    }

    private void scheduleUseBeforeAssigned(List<SsaInsn> list) {
        int size;
        SsaInsn ssaInsn;
        int i;
        BitSet bitSet = new BitSet(this.parent.getRegCount());
        BitSet bitSet2 = new BitSet(this.parent.getRegCount());
        int size2 = list.size();
        int i2 = 0;
        while (i2 < size2) {
            for (int i3 = i2; i3 < size2; i3++) {
                setRegsUsed(bitSet, list.get(i3).getSources().m7188get(0));
                setRegsUsed(bitSet2, list.get(i3).getResult());
            }
            int i4 = i2;
            int i5 = i2;
            while (i4 < size2) {
                if (checkRegUsed(bitSet, list.get(i4).getResult())) {
                    i = i5;
                } else {
                    i = i5 + 1;
                    Collections.swap(list, i4, i5);
                }
                i4++;
                i5 = i;
            }
            if (i2 == i5) {
                SsaInsn ssaInsn2 = (SsaInsn) null;
                int i6 = i5;
                while (true) {
                    if (i6 >= size2) {
                        ssaInsn = ssaInsn2;
                        break;
                    }
                    ssaInsn = list.get(i6);
                    if (!checkRegUsed(bitSet, ssaInsn.getResult()) || !checkRegUsed(bitSet2, ssaInsn.getSources().m7188get(0))) {
                        i6++;
                    } else {
                        Collections.swap(list, i5, i6);
                        break;
                    }
                }
                RegisterSpec result = ssaInsn.getResult();
                RegisterSpec registerSpecWithReg = result.withReg(this.parent.borrowSpareRegister(result.getCategory()));
                int i7 = i5 + 1;
                list.add(i5, new NormalSsaInsn(new PlainInsn(Rops.opMove(result.getType()), SourcePosition.NO_INFO, registerSpecWithReg, ssaInsn.getSources()), this));
                list.set(i7, new NormalSsaInsn(new PlainInsn(Rops.opMove(result.getType()), SourcePosition.NO_INFO, result, RegisterSpecList.make(registerSpecWithReg)), this));
                size = list.size();
                i5 = i7;
            } else {
                size = size2;
            }
            bitSet.clear();
            bitSet2.clear();
            i2 = i5;
            size2 = size;
        }
    }

    public void addLiveOut(int i) {
        if (this.liveOut == null) {
            this.liveOut = SetFactory.makeLivenessSet(this.parent.getRegCount());
        }
        this.liveOut.mo7214add(i);
    }

    public void addLiveIn(int i) {
        if (this.liveIn == null) {
            this.liveIn = SetFactory.makeLivenessSet(this.parent.getRegCount());
        }
        this.liveIn.mo7214add(i);
    }

    public IntSet getLiveInRegs() {
        if (this.liveIn == null) {
            this.liveIn = SetFactory.makeLivenessSet(this.parent.getRegCount());
        }
        return this.liveIn;
    }

    public IntSet getLiveOutRegs() {
        if (this.liveOut == null) {
            this.liveOut = SetFactory.makeLivenessSet(this.parent.getRegCount());
        }
        return this.liveOut;
    }

    public boolean isExitBlock() {
        return this.index == this.parent.getExitBlockIndex();
    }

    public void scheduleMovesFromPhis() {
        if (this.movesFromPhisAtBeginning > 1) {
            scheduleUseBeforeAssigned(this.insns.subList(0, this.movesFromPhisAtBeginning));
            if (this.insns.get(this.movesFromPhisAtBeginning).isMoveException()) {
                throw new RuntimeException(new StringBuffer().append("Unexpected: moves from ").append("phis before move-exception").toString());
            }
        }
        if (this.movesFromPhisAtEnd > 1) {
            scheduleUseBeforeAssigned(this.insns.subList((this.insns.size() - this.movesFromPhisAtEnd) - 1, this.insns.size() - 1));
        }
        this.parent.returnSpareRegisters();
    }

    public void forEachInsn(SsaInsn.Visitor visitor) {
        int size = this.insns.size();
        for (int i = 0; i < size; i++) {
            this.insns.get(i).accept(visitor);
        }
    }

    public String toString() {
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("{").append(this.index).toString()).append(Config.TRACE_TODAY_VISIT_SPLIT).toString()).append(Hex.m7225u2(this.ropLabel)).toString()).append('}').toString();
    }

    public static final class LabelComparator implements Comparator<SsaBasicBlock> {
        @Override
        public int compare(SsaBasicBlock ssaBasicBlock, SsaBasicBlock ssaBasicBlock2) {
            return compare2(ssaBasicBlock, ssaBasicBlock2);
        }

        public int compare2(SsaBasicBlock ssaBasicBlock, SsaBasicBlock ssaBasicBlock2) {
            int i = ssaBasicBlock.ropLabel;
            int i2 = ssaBasicBlock2.ropLabel;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            return 0;
        }
    }
}
