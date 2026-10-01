package com.spartacusrex.spartacuside.helper;

import com.sun.tools.javac.jvm.ByteCodes;
import com.sun.tools.javac.util.Position;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.BitSet;

public class ParseUtil {
    static final boolean $assertionsDisabled = false;
    static BitSet encodedInPath;

    static {
        BitSet bitSet = new BitSet(256);
        encodedInPath = bitSet;
        bitSet.set(61);
        encodedInPath.set(59);
        encodedInPath.set(63);
        encodedInPath.set(47);
        encodedInPath.set(35);
        encodedInPath.set(32);
        encodedInPath.set(60);
        encodedInPath.set(62);
        encodedInPath.set(37);
        encodedInPath.set(34);
        encodedInPath.set(ByteCodes.lshr);
        encodedInPath.set(ByteCodes.lushr);
        encodedInPath.set(ByteCodes.iushr);
        encodedInPath.set(92);
        encodedInPath.set(94);
        encodedInPath.set(91);
        encodedInPath.set(93);
        encodedInPath.set(96);
        for (int i = 0; i < 32; i++) {
            encodedInPath.set(i);
        }
        encodedInPath.set(127);
    }

    public static URL fileToEncodedURL(File file) throws MalformedURLException {
        String path = encodePath(file.getAbsolutePath());
        if (!path.startsWith("/")) {
            path = "/" + path;
        }
        if (!path.endsWith("/") && file.isDirectory()) {
            path = path + "/";
        }
        return new URL("file", "", path);
    }

    public static String encodePath(String path) {
        return encodePath(path, true);
    }

    public static String encodePath(String path, boolean flag) {
        char[] retCC = new char[(path.length() * 2) + 16];
        int retLen = 0;
        char[] pathCC = path.toCharArray();
        int n = path.length();
        for (int i = 0; i < n; i++) {
            char c = pathCC[i];
            if ((!flag && c == '/') || (flag && c == File.separatorChar)) {
                retCC[retLen] = '/';
                retLen++;
            } else if (c <= 127) {
                if ((c < 'a' || c > 'z') && ((c < 'A' || c > 'Z') && ((c < '0' || c > '9') && encodedInPath.get(c)))) {
                    retLen = escape(retCC, c, retLen);
                } else {
                    retCC[retLen] = c;
                    retLen++;
                }
            } else if (c > 2047) {
                retLen = escape(retCC, (char) (((c >> 0) & 63) | 128), escape(retCC, (char) (((c >> 6) & 63) | 128), escape(retCC, (char) (((c >> '\f') & 15) | 224), retLen)));
            } else {
                retLen = escape(retCC, (char) (((c >> 0) & 63) | 128), escape(retCC, (char) (((c >> 6) & 31) | ByteCodes.checkcast), retLen));
            }
            if (retLen + 9 > retCC.length) {
                int newLen = (retCC.length * 2) + 16;
                if (newLen < 0) {
                    newLen = Position.MAXPOS;
                }
                char[] buf = new char[newLen];
                System.arraycopy(retCC, 0, buf, 0, retLen);
                retCC = buf;
            }
        }
        return new String(retCC, 0, retLen);
    }

    private static int escape(char[] cc, char c, int index) {
        int index2 = index + 1;
        cc[index] = '%';
        int index3 = index2 + 1;
        cc[index2] = Character.forDigit((c >> 4) & 15, 16);
        int index4 = index3 + 1;
        cc[index3] = Character.forDigit(c & 15, 16);
        return index4;
    }

    private static byte unescape(String s, int i) {
        return (byte) Integer.parseInt(s.substring(i + 1, i + 3), 16);
    }

    public static String decode(String s) {
        int n = s.length();
        if (n == 0 || s.indexOf(37) < 0) {
            return s;
        }
        StringBuilder sb = new StringBuilder(n);
        ByteBuffer bb = ByteBuffer.allocate(n);
        CharBuffer cb = CharBuffer.allocate(n);
        CharsetDecoder dec = ThreadLocalCoders.decoderFor("UTF-8").onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
        char c = s.charAt(0);
        int i = 0;
        while (i < n) {
            if (c != '%') {
                sb.append(c);
                i++;
                if (i >= n) {
                    break;
                }
                c = s.charAt(i);
            } else {
                bb.clear();
                do {
                    try {
                        bb.put(unescape(s, i));
                        i += 3;
                        if (i >= n) {
                            break;
                        }
                        c = s.charAt(i);
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException();
                    }
                } while (c == '%');
                bb.flip();
                cb.clear();
                dec.reset();
                CoderResult cr = dec.decode(bb, cb, true);
                if (cr.isError()) {
                    throw new IllegalArgumentException("Error decoding percent encoded characters");
                }
                CoderResult cr2 = dec.flush(cb);
                if (cr2.isError()) {
                    throw new IllegalArgumentException("Error decoding percent encoded characters");
                }
                sb.append(cb.flip().toString());
            }
        }
        return sb.toString();
    }

    public static class ThreadLocalCoders {
        private static final int CACHE_SIZE = 3;
        private static Cache decoderCache;
        private static Cache encoderCache;

        private static abstract class Cache {
            private ThreadLocal cache = new ThreadLocal();
            private final int size;

            abstract Object create(Object obj);

            abstract boolean hasName(Object obj, Object obj2);

            Cache(int size) {
                this.size = size;
            }

            private void moveToFront(Object[] oa, int i) {
                Object ob = oa[i];
                for (int j = i; j > 0; j--) {
                    oa[j] = oa[j - 1];
                }
                oa[0] = ob;
            }

            Object forName(Object name) {
                Object[] oa = (Object[]) this.cache.get();
                if (oa == null) {
                    oa = new Object[this.size];
                    this.cache.set(oa);
                } else {
                    for (int i = 0; i < oa.length; i++) {
                        Object ob = oa[i];
                        if (ob != null && hasName(ob, name)) {
                            if (i > 0) {
                                moveToFront(oa, i);
                            }
                            return ob;
                        }
                    }
                }
                Object ob2 = create(name);
                oa[oa.length - 1] = ob2;
                moveToFront(oa, oa.length - 1);
                return ob2;
            }
        }

        static {
            int i = 3;
            decoderCache = new Cache(i) {
                static final boolean $assertionsDisabled = false;

                @Override
                boolean hasName(Object ob, Object name) {
                    if (name instanceof String) {
                        return ((CharsetDecoder) ob).charset().name().equals(name);
                    }
                    if (name instanceof Charset) {
                        return ((CharsetDecoder) ob).charset().equals(name);
                    }
                    return false;
                }

                @Override
                Object create(Object name) {
                    if (name instanceof String) {
                        return Charset.forName((String) name).newDecoder();
                    }
                    if (name instanceof Charset) {
                        return ((Charset) name).newDecoder();
                    }
                    return null;
                }
            };
            encoderCache = new Cache(i) {
                static final boolean $assertionsDisabled = false;

                @Override
                boolean hasName(Object ob, Object name) {
                    if (name instanceof String) {
                        return ((CharsetEncoder) ob).charset().name().equals(name);
                    }
                    if (name instanceof Charset) {
                        return ((CharsetEncoder) ob).charset().equals(name);
                    }
                    return false;
                }

                @Override
                Object create(Object name) {
                    if (name instanceof String) {
                        return Charset.forName((String) name).newEncoder();
                    }
                    if (name instanceof Charset) {
                        return ((Charset) name).newEncoder();
                    }
                    return null;
                }
            };
        }

        public static CharsetDecoder decoderFor(Object name) {
            CharsetDecoder cd = (CharsetDecoder) decoderCache.forName(name);
            cd.reset();
            return cd;
        }

        public static CharsetEncoder encoderFor(Object name) {
            CharsetEncoder ce = (CharsetEncoder) encoderCache.forName(name);
            ce.reset();
            return ce;
        }
    }
}
