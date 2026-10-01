package org.xutils.image;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

final class ReusableBitmapDrawable extends BitmapDrawable implements ReusableDrawable {

    private MemCacheKey f6738key;

    public ReusableBitmapDrawable(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override
    public MemCacheKey getMemCacheKey() {
        return this.f6738key;
    }

    @Override
    public void setMemCacheKey(MemCacheKey memCacheKey) {
        this.f6738key = memCacheKey;
    }
}
