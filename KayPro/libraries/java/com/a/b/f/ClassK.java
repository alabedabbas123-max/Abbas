package com.a.b.f;

class ClassK implements Interfaceal {

    final ClassI f3428a;

    private int f3429b;

    private ClassK(ClassI c1285i) {
        this.f3428a = c1285i;
        this.f3429b = 0;
    }

    ClassK(ClassI c1285i, ClassK c1287k) {
        this(c1285i);
    }

    @Override
    public void mo5153a(aj c1264aj, aj c1264aj2) {
        ClassJ c1286j = new ClassJ();
        int i = this.f3429b + 1;
        this.f3429b = i;
        c1286j.f3423a = i;
        c1286j.f3425c = c1264aj;
        c1286j.f3424b = c1264aj2;
        this.f3428a.f3421e.add(c1264aj);
        this.f3428a.f3420d[c1264aj.m5227e()] = c1286j;
    }
}
