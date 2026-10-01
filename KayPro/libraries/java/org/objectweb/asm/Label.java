package org.objectweb.asm;

public class Label {

    int f6551a;

    int f6552b;

    int f6553c;

    private int f6554d;

    private int[] f6555e;

    int f6556f;

    int f6557g;

    Frame f6558h;

    Label f6559i;
    public Object info;

    Edge f6560j;

    Label f6561k;

    private void m8963a(int i, int i2) {
        if (this.f6555e == null) {
            this.f6555e = new int[6];
        }
        if (this.f6554d >= this.f6555e.length) {
            int[] iArr = new int[this.f6555e.length + 6];
            System.arraycopy(this.f6555e, 0, iArr, 0, this.f6555e.length);
            this.f6555e = iArr;
        }
        int[] iArr2 = this.f6555e;
        int i3 = this.f6554d;
        this.f6554d = i3 + 1;
        iArr2[i3] = i;
        int[] iArr3 = this.f6555e;
        int i4 = this.f6554d;
        this.f6554d = i4 + 1;
        iArr3[i4] = i2;
    }

    Label m8964a() {
        return this.f6558h == null ? this : this.f6558h.f6524b;
    }

    void m8965a(long j, int i) {
        if ((this.f6551a & 1024) == 0) {
            this.f6551a |= 1024;
            this.f6555e = new int[(i / 32) + 1];
        }
        int[] iArr = this.f6555e;
        int i2 = (int) (j >>> 32);
        iArr[i2] = iArr[i2] | ((int) j);
    }

    void m8966a(MethodWriter methodWriter, ByteVector byteVector, int i, boolean z) {
        if ((this.f6551a & 2) != 0) {
            if (z) {
                byteVector.putInt(this.f6553c - i);
                return;
            } else {
                byteVector.putShort(this.f6553c - i);
                return;
            }
        }
        if (z) {
            m8963a((-1) - i, byteVector.f6440b);
            byteVector.putInt(-1);
        } else {
            m8963a(i, byteVector.f6440b);
            byteVector.putShort(-1);
        }
    }

    boolean m8967a(long j) {
        return ((this.f6551a & 1024) == 0 || (this.f6555e[(int) (j >>> 32)] & ((int) j)) == 0) ? false : true;
    }

    boolean m8968a(Label label) {
        if ((this.f6551a & 1024) == 0 || (label.f6551a & 1024) == 0) {
            return false;
        }
        for (int i = 0; i < this.f6555e.length; i++) {
            if ((this.f6555e[i] & label.f6555e[i]) != 0) {
                return true;
            }
        }
        return false;
    }

    boolean m8969a(MethodWriter methodWriter, int i, byte[] bArr) {
        this.f6551a |= 2;
        this.f6553c = i;
        int i2 = 0;
        boolean z = false;
        while (i2 < this.f6554d) {
            int i3 = i2 + 1;
            int i4 = this.f6555e[i2];
            i2 = i3 + 1;
            int i5 = this.f6555e[i3];
            if (i4 >= 0) {
                int i6 = i - i4;
                if (i6 < -32768 || i6 > 32767) {
                    int i7 = bArr[i5 - 1] & 255;
                    if (i7 <= 168) {
                        bArr[i5 - 1] = (byte) (i7 + 49);
                    } else {
                        bArr[i5 - 1] = (byte) (i7 + 20);
                    }
                    z = true;
                }
                bArr[i5] = (byte) (i6 >>> 8);
                bArr[i5 + 1] = (byte) i6;
            } else {
                int i8 = i4 + i + 1;
                int i9 = i5 + 1;
                bArr[i5] = (byte) (i8 >>> 24);
                int i10 = i9 + 1;
                bArr[i9] = (byte) (i8 >>> 16);
                bArr[i10] = (byte) (i8 >>> 8);
                bArr[i10 + 1] = (byte) i8;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    void m8970b(Label label, long j, int i) {
        Edge edge;
        while (this != null) {
            Label label2 = this.f6561k;
            this.f6561k = null;
            if (label != null) {
                if ((this.f6551a & 2048) != 0) {
                    this = label2;
                } else {
                    this.f6551a |= 2048;
                    if ((this.f6551a & 256) != 0 && !this.m8968a(label)) {
                        Edge edge2 = new Edge();
                        edge2.f6507a = this.f6556f;
                        edge2.f6508b = label.f6560j.f6508b;
                        edge2.f6509c = this.f6560j;
                        this.f6560j = edge2;
                    }
                    for (edge = this.f6560j; edge != null; edge = edge.f6509c) {
                        if (((this.f6551a & 128) != 0 || edge != this.f6560j.f6509c) && edge.f6508b.f6561k == null) {
                            edge.f6508b.f6561k = label2;
                            label2 = edge.f6508b;
                        }
                    }
                    this = label2;
                }
            } else if (this.m8967a(j)) {
                this = label2;
            } else {
                this.m8965a(j, i);
                while (edge != null) {
                    if ((this.f6551a & 128) != 0) {
                        edge.f6508b.f6561k = label2;
                        label2 = edge.f6508b;
                    } else {
                        edge.f6508b.f6561k = label2;
                        label2 = edge.f6508b;
                    }
                }
                this = label2;
            }
        }
    }

    public int getOffset() {
        if ((this.f6551a & 2) == 0) {
            throw new IllegalStateException("Label offset position has not been resolved yet");
        }
        return this.f6553c;
    }

    public String toString() {
        return new StringBuffer().append("L").append(System.identityHashCode(this)).toString();
    }
}
