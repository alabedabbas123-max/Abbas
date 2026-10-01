package abcd;

public class Xv implements com.appfour.backbone.api.objects.EventData {
    public java.util.Map<java.lang.String, abcd.aw> DW;
    public com.appfour.backbone.api.objects.UIScene EQ;
    public boolean FH;
    public boolean Hw;
    public java.lang.String J0;
    public java.lang.StackTraceElement J8;
    public boolean VH;
    public long Zo;
    public boolean gn;
    public java.lang.String j6;
    public boolean tp;
    public boolean u7;
    public java.lang.String v5;
    public java.lang.Throwable we;

    public Xv() {
        this.DW = new java.util.HashMap();
    }

    public Xv(java.io.DataInputStream r7) {
        this.DW = new java.util.HashMap();
        r7.readInt();
        if (r7.readBoolean() == false) goto L5;
        this.j6 = r7.readUTF();
    L5:
        int r0 = r7.readInt();
        int r1 = 0;
    L6:
        if (r1 >= r0) goto L21;
        java.lang.String r2 = r7.readUTF();
        int r3 = r7.readInt();
        if (r3 != 0) goto L10;
        this.DW.put(r2, abcd.aw.j6(r7.readUTF()));
    L20:
        r1 = r1 + 1;
        goto L6
    L10:
        if (r3 != 1) goto L12;
        this.DW.put(r2, abcd.aw.j6(r7.readLong()));
        goto L20
    L12:
        if (r3 != 2) goto L14;
        this.DW.put(r2, abcd.aw.j6(r7.readDouble()));
        goto L20
    L14:
        if (r3 != 3) goto L20;
        this.DW.put(r2, abcd.aw.j6(r7.readBoolean()));
        goto L20
    L21:
        this.FH = r7.readBoolean();
        this.gn = r7.readBoolean();
        this.Hw = r7.readBoolean();
        this.u7 = r7.readBoolean();
        if (r7.readBoolean() == false) goto L24;
        this.v5 = r7.readUTF();
    L24:
        this.Zo = r7.readLong();
        this.VH = r7.readBoolean();
        r7.readBoolean();
        r7.readBoolean();
        this.tp = r7.readBoolean();
    }

    private com.appfour.backbone.api.objects.UIScene j6(com.appfour.backbone.api.objects.InAppProduct r16) {
        android.graphics.Rect r0 = abcd.zw.j6();
        int r1 = r0.width() / 10;
        int r12 = r0.width() / 2;
        int r13 = r0.height() / 2;
        android.graphics.Rect r2 = new android.graphics.Rect(r12 - r1, r13 - r1, r12 + r1, r1 + r13);
        return new com.appfour.backbone.api.objects.UIScene(r0.width(), r0.height(), 0, false, false, r12, r13, r12, r13, new com.appfour.backbone.api.objects.UISceneWidget[]{new com.appfour.backbone.api.objects.UISceneWidget(r0, true, r16.getMarket().getPackageName(), false), new com.appfour.backbone.api.objects.UISceneWidget(r2, true, "Purchase " + com.appfour.backbone.api.Api.identifier(r16), false)});
    }

    private com.appfour.backbone.api.objects.UIScene j6(com.appfour.backbone.api.objects.Market r16) {
        android.graphics.Rect r0 = abcd.zw.j6();
        int r1 = r0.width() / 10;
        int r12 = r0.width() / 2;
        int r13 = r0.height() / 2;
        android.graphics.Rect r2 = new android.graphics.Rect(r12 - r1, r13 - r1, r12 + r1, r1 + r13);
        return new com.appfour.backbone.api.objects.UIScene(r0.width(), r0.height(), 0, false, false, r12, r13, r12, r13, new com.appfour.backbone.api.objects.UISceneWidget[]{new com.appfour.backbone.api.objects.UISceneWidget(r0, true, r16.getPackageName(), false), new com.appfour.backbone.api.objects.UISceneWidget(r2, true, "Install " + com.appfour.backbone.api.Api.getAppId(), false)});
    }

    private com.appfour.backbone.api.objects.UIScene j6(com.appfour.backbone.api.objects.UserInputAction r17) {
        android.graphics.Rect r0 = abcd.zw.j6();
        android.graphics.Rect r1 = abcd.zw.j6(r17.getActivity());
        android.graphics.Rect r2 = abcd.zw.j6(r17.getWindow());
        int r4 = r0.width();
        int r5 = r0.height();
        int r6 = com.appfour.backbone.api.runtime.b.j6().DW();
        boolean r7 = r17.isBackKey();
        boolean r8 = !r17.isBackKey();
        com.appfour.backbone.api.objects.UISceneWidget[] r13 = new com.appfour.backbone.api.objects.UISceneWidget[2];
        r13[0] = new com.appfour.backbone.api.objects.UISceneWidget(r1, false, com.appfour.backbone.api.runtime.b.j6().j6(r17.getActivity()), true);
        if (r17.getWindow().getType() == 0) goto L5;
        com.appfour.backbone.api.objects.UISceneWidget r3 = new com.appfour.backbone.api.objects.UISceneWidget(r2, true, com.appfour.backbone.api.runtime.b.j6().j6(r17.getWindow()), true);
    L6:
        r13[1] = r3;
        return new com.appfour.backbone.api.objects.UIScene(r4, r5, r6, r7, r8, 0, 0, 0, 0, r13);
    L5:
        r3 = null;
        goto L6
    }

    private com.appfour.backbone.api.objects.UIScene j6(com.appfour.backbone.api.objects.UserLaunchAction r15) {
        android.graphics.Rect r0 = abcd.zw.j6();
        int r1 = r0.width() / 10;
        int r11 = r0.width() / 2;
        int r12 = r0.height() / 2;
        android.graphics.Rect r2 = new android.graphics.Rect(r11 - r1, r12 - r1, r11 + r1, r1 + r12);
        return new com.appfour.backbone.api.objects.UIScene(r0.width(), r0.height(), 0, false, false, r11, r12, r11, r12, new com.appfour.backbone.api.objects.UISceneWidget[]{new com.appfour.backbone.api.objects.UISceneWidget(r2, true, com.appfour.backbone.api.runtime.b.j6().j6(r15.getActivity()), false)});
    }

    private com.appfour.backbone.api.objects.UIScene j6(com.appfour.backbone.api.objects.UserNotificationAction r17) {
        android.graphics.Rect r0 = abcd.zw.j6();
        android.graphics.Rect r1 = new android.graphics.Rect(0, 0, r0.right, r0.height() / 10);
        return new com.appfour.backbone.api.objects.UIScene(r0.width(), r0.height(), 0, false, false, r1.width() / 2, r1.height() / 2, r1.width() / 2, r1.height() / 2, new com.appfour.backbone.api.objects.UISceneWidget[]{new com.appfour.backbone.api.objects.UISceneWidget(r1, true, com.appfour.backbone.api.runtime.b.j6().j6(r17), false)});
    }

    private com.appfour.backbone.api.objects.UIScene j6(com.appfour.backbone.api.objects.UserTouchAction r17) {
        android.graphics.Rect r0 = abcd.zw.j6();
        android.graphics.Rect r1 = abcd.zw.j6(r17.getActivity());
        android.graphics.Rect r2 = abcd.zw.j6(r17.getWindow());
        android.graphics.Rect r3 = abcd.zw.j6(r17.getWidget());
        int r5 = r0.width();
        int r6 = r0.height();
        int r7 = com.appfour.backbone.api.runtime.b.j6().DW();
        int r10 = r17.getX1() + r2.left;
        int r11 = r17.getY1() + r2.top;
        int r12 = r17.getX2() + r2.left;
        int r13 = r17.getY2() + r2.top;
        com.appfour.backbone.api.objects.UISceneWidget[] r14 = new com.appfour.backbone.api.objects.UISceneWidget[3];
        r14[0] = new com.appfour.backbone.api.objects.UISceneWidget(r1, false, com.appfour.backbone.api.runtime.b.j6().j6(r17.getActivity()), true);
        if (r17.getWindow().getType() == 0) goto L5;
        com.appfour.backbone.api.objects.UISceneWidget r4 = new com.appfour.backbone.api.objects.UISceneWidget(r2, true, com.appfour.backbone.api.runtime.b.j6().j6(r17.getWindow()), true);
    L6:
        r14[1] = r4;
        r14[2] = new com.appfour.backbone.api.objects.UISceneWidget(r3, true, com.appfour.backbone.api.runtime.b.j6().j6(r17.getWidget()), false);
        return new com.appfour.backbone.api.objects.UIScene(r5, r6, r7, false, false, r10, r11, r12, r13, r14);
    L5:
        r4 = null;
        goto L6
    }

    public void j6(java.io.DataOutputStream r6) {
        boolean r0 = true;
        r6.writeInt(1);
        if (this.j6 == null) goto L5;
        boolean r1 = true;
    L6:
        r6.writeBoolean(r1);
        java.lang.String r2 = this.j6;
        if (r2 == null) goto L9;
        r6.writeUTF(r2);
    L9:
        r6.writeInt(this.DW.size());
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.aw>> r3 = this.DW.entrySet().iterator();
    L11:
        if (r3.hasNext() == false) goto L24;
        java.util.Map.Entry<java.lang.String, abcd.aw> r4 = r3.next();
        r6.writeUTF(r4.getKey());
        abcd.aw r5 = r4.getValue();
        if (r5.j6 != null) goto L14;
        if (r5.DW != null) goto L17;
        if (r5.FH != null) goto L20;
        if (r5.Hw == null) goto L11;
        r6.writeInt(3);
        r6.writeBoolean(r5.Hw.booleanValue());
        goto L11
    L20:
        r6.writeInt(2);
        r6.writeDouble(r5.FH.doubleValue());
        goto L11
    L17:
        r6.writeInt(1);
        r6.writeLong(r5.DW.longValue());
        goto L11
    L14:
        r6.writeInt(0);
        r6.writeUTF(r5.j6);
        goto L11
    L24:
        r6.writeBoolean(this.FH);
        r6.writeBoolean(this.gn);
        r6.writeBoolean(this.Hw);
        r6.writeBoolean(this.u7);
        if (this.v5 != null) goto L28;
        r0 = false;
    L28:
        r6.writeBoolean(r0);
        java.lang.String r7 = this.v5;
        if (r7 == null) goto L31;
        r6.writeUTF(r7);
    L31:
        r6.writeLong(this.Zo);
        r6.writeBoolean(this.VH);
        r6.writeBoolean(false);
        r6.writeBoolean(false);
        r6.writeBoolean(this.tp);
        return;
    L5:
        r1 = false;
        goto L6
    }

    @Override
    public com.appfour.backbone.api.objects.EventData setCrash(java.lang.Throwable r1, boolean r2) {
        this.we = r1;
        this.VH = r2;
        this.J0 = com.appfour.backbone.api.runtime.b.j6().DW(r1);
        this.J8 = com.appfour.backbone.api.runtime.b.j6().j6(r1);
        setValue(r1);
        return this;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData setIsInstall(boolean r1) {
        this.gn = r1;
        return this;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData setIsProperty(boolean r1) {
        this.tp = r1;
        return this;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData setIsScreenView(boolean r1) {
        this.Hw = r1;
        return this;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData setIsUserActive(boolean r1) {
        this.FH = r1;
        return this;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData setOutcome(long r2, java.lang.CharSequence r4) {
        this.u7 = true;
        this.Zo = r2;
        if (r4 != null) goto L5;
        java.lang.String r3 = null;
    L6:
        this.v5 = r3;
        return this;
    L5:
        r3 = r4.toString();
        goto L6
    }

    @Override
    public com.appfour.backbone.api.objects.EventData setOutcome(boolean r1) {
        this.u7 = true;
        return this;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData setParameter(java.lang.String r1, com.appfour.backbone.api.objects.CatchExceptions<?> r2) {
        setParameter(r1, com.appfour.backbone.api.Api.catch_(r2));
        return this;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData setParameter(java.lang.String r4, java.lang.Object r5) {
        if (r5 != null) goto L5;
    L39:
        return this;
    L5:
        if ((r5 instanceof java.lang.CharSequence) == false) goto L10;
        if (((java.lang.CharSequence) r5).length() <= 0) goto L39;
        this.DW.put(r4, abcd.aw.j6(r5.toString()));
        goto L39
    L10:
        if ((r5 instanceof java.lang.Enum) == false) goto L13;
        this.DW.put(r4, abcd.aw.j6(r5.toString()));
        goto L39
    L13:
        if ((r5 instanceof java.lang.Integer) == false) goto L16;
        this.DW.put(r4, abcd.aw.j6(((java.lang.Integer) r5).longValue()));
        goto L39
    L16:
        if ((r5 instanceof java.lang.Short) == false) goto L19;
        this.DW.put(r4, abcd.aw.j6(((java.lang.Short) r5).longValue()));
        goto L39
    L19:
        if ((r5 instanceof java.lang.Byte) == false) goto L22;
        this.DW.put(r4, abcd.aw.j6(((java.lang.Byte) r5).longValue()));
        goto L39
    L22:
        if ((r5 instanceof java.lang.Character) == false) goto L25;
        this.DW.put(r4, abcd.aw.j6(((java.lang.Character) r5).charValue()));
        goto L39
    L25:
        if ((r5 instanceof java.lang.Long) == false) goto L28;
        this.DW.put(r4, abcd.aw.j6(((java.lang.Long) r5).longValue()));
        goto L39
    L28:
        if ((r5 instanceof java.lang.Float) == false) goto L31;
        this.DW.put(r4, abcd.aw.j6(((java.lang.Float) r5).doubleValue()));
        goto L39
    L31:
        if ((r5 instanceof java.lang.Double) == false) goto L34;
        this.DW.put(r4, abcd.aw.j6(((java.lang.Double) r5).doubleValue()));
        goto L39
    L34:
        if ((r5 instanceof java.lang.Boolean) == false) goto L36;
        this.DW.put(r4, abcd.aw.j6(((java.lang.Boolean) r5).booleanValue()));
        goto L39
    L36:
        java.lang.String r6 = com.appfour.backbone.api.Api.identifier(r5);
        if (r6 == null) goto L39;
        this.DW.put(r4, abcd.aw.j6(r6.toString()));
        goto L39
    }

    @Override
    public com.appfour.backbone.api.objects.EventData setParameterAnonymous(java.lang.String r1, com.appfour.backbone.api.objects.CatchExceptions<?> r2) {
        setParameterAnonymous(r1, com.appfour.backbone.api.Api.catch_(r2));
        return this;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData setParameterAnonymous(java.lang.String r2, java.lang.Object r3) {
        if ((r3 instanceof java.lang.CharSequence) == false) goto L5;
        setParameter(r2, (java.lang.CharSequence) r3);
    L6:
        return this;
    L5:
        setParameter(r2, r3);
        goto L6
    }

    @Override
    public com.appfour.backbone.api.objects.EventData setUIScene(java.lang.Object r2) {
        if ((r2 instanceof com.appfour.backbone.api.objects.UIScene) == false) goto L6;
        this.EQ = (com.appfour.backbone.api.objects.UIScene) r2;
    L23:
        return this;
    L6:
        if ((r2 instanceof com.appfour.backbone.api.objects.UserNotificationAction) == false) goto L9;
        this.EQ = j6((com.appfour.backbone.api.objects.UserNotificationAction) r2);
        goto L23
    L9:
        if ((r2 instanceof com.appfour.backbone.api.objects.UserTouchAction) == false) goto L12;
        this.EQ = j6((com.appfour.backbone.api.objects.UserTouchAction) r2);
        goto L23
    L12:
        if ((r2 instanceof com.appfour.backbone.api.objects.UserInputAction) == false) goto L15;
        this.EQ = j6((com.appfour.backbone.api.objects.UserInputAction) r2);
        goto L23
    L15:
        if ((r2 instanceof com.appfour.backbone.api.objects.UserLaunchAction) == false) goto L18;
        this.EQ = j6((com.appfour.backbone.api.objects.UserLaunchAction) r2);
        goto L23
    L18:
        if ((r2 instanceof com.appfour.backbone.api.objects.InAppProduct) == false) goto L21;
        this.EQ = j6((com.appfour.backbone.api.objects.InAppProduct) r2);
        goto L23
    L21:
        if ((r2 instanceof com.appfour.backbone.api.objects.Market) == false) goto L23;
        this.EQ = j6((com.appfour.backbone.api.objects.Market) r2);
        goto L23
    }

    @Override
    public com.appfour.backbone.api.objects.EventData setValue(com.appfour.backbone.api.objects.CatchExceptions<?> r1) {
        setValue(com.appfour.backbone.api.Api.catch_(r1));
        return this;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData setValue(java.lang.Object r2) {
        if (r2 != null) goto L5;
    L39:
        return this;
    L5:
        if ((r2 instanceof java.lang.CharSequence) == false) goto L10;
        if (((java.lang.CharSequence) r2).length() <= 0) goto L39;
        this.j6 = r2.toString();
        goto L39
    L10:
        if ((r2 instanceof java.lang.Enum) == false) goto L13;
        this.j6 = r2.toString();
        goto L39
    L13:
        if ((r2 instanceof java.lang.Integer) == false) goto L16;
        this.j6 = r2.toString();
        goto L39
    L16:
        if ((r2 instanceof java.lang.Short) == false) goto L19;
        this.j6 = r2.toString();
        goto L39
    L19:
        if ((r2 instanceof java.lang.Byte) == false) goto L22;
        this.j6 = r2.toString();
        goto L39
    L22:
        if ((r2 instanceof java.lang.Character) == false) goto L25;
        this.j6 = r2.toString();
        goto L39
    L25:
        if ((r2 instanceof java.lang.Long) == false) goto L28;
        this.j6 = r2.toString();
        goto L39
    L28:
        if ((r2 instanceof java.lang.Float) == false) goto L31;
        this.j6 = r2.toString();
        goto L39
    L31:
        if ((r2 instanceof java.lang.Double) == false) goto L34;
        this.j6 = r2.toString();
        goto L39
    L34:
        if ((r2 instanceof java.lang.Boolean) == false) goto L36;
        this.j6 = r2.toString();
        goto L39
    L36:
        java.lang.String r3 = com.appfour.backbone.api.Api.identifier(r2);
        if (r3 == null) goto L39;
        this.j6 = r3.toString();
        goto L39
    }

    @Override
    public com.appfour.backbone.api.objects.EventData setValueAnonymous(com.appfour.backbone.api.objects.CatchExceptions<?> r1) {
        setValueAnonymous(com.appfour.backbone.api.Api.catch_(r1));
        return this;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData setValueAnonymous(java.lang.Object r2) {
        if ((r2 instanceof java.lang.CharSequence) == false) goto L5;
        setValue((java.lang.CharSequence) r2);
    L6:
        return this;
    L5:
        setValue(r2);
        goto L6
    }

    public java.lang.String toString() {
        return new abcd._v(this).j6().toString();
    L4:
        return "invalid";
    }
}
