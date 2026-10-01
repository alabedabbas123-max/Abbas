package com.jcraft.jsch;

class RequestSignal extends com.jcraft.jsch.Request {
    private java.lang.String Hw;

    RequestSignal() {
        this.Hw = "KILL";
    }
}
