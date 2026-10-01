package com.almlkaide.kaypro.manifesteditor.colorpicker.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

class ClassF extends View {

    private final Paint f3622a;

    private final Paint f3623b;

    private final ClassA f3624c;

    private final Rect f3625d;

    private int f3626e;

    ClassF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3626e = 0;
        this.f3624c = new ClassA(8);
        this.f3622a = new Paint();
        this.f3623b = new Paint();
        this.f3623b.setStyle(Paint.Style.STROKE);
        this.f3623b.setStrokeWidth(2.0f);
        this.f3625d = new Rect();
    }

    public void m5757a(int i) {
        int width = getWidth() / 2;
        this.f3622a.setShader(new LinearGradient(width - 1, 0.0f, width + 1, 0.0f, this.f3626e, i, Shader.TileMode.CLAMP));
        invalidate();
    }

    public void m5758b(int i) {
        this.f3626e = i;
        int width = getWidth() / 2;
        this.f3622a.setShader(new LinearGradient(width - 1, 0.0f, width + 1, 0.0f, i, i, Shader.TileMode.CLAMP));
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3624c.draw(canvas);
        canvas.drawRect(this.f3625d, this.f3622a);
        canvas.drawRect(this.f3625d, this.f3623b);
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = i / 10;
        int i6 = i2 / 20;
        this.f3625d.set(i5, i6, i - i5, i2 - i6);
        this.f3624c.setBounds(this.f3625d);
        super.onSizeChanged(i, i2, i3, i4);
    }
}
