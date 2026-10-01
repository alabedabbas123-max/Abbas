package a.b.e;

import java.io.DataInput;
import java.io.IOException;

final class ClassJ {

    private final DataInput f186a;

    public ClassJ(DataInput dataInput) {
        this.f186a = dataInput;
    }

    public int m653a(int i) {
        try {
            return this.f186a.skipBytes(i);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void m654a(byte[] bArr) {
        try {
            this.f186a.readFully(bArr);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public boolean m655a() {
        try {
            return this.f186a.readBoolean();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public byte m656b() {
        try {
            return this.f186a.readByte();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public char m657c() {
        try {
            return this.f186a.readChar();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public double m658d() {
        try {
            return this.f186a.readDouble();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public float m659e() {
        try {
            return this.f186a.readFloat();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public int m660f() {
        try {
            return this.f186a.readInt();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public long m661g() {
        try {
            return this.f186a.readLong();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public short m662h() {
        try {
            return this.f186a.readShort();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public int m663i() {
        try {
            return this.f186a.readUnsignedByte();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public int m664j() {
        try {
            return this.f186a.readUnsignedShort();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
