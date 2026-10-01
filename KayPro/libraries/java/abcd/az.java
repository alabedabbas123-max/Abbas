package abcd;

public class az<E extends abcd._y & abcd.Interfacelz & abcd.Interfacehz> extends java.util.concurrent.PriorityBlockingQueue<E> {
    private final java.util.concurrent.locks.ReentrantLock DW;
    final java.util.Queue<E> j6;

    public az() {
        this.j6 = new java.util.LinkedList();
        this.DW = new java.util.concurrent.locks.ReentrantLock();
    }

    E DW(int r2, java.lang.Long r3, java.util.concurrent.TimeUnit r4) {
        if (r2 == 0) goto L15;
        if (r2 == 1) goto L18;
        if (r2 == 2) goto L17;
        if (r2 == 3) goto L16;
        return null;
    L16:
        return (E) ((abcd._y) super.poll(r3.longValue(), r4));
    L17:
        return (E) ((abcd._y) super.poll());
    L18:
        return (E) ((abcd._y) super.peek());
    L15:
        return (E) ((abcd._y) super.take());
    }

    @Override
    public void clear() {
        this.DW.lock();     // Catch: java.lang.Throwable -> L5
        this.j6.clear();     // Catch: java.lang.Throwable -> L5
        super.clear();     // Catch: java.lang.Throwable -> L5
        this.DW.unlock();
        return;
    L5:
        th = move-exception;
        this.DW.unlock();
        throw th;
    }

    @Override
    public boolean contains(java.lang.Object r2) {
        this.DW.lock();     // Catch: java.lang.Throwable -> L11
        if (super.contains(r2) == true) goto L8;
        if (this.j6.contains(r2) == true) goto L8;
        boolean r3 = false;
    L9:
        this.DW.unlock();
        return r3;
    L8:
        r3 = true;
    L11:
        th = move-exception;
        this.DW.unlock();
        throw th;
    }

    @Override
    public int drainTo(java.util.Collection<? super E> r3) {
        this.DW.lock();     // Catch: java.lang.Throwable -> L9
        int r0 = super.drainTo(r3) + this.j6.size();     // Catch: java.lang.Throwable -> L9
    L4:
        if (this.j6.isEmpty() == true) goto L7;
        r3.add(this.j6.poll());     // Catch: java.lang.Throwable -> L9
        goto L4
    L7:
        this.DW.unlock();
        return r0;
    L9:
        th = move-exception;
        this.DW.unlock();
        throw th;
    }

    @Override
    public int drainTo(java.util.Collection<? super E> r3, int r4) {
        this.DW.lock();     // Catch: java.lang.Throwable -> L10
        int r0 = super.drainTo(r3, r4);     // Catch: java.lang.Throwable -> L10
    L4:
        if (this.j6.isEmpty() == true) goto L8;
        if (r0 > r4) goto L8;
        r3.add(this.j6.poll());     // Catch: java.lang.Throwable -> L10
        r0 = r0 + 1;
    L8:
        this.DW.unlock();
        return r0;
    L10:
        th = move-exception;
        this.DW.unlock();
        throw th;
    }

    E j6(int r3, java.lang.Long r4, java.util.concurrent.TimeUnit r5) {
    L2:
        E r0 = (E) DW(r3, r4, r5);
        if (r0 == null) goto L8;
        if (j6(r0) == true) goto L8;
        j6(r3, r0);
    L8:
        return r0;
    }

    public void j6() {
        this.DW.lock();     // Catch: java.lang.Throwable -> L11
        java.util.Iterator<E> r0 = this.j6.iterator();     // Catch: java.lang.Throwable -> L11
    L4:
        if (r0.hasNext() == false) goto L9;
        E r1 = r0.next();     // Catch: java.lang.Throwable -> L11
        if (j6(r1) == false) goto L4;
        super.offer(r1);     // Catch: java.lang.Throwable -> L11
        r0.remove();     // Catch: java.lang.Throwable -> L11
        goto L4
    L9:
        this.DW.unlock();
        return;
    L11:
        th = move-exception;
        this.DW.unlock();
        throw th;
    }

    boolean j6(int r2, E r3) {
        this.DW.lock();     // Catch: java.lang.Throwable -> L8
        if (r2 != 1) goto L5;
        super.remove(r3);     // Catch: java.lang.Throwable -> L8
    L5:
        boolean r4 = this.j6.offer(r3);     // Catch: java.lang.Throwable -> L8
        this.DW.unlock();
        return r4;
    L8:
        th = move-exception;
        this.DW.unlock();
        throw th;
    }

    boolean j6(E r1) {
        return r1.DW();
    }

    <T> T[] j6(T[] r5, T[] r6) {
        int r0 = r5.length;
        int r1 = r6.length;
        T[] r2 = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(r5.getClass().getComponentType(), r0 + r1));
        java.lang.System.arraycopy(r5, 0, r2, 0, r0);
        java.lang.System.arraycopy(r6, 0, r2, r0, r1);
        return r2;
    }

    @Override
    public E peek() {
        return (E) j6(1, null, null);
    L5:
        return null;
    }

    @Override
    public java.lang.Object peek() {
        return peek();
    }

    @Override
    public E poll() {
        return (E) j6(2, null, null);
    L5:
        return null;
    }

    @Override
    public E poll(long r1, java.util.concurrent.TimeUnit r3) {
        return (E) j6(3, java.lang.Long.valueOf(r1), r3);
    }

    @Override
    public java.lang.Object poll() {
        return poll();
    }

    @Override
    public java.lang.Object poll(long r1, java.util.concurrent.TimeUnit r3) {
        return poll(r1, r3);
    }

    @Override
    public boolean remove(java.lang.Object r2) {
        this.DW.lock();     // Catch: java.lang.Throwable -> L11
        if (super.remove(r2) == true) goto L8;
        if (this.j6.remove(r2) == true) goto L8;
        boolean r3 = false;
    L9:
        this.DW.unlock();
        return r3;
    L8:
        r3 = true;
    L11:
        th = move-exception;
        this.DW.unlock();
        throw th;
    }

    @Override
    public boolean removeAll(java.util.Collection<?> r3) {
        this.DW.lock();     // Catch: java.lang.Throwable -> L5
        boolean r0 = super.removeAll(r3);     // Catch: java.lang.Throwable -> L5
        boolean r4 = this.j6.removeAll(r3) | r0;
        this.DW.unlock();
        return r4;
    L5:
        th = move-exception;
        this.DW.unlock();
        throw th;
    }

    @Override
    public int size() {
        this.DW.lock();     // Catch: java.lang.Throwable -> L5
        int r0 = this.j6.size() + super.size();
        this.DW.unlock();
        return r0;
    L5:
        th = move-exception;
        this.DW.unlock();
        throw th;
    }

    @Override
    public E take() {
        return (E) j6(0, null, null);
    }

    @Override
    public java.lang.Object take() {
        return take();
    }

    @Override
    public java.lang.Object[] toArray() {
        this.DW.lock();     // Catch: java.lang.Throwable -> L5
        java.lang.Object[] r0 = j6(super.toArray(), this.j6.toArray());     // Catch: java.lang.Throwable -> L5
        this.DW.unlock();
        return r0;
    L5:
        th = move-exception;
        this.DW.unlock();
        throw th;
    }

    @Override
    public <T> T[] toArray(T[] r3) {
        this.DW.lock();     // Catch: java.lang.Throwable -> L5
        T[] r4 = (T[]) j6(super.toArray(r3), this.j6.toArray(r3));
        this.DW.unlock();
        return r4;
    L5:
        th = move-exception;
        this.DW.unlock();
        throw th;
    }
}
