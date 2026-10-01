package org.c.a.a.d;

public class ClassE {

    protected Object[] f6422a;

    protected int f6423b;

    public ClassE() {
        this.f6422a = new Object[16];
        this.f6423b = 0;
    }

    public ClassE(ClassE c2249e) {
        this.f6422a = (Object[]) c2249e.f6422a.clone();
        this.f6423b = c2249e.f6423b;
    }

    public int m8848a() {
        return this.f6423b;
    }

    public void m8849a(Object obj) {
        if (this.f6423b == this.f6422a.length) {
            Object[] objArr = new Object[this.f6422a.length * 2];
            System.arraycopy(this.f6422a, 0, objArr, 0, this.f6422a.length);
            this.f6422a = objArr;
        }
        Object[] objArr2 = this.f6422a;
        int i = this.f6423b;
        this.f6423b = i + 1;
        objArr2[i] = obj;
    }

    public void m8850a(Object obj, Object obj2) {
        for (int i = this.f6423b - 1; i >= 0 && this.f6422a[i] == obj; i--) {
            this.f6422a[i] = obj2;
        }
    }

    public void m8851a(ClassE c2249e) {
        if (this.f6422a.length < c2249e.f6423b) {
            this.f6422a = new Object[c2249e.f6423b];
        }
        System.arraycopy(c2249e.f6422a, 0, this.f6422a, 0, c2249e.f6423b);
        this.f6423b = c2249e.f6423b;
    }

    public boolean m8852b() {
        return this.f6423b == 0;
    }

    public Object m8853c() {
        Object[] objArr = this.f6422a;
        int i = this.f6423b - 1;
        this.f6423b = i;
        Object obj = objArr[i];
        this.f6422a[this.f6423b] = null;
        return obj;
    }

    public Object m8854d() {
        return this.f6422a[this.f6423b - 1];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Stack{head=");
        sb.append(this.f6423b);
        sb.append(", elements=[");
        if (this.f6423b > 0) {
            sb.append(this.f6422a[0]);
            for (int i = 1; i < this.f6423b; i++) {
                sb.append(", ");
                sb.append(this.f6422a[i]);
            }
        }
        sb.append("]}");
        return sb.toString();
    }
}
