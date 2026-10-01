package com.myopicmobile.textwarrior.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.MotionEvent;
import com.myopicmobile.textwarrior.common.ColorScheme;
import com.myopicmobile.textwarrior.common.Pair;

public class YoyoNavigationMethod extends TouchNavigationMethod {
    private boolean _isCaretHandleTouched;
    private boolean _isEndHandleTouched;
    private boolean _isShowYoyoCaret;
    private boolean _isStartHandleTouched;
    private final Yoyo _yoyoCaret;
    private final Yoyo _yoyoEnd;
    private int _yoyoSize;
    private final Yoyo _yoyoStart;

    private class Yoyo {
        private static final int YOYO_HANDLE_ALPHA = 180;
        private static final int YOYO_HANDLE_COLOR = -16776961;
        public final Rect HANDLE_BLOAT;
        private final Rect HANDLE_RECT;
        private final int YOYO_STRING_RESTING_HEIGHT;
        private boolean _isShow;
        private final YoyoNavigationMethod this$0;
        private int _anchorX = 0;
        private int _anchorY = 0;
        private int _handleX = 0;
        private int _handleY = 0;
        private int _xOffset = 0;
        private int _yOffset = 0;
        private final Paint _brush = new Paint();

        public Yoyo(YoyoNavigationMethod yoyoNavigationMethod) {
            this.this$0 = yoyoNavigationMethod;
            this.YOYO_STRING_RESTING_HEIGHT = this.this$0._yoyoSize / 3;
            this.HANDLE_RECT = new Rect(0, 0, this.this$0._yoyoSize, this.this$0._yoyoSize);
            this.HANDLE_BLOAT = new Rect(getRadius(), 0, 0, this.HANDLE_RECT.bottom + this.YOYO_STRING_RESTING_HEIGHT);
            this._brush.setColor(this.this$0._textField.getColorScheme().getColor(ColorScheme.Colorable.CARET_BACKGROUND));
            this._brush.setAntiAlias(true);
        }

        private void invalidateYoyo() {
            int i;
            int i2;
            int i3;
            int i4;
            int radius = this._handleX + getRadius();
            if (radius >= this._anchorX) {
                i2 = this._anchorX;
                i = radius + 1;
            } else {
                i = this._anchorX + 1;
                i2 = radius;
            }
            if (this._handleY >= this._anchorY) {
                i3 = this._anchorY;
                i4 = this._handleY;
            } else {
                i3 = this._handleY;
                i4 = this._anchorY;
            }
            this.this$0._textField.invalidate(i2, i3, i, i4);
            invalidateHandle();
        }

        public void attachYoyo(int i, int i2) {
            invalidateYoyo();
            setRestingCoord(i, i2);
            invalidateYoyo();
        }

        public void clearInitialTouch() {
            this._xOffset = 0;
            this._yOffset = 0;
        }

        public void draw(Canvas canvas, boolean z) {
            int radius = getRadius();
            canvas.drawLine(this._anchorX, this._anchorY, this._handleX + radius, this._handleY + radius, this._brush);
            canvas.drawArc(new RectF(this._anchorX - radius, (this._anchorY - (radius / 2)) - this.YOYO_STRING_RESTING_HEIGHT, this._handleX + (radius * 2), this._handleY + (radius / 2)), 60, 60, true, this._brush);
            canvas.drawOval(new RectF(this._handleX, this._handleY, this._handleX + this.HANDLE_RECT.right, this._handleY + this.HANDLE_RECT.bottom), this._brush);
        }

        public Pair findNearestChar(int i, int i2) {
            int iScreenToViewX = (this.this$0.screenToViewX(i) - this._xOffset) + getRadius();
            int iScreenToViewY = ((this.this$0.screenToViewY(i2) - this._yOffset) - this.YOYO_STRING_RESTING_HEIGHT) - 2;
            return new Pair(this.this$0._textField.coordToCharIndex(iScreenToViewX, iScreenToViewY), this.this$0._textField.coordToCharIndexStrict(iScreenToViewX, iScreenToViewY));
        }

        public final int getRadius() {
            return this.HANDLE_RECT.right / 2;
        }

        public void hide() {
            this._isShow = false;
        }

        public void invalidateHandle() {
            this.this$0._textField.invalidate(new Rect(this._handleX, this._handleY, this._handleX + this.HANDLE_RECT.right, this._handleY + this.HANDLE_RECT.bottom));
        }

        public boolean isInHandle(int i, int i2) {
            return this._isShow && i >= this._handleX && i < this._handleX + this.HANDLE_RECT.right && i2 >= this._handleY && i2 < this._handleY + this.HANDLE_RECT.bottom;
        }

        public boolean isShow() {
            return this._isShow;
        }

        public void setHandleColor(int i) {
            this._brush.setColor(i);
        }

        public void setInitialTouch(int i, int i2) {
            this._xOffset = i - this._handleX;
            this._yOffset = i2 - this._handleY;
        }

        public void setRestingCoord(int i, int i2) {
            this._anchorX = i;
            this._anchorY = i2;
            this._handleX = i - getRadius();
            this._handleY = this.YOYO_STRING_RESTING_HEIGHT + i2;
        }

        public void show() {
            this._isShow = true;
        }
    }

    public YoyoNavigationMethod(FreeScrollingTextField freeScrollingTextField) {
        super(freeScrollingTextField);
        this._isStartHandleTouched = false;
        this._isEndHandleTouched = false;
        this._isCaretHandleTouched = false;
        this._isShowYoyoCaret = false;
        this._yoyoSize = (int) TypedValue.applyDimension(2, (float) (((double) FreeScrollingTextField.BASE_TEXT_SIZE_PIXELS) * 1.5d), freeScrollingTextField.getContext().getResources().getDisplayMetrics());
        this._yoyoCaret = new Yoyo(this);
        this._yoyoStart = new Yoyo(this);
        this._yoyoEnd = new Yoyo(this);
    }

    private void moveHandle(Yoyo yoyo, MotionEvent motionEvent) {
        int first = yoyo.findNearestChar((int) motionEvent.getX(), (int) motionEvent.getY()).getFirst();
        if (first >= 0) {
            this._textField.moveCaret(first);
            Rect boundingBox = this._textField.getBoundingBox(first);
            yoyo.attachYoyo(boundingBox.left + this._textField.getPaddingLeft(), boundingBox.bottom + this._textField.getPaddingTop());
        }
    }

    @Override
    public Rect getCaretBloat() {
        return this._yoyoCaret.HANDLE_BLOAT;
    }

    @Override
    public void onColorSchemeChanged(ColorScheme colorScheme) {
        this._yoyoCaret.setHandleColor(colorScheme.getColor(ColorScheme.Colorable.CARET_BACKGROUND));
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        int x = ((int) motionEvent.getX()) + this._textField.getScrollX();
        int y = ((int) motionEvent.getY()) + this._textField.getScrollY();
        if (this._yoyoCaret.isInHandle(x, y)) {
            this._textField.selectText(true);
            return true;
        }
        if (this._yoyoStart.isInHandle(x, y)) {
            return true;
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        super.onDown(motionEvent);
        if (!this._isCaretTouched) {
            int x = ((int) motionEvent.getX()) + this._textField.getScrollX();
            int y = ((int) motionEvent.getY()) + this._textField.getScrollY();
            this._isCaretHandleTouched = this._yoyoCaret.isInHandle(x, y);
            this._isStartHandleTouched = this._yoyoStart.isInHandle(x, y);
            this._isEndHandleTouched = this._yoyoEnd.isInHandle(x, y);
            if (this._isCaretHandleTouched) {
                this._isShowYoyoCaret = true;
                this._yoyoCaret.setInitialTouch(x, y);
                this._yoyoCaret.invalidateHandle();
            } else if (this._isStartHandleTouched) {
                this._yoyoStart.setInitialTouch(x, y);
                this._textField.focusSelectionStart();
                this._yoyoStart.invalidateHandle();
            } else if (this._isEndHandleTouched) {
                this._yoyoEnd.setInitialTouch(x, y);
                this._textField.focusSelectionEnd();
                this._yoyoEnd.invalidateHandle();
            }
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this._isCaretHandleTouched && !this._isStartHandleTouched && !this._isEndHandleTouched) {
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }
        onUp(motionEvent2);
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        onDoubleTap(motionEvent);
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this._isCaretHandleTouched) {
            if ((motionEvent2.getAction() & 255) == 1) {
                onUp(motionEvent2);
                return true;
            }
            this._isShowYoyoCaret = true;
            moveHandle(this._yoyoCaret, motionEvent2);
            return true;
        }
        if (this._isStartHandleTouched) {
            if ((motionEvent2.getAction() & 255) == 1) {
                onUp(motionEvent2);
                return true;
            }
            moveHandle(this._yoyoStart, motionEvent2);
            return true;
        }
        if (!this._isEndHandleTouched) {
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
        if ((motionEvent2.getAction() & 255) == 1) {
            onUp(motionEvent2);
            return true;
        }
        moveHandle(this._yoyoEnd, motionEvent2);
        return true;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        int x = ((int) motionEvent.getX()) + this._textField.getScrollX();
        int y = ((int) motionEvent.getY()) + this._textField.getScrollY();
        if (this._yoyoCaret.isInHandle(x, y) || this._yoyoStart.isInHandle(x, y) || this._yoyoEnd.isInHandle(x, y)) {
            return true;
        }
        this._isShowYoyoCaret = true;
        return super.onSingleTapUp(motionEvent);
    }

    @Override
    public void onTextDrawComplete(Canvas canvas) {
        if (!this._textField.isSelectText2()) {
            this._yoyoCaret.show();
            this._yoyoStart.hide();
            this._yoyoEnd.hide();
            if (!this._isCaretHandleTouched) {
                Rect boundingBox = this._textField.getBoundingBox(this._textField.getCaretPosition());
                this._yoyoCaret.setRestingCoord(boundingBox.left + this._textField.getPaddingLeft(), boundingBox.bottom + this._textField.getPaddingTop());
            }
            if (this._isShowYoyoCaret) {
                this._yoyoCaret.draw(canvas, this._isCaretHandleTouched);
            }
            this._isShowYoyoCaret = false;
            return;
        }
        this._yoyoCaret.hide();
        this._yoyoStart.show();
        this._yoyoEnd.show();
        if (!this._isStartHandleTouched || !this._isEndHandleTouched) {
            Rect boundingBox2 = this._textField.getBoundingBox(this._textField.getSelectionStart());
            this._yoyoStart.setRestingCoord(boundingBox2.left + this._textField.getPaddingLeft(), boundingBox2.bottom + this._textField.getPaddingTop());
            Rect boundingBox3 = this._textField.getBoundingBox(this._textField.getSelectionEnd());
            this._yoyoEnd.setRestingCoord(boundingBox3.left + this._textField.getPaddingLeft(), boundingBox3.bottom + this._textField.getPaddingTop());
        }
        this._yoyoStart.draw(canvas, this._isStartHandleTouched);
        this._yoyoEnd.draw(canvas, this._isStartHandleTouched);
    }

    @Override
    public boolean onUp(MotionEvent motionEvent) {
        this._isCaretHandleTouched = false;
        this._isStartHandleTouched = false;
        this._isEndHandleTouched = false;
        this._yoyoCaret.clearInitialTouch();
        this._yoyoStart.clearInitialTouch();
        this._yoyoEnd.clearInitialTouch();
        super.onUp(motionEvent);
        return true;
    }
}
