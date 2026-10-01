package com.myopicmobile.textwarrior.common;

import java.util.List;
import java.util.Vector;

public class TextBuffer implements CharSequence {
    protected static final int MIN_GAP_SIZE = 50;
    private int _allocMultiplier;
    private TextBufferCache _cache;
    protected char[] _contents = new char[51];
    protected int _gapEndIndex;
    protected int _gapStartIndex;
    protected int _lineCount;
    protected List<Pair> _spans;
    private UndoStack _undoStack;

    public TextBuffer() {
        this._contents[50] = Language.f4831EOF;
        this._allocMultiplier = 1;
        this._gapStartIndex = 0;
        this._gapEndIndex = 50;
        this._lineCount = 1;
        this._cache = new TextBufferCache();
        this._undoStack = new UndoStack(this);
    }

    private int countNewlines(int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            if (this._contents[i4] == '\n') {
                i3++;
            }
        }
        return i3;
    }

    private int findCharOffset(int i, int i2, int i3) {
        int iLogicalToRealIndex = logicalToRealIndex(i3);
        TextWarriorException.assertVerbose(isValid(i3), "findCharOffsetBackward: Invalid startingOffset given");
        int i4 = i2;
        while (i4 < i && iLogicalToRealIndex < this._contents.length) {
            if (this._contents[iLogicalToRealIndex] == '\n') {
                i4++;
            }
            iLogicalToRealIndex++;
            if (iLogicalToRealIndex == this._gapStartIndex) {
                iLogicalToRealIndex = this._gapEndIndex;
            }
        }
        if (i4 != i) {
            return -1;
        }
        return realToLogicalIndex(iLogicalToRealIndex);
    }

    private int findCharOffsetBackward(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        TextWarriorException.assertVerbose(isValid(i3), "findCharOffsetBackward: Invalid startOffset given");
        int iLogicalToRealIndex = logicalToRealIndex(i3);
        while (i2 > i - 1 && iLogicalToRealIndex >= 0) {
            if (iLogicalToRealIndex == this._gapEndIndex) {
                iLogicalToRealIndex = this._gapStartIndex;
            }
            iLogicalToRealIndex--;
            if (this._contents[iLogicalToRealIndex] == '\n') {
                i2--;
            }
        }
        if (iLogicalToRealIndex >= 0) {
            return realToLogicalIndex(iLogicalToRealIndex) + 1;
        }
        TextWarriorException.assertVerbose(false, "findCharOffsetBackward: Invalid cache entry or line arguments");
        return -1;
    }

    public static int memoryNeeded(int i) {
        long j = i + 50 + 1;
        if (j < Integer.MAX_VALUE) {
            return (int) j;
        }
        return -1;
    }

    public void beginBatchEdit() {
        this._undoStack.beginBatchEdit();
    }

    public boolean canRedo() {
        return this._undoStack.canRedo();
    }

    public boolean canUndo() {
        return this._undoStack.canUndo();
    }

    @Override
    public synchronized char charAt(int i) {
        return this._contents[logicalToRealIndex(i)];
    }

    public void clearSpans() {
        this._spans = new Vector();
        this._spans.add(new Pair(0, 0));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021 A[Catch: all -> 0x002a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0008, B:7:0x000e, B:9:0x0014, B:15:0x0021, B:12:0x001a, B:20:0x002d, B:22:0x003d), top: B:24:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x002d A[Catch: all -> 0x002a, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0008, B:7:0x000e, B:9:0x0014, B:15:0x0021, B:12:0x001a, B:20:0x002d, B:22:0x003d), top: B:24:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x003d A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0008, B:7:0x000e, B:9:0x0014, B:15:0x0021, B:12:0x001a, B:20:0x002d, B:22:0x003d), top: B:24:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x000e A[Catch: all -> 0x002a, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0008, B:7:0x000e, B:9:0x0014, B:15:0x0021, B:12:0x001a, B:20:0x002d, B:22:0x003d), top: B:24:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0014 A[Catch: all -> 0x002a, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0008, B:7:0x000e, B:9:0x0014, B:15:0x0021, B:12:0x001a, B:20:0x002d, B:22:0x003d), top: B:24:0x0003 }] */
    public synchronized void delete(int i, int i2, long j, boolean z) {
        int i3;
        int i4;
        if (z) {
            this._undoStack.captureDelete(i, i2, j);
            i3 = i + i2;
            if (i3 != this._gapStartIndex) {
                if (isBeforeGap(i3)) {
                    shiftGapLeft(i3);
                } else {
                    shiftGapRight(i3 + gapSize());
                }
            }
            for (i4 = 0; i4 < i2; i4++) {
                this._gapStartIndex--;
                if (this._contents[this._gapStartIndex] == '\n') {
                    this._lineCount--;
                }
            }
            this._cache.invalidateCache(i);
        } else {
            i3 = i + i2;
            if (i3 != this._gapStartIndex) {
                if (isBeforeGap(i3)) {
                    shiftGapLeft(i3);
                } else {
                    shiftGapRight(i3 + gapSize());
                }
            }
            while (i4 < i2) {
                this._gapStartIndex--;
                if (this._contents[this._gapStartIndex] == '\n') {
                    this._lineCount--;
                }
            }
            this._cache.invalidateCache(i);
        }
        throw th;
    }

    public void endBatchEdit() {
        this._undoStack.endBatchEdit();
    }

    public synchronized int findLineNumber(int i) {
        int iRealToLogicalIndex;
        int i2;
        int i3 = -1;
        synchronized (this) {
            if (isValid(i)) {
                Pair nearestCharOffset = this._cache.getNearestCharOffset(i);
                int first = nearestCharOffset.getFirst();
                int iLogicalToRealIndex = logicalToRealIndex(nearestCharOffset.getSecond());
                int iLogicalToRealIndex2 = logicalToRealIndex(i);
                if (iLogicalToRealIndex2 > iLogicalToRealIndex) {
                    iRealToLogicalIndex = -1;
                    i2 = -1;
                    while (iLogicalToRealIndex < iLogicalToRealIndex2 && iLogicalToRealIndex < this._contents.length) {
                        if (this._contents[iLogicalToRealIndex] == '\n') {
                            int i4 = first + 1;
                            iRealToLogicalIndex = realToLogicalIndex(iLogicalToRealIndex) + 1;
                            i2 = i4;
                            first = i4;
                        } else {
                            first = first;
                        }
                        iLogicalToRealIndex++;
                        if (iLogicalToRealIndex == this._gapStartIndex) {
                            iLogicalToRealIndex = this._gapEndIndex;
                        }
                    }
                } else if (iLogicalToRealIndex2 < iLogicalToRealIndex) {
                    iRealToLogicalIndex = -1;
                    i2 = -1;
                    while (iLogicalToRealIndex > iLogicalToRealIndex2 && iLogicalToRealIndex > 0) {
                        if (iLogicalToRealIndex == this._gapEndIndex) {
                            iLogicalToRealIndex = this._gapStartIndex;
                        }
                        iLogicalToRealIndex--;
                        if (this._contents[iLogicalToRealIndex] == '\n') {
                            iRealToLogicalIndex = realToLogicalIndex(iLogicalToRealIndex) + 1;
                            i2 = first;
                            first--;
                        }
                    }
                } else {
                    iRealToLogicalIndex = -1;
                    i2 = -1;
                }
                if (iLogicalToRealIndex == iLogicalToRealIndex2) {
                    if (i2 != -1) {
                        this._cache.updateEntry(i2, iRealToLogicalIndex);
                    }
                    i3 = first;
                }
            }
        }
        return i3;
    }

    protected final int gapSize() {
        return this._gapEndIndex - this._gapStartIndex;
    }

    char[] gapSubSequence(int i) {
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = this._contents[this._gapStartIndex + i2];
        }
        return cArr;
    }

    public synchronized String getLine(int i) {
        int lineOffset;
        lineOffset = getLineOffset(i);
        return lineOffset < 0 ? new String() : subSequence(lineOffset, getLineSize(i)).toString();
    }

    public synchronized int getLineCount() {
        return this._lineCount;
    }

    public synchronized int getLineOffset(int i) {
        int second;
        if (i < 0) {
            second = -1;
        } else {
            Pair nearestLine = this._cache.getNearestLine(i);
            int first = nearestLine.getFirst();
            second = nearestLine.getSecond();
            if (i > first) {
                second = findCharOffset(i, first, second);
            } else if (i < first) {
                second = findCharOffsetBackward(i, first, second);
            }
            if (second >= 0) {
                this._cache.updateEntry(i, second);
            }
        }
        return second;
    }

    public synchronized int getLineSize(int i) {
        int i2;
        i2 = 0;
        int lineOffset = getLineOffset(i);
        if (lineOffset != -1) {
            int iLogicalToRealIndex = logicalToRealIndex(lineOffset);
            int i3 = 0;
            while (this._contents[iLogicalToRealIndex] != '\n' && this._contents[iLogicalToRealIndex] != 65535) {
                i3++;
                int i4 = iLogicalToRealIndex + 1;
                iLogicalToRealIndex = i4 == this._gapStartIndex ? this._gapEndIndex : i4;
            }
            i2 = i3 + 1;
        }
        return i2;
    }

    public List<Pair> getSpans() {
        return this._spans;
    }

    public final synchronized int getTextLength() {
        return this._contents.length - gapSize();
    }

    protected void growBufferBy(int i) {
        int i2 = i + (this._allocMultiplier * 50);
        char[] cArr = new char[this._contents.length + i2];
        for (int i3 = 0; i3 < this._gapStartIndex; i3++) {
            cArr[i3] = this._contents[i3];
        }
        for (int i4 = this._gapEndIndex; i4 < this._contents.length; i4++) {
            cArr[i4 + i2] = this._contents[i4];
        }
        this._gapEndIndex += i2;
        this._contents = cArr;
        this._allocMultiplier <<= 1;
    }

    protected void initGap(int i) {
        int length = this._contents.length - 1;
        int i2 = length - 1;
        this._contents[length] = Language.f4831EOF;
        int i3 = i - 1;
        int i4 = i2;
        while (i3 >= 0) {
            this._contents[i4] = this._contents[i3];
            i3--;
            i4--;
        }
        this._gapStartIndex = 0;
        this._gapEndIndex = i4 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0021 A[Catch: all -> 0x0039, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0009, B:7:0x0011, B:9:0x0017, B:19:0x0035, B:10:0x001a, B:12:0x0021, B:14:0x002b, B:16:0x002e, B:24:0x003c, B:26:0x0042, B:27:0x0048), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0035 A[Catch: all -> 0x0039, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0009, B:7:0x0011, B:9:0x0017, B:19:0x0035, B:10:0x001a, B:12:0x0021, B:14:0x002b, B:16:0x002e, B:24:0x003c, B:26:0x0042, B:27:0x0048), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x003c A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0009, B:7:0x0011, B:9:0x0017, B:19:0x0035, B:10:0x001a, B:12:0x0021, B:14:0x002b, B:16:0x002e, B:24:0x003c, B:26:0x0042, B:27:0x0048), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0042 A[Catch: all -> 0x0039, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0009, B:7:0x0011, B:9:0x0017, B:19:0x0035, B:10:0x001a, B:12:0x0021, B:14:0x002b, B:16:0x002e, B:24:0x003c, B:26:0x0042, B:27:0x0048), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0011 A[Catch: all -> 0x0039, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0009, B:7:0x0011, B:9:0x0017, B:19:0x0035, B:10:0x001a, B:12:0x0021, B:14:0x002b, B:16:0x002e, B:24:0x003c, B:26:0x0042, B:27:0x0048), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0017 A[Catch: all -> 0x0039, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0009, B:7:0x0011, B:9:0x0017, B:19:0x0035, B:10:0x001a, B:12:0x0021, B:14:0x002b, B:16:0x002e, B:24:0x003c, B:26:0x0042, B:27:0x0048), top: B:29:0x0003 }] */
    public synchronized void insert(char[] cArr, int i, long j, boolean z) {
        int iLogicalToRealIndex;
        int i2;
        if (z) {
            this._undoStack.captureInsert(i, cArr.length, j);
            iLogicalToRealIndex = logicalToRealIndex(i);
            if (iLogicalToRealIndex != this._gapEndIndex) {
                if (isBeforeGap(iLogicalToRealIndex)) {
                    shiftGapLeft(iLogicalToRealIndex);
                } else {
                    shiftGapRight(iLogicalToRealIndex);
                }
            }
            if (cArr.length >= gapSize()) {
                growBufferBy(cArr.length - gapSize());
            }
            for (i2 = 0; i2 < cArr.length; i2++) {
                if (cArr[i2] == '\n') {
                    this._lineCount++;
                }
                this._contents[this._gapStartIndex] = cArr[i2];
                this._gapStartIndex++;
            }
            this._cache.invalidateCache(i);
        } else {
            iLogicalToRealIndex = logicalToRealIndex(i);
            if (iLogicalToRealIndex != this._gapEndIndex) {
                if (isBeforeGap(iLogicalToRealIndex)) {
                    shiftGapLeft(iLogicalToRealIndex);
                } else {
                    shiftGapRight(iLogicalToRealIndex);
                }
            }
            if (cArr.length >= gapSize()) {
                growBufferBy(cArr.length - gapSize());
            }
            while (i2 < cArr.length) {
                if (cArr[i2] == '\n') {
                    this._lineCount++;
                }
                this._contents[this._gapStartIndex] = cArr[i2];
                this._gapStartIndex++;
            }
            this._cache.invalidateCache(i);
        }
        throw th;
    }

    public boolean isBatchEdit() {
        return this._undoStack.isBatchEdit();
    }

    protected final boolean isBeforeGap(int i) {
        return i < this._gapStartIndex;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0009  */
    public final synchronized boolean isValid(int i) {
        boolean z;
        if (i < 0) {
            z = false;
        } else if (i >= getTextLength()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    @Override
    public int length() {
        return getTextLength();
    }

    protected final int logicalToRealIndex(int i) {
        return isBeforeGap(i) ? i : i + gapSize();
    }

    protected final int realToLogicalIndex(int i) {
        return isBeforeGap(i) ? i : i - gapSize();
    }

    public int redo() {
        return this._undoStack.redo();
    }

    public synchronized void setBuffer(char[] cArr) {
        int i = 1;
        int length = cArr.length;
        for (char c : cArr) {
            if (c == '\n') {
                i++;
            }
        }
        setBuffer(cArr, length, i);
    }

    public synchronized void setBuffer(char[] cArr, int i, int i2) {
        this._contents = cArr;
        initGap(i);
        this._lineCount = i2;
        this._allocMultiplier = 1;
    }

    public void setSpans(List<Pair> list) {
        this._spans = list;
    }

    protected final void shiftGapLeft(int i) {
        while (this._gapStartIndex > i) {
            this._gapEndIndex--;
            this._gapStartIndex--;
            this._contents[this._gapEndIndex] = this._contents[this._gapStartIndex];
        }
    }

    protected final void shiftGapRight(int i) {
        while (this._gapEndIndex < i) {
            this._contents[this._gapStartIndex] = this._contents[this._gapEndIndex];
            this._gapStartIndex++;
            this._gapEndIndex++;
        }
    }

    synchronized void shiftGapStart(int i) {
        try {
            if (i >= 0) {
                this._lineCount += countNewlines(this._gapStartIndex, i);
            } else {
                this._lineCount -= countNewlines(this._gapStartIndex + i, -i);
            }
            this._gapStartIndex += i;
            this._cache.invalidateCache(realToLogicalIndex(this._gapStartIndex - 1) + 1);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public synchronized CharSequence subSequence(int i, int i2) {
        String str;
        if (!isValid(i) || i2 <= 0) {
            str = new String();
        } else {
            if (i + i2 > getTextLength()) {
                i2 = getTextLength() - i;
            }
            int iLogicalToRealIndex = logicalToRealIndex(i);
            char[] cArr = new char[i2];
            int i3 = 0;
            while (i3 < i2) {
                cArr[i3] = this._contents[iLogicalToRealIndex];
                int i4 = iLogicalToRealIndex + 1;
                if (i4 == this._gapStartIndex) {
                    i4 = this._gapEndIndex;
                }
                i3++;
                iLogicalToRealIndex = i4;
            }
            str = new String(cArr);
        }
        return str;
    }

    @Override
    public String toString() {
        int textLength = getTextLength();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < textLength; i++) {
            char cCharAt = charAt(i);
            if (cCharAt == 65535) {
                break;
            }
            stringBuffer.append(cCharAt);
        }
        return new String(stringBuffer);
    }

    public int undo() {
        return this._undoStack.undo();
    }
}
