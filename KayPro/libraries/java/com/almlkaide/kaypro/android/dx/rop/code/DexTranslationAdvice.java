package com.almlkaide.kaypro.android.dx.rop.code;

import com.almlkaide.kaypro.android.dx.rop.cst.CstInteger;
import com.almlkaide.kaypro.android.dx.rop.type.Type;

public final class DexTranslationAdvice implements TranslationAdvice {
    private static final int MIN_INVOKE_IN_ORDER = 6;
    private final boolean disableSourcesInOrder;
    public static final DexTranslationAdvice THE_ONE = new DexTranslationAdvice();
    public static final DexTranslationAdvice NO_SOURCES_IN_ORDER = new DexTranslationAdvice(true);

    DexTranslationAdvice() {
        this.disableSourcesInOrder = false;
    }

    DexTranslationAdvice(boolean z) {
        this.disableSourcesInOrder = z;
    }

    @Override
    public boolean hasConstantOperation(Rop c1681Rop, RegisterSpec registerSpec, RegisterSpec registerSpec2) {
        if (registerSpec.getType() != Type.f5078INT) {
            return false;
        }
        if (!(registerSpec2.getTypeBearer() instanceof CstInteger)) {
            if ((registerSpec.getTypeBearer() instanceof CstInteger) && c1681Rop.getOpcode() == 15) {
                return ((CstInteger) registerSpec.getTypeBearer()).fitsIn16Bits();
            }
            return false;
        }
        CstInteger cstInteger = (CstInteger) registerSpec2.getTypeBearer();
        switch (c1681Rop.getOpcode()) {
            case 14:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
                return cstInteger.fitsIn16Bits();
            case 15:
                return CstInteger.make(-cstInteger.getValue()).fitsIn16Bits();
            case 19:
            default:
                return false;
            case 23:
            case 24:
            case 25:
                return cstInteger.fitsIn8Bits();
        }
    }

    @Override
    public boolean requiresSourcesInOrder(Rop c1681Rop, RegisterSpecList registerSpecList) {
        return !this.disableSourcesInOrder && c1681Rop.isCallLike() && totalRopWidth(registerSpecList) >= 6;
    }

    private int totalRopWidth(RegisterSpecList registerSpecList) {
        int size = registerSpecList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            int category = registerSpecList.m7188get(i).getCategory() + i2;
            i++;
            i2 = category;
        }
        return i2;
    }

    @Override
    public int getMaxOptimalRegisterCount() {
        return 16;
    }
}
