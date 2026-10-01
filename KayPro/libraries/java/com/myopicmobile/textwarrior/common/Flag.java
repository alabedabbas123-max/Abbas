package com.myopicmobile.textwarrior.common;

public class Flag {
    private boolean state = false;

    public final synchronized void clear() {
        this.state = false;
    }

    public final synchronized boolean isSet() {
        return this.state;
    }

    public final synchronized void m7096set() {
        this.state = true;
    }
}
