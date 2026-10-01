package com.a.b.c.b;

import com.a.b.e.c.ae;
import com.a.b.g.ClassJ;
import com.a.b.g.ClassK;

public final class ClassD extends ClassJ implements Comparable {

    public static final ClassD f2060a = new ClassD(0);

    public ClassD(int i) {
        super(i);
    }

    @Override
    public int compareTo(ClassD c1036d) {
        if (this == c1036d) {
            return 0;
        }
        int iD_ = m5476d_();
        int iD_2 = c1036d.m5476d_();
        int iMin = Math.min(iD_, iD_2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = m4336a(i).compareTo(c1036d.m4336a(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (iD_ < iD_2) {
            return -1;
        }
        return iD_ > iD_2 ? 1 : 0;
    }

    public ClassE m4336a(int i) {
        return (ClassE) m5477e(i);
    }

    public String m4337a(String str, String str2) {
        StringBuilder sb = new StringBuilder(100);
        int iD_ = m5476d_();
        sb.append(str);
        sb.append(str2);
        sb.append("catch ");
        for (int i = 0; i < iD_; i++) {
            ClassE c1037eM4336a = m4336a(i);
            if (i != 0) {
                sb.append(",\n");
                sb.append(str);
                sb.append("  ");
            }
            if (i == iD_ - 1 && m4339e()) {
                sb.append("<any>");
            } else {
                sb.append(c1037eM4336a.m4341a().mo3828d());
            }
            sb.append(" -> ");
            sb.append(ClassK.m5486d(c1037eM4336a.m4342b()));
        }
        return sb.toString();
    }

    public void m4338a(int i, ae c1205ae, int i2) {
        m5474a(i, new ClassE(c1205ae, i2));
    }

    @Override
    public String mo3828d() {
        return m4337a("", "");
    }

    public boolean m4339e() {
        int iD_ = m5476d_();
        if (iD_ == 0) {
            return false;
        }
        return m4336a(iD_ - 1).m4341a().equals(ae.f3130a);
    }
}
