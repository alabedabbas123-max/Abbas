package com.almlkaide.kaypro.android.dx.rop.code;

public interface TranslationAdvice {
    int getMaxOptimalRegisterCount();

    boolean hasConstantOperation(Rop c1681Rop, RegisterSpec registerSpec, RegisterSpec registerSpec2);

    boolean requiresSourcesInOrder(Rop c1681Rop, RegisterSpecList registerSpecList);
}
