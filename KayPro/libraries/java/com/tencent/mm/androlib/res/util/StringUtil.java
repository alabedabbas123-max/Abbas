package com.tencent.mm.androlib.res.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class StringUtil {
    public static boolean isBlank(String str) {
        return !isPresent(str);
    }

    public static boolean isPresent(String str) {
        return str != null && str.length() > 0;
    }

    public static String readInputStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }
}
