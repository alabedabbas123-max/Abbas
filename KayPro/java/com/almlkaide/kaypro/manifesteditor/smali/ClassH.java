package com.almlkaide.kaypro.manifesteditor.smali;

import abcd.Da;
import abcd.La;
import abcd.Sa;
import abcd.Wa;
import abcd.ja;
import abcd.ka;
import abcd.la;
import abcd.ma;
import abcd.na;
import com.ClassB;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ClassH implements la {

    private final na f3554a;

    private ClassA f3555b;

    public ClassH(La la) {
        this.f3554a = new ClassB(la);
        if (la != null) {
            this.f3555b = new ClassA(la.rN, this.f3554a);
        }
    }

    public long m5677DW(String str) {
        return 0L;
    }

    public void m5678DW() {
    }

    public boolean m5679EQ() {
        return true;
    }

    public String[] m5680FH() {
        return new String[0];
    }

    public String[] m5681Hw() {
        return new String[]{"*.aidl"};
    }

    public void m5682VH() {
    }

    public ka m5683Zo() {
        return null;
    }

    public boolean m5684gn() {
        return true;
    }

    public Reader m5685j6(String str, String str2, String str3) {
        ClassB.a(str, str2, str3);
        return null;
    }

    public String m5686j6() {
        return "AIDL";
    }

    public void m5687j6(Da da, na naVar) {
    }

    public void m5688j6(Da da, Reader reader, Map map) {
        try {
            this.f3555b.m5547a(da, reader, (Wa) map.get(this.f3554a));
        } catch (IOException e) {
        }
    }

    public void m5689j6(Da da, Reader reader, Map map, boolean z) {
        if (map.containsKey(this.f3554a)) {
            Sa sa = (Sa) map.get(this.f3554a);
            sa.DW(sa.j6(0, true, new int[0], 0, 0, 1, 1));
        }
    }

    public String[] m5690j6(String str) {
        return null;
    }

    public ma m5691tp() {
        return null;
    }

    public ja m5692u7() {
        return null;
    }

    public List m5693v5() {
        ClassC.m5558a("aidl->v5");
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f3554a);
        return arrayList;
    }
}
