package com.a.a;

import com.a.a.a.Interfacea;

public final class ClassE {
    public static int m3762a(int i) {
        int i2 = i >> 7;
        int i3 = 0;
        while (i2 != 0) {
            i2 >>= 7;
            i3++;
        }
        return i3 + 1;
    }

    public static void m3763a(Interfacea interfaceC0881a, int i) {
        for (int i2 = i >>> 7; i2 != 0; i2 >>>= 7) {
            interfaceC0881a.mo3755a((byte) ((i & 127) | 128));
            i = i2;
        }
        interfaceC0881a.mo3755a((byte) (i & 127));
    }

    public static void m3764b(Interfacea interfaceC0881a, int i) {
        int i2 = i >> 7;
        int i3 = (Integer.MIN_VALUE & i) == 0 ? 0 : -1;
        boolean z = true;
        int i4 = i2;
        while (z) {
            z = (i4 == i3 && (i4 & 1) == ((i >> 6) & 1)) ? false : true;
            interfaceC0881a.mo3755a((byte) ((z ? 128 : 0) | (i & 127)));
            i = i4;
            i4 >>= 7;
        }
    }
}
