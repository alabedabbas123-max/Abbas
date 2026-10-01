package com.crashlytics.android.core;

class K extends java.util.HashMap<java.lang.String, java.lang.Object> {
    final com.crashlytics.android.core.L j6;

    K(com.crashlytics.android.core.L r3) {
        this.j6 = r3;
        put("arch", java.lang.Integer.valueOf(this.j6.j6));
        put("build_model", android.os.Build.MODEL);
        put("available_processors", java.lang.Integer.valueOf(this.j6.DW));
        put("total_ram", java.lang.Long.valueOf(this.j6.FH));
        put("disk_space", java.lang.Long.valueOf(this.j6.Hw));
        put("is_emulator", java.lang.Boolean.valueOf(this.j6.v5));
        put("ids", this.j6.Zo);
        put("state", java.lang.Integer.valueOf(this.j6.VH));
        put("build_manufacturer", android.os.Build.MANUFACTURER);
        put("build_product", android.os.Build.PRODUCT);
    }
}
