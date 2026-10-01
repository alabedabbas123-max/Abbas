package com.aide.ui.views;

@abcd.Interfacexu
public class CodeEditTextScrollView extends android.widget.ScrollView {

    @abcd.Interfacetu
    private static boolean DW;

    @abcd.Interfaceuu
    private static boolean FH;
    public static boolean j6;

    @abcd.Interfaceru(field = -1126536632939413728L)
    private float EQ;

    @abcd.Interfaceru(field = -2237586397871407791L)
    private boolean Hw;

    @abcd.Interfaceru(field = -4236543069862320656L)
    private com.aide.ui.views.CodeEditTextScrollView.DragHandle J0;

    @abcd.Interfaceru(field = -1630565038289436457L)
    private com.aide.ui.views.CodeEditTextScrollView.DragHandle J8;

    @abcd.Interfaceru(field = 5535668685108142240L)
    private com.aide.ui.views.CodeEditTextScrollView.a QX;

    @abcd.Interfaceru(field = 3154771397394112923L)
    private float VH;

    @abcd.Interfaceru(field = -953685225542512053L)
    private com.aide.ui.views.CodeEditTextScrollView.a Ws;

    @abcd.Interfaceru(field = -1750841457646237513L)
    private com.aide.ui.views.CodeEditTextScrollView.DragHandle[] XL;

    @abcd.Interfaceru(field = 3154677899818843200L)
    private float Zo;

    @abcd.Interfaceru(field = -3757216875785635533L)
    private boolean aM;

    @abcd.Interfaceru(field = 3983969523138123831L)
    private int gn;

    @abcd.Interfaceru(field = 719917415336857836L)
    private boolean j3;

    @abcd.Interfaceru(field = -1126505556916908987L)
    private float tp;

    @abcd.Interfaceru(field = 3984049447158979440L)
    private int u7;

    @abcd.Interfaceru(field = -3337821642213720061L)
    private float v5;

    @abcd.Interfaceru(field = -2491203527808381405L)
    private com.aide.ui.views.CodeEditTextScrollView.DragHandle we;

    @abcd.Interfacexu
    private abstract class DragHandle {

        @abcd.Interfacetu
        private static boolean $ON_ENTER_TOGGLE;

        @abcd.Interfaceuu
        private static boolean $ON_THROW_TOGGLE;

        @abcd.Interfaceru(field = -1359861947056505312L)
        private float bounce;

        @abcd.Interfaceru(field = 3439669473124681105L)
        private float charCenterX;

        @abcd.Interfaceru(field = 3439767233408710680L)
        private float charCenterY;

        @abcd.Interfaceru(field = 1606233866677245932L)
        private int dragDX;

        @abcd.Interfaceru(field = 1606299477946544279L)
        private int dragDY;

        @abcd.Interfaceru(field = 2551482584256951660L)
        private boolean dragIsActive;

        @abcd.Interfaceru(field = 3332585760043012893L)
        private int handleCenterX;

        @abcd.Interfaceru(field = 3332668588817875880L)
        private int handleCenterY;

        @abcd.Interfaceru(field = 2152081609858569627L)
        private int handleHeight;

        @abcd.Interfaceru(field = 2030899840882696832L)
        private int handleWidth;

        @abcd.Interfaceru(field = -2328584050361021211L)
        private android.graphics.drawable.Drawable icon;

        @abcd.Interfaceru(field = -3356544977261619053L)
        private android.graphics.drawable.Drawable iconDown;

        @abcd.Interfaceru(field = 1843574799343933744L)
        private boolean isDown;

        @abcd.Interfaceru(field = 4057134898442878032L)
        private boolean isVisible;

        @abcd.Interfaceru(field = 2864909569159359645L)
        private java.util.Timer removeTimer;

        @abcd.Interfaceru(field = -6467797550874201540L)
        private java.util.TimerTask removeTimerTask;

        @abcd.Interfacevu
        final com.aide.ui.views.CodeEditTextScrollView this$0;

        @abcd.Interfaceru(field = -503560129396832795L)
        private long timeout;

        static {
            abcd.wu.j6(com.aide.ui.views.CodeEditTextScrollView.DragHandle.class, -40137164092015200L, -40137164092015200L);
        }

        @abcd.Interfacesu(method = 787525749766714497L)
        public DragHandle(com.aide.ui.views.CodeEditTextScrollView r7, android.graphics.drawable.Drawable r8, android.graphics.drawable.Drawable r9, float r10, float r11, float r12, float r13, long r14) {
            if ($ON_ENTER_TOGGLE == false) goto L5;
            abcd.wu.j6(3171151906848048956L, null, new java.lang.Object[]{r7, r8, r9, new java.lang.Float(r10), new java.lang.Float(r11), new java.lang.Float(r12), new java.lang.Float(r13), new java.lang.Long(r14)});
        L5:
            this.this$0 = r7;
            this.timeout = r14;
            this.removeTimer = new java.util.Timer();
            this.icon = r8;
            this.iconDown = r9;
            this.handleHeight = r8.getIntrinsicHeight();
            this.handleWidth = r8.getIntrinsicWidth();
            this.handleCenterX = (int) (this.handleWidth * r10);
            this.handleCenterY = (int) (this.handleHeight * r11);
            this.charCenterY = r13;
            this.charCenterX = r12;
        }

        static boolean access$702(com.aide.ui.views.CodeEditTextScrollView.DragHandle r0, boolean r1) {
            r0.dragIsActive = r1;
            return r1;
        }

        static boolean access$802(com.aide.ui.views.CodeEditTextScrollView.DragHandle r0, boolean r1) {
            r0.isVisible = r1;
            return r1;
        }

        @abcd.Interfacesu(method = 5088518968115297395L)
        private android.graphics.Rect getHandleRect(int r8, int r9) {
        L7:
            th = move-exception;
            if ($ON_THROW_TOGGLE == false) goto L11;
            abcd.wu.j6(th, -1184894233243669440L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
        L11:
            throw th;
        L3:
            if ($ON_ENTER_TOGGLE == false) goto L5;
            abcd.wu.j6(-1184894233243669440L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
        L5:
            int r0 = (int) com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0).getFontHeight();     // Catch: java.lang.Throwable -> L7
            int r3 = r9 + r0;     // Catch: java.lang.Throwable -> L7
            float r1 = r0;
            return new android.graphics.Rect(r8 - this.handleCenterX, (int) ((r3 - this.handleCenterY) - (this.charCenterY * r1)), (r8 - this.handleCenterX) + this.handleWidth, (int) (((r3 + this.handleHeight) - this.handleCenterY) - (this.charCenterY * r1)));
        }

        @abcd.Interfacesu(method = -6487434163742256960L)
        private android.graphics.Rect getHandleRectInWindow() {
        L8:
            th = move-exception;
            if ($ON_THROW_TOGGLE == false) goto L12;
            abcd.wu.j6(th, 4822620750613890107L, this);
        L12:
            throw th;
        L4:
            if ($ON_ENTER_TOGGLE == false) goto L6;
            abcd.wu.j6(4822620750613890107L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            com.aide.ui.views.CodeEditText.c r2 = com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0);     // Catch: java.lang.Throwable -> L8
            int r3 = r2.DW(getLine());     // Catch: java.lang.Throwable -> L8
            int r4 = getColumn();     // Catch: java.lang.Throwable -> L8
            return getHandleRect((int) (r2.j6(r4, r3) - com.aide.ui.views.CodeEditTextScrollView.DW(this.this$0).getScrollX()), (int) (r2.FH(r3) + com.aide.ui.views.CodeEditTextScrollView.v5(this.this$0)));
        }

        @abcd.Interfacesu(method = -278043912086731284L)
        private int getScrollPaddingBottom() {
        L12:
            th = move-exception;
            if ($ON_THROW_TOGGLE == false) goto L16;
            abcd.wu.j6(th, 6852079172345263541L, this);
        L16:
            throw th;
        L4:
            if ($ON_ENTER_TOGGLE == false) goto L6;
            abcd.wu.j6(6852079172345263541L, this);     // Catch: java.lang.Throwable -> L12
        L6:
            int r2 = (int) (this.handleHeight / com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0).getFontHeight());     // Catch: java.lang.Throwable -> L12
            if (r2 <= (com.aide.ui.views.CodeEditTextScrollView.DW(this.this$0, true) - 4)) goto L11;
            r2 = com.aide.ui.views.CodeEditTextScrollView.DW(this.this$0, true) - 4;
        L11:
            return r2 + 2;
        }

        @abcd.Interfacesu(method = -1726108080422185305L)
        private void scheduleRemoveCaretHandle() {
        L14:
            th = move-exception;
            if ($ON_THROW_TOGGLE == false) goto L18;
            abcd.wu.j6(th, 131819675948830044L, this);
        L18:
            throw th;
        L4:
            if ($ON_ENTER_TOGGLE == false) goto L7;
            abcd.wu.j6(131819675948830044L, this);     // Catch: java.lang.Throwable -> L14
        L7:
            if (this.removeTimer != null) goto L10;
            return;
        L10:
            if (this.removeTimerTask == null) goto L12;
            this.removeTimerTask.cancel();     // Catch: java.lang.Throwable -> L14
        L12:
            this.removeTimerTask = new com.aide.ui.views.n(this);     // Catch: java.lang.Throwable -> L14
            this.removeTimer.schedule(this.removeTimerTask, this.timeout);     // Catch: java.lang.Throwable -> L14
        }

        @abcd.Interfacesu(method = -5132376812465951040L)
        public void draw(android.graphics.Canvas r6) {
        L14:
            th = move-exception;
            if ($ON_THROW_TOGGLE == false) goto L18;
            abcd.wu.j6(th, 5989445094908789415L, this, r6);
        L18:
            throw th;
        L4:
            if ($ON_ENTER_TOGGLE == false) goto L7;
            abcd.wu.j6(5989445094908789415L, this, r6);     // Catch: java.lang.Throwable -> L14
        L7:
            if (this.isVisible == true) goto L9;
            return;
        L9:
            android.graphics.Rect r2 = getHandleRectInWindow();     // Catch: java.lang.Throwable -> L14
            r2.left = (int) (r2.left + this.bounce);     // Catch: java.lang.Throwable -> L14
            r2.right = (int) (r2.right + this.bounce);     // Catch: java.lang.Throwable -> L14
            if (this.isDown == false) goto L12;
            this.iconDown.setBounds(r2);     // Catch: java.lang.Throwable -> L14
            this.iconDown.draw(r6);     // Catch: java.lang.Throwable -> L14
            return;
        L12:
            this.icon.setBounds(r2);     // Catch: java.lang.Throwable -> L14
            this.icon.draw(r6);     // Catch: java.lang.Throwable -> L14
        }

        protected abstract int getColumn();

        protected abstract int getLine();

        @abcd.Interfacesu(method = -2046274687000955763L)
        public void hide() {
        L13:
            th = move-exception;
            if ($ON_THROW_TOGGLE == false) goto L17;
            abcd.wu.j6(th, -1234924723072473348L, this);
        L17:
            throw th;
        L4:
            if ($ON_ENTER_TOGGLE == false) goto L7;
            abcd.wu.j6(-1234924723072473348L, this);     // Catch: java.lang.Throwable -> L13
        L7:
            if (this.isVisible == true) goto L9;
            return;
        L9:
            this.isVisible = false;     // Catch: java.lang.Throwable -> L13
            this.this$0.invalidate();     // Catch: java.lang.Throwable -> L13
            if (this.removeTimerTask == null) goto L20;
            this.removeTimerTask.cancel();     // Catch: java.lang.Throwable -> L13
            return;
        }

        @abcd.Interfacesu(method = 1843100419863894924L)
        public boolean isTouchEventInsideHandle(android.view.MotionEvent r10) {
        L11:
            th = move-exception;
            if ($ON_THROW_TOGGLE == false) goto L15;
            abcd.wu.j6(th, 576529275846256101L, this, r10);
        L15:
            throw th;
        L4:
            if ($ON_ENTER_TOGGLE == false) goto L7;
            abcd.wu.j6(576529275846256101L, this, r10);     // Catch: java.lang.Throwable -> L11
        L7:
            if (this.isVisible == true) goto L9;
            return false;
        L9:
            int r2 = (int) r10.getX(0);     // Catch: java.lang.Throwable -> L11
            int r3 = (int) r10.getY(0);     // Catch: java.lang.Throwable -> L11
            com.aide.ui.views.CodeEditText.c r4 = com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0);     // Catch: java.lang.Throwable -> L11
            int r5 = r4.DW(getLine());     // Catch: java.lang.Throwable -> L11
            int r6 = getColumn();     // Catch: java.lang.Throwable -> L11
            return getHandleRect((int) (r4.j6(r6, r5) - com.aide.ui.views.CodeEditTextScrollView.DW(this.this$0).getScrollX()), (int) (r4.FH(r5) - com.aide.ui.views.CodeEditTextScrollView.Hw(this.this$0))).contains(r2, r3);
        }

        @abcd.Interfacesu(method = 344269935127805851L)
        public boolean isVisible() {
        L8:
            th = move-exception;
            if ($ON_THROW_TOGGLE == false) goto L12;
            abcd.wu.j6(th, 1935069331307891220L, this);
        L12:
            throw th;
        L4:
            if ($ON_ENTER_TOGGLE == false) goto L6;
            abcd.wu.j6(1935069331307891220L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.isVisible;
        }

        protected abstract void onClick();

        @abcd.Interfacesu(method = -2261405046464348904L)
        public void onDestroy() {
        L11:
            th = move-exception;
            if ($ON_THROW_TOGGLE == false) goto L15;
            abcd.wu.j6(th, -126735706075272151L, this);
        L15:
            throw th;
        L4:
            if ($ON_ENTER_TOGGLE == false) goto L7;
            abcd.wu.j6(-126735706075272151L, this);     // Catch: java.lang.Throwable -> L11
        L7:
            if (this.removeTimer != null) goto L9;
            return;
        L9:
            this.removeTimer.cancel();     // Catch: java.lang.Throwable -> L11
            this.removeTimer = null;     // Catch: java.lang.Throwable -> L11
        }

        protected abstract void onDraggedTo(int r1, int r2);

        @abcd.Interfacesu(method = -167354218903133531L)
        public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        L22:
            th = move-exception;
            if ($ON_THROW_TOGGLE == false) goto L26;
            abcd.wu.j6(th, -6590904509522344112L, this, r12);
        L26:
            throw th;
        L4:
            if ($ON_ENTER_TOGGLE == false) goto L7;
            abcd.wu.j6(-6590904509522344112L, this, r12);     // Catch: java.lang.Throwable -> L22
        L7:
            if (this.isVisible == true) goto L9;
        L18:
            if (this.dragIsActive == false) goto L21;
            return true;
        L21:
            return false;
        L9:
            if (r12.getActionMasked() != 0) goto L18;
            if (r12.getPointerCount() != 1) goto L18;
            int r2 = (int) r12.getX(0);     // Catch: java.lang.Throwable -> L22
            int r5 = (int) r12.getY(0);     // Catch: java.lang.Throwable -> L22
            com.aide.ui.views.CodeEditText.c r6 = com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0);     // Catch: java.lang.Throwable -> L22
            int r7 = r6.DW(getLine());     // Catch: java.lang.Throwable -> L22
            int r8 = getColumn();     // Catch: java.lang.Throwable -> L22
            int r9 = (int) (r6.FH(r7) - com.aide.ui.views.CodeEditTextScrollView.Hw(this.this$0));     // Catch: java.lang.Throwable -> L22
            int r10 = (int) (r6.j6(r8, r7) - com.aide.ui.views.CodeEditTextScrollView.DW(this.this$0).getScrollX());     // Catch: java.lang.Throwable -> L22
            if (getHandleRect(r10, r9).contains(r2, r5) == false) goto L18;
            this.dragIsActive = true;     // Catch: java.lang.Throwable -> L22
            this.isDown = true;     // Catch: java.lang.Throwable -> L22
            if (this.removeTimerTask == null) goto L17;
            this.removeTimerTask.cancel();     // Catch: java.lang.Throwable -> L22
        L17:
            this.dragDX = r2 - (r10 + ((int) com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0).getSpaceCharWidth()));     // Catch: java.lang.Throwable -> L22
            this.dragDY = r5 - (r9 + (((int) com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0).getFontHeight()) / 2));     // Catch: java.lang.Throwable -> L22
            this.this$0.invalidate();     // Catch: java.lang.Throwable -> L22
            goto L18
        }

        @abcd.Interfacesu(method = 2723909635789114295L)
        public boolean onTouchEvent(android.view.MotionEvent r18) {
        L26:
            th = move-exception;
            if ($ON_THROW_TOGGLE == false) goto L30;
            abcd.wu.j6(th, 663380321676964048L, this, r18);
        L30:
            throw th;
        L4:
            if ($ON_ENTER_TOGGLE == false) goto L7;
            abcd.wu.j6(663380321676964048L, this, r18);     // Catch: java.lang.Throwable -> L26
        L7:
            if (this.dragIsActive == true) goto L10;
            return false;
        L10:
            if (r18.getAction() != 1) goto L15;
            this.dragIsActive = false;     // Catch: java.lang.Throwable -> L26
            scheduleRemoveCaretHandle();     // Catch: java.lang.Throwable -> L26
            this.this$0.invalidate();     // Catch: java.lang.Throwable -> L26
            if (this.isDown == false) goto L15;
            onClick();     // Catch: java.lang.Throwable -> L26
            this.isDown = false;     // Catch: java.lang.Throwable -> L26
        L15:
            if (r18.getAction() != 2) goto L25;
            float r0 = r18.getX(0);     // Catch: java.lang.Throwable -> L26
            float r7 = r18.getY(0);     // Catch: java.lang.Throwable -> L26
            float r1 = (r0 - this.dragDX) + com.aide.ui.views.CodeEditTextScrollView.DW(this.this$0).getScrollX();     // Catch: java.lang.Throwable -> L26
            float r8 = (r7 - this.dragDY) + com.aide.ui.views.CodeEditTextScrollView.Hw(this.this$0);     // Catch: java.lang.Throwable -> L26
            int r10 = com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0).FH(r1, r8);     // Catch: java.lang.Throwable -> L26
            int r11 = com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0).DW(r1, r8);     // Catch: java.lang.Throwable -> L26
            if (r10 == getLine()) goto L19;
        L32:
            com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0, true);     // Catch: java.lang.Throwable -> L22
            onDraggedTo(r10, r11);     // Catch: java.lang.Throwable -> L22
            com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0, false);     // Catch: java.lang.Throwable -> L26
            this.this$0.invalidate();     // Catch: java.lang.Throwable -> L26
            com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0, r10, r11, 1, 3, getScrollPaddingBottom(), 3, true);     // Catch: java.lang.Throwable -> L26
            goto L25
        L22:
            th = move-exception;
            com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0, false);     // Catch: java.lang.Throwable -> L26
            throw th;     // Catch: java.lang.Throwable -> L26
        L19:
            if (r11 != getColumn()) goto L32;
        L25:
            return true;
        }

        @abcd.Interfacesu(method = -1524084196227931936L)
        public void setBounce(float r5) {
        L8:
            th = move-exception;
            if ($ON_THROW_TOGGLE == false) goto L12;
            abcd.wu.j6(th, 693917310946914405L, this, new java.lang.Float(r5));
        L12:
            throw th;
        L4:
            if ($ON_ENTER_TOGGLE == false) goto L6;
            abcd.wu.j6(693917310946914405L, this, new java.lang.Float(r5));     // Catch: java.lang.Throwable -> L8
        L6:
            this.bounce = r5;     // Catch: java.lang.Throwable -> L8
            android.graphics.Rect r2 = getHandleRectInWindow();     // Catch: java.lang.Throwable -> L8
            r2.right += 100;     // Catch: java.lang.Throwable -> L8
            this.this$0.invalidate(r2);     // Catch: java.lang.Throwable -> L8
        }

        @abcd.Interfacesu(method = -2040008886390719160L)
        public void show() {
        L8:
            th = move-exception;
            if ($ON_THROW_TOGGLE == false) goto L12;
            abcd.wu.j6(th, -1230711725589006885L, this);
        L12:
            throw th;
        L4:
            if ($ON_ENTER_TOGGLE == false) goto L6;
            abcd.wu.j6(-1230711725589006885L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            this.isVisible = true;     // Catch: java.lang.Throwable -> L8
            this.this$0.invalidate();     // Catch: java.lang.Throwable -> L8
            scheduleRemoveCaretHandle();     // Catch: java.lang.Throwable -> L8
        }
    }

    @abcd.Interfacexu
    private class a extends com.aide.ui.views.CodeEditTextScrollView.DragHandle {

        @abcd.Interfacetu
        private static boolean $ON_ENTER_TOGGLE;

        @abcd.Interfaceuu
        private static boolean $ON_THROW_TOGGLE;

        @abcd.Interfaceru(field = -1621487324012273096L)
        private int DW;

        @abcd.Interfaceru(field = -3742975563272392660L)
        private android.animation.AnimatorSet FH;

        @abcd.Interfaceru(field = -3849293602864843152L)
        private boolean Hw;

        @abcd.Interfaceru(field = 2472915610141797904L)
        private int j6;

        @abcd.Interfacevu
        final com.aide.ui.views.CodeEditTextScrollView this$0;

        static {
            abcd.wu.j6(com.aide.ui.views.CodeEditTextScrollView.a.class, -1411785762941269443L, -1411785762941269443L);
        }

        @abcd.Interfacesu(method = 8363414320304206599L)
        public a(com.aide.ui.views.CodeEditTextScrollView r13, int r14) {
        L8:
            th = move-exception;
            if ($ON_THROW_TOGGLE == false) goto L12;
            abcd.wu.j6(th, -3079939322879754912L, null, r13, new java.lang.Integer(r14));
        L12:
            throw th;
        L4:
            if ($ON_ENTER_TOGGLE == false) goto L6;
            abcd.wu.j6(-3079939322879754912L, null, r13, new java.lang.Integer(r14));     // Catch: java.lang.Throwable -> L8
        L6:
            this.this$0 = r13;     // Catch: java.lang.Throwable -> L8
            super(r13, r13.getResources().getDrawable(r14), r13.getResources().getDrawable(com.almlkaide.kaypro.R.drawable.task_arrow_down), 0.0f, 0.5f, 0.0f, 0.5f, 10000000);     // Catch: java.lang.Throwable -> L8
            float r2 = r13.getResources().getDisplayMetrics().density * 15.0f;     // Catch: java.lang.Throwable -> L8
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(this, "bounce", new float[]{r2, 0.0f});     // Catch: java.lang.Throwable -> L8
            long r8 = 300;
            r4.setDuration(r8);     // Catch: java.lang.Throwable -> L8
            r4.setInterpolator(new android.view.animation.AccelerateInterpolator());     // Catch: java.lang.Throwable -> L8
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(this, "bounce", new float[]{0.0f, r2});     // Catch: java.lang.Throwable -> L8
            r0.setDuration(r8);     // Catch: java.lang.Throwable -> L8
            r0.setInterpolator(new android.view.animation.DecelerateInterpolator());     // Catch: java.lang.Throwable -> L8
            this.FH = new android.animation.AnimatorSet();     // Catch: java.lang.Throwable -> L8
            this.FH.play(r4).before(r0);     // Catch: java.lang.Throwable -> L8
            this.FH.addListener(new com.aide.ui.views.o(this, r13));     // Catch: java.lang.Throwable -> L8
        }

        static boolean j6(com.aide.ui.views.CodeEditTextScrollView.a r0) {
            return r0.Hw;
        }

        @Override
        @abcd.Interfacesu(method = -288686819507198543L)
        protected int getColumn() {
        L8:
            th = move-exception;
            if ($ON_THROW_TOGGLE == false) goto L12;
            abcd.wu.j6(th, 3578817585224010459L, this);
        L12:
            throw th;
        L4:
            if ($ON_ENTER_TOGGLE == false) goto L6;
            abcd.wu.j6(3578817585224010459L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.DW;
        }

        @Override
        @abcd.Interfacesu(method = -1970210481229543095L)
        protected int getLine() {
        L8:
            th = move-exception;
            if ($ON_THROW_TOGGLE == false) goto L12;
            abcd.wu.j6(th, 1993853182042517823L, this);
        L12:
            throw th;
        L4:
            if ($ON_ENTER_TOGGLE == false) goto L6;
            abcd.wu.j6(1993853182042517823L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.j6;
        }

        @abcd.Interfacesu(method = -1735670132558355552L)
        public void j6(int r8, int r9) {
        L7:
            th = move-exception;
            if ($ON_THROW_TOGGLE == false) goto L11;
            abcd.wu.j6(th, 6458456293962116580L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
        L11:
            throw th;
        L3:
            if ($ON_ENTER_TOGGLE == false) goto L5;
            abcd.wu.j6(6458456293962116580L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
        L5:
            this.j6 = r8;     // Catch: java.lang.Throwable -> L7
            this.DW = r9;     // Catch: java.lang.Throwable -> L7
            show();     // Catch: java.lang.Throwable -> L7
        }

        @Override
        @abcd.Interfacesu(method = -3528468877265125024L)
        protected void onClick() {
        L8:
            th = move-exception;
            if ($ON_THROW_TOGGLE == false) goto L12;
            abcd.wu.j6(th, 547404701557526484L, this);
        L12:
            throw th;
        L4:
            if ($ON_ENTER_TOGGLE == false) goto L6;
            abcd.wu.j6(547404701557526484L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            com.aide.ui.views.CodeEditTextScrollView.FH(this.this$0).v5(this.j6, this.DW);     // Catch: java.lang.Throwable -> L8
            this.Hw = true;     // Catch: java.lang.Throwable -> L8
            this.this$0.j6(this.j6, this.DW, com.aide.ui.views.CodeEditTextScrollView.FH(this.this$0).getDefaultFontSize(), new com.aide.ui.views.p(this));     // Catch: java.lang.Throwable -> L8
        }

        @Override
        @abcd.Interfacesu(method = -226910953330826531L)
        protected void onDraggedTo(int r8, int r9) {
        L6:
            th = move-exception;
            if ($ON_THROW_TOGGLE == false) goto L10;
            abcd.wu.j6(th, 415757008082571435L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
        L10:
            throw th;
        L3:
            if ($ON_ENTER_TOGGLE == false) goto L13;
            abcd.wu.j6(415757008082571435L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L6
            return;
        }

        @Override
        @abcd.Interfacesu(method = 280123017355167668L)
        public void show() {
        L10:
            th = move-exception;
            if ($ON_THROW_TOGGLE == false) goto L14;
            abcd.wu.j6(th, 2363674855950633088L, this);
        L14:
            throw th;
        L4:
            if ($ON_ENTER_TOGGLE == false) goto L6;
            abcd.wu.j6(2363674855950633088L, this);     // Catch: java.lang.Throwable -> L10
        L6:
            super.show();     // Catch: java.lang.Throwable -> L10
            this.Hw = false;     // Catch: java.lang.Throwable -> L10
            if (this.FH.isRunning() == true) goto L17;
            this.FH.start();     // Catch: java.lang.Throwable -> L10
            return;
        }
    }

    static {
        abcd.wu.j6(com.aide.ui.views.CodeEditTextScrollView.class, 1527178060401062972L, 1527178060401062972L);     // Catch: java.lang.Throwable -> L8
        if (DW == false) goto L6;
        abcd.wu.j6(-475698478596560700L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = false;     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -475698478596560700L, null);
    L12:
        throw th;
    }

    public CodeEditTextScrollView(android.content.Context r6) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -144329535800566721L, null, r6);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-144329535800566721L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        super(r6);     // Catch: java.lang.Throwable -> L8
        Hw(r6);     // Catch: java.lang.Throwable -> L8
    }

    public CodeEditTextScrollView(android.content.Context r8, android.util.AttributeSet r9) {
    L7:
        th = move-exception;
        if (FH == false) goto L11;
        abcd.wu.j6(th, -2654919397556896704L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(-2654919397556896704L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        super(r8, r9);     // Catch: java.lang.Throwable -> L7
        Hw(r8);     // Catch: java.lang.Throwable -> L7
    }

    public CodeEditTextScrollView(android.content.Context r9, android.util.AttributeSet r10, int r11) {
    L7:
        th = move-exception;
        if (FH == false) goto L11;
        abcd.wu.j6(th, -527739599459916723L, null, r9, r10, new java.lang.Integer(r11));
    L11:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(-527739599459916723L, null, r9, r10, new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
    L5:
        super(r9, r10, r11);     // Catch: java.lang.Throwable -> L7
        Hw(r9);     // Catch: java.lang.Throwable -> L7
    }

    static int DW(com.aide.ui.views.CodeEditTextScrollView r0, boolean r1) {
        return r0.DW(r1);
    }

    @abcd.Interfacesu(method = 1528512136903595808L)
    private int DW(boolean r5) {
    L13:
        th = move-exception;
        if (FH == false) goto L17;
        abcd.wu.j6(th, -5981518338966208875L, this, new java.lang.Boolean(r5));
    L17:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-5981518338966208875L, this, r5);     // Catch: java.lang.Throwable -> L13
    L6:
        int r2 = getMeasuredHeight();     // Catch: java.lang.Throwable -> L13
        if (r5 == false) goto L9;
        int r3 = 0;
    L10:
        return (int) ((r2 - r3) / getOEditorView().getFontHeight());
    L9:
        r3 = getQuickKeyBarHeight();     // Catch: java.lang.Throwable -> L13
        goto L10
    }

    @abcd.Interfacesu(method = -987704618367579849L)
    private static android.graphics.drawable.Drawable DW(android.content.Context r5) {
    L12:
        th = move-exception;
        if (FH == false) goto L16;
        abcd.wu.j6(th, -1083360095301203720L, null, r5);
    L16:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(-1083360095301203720L, null, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if (com.aide.common.ClassG.QX(r5) == false) goto L11;
        return com.aide.common.ClassG.j6(r5, 16843463, 16843829);
    L11:
        return r5.getResources().getDrawable(com.almlkaide.kaypro.R.drawable.text_select_handle_middle);
    }

    static android.widget.HorizontalScrollView DW(com.aide.ui.views.CodeEditTextScrollView r0) {
        return r0.getHorizontalScrollView();
    }

    @abcd.Interfacesu(method = 708264271801242324L)
    private void DW(int r8, int r9) {
    L7:
        th = move-exception;
        if (FH == false) goto L11;
        abcd.wu.j6(th, -927914807885282525L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(-927914807885282525L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        scrollTo(getScrollX(), getHeaderHeight() + r9);     // Catch: java.lang.Throwable -> L7
        getHorizontalScrollView().scrollTo(r8, getScrollY());     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = 595984940950504320L)
    private void DW(android.view.MotionEvent r7) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -241321454738952399L, this, r7);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-241321454738952399L, this, r7);     // Catch: java.lang.Throwable -> L8
    L6:
        setPinchZoom(j6(r7.getX(0), r7.getY(0), r7.getX(1), r7.getY(1)) / this.v5);     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 5627145497590440024L)
    private void EQ() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 342765843365982825L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(342765843365982825L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        scrollTo(getScrollX(), 0);     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -1301334676094462328L)
    private static android.graphics.drawable.Drawable FH(android.content.Context r5) {
    L12:
        th = move-exception;
        if (FH == false) goto L16;
        abcd.wu.j6(th, 893146395366562221L, null, r5);
    L16:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(893146395366562221L, null, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if (com.aide.common.ClassG.QX(r5) == false) goto L11;
        return com.aide.common.ClassG.j6(r5, 16843462, 16843829);
    L11:
        return r5.getResources().getDrawable(com.almlkaide.kaypro.R.drawable.text_select_handle_right);
    }

    static com.aide.ui.views.CodeEditText FH(com.aide.ui.views.CodeEditTextScrollView r0) {
        return r0.getCodeEditText();
    }

    @abcd.Interfacesu(method = 581457980638784012L)
    private void FH(android.view.MotionEvent r9) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 1174754900676382263L, this, r9);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(1174754900676382263L, this, r9);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = true;     // Catch: java.lang.Throwable -> L8
        this.v5 = j6(r9.getX(0), r9.getY(0), r9.getX(1), r9.getY(1));     // Catch: java.lang.Throwable -> L8
        j6((r9.getX(1) + r9.getX(0)) / 2.0f, ((r9.getY(1) + r9.getY(0)) / 2.0f) - getHeaderHeight());     // Catch: java.lang.Throwable -> L8
    }

    static int Hw(com.aide.ui.views.CodeEditTextScrollView r0) {
        return r0.getScrollLineY();
    }

    @abcd.Interfacesu(method = -8312533657135587840L)
    private void Hw(android.content.Context r17) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -7118633949076527143L, this, r17);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-7118633949076527143L, this, r17);     // Catch: java.lang.Throwable -> L8
    L6:
        setFocusable(false);     // Catch: java.lang.Throwable -> L8
        this.Ws = new com.aide.ui.views.CodeEditTextScrollView.a(this, com.almlkaide.kaypro.R.drawable.task_arrow_edit);     // Catch: java.lang.Throwable -> L8
        this.QX = new com.aide.ui.views.CodeEditTextScrollView.a(this, com.almlkaide.kaypro.R.drawable.task_arrow_view);     // Catch: java.lang.Throwable -> L8
        this.we = new com.aide.ui.views.f(this, DW(r17), DW(r17), 0.5f, 0.0f, 0.0f, 0.0f, 3000);     // Catch: java.lang.Throwable -> L8
        this.J0 = new com.aide.ui.views.g(this, j6(r17), j6(r17), 0.8f, 0.0f, 0.0f, 0.0f, 10000000);     // Catch: java.lang.Throwable -> L8
        this.J8 = new com.aide.ui.views.h(this, FH(r17), FH(r17), 0.2f, 0.0f, 0.0f, 0.0f, 10000000);     // Catch: java.lang.Throwable -> L8
        this.XL = new com.aide.ui.views.CodeEditTextScrollView.DragHandle[]{this.Ws, this.QX, this.we, this.J0, this.J8};     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -3494905909466639460L)
    private void Hw(android.view.MotionEvent r5) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -972316685052552699L, this, r5);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-972316685052552699L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = false;     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 4955096568660707061L)
    private void J0() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -7431934967343056400L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-7431934967343056400L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.we.hide();     // Catch: java.lang.Throwable -> L8
        this.J0.show();     // Catch: java.lang.Throwable -> L8
        this.J8.show();     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 5648103315095556183L)
    private com.aide.ui.views.CodeEditText getCodeEditText() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -5275058033570234000L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-5275058033570234000L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return (com.aide.ui.views.CodeEditText) ((android.view.ViewGroup) ((android.view.ViewGroup) getChildAt(0)).getChildAt(0)).getChildAt(1);
    }

    @abcd.Interfacesu(method = 5145282606432342379L)
    private int getHeaderHeight() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 5576183149537000280L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(5576183149537000280L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return getHeaderView().getMeasuredHeight();
    }

    @abcd.Interfacesu(method = -495001565222488821L)
    private android.widget.HorizontalScrollView getHorizontalScrollView() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -49818037403709800L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-49818037403709800L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return (android.widget.HorizontalScrollView) getChildAt(0);
    }

    @abcd.Interfacesu(method = -543603598293049320L)
    private com.aide.ui.views.CodeEditText.c getOEditorView() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -5267839568939873659L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-5267839568939873659L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return getCodeEditText().getOEditorView();
    }

    @abcd.Interfacesu(method = 704650270669961809L)
    private int getQuickKeyBarHeight() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 4245123115382937664L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(4245123115382937664L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return getCodeEditText().getQuickKeyBarHeight();
    }

    @abcd.Interfacesu(method = 5350686634205572753L)
    private int getScreenLinesCount() {
    L9:
        th = move-exception;
        if (FH == false) goto L13;
        abcd.wu.j6(th, 6507663914319915636L, this);
    L13:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(6507663914319915636L, this);     // Catch: java.lang.Throwable -> L9
    L6:
        return (int) ((((android.app.Activity) getContext()).getWindow().getDecorView().findViewById(16908290).getHeight() - getQuickKeyBarHeight()) / getOEditorView().getFontHeight());
    }

    @abcd.Interfacesu(method = -299277202735494160L)
    private int getScrollColumnX() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 3392355497451378261L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(3392355497451378261L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return getHorizontalScrollView().getScrollX();
    }

    @abcd.Interfacesu(method = 2806826514580735237L)
    private int getScrollLineY() {
    L9:
        th = move-exception;
        if (FH == false) goto L13;
        abcd.wu.j6(th, -2231192923430531040L, this);
    L13:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-2231192923430531040L, this);     // Catch: java.lang.Throwable -> L9
    L6:
        return getScrollY() - getHeaderHeight();
    }

    @abcd.Interfacesu(method = 47602948224727609L)
    private int getVisibleColumnsCount() {
    L9:
        th = move-exception;
        if (FH == false) goto L13;
        abcd.wu.j6(th, -5997327906327912280L, this);
    L13:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-5997327906327912280L, this);     // Catch: java.lang.Throwable -> L9
    L6:
        return (int) (getMeasuredWidth() / getOEditorView().getSpaceCharWidth());
    }

    @abcd.Interfacesu(method = 2610531802265983484L)
    private float j6(float r10, float r11, float r12, float r13) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 1203131895963499829L, this, new java.lang.Float(r10), new java.lang.Float(r11), new java.lang.Float(r12), new java.lang.Float(r13));
    L12:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(1203131895963499829L, this, new java.lang.Float(r10), new java.lang.Float(r11), new java.lang.Float(r12), new java.lang.Float(r13));     // Catch: java.lang.Throwable -> L8
    L5:
        float r0 = r10 - r12;     // Catch: java.lang.Throwable -> L8
        float r1 = r11 - r13;     // Catch: java.lang.Throwable -> L8
        return (float) java.lang.Math.sqrt((r0 * r0) + (r1 * r1));
    }

    @abcd.Interfacesu(method = 651664010401631469L)
    private static android.graphics.drawable.Drawable j6(android.content.Context r5) {
    L12:
        th = move-exception;
        if (FH == false) goto L16;
        abcd.wu.j6(th, 300140386419170272L, null, r5);
    L16:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(300140386419170272L, null, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if (com.aide.common.ClassG.QX(r5) == false) goto L11;
        return com.aide.common.ClassG.j6(r5, 16843461, 16843829);
    L11:
        return r5.getResources().getDrawable(com.almlkaide.kaypro.R.drawable.text_select_handle_left);
    }

    static com.aide.ui.views.CodeEditText.c j6(com.aide.ui.views.CodeEditTextScrollView r0) {
        return r0.getOEditorView();
    }

    @abcd.Interfacesu(method = -5169331040704775092L)
    private void j6(float r8, float r9) {
    L7:
        th = move-exception;
        if (FH == false) goto L11;
        abcd.wu.j6(th, 965992488433909167L, this, new java.lang.Float(r8), new java.lang.Float(r9));
    L11:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(965992488433909167L, this, new java.lang.Float(r8), new java.lang.Float(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        this.Zo = r8;     // Catch: java.lang.Throwable -> L7
        this.VH = r9;     // Catch: java.lang.Throwable -> L7
        this.gn = getScrollColumnX();     // Catch: java.lang.Throwable -> L7
        this.u7 = getScrollLineY();     // Catch: java.lang.Throwable -> L7
        getOEditorView().ei();     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = 4602188157403359000L)
    private boolean j6(int r8, int r9, int r10, int r11, int r12, int r13, boolean r14) {
        if (DW == false) goto L5;
        abcd.wu.j6(299976980777671211L, this, new java.lang.Object[]{new java.lang.Integer(r8), new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Boolean(r14)});
    L5:
        com.aide.ui.views.CodeEditText.c r0 = getOEditorView();
        int r15 = r0.DW(r8);
        int r3 = (getFirstVisibleLine() + r10) - 1;
        int r4 = (j6(r14) - r12) + 1;
        if (r15 >= r3) goto L8;
        r3 = (r15 - r10) + 1;
        boolean r16 = true;
    L9:
        if (r15 <= r4) goto L11;
        r3 = (r15 - DW(r14)) + r12;
        r16 = true;
    L11:
        float r17 = getOEditorView().j6(r9, r15);
        float r18 = getHorizontalScrollView().getScrollX();
        float r19 = r17 - (r13 * r0.getSpaceCharWidth());
        if (r19 >= getHorizontalScrollView().getScrollX()) goto L14;
        boolean r110 = true;
    L15:
        float r20 = r17 + (r11 * r0.getSpaceCharWidth());
        if (r20 <= (getHorizontalScrollView().getScrollX() + getMeasuredWidth())) goto L18;
        r19 = r20 - getMeasuredWidth();
        r110 = true;
    L18:
        if (r110 == true) goto L20;
        if (r16 == true) goto L20;
    L28:
        if (r110 == true) goto L30;
        if (r16 == true) goto L30;
        return false;
    L30:
        return true;
    L20:
        if (r16 == false) goto L24;
        if (r3 >= 0) goto L23;
        r3 = 0;
    L23:
        scrollTo(getScrollX(), (int) ((r3 * getOEditorView().getFontHeight()) + getHeaderHeight()));
    L24:
        if (r110 == false) goto L26;
        getHorizontalScrollView().scrollTo((int) r19, getHorizontalScrollView().getScrollY());
    L26:
        if (r15 > 0) goto L28;
        EQ();
        goto L28
    L14:
        r19 = r18;
        r110 = false;
        goto L15
    L8:
        r16 = false;
        goto L9
    }

    static boolean j6(com.aide.ui.views.CodeEditTextScrollView r0, int r1, int r2, int r3, int r4, int r5, int r6, boolean r7) {
        return r0.j6(r1, r2, r3, r4, r5, r6, r7);
    }

    static boolean j6(com.aide.ui.views.CodeEditTextScrollView r0, boolean r1) {
        r0.aM = r1;
        return r1;
    }

    @abcd.Interfacesu(method = 2754547506937160649L)
    private void setPinchZoom(float r7) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -2161679105275164060L, this, new java.lang.Float(r7));
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-2161679105275164060L, this, new java.lang.Float(r7));     // Catch: java.lang.Throwable -> L8
    L6:
        float[] r2 = getOEditorView().FH(r7);     // Catch: java.lang.Throwable -> L8
        float r3 = r2[1];     // Catch: java.lang.Throwable -> L8
        this.tp = ((this.gn + this.Zo) * r2[0]) - this.Zo;     // Catch: java.lang.Throwable -> L8
        this.EQ = ((this.u7 + this.VH) * r3) - this.VH;     // Catch: java.lang.Throwable -> L8
        DW((int) this.tp, (int) this.EQ);     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 2653967576891868907L)
    private boolean tp() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 6340936740444009704L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(6340936740444009704L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return com.aide.common.ClassG.J8(getContext());
    }

    @abcd.Interfacesu(method = -94704231011443592L)
    private boolean u7() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 110377942879655417L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(110377942879655417L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return isHardwareAccelerated();
    }

    static int v5(com.aide.ui.views.CodeEditTextScrollView r0) {
        return r0.getHeaderHeight();
    }

    @abcd.Interfacesu(method = -5646012300035384075L)
    private void we() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -4351332685093462596L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-4351332685093462596L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.we.show();     // Catch: java.lang.Throwable -> L8
        this.J0.hide();     // Catch: java.lang.Throwable -> L8
        this.J8.hide();     // Catch: java.lang.Throwable -> L8
    }

    public void DW() {
    L12:
        th = move-exception;
        if (FH == false) goto L16;
        abcd.wu.j6(th, 1313773977119759732L, this);
    L16:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(1313773977119759732L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (this.Ws.isVisible() == true) goto L9;
        return;
    L9:
        if (getOEditorView().getCaretLine() == this.Ws.getLine()) goto L20;
        getOEditorView().v5(this.Ws.getColumn(), this.Ws.getLine());     // Catch: java.lang.Throwable -> L12
        return;
    }

    public void FH() {
    L12:
        th = move-exception;
        if (FH == false) goto L16;
        abcd.wu.j6(th, 600342389609366339L, this);
    L16:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(600342389609366339L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (this.aM == false) goto L9;
        return;
    L9:
        if (this.j3 == true) goto L20;
        this.we.hide();     // Catch: java.lang.Throwable -> L12
        this.J0.hide();     // Catch: java.lang.Throwable -> L12
        this.J8.hide();     // Catch: java.lang.Throwable -> L12
        getCodeEditText().QX();     // Catch: java.lang.Throwable -> L12
        return;
    }

    public void Hw() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -294737801319569007L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-294737801319569007L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.QX.hide();     // Catch: java.lang.Throwable -> L8
        this.Ws.hide();     // Catch: java.lang.Throwable -> L8
    }

    public void VH() {
    L11:
        th = move-exception;
        if (FH == false) goto L15;
        abcd.wu.j6(th, -1485646363710203520L, this);
    L15:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(-1485646363710203520L, this);     // Catch: java.lang.Throwable -> L11
    L7:
        if (getOEditorView().J0() == false) goto L9;
        J0();     // Catch: java.lang.Throwable -> L11
        return;
    L9:
        we();     // Catch: java.lang.Throwable -> L11
    }

    public void Zo() {
    L11:
        th = move-exception;
        if (FH == false) goto L16;
        abcd.wu.j6(th, -1575342579585182947L, this);
    L16:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-1575342579585182947L, this);     // Catch: java.lang.Throwable -> L11
    L6:
        com.aide.ui.views.CodeEditTextScrollView.DragHandle[] r2 = this.XL;     // Catch: java.lang.Throwable -> L11
        int r3 = r2.length;     // Catch: java.lang.Throwable -> L11
        int r4 = 0;
    L7:
        if (r4 >= r3) goto L10;
        r2[r4].onDestroy();     // Catch: java.lang.Throwable -> L11
        r4 = r4 + 1;
        goto L7
    }

    @Override
    @abcd.Interfacesu(method = -7949025709803866348L)
    protected int computeScrollDeltaToGetChildRectOnScreen(android.graphics.Rect r5) {
    L12:
        th = move-exception;
        if (FH == false) goto L16;
        abcd.wu.j6(th, -6795322529938909407L, this, r5);
    L16:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(-6795322529938909407L, this, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if (tp() == false) goto L10;
        return 0;
    L10:
        return super.computeScrollDeltaToGetChildRectOnScreen(r5);
    }

    @Override
    public void draw(android.graphics.Canvas r7) {
    L11:
        th = move-exception;
        if (FH == false) goto L16;
        abcd.wu.j6(th, 322618959802127811L, this, r7);
    L16:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(322618959802127811L, this, r7);     // Catch: java.lang.Throwable -> L11
    L6:
        int r2 = r7.save();     // Catch: java.lang.Throwable -> L11
        super.draw(r7);     // Catch: java.lang.Throwable -> L11
        r7.restoreToCount(r2);     // Catch: java.lang.Throwable -> L11
        com.aide.ui.views.CodeEditTextScrollView.DragHandle[] r3 = this.XL;     // Catch: java.lang.Throwable -> L11
        int r4 = r3.length;     // Catch: java.lang.Throwable -> L11
        int r5 = 0;
    L7:
        if (r5 >= r4) goto L10;
        r3[r5].draw(r7);     // Catch: java.lang.Throwable -> L11
        r5 = r5 + 1;
        goto L7
    }

    public int getFirstVisibleLine() {
    L9:
        th = move-exception;
        if (FH == false) goto L13;
        abcd.wu.j6(th, 4555712326159824768L, this);
    L13:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(4555712326159824768L, this);     // Catch: java.lang.Throwable -> L9
    L6:
        return (int) (getScrollLineY() / getOEditorView().getFontHeight());
    }

    public android.view.View getHeaderView() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 2078912586998990448L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(2078912586998990448L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return ((android.view.ViewGroup) ((android.view.ViewGroup) getChildAt(0)).getChildAt(0)).getChildAt(0);
    }

    public void gn() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -5392891101809295239L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-5392891101809295239L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        getHorizontalScrollView().scrollTo(0, 0);     // Catch: java.lang.Throwable -> L8
        scrollTo(0, getHeaderHeight());     // Catch: java.lang.Throwable -> L8
        android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofInt(this, "scrollY", new int[]{0});     // Catch: java.lang.Throwable -> L8
        r2.setDuration(500);     // Catch: java.lang.Throwable -> L8
        r2.start();     // Catch: java.lang.Throwable -> L8
    }

    public int j6(boolean r5) {
    L9:
        th = move-exception;
        if (FH == false) goto L13;
        abcd.wu.j6(th, 3692276521024502567L, this, new java.lang.Boolean(r5));
    L13:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(3692276521024502567L, this, r5);     // Catch: java.lang.Throwable -> L9
    L6:
        return (getFirstVisibleLine() + DW(r5)) - 1;
    }

    public void j6(int r8, int r9) {
    L9:
        th = move-exception;
        if (FH == false) goto L13;
        abcd.wu.j6(th, 1174195015257584511L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L13:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(1174195015257584511L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L9
    L5:
        int r0 = (int) (r9 / getOEditorView().getFontHeight());     // Catch: java.lang.Throwable -> L9
        int r1 = getFirstVisibleLine() + 1;     // Catch: java.lang.Throwable -> L9
        int r2 = java.lang.Math.min(r8, java.lang.Math.max(1, ((r0 + r8) - getScreenLinesCount()) + 2));     // Catch: java.lang.Throwable -> L9
        if (r1 >= r2) goto L16;
        scrollTo(getScrollX(), (int) (((r2 - 1) * getOEditorView().getFontHeight()) + getHeaderHeight()));     // Catch: java.lang.Throwable -> L9
        return;
    }

    public void j6(int r10, int r11, float r12, java.lang.Runnable r13) {
    L11:
        th = move-exception;
        if (FH == false) goto L15;
        abcd.wu.j6(th, 6364552957507873392L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Float(r12), r13);
    L15:
        throw th;
    L3:
        if (DW == false) goto L6;
        abcd.wu.j6(6364552957507873392L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Float(r12), r13);     // Catch: java.lang.Throwable -> L11
    L6:
        if (getOEditorView().getFontSize() == r12) goto L8;
        getOEditorView().requestFocus();     // Catch: java.lang.Throwable -> L11
        j6(getOEditorView().j6(r11, r10), getOEditorView().FH(r10) - getScrollLineY());     // Catch: java.lang.Throwable -> L11
        android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(this, "pinchZoom", new float[]{1.0f, r12 / getOEditorView().getFontSize()});     // Catch: java.lang.Throwable -> L11
        r0.setDuration(1000);     // Catch: java.lang.Throwable -> L11
        r0.addListener(new com.aide.ui.views.l(this, r13));     // Catch: java.lang.Throwable -> L11
        r0.start();     // Catch: java.lang.Throwable -> L11
        return;
    L8:
        if (r13 == null) goto L18;
        r13.run();     // Catch: java.lang.Throwable -> L11
        return;
    }

    public void j6(int r10, int r11, int r12, int r13) {
    L21:
        th = move-exception;
        if (FH == false) goto L25;
        abcd.wu.j6(th, 762705082842473000L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L25:
        throw th;
    L3:
        if (DW == false) goto L26;
        abcd.wu.j6(762705082842473000L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L21
    L26:
        this.j3 = true;     // Catch: java.lang.Throwable -> L18
        if (this.we.isVisible() == false) goto L11;
        if (r10 != r12) goto L10;
        if (r11 == r13) goto L11;
    L10:
        J0();     // Catch: java.lang.Throwable -> L18
    L11:
        getOEditorView().Hw(r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L18
        if (this.we.isVisible() == false) goto L14;
    L15:
        invalidate();     // Catch: java.lang.Throwable -> L18
    L16:
        this.j3 = false;     // Catch: java.lang.Throwable -> L21
        return;
    L14:
        if (this.J0.isVisible() == false) goto L16;
    L18:
        th = move-exception;
        this.j3 = false;     // Catch: java.lang.Throwable -> L21
        throw th;     // Catch: java.lang.Throwable -> L21
    }

    public void j6(int r10, int r11, boolean r12, boolean r13) {
    L11:
        th = move-exception;
        if (FH == false) goto L15;
        abcd.wu.j6(th, 3481636457736893200L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Boolean(r12), new java.lang.Boolean(r13));
    L15:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(3481636457736893200L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Boolean(r12), new java.lang.Boolean(r13));     // Catch: java.lang.Throwable -> L11
    L5:
        if (r12 == false) goto L7;
        this.Ws.j6(r10 - 1, r11 - 1);     // Catch: java.lang.Throwable -> L11
    L8:
        if (r13 == false) goto L18;
        getOEditorView().setFontSize(getCodeEditText().getDefaultFontSize() * 0.5f);     // Catch: java.lang.Throwable -> L11
        return;
    L18:
        return;
    L7:
        this.QX.j6(r10 - 1, r11 - 1);     // Catch: java.lang.Throwable -> L11
        goto L8
    }

    public boolean j6() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -7609603819454895149L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-7609603819454895149L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return j6(getOEditorView().getCaretLine(), getOEditorView().getCaretColumn(), 1, 1, 1, 1, false);
    }

    public boolean j6(android.view.MotionEvent r5) {
    L16:
        th = move-exception;
        if (FH == false) goto L20;
        abcd.wu.j6(th, -4326499630303940481L, this, r5);
    L20:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(-4326499630303940481L, this, r5);     // Catch: java.lang.Throwable -> L16
    L7:
        if (this.we.isTouchEventInsideHandle(r5) == false) goto L9;
    L14:
        return true;
    L9:
        if (this.J0.isTouchEventInsideHandle(r5) == true) goto L14;
        if (this.J8.isTouchEventInsideHandle(r5) == true) goto L14;
        return false;
    }

    @Override
    @abcd.Interfacesu(method = 887793339723325187L)
    protected void onAttachedToWindow() {
    L12:
        th = move-exception;
        if (FH == false) goto L16;
        abcd.wu.j6(th, 4426619718646903520L, this);
    L16:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(4426619718646903520L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (j6 == false) goto L9;
        return;
    L9:
        if (u7() == false) goto L20;
        setLayerType(1, null);     // Catch: java.lang.Throwable -> L12
        return;
    }

    @Override
    @abcd.Interfacesu(method = -202520716462318192L)
    protected void onFinishInflate() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 660729739022127985L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(660729739022127985L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super.onFinishInflate();     // Catch: java.lang.Throwable -> L8
        getOEditorView().j6(new com.aide.ui.views.i(this));     // Catch: java.lang.Throwable -> L8
        getOEditorView().j6(new com.aide.ui.views.j(this));     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
    L28:
        th = move-exception;
        if (FH == false) goto L33;
        abcd.wu.j6(th, 3307504760350739200L, this, r9);
    L33:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(3307504760350739200L, this, r9);     // Catch: java.lang.Throwable -> L28
    L6:
        com.aide.ui.views.CodeEditTextScrollView.DragHandle[] r2 = this.XL;     // Catch: java.lang.Throwable -> L28
        int r3 = r2.length;     // Catch: java.lang.Throwable -> L28
        int r5 = 0;
    L8:
        if (r5 >= r3) goto L14;
        if (r2[r5].onInterceptTouchEvent(r9) == true) goto L11;
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L28
        goto L8
    L11:
        return true;
    L14:
        if (com.aide.common.ClassG.j6(r9) == false) goto L17;
        return false;
    L17:
        if (this.Hw == true) goto L24;
        if (r9.getActionMasked() != 5) goto L24;
        if (r9.getPointerCount() != 2) goto L24;
        FH(r9);     // Catch: java.lang.Throwable -> L28
    L24:
        if (this.Hw == false) goto L26;
        return true;
    L26:
        return super.onInterceptTouchEvent(r9);
    }

    @Override
    public void onRestoreInstanceState(android.os.Parcelable r6) {
    L11:
        th = move-exception;
        if (FH == false) goto L15;
        abcd.wu.j6(th, 142038143544224161L, this, r6);
    L15:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(142038143544224161L, this, r6);     // Catch: java.lang.Throwable -> L11
    L7:
        if ((r6 instanceof android.os.Bundle) == false) goto L9;
        android.os.Bundle r2 = (android.os.Bundle) r6;     // Catch: java.lang.Throwable -> L11
        super.onRestoreInstanceState(r2.getParcelable("instanceState"));     // Catch: java.lang.Throwable -> L11
        int r3 = r2.getInt("scrollx");     // Catch: java.lang.Throwable -> L11
        postDelayed(new com.aide.ui.views.k(this, r2.getInt("scrolly"), r3), 100);     // Catch: java.lang.Throwable -> L11
        return;
    L9:
        super.onRestoreInstanceState(r6);     // Catch: java.lang.Throwable -> L11
    }

    @Override
    public android.os.Parcelable onSaveInstanceState() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 425598516807097920L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(425598516807097920L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        android.os.Bundle r2 = new android.os.Bundle();     // Catch: java.lang.Throwable -> L8
        r2.putParcelable("instanceState", super.onSaveInstanceState());     // Catch: java.lang.Throwable -> L8
        r2.putInt("scrollx", getScrollX());     // Catch: java.lang.Throwable -> L8
        r2.putInt("scrolly", getHorizontalScrollView().getScrollY());     // Catch: java.lang.Throwable -> L8
        return r2;
    }

    @Override
    @abcd.Interfacesu(method = 369465896322369485L)
    protected void onScrollChanged(int r10, int r11, int r12, int r13) {
    L7:
        th = move-exception;
        if (FH == false) goto L11;
        abcd.wu.j6(th, 57458406875011936L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L11:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(57458406875011936L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L7
    L5:
        super.onScrollChanged(r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
        getOEditorView().XL();     // Catch: java.lang.Throwable -> L7
    }

    @Override
    @abcd.Interfacesu(method = -4862720712386855475L)
    protected void onSizeChanged(int r10, int r11, int r12, int r13) {
    L7:
        th = move-exception;
        if (FH == false) goto L11;
        abcd.wu.j6(th, 3786480371555087968L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L11:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(3786480371555087968L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L7
    L5:
        super.onSizeChanged(r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
        getOEditorView().XL();     // Catch: java.lang.Throwable -> L7
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r8) {
    L37:
        th = move-exception;
        if (FH == false) goto L42;
        abcd.wu.j6(th, 1374904241774718072L, this, r8);
    L42:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(1374904241774718072L, this, r8);     // Catch: java.lang.Throwable -> L37
    L6:
        com.aide.ui.views.CodeEditTextScrollView.DragHandle[] r2 = this.XL;     // Catch: java.lang.Throwable -> L37
        int r3 = r2.length;     // Catch: java.lang.Throwable -> L37
        int r4 = 0;
    L8:
        if (r4 >= r3) goto L14;
        if (r2[r4].onTouchEvent(r8) == true) goto L11;
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L37
        goto L8
    L11:
        return true;
    L14:
        if (this.Hw == true) goto L21;
        if (r8.getActionMasked() != 5) goto L21;
        if (r8.getPointerCount() != 2) goto L21;
        FH(r8);     // Catch: java.lang.Throwable -> L37
    L21:
        if (this.Hw == false) goto L36;
        if (r8.getAction() != 2) goto L28;
        if (r8.getPointerCount() != 2) goto L28;
        DW(r8);     // Catch: java.lang.Throwable -> L37
    L28:
        if (r8.getAction() != 1) goto L32;
        if (r8.getPointerCount() != 1) goto L32;
    L33:
        Hw(r8);     // Catch: java.lang.Throwable -> L37
    L34:
        return true;
    L32:
        if (r8.getAction() != 3) goto L34;
    L36:
        return super.onTouchEvent(r8);
    }

    public boolean v5() {
    L14:
        th = move-exception;
        if (FH == false) goto L18;
        abcd.wu.j6(th, 6480317330394729223L, this);
    L18:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(6480317330394729223L, this);     // Catch: java.lang.Throwable -> L14
    L7:
        if (this.Ws.isVisible() == true) goto L12;
        if (this.QX.isVisible() == true) goto L12;
        return false;
    L12:
        return true;
    }
}
