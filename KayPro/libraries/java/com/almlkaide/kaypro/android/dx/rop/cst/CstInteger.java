package com.almlkaide.kaypro.android.dx.rop.cst;

import android.support.v4.app.FrameMetricsAggregator;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.util.Hex;

public final class CstInteger extends CstLiteral32 {
    private static final CstInteger[] cache = new CstInteger[FrameMetricsAggregator.EVERY_DURATION];
    public static final CstInteger VALUE_M1 = make(-1);
    public static final CstInteger VALUE_0 = make(0);
    public static final CstInteger VALUE_1 = make(1);
    public static final CstInteger VALUE_2 = make(2);
    public static final CstInteger VALUE_3 = make(3);
    public static final CstInteger VALUE_4 = make(4);
    public static final CstInteger VALUE_5 = make(5);

    public static CstInteger make(int i) {
        int length = (Integer.MAX_VALUE & i) % cache.length;
        CstInteger cstInteger = cache[length];
        if (cstInteger == null || cstInteger.getValue() != i) {
            CstInteger cstInteger2 = new CstInteger(i);
            cache[length] = cstInteger2;
            return cstInteger2;
        }
        return cstInteger;
    }

    CstInteger(int i) {
        super(i);
    }

    public String toString() {
        int intBits = getIntBits();
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("int{0x").append(Hex.m7227u4(intBits)).toString()).append(" / ").toString()).append(intBits).toString()).append('}').toString();
    }

    @Override
    public Type getType() {
        return Type.f5078INT;
    }

    @Override
    public String typeName() {
        return "int";
    }

    @Override
    public String toHuman() {
        return Integer.toString(getIntBits());
    }

    public int getValue() {
        return getIntBits();
    }
}
