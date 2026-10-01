package a.b.g;

import a.b.b;

public class as implements Interfacen {

    private Interfacen[] f349a;

    private int f350b;

    public as() {
    }

    public as(Interfacen[] interfaceC0148nArr) {
        this.f349a = interfaceC0148nArr;
        this.f350b = interfaceC0148nArr.length;
    }

    private void m1009a() {
        if (this.f349a == null) {
            this.f349a = new Interfacen[5];
        } else if (this.f349a.length == this.f350b) {
            Interfacen[] interfaceC0148nArr = new Interfacen[this.f350b + 5];
            System.arraycopy(this.f349a, 0, interfaceC0148nArr, 0, this.f350b);
            this.f349a = interfaceC0148nArr;
        }
    }

    @Override
    public void mo951a(b bVar) {
        for (int i = 0; i < this.f350b; i++) {
            this.f349a[i].mo951a(bVar);
        }
    }

    public void m1010a(Interfacen interfaceC0148n) {
        m1009a();
        Interfacen[] interfaceC0148nArr = this.f349a;
        int i = this.f350b;
        this.f350b = i + 1;
        interfaceC0148nArr[i] = interfaceC0148n;
    }
}
