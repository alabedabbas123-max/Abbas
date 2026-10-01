package org.c.a.a.c.a.a.c;

import java.util.Comparator;
import org.c.a.a.c.a.a.a.a.ClassE;

public class ai implements Comparator {
    protected ai() {
    }

    @Override
    public int compare(ClassE c2089e, ClassE c2089e2) {
        int iM8250b = c2089e.m8250b() - c2089e2.m8250b();
        return iM8250b != 0 ? iM8250b : c2089e.m8246a() - c2089e2.m8246a();
    }
}
