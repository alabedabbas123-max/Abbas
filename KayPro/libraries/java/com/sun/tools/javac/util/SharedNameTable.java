package com.sun.tools.javac.util;

import com.sun.tools.javac.code.Flags;
import java.lang.ref.SoftReference;

public class SharedNameTable extends Name.Table {
    private static List<SoftReference<SharedNameTable>> freelist = List.m507nil();
    public byte[] bytes;
    private int hashMask;
    private NameImpl[] hashes;

    private int f580nc;

    public static synchronized SharedNameTable create(Names names) {
        while (freelist.nonEmpty()) {
            SharedNameTable t = freelist.head.get();
            freelist = freelist.tail;
            if (t != null) {
                return t;
            }
        }
        return new SharedNameTable(names);
    }

    private static synchronized void dispose(SharedNameTable t) {
        freelist = freelist.prepend(new SoftReference<>(t));
    }

    public SharedNameTable(Names names, int hashSize, int nameSize) {
        super(names);
        this.f580nc = 0;
        this.hashMask = hashSize - 1;
        this.hashes = new NameImpl[hashSize];
        this.bytes = new byte[nameSize];
    }

    public SharedNameTable(Names names) {
        this(names, 32768, Flags.DEPRECATED);
    }

    @Override
    public Name fromChars(char[] cs, int start, int len) {
        int nc = this.f580nc;
        byte[] bytes = this.bytes;
        while ((len * 3) + nc >= bytes.length) {
            byte[] newnames = new byte[bytes.length * 2];
            System.arraycopy(bytes, 0, newnames, 0, bytes.length);
            this.bytes = newnames;
            bytes = newnames;
        }
        int nbytes = Convert.chars2utf(cs, start, bytes, nc, len) - nc;
        int h = hashValue(bytes, nc, nbytes) & this.hashMask;
        NameImpl n = this.hashes[h];
        while (n != null && (n.getByteLength() != nbytes || !equals(bytes, n.index, bytes, nc, nbytes))) {
            n = n.next;
        }
        if (n == null) {
            n = new NameImpl(this);
            n.index = nc;
            n.length = nbytes;
            n.next = this.hashes[h];
            this.hashes[h] = n;
            int i = nc + nbytes;
            this.f580nc = i;
            if (nbytes == 0) {
                this.f580nc = i + 1;
            }
        }
        return n;
    }

    @Override
    public Name fromUtf(byte[] cs, int start, int len) {
        int h = hashValue(cs, start, len) & this.hashMask;
        NameImpl n = this.hashes[h];
        byte[] names = this.bytes;
        while (n != null && (n.getByteLength() != len || !equals(names, n.index, cs, start, len))) {
            n = n.next;
        }
        if (n == null) {
            int nc = this.f580nc;
            while (nc + len > names.length) {
                byte[] newnames = new byte[names.length * 2];
                System.arraycopy(names, 0, newnames, 0, names.length);
                this.bytes = newnames;
                names = newnames;
            }
            System.arraycopy(cs, start, names, nc, len);
            n = new NameImpl(this);
            n.index = nc;
            n.length = len;
            n.next = this.hashes[h];
            this.hashes[h] = n;
            int i = nc + len;
            this.f580nc = i;
            if (len == 0) {
                this.f580nc = i + 1;
            }
        }
        return n;
    }

    @Override
    public void dispose() {
        dispose(this);
    }

    static class NameImpl extends Name {
        int index;
        int length;
        NameImpl next;

        NameImpl(SharedNameTable table) {
            super(table);
        }

        @Override
        public int getIndex() {
            return this.index;
        }

        @Override
        public int getByteLength() {
            return this.length;
        }

        @Override
        public byte getByteAt(int i) {
            return getByteArray()[this.index + i];
        }

        @Override
        public byte[] getByteArray() {
            return ((SharedNameTable) this.table).bytes;
        }

        @Override
        public int getByteOffset() {
            return this.index;
        }

        public int hashCode() {
            return this.index;
        }

        public boolean equals(Object other) {
            return (other instanceof Name) && this.table == ((Name) other).table && this.index == ((Name) other).getIndex();
        }
    }
}
