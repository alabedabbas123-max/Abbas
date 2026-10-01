package com.almlkaide.kaypro.android.dx.ssa.back;

import com.almlkaide.kaypro.android.dx.rop.code.BasicBlock;
import com.almlkaide.kaypro.android.dx.rop.code.BasicBlockList;
import com.almlkaide.kaypro.android.dx.rop.code.RopMethod;
import com.almlkaide.kaypro.android.dx.util.IntList;
import java.util.BitSet;

public class IdenticalBlockCombiner {
    private final BasicBlockList blocks;
    private final BasicBlockList newBlocks;
    private final RopMethod ropMethod;

    public IdenticalBlockCombiner(RopMethod ropMethod) {
        this.ropMethod = ropMethod;
        this.blocks = this.ropMethod.getBlocks();
        this.newBlocks = this.blocks.getMutableCopy();
    }

    public RopMethod process() {
        int size = this.blocks.size();
        BitSet bitSet = new BitSet(this.blocks.getMaxLabel());
        for (int i = 0; i < size; i++) {
            BasicBlock basicBlockM7181get = this.blocks.m7181get(i);
            if (!bitSet.get(basicBlockM7181get.getLabel())) {
                IntList intListLabelToPredecessors = this.ropMethod.labelToPredecessors(basicBlockM7181get.getLabel());
                int size2 = intListLabelToPredecessors.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    int iM7231get = intListLabelToPredecessors.m7231get(i2);
                    BasicBlock basicBlockLabelToBlock = this.blocks.labelToBlock(iM7231get);
                    if (!bitSet.get(iM7231get) && basicBlockLabelToBlock.getSuccessors().size() <= 1 && basicBlockLabelToBlock.getFirstInsn().getOpcode().getOpcode() != 55) {
                        IntList intList = new IntList();
                        for (int i3 = i2 + 1; i3 < size2; i3++) {
                            int iM7231get2 = intListLabelToPredecessors.m7231get(i3);
                            BasicBlock basicBlockLabelToBlock2 = this.blocks.labelToBlock(iM7231get2);
                            if (basicBlockLabelToBlock2.getSuccessors().size() == 1 && compareInsns(basicBlockLabelToBlock, basicBlockLabelToBlock2)) {
                                intList.m7230add(iM7231get2);
                                bitSet.set(iM7231get2);
                            }
                        }
                        combineBlocks(iM7231get, intList);
                    }
                }
            }
        }
        for (int i4 = size - 1; i4 >= 0; i4--) {
            if (bitSet.get(this.newBlocks.m7181get(i4).getLabel())) {
                this.newBlocks.m7182set(i4, (BasicBlock) null);
            }
        }
        this.newBlocks.shrinkToFit();
        this.newBlocks.setImmutable();
        return new RopMethod(this.newBlocks, this.ropMethod.getFirstLabel());
    }

    private static boolean compareInsns(BasicBlock basicBlock, BasicBlock basicBlock2) {
        return basicBlock.getInsns().contentEquals(basicBlock2.getInsns());
    }

    private void combineBlocks(int i, IntList intList) {
        int size = intList.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iM7231get = intList.m7231get(i2);
            IntList intListLabelToPredecessors = this.ropMethod.labelToPredecessors(this.blocks.labelToBlock(iM7231get).getLabel());
            int size2 = intListLabelToPredecessors.size();
            for (int i3 = 0; i3 < size2; i3++) {
                replaceSucc(this.newBlocks.labelToBlock(intListLabelToPredecessors.m7231get(i3)), iM7231get, i);
            }
        }
    }

    private void replaceSucc(BasicBlock basicBlock, int i, int i2) {
        IntList intListMutableCopy = basicBlock.getSuccessors().mutableCopy();
        intListMutableCopy.m7234set(intListMutableCopy.indexOf(i), i2);
        int primarySuccessor = basicBlock.getPrimarySuccessor();
        if (primarySuccessor != i) {
            i2 = primarySuccessor;
        }
        intListMutableCopy.setImmutable();
        this.newBlocks.m7182set(this.newBlocks.indexOfLabel(basicBlock.getLabel()), new BasicBlock(basicBlock.getLabel(), basicBlock.getInsns(), intListMutableCopy, i2));
    }
}
