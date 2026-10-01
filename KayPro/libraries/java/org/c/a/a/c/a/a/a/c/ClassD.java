package org.c.a.a.c.a.a.a.c;

import com.baidu.mobstat.Config;
import java.util.HashMap;
import java.util.HashSet;
import org.c.a.a.b.d.e.ClassC;
import org.c.a.a.b.d.e.ClassG;
import org.c.a.a.b.d.e.ClassH;
import org.c.a.a.b.d.e.ClassI;
import org.c.a.a.b.d.e.ClassK;
import org.c.a.a.b.d.e.ClassP;
import org.c.a.a.b.d.e.ClassQ;
import org.c.a.a.b.d.e.ClassR;
import org.c.a.a.b.d.e.ClassS;
import org.c.a.a.b.d.e.ClassV;
import org.c.a.a.b.d.e.ClassW;
import org.c.a.a.b.d.e.ClassX;
import org.c.a.a.b.d.e.ClassY;
import org.c.a.a.b.d.e.Interfacel;
import org.c.a.a.b.d.e.Interfaceu;
import org.c.a.a.c.a.a.c.aa;

public class ClassD implements Interfaceu {

    protected static final String[] f6057a = {"i", "j", Config.APP_KEY, Config.MODEL, "n"};

    protected StringBuilder f6058b = new StringBuilder();

    protected HashSet f6059c;

    protected HashMap f6060d;

    protected String f6061e;

    public ClassD(HashSet hashSet, HashMap map) {
        this.f6059c = hashSet;
        this.f6060d = map;
    }

    public String m8364a() {
        return this.f6061e;
    }

    protected void m8365a(String str) {
        int length;
        if (str == null || (length = str.length()) <= 0) {
            return;
        }
        this.f6058b.append(Character.toLowerCase(str.charAt(0)));
        if (length > 1) {
            this.f6058b.append(str.substring(1));
        }
    }

    @Override
    public void mo8128a(ClassC c2043c) {
    }

    @Override
    public void mo8129a(ClassG c2047g) {
        m8367a(c2047g, c2047g.m8144b());
    }

    @Override
    public void mo8130a(ClassH c2048h) {
        m8367a(c2048h, c2048h.m8152j());
    }

    @Override
    public void mo8131a(ClassI c2049i) {
        m8367a(c2049i, c2049i.m8152j());
    }

    @Override
    public void mo8132a(ClassK c2051k) {
        this.f6058b.setLength(0);
        switch (c2051k.mo8145d()) {
            case 0:
                switch (aa.m8407b(c2051k.m8157g())) {
                    case 1:
                        this.f6058b.append("bool");
                        break;
                    case 2:
                        this.f6058b.append("c");
                        break;
                    case 4:
                        this.f6058b.append("f");
                        break;
                    case 8:
                        this.f6058b.append("d");
                        break;
                    case 16:
                        this.f6058b.append("b");
                        break;
                    case 32:
                        this.f6058b.append("s");
                        break;
                    case 64:
                        for (String str : f6057a) {
                            if (!this.f6059c.contains(str)) {
                                HashSet hashSet = this.f6059c;
                                this.f6061e = str;
                                hashSet.add(str);
                                return;
                            }
                        }
                        this.f6058b.append("i");
                        break;
                    case 128:
                        this.f6058b.append("l");
                        break;
                }
                break;
            default:
                this.f6058b.append("arrayOf");
                switch (aa.m8407b(c2051k.m8157g())) {
                    case 1:
                        this.f6058b.append("Boolean");
                        break;
                    case 2:
                        this.f6058b.append("Char");
                        break;
                    case 4:
                        this.f6058b.append("Float");
                        break;
                    case 8:
                        this.f6058b.append("Double");
                        break;
                    case 16:
                        this.f6058b.append("Byte");
                        break;
                    case 32:
                        this.f6058b.append("Short");
                        break;
                    case 64:
                        this.f6058b.append("Int");
                        break;
                    case 128:
                        this.f6058b.append("Long");
                        break;
                }
                break;
        }
        m8366a((Interfacel) c2051k);
    }

    protected void m8366a(Interfacel interfaceC2052l) {
        int i;
        int length = this.f6058b.length();
        if (((Boolean) this.f6060d.get(interfaceC2052l)).booleanValue()) {
            i = 2;
            this.f6058b.append(1);
        } else {
            i = 1;
        }
        this.f6061e = this.f6058b.toString();
        while (this.f6059c.contains(this.f6061e)) {
            this.f6058b.setLength(length);
            this.f6058b.append(i);
            this.f6061e = this.f6058b.toString();
            i++;
        }
        this.f6059c.add(this.f6061e);
    }

    protected void m8367a(Interfacel interfaceC2052l, String str) {
        this.f6058b.setLength(0);
        switch (interfaceC2052l.mo8145d()) {
            case 0:
                if ("Class".equals(str)) {
                    this.f6058b.append("clazz");
                } else if ("String".equals(str)) {
                    this.f6058b.append("str");
                } else if (!"Boolean".equals(str)) {
                    m8365a(str);
                } else {
                    this.f6058b.append("bool");
                }
                break;
            default:
                this.f6058b.append("arrayOf").append(str);
                break;
        }
        m8366a(interfaceC2052l);
    }

    @Override
    public void mo8133a(ClassP c2056p) {
    }

    @Override
    public void mo8134a(ClassQ c2057q) {
    }

    @Override
    public void mo8135a(ClassR c2058r) {
    }

    @Override
    public void mo8136a(ClassS c2059s) {
    }

    @Override
    public void mo8137a(ClassV c2062v) {
    }

    @Override
    public void mo8138a(ClassW c2063w) {
    }

    @Override
    public void mo8139a(ClassX c2064x) {
    }

    @Override
    public void mo8140a(ClassY c2065y) {
    }
}
