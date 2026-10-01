package com.a.b.f.a;

import java.util.BitSet;

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
abstract class Enumc {

    public static final Enumc f3296a;

    public static final Enumc f3297b;

    public static final Enumc f3298c;

    private static final Enumc[] f3299d;

    static {
        final int i = 2;
        final int i2 = 1;
        final int i3 = 0;
        final String str = "EVEN";
        f3296a = new Enumc(str, i3) {
            {
                Enumc enumC1242c = null;
            }

            @Override
            int mo5122a(BitSet bitSet, int i4) {
                int iNextClearBit = bitSet.nextClearBit(i4);
                while (!ClassA.m5110f(iNextClearBit)) {
                    iNextClearBit = bitSet.nextClearBit(iNextClearBit + 1);
                }
                return iNextClearBit;
            }
        };
        final String str2 = "ODD";
        f3297b = new Enumc(str2, i2) {
            {
                Enumc enumC1242c = null;
            }

            @Override
            int mo5122a(BitSet bitSet, int i4) {
                int iNextClearBit = bitSet.nextClearBit(i4);
                while (ClassA.m5110f(iNextClearBit)) {
                    iNextClearBit = bitSet.nextClearBit(iNextClearBit + 1);
                }
                return iNextClearBit;
            }
        };
        final String str3 = "UNSPECIFIED";
        f3298c = new Enumc(str3, i) {
            {
                Enumc enumC1242c = null;
            }

            @Override
            int mo5122a(BitSet bitSet, int i4) {
                return bitSet.nextClearBit(i4);
            }
        };
        f3299d = new Enumc[]{f3296a, f3297b, f3298c};
    }

    private Enumc(String str, int i) {
        super(str, i);
    }

    Enumc(String str, int i, Enumc enumC1242c) {
        this(str, i);
    }

    public static Enumc valueOf(String str) {
        return (Enumc) Enum.valueOf(Enumc.class, str);
    }

    public static Enumc[] values() {
        Enumc[] enumC1242cArr = f3299d;
        int length = enumC1242cArr.length;
        Enumc[] enumC1242cArr2 = new Enumc[length];
        System.arraycopy(enumC1242cArr, 0, enumC1242cArr2, 0, length);
        return enumC1242cArr2;
    }

    abstract int mo5122a(BitSet bitSet, int i);
}
