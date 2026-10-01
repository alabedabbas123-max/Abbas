package com.tencent.mm.androlib;

public class AndrolibException extends Exception {
    public AndrolibException() {
    }

    public AndrolibException(String str) {
        super(str);
    }

    public AndrolibException(String str, Throwable th) {
        super(str, th);
    }

    public AndrolibException(Throwable th) {
        super(th);
    }
}
