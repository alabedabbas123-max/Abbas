package com.almlkaide.kaypro.manifesteditor.colorpicker.widgets;

import android.content.Context;
import android.graphics.Color;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.blankj.utilcode.constant.MemoryConstants;

public class ClassB extends ViewGroup implements Interfacee {

    private static final InputFilter[] f3589g = {new InputFilter.LengthFilter(9)};

    private final ClassC f3590a;

    private final ClassF f3591b;

    private final LinearLayout f3592c;

    private final EditText f3593d;

    private int f3594e;

    private boolean f3595f;

    public ClassB(Context context) {
        this(context, null);
    }

    public ClassB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3595f = false;
        this.f3590a = new ClassC(context, attributeSet);
        this.f3591b = new ClassF(context, attributeSet);
        this.f3592c = new LinearLayout(context, attributeSet);
        this.f3593d = new EditText(context, attributeSet);
        this.f3592c.setOrientation(1);
        this.f3593d.setGravity(17);
        this.f3593d.setFilters(f3589g);
        ClassD c1350d = new ClassD(this);
        this.f3593d.addTextChangedListener(c1350d);
        this.f3593d.setKeyListener(c1350d);
        this.f3592c.addView(this.f3593d);
        this.f3590a.setOnColorChangedListener(this);
        addView(this.f3590a);
        addView(this.f3591b);
        addView(this.f3592c);
    }

    @Override
    public void mo5745a() {
        this.f3595f = true;
    }

    @Override
    public void mo5746a(int i) {
        this.f3594e = i;
        this.f3591b.m5757a(i);
        this.f3593d.setText(String.format("#%08X", Integer.valueOf(i)));
    }

    void m5747a(String str) {
        if (this.f3595f) {
            return;
        }
        int color = Color.parseColor(str);
        this.f3590a.setColor(color);
        this.f3591b.m5757a(color);
        this.f3594e = color;
    }

    @Override
    public void mo5748b() {
        this.f3595f = false;
    }

    public int getColor() {
        return this.f3594e;
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        ClassC c1349c = this.f3590a;
        int measuredWidth = c1349c.getMeasuredWidth();
        int measuredHeight = c1349c.getMeasuredHeight();
        int i7 = i3 - i;
        LinearLayout linearLayout = this.f3592c;
        int measuredHeight2 = linearLayout.getMeasuredHeight();
        int i8 = i4 - i2;
        if (measuredHeight + measuredHeight2 > i8) {
            i5 = i8 - measuredHeight2;
            i6 = (i7 - measuredWidth) / 2;
        } else {
            i5 = measuredHeight;
            i6 = 0;
        }
        c1349c.layout(i6, 0, i7 - i6, i5);
        linearLayout.layout(i7 / 2, i5, i7 - i6, i5 + measuredHeight2);
        this.f3591b.layout(i6, i5, i7 / 2, i5 + measuredHeight2);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        ClassC c1349c = this.f3590a;
        c1349c.measure(i, i2);
        int measuredWidth = c1349c.getMeasuredWidth();
        int measuredHeight2 = c1349c.getMeasuredHeight();
        int size = View.MeasureSpec.getSize(i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth / 2, MemoryConstants.f4579GB);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f3592c;
        linearLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredHeight3 = measuredHeight2 + linearLayout.getMeasuredHeight();
        if (measuredHeight3 > size) {
            measuredHeight = size - linearLayout.getMeasuredHeight();
        } else {
            size = measuredHeight3;
            measuredHeight = measuredWidth;
        }
        setMeasuredDimension(measuredHeight, size);
    }

    public void setColor(int i) {
        this.f3590a.setColor(i);
        this.f3591b.m5758b(i);
        mo5746a(i);
    }
}
