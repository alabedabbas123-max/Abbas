package com.almlkaide.kaypro.android.dx.rop.annotation;

import com.baidu.mobstat.Config;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;

public final class NameValuePair implements Comparable<NameValuePair> {
    private final CstString name;
    private final Constant value;

    @Override
    public int compareTo(NameValuePair nameValuePair) {
        return compareTo2(nameValuePair);
    }

    public NameValuePair(CstString cstString, Constant constant) {
        if (cstString == null) {
            throw new NullPointerException("name == null");
        }
        if (constant == null) {
            throw new NullPointerException("value == null");
        }
        this.name = cstString;
        this.value = constant;
    }

    public String toString() {
        return new StringBuffer().append(new StringBuffer().append(this.name.toHuman()).append(Config.TRACE_TODAY_VISIT_SPLIT).toString()).append(this.value).toString();
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NameValuePair)) {
            return false;
        }
        NameValuePair nameValuePair = (NameValuePair) obj;
        return this.name.equals(nameValuePair.name) && this.value.equals(nameValuePair.value);
    }

    public int compareTo2(NameValuePair nameValuePair) {
        int iCompareTo = this.name.compareTo2((Constant) nameValuePair.name);
        return iCompareTo != 0 ? iCompareTo : this.value.compareTo2(nameValuePair.value);
    }

    public CstString getName() {
        return this.name;
    }

    public Constant getValue() {
        return this.value;
    }
}
