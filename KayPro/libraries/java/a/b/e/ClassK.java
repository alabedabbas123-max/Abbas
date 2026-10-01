package a.b.e;

import java.io.DataOutput;
import java.io.IOException;

final class ClassK {

    private final DataOutput f187a;

    public ClassK(DataOutput dataOutput) {
        this.f187a = dataOutput;
    }

    public void m665a(double d) {
        try {
            this.f187a.writeDouble(d);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void m666a(float f) {
        try {
            this.f187a.writeFloat(f);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void m667a(int i) {
        try {
            this.f187a.writeByte(i);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void m668a(long j) {
        try {
            this.f187a.writeLong(j);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void m669a(boolean z) {
        try {
            this.f187a.writeBoolean(z);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void m670a(byte[] bArr) {
        try {
            this.f187a.write(bArr);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void m671a(byte[] bArr, int i, int i2) {
        try {
            this.f187a.write(bArr, i, i2);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void m672b(int i) {
        try {
            this.f187a.writeChar(i);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void m673c(int i) {
        try {
            this.f187a.writeInt(i);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void m674d(int i) {
        if ((65535 & i) != i) {
            throw new IllegalArgumentException("Overflow of unsigned short value [" + i + "]");
        }
        m675e(i);
    }

    public void m675e(int i) {
        try {
            this.f187a.writeShort(i);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
