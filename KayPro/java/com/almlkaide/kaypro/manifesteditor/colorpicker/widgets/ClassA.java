package com.almlkaide.kaypro.manifesteditor.colorpicker.widgets;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

class ClassA extends Drawable {

    private int f3582a;

    private Paint f3583b = new Paint();

    private Paint f3584c = new Paint();

    private Paint f3585d = new Paint();

    private int f3586e;

    private int f3587f;

    private Bitmap f3588g;

    ClassA(int i) {
        this.f3582a = 10;
        this.f3582a = i;
        this.f3584c.setColor(-1);
        this.f3585d.setColor(-3421237);
    }

    private void m5744a() {
        if (getBounds().width() <= 0 || getBounds().height() <= 0) {
            return;
        }
        this.f3588g = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f3588g);
        Rect rect = new Rect();
        boolean z = true;
        for (int i = 0; i <= this.f3587f; i++) {
            boolean z2 = z;
            for (int i2 = 0; i2 <= this.f3586e; i2++) {
                rect.top = this.f3582a * i;
                rect.left = this.f3582a * i2;
                rect.bottom = rect.top + this.f3582a;
                rect.right = rect.left + this.f3582a;
                canvas.drawRect(rect, z2 ? this.f3584c : this.f3585d);
                z2 = !z2;
            }
            z = !z;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        if (this.f3588g == null || this.f3588g.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.f3588g, (Rect) null, getBounds(), this.f3583b);
    }

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        this.f3586e = (int) Math.ceil(rect.width() / this.f3582a);
        this.f3587f = (int) Math.ceil(iHeight / this.f3582a);
        m5744a();
    }

    @Override
    public void setAlpha(int i) {
        throw new UnsupportedOperationException("Alpha is not supported by this drawable.");
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("ColorFilter is not supported by this drawable.");
    }
}
