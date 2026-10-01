package com.crashlytics.android.core;

final class Ga {
    private static final java.util.regex.Pattern j6 = null;

    static {
        j6 = java.util.regex.Pattern.compile("\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.*)");
    }

    public static com.crashlytics.android.core.Fa j6(java.lang.String r11) {
        java.util.regex.Matcher r0 = null;
        long r5 = 0L;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = j6.matcher(r11);
                    if (r0.matches() == true) { $pc0 = 10; continue $sw0; }
                    return null;
                }
                case 10: {
                    try {
                        r5 = java.lang.Long.valueOf(r0.group(1), 16).longValue();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 8; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return new com.crashlytics.android.core.Fa(r5, java.lang.Long.valueOf(r0.group(2), 16).longValue() - r5, r0.group(3), r0.group(4));
                }
                case 8: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Could not parse map entry: " + r11);
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
