package sun.misc;

import com.google.common.primitives.UnsignedBytes;
import com.sun.tools.javac.jvm.ByteCodes;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PushbackInputStream;

public class BASE64Decoder extends CharacterDecoder {
    private static final char[] pem_array = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    private static final byte[] pem_convert_array = new byte[256];
    byte[] decode_buffer = new byte[4];

    @Override
    protected int bytesPerAtom() {
        return 4;
    }

    @Override
    protected int bytesPerLine() {
        return 72;
    }

    static {
        for (int i = 0; i < 255; i++) {
            pem_convert_array[i] = -1;
        }
        int i2 = 0;
        while (true) {
            char[] cArr = pem_array;
            if (i2 < cArr.length) {
                pem_convert_array[cArr[i2]] = (byte) i2;
                i2++;
            } else {
                return;
            }
        }
    }

    @Override
    protected void decodeAtom(PushbackInputStream inStream, OutputStream outStream, int rem) throws IOException {
        byte a = -1;
        byte b = -1;
        byte c = -1;
        byte d = -1;
        if (rem < 2) {
            throw new CEFormatException("BASE64Decoder: Not enough bytes for an atom.");
        }
        while (true) {
            int i = inStream.read();
            if (i == -1) {
                throw new CEStreamExhausted();
            }
            if (i != 10 && i != 13) {
                byte[] bArr = this.decode_buffer;
                bArr[0] = (byte) i;
                if (readFully(inStream, bArr, 1, rem - 1) == -1) {
                    throw new CEStreamExhausted();
                }
                if (rem > 3 && this.decode_buffer[3] == 61) {
                    rem = 3;
                }
                if (rem > 2 && this.decode_buffer[2] == 61) {
                    rem = 2;
                }
                if (rem != 2) {
                    if (rem != 3) {
                        d = rem == 4 ? pem_convert_array[this.decode_buffer[3] & UnsignedBytes.MAX_VALUE] : (byte) -1;
                    }
                    c = pem_convert_array[this.decode_buffer[2] & UnsignedBytes.MAX_VALUE];
                    byte[] bArr2 = pem_convert_array;
                    byte[] bArr3 = this.decode_buffer;
                    b = bArr2[bArr3[1] & UnsignedBytes.MAX_VALUE];
                    a = bArr2[bArr3[0] & UnsignedBytes.MAX_VALUE];
                } else {
                    byte[] bArr4 = pem_convert_array;
                    byte[] bArr5 = this.decode_buffer;
                    b = bArr4[bArr5[1] & UnsignedBytes.MAX_VALUE];
                    a = bArr4[bArr5[0] & UnsignedBytes.MAX_VALUE];
                }
                if (rem == 2) {
                    outStream.write((byte) (((a << 2) & 252) | ((b >>> 4) & 3)));
                    return;
                }
                if (rem != 3) {
                    if (rem == 4) {
                        outStream.write((byte) (((a << 2) & 252) | ((b >>> 4) & 3)));
                        outStream.write((byte) (((b << 4) & 240) | ((c >>> 2) & 15)));
                        outStream.write((byte) (((c << 6) & ByteCodes.checkcast) | (d & 63)));
                        return;
                    }
                    return;
                }
                outStream.write((byte) (((a << 2) & 252) | ((b >>> 4) & 3)));
                outStream.write((byte) (((b << 4) & 240) | ((c >>> 2) & 15)));
                return;
            }
        }
    }
}
