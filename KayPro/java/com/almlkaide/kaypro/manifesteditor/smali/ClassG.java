package com.almlkaide.kaypro.manifesteditor.smali;

import abcd.Cb;
import abcd.Da;
import abcd.Fb;
import abcd.Ia;
import abcd.La;
import abcd.Na;
import abcd.Sa;
import abcd.Ta;
import abcd.Ya;
import abcd.Yb;
import abcd.ab;
import abcd.na;
import abcd.nb;
import abcd.qa;
import abcd.wb;
import java.util.List;
import java.util.Set;

public class ClassG implements qa {

    private final La f3553a;

    public ClassG(La la) {
        this.f3553a = la;
    }

    private int m5627a(Da da, int i, int i2) {
        String strJ6 = da.j6(i, i2);
        int length = strJ6.length() - 1;
        while (length >= 0 && (Character.isLetter(strJ6.charAt(length)) || strJ6.charAt(length) == '.')) {
            length--;
        }
        return length + 2;
    }

    private static void m5628a(ab abVar) {
        abVar.DW("parcelable");
        abVar.DW("import");
        abVar.DW("package");
        abVar.DW("int");
        abVar.DW("String");
        abVar.DW("in");
        abVar.DW("out");
        abVar.DW("inout");
        abVar.DW("cpp_header");
        abVar.DW("const");
        abVar.DW("@nullable");
        abVar.DW("@utf8");
        abVar.DW("@utf8InCpp");
        abVar.DW("interface");
        abVar.DW("oneway");
        abVar.DW("boolean");
    }

    public wb m5629DW(Sa sa, Ta ta, int i, int i2, int i3) {
        return null;
    }

    public String m5630DW(Na na) {
        return null;
    }

    public void m5631DW(Da da, int i, int i2) {
    }

    public void m5632DW(Da da, int i, int i2, int i3, int i4) {
    }

    public void m5633DW(Sa sa, Ta ta, int i, int i2) {
    }

    public wb m5634FH(Sa sa, Ta ta, int i, int i2, int i3) {
        return null;
    }

    public String m5635FH(Na na) {
        return null;
    }

    public void m5636FH(Da da, int i, int i2) {
    }

    public void m5637FH(Da da, int i, int i2, int i3, int i4) {
    }

    public void m5638FH(Sa sa, Ta ta, int i, int i2) {
    }

    public void m5639Hw(Da da, int i, int i2) {
    }

    public void m5640Hw(Da da, int i, int i2, int i3, int i4) {
    }

    public void m5641VH(Da da, int i, int i2) {
    }

    public void m5642Zo(Da da, int i, int i2) {
    }

    public void m5643gn(Da da, int i, int i2) {
    }

    public wb m5644j6(Sa sa, Ta ta, int i, int i2, int i3) {
        return null;
    }

    public String m5645j6() {
        return null;
    }

    public String m5646j6(Na na) {
        return null;
    }

    public String m5647j6(Sa sa, int i, int i2, Ya ya) {
        return null;
    }

    public String m5648j6(Sa sa, int i, int i2, Yb yb) {
        return null;
    }

    public String m5649j6(Sa sa, int i, int i2, Yb yb, Yb yb2) {
        return null;
    }

    public String m5650j6(Sa sa, Fb fb) {
        return null;
    }

    public String m5651j6(Sa sa, Fb fb, Yb yb) {
        return null;
    }

    public String m5652j6(String str, String str2) {
        return null;
    }

    public Set m5653j6(Sa sa, int i) {
        return null;
    }

    public void m5654j6(Da da) {
    }

    public void m5655j6(Da da, int i, int i2, int i3, int i4) {
    }

    public void m5656j6(Da da, int i, int i2, int i3, int i4, Ya ya) {
    }

    public void m5657j6(Da da, int i, int i2, int i3, int i4, Ya ya, int[] iArr, Ya[] yaArr, int[] iArr2) {
    }

    public void m5658j6(Da da, int i, int i2, int i3, Ya ya) {
    }

    public void m5659j6(Da da, int i, int i2, Ia ia) {
    }

    public void m5660j6(Da da, int i, int i2, String str, int i3) {
    }

    public void m5661j6(Da da, int i, int i2, String str, int i3, int i4, boolean z) {
    }

    public void m5662j6(Da da, int i, int i2, boolean z) {
    }

    public void m5663j6(Da da, Da da2, int i, int i2, int i3, int i4) {
    }

    public void m5664j6(Da da, Ia ia, Cb cb, Cb cb2, Cb cb3, Cb cb4, Cb cb5) {
    }

    public void m5665j6(Da da, String str) {
    }

    public void m5666j6(Sa sa, int i, int i2) {
    }

    public void m5667j6(Sa sa, int i, int i2, int i3, boolean z) {
    }

    public void m5668j6(Sa sa, Da da, na naVar, int i, int i2) {
        ab abVar = this.f3553a.VH;
        String strXL = da.XL();
        ClassC.m5558a(strXL, "AIDL", "AUTO HINT");
        if (!strXL.endsWith(".aidl")) {
            abVar.DW(da, i, i2);
            return;
        }
        abVar.j6();
        m5628a(abVar);
        abVar.j6(da, naVar, i, i2, m5627a(da, i, i2), false, false);
    }

    public void m5669j6(nb nbVar, Da da, int i, int i2, String str, List list) {
    }

    public boolean m5670j6(Da da, int i, int i2) {
        return false;
    }

    public boolean m5671j6(Ia ia, Cb cb, Cb cb2, Cb cb3, Cb cb4, Cb cb5) {
        return false;
    }

    public boolean m5672j6(String str) {
        return false;
    }

    public int[] m5673j6(Sa sa, Ta ta, int i, int i2) {
        return new int[0];
    }

    public void m5674u7(Da da, int i, int i2) {
    }

    public void m5675v5(Da da, int i, int i2) {
    }

    public void m5676v5(Da da, int i, int i2, int i3, int i4) {
    }
}
