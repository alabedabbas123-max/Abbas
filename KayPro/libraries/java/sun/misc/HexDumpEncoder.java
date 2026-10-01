package sun.misc;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class HexDumpEncoder extends CharacterEncoder {
    private int currentByte;
    private int offset;
    private byte[] thisLine = new byte[16];
    private int thisLineLength;

    static void hexDigit(PrintStream p, byte x) {
        char c;
        char c2;
        char c3 = (char) ((x >> 4) & 15);
        if (c3 > '\t') {
            c = (char) ((c3 - '\n') + 65);
        } else {
            c = (char) (c3 + '0');
        }
        p.write(c);
        char c4 = (char) (x & Ascii.f50SI);
        if (c4 > '\t') {
            c2 = (char) ((c4 - '\n') + 65);
        } else {
            c2 = (char) (c4 + '0');
        }
        p.write(c2);
    }

    @Override
    protected int bytesPerAtom() {
        return 1;
    }

    @Override
    protected int bytesPerLine() {
        return 16;
    }

    @Override
    protected void encodeBufferPrefix(OutputStream o) throws IOException {
        this.offset = 0;
        super.encodeBufferPrefix(o);
    }

    @Override
    protected void encodeLinePrefix(OutputStream o, int len) throws IOException {
        hexDigit(this.pStream, (byte) ((this.offset >>> 8) & 255));
        hexDigit(this.pStream, (byte) (this.offset & 255));
        this.pStream.print(": ");
        this.currentByte = 0;
        this.thisLineLength = len;
    }

    @Override
    protected void encodeAtom(OutputStream o, byte[] buf, int off, int len) throws IOException {
        this.thisLine[this.currentByte] = buf[off];
        hexDigit(this.pStream, buf[off]);
        this.pStream.print(" ");
        int i = this.currentByte + 1;
        this.currentByte = i;
        if (i == 8) {
            this.pStream.print("  ");
        }
    }

    @Override
    protected void encodeLineSuffix(OutputStream o) throws IOException {
        if (this.thisLineLength < 16) {
            for (int i = this.thisLineLength; i < 16; i++) {
                this.pStream.print("   ");
                if (i == 7) {
                    this.pStream.print("  ");
                }
            }
        }
        this.pStream.print(" ");
        for (int i2 = 0; i2 < this.thisLineLength; i2++) {
            byte[] bArr = this.thisLine;
            if (bArr[i2] < 32 || bArr[i2] > 122) {
                this.pStream.print(".");
            } else {
                this.pStream.write(this.thisLine[i2]);
            }
        }
        this.pStream.println();
        this.offset += this.thisLineLength;
    }
}
