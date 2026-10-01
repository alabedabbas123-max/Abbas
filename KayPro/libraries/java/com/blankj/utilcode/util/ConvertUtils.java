package com.blankj.utilcode.util;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.baidu.android.common.util.DeviceId;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ConvertUtils {
    private static final int BUFFER_SIZE = 8192;
    private static final char[] HEX_DIGITS_UPPER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] HEX_DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private ConvertUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static byte[] bitmap2Bytes(Bitmap bitmap) {
        return UtilsBridge.bitmap2Bytes(bitmap);
    }

    public static byte[] bitmap2Bytes(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i) {
        return UtilsBridge.bitmap2Bytes(bitmap, compressFormat, i);
    }

    public static Drawable bitmap2Drawable(Bitmap bitmap) {
        return UtilsBridge.bitmap2Drawable(bitmap);
    }

    public static byte[] bits2Bytes(String str) {
        int length = str.length() % 8;
        int length2 = str.length() / 8;
        if (length != 0) {
            while (length < 8) {
                str = DeviceId.CUIDInfo.I_EMPTY + str;
                length++;
            }
            length2++;
        }
        byte[] bArr = new byte[length2];
        for (int i = 0; i < length2; i++) {
            for (int i2 = 0; i2 < 8; i2++) {
                bArr[i] = (byte) (bArr[i] << 1);
                bArr[i] = (byte) (bArr[i] | (str.charAt((i * 8) + i2) - '0'));
            }
        }
        return bArr;
    }

    public static String byte2FitMemorySize(long j) {
        return byte2FitMemorySize(j, 3);
    }

    public static String byte2FitMemorySize(long j, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("precision shouldn't be less than zero!");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteSize shouldn't be less than zero!");
        }
        if (j < 1024) {
            return String.format("%." + i + "fB", Double.valueOf(j));
        }
        if (j < 1048576) {
            String str = "%." + i + "fKB";
            double d = j;
            Double.isNaN(d);
            return String.format(str, Double.valueOf(d / 1024.0d));
        }
        if (j < FileUtils.ONE_GB) {
            String str2 = "%." + i + "fMB";
            double d2 = j;
            Double.isNaN(d2);
            return String.format(str2, Double.valueOf(d2 / 1048576.0d));
        }
        String str3 = "%." + i + "fGB";
        double d3 = j;
        Double.isNaN(d3);
        return String.format(str3, Double.valueOf(d3 / 1.073741824E9d));
    }

    public static double byte2MemorySize(long j, int i) {
        if (j < 0) {
            return -1.0d;
        }
        double d = j;
        double d2 = i;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d / d2;
    }

    public static Bitmap bytes2Bitmap(byte[] bArr) {
        return UtilsBridge.bytes2Bitmap(bArr);
    }

    public static String bytes2Bits(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            for (int i = 7; i >= 0; i--) {
                sb.append(((b >> i) & 1) == 0 ? '0' : '1');
            }
        }
        return sb.toString();
    }

    public static char[] bytes2Chars(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return cArr;
    }

    public static Drawable bytes2Drawable(byte[] bArr) {
        return UtilsBridge.bytes2Drawable(bArr);
    }

    public static String bytes2HexString(byte[] bArr) {
        return bytes2HexString(bArr, true);
    }

    public static String bytes2HexString(byte[] bArr, boolean z) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = z ? HEX_DIGITS_UPPER : HEX_DIGITS_LOWER;
        int length = bArr.length;
        if (length <= 0) {
            return "";
        }
        char[] cArr2 = new char[length << 1];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr2[i] = cArr[(bArr[i2] >> 4) & 15];
            i = i3 + 1;
            cArr2[i3] = cArr[bArr[i2] & 15];
        }
        return new String(cArr2);
    }

    public static InputStream bytes2InputStream(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        return new ByteArrayInputStream(bArr);
    }

    public static JSONArray bytes2JSONArray(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new JSONArray(new String(bArr));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static JSONObject bytes2JSONObject(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new JSONObject(new String(bArr));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static Object bytes2Object(byte[] bArr) throws Throwable {
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2 = null;
        if (bArr == null) {
            return null;
        }
        try {
            objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
            try {
                try {
                    Object object = objectInputStream.readObject();
                    try {
                        objectInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return object;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                objectInputStream2 = objectInputStream;
                if (objectInputStream2 != null) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            objectInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (objectInputStream2 != null) {
                objectInputStream2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static OutputStream bytes2OutputStream(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    byteArrayOutputStream.write(bArr);
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return byteArrayOutputStream;
                } catch (IOException e2) {
                    e = e2;
                    e.printStackTrace();
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream2 = byteArrayOutputStream;
                if (byteArrayOutputStream2 != null) {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            byteArrayOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (byteArrayOutputStream2 != null) {
                byteArrayOutputStream2.close();
            }
            throw th;
        }
    }

    public static <T> T bytes2Parcelable(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        T tCreateFromParcel = creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return tCreateFromParcel;
    }

    public static String bytes2String(byte[] bArr) {
        return bytes2String(bArr, "");
    }

    public static String bytes2String(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, getSafeCharset(str));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return new String(bArr);
        }
    }

    public static byte[] chars2Bytes(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return null;
        }
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) cArr[i];
        }
        return bArr;
    }

    public static int dp2px(float f) {
        return UtilsBridge.dp2px(f);
    }

    public static Bitmap drawable2Bitmap(Drawable drawable) {
        return UtilsBridge.drawable2Bitmap(drawable);
    }

    public static byte[] drawable2Bytes(Drawable drawable) {
        return UtilsBridge.drawable2Bytes(drawable);
    }

    public static byte[] drawable2Bytes(Drawable drawable, Bitmap.CompressFormat compressFormat, int i) {
        return UtilsBridge.drawable2Bytes(drawable, compressFormat, i);
    }

    private static String getSafeCharset(String str) {
        return (UtilsBridge.isSpace(str) || !Charset.isSupported(str)) ? "UTF-8" : str;
    }

    private static int hex2Dec(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c < 'A' || c > 'F') {
            throw new IllegalArgumentException();
        }
        return (c - 'A') + 10;
    }

    public static byte[] hexString2Bytes(String str) {
        if (UtilsBridge.isSpace(str)) {
            return new byte[0];
        }
        int length = str.length();
        if (length % 2 != 0) {
            str = DeviceId.CUIDInfo.I_EMPTY + str;
            length++;
        }
        char[] charArray = str.toUpperCase().toCharArray();
        byte[] bArr = new byte[length >> 1];
        for (int i = 0; i < length; i += 2) {
            bArr[i >> 1] = (byte) ((hex2Dec(charArray[i]) << 4) | hex2Dec(charArray[i + 1]));
        }
        return bArr;
    }

    public static int hexString2Int(String str) {
        return Integer.parseInt(str, 16);
    }

    public static ByteArrayOutputStream input2OutputStream(InputStream inputStream) {
        try {
            if (inputStream == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int i = inputStream.read(bArr, 0, 8192);
                if (i != -1) {
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            }
            return byteArrayOutputStream;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                inputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static byte[] inputStream2Bytes(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        return input2OutputStream(inputStream).toByteArray();
    }

    public static List<String> inputStream2Lines(InputStream inputStream) {
        return inputStream2Lines(inputStream, "");
    }

    public static List<String> inputStream2Lines(InputStream inputStream, String str) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            ArrayList arrayList = new ArrayList();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, getSafeCharset(str)));
            while (true) {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            arrayList.add(line);
                        } else {
                            try {
                                break;
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        e.printStackTrace();
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                }
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
            bufferedReader.close();
            return arrayList;
        } catch (IOException e5) {
            e = e5;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String inputStream2String(InputStream inputStream, String str) {
        if (inputStream == null) {
            return "";
        }
        try {
            ByteArrayOutputStream byteArrayOutputStreamInput2OutputStream = input2OutputStream(inputStream);
            return byteArrayOutputStreamInput2OutputStream == null ? "" : byteArrayOutputStreamInput2OutputStream.toString(getSafeCharset(str));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String int2HexString(int i) {
        return Integer.toHexString(i);
    }

    public static byte[] jsonArray2Bytes(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        return jSONArray.toString().getBytes();
    }

    public static byte[] jsonObject2Bytes(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString().getBytes();
    }

    public static long memorySize2Byte(long j, int i) {
        if (j < 0) {
            return -1L;
        }
        return j * ((long) i);
    }

    public static String millis2FitTimeSpan(long j, int i) {
        return UtilsBridge.millis2FitTimeSpan(j, i);
    }

    public static long millis2TimeSpan(long j, int i) {
        return j / ((long) i);
    }

    public static ByteArrayInputStream output2InputStream(OutputStream outputStream) {
        if (outputStream == null) {
            return null;
        }
        return new ByteArrayInputStream(((ByteArrayOutputStream) outputStream).toByteArray());
    }

    public static byte[] outputStream2Bytes(OutputStream outputStream) {
        if (outputStream == null) {
            return null;
        }
        return ((ByteArrayOutputStream) outputStream).toByteArray();
    }

    public static String outputStream2String(OutputStream outputStream, String str) {
        if (outputStream == null) {
            return "";
        }
        try {
            return new String(outputStream2Bytes(outputStream), getSafeCharset(str));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static byte[] parcelable2Bytes(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelable.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static int px2dp(float f) {
        return UtilsBridge.px2dp(f);
    }

    public static int px2sp(float f) {
        return UtilsBridge.px2sp(f);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0033: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:26:0x0033 */
    public static byte[] serializable2Bytes(Serializable serializable) throws Throwable {
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2;
        ObjectOutputStream objectOutputStream3 = null;
        try {
            if (serializable == null) {
                return null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeObject(serializable);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return byteArray;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Exception e4) {
                e = e4;
                objectOutputStream2 = null;
            } catch (Throwable th) {
                th = th;
                if (objectOutputStream3 != null) {
                    try {
                        objectOutputStream3.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream3 = objectOutputStream;
        }
    }

    public static int sp2px(float f) {
        return UtilsBridge.sp2px(f);
    }

    public static byte[] string2Bytes(String str) {
        return string2Bytes(str, "");
    }

    public static byte[] string2Bytes(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(getSafeCharset(str2));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return str.getBytes();
        }
    }

    public static InputStream string2InputStream(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return new ByteArrayInputStream(str.getBytes(getSafeCharset(str2)));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static OutputStream string2OutputStream(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return bytes2OutputStream(str.getBytes(getSafeCharset(str2)));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static long timeSpan2Millis(long j, int i) {
        return j * ((long) i);
    }

    public static Bitmap view2Bitmap(View view) {
        return UtilsBridge.view2Bitmap(view);
    }
}
