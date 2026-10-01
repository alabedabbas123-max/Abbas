package org.a.a.a;

import com.myopicmobile.textwarrior.common.Language;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class ClassF {

    static final boolean f5303a;

    private static int[] f5304g;

    private Enumg f5305b;

    private ByteBuffer f5306c;

    private CharBuffer f5307d;

    private IntBuffer f5308e;

    private int f5309f;

    static {
        f5303a = !ClassE.class.desiredAssertionStatus();
    }

    private ClassF(int i) {
        this.f5305b = Enumg.BYTE;
        this.f5306c = ByteBuffer.allocate(i);
        this.f5307d = null;
        this.f5308e = null;
        this.f5309f = -1;
    }

    ClassF(int i, ClassF c1780f) {
        this(i);
    }

    private static int m7421b(int i) {
        return (int) Math.pow(2.0d, 32 - Integer.numberOfLeadingZeros(i - 1));
    }

    private void m7422b(CharBuffer charBuffer) {
        if (!f5303a && !charBuffer.hasArray()) {
            throw new AssertionError();
        }
        switch (m7423b()[this.f5305b.ordinal()]) {
            case 1:
                m7425c(charBuffer);
                return;
            case 2:
                m7427d(charBuffer);
                return;
            case 3:
                m7429e(charBuffer);
                return;
            default:
                return;
        }
    }

    static int[] m7423b() {
        int[] iArr = f5304g;
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
            f5304g = iArr;
        }
        return iArr;
    }

    private void m7424c(int i) {
        this.f5306c.flip();
        CharBuffer charBufferAllocate = CharBuffer.allocate(Math.max(this.f5306c.remaining() + i, this.f5306c.capacity() / 2));
        while (this.f5306c.hasRemaining()) {
            charBufferAllocate.put((char) (this.f5306c.get() & 255));
        }
        this.f5305b = Enumg.CHAR;
        this.f5306c = null;
        this.f5307d = charBufferAllocate;
    }

    private void m7425c(CharBuffer charBuffer) {
        if (!f5303a && this.f5309f != -1) {
            throw new AssertionError();
        }
        char[] cArrArray = charBuffer.array();
        int iPosition = charBuffer.position() + charBuffer.arrayOffset();
        int iLimit = charBuffer.limit() + charBuffer.arrayOffset();
        byte[] bArrArray = this.f5306c.array();
        int iArrayOffset = this.f5306c.arrayOffset() + this.f5306c.position();
        while (iPosition < iLimit) {
            char c = cArrArray[iPosition];
            if (c > 255) {
                charBuffer.position(iPosition - charBuffer.arrayOffset());
                this.f5306c.position(iArrayOffset - this.f5306c.arrayOffset());
                if (Character.isHighSurrogate(c)) {
                    m7426d(charBuffer.remaining());
                    m7429e(charBuffer);
                    return;
                } else {
                    m7424c(charBuffer.remaining());
                    m7427d(charBuffer);
                    return;
                }
            }
            bArrArray[iArrayOffset] = (byte) (c & 255);
            iPosition++;
            iArrayOffset++;
        }
        charBuffer.position(iPosition - charBuffer.arrayOffset());
        this.f5306c.position(iArrayOffset - this.f5306c.arrayOffset());
    }

    private void m7426d(int i) {
        this.f5306c.flip();
        IntBuffer intBufferAllocate = IntBuffer.allocate(Math.max(this.f5306c.remaining() + i, this.f5306c.capacity() / 4));
        while (this.f5306c.hasRemaining()) {
            intBufferAllocate.put(this.f5306c.get() & 255);
        }
        this.f5305b = Enumg.INT;
        this.f5306c = null;
        this.f5308e = intBufferAllocate;
    }

    private void m7427d(CharBuffer charBuffer) {
        if (!f5303a && this.f5309f != -1) {
            throw new AssertionError();
        }
        char[] cArrArray = charBuffer.array();
        int iPosition = charBuffer.position() + charBuffer.arrayOffset();
        int iLimit = charBuffer.limit() + charBuffer.arrayOffset();
        char[] cArrArray2 = this.f5307d.array();
        int iArrayOffset = this.f5307d.arrayOffset() + this.f5307d.position();
        while (iPosition < iLimit) {
            char c = cArrArray[iPosition];
            if (Character.isHighSurrogate(c)) {
                charBuffer.position(iPosition - charBuffer.arrayOffset());
                this.f5307d.position(iArrayOffset - this.f5307d.arrayOffset());
                m7428e(charBuffer.remaining());
                m7429e(charBuffer);
                return;
            }
            cArrArray2[iArrayOffset] = c;
            iPosition++;
            iArrayOffset++;
        }
        charBuffer.position(iPosition - charBuffer.arrayOffset());
        this.f5307d.position(iArrayOffset - this.f5307d.arrayOffset());
    }

    private void m7428e(int i) {
        this.f5307d.flip();
        IntBuffer intBufferAllocate = IntBuffer.allocate(Math.max(this.f5307d.remaining() + i, this.f5307d.capacity() / 2));
        while (this.f5307d.hasRemaining()) {
            intBufferAllocate.put(this.f5307d.get() & Language.f4831EOF);
        }
        this.f5305b = Enumg.INT;
        this.f5307d = null;
        this.f5308e = intBufferAllocate;
    }

    private void m7429e(CharBuffer charBuffer) {
        char[] cArrArray = charBuffer.array();
        int iPosition = charBuffer.position() + charBuffer.arrayOffset();
        int iLimit = charBuffer.limit() + charBuffer.arrayOffset();
        int[] iArrArray = this.f5308e.array();
        int iArrayOffset = this.f5308e.arrayOffset() + this.f5308e.position();
        while (iPosition < iLimit) {
            char c = cArrArray[iPosition];
            iPosition++;
            if (this.f5309f != -1) {
                if (Character.isLowSurrogate(c)) {
                    iArrArray[iArrayOffset] = Character.toCodePoint((char) this.f5309f, c);
                    iArrayOffset++;
                    this.f5309f = -1;
                } else {
                    iArrArray[iArrayOffset] = this.f5309f;
                    iArrayOffset++;
                    if (Character.isHighSurrogate(c)) {
                        this.f5309f = c & Language.f4831EOF;
                    } else {
                        iArrArray[iArrayOffset] = c & Language.f4831EOF;
                        iArrayOffset++;
                        this.f5309f = -1;
                    }
                }
            } else if (Character.isHighSurrogate(c)) {
                this.f5309f = c & Language.f4831EOF;
            } else {
                iArrArray[iArrayOffset] = c & Language.f4831EOF;
                iArrayOffset++;
            }
        }
        if (this.f5309f != -1) {
            iArrArray[iArrayOffset] = this.f5309f & 65535;
            iArrayOffset++;
        }
        charBuffer.position(iPosition - charBuffer.arrayOffset());
        this.f5308e.position(iArrayOffset - this.f5308e.arrayOffset());
    }

    public ClassE m7430a() {
        switch (m7423b()[this.f5305b.ordinal()]) {
            case 1:
                this.f5306c.flip();
                break;
            case 2:
                this.f5307d.flip();
                break;
            case 3:
                this.f5308e.flip();
                break;
        }
        return new ClassE(this.f5305b, this.f5306c, this.f5307d, this.f5308e, null);
    }

    public void m7431a(int i) {
        switch (m7423b()[this.f5305b.ordinal()]) {
            case 1:
                if (this.f5306c.remaining() < i) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(m7421b(this.f5306c.capacity() + i));
                    this.f5306c.flip();
                    byteBufferAllocate.put(this.f5306c);
                    this.f5306c = byteBufferAllocate;
                }
                break;
            case 2:
                if (this.f5307d.remaining() < i) {
                    CharBuffer charBufferAllocate = CharBuffer.allocate(m7421b(this.f5307d.capacity() + i));
                    this.f5307d.flip();
                    charBufferAllocate.put(this.f5307d);
                    this.f5307d = charBufferAllocate;
                }
                break;
            case 3:
                if (this.f5308e.remaining() < i) {
                    IntBuffer intBufferAllocate = IntBuffer.allocate(m7421b(this.f5308e.capacity() + i));
                    this.f5308e.flip();
                    intBufferAllocate.put(this.f5308e);
                    this.f5308e = intBufferAllocate;
                }
                break;
        }
    }

    public void m7432a(CharBuffer charBuffer) {
        m7431a(charBuffer.remaining());
        if (!charBuffer.hasArray()) {
            throw new UnsupportedOperationException("TODO");
        }
        m7422b(charBuffer);
    }
}
