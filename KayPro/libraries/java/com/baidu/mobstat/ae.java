package com.baidu.mobstat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.widget.TextView;

class ae extends TextView {

    private Paint f4036a;

    private PaintFlagsDrawFilter f4037b;

    public ae(Context context) {
        super(context);
        this.f4036a = new Paint();
        this.f4037b = new PaintFlagsDrawFilter(0, 3);
        this.f4036a.setColor(-1);
        this.f4036a.setAntiAlias(true);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iMax = Math.max(getMeasuredWidth(), getMeasuredHeight());
        setMeasuredDimension(iMax, iMax);
    }

    @Override
    public void setBackgroundColor(int i) {
        this.f4036a.setColor(i);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.setDrawFilter(this.f4037b);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, Math.max(getWidth(), getHeight()) / 2, this.f4036a);
        super.draw(canvas);
    }
}
