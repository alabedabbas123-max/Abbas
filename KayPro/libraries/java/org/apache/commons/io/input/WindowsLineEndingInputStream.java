package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

public class WindowsLineEndingInputStream extends InputStream {
    private final boolean ensureLineFeedAtEndOfFile;
    private final InputStream target;
    private boolean slashRSeen = false;
    private boolean slashNSeen = false;
    private boolean injectSlashN = false;
    private boolean eofSeen = false;

    public WindowsLineEndingInputStream(InputStream inputStream, boolean z) {
        this.target = inputStream;
        this.ensureLineFeedAtEndOfFile = z;
    }

    private int eofGame() {
        if (!this.ensureLineFeedAtEndOfFile) {
            return -1;
        }
        if (!this.slashNSeen && !this.slashRSeen) {
            this.slashRSeen = true;
            return 13;
        }
        if (this.slashNSeen) {
            return -1;
        }
        this.slashRSeen = false;
        this.slashNSeen = true;
        return 10;
    }

    private int readWithUpdate() throws IOException {
        int i = this.target.read();
        this.eofSeen = i == -1;
        if (!this.eofSeen) {
            this.slashRSeen = i == 13;
            this.slashNSeen = i == 10;
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
            throw new UnsupportedOperationException("Mark not supported");
        }
    }

    @Override
    public int read() throws IOException {
        if (this.eofSeen) {
            return eofGame();
        }
        if (this.injectSlashN) {
            this.injectSlashN = false;
            return 10;
        }
        boolean z = this.slashRSeen;
        int withUpdate = readWithUpdate();
        if (this.eofSeen) {
            return eofGame();
        }
        if (withUpdate != 10 || z) {
            return withUpdate;
        }
        this.injectSlashN = true;
        return 13;
    }
}
