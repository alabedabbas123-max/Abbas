package com.almlkaide.kaypro.manifesteditor.colorpicker.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class ClassC extends View {

    private static final int[] f3596x = {-65536, -256, -16711936, -16711681, -16776961, -65281, -65536};

    private final Paint f3597a;

    private final Paint f3598b;

    private final Paint f3599c;

    private final Paint f3600d;

    private final Paint f3601e;

    private final Rect f3602f;

    private final Rect f3603g;

    private final Rect f3604h;

    private final ClassA f3605i;

    private Shader f3606j;

    private Shader f3607k;

    private float f3608l;

    private float f3609m;

    private float f3610n;

    private int f3611o;

    private float f3612p;

    private float f3613q;

    private float f3614r;

    private float f3615s;

    private Interfacee f3616t;

    private boolean f3617u;

    private boolean f3618v;

    private boolean f3619w;

    public ClassC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3597a = new Paint();
        this.f3598b = new Paint();
        this.f3599c = new Paint();
        this.f3605i = new ClassA(8);
        this.f3603g = new Rect();
        this.f3602f = new Rect();
        this.f3604h = new Rect();
        this.f3600d = new Paint();
        this.f3616t = null;
        this.f3600d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(2.0f);
        paint.setStyle(Paint.Style.STROKE);
        this.f3601e = paint;
        this.f3608l = 0.0f;
        this.f3609m = 0.0f;
        this.f3610n = 1.0f;
        this.f3611o = 255;
        this.f3615s = 0.0f;
        this.f3614r = 0.0f;
        this.f3613q = 0.0f;
        this.f3612p = 0.0f;
    }

    private void m5749a() {
        Rect rect = this.f3602f;
        if (rect.height() == 0) {
            return;
        }
        this.f3612p = (rect.height() * (this.f3608l / 360.0f)) + rect.top;
        Rect rect2 = this.f3604h;
        this.f3615s = rect2.right - (rect2.width() * (this.f3611o / 255.0f));
        Rect rect3 = this.f3603g;
        this.f3613q = rect3.left + (this.f3609m * rect3.width());
        this.f3614r = rect3.bottom - (rect3.height() * this.f3610n);
        m5752a(true, false);
    }

    private void m5750a(float f) {
        this.f3619w = true;
        Rect rect = this.f3604h;
        if (f < rect.left) {
            f = rect.left;
        }
        if (f > rect.right) {
            f = rect.right;
        }
        this.f3615s = f;
        this.f3611o = (int) ((1.0f - ((f - rect.left) / rect.width())) * 255.0f);
    }

    private void m5751a(float f, float f2) {
        this.f3618v = true;
        Rect rect = this.f3603g;
        if (f2 < rect.top) {
            f2 = rect.top;
        }
        if (f2 > rect.bottom) {
            f2 = rect.bottom;
        }
        if (f < rect.left) {
            f = rect.left;
        }
        if (f > rect.right) {
            f = rect.right;
        }
        this.f3613q = f;
        this.f3614r = f2;
        float f3 = f - rect.left;
        float f4 = f2 - rect.top;
        this.f3609m = f3 / rect.width();
        this.f3610n = 1.0f - (f4 / rect.height());
    }

    private void m5752a(boolean z, boolean z2) {
        float[] fArr = {this.f3608l, 1.0f, 1.0f};
        if (z || this.f3617u) {
            this.f3606j = new LinearGradient(0.0f, 0.0f, this.f3603g.width(), 0.0f, -1, Color.HSVToColor(fArr), Shader.TileMode.CLAMP);
            this.f3598b.setShader(this.f3606j);
        }
        fArr[1] = this.f3609m;
        fArr[2] = this.f3610n;
        if (z || this.f3617u || this.f3618v) {
            Rect rect = this.f3604h;
            int iHSVToColor = Color.HSVToColor(fArr);
            this.f3599c.setShader(new LinearGradient(rect.left, rect.top, rect.right, rect.top, iHSVToColor, iHSVToColor & 16777215, Shader.TileMode.CLAMP));
        }
        if (!z2 || this.f3616t == null) {
            return;
        }
        this.f3616t.mo5746a(Color.HSVToColor(this.f3611o, fArr));
    }

    private void m5753b() {
        Rect rect = this.f3603g;
        this.f3607k = new LinearGradient(0.0f, 0.0f, 0.0f, rect.height(), -1, -16777216, Shader.TileMode.CLAMP);
        this.f3606j = new LinearGradient(0.0f, 0.0f, rect.width(), 0.0f, -1, -16777216, Shader.TileMode.CLAMP);
        this.f3600d.setShader(this.f3607k);
    }

    private void m5754b(float f) {
        this.f3617u = true;
        Rect rect = this.f3602f;
        if (f < rect.top) {
            f = rect.top;
        }
        if (f > rect.bottom) {
            f = rect.bottom;
        }
        this.f3612p = f;
        this.f3608l = ((f - rect.top) / rect.height()) * 360.0f;
    }

    private void m5755c() {
        Rect rect = this.f3602f;
        this.f3597a.setShader(new LinearGradient(rect.left, rect.top, rect.left, rect.bottom, f3596x, (float[]) null, Shader.TileMode.CLAMP));
    }

    public void m5756a(int i, int i2, int i3, int i4) {
        this.f3611o = i;
        float[] fArr = new float[3];
        Color.RGBToHSV(i2, i3, i4, fArr);
        this.f3608l = fArr[0];
        this.f3609m = fArr[1];
        this.f3610n = fArr[2];
        m5749a();
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = this.f3603g;
        Paint paint = this.f3601e;
        canvas.drawRect(rect, this.f3598b);
        canvas.drawRect(rect, this.f3600d);
        canvas.drawRect(rect, paint);
        paint.setColor(-16777216);
        canvas.drawCircle(this.f3613q, this.f3614r, 6, paint);
        paint.setColor(-1);
        canvas.drawCircle(this.f3613q, this.f3614r, 4, paint);
        paint.setColor(-16777216);
        Rect rect2 = this.f3602f;
        canvas.drawRect(rect2, this.f3597a);
        canvas.drawRect(rect2, paint);
        canvas.drawRect(rect2.left - 2, this.f3612p - 2, rect2.right + 2, 2 + this.f3612p, paint);
        this.f3605i.draw(canvas);
        Rect rect3 = this.f3604h;
        canvas.drawRect(rect3, this.f3599c);
        canvas.drawRect(rect3, paint);
        canvas.drawRect(this.f3615s - 2, rect3.top - 2, this.f3615s + 2, rect3.bottom + 2, paint);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int iMin = Math.min((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight(), (View.MeasureSpec.getSize(i2) - getPaddingBottom()) - getPaddingTop());
        setMeasuredDimension(iMin, iMin);
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int iMin = Math.min(i, i2) / 20;
        int i5 = iMin * 17;
        int i6 = iMin * 18;
        int i7 = iMin * 19;
        this.f3603g.set(iMin, iMin, i5, i5);
        this.f3602f.set(i6, iMin, i7, i5);
        this.f3604h.set(iMin, i6, i7, i7);
        this.f3605i.setBounds(this.f3604h);
        m5755c();
        m5753b();
        m5749a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        switch (motionEvent.getAction()) {
            case 0:
                if (this.f3616t != null) {
                    this.f3616t.mo5745a();
                }
                if (this.f3602f.contains(x, y)) {
                    m5754b(y);
                } else if (this.f3603g.contains(x, y)) {
                    m5751a(x, y);
                } else if (this.f3604h.contains(x, y)) {
                    m5750a(x);
                }
                m5752a(false, true);
                invalidate();
                return true;
            case 1:
                this.f3617u = false;
                this.f3618v = false;
                this.f3619w = false;
                if (this.f3616t != null) {
                    this.f3616t.mo5748b();
                }
                return true;
            case 2:
                if (this.f3617u) {
                    m5754b(y);
                } else if (this.f3618v) {
                    m5751a(x, y);
                } else if (this.f3619w) {
                    m5750a(x);
                }
                m5752a(false, true);
                invalidate();
                return true;
            default:
                m5752a(false, true);
                invalidate();
                return true;
        }
    }

    public void setColor(int i) {
        m5756a(Color.alpha(i), Color.red(i), Color.green(i), Color.blue(i));
    }

    public void setOnColorChangedListener(Interfacee interfaceC1351e) {
        this.f3616t = interfaceC1351e;
    }
}
