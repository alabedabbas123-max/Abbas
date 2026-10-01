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
        if (r2 >= 0) goto L4;
        return "NOT_FOUND";
    L4:
        if (r2 < this.FH.size()) goto L6;
        return "NOT_FOUND";
    L6:
        return this.FH.get(r2);
    }

    public void DW(java.lang.String r21) {
        java.lang.String r5 = "button_is_axis";
        java.lang.String r6 = "axis_remap";
        if (r21 != null) goto L57;
        return;
    L57:
        org.json.JSONObject r9 = new org.json.JSONObject(r21);     // Catch: org.json.JSONException -> L54
        if (r9.has("controller") == false) goto L69;
        org.json.JSONArray r0 = r9.getJSONArray("controller");     // Catch: org.json.JSONException -> L54
        int r10 = 0;
    L8:
        if (r10 >= r0.length()) goto L70;
        tv.ouya.console.api.d.e r11 = new tv.ouya.console.api.d.e(this);     // Catch: org.json.JSONException -> L54
        org.json.JSONObject r12 = r0.getJSONObject(r10);     // Catch: org.json.JSONException -> L54
        org.json.JSONArray r13 = r12.getJSONArray("alias");     // Catch: org.json.JSONException -> L54
        int r14 = 0;
    L12:
        if (r14 >= r13.length()) goto L21;
        org.json.JSONObject r15 = r13.getJSONObject(r14);     // Catch: org.json.JSONException -> L54
        tv.ouya.console.api.d.a r16 = new tv.ouya.console.api.d.a(this, null);     // Catch: org.json.JSONException -> L54
        r16.j6 = j6(r15.getString("name"));     // Catch: org.json.JSONException -> L54
        r16.DW = j6(r15.getString("friendly_name"));     // Catch: org.json.JSONException -> L54
        if (r15.has("fallback") == false) goto L16;
        r16.FH = r15.getBoolean("fallback");     // Catch: org.json.JSONException -> L54
    L16:
        r11.j6.put(r16.j6, r16);     // Catch: org.json.JSONException -> L54
        this.Hw.put(r16.j6, r11);     // Catch: org.json.JSONException -> L54
        if (r16.FH == false) goto L19;
        this.v5 = r11;     // Catch: org.json.JSONException -> L54
    L19:
        r14 = r14 + 1;     // Catch: org.json.JSONException -> L54
        goto L12
    L21:
        if (r12.has("axis_exclude_source") == false) goto L28;
        org.json.JSONArray r8 = r12.getJSONArray("axis_exclude_source");     // Catch: org.json.JSONException -> L54
        int r17 = 0;
    L24:
        if (r17 >= r8.length()) goto L28;
        int r18 = r8.getInt(r17);     // Catch: org.json.JSONException -> L54
        r11.DW.append(r18, true);     // Catch: org.json.JSONException -> L54
        r17 = r17 + 1;     // Catch: org.json.JSONException -> L54
    L28:
        if (r12.has(r6) == false) goto L33;
        org.json.JSONArray r19 = r12.getJSONArray(r6);     // Catch: org.json.JSONException -> L54
        int r110 = 0;
    L31:
        if (r110 >= r19.length()) goto L33;
        tv.ouya.console.api.d.b r111 = new tv.ouya.console.api.d.b(this);     // Catch: org.json.JSONException -> L54
        org.json.JSONObject r112 = r19.getJSONObject(r110);     // Catch: org.json.JSONException -> L54
        org.json.JSONArray r113 = r0;
        r111.j6 = r112.getInt("source_axis");     // Catch: org.json.JSONException -> L54
        r111.DW = r112.getInt("destination_axis");     // Catch: org.json.JSONException -> L54
        r11.FH.add(r111);     // Catch: org.json.JSONException -> L54
        r110 = r110 + 1;     // Catch: org.json.JSONException -> L54
        r0 = r113;
    L33:
        org.json.JSONArray r114 = r0;
        if (r12.has(r5) == false) goto L40;
        org.json.JSONArray r1 = r12.getJSONArray(r5);     // Catch: org.json.JSONException -> L54
        int r115 = 0;
    L38:
        if (r115 >= r1.length()) goto L40;
        tv.ouya.console.api.d.C0068d r116 = new tv.ouya.console.api.d.C0068d(this);     // Catch: org.json.JSONException -> L54
        org.json.JSONObject r117 = r1.getJSONObject(r115);     // Catch: org.json.JSONException -> L54
        org.json.JSONArray r118 = r1;
        r116.j6 = r117.getInt("source_axis");     // Catch: org.json.JSONException -> L54
        java.lang.String r119 = r5;
        r116.DW = (float) r117.getDouble("action_down_max");     // Catch: org.json.JSONException -> L54
        r116.FH = (float) r117.getDouble("action_down_min");     // Catch: org.json.JSONException -> L54
        r116.Hw = r117.getInt("destination_keycode");     // Catch: org.json.JSONException -> L54
        r11.v5.add(r116);     // Catch: org.json.JSONException -> L54
        r115 = r115 + 1;     // Catch: org.json.JSONException -> L54
        r1 = r118;
        r5 = r119;
        r6 = r6;
    L40:
        java.lang.String r120 = r5;
        java.lang.String r121 = r6;
        if (r12.has("button") == false) goto L53;
        org.json.JSONArray r2 = r12.getJSONArray("button");     // Catch: org.json.JSONException -> L54
        int r7 = 0;
    L44:
        if (r7 >= r2.length()) goto L53;
        tv.ouya.console.api.d.c r20 = new tv.ouya.console.api.d.c(this);     // Catch: org.json.JSONException -> L54
        org.json.JSONObject r122 = r2.getJSONObject(r7);     // Catch: org.json.JSONException -> L54
        r20.j6 = r122.getInt("source_keycode");     // Catch: org.json.JSONException -> L54
        int r123 = r122.getInt("destination_keycode");     // Catch: org.json.JSONException -> L54
        if (r122.has("exclude_source") == false) goto L51;
        org.json.JSONArray r124 = r122.getJSONArray("exclude_source");     // Catch: org.json.JSONException -> L54
        int r125 = 0;
    L49:
        if (r125 >= r124.length()) goto L51;
        int r126 = r124.getInt(r125);     // Catch: org.json.JSONException -> L54
        r20.FH.append(r126, true);     // Catch: org.json.JSONException -> L54
        r125 = r125 + 1;     // Catch: org.json.JSONException -> L54
        r2 = r2;
    L51:
        org.json.JSONArray r127 = r2;
        r20.DW = r123;     // Catch: org.json.JSONException -> L54
        r11.Hw.put(r20.j6, r20);     // Catch: org.json.JSONException -> L54
        r7 = r7 + 1;
        r2 = r127;
    L53:
        r10 = r10 + 1;
        r0 = r114;
        r5 = r120;
        r6 = r121;
        goto L8
    L70:
        return;
    L69:
        return;
    L54:
        e = move-exception;
        android.util.Log.e(j6, "Failed to load input json: ", e);
    }

    int j6(java.lang.String r2) {
        if (this.FH.contains(r2) == true) goto L6;
        this.FH.add(r2);
    L6:
        return this.FH.indexOf(r2);
    }

    public tv.ouya.console.api.d.c j6(tv.ouya.console.api.d.e r3, int r4) {
        if (r3 != null) goto L6;
        return null;
    L6:
        if (r3.Hw.get(r4) != null) goto L9;
        return null;
    L9:
        return r3.Hw.get(r4);
    }

    public tv.ouya.console.api.d.e j6(int r5) {
        if (this.Hw.get(r5) != null) goto L12;
        tv.ouya.console.api.d.e r6 = this.v5;
        if (r6 == null) goto L10;
        int r7 = r6.j6.size();
        int r0 = 0;
    L7:
        if (r0 >= r7) goto L10;
        android.util.Log.i(j6, "Using controller fallback=" + DW(this.v5.j6.valueAt(r0).j6));
        r0 = r0 + 1;
    L10:
        return this.v5;
    L12:
        return this.Hw.get(r5);
    }
}
