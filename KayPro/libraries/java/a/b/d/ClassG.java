package a.b.d;

import a.b.a.d;
import a.b.c;
import a.b.Interfacej;

public class ClassG extends Abstracti {

    public int[] f149a;

    public ClassG() {
    }

    public ClassG(byte b, int i, int[] iArr, int[] iArr2) {
        this.f147c = b;
        this.f151b = i;
        this.f149a = iArr;
        this.f152d = iArr2;
    }

    @Override
    public int mo322a(int i) {
        return ((-(i + 1)) & 3) + 1 + 8 + (this.f149a.length * 8);
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
        int iF = m377f(bArr, i3);
        int i4 = i3 + 4;
        this.f149a = new int[iF];
        this.f152d = new int[iF];
        for (int i5 = 0; i5 < iF; i5++) {
            this.f149a[i5] = m377f(bArr, i4);
            int i6 = i4 + 4;
            this.f152d[i5] = m377f(bArr, i6);
            i4 = i6 + 4;
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
        m376e(bArr, i2, this.f149a.length);
        int i3 = i2 + 4;
        for (int i4 = 0; i4 < this.f149a.length; i4++) {
            m376e(bArr, i3, this.f149a[i4]);
            int i5 = i3 + 4;
            m376e(bArr, i5, this.f152d[i4]);
            i3 = i5 + 4;
        }
    }
}
