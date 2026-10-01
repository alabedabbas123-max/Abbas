package com.almlkaide.kaypro.android.multidex;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

class ArchivePathElement implements ClassPathElement {
    private final ZipFile archive;

    static class DirectoryEntryException extends IOException {
    }

    public ArchivePathElement(ZipFile zipFile) {
        this.archive = zipFile;
    }

    @Override
    public InputStream open(String str) throws IOException {
        ZipEntry entry = this.archive.getEntry(str);
        if (entry == null) {
            throw new FileNotFoundException(new StringBuffer().append(new StringBuffer().append("File \"").append(str).toString()).append("\" not found").toString());
        }
        if (entry.isDirectory()) {
            throw new DirectoryEntryException();
        }
        return this.archive.getInputStream(entry);
    }

    @Override
    public void close() throws IOException {
        this.archive.close();
    }

    @Override
    public Iterable<String> list() {
        return new AnonymousClass100000001(this);
    }

    class AnonymousClass100000001 implements Iterable<String> {
        private final ArchivePathElement this$0;

        AnonymousClass100000001(ArchivePathElement archivePathElement) {
            this.this$0 = archivePathElement;
        }

        @Override
        public Iterator<String> iterator() {
            return new Iterator<String>(this) {
                Enumeration<? extends ZipEntry> delegate;
                ZipEntry next = (ZipEntry) null;
                private final AnonymousClass100000001 this$0;

                {
                    this.this$0 = this;
                    this.delegate = this.this$0.this$0.archive.entries();
                }

                @Override
                public String next() {
                    return next2();
                }

                @Override
                public boolean hasNext() {
                    while (this.next == null && this.delegate.hasMoreElements()) {
                        this.next = this.delegate.nextElement();
                        if (this.next.isDirectory()) {
                            this.next = (ZipEntry) null;
                        }
                    }
                    return this.next != null;
                }

                @Override
                public String next2() {
                    if (hasNext()) {
                        String name = this.next.getName();
                        this.next = (ZipEntry) null;
                        return name;
                    }
                    throw new NoSuchElementException();
                }

                @Override
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
        }
    }
}
