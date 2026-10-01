package a.b;

import a.b.c;
import a.b.g.aq;

public abstract class Abstractg implements Interfacei {

    public int f313b;

    public String f314c;

    public String f315d;

    public Object f316e;

    protected Abstractg() {
    }

    @Override
    public int mo945a() {
        return this.f313b;
    }

    @Override
    public String mo946a(c cVar) {
        return this.f314c;
    }

    @Override
    public void mo947a(c cVar, aq aqVar) {
        mo676a((ClassE) cVar, aqVar);
    }

    public abstract void mo676a(ClassE c0057e, aq aqVar);

    public void m948a(Object obj) {
        this.f316e = obj;
    }

    @Override
    public String mo949b(c cVar) {
        return this.f315d;
    }

    public Object m950f() {
        return this.f316e;
    }
}
