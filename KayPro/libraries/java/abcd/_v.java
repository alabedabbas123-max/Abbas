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
        org.json.JSONObject r1 = null;
        org.json.JSONArray r2 = null;
        com.appfour.backbone.api.objects.UISceneWidget[] r11 = null;
        int r3 = 0;
        int r4 = 0;
        com.appfour.backbone.api.objects.UISceneWidget r5 = null;
        org.json.JSONObject r6 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r10 != null) { $pc0 = 5; continue $sw0; }
                    return null;
                }
                case 5: {
                    r1 = new org.json.JSONObject();
                    r1.put("deviceWidth", r10.deviceWidth);
                    r1.put("deviceHeight", r10.deviceHeight);
                    r1.put("imeHeight", r10.imeHeight);
                    r1.put("pressedBackKey", r10.pressedBackKey);
                    r1.put("pressedKey", r10.pressedKey);
                    r1.put("touchX", r10.touchX);
                    r1.put("touchY", r10.touchY);
                    r1.put("touchX2", r10.touchX2);
                    r1.put("touchY2", r10.touchY2);
                    r2 = new org.json.JSONArray();
                    r11 = r10.widgets;
                    r3 = r11.length;
                    r4 = 0;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r4 >= r3) { $pc0 = 12; continue $sw0; }
                    r5 = r11[r4];
                    if (r5 == null) { $pc0 = 10; continue $sw0; }
                    r6 = new org.json.JSONObject();
                    r6.put("x", r5.x);
                    r6.put("y", r5.y);
                    r6.put("width", r5.width);
                    r6.put("height", r5.height);
                    r6.put("fill", r5.fill);
                    r6.put("text", r5.text);
                    r6.put("textAlignTop", r5.textAlignTop);
                    r2.put(r6);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    r4 = r4 + 1;
                    { $pc0 = 6; continue $sw0; }
                }
                case 10: {
                    r2.put(null);
                    { $pc0 = 11; continue $sw0; }
                }
                case 12: {
                    r1.put("widgets", r2);
                    return r1.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.String j6(java.lang.Throwable r2, java.lang.StackTraceElement r3, java.lang.String r4) {
        org.json.JSONObject r5 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r2 != null) { $pc1 = 5; continue $sw1; }
                    return null;
                }
                case 5: {
                    r5 = j6(r2);
                    if (r3 == null) { $pc1 = 8; continue $sw1; }
                    r5.putOpt("exceptionRootLocation", j6(r3));
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    r5.putOpt("exceptionRootClassName", r4);
                    return r5.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        org.json.JSONObject r0 = null;
        org.json.JSONArray r1 = null;
        java.lang.StackTraceElement[] r2 = null;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new org.json.JSONObject();
                    r0.put("exceptionClassName", r7.getClass().getName());
                    r0.put("message", r7.getMessage());
                    r1 = new org.json.JSONArray();
                    if (r7.getStackTrace() == null) { $pc2 = 7; continue $sw2; }
                    r2 = r7.getStackTrace();
                    r3 = r2.length;
                    r4 = 0;
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    if (r4 >= r3) { $pc2 = 7; continue $sw2; }
                    r1.put(j6(r2[r4]));
                    r4 = r4 + 1;
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    r0.put("stackTrace", r1);
                    if (r7.getCause() == null) { $pc2 = 10; continue $sw2; }
                    r0.put("cause", j6(r7.getCause()));
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public org.json.JSONObject j6() {
        org.json.JSONObject r0 = null;
        long r1 = 0L;
        java.lang.Object r5 = null;
        java.lang.Object r2 = null;
        long r3 = 0L;
        java.lang.Object r4 = null;
        long r6 = 0L;
        java.lang.Object r7 = null;
        org.json.JSONArray r8 = null;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.aw>> r9 = null;
        java.util.Map.Entry<java.lang.String, abcd.aw> r10 = null;
        org.json.JSONObject r11 = null;
        abcd.aw r12 = null;
        org.json.JSONObject r13 = null;
        java.lang.String r14 = null;
        java.lang.Long r15 = null;
        java.lang.Double r16 = null;
        java.lang.Boolean r17 = null;
        abcd.Xv r18 = null;
        boolean r19 = false;
        boolean r20 = false;
        abcd.Xv r21 = null;
        abcd.Xv r22 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = new org.json.JSONObject();
                    r1 = this.DW;
                    r5 = null;
                    if (r1 != 0) { $pc3 = 5; continue $sw3; }
                    r2 = null;
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
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
                    r3 = this.we;
                    if (r3 >= 0) { $pc3 = 9; continue $sw3; }
                    r4 = null;
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    r0.putOpt("propertyEventTimestamp", r4);
                    r6 = this.J0;
                    if (r6 >= 0) { $pc3 = 13; continue $sw3; }
                    r7 = null;
                    $pc3 = 14; continue $sw3;
                }
                case 14: {
                    r0.putOpt("recordingStartTimestamp", r7);
                    if (this.j6.DW.isEmpty() == true) { $pc3 = 32; continue $sw3; }
                    r8 = new org.json.JSONArray();
                    r0.put("params", r8);
                    r9 = this.j6.DW.entrySet().iterator();
                    $pc3 = 18; continue $sw3;
                }
                case 18: {
                    if (r9.hasNext() == false) { $pc3 = 32; continue $sw3; }
                    r10 = r9.next();
                    r11 = new org.json.JSONObject();
                    r12 = r10.getValue();
                    r13 = new org.json.JSONObject();
                    r14 = r12.j6;
                    if (r14 != null) { $pc3 = 21; continue $sw3; }
                    r15 = r12.DW;
                    if (r15 != null) { $pc3 = 24; continue $sw3; }
                    r16 = r12.FH;
                    if (r16 != null) { $pc3 = 27; continue $sw3; }
                    r17 = r12.Hw;
                    if (r17 == null) { $pc3 = 18; continue $sw3; }
                    r13.put("booleanValue", r17);
                    $pc3 = 31; continue $sw3;
                }
                case 31: {
                    r11.put("key", r10.getKey());
                    r11.put("value", r13);
                    r8.put(r11);
                    { $pc3 = 18; continue $sw3; }
                }
                case 27: {
                    r13.put("doubleValue", r16);
                    { $pc3 = 31; continue $sw3; }
                }
                case 24: {
                    r13.put("longValue", r15);
                    { $pc3 = 31; continue $sw3; }
                }
                case 21: {
                    r13.put("stringValue", r14);
                    $pc3 = 32; continue $sw3;
                }
                case 32: {
                    r0.putOpt("summary", this.j6.j6);
                    r0.putOpt("isAudienceProperty", java.lang.Boolean.valueOf(this.j6.tp));
                    r0.putOpt("isUserAction", java.lang.Boolean.valueOf(this.j6.FH));
                    r0.putOpt("isScreenView", java.lang.Boolean.valueOf(this.j6.Hw));
                    r0.putOpt("isInstall", java.lang.Boolean.valueOf(this.j6.gn));
                    r0.putOpt("isOutcome", java.lang.Boolean.valueOf(this.j6.u7));
                    r18 = this.j6;
                    if (r18.v5 == null) { $pc3 = 35; continue $sw3; }
                    r5 = java.lang.Long.valueOf(r18.Zo);
                    $pc3 = 35; continue $sw3;
                }
                case 35: {
                    r0.putOpt("revenueMicros", r5);
                    r0.putOpt("revenueCurrency", this.j6.v5);
                    r19 = true;
                    if (this.j6.we == null) { $pc3 = 38; continue $sw3; }
                    r20 = true;
                    $pc3 = 39; continue $sw3;
                }
                case 39: {
                    r0.putOpt("isCrash", java.lang.Boolean.valueOf(r20));
                    r21 = this.j6;
                    if (r21.we != null) { $pc3 = 42; continue $sw3; }
                    $pc3 = 44; continue $sw3;
                }
                case 44: {
                    r19 = false;
                    $pc3 = 45; continue $sw3;
                }
                case 45: {
                    r0.putOpt("isFatalCrash", java.lang.Boolean.valueOf(r19));
                    r22 = this.j6;
                    r0.putOpt("exception", j6(r22.we, r22.J8, r22.J0));
                    r0.putOpt("uiScene", j6(this.j6.EQ));
                    return r0;
                }
                case 42: {
                    if (r21.VH == false) { $pc3 = 44; continue $sw3; }
                    $pc3 = 38; continue $sw3;
                }
                case 38: {
                    r20 = false;
                    { $pc3 = 39; continue $sw3; }
                }
                case 13: {
                    r7 = java.lang.Long.toString(r6);
                    { $pc3 = 14; continue $sw3; }
                }
                case 9: {
                    r4 = java.lang.Long.toString(r3);
                    { $pc3 = 10; continue $sw3; }
                }
                case 5: {
                    r2 = java.lang.Long.toString(r1);
                    { $pc3 = 6; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
