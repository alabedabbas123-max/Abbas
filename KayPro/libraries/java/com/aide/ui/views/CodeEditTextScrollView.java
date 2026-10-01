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
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if ($ON_ENTER_TOGGLE == false) { $pc0 = 5; continue $sw0; }
                        abcd.wu.j6(3171151906848048956L, null, new java.lang.Object[]{r7, r8, r9, new java.lang.Float(r10), new java.lang.Float(r11), new java.lang.Float(r12), new java.lang.Float(r13), new java.lang.Long(r14)});
                        $pc0 = 5; continue $sw0;
                    }
                    case 5: {
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
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            int r0 = 0;
            int r3 = 0;
            float r1 = 0.0f;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = 3;
            $sw1: while (true) {
                switch ($pc1) {
                    case 7: {
                        th = $ex1;
                        if ($ON_THROW_TOGGLE == false) { $pc1 = 11; continue $sw1; }
                        abcd.wu.j6(th, -1184894233243669440L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                        $pc1 = 11; continue $sw1;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if ($ON_ENTER_TOGGLE == false) { $pc1 = 5; continue $sw1; }
                        try {
                            abcd.wu.j6(-1184894233243669440L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 7; continue $sw1;
                        }
                        $pc1 = 5; continue $sw1;
                    }
                    case 5: {
                        try {
                            r0 = (int) com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0).getFontHeight();
                            r3 = r9 + r0;
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 7; continue $sw1;
                        }
                        r1 = r0;
                        return new android.graphics.Rect(r8 - this.handleCenterX, (int) ((r3 - this.handleCenterY) - (this.charCenterY * r1)), (r8 - this.handleCenterX) + this.handleWidth, (int) (((r3 + this.handleHeight) - this.handleCenterY) - (this.charCenterY * r1)));
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = -6487434163742256960L)
        private android.graphics.Rect getHandleRectInWindow() {
            com.aide.ui.views.CodeEditText.c r2 = null;
            int r3 = 0;
            int r4 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = 4;
            $sw2: while (true) {
                switch ($pc2) {
                    case 8: {
                        th = $ex2;
                        if ($ON_THROW_TOGGLE == false) { $pc2 = 12; continue $sw2; }
                        abcd.wu.j6(th, 4822620750613890107L, this);
                        $pc2 = 12; continue $sw2;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if ($ON_ENTER_TOGGLE == false) { $pc2 = 6; continue $sw2; }
                        try {
                            abcd.wu.j6(4822620750613890107L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 8; continue $sw2;
                        }
                        $pc2 = 6; continue $sw2;
                    }
                    case 6: {
                        try {
                            r2 = com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0);
                            r3 = r2.DW(getLine());
                            r4 = getColumn();
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 8; continue $sw2;
                        }
                        return getHandleRect((int) (r2.j6(r4, r3) - com.aide.ui.views.CodeEditTextScrollView.DW(this.this$0).getScrollX()), (int) (r2.FH(r3) + com.aide.ui.views.CodeEditTextScrollView.v5(this.this$0)));
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = -278043912086731284L)
        private int getScrollPaddingBottom() {
            int r2 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = 4;
            $sw3: while (true) {
                switch ($pc3) {
                    case 12: {
                        th = $ex3;
                        if ($ON_THROW_TOGGLE == false) { $pc3 = 16; continue $sw3; }
                        abcd.wu.j6(th, 6852079172345263541L, this);
                        $pc3 = 16; continue $sw3;
                    }
                    case 16: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if ($ON_ENTER_TOGGLE == false) { $pc3 = 6; continue $sw3; }
                        try {
                            abcd.wu.j6(6852079172345263541L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 12; continue $sw3;
                        }
                        $pc3 = 6; continue $sw3;
                    }
                    case 6: {
                        try {
                            r2 = (int) (this.handleHeight / com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0).getFontHeight());
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 12; continue $sw3;
                        }
                        if (r2 <= (com.aide.ui.views.CodeEditTextScrollView.DW(this.this$0, true) - 4)) { $pc3 = 11; continue $sw3; }
                        r2 = com.aide.ui.views.CodeEditTextScrollView.DW(this.this$0, true) - 4;
                        $pc3 = 11; continue $sw3;
                    }
                    case 11: {
                        return r2 + 2;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = -1726108080422185305L)
        private void scheduleRemoveCaretHandle() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = 4;
            $sw4: while (true) {
                switch ($pc4) {
                    case 14: {
                        th = $ex4;
                        if ($ON_THROW_TOGGLE == false) { $pc4 = 18; continue $sw4; }
                        abcd.wu.j6(th, 131819675948830044L, this);
                        $pc4 = 18; continue $sw4;
                    }
                    case 18: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if ($ON_ENTER_TOGGLE == false) { $pc4 = 7; continue $sw4; }
                        try {
                            abcd.wu.j6(131819675948830044L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 14; continue $sw4;
                        }
                        $pc4 = 7; continue $sw4;
                    }
                    case 7: {
                        if (this.removeTimer != null) { $pc4 = 10; continue $sw4; }
                        return;
                    }
                    case 10: {
                        if (this.removeTimerTask == null) { $pc4 = 12; continue $sw4; }
                        try {
                            this.removeTimerTask.cancel();
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 14; continue $sw4;
                        }
                        $pc4 = 12; continue $sw4;
                    }
                    case 12: {
                        try {
                            this.removeTimerTask = new com.aide.ui.views.n(this);
                            this.removeTimer.schedule(this.removeTimerTask, this.timeout);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 14; continue $sw4;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = -5132376812465951040L)
        public void draw(android.graphics.Canvas r6) {
            android.graphics.Rect r2 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex5 = null;
            int $pc5 = 4;
            $sw5: while (true) {
                switch ($pc5) {
                    case 14: {
                        th = $ex5;
                        if ($ON_THROW_TOGGLE == false) { $pc5 = 18; continue $sw5; }
                        abcd.wu.j6(th, 5989445094908789415L, this, r6);
                        $pc5 = 18; continue $sw5;
                    }
                    case 18: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if ($ON_ENTER_TOGGLE == false) { $pc5 = 7; continue $sw5; }
                        try {
                            abcd.wu.j6(5989445094908789415L, this, r6);
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 14; continue $sw5;
                        }
                        $pc5 = 7; continue $sw5;
                    }
                    case 7: {
                        if (this.isVisible == true) { $pc5 = 9; continue $sw5; }
                        return;
                    }
                    case 9: {
                        try {
                            r2 = getHandleRectInWindow();
                            r2.left = (int) (r2.left + this.bounce);
                            r2.right = (int) (r2.right + this.bounce);
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 14; continue $sw5;
                        }
                        if (this.isDown == false) { $pc5 = 12; continue $sw5; }
                        try {
                            this.iconDown.setBounds(r2);
                            this.iconDown.draw(r6);
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 14; continue $sw5;
                        }
                        return;
                    }
                    case 12: {
                        try {
                            this.icon.setBounds(r2);
                            this.icon.draw(r6);
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 14; continue $sw5;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        protected abstract int getColumn();

        protected abstract int getLine();

        @abcd.Interfacesu(method = -2046274687000955763L)
        public void hide() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex6 = null;
            int $pc6 = 4;
            $sw6: while (true) {
                switch ($pc6) {
                    case 13: {
                        th = $ex6;
                        if ($ON_THROW_TOGGLE == false) { $pc6 = 17; continue $sw6; }
                        abcd.wu.j6(th, -1234924723072473348L, this);
                        $pc6 = 17; continue $sw6;
                    }
                    case 17: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if ($ON_ENTER_TOGGLE == false) { $pc6 = 7; continue $sw6; }
                        try {
                            abcd.wu.j6(-1234924723072473348L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 13; continue $sw6;
                        }
                        $pc6 = 7; continue $sw6;
                    }
                    case 7: {
                        if (this.isVisible == true) { $pc6 = 9; continue $sw6; }
                        return;
                    }
                    case 9: {
                        try {
                            this.isVisible = false;
                            this.this$0.invalidate();
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 13; continue $sw6;
                        }
                        if (this.removeTimerTask == null) { $pc6 = 20; continue $sw6; }
                        try {
                            this.removeTimerTask.cancel();
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 13; continue $sw6;
                        }
                        return;
                    }
                    case 20: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = 1843100419863894924L)
        public boolean isTouchEventInsideHandle(android.view.MotionEvent r10) {
            int r2 = 0;
            int r3 = 0;
            com.aide.ui.views.CodeEditText.c r4 = null;
            int r5 = 0;
            int r6 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex7 = null;
            int $pc7 = 4;
            $sw7: while (true) {
                switch ($pc7) {
                    case 11: {
                        th = $ex7;
                        if ($ON_THROW_TOGGLE == false) { $pc7 = 15; continue $sw7; }
                        abcd.wu.j6(th, 576529275846256101L, this, r10);
                        $pc7 = 15; continue $sw7;
                    }
                    case 15: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if ($ON_ENTER_TOGGLE == false) { $pc7 = 7; continue $sw7; }
                        try {
                            abcd.wu.j6(576529275846256101L, this, r10);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 11; continue $sw7;
                        }
                        $pc7 = 7; continue $sw7;
                    }
                    case 7: {
                        if (this.isVisible == true) { $pc7 = 9; continue $sw7; }
                        return false;
                    }
                    case 9: {
                        try {
                            r2 = (int) r10.getX(0);
                            r3 = (int) r10.getY(0);
                            r4 = com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0);
                            r5 = r4.DW(getLine());
                            r6 = getColumn();
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 11; continue $sw7;
                        }
                        return getHandleRect((int) (r4.j6(r6, r5) - com.aide.ui.views.CodeEditTextScrollView.DW(this.this$0).getScrollX()), (int) (r4.FH(r5) - com.aide.ui.views.CodeEditTextScrollView.Hw(this.this$0))).contains(r2, r3);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = 344269935127805851L)
        public boolean isVisible() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex8 = null;
            int $pc8 = 4;
            $sw8: while (true) {
                switch ($pc8) {
                    case 8: {
                        th = $ex8;
                        if ($ON_THROW_TOGGLE == false) { $pc8 = 12; continue $sw8; }
                        abcd.wu.j6(th, 1935069331307891220L, this);
                        $pc8 = 12; continue $sw8;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if ($ON_ENTER_TOGGLE == false) { $pc8 = 6; continue $sw8; }
                        try {
                            abcd.wu.j6(1935069331307891220L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 8; continue $sw8;
                        }
                        $pc8 = 6; continue $sw8;
                    }
                    case 6: {
                        return this.isVisible;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        protected abstract void onClick();

        @abcd.Interfacesu(method = -2261405046464348904L)
        public void onDestroy() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex9 = null;
            int $pc9 = 4;
            $sw9: while (true) {
                switch ($pc9) {
                    case 11: {
                        th = $ex9;
                        if ($ON_THROW_TOGGLE == false) { $pc9 = 15; continue $sw9; }
                        abcd.wu.j6(th, -126735706075272151L, this);
                        $pc9 = 15; continue $sw9;
                    }
                    case 15: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if ($ON_ENTER_TOGGLE == false) { $pc9 = 7; continue $sw9; }
                        try {
                            abcd.wu.j6(-126735706075272151L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 11; continue $sw9;
                        }
                        $pc9 = 7; continue $sw9;
                    }
                    case 7: {
                        if (this.removeTimer != null) { $pc9 = 9; continue $sw9; }
                        return;
                    }
                    case 9: {
                        try {
                            this.removeTimer.cancel();
                            this.removeTimer = null;
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 11; continue $sw9;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        protected abstract void onDraggedTo(int r1, int r2);

        @abcd.Interfacesu(method = -167354218903133531L)
        public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
            int r2 = 0;
            int r5 = 0;
            com.aide.ui.views.CodeEditText.c r6 = null;
            int r7 = 0;
            int r8 = 0;
            int r9 = 0;
            int r10 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex10 = null;
            int $pc10 = 4;
            $sw10: while (true) {
                switch ($pc10) {
                    case 22: {
                        th = $ex10;
                        if ($ON_THROW_TOGGLE == false) { $pc10 = 26; continue $sw10; }
                        abcd.wu.j6(th, -6590904509522344112L, this, r12);
                        $pc10 = 26; continue $sw10;
                    }
                    case 26: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if ($ON_ENTER_TOGGLE == false) { $pc10 = 7; continue $sw10; }
                        try {
                            abcd.wu.j6(-6590904509522344112L, this, r12);
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 22; continue $sw10;
                        }
                        $pc10 = 7; continue $sw10;
                    }
                    case 7: {
                        if (this.isVisible == true) { $pc10 = 9; continue $sw10; }
                        $pc10 = 18; continue $sw10;
                    }
                    case 18: {
                        if (this.dragIsActive == false) { $pc10 = 21; continue $sw10; }
                        return true;
                    }
                    case 21: {
                        return false;
                    }
                    case 9: {
                        if (r12.getActionMasked() != 0) { $pc10 = 18; continue $sw10; }
                        if (r12.getPointerCount() != 1) { $pc10 = 18; continue $sw10; }
                        try {
                            r2 = (int) r12.getX(0);
                            r5 = (int) r12.getY(0);
                            r6 = com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0);
                            r7 = r6.DW(getLine());
                            r8 = getColumn();
                            r9 = (int) (r6.FH(r7) - com.aide.ui.views.CodeEditTextScrollView.Hw(this.this$0));
                            r10 = (int) (r6.j6(r8, r7) - com.aide.ui.views.CodeEditTextScrollView.DW(this.this$0).getScrollX());
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 22; continue $sw10;
                        }
                        if (getHandleRect(r10, r9).contains(r2, r5) == false) { $pc10 = 18; continue $sw10; }
                        try {
                            this.dragIsActive = true;
                            this.isDown = true;
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 22; continue $sw10;
                        }
                        if (this.removeTimerTask == null) { $pc10 = 17; continue $sw10; }
                        try {
                            this.removeTimerTask.cancel();
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 22; continue $sw10;
                        }
                        $pc10 = 17; continue $sw10;
                    }
                    case 17: {
                        try {
                            this.dragDX = r2 - (r10 + ((int) com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0).getSpaceCharWidth()));
                            this.dragDY = r5 - (r9 + (((int) com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0).getFontHeight()) / 2));
                            this.this$0.invalidate();
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 22; continue $sw10;
                        }
                        { $pc10 = 18; continue $sw10; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = 2723909635789114295L)
        public boolean onTouchEvent(android.view.MotionEvent r18) {
            float r0 = 0.0f;
            float r7 = 0.0f;
            float r1 = 0.0f;
            float r8 = 0.0f;
            int r10 = 0;
            int r11 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex11 = null;
            int $pc11 = 4;
            $sw11: while (true) {
                switch ($pc11) {
                    case 26: {
                        th = $ex11;
                        if ($ON_THROW_TOGGLE == false) { $pc11 = 30; continue $sw11; }
                        abcd.wu.j6(th, 663380321676964048L, this, r18);
                        $pc11 = 30; continue $sw11;
                    }
                    case 30: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if ($ON_ENTER_TOGGLE == false) { $pc11 = 7; continue $sw11; }
                        try {
                            abcd.wu.j6(663380321676964048L, this, r18);
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 26; continue $sw11;
                        }
                        $pc11 = 7; continue $sw11;
                    }
                    case 7: {
                        if (this.dragIsActive == true) { $pc11 = 10; continue $sw11; }
                        return false;
                    }
                    case 10: {
                        if (r18.getAction() != 1) { $pc11 = 15; continue $sw11; }
                        try {
                            this.dragIsActive = false;
                            scheduleRemoveCaretHandle();
                            this.this$0.invalidate();
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 26; continue $sw11;
                        }
                        if (this.isDown == false) { $pc11 = 15; continue $sw11; }
                        try {
                            onClick();
                            this.isDown = false;
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 26; continue $sw11;
                        }
                        $pc11 = 15; continue $sw11;
                    }
                    case 15: {
                        if (r18.getAction() != 2) { $pc11 = 25; continue $sw11; }
                        try {
                            r0 = r18.getX(0);
                            r7 = r18.getY(0);
                            r1 = (r0 - this.dragDX) + com.aide.ui.views.CodeEditTextScrollView.DW(this.this$0).getScrollX();
                            r8 = (r7 - this.dragDY) + com.aide.ui.views.CodeEditTextScrollView.Hw(this.this$0);
                            r10 = com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0).FH(r1, r8);
                            r11 = com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0).DW(r1, r8);
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 26; continue $sw11;
                        }
                        if (r10 == getLine()) { $pc11 = 19; continue $sw11; }
                        $pc11 = 32; continue $sw11;
                    }
                    case 32: {
                        try {
                            com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0, true);
                            onDraggedTo(r10, r11);
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 22; continue $sw11;
                        }
                        try {
                            com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0, false);
                            this.this$0.invalidate();
                            com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0, r10, r11, 1, 3, getScrollPaddingBottom(), 3, true);
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 26; continue $sw11;
                        }
                        { $pc11 = 25; continue $sw11; }
                    }
                    case 22: {
                        th = $ex11;
                        try {
                            com.aide.ui.views.CodeEditTextScrollView.j6(this.this$0, false);
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex11 = $t;
                            $pc11 = 26; continue $sw11;
                        }
                    }
                    case 19: {
                        if (r11 != getColumn()) { $pc11 = 32; continue $sw11; }
                        $pc11 = 25; continue $sw11;
                    }
                    case 25: {
                        return true;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = -1524084196227931936L)
        public void setBounce(float r5) {
            android.graphics.Rect r2 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex12 = null;
            int $pc12 = 4;
            $sw12: while (true) {
                switch ($pc12) {
                    case 8: {
                        th = $ex12;
                        if ($ON_THROW_TOGGLE == false) { $pc12 = 12; continue $sw12; }
                        abcd.wu.j6(th, 693917310946914405L, this, new java.lang.Float(r5));
                        $pc12 = 12; continue $sw12;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if ($ON_ENTER_TOGGLE == false) { $pc12 = 6; continue $sw12; }
                        try {
                            abcd.wu.j6(693917310946914405L, this, new java.lang.Float(r5));
                        } catch (java.lang.Throwable $t) {
                            $ex12 = $t;
                            $pc12 = 8; continue $sw12;
                        }
                        $pc12 = 6; continue $sw12;
                    }
                    case 6: {
                        try {
                            this.bounce = r5;
                            r2 = getHandleRectInWindow();
                            r2.right += 100;
                            this.this$0.invalidate(r2);
                        } catch (java.lang.Throwable $t) {
                            $ex12 = $t;
                            $pc12 = 8; continue $sw12;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = -2040008886390719160L)
        public void show() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex13 = null;
            int $pc13 = 4;
            $sw13: while (true) {
                switch ($pc13) {
                    case 8: {
                        th = $ex13;
                        if ($ON_THROW_TOGGLE == false) { $pc13 = 12; continue $sw13; }
                        abcd.wu.j6(th, -1230711725589006885L, this);
                        $pc13 = 12; continue $sw13;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if ($ON_ENTER_TOGGLE == false) { $pc13 = 6; continue $sw13; }
                        try {
                            abcd.wu.j6(-1230711725589006885L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex13 = $t;
                            $pc13 = 8; continue $sw13;
                        }
                        $pc13 = 6; continue $sw13;
                    }
                    case 6: {
                        try {
                            this.isVisible = true;
                            this.this$0.invalidate();
                            scheduleRemoveCaretHandle();
                        } catch (java.lang.Throwable $t) {
                            $ex13 = $t;
                            $pc13 = 8; continue $sw13;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            float r2 = 0.0f;
            android.animation.ObjectAnimator r4 = null;
            long r8 = 0L;
            android.animation.ObjectAnimator r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex14 = null;
            int $pc14 = 4;
            $sw14: while (true) {
                switch ($pc14) {
                    case 8: {
                        th = $ex14;
                        if ($ON_THROW_TOGGLE == false) { $pc14 = 12; continue $sw14; }
                        abcd.wu.j6(th, -3079939322879754912L, null, r13, new java.lang.Integer(r14));
                        $pc14 = 12; continue $sw14;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if ($ON_ENTER_TOGGLE == false) { $pc14 = 6; continue $sw14; }
                        try {
                            abcd.wu.j6(-3079939322879754912L, null, r13, new java.lang.Integer(r14));
                        } catch (java.lang.Throwable $t) {
                            $ex14 = $t;
                            $pc14 = 8; continue $sw14;
                        }
                        $pc14 = 6; continue $sw14;
                    }
                    case 6: {
                        try {
                            this.this$0 = r13;
                            super(r13, r13.getResources().getDrawable(r14), r13.getResources().getDrawable(com.almlkaide.kaypro.R.drawable.task_arrow_down), 0.0f, 0.5f, 0.0f, 0.5f, 10000000);
                            r2 = r13.getResources().getDisplayMetrics().density * 15.0f;
                            r4 = android.animation.ObjectAnimator.ofFloat(this, "bounce", new float[]{r2, 0.0f});
                        } catch (java.lang.Throwable $t) {
                            $ex14 = $t;
                            $pc14 = 8; continue $sw14;
                        }
                        r8 = 300;
                        try {
                            r4.setDuration(r8);
                            r4.setInterpolator(new android.view.animation.AccelerateInterpolator());
                            r0 = android.animation.ObjectAnimator.ofFloat(this, "bounce", new float[]{0.0f, r2});
                            r0.setDuration(r8);
                            r0.setInterpolator(new android.view.animation.DecelerateInterpolator());
                            this.FH = new android.animation.AnimatorSet();
                            this.FH.play(r4).before(r0);
                            this.FH.addListener(new com.aide.ui.views.o(this, r13));
                        } catch (java.lang.Throwable $t) {
                            $ex14 = $t;
                            $pc14 = 8; continue $sw14;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        static boolean j6(com.aide.ui.views.CodeEditTextScrollView.a r0) {
            return r0.Hw;
        }

        @Override
        @abcd.Interfacesu(method = -288686819507198543L)
        protected int getColumn() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex15 = null;
            int $pc15 = 4;
            $sw15: while (true) {
                switch ($pc15) {
                    case 8: {
                        th = $ex15;
                        if ($ON_THROW_TOGGLE == false) { $pc15 = 12; continue $sw15; }
                        abcd.wu.j6(th, 3578817585224010459L, this);
                        $pc15 = 12; continue $sw15;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if ($ON_ENTER_TOGGLE == false) { $pc15 = 6; continue $sw15; }
                        try {
                            abcd.wu.j6(3578817585224010459L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex15 = $t;
                            $pc15 = 8; continue $sw15;
                        }
                        $pc15 = 6; continue $sw15;
                    }
                    case 6: {
                        return this.DW;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = -1970210481229543095L)
        protected int getLine() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex16 = null;
            int $pc16 = 4;
            $sw16: while (true) {
                switch ($pc16) {
                    case 8: {
                        th = $ex16;
                        if ($ON_THROW_TOGGLE == false) { $pc16 = 12; continue $sw16; }
                        abcd.wu.j6(th, 1993853182042517823L, this);
                        $pc16 = 12; continue $sw16;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if ($ON_ENTER_TOGGLE == false) { $pc16 = 6; continue $sw16; }
                        try {
                            abcd.wu.j6(1993853182042517823L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 8; continue $sw16;
                        }
                        $pc16 = 6; continue $sw16;
                    }
                    case 6: {
                        return this.j6;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @abcd.Interfacesu(method = -1735670132558355552L)
        public void j6(int r8, int r9) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex17 = null;
            int $pc17 = 3;
            $sw17: while (true) {
                switch ($pc17) {
                    case 7: {
                        th = $ex17;
                        if ($ON_THROW_TOGGLE == false) { $pc17 = 11; continue $sw17; }
                        abcd.wu.j6(th, 6458456293962116580L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                        $pc17 = 11; continue $sw17;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if ($ON_ENTER_TOGGLE == false) { $pc17 = 5; continue $sw17; }
                        try {
                            abcd.wu.j6(6458456293962116580L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                        } catch (java.lang.Throwable $t) {
                            $ex17 = $t;
                            $pc17 = 7; continue $sw17;
                        }
                        $pc17 = 5; continue $sw17;
                    }
                    case 5: {
                        try {
                            this.j6 = r8;
                            this.DW = r9;
                            show();
                        } catch (java.lang.Throwable $t) {
                            $ex17 = $t;
                            $pc17 = 7; continue $sw17;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = -3528468877265125024L)
        protected void onClick() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex18 = null;
            int $pc18 = 4;
            $sw18: while (true) {
                switch ($pc18) {
                    case 8: {
                        th = $ex18;
                        if ($ON_THROW_TOGGLE == false) { $pc18 = 12; continue $sw18; }
                        abcd.wu.j6(th, 547404701557526484L, this);
                        $pc18 = 12; continue $sw18;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if ($ON_ENTER_TOGGLE == false) { $pc18 = 6; continue $sw18; }
                        try {
                            abcd.wu.j6(547404701557526484L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex18 = $t;
                            $pc18 = 8; continue $sw18;
                        }
                        $pc18 = 6; continue $sw18;
                    }
                    case 6: {
                        try {
                            com.aide.ui.views.CodeEditTextScrollView.FH(this.this$0).v5(this.j6, this.DW);
                            this.Hw = true;
                            this.this$0.j6(this.j6, this.DW, com.aide.ui.views.CodeEditTextScrollView.FH(this.this$0).getDefaultFontSize(), new com.aide.ui.views.p(this));
                        } catch (java.lang.Throwable $t) {
                            $ex18 = $t;
                            $pc18 = 8; continue $sw18;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = -226910953330826531L)
        protected void onDraggedTo(int r8, int r9) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex19 = null;
            int $pc19 = 3;
            $sw19: while (true) {
                switch ($pc19) {
                    case 6: {
                        th = $ex19;
                        if ($ON_THROW_TOGGLE == false) { $pc19 = 10; continue $sw19; }
                        abcd.wu.j6(th, 415757008082571435L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                        $pc19 = 10; continue $sw19;
                    }
                    case 10: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if ($ON_ENTER_TOGGLE == false) { $pc19 = 13; continue $sw19; }
                        try {
                            abcd.wu.j6(415757008082571435L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                        } catch (java.lang.Throwable $t) {
                            $ex19 = $t;
                            $pc19 = 6; continue $sw19;
                        }
                        return;
                    }
                    case 13: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = 280123017355167668L)
        public void show() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex20 = null;
            int $pc20 = 4;
            $sw20: while (true) {
                switch ($pc20) {
                    case 10: {
                        th = $ex20;
                        if ($ON_THROW_TOGGLE == false) { $pc20 = 14; continue $sw20; }
                        abcd.wu.j6(th, 2363674855950633088L, this);
                        $pc20 = 14; continue $sw20;
                    }
                    case 14: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if ($ON_ENTER_TOGGLE == false) { $pc20 = 6; continue $sw20; }
                        try {
                            abcd.wu.j6(2363674855950633088L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 10; continue $sw20;
                        }
                        $pc20 = 6; continue $sw20;
                    }
                    case 6: {
                        try {
                            super.show();
                            this.Hw = false;
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 10; continue $sw20;
                        }
                        if (this.FH.isRunning() == true) { $pc20 = 17; continue $sw20; }
                        try {
                            this.FH.start();
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 10; continue $sw20;
                        }
                        return;
                    }
                    case 17: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    try {
                        abcd.wu.j6(com.aide.ui.views.CodeEditTextScrollView.class, 1527178060401062972L, 1527178060401062972L);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 8; continue $sw21;
                    }
                    if (DW == false) { $pc21 = 6; continue $sw21; }
                    try {
                        abcd.wu.j6(-475698478596560700L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 8; continue $sw21;
                    }
                    $pc21 = 6; continue $sw21;
                }
                case 6: {
                    try {
                        j6 = false;
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 8; continue $sw21;
                    }
                    return;
                }
                case 8: {
                    th = $ex21;
                    if (FH == false) { $pc21 = 12; continue $sw21; }
                    abcd.wu.j6(th, -475698478596560700L, null);
                    $pc21 = 12; continue $sw21;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public CodeEditTextScrollView(android.content.Context r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = 4;
        $sw22: while (true) {
            switch ($pc22) {
                case 8: {
                    th = $ex22;
                    if (FH == false) { $pc22 = 12; continue $sw22; }
                    abcd.wu.j6(th, -144329535800566721L, null, r6);
                    $pc22 = 12; continue $sw22;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc22 = 6; continue $sw22; }
                    try {
                        abcd.wu.j6(-144329535800566721L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 8; continue $sw22;
                    }
                    $pc22 = 6; continue $sw22;
                }
                case 6: {
                    try {
                        super(r6);
                        Hw(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 8; continue $sw22;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public CodeEditTextScrollView(android.content.Context r8, android.util.AttributeSet r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = 3;
        $sw23: while (true) {
            switch ($pc23) {
                case 7: {
                    th = $ex23;
                    if (FH == false) { $pc23 = 11; continue $sw23; }
                    abcd.wu.j6(th, -2654919397556896704L, null, r8, r9);
                    $pc23 = 11; continue $sw23;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc23 = 5; continue $sw23; }
                    try {
                        abcd.wu.j6(-2654919397556896704L, null, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 7; continue $sw23;
                    }
                    $pc23 = 5; continue $sw23;
                }
                case 5: {
                    try {
                        super(r8, r9);
                        Hw(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 7; continue $sw23;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public CodeEditTextScrollView(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = 3;
        $sw24: while (true) {
            switch ($pc24) {
                case 7: {
                    th = $ex24;
                    if (FH == false) { $pc24 = 11; continue $sw24; }
                    abcd.wu.j6(th, -527739599459916723L, null, r9, r10, new java.lang.Integer(r11));
                    $pc24 = 11; continue $sw24;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc24 = 5; continue $sw24; }
                    try {
                        abcd.wu.j6(-527739599459916723L, null, r9, r10, new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 7; continue $sw24;
                    }
                    $pc24 = 5; continue $sw24;
                }
                case 5: {
                    try {
                        super(r9, r10, r11);
                        Hw(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 7; continue $sw24;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int DW(com.aide.ui.views.CodeEditTextScrollView r0, boolean r1) {
        return r0.DW(r1);
    }

    @abcd.Interfacesu(method = 1528512136903595808L)
    private int DW(boolean r5) {
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex25 = null;
        int $pc25 = 4;
        $sw25: while (true) {
            switch ($pc25) {
                case 13: {
                    th = $ex25;
                    if (FH == false) { $pc25 = 17; continue $sw25; }
                    abcd.wu.j6(th, -5981518338966208875L, this, new java.lang.Boolean(r5));
                    $pc25 = 17; continue $sw25;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc25 = 6; continue $sw25; }
                    try {
                        abcd.wu.j6(-5981518338966208875L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 13; continue $sw25;
                    }
                    $pc25 = 6; continue $sw25;
                }
                case 6: {
                    try {
                        r2 = getMeasuredHeight();
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 13; continue $sw25;
                    }
                    if (r5 == false) { $pc25 = 9; continue $sw25; }
                    r3 = 0;
                    $pc25 = 10; continue $sw25;
                }
                case 10: {
                    return (int) ((r2 - r3) / getOEditorView().getFontHeight());
                }
                case 9: {
                    try {
                        r3 = getQuickKeyBarHeight();
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 13; continue $sw25;
                    }
                    { $pc25 = 10; continue $sw25; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -987704618367579849L)
    private static android.graphics.drawable.Drawable DW(android.content.Context r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = 4;
        $sw26: while (true) {
            switch ($pc26) {
                case 12: {
                    th = $ex26;
                    if (FH == false) { $pc26 = 16; continue $sw26; }
                    abcd.wu.j6(th, -1083360095301203720L, null, r5);
                    $pc26 = 16; continue $sw26;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc26 = 7; continue $sw26; }
                    try {
                        abcd.wu.j6(-1083360095301203720L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 12; continue $sw26;
                    }
                    $pc26 = 7; continue $sw26;
                }
                case 7: {
                    if (com.aide.common.ClassG.QX(r5) == false) { $pc26 = 11; continue $sw26; }
                    return com.aide.common.ClassG.j6(r5, 16843463, 16843829);
                }
                case 11: {
                    return r5.getResources().getDrawable(com.almlkaide.kaypro.R.drawable.text_select_handle_middle);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static android.widget.HorizontalScrollView DW(com.aide.ui.views.CodeEditTextScrollView r0) {
        return r0.getHorizontalScrollView();
    }

    @abcd.Interfacesu(method = 708264271801242324L)
    private void DW(int r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex27 = null;
        int $pc27 = 3;
        $sw27: while (true) {
            switch ($pc27) {
                case 7: {
                    th = $ex27;
                    if (FH == false) { $pc27 = 11; continue $sw27; }
                    abcd.wu.j6(th, -927914807885282525L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc27 = 11; continue $sw27;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc27 = 5; continue $sw27; }
                    try {
                        abcd.wu.j6(-927914807885282525L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 7; continue $sw27;
                    }
                    $pc27 = 5; continue $sw27;
                }
                case 5: {
                    try {
                        scrollTo(getScrollX(), getHeaderHeight() + r9);
                        getHorizontalScrollView().scrollTo(r8, getScrollY());
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 7; continue $sw27;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 595984940950504320L)
    private void DW(android.view.MotionEvent r7) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex28 = null;
        int $pc28 = 4;
        $sw28: while (true) {
            switch ($pc28) {
                case 8: {
                    th = $ex28;
                    if (FH == false) { $pc28 = 12; continue $sw28; }
                    abcd.wu.j6(th, -241321454738952399L, this, r7);
                    $pc28 = 12; continue $sw28;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc28 = 6; continue $sw28; }
                    try {
                        abcd.wu.j6(-241321454738952399L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 8; continue $sw28;
                    }
                    $pc28 = 6; continue $sw28;
                }
                case 6: {
                    try {
                        setPinchZoom(j6(r7.getX(0), r7.getY(0), r7.getX(1), r7.getY(1)) / this.v5);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 8; continue $sw28;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 5627145497590440024L)
    private void EQ() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex29 = null;
        int $pc29 = 4;
        $sw29: while (true) {
            switch ($pc29) {
                case 8: {
                    th = $ex29;
                    if (FH == false) { $pc29 = 12; continue $sw29; }
                    abcd.wu.j6(th, 342765843365982825L, this);
                    $pc29 = 12; continue $sw29;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc29 = 6; continue $sw29; }
                    try {
                        abcd.wu.j6(342765843365982825L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 8; continue $sw29;
                    }
                    $pc29 = 6; continue $sw29;
                }
                case 6: {
                    try {
                        scrollTo(getScrollX(), 0);
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 8; continue $sw29;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1301334676094462328L)
    private static android.graphics.drawable.Drawable FH(android.content.Context r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex30 = null;
        int $pc30 = 4;
        $sw30: while (true) {
            switch ($pc30) {
                case 12: {
                    th = $ex30;
                    if (FH == false) { $pc30 = 16; continue $sw30; }
                    abcd.wu.j6(th, 893146395366562221L, null, r5);
                    $pc30 = 16; continue $sw30;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc30 = 7; continue $sw30; }
                    try {
                        abcd.wu.j6(893146395366562221L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 12; continue $sw30;
                    }
                    $pc30 = 7; continue $sw30;
                }
                case 7: {
                    if (com.aide.common.ClassG.QX(r5) == false) { $pc30 = 11; continue $sw30; }
                    return com.aide.common.ClassG.j6(r5, 16843462, 16843829);
                }
                case 11: {
                    return r5.getResources().getDrawable(com.almlkaide.kaypro.R.drawable.text_select_handle_right);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static com.aide.ui.views.CodeEditText FH(com.aide.ui.views.CodeEditTextScrollView r0) {
        return r0.getCodeEditText();
    }

    @abcd.Interfacesu(method = 581457980638784012L)
    private void FH(android.view.MotionEvent r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex31 = null;
        int $pc31 = 4;
        $sw31: while (true) {
            switch ($pc31) {
                case 8: {
                    th = $ex31;
                    if (FH == false) { $pc31 = 12; continue $sw31; }
                    abcd.wu.j6(th, 1174754900676382263L, this, r9);
                    $pc31 = 12; continue $sw31;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc31 = 6; continue $sw31; }
                    try {
                        abcd.wu.j6(1174754900676382263L, this, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 8; continue $sw31;
                    }
                    $pc31 = 6; continue $sw31;
                }
                case 6: {
                    try {
                        this.Hw = true;
                        this.v5 = j6(r9.getX(0), r9.getY(0), r9.getX(1), r9.getY(1));
                        j6((r9.getX(1) + r9.getX(0)) / 2.0f, ((r9.getY(1) + r9.getY(0)) / 2.0f) - getHeaderHeight());
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 8; continue $sw31;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int Hw(com.aide.ui.views.CodeEditTextScrollView r0) {
        return r0.getScrollLineY();
    }

    @abcd.Interfacesu(method = -8312533657135587840L)
    private void Hw(android.content.Context r17) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex32 = null;
        int $pc32 = 4;
        $sw32: while (true) {
            switch ($pc32) {
                case 8: {
                    th = $ex32;
                    if (FH == false) { $pc32 = 12; continue $sw32; }
                    abcd.wu.j6(th, -7118633949076527143L, this, r17);
                    $pc32 = 12; continue $sw32;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc32 = 6; continue $sw32; }
                    try {
                        abcd.wu.j6(-7118633949076527143L, this, r17);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 8; continue $sw32;
                    }
                    $pc32 = 6; continue $sw32;
                }
                case 6: {
                    try {
                        setFocusable(false);
                        this.Ws = new com.aide.ui.views.CodeEditTextScrollView.a(this, com.almlkaide.kaypro.R.drawable.task_arrow_edit);
                        this.QX = new com.aide.ui.views.CodeEditTextScrollView.a(this, com.almlkaide.kaypro.R.drawable.task_arrow_view);
                        this.we = new com.aide.ui.views.f(this, DW(r17), DW(r17), 0.5f, 0.0f, 0.0f, 0.0f, 3000);
                        this.J0 = new com.aide.ui.views.g(this, j6(r17), j6(r17), 0.8f, 0.0f, 0.0f, 0.0f, 10000000);
                        this.J8 = new com.aide.ui.views.h(this, FH(r17), FH(r17), 0.2f, 0.0f, 0.0f, 0.0f, 10000000);
                        this.XL = new com.aide.ui.views.CodeEditTextScrollView.DragHandle[]{this.Ws, this.QX, this.we, this.J0, this.J8};
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 8; continue $sw32;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -3494905909466639460L)
    private void Hw(android.view.MotionEvent r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex33 = null;
        int $pc33 = 4;
        $sw33: while (true) {
            switch ($pc33) {
                case 8: {
                    th = $ex33;
                    if (FH == false) { $pc33 = 12; continue $sw33; }
                    abcd.wu.j6(th, -972316685052552699L, this, r5);
                    $pc33 = 12; continue $sw33;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc33 = 6; continue $sw33; }
                    try {
                        abcd.wu.j6(-972316685052552699L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex33 = $t;
                        $pc33 = 8; continue $sw33;
                    }
                    $pc33 = 6; continue $sw33;
                }
                case 6: {
                    try {
                        this.Hw = false;
                    } catch (java.lang.Throwable $t) {
                        $ex33 = $t;
                        $pc33 = 8; continue $sw33;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 4955096568660707061L)
    private void J0() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex34 = null;
        int $pc34 = 4;
        $sw34: while (true) {
            switch ($pc34) {
                case 8: {
                    th = $ex34;
                    if (FH == false) { $pc34 = 12; continue $sw34; }
                    abcd.wu.j6(th, -7431934967343056400L, this);
                    $pc34 = 12; continue $sw34;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc34 = 6; continue $sw34; }
                    try {
                        abcd.wu.j6(-7431934967343056400L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        $pc34 = 8; continue $sw34;
                    }
                    $pc34 = 6; continue $sw34;
                }
                case 6: {
                    try {
                        this.we.hide();
                        this.J0.show();
                        this.J8.show();
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        $pc34 = 8; continue $sw34;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 5648103315095556183L)
    private com.aide.ui.views.CodeEditText getCodeEditText() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex35 = null;
        int $pc35 = 4;
        $sw35: while (true) {
            switch ($pc35) {
                case 8: {
                    th = $ex35;
                    if (FH == false) { $pc35 = 12; continue $sw35; }
                    abcd.wu.j6(th, -5275058033570234000L, this);
                    $pc35 = 12; continue $sw35;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc35 = 6; continue $sw35; }
                    try {
                        abcd.wu.j6(-5275058033570234000L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex35 = $t;
                        $pc35 = 8; continue $sw35;
                    }
                    $pc35 = 6; continue $sw35;
                }
                case 6: {
                    return (com.aide.ui.views.CodeEditText) ((android.view.ViewGroup) ((android.view.ViewGroup) getChildAt(0)).getChildAt(0)).getChildAt(1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 5145282606432342379L)
    private int getHeaderHeight() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex36 = null;
        int $pc36 = 4;
        $sw36: while (true) {
            switch ($pc36) {
                case 8: {
                    th = $ex36;
                    if (FH == false) { $pc36 = 12; continue $sw36; }
                    abcd.wu.j6(th, 5576183149537000280L, this);
                    $pc36 = 12; continue $sw36;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc36 = 6; continue $sw36; }
                    try {
                        abcd.wu.j6(5576183149537000280L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex36 = $t;
                        $pc36 = 8; continue $sw36;
                    }
                    $pc36 = 6; continue $sw36;
                }
                case 6: {
                    return getHeaderView().getMeasuredHeight();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -495001565222488821L)
    private android.widget.HorizontalScrollView getHorizontalScrollView() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex37 = null;
        int $pc37 = 4;
        $sw37: while (true) {
            switch ($pc37) {
                case 8: {
                    th = $ex37;
                    if (FH == false) { $pc37 = 12; continue $sw37; }
                    abcd.wu.j6(th, -49818037403709800L, this);
                    $pc37 = 12; continue $sw37;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc37 = 6; continue $sw37; }
                    try {
                        abcd.wu.j6(-49818037403709800L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex37 = $t;
                        $pc37 = 8; continue $sw37;
                    }
                    $pc37 = 6; continue $sw37;
                }
                case 6: {
                    return (android.widget.HorizontalScrollView) getChildAt(0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -543603598293049320L)
    private com.aide.ui.views.CodeEditText.c getOEditorView() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex38 = null;
        int $pc38 = 4;
        $sw38: while (true) {
            switch ($pc38) {
                case 8: {
                    th = $ex38;
                    if (FH == false) { $pc38 = 12; continue $sw38; }
                    abcd.wu.j6(th, -5267839568939873659L, this);
                    $pc38 = 12; continue $sw38;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc38 = 6; continue $sw38; }
                    try {
                        abcd.wu.j6(-5267839568939873659L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex38 = $t;
                        $pc38 = 8; continue $sw38;
                    }
                    $pc38 = 6; continue $sw38;
                }
                case 6: {
                    return getCodeEditText().getOEditorView();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 704650270669961809L)
    private int getQuickKeyBarHeight() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex39 = null;
        int $pc39 = 4;
        $sw39: while (true) {
            switch ($pc39) {
                case 8: {
                    th = $ex39;
                    if (FH == false) { $pc39 = 12; continue $sw39; }
                    abcd.wu.j6(th, 4245123115382937664L, this);
                    $pc39 = 12; continue $sw39;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc39 = 6; continue $sw39; }
                    try {
                        abcd.wu.j6(4245123115382937664L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex39 = $t;
                        $pc39 = 8; continue $sw39;
                    }
                    $pc39 = 6; continue $sw39;
                }
                case 6: {
                    return getCodeEditText().getQuickKeyBarHeight();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 5350686634205572753L)
    private int getScreenLinesCount() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex40 = null;
        int $pc40 = 4;
        $sw40: while (true) {
            switch ($pc40) {
                case 9: {
                    th = $ex40;
                    if (FH == false) { $pc40 = 13; continue $sw40; }
                    abcd.wu.j6(th, 6507663914319915636L, this);
                    $pc40 = 13; continue $sw40;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc40 = 6; continue $sw40; }
                    try {
                        abcd.wu.j6(6507663914319915636L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex40 = $t;
                        $pc40 = 9; continue $sw40;
                    }
                    $pc40 = 6; continue $sw40;
                }
                case 6: {
                    return (int) ((((android.app.Activity) getContext()).getWindow().getDecorView().findViewById(16908290).getHeight() - getQuickKeyBarHeight()) / getOEditorView().getFontHeight());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -299277202735494160L)
    private int getScrollColumnX() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex41 = null;
        int $pc41 = 4;
        $sw41: while (true) {
            switch ($pc41) {
                case 8: {
                    th = $ex41;
                    if (FH == false) { $pc41 = 12; continue $sw41; }
                    abcd.wu.j6(th, 3392355497451378261L, this);
                    $pc41 = 12; continue $sw41;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc41 = 6; continue $sw41; }
                    try {
                        abcd.wu.j6(3392355497451378261L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex41 = $t;
                        $pc41 = 8; continue $sw41;
                    }
                    $pc41 = 6; continue $sw41;
                }
                case 6: {
                    return getHorizontalScrollView().getScrollX();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2806826514580735237L)
    private int getScrollLineY() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex42 = null;
        int $pc42 = 4;
        $sw42: while (true) {
            switch ($pc42) {
                case 9: {
                    th = $ex42;
                    if (FH == false) { $pc42 = 13; continue $sw42; }
                    abcd.wu.j6(th, -2231192923430531040L, this);
                    $pc42 = 13; continue $sw42;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc42 = 6; continue $sw42; }
                    try {
                        abcd.wu.j6(-2231192923430531040L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex42 = $t;
                        $pc42 = 9; continue $sw42;
                    }
                    $pc42 = 6; continue $sw42;
                }
                case 6: {
                    return getScrollY() - getHeaderHeight();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 47602948224727609L)
    private int getVisibleColumnsCount() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex43 = null;
        int $pc43 = 4;
        $sw43: while (true) {
            switch ($pc43) {
                case 9: {
                    th = $ex43;
                    if (FH == false) { $pc43 = 13; continue $sw43; }
                    abcd.wu.j6(th, -5997327906327912280L, this);
                    $pc43 = 13; continue $sw43;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc43 = 6; continue $sw43; }
                    try {
                        abcd.wu.j6(-5997327906327912280L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex43 = $t;
                        $pc43 = 9; continue $sw43;
                    }
                    $pc43 = 6; continue $sw43;
                }
                case 6: {
                    return (int) (getMeasuredWidth() / getOEditorView().getSpaceCharWidth());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2610531802265983484L)
    private float j6(float r10, float r11, float r12, float r13) {
        float r0 = 0.0f;
        float r1 = 0.0f;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex44 = null;
        int $pc44 = 3;
        $sw44: while (true) {
            switch ($pc44) {
                case 8: {
                    th = $ex44;
                    if (FH == false) { $pc44 = 12; continue $sw44; }
                    abcd.wu.j6(th, 1203131895963499829L, this, new java.lang.Float(r10), new java.lang.Float(r11), new java.lang.Float(r12), new java.lang.Float(r13));
                    $pc44 = 12; continue $sw44;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc44 = 5; continue $sw44; }
                    try {
                        abcd.wu.j6(1203131895963499829L, this, new java.lang.Float(r10), new java.lang.Float(r11), new java.lang.Float(r12), new java.lang.Float(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex44 = $t;
                        $pc44 = 8; continue $sw44;
                    }
                    $pc44 = 5; continue $sw44;
                }
                case 5: {
                    try {
                        r0 = r10 - r12;
                        r1 = r11 - r13;
                    } catch (java.lang.Throwable $t) {
                        $ex44 = $t;
                        $pc44 = 8; continue $sw44;
                    }
                    return (float) java.lang.Math.sqrt((r0 * r0) + (r1 * r1));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 651664010401631469L)
    private static android.graphics.drawable.Drawable j6(android.content.Context r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex45 = null;
        int $pc45 = 4;
        $sw45: while (true) {
            switch ($pc45) {
                case 12: {
                    th = $ex45;
                    if (FH == false) { $pc45 = 16; continue $sw45; }
                    abcd.wu.j6(th, 300140386419170272L, null, r5);
                    $pc45 = 16; continue $sw45;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc45 = 7; continue $sw45; }
                    try {
                        abcd.wu.j6(300140386419170272L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex45 = $t;
                        $pc45 = 12; continue $sw45;
                    }
                    $pc45 = 7; continue $sw45;
                }
                case 7: {
                    if (com.aide.common.ClassG.QX(r5) == false) { $pc45 = 11; continue $sw45; }
                    return com.aide.common.ClassG.j6(r5, 16843461, 16843829);
                }
                case 11: {
                    return r5.getResources().getDrawable(com.almlkaide.kaypro.R.drawable.text_select_handle_left);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static com.aide.ui.views.CodeEditText.c j6(com.aide.ui.views.CodeEditTextScrollView r0) {
        return r0.getOEditorView();
    }

    @abcd.Interfacesu(method = -5169331040704775092L)
    private void j6(float r8, float r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex46 = null;
        int $pc46 = 3;
        $sw46: while (true) {
            switch ($pc46) {
                case 7: {
                    th = $ex46;
                    if (FH == false) { $pc46 = 11; continue $sw46; }
                    abcd.wu.j6(th, 965992488433909167L, this, new java.lang.Float(r8), new java.lang.Float(r9));
                    $pc46 = 11; continue $sw46;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc46 = 5; continue $sw46; }
                    try {
                        abcd.wu.j6(965992488433909167L, this, new java.lang.Float(r8), new java.lang.Float(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex46 = $t;
                        $pc46 = 7; continue $sw46;
                    }
                    $pc46 = 5; continue $sw46;
                }
                case 5: {
                    try {
                        this.Zo = r8;
                        this.VH = r9;
                        this.gn = getScrollColumnX();
                        this.u7 = getScrollLineY();
                        getOEditorView().ei();
                    } catch (java.lang.Throwable $t) {
                        $ex46 = $t;
                        $pc46 = 7; continue $sw46;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 4602188157403359000L)
    private boolean j6(int r8, int r9, int r10, int r11, int r12, int r13, boolean r14) {
        com.aide.ui.views.CodeEditText.c r0 = null;
        int r15 = 0;
        int r3 = 0;
        int r4 = 0;
        boolean r16 = false;
        float r17 = 0.0f;
        float r18 = 0.0f;
        float r19 = 0.0f;
        boolean r110 = false;
        float r20 = 0.0f;
        java.lang.Throwable $ex47 = null;
        int $pc47 = -1;
        $sw47: while (true) {
            switch ($pc47) {
                case -1: {
                    if (DW == false) { $pc47 = 5; continue $sw47; }
                    abcd.wu.j6(299976980777671211L, this, new java.lang.Object[]{new java.lang.Integer(r8), new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Boolean(r14)});
                    $pc47 = 5; continue $sw47;
                }
                case 5: {
                    r0 = getOEditorView();
                    r15 = r0.DW(r8);
                    r3 = (getFirstVisibleLine() + r10) - 1;
                    r4 = (j6(r14) - r12) + 1;
                    if (r15 >= r3) { $pc47 = 8; continue $sw47; }
                    r3 = (r15 - r10) + 1;
                    r16 = true;
                    $pc47 = 9; continue $sw47;
                }
                case 9: {
                    if (r15 <= r4) { $pc47 = 11; continue $sw47; }
                    r3 = (r15 - DW(r14)) + r12;
                    r16 = true;
                    $pc47 = 11; continue $sw47;
                }
                case 11: {
                    r17 = getOEditorView().j6(r9, r15);
                    r18 = getHorizontalScrollView().getScrollX();
                    r19 = r17 - (r13 * r0.getSpaceCharWidth());
                    if (r19 >= getHorizontalScrollView().getScrollX()) { $pc47 = 14; continue $sw47; }
                    r110 = true;
                    $pc47 = 15; continue $sw47;
                }
                case 15: {
                    r20 = r17 + (r11 * r0.getSpaceCharWidth());
                    if (r20 <= (getHorizontalScrollView().getScrollX() + getMeasuredWidth())) { $pc47 = 18; continue $sw47; }
                    r19 = r20 - getMeasuredWidth();
                    r110 = true;
                    $pc47 = 18; continue $sw47;
                }
                case 18: {
                    if (r110 == true) { $pc47 = 20; continue $sw47; }
                    if (r16 == true) { $pc47 = 20; continue $sw47; }
                    $pc47 = 28; continue $sw47;
                }
                case 28: {
                    if (r110 == true) { $pc47 = 30; continue $sw47; }
                    if (r16 == true) { $pc47 = 30; continue $sw47; }
                    return false;
                }
                case 30: {
                    return true;
                }
                case 20: {
                    if (r16 == false) { $pc47 = 24; continue $sw47; }
                    if (r3 >= 0) { $pc47 = 23; continue $sw47; }
                    r3 = 0;
                    $pc47 = 23; continue $sw47;
                }
                case 23: {
                    scrollTo(getScrollX(), (int) ((r3 * getOEditorView().getFontHeight()) + getHeaderHeight()));
                    $pc47 = 24; continue $sw47;
                }
                case 24: {
                    if (r110 == false) { $pc47 = 26; continue $sw47; }
                    getHorizontalScrollView().scrollTo((int) r19, getHorizontalScrollView().getScrollY());
                    $pc47 = 26; continue $sw47;
                }
                case 26: {
                    if (r15 > 0) { $pc47 = 28; continue $sw47; }
                    EQ();
                    { $pc47 = 28; continue $sw47; }
                }
                case 14: {
                    r19 = r18;
                    r110 = false;
                    { $pc47 = 15; continue $sw47; }
                }
                case 8: {
                    r16 = false;
                    { $pc47 = 9; continue $sw47; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        float[] r2 = null;
        float r3 = 0.0f;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex48 = null;
        int $pc48 = 4;
        $sw48: while (true) {
            switch ($pc48) {
                case 8: {
                    th = $ex48;
                    if (FH == false) { $pc48 = 12; continue $sw48; }
                    abcd.wu.j6(th, -2161679105275164060L, this, new java.lang.Float(r7));
                    $pc48 = 12; continue $sw48;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc48 = 6; continue $sw48; }
                    try {
                        abcd.wu.j6(-2161679105275164060L, this, new java.lang.Float(r7));
                    } catch (java.lang.Throwable $t) {
                        $ex48 = $t;
                        $pc48 = 8; continue $sw48;
                    }
                    $pc48 = 6; continue $sw48;
                }
                case 6: {
                    try {
                        r2 = getOEditorView().FH(r7);
                        r3 = r2[1];
                        this.tp = ((this.gn + this.Zo) * r2[0]) - this.Zo;
                        this.EQ = ((this.u7 + this.VH) * r3) - this.VH;
                        DW((int) this.tp, (int) this.EQ);
                    } catch (java.lang.Throwable $t) {
                        $ex48 = $t;
                        $pc48 = 8; continue $sw48;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2653967576891868907L)
    private boolean tp() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex49 = null;
        int $pc49 = 4;
        $sw49: while (true) {
            switch ($pc49) {
                case 8: {
                    th = $ex49;
                    if (FH == false) { $pc49 = 12; continue $sw49; }
                    abcd.wu.j6(th, 6340936740444009704L, this);
                    $pc49 = 12; continue $sw49;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc49 = 6; continue $sw49; }
                    try {
                        abcd.wu.j6(6340936740444009704L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex49 = $t;
                        $pc49 = 8; continue $sw49;
                    }
                    $pc49 = 6; continue $sw49;
                }
                case 6: {
                    return com.aide.common.ClassG.J8(getContext());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -94704231011443592L)
    private boolean u7() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex50 = null;
        int $pc50 = 4;
        $sw50: while (true) {
            switch ($pc50) {
                case 8: {
                    th = $ex50;
                    if (FH == false) { $pc50 = 12; continue $sw50; }
                    abcd.wu.j6(th, 110377942879655417L, this);
                    $pc50 = 12; continue $sw50;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc50 = 6; continue $sw50; }
                    try {
                        abcd.wu.j6(110377942879655417L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex50 = $t;
                        $pc50 = 8; continue $sw50;
                    }
                    $pc50 = 6; continue $sw50;
                }
                case 6: {
                    return isHardwareAccelerated();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int v5(com.aide.ui.views.CodeEditTextScrollView r0) {
        return r0.getHeaderHeight();
    }

    @abcd.Interfacesu(method = -5646012300035384075L)
    private void we() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex51 = null;
        int $pc51 = 4;
        $sw51: while (true) {
            switch ($pc51) {
                case 8: {
                    th = $ex51;
                    if (FH == false) { $pc51 = 12; continue $sw51; }
                    abcd.wu.j6(th, -4351332685093462596L, this);
                    $pc51 = 12; continue $sw51;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc51 = 6; continue $sw51; }
                    try {
                        abcd.wu.j6(-4351332685093462596L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex51 = $t;
                        $pc51 = 8; continue $sw51;
                    }
                    $pc51 = 6; continue $sw51;
                }
                case 6: {
                    try {
                        this.we.show();
                        this.J0.hide();
                        this.J8.hide();
                    } catch (java.lang.Throwable $t) {
                        $ex51 = $t;
                        $pc51 = 8; continue $sw51;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex52 = null;
        int $pc52 = 4;
        $sw52: while (true) {
            switch ($pc52) {
                case 12: {
                    th = $ex52;
                    if (FH == false) { $pc52 = 16; continue $sw52; }
                    abcd.wu.j6(th, 1313773977119759732L, this);
                    $pc52 = 16; continue $sw52;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc52 = 7; continue $sw52; }
                    try {
                        abcd.wu.j6(1313773977119759732L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex52 = $t;
                        $pc52 = 12; continue $sw52;
                    }
                    $pc52 = 7; continue $sw52;
                }
                case 7: {
                    if (this.Ws.isVisible() == true) { $pc52 = 9; continue $sw52; }
                    return;
                }
                case 9: {
                    if (getOEditorView().getCaretLine() == this.Ws.getLine()) { $pc52 = 20; continue $sw52; }
                    try {
                        getOEditorView().v5(this.Ws.getColumn(), this.Ws.getLine());
                    } catch (java.lang.Throwable $t) {
                        $ex52 = $t;
                        $pc52 = 12; continue $sw52;
                    }
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex53 = null;
        int $pc53 = 4;
        $sw53: while (true) {
            switch ($pc53) {
                case 12: {
                    th = $ex53;
                    if (FH == false) { $pc53 = 16; continue $sw53; }
                    abcd.wu.j6(th, 600342389609366339L, this);
                    $pc53 = 16; continue $sw53;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc53 = 7; continue $sw53; }
                    try {
                        abcd.wu.j6(600342389609366339L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex53 = $t;
                        $pc53 = 12; continue $sw53;
                    }
                    $pc53 = 7; continue $sw53;
                }
                case 7: {
                    if (this.aM == false) { $pc53 = 9; continue $sw53; }
                    return;
                }
                case 9: {
                    if (this.j3 == true) { $pc53 = 20; continue $sw53; }
                    try {
                        this.we.hide();
                        this.J0.hide();
                        this.J8.hide();
                        getCodeEditText().QX();
                    } catch (java.lang.Throwable $t) {
                        $ex53 = $t;
                        $pc53 = 12; continue $sw53;
                    }
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Hw() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex54 = null;
        int $pc54 = 4;
        $sw54: while (true) {
            switch ($pc54) {
                case 8: {
                    th = $ex54;
                    if (FH == false) { $pc54 = 12; continue $sw54; }
                    abcd.wu.j6(th, -294737801319569007L, this);
                    $pc54 = 12; continue $sw54;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc54 = 6; continue $sw54; }
                    try {
                        abcd.wu.j6(-294737801319569007L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex54 = $t;
                        $pc54 = 8; continue $sw54;
                    }
                    $pc54 = 6; continue $sw54;
                }
                case 6: {
                    try {
                        this.QX.hide();
                        this.Ws.hide();
                    } catch (java.lang.Throwable $t) {
                        $ex54 = $t;
                        $pc54 = 8; continue $sw54;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void VH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex55 = null;
        int $pc55 = 4;
        $sw55: while (true) {
            switch ($pc55) {
                case 11: {
                    th = $ex55;
                    if (FH == false) { $pc55 = 15; continue $sw55; }
                    abcd.wu.j6(th, -1485646363710203520L, this);
                    $pc55 = 15; continue $sw55;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc55 = 7; continue $sw55; }
                    try {
                        abcd.wu.j6(-1485646363710203520L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex55 = $t;
                        $pc55 = 11; continue $sw55;
                    }
                    $pc55 = 7; continue $sw55;
                }
                case 7: {
                    if (getOEditorView().J0() == false) { $pc55 = 9; continue $sw55; }
                    try {
                        J0();
                    } catch (java.lang.Throwable $t) {
                        $ex55 = $t;
                        $pc55 = 11; continue $sw55;
                    }
                    return;
                }
                case 9: {
                    try {
                        we();
                    } catch (java.lang.Throwable $t) {
                        $ex55 = $t;
                        $pc55 = 11; continue $sw55;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Zo() {
        com.aide.ui.views.CodeEditTextScrollView.DragHandle[] r2 = null;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex56 = null;
        int $pc56 = 4;
        $sw56: while (true) {
            switch ($pc56) {
                case 11: {
                    th = $ex56;
                    if (FH == false) { $pc56 = 16; continue $sw56; }
                    abcd.wu.j6(th, -1575342579585182947L, this);
                    $pc56 = 16; continue $sw56;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc56 = 6; continue $sw56; }
                    try {
                        abcd.wu.j6(-1575342579585182947L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex56 = $t;
                        $pc56 = 11; continue $sw56;
                    }
                    $pc56 = 6; continue $sw56;
                }
                case 6: {
                    try {
                        r2 = this.XL;
                        r3 = r2.length;
                    } catch (java.lang.Throwable $t) {
                        $ex56 = $t;
                        $pc56 = 11; continue $sw56;
                    }
                    r4 = 0;
                    $pc56 = 7; continue $sw56;
                }
                case 7: {
                    if (r4 >= r3) { $pc56 = 10; continue $sw56; }
                    try {
                        r2[r4].onDestroy();
                    } catch (java.lang.Throwable $t) {
                        $ex56 = $t;
                        $pc56 = 11; continue $sw56;
                    }
                    r4 = r4 + 1;
                    { $pc56 = 7; continue $sw56; }
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -7949025709803866348L)
    protected int computeScrollDeltaToGetChildRectOnScreen(android.graphics.Rect r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex57 = null;
        int $pc57 = 4;
        $sw57: while (true) {
            switch ($pc57) {
                case 12: {
                    th = $ex57;
                    if (FH == false) { $pc57 = 16; continue $sw57; }
                    abcd.wu.j6(th, -6795322529938909407L, this, r5);
                    $pc57 = 16; continue $sw57;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc57 = 7; continue $sw57; }
                    try {
                        abcd.wu.j6(-6795322529938909407L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex57 = $t;
                        $pc57 = 12; continue $sw57;
                    }
                    $pc57 = 7; continue $sw57;
                }
                case 7: {
                    if (tp() == false) { $pc57 = 10; continue $sw57; }
                    return 0;
                }
                case 10: {
                    return super.computeScrollDeltaToGetChildRectOnScreen(r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void draw(android.graphics.Canvas r7) {
        int r2 = 0;
        com.aide.ui.views.CodeEditTextScrollView.DragHandle[] r3 = null;
        int r4 = 0;
        int r5 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex58 = null;
        int $pc58 = 4;
        $sw58: while (true) {
            switch ($pc58) {
                case 11: {
                    th = $ex58;
                    if (FH == false) { $pc58 = 16; continue $sw58; }
                    abcd.wu.j6(th, 322618959802127811L, this, r7);
                    $pc58 = 16; continue $sw58;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc58 = 6; continue $sw58; }
                    try {
                        abcd.wu.j6(322618959802127811L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex58 = $t;
                        $pc58 = 11; continue $sw58;
                    }
                    $pc58 = 6; continue $sw58;
                }
                case 6: {
                    try {
                        r2 = r7.save();
                        super.draw(r7);
                        r7.restoreToCount(r2);
                        r3 = this.XL;
                        r4 = r3.length;
                    } catch (java.lang.Throwable $t) {
                        $ex58 = $t;
                        $pc58 = 11; continue $sw58;
                    }
                    r5 = 0;
                    $pc58 = 7; continue $sw58;
                }
                case 7: {
                    if (r5 >= r4) { $pc58 = 10; continue $sw58; }
                    try {
                        r3[r5].draw(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex58 = $t;
                        $pc58 = 11; continue $sw58;
                    }
                    r5 = r5 + 1;
                    { $pc58 = 7; continue $sw58; }
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int getFirstVisibleLine() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex59 = null;
        int $pc59 = 4;
        $sw59: while (true) {
            switch ($pc59) {
                case 9: {
                    th = $ex59;
                    if (FH == false) { $pc59 = 13; continue $sw59; }
                    abcd.wu.j6(th, 4555712326159824768L, this);
                    $pc59 = 13; continue $sw59;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc59 = 6; continue $sw59; }
                    try {
                        abcd.wu.j6(4555712326159824768L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex59 = $t;
                        $pc59 = 9; continue $sw59;
                    }
                    $pc59 = 6; continue $sw59;
                }
                case 6: {
                    return (int) (getScrollLineY() / getOEditorView().getFontHeight());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public android.view.View getHeaderView() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex60 = null;
        int $pc60 = 4;
        $sw60: while (true) {
            switch ($pc60) {
                case 8: {
                    th = $ex60;
                    if (FH == false) { $pc60 = 12; continue $sw60; }
                    abcd.wu.j6(th, 2078912586998990448L, this);
                    $pc60 = 12; continue $sw60;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc60 = 6; continue $sw60; }
                    try {
                        abcd.wu.j6(2078912586998990448L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex60 = $t;
                        $pc60 = 8; continue $sw60;
                    }
                    $pc60 = 6; continue $sw60;
                }
                case 6: {
                    return ((android.view.ViewGroup) ((android.view.ViewGroup) getChildAt(0)).getChildAt(0)).getChildAt(0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void gn() {
        android.animation.ObjectAnimator r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex61 = null;
        int $pc61 = 4;
        $sw61: while (true) {
            switch ($pc61) {
                case 8: {
                    th = $ex61;
                    if (FH == false) { $pc61 = 12; continue $sw61; }
                    abcd.wu.j6(th, -5392891101809295239L, this);
                    $pc61 = 12; continue $sw61;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc61 = 6; continue $sw61; }
                    try {
                        abcd.wu.j6(-5392891101809295239L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex61 = $t;
                        $pc61 = 8; continue $sw61;
                    }
                    $pc61 = 6; continue $sw61;
                }
                case 6: {
                    try {
                        getHorizontalScrollView().scrollTo(0, 0);
                        scrollTo(0, getHeaderHeight());
                        r2 = android.animation.ObjectAnimator.ofInt(this, "scrollY", new int[]{0});
                        r2.setDuration(500);
                        r2.start();
                    } catch (java.lang.Throwable $t) {
                        $ex61 = $t;
                        $pc61 = 8; continue $sw61;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6(boolean r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex62 = null;
        int $pc62 = 4;
        $sw62: while (true) {
            switch ($pc62) {
                case 9: {
                    th = $ex62;
                    if (FH == false) { $pc62 = 13; continue $sw62; }
                    abcd.wu.j6(th, 3692276521024502567L, this, new java.lang.Boolean(r5));
                    $pc62 = 13; continue $sw62;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc62 = 6; continue $sw62; }
                    try {
                        abcd.wu.j6(3692276521024502567L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex62 = $t;
                        $pc62 = 9; continue $sw62;
                    }
                    $pc62 = 6; continue $sw62;
                }
                case 6: {
                    return (getFirstVisibleLine() + DW(r5)) - 1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r8, int r9) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex63 = null;
        int $pc63 = 3;
        $sw63: while (true) {
            switch ($pc63) {
                case 9: {
                    th = $ex63;
                    if (FH == false) { $pc63 = 13; continue $sw63; }
                    abcd.wu.j6(th, 1174195015257584511L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc63 = 13; continue $sw63;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc63 = 5; continue $sw63; }
                    try {
                        abcd.wu.j6(1174195015257584511L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex63 = $t;
                        $pc63 = 9; continue $sw63;
                    }
                    $pc63 = 5; continue $sw63;
                }
                case 5: {
                    try {
                        r0 = (int) (r9 / getOEditorView().getFontHeight());
                        r1 = getFirstVisibleLine() + 1;
                        r2 = java.lang.Math.min(r8, java.lang.Math.max(1, ((r0 + r8) - getScreenLinesCount()) + 2));
                    } catch (java.lang.Throwable $t) {
                        $ex63 = $t;
                        $pc63 = 9; continue $sw63;
                    }
                    if (r1 >= r2) { $pc63 = 16; continue $sw63; }
                    try {
                        scrollTo(getScrollX(), (int) (((r2 - 1) * getOEditorView().getFontHeight()) + getHeaderHeight()));
                    } catch (java.lang.Throwable $t) {
                        $ex63 = $t;
                        $pc63 = 9; continue $sw63;
                    }
                    return;
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r10, int r11, float r12, java.lang.Runnable r13) {
        android.animation.ObjectAnimator r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex64 = null;
        int $pc64 = 3;
        $sw64: while (true) {
            switch ($pc64) {
                case 11: {
                    th = $ex64;
                    if (FH == false) { $pc64 = 15; continue $sw64; }
                    abcd.wu.j6(th, 6364552957507873392L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Float(r12), r13);
                    $pc64 = 15; continue $sw64;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc64 = 6; continue $sw64; }
                    try {
                        abcd.wu.j6(6364552957507873392L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Float(r12), r13);
                    } catch (java.lang.Throwable $t) {
                        $ex64 = $t;
                        $pc64 = 11; continue $sw64;
                    }
                    $pc64 = 6; continue $sw64;
                }
                case 6: {
                    if (getOEditorView().getFontSize() == r12) { $pc64 = 8; continue $sw64; }
                    try {
                        getOEditorView().requestFocus();
                        j6(getOEditorView().j6(r11, r10), getOEditorView().FH(r10) - getScrollLineY());
                        r0 = android.animation.ObjectAnimator.ofFloat(this, "pinchZoom", new float[]{1.0f, r12 / getOEditorView().getFontSize()});
                        r0.setDuration(1000);
                        r0.addListener(new com.aide.ui.views.l(this, r13));
                        r0.start();
                    } catch (java.lang.Throwable $t) {
                        $ex64 = $t;
                        $pc64 = 11; continue $sw64;
                    }
                    return;
                }
                case 8: {
                    if (r13 == null) { $pc64 = 18; continue $sw64; }
                    try {
                        r13.run();
                    } catch (java.lang.Throwable $t) {
                        $ex64 = $t;
                        $pc64 = 11; continue $sw64;
                    }
                    return;
                }
                case 18: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r10, int r11, int r12, int r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex65 = null;
        int $pc65 = 3;
        $sw65: while (true) {
            switch ($pc65) {
                case 21: {
                    th = $ex65;
                    if (FH == false) { $pc65 = 25; continue $sw65; }
                    abcd.wu.j6(th, 762705082842473000L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc65 = 25; continue $sw65;
                }
                case 25: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc65 = 26; continue $sw65; }
                    try {
                        abcd.wu.j6(762705082842473000L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex65 = $t;
                        $pc65 = 21; continue $sw65;
                    }
                    $pc65 = 26; continue $sw65;
                }
                case 26: {
                    try {
                        this.j3 = true;
                    } catch (java.lang.Throwable $t) {
                        $ex65 = $t;
                        $pc65 = 18; continue $sw65;
                    }
                    if (this.we.isVisible() == false) { $pc65 = 11; continue $sw65; }
                    if (r10 != r12) { $pc65 = 10; continue $sw65; }
                    if (r11 == r13) { $pc65 = 11; continue $sw65; }
                    $pc65 = 10; continue $sw65;
                }
                case 10: {
                    try {
                        J0();
                    } catch (java.lang.Throwable $t) {
                        $ex65 = $t;
                        $pc65 = 18; continue $sw65;
                    }
                    $pc65 = 11; continue $sw65;
                }
                case 11: {
                    try {
                        getOEditorView().Hw(r10, r11, r12, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex65 = $t;
                        $pc65 = 18; continue $sw65;
                    }
                    if (this.we.isVisible() == false) { $pc65 = 14; continue $sw65; }
                    $pc65 = 15; continue $sw65;
                }
                case 15: {
                    try {
                        invalidate();
                    } catch (java.lang.Throwable $t) {
                        $ex65 = $t;
                        $pc65 = 18; continue $sw65;
                    }
                    $pc65 = 16; continue $sw65;
                }
                case 16: {
                    try {
                        this.j3 = false;
                    } catch (java.lang.Throwable $t) {
                        $ex65 = $t;
                        $pc65 = 21; continue $sw65;
                    }
                    return;
                }
                case 14: {
                    if (this.J0.isVisible() == false) { $pc65 = 16; continue $sw65; }
                    return;
                }
                case 18: {
                    th = $ex65;
                    try {
                        this.j3 = false;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex65 = $t;
                        $pc65 = 21; continue $sw65;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r10, int r11, boolean r12, boolean r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex66 = null;
        int $pc66 = 3;
        $sw66: while (true) {
            switch ($pc66) {
                case 11: {
                    th = $ex66;
                    if (FH == false) { $pc66 = 15; continue $sw66; }
                    abcd.wu.j6(th, 3481636457736893200L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Boolean(r12), new java.lang.Boolean(r13));
                    $pc66 = 15; continue $sw66;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc66 = 5; continue $sw66; }
                    try {
                        abcd.wu.j6(3481636457736893200L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Boolean(r12), new java.lang.Boolean(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex66 = $t;
                        $pc66 = 11; continue $sw66;
                    }
                    $pc66 = 5; continue $sw66;
                }
                case 5: {
                    if (r12 == false) { $pc66 = 7; continue $sw66; }
                    try {
                        this.Ws.j6(r10 - 1, r11 - 1);
                    } catch (java.lang.Throwable $t) {
                        $ex66 = $t;
                        $pc66 = 11; continue $sw66;
                    }
                    $pc66 = 8; continue $sw66;
                }
                case 8: {
                    if (r13 == false) { $pc66 = 18; continue $sw66; }
                    try {
                        getOEditorView().setFontSize(getCodeEditText().getDefaultFontSize() * 0.5f);
                    } catch (java.lang.Throwable $t) {
                        $ex66 = $t;
                        $pc66 = 11; continue $sw66;
                    }
                    return;
                }
                case 18: {
                    return;
                }
                case 7: {
                    try {
                        this.QX.j6(r10 - 1, r11 - 1);
                    } catch (java.lang.Throwable $t) {
                        $ex66 = $t;
                        $pc66 = 11; continue $sw66;
                    }
                    { $pc66 = 8; continue $sw66; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex67 = null;
        int $pc67 = 4;
        $sw67: while (true) {
            switch ($pc67) {
                case 8: {
                    th = $ex67;
                    if (FH == false) { $pc67 = 12; continue $sw67; }
                    abcd.wu.j6(th, -7609603819454895149L, this);
                    $pc67 = 12; continue $sw67;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc67 = 6; continue $sw67; }
                    try {
                        abcd.wu.j6(-7609603819454895149L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex67 = $t;
                        $pc67 = 8; continue $sw67;
                    }
                    $pc67 = 6; continue $sw67;
                }
                case 6: {
                    return j6(getOEditorView().getCaretLine(), getOEditorView().getCaretColumn(), 1, 1, 1, 1, false);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(android.view.MotionEvent r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex68 = null;
        int $pc68 = 4;
        $sw68: while (true) {
            switch ($pc68) {
                case 16: {
                    th = $ex68;
                    if (FH == false) { $pc68 = 20; continue $sw68; }
                    abcd.wu.j6(th, -4326499630303940481L, this, r5);
                    $pc68 = 20; continue $sw68;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc68 = 7; continue $sw68; }
                    try {
                        abcd.wu.j6(-4326499630303940481L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex68 = $t;
                        $pc68 = 16; continue $sw68;
                    }
                    $pc68 = 7; continue $sw68;
                }
                case 7: {
                    if (this.we.isTouchEventInsideHandle(r5) == false) { $pc68 = 9; continue $sw68; }
                    $pc68 = 14; continue $sw68;
                }
                case 14: {
                    return true;
                }
                case 9: {
                    if (this.J0.isTouchEventInsideHandle(r5) == true) { $pc68 = 14; continue $sw68; }
                    if (this.J8.isTouchEventInsideHandle(r5) == true) { $pc68 = 14; continue $sw68; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 887793339723325187L)
    protected void onAttachedToWindow() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex69 = null;
        int $pc69 = 4;
        $sw69: while (true) {
            switch ($pc69) {
                case 12: {
                    th = $ex69;
                    if (FH == false) { $pc69 = 16; continue $sw69; }
                    abcd.wu.j6(th, 4426619718646903520L, this);
                    $pc69 = 16; continue $sw69;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc69 = 7; continue $sw69; }
                    try {
                        abcd.wu.j6(4426619718646903520L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex69 = $t;
                        $pc69 = 12; continue $sw69;
                    }
                    $pc69 = 7; continue $sw69;
                }
                case 7: {
                    if (j6 == false) { $pc69 = 9; continue $sw69; }
                    return;
                }
                case 9: {
                    if (u7() == false) { $pc69 = 20; continue $sw69; }
                    try {
                        setLayerType(1, null);
                    } catch (java.lang.Throwable $t) {
                        $ex69 = $t;
                        $pc69 = 12; continue $sw69;
                    }
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -202520716462318192L)
    protected void onFinishInflate() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex70 = null;
        int $pc70 = 4;
        $sw70: while (true) {
            switch ($pc70) {
                case 8: {
                    th = $ex70;
                    if (FH == false) { $pc70 = 12; continue $sw70; }
                    abcd.wu.j6(th, 660729739022127985L, this);
                    $pc70 = 12; continue $sw70;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc70 = 6; continue $sw70; }
                    try {
                        abcd.wu.j6(660729739022127985L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex70 = $t;
                        $pc70 = 8; continue $sw70;
                    }
                    $pc70 = 6; continue $sw70;
                }
                case 6: {
                    try {
                        super.onFinishInflate();
                        getOEditorView().j6(new com.aide.ui.views.i(this));
                        getOEditorView().j6(new com.aide.ui.views.j(this));
                    } catch (java.lang.Throwable $t) {
                        $ex70 = $t;
                        $pc70 = 8; continue $sw70;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        com.aide.ui.views.CodeEditTextScrollView.DragHandle[] r2 = null;
        int r3 = 0;
        int r5 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex71 = null;
        int $pc71 = 4;
        $sw71: while (true) {
            switch ($pc71) {
                case 28: {
                    th = $ex71;
                    if (FH == false) { $pc71 = 33; continue $sw71; }
                    abcd.wu.j6(th, 3307504760350739200L, this, r9);
                    $pc71 = 33; continue $sw71;
                }
                case 33: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc71 = 6; continue $sw71; }
                    try {
                        abcd.wu.j6(3307504760350739200L, this, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex71 = $t;
                        $pc71 = 28; continue $sw71;
                    }
                    $pc71 = 6; continue $sw71;
                }
                case 6: {
                    try {
                        r2 = this.XL;
                        r3 = r2.length;
                    } catch (java.lang.Throwable $t) {
                        $ex71 = $t;
                        $pc71 = 28; continue $sw71;
                    }
                    r5 = 0;
                    $pc71 = 8; continue $sw71;
                }
                case 8: {
                    if (r5 >= r3) { $pc71 = 14; continue $sw71; }
                    if (r2[r5].onInterceptTouchEvent(r9) == true) { $pc71 = 11; continue $sw71; }
                    try {
                        r5 = r5 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex71 = $t;
                        $pc71 = 28; continue $sw71;
                    }
                    { $pc71 = 8; continue $sw71; }
                }
                case 11: {
                    return true;
                }
                case 14: {
                    if (com.aide.common.ClassG.j6(r9) == false) { $pc71 = 17; continue $sw71; }
                    return false;
                }
                case 17: {
                    if (this.Hw == true) { $pc71 = 24; continue $sw71; }
                    if (r9.getActionMasked() != 5) { $pc71 = 24; continue $sw71; }
                    if (r9.getPointerCount() != 2) { $pc71 = 24; continue $sw71; }
                    try {
                        FH(r9);
                    } catch (java.lang.Throwable $t) {
                        $ex71 = $t;
                        $pc71 = 28; continue $sw71;
                    }
                    $pc71 = 24; continue $sw71;
                }
                case 24: {
                    if (this.Hw == false) { $pc71 = 26; continue $sw71; }
                    return true;
                }
                case 26: {
                    return super.onInterceptTouchEvent(r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void onRestoreInstanceState(android.os.Parcelable r6) {
        android.os.Bundle r2 = null;
        int r3 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex72 = null;
        int $pc72 = 4;
        $sw72: while (true) {
            switch ($pc72) {
                case 11: {
                    th = $ex72;
                    if (FH == false) { $pc72 = 15; continue $sw72; }
                    abcd.wu.j6(th, 142038143544224161L, this, r6);
                    $pc72 = 15; continue $sw72;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc72 = 7; continue $sw72; }
                    try {
                        abcd.wu.j6(142038143544224161L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex72 = $t;
                        $pc72 = 11; continue $sw72;
                    }
                    $pc72 = 7; continue $sw72;
                }
                case 7: {
                    if ((r6 instanceof android.os.Bundle) == false) { $pc72 = 9; continue $sw72; }
                    try {
                        r2 = (android.os.Bundle) r6;
                        super.onRestoreInstanceState(r2.getParcelable("instanceState"));
                        r3 = r2.getInt("scrollx");
                        postDelayed(new com.aide.ui.views.k(this, r2.getInt("scrolly"), r3), 100);
                    } catch (java.lang.Throwable $t) {
                        $ex72 = $t;
                        $pc72 = 11; continue $sw72;
                    }
                    return;
                }
                case 9: {
                    try {
                        super.onRestoreInstanceState(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex72 = $t;
                        $pc72 = 11; continue $sw72;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public android.os.Parcelable onSaveInstanceState() {
        android.os.Bundle r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex73 = null;
        int $pc73 = 4;
        $sw73: while (true) {
            switch ($pc73) {
                case 8: {
                    th = $ex73;
                    if (FH == false) { $pc73 = 12; continue $sw73; }
                    abcd.wu.j6(th, 425598516807097920L, this);
                    $pc73 = 12; continue $sw73;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc73 = 6; continue $sw73; }
                    try {
                        abcd.wu.j6(425598516807097920L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex73 = $t;
                        $pc73 = 8; continue $sw73;
                    }
                    $pc73 = 6; continue $sw73;
                }
                case 6: {
                    try {
                        r2 = new android.os.Bundle();
                        r2.putParcelable("instanceState", super.onSaveInstanceState());
                        r2.putInt("scrollx", getScrollX());
                        r2.putInt("scrolly", getHorizontalScrollView().getScrollY());
                    } catch (java.lang.Throwable $t) {
                        $ex73 = $t;
                        $pc73 = 8; continue $sw73;
                    }
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 369465896322369485L)
    protected void onScrollChanged(int r10, int r11, int r12, int r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex74 = null;
        int $pc74 = 3;
        $sw74: while (true) {
            switch ($pc74) {
                case 7: {
                    th = $ex74;
                    if (FH == false) { $pc74 = 11; continue $sw74; }
                    abcd.wu.j6(th, 57458406875011936L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc74 = 11; continue $sw74;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc74 = 5; continue $sw74; }
                    try {
                        abcd.wu.j6(57458406875011936L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex74 = $t;
                        $pc74 = 7; continue $sw74;
                    }
                    $pc74 = 5; continue $sw74;
                }
                case 5: {
                    try {
                        super.onScrollChanged(r10, r11, r12, r13);
                        getOEditorView().XL();
                    } catch (java.lang.Throwable $t) {
                        $ex74 = $t;
                        $pc74 = 7; continue $sw74;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -4862720712386855475L)
    protected void onSizeChanged(int r10, int r11, int r12, int r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex75 = null;
        int $pc75 = 3;
        $sw75: while (true) {
            switch ($pc75) {
                case 7: {
                    th = $ex75;
                    if (FH == false) { $pc75 = 11; continue $sw75; }
                    abcd.wu.j6(th, 3786480371555087968L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc75 = 11; continue $sw75;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (DW == false) { $pc75 = 5; continue $sw75; }
                    try {
                        abcd.wu.j6(3786480371555087968L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex75 = $t;
                        $pc75 = 7; continue $sw75;
                    }
                    $pc75 = 5; continue $sw75;
                }
                case 5: {
                    try {
                        super.onSizeChanged(r10, r11, r12, r13);
                        getOEditorView().XL();
                    } catch (java.lang.Throwable $t) {
                        $ex75 = $t;
                        $pc75 = 7; continue $sw75;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        com.aide.ui.views.CodeEditTextScrollView.DragHandle[] r2 = null;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex76 = null;
        int $pc76 = 4;
        $sw76: while (true) {
            switch ($pc76) {
                case 37: {
                    th = $ex76;
                    if (FH == false) { $pc76 = 42; continue $sw76; }
                    abcd.wu.j6(th, 1374904241774718072L, this, r8);
                    $pc76 = 42; continue $sw76;
                }
                case 42: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc76 = 6; continue $sw76; }
                    try {
                        abcd.wu.j6(1374904241774718072L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex76 = $t;
                        $pc76 = 37; continue $sw76;
                    }
                    $pc76 = 6; continue $sw76;
                }
                case 6: {
                    try {
                        r2 = this.XL;
                        r3 = r2.length;
                    } catch (java.lang.Throwable $t) {
                        $ex76 = $t;
                        $pc76 = 37; continue $sw76;
                    }
                    r4 = 0;
                    $pc76 = 8; continue $sw76;
                }
                case 8: {
                    if (r4 >= r3) { $pc76 = 14; continue $sw76; }
                    if (r2[r4].onTouchEvent(r8) == true) { $pc76 = 11; continue $sw76; }
                    try {
                        r4 = r4 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex76 = $t;
                        $pc76 = 37; continue $sw76;
                    }
                    { $pc76 = 8; continue $sw76; }
                }
                case 11: {
                    return true;
                }
                case 14: {
                    if (this.Hw == true) { $pc76 = 21; continue $sw76; }
                    if (r8.getActionMasked() != 5) { $pc76 = 21; continue $sw76; }
                    if (r8.getPointerCount() != 2) { $pc76 = 21; continue $sw76; }
                    try {
                        FH(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex76 = $t;
                        $pc76 = 37; continue $sw76;
                    }
                    $pc76 = 21; continue $sw76;
                }
                case 21: {
                    if (this.Hw == false) { $pc76 = 36; continue $sw76; }
                    if (r8.getAction() != 2) { $pc76 = 28; continue $sw76; }
                    if (r8.getPointerCount() != 2) { $pc76 = 28; continue $sw76; }
                    try {
                        DW(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex76 = $t;
                        $pc76 = 37; continue $sw76;
                    }
                    $pc76 = 28; continue $sw76;
                }
                case 28: {
                    if (r8.getAction() != 1) { $pc76 = 32; continue $sw76; }
                    if (r8.getPointerCount() != 1) { $pc76 = 32; continue $sw76; }
                    $pc76 = 33; continue $sw76;
                }
                case 33: {
                    try {
                        Hw(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex76 = $t;
                        $pc76 = 37; continue $sw76;
                    }
                    $pc76 = 34; continue $sw76;
                }
                case 34: {
                    return true;
                }
                case 32: {
                    if (r8.getAction() != 3) { $pc76 = 34; continue $sw76; }
                    $pc76 = 36; continue $sw76;
                }
                case 36: {
                    return super.onTouchEvent(r8);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean v5() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex77 = null;
        int $pc77 = 4;
        $sw77: while (true) {
            switch ($pc77) {
                case 14: {
                    th = $ex77;
                    if (FH == false) { $pc77 = 18; continue $sw77; }
                    abcd.wu.j6(th, 6480317330394729223L, this);
                    $pc77 = 18; continue $sw77;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (DW == false) { $pc77 = 7; continue $sw77; }
                    try {
                        abcd.wu.j6(6480317330394729223L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex77 = $t;
                        $pc77 = 14; continue $sw77;
                    }
                    $pc77 = 7; continue $sw77;
                }
                case 7: {
                    if (this.Ws.isVisible() == true) { $pc77 = 12; continue $sw77; }
                    if (this.QX.isVisible() == true) { $pc77 = 12; continue $sw77; }
                    return false;
                }
                case 12: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
