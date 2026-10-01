package a.b.c;

import a.b.a.a;
import a.b.a.d;
import a.b.a.d.i;
import a.b.c;
import a.b.f.w;
import java.util.Arrays;
import a.b.Interfacej;

public class bt extends w implements i {

    private boolean f34a;

    private boolean[] f35b = new boolean[64];

    private int[] f36c = new int[64];

    private final bu f37d = new bu();

    public void m76a(int i) {
        if (this.f35b.length < i) {
            this.f35b = new boolean[i];
        } else {
            Arrays.fill(this.f35b, 0, i, false);
        }
        this.f34a = false;
    }

    public void m77a(c cVar, a aVar) {
    }

    public void m78a(c cVar, Interfacej interfaceC0162j, d dVar) {
        int i;
        if (this.f34a) {
            int i2 = dVar.d;
            if (this.f36c.length < i2) {
                this.f36c = new int[i2];
            }
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                int[] iArr = this.f36c;
                if (this.f35b[i4]) {
                    i = -1;
                } else {
                    int i5 = i3;
                    i3++;
                    i = i5;
                }
                iArr[i4] = i;
            }
            this.f37d.m95a(this.f36c);
            this.f37d.m85a(cVar, interfaceC0162j, dVar);
            dVar.d = i3;
        }
    }

    public void m79b(int i) {
        this.f35b[i] = true;
        this.f34a = true;
    }
}
