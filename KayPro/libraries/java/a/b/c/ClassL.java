package a.b.c;

import a.b.b.a.f;
import a.b.b.b;
import a.b.b.h;
import a.b.c;
import a.b.f.w;

public class ClassL extends w implements f {

    private int[] f69a;

    private final boolean f70b;

    public ClassL() {
        this(false);
    }

    public ClassL(boolean z) {
        this.f70b = z;
    }

    private int m153a(int i) {
        int i2 = this.f69a[i];
        if (i2 >= 0) {
            return i2;
        }
        if (this.f70b) {
            return i;
        }
        throw new IllegalArgumentException("Can't remap bootstrap method index [" + i + "]");
    }

    public void m154a(c cVar, b bVar) {
    }

    public void m155a(c cVar, h hVar) {
        hVar.a = m153a(hVar.a);
    }

    public void m156a(int[] iArr) {
        this.f69a = iArr;
    }
}
