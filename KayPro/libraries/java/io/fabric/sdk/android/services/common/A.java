package io.fabric.sdk.android.services.common;

public class A {
    public static int j6(int r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3 < 200) { $pc0 = 8; continue $sw0; }
                    if (r3 > 299) { $pc0 = 8; continue $sw0; }
                    return 0;
                }
                case 8: {
                    if (r3 < 300) { $pc0 = 13; continue $sw0; }
                    if (r3 > 399) { $pc0 = 13; continue $sw0; }
                    return 1;
                }
                case 13: {
                    if (r3 < 400) { $pc0 = 18; continue $sw0; }
                    if (r3 > 499) { $pc0 = 18; continue $sw0; }
                    return 0;
                }
                case 18: {
                    if (r3 >= 500) { $pc0 = 19; continue $sw0; }
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    return 1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
