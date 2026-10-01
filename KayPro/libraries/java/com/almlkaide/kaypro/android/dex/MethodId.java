package com.almlkaide.kaypro.android.dex;

import com.almlkaide.kaypro.android.dex.util.Unsigned;

public final class MethodId implements Comparable<MethodId> {
    private final int declaringClassIndex;

    private final Dex f4978dex;
    private final int nameIndex;
    private final int protoIndex;

    @Override
    public int compareTo(MethodId methodId) {
        return compareTo2(methodId);
    }

    public MethodId(Dex c1679Dex, int i, int i2, int i3) {
        this.f4978dex = c1679Dex;
        this.declaringClassIndex = i;
        this.protoIndex = i2;
        this.nameIndex = i3;
    }

    public int getDeclaringClassIndex() {
        return this.declaringClassIndex;
    }

    public int getProtoIndex() {
        return this.protoIndex;
    }

    public int getNameIndex() {
        return this.nameIndex;
    }

    public int compareTo2(MethodId methodId) {
        if (this.declaringClassIndex != methodId.declaringClassIndex) {
            return Unsigned.compare(this.declaringClassIndex, methodId.declaringClassIndex);
        }
        if (this.nameIndex != methodId.nameIndex) {
            return Unsigned.compare(this.nameIndex, methodId.nameIndex);
        }
        return Unsigned.compare(this.protoIndex, methodId.protoIndex);
    }

    public void writeTo(Dex.Section section) {
        section.writeUnsignedShort(this.declaringClassIndex);
        section.writeUnsignedShort(this.protoIndex);
        section.writeInt(this.nameIndex);
    }

    public String toString() {
        return this.f4978dex == null ? new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(this.declaringClassIndex).append(" ").toString()).append(this.protoIndex).toString()).append(" ").toString()).append(this.nameIndex).toString() : new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(this.f4978dex.typeNames().get(this.declaringClassIndex)).append(".").toString()).append(this.f4978dex.strings().get(this.nameIndex)).toString()).append(this.f4978dex.readTypeList(this.f4978dex.protoIds().get(this.protoIndex).getParametersOffset())).toString();
    }
}
