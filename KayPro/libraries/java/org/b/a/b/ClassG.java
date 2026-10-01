package org.b.a.b;

class ClassG {

    private final char[] f5448a;

    private ClassC f5449b;

    ClassG(char[] cArr) {
        this.f5448a = cArr;
    }

    public synchronized ClassC m7559a() {
        if (this.f5449b == null) {
            this.f5449b = new ClassC(this.f5448a);
        }
        return this.f5449b;
    }
}
