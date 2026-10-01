package a.j;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ClassN {

    private final Map f1337a = new HashMap();

    private final Set f1338b = new HashSet();

    public Set m3164a() {
        return this.f1338b;
    }

    public Set m3165a(Object obj) {
        return (Set) this.f1337a.get(obj);
    }

    public void m3166a(Object obj, Object obj2) {
        m3167a(obj, Collections.singleton(obj2));
    }

    public void m3167a(Object obj, Set set) {
        this.f1338b.addAll(set);
        Set hashSet = (Set) this.f1337a.get(obj);
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f1337a.put(obj, hashSet);
        }
        hashSet.addAll(set);
    }
}
