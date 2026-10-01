package sun.misc;

import com.sun.tools.javac.jvm.ByteCodes;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PushbackInputStream;

public class UUDecoder extends CharacterDecoder {
    public String bufferName;
    private byte[] decoderBuffer = new byte[4];
    public int mode;

    @Override
    protected int bytesPerAtom() {
        return 3;
    }

    @Override
    protected int bytesPerLine() {
        return 45;
    }

    @Override
    protected void decodeAtom(PushbackInputStream inStream, OutputStream outStream, int l) throws IOException {
        StringBuffer x = new StringBuffer();
        for (int i = 0; i < 4; i++) {
            int c1 = inStream.read();
            if (c1 == -1) {
                throw new CEStreamExhausted();
            }
            x.append((char) c1);
            this.decoderBuffer[i] = (byte) ((c1 - 32) & 63);
        }
        byte[] bArr = this.decoderBuffer;
        int a = ((bArr[0] << 2) & 252) | ((bArr[1] >>> 4) & 3);
        int b = ((bArr[1] << 4) & 240) | ((bArr[2] >>> 2) & 15);
        int c = (bArr[3] & 63) | ((bArr[2] << 6) & ByteCodes.checkcast);
        outStream.write((byte) (a & 255));
        if (l > 1) {
            outStream.write((byte) (b & 255));
        }
        if (l > 2) {
            outStream.write((byte) (c & 255));
        }
    }

    @Override
    protected void decodeBufferPrefix(PushbackInputStream inStream, OutputStream outStream) throws IOException {
        int c;
        StringBuffer q = new StringBuffer(32);
        boolean sawNewLine = true;
        while (true) {
            int c2 = inStream.read();
            if (c2 == -1) {
                throw new CEFormatException("UUDecoder: No begin line.");
            }
            boolean z = true;
            if (c2 != 98 || !sawNewLine || (c2 = inStream.read()) != 101) {
                if (c2 != 10 && c2 != 13) {
                    z = false;
                }
                sawNewLine = z;
            } else {
                while (c2 != 10 && c2 != 13) {
                    c2 = inStream.read();
                    if (c2 == -1) {
                        throw new CEFormatException("UUDecoder: No begin line.");
                    }
                    if (c2 != 10 && c2 != 13) {
                        q.append((char) c2);
                    }
                }
                String r = q.toString();
                if (r.indexOf(32) != 3) {
                    throw new CEFormatException("UUDecoder: Malformed begin line.");
                }
                this.mode = Integer.parseInt(r.substring(4, 7));
                this.bufferName = r.substring(r.indexOf(32, 6) + 1);
                if (c2 == 13 && (c = inStream.read()) != 10 && c != -1) {
                    inStream.unread(c);
                    return;
                }
                return;
            }
        }
    }

    @Override
    protected int decodeLinePrefix(PushbackInputStream inStream, OutputStream outStream) throws IOException {
        int c = inStream.read();
        if (c == 32) {
            inStream.read();
            int c2 = inStream.read();
            if (c2 != 10 && c2 != -1) {
                inStream.unread(c2);
            }
            throw new CEStreamExhausted();
        }
        if (c == -1) {
            throw new CEFormatException("UUDecoder: Short Buffer.");
        }
        int c3 = (c - 32) & 63;
        if (c3 > bytesPerLine()) {
            throw new CEFormatException("UUDecoder: Bad Line Length.");
        }
        return c3;
    }

    @Override
    protected void decodeLineSuffix(PushbackInputStream inStream, OutputStream outStream) throws IOException {
        int c;
        do {
            c = inStream.read();
            if (c == -1) {
                throw new CEStreamExhausted();
            }
            if (c == 10) {
                return;
            }
        } while (c != 13);
        int c2 = inStream.read();
        if (c2 != 10 && c2 != -1) {
            inStream.unread(c2);
        }
    }

    @Override
    protected void decodeBufferSuffix(PushbackInputStream inStream, OutputStream outStream) throws IOException {
        inStream.read(this.decoderBuffer);
        byte[] bArr = this.decoderBuffer;
        if (bArr[0] != 101 || bArr[1] != 110 || bArr[2] != 100) {
            throw new CEFormatException("UUDecoder: Missing 'end' line.");
        }
    }
}
