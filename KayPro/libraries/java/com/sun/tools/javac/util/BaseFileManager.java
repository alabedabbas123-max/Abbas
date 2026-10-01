package com.sun.tools.javac.util;

import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.code.Source;
import com.sun.tools.javac.main.JavacOption;
import com.sun.tools.javac.main.OptionName;
import com.sun.tools.javac.main.RecognizedOptions;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.lang.ref.SoftReference;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.tools.JavaFileObject;

public abstract class BaseFileManager {
    private static JavacOption[] javacFileManagerOptions = RecognizedOptions.getJavacFileManagerOptions(new RecognizedOptions.GrumpyHelper());
    protected Charset charset;
    protected String classLoaderClass;
    private String defaultEncodingName;

    public Log f553log;
    protected Options options;
    protected final Map<JavaFileObject, ContentCacheEntry> contentCache = new HashMap();
    private final ByteBufferCache byteBufferCache = new ByteBufferCache();

    public abstract boolean isDefaultBootClassPath();

    protected BaseFileManager(Charset charset) {
        this.charset = charset;
    }

    protected void setContext(Context context) {
        this.f553log = Log.instance(context);
        Options optionsInstance = Options.instance(context);
        this.options = optionsInstance;
        this.classLoaderClass = optionsInstance.m515get("procloader");
    }

    protected Source getSource() {
        String sourceName = this.options.m514get(OptionName.SOURCE);
        Source source = null;
        if (sourceName != null) {
            source = Source.lookup(sourceName);
        }
        return source != null ? source : Source.DEFAULT;
    }

    protected ClassLoader getClassLoader(URL[] urls) {
        ClassLoader thisClassLoader = getClass().getClassLoader();
        String str = this.classLoaderClass;
        if (str != null) {
            try {
                Class<?>[] constrArgTypes = {URL[].class, ClassLoader.class};
                Constructor<? extends ClassLoader> constr = Class.forName(str).asSubclass(ClassLoader.class).getConstructor(constrArgTypes);
                return (ClassLoader) constr.newInstance(urls, thisClassLoader);
            } catch (Throwable th) {
            }
        }
        if (Closeable.class.isAssignableFrom(URLClassLoader.class)) {
            return new URLClassLoader(urls, thisClassLoader);
        }
        try {
            return new CloseableURLClassLoader(urls, thisClassLoader);
        } catch (Throwable th2) {
            return new URLClassLoader(urls, thisClassLoader);
        }
    }

    public boolean handleOption(String current, Iterator<String> remaining) {
        for (JavacOption o : javacFileManagerOptions) {
            if (o.matches(current)) {
                if (o.hasArg()) {
                    if (remaining.hasNext() && !o.process(this.options, current, remaining.next())) {
                        return true;
                    }
                } else if (!o.process(this.options, current)) {
                    return true;
                }
                throw new IllegalArgumentException(current);
            }
        }
        return false;
    }

    public int isSupportedOption(String str) {
        for (JavacOption javacOption : javacFileManagerOptions) {
            if (javacOption.matches(str)) {
                return javacOption.hasArg() ? 1 : 0;
            }
        }
        return -1;
    }

    private String getDefaultEncodingName() {
        if (this.defaultEncodingName == null) {
            this.defaultEncodingName = new OutputStreamWriter(new ByteArrayOutputStream()).getEncoding();
        }
        return this.defaultEncodingName;
    }

    public String getEncodingName() {
        String encName = this.options.m514get(OptionName.ENCODING);
        if (encName == null) {
            return getDefaultEncodingName();
        }
        return encName;
    }

    public CharBuffer decode(ByteBuffer inbuf, boolean ignoreEncodingErrors) {
        String encodingName = getEncodingName();
        try {
            CharsetDecoder decoder = getDecoder(encodingName, ignoreEncodingErrors);
            float factor = (decoder.maxCharsPerByte() * 0.2f) + (decoder.averageCharsPerByte() * 0.8f);
            CharBuffer dest = CharBuffer.allocate(((int) (inbuf.remaining() * factor)) + 10);
            while (true) {
                CoderResult result = decoder.decode(inbuf, dest, true);
                dest.flip();
                if (result.isUnderflow()) {
                    if (dest.limit() == dest.capacity()) {
                        CharBuffer dest2 = CharBuffer.allocate(dest.capacity() + 1).put(dest);
                        dest2.flip();
                        return dest2;
                    }
                    return dest;
                }
                if (result.isOverflow()) {
                    int newCapacity = dest.capacity() + 10 + ((int) (inbuf.remaining() * decoder.maxCharsPerByte()));
                    dest = CharBuffer.allocate(newCapacity).put(dest);
                } else if (result.isMalformed() || result.isUnmappable()) {
                    if (!getSource().allowEncodingErrors()) {
                        Log c0730Log = this.f553log;
                        JCDiagnostic.SimpleDiagnosticPosition simpleDiagnosticPosition = new JCDiagnostic.SimpleDiagnosticPosition(dest.limit());
                        Object[] objArr = new Object[1];
                        Charset charset = this.charset;
                        objArr[0] = charset == null ? encodingName : charset.name();
                        c0730Log.error(simpleDiagnosticPosition, "illegal.char.for.encoding", objArr);
                    } else {
                        Log c0730Log2 = this.f553log;
                        JCDiagnostic.SimpleDiagnosticPosition simpleDiagnosticPosition2 = new JCDiagnostic.SimpleDiagnosticPosition(dest.limit());
                        Object[] objArr2 = new Object[1];
                        Charset charset2 = this.charset;
                        objArr2[0] = charset2 == null ? encodingName : charset2.name();
                        c0730Log2.warning(simpleDiagnosticPosition2, "illegal.char.for.encoding", objArr2);
                    }
                    inbuf.position(inbuf.position() + result.length());
                    dest.position(dest.limit());
                    dest.limit(dest.capacity());
                    dest.put((char) 65533);
                } else {
                    throw new AssertionError(result);
                }
            }
        } catch (IllegalCharsetNameException e) {
            this.f553log.error("unsupported.encoding", encodingName);
            return (CharBuffer) CharBuffer.allocate(1).flip();
        } catch (UnsupportedCharsetException e2) {
            this.f553log.error("unsupported.encoding", encodingName);
            return (CharBuffer) CharBuffer.allocate(1).flip();
        }
    }

    public CharsetDecoder getDecoder(String encodingName, boolean ignoreEncodingErrors) {
        CodingErrorAction action;
        Charset cs = this.charset;
        if (cs == null) {
            cs = Charset.forName(encodingName);
        }
        CharsetDecoder decoder = cs.newDecoder();
        if (ignoreEncodingErrors) {
            action = CodingErrorAction.REPLACE;
        } else {
            action = CodingErrorAction.REPORT;
        }
        return decoder.onMalformedInput(action).onUnmappableCharacter(action);
    }

    public ByteBuffer makeByteBuffer(InputStream in) throws IOException {
        int limit = in.available();
        if (limit < 1024) {
            limit = Flags.ABSTRACT;
        }
        ByteBuffer result = this.byteBufferCache.m497get(limit);
        int position = 0;
        while (in.available() != 0) {
            if (position >= limit) {
                int i = limit << 1;
                limit = i;
                result = ByteBuffer.allocate(i).put((ByteBuffer) result.flip());
            }
            int count = in.read(result.array(), position, limit - position);
            if (count < 0) {
                break;
            }
            int i2 = position + count;
            position = i2;
            result.position(i2);
        }
        return (ByteBuffer) result.flip();
    }

    public void recycleByteBuffer(ByteBuffer bb) {
        this.byteBufferCache.m498put(bb);
    }

    private static class ByteBufferCache {
        private ByteBuffer cached;

        private ByteBufferCache() {
        }

        ByteBuffer m497get(int capacity) {
            ByteBuffer result;
            if (capacity < 20480) {
                capacity = 20480;
            }
            ByteBuffer byteBuffer = this.cached;
            if (byteBuffer != null && byteBuffer.capacity() >= capacity) {
                result = (ByteBuffer) this.cached.clear();
            } else {
                result = ByteBuffer.allocate((capacity + capacity) >> 1);
            }
            this.cached = null;
            return result;
        }

        void m498put(ByteBuffer x) {
            this.cached = x;
        }
    }

    public CharBuffer getCachedContent(JavaFileObject file) {
        ContentCacheEntry e = this.contentCache.get(file);
        if (e == null) {
            return null;
        }
        if (!e.isValid(file)) {
            this.contentCache.remove(file);
            return null;
        }
        return e.getValue();
    }

    public void cache(JavaFileObject file, CharBuffer cb) {
        this.contentCache.put(file, new ContentCacheEntry(file, cb));
    }

    public void flushCache(JavaFileObject file) {
        this.contentCache.remove(file);
    }

    protected static class ContentCacheEntry {

        final SoftReference<CharBuffer> f554ref;
        final long timestamp;

        ContentCacheEntry(JavaFileObject file, CharBuffer cb) {
            this.timestamp = file.getLastModified();
            this.f554ref = new SoftReference<>(cb);
        }

        boolean isValid(JavaFileObject file) {
            return this.timestamp == file.getLastModified();
        }

        CharBuffer getValue() {
            return this.f554ref.get();
        }
    }

    public static JavaFileObject.Kind getKind(String name) {
        if (name.endsWith(JavaFileObject.Kind.CLASS.extension)) {
            return JavaFileObject.Kind.CLASS;
        }
        if (name.endsWith(JavaFileObject.Kind.SOURCE.extension)) {
            return JavaFileObject.Kind.SOURCE;
        }
        if (name.endsWith(JavaFileObject.Kind.HTML.extension)) {
            return JavaFileObject.Kind.HTML;
        }
        return JavaFileObject.Kind.OTHER;
    }

    protected static <T> T nullCheck(T o) {
        o.getClass();
        return o;
    }

    protected static <T> Collection<T> nullCheck(Collection<T> it) {
        for (T t : it) {
            t.getClass();
        }
        return it;
    }
}
