package com.almlkaide.kaypro.android.dx.rop.code;

public final class ConservativeTranslationAdvice implements TranslationAdvice {
    public static final ConservativeTranslationAdvice THE_ONE = new ConservativeTranslationAdvice();

    ConservativeTranslationAdvice() {
    }

    @Override
    public boolean hasConstantOperation(Rop c1681Rop, RegisterSpec registerSpec, RegisterSpec registerSpec2) {
        return false;
    }

    @Override
    public boolean requiresSourcesInOrder(Rop c1681Rop, RegisterSpecList registerSpecList) {
        return false;
    }

    @Override
    public int getMaxOptimalRegisterCount() {
        return Integer.MAX_VALUE;
    }
}
