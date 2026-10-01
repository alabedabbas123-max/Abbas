package tv.ouya.console.api;

class d {
    private static final java.lang.String j6 = "d";
    private final java.lang.String DW;
    private java.util.Vector<java.lang.String> FH;
    private android.util.SparseArray<tv.ouya.console.api.d.e> Hw;
    private tv.ouya.console.api.d.e v5;

    private class a {
        public int DW;
        public boolean FH;
        final tv.ouya.console.api.d Hw;
        public int j6;

        private a(tv.ouya.console.api.d r1) {
            this.Hw = r1;
            this.j6 = -1;
            this.DW = -1;
            this.FH = false;
        }

        a(tv.ouya.console.api.d r1, tv.ouya.console.api.c r2) {
            this(r1);
        }
    }

    class b {
        public int DW;
        final tv.ouya.console.api.d FH;
        public int j6;

        b(tv.ouya.console.api.d r1) {
            this.FH = r1;
            this.j6 = 0;
            this.DW = 0;
        }
    }

    class c {
        public int DW;
        public android.util.SparseBooleanArray FH;
        final tv.ouya.console.api.d Hw;
        public int j6;

        c(tv.ouya.console.api.d r1) {
            this.Hw = r1;
            this.j6 = 0;
            this.DW = 0;
            this.FH = new android.util.SparseBooleanArray();
        }
    }

    class C0068d {
        public float DW;
        public float FH;
        public int Hw;
        public int j6;
        final tv.ouya.console.api.d v5;

        C0068d(tv.ouya.console.api.d r2) {
            this.v5 = r2;
            this.j6 = 0;
            this.DW = 0.0f;
            this.FH = 0.0f;
            this.Hw = 0;
        }
    }

    class e {
        public android.util.SparseBooleanArray DW;
        public java.util.Vector<tv.ouya.console.api.d.b> FH;
        public android.util.SparseArray<tv.ouya.console.api.d.c> Hw;
        final tv.ouya.console.api.d Zo;
        public android.util.SparseArray<tv.ouya.console.api.d.a> j6;
        public java.util.Vector<tv.ouya.console.api.d.C0068d> v5;

        e(tv.ouya.console.api.d r1) {
            this.Zo = r1;
            this.j6 = new android.util.SparseArray();
            this.DW = new android.util.SparseBooleanArray();
            this.FH = new java.util.Vector();
            this.Hw = new android.util.SparseArray();
            this.v5 = new java.util.Vector();
        }
    }

    d() {
        this.DW = "NOT_FOUND";
        this.FH = new java.util.Vector();
        this.Hw = new android.util.SparseArray();
        this.v5 = null;
    }

    private java.lang.String DW(int r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 >= 0) { $pc0 = 4; continue $sw0; }
                    return "NOT_FOUND";
                }
                case 4: {
                    if (r2 < this.FH.size()) { $pc0 = 6; continue $sw0; }
                    return "NOT_FOUND";
                }
                case 6: {
                    return this.FH.get(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(java.lang.String r21) {
        java.lang.String r5 = null;
        java.lang.String r6 = null;
        org.json.JSONObject r9 = null;
        org.json.JSONArray r0 = null;
        int r10 = 0;
        tv.ouya.console.api.d.e r11 = null;
        org.json.JSONObject r12 = null;
        org.json.JSONArray r13 = null;
        int r14 = 0;
        org.json.JSONObject r15 = null;
        tv.ouya.console.api.d.a r16 = null;
        org.json.JSONArray r8 = null;
        int r17 = 0;
        int r18 = 0;
        org.json.JSONArray r19 = null;
        int r110 = 0;
        tv.ouya.console.api.d.b r111 = null;
        org.json.JSONObject r112 = null;
        org.json.JSONArray r113 = null;
        org.json.JSONArray r114 = null;
        org.json.JSONArray r1 = null;
        int r115 = 0;
        tv.ouya.console.api.d.C0068d r116 = null;
        org.json.JSONObject r117 = null;
        org.json.JSONArray r118 = null;
        java.lang.String r119 = null;
        java.lang.String r120 = null;
        java.lang.String r121 = null;
        org.json.JSONArray r2 = null;
        int r7 = 0;
        tv.ouya.console.api.d.c r20 = null;
        org.json.JSONObject r122 = null;
        int r123 = 0;
        org.json.JSONArray r124 = null;
        int r125 = 0;
        int r126 = 0;
        org.json.JSONArray r127 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r5 = "button_is_axis";
                    r6 = "axis_remap";
                    if (r21 != null) { $pc1 = 57; continue $sw1; }
                    return;
                }
                case 57: {
                    try {
                        r9 = new org.json.JSONObject(r21);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r9.has("controller") == false) { $pc1 = 69; continue $sw1; }
                    try {
                        r0 = r9.getJSONArray("controller");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r10 = 0;
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    if (r10 >= r0.length()) { $pc1 = 70; continue $sw1; }
                    try {
                        r11 = new tv.ouya.console.api.d.e(this);
                        r12 = r0.getJSONObject(r10);
                        r13 = r12.getJSONArray("alias");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r14 = 0;
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    if (r14 >= r13.length()) { $pc1 = 21; continue $sw1; }
                    try {
                        r15 = r13.getJSONObject(r14);
                        r16 = new tv.ouya.console.api.d.a(this, null);
                        r16.j6 = j6(r15.getString("name"));
                        r16.DW = j6(r15.getString("friendly_name"));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r15.has("fallback") == false) { $pc1 = 16; continue $sw1; }
                    try {
                        r16.FH = r15.getBoolean("fallback");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    try {
                        r11.j6.put(r16.j6, r16);
                        this.Hw.put(r16.j6, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r16.FH == false) { $pc1 = 19; continue $sw1; }
                    try {
                        this.v5 = r11;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 19; continue $sw1;
                }
                case 19: {
                    try {
                        r14 = r14 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc1 = 12; continue $sw1; }
                }
                case 21: {
                    if (r12.has("axis_exclude_source") == false) { $pc1 = 28; continue $sw1; }
                    try {
                        r8 = r12.getJSONArray("axis_exclude_source");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r17 = 0;
                    $pc1 = 24; continue $sw1;
                }
                case 24: {
                    if (r17 >= r8.length()) { $pc1 = 28; continue $sw1; }
                    try {
                        r18 = r8.getInt(r17);
                        r11.DW.append(r18, true);
                        r17 = r17 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 28; continue $sw1;
                }
                case 28: {
                    if (r12.has(r6) == false) { $pc1 = 33; continue $sw1; }
                    try {
                        r19 = r12.getJSONArray(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r110 = 0;
                    $pc1 = 31; continue $sw1;
                }
                case 31: {
                    if (r110 >= r19.length()) { $pc1 = 33; continue $sw1; }
                    try {
                        r111 = new tv.ouya.console.api.d.b(this);
                        r112 = r19.getJSONObject(r110);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r113 = r0;
                    try {
                        r111.j6 = r112.getInt("source_axis");
                        r111.DW = r112.getInt("destination_axis");
                        r11.FH.add(r111);
                        r110 = r110 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r0 = r113;
                    $pc1 = 33; continue $sw1;
                }
                case 33: {
                    r114 = r0;
                    if (r12.has(r5) == false) { $pc1 = 40; continue $sw1; }
                    try {
                        r1 = r12.getJSONArray(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r115 = 0;
                    $pc1 = 38; continue $sw1;
                }
                case 38: {
                    if (r115 >= r1.length()) { $pc1 = 40; continue $sw1; }
                    try {
                        r116 = new tv.ouya.console.api.d.C0068d(this);
                        r117 = r1.getJSONObject(r115);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r118 = r1;
                    try {
                        r116.j6 = r117.getInt("source_axis");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r119 = r5;
                    try {
                        r116.DW = (float) r117.getDouble("action_down_max");
                        r116.FH = (float) r117.getDouble("action_down_min");
                        r116.Hw = r117.getInt("destination_keycode");
                        r11.v5.add(r116);
                        r115 = r115 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r1 = r118;
                    r5 = r119;
                    r6 = r6;
                    $pc1 = 40; continue $sw1;
                }
                case 40: {
                    r120 = r5;
                    r121 = r6;
                    if (r12.has("button") == false) { $pc1 = 53; continue $sw1; }
                    try {
                        r2 = r12.getJSONArray("button");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r7 = 0;
                    $pc1 = 44; continue $sw1;
                }
                case 44: {
                    if (r7 >= r2.length()) { $pc1 = 53; continue $sw1; }
                    try {
                        r20 = new tv.ouya.console.api.d.c(this);
                        r122 = r2.getJSONObject(r7);
                        r20.j6 = r122.getInt("source_keycode");
                        r123 = r122.getInt("destination_keycode");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r122.has("exclude_source") == false) { $pc1 = 51; continue $sw1; }
                    try {
                        r124 = r122.getJSONArray("exclude_source");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r125 = 0;
                    $pc1 = 49; continue $sw1;
                }
                case 49: {
                    if (r125 >= r124.length()) { $pc1 = 51; continue $sw1; }
                    try {
                        r126 = r124.getInt(r125);
                        r20.FH.append(r126, true);
                        r125 = r125 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r2 = r2;
                    $pc1 = 51; continue $sw1;
                }
                case 51: {
                    r127 = r2;
                    try {
                        r20.DW = r123;
                        r11.Hw.put(r20.j6, r20);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 54; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r7 = r7 + 1;
                    r2 = r127;
                    $pc1 = 53; continue $sw1;
                }
                case 53: {
                    r10 = r10 + 1;
                    r0 = r114;
                    r5 = r120;
                    r6 = r121;
                    { $pc1 = 8; continue $sw1; }
                }
                case 70: {
                    return;
                }
                case 69: {
                    return;
                }
                case 54: {
                    e = $ex1;
                    android.util.Log.e(j6, "Failed to load input json: ", e);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int j6(java.lang.String r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.FH.contains(r2) == true) { $pc2 = 6; continue $sw2; }
                    this.FH.add(r2);
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    return this.FH.indexOf(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public tv.ouya.console.api.d.c j6(tv.ouya.console.api.d.e r3, int r4) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r3 != null) { $pc3 = 6; continue $sw3; }
                    return null;
                }
                case 6: {
                    if (r3.Hw.get(r4) != null) { $pc3 = 9; continue $sw3; }
                    return null;
                }
                case 9: {
                    return r3.Hw.get(r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public tv.ouya.console.api.d.e j6(int r5) {
        tv.ouya.console.api.d.e r6 = null;
        int r7 = 0;
        int r0 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this.Hw.get(r5) != null) { $pc4 = 12; continue $sw4; }
                    r6 = this.v5;
                    if (r6 == null) { $pc4 = 10; continue $sw4; }
                    r7 = r6.j6.size();
                    r0 = 0;
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    if (r0 >= r7) { $pc4 = 10; continue $sw4; }
                    android.util.Log.i(j6, "Using controller fallback=" + DW(this.v5.j6.valueAt(r0).j6));
                    r0 = r0 + 1;
                    $pc4 = 10; continue $sw4;
                }
                case 10: {
                    return this.v5;
                }
                case 12: {
                    return this.Hw.get(r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
