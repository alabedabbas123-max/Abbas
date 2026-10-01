package sun.misc;

public final class ConditionLock extends Lock {
    private int state;

    public ConditionLock() {
        this.state = 0;
    }

    public ConditionLock(int initialState) {
        this.state = 0;
        this.state = initialState;
    }

    public synchronized void lockWhen(int desiredState) throws InterruptedException {
        while (this.state != desiredState) {
            wait();
        }
        lock();
    }

    public synchronized void unlockWith(int newState) {
        this.state = newState;
        unlock();
    }
}
