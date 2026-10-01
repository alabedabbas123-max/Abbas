package sun.misc;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class Cleaner extends PhantomReference {
    private static final ReferenceQueue dummyQueue = new ReferenceQueue();
    private static Cleaner first = null;
    private Cleaner next;
    private Cleaner prev;
    private final Runnable thunk;

    private static synchronized Cleaner m524add(Cleaner cl) {
        if (first != null) {
            cl.next = first;
            first.prev = cl;
        }
        first = cl;
        return cl;
    }

    private static synchronized boolean remove(Cleaner cl) {
        if (cl.next == cl) {
            return false;
        }
        if (first == cl) {
            if (cl.next != null) {
                first = cl.next;
            } else {
                first = cl.prev;
            }
        }
        if (cl.next != null) {
            cl.next.prev = cl.prev;
        }
        if (cl.prev != null) {
            cl.prev.next = cl.next;
        }
        cl.next = cl;
        cl.prev = cl;
        return true;
    }

    private Cleaner(Object referent, Runnable thunk) {
        super(referent, dummyQueue);
        this.next = null;
        this.prev = null;
        this.thunk = thunk;
    }

    public static Cleaner create(Object ob, Runnable thunk) {
        if (thunk == null) {
            return null;
        }
        return m524add(new Cleaner(ob, thunk));
    }

    public void clean() {
        if (!remove(this)) {
            return;
        }
        try {
            this.thunk.run();
        } catch (Throwable x) {
            AccessController.doPrivileged(new PrivilegedAction() {
                @Override
                public Object run() {
                    if (System.err != null) {
                        new Error("Cleaner terminated abnormally", x).printStackTrace();
                        return null;
                    }
                    return null;
                }
            });
        }
    }
}
