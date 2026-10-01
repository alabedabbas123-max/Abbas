package com.aide.ui.views;

@abcd.Interfacexu
public class SplitView extends android.view.ViewGroup {

    @abcd.Interfacetu
    private static boolean $ON_ENTER_TOGGLE;

    @abcd.Interfaceuu
    private static boolean $ON_THROW_TOGGLE;

    @abcd.Interfaceru(field = 305945481744851643L)
    private int animationPosition;

    @abcd.Interfaceru(field = -2220986906469670848L)
    private float dividerSpeed;

    @abcd.Interfaceru(field = 4376198832526380827L)
    private int dividerTouchSize;

    @abcd.Interfaceru(field = -2458900430770018197L)
    private int dragPosition;

    @abcd.Interfaceru(field = 6275994694731359941L)
    private float horizontalSplitRatio;

    @abcd.Interfaceru(field = -193356825386921805L)
    private boolean isDragging;

    @abcd.Interfaceru(field = 2965806935283339056L)
    private boolean isHorizontal;

    @abcd.Interfaceru(field = 1123020794462061216L)
    private boolean isSplit;

    @abcd.Interfaceru(field = -5477289533579244069L)
    private boolean isSwipeEnabled;

    @abcd.Interfaceru(field = 1306040584426626732L)
    private com.aide.ui.views.SplitView.a listener;

    @abcd.Interfaceru(field = -371747001152055781L)
    private float verticalSplitRatio;

    public interface a {
        void j6(boolean r1);
    }

    static {
        abcd.wu.j6(com.aide.ui.views.SplitView.class, 786228931312646151L, 786228931312646151L);
    }

    public SplitView(android.content.Context r6) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, -925898668235461107L, null, r6);
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-925898668235461107L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        super(r6);     // Catch: java.lang.Throwable -> L8
        this.horizontalSplitRatio = 0.33f;     // Catch: java.lang.Throwable -> L8
        this.verticalSplitRatio = 0.5f;     // Catch: java.lang.Throwable -> L8
        this.dividerTouchSize = 30;     // Catch: java.lang.Throwable -> L8
        this.dividerSpeed = 1.0f;     // Catch: java.lang.Throwable -> L8
        this.isSplit = false;     // Catch: java.lang.Throwable -> L8
        this.isHorizontal = false;     // Catch: java.lang.Throwable -> L8
        this.isSwipeEnabled = false;     // Catch: java.lang.Throwable -> L8
        this.isDragging = false;     // Catch: java.lang.Throwable -> L8
    }

    public SplitView(android.content.Context r8, android.util.AttributeSet r9) {
    L7:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L11;
        abcd.wu.j6(th, -163071011633314080L, null, r8, r9);
    L11:
        throw th;
    L3:
        if ($ON_ENTER_TOGGLE == false) goto L5;
        abcd.wu.j6(-163071011633314080L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        super(r8, r9);     // Catch: java.lang.Throwable -> L7
        this.horizontalSplitRatio = 0.33f;     // Catch: java.lang.Throwable -> L7
        this.verticalSplitRatio = 0.5f;     // Catch: java.lang.Throwable -> L7
        this.dividerTouchSize = 30;     // Catch: java.lang.Throwable -> L7
        this.dividerSpeed = 1.0f;     // Catch: java.lang.Throwable -> L7
        this.isSplit = false;     // Catch: java.lang.Throwable -> L7
        this.isHorizontal = false;     // Catch: java.lang.Throwable -> L7
        this.isSwipeEnabled = false;     // Catch: java.lang.Throwable -> L7
        this.isDragging = false;     // Catch: java.lang.Throwable -> L7
    }

    public SplitView(android.content.Context r9, android.util.AttributeSet r10, int r11) {
    L7:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L11;
        abcd.wu.j6(th, -873886956513167781L, null, r9, r10, new java.lang.Integer(r11));
    L11:
        throw th;
    L3:
        if ($ON_ENTER_TOGGLE == false) goto L5;
        abcd.wu.j6(-873886956513167781L, null, r9, r10, new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
    L5:
        super(r9, r10, r11);     // Catch: java.lang.Throwable -> L7
        this.horizontalSplitRatio = 0.33f;     // Catch: java.lang.Throwable -> L7
        this.verticalSplitRatio = 0.5f;     // Catch: java.lang.Throwable -> L7
        this.dividerTouchSize = 30;     // Catch: java.lang.Throwable -> L7
        this.dividerSpeed = 1.0f;     // Catch: java.lang.Throwable -> L7
        this.isSplit = false;     // Catch: java.lang.Throwable -> L7
        this.isHorizontal = false;     // Catch: java.lang.Throwable -> L7
        this.isSwipeEnabled = false;     // Catch: java.lang.Throwable -> L7
        this.isDragging = false;     // Catch: java.lang.Throwable -> L7
    }

    static int access$002(com.aide.ui.views.SplitView r0, int r1) {
        r0.animationPosition = r1;
        return r1;
    }

    static com.aide.ui.views.SplitView.a access$100(com.aide.ui.views.SplitView r0) {
        return r0.listener;
    }

    static boolean access$200(com.aide.ui.views.SplitView r0) {
        return r0.isSplit;
    }

    static boolean access$202(com.aide.ui.views.SplitView r0, boolean r1) {
        r0.isSplit = r1;
        return r1;
    }

    static void access$300(com.aide.ui.views.SplitView r0) {
        r0.updateChildVisibilities();
    }

    @abcd.Interfacesu(method = 987808508495265381L)
    private long getAnimationDuration(int r8, int r9) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 128590937060478525L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L12:
        throw th;
    L3:
        if ($ON_ENTER_TOGGLE == false) goto L5;
        abcd.wu.j6(128590937060478525L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L8
    L5:
        return (long) ((java.lang.Math.abs(r8 - r9) / getResources().getDisplayMetrics().density) / this.dividerSpeed);
    }

    @abcd.Interfacesu(method = -140033884680318960L)
    private int getCurrentDividerPosition(int r8, int r9) {
    L15:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L19;
        abcd.wu.j6(th, -2808768746050506200L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L19:
        throw th;
    L3:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-2808768746050506200L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L15
    L6:
        if (this.isDragging == false) goto L10;
        return getDragPosition();
    L10:
        if (this.animationPosition >= 0) goto L14;
        return getDividerPosition(r8, r9);
    L14:
        return this.animationPosition;
    }

    @abcd.Interfacesu(method = 4219343850436738947L)
    private int getDividerPosition() {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 6295251823001664303L, this);
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(6295251823001664303L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return getDividerPosition(getWidth(), getHeight());
    }

    @abcd.Interfacesu(method = 284855949205714341L)
    private int getDividerPosition(int r8, int r9) {
    L12:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L16;
        abcd.wu.j6(th, -75201145323663275L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L16:
        throw th;
    L3:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-75201145323663275L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L12
    L6:
        if (this.isHorizontal == false) goto L11;
        return (int) (this.horizontalSplitRatio * r8);
    L11:
        return (int) (this.verticalSplitRatio * r9);
    }

    @abcd.Interfacesu(method = 4185842995686126528L)
    private int getDragDistance() {
    L12:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L16;
        abcd.wu.j6(th, -2558393295404739768L, this);
    L16:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L7;
        abcd.wu.j6(-2558393295404739768L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (this.isSplit == false) goto L11;
        return getDividerPosition() - getDragPosition();
    L11:
        return getDragPosition();
    }

    @abcd.Interfacesu(method = -4388231017573430796L)
    private int getDragPosition() {
    L16:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L20;
        abcd.wu.j6(th, 894821514458755392L, this);
    L20:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L7;
        abcd.wu.j6(894821514458755392L, this);     // Catch: java.lang.Throwable -> L16
    L7:
        if (this.isDragging == false) goto L11;
        return java.lang.Math.min(this.dragPosition, getDividerPosition());
    L11:
        if (this.isSplit == true) goto L22;
        return 0;
    L22:
        return getDividerPosition();
    }

    @abcd.Interfacesu(method = -320713910353111059L)
    private java.lang.Boolean getDragStartOrientation(android.view.MotionEvent r10) {
    L72:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L76;
        abcd.wu.j6(th, 185548597573864433L, this, r10);
    L76:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L7;
        abcd.wu.j6(185548597573864433L, this, r10);     // Catch: java.lang.Throwable -> L72
    L7:
        if (this.isSwipeEnabled == false) goto L21;
        if (this.isSplit == true) goto L21;
        if (r10.getAction() != 0) goto L21;
        if (r10.getPointerCount() != 1) goto L21;
        if (r10.getX() >= (this.dividerTouchSize * getResources().getDisplayMetrics().density)) goto L21;
        if (splitHorizontalByDefault() == false) goto L21;
        return true;
    L21:
        if (this.isSwipeEnabled == false) goto L39;
        if (this.isSplit == false) goto L39;
        if (this.isHorizontal == false) goto L39;
        if (r10.getAction() != 0) goto L39;
        if (r10.getPointerCount() != 1) goto L39;
        if (r10.getY() <= (getResources().getDisplayMetrics().density * 50.0f)) goto L39;
        if (r10.getY() >= (getHeight() - (getResources().getDisplayMetrics().density * 50.0f))) goto L39;
        if (java.lang.Math.abs(r10.getX() - (getWidth() * this.horizontalSplitRatio)) >= (this.dividerTouchSize * getResources().getDisplayMetrics().density)) goto L39;
        return true;
    L39:
        if (this.isSwipeEnabled == false) goto L53;
        if (this.isSplit == true) goto L53;
        if (r10.getAction() != 0) goto L53;
        if (r10.getPointerCount() != 1) goto L53;
        if (r10.getY() <= (getHeight() - (this.dividerTouchSize * getResources().getDisplayMetrics().density))) goto L53;
        if (getHeight() <= (getResources().getDisplayMetrics().density * 150.0f)) goto L53;
        return false;
    L53:
        if (this.isSwipeEnabled == true) goto L55;
        return null;
    L55:
        if (this.isSplit == true) goto L57;
        return null;
    L57:
        if (this.isHorizontal == false) goto L59;
        return null;
    L59:
        if (r10.getAction() == 0) goto L61;
        return null;
    L61:
        if (r10.getPointerCount() == 1) goto L63;
        return null;
    L63:
        if (r10.getX() < (getWidth() - (getResources().getDisplayMetrics().density * 50.0f))) goto L65;
        return null;
    L65:
        if (r10.getX() > (getResources().getDisplayMetrics().density * 50.0f)) goto L67;
        return null;
    L67:
        if (java.lang.Math.abs(r10.getY() - (getHeight() * this.verticalSplitRatio)) < (this.dividerTouchSize * getResources().getDisplayMetrics().density)) goto L69;
        return null;
    L69:
        return false;
    }

    @abcd.Interfacesu(method = 2712575223900577881L)
    private boolean isVertical() {
    L9:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L13;
        abcd.wu.j6(th, -2334371885580039855L, this);
    L13:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-2334371885580039855L, this);     // Catch: java.lang.Throwable -> L9
    L6:
        return !isHorizontal();
    }

    @abcd.Interfacesu(method = 20996127316406067L)
    private void setOrientation(boolean r8, boolean r9) {
    L15:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L19;
        abcd.wu.j6(th, -1108527125298237265L, this, new java.lang.Boolean(r8), new java.lang.Boolean(r9));
    L19:
        throw th;
    L3:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-1108527125298237265L, this, new java.lang.Boolean(r8), new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L15
    L6:
        if (this.isHorizontal == r8) goto L21;
        if (r9 == true) goto L9;
    L11:
        this.isHorizontal = r8;     // Catch: java.lang.Throwable -> L15
        requestLayout();     // Catch: java.lang.Throwable -> L15
        if (this.listener == null) goto L23;
        this.listener.j6(this.isSplit);     // Catch: java.lang.Throwable -> L15
        return;
    L23:
        return;
    L9:
        if (this.isSplit == false) goto L11;
        closeSplit(true, new com.aide.ui.views.t(this, r8));     // Catch: java.lang.Throwable -> L15
        return;
    }

    @abcd.Interfacesu(method = 59528643349521097L)
    private void startDragging(android.view.MotionEvent r8, boolean r9) {
    L7:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L11;
        abcd.wu.j6(th, -2940602194762988511L, this, r8, new java.lang.Boolean(r9));
    L11:
        throw th;
    L3:
        if ($ON_ENTER_TOGGLE == false) goto L5;
        abcd.wu.j6(-2940602194762988511L, this, r8, new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        this.isHorizontal = r9;     // Catch: java.lang.Throwable -> L7
        this.isDragging = true;     // Catch: java.lang.Throwable -> L7
        updateDragging(r8);     // Catch: java.lang.Throwable -> L7
        updateChildVisibilities();     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = 62443640925067936L)
    private void stopDragging(android.view.MotionEvent r6) {
    L15:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L19;
        abcd.wu.j6(th, 2117892044483915360L, this, r6);
    L19:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L7;
        abcd.wu.j6(2117892044483915360L, this, r6);     // Catch: java.lang.Throwable -> L15
    L7:
        if (getDragDistance() <= ((this.dividerTouchSize * 2) * getResources().getDisplayMetrics().density)) goto L9;
        boolean r2 = true;
    L11:
        if (this.isSplit != r2) goto L13;
        closeSplit(true);     // Catch: java.lang.Throwable -> L15
        return;
    L13:
        openSplit(true);     // Catch: java.lang.Throwable -> L15
        return;
    L9:
        r2 = false;
        goto L11
    }

    @abcd.Interfacesu(method = 683790646653810332L)
    private void updateChildVisibilities() {
    L20:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L24;
        abcd.wu.j6(th, -2097690489952031744L, this);
    L24:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-2097690489952031744L, this);     // Catch: java.lang.Throwable -> L20
    L6:
        android.view.View r2 = getBottomView();     // Catch: java.lang.Throwable -> L20
        int r4 = 8;
        if (this.isSplit == false) goto L9;
    L12:
        int r3 = 0;
    L13:
        r2.setVisibility(r3);     // Catch: java.lang.Throwable -> L20
        android.view.View r5 = getSeparatorView();     // Catch: java.lang.Throwable -> L20
        if (this.isSplit == false) goto L16;
    L17:
        r4 = 0;
    L18:
        r5.setVisibility(r4);     // Catch: java.lang.Throwable -> L20
        return;
    L16:
        if (this.isDragging == false) goto L18;
    L9:
        if (this.isDragging == true) goto L12;
        r3 = 8;
        goto L13
    }

    @abcd.Interfacesu(method = 3333066494597236835L)
    private void updateDragging(android.view.MotionEvent r5) {
    L13:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L18;
        abcd.wu.j6(th, -2804852302916838417L, this, r5);
    L18:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L7;
        abcd.wu.j6(-2804852302916838417L, this, r5);     // Catch: java.lang.Throwable -> L13
    L7:
        if (this.isHorizontal == false) goto L10;
        float r2 = r5.getX();     // Catch: java.lang.Throwable -> L13
    L11:
        this.dragPosition = (int) r2;     // Catch: java.lang.Throwable -> L13
        requestLayout();     // Catch: java.lang.Throwable -> L13
        return;
    L10:
        r2 = getHeight() - r5.getY();     // Catch: java.lang.Throwable -> L13
        goto L11
    }

    public void closeSplit(boolean r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 968042982553192624L, this, new java.lang.Boolean(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(968042982553192624L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        closeSplit(r5, null);     // Catch: java.lang.Throwable -> L8
    }

    public void closeSplit(boolean r8, java.lang.Runnable r9) {
        com.almlkaide.kaypro.aide.MainListener.onSplitViewCloseSplit(this, r8, r9);
    }

    public void closeSplit_SOURCE(boolean r8, java.lang.Runnable r9) {
    L19:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L23;
        abcd.wu.j6(th, 2445538997323889139L, this, new java.lang.Boolean(r8), r9);
    L23:
        throw th;
    L3:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(2445538997323889139L, this, new java.lang.Boolean(r8), r9);     // Catch: java.lang.Throwable -> L19
    L6:
        if (r8 == false) goto L13;
        if (this.isSplit == false) goto L10;
    L11:
        android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofInt(this, "animationPosition", new int[]{getDragPosition(), 0});     // Catch: java.lang.Throwable -> L19
        r1.setDuration(getAnimationDuration(getDragPosition(), 0));     // Catch: java.lang.Throwable -> L19
        r1.start();     // Catch: java.lang.Throwable -> L19
        r1.addListener(new com.aide.ui.views.s(this, r9));     // Catch: java.lang.Throwable -> L19
    L17:
        this.isDragging = false;     // Catch: java.lang.Throwable -> L19
        return;
    L10:
        if (this.isDragging == false) goto L17;
    L13:
        if (this.isSplit == false) goto L17;
        this.isSplit = false;     // Catch: java.lang.Throwable -> L19
        updateChildVisibilities();     // Catch: java.lang.Throwable -> L19
        if (this.listener == null) goto L17;
        this.listener.j6(this.isSplit);     // Catch: java.lang.Throwable -> L19
        goto L17
    }

    public android.view.View getBottomView() {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 3029476977813278245L, this);
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(3029476977813278245L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return getChildAt(2);
    }

    public android.view.View getSeparatorView() {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, -5047942160362723881L, this);
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-5047942160362723881L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return getChildAt(1);
    }

    public android.view.View getTopView() {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 3608116232558045L, this);
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(3608116232558045L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return getChildAt(0);
    }

    public boolean isHorizontal() {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 2587155244619108495L, this);
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(2587155244619108495L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.isHorizontal;
    }

    public boolean isSplit() {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 2883988019731561075L, this);
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(2883988019731561075L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.isSplit;
    }

    @Override
    @abcd.Interfacesu(method = 1942620603747824000L)
    protected void onFinishInflate() {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, -4557718513056722196L, this);
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-4557718513056722196L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super.onFinishInflate();     // Catch: java.lang.Throwable -> L8
        updateChildVisibilities();     // Catch: java.lang.Throwable -> L8
        this.isHorizontal = splitHorizontalByDefault();     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
    L12:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L16;
        abcd.wu.j6(th, 649268344929859375L, this, r5);
    L16:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L7;
        abcd.wu.j6(649268344929859375L, this, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if (getDragStartOrientation(r5) == null) goto L10;
        return true;
    L10:
        return super.onInterceptTouchEvent(r5);
    }

    @Override
    @abcd.Interfacesu(method = -21662492513362371L)
    protected void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
    L13:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L17;
        abcd.wu.j6(th, 5593874413716271585L, this, new java.lang.Boolean(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
    L17:
        throw th;
    L3:
        if ($ON_ENTER_TOGGLE == false) goto L5;
        abcd.wu.j6(5593874413716271585L, this, new java.lang.Boolean(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));     // Catch: java.lang.Throwable -> L13
    L5:
        android.view.View r0 = getTopView();     // Catch: java.lang.Throwable -> L13
        android.view.View r1 = getBottomView();     // Catch: java.lang.Throwable -> L13
        android.view.View r2 = getSeparatorView();     // Catch: java.lang.Throwable -> L13
        int r3 = r14 - r12;     // Catch: java.lang.Throwable -> L13
        int r4 = r15 - r13;     // Catch: java.lang.Throwable -> L13
        if (r1.getVisibility() != 8) goto L8;
        r0.layout(0, 0, r3, r4);     // Catch: java.lang.Throwable -> L13
        return;
    L8:
        if (this.isHorizontal == false) goto L10;
        int r5 = r1.getMeasuredWidth();     // Catch: java.lang.Throwable -> L13
        int r6 = r2.getMeasuredWidth() + r5;     // Catch: java.lang.Throwable -> L13
        r0.layout(r6, 0, r3, r4);     // Catch: java.lang.Throwable -> L13
        r2.layout(r5, 0, r6, r4);     // Catch: java.lang.Throwable -> L13
        r1.layout(0, 0, r5, r4);     // Catch: java.lang.Throwable -> L13
        return;
    L10:
        int r7 = r0.getMeasuredHeight();     // Catch: java.lang.Throwable -> L13
        int r8 = r2.getMeasuredHeight();     // Catch: java.lang.Throwable -> L13
        r0.layout(0, 0, r3, r7);     // Catch: java.lang.Throwable -> L13
        int r9 = r8 + r7;     // Catch: java.lang.Throwable -> L13
        r2.layout(0, r7, r3, r9);     // Catch: java.lang.Throwable -> L13
        r1.layout(0, r9, r3, r4);     // Catch: java.lang.Throwable -> L13
    }

    @Override
    @abcd.Interfacesu(method = -186701376388399184L)
    protected void onMeasure(int r9, int r10) {
    L14:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L18;
        abcd.wu.j6(th, -671097678420622040L, this, new java.lang.Integer(r9), new java.lang.Integer(r10));
    L18:
        throw th;
    L3:
        if ($ON_ENTER_TOGGLE == false) goto L5;
        abcd.wu.j6(-671097678420622040L, this, new java.lang.Integer(r9), new java.lang.Integer(r10));     // Catch: java.lang.Throwable -> L14
    L5:
        android.view.View r0 = getTopView();     // Catch: java.lang.Throwable -> L14
        android.view.View r1 = getBottomView();     // Catch: java.lang.Throwable -> L14
        android.view.View r2 = getSeparatorView();     // Catch: java.lang.Throwable -> L14
        android.view.View.MeasureSpec.getMode(r10);     // Catch: java.lang.Throwable -> L14
        int r3 = android.view.View.MeasureSpec.getSize(r10);     // Catch: java.lang.Throwable -> L14
        android.view.View.MeasureSpec.getMode(r9);     // Catch: java.lang.Throwable -> L14
        int r4 = android.view.View.MeasureSpec.getSize(r9);     // Catch: java.lang.Throwable -> L14
        if (r1.getVisibility() != 8) goto L8;
        r0.measure(r9, r10);     // Catch: java.lang.Throwable -> L14
    L12:
        setMeasuredDimension(r4, r3);     // Catch: java.lang.Throwable -> L14
        return;
    L8:
        if (this.isHorizontal == false) goto L10;
        r1.measure(android.view.View.MeasureSpec.makeMeasureSpec(getCurrentDividerPosition(r4, r3), 1073741824), r10);     // Catch: java.lang.Throwable -> L14
        r0.measure(android.view.View.MeasureSpec.makeMeasureSpec(r4 - r1.getMeasuredWidth(), 1073741824), r10);     // Catch: java.lang.Throwable -> L14
        r2.measure(-2, r10);     // Catch: java.lang.Throwable -> L14
        goto L12
    L10:
        r1.measure(r9, android.view.View.MeasureSpec.makeMeasureSpec(getCurrentDividerPosition(r4, r3), 1073741824));     // Catch: java.lang.Throwable -> L14
        r0.measure(r9, android.view.View.MeasureSpec.makeMeasureSpec(r3 - r1.getMeasuredHeight(), 1073741824));     // Catch: java.lang.Throwable -> L14
        r2.measure(r9, -2);     // Catch: java.lang.Throwable -> L14
        goto L12
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r6) {
    L23:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L27;
        abcd.wu.j6(th, -840158422541240879L, this, r6);
    L27:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-840158422541240879L, this, r6);     // Catch: java.lang.Throwable -> L23
    L6:
        java.lang.Boolean r2 = getDragStartOrientation(r6);     // Catch: java.lang.Throwable -> L23
        if (r2 == null) goto L11;
        startDragging(r6, r2.booleanValue());     // Catch: java.lang.Throwable -> L23
        return true;
    L11:
        if (this.isDragging == false) goto L22;
        if (r6.getAction() != 2) goto L16;
        updateDragging(r6);     // Catch: java.lang.Throwable -> L23
    L16:
        if (r6.getAction() != 3) goto L18;
    L19:
        stopDragging(r6);     // Catch: java.lang.Throwable -> L23
    L20:
        return true;
    L18:
        if (r6.getAction() != 1) goto L20;
    L22:
        return super.onTouchEvent(r6);
    }

    public void openSplit(boolean r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 358859342192411260L, this, new java.lang.Boolean(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(358859342192411260L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        openSplit(this.isHorizontal, r5);     // Catch: java.lang.Throwable -> L8
    }

    public void openSplit(boolean r8, boolean r9) {
        com.almlkaide.kaypro.aide.MainListener.onSplitViewOpenSplit(this, r8, r9);
    }

    public void openSplit_SOURCE(boolean r8, boolean r9) {
    L19:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L23;
        abcd.wu.j6(th, 210353214876976479L, this, new java.lang.Boolean(r8), new java.lang.Boolean(r9));
    L23:
        throw th;
    L3:
        if ($ON_ENTER_TOGGLE == false) goto L5;
        abcd.wu.j6(210353214876976479L, this, new java.lang.Boolean(r8), new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L19
    L5:
        this.isHorizontal = r8;     // Catch: java.lang.Throwable -> L19
        if (r9 == false) goto L13;
        if (this.isSplit == true) goto L10;
    L11:
        android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofInt(this, "animationPosition", new int[]{getDragPosition(), getDividerPosition()});     // Catch: java.lang.Throwable -> L19
        r2.setDuration(getAnimationDuration(getDragPosition(), getDividerPosition()));     // Catch: java.lang.Throwable -> L19
        r2.start();     // Catch: java.lang.Throwable -> L19
        r2.addListener(new com.aide.ui.views.r(this));     // Catch: java.lang.Throwable -> L19
        this.isSplit = true;     // Catch: java.lang.Throwable -> L19
        updateChildVisibilities();     // Catch: java.lang.Throwable -> L19
    L17:
        this.isDragging = false;     // Catch: java.lang.Throwable -> L19
        return;
    L10:
        if (this.isDragging == false) goto L17;
    L13:
        if (this.isSplit == true) goto L17;
        this.isSplit = true;     // Catch: java.lang.Throwable -> L19
        this.animationPosition = -1;     // Catch: java.lang.Throwable -> L19
        updateChildVisibilities();     // Catch: java.lang.Throwable -> L19
        if (this.listener == null) goto L17;
        this.listener.j6(this.isSplit);     // Catch: java.lang.Throwable -> L19
        goto L17
    }

    public void setAnimationPosition(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 2570423811308575491L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(2570423811308575491L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.animationPosition = r5;     // Catch: java.lang.Throwable -> L8
        requestLayout();     // Catch: java.lang.Throwable -> L8
    }

    public void setOnSplitChangeListener(com.aide.ui.views.SplitView.a r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 917475200364158936L, this, r5);
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(917475200364158936L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.listener = r5;     // Catch: java.lang.Throwable -> L8
    }

    public void setSwipeEnabled(boolean r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 2189167081104311109L, this, new java.lang.Boolean(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(2189167081104311109L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.isSwipeEnabled = r5;     // Catch: java.lang.Throwable -> L8
    }

    public boolean splitHorizontalByDefault() {
    L12:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L16;
        abcd.wu.j6(th, 38948533111501629L, this);
    L16:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(38948533111501629L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        if (com.aide.common.ClassG.Hw(getContext()) < 650.0f) goto L10;
        return true;
    L10:
        return false;
    }

    public void toggleSplit(java.lang.Runnable r5) {
    L18:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L22;
        abcd.wu.j6(th, 1919999326490340728L, this, r5);
    L22:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L7;
        abcd.wu.j6(1919999326490340728L, this, r5);     // Catch: java.lang.Throwable -> L18
    L7:
        if (isSplit() == false) goto L12;
        if (isVertical() == false) goto L12;
        closeSplit(true, r5);     // Catch: java.lang.Throwable -> L18
        return;
    L12:
        if (isSplit() == true) goto L14;
    L16:
        openSplit(splitHorizontalByDefault(), true);     // Catch: java.lang.Throwable -> L18
        return;
    L14:
        if (isHorizontal() == false) goto L16;
        setOrientation(false, true);     // Catch: java.lang.Throwable -> L18
    }
}
