package com.myopicmobile.textwarrior.android;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.myopicmobile.textwarrior.common.ColorScheme;
import com.myopicmobile.textwarrior.common.DocumentProvider;

public class TouchNavigationMethod extends GestureDetector.SimpleOnGestureListener {
    private GestureDetector _gestureDetector;
    protected boolean _isCaretTouched = false;
    protected FreeScrollingTextField _textField;
    private int fling;
    private float lastDist;
    private float lastSize;
    private float lastX;
    private float lastY;
    protected static int SCROLL_EDGE_SLOP = 10;
    private static final Rect _caretBloat = new Rect(0, 0, 0, 0);
    protected static int TOUCH_SLOP = 12;

    TouchNavigationMethod() {
    }

    public TouchNavigationMethod(FreeScrollingTextField freeScrollingTextField) {
        this._textField = freeScrollingTextField;
        this._gestureDetector = new GestureDetector(freeScrollingTextField.getContext(), this);
        this._gestureDetector.setIsLongpressEnabled(true);
    }

    private void dragCaret(MotionEvent motionEvent) {
        boolean zAutoScrollCaret = false;
        if (!this._textField.isSelectText() && isDragSelect()) {
            this._textField.selectText(true);
        }
        int x = ((int) motionEvent.getX()) - this._textField.getPaddingLeft();
        int y = ((int) motionEvent.getY()) - this._textField.getPaddingTop();
        if (x < SCROLL_EDGE_SLOP) {
            zAutoScrollCaret = this._textField.autoScrollCaret(2);
        } else if (x >= this._textField.getContentWidth() - SCROLL_EDGE_SLOP) {
            zAutoScrollCaret = this._textField.autoScrollCaret(3);
        } else if (y < SCROLL_EDGE_SLOP) {
            zAutoScrollCaret = this._textField.autoScrollCaret(0);
        } else if (y >= this._textField.getContentHeight() - SCROLL_EDGE_SLOP) {
            zAutoScrollCaret = this._textField.autoScrollCaret(1);
        }
        if (zAutoScrollCaret) {
            return;
        }
        this._textField.stopAutoScrollCaret();
        int iCoordToCharIndex = this._textField.coordToCharIndex(screenToViewX((int) motionEvent.getX()), screenToViewY((int) motionEvent.getY()));
        if (iCoordToCharIndex >= 0) {
            this._textField.moveCaret(iCoordToCharIndex);
        }
    }

    private final boolean isDragSelect() {
        return false;
    }

    private boolean onTouchZoon(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 2 || motionEvent.getPointerCount() != 2) {
            this.lastDist = 0;
            return false;
        }
        if (this.lastDist == 0) {
            float x = motionEvent.getX(0) - motionEvent.getX(1);
            float y = motionEvent.getY(0) - motionEvent.getY(1);
            this.lastDist = (float) Math.sqrt((x * x) + (y * y));
            this.lastX = (motionEvent.getX(0) + motionEvent.getX(1)) / 2;
            this.lastY = (motionEvent.getY(0) + motionEvent.getY(1)) / 2;
            this.lastSize = this._textField.getTextSize();
        }
        float fSpacing = spacing(motionEvent);
        if (this.lastDist == 0) {
            return true;
        }
        this._textField.setTextSize((int) ((fSpacing / this.lastDist) * this.lastSize));
        return true;
    }

    private void scrollView(float f, float f2) {
        int i = 0;
        int scrollX = this._textField.getScrollX() + ((int) f);
        int scrollY = this._textField.getScrollY() + ((int) f2);
        int iMax = Math.max(this._textField.getMaxScrollX(), this._textField.getScrollX());
        if (scrollX <= iMax) {
            iMax = scrollX < 0 ? 0 : scrollX;
        }
        int iMax2 = Math.max(this._textField.getMaxScrollY(), this._textField.getScrollY());
        if (scrollY > iMax2) {
            i = iMax2;
        } else if (scrollY >= 0) {
            i = scrollY;
        }
        this._textField.smoothScrollTo(iMax, i);
    }

    private float spacing(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public Rect getCaretBloat() {
        return _caretBloat;
    }

    protected final int getPointerId(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 65280) >> 8;
    }

    public boolean isNearChar(int i, int i2, int i3) {
        Rect boundingBox = this._textField.getBoundingBox(i3);
        return i2 >= boundingBox.top - TOUCH_SLOP && i2 < boundingBox.bottom + TOUCH_SLOP && i >= boundingBox.left - TOUCH_SLOP && i < boundingBox.right + TOUCH_SLOP;
    }

    public final boolean isRightHanded() {
        return true;
    }

    public void onChiralityChanged(boolean z) {
    }

    public void onColorSchemeChanged(ColorScheme colorScheme) {
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        this._isCaretTouched = true;
        int iCoordToCharIndex = this._textField.coordToCharIndex(screenToViewX((int) motionEvent.getX()), screenToViewY((int) motionEvent.getY()));
        if (iCoordToCharIndex >= 0) {
            this._textField.moveCaret(iCoordToCharIndex);
            DocumentProvider documentProviderCreateDocumentProvider = this._textField.createDocumentProvider();
            int i = iCoordToCharIndex;
            while (i >= 0 && Character.isJavaIdentifierPart(documentProviderCreateDocumentProvider.charAt(i))) {
                i--;
            }
            if (i != iCoordToCharIndex) {
                i++;
            }
            while (iCoordToCharIndex >= 0 && Character.isJavaIdentifierPart(documentProviderCreateDocumentProvider.charAt(iCoordToCharIndex))) {
                iCoordToCharIndex++;
            }
            this._textField.selectText(true);
            this._textField.setSelectionRange(i, iCoordToCharIndex - i);
        }
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        int iScreenToViewX = screenToViewX((int) motionEvent.getX());
        int iScreenToViewY = screenToViewY((int) motionEvent.getY());
        this._isCaretTouched = isNearChar(iScreenToViewX, iScreenToViewY, this._textField.getCaretPosition());
        if (this._textField.isFlingScrolling()) {
            this._textField.stopFlingScrolling();
        } else if (this._textField.isSelectText()) {
            if (isNearChar(iScreenToViewX, iScreenToViewY, this._textField.getSelectionStart())) {
                this._textField.focusSelectionStart();
                this._textField.performHapticFeedback(0);
                this._isCaretTouched = true;
            } else if (isNearChar(iScreenToViewX, iScreenToViewY, this._textField.getSelectionEnd())) {
                this._textField.focusSelectionEnd();
                this._textField.performHapticFeedback(0);
                this._isCaretTouched = true;
            }
        }
        if (this._isCaretTouched) {
            this._textField.performHapticFeedback(0);
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this._isCaretTouched) {
            if (this.fling == 1) {
                f2 = 0;
            } else if (this.fling == -1) {
                f = 0;
            }
            this._textField.flingScroll((int) (-f), (int) (-f2));
        }
        onUp(motionEvent2);
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        onDoubleTap(motionEvent);
    }

    void onPause() {
    }

    void onResume() {
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this._isCaretTouched) {
            dragCaret(motionEvent2);
        } else if (motionEvent2.getPointerCount() == 1) {
            if (this.fling == 0) {
                if (Math.abs(f) > Math.abs(f2)) {
                    this.fling = 1;
                } else {
                    this.fling = -1;
                }
            }
            if (this.fling == 1) {
                f2 = 0;
            } else if (this.fling == -1) {
                f = 0;
            }
            scrollView(f, f2);
        }
        if ((motionEvent2.getAction() & 255) == 1) {
            onUp(motionEvent2);
        }
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        int iScreenToViewX = screenToViewX((int) motionEvent.getX());
        int iScreenToViewY = screenToViewY((int) motionEvent.getY());
        int iCoordToCharIndex = this._textField.coordToCharIndex(iScreenToViewX, iScreenToViewY);
        if (this._textField.isSelectText()) {
            int iCoordToCharIndexStrict = this._textField.coordToCharIndexStrict(iScreenToViewX, iScreenToViewY);
            if (!this._textField.inSelectionRange(iCoordToCharIndexStrict) && !isNearChar(iScreenToViewX, iScreenToViewY, this._textField.getSelectionStart()) && !isNearChar(iScreenToViewX, iScreenToViewY, this._textField.getSelectionEnd())) {
                this._textField.selectText(false);
                if (iCoordToCharIndexStrict >= 0) {
                    this._textField.moveCaret(iCoordToCharIndex);
                }
            }
        } else if (iCoordToCharIndex >= 0) {
            this._textField.moveCaret(iCoordToCharIndex);
        }
        this._textField.showIME(true);
        return true;
    }

    public void onTextDrawComplete(Canvas canvas) {
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        onTouchZoon(motionEvent);
        boolean zOnTouchEvent = this._gestureDetector.onTouchEvent(motionEvent);
        return (zOnTouchEvent || (motionEvent.getAction() & 255) != 1) ? zOnTouchEvent : onUp(motionEvent);
    }

    public boolean onUp(MotionEvent motionEvent) {
        this._textField.stopAutoScrollCaret();
        this._isCaretTouched = false;
        this.lastDist = 0;
        this.fling = 0;
        return true;
    }

    protected final int screenToViewX(int i) {
        return (i - this._textField.getPaddingLeft()) + this._textField.getScrollX();
    }

    protected final int screenToViewY(int i) {
        return (i - this._textField.getPaddingTop()) + this._textField.getScrollY();
    }
}
