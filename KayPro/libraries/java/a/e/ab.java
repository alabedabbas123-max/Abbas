package a.e;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

class ab extends FilterWriter {

    private int f597a;

    public ab(Writer writer) {
        super(writer);
        this.f597a = 0;
    }

    @Override
    public void write(int i) throws IOException {
        if (i == 10) {
            this.f597a = 0;
        } else if (this.f597a == 70) {
            super.write(10);
            super.write(32);
            this.f597a = 2;
        } else {
            this.f597a++;
        }
        super.write(i);
    }

    @Override
    public void write(String str, int i, int i2) throws IOException {
        write(str.toCharArray(), i, i2);
    }

    @Override
    public void write(char[] cArr, int i, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            write(cArr[i + i3]);
        }
    }
}
