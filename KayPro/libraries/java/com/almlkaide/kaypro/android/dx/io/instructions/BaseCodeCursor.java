package com.almlkaide.kaypro.android.dx.io.instructions;

public abstract class BaseCodeCursor implements CodeCursor {
    private final AddressMap baseAddressMap = new AddressMap();
    private int cursor = 0;

    @Override
    public final int cursor() {
        return this.cursor;
    }

    @Override
    public final int baseAddressForCursor() {
        int iM7174get = this.baseAddressMap.m7174get(this.cursor);
        return iM7174get >= 0 ? iM7174get : this.cursor;
    }

    @Override
    public final void setBaseAddress(int i, int i2) {
        this.baseAddressMap.m7175put(i, i2);
    }

    protected final void advance(int i) {
        this.cursor += i;
    }
}
