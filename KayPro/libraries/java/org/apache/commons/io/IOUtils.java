package org.apache.commons.io;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.Selector;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.io.output.StringBuilderWriter;

public class IOUtils {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final char DIR_SEPARATOR = File.separatorChar;
    public static final char DIR_SEPARATOR_UNIX = '/';
    public static final char DIR_SEPARATOR_WINDOWS = '\\';

    public static final int f5381EOF = -1;
    public static final String LINE_SEPARATOR;
    public static final String LINE_SEPARATOR_UNIX = "\n";
    public static final String LINE_SEPARATOR_WINDOWS = "\r\n";
    private static final int SKIP_BUFFER_SIZE = 2048;
    private static byte[] SKIP_BYTE_BUFFER;
    private static char[] SKIP_CHAR_BUFFER;

    /* JADX WARN: Code duplicated, block: B:15:0x002b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0045 A[Catch: Throwable -> 0x0025, all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:3:0x000c, B:6:0x001c, B:26:0x003c, B:30:0x0045, B:29:0x0041, B:27:0x003f), top: B:37:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:34:0x004e  */
    /* JADX WARN: Code duplicated, block: B:42:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Throwable th;
        Throwable th2 = null;
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter(4);
        try {
            try {
                PrintWriter printWriter = new PrintWriter(stringBuilderWriter);
                try {
                    printWriter.println();
                    LINE_SEPARATOR = stringBuilderWriter.toString();
                    if (printWriter != null) {
                        printWriter.close();
                    }
                    if (stringBuilderWriter != null) {
                        stringBuilderWriter.close();
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        th = th4;
                        th = th3;
                        if (printWriter != null) {
                            if (th != null) {
                                printWriter.close();
                            } else {
                                printWriter.close();
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                if (stringBuilderWriter != null) {
                    if (th2 != null) {
                        try {
                            stringBuilderWriter.close();
                        } catch (Throwable th6) {
                            th2.addSuppressed(th6);
                        }
                    } else {
                        stringBuilderWriter.close();
                    }
                }
                throw th;
            }
        } catch (Throwable th7) {
            try {
                throw th7;
            } catch (Throwable th8) {
                th = th8;
                th2 = th7;
                if (stringBuilderWriter != null) {
                    if (th2 != null) {
                        stringBuilderWriter.close();
                    } else {
                        stringBuilderWriter.close();
                    }
                }
                throw th;
            }
        }
    }

    public static BufferedInputStream buffer(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException();
        }
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream);
    }

    public static BufferedInputStream buffer(InputStream inputStream, int i) {
        if (inputStream == null) {
            throw new NullPointerException();
        }
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i);
    }

    public static BufferedOutputStream buffer(OutputStream outputStream) {
        if (outputStream == null) {
            throw new NullPointerException();
        }
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream);
    }

    public static BufferedOutputStream buffer(OutputStream outputStream, int i) {
        if (outputStream == null) {
            throw new NullPointerException();
        }
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i);
    }

    public static BufferedReader buffer(Reader reader) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
    }

    public static BufferedReader buffer(Reader reader, int i) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    public static BufferedWriter buffer(Writer writer) {
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer);
    }

    public static BufferedWriter buffer(Writer writer, int i) {
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i);
    }

    public static void close(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    @Deprecated
    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    @Deprecated
    public static void closeQuietly(InputStream inputStream) {
        closeQuietly((Closeable) inputStream);
    }

    @Deprecated
    public static void closeQuietly(OutputStream outputStream) {
        closeQuietly((Closeable) outputStream);
    }

    @Deprecated
    public static void closeQuietly(Reader reader) {
        closeQuietly((Closeable) reader);
    }

    @Deprecated
    public static void closeQuietly(Writer writer) {
        closeQuietly((Closeable) writer);
    }

    @Deprecated
    public static void closeQuietly(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException e) {
            }
        }
    }

    @Deprecated
    public static void closeQuietly(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
            }
        }
    }

    @Deprecated
    public static void closeQuietly(Selector selector) {
        if (selector != null) {
            try {
                selector.close();
            } catch (IOException e) {
            }
        }
    }

    @Deprecated
    public static void closeQuietly(Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            closeQuietly(closeable);
        }
    }

    public static boolean contentEquals(InputStream inputStream, InputStream inputStream2) throws IOException {
        if (inputStream == inputStream2) {
            return true;
        }
        if (!(inputStream instanceof BufferedInputStream)) {
            inputStream = new BufferedInputStream(inputStream);
        }
        if (!(inputStream2 instanceof BufferedInputStream)) {
            inputStream2 = new BufferedInputStream(inputStream2);
        }
        for (int i = inputStream.read(); -1 != i; i = inputStream.read()) {
            if (i != inputStream2.read()) {
                return false;
            }
        }
        return inputStream2.read() == -1;
    }

    public static boolean contentEquals(Reader reader, Reader reader2) throws IOException {
        if (reader != reader2) {
            BufferedReader bufferedReader = toBufferedReader(reader);
            BufferedReader bufferedReader2 = toBufferedReader(reader2);
            for (int i = bufferedReader.read(); -1 != i; i = bufferedReader.read()) {
                if (i != bufferedReader2.read()) {
                    return false;
                }
            }
            if (bufferedReader2.read() != -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean contentEqualsIgnoreEOL(Reader reader, Reader reader2) throws IOException {
        if (reader == reader2) {
            return true;
        }
        BufferedReader bufferedReader = toBufferedReader(reader);
        BufferedReader bufferedReader2 = toBufferedReader(reader2);
        String line = bufferedReader.readLine();
        String line2 = bufferedReader2.readLine();
        while (line != null && line2 != null && line.equals(line2)) {
            line = bufferedReader.readLine();
            line2 = bufferedReader2.readLine();
        }
        if (line == null) {
            return line2 == null;
        }
        return line.equals(line2);
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        long jCopyLarge = copyLarge(inputStream, outputStream);
        if (jCopyLarge > 2147483647L) {
            return -1;
        }
        return (int) jCopyLarge;
    }

    public static int copy(Reader reader, Writer writer) throws IOException {
        long jCopyLarge = copyLarge(reader, writer);
        if (jCopyLarge > 2147483647L) {
            return -1;
        }
        return (int) jCopyLarge;
    }

    public static long copy(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        return copyLarge(inputStream, outputStream, new byte[i]);
    }

    @Deprecated
    public static void copy(InputStream inputStream, Writer writer) throws IOException {
        copy(inputStream, writer, Charset.defaultCharset());
    }

    public static void copy(InputStream inputStream, Writer writer, String str) throws IOException {
        copy(inputStream, writer, Charsets.toCharset(str));
    }

    public static void copy(InputStream inputStream, Writer writer, Charset charset) throws IOException {
        copy(new InputStreamReader(inputStream, Charsets.toCharset(charset)), writer);
    }

    @Deprecated
    public static void copy(Reader reader, OutputStream outputStream) throws IOException {
        copy(reader, outputStream, Charset.defaultCharset());
    }

    public static void copy(Reader reader, OutputStream outputStream, String str) throws IOException {
        copy(reader, outputStream, Charsets.toCharset(str));
    }

    public static void copy(Reader reader, OutputStream outputStream, Charset charset) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charsets.toCharset(charset));
        copy(reader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream) throws IOException {
        return copy(inputStream, outputStream, 4096);
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, long j, long j2) throws IOException {
        return copyLarge(inputStream, outputStream, j, j2, new byte[4096]);
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, long j, long j2, byte[] bArr) throws IOException {
        if (j > 0) {
            skipFully(inputStream, j);
        }
        if (j2 == 0) {
            return 0L;
        }
        int length = bArr.length;
        int iMin = (j2 <= 0 || j2 >= ((long) length)) ? length : (int) j2;
        long j3 = 0;
        while (iMin > 0) {
            int i = inputStream.read(bArr, 0, iMin);
            if (-1 == i) {
                return j3;
            }
            outputStream.write(bArr, 0, i);
            j3 += (long) i;
            if (j2 > 0) {
                iMin = (int) Math.min(j2 - j3, length);
            }
        }
        return j3;
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 == i) {
                return j;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }

    public static long copyLarge(Reader reader, Writer writer) throws IOException {
        return copyLarge(reader, writer, new char[4096]);
    }

    public static long copyLarge(Reader reader, Writer writer, long j, long j2) throws IOException {
        return copyLarge(reader, writer, j, j2, new char[4096]);
    }

    public static long copyLarge(Reader reader, Writer writer, long j, long j2, char[] cArr) throws IOException {
        if (j > 0) {
            skipFully(reader, j);
        }
        if (j2 == 0) {
            return 0L;
        }
        int length = (j2 <= 0 || j2 >= ((long) cArr.length)) ? cArr.length : (int) j2;
        long j3 = 0;
        while (length > 0) {
            int i = reader.read(cArr, 0, length);
            if (-1 == i) {
                break;
            }
            writer.write(cArr, 0, i);
            j3 += (long) i;
            if (j2 > 0) {
                length = (int) Math.min(j2 - j3, cArr.length);
            }
        }
        return j3;
    }

    public static long copyLarge(Reader reader, Writer writer, char[] cArr) throws IOException {
        long j = 0;
        while (true) {
            int i = reader.read(cArr);
            if (-1 == i) {
                return j;
            }
            writer.write(cArr, 0, i);
            j += (long) i;
        }
    }

    public static LineIterator lineIterator(InputStream inputStream, String str) throws IOException {
        return lineIterator(inputStream, Charsets.toCharset(str));
    }

    public static LineIterator lineIterator(InputStream inputStream, Charset charset) throws IOException {
        return new LineIterator(new InputStreamReader(inputStream, Charsets.toCharset(charset)));
    }

    public static LineIterator lineIterator(Reader reader) {
        return new LineIterator(reader);
    }

    public static int read(InputStream inputStream, byte[] bArr) throws IOException {
        return read(inputStream, bArr, 0, bArr.length);
    }

    public static int read(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 0) {
            throw new IllegalArgumentException("Length must not be negative: " + i2);
        }
        int i3 = i2;
        while (i3 > 0) {
            int i4 = inputStream.read(bArr, (i2 - i3) + i, i3);
            if (-1 == i4) {
                break;
            }
            i3 -= i4;
        }
        return i2 - i3;
    }

    public static int read(Reader reader, char[] cArr) throws IOException {
        return read(reader, cArr, 0, cArr.length);
    }

    public static int read(Reader reader, char[] cArr, int i, int i2) throws IOException {
        if (i2 < 0) {
            throw new IllegalArgumentException("Length must not be negative: " + i2);
        }
        int i3 = i2;
        while (i3 > 0) {
            int i4 = reader.read(cArr, (i2 - i3) + i, i3);
            if (-1 == i4) {
                break;
            }
            i3 -= i4;
        }
        return i2 - i3;
    }

    public static int read(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        while (byteBuffer.remaining() > 0 && -1 != readableByteChannel.read(byteBuffer)) {
        }
        return iRemaining - byteBuffer.remaining();
    }

    public static void readFully(InputStream inputStream, byte[] bArr) throws IOException {
        readFully(inputStream, bArr, 0, bArr.length);
    }

    public static void readFully(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3 = read(inputStream, bArr, i, i2);
        if (i3 != i2) {
            throw new EOFException("Length to read: " + i2 + " actual: " + i3);
        }
    }

    public static void readFully(Reader reader, char[] cArr) throws IOException {
        readFully(reader, cArr, 0, cArr.length);
    }

    public static void readFully(Reader reader, char[] cArr, int i, int i2) throws IOException {
        int i3 = read(reader, cArr, i, i2);
        if (i3 != i2) {
            throw new EOFException("Length to read: " + i2 + " actual: " + i3);
        }
    }

    public static void readFully(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        int i = read(readableByteChannel, byteBuffer);
        if (i != iRemaining) {
            throw new EOFException("Length to read: " + iRemaining + " actual: " + i);
        }
    }

    public static byte[] readFully(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        readFully(inputStream, bArr, 0, bArr.length);
        return bArr;
    }

    @Deprecated
    public static List<String> readLines(InputStream inputStream) throws IOException {
        return readLines(inputStream, Charset.defaultCharset());
    }

    public static List<String> readLines(InputStream inputStream, String str) throws IOException {
        return readLines(inputStream, Charsets.toCharset(str));
    }

    public static List<String> readLines(InputStream inputStream, Charset charset) throws IOException {
        return readLines(new InputStreamReader(inputStream, Charsets.toCharset(charset)));
    }

    public static List<String> readLines(Reader reader) throws IOException {
        BufferedReader bufferedReader = toBufferedReader(reader);
        ArrayList arrayList = new ArrayList();
        for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
            arrayList.add(line);
        }
        return arrayList;
    }

    public static byte[] resourceToByteArray(String str) throws IOException {
        return resourceToByteArray(str, null);
    }

    public static byte[] resourceToByteArray(String str, ClassLoader classLoader) throws IOException {
        return toByteArray(resourceToURL(str, classLoader));
    }

    public static String resourceToString(String str, Charset charset) throws IOException {
        return resourceToString(str, charset, null);
    }

    public static String resourceToString(String str, Charset charset, ClassLoader classLoader) throws IOException {
        return toString(resourceToURL(str, classLoader), charset);
    }

    public static URL resourceToURL(String str) throws IOException {
        return resourceToURL(str, null);
    }

    public static URL resourceToURL(String str, ClassLoader classLoader) throws IOException {
        URL resource = classLoader == null ? IOUtils.class.getResource(str) : classLoader.getResource(str);
        if (resource == null) {
            throw new IOException("Resource not found: " + str);
        }
        return resource;
    }

    public static long skip(InputStream inputStream, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("Skip count must be non-negative, actual: " + j);
        }
        if (SKIP_BYTE_BUFFER == null) {
            SKIP_BYTE_BUFFER = new byte[2048];
        }
        long j2 = j;
        while (j2 > 0) {
            long j3 = inputStream.read(SKIP_BYTE_BUFFER, 0, (int) Math.min(j2, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH));
            if (j3 < 0) {
                break;
            }
            j2 -= j3;
        }
        return j - j2;
    }

    public static long skip(Reader reader, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("Skip count must be non-negative, actual: " + j);
        }
        if (SKIP_CHAR_BUFFER == null) {
            SKIP_CHAR_BUFFER = new char[2048];
        }
        long j2 = j;
        while (j2 > 0) {
            long j3 = reader.read(SKIP_CHAR_BUFFER, 0, (int) Math.min(j2, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH));
            if (j3 < 0) {
                break;
            }
            j2 -= j3;
        }
        return j - j2;
    }

    public static long skip(ReadableByteChannel readableByteChannel, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("Skip count must be non-negative, actual: " + j);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) Math.min(j, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH));
        long j2 = j;
        while (j2 > 0) {
            byteBufferAllocate.position(0);
            byteBufferAllocate.limit((int) Math.min(j2, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH));
            int i = readableByteChannel.read(byteBufferAllocate);
            if (i == -1) {
                break;
            }
            j2 -= (long) i;
        }
        return j - j2;
    }

    public static void skipFully(InputStream inputStream, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("Bytes to skip must not be negative: " + j);
        }
        long jSkip = skip(inputStream, j);
        if (jSkip != j) {
            throw new EOFException("Bytes to skip: " + j + " actual: " + jSkip);
        }
    }

    public static void skipFully(Reader reader, long j) throws IOException {
        long jSkip = skip(reader, j);
        if (jSkip != j) {
            throw new EOFException("Chars to skip: " + j + " actual: " + jSkip);
        }
    }

    public static void skipFully(ReadableByteChannel readableByteChannel, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("Bytes to skip must not be negative: " + j);
        }
        long jSkip = skip(readableByteChannel, j);
        if (jSkip != j) {
            throw new EOFException("Bytes to skip: " + j + " actual: " + jSkip);
        }
    }

    public static InputStream toBufferedInputStream(InputStream inputStream) throws IOException {
        return ByteArrayOutputStream.toBufferedInputStream(inputStream);
    }

    public static InputStream toBufferedInputStream(InputStream inputStream, int i) throws IOException {
        return ByteArrayOutputStream.toBufferedInputStream(inputStream, i);
    }

    public static BufferedReader toBufferedReader(Reader reader) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
    }

    public static BufferedReader toBufferedReader(Reader reader, int i) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0024  */
    /* JADX WARN: Code duplicated, block: B:20:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static byte[] toByteArray(InputStream inputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Throwable th = null;
        try {
            copy(inputStream, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            return byteArray;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                th = th3;
                th = th2;
                if (byteArrayOutputStream != null) {
                    if (th != null) {
                        byteArrayOutputStream.close();
                    } else {
                        byteArrayOutputStream.close();
                    }
                }
                throw th;
            }
        }
    }

    public static byte[] toByteArray(InputStream inputStream, int i) throws IOException {
        int i2 = 0;
        if (i < 0) {
            throw new IllegalArgumentException("Size must be equal or greater than zero: " + i);
        }
        if (i == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i];
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                break;
            }
            i2 += i3;
        }
        if (i2 != i) {
            throw new IOException("Unexpected read size. current: " + i2 + ", expected: " + i);
        }
        return bArr;
    }

    public static byte[] toByteArray(InputStream inputStream, long j) throws IOException {
        if (j > 2147483647L) {
            throw new IllegalArgumentException("Size cannot be greater than Integer max value: " + j);
        }
        return toByteArray(inputStream, (int) j);
    }

    @Deprecated
    public static byte[] toByteArray(Reader reader) throws IOException {
        return toByteArray(reader, Charset.defaultCharset());
    }

    public static byte[] toByteArray(Reader reader, String str) throws IOException {
        return toByteArray(reader, Charsets.toCharset(str));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0024  */
    /* JADX WARN: Code duplicated, block: B:20:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static byte[] toByteArray(Reader reader, Charset charset) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Throwable th = null;
        try {
            copy(reader, byteArrayOutputStream, charset);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            return byteArray;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                th = th3;
                th = th2;
                if (byteArrayOutputStream != null) {
                    if (th != null) {
                        byteArrayOutputStream.close();
                    } else {
                        byteArrayOutputStream.close();
                    }
                }
                throw th;
            }
        }
    }

    @Deprecated
    public static byte[] toByteArray(String str) throws IOException {
        return str.getBytes(Charset.defaultCharset());
    }

    public static byte[] toByteArray(URI uri) throws IOException {
        return toByteArray(uri.toURL());
    }

    public static byte[] toByteArray(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        try {
            return toByteArray(uRLConnectionOpenConnection);
        } finally {
            close(uRLConnectionOpenConnection);
        }
    }

    public static byte[] toByteArray(URLConnection uRLConnection) throws IOException {
        InputStream inputStream = uRLConnection.getInputStream();
        Throwable th = null;
        try {
            byte[] byteArray = toByteArray(inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            return byteArray;
        } catch (Throwable th2) {
            if (inputStream != null) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                } else {
                    inputStream.close();
                }
            }
            throw th2;
        }
    }

    @Deprecated
    public static char[] toCharArray(InputStream inputStream) throws IOException {
        return toCharArray(inputStream, Charset.defaultCharset());
    }

    public static char[] toCharArray(InputStream inputStream, String str) throws IOException {
        return toCharArray(inputStream, Charsets.toCharset(str));
    }

    public static char[] toCharArray(InputStream inputStream, Charset charset) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        copy(inputStream, charArrayWriter, charset);
        return charArrayWriter.toCharArray();
    }

    public static char[] toCharArray(Reader reader) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        copy(reader, charArrayWriter);
        return charArrayWriter.toCharArray();
    }

    @Deprecated
    public static InputStream toInputStream(CharSequence charSequence) {
        return toInputStream(charSequence, Charset.defaultCharset());
    }

    public static InputStream toInputStream(CharSequence charSequence, String str) throws IOException {
        return toInputStream(charSequence, Charsets.toCharset(str));
    }

    public static InputStream toInputStream(CharSequence charSequence, Charset charset) {
        return toInputStream(charSequence.toString(), charset);
    }

    @Deprecated
    public static InputStream toInputStream(String str) {
        return toInputStream(str, Charset.defaultCharset());
    }

    public static InputStream toInputStream(String str, String str2) throws IOException {
        return new ByteArrayInputStream(str.getBytes(Charsets.toCharset(str2)));
    }

    public static InputStream toInputStream(String str, Charset charset) {
        return new ByteArrayInputStream(str.getBytes(Charsets.toCharset(charset)));
    }

    @Deprecated
    public static String toString(InputStream inputStream) throws IOException {
        return toString(inputStream, Charset.defaultCharset());
    }

    public static String toString(InputStream inputStream, String str) throws IOException {
        return toString(inputStream, Charsets.toCharset(str));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0024  */
    /* JADX WARN: Code duplicated, block: B:20:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String toString(InputStream inputStream, Charset charset) throws Throwable {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter();
        Throwable th = null;
        try {
            copy(inputStream, stringBuilderWriter, charset);
            String string = stringBuilderWriter.toString();
            if (stringBuilderWriter != null) {
                stringBuilderWriter.close();
            }
            return string;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                th = th3;
                th = th2;
                if (stringBuilderWriter != null) {
                    if (th != null) {
                        stringBuilderWriter.close();
                    } else {
                        stringBuilderWriter.close();
                    }
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0024  */
    /* JADX WARN: Code duplicated, block: B:20:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String toString(Reader reader) throws Throwable {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter();
        Throwable th = null;
        try {
            copy(reader, stringBuilderWriter);
            String string = stringBuilderWriter.toString();
            if (stringBuilderWriter != null) {
                stringBuilderWriter.close();
            }
            return string;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                th = th3;
                th = th2;
                if (stringBuilderWriter != null) {
                    if (th != null) {
                        stringBuilderWriter.close();
                    } else {
                        stringBuilderWriter.close();
                    }
                }
                throw th;
            }
        }
    }

    @Deprecated
    public static String toString(URI uri) throws IOException {
        return toString(uri, Charset.defaultCharset());
    }

    public static String toString(URI uri, String str) throws IOException {
        return toString(uri, Charsets.toCharset(str));
    }

    public static String toString(URI uri, Charset charset) throws IOException {
        return toString(uri.toURL(), Charsets.toCharset(charset));
    }

    @Deprecated
    public static String toString(URL url) throws IOException {
        return toString(url, Charset.defaultCharset());
    }

    public static String toString(URL url, String str) throws IOException {
        return toString(url, Charsets.toCharset(str));
    }

    public static String toString(URL url, Charset charset) throws IOException {
        InputStream inputStreamOpenStream = url.openStream();
        Throwable th = null;
        try {
            String string = toString(inputStreamOpenStream, charset);
            if (inputStreamOpenStream != null) {
                inputStreamOpenStream.close();
            }
            return string;
        } catch (Throwable th2) {
            if (inputStreamOpenStream != null) {
                if (0 != 0) {
                    try {
                        inputStreamOpenStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                } else {
                    inputStreamOpenStream.close();
                }
            }
            throw th2;
        }
    }

    @Deprecated
    public static String toString(byte[] bArr) throws IOException {
        return new String(bArr, Charset.defaultCharset());
    }

    public static String toString(byte[] bArr, String str) throws IOException {
        return new String(bArr, Charsets.toCharset(str));
    }

    @Deprecated
    public static void write(CharSequence charSequence, OutputStream outputStream) throws IOException {
        write(charSequence, outputStream, Charset.defaultCharset());
    }

    public static void write(CharSequence charSequence, OutputStream outputStream, String str) throws IOException {
        write(charSequence, outputStream, Charsets.toCharset(str));
    }

    public static void write(CharSequence charSequence, OutputStream outputStream, Charset charset) throws IOException {
        if (charSequence != null) {
            write(charSequence.toString(), outputStream, charset);
        }
    }

    public static void write(CharSequence charSequence, Writer writer) throws IOException {
        if (charSequence != null) {
            write(charSequence.toString(), writer);
        }
    }

    @Deprecated
    public static void write(String str, OutputStream outputStream) throws IOException {
        write(str, outputStream, Charset.defaultCharset());
    }

    public static void write(String str, OutputStream outputStream, String str2) throws IOException {
        write(str, outputStream, Charsets.toCharset(str2));
    }

    public static void write(String str, OutputStream outputStream, Charset charset) throws IOException {
        if (str != null) {
            outputStream.write(str.getBytes(Charsets.toCharset(charset)));
        }
    }

    public static void write(String str, Writer writer) throws IOException {
        if (str != null) {
            writer.write(str);
        }
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, OutputStream outputStream) throws IOException {
        write(stringBuffer, outputStream, (String) null);
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, OutputStream outputStream, String str) throws IOException {
        if (stringBuffer != null) {
            outputStream.write(stringBuffer.toString().getBytes(Charsets.toCharset(str)));
        }
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, Writer writer) throws IOException {
        if (stringBuffer != null) {
            writer.write(stringBuffer.toString());
        }
    }

    public static void write(byte[] bArr, OutputStream outputStream) throws IOException {
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }

    @Deprecated
    public static void write(byte[] bArr, Writer writer) throws IOException {
        write(bArr, writer, Charset.defaultCharset());
    }

    public static void write(byte[] bArr, Writer writer, String str) throws IOException {
        write(bArr, writer, Charsets.toCharset(str));
    }

    public static void write(byte[] bArr, Writer writer, Charset charset) throws IOException {
        if (bArr != null) {
            writer.write(new String(bArr, Charsets.toCharset(charset)));
        }
    }

    @Deprecated
    public static void write(char[] cArr, OutputStream outputStream) throws IOException {
        write(cArr, outputStream, Charset.defaultCharset());
    }

    public static void write(char[] cArr, OutputStream outputStream, String str) throws IOException {
        write(cArr, outputStream, Charsets.toCharset(str));
    }

    public static void write(char[] cArr, OutputStream outputStream, Charset charset) throws IOException {
        if (cArr != null) {
            outputStream.write(new String(cArr).getBytes(Charsets.toCharset(charset)));
        }
    }

    public static void write(char[] cArr, Writer writer) throws IOException {
        if (cArr != null) {
            writer.write(cArr);
        }
    }

    public static void writeChunked(byte[] bArr, OutputStream outputStream) throws IOException {
        if (bArr != null) {
            int length = bArr.length;
            int i = 0;
            while (length > 0) {
                int iMin = Math.min(length, 4096);
                outputStream.write(bArr, i, iMin);
                length -= iMin;
                i += iMin;
            }
        }
    }

    public static void writeChunked(char[] cArr, Writer writer) throws IOException {
        if (cArr != null) {
            int length = cArr.length;
            int i = 0;
            while (length > 0) {
                int iMin = Math.min(length, 4096);
                writer.write(cArr, i, iMin);
                length -= iMin;
                i += iMin;
            }
        }
    }

    @Deprecated
    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream) throws IOException {
        writeLines(collection, str, outputStream, Charset.defaultCharset());
    }

    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream, String str2) throws IOException {
        writeLines(collection, str, outputStream, Charsets.toCharset(str2));
    }

    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream, Charset charset) throws IOException {
        if (collection == null) {
            return;
        }
        if (str == null) {
            str = LINE_SEPARATOR;
        }
        Charset charset2 = Charsets.toCharset(charset);
        for (Object obj : collection) {
            if (obj != null) {
                outputStream.write(obj.toString().getBytes(charset2));
            }
            outputStream.write(str.getBytes(charset2));
        }
    }

    public static void writeLines(Collection<?> collection, String str, Writer writer) throws IOException {
        if (collection == null) {
            return;
        }
        if (str == null) {
            str = LINE_SEPARATOR;
        }
        for (Object obj : collection) {
            if (obj != null) {
                writer.write(obj.toString());
            }
            writer.write(str);
        }
    }
}
