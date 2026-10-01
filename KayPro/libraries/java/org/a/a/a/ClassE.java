package org.a.a.a;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class ClassE {

    static final boolean f5297a;

    private static int[] f5298f;

    private final Enumg f5299b;

    private final ByteBuffer f5300c;

    private final CharBuffer f5301d;

    private final IntBuffer f5302e;

    static {
        f5297a = !ClassE.class.desiredAssertionStatus();
    }

    private ClassE(Enumg enumC1781g, ByteBuffer byteBuffer, CharBuffer charBuffer, IntBuffer intBuffer) {
        this.f5299b = enumC1781g;
        this.f5300c = byteBuffer;
        this.f5301d = charBuffer;
        this.f5302e = intBuffer;
    }

    ClassE(Enumg enumC1781g, ByteBuffer byteBuffer, CharBuffer charBuffer, IntBuffer intBuffer, ClassE c1779e) {
        this(enumC1781g, byteBuffer, charBuffer, intBuffer);
    }

    public static ClassF m7412a(int i) {
        return new ClassF(i, null);
    }

    static int[] m7413h() {
        int[] iArr = f5298f;
        if (iArr == null) {
            iArr = new int[Enumg.m7433a().length];
            try {
                iArr[Enumg.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Enumg.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[Enumg.INT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            f5298f = iArr;
        }
        return iArr;
    }

    public int m7414a() {
        switch (m7413h()[this.f5299b.ordinal()]) {
            case 1:
                return this.f5300c.position();
            case 2:
                return this.f5301d.position();
            case 3:
                return this.f5302e.position();
            default:
                throw new UnsupportedOperationException("Not reached");
        }
    }

    public int m7415b() {
        switch (m7413h()[this.f5299b.ordinal()]) {
            case 1:
                return this.f5300c.remaining();
            case 2:
                return this.f5301d.remaining();
            case 3:
                return this.f5302e.remaining();
            default:
                throw new UnsupportedOperationException("Not reached");
        }
    }

    Enumg m7416c() {
        return this.f5299b;
    }

    int m7417d() {
        switch (m7413h()[this.f5299b.ordinal()]) {
            case 1:
                return this.f5300c.arrayOffset();
            case 2:
                return this.f5301d.arrayOffset();
            case 3:
                return this.f5302e.arrayOffset();
            default:
                throw new UnsupportedOperationException("Not reached");
        }
    }

    byte[] m7418e() {
        if (f5297a || this.f5299b == Enumg.BYTE) {
            return this.f5300c.array();
        }
        throw new AssertionError();
    }

    char[] m7419f() {
        if (f5297a || this.f5299b == Enumg.CHAR) {
            return this.f5301d.array();
        }
        throw new AssertionError();
    }

    int[] m7420g() {
        if (f5297a || this.f5299b == Enumg.INT) {
            return this.f5302e.array();
        }
        throw new AssertionError();
    }
}
