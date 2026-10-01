package com.almlkaide.kaypro.android.dx.rop.code;

import com.almlkaide.kaypro.android.dx.util.Hex;
import com.almlkaide.kaypro.android.dx.util.IntList;

public final class RopMethod {
    private final BasicBlockList blocks;
    private IntList exitPredecessors;
    private final int firstLabel;
    private IntList[] predecessors;

    public RopMethod(BasicBlockList basicBlockList, int i) {
        if (basicBlockList == null) {
            throw new NullPointerException("blocks == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("firstLabel < 0");
        }
        this.blocks = basicBlockList;
        this.firstLabel = i;
        this.predecessors = (IntList[]) null;
        this.exitPredecessors = (IntList) null;
    }

    public BasicBlockList getBlocks() {
        return this.blocks;
    }

    public int getFirstLabel() {
        return this.firstLabel;
    }

    public IntList labelToPredecessors(int i) {
        if (this.exitPredecessors == null) {
            calcPredecessors();
        }
        IntList intList = this.predecessors[i];
        if (intList == null) {
            throw new RuntimeException(new StringBuffer().append("no such block: ").append(Hex.m7225u2(i)).toString());
        }
        return intList;
    }

    public IntList getExitPredecessors() {
        if (this.exitPredecessors == null) {
            calcPredecessors();
        }
        return this.exitPredecessors;
    }

    public RopMethod withRegisterOffset(int i) {
        RopMethod ropMethod = new RopMethod(this.blocks.withRegisterOffset(i), this.firstLabel);
        if (this.exitPredecessors != null) {
            ropMethod.exitPredecessors = this.exitPredecessors;
            ropMethod.predecessors = this.predecessors;
        }
        return ropMethod;
    }

    private void calcPredecessors() {
        int maxLabel = this.blocks.getMaxLabel();
        IntList[] intListArr = new IntList[maxLabel];
        IntList intList = new IntList(10);
        int size = this.blocks.size();
        for (int i = 0; i < size; i++) {
            BasicBlock basicBlockM7181get = this.blocks.m7181get(i);
            int label = basicBlockM7181get.getLabel();
            IntList successors = basicBlockM7181get.getSuccessors();
            int size2 = successors.size();
            if (size2 == 0) {
                intList.m7230add(label);
            } else {
                for (int i2 = 0; i2 < size2; i2++) {
                    int iM7231get = successors.m7231get(i2);
                    IntList intList2 = intListArr[iM7231get];
                    if (intList2 == null) {
                        intList2 = new IntList(10);
                        intListArr[iM7231get] = intList2;
                    }
                    intList2.m7230add(label);
                }
            }
        }
        for (int i3 = 0; i3 < maxLabel; i3++) {
            IntList intList3 = intListArr[i3];
            if (intList3 != null) {
                intList3.sort();
                intList3.setImmutable();
            }
        }
        intList.sort();
        intList.setImmutable();
        if (intListArr[this.firstLabel] == null) {
            intListArr[this.firstLabel] = IntList.EMPTY;
        }
        this.predecessors = intListArr;
        this.exitPredecessors = intList;
    }
}
