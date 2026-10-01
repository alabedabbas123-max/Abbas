package com.jcraft.jsch;

public abstract class UserAuth {
    protected com.jcraft.jsch.Packet DW;
    protected com.jcraft.jsch.Buffer FH;
    protected java.lang.String Hw;
    protected com.jcraft.jsch.UserInfo j6;

    public UserAuth() {
    }

    public boolean j6(com.jcraft.jsch.Session r2) {
        this.j6 = r2.gn();
        this.DW = r2.cb;
        this.FH = this.DW.j6();
        this.Hw = r2.u7();
        return true;
    }
}
