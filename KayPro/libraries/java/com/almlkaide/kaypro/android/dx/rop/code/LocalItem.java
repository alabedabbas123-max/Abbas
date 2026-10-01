package com.almlkaide.kaypro.android.dx.rop.code;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;

public class LocalItem implements Comparable<LocalItem> {
    private final CstString name;
    private final CstString signature;

    @Override
    public int compareTo(LocalItem localItem) {
        return compareTo2(localItem);
    }

    public static LocalItem make(CstString cstString, CstString cstString2) {
        return (cstString == null && cstString2 == null) ? (LocalItem) null : new LocalItem(cstString, cstString2);
    }

    LocalItem(CstString cstString, CstString cstString2) {
        this.name = cstString;
        this.signature = cstString2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof LocalItem) && compareTo2((LocalItem) obj) == 0;
    }

    private static int compareHandlesNulls(CstString cstString, CstString cstString2) {
        if (cstString == cstString2) {
            return 0;
        }
        if (cstString == null) {
            return -1;
        }
        if (cstString2 == null) {
            return 1;
        }
        return cstString.compareTo2((Constant) cstString2);
    }

    public int compareTo2(LocalItem localItem) {
        int iCompareHandlesNulls = compareHandlesNulls(this.name, localItem.name);
        if (iCompareHandlesNulls == 0) {
            return compareHandlesNulls(this.signature, localItem.signature);
        }
        return iCompareHandlesNulls;
    }

    public int hashCode() {
        return ((this.name == null ? 0 : this.name.hashCode()) * 31) + (this.signature != null ? this.signature.hashCode() : 0);
    }

    public String toString() {
        if (this.name != null && this.signature == null) {
            return this.name.toQuoted();
        }
        if (this.name == null && this.signature == null) {
            return "";
        }
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("[").append(this.name == null ? "" : this.name.toQuoted()).toString()).append("|").toString()).append(this.signature == null ? "" : this.signature.toQuoted()).toString();
    }

    public CstString getName() {
        return this.name;
    }

    public CstString getSignature() {
        return this.signature;
    }
}
