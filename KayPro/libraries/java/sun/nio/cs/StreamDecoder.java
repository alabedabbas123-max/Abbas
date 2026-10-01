package sun.nio.cs;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;

public class StreamDecoder extends Reader {
    static final boolean $assertionsDisabled = false;
    private static final int DEFAULT_BYTE_BUFFER_SIZE = 8192;
    private static final int MIN_BYTE_BUFFER_SIZE = 32;
    private static volatile boolean channelsAvailable = true;

    private ByteBuffer f615bb;

    private ReadableByteChannel f616ch;

    private Charset f617cs;
    private CharsetDecoder decoder;
    private boolean haveLeftoverChar;

    private InputStream f618in;
    private volatile boolean isOpen;
    private char leftoverChar;

    private void ensureOpen() throws IOException {
        if (!this.isOpen) {
            throw new IOException("Stream closed");
        }
    }

    public static StreamDecoder forInputStreamReader(InputStream in, Object lock, String charsetName) throws UnsupportedEncodingException {
        String csn = charsetName;
        if (csn == null) {
            csn = Charset.defaultCharset().name();
        }
        try {
            if (Charset.isSupported(csn)) {
                return new StreamDecoder(in, lock, Charset.forName(csn));
            }
        } catch (IllegalCharsetNameException e) {
        }
        throw new UnsupportedEncodingException(csn);
    }

    public static StreamDecoder forInputStreamReader(InputStream in, Object lock, Charset cs) {
        return new StreamDecoder(in, lock, cs);
    }

    public static StreamDecoder forInputStreamReader(InputStream in, Object lock, CharsetDecoder dec) {
        return new StreamDecoder(in, lock, dec);
    }

    public static StreamDecoder forDecoder(ReadableByteChannel ch, CharsetDecoder dec, int minBufferCap) {
        return new StreamDecoder(ch, dec, minBufferCap);
    }

    public String getEncoding() {
        if (isOpen()) {
            return encodingName();
        }
        return null;
    }

    @Override
    public int read() throws IOException {
        return read0();
    }

    private int read0() throws IOException {
        synchronized (this.lock) {
            if (this.haveLeftoverChar) {
                this.haveLeftoverChar = $assertionsDisabled;
                return this.leftoverChar;
            }
            char[] cb = new char[2];
            int n = read(cb, 0, 2);
            if (n == -1) {
                return -1;
            }
            if (n != 1) {
                if (n != 2) {
                    return -1;
                }
                this.leftoverChar = cb[1];
                this.haveLeftoverChar = true;
            }
            return cb[0];
        }
    }

    @Override
    public int read(char[] cbuf, int offset, int length) throws IOException {
        int off = offset;
        int len = length;
        synchronized (this.lock) {
            ensureOpen();
            if (off < 0 || off > cbuf.length || len < 0 || off + len > cbuf.length || off + len < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (len == 0) {
                return 0;
            }
            int n = 0;
            if (this.haveLeftoverChar) {
                cbuf[off] = this.leftoverChar;
                off++;
                len--;
                this.haveLeftoverChar = $assertionsDisabled;
                n = 1;
                if (len == 0 || !implReady()) {
                    return 1;
                }
            }
            if (len == 1) {
                int c = read0();
                int i = -1;
                if (c == -1) {
                    if (n != 0) {
                        i = n;
                    }
                    return i;
                }
                cbuf[off] = (char) c;
                return n + 1;
            }
            return implRead(cbuf, off, off + len) + n;
        }
    }

    @Override
    public boolean ready() throws IOException {
        boolean z;
        synchronized (this.lock) {
            ensureOpen();
            z = (this.haveLeftoverChar || implReady()) ? true : $assertionsDisabled;
        }
        return z;
    }

    @Override
    public void close() throws IOException {
        synchronized (this.lock) {
            if (this.isOpen) {
                implClose();
                this.isOpen = $assertionsDisabled;
            }
        }
    }

    private boolean isOpen() {
        return this.isOpen;
    }

    private static FileChannel getChannel(FileInputStream in) {
        if (!channelsAvailable) {
            return null;
        }
        try {
            return in.getChannel();
        } catch (UnsatisfiedLinkError e) {
            channelsAvailable = $assertionsDisabled;
            return null;
        }
    }

    StreamDecoder(InputStream in, Object lock, Charset cs) {
        this(in, lock, cs.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE));
    }

    StreamDecoder(InputStream in, Object lock, CharsetDecoder dec) {
        super(lock);
        this.isOpen = true;
        this.haveLeftoverChar = $assertionsDisabled;
        this.f617cs = dec.charset();
        this.decoder = dec;
        if (this.f616ch == null) {
            this.f618in = in;
            this.f616ch = null;
            this.f615bb = ByteBuffer.allocate(8192);
        }
        this.f615bb.flip();
    }

    StreamDecoder(ReadableByteChannel ch, CharsetDecoder dec, int mbc) {
        this.isOpen = true;
        this.haveLeftoverChar = $assertionsDisabled;
        this.f618in = null;
        this.f616ch = ch;
        this.decoder = dec;
        this.f617cs = dec.charset();
        int i = 32;
        if (mbc < 0) {
            i = 8192;
        } else if (mbc >= 32) {
            i = mbc;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        this.f615bb = byteBufferAllocate;
        byteBufferAllocate.flip();
    }

    private int readBytes() throws IOException {
        this.f615bb.compact();
        try {
            if (this.f616ch != null) {
                int n = this.f616ch.read(this.f615bb);
                if (n < 0) {
                    this.f615bb.flip();
                    return n;
                }
            } else {
                int lim = this.f615bb.limit();
                int pos = this.f615bb.position();
                int rem = pos <= lim ? lim - pos : 0;
                int n2 = this.f618in.read(this.f615bb.array(), this.f615bb.arrayOffset() + pos, rem);
                if (n2 < 0) {
                    this.f615bb.flip();
                    return n2;
                }
                if (n2 == 0) {
                    throw new IOException("Underlying input stream returned zero bytes");
                }
                this.f615bb.position(pos + n2);
            }
            this.f615bb.flip();
            int rem2 = this.f615bb.remaining();
            return rem2;
        } catch (Throwable th) {
            this.f615bb.flip();
            throw th;
        }
    }

    int implRead(char[] cbuf, int off, int end) throws IOException {
        CharBuffer cb = CharBuffer.wrap(cbuf, off, end - off);
        if (cb.position() != 0) {
            cb = cb.slice();
        }
        boolean eof = $assertionsDisabled;
        while (true) {
            CoderResult cr = this.decoder.decode(this.f615bb, cb, eof);
            if (cr.isUnderflow()) {
                if (eof || !cb.hasRemaining() || (cb.position() > 0 && !inReady())) {
                    break;
                }
                int n = readBytes();
                if (n < 0) {
                    eof = true;
                    if (cb.position() == 0 && !this.f615bb.hasRemaining()) {
                        break;
                    }
                    this.decoder.reset();
                } else {
                    continue;
                }
            } else {
                if (cr.isOverflow()) {
                    break;
                }
                cr.throwException();
            }
        }
        if (eof) {
            this.decoder.reset();
        }
        if (cb.position() == 0 && eof) {
            return -1;
        }
        return cb.position();
    }

    /* JADX WARN: Multi-variable type inference failed */
    String encodingName() {
        Charset charset = this.f617cs;
        if (charset instanceof HistoricallyNamedCharset) {
            return ((HistoricallyNamedCharset) charset).historicalName();
        }
        return charset.name();
    }

    private boolean inReady() {
        try {
            if ((this.f618in == null || this.f618in.available() <= 0) && !(this.f616ch instanceof FileChannel)) {
                return $assertionsDisabled;
            }
            return true;
        } catch (IOException e) {
            return $assertionsDisabled;
        }
    }

    boolean implReady() {
        if (this.f615bb.hasRemaining() || inReady()) {
            return true;
        }
        return $assertionsDisabled;
    }

    void implClose() throws IOException {
        ReadableByteChannel readableByteChannel = this.f616ch;
        if (readableByteChannel != null) {
            readableByteChannel.close();
        } else {
            this.f618in.close();
        }
    }
}
