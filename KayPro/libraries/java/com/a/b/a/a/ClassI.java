package com.a.b.a.a;

import com.a.b.a.b.ClassR;
import com.a.b.g.ClassU;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLineNumberTable;

public final class ClassI extends Abstractu {

    private final ClassR f1749a;

    public ClassI(ClassR c0946r) {
        super(AttLineNumberTable.ATTRIBUTE_NAME);
        try {
            if (c0946r.m5516b_()) {
                throw new ClassU("lineNumbers.isMutable()");
            }
            this.f1749a = c0946r;
        } catch (NullPointerException e) {
            throw new NullPointerException("lineNumbers == null");
        }
    }

    @Override
    public int mo3765a() {
        return (this.f1749a.m5476d_() * 4) + 8;
    }

    public ClassR m3778b() {
        return this.f1749a;
    }
}
