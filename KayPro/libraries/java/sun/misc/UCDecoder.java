package sun.misc;

import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import sun.reflect.ClassFileConstants;

public class UCDecoder extends CharacterDecoder {
    private static final byte[] map_array = {48, 49, ClassFileConstants.opc_aaload, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, ClassFileConstants.opc_astore_0, ClassFileConstants.opc_astore_1, ClassFileConstants.opc_astore_2, ClassFileConstants.opc_astore_3, 79, 80, 81, 82, 83, 84, 85, 86, ClassFileConstants.opc_pop, 88, ClassFileConstants.opc_dup, ClassFileConstants.opc_dup_x1, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, ClassFileConstants.opc_dload_2, ClassFileConstants.opc_dload_3};
    private int sequence;

    private byte[] f607tmp = new byte[2];

    private CR6 f606crc = new CR6();
    private ByteArrayOutputStream lineAndSeq = new ByteArrayOutputStream(2);

    @Override
    protected int bytesPerAtom() {
        return 2;
    }

    @Override
    protected int bytesPerLine() {
        return 48;
    }

    @Override
    protected void decodeAtom(PushbackInputStream inStream, OutputStream outStream, int l) throws IOException {
        byte a = -1;
        byte b = -1;
        byte c = -1;
        byte[] tmp = new byte[3];
        int i = inStream.read(tmp);
        if (i != 3) {
            throw new CEStreamExhausted();
        }
        for (int i2 = 0; i2 < 64 && (a == -1 || b == -1 || c == -1); i2++) {
            if (tmp[0] == map_array[i2]) {
                a = (byte) i2;
            }
            if (tmp[1] == map_array[i2]) {
                b = (byte) i2;
            }
            if (tmp[2] == map_array[i2]) {
                c = (byte) i2;
            }
        }
        byte high_byte = (byte) (((a & 56) << 2) + (b & 31));
        byte low_byte = (byte) (((a & 7) << 5) + (c & 31));
        int p1 = 0;
        int p2 = 0;
        for (int i3 = 1; i3 < 256; i3 *= 2) {
            if ((high_byte & i3) != 0) {
                p1++;
            }
            if ((low_byte & i3) != 0) {
                p2++;
            }
        }
        int np1 = (b & 32) / 32;
        int np2 = (c & 32) / 32;
        if ((p1 & 1) != np1) {
            throw new CEFormatException("UCDecoder: High byte parity error.");
        }
        if ((p2 & 1) != np2) {
            throw new CEFormatException("UCDecoder: Low byte parity error.");
        }
        outStream.write(high_byte);
        this.f606crc.update(high_byte);
        if (l == 2) {
            outStream.write(low_byte);
            this.f606crc.update(low_byte);
        }
    }

    @Override
    protected void decodeBufferPrefix(PushbackInputStream inStream, OutputStream outStream) {
        this.sequence = 0;
    }

    @Override
    protected int decodeLinePrefix(PushbackInputStream inStream, OutputStream outStream) throws IOException {
        this.f606crc.value = 0;
        while (c != -1) {
            if (this.f607tmp[0] == 42) {
                this.lineAndSeq.reset();
                decodeAtom(inStream, this.lineAndSeq, 2);
                byte[] xtmp = this.lineAndSeq.toByteArray();
                int nLen = xtmp[0] & UnsignedBytes.MAX_VALUE;
                int nSeq = xtmp[1] & UnsignedBytes.MAX_VALUE;
                int i = this.sequence;
                if (nSeq != i) {
                    throw new CEFormatException("UCDecoder: Out of sequence line.");
                }
                this.sequence = (i + 1) & 255;
                return nLen;
            }
        }
        throw new CEStreamExhausted();
    }

    @Override
    protected void decodeLineSuffix(PushbackInputStream inStream, OutputStream outStream) throws IOException {
        int lineCRC = this.f606crc.value;
        this.lineAndSeq.reset();
        decodeAtom(inStream, this.lineAndSeq, 2);
        byte[] tmp = this.lineAndSeq.toByteArray();
        int readCRC = ((tmp[0] << 8) & 65280) + (tmp[1] & UnsignedBytes.MAX_VALUE);
        if (readCRC != lineCRC) {
            throw new CEFormatException("UCDecoder: CRC check failed.");
        }
    }
}
