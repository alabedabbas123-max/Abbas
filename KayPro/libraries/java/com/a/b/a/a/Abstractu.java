package com.a.b.a.a;

import com.a.b.a.e.Interfacea;

public abstract class Abstractu implements Interfacea {

    private final String f1755a;

    public Abstractu(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        this.f1755a = str;
    }

    @Override
    public String mo3783g() {
        return this.f1755a;
    }
}
