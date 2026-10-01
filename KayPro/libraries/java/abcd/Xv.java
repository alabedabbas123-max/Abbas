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
        int r0 = 0;
        int r1 = 0;
        java.lang.String r2 = null;
        int r3 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.DW = new java.util.HashMap();
                    r7.readInt();
                    if (r7.readBoolean() == false) { $pc0 = 5; continue $sw0; }
                    this.j6 = r7.readUTF();
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    r0 = r7.readInt();
                    r1 = 0;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r1 >= r0) { $pc0 = 21; continue $sw0; }
                    r2 = r7.readUTF();
                    r3 = r7.readInt();
                    if (r3 != 0) { $pc0 = 10; continue $sw0; }
                    this.DW.put(r2, abcd.aw.j6(r7.readUTF()));
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    r1 = r1 + 1;
                    { $pc0 = 6; continue $sw0; }
                }
                case 10: {
                    if (r3 != 1) { $pc0 = 12; continue $sw0; }
                    this.DW.put(r2, abcd.aw.j6(r7.readLong()));
                    { $pc0 = 20; continue $sw0; }
                }
                case 12: {
                    if (r3 != 2) { $pc0 = 14; continue $sw0; }
                    this.DW.put(r2, abcd.aw.j6(r7.readDouble()));
                    { $pc0 = 20; continue $sw0; }
                }
                case 14: {
                    if (r3 != 3) { $pc0 = 20; continue $sw0; }
                    this.DW.put(r2, abcd.aw.j6(r7.readBoolean()));
                    { $pc0 = 20; continue $sw0; }
                }
                case 21: {
                    this.FH = r7.readBoolean();
                    this.gn = r7.readBoolean();
                    this.Hw = r7.readBoolean();
                    this.u7 = r7.readBoolean();
                    if (r7.readBoolean() == false) { $pc0 = 24; continue $sw0; }
                    this.v5 = r7.readUTF();
                    $pc0 = 24; continue $sw0;
                }
                case 24: {
                    this.Zo = r7.readLong();
                    this.VH = r7.readBoolean();
                    r7.readBoolean();
                    r7.readBoolean();
                    this.tp = r7.readBoolean();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        android.graphics.Rect r0 = null;
        android.graphics.Rect r1 = null;
        android.graphics.Rect r2 = null;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        boolean r7 = false;
        boolean r8 = false;
        com.appfour.backbone.api.objects.UISceneWidget[] r13 = null;
        com.appfour.backbone.api.objects.UISceneWidget r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = abcd.zw.j6();
                    r1 = abcd.zw.j6(r17.getActivity());
                    r2 = abcd.zw.j6(r17.getWindow());
                    r4 = r0.width();
                    r5 = r0.height();
                    r6 = com.appfour.backbone.api.runtime.b.j6().DW();
                    r7 = r17.isBackKey();
                    r8 = !r17.isBackKey();
                    r13 = new com.appfour.backbone.api.objects.UISceneWidget[2];
                    r13[0] = new com.appfour.backbone.api.objects.UISceneWidget(r1, false, com.appfour.backbone.api.runtime.b.j6().j6(r17.getActivity()), true);
                    if (r17.getWindow().getType() == 0) { $pc1 = 5; continue $sw1; }
                    r3 = new com.appfour.backbone.api.objects.UISceneWidget(r2, true, com.appfour.backbone.api.runtime.b.j6().j6(r17.getWindow()), true);
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    r13[1] = r3;
                    return new com.appfour.backbone.api.objects.UIScene(r4, r5, r6, r7, r8, 0, 0, 0, 0, r13);
                }
                case 5: {
                    r3 = null;
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        android.graphics.Rect r0 = null;
        android.graphics.Rect r1 = null;
        android.graphics.Rect r2 = null;
        android.graphics.Rect r3 = null;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        com.appfour.backbone.api.objects.UISceneWidget[] r14 = null;
        com.appfour.backbone.api.objects.UISceneWidget r4 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = abcd.zw.j6();
                    r1 = abcd.zw.j6(r17.getActivity());
                    r2 = abcd.zw.j6(r17.getWindow());
                    r3 = abcd.zw.j6(r17.getWidget());
                    r5 = r0.width();
                    r6 = r0.height();
                    r7 = com.appfour.backbone.api.runtime.b.j6().DW();
                    r10 = r17.getX1() + r2.left;
                    r11 = r17.getY1() + r2.top;
                    r12 = r17.getX2() + r2.left;
                    r13 = r17.getY2() + r2.top;
                    r14 = new com.appfour.backbone.api.objects.UISceneWidget[3];
                    r14[0] = new com.appfour.backbone.api.objects.UISceneWidget(r1, false, com.appfour.backbone.api.runtime.b.j6().j6(r17.getActivity()), true);
                    if (r17.getWindow().getType() == 0) { $pc2 = 5; continue $sw2; }
                    r4 = new com.appfour.backbone.api.objects.UISceneWidget(r2, true, com.appfour.backbone.api.runtime.b.j6().j6(r17.getWindow()), true);
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    r14[1] = r4;
                    r14[2] = new com.appfour.backbone.api.objects.UISceneWidget(r3, true, com.appfour.backbone.api.runtime.b.j6().j6(r17.getWidget()), false);
                    return new com.appfour.backbone.api.objects.UIScene(r5, r6, r7, false, false, r10, r11, r12, r13, r14);
                }
                case 5: {
                    r4 = null;
                    { $pc2 = 6; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.io.DataOutputStream r6) {
        boolean r0 = false;
        boolean r1 = false;
        java.lang.String r2 = null;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, abcd.aw>> r3 = null;
        java.util.Map.Entry<java.lang.String, abcd.aw> r4 = null;
        abcd.aw r5 = null;
        java.lang.String r7 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = true;
                    r6.writeInt(1);
                    if (this.j6 == null) { $pc3 = 5; continue $sw3; }
                    r1 = true;
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    r6.writeBoolean(r1);
                    r2 = this.j6;
                    if (r2 == null) { $pc3 = 9; continue $sw3; }
                    r6.writeUTF(r2);
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    r6.writeInt(this.DW.size());
                    r3 = this.DW.entrySet().iterator();
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    if (r3.hasNext() == false) { $pc3 = 24; continue $sw3; }
                    r4 = r3.next();
                    r6.writeUTF(r4.getKey());
                    r5 = r4.getValue();
                    if (r5.j6 != null) { $pc3 = 14; continue $sw3; }
                    if (r5.DW != null) { $pc3 = 17; continue $sw3; }
                    if (r5.FH != null) { $pc3 = 20; continue $sw3; }
                    if (r5.Hw == null) { $pc3 = 11; continue $sw3; }
                    r6.writeInt(3);
                    r6.writeBoolean(r5.Hw.booleanValue());
                    { $pc3 = 11; continue $sw3; }
                }
                case 20: {
                    r6.writeInt(2);
                    r6.writeDouble(r5.FH.doubleValue());
                    { $pc3 = 11; continue $sw3; }
                }
                case 17: {
                    r6.writeInt(1);
                    r6.writeLong(r5.DW.longValue());
                    { $pc3 = 11; continue $sw3; }
                }
                case 14: {
                    r6.writeInt(0);
                    r6.writeUTF(r5.j6);
                    { $pc3 = 11; continue $sw3; }
                }
                case 24: {
                    r6.writeBoolean(this.FH);
                    r6.writeBoolean(this.gn);
                    r6.writeBoolean(this.Hw);
                    r6.writeBoolean(this.u7);
                    if (this.v5 != null) { $pc3 = 28; continue $sw3; }
                    r0 = false;
                    $pc3 = 28; continue $sw3;
                }
                case 28: {
                    r6.writeBoolean(r0);
                    r7 = this.v5;
                    if (r7 == null) { $pc3 = 31; continue $sw3; }
                    r6.writeUTF(r7);
                    $pc3 = 31; continue $sw3;
                }
                case 31: {
                    r6.writeLong(this.Zo);
                    r6.writeBoolean(this.VH);
                    r6.writeBoolean(false);
                    r6.writeBoolean(false);
                    r6.writeBoolean(this.tp);
                    return;
                }
                case 5: {
                    r1 = false;
                    { $pc3 = 6; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.String r3 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    this.u7 = true;
                    this.Zo = r2;
                    if (r4 != null) { $pc4 = 5; continue $sw4; }
                    r3 = null;
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    this.v5 = r3;
                    return this;
                }
                case 5: {
                    r3 = r4.toString();
                    { $pc4 = 6; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.String r6 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r5 != null) { $pc5 = 5; continue $sw5; }
                    $pc5 = 39; continue $sw5;
                }
                case 39: {
                    return this;
                }
                case 5: {
                    if ((r5 instanceof java.lang.CharSequence) == false) { $pc5 = 10; continue $sw5; }
                    if (((java.lang.CharSequence) r5).length() <= 0) { $pc5 = 39; continue $sw5; }
                    this.DW.put(r4, abcd.aw.j6(r5.toString()));
                    { $pc5 = 39; continue $sw5; }
                }
                case 10: {
                    if ((r5 instanceof java.lang.Enum) == false) { $pc5 = 13; continue $sw5; }
                    this.DW.put(r4, abcd.aw.j6(r5.toString()));
                    { $pc5 = 39; continue $sw5; }
                }
                case 13: {
                    if ((r5 instanceof java.lang.Integer) == false) { $pc5 = 16; continue $sw5; }
                    this.DW.put(r4, abcd.aw.j6(((java.lang.Integer) r5).longValue()));
                    { $pc5 = 39; continue $sw5; }
                }
                case 16: {
                    if ((r5 instanceof java.lang.Short) == false) { $pc5 = 19; continue $sw5; }
                    this.DW.put(r4, abcd.aw.j6(((java.lang.Short) r5).longValue()));
                    { $pc5 = 39; continue $sw5; }
                }
                case 19: {
                    if ((r5 instanceof java.lang.Byte) == false) { $pc5 = 22; continue $sw5; }
                    this.DW.put(r4, abcd.aw.j6(((java.lang.Byte) r5).longValue()));
                    { $pc5 = 39; continue $sw5; }
                }
                case 22: {
                    if ((r5 instanceof java.lang.Character) == false) { $pc5 = 25; continue $sw5; }
                    this.DW.put(r4, abcd.aw.j6(((java.lang.Character) r5).charValue()));
                    { $pc5 = 39; continue $sw5; }
                }
                case 25: {
                    if ((r5 instanceof java.lang.Long) == false) { $pc5 = 28; continue $sw5; }
                    this.DW.put(r4, abcd.aw.j6(((java.lang.Long) r5).longValue()));
                    { $pc5 = 39; continue $sw5; }
                }
                case 28: {
                    if ((r5 instanceof java.lang.Float) == false) { $pc5 = 31; continue $sw5; }
                    this.DW.put(r4, abcd.aw.j6(((java.lang.Float) r5).doubleValue()));
                    { $pc5 = 39; continue $sw5; }
                }
                case 31: {
                    if ((r5 instanceof java.lang.Double) == false) { $pc5 = 34; continue $sw5; }
                    this.DW.put(r4, abcd.aw.j6(((java.lang.Double) r5).doubleValue()));
                    { $pc5 = 39; continue $sw5; }
                }
                case 34: {
                    if ((r5 instanceof java.lang.Boolean) == false) { $pc5 = 36; continue $sw5; }
                    this.DW.put(r4, abcd.aw.j6(((java.lang.Boolean) r5).booleanValue()));
                    { $pc5 = 39; continue $sw5; }
                }
                case 36: {
                    r6 = com.appfour.backbone.api.Api.identifier(r5);
                    if (r6 == null) { $pc5 = 39; continue $sw5; }
                    this.DW.put(r4, abcd.aw.j6(r6.toString()));
                    { $pc5 = 39; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.appfour.backbone.api.objects.EventData setParameterAnonymous(java.lang.String r1, com.appfour.backbone.api.objects.CatchExceptions<?> r2) {
        setParameterAnonymous(r1, com.appfour.backbone.api.Api.catch_(r2));
        return this;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData setParameterAnonymous(java.lang.String r2, java.lang.Object r3) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if ((r3 instanceof java.lang.CharSequence) == false) { $pc6 = 5; continue $sw6; }
                    setParameter(r2, (java.lang.CharSequence) r3);
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    return this;
                }
                case 5: {
                    setParameter(r2, r3);
                    { $pc6 = 6; continue $sw6; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.appfour.backbone.api.objects.EventData setUIScene(java.lang.Object r2) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if ((r2 instanceof com.appfour.backbone.api.objects.UIScene) == false) { $pc7 = 6; continue $sw7; }
                    this.EQ = (com.appfour.backbone.api.objects.UIScene) r2;
                    $pc7 = 23; continue $sw7;
                }
                case 23: {
                    return this;
                }
                case 6: {
                    if ((r2 instanceof com.appfour.backbone.api.objects.UserNotificationAction) == false) { $pc7 = 9; continue $sw7; }
                    this.EQ = j6((com.appfour.backbone.api.objects.UserNotificationAction) r2);
                    { $pc7 = 23; continue $sw7; }
                }
                case 9: {
                    if ((r2 instanceof com.appfour.backbone.api.objects.UserTouchAction) == false) { $pc7 = 12; continue $sw7; }
                    this.EQ = j6((com.appfour.backbone.api.objects.UserTouchAction) r2);
                    { $pc7 = 23; continue $sw7; }
                }
                case 12: {
                    if ((r2 instanceof com.appfour.backbone.api.objects.UserInputAction) == false) { $pc7 = 15; continue $sw7; }
                    this.EQ = j6((com.appfour.backbone.api.objects.UserInputAction) r2);
                    { $pc7 = 23; continue $sw7; }
                }
                case 15: {
                    if ((r2 instanceof com.appfour.backbone.api.objects.UserLaunchAction) == false) { $pc7 = 18; continue $sw7; }
                    this.EQ = j6((com.appfour.backbone.api.objects.UserLaunchAction) r2);
                    { $pc7 = 23; continue $sw7; }
                }
                case 18: {
                    if ((r2 instanceof com.appfour.backbone.api.objects.InAppProduct) == false) { $pc7 = 21; continue $sw7; }
                    this.EQ = j6((com.appfour.backbone.api.objects.InAppProduct) r2);
                    { $pc7 = 23; continue $sw7; }
                }
                case 21: {
                    if ((r2 instanceof com.appfour.backbone.api.objects.Market) == false) { $pc7 = 23; continue $sw7; }
                    this.EQ = j6((com.appfour.backbone.api.objects.Market) r2);
                    { $pc7 = 23; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.appfour.backbone.api.objects.EventData setValue(com.appfour.backbone.api.objects.CatchExceptions<?> r1) {
        setValue(com.appfour.backbone.api.Api.catch_(r1));
        return this;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData setValue(java.lang.Object r2) {
        java.lang.String r3 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (r2 != null) { $pc8 = 5; continue $sw8; }
                    $pc8 = 39; continue $sw8;
                }
                case 39: {
                    return this;
                }
                case 5: {
                    if ((r2 instanceof java.lang.CharSequence) == false) { $pc8 = 10; continue $sw8; }
                    if (((java.lang.CharSequence) r2).length() <= 0) { $pc8 = 39; continue $sw8; }
                    this.j6 = r2.toString();
                    { $pc8 = 39; continue $sw8; }
                }
                case 10: {
                    if ((r2 instanceof java.lang.Enum) == false) { $pc8 = 13; continue $sw8; }
                    this.j6 = r2.toString();
                    { $pc8 = 39; continue $sw8; }
                }
                case 13: {
                    if ((r2 instanceof java.lang.Integer) == false) { $pc8 = 16; continue $sw8; }
                    this.j6 = r2.toString();
                    { $pc8 = 39; continue $sw8; }
                }
                case 16: {
                    if ((r2 instanceof java.lang.Short) == false) { $pc8 = 19; continue $sw8; }
                    this.j6 = r2.toString();
                    { $pc8 = 39; continue $sw8; }
                }
                case 19: {
                    if ((r2 instanceof java.lang.Byte) == false) { $pc8 = 22; continue $sw8; }
                    this.j6 = r2.toString();
                    { $pc8 = 39; continue $sw8; }
                }
                case 22: {
                    if ((r2 instanceof java.lang.Character) == false) { $pc8 = 25; continue $sw8; }
                    this.j6 = r2.toString();
                    { $pc8 = 39; continue $sw8; }
                }
                case 25: {
                    if ((r2 instanceof java.lang.Long) == false) { $pc8 = 28; continue $sw8; }
                    this.j6 = r2.toString();
                    { $pc8 = 39; continue $sw8; }
                }
                case 28: {
                    if ((r2 instanceof java.lang.Float) == false) { $pc8 = 31; continue $sw8; }
                    this.j6 = r2.toString();
                    { $pc8 = 39; continue $sw8; }
                }
                case 31: {
                    if ((r2 instanceof java.lang.Double) == false) { $pc8 = 34; continue $sw8; }
                    this.j6 = r2.toString();
                    { $pc8 = 39; continue $sw8; }
                }
                case 34: {
                    if ((r2 instanceof java.lang.Boolean) == false) { $pc8 = 36; continue $sw8; }
                    this.j6 = r2.toString();
                    { $pc8 = 39; continue $sw8; }
                }
                case 36: {
                    r3 = com.appfour.backbone.api.Api.identifier(r2);
                    if (r3 == null) { $pc8 = 39; continue $sw8; }
                    this.j6 = r3.toString();
                    { $pc8 = 39; continue $sw8; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.appfour.backbone.api.objects.EventData setValueAnonymous(com.appfour.backbone.api.objects.CatchExceptions<?> r1) {
        setValueAnonymous(com.appfour.backbone.api.Api.catch_(r1));
        return this;
    }

    @Override
    public com.appfour.backbone.api.objects.EventData setValueAnonymous(java.lang.Object r2) {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if ((r2 instanceof java.lang.CharSequence) == false) { $pc9 = 5; continue $sw9; }
                    setValue((java.lang.CharSequence) r2);
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    return this;
                }
                case 5: {
                    setValue(r2);
                    { $pc9 = 6; continue $sw9; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    return new abcd._v(this).j6().toString();
                }
                case 4: {
                    return "invalid";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
