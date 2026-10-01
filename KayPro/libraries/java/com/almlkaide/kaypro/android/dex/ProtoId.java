package com.almlkaide.kaypro.android.dex;

import com.almlkaide.kaypro.android.dex.util.Unsigned;

public final class ProtoId implements Comparable<ProtoId> {

    private final Dex f4979dex;
    private final int parametersOffset;
    private final int returnTypeIndex;
    private final int shortyIndex;

    @Override
    public int compareTo(ProtoId protoId) {
        return compareTo2(protoId);
    }

    public ProtoId(Dex c1679Dex, int i, int i2, int i3) {
        this.f4979dex = c1679Dex;
        this.shortyIndex = i;
        this.returnTypeIndex = i2;
        this.parametersOffset = i3;
    }

    public int compareTo2(ProtoId protoId) {
        return this.returnTypeIndex != protoId.returnTypeIndex ? Unsigned.compare(this.returnTypeIndex, protoId.returnTypeIndex) : Unsigned.compare(this.parametersOffset, protoId.parametersOffset);
    }

    public int getShortyIndex() {
        return this.shortyIndex;
    }

    public int getReturnTypeIndex() {
        return this.returnTypeIndex;
    }

    public int getParametersOffset() {
        return this.parametersOffset;
    }

    public void writeTo(Dex.Section section) {
        section.writeInt(this.shortyIndex);
        section.writeInt(this.returnTypeIndex);
        section.writeInt(this.parametersOffset);
    }

    public String toString() {
        return this.f4979dex == null ? new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(this.shortyIndex).append(" ").toString()).append(this.returnTypeIndex).toString()).append(" ").toString()).append(this.parametersOffset).toString() : new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(this.f4979dex.strings().get(this.shortyIndex)).append(": ").toString()).append(this.f4979dex.typeNames().get(this.returnTypeIndex)).toString()).append(" ").toString()).append(this.f4979dex.readTypeList(this.parametersOffset)).toString();
    }
}
