package org.xutils.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.xutils.common.util.LogUtil;

public class GifDrawable extends Drawable implements Runnable, Animatable {
    private int byteCount;
    private final int duration;
    private final Movie movie;
    private volatile boolean running;
    private int rate = 100;
    private final long begin = SystemClock.uptimeMillis();

    public GifDrawable(Movie movie, int i) {
        this.movie = movie;
        this.byteCount = i;
        this.duration = movie.duration();
    }

    public int getDuration() {
        return this.duration;
    }

    public Movie getMovie() {
        return this.movie;
    }

    public int getByteCount() {
        if (this.byteCount == 0) {
            this.byteCount = this.movie.width() * this.movie.height() * 3 * 5;
        }
        return this.byteCount;
    }

    public int getRate() {
        return this.rate;
    }

    public void setRate(int i) {
        this.rate = i;
    }

    @Override
    public void draw(Canvas canvas) {
        try {
            this.movie.setTime(this.duration > 0 ? ((int) (SystemClock.uptimeMillis() - this.begin)) % this.duration : 0);
            this.movie.draw(canvas, 0.0f, 0.0f);
            start();
        } catch (Throwable th) {
            LogUtil.m9046e(th.getMessage(), th);
        }
    }

    @Override
    public void start() {
        if (!isRunning()) {
            this.running = true;
            run();
        }
    }

    @Override
    public void stop() {
        if (isRunning()) {
            this.running = false;
            unscheduleSelf(this);
        }
    }

    @Override
    public boolean isRunning() {
        return this.running && this.duration > 0;
    }

    @Override
    public void run() {
        if (this.duration > 0) {
            invalidateSelf();
            scheduleSelf(this, SystemClock.uptimeMillis() + ((long) this.rate));
        }
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public int getIntrinsicWidth() {
        return this.movie.width();
    }

    @Override
    public int getIntrinsicHeight() {
        return this.movie.height();
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override
    public int getOpacity() {
        return this.movie.isOpaque() ? -1 : -3;
    }
}
