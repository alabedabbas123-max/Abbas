package com.a.b.e.b;

class ClassV extends ThreadLocal {
    ClassV() {
    }

    @Override
    public ClassW initialValue() {
        return new ClassW(null);
    }
}
