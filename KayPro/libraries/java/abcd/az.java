package abcd;

public class az<E extends abcd._y & abcd.Interfacelz & abcd.Interfacehz> extends java.util.concurrent.PriorityBlockingQueue<E> {
    private final java.util.concurrent.locks.ReentrantLock DW;
    final java.util.Queue<E> j6;

    public az() {
        this.j6 = new java.util.LinkedList();
        this.DW = new java.util.concurrent.locks.ReentrantLock();
    }

    E DW(int r2, java.lang.Long r3, java.util.concurrent.TimeUnit r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == 0) { $pc0 = 15; continue $sw0; }
                    if (r2 == 1) { $pc0 = 18; continue $sw0; }
                    if (r2 == 2) { $pc0 = 17; continue $sw0; }
                    if (r2 == 3) { $pc0 = 16; continue $sw0; }
                    return null;
                }
                case 16: {
                    return (E) ((abcd._y) super.poll(r3.longValue(), r4));
                }
                case 17: {
                    return (E) ((abcd._y) super.poll());
                }
                case 18: {
                    return (E) ((abcd._y) super.peek());
                }
                case 15: {
                    return (E) ((abcd._y) super.take());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void clear() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        this.DW.lock();
                        this.j6.clear();
                        super.clear();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 5; continue $sw1;
                    }
                    this.DW.unlock();
                    return;
                }
                case 5: {
                    th = $ex1;
                    this.DW.unlock();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean contains(java.lang.Object r2) {
        boolean r3 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    try {
                        this.DW.lock();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 11; continue $sw2;
                    }
                    if (super.contains(r2) == true) { $pc2 = 8; continue $sw2; }
                    if (this.j6.contains(r2) == true) { $pc2 = 8; continue $sw2; }
                    r3 = false;
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    this.DW.unlock();
                    return r3;
                }
                case 8: {
                    r3 = true;
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    th = $ex2;
                    this.DW.unlock();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int drainTo(java.util.Collection<? super E> r3) {
        int r0 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    try {
                        this.DW.lock();
                        r0 = super.drainTo(r3) + this.j6.size();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 9; continue $sw3;
                    }
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (this.j6.isEmpty() == true) { $pc3 = 7; continue $sw3; }
                    try {
                        r3.add(this.j6.poll());
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 9; continue $sw3;
                    }
                    { $pc3 = 4; continue $sw3; }
                }
                case 7: {
                    this.DW.unlock();
                    return r0;
                }
                case 9: {
                    th = $ex3;
                    this.DW.unlock();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int drainTo(java.util.Collection<? super E> r3, int r4) {
        int r0 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    try {
                        this.DW.lock();
                        r0 = super.drainTo(r3, r4);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 10; continue $sw4;
                    }
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (this.j6.isEmpty() == true) { $pc4 = 8; continue $sw4; }
                    if (r0 > r4) { $pc4 = 8; continue $sw4; }
                    try {
                        r3.add(this.j6.poll());
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 10; continue $sw4;
                    }
                    r0 = r0 + 1;
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    this.DW.unlock();
                    return r0;
                }
                case 10: {
                    th = $ex4;
                    this.DW.unlock();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    E j6(int r3, java.lang.Long r4, java.util.concurrent.TimeUnit r5) {
        E r0 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 2;
        $sw5: while (true) {
            switch ($pc5) {
                case 2: {
                    r0 = (E) DW(r3, r4, r5);
                    if (r0 == null) { $pc5 = 8; continue $sw5; }
                    if (j6(r0) == true) { $pc5 = 8; continue $sw5; }
                    j6(r3, r0);
                    $pc5 = 8; continue $sw5;
                }
                case 8: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        java.util.Iterator<E> r0 = null;
        E r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    try {
                        this.DW.lock();
                        r0 = this.j6.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 11; continue $sw6;
                    }
                    $pc6 = 4; continue $sw6;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc6 = 9; continue $sw6; }
                    try {
                        r1 = r0.next();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 11; continue $sw6;
                    }
                    if (j6(r1) == false) { $pc6 = 4; continue $sw6; }
                    try {
                        super.offer(r1);
                        r0.remove();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 11; continue $sw6;
                    }
                    { $pc6 = 4; continue $sw6; }
                }
                case 9: {
                    this.DW.unlock();
                    return;
                }
                case 11: {
                    th = $ex6;
                    this.DW.unlock();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    boolean j6(int r2, E r3) {
        boolean r4 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    try {
                        this.DW.lock();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    if (r2 != 1) { $pc7 = 5; continue $sw7; }
                    try {
                        super.remove(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    $pc7 = 5; continue $sw7;
                }
                case 5: {
                    try {
                        r4 = this.j6.offer(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    this.DW.unlock();
                    return r4;
                }
                case 8: {
                    th = $ex7;
                    this.DW.unlock();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    return (E) j6(1, null, null);
                }
                case 5: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.Object peek() {
        return peek();
    }

    @Override
    public E poll() {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    return (E) j6(2, null, null);
                }
                case 5: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        boolean r3 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    try {
                        this.DW.lock();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 11; continue $sw10;
                    }
                    if (super.remove(r2) == true) { $pc10 = 8; continue $sw10; }
                    if (this.j6.remove(r2) == true) { $pc10 = 8; continue $sw10; }
                    r3 = false;
                    $pc10 = 9; continue $sw10;
                }
                case 9: {
                    this.DW.unlock();
                    return r3;
                }
                case 8: {
                    r3 = true;
                    $pc10 = 11; continue $sw10;
                }
                case 11: {
                    th = $ex10;
                    this.DW.unlock();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean removeAll(java.util.Collection<?> r3) {
        boolean r0 = false;
        boolean r4 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    try {
                        this.DW.lock();
                        r0 = super.removeAll(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 5; continue $sw11;
                    }
                    r4 = this.j6.removeAll(r3) | r0;
                    this.DW.unlock();
                    return r4;
                }
                case 5: {
                    th = $ex11;
                    this.DW.unlock();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int size() {
        int r0 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    try {
                        this.DW.lock();
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 5; continue $sw12;
                    }
                    r0 = this.j6.size() + super.size();
                    this.DW.unlock();
                    return r0;
                }
                case 5: {
                    th = $ex12;
                    this.DW.unlock();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Object[] r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    try {
                        this.DW.lock();
                        r0 = j6(super.toArray(), this.j6.toArray());
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 5; continue $sw13;
                    }
                    this.DW.unlock();
                    return r0;
                }
                case 5: {
                    th = $ex13;
                    this.DW.unlock();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public <T> T[] toArray(T[] r3) {
        T[] r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    try {
                        this.DW.lock();
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 5; continue $sw14;
                    }
                    r4 = (T[]) j6(super.toArray(r3), this.j6.toArray(r3));
                    this.DW.unlock();
                    return r4;
                }
                case 5: {
                    th = $ex14;
                    this.DW.unlock();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
