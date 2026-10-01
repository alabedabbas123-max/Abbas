package com.almlkaide.kaypro.android.dx.ssa;

import com.almlkaide.kaypro.android.dx.rop.code.RopMethod;
import com.almlkaide.kaypro.android.dx.rop.code.TranslationAdvice;
import com.almlkaide.kaypro.android.dx.ssa.back.LivenessAnalyzer;
import com.almlkaide.kaypro.android.dx.ssa.back.SsaToRop;
import java.util.EnumSet;

public class Optimizer {
    private static TranslationAdvice advice;
    private static boolean preserveLocals = true;

    public enum OptionalStep {
        MOVE_PARAM_COMBINER,
        SCCP,
        LITERAL_UPGRADE,
        CONST_COLLECTOR,
        ESCAPE_ANALYSIS;

        public static OptionalStep valueOf(String str) {
            for (OptionalStep optionalStep : values()) {
                if (optionalStep.name().equals(str)) {
                    return optionalStep;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    public static boolean getPreserveLocals() {
        return preserveLocals;
    }

    public static TranslationAdvice getAdvice() {
        return advice;
    }

    public static RopMethod optimize(RopMethod ropMethod, int i, boolean z, boolean z2, TranslationAdvice translationAdvice) {
        try {
            return optimize(ropMethod, i, z, z2, translationAdvice, EnumSet.allOf(Class.forName("com.almlkaide.kaypro.android.dx.ssa.Optimizer$OptionalStep")));
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static RopMethod optimize(RopMethod ropMethod, int i, boolean z, boolean z2, TranslationAdvice translationAdvice, EnumSet<OptionalStep> enumSet) {
        preserveLocals = z2;
        advice = translationAdvice;
        SsaMethod ssaMethodConvertToSsaMethod = SsaConverter.convertToSsaMethod(ropMethod, i, z);
        runSsaFormSteps(ssaMethodConvertToSsaMethod, enumSet);
        RopMethod ropMethodConvertToRopMethod = SsaToRop.convertToRopMethod(ssaMethodConvertToSsaMethod, false);
        if (ropMethodConvertToRopMethod.getBlocks().getRegCount() > advice.getMaxOptimalRegisterCount()) {
            return optimizeMinimizeRegisters(ropMethod, i, z, enumSet);
        }
        return ropMethodConvertToRopMethod;
    }

    private static RopMethod optimizeMinimizeRegisters(RopMethod ropMethod, int i, boolean z, EnumSet<OptionalStep> enumSet) {
        SsaMethod ssaMethodConvertToSsaMethod = SsaConverter.convertToSsaMethod(ropMethod, i, z);
        EnumSet<E> enumSetClone = enumSet.clone();
        enumSetClone.remove(OptionalStep.CONST_COLLECTOR);
        runSsaFormSteps(ssaMethodConvertToSsaMethod, enumSetClone);
        return SsaToRop.convertToRopMethod(ssaMethodConvertToSsaMethod, true);
    }

    private static void runSsaFormSteps(SsaMethod ssaMethod, EnumSet<OptionalStep> enumSet) {
        boolean z = false;
        boolean z2 = true;
        if (enumSet.contains(OptionalStep.MOVE_PARAM_COMBINER)) {
            MoveParamCombiner.process(ssaMethod);
        }
        if (enumSet.contains(OptionalStep.SCCP)) {
            SCCP.process(ssaMethod);
            DeadCodeRemover.process(ssaMethod);
            z2 = false;
        }
        if (enumSet.contains(OptionalStep.LITERAL_UPGRADE)) {
            LiteralOpUpgrader.process(ssaMethod);
            DeadCodeRemover.process(ssaMethod);
            z2 = false;
        }
        enumSet.remove(OptionalStep.ESCAPE_ANALYSIS);
        if (enumSet.contains(OptionalStep.ESCAPE_ANALYSIS)) {
            EscapeAnalysis.process(ssaMethod);
            DeadCodeRemover.process(ssaMethod);
            z2 = false;
        }
        if (enumSet.contains(OptionalStep.CONST_COLLECTOR)) {
            ConstCollector.process(ssaMethod);
            DeadCodeRemover.process(ssaMethod);
        } else {
            z = z2;
        }
        if (z) {
            DeadCodeRemover.process(ssaMethod);
        }
        PhiTypeResolver.process(ssaMethod);
    }

    public static SsaMethod debugEdgeSplit(RopMethod ropMethod, int i, boolean z, boolean z2, TranslationAdvice translationAdvice) {
        preserveLocals = z2;
        advice = translationAdvice;
        return SsaConverter.testEdgeSplit(ropMethod, i, z);
    }

    public static SsaMethod debugPhiPlacement(RopMethod ropMethod, int i, boolean z, boolean z2, TranslationAdvice translationAdvice) {
        preserveLocals = z2;
        advice = translationAdvice;
        return SsaConverter.testPhiPlacement(ropMethod, i, z);
    }

    public static SsaMethod debugRenaming(RopMethod ropMethod, int i, boolean z, boolean z2, TranslationAdvice translationAdvice) {
        preserveLocals = z2;
        advice = translationAdvice;
        return SsaConverter.convertToSsaMethod(ropMethod, i, z);
    }

    public static SsaMethod debugDeadCodeRemover(RopMethod ropMethod, int i, boolean z, boolean z2, TranslationAdvice translationAdvice) {
        preserveLocals = z2;
        advice = translationAdvice;
        SsaMethod ssaMethodConvertToSsaMethod = SsaConverter.convertToSsaMethod(ropMethod, i, z);
        DeadCodeRemover.process(ssaMethodConvertToSsaMethod);
        return ssaMethodConvertToSsaMethod;
    }

    public static SsaMethod debugNoRegisterAllocation(RopMethod ropMethod, int i, boolean z, boolean z2, TranslationAdvice translationAdvice, EnumSet<OptionalStep> enumSet) {
        preserveLocals = z2;
        advice = translationAdvice;
        SsaMethod ssaMethodConvertToSsaMethod = SsaConverter.convertToSsaMethod(ropMethod, i, z);
        runSsaFormSteps(ssaMethodConvertToSsaMethod, enumSet);
        LivenessAnalyzer.constructInterferenceGraph(ssaMethodConvertToSsaMethod);
        return ssaMethodConvertToSsaMethod;
    }
}
