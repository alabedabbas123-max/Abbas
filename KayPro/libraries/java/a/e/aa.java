package a.e;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

class aa extends FilterReader {

    private int f596a;

    public aa(Reader reader) {
        super(reader);
        this.f596a = -2;
    }

    @Override
    public int read() throws IOException {
        int i;
        do {
            int i2 = this.f596a != -2 ? this.f596a : super.read();
            this.f596a = -2;
            if (i2 != 10 && i2 != 13) {
                return i2;
            }
            int i3 = super.read();
            i = ((i3 == 10 || i3 == 13) && i2 != i3) ? super.read() : i3;
        } while (i == 32);
        this.f596a = i;
        return 10;
    }

    @Override
    public int read(char[] cArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int i4 = read();
            if (i4 == -1) {
                break;
            }
            cArr[i3 + i] = (char) i4;
            i3++;
        }
        return i3;
    }

    @Override
    public long skip(long j) {
        int i = 0;
        while (i < j && read() != -1) {
            i++;
        }
        return i;
    }
}
