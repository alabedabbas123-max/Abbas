package com.a.b.e.c;

import com.a.b.e.d.ClassA;
import com.a.b.e.d.ClassC;

public abstract class Abstractf extends Abstractx {

    private final ClassA f3156a;

    private ClassA f3157b;

    Abstractf(ae c1205ae, aa c1201aa) {
        super(c1205ae, c1201aa);
        String strM4958j = m5023o().m4945b().m4958j();
        if (m4986l()) {
            this.f3156a = ClassA.m5036b(strM4958j);
        } else {
            this.f3156a = ClassA.m5033a(strM4958j);
        }
        this.f3157b = null;
    }

    public final ClassA m4981a(boolean z) {
        if (z) {
            return this.f3156a;
        }
        if (this.f3157b == null) {
            this.f3157b = this.f3156a.m5039a(m5022n().m4966i());
        }
        return this.f3157b;
    }

    @Override
    public final ClassC mo3825a() {
        return this.f3156a.m5041b();
    }

    @Override
    protected final int mo4941b(Abstracta abstractC1200a) {
        int iMo4941b = super.mo4941b(abstractC1200a);
        return iMo4941b != 0 ? iMo4941b : this.f3156a.compareTo(((Abstractf) abstractC1200a).f3156a);
    }

    public final int m4982b(boolean z) {
        return m4981a(z).m5042c().m5055e();
    }

    public final ClassA m4983i() {
        return this.f3156a;
    }

    public final boolean m4984j() {
        return m5023o().m4947e();
    }

    public final boolean m4985k() {
        return m5023o().m4948f();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean m4986l() {
        ae c1205aeN = m5022n();
        if (!c1205aeN.equals(ae.f3148s)) {
            if (c1205aeN.equals(ae.f3149t)) {
                String strM4958j = m5023o().m4944a().m4958j();
                switch (strM4958j.hashCode()) {
                    case -1946504908:
                        if (strM4958j.equals("getAndBitwiseOrRelease")) {
                            return true;
                        }
                        break;
                    case -1686727776:
                        if (strM4958j.equals("getAndBitwiseAndRelease")) {
                            return true;
                        }
                        break;
                    case -1671098288:
                        if (strM4958j.equals("compareAndSet")) {
                            return true;
                        }
                        break;
                    case -1292078254:
                        if (strM4958j.equals("compareAndExchangeRelease")) {
                            return true;
                        }
                        break;
                    case -1117944904:
                        if (strM4958j.equals("weakCompareAndSet")) {
                            return true;
                        }
                        break;
                    case -1103072857:
                        if (strM4958j.equals("getAndAddRelease")) {
                            return true;
                        }
                        break;
                    case -1032914329:
                        if (strM4958j.equals("getAndBitwiseAnd")) {
                            return true;
                        }
                        break;
                    case -1032892181:
                        if (strM4958j.equals("getAndBitwiseXor")) {
                            return true;
                        }
                        break;
                    case -794517348:
                        if (strM4958j.equals("getAndBitwiseXorRelease")) {
                            return true;
                        }
                        break;
                    case -567150350:
                        if (strM4958j.equals("weakCompareAndSetPlain")) {
                            return true;
                        }
                        break;
                    case -240822786:
                        if (strM4958j.equals("weakCompareAndSetAcquire")) {
                            return true;
                        }
                        break;
                    case -230706875:
                        if (strM4958j.equals("setRelease")) {
                            return true;
                        }
                        break;
                    case -127361888:
                        if (strM4958j.equals("getAcquire")) {
                            return true;
                        }
                        break;
                    case -37641530:
                        if (strM4958j.equals("getAndSetRelease")) {
                            return true;
                        }
                        break;
                    case 102230:
                        if (strM4958j.equals("get")) {
                            return true;
                        }
                        break;
                    case 113762:
                        if (strM4958j.equals("set")) {
                            return true;
                        }
                        break;
                    case 93645315:
                        if (strM4958j.equals("getAndBitwiseOrAcquire")) {
                            return true;
                        }
                        break;
                    case 101293086:
                        if (strM4958j.equals("setVolatile")) {
                            return true;
                        }
                        break;
                    case 189872914:
                        if (strM4958j.equals("getVolatile")) {
                            return true;
                        }
                        break;
                    case 282707520:
                        if (strM4958j.equals("getAndAdd")) {
                            return true;
                        }
                        break;
                    case 282724865:
                        if (strM4958j.equals("getAndSet")) {
                            return true;
                        }
                        break;
                    case 353422447:
                        if (strM4958j.equals("getAndBitwiseAndAcquire")) {
                            return true;
                        }
                        break;
                    case 470702883:
                        if (strM4958j.equals("setOpaque")) {
                            return true;
                        }
                        break;
                    case 685319959:
                        if (strM4958j.equals("getOpaque")) {
                            return true;
                        }
                        break;
                    case 748071969:
                        if (strM4958j.equals("compareAndExchangeAcquire")) {
                            return true;
                        }
                        break;
                    case 937077366:
                        if (strM4958j.equals("getAndAddAcquire")) {
                            return true;
                        }
                        break;
                    case 1245632875:
                        if (strM4958j.equals("getAndBitwiseXorAcquire")) {
                            return true;
                        }
                        break;
                    case 1352153939:
                        if (strM4958j.equals("getAndBitwiseOr")) {
                            return true;
                        }
                        break;
                    case 1483964149:
                        if (strM4958j.equals("compareAndExchange")) {
                            return true;
                        }
                        break;
                    case 2002508693:
                        if (strM4958j.equals("getAndSetAcquire")) {
                            return true;
                        }
                        break;
                    case 2013994287:
                        if (strM4958j.equals("weakCompareAndSetRelease")) {
                            return true;
                        }
                        break;
                }
            }
        } else {
            String strM4958j2 = m5023o().m4944a().m4958j();
            switch (strM4958j2.hashCode()) {
                case -1183693704:
                    if (strM4958j2.equals("invoke")) {
                        return true;
                    }
                    break;
                case 941760871:
                    if (strM4958j2.equals("invokeExact")) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
