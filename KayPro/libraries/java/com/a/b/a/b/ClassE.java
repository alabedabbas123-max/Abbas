package com.a.b.a.b;

import com.a.b.e.c.ae;
import com.a.b.e.c.ClassY;

public class ClassE {

    private final ClassC f1856a;

    private final ClassY f1857b;

    private final ae f1858c;

    public ClassE(ae c1205ae, ClassY c1232y, ClassC c0931c) {
        if (c1205ae == null) {
            throw new NullPointerException("declaringClass == null");
        }
        if (c1232y == null) {
            throw new NullPointerException("bootstrapMethodHandle == null");
        }
        if (c0931c == null) {
            throw new NullPointerException("bootstrapMethodArguments == null");
        }
        this.f1857b = c1232y;
        this.f1856a = c0931c;
        this.f1858c = c1205ae;
    }

    public ClassY m3959a() {
        return this.f1857b;
    }

    public ClassC m3960b() {
        return this.f1856a;
    }
}
