package io.fabric.sdk.android.services.common;

public class A {
    public static int j6(int r3) {
        if (r3 < 200) goto L8;
        if (r3 > 299) goto L8;
        return 0;
    L8:
        if (r3 < 300) goto L13;
        if (r3 > 399) goto L13;
        return 1;
    L13:
        if (r3 < 400) goto L18;
        if (r3 > 499) goto L18;
        return 0;
    L18:
        if (r3 >= 500) goto L19;
    L19:
        return 1;
    }
}
