package sun.misc;

public abstract class LRUCache<N, V> {

    private V[] f594oa = null;
    private final int size;

    protected abstract V create(N n);

    protected abstract boolean hasName(V v, N n);

    public LRUCache(int size) {
        this.size = size;
    }

    public static void moveToFront(Object[] oa, int i) {
        Object ob = oa[i];
        for (int j = i; j > 0; j--) {
            oa[j] = oa[j - 1];
        }
        oa[0] = ob;
    }

    public V forName(N n) {
        if (this.f594oa == null) {
            this.f594oa = (V[]) new Object[this.size];
        } else {
            int i = 0;
            while (true) {
                V[] vArr = this.f594oa;
                if (i >= vArr.length) {
                    break;
                }
                V v = vArr[i];
                if (v == null || !hasName(v, n)) {
                    i++;
                } else {
                    if (i > 0) {
                        moveToFront(this.f594oa, i);
                    }
                    return v;
                }
            }
        }
        V vCreate = create(n);
        V[] vArr2 = this.f594oa;
        vArr2[vArr2.length - 1] = vCreate;
        moveToFront(vArr2, vArr2.length - 1);
        return vCreate;
    }
}
