package com.almlkaide.kaypro.android.dx.io.instructions;

import java.util.HashMap;

public final class AddressMap {

    private final HashMap<Integer, Integer> f5035map = new HashMap<>();

    public int m7174get(int i) {
        Integer num = this.f5035map.get(new Integer(i));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public void m7175put(int i, int i2) {
        this.f5035map.put(new Integer(i), new Integer(i2));
    }
}
