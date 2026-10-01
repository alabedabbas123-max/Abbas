package sun.nio.cs;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;

public class StreamEncoder extends Writer {
    static final boolean $assertionsDisabled = false;
    private static final int DEFAULT_BYTE_BUFFER_SIZE = 8192;

    private ByteBuffer f619bb;

    private WritableByteChannel f620ch;

    private Charset f621cs;
    private CharsetEncoder encoder;
    private boolean haveLeftoverChar;
    private volatile boolean isOpen;

    private CharBuffer f622lcb;
    private char leftoverChar;

    private final OutputStream f623out;

    private void ensureOpen() throws IOException {
        if (!this.isOpen) {
            throw new IOException("Stream closed");
        }
    }

    public static StreamEncoder forOutputStreamWriter(OutputStream out, Object lock, String charsetName) throws UnsupportedEncodingException {
        String csn = charsetName;
        if (csn == null) {
            csn = Charset.defaultCharset().name();
        }
        try {
            if (Charset.isSupported(csn)) {
                return new StreamEncoder(out, lock, Charset.forName(csn));
            }
        } catch (IllegalCharsetNameException e) {
        }
        throw new UnsupportedEncodingException(csn);
    }

    public static StreamEncoder forOutputStreamWriter(OutputStream out, Object lock, Charset cs) {
        return new StreamEncoder(out, lock, cs);
    }

    public static StreamEncoder forOutputStreamWriter(OutputStream out, Object lock, CharsetEncoder enc) {
        return new StreamEncoder(out, lock, enc);
    }

    public static StreamEncoder forEncoder(WritableByteChannel ch, CharsetEncoder enc, int minBufferCap) {
        return new StreamEncoder(ch, enc, minBufferCap);
    }

    public String getEncoding() {
        if (isOpen()) {
            return encodingName();
        }
        return null;
    }

    public void flushBuffer() throws IOException {
        synchronized (this.lock) {
            if (isOpen()) {
                implFlushBuffer();
            } else {
                throw new IOException("Stream closed");
            }
        }
    }

    @Override
    public void write(int c) throws IOException {
        char[] cbuf = {(char) c};
        write(cbuf, 0, 1);
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        synchronized (this.lock) {
            ensureOpen();
            if (off < 0 || off > cbuf.length || len < 0 || off + len > cbuf.length || off + len < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (len == 0) {
                return;
            }
            implWrite(cbuf, off, len);
        }
    }

    @Override
    public void write(String str, int off, int len) throws IOException {
        if (len < 0) {
            throw new IndexOutOfBoundsException();
        }
        char[] cbuf = new char[len];
        str.getChars(off, off + len, cbuf, 0);
        write(cbuf, 0, len);
    }

    @Override
    public void flush() throws IOException {
        synchronized (this.lock) {
            ensureOpen();
            implFlush();
        }
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

    private StreamEncoder(OutputStream out, Object lock, Charset cs) {
        this(out, lock, cs.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE));
    }

    private StreamEncoder(OutputStream out, Object lock, CharsetEncoder enc) {
        super(lock);
        this.isOpen = true;
        this.haveLeftoverChar = $assertionsDisabled;
        this.f622lcb = null;
        this.f623out = out;
        this.f620ch = null;
        this.f621cs = enc.charset();
        this.encoder = enc;
        if (this.f620ch == null) {
            this.f619bb = ByteBuffer.allocate(8192);
        }
    }

    private StreamEncoder(WritableByteChannel ch, CharsetEncoder enc, int mbc) {
        int i;
        this.isOpen = true;
        this.haveLeftoverChar = $assertionsDisabled;
        this.f622lcb = null;
        this.f623out = null;
        this.f620ch = ch;
        this.f621cs = enc.charset();
        this.encoder = enc;
        if (mbc < 0) {
            i = 8192;
        } else {
            i = mbc;
        }
        this.f619bb = ByteBuffer.allocate(i);
    }

    private void writeBytes() throws IOException {
        this.f619bb.flip();
        int lim = this.f619bb.limit();
        int pos = this.f619bb.position();
        int rem = pos <= lim ? lim - pos : 0;
        if (rem > 0) {
            WritableByteChannel writableByteChannel = this.f620ch;
            if (writableByteChannel != null) {
                if (writableByteChannel.write(this.f619bb) != rem) {
                }
            } else {
                this.f623out.write(this.f619bb.array(), this.f619bb.arrayOffset() + pos, rem);
            }
        }
        this.f619bb.clear();
    }

    private void flushLeftoverChar(CharBuffer cb, boolean endOfInput) throws IOException {
        if (!this.haveLeftoverChar && !endOfInput) {
            return;
        }
        CharBuffer charBuffer = this.f622lcb;
        if (charBuffer == null) {
            this.f622lcb = CharBuffer.allocate(2);
        } else {
            charBuffer.clear();
        }
        if (this.haveLeftoverChar) {
            this.f622lcb.put(this.leftoverChar);
        }
        if (cb != null && cb.hasRemaining()) {
            this.f622lcb.put(cb.get());
        }
        this.f622lcb.flip();
        while (true) {
            if (!this.f622lcb.hasRemaining() && !endOfInput) {
                break;
            }
            CoderResult cr = this.encoder.encode(this.f622lcb, this.f619bb, endOfInput);
            if (cr.isUnderflow()) {
                if (!this.f622lcb.hasRemaining()) {
                    break;
                }
                this.leftoverChar = this.f622lcb.get();
                if (cb != null && cb.hasRemaining()) {
                    flushLeftoverChar(cb, endOfInput);
                    return;
                }
                return;
            }
            if (cr.isOverflow()) {
                writeBytes();
            } else {
                cr.throwException();
            }
        }
        this.haveLeftoverChar = $assertionsDisabled;
    }

    void implWrite(char[] cbuf, int off, int len) throws IOException {
        CharBuffer cb = CharBuffer.wrap(cbuf, off, len);
        if (this.haveLeftoverChar) {
            flushLeftoverChar(cb, $assertionsDisabled);
        }
        while (cb.hasRemaining()) {
            CoderResult cr = this.encoder.encode(cb, this.f619bb, $assertionsDisabled);
            if (cr.isUnderflow()) {
                if (cb.remaining() == 1) {
                    this.haveLeftoverChar = true;
                    this.leftoverChar = cb.get();
                    return;
                }
                return;
            }
            if (cr.isOverflow()) {
                writeBytes();
            } else {
                cr.throwException();
            }
        }
    }

    void implFlushBuffer() throws IOException {
        if (this.f619bb.position() > 0) {
            writeBytes();
        }
    }

    void implFlush() throws IOException {
        implFlushBuffer();
        OutputStream outputStream = this.f623out;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    void implClose() throws IOException {
        flushLeftoverChar(null, true);
        while (true) {
            try {
                CoderResult cr = this.encoder.flush(this.f619bb);
                if (cr.isUnderflow()) {
                    break;
                } else if (cr.isOverflow()) {
                    writeBytes();
                } else {
                    cr.throwException();
                }
            } catch (IOException x) {
                this.encoder.reset();
                throw x;
            }
        }
        if (this.f619bb.position() > 0) {
            writeBytes();
        }
        if (this.f620ch != null) {
            this.f620ch.close();
        } else {
            this.f623out.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    String encodingName() {
        Charset charset = this.f621cs;
        if (charset instanceof HistoricallyNamedCharset) {
            return ((HistoricallyNamedCharset) charset).historicalName();
        }
        return charset.name();
    }
}
