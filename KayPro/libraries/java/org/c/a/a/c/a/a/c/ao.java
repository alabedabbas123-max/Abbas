package org.c.a.a.c.a.a.c;

import java.util.HashSet;
import org.c.a.a.c.a.a.a.a.ClassA;

public class ao {

    protected HashSet f6117a = new HashSet();

    public void m8467a() {
        this.f6117a.clear();
    }

    public void m8468a(ClassA c2085a, ClassA c2085a2) {
        if (c2085a2.m8221d(1266696506)) {
            return;
        }
        ap c2146ap = new ap(c2085a, c2085a2);
        if (this.f6117a.contains(c2146ap)) {
            throw new RuntimeException("CFG watchdog: parent=" + c2085a + ", child=" + c2085a2);
        }
        this.f6117a.add(c2146ap);
    }
}
