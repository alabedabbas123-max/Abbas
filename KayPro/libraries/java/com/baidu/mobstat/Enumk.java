package com.baidu.mobstat;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
public abstract class Enumk {

    public static final Enumk f4519a;

    public static final Enumk f4520b;

    public static final Enumk f4521c;

    public static final Enumk f4522d;

    public static final Enumk f4523e;

    private static final Enumk[] f4524g;

    private int f4525f;

    public abstract Abstractj mo6777a(Context context);

    public static Enumk valueOf(String str) {
        return (Enumk) Enum.valueOf(Enumk.class, str);
    }

    public static Enumk[] values() {
        return (Enumk[]) f4524g.clone();
    }

    static {
        int i = 4;
        int i2 = 3;
        int i3 = 2;
        int i4 = 1;
        int i5 = 0;
        f4519a = new Enumk("AP_LIST", i5, i5) {
            @Override
            public Abstractj mo6777a(Context context) {
                return new ClassM(context);
            }
        };
        f4520b = new Enumk("APP_LIST", i4, i4) {
            @Override
            public Abstractj mo6777a(Context context) {
                return new ClassP(context);
            }
        };
        f4521c = new Enumk("APP_TRACE", i3, i3) {
            @Override
            public Abstractj mo6777a(Context context) {
                return new ClassQ(context);
            }
        };
        f4522d = new Enumk("APP_CHANGE", i2, i2) {
            @Override
            public Abstractj mo6777a(Context context) {
                return new ClassO(context);
            }
        };
        f4523e = new Enumk("APP_APK", i, i) {
            @Override
            public Abstractj mo6777a(Context context) {
                return new ClassN(context);
            }
        };
        f4524g = new Enumk[]{f4519a, f4520b, f4521c, f4522d, f4523e};
    }

    private Enumk(String str, int i, int i2) {
        super(str, i);
        this.f4525f = i2;
    }

    @Override
    public String toString() {
        return String.valueOf(this.f4525f);
    }

    public synchronized ArrayList<ClassI> m6778a(Context context, int i, int i2) {
        ArrayList<ClassI> arrayList;
        arrayList = new ArrayList<>();
        Abstractj abstractC1505jMo6777a = null;
        try {
            try {
                abstractC1505jMo6777a = mo6777a(context);
                if (abstractC1505jMo6777a.m6769a()) {
                    arrayList = abstractC1505jMo6777a.mo6768a(i, i2);
                    if (abstractC1505jMo6777a != null) {
                        abstractC1505jMo6777a.close();
                    }
                } else if (abstractC1505jMo6777a != null) {
                    abstractC1505jMo6777a.close();
                }
            } catch (Throwable th) {
                if (abstractC1505jMo6777a != null) {
                    abstractC1505jMo6777a.close();
                }
                throw th;
            }
        } catch (Exception e) {
            ba.m6312c().m6305b(e);
            if (abstractC1505jMo6777a != null) {
                abstractC1505jMo6777a.close();
            }
        }
        return arrayList;
    }

    public synchronized long m6776a(Context context, long j, String str) {
        long jMo6765a;
        jMo6765a = -1;
        Abstractj abstractC1505jMo6777a = null;
        try {
            try {
                abstractC1505jMo6777a = mo6777a(context);
                if (abstractC1505jMo6777a.m6769a()) {
                    jMo6765a = abstractC1505jMo6777a.mo6765a(String.valueOf(j), str);
                    if (abstractC1505jMo6777a != null) {
                        abstractC1505jMo6777a.close();
                    }
                } else if (abstractC1505jMo6777a != null) {
                    abstractC1505jMo6777a.close();
                }
            } catch (Exception e) {
                ba.m6312c().m6305b(e);
                if (abstractC1505jMo6777a != null) {
                    abstractC1505jMo6777a.close();
                }
            }
        } catch (Throwable th) {
            if (abstractC1505jMo6777a != null) {
                abstractC1505jMo6777a.close();
            }
            throw th;
        }
        return jMo6765a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000a  */
    public synchronized int m6775a(Context context, ArrayList<Long> arrayList) {
        Exception e;
        int i;
        int i2 = 0;
        synchronized (this) {
            if (arrayList != null) {
                try {
                    if (arrayList.size() == 0) {
                        i = 0;
                    } else {
                        Abstractj abstractC1505jMo6777a = null;
                        try {
                            try {
                                abstractC1505jMo6777a = mo6777a(context);
                                if (abstractC1505jMo6777a.m6769a()) {
                                    int size = arrayList.size();
                                    i = 0;
                                    for (int i3 = 0; i3 < size; i3++) {
                                        try {
                                            if (abstractC1505jMo6777a.mo6772b(arrayList.get(i3).longValue())) {
                                                i++;
                                            } else if (abstractC1505jMo6777a != null) {
                                                abstractC1505jMo6777a.close();
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            i2 = i;
                                            ba.m6312c().m6305b(e);
                                            if (abstractC1505jMo6777a != null) {
                                                abstractC1505jMo6777a.close();
                                            }
                                            i = i2;
                                        }
                                    }
                                    if (abstractC1505jMo6777a != null) {
                                        abstractC1505jMo6777a.close();
                                        i2 = i;
                                    } else {
                                        i2 = i;
                                    }
                                    i = i2;
                                } else {
                                    if (abstractC1505jMo6777a != null) {
                                        abstractC1505jMo6777a.close();
                                    }
                                    i = 0;
                                }
                            } catch (Exception e3) {
                                e = e3;
                            }
                        } catch (Throwable th) {
                            if (abstractC1505jMo6777a != null) {
                                abstractC1505jMo6777a.close();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                i = 0;
            }
        }
        return i;
    }

    public synchronized List<String> m6779a(Context context, int i) {
        List<String> arrayList;
        arrayList = new ArrayList<>();
        ArrayList<Long> arrayList2 = new ArrayList<>();
        ArrayList<ClassI> arrayList3 = new ArrayList<>();
        m6773a(context, arrayList, arrayList2, arrayList3, i, 500);
        if (arrayList3.size() != 0 && arrayList.size() == 0 && arrayList2.size() == 0) {
            ClassI c1504i = arrayList3.get(0);
            long jM6761a = c1504i.m6761a();
            String strM6762b = c1504i.m6762b();
            arrayList2.add(Long.valueOf(jM6761a));
            arrayList.add(strM6762b);
        }
        int iM6775a = m6775a(context, arrayList2);
        if (iM6775a != arrayList.size()) {
            arrayList = arrayList.subList(0, iM6775a);
        }
        return arrayList;
    }

    private int m6773a(Context context, List<String> list, ArrayList<Long> arrayList, ArrayList<ClassI> arrayList2, int i, int i2) {
        int i3 = 0;
        int iM6774c = m6774c(context);
        int i4 = 0;
        int i5 = i2;
        while (iM6774c > 0) {
            int i6 = iM6774c < i5 ? iM6774c : i5;
            ArrayList<ClassI> arrayListM6778a = m6778a(context, i6, i4);
            if (i4 == 0 && arrayListM6778a.size() != 0) {
                arrayList2.add(arrayListM6778a.get(0));
            }
            for (ClassI c1504i : arrayListM6778a) {
                long jM6761a = c1504i.m6761a();
                String strM6762b = c1504i.m6762b();
                int length = strM6762b.length();
                if (i3 + length > i) {
                    break;
                }
                arrayList.add(Long.valueOf(jM6761a));
                list.add(strM6762b);
                i3 += length;
            }
            iM6774c -= i6;
            i4 += i6;
            i5 = i6;
        }
        return i3;
    }

    public synchronized boolean m6780b(Context context) {
        return m6774c(context) == 0;
    }

    public synchronized boolean m6781b(Context context, int i) {
        return m6774c(context) >= i;
    }

    private int m6774c(Context context) {
        Abstractj abstractC1505jMo6777a = null;
        try {
            abstractC1505jMo6777a = mo6777a(context);
            if (abstractC1505jMo6777a.m6769a()) {
                int iM6771b = abstractC1505jMo6777a.m6771b();
            }
        } catch (Exception e) {
            ba.m6312c().m6305b(e);
        } finally {
            if (abstractC1505jMo6777a != null) {
                abstractC1505jMo6777a.close();
            }
        }
        return 0;
    }
}
