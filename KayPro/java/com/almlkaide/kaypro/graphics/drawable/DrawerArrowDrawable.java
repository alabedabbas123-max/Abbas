package com.almlkaide.kaypro.graphics.drawable;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.FloatRange;
import android.support.annotation.IntDef;
import android.support.annotation.RestrictTo;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.media.MediaDescriptionCompat;
import com.blankj.utilcode.util.SizeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class DrawerArrowDrawable extends Drawable {
    public static final int ARROW_DIRECTION_END = 3;
    public static final int ARROW_DIRECTION_LEFT = 0;
    public static final int ARROW_DIRECTION_RIGHT = 1;
    public static final int ARROW_DIRECTION_START = 2;
    private static final float ARROW_HEAD_ANGLE = (float) Math.toRadians(45);
    private float mArrowHeadLength;
    private float mArrowShaftLength;
    private float mBarGap;
    private float mBarLength;
    private float mMaxCutForBarSize;
    private float mProgress;
    private final int mSize;
    private boolean mSpin;
    private final Paint mPaint = new Paint();
    private final Path mPath = new Path();
    private boolean mVerticalMirror = false;
    private int mDirection = 2;

    @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
    @Retention(RetentionPolicy.SOURCE)
    @IntDef({MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED, 1, 2, MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS})
    public @interface ArrowDirection {
    }

    public DrawerArrowDrawable(Context context) {
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeJoin(Paint.Join.MITER);
        this.mPaint.setStrokeCap(Paint.Cap.BUTT);
        this.mPaint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.textColorPrimary});
        setColor(typedArrayObtainStyledAttributes.getColor(0, -16777216));
        typedArrayObtainStyledAttributes.recycle();
        setBarThickness(SizeUtils.dp2px(2));
        setSpinEnabled(true);
        setGapSize(Math.round(SizeUtils.dp2px(3)));
        this.mSize = SizeUtils.dp2px(24);
        this.mBarLength = Math.round(SizeUtils.dp2px(18));
        this.mArrowHeadLength = Math.round(SizeUtils.dp2px(8));
        this.mArrowShaftLength = SizeUtils.dp2px(16);
    }

    public void setArrowHeadLength(float f) {
        if (this.mArrowHeadLength != f) {
            this.mArrowHeadLength = f;
            invalidateSelf();
        }
    }

    public float getArrowHeadLength() {
        return this.mArrowHeadLength;
    }

    public void setArrowShaftLength(float f) {
        if (this.mArrowShaftLength != f) {
            this.mArrowShaftLength = f;
            invalidateSelf();
        }
    }

    public float getArrowShaftLength() {
        return this.mArrowShaftLength;
    }

    public float getBarLength() {
        return this.mBarLength;
    }

    public void setBarLength(float f) {
        if (this.mBarLength != f) {
            this.mBarLength = f;
            invalidateSelf();
        }
    }

    public void setColor(int i) {
        if (i != this.mPaint.getColor()) {
            this.mPaint.setColor(i);
            invalidateSelf();
        }
    }

    @ColorInt
    public int getColor() {
        return this.mPaint.getColor();
    }

    public void setBarThickness(float f) {
        if (this.mPaint.getStrokeWidth() != f) {
            this.mPaint.setStrokeWidth(f);
            this.mMaxCutForBarSize = (float) (((double) (f / 2)) * Math.cos(ARROW_HEAD_ANGLE));
            invalidateSelf();
        }
    }

    public float getBarThickness() {
        return this.mPaint.getStrokeWidth();
    }

    public float getGapSize() {
        return this.mBarGap;
    }

    public void setGapSize(float f) {
        if (f != this.mBarGap) {
            this.mBarGap = f;
            invalidateSelf();
        }
    }

    public void setDirection(int i) {
        if (i != this.mDirection) {
            this.mDirection = i;
            invalidateSelf();
        }
    }

    public boolean isSpinEnabled() {
        return this.mSpin;
    }

    public void setSpinEnabled(boolean z) {
        if (this.mSpin) {
            if (z) {
                return;
            }
        } else if (!z) {
            return;
        }
        this.mSpin = z;
        invalidateSelf();
    }

    @ArrowDirection
    public int getDirection() {
        return this.mDirection;
    }

    public void setVerticalMirror(boolean z) {
        if (this.mVerticalMirror) {
            if (z) {
                return;
            }
        } else if (!z) {
            return;
        }
        this.mVerticalMirror = z;
        invalidateSelf();
    }

    @Override
    public void draw(Canvas canvas) {
        boolean z;
        Rect bounds = getBounds();
        switch (this.mDirection) {
            case 0:
                z = false;
                break;
            case 1:
                z = true;
                break;
            case 2:
            default:
                z = DrawableCompat.getLayoutDirection(this) == 1;
                break;
            case 3:
                z = DrawableCompat.getLayoutDirection(this) == 0;
                break;
        }
        float fLerp = lerp(this.mBarLength, (float) Math.sqrt(this.mArrowHeadLength * this.mArrowHeadLength * 2), this.mProgress);
        float fLerp2 = lerp(this.mBarLength, this.mArrowShaftLength, this.mProgress);
        float fRound = Math.round(lerp(0, this.mMaxCutForBarSize, this.mProgress));
        float fLerp3 = lerp(0, ARROW_HEAD_ANGLE, this.mProgress);
        float fLerp4 = lerp(z ? 0 : -180, z ? 180 : 0, this.mProgress);
        float fRound2 = Math.round(((double) fLerp) * Math.cos(fLerp3));
        float fRound3 = Math.round(((double) fLerp) * Math.sin(fLerp3));
        this.mPath.rewind();
        float fLerp5 = lerp(this.mBarGap + this.mPaint.getStrokeWidth(), -this.mMaxCutForBarSize, this.mProgress);
        float f = (-fLerp2) / 2;
        this.mPath.moveTo(f + fRound, 0);
        this.mPath.rLineTo(fLerp2 - (fRound * 2), 0);
        this.mPath.moveTo(f, fLerp5);
        this.mPath.rLineTo(fRound2, fRound3);
        this.mPath.moveTo(f, -fLerp5);
        this.mPath.rLineTo(fRound2, -fRound3);
        this.mPath.close();
        canvas.save();
        float strokeWidth = this.mPaint.getStrokeWidth();
        canvas.translate(bounds.centerX(), (float) (((double) ((((int) ((bounds.height() - (3 * strokeWidth)) - (this.mBarGap * 2))) / 4) * 2)) + (((double) strokeWidth) * 1.5d) + ((double) this.mBarGap)));
        if (this.mSpin) {
            canvas.rotate((z ^ this.mVerticalMirror ? -1 : 1) * fLerp4);
        } else if (z) {
            canvas.rotate(180);
        }
        canvas.drawPath(this.mPath, this.mPaint);
        canvas.restore();
    }

    @Override
    public void setAlpha(int i) {
        if (i != this.mPaint.getAlpha()) {
            this.mPaint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override
    public int getIntrinsicHeight() {
        return this.mSize;
    }

    @Override
    public int getIntrinsicWidth() {
        return this.mSize;
    }

    @Override
    public int getOpacity() {
        return -3;
    }

    @FloatRange(from = 0.0d, m3637to = 1.0d)
    public float getProgress() {
        return this.mProgress;
    }

    public void setProgress(float f) {
        if (this.mProgress != f) {
            this.mProgress = f;
            invalidateSelf();
        }
    }

    public final Paint getPaint() {
        return this.mPaint;
    }

    private static float lerp(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }
}
