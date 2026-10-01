package com.almlkaide.kaypro.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.baidu.android.common.util.DeviceId;
import com.almlkaide.kaypro.util.Utils;
import java.util.Locale;

public class ColorBackgroundTextView extends TextView {
    private int rectangleSize;

    public ColorBackgroundTextView(Context context) {
        super(context);
        this.rectangleSize = 10;
        init();
    }

    public ColorBackgroundTextView(Context context, int i) {
        super(context);
        this.rectangleSize = 10;
        init();
        setColor(i);
    }

    private void init() {
        setPadding(dp2px(5), 0, dp2px(5), 0);
    }

    @Override
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    public void setRectangleSize(int i) {
        this.rectangleSize = i;
    }

    public void setColor(int i) {
        setText(convertToARGB(i));
        setBackgroundDrawable(new AlphaPatternDrawable(this, this.rectangleSize, i));
        setTextColor(!Utils.isLightColor(i) ? -1 : -16777216);
    }

    public static String convertToARGB(int i) {
        String hexString = Integer.toHexString(Color.alpha(i));
        String hexString2 = Integer.toHexString(Color.red(i));
        String hexString3 = Integer.toHexString(Color.green(i));
        String hexString4 = Integer.toHexString(Color.blue(i));
        if (hexString.length() == 1) {
            hexString = new StringBuffer().append(DeviceId.CUIDInfo.I_EMPTY).append(hexString).toString();
        }
        if (hexString2.length() == 1) {
            hexString2 = new StringBuffer().append(DeviceId.CUIDInfo.I_EMPTY).append(hexString2).toString();
        }
        if (hexString3.length() == 1) {
            hexString3 = new StringBuffer().append(DeviceId.CUIDInfo.I_EMPTY).append(hexString3).toString();
        }
        if (hexString4.length() == 1) {
            hexString4 = new StringBuffer().append(DeviceId.CUIDInfo.I_EMPTY).append(hexString4).toString();
        }
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("#").append(hexString).toString()).append(hexString2).toString()).append(hexString3).toString()).append(hexString4).toString().toUpperCase(Locale.ENGLISH);
    }

    public static int dp2px(float f) {
        return (int) ((Resources.getSystem().getDisplayMetrics().density * f) + 0.5f);
    }

    public class AlphaPatternDrawable extends Drawable {
        private int backgroundColor;
        private Bitmap mBitmap;
        private int mRectangleSize;
        private int numRectanglesHorizontal;
        private int numRectanglesVertical;
        private final ColorBackgroundTextView this$0;
        private Paint mPaint = new Paint();
        private Paint mPaintWhite = new Paint();
        private Paint mPaintGray = new Paint();

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        private void block$6877() {
            this.mPaintWhite.setColor(-1);
            this.mPaintGray.setColor(-3421237);
        }

        public AlphaPatternDrawable(ColorBackgroundTextView colorBackgroundTextView, int i, int i2) {
            this.this$0 = colorBackgroundTextView;
            this.mRectangleSize = 10;
            this.backgroundColor = 0;
            block$6877();
            this.mRectangleSize = i;
            this.backgroundColor = i2;
        }

        @Override
        public void draw(Canvas canvas) {
            canvas.drawBitmap(this.mBitmap, (Rect) null, getBounds(), this.mPaint);
            canvas.drawColor(this.backgroundColor);
        }

        @Override
        public int getOpacity() {
            return 0;
        }

        @Override
        protected void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            int iHeight = rect.height();
            this.numRectanglesHorizontal = (int) Math.ceil(rect.width() / this.mRectangleSize);
            this.numRectanglesVertical = (int) Math.ceil(iHeight / this.mRectangleSize);
            generatePatternBitmap();
        }

        private void generatePatternBitmap() {
            if (getBounds().width() > 0 && getBounds().height() > 0) {
                this.mBitmap = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.mBitmap);
                Rect rect = new Rect();
                boolean z = true;
                for (int i = 0; i <= this.numRectanglesVertical; i++) {
                    boolean z2 = z;
                    for (int i2 = 0; i2 <= this.numRectanglesHorizontal; i2++) {
                        rect.top = this.mRectangleSize * i;
                        rect.left = this.mRectangleSize * i2;
                        rect.bottom = rect.top + this.mRectangleSize;
                        rect.right = rect.left + this.mRectangleSize;
                        canvas.drawRect(rect, z2 ? this.mPaintWhite : this.mPaintGray);
                        z2 = !z2;
                    }
                    z = !z;
                }
            }
        }
    }
}
