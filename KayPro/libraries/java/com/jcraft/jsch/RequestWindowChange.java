package com.jcraft.jsch;

class RequestWindowChange extends com.jcraft.jsch.Request {
    int Hw;
    int VH;
    int Zo;
    int v5;

    RequestWindowChange() {
        this.Hw = 80;
        this.v5 = 24;
        this.Zo = 640;
        this.VH = 480;
    }
}
