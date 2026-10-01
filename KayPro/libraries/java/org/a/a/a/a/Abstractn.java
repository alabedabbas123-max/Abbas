package org.a.a.a.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public abstract class Abstractn {

    public static final List f5219a = Collections.unmodifiableList(Arrays.asList("INVALID", "BASIC", "RULE_START", "BLOCK_START", "PLUS_BLOCK_START", "STAR_BLOCK_START", "TOKEN_START", "RULE_STOP", "BLOCK_END", "STAR_LOOP_BACK", "STAR_LOOP_ENTRY", "PLUS_LOOP_BACK", "LOOP_END"));

    public int f5222d;

    public ClassA f5220b = null;

    public int f5221c = -1;

    public boolean f5223e = false;

    protected final List f5224f = new ArrayList(4);

    public int m7346a() {
        return this.f5224f.size();
    }

    public Abstractbl m7347a(int i) {
        return (Abstractbl) this.f5224f.get(i);
    }

    public void m7348a(int i, Abstractbl abstractC1724bl) {
        boolean z;
        if (this.f5224f.isEmpty()) {
            this.f5223e = abstractC1724bl.mo7288b();
        } else if (this.f5223e != abstractC1724bl.mo7288b()) {
            System.err.format(Locale.getDefault(), "ATN state %d has both epsilon and non-epsilon transitions.\n", Integer.valueOf(this.f5221c));
            this.f5223e = false;
        }
        Iterator it = this.f5224f.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Abstractbl abstractC1724bl2 = (Abstractbl) it.next();
            if (abstractC1724bl2.f5187f.f5221c == abstractC1724bl.f5187f.f5221c) {
                if (abstractC1724bl2.mo7302c() != null && abstractC1724bl.mo7302c() != null && abstractC1724bl2.mo7302c().equals(abstractC1724bl.mo7302c())) {
                    z = true;
                    break;
                } else if (abstractC1724bl2.mo7288b() && abstractC1724bl.mo7288b()) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            return;
        }
        this.f5224f.add(i, abstractC1724bl);
    }

    public void m7349a(Abstractbl abstractC1724bl) {
        m7348a(this.f5224f.size(), abstractC1724bl);
    }

    public Abstractbl m7350b(int i) {
        return (Abstractbl) this.f5224f.remove(i);
    }

    public void m7351b(int i, Abstractbl abstractC1724bl) {
        this.f5224f.set(i, abstractC1724bl);
    }

    public final boolean m7352b() {
        return this.f5223e;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Abstractn) && this.f5221c == ((Abstractn) obj).f5221c;
    }

    public int hashCode() {
        return this.f5221c;
    }

    public String toString() {
        return String.valueOf(this.f5221c);
    }
}
