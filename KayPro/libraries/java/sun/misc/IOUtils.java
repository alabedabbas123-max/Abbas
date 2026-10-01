package sun.misc;

import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.util.Position;
import com.spartacusrex.spartacuside.helper.Arrays;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class IOUtils {
    public static byte[] readFully(InputStream is, int length, boolean readAll) throws IOException {
        int bytesToRead;
        byte[] output = new byte[0];
        if (length == -1) {
            length = Position.MAXPOS;
        }
        int pos = 0;
        while (pos < length) {
            if (pos >= output.length) {
                bytesToRead = Math.min(length - pos, output.length + Flags.ABSTRACT);
                if (output.length < pos + bytesToRead) {
                    output = Arrays.copyOf(output, pos + bytesToRead);
                }
            } else {
                int bytesToRead2 = output.length;
                bytesToRead = bytesToRead2 - pos;
            }
            int cc = is.read(output, pos, bytesToRead);
            if (cc < 0) {
                if (readAll && length != Integer.MAX_VALUE) {
                    throw new EOFException("Detect premature EOF");
                }
                if (output.length != pos) {
                    return Arrays.copyOf(output, pos);
                }
                return output;
            }
            pos += cc;
        }
        return output;
    }
}
