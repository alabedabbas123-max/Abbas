package com.crashlytics.android.core;

final class Ga {
    private static final java.util.regex.Pattern j6 = null;

    static {
        j6 = java.util.regex.Pattern.compile("\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.*)");
    }

    public static com.crashlytics.android.core.Fa j6(java.lang.String r11) {
        java.util.regex.Matcher r0 = j6.matcher(r11);
        if (r0.matches() == true) goto L10;
        return null;
    L10:
        long r5 = java.lang.Long.valueOf(r0.group(1), 16).longValue();     // Catch: java.lang.Exception -> L8
        return new com.crashlytics.android.core.Fa(r5, java.lang.Long.valueOf(r0.group(2), 16).longValue() - r5, r0.group(3), r0.group(4));
    L8:
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Could not parse map entry: " + r11);
        return null;
    }
}
