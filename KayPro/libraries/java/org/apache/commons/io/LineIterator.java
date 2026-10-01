package org.apache.commons.io;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LineIterator implements Iterator<String>, Closeable {
    private final BufferedReader bufferedReader;
    private String cachedLine;
    private boolean finished = false;

    public LineIterator(Reader reader) throws IllegalArgumentException {
        if (reader == null) {
            throw new IllegalArgumentException("Reader must not be null");
        }
        if (reader instanceof BufferedReader) {
            this.bufferedReader = (BufferedReader) reader;
        } else {
            this.bufferedReader = new BufferedReader(reader);
        }
    }

    @Deprecated
    public static void closeQuietly(LineIterator lineIterator) {
        if (lineIterator != null) {
            try {
                lineIterator.close();
            } catch (IOException e) {
            }
        }
    }

    @Override
    public void close() throws IOException {
        this.finished = true;
        this.cachedLine = null;
        if (this.bufferedReader != null) {
            this.bufferedReader.close();
        }
    }

    @Override
    public boolean hasNext() {
        String line;
        boolean z = false;
        if (this.cachedLine != null) {
            return true;
        }
        if (this.finished) {
            return false;
        }
        do {
            try {
                line = this.bufferedReader.readLine();
                if (line == null) {
                    this.finished = true;
                }
                return z;
            } catch (IOException e) {
                try {
                    close();
                } catch (IOException e2) {
                    e.addSuppressed(e2);
                }
                throw new IllegalStateException(e);
            }
        } while (!isValidLine(line));
        this.cachedLine = line;
        z = true;
        return z;
    }

    protected boolean isValidLine(String str) {
        return true;
    }

    @Override
    public String next() {
        return nextLine();
    }

    public String nextLine() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more lines");
        }
        String str = this.cachedLine;
        this.cachedLine = null;
        return str;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove unsupported on LineIterator");
    }
}
