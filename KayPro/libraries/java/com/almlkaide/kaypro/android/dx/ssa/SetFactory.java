package com.almlkaide.kaypro.android.dx.ssa;

import com.almlkaide.kaypro.android.dx.util.BitIntSet;
import com.almlkaide.kaypro.android.dx.util.IntSet;
import com.almlkaide.kaypro.android.dx.util.ListIntSet;

public final class SetFactory {
    private static final int DOMFRONT_SET_THRESHOLD_SIZE = 3072;
    private static final int INTERFERENCE_SET_THRESHOLD_SIZE = 3072;
    private static final int LIVENESS_SET_THRESHOLD_SIZE = 3072;

    static IntSet makeDomFrontSet(int i) {
        return i <= 3072 ? new BitIntSet(i) : new ListIntSet();
    }

    public static IntSet makeInterferenceSet(int i) {
        return i <= 3072 ? new BitIntSet(i) : new ListIntSet();
    }

    static IntSet makeLivenessSet(int i) {
        return i <= 3072 ? new BitIntSet(i) : new ListIntSet();
    }
}
