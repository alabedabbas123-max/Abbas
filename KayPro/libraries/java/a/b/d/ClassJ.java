package a.b.d;

import a.b.a.d;
import a.b.c;
import a.b.Interfacej;

public class ClassJ extends Abstracti {

    public int f153a;

    public int f154e;

    public ClassJ() {
    }

    public ClassJ(byte b, int i, int i2, int i3, int[] iArr) {
        this.f147c = b;
        this.f151b = i;
        this.f153a = i2;
        this.f154e = i3;
        this.f152d = iArr;
    }

    @Override
    public int mo322a(int i) {
        return ((-(i + 1)) & 3) + 1 + 12 + (((this.f154e - this.f153a) + 1) * 4);
    }

    @Override
    public Abstractc mo323a() {
        return this;
    }

    @Override
    public void mo324a(c cVar, Interfacej interfaceC0162j, d dVar, int i, a.b.d.a.d dVar2) {
        dVar2.a(cVar, interfaceC0162j, dVar, i, this);
    }

    @Override
    protected void mo326b(byte[] bArr, int i) {
        int i2 = ((-i) & 3) + i;
        this.f151b = m377f(bArr, i2);
        int i3 = i2 + 4;
        this.f153a = m377f(bArr, i3);
        int i4 = i3 + 4;
        this.f154e = m377f(bArr, i4);
        int i5 = i4 + 4;
        this.f152d = new int[(this.f154e - this.f153a) + 1];
        for (int i6 = 0; i6 < this.f152d.length; i6++) {
            this.f152d[i6] = m377f(bArr, i5);
            i5 += 4;
        }
    }

    @Override
    protected void mo327c(byte[] bArr, int i) {
        while ((i & 3) != 0) {
            m372c(bArr, i, 0);
            i++;
        }
        m376e(bArr, i, this.f151b);
        int i2 = i + 4;
        m376e(bArr, i2, this.f153a);
        int i3 = i2 + 4;
        m376e(bArr, i3, this.f154e);
        int i4 = i3 + 4;
        int i5 = (this.f154e - this.f153a) + 1;
        for (int i6 = 0; i6 < i5; i6++) {
            m376e(bArr, i4, this.f152d[i6]);
            i4 += 4;
        }
    }
}
