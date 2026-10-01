package sun.misc;

import java.io.IOException;
import java.io.OutputStream;
import sun.reflect.ClassFileConstants;

public class UCEncoder extends CharacterEncoder {
    private static final byte[] map_array = {48, 49, ClassFileConstants.opc_aaload, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, ClassFileConstants.opc_astore_0, ClassFileConstants.opc_astore_1, ClassFileConstants.opc_astore_2, ClassFileConstants.opc_astore_3, 79, 80, 81, 82, 83, 84, 85, 86, ClassFileConstants.opc_pop, 88, ClassFileConstants.opc_dup, ClassFileConstants.opc_dup_x1, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, ClassFileConstants.opc_dload_2, ClassFileConstants.opc_dload_3};
    private int sequence;

    private byte[] f609tmp = new byte[2];

    private CR6 f608crc = new CR6();

    @Override
    protected int bytesPerAtom() {
        return 2;
    }

    @Override
    protected int bytesPerLine() {
        return 48;
    }

    @Override
    protected void encodeAtom(OutputStream outStream, byte[] data, int offset, int len) throws IOException {
        byte b;
        byte a = data[offset];
        if (len == 2) {
            b = data[offset + 1];
        } else {
            b = 0;
        }
        this.f608crc.update(a);
        if (len == 2) {
            this.f608crc.update(b);
        }
        outStream.write(map_array[((a >>> 2) & 56) + ((b >>> 5) & 7)]);
        int p1 = 0;
        int p2 = 0;
        for (int i = 1; i < 256; i *= 2) {
            if ((a & i) != 0) {
                p1++;
            }
            if ((b & i) != 0) {
                p2++;
            }
        }
        int p3 = (p1 & 1) * 32;
        int p4 = p2 & 1;
        int p5 = p4 * 32;
        outStream.write(map_array[(a & 31) + p3]);
        outStream.write(map_array[(b & 31) + p5]);
    }

    @Override
    protected void encodeLinePrefix(OutputStream outStream, int length) throws IOException {
        outStream.write(42);
        this.f608crc.value = 0;
        byte[] bArr = this.f609tmp;
        bArr[0] = (byte) length;
        int i = this.sequence;
        bArr[1] = (byte) i;
        this.sequence = (i + 1) & 255;
        encodeAtom(outStream, bArr, 0, 2);
    }

    @Override
    protected void encodeLineSuffix(OutputStream outStream) throws IOException {
        this.f609tmp[0] = (byte) ((this.f608crc.value >>> 8) & 255);
        this.f609tmp[1] = (byte) (this.f608crc.value & 255);
        encodeAtom(outStream, this.f609tmp, 0, 2);
        this.pStream.println();
    }

    @Override
    protected void encodeBufferPrefix(OutputStream a) throws IOException {
        this.sequence = 0;
        super.encodeBufferPrefix(a);
    }
}
