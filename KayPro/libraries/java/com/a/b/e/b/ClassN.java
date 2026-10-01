package com.a.b.e.b;

import com.a.b.e.c.aa;
import com.a.b.e.c.ab;
import com.a.b.e.c.ad;
import com.a.b.e.c.ae;
import com.a.b.e.c.ClassZ;
import com.a.b.e.d.ClassC;
import com.a.b.e.d.Interfacee;

public class ClassN extends Abstractj {

    private static final ad f3088a = new ad("([Ljava/lang/Object;)Ljava/lang/Object;");

    private static final ad f3089b = new ad("([Ljava/lang/Object;)V");

    private static final ad f3090c = new ad("([Ljava/lang/Object;)Z");

    private final Interfacee f3091d;

    private final ClassZ f3092e;

    private final ClassZ f3093f;

    private final ab f3094g;

    public ClassN(aa c1167aa, ad c1170ad, ClassX c1197x, Interfacee interfaceC1238e, ClassZ c1233z) {
        super(c1167aa, c1170ad, null, c1197x);
        if (c1167aa.m4740d() != 6) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c1167aa.m4740d());
        }
        if (interfaceC1238e == null) {
            throw new NullPointerException("catches == null");
        }
        this.f3091d = interfaceC1238e;
        if (c1233z == null) {
            throw new NullPointerException("callSiteMethod == null");
        }
        if (!c1233z.m4986l()) {
            throw new IllegalArgumentException("callSiteMethod is not signature polymorphic");
        }
        this.f3092e = c1233z;
        this.f3093f = m4852a(c1233z);
        this.f3094g = m4853b(c1233z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x019f, code lost:
    
        if (r2.equals("compareAndExchange") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a9, code lost:
    
        if (r2.equals("getAndSetAcquire") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b3, code lost:
    
        if (r2.equals("weakCompareAndSetRelease") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:?, code lost:
    
        return new com.a.b.e.c.ClassZ(r1, new com.a.b.e.c.aa(r0, com.a.b.e.b.ClassN.f3088a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:?, code lost:
    
        return new com.a.b.e.c.ClassZ(r1, new com.a.b.e.c.aa(r0, com.a.b.e.b.ClassN.f3090c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:?, code lost:
    
        return new com.a.b.e.c.ClassZ(r1, new com.a.b.e.c.aa(r0, com.a.b.e.b.ClassN.f3089b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        if (r2.equals("getAndBitwiseOrRelease") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (r2.equals("getAndBitwiseAndRelease") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r2.equals("compareAndSet") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        if (r2.equals("compareAndExchangeRelease") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        if (r2.equals("weakCompareAndSet") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        if (r2.equals("getAndAddRelease") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b9, code lost:
    
        if (r2.equals("getAndBitwiseAnd") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        if (r2.equals("getAndBitwiseXor") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cb, code lost:
    
        if (r2.equals("getAndBitwiseXorRelease") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
    
        if (r2.equals("weakCompareAndSetPlain") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00df, code lost:
    
        if (r2.equals("weakCompareAndSetAcquire") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
    
        if (r2.equals("setRelease") != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ff, code lost:
    
        if (r2.equals("getAcquire") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0109, code lost:
    
        if (r2.equals("getAndSetRelease") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0113, code lost:
    
        if (r2.equals("get") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011d, code lost:
    
        if (r2.equals("set") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0127, code lost:
    
        if (r2.equals("getAndBitwiseOrAcquire") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0131, code lost:
    
        if (r2.equals("setVolatile") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013b, code lost:
    
        if (r2.equals("getVolatile") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0145, code lost:
    
        if (r2.equals("getAndAdd") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014f, code lost:
    
        if (r2.equals("getAndSet") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0159, code lost:
    
        if (r2.equals("getAndBitwiseAndAcquire") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0163, code lost:
    
        if (r2.equals("setOpaque") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016d, code lost:
    
        if (r2.equals("getOpaque") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0177, code lost:
    
        if (r2.equals("compareAndExchangeAcquire") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0181, code lost:
    
        if (r2.equals("getAndAddAcquire") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x018b, code lost:
    
        if (r2.equals("getAndBitwiseXorAcquire") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0195, code lost:
    
        if (r2.equals("getAndBitwiseOr") == false) goto L14;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ClassZ m4852a(ClassZ c1233z) {
        ae c1205aeN = c1233z.m5022n();
        ad c1204adM4944a = c1233z.m5023o().m4944a();
        String strM4958j = c1233z.m5023o().m4944a().m4958j();
        if (c1205aeN.equals(ae.f3148s) && (strM4958j.equals("invoke") || strM4958j.equals("invokeExact"))) {
            return new ClassZ(c1205aeN, new aa(c1204adM4944a, f3088a));
        }
        if (c1205aeN.equals(ae.f3149t)) {
            switch (strM4958j.hashCode()) {
                case -1946504908:
                    break;
                case -1686727776:
                    break;
                case -1671098288:
                    break;
                case -1292078254:
                    break;
                case -1117944904:
                    break;
                case -1103072857:
                    break;
                case -1032914329:
                    break;
                case -1032892181:
                    break;
                case -794517348:
                    break;
                case -567150350:
                    break;
                case -240822786:
                    break;
                case -230706875:
                    break;
                case -127361888:
                    break;
                case -37641530:
                    break;
                case 102230:
                    break;
                case 113762:
                    break;
                case 93645315:
                    break;
                case 101293086:
                    break;
                case 189872914:
                    break;
                case 282707520:
                    break;
                case 282724865:
                    break;
                case 353422447:
                    break;
                case 470702883:
                    break;
                case 685319959:
                    break;
                case 748071969:
                    break;
                case 937077366:
                    break;
                case 1245632875:
                    break;
                case 1352153939:
                    break;
                case 1483964149:
                    break;
                case 2002508693:
                    break;
                case 2013994287:
                    break;
            }
        }
        throw new IllegalArgumentException("Unknown signature polymorphic method: " + c1233z.mo3828d());
    }

    private static ab m4853b(ClassZ c1233z) {
        return new ab(c1233z.m4981a(true));
    }

    @Override
    public Abstractj mo4802a(ClassU c1194u, ClassX c1197x) {
        return new ClassN(m4840f(), m4841g(), c1197x, this.f3091d, m4854c());
    }

    @Override
    public Abstractj mo4803a(ClassC c1236c) {
        return new ClassN(m4840f(), m4841g(), m4844j(), this.f3091d.mo4146a(c1236c), m4854c());
    }

    @Override
    public String mo4804a() {
        return String.valueOf(m4855e().toString()) + " " + m4856m().toString() + " " + ag.m4809a(this.f3091d);
    }

    @Override
    public void mo4805a(Interfacel interfaceC1185l) {
        interfaceC1185l.mo4310a(this);
    }

    @Override
    public Interfacee mo4807b() {
        return this.f3091d;
    }

    public ClassZ m4854c() {
        return this.f3092e;
    }

    public ClassZ m4855e() {
        return this.f3093f;
    }

    public ab m4856m() {
        return this.f3094g;
    }
}
