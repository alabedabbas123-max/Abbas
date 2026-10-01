package com.baidu.mobstat;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class bs {

    public static class a {
        public static String m6519a(byte[] bArr) {
            try {
                return bs.m6518b(MessageDigest.getInstance("md5"), bArr);
            } catch (Exception e) {
                return "";
            }
        }
    }

    public static class b {
        public static String m6521a(byte[] bArr) {
            try {
                return bs.m6518b(MessageDigest.getInstance("SHA-256"), bArr);
            } catch (Exception e) {
                return "";
            }
        }

        public static String m6520a(File file) {
            try {
                return bs.m6517b(MessageDigest.getInstance("SHA-256"), file);
            } catch (NoSuchAlgorithmException e) {
                return "";
            }
        }
    }

    public static String m6518b(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        return m6516a(messageDigest.digest());
    }

    public static String m6517b(MessageDigest messageDigest, File file) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        if (!file.isFile()) {
            return "";
        }
        try {
            fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4048];
                while (true) {
                    int i = fileInputStream2.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i);
                }
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Exception e) {
                    }
                }
            } catch (Exception e2) {
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Exception e3) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                if (fileInputStream == null) {
                    throw th;
                }
                try {
                    fileInputStream.close();
                    throw th;
                } catch (Exception e4) {
                    throw th;
                }
            }
        } catch (Exception e5) {
            fileInputStream2 = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
        return m6516a(messageDigest.digest());
    }

    private static String m6516a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            int i2 = (bArr[i] >> 4) & 15;
            int i3 = bArr[i] & 15;
            sb.append((char) (i2 >= 10 ? (i2 + 97) - 10 : i2 + 48));
            sb.append((char) (i3 >= 10 ? (i3 + 97) - 10 : i3 + 48));
        }
        return sb.toString();
    }
}
