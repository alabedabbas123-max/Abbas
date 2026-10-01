package sun.misc;

import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.util.Position;
import com.spartacusrex.spartacuside.helper.Arrays;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.CodeSigner;
import java.security.cert.Certificate;
import java.util.jar.Manifest;
import sun.nio.ByteBuffered;

public abstract class Resource {

    private InputStream f603cis;

    public abstract URL getCodeSourceURL();

    public abstract int getContentLength() throws IOException;

    public abstract InputStream getInputStream() throws IOException;

    public abstract String getName();

    public abstract URL getURL();

    private synchronized InputStream cachedInputStream() throws IOException {
        if (this.f603cis == null) {
            this.f603cis = getInputStream();
        }
        return this.f603cis;
    }

    public byte[] getBytes() throws IOException {
        int len;
        int bytesToRead;
        InputStream in = cachedInputStream();
        boolean isInterrupted = Thread.interrupted();
        while (true) {
            try {
                len = getContentLength();
                break;
            } catch (InterruptedIOException e) {
                Thread.interrupted();
                isInterrupted = true;
            }
        }
        try {
            byte[] b = new byte[0];
            if (len == -1) {
                len = Position.MAXPOS;
            }
            int pos = 0;
            while (pos < len) {
                if (pos >= b.length) {
                    bytesToRead = Math.min(len - pos, b.length + Flags.ABSTRACT);
                    if (b.length < pos + bytesToRead) {
                        b = Arrays.copyOf(b, pos + bytesToRead);
                    }
                } else {
                    int bytesToRead2 = b.length;
                    bytesToRead = bytesToRead2 - pos;
                }
                int cc = 0;
                try {
                    cc = in.read(b, pos, bytesToRead);
                } catch (InterruptedIOException e2) {
                    Thread.interrupted();
                    isInterrupted = true;
                }
                if (cc < 0) {
                    if (len != Integer.MAX_VALUE) {
                        throw new EOFException("Detect premature EOF");
                    }
                    if (b.length == pos) {
                        break;
                    }
                    b = Arrays.copyOf(b, pos);
                    break;
                }
                pos += cc;
            }
            try {
                in.close();
            } catch (InterruptedIOException e3) {
                isInterrupted = true;
            } catch (IOException e4) {
            }
            if (isInterrupted) {
                Thread.currentThread().interrupt();
            }
            return b;
        } catch (Throwable th) {
            try {
                in.close();
            } catch (InterruptedIOException e5) {
                isInterrupted = true;
            } catch (IOException e6) {
            }
            if (!isInterrupted) {
                throw th;
            }
            Thread.currentThread().interrupt();
            throw th;
        }
    }

    public ByteBuffer getByteBuffer() throws IOException {
        Closeable closeableCachedInputStream = cachedInputStream();
        if (closeableCachedInputStream instanceof ByteBuffered) {
            return ((ByteBuffered) closeableCachedInputStream).getByteBuffer();
        }
        return null;
    }

    public Manifest getManifest() throws IOException {
        return null;
    }

    public Certificate[] getCertificates() {
        return null;
    }

    public CodeSigner[] getCodeSigners() {
        return null;
    }
}
