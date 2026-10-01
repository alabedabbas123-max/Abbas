package com.almlkaide.kaypro.android.dx.dex.cf;

import com.almlkaide.kaypro.android.dx.dex.code.DalvCode;
import com.almlkaide.kaypro.android.dx.rop.code.RopMethod;
import java.io.PrintStream;

public final class CodeStatistics {
    private static final boolean DEBUG = false;
    public int runningDeltaRegisters = 0;
    public int runningDeltaInsns = 0;
    public int runningTotalInsns = 0;
    public int dexRunningDeltaRegisters = 0;
    public int dexRunningDeltaInsns = 0;
    public int dexRunningTotalInsns = 0;
    public int runningOriginalBytes = 0;

    public void updateOriginalByteCount(int i) {
        this.runningOriginalBytes += i;
    }

    public void updateDexStatistics(DalvCode dalvCode, DalvCode dalvCode2) {
        this.dexRunningDeltaInsns += dalvCode2.getInsns().codeSize() - dalvCode.getInsns().codeSize();
        this.dexRunningDeltaRegisters += dalvCode2.getInsns().getRegistersSize() - dalvCode.getInsns().getRegistersSize();
        this.dexRunningTotalInsns += dalvCode2.getInsns().codeSize();
    }

    public void updateRopStatistics(RopMethod ropMethod, RopMethod ropMethod2) {
        int effectiveInstructionCount = ropMethod.getBlocks().getEffectiveInstructionCount();
        int regCount = ropMethod.getBlocks().getRegCount();
        int effectiveInstructionCount2 = ropMethod2.getBlocks().getEffectiveInstructionCount();
        this.runningDeltaInsns = (effectiveInstructionCount2 - effectiveInstructionCount) + this.runningDeltaInsns;
        this.runningDeltaRegisters += ropMethod2.getBlocks().getRegCount() - regCount;
        this.runningTotalInsns += effectiveInstructionCount2;
    }

    public void dumpStatistics(PrintStream printStream) {
        printStream.printf(new StringBuffer().append("Optimizer Delta Rop Insns: %d total: %d ").append("(%.2f%%) Delta Registers: %d\n").toString(), new Integer(this.runningDeltaInsns), new Integer(this.runningTotalInsns), new Double(((double) (this.runningDeltaInsns / (this.runningTotalInsns + Math.abs(this.runningDeltaInsns)))) * 100.0d), new Integer(this.runningDeltaRegisters));
        printStream.printf(new StringBuffer().append("Optimizer Delta Dex Insns: Insns: %d total: %d ").append("(%.2f%%) Delta Registers: %d\n").toString(), new Integer(this.dexRunningDeltaInsns), new Integer(this.dexRunningTotalInsns), new Double(((double) (this.dexRunningDeltaInsns / (this.dexRunningTotalInsns + Math.abs(this.dexRunningDeltaInsns)))) * 100.0d), new Integer(this.dexRunningDeltaRegisters));
        printStream.printf("Original bytecode byte count: %d\n", new Integer(this.runningOriginalBytes));
    }
}
