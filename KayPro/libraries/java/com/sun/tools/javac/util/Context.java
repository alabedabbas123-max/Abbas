package com.sun.tools.javac.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Context {

    private Map<C0723Key<?>, Factory<?>> f556ft;

    private Map<C0723Key<?>, Object> f557ht;

    private Map<Class<?>, C0723Key<?>> f558kt;

    public interface Factory<T> {
        T make(Context context);
    }

    public static class C0723Key<T> {
    }

    public <T> void m503put(C0723Key<T> key, Factory<T> fac) {
        checkState(this.f557ht);
        Object old = this.f557ht.put(key, fac);
        if (old != null) {
            throw new AssertionError("duplicate context value");
        }
        checkState(this.f556ft);
        this.f556ft.put(key, fac);
    }

    public <T> void m504put(C0723Key<T> key, T data) {
        if (data instanceof Factory) {
            throw new AssertionError("T extends Context.Factory");
        }
        checkState(this.f557ht);
        Object old = this.f557ht.put(key, data);
        if (old != null && !(old instanceof Factory) && old != data && data != null) {
            throw new AssertionError("duplicate context value");
        }
    }

    public <T> T m501get(C0723Key<T> c0723Key) {
        checkState(this.f557ht);
        Object objMake = this.f557ht.get(c0723Key);
        if (objMake instanceof Factory) {
            objMake = ((Factory) objMake).make(this);
            if (objMake instanceof Factory) {
                throw new AssertionError("T extends Context.Factory");
            }
            Assert.check(this.f557ht.get(c0723Key) == objMake);
        }
        return (T) uncheckedCast(objMake);
    }

    public Context() {
        this.f557ht = new HashMap();
        this.f556ft = new HashMap();
        this.f558kt = new HashMap();
    }

    public Context(Context prev) {
        this.f557ht = new HashMap();
        this.f556ft = new HashMap();
        HashMap map = new HashMap();
        this.f558kt = map;
        map.putAll(prev.f558kt);
        this.f556ft.putAll(prev.f556ft);
        this.f557ht.putAll(prev.f556ft);
    }

    private <T> C0723Key<T> m500key(Class<T> clss) {
        checkState(this.f558kt);
        C0723Key<T> k = (C0723Key) uncheckedCast(this.f558kt.get(clss));
        if (k == null) {
            C0723Key<T> k2 = new C0723Key<>();
            this.f558kt.put(clss, k2);
            return k2;
        }
        return k;
    }

    public <T> T m502get(Class<T> cls) {
        return (T) m501get(m500key(cls));
    }

    public <T> void m506put(Class<T> clazz, T data) {
        m504put(m500key(clazz), data);
    }

    public <T> void m505put(Class<T> clazz, Factory<T> fac) {
        m503put((C0723Key) m500key(clazz), (Factory) fac);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T uncheckedCast(Object obj) {
        return obj;
    }

    public void dump() {
        Iterator<Object> it = this.f557ht.values().iterator();
        while (it.hasNext()) {
            Object value = it.next();
            System.err.println(value == null ? null : value.getClass());
        }
    }

    public void clear() {
        this.f557ht = null;
        this.f558kt = null;
        this.f556ft = null;
    }

    private static void checkState(Map<?, ?> t) {
        if (t == null) {
            throw new IllegalStateException();
        }
    }
}
