package a.b.g;

import a.b.c;
import a.b.g.s;
import a.b.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import a.b.ClassE;

class be implements s {

    private final ExecutorService f372a;

    private final List f373b = new ArrayList();

    public be(ExecutorService executorService) {
        this.f372a = executorService;
    }

    private void m1028a(c cVar) {
        this.f373b.add(this.f372a.submit(new Runnablebf(this, cVar)));
    }

    public void m1029a() {
        Iterator it = this.f373b.iterator();
        while (it.hasNext()) {
            ((Future) it.next()).get();
        }
    }

    public void m1030a(ClassE c0057e) {
        m1028a((c) c0057e);
    }

    public void m1031a(k kVar) {
        m1028a((c) kVar);
    }
}
