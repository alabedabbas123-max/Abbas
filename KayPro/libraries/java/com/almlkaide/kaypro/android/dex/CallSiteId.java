package com.almlkaide.kaypro.android.dex;

import com.almlkaide.kaypro.android.dex.util.Unsigned;

public class CallSiteId implements Comparable<CallSiteId> {

    private final Dex f4972dex;
    private final int offset;

    @Override
    public int compareTo(CallSiteId callSiteId) {
        return compareTo2(callSiteId);
    }

    public CallSiteId(Dex c1679Dex, int i) {
        this.f4972dex = c1679Dex;
        this.offset = i;
    }

    public int compareTo2(CallSiteId callSiteId) {
        return Unsigned.compare(this.offset, callSiteId.offset);
    }

    public int getCallSiteOffset() {
        return this.offset;
    }

    public void writeTo(Dex.Section section) {
        section.writeInt(this.offset);
    }

    public String toString() {
        return this.f4972dex == null ? String.valueOf(this.offset) : this.f4972dex.protoIds().get(this.offset).toString();
    }
}
