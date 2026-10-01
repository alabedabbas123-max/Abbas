package com.almlkaide.kaypro.android.dx.ssa.back;

import com.almlkaide.kaypro.android.dx.rop.code.BasicBlock;
import com.almlkaide.kaypro.android.dx.rop.code.BasicBlockList;
import com.almlkaide.kaypro.android.dx.rop.code.Rop;
import com.almlkaide.kaypro.android.dx.rop.code.InsnList;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.RopMethod;
import com.almlkaide.kaypro.android.dx.rop.code.Rops;
import com.almlkaide.kaypro.android.dx.ssa.BasicRegisterMapper;
import com.almlkaide.kaypro.android.dx.ssa.PhiInsn;
import com.almlkaide.kaypro.android.dx.ssa.RegisterMapper;
import com.almlkaide.kaypro.android.dx.ssa.SsaBasicBlock;
import com.almlkaide.kaypro.android.dx.ssa.SsaInsn;
import com.almlkaide.kaypro.android.dx.ssa.SsaMethod;
import com.almlkaide.kaypro.android.dx.util.Hex;
import com.almlkaide.kaypro.android.dx.util.IntList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.Iterator;

public class SsaToRop {
    private static final boolean DEBUG = false;
    private final InterferenceGraph interference;
    private final boolean minimizeRegisters;
    private final SsaMethod ssaMeth;

    public static RopMethod convertToRopMethod(SsaMethod ssaMethod, boolean z) {
        return new SsaToRop(ssaMethod, z).convert();
    }

    SsaToRop(SsaMethod ssaMethod, boolean z) {
        this.minimizeRegisters = z;
        this.ssaMeth = ssaMethod;
        this.interference = LivenessAnalyzer.constructInterferenceGraph(ssaMethod);
    }

    private RopMethod convert() {
        FirstFitLocalCombiningAllocator firstFitLocalCombiningAllocator = new FirstFitLocalCombiningAllocator(this.ssaMeth, this.interference, this.minimizeRegisters);
        RegisterMapper registerMapperAllocateRegisters = firstFitLocalCombiningAllocator.allocateRegisters();
        this.ssaMeth.setBackMode();
        this.ssaMeth.mapRegisters(registerMapperAllocateRegisters);
        removePhiFunctions();
        if (firstFitLocalCombiningAllocator.wantsParamsMovedHigh()) {
            moveParametersToHighRegisters();
        }
        removeEmptyGotos();
        return new IdenticalBlockCombiner(new RopMethod(convertBasicBlocks(), this.ssaMeth.blockIndexToRopLabel(this.ssaMeth.getEntryBlockIndex()))).process();
    }

    private void removeEmptyGotos() {
        this.ssaMeth.forEachBlockDepthFirst(false, new SsaBasicBlock.Visitor(this, this.ssaMeth.getBlocks()) {
            private final SsaToRop this$0;
            private final ArrayList val$blocks;

            {
                this.this$0 = this;
                this.val$blocks = arrayList;
            }

            @Override
            public void visitBlock(SsaBasicBlock ssaBasicBlock, SsaBasicBlock ssaBasicBlock2) {
                ArrayList<SsaInsn> insns = ssaBasicBlock.getInsns();
                if (insns.size() == 1 && insns.get(0).getOpcode() == Rops.GOTO) {
                    BitSet bitSet = (BitSet) ssaBasicBlock.getPredecessors().clone();
                    for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
                        ((SsaBasicBlock) this.val$blocks.get(iNextSetBit)).replaceSuccessor(ssaBasicBlock.getIndex(), ssaBasicBlock.getPrimarySuccessorIndex());
                    }
                }
            }
        });
    }

    private void removePhiFunctions() {
        ArrayList<SsaBasicBlock> blocks = this.ssaMeth.getBlocks();
        for (SsaBasicBlock ssaBasicBlock : blocks) {
            ssaBasicBlock.forEachPhiInsn(new PhiVisitor(blocks));
            ssaBasicBlock.removeAllPhiInsns();
        }
        Iterator<SsaBasicBlock> it = blocks.iterator();
        while (it.hasNext()) {
            it.next().scheduleMovesFromPhis();
        }
    }

    private static class PhiVisitor implements PhiInsn.Visitor {
        private final ArrayList<SsaBasicBlock> blocks;

        public PhiVisitor(ArrayList<SsaBasicBlock> arrayList) {
            this.blocks = arrayList;
        }

        @Override
        public void visitPhiInsn(PhiInsn phiInsn) {
            RegisterSpecList sources = phiInsn.getSources();
            RegisterSpec result = phiInsn.getResult();
            int size = sources.size();
            for (int i = 0; i < size; i++) {
                this.blocks.get(phiInsn.predBlockIndexForSourcesIndex(i)).addMoveToEnd(result, sources.m7188get(i));
            }
        }
    }

    private void moveParametersToHighRegisters() {
        int paramWidth = this.ssaMeth.getParamWidth();
        BasicRegisterMapper basicRegisterMapper = new BasicRegisterMapper(this.ssaMeth.getRegCount());
        int regCount = this.ssaMeth.getRegCount();
        for (int i = 0; i < regCount; i++) {
            if (i < paramWidth) {
                basicRegisterMapper.addMapping(i, (regCount - paramWidth) + i, 1);
            } else {
                basicRegisterMapper.addMapping(i, i - paramWidth, 1);
            }
        }
        this.ssaMeth.mapRegisters(basicRegisterMapper);
    }

    private BasicBlockList convertBasicBlocks() {
        ArrayList<SsaBasicBlock> blocks = this.ssaMeth.getBlocks();
        SsaBasicBlock exitBlock = this.ssaMeth.getExitBlock();
        BitSet bitSetComputeReachability = this.ssaMeth.computeReachability();
        int iCardinality = bitSetComputeReachability.cardinality();
        if (exitBlock != null && bitSetComputeReachability.get(exitBlock.getIndex())) {
            iCardinality--;
        }
        BasicBlockList basicBlockList = new BasicBlockList(iCardinality);
        int i = 0;
        for (SsaBasicBlock ssaBasicBlock : blocks) {
            if (bitSetComputeReachability.get(ssaBasicBlock.getIndex()) && ssaBasicBlock != exitBlock) {
                basicBlockList.m7182set(i, convertBasicBlock(ssaBasicBlock));
                i++;
            }
        }
        if (exitBlock != null && !exitBlock.getInsns().isEmpty()) {
            throw new RuntimeException("Exit block must have no insns when leaving SSA form");
        }
        return basicBlockList;
    }

    private void verifyValidExitPredecessor(SsaBasicBlock ssaBasicBlock) {
        ArrayList<SsaInsn> insns = ssaBasicBlock.getInsns();
        Rop opcode = insns.get(insns.size() - 1).getOpcode();
        if (opcode.getBranchingness() != 2 && opcode != Rops.THROW) {
            throw new RuntimeException(new StringBuffer().append("Exit predecessor must end").append(" in valid exit statement.").toString());
        }
    }

    private BasicBlock convertBasicBlock(SsaBasicBlock ssaBasicBlock) {
        IntList intList;
        int i = -1;
        IntList ropLabelSuccessorList = ssaBasicBlock.getRopLabelSuccessorList();
        int primarySuccessorRopLabel = ssaBasicBlock.getPrimarySuccessorRopLabel();
        SsaBasicBlock exitBlock = this.ssaMeth.getExitBlock();
        if (!ropLabelSuccessorList.contains(exitBlock == null ? -1 : exitBlock.getRopLabel())) {
            i = primarySuccessorRopLabel;
            intList = ropLabelSuccessorList;
        } else {
            if (ropLabelSuccessorList.size() > 1) {
                throw new RuntimeException(new StringBuffer().append("Exit predecessor must have no other successors").append(Hex.m7225u2(ssaBasicBlock.getRopLabel())).toString());
            }
            intList = IntList.EMPTY;
            verifyValidExitPredecessor(ssaBasicBlock);
        }
        intList.setImmutable();
        return new BasicBlock(ssaBasicBlock.getRopLabel(), convertInsns(ssaBasicBlock.getInsns()), intList, i);
    }

    private InsnList convertInsns(ArrayList<SsaInsn> arrayList) {
        int size = arrayList.size();
        InsnList insnList = new InsnList(size);
        for (int i = 0; i < size; i++) {
            insnList.m7184set(i, arrayList.get(i).toRopInsn());
        }
        insnList.setImmutable();
        return insnList;
    }

    public int[] getRegistersByFrequency() {
        int regCount = this.ssaMeth.getRegCount();
        Integer[] numArr = new Integer[regCount];
        for (int i = 0; i < regCount; i++) {
            numArr[i] = new Integer(i);
        }
        Arrays.sort(numArr, new Comparator<Integer>(this) {
            private final SsaToRop this$0;

            {
                this.this$0 = this;
            }

            @Override
            public int compare(Integer num, Integer num2) {
                return compare2(num, num2);
            }

            public int compare2(Integer num, Integer num2) {
                return this.this$0.ssaMeth.getUseListForRegister(num2.intValue()).size() - this.this$0.ssaMeth.getUseListForRegister(num.intValue()).size();
            }
        });
        int[] iArr = new int[regCount];
        for (int i2 = 0; i2 < regCount; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
        return iArr;
    }
}
