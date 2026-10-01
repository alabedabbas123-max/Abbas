package com.baidu.mobstat;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class bt {
    public static boolean m6523a(InputStream inputStream, OutputStream outputStream) {
        if (inputStream == null || outputStream == null) {
            return false;
        }
        byte[] bArr = new byte[4048];
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    outputStream.write(bArr, 0, i);
                } else {
                    return true;
                }
            } catch (IOException e) {
                return false;
            }
        }
    }

    public static void m6522a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
            }
        }
    }
}
