package a.f;

import java.util.ArrayList;
import java.util.List;

public class aa implements Interfacet {

    private static final List f679a = new ArrayList();

    private static final List f680b = new ArrayList();

    private final boolean f681c;

    private int f682d;

    public aa() {
        this(true);
    }

    public aa(boolean z) {
        this.f682d = 0;
        this.f681c = z;
    }

    private String m1774a(int i) {
        List list = this.f681c ? f679a : f680b;
        if (i < list.size()) {
            return (String) list.get(i);
        }
        String strM1775b = m1775b(i);
        list.add(i, strM1775b);
        return strM1775b;
    }

    private String m1775b(int i) {
        int i2 = this.f681c ? 52 : 26;
        int i3 = i / i2;
        char cM1776c = m1776c(i % i2);
        return i3 == 0 ? new String(new char[]{cM1776c}) : m1774a(i3 - 1) + cM1776c;
    }

    private char m1776c(int i) {
        return (char) ((i < 26 ? 97 : 39) + i);
    }

    @Override
    public void mo1777a() {
        this.f682d = 0;
    }

    @Override
    public String mo1778b() {
        int i = this.f682d;
        this.f682d = i + 1;
        return m1774a(i);
    }
}
