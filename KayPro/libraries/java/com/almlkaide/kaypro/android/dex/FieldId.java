package com.almlkaide.kaypro.android.dex;

import com.almlkaide.kaypro.android.dex.util.Unsigned;

public final class FieldId implements Comparable<FieldId> {
    private final int declaringClassIndex;

    private final Dex f4976dex;
    private final int nameIndex;
    private final int typeIndex;

    @Override
    public int compareTo(FieldId fieldId) {
        return compareTo2(fieldId);
    }

    public FieldId(Dex c1679Dex, int i, int i2, int i3) {
        this.f4976dex = c1679Dex;
        this.declaringClassIndex = i;
        this.typeIndex = i2;
        this.nameIndex = i3;
    }

    public int getDeclaringClassIndex() {
        return this.declaringClassIndex;
    }

    public int getTypeIndex() {
        return this.typeIndex;
    }

    public int getNameIndex() {
        return this.nameIndex;
    }

    public int compareTo2(FieldId fieldId) {
        if (this.declaringClassIndex != fieldId.declaringClassIndex) {
            return Unsigned.compare(this.declaringClassIndex, fieldId.declaringClassIndex);
        }
        if (this.nameIndex != fieldId.nameIndex) {
            return Unsigned.compare(this.nameIndex, fieldId.nameIndex);
        }
        return Unsigned.compare(this.typeIndex, fieldId.typeIndex);
    }

    public void writeTo(Dex.Section section) {
        section.writeUnsignedShort(this.declaringClassIndex);
        section.writeUnsignedShort(this.typeIndex);
        section.writeInt(this.nameIndex);
    }

    public String toString() {
        return this.f4976dex == null ? new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(this.declaringClassIndex).append(" ").toString()).append(this.typeIndex).toString()).append(" ").toString()).append(this.nameIndex).toString() : new StringBuffer().append(new StringBuffer().append(this.f4976dex.typeNames().get(this.typeIndex)).append(".").toString()).append(this.f4976dex.strings().get(this.nameIndex)).toString();
    }
}
