package org.a.a.a;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

public final class ClassD {

    public static Charset f5295a = Charset.forName("UTF_8");

    public static Charset f5296b = Charset.forName("ISO_8859_1");

    public static Abstracth m7410a(Reader reader) {
        return m7411a(reader, "<unknown>");
    }

    public static Abstracth m7411a(Reader reader, String str) throws IOException {
        try {
            ClassF c1780fM7412a = ClassE.m7412a(4096);
            CharBuffer charBufferAllocate = CharBuffer.allocate(4096);
            while (reader.read(charBufferAllocate) != -1) {
                charBufferAllocate.flip();
                c1780fM7412a.m7432a(charBufferAllocate);
                charBufferAllocate.compact();
            }
            return Abstracth.m7434a(c1780fM7412a.m7430a(), str);
        } finally {
            reader.close();
        }
    }
}
