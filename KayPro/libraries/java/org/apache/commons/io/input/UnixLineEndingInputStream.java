package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

public class UnixLineEndingInputStream extends InputStream {
    private final boolean ensureLineFeedAtEndOfFile;
    private final InputStream target;
    private boolean slashNSeen = false;
    private boolean slashRSeen = false;
    private boolean eofSeen = false;

    public UnixLineEndingInputStream(InputStream inputStream, boolean z) {
        this.target = inputStream;
        this.ensureLineFeedAtEndOfFile = z;
    }

    private int eofGame(boolean z) {
        if (z || !this.ensureLineFeedAtEndOfFile || this.slashNSeen) {
            return -1;
        }
        this.slashNSeen = true;
        return 10;
    }

    private int readWithUpdate() throws IOException {
        int i = this.target.read();
        this.eofSeen = i == -1;
        if (!this.eofSeen) {
            this.slashNSeen = i == 10;
            this.slashRSeen = i == 13;
        }
        return i;
    }

    @Override
    public void close() throws IOException {
        super.close();
        this.target.close();
    }

    @Override
    public void mark(int i) {
        synchronized (this) {
            throw new UnsupportedOperationException("Mark notsupported");
        }
    }

    @Override
    public int read() throws IOException {
        boolean z = this.slashRSeen;
        if (this.eofSeen) {
            return eofGame(z);
        }
        int withUpdate = readWithUpdate();
        if (this.eofSeen) {
            return eofGame(z);
        }
        if (this.slashRSeen) {
            return 10;
        }
        return (z && this.slashNSeen) ? read() : withUpdate;
    }
}
