package com.a.b.c.c;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class ClassU {

    byte[] f2523a;

    public byte[] m4690a(int i) {
        if (this.f2523a.length < i) {
            Logger.getAnonymousLogger().log(Level.FINER, "DexFile storage too small  " + this.f2523a.length + " vs " + i);
            this.f2523a = new byte[i];
        }
        return this.f2523a;
    }
}
