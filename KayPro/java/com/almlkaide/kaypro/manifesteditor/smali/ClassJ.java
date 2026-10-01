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
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ClassJ implements la {

    private final na f3556a;

    private ClassD f3557b;

    public ClassJ(La la) {
        this.f3556a = new ClassE(la);
        if (la != null) {
            this.f3557b = new ClassD(la.rN, this.f3556a);
        }
    }

    public long m5695DW(String str) {
        return 0L;
    }

    public void m5696DW() {
    }

    public boolean m5697EQ() {
        return true;
    }

    public String[] m5698FH() {
        return new String[0];
    }

    public String[] m5699Hw() {
        return new String[]{"*.smali"};
    }

    public void m5700VH() {
    }

    public ka m5701Zo() {
        return null;
    }

    public boolean m5702gn() {
        return true;
    }

    public Reader m5703j6(String str, String str2, String str3) {
        return null;
    }

    public String m5704j6() {
        return "Smali";
    }

    public void m5705j6(Da da, na naVar) {
    }

    public void m5706j6(Da da, Reader reader, Map map) {
        this.f3557b.m5559a(da, reader, (Wa) map.get(this.f3556a));
    }

    public void m5707j6(Da da, Reader reader, Map map, boolean z) {
        if (map.containsKey(this.f3556a)) {
            Sa sa = (Sa) map.get(this.f3556a);
            sa.DW(sa.j6(0, true, new int[0], 0, 0, 1, 1));
        }
    }

    public String[] m5708j6(String str) {
        return null;
    }

    public ma m5709tp() {
        return null;
    }

    public ja m5710u7() {
        return null;
    }

    public List m5711v5() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f3556a);
        return arrayList;
    }
}
