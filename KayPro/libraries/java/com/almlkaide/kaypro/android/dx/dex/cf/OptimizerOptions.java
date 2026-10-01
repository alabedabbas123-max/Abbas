package com.almlkaide.kaypro.android.dx.dex.cf;

import com.almlkaide.kaypro.android.dx.rop.code.RopMethod;
import com.almlkaide.kaypro.android.dx.rop.code.TranslationAdvice;
import com.almlkaide.kaypro.android.dx.ssa.Optimizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.EnumSet;
import java.util.HashSet;

public class OptimizerOptions {
    private HashSet<String> dontOptimizeList;
    private HashSet<String> optimizeList;
    private boolean optimizeListsLoaded;

    public void loadOptimizeLists(String str, String str2) {
        if (!this.optimizeListsLoaded) {
            if (str != null && str2 != null) {
                throw new RuntimeException(new StringBuffer().append("optimize and don't optimize lists ").append(" are mutually exclusive.").toString());
            }
            if (str != null) {
                this.optimizeList = loadStringsFromFile(str);
            }
            if (str2 != null) {
                this.dontOptimizeList = loadStringsFromFile(str2);
            }
            this.optimizeListsLoaded = true;
        }
    }

    private static HashSet<String> loadStringsFromFile(String str) {
        HashSet<String> hashSet = new HashSet<>();
        try {
            FileReader fileReader = new FileReader(str);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    hashSet.add(line);
                } else {
                    fileReader.close();
                    return hashSet;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(new StringBuffer().append("Error with optimize list: ").append(str).toString(), e);
        }
    }

    public void compareOptimizerStep(RopMethod ropMethod, int i, boolean z, CfOptions cfOptions, TranslationAdvice translationAdvice, RopMethod ropMethod2) {
        try {
            EnumSet enumSetAllOf = EnumSet.allOf(Class.forName("com.almlkaide.kaypro.android.dx.ssa.Optimizer$OptionalStep"));
            enumSetAllOf.remove(Optimizer.OptionalStep.CONST_COLLECTOR);
            RopMethod ropMethodOptimize = Optimizer.optimize(ropMethod, i, z, cfOptions.localInfo, translationAdvice, enumSetAllOf);
            int effectiveInstructionCount = ropMethod2.getBlocks().getEffectiveInstructionCount();
            int effectiveInstructionCount2 = ropMethodOptimize.getBlocks().getEffectiveInstructionCount();
            System.err.printf(new StringBuffer().append("optimize step regs:(%d/%d/%.2f%%)").append(" insns:(%d/%d/%.2f%%)\n").toString(), new Integer(ropMethod2.getBlocks().getRegCount()), new Integer(ropMethodOptimize.getBlocks().getRegCount()), new Double(100.0d * ((double) ((ropMethodOptimize.getBlocks().getRegCount() - ropMethod2.getBlocks().getRegCount()) / ropMethodOptimize.getBlocks().getRegCount()))), new Integer(effectiveInstructionCount), new Integer(effectiveInstructionCount2), new Double(100.0d * ((double) ((effectiveInstructionCount2 - effectiveInstructionCount) / effectiveInstructionCount2))));
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public boolean shouldOptimize(String str) {
        if (this.optimizeList != null) {
            return this.optimizeList.contains(str);
        }
        return this.dontOptimizeList == null || !this.dontOptimizeList.contains(str);
    }
}
