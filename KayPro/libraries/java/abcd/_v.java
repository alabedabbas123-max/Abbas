package abcd;

public class _v {
    public long DW;
    public java.lang.String EQ;
    public java.lang.String FH;
    public java.lang.String Hw;
    public long J0;
    public java.lang.String VH;
    public java.lang.String Zo;
    public java.lang.String gn;
    public abcd.Xv j6;
    public java.lang.String tp;
    public java.lang.String u7;
    public int v5;
    public long we;

    public _v() {
    }

    public _v(abcd.Xv r1) {
        this.j6 = r1;
    }

    public _v(java.lang.String r4, java.lang.String r5, abcd.Xv r6, long r7, java.lang.CharSequence r9, int r10, java.lang.CharSequence r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, long r16, long r18) {
        this.j6 = r6;
        this.DW = r7;
        this.FH = r11.toString();
        this.v5 = r10;
        this.Hw = r9.toString();
        this.Zo = r12;
        this.VH = r13;
        this.tp = r14;
        this.u7 = r5;
        this.gn = r4;
        this.EQ = r15;
        this.we = r16;
        this.J0 = r18;
    }

    private java.lang.String j6(com.appfour.backbone.api.objects.UIScene r10) {
        if (r10 != null) goto L5;
        return null;
    L5:
        org.json.JSONObject r1 = new org.json.JSONObject();
        r1.put("deviceWidth", r10.deviceWidth);
        r1.put("deviceHeight", r10.deviceHeight);
        r1.put("imeHeight", r10.imeHeight);
        r1.put("pressedBackKey", r10.pressedBackKey);
        r1.put("pressedKey", r10.pressedKey);
        r1.put("touchX", r10.touchX);
        r1.put("touchY", r10.touchY);
        r1.put("touchX2", r10.touchX2);
        r1.put("touchY2", r10.touchY2);
        org.json.JSONArray r2 = new org.json.JSONArray();
        com.appfour.backbone.api.objects.UISceneWidget[] r11 = r10.widgets;
        int r3 = r11.length;
        int r4 = 0;
    L6:
        if (r4 >= r3) goto L12;
        com.appfour.backbone.api.objects.UISceneWidget r5 = r11[r4];
        if (r5 == null) goto L10;
        org.json.JSONObject r6 = new org.json.JSONObject();
        r6.put("x", r5.x);
        r6.put("y", r5.y);
        r6.put("width", r5.width);
        r6.put("height", r5.height);
        r6.put("fill", r5.fill);
        r6.put("text", r5.text);
        r6.put("textAlignTop", r5.textAlignTop);
        r2.put(r6);
    L11:
        r4 = r4 + 1;
        goto L6
    L10:
        r2.put(null);
        goto L11
    L12:
        r1.put("widgets", r2);
        return r1.toString();
    }

    private java.lang.String j6(java.lang.Throwable r2, java.lang.StackTraceElement r3, java.lang.String r4) {
        if (r2 != null) goto L5;
        return null;
    L5:
        org.json.JSONObject r5 = j6(r2);
        if (r3 == null) goto L8;
        r5.putOpt("exceptionRootLocation", j6(r3));
    L8:
        r5.putOpt("exceptionRootClassName", r4);
        return r5.toString();
    }

    private org.json.JSONObject j6(java.lang.StackTraceElement r4) {
        org.json.JSONObject r0 = new org.json.JSONObject();
        r0.put("className", r4.getClassName());
        r0.put("methodName", r4.getMethodName());
        r0.put("fileName", r4.getFileName());
        r0.put("line", r4.getLineNumber());
        return r0;
    }

    private org.json.JSONObject j6(java.lang.Throwable r7) {
        org.json.JSONObject r0 = new org.json.JSONObject();
        r0.put("exceptionClassName", r7.getClass().getName());
        r0.put("message", r7.getMessage());
        org.json.JSONArray r1 = new org.json.JSONArray();
        if (r7.getStackTrace() == null) goto L7;
        java.lang.StackTraceElement[] r2 = r7.getStackTrace();
        int r3 = r2.length;
        int r4 = 0;
    L5:
        if (r4 >= r3) goto L7;
        r1.put(j6(r2[r4]));
        r4 = r4 + 1;
    L7:
        r0.put("stackTrace", r1);
        if (r7.getCause() == null) goto L10;
        r0.put("cause", j6(r7.getCause()));
    L10:
        return r0;
    }

    public org.json.JSONObject j6() {
        org.json.JSONObject r0 = new org.json.JSONObject();
        long r1 = this.DW;
        java.lang.Object r5 = null;
        if (r1 != 0) goto L5;
        java.lang.Object r2 = null;
    L6:
        r0.putOpt("timestampMicros", r2);
        r0.putOpt("variantName", this.Hw);
        r0.putOpt("appVersionCode", java.lang.Integer.valueOf(this.v5));
        r0.putOpt("applicationId", this.FH);
        r0.putOpt("deviceId", this.Zo);
        r0.putOpt("sessionId", this.VH);
        r0.putOpt("eventId", this.gn);
        r0.putOpt("processName", this.tp);
        r0.putOpt("eventName", this.u7);
        r0.putOpt("propertyEventId", this.EQ);
        long r3 = this.we;
        if (r3 >= 0) goto L9;
        java.lang.Object r4 = null;
    L10:
        r0.putOpt("propertyEventTimestamp", r4);
        long r6 = this.J0;
        if (r6 >= 0) goto L13;
        java.lang.Object r7 = null;
    L14:
        r0.putOpt("recordingStartTimestamp", r7);
        if (this.j6.DW.isEmpty() == true) goto L32;
        org.json.JSONArray r8 = new org.json.JSONArray();
        r0.put("params", r8);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.aw>> r9 = this.j6.DW.entrySet().iterator();
    L18:
        if (r9.hasNext() == false) goto L32;
        java.util.Map.Entry<java.lang.String, abcd.aw> r10 = r9.next();
        org.json.JSONObject r11 = new org.json.JSONObject();
        abcd.aw r12 = r10.getValue();
        org.json.JSONObject r13 = new org.json.JSONObject();
        java.lang.String r14 = r12.j6;
        if (r14 != null) goto L21;
        java.lang.Long r15 = r12.DW;
        if (r15 != null) goto L24;
        java.lang.Double r16 = r12.FH;
        if (r16 != null) goto L27;
        java.lang.Boolean r17 = r12.Hw;
        if (r17 == null) goto L18;
        r13.put("booleanValue", r17);
    L31:
        r11.put("key", r10.getKey());
        r11.put("value", r13);
        r8.put(r11);
        goto L18
    L27:
        r13.put("doubleValue", r16);
        goto L31
    L24:
        r13.put("longValue", r15);
        goto L31
    L21:
        r13.put("stringValue", r14);
    L32:
        r0.putOpt("summary", this.j6.j6);
        r0.putOpt("isAudienceProperty", java.lang.Boolean.valueOf(this.j6.tp));
        r0.putOpt("isUserAction", java.lang.Boolean.valueOf(this.j6.FH));
        r0.putOpt("isScreenView", java.lang.Boolean.valueOf(this.j6.Hw));
        r0.putOpt("isInstall", java.lang.Boolean.valueOf(this.j6.gn));
        r0.putOpt("isOutcome", java.lang.Boolean.valueOf(this.j6.u7));
        abcd.Xv r18 = this.j6;
        if (r18.v5 == null) goto L35;
        r5 = java.lang.Long.valueOf(r18.Zo);
    L35:
        r0.putOpt("revenueMicros", r5);
        r0.putOpt("revenueCurrency", this.j6.v5);
        boolean r19 = true;
        if (this.j6.we == null) goto L38;
        boolean r20 = true;
    L39:
        r0.putOpt("isCrash", java.lang.Boolean.valueOf(r20));
        abcd.Xv r21 = this.j6;
        if (r21.we != null) goto L42;
    L44:
        r19 = false;
    L45:
        r0.putOpt("isFatalCrash", java.lang.Boolean.valueOf(r19));
        abcd.Xv r22 = this.j6;
        r0.putOpt("exception", j6(r22.we, r22.J8, r22.J0));
        r0.putOpt("uiScene", j6(this.j6.EQ));
        return r0;
    L42:
        if (r21.VH == false) goto L44;
    L38:
        r20 = false;
        goto L39
    L13:
        r7 = java.lang.Long.toString(r6);
        goto L14
    L9:
        r4 = java.lang.Long.toString(r3);
        goto L10
    L5:
        r2 = java.lang.Long.toString(r1);
        goto L6
    }
}
