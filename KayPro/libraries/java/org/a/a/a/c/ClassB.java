package org.a.a.a.c;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class ClassB implements Set {

    static final boolean f5264g;

    protected final Abstracta f5265a;

    protected Object[][] f5266b;

    protected int f5267c;

    protected int f5268d;

    protected int f5269e;

    protected int f5270f;

    static {
        f5264g = !ClassB.class.desiredAssertionStatus();
    }

    public ClassB() {
        this(null, 16, 8);
    }

    public ClassB(Abstracta abstractC1764a, int i, int i2) {
        this.f5267c = 0;
        this.f5268d = (int) Math.floor(12.0d);
        this.f5269e = 1;
        this.f5270f = 8;
        this.f5265a = abstractC1764a == null ? ClassL.f5292a : abstractC1764a;
        this.f5266b = mo7319d(i);
        this.f5270f = i2;
    }

    protected void m7368a() {
        Object[] objArrCopyOf;
        Object[][] objArr = this.f5266b;
        this.f5269e += 4;
        int length = this.f5266b.length * 2;
        Object[][] objArrMo7319d = mo7319d(length);
        int[] iArr = new int[objArrMo7319d.length];
        this.f5266b = objArrMo7319d;
        this.f5268d = (int) (((double) length) * 0.75d);
        int size = size();
        for (Object[] objArr2 : objArr) {
            if (objArr2 != null) {
                for (Object obj : objArr2) {
                    if (obj == null) {
                        break;
                    }
                    int iM7372f = m7372f(obj);
                    int i = iArr[iM7372f];
                    if (i == 0) {
                        objArrCopyOf = mo7318c(this.f5270f);
                        objArrMo7319d[iM7372f] = objArrCopyOf;
                    } else {
                        objArrCopyOf = objArrMo7319d[iM7372f];
                        if (i == objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length * 2);
                            objArrMo7319d[iM7372f] = objArrCopyOf;
                        }
                    }
                    objArrCopyOf[i] = obj;
                    iArr[iM7372f] = iArr[iM7372f] + 1;
                }
            }
        }
        if (!f5264g && this.f5267c != size) {
            throw new AssertionError();
        }
    }

    @Override
    public final boolean add(Object obj) {
        return m7369c(obj) == obj;
    }

    @Override
    public boolean addAll(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            if (m7369c(obj) != obj) {
                z = true;
            }
        }
        return z;
    }

    protected Object mo7316b(Object obj) {
        return obj;
    }

    public final Object m7369c(Object obj) {
        if (this.f5267c > this.f5268d) {
            m7368a();
        }
        return m7370d(obj);
    }

    protected Object[] mo7318c(int i) {
        return new Object[i];
    }

    @Override
    public void clear() {
        this.f5266b = mo7319d(16);
        this.f5267c = 0;
        this.f5268d = (int) Math.floor(12.0d);
    }

    @Override
    public final boolean contains(Object obj) {
        return m7373g(mo7316b(obj));
    }

    @Override
    public boolean containsAll(Collection collection) {
        if (collection instanceof ClassB) {
            for (Object[] objArr : ((ClassB) collection).f5266b) {
                if (objArr != null) {
                    for (Object obj : objArr) {
                        if (obj == null) {
                            break;
                        }
                        if (!m7373g(mo7316b(obj))) {
                            return false;
                        }
                    }
                }
            }
        } else {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!m7373g(mo7316b(it.next()))) {
                    return false;
                }
            }
        }
        return true;
    }

    protected Object m7370d(Object obj) {
        int iM7372f = m7372f(obj);
        Object[] objArr = this.f5266b[iM7372f];
        if (objArr == null) {
            Object[] objArrMo7318c = mo7318c(this.f5270f);
            objArrMo7318c[0] = obj;
            this.f5266b[iM7372f] = objArrMo7318c;
            this.f5267c++;
            return obj;
        }
        for (int i = 0; i < objArr.length; i++) {
            Object obj2 = objArr[i];
            if (obj2 == null) {
                objArr[i] = obj;
                this.f5267c++;
                return obj;
            }
            if (this.f5265a.mo7322a(obj2, obj)) {
                return obj2;
            }
        }
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length * 2);
        this.f5266b[iM7372f] = objArrCopyOf;
        objArrCopyOf[length] = obj;
        this.f5267c++;
        return obj;
    }

    protected Object[][] mo7319d(int i) {
        return new Object[i][];
    }

    public Object m7371e(Object obj) {
        if (obj == null) {
            return obj;
        }
        Object[] objArr = this.f5266b[m7372f(obj)];
        if (objArr == null) {
            return null;
        }
        for (Object obj2 : objArr) {
            if (obj2 == null) {
                return null;
            }
            if (this.f5265a.mo7322a(obj2, obj)) {
                return obj2;
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClassB)) {
            return false;
        }
        ClassB c1765b = (ClassB) obj;
        if (c1765b.size() == size()) {
            return containsAll(c1765b);
        }
        return false;
    }

    protected final int m7372f(Object obj) {
        return this.f5265a.mo7320a(obj) & (this.f5266b.length - 1);
    }

    public boolean m7373g(Object obj) {
        return (obj == null || m7371e(obj) == null) ? false : true;
    }

    public boolean m7374h(Object obj) {
        Object obj2;
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f5266b[m7372f(obj)];
        if (objArr == null) {
            return false;
        }
        for (int i = 0; i < objArr.length && (obj2 = objArr[i]) != null; i++) {
            if (this.f5265a.mo7322a(obj2, obj)) {
                System.arraycopy(objArr, i + 1, objArr, i, (objArr.length - i) - 1);
                objArr[objArr.length - 1] = null;
                this.f5267c--;
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int iM7404a = ClassK.m7404a();
        for (Object[] objArr : this.f5266b) {
            if (objArr != null) {
                int length = objArr.length;
                int i = 0;
                while (i < length) {
                    Object obj = objArr[i];
                    if (obj == null) {
                        break;
                    }
                    i++;
                    iM7404a = ClassK.m7406a(iM7404a, this.f5265a.mo7320a(obj));
                }
            }
        }
        return ClassK.m7408b(iM7404a, size());
    }

    @Override
    public final boolean isEmpty() {
        return this.f5267c == 0;
    }

    @Override
    public Iterator iterator() {
        return new ClassC(this, toArray());
    }

    @Override
    public final boolean remove(Object obj) {
        return m7374h(mo7316b(obj));
    }

    @Override
    public boolean removeAll(Collection collection) {
        boolean zM7374h = false;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zM7374h |= m7374h(mo7316b(it.next()));
        }
        return zM7374h;
    }

    @Override
    public boolean retainAll(Collection collection) {
        int i = 0;
        for (Object[] objArr : this.f5266b) {
            if (objArr != null) {
                int i2 = 0;
                int i3 = i;
                int i4 = 0;
                while (i2 < objArr.length && objArr[i2] != null) {
                    if (collection.contains(objArr[i2])) {
                        if (i2 != i4) {
                            objArr[i4] = objArr[i2];
                        }
                        i4++;
                        i3++;
                    }
                    i2++;
                }
                int i5 = i3 + i4;
                while (i4 < i2) {
                    objArr[i4] = null;
                    i4++;
                }
                i = i5;
            }
        }
        boolean z = i != this.f5267c;
        this.f5267c = i;
        return z;
    }

    @Override
    public final int size() {
        return this.f5267c;
    }

    @Override
    public Object[] toArray() {
        Object[] objArrMo7318c = mo7318c(size());
        int i = 0;
        for (Object[] objArr : this.f5266b) {
            if (objArr != null) {
                int length = objArr.length;
                int i2 = 0;
                while (i2 < length) {
                    Object obj = objArr[i2];
                    if (obj == null) {
                        break;
                    }
                    objArrMo7318c[i] = obj;
                    i2++;
                    i++;
                }
            }
        }
        return objArrMo7318c;
    }

    @Override
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
        }
        int i = 0;
        for (Object[] objArr2 : this.f5266b) {
            if (objArr2 != null) {
                int length = objArr2.length;
                int i2 = 0;
                while (i2 < length) {
                    Object obj = objArr2[i2];
                    if (obj == null) {
                        break;
                    }
                    objArr[i] = obj;
                    i2++;
                    i++;
                }
            }
        }
        return objArr;
    }

    public String toString() {
        if (size() == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        for (Object[] objArr : this.f5266b) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        break;
                    }
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(obj.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
