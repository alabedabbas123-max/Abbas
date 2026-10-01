package com.almlkaide.kaypro.android.dx.ssa.back;

import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.ssa.PhiInsn;
import com.almlkaide.kaypro.android.dx.ssa.SsaBasicBlock;
import com.almlkaide.kaypro.android.dx.ssa.SsaInsn;
import com.almlkaide.kaypro.android.dx.ssa.SsaMethod;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

public class LivenessAnalyzer {
    private SsaBasicBlock blockN;
    private final InterferenceGraph interference;
    private final BitSet liveOutBlocks;
    private NextFunction nextFunction;
    private final int regV;
    private final SsaMethod ssaMeth;
    private int statementIndex;
    private final BitSet visitedBlocks;

    private enum NextFunction {
        LIVE_IN_AT_STATEMENT,
        LIVE_OUT_AT_STATEMENT,
        LIVE_OUT_AT_BLOCK,
        DONE;

        public static NextFunction valueOf(String str) {
            for (NextFunction nextFunction : values()) {
                if (nextFunction.name().equals(str)) {
                    return nextFunction;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    public static InterferenceGraph constructInterferenceGraph(SsaMethod ssaMethod) {
        int regCount = ssaMethod.getRegCount();
        InterferenceGraph interferenceGraph = new InterferenceGraph(regCount);
        for (int i = 0; i < regCount; i++) {
            new LivenessAnalyzer(ssaMethod, i, interferenceGraph).m7213run();
        }
        coInterferePhis(ssaMethod, interferenceGraph);
        return interferenceGraph;
    }

    LivenessAnalyzer(SsaMethod ssaMethod, int i, InterferenceGraph interferenceGraph) {
        int size = ssaMethod.getBlocks().size();
        this.ssaMeth = ssaMethod;
        this.regV = i;
        this.visitedBlocks = new BitSet(size);
        this.liveOutBlocks = new BitSet(size);
        this.interference = interferenceGraph;
    }

    private void handleTailRecursion() {
        while (this.nextFunction != NextFunction.DONE) {
            NextFunction nextFunction = this.nextFunction;
            if (nextFunction == NextFunction.LIVE_IN_AT_STATEMENT) {
                this.nextFunction = NextFunction.DONE;
                liveInAtStatement();
            } else if (nextFunction == NextFunction.LIVE_OUT_AT_STATEMENT) {
                this.nextFunction = NextFunction.DONE;
                liveOutAtStatement();
            } else if (nextFunction == NextFunction.LIVE_OUT_AT_BLOCK) {
                this.nextFunction = NextFunction.DONE;
                liveOutAtBlock();
            }
        }
    }

    public void m7213run() {
        for (SsaInsn ssaInsn : this.ssaMeth.getUseListForRegister(this.regV)) {
            this.nextFunction = NextFunction.DONE;
            if (ssaInsn instanceof PhiInsn) {
                Iterator<SsaBasicBlock> it = ((PhiInsn) ssaInsn).predBlocksForReg(this.regV, this.ssaMeth).iterator();
                while (it.hasNext()) {
                    this.blockN = it.next();
                    this.nextFunction = NextFunction.LIVE_OUT_AT_BLOCK;
                    handleTailRecursion();
                }
            } else {
                this.blockN = ssaInsn.getBlock();
                this.statementIndex = this.blockN.getInsns().indexOf(ssaInsn);
                if (this.statementIndex < 0) {
                    throw new RuntimeException("insn not found in it's own block");
                }
                this.nextFunction = NextFunction.LIVE_IN_AT_STATEMENT;
                handleTailRecursion();
            }
        }
        while (true) {
            int iNextSetBit = this.liveOutBlocks.nextSetBit(0);
            if (iNextSetBit < 0) {
                return;
            }
            this.blockN = this.ssaMeth.getBlocks().get(iNextSetBit);
            this.liveOutBlocks.clear(iNextSetBit);
            this.nextFunction = NextFunction.LIVE_OUT_AT_BLOCK;
            handleTailRecursion();
        }
    }

    private void liveOutAtBlock() {
        if (this.visitedBlocks.get(this.blockN.getIndex())) {
            return;
        }
        this.visitedBlocks.set(this.blockN.getIndex());
        this.blockN.addLiveOut(this.regV);
        this.statementIndex = this.blockN.getInsns().size() - 1;
        this.nextFunction = NextFunction.LIVE_OUT_AT_STATEMENT;
    }

    private void liveInAtStatement() {
        if (this.statementIndex == 0) {
            this.blockN.addLiveIn(this.regV);
            this.liveOutBlocks.or(this.blockN.getPredecessors());
        } else {
            this.statementIndex--;
            this.nextFunction = NextFunction.LIVE_OUT_AT_STATEMENT;
        }
    }

    private void liveOutAtStatement() {
        SsaInsn ssaInsn = this.blockN.getInsns().get(this.statementIndex);
        RegisterSpec result = ssaInsn.getResult();
        if (ssaInsn.isResultReg(this.regV)) {
            return;
        }
        if (result != null) {
            this.interference.m7212add(this.regV, result.getReg());
        }
        this.nextFunction = NextFunction.LIVE_IN_AT_STATEMENT;
    }

    private static void coInterferePhis(SsaMethod ssaMethod, InterferenceGraph interferenceGraph) {
        Iterator<SsaBasicBlock> it = ssaMethod.getBlocks().iterator();
        while (it.hasNext()) {
            List<SsaInsn> phiInsns = it.next().getPhiInsns();
            int size = phiInsns.size();
            for (int i = 0; i < size; i++) {
                for (int i2 = 0; i2 < size; i2++) {
                    if (i != i2) {
                        SsaInsn ssaInsn = phiInsns.get(i);
                        SsaInsn ssaInsn2 = phiInsns.get(i2);
                        coInterferePhiRegisters(interferenceGraph, ssaInsn.getResult(), ssaInsn2.getSources());
                        coInterferePhiRegisters(interferenceGraph, ssaInsn2.getResult(), ssaInsn.getSources());
                        interferenceGraph.m7212add(ssaInsn.getResult().getReg(), ssaInsn2.getResult().getReg());
                    }
                }
            }
        }
    }

    private static void coInterferePhiRegisters(InterferenceGraph interferenceGraph, RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        int reg = registerSpec.getReg();
        for (int i = 0; i < registerSpecList.size(); i++) {
            interferenceGraph.m7212add(reg, registerSpecList.m7188get(i).getReg());
        }
    }
}
