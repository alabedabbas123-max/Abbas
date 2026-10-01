package org.a.a.a.c;

import java.io.Serializable;

public class ClassM implements Serializable {

    public final Object f5293a;

    public final Object f5294b;

    public ClassM(Object obj, Object obj2) {
        this.f5293a = obj;
        this.f5294b = obj2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClassM)) {
            return false;
        }
        ClassM c1776m = (ClassM) obj;
        return ClassL.f5292a.mo7322a(this.f5293a, c1776m.f5293a) && ClassL.f5292a.mo7322a(this.f5294b, c1776m.f5294b);
    }

    public int hashCode() {
        return ClassK.m7408b(ClassK.m7407a(ClassK.m7407a(ClassK.m7404a(), this.f5293a), this.f5294b), 2);
    }

    public String toString() {
        return String.format("(%s, %s)", this.f5293a, this.f5294b);
    }
}
