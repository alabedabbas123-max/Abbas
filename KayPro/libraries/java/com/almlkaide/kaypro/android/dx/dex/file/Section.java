package com.almlkaide.kaypro.android.dx.dex.file;

import com.baidu.mobstat.Config;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import java.util.Collection;
import org.apache.commons.io.IOUtils;

public abstract class Section {
    private final int alignment;
    private final DexFile file;
    private int fileOffset;
    private final String name;
    private boolean prepared;

    public abstract int getAbsoluteItemOffset(Item item);

    public abstract Collection<? extends Item> items();

    protected abstract void prepare0();

    public abstract int writeSize();

    protected abstract void writeTo0(AnnotatedOutput annotatedOutput);

    public static void validateAlignment(int i) {
        if (i <= 0 || ((i - 1) & i) != 0) {
            throw new IllegalArgumentException("invalid alignment");
        }
    }

    public Section(String str, DexFile dexFile, int i) {
        if (dexFile == null) {
            throw new NullPointerException("file == null");
        }
        validateAlignment(i);
        this.name = str;
        this.file = dexFile;
        this.alignment = i;
        this.fileOffset = -1;
        this.prepared = false;
    }

    public final DexFile getFile() {
        return this.file;
    }

    public final int getAlignment() {
        return this.alignment;
    }

    public final int getFileOffset() {
        if (this.fileOffset < 0) {
            throw new RuntimeException("fileOffset not set");
        }
        return this.fileOffset;
    }

    public final int setFileOffset(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("fileOffset < 0");
        }
        if (this.fileOffset >= 0) {
            throw new RuntimeException("fileOffset already set");
        }
        int i2 = this.alignment - 1;
        int i3 = (i2 ^ (-1)) & (i + i2);
        this.fileOffset = i3;
        return i3;
    }

    public final void writeTo(AnnotatedOutput annotatedOutput) {
        throwIfNotPrepared();
        align(annotatedOutput);
        int cursor = annotatedOutput.getCursor();
        if (this.fileOffset < 0) {
            this.fileOffset = cursor;
        } else if (this.fileOffset != cursor) {
            throw new RuntimeException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("alignment mismatch: for ").append(this).toString()).append(", at ").toString()).append(cursor).toString()).append(", but expected ").toString()).append(this.fileOffset).toString());
        }
        if (annotatedOutput.annotates()) {
            if (this.name != null) {
                annotatedOutput.annotate(0, new StringBuffer().append(new StringBuffer().append(IOUtils.LINE_SEPARATOR_UNIX).append(this.name).toString()).append(Config.TRACE_TODAY_VISIT_SPLIT).toString());
            } else if (cursor != 0) {
                annotatedOutput.annotate(0, IOUtils.LINE_SEPARATOR_UNIX);
            }
        }
        writeTo0(annotatedOutput);
    }

    public final int getAbsoluteOffset(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("relative < 0");
        }
        if (this.fileOffset < 0) {
            throw new RuntimeException("fileOffset not yet set");
        }
        return this.fileOffset + i;
    }

    public final void prepare() {
        throwIfPrepared();
        prepare0();
        this.prepared = true;
    }

    protected final void throwIfNotPrepared() {
        if (!this.prepared) {
            throw new RuntimeException("not prepared");
        }
    }

    protected final void throwIfPrepared() {
        if (this.prepared) {
            throw new RuntimeException("already prepared");
        }
    }

    protected final void align(AnnotatedOutput annotatedOutput) {
        annotatedOutput.alignTo(this.alignment);
    }

    protected final String getName() {
        return this.name;
    }
}
