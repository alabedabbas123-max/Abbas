package com.almlkaide.kaypro.android.dx.dex;

import com.almlkaide.kaypro.android.dex.DexFormat;
import java.io.PrintStream;

public final class DexOptions {
    public static final boolean ALIGN_64BIT_REGS_SUPPORT = true;
    public boolean ALIGN_64BIT_REGS_IN_OUTPUT_FINISHER;
    public boolean allowAllInterfaceMethodInvokes;

    public final PrintStream f5022err;
    public boolean forceJumbo;
    public int minSdkVersion;

    public DexOptions() {
        this.ALIGN_64BIT_REGS_IN_OUTPUT_FINISHER = true;
        this.minSdkVersion = 13;
        this.forceJumbo = false;
        this.allowAllInterfaceMethodInvokes = false;
        this.f5022err = System.err;
    }

    public DexOptions(PrintStream printStream) {
        this.ALIGN_64BIT_REGS_IN_OUTPUT_FINISHER = true;
        this.minSdkVersion = 13;
        this.forceJumbo = false;
        this.allowAllInterfaceMethodInvokes = false;
        this.f5022err = printStream;
    }

    public String getMagic() {
        return DexFormat.apiToMagic(this.minSdkVersion);
    }

    public boolean apiIsSupported(int i) {
        return this.minSdkVersion >= i;
    }
}
