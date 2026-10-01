package com.a.a;

import com.a.a.a.Interfacea;

public final class ClassD {
    public static void m3759a(Interfacea interfaceC0881a, int i, long j) {
        int iNumberOfLeadingZeros = ((65 - Long.numberOfLeadingZeros((j >> 63) ^ j)) + 7) >> 3;
        interfaceC0881a.mo3755a(((iNumberOfLeadingZeros - 1) << 5) | i);
        while (iNumberOfLeadingZeros > 0) {
            interfaceC0881a.mo3755a((byte) j);
            j >>= 8;
            iNumberOfLeadingZeros--;
        }
    }

    public static void m3760b(Interfacea interfaceC0881a, int i, long j) {
        int iNumberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros == 0) {
            iNumberOfLeadingZeros = 1;
        }
        int i2 = (iNumberOfLeadingZeros + 7) >> 3;
        interfaceC0881a.mo3755a(((i2 - 1) << 5) | i);
        while (i2 > 0) {
            interfaceC0881a.mo3755a((byte) j);
            j >>= 8;
            i2--;
        }
    }

    public static void m3761c(Interfacea interfaceC0881a, int i, long j) {
        int iNumberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j);
        if (iNumberOfTrailingZeros == 0) {
            iNumberOfTrailingZeros = 1;
        }
        int i2 = (iNumberOfTrailingZeros + 7) >> 3;
        long j2 = j >> (64 - (i2 * 8));
        interfaceC0881a.mo3755a(((i2 - 1) << 5) | i);
        while (i2 > 0) {
            interfaceC0881a.mo3755a((byte) j2);
            j2 >>= 8;
            i2--;
        }
    }
}
