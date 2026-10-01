package com.aide.common;

@abcd.Interfacexu
public class ColorPickerView extends android.view.View {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -3202559736252690360L)
    private int[] EQ;

    @abcd.Interfaceru(field = -1389784302102514900L)
    private float FH;

    @abcd.Interfaceru(field = 3424492381049205480L)
    private int Hw;

    @abcd.Interfaceru(field = -2934262928006896876L)
    private int VH;

    @abcd.Interfaceru(field = 2818015259874418149L)
    private int Zo;

    @abcd.Interfaceru(field = 40436816686405035L)
    private com.aide.common.ColorPickerView.a gn;

    @abcd.Interfaceru(field = 407981745136163836L)
    private final int[] tp;

    @abcd.Interfaceru(field = 1261846804011696119L)
    private android.graphics.Paint u7;

    @abcd.Interfaceru(field = 3424616875214947389L)
    private int v5;

    @abcd.Interfaceru(field = 1384539664753234799L)
    private float we;

    public interface a {
        void j6(int r1, java.lang.String r2);
    }

    static {
        abcd.wu.j6(com.aide.common.ColorPickerView.class, 6031411439909550105L, 6031411439909550105L);
    }

    public ColorPickerView(android.content.Context r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1657503528089660801L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1657503528089660801L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        super(r6);     // Catch: java.lang.Throwable -> L8
        this.FH = 0.0f;     // Catch: java.lang.Throwable -> L8
        this.Hw = 0;     // Catch: java.lang.Throwable -> L8
        this.v5 = 0;     // Catch: java.lang.Throwable -> L8
        this.tp = new int[258];     // Catch: java.lang.Throwable -> L8
        this.EQ = new int[65536];     // Catch: java.lang.Throwable -> L8
        j6();     // Catch: java.lang.Throwable -> L8
    }

    public ColorPickerView(android.content.Context r8, android.util.AttributeSet r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -5469345578809877160L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-5469345578809877160L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        super(r8, r9);     // Catch: java.lang.Throwable -> L7
        this.FH = 0.0f;     // Catch: java.lang.Throwable -> L7
        this.Hw = 0;     // Catch: java.lang.Throwable -> L7
        this.v5 = 0;     // Catch: java.lang.Throwable -> L7
        this.tp = new int[258];     // Catch: java.lang.Throwable -> L7
        this.EQ = new int[65536];     // Catch: java.lang.Throwable -> L7
        j6();     // Catch: java.lang.Throwable -> L7
    }

    public ColorPickerView(android.content.Context r9, android.util.AttributeSet r10, int r11) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 971956533226271447L, null, r9, r10, new java.lang.Integer(r11));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(971956533226271447L, null, r9, r10, new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
    L5:
        super(r9, r10, r11);     // Catch: java.lang.Throwable -> L7
        this.FH = 0.0f;     // Catch: java.lang.Throwable -> L7
        this.Hw = 0;     // Catch: java.lang.Throwable -> L7
        this.v5 = 0;     // Catch: java.lang.Throwable -> L7
        this.tp = new int[258];     // Catch: java.lang.Throwable -> L7
        this.EQ = new int[65536];     // Catch: java.lang.Throwable -> L7
        j6();     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = 1841149493419791512L)
    private int DW(int r8, int r9) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 491561673750283944L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L17:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(491561673750283944L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L13
    L5:
        int r0 = (r9 * 256) + r8;     // Catch: java.lang.Throwable -> L13
        if (r0 >= 0) goto L8;
        return 0;
    L8:
        if (r0 >= this.EQ.length) goto L20;
        return this.EQ[r0];
    L20:
        return 0;
    }

    @abcd.Interfacesu(method = -7356749345348994000L)
    private void DW() {
    L16:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, 6454937435900366640L, this);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(6454937435900366640L, this);     // Catch: java.lang.Throwable -> L16
    L6:
        int r2 = getCurrentMainColor();     // Catch: java.lang.Throwable -> L16
        int[] r4 = new int[256];     // Catch: java.lang.Throwable -> L16
        int r6 = 0;
        int r7 = 0;
    L7:
        if (r6 >= 256) goto L15;
        int r8 = r7;
        int r9 = 0;
    L9:
        if (r9 >= 256) goto L14;
        if (r6 != 0) goto L12;
        this.EQ[r8] = android.graphics.Color.rgb(255 - (((255 - android.graphics.Color.red(r2)) * r9) / 255), 255 - (((255 - android.graphics.Color.green(r2)) * r9) / 255), 255 - (((255 - android.graphics.Color.blue(r2)) * r9) / 255));     // Catch: java.lang.Throwable -> L16
        r4[r9] = this.EQ[r8];     // Catch: java.lang.Throwable -> L16
    L13:
        r8 = r8 + 1;
        r9 = r9 + 1;
        goto L9
    L12:
        int r10 = 255 - r6;     // Catch: java.lang.Throwable -> L16
        this.EQ[r8] = android.graphics.Color.rgb((android.graphics.Color.red(r4[r9]) * r10) / 255, (android.graphics.Color.green(r4[r9]) * r10) / 255, (r10 * android.graphics.Color.blue(r4[r9])) / 255);     // Catch: java.lang.Throwable -> L16
        goto L13
    L14:
        r6 = r6 + 1;
        r7 = r8;
        goto L7
    }

    @abcd.Interfacesu(method = -1913630263746663924L)
    private void FH() {
    L31:
        th = move-exception;
        if (DW == false) goto L36;
        abcd.wu.j6(th, -5066467882461213740L, this);
    L36:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5066467882461213740L, this);     // Catch: java.lang.Throwable -> L31
    L6:
        float r2 = 0.0f;
        float r4 = 0.0f;
        int r5 = 0;
    L8:
        if (r4 >= 256.0f) goto L10;
        this.tp[r5] = android.graphics.Color.rgb(255, 0, (int) r4);     // Catch: java.lang.Throwable -> L31
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L31
        r4 = r4 + 6.0f;     // Catch: java.lang.Throwable -> L31
        goto L8
    L10:
        float r6 = 0.0f;
    L12:
        if (r6 >= 256.0f) goto L14;
        this.tp[r5] = android.graphics.Color.rgb(255 - ((int) r6), 0, 255);     // Catch: java.lang.Throwable -> L31
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L31
        r6 = r6 + 6.0f;     // Catch: java.lang.Throwable -> L31
        goto L12
    L14:
        float r7 = 0.0f;
    L16:
        if (r7 >= 256.0f) goto L18;
        this.tp[r5] = android.graphics.Color.rgb(0, (int) r7, 255);     // Catch: java.lang.Throwable -> L31
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L31
        r7 = r7 + 6.0f;     // Catch: java.lang.Throwable -> L31
        goto L16
    L18:
        float r8 = 0.0f;
    L20:
        if (r8 >= 256.0f) goto L22;
        this.tp[r5] = android.graphics.Color.rgb(0, 255, 255 - ((int) r8));     // Catch: java.lang.Throwable -> L31
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L31
        r8 = r8 + 6.0f;     // Catch: java.lang.Throwable -> L31
        goto L20
    L22:
        float r9 = 0.0f;
    L24:
        if (r9 >= 256.0f) goto L27;
        this.tp[r5] = android.graphics.Color.rgb((int) r9, 255, 0);     // Catch: java.lang.Throwable -> L31
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L31
        r9 = r9 + 6.0f;     // Catch: java.lang.Throwable -> L31
    L27:
        if (r2 >= 256.0f) goto L30;
        this.tp[r5] = android.graphics.Color.rgb(255, 255 - ((int) r2), 0);     // Catch: java.lang.Throwable -> L31
        r5 = r5 + 1;
        r2 = r2 + 6.0f;
        goto L27
    }

    @abcd.Interfacesu(method = 5651372696192958541L)
    private int getCurrentMainColor() {
    L49:
        th = move-exception;
        if (DW == false) goto L54;
        abcd.wu.j6(th, 3739337502423491297L, this);
    L54:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3739337502423491297L, this);     // Catch: java.lang.Throwable -> L49
    L6:
        int r2 = 255 - ((int) ((this.FH * 255.0f) / 360.0f));     // Catch: java.lang.Throwable -> L49
        float r4 = 0.0f;
        float r6 = 0.0f;
        int r7 = 0;
    L8:
        if (r6 >= 256.0f) goto L13;
        if (r7 == r2) goto L11;
        r7 = r7 + 1;     // Catch: java.lang.Throwable -> L49
        r6 = r6 + 6.0f;     // Catch: java.lang.Throwable -> L49
        goto L8
    L11:
        return android.graphics.Color.rgb(255, 0, (int) r6);
    L13:
        float r8 = 0.0f;
    L15:
        if (r8 >= 256.0f) goto L20;
        if (r7 == r2) goto L18;
        r7 = r7 + 1;     // Catch: java.lang.Throwable -> L49
        r8 = r8 + 6.0f;     // Catch: java.lang.Throwable -> L49
        goto L15
    L18:
        return android.graphics.Color.rgb(255 - ((int) r8), 0, 255);
    L20:
        float r9 = 0.0f;
    L22:
        if (r9 >= 256.0f) goto L27;
        if (r7 == r2) goto L25;
        r7 = r7 + 1;     // Catch: java.lang.Throwable -> L49
        r9 = r9 + 6.0f;     // Catch: java.lang.Throwable -> L49
        goto L22
    L25:
        return android.graphics.Color.rgb(0, (int) r9, 255);
    L27:
        float r10 = 0.0f;
    L29:
        if (r10 >= 256.0f) goto L34;
        if (r7 == r2) goto L32;
        r7 = r7 + 1;     // Catch: java.lang.Throwable -> L49
        r10 = r10 + 6.0f;     // Catch: java.lang.Throwable -> L49
        goto L29
    L32:
        return android.graphics.Color.rgb(0, 255, 255 - ((int) r10));
    L34:
        float r11 = 0.0f;
    L36:
        if (r11 >= 256.0f) goto L42;
        if (r7 == r2) goto L39;
        r7 = r7 + 1;     // Catch: java.lang.Throwable -> L49
        r11 = r11 + 6.0f;     // Catch: java.lang.Throwable -> L49
        goto L36
    L39:
        return android.graphics.Color.rgb((int) r11, 255, 0);
    L42:
        if (r4 >= 256.0f) goto L47;
        if (r7 == r2) goto L45;
        r7 = r7 + 1;
        r4 = r4 + 6.0f;
        goto L42
    L45:
        return android.graphics.Color.rgb(255, 255 - ((int) r4), 0);
    L47:
        return -65536;
    }

    @abcd.Interfacesu(method = -245868062184670864L)
    private void getCurrentXY() {
    L21:
        th = move-exception;
        if (DW == false) goto L26;
        abcd.wu.j6(th, -1519931797606927488L, this);
    L26:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1519931797606927488L, this);     // Catch: java.lang.Throwable -> L21
    L6:
        int r2 = 0;
        int r4 = 1000;
    L8:
        if (r2 >= 256) goto L20;
        int r6 = r4;
        int r5 = 0;
    L10:
        if (r5 >= 256) goto L19;
        int r7 = j6(DW(r2, r5), this.Zo | (-16777216));     // Catch: java.lang.Throwable -> L21
        if (r7 == 0) goto L13;
        if (r7 >= r6) goto L18;
        this.Hw = r2;     // Catch: java.lang.Throwable -> L21
        this.v5 = r5;     // Catch: java.lang.Throwable -> L21
        r6 = r7;
    L18:
        r5 = r5 + 1;
        goto L10
    L13:
        this.Hw = r2;     // Catch: java.lang.Throwable -> L21
        this.v5 = r5;     // Catch: java.lang.Throwable -> L21
        return;
    L19:
        r2 = r2 + 1;
        r4 = r6;
        goto L8
    }

    @abcd.Interfacesu(method = 4904389197109677825L)
    private int j6(int r8, int r9) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2750701116629467739L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L12:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2750701116629467739L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L8
    L5:
        return (java.lang.Math.abs(android.graphics.Color.red(r8) - android.graphics.Color.red(r9)) + java.lang.Math.abs(android.graphics.Color.green(r8) - android.graphics.Color.green(r9))) + java.lang.Math.abs(android.graphics.Color.blue(r8) - android.graphics.Color.blue(r9));
    }

    public static int j6(java.lang.String r9) {
    L24:
        th = move-exception;
        if (DW == false) goto L28;
        abcd.wu.j6(th, 933181037093525580L, null, r9);
    L28:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(933181037093525580L, null, r9);     // Catch: java.lang.Throwable -> L24
    L7:
        if (r9 == null) goto L15;
        if (r9.length() != 9) goto L15;
        if (r9.startsWith("#") == false) goto L15;
        return (int) java.lang.Long.parseLong(r9.substring(1), 16);
    L15:
        if (r9 != null) goto L17;
    L23:
        return -16777216;
    L17:
        if (r9.length() != 7) goto L23;
        if (r9.startsWith("#") == false) goto L23;
        return ((int) java.lang.Long.parseLong(r9.substring(1), 16)) | (-16777216);
    }

    public static java.lang.String j6(int r7) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -269416096820768480L, null, new java.lang.Integer(r7));
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-269416096820768480L, null, r7);     // Catch: java.lang.Throwable -> L11
    L7:
        if (android.graphics.Color.alpha(r7) != 255) goto L10;
        return java.lang.String.format("#%06X", new java.lang.Object[]{java.lang.Integer.valueOf(16777215 & r7)});
    L10:
        return java.lang.String.format("#%08X", new java.lang.Object[]{java.lang.Integer.valueOf(r7 & (-1))});
    }

    @abcd.Interfacesu(method = 950309177068202304L)
    private void j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 182006193237699600L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(182006193237699600L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        FH();     // Catch: java.lang.Throwable -> L8
        android.content.Context r2 = getContext();     // Catch: java.lang.Throwable -> L8
        float r3 = java.lang.Math.min(300.0f, com.aide.common.ClassG.DW(r2) - 150.0f);     // Catch: java.lang.Throwable -> L8
        this.we = r2.getResources().getDisplayMetrics().density * (r3 / 256.0f);     // Catch: java.lang.Throwable -> L8
        this.u7 = new android.graphics.Paint(1);     // Catch: java.lang.Throwable -> L8
        this.u7.setTextAlign(android.graphics.Paint.Align.CENTER);     // Catch: java.lang.Throwable -> L8
        this.u7.setTextSize(12.0f);     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = 321346213262569152L)
    protected void onDraw(android.graphics.Canvas r27) {
    L16:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -1024533184505486112L, this, r27);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1024533184505486112L, this, r27);     // Catch: java.lang.Throwable -> L16
    L6:
        int r0 = 255 - ((int) ((this.FH * 255.0f) / 360.0f));     // Catch: java.lang.Throwable -> L16
        int r12 = 0;
    L8:
        if (r12 >= 256) goto L10;
        this.u7.setStrokeWidth(this.we * 2.0f);     // Catch: java.lang.Throwable -> L16
        this.u7.setColor(this.tp[r12]);     // Catch: java.lang.Throwable -> L16
        float r2 = r12 + 10;     // Catch: java.lang.Throwable -> L16
        r27.drawLine(this.we * r2, 0.0f, this.we * r2, this.we * 40.0f, this.u7);     // Catch: java.lang.Throwable -> L16
        r12 = r12 + 1;     // Catch: java.lang.Throwable -> L16
        goto L8
    L10:
        this.u7.setStrokeWidth(this.we * 3.0f);     // Catch: java.lang.Throwable -> L16
        this.u7.setColor(-16777216);     // Catch: java.lang.Throwable -> L16
        float r1 = r0 + 10;     // Catch: java.lang.Throwable -> L16
        r27.drawLine(r1 * this.we, 0.0f, r1 * this.we, this.we * 40.0f, this.u7);     // Catch: java.lang.Throwable -> L16
        this.u7.setStyle(android.graphics.Paint.Style.STROKE);     // Catch: java.lang.Throwable -> L16
        this.u7.setColor(-16777216);     // Catch: java.lang.Throwable -> L16
        this.u7.setStrokeWidth(1.0f);     // Catch: java.lang.Throwable -> L16
        r27.drawRect(this.we * 9.5f, this.we * 0.0f, this.we * 266.5f, this.we * 40.0f, this.u7);     // Catch: java.lang.Throwable -> L16
        int r3 = 0;
    L12:
        if (r3 >= 256) goto L14;
        this.u7.setShader(new android.graphics.LinearGradient(0.0f, this.we * 50.0f, 0.0f, this.we * 306.0f, new int[]{this.EQ[r3], -16777216}, null, android.graphics.Shader.TileMode.REPEAT));     // Catch: java.lang.Throwable -> L16
        this.u7.setStrokeWidth(this.we * 2.0f);     // Catch: java.lang.Throwable -> L16
        float r4 = r3 + 10;     // Catch: java.lang.Throwable -> L16
        r27.drawLine(this.we * r4, this.we * 50.0f, r4 * this.we, this.we * 306.0f, this.u7);     // Catch: java.lang.Throwable -> L16
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L16
        goto L12
    L14:
        this.u7.setShader(null);     // Catch: java.lang.Throwable -> L16
        this.u7.setStyle(android.graphics.Paint.Style.STROKE);     // Catch: java.lang.Throwable -> L16
        this.u7.setColor(-16777216);     // Catch: java.lang.Throwable -> L16
        this.u7.setStrokeWidth(this.we * 2.0f);     // Catch: java.lang.Throwable -> L16
        r27.drawCircle((this.Hw + 10) * this.we, (this.v5 + 50) * this.we, this.we * 6.0f, this.u7);     // Catch: java.lang.Throwable -> L16
        this.u7.setStyle(android.graphics.Paint.Style.STROKE);     // Catch: java.lang.Throwable -> L16
        this.u7.setColor(-16777216);     // Catch: java.lang.Throwable -> L16
        this.u7.setStrokeWidth(1.0f);     // Catch: java.lang.Throwable -> L16
        r27.drawRect(this.we * 9.5f, this.we * 50.0f, this.we * 266.5f, this.we * 306.0f, this.u7);     // Catch: java.lang.Throwable -> L16
        this.u7.setStyle(android.graphics.Paint.Style.FILL);     // Catch: java.lang.Throwable -> L16
        this.u7.setColor(this.Zo | (-16777216));     // Catch: java.lang.Throwable -> L16
        r27.drawRect(this.we * 9.5f, this.we * 316.0f, this.we * 139.0f, this.we * 356.0f, this.u7);     // Catch: java.lang.Throwable -> L16
        this.u7.setStyle(android.graphics.Paint.Style.FILL);     // Catch: java.lang.Throwable -> L16
        this.u7.setColor(this.VH | (-16777216));     // Catch: java.lang.Throwable -> L16
        r27.drawRect(this.we * 138.0f, this.we * 316.0f, this.we * 266.5f, this.we * 356.0f, this.u7);     // Catch: java.lang.Throwable -> L16
        this.u7.setStyle(android.graphics.Paint.Style.STROKE);     // Catch: java.lang.Throwable -> L16
        this.u7.setColor(-16777216);     // Catch: java.lang.Throwable -> L16
        this.u7.setStrokeWidth(1.0f);     // Catch: java.lang.Throwable -> L16
        r27.drawRect(this.we * 9.5f, this.we * 316.0f, this.we * 266.5f, this.we * 356.0f, this.u7);     // Catch: java.lang.Throwable -> L16
    }

    @Override
    @abcd.Interfacesu(method = 2568471252928073283L)
    protected void onMeasure(int r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 1386759283159679919L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1386759283159679919L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        setMeasuredDimension((int) (this.we * 276.0f), (int) (this.we * 366.0f));     // Catch: java.lang.Throwable -> L7
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r8) {
    L28:
        th = move-exception;
        if (DW == false) goto L32;
        abcd.wu.j6(th, 1233504134750242656L, this, r8);
    L32:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(1233504134750242656L, this, r8);     // Catch: java.lang.Throwable -> L28
    L7:
        if (r8.getAction() != 0) goto L9;
    L11:
        float r2 = (r8.getX() / this.we) - 10.0f;     // Catch: java.lang.Throwable -> L28
        if (r2 >= 0.0f) goto L15;
        r2 = 0.0f;
    L15:
        if (r2 <= 255.0f) goto L17;
        r2 = 255.0f;
    L17:
        float r5 = r8.getY() / this.we;     // Catch: java.lang.Throwable -> L28
        if (r5 >= 40.0f) goto L20;
        this.FH = ((255.0f - r2) * 360.0f) / 255.0f;     // Catch: java.lang.Throwable -> L28
        DW();     // Catch: java.lang.Throwable -> L28
    L26:
        int r3 = DW(this.Hw, this.v5);     // Catch: java.lang.Throwable -> L28
        this.Zo = android.graphics.Color.argb(android.graphics.Color.alpha(this.Zo), android.graphics.Color.red(r3), android.graphics.Color.green(r3), android.graphics.Color.blue(r3));     // Catch: java.lang.Throwable -> L28
        this.gn.j6(this.Zo, j6(this.Zo));     // Catch: java.lang.Throwable -> L28
        invalidate();     // Catch: java.lang.Throwable -> L28
        return true;
    L20:
        this.Hw = (int) r2;     // Catch: java.lang.Throwable -> L28
        this.v5 = ((int) r5) - 50;     // Catch: java.lang.Throwable -> L28
        if (this.v5 >= 0) goto L24;
        this.v5 = 0;     // Catch: java.lang.Throwable -> L28
    L24:
        if (this.v5 <= 255) goto L26;
        this.v5 = 255;     // Catch: java.lang.Throwable -> L28
        goto L26
    L9:
        if (r8.getAction() == 2) goto L11;
        return true;
    }

    public void setCurrentColor(java.lang.String r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -5023155625215702120L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5023155625215702120L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Zo = j6(r6);     // Catch: java.lang.Throwable -> L8
        float[] r2 = new float[3];     // Catch: java.lang.Throwable -> L8
        android.graphics.Color.colorToHSV(this.Zo | (-16777216), r2);     // Catch: java.lang.Throwable -> L8
        this.FH = r2[0];     // Catch: java.lang.Throwable -> L8
        DW();     // Catch: java.lang.Throwable -> L8
        getCurrentXY();     // Catch: java.lang.Throwable -> L8
        invalidate();     // Catch: java.lang.Throwable -> L8
        this.gn.j6(this.Zo, j6(this.Zo));     // Catch: java.lang.Throwable -> L8
    }

    public void setInitialColor(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3609550889251125357L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3609550889251125357L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.VH = j6(r5);     // Catch: java.lang.Throwable -> L8
    }

    public void setOnColorChangedListener(com.aide.common.ColorPickerView.a r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1804155767827496160L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1804155767827496160L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.gn = r5;     // Catch: java.lang.Throwable -> L8
    }
}
