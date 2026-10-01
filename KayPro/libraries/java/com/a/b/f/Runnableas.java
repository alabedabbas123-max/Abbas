package com.a.b.f;

import com.a.b.e.b.ClassO;
import com.a.b.e.b.ClassU;
import com.a.b.e.d.ClassC;
import java.util.ArrayList;

public class Runnableas implements Runnable {

    private final ap f3386a;

    private int f3387b;

    private final int f3388c;

    private int f3389d;

    private final ClassU[][] f3390e;

    private final ArrayList f3391f;

    public Runnableas(ap c1270ap) {
        this.f3388c = c1270ap.m5294g();
        this.f3386a = c1270ap;
        this.f3387b = this.f3388c;
        this.f3389d = 0;
        this.f3390e = new ClassU[c1270ap.m5297j().size()][];
        this.f3391f = new ArrayList();
        ClassU[] c1194uArr = new ClassU[this.f3388c];
        for (int i = 0; i < this.f3388c; i++) {
            c1194uArr[i] = ClassU.m4876a(i, ClassC.f3258i);
        }
        this.f3390e[c1270ap.m5287c()] = c1194uArr;
    }

    public Runnableas(ap c1270ap, int i) {
        this(c1270ap);
        this.f3389d = i;
    }

    public ClassO m5305a(int i) {
        if (i < this.f3391f.size()) {
            return (ClassO) this.f3391f.get(i);
        }
        return null;
    }

    public void m5307a(ClassU c1194u) {
        int iM4894g = c1194u.m4894g();
        ClassO c1188oM4896i = c1194u.m4896i();
        this.f3391f.ensureCapacity(iM4894g + 1);
        while (this.f3391f.size() <= iM4894g) {
            this.f3391f.add(null);
        }
        this.f3391f.set(iM4894g, c1188oM4896i);
    }

    public boolean m5311b(int i) {
        return i < this.f3389d;
    }

    public static boolean m5313b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static ClassU[] m5314b(ClassU[] c1194uArr) {
        ClassU[] c1194uArr2 = new ClassU[c1194uArr.length];
        System.arraycopy(c1194uArr, 0, c1194uArr2, 0, c1194uArr.length);
        return c1194uArr2;
    }

    public boolean m5318c(int i) {
        return i < this.f3388c;
    }

    @Override
    public void run() {
        this.f3386a.m5275a(new at(this));
        this.f3386a.m5292e(this.f3387b);
        this.f3386a.m5299l();
    }
}
