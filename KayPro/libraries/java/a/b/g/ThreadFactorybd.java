package a.b.g;

import java.util.concurrent.ThreadFactory;

class ThreadFactorybd implements ThreadFactory {

    final az f370a;

    private int f371b;

    private ThreadFactorybd(az c0121az) {
        this.f370a = c0121az;
        this.f371b = 0;
    }

    @Override
    public Thread newThread(Runnable runnable) {
        az c0121az = this.f370a;
        int i = this.f371b + 1;
        this.f371b = i;
        return new bc(c0121az, i, runnable);
    }
}
