package com.a.b.f;

import com.a.b.e.b.Abstractj;
import com.a.b.e.b.aa;
import com.a.b.e.b.ad;
import com.a.b.e.b.ClassO;
import com.a.b.e.b.ClassU;
import com.a.b.e.b.ClassX;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfaced;
import com.a.b.g.ClassK;
import java.util.ArrayList;
import java.util.List;

public final class ac extends Abstractan {

    private final int f3337a;

    private final ArrayList f3338b;

    private ClassX f3339c;

    public ac(int i, aj c1264aj) {
        super(ClassU.m4876a(i, ClassC.f3258i), c1264aj);
        this.f3338b = new ArrayList();
        this.f3337a = i;
    }

    public ac(ClassU c1194u, aj c1264aj) {
        super(c1194u, c1264aj);
        this.f3338b = new ArrayList();
        this.f3337a = c1194u.m4894g();
    }

    public int m5161a(int i) {
        return ((ad) this.f3338b.get(i)).f3341b;
    }

    @Override
    public ac clone() {
        throw new UnsupportedOperationException("can't clone phi");
    }

    protected final String m5163a(String str) {
        StringBuilder sb = new StringBuilder(80);
        sb.append(ad.f3049a);
        sb.append(": phi");
        if (str != null) {
            sb.append("(");
            sb.append(str);
            sb.append(")");
        }
        ClassU c1194uO = m5261o();
        if (c1194uO == null) {
            sb.append(" .");
        } else {
            sb.append(" ");
            sb.append(c1194uO.mo3828d());
        }
        sb.append(" <-");
        int iD_ = mo5171b().m5476d_();
        if (iD_ == 0) {
            sb.append(" .");
        } else {
            for (int i = 0; i < iD_; i++) {
                sb.append(" ");
                sb.append(String.valueOf(this.f3339c.m4916b(i).mo3828d()) + "[b=" + ClassK.m5485c(((ad) this.f3338b.get(i)).f3342c) + "]");
            }
        }
        return sb.toString();
    }

    public List m5164a(int i, ap c1270ap) {
        ArrayList arrayList = new ArrayList();
        for (ad c1258ad : this.f3338b) {
            if (c1258ad.f3340a.m4894g() == i) {
                arrayList.add((aj) c1270ap.m5297j().get(c1258ad.f3341b));
            }
        }
        return arrayList;
    }

    public void m5165a(ClassU c1194u) {
        ArrayList arrayList = new ArrayList();
        for (ad c1258ad : this.f3338b) {
            if (c1258ad.f3340a.m4894g() == c1194u.m4894g()) {
                arrayList.add(c1258ad);
            }
        }
        this.f3338b.removeAll(arrayList);
        this.f3339c = null;
    }

    public void m5166a(ClassU c1194u, aj c1264aj) {
        this.f3338b.add(new ad(c1194u, c1264aj.m5227e(), c1264aj.m5228f()));
        this.f3339c = null;
    }

    public void m5167a(Interfaced interfaceC1237d, ClassO c1188o) {
        m5254b(ClassU.m4881b(m5261o().m4894g(), interfaceC1237d, c1188o));
    }

    @Override
    public final void mo5168a(Abstractag abstractC1261ag) {
        for (ad c1258ad : this.f3338b) {
            ClassU c1194u = c1258ad.f3340a;
            c1258ad.f3340a = abstractC1261ag.mo5080a(c1194u);
            if (c1194u != c1258ad.f3340a) {
                m5262p().m5237o().m5278a(this, c1194u, c1258ad.f3340a);
            }
        }
        this.f3339c = null;
    }

    @Override
    public void mo5169a(Interfaceao interfaceC1269ao) {
        interfaceC1269ao.mo5119a(this);
    }

    public void m5170a(ap c1270ap) {
        for (ad c1258ad : this.f3338b) {
            c1258ad.f3340a = c1258ad.f3340a.m4888a(c1270ap.m5288c(c1258ad.f3340a.m4894g()).m5261o().mo3825a());
        }
        this.f3339c = null;
    }

    @Override
    public ClassX mo5171b() {
        if (this.f3339c != null) {
            return this.f3339c;
        }
        if (this.f3338b.size() == 0) {
            return ClassX.f3113a;
        }
        int size = this.f3338b.size();
        this.f3339c = new ClassX(size);
        for (int i = 0; i < size; i++) {
            this.f3339c.m4915a(i, ((ad) this.f3338b.get(i)).f3340a);
        }
        this.f3339c.mo3944c_();
        return this.f3339c;
    }

    @Override
    public Abstractj mo5172c() {
        throw new IllegalArgumentException("Cannot convert phi insns to rop form");
    }

    @Override
    public String mo3828d() {
        return m5163a((String) null);
    }

    @Override
    public aa mo5173e() {
        return null;
    }

    @Override
    public Abstractj mo5174f() {
        return null;
    }

    public int m5175h() {
        return this.f3337a;
    }

    @Override
    public boolean mo5176k() {
        return false;
    }

    @Override
    public boolean mo5177l() {
        return true;
    }

    @Override
    public boolean mo5178m() {
        return aa.m5159a() && mo5258g() != null;
    }
}
