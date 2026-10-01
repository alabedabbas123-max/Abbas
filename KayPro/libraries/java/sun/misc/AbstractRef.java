package sun.misc;

import java.lang.ref.SoftReference;

@Deprecated
public abstract class AbstractRef {
    private SoftReference soft = null;

    public abstract Object reconstitute();

    public synchronized Object m542get() {
        Object t;
        t = check();
        if (t == null) {
            t = reconstitute();
            setThing(t);
        }
        return t;
    }

    public synchronized void flush() {
        SoftReference s = this.soft;
        if (s != null) {
            s.clear();
        }
        this.soft = null;
    }

    public synchronized void setThing(Object thing) {
        flush();
        this.soft = new SoftReference(thing);
    }

    public synchronized Object check() {
        SoftReference s = this.soft;
        if (s == null) {
            return null;
        }
        return s.get();
    }

    public AbstractRef() {
    }

    public AbstractRef(Object thing) {
        setThing(thing);
    }
}
