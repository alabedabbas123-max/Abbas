package sun.misc;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class UUEncoder extends CharacterEncoder {
    private String bufferName;
    private int mode;

    public UUEncoder() {
        this.bufferName = "encoder.buf";
        this.mode = 644;
    }

    public UUEncoder(String fname) {
        this.bufferName = fname;
        this.mode = 644;
    }

    public UUEncoder(String fname, int newMode) {
        this.bufferName = fname;
        this.mode = newMode;
    }

    @Override
    protected int bytesPerAtom() {
        return 3;
    }

    @Override
    protected int bytesPerLine() {
        return 45;
    }

    @Override
    protected void encodeAtom(OutputStream outStream, byte[] data, int offset, int len) throws IOException {
        byte b = 1;
        byte a = data[offset];
        if (len > 1) {
            b = data[offset + 1];
        }
        byte c = len > 2 ? data[offset + 2] : (byte) 1;
        int c1 = (a >>> 2) & 63;
        int c2 = ((a << 4) & 48) | ((b >>> 4) & 15);
        int c3 = ((b << 2) & 60) | ((c >>> 6) & 3);
        int c4 = c & 63;
        outStream.write(c1 + 32);
        outStream.write(c2 + 32);
        outStream.write(c3 + 32);
        outStream.write(c4 + 32);
    }

    @Override
    protected void encodeLinePrefix(OutputStream outStream, int length) throws IOException {
        outStream.write((length & 63) + 32);
    }

    @Override
    protected void encodeLineSuffix(OutputStream outStream) throws IOException {
        this.pStream.println();
    }

    @Override
    protected void encodeBufferPrefix(OutputStream a) throws IOException {
        this.pStream = new PrintStream(a);
        this.pStream.print("begin " + this.mode + " ");
        if (this.bufferName != null) {
            this.pStream.println(this.bufferName);
        } else {
            this.pStream.println("encoder.bin");
        }
        this.pStream.flush();
    }

    @Override
    protected void encodeBufferSuffix(OutputStream a) throws IOException {
        this.pStream.println(" \nend");
        this.pStream.flush();
    }
}
