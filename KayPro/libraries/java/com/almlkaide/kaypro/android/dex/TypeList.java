package com.almlkaide.kaypro.android.dex;

import com.almlkaide.kaypro.android.dex.util.Unsigned;

public final class TypeList implements Comparable<TypeList> {
    public static final TypeList EMPTY = new TypeList((Dex) null, Dex.EMPTY_SHORT_ARRAY);

    private final Dex f4981dex;
    private final short[] types;

    @Override
    public int compareTo(TypeList typeList) {
        return compareTo2(typeList);
    }

    public TypeList(Dex c1679Dex, short[] sArr) {
        this.f4981dex = c1679Dex;
        this.types = sArr;
    }

    public short[] getTypes() {
        return this.types;
    }

    public int compareTo2(TypeList typeList) {
        for (int i = 0; i < this.types.length && i < typeList.types.length; i++) {
            if (this.types[i] != typeList.types[i]) {
                return Unsigned.compare(this.types[i], typeList.types[i]);
            }
        }
        return Unsigned.compare(this.types.length, typeList.types.length);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        int length = this.types.length;
        for (int i = 0; i < length; i++) {
            sb.append(this.f4981dex != null ? this.f4981dex.typeNames().get(this.types[i]) : new Short(this.types[i]));
        }
        sb.append(")");
        return sb.toString();
    }
}
