package com.myopicmobile.textwarrior.common;

import java.util.ArrayList;

public class Document extends TextBuffer {
    private boolean _isWordWrap = false;
    private TextFieldMetrics _metrics;
    private ArrayList<Integer> _rowTable;

    public interface TextFieldMetrics {
        int getAdvance(char c);

        int getRowWidth();
    }

    public Document(TextFieldMetrics textFieldMetrics) {
        this._metrics = textFieldMetrics;
        resetRowTable();
    }

    private void adjustOffsetOfRowsFrom(int i, int i2) {
        while (i < this._rowTable.size()) {
            this._rowTable.set(i, new Integer(this._rowTable.get(i).intValue() + i2));
            i++;
        }
    }

    private void analyzeWordWrap(int i, int i2, int i3) {
        int i4;
        if (!this._isWordWrap) {
            int iLogicalToRealIndex = logicalToRealIndex(i2);
            int iLogicalToRealIndex2 = logicalToRealIndex(i3);
            ArrayList arrayList = new ArrayList();
            while (iLogicalToRealIndex < iLogicalToRealIndex2) {
                if (iLogicalToRealIndex == this._gapStartIndex) {
                    iLogicalToRealIndex = this._gapEndIndex;
                }
                if (this._contents[iLogicalToRealIndex] == '\n') {
                    arrayList.add(new Integer(realToLogicalIndex(iLogicalToRealIndex) + 1));
                }
                iLogicalToRealIndex++;
            }
            this._rowTable.addAll(i, arrayList);
            return;
        }
        if (!hasMinimumWidthForWordWrap()) {
            TextWarriorException.fail("Not enough space to do word wrap");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        int iLogicalToRealIndex3 = logicalToRealIndex(i2);
        int iLogicalToRealIndex4 = logicalToRealIndex(i3);
        int rowWidth = this._metrics.getRowWidth();
        int i5 = rowWidth;
        int advance = 0;
        int iRealToLogicalIndex = i2;
        while (iLogicalToRealIndex3 < iLogicalToRealIndex4) {
            int i6 = iLogicalToRealIndex3 == this._gapStartIndex ? this._gapEndIndex : iLogicalToRealIndex3;
            char c = this._contents[i6];
            advance += this._metrics.getAdvance(c);
            if (c == ' ' || c == '\t' || c == '\n' || c == 65535) {
                if (advance <= i5) {
                    i4 = i5 - advance;
                } else if (advance > rowWidth) {
                    int iLogicalToRealIndex5 = logicalToRealIndex(iRealToLogicalIndex);
                    if (iRealToLogicalIndex != i2 && (arrayList2.isEmpty() || iRealToLogicalIndex != ((Integer) arrayList2.get(arrayList2.size() - 1)).intValue())) {
                        arrayList2.add(new Integer(iRealToLogicalIndex));
                    }
                    int i7 = iLogicalToRealIndex5;
                    int i8 = rowWidth;
                    while (i7 <= i6) {
                        if (i7 == this._gapStartIndex) {
                            i7 = this._gapEndIndex;
                        }
                        int advance2 = this._metrics.getAdvance(this._contents[i7]);
                        if (advance2 > i8) {
                            arrayList2.add(new Integer(realToLogicalIndex(i7)));
                            i8 = rowWidth - advance2;
                        } else {
                            i8 -= advance2;
                        }
                        i7++;
                    }
                    i4 = i8;
                } else {
                    arrayList2.add(new Integer(iRealToLogicalIndex));
                    i4 = rowWidth - advance;
                }
                advance = 0;
                iRealToLogicalIndex = realToLogicalIndex(i6) + 1;
            } else {
                i4 = i5;
            }
            if (c == '\n') {
                arrayList2.add(new Integer(iRealToLogicalIndex));
                i5 = rowWidth;
            } else {
                i5 = i4;
            }
            iLogicalToRealIndex3 = i6 + 1;
        }
        this._rowTable.addAll(i, arrayList2);
    }

    private int findNextLineFrom(int i) {
        int iLogicalToRealIndex = logicalToRealIndex(i);
        while (iLogicalToRealIndex < this._contents.length) {
            if (iLogicalToRealIndex == this._gapStartIndex) {
                iLogicalToRealIndex = this._gapEndIndex;
            }
            if (this._contents[iLogicalToRealIndex] == '\n' || this._contents[iLogicalToRealIndex] == 65535) {
                break;
            }
            iLogicalToRealIndex++;
        }
        return realToLogicalIndex(iLogicalToRealIndex) + 1;
    }

    private boolean hasMinimumWidthForWordWrap() {
        return this._metrics.getRowWidth() >= this._metrics.getAdvance('M') * 2;
    }

    private void removeRowMetadata(int i, int i2) {
        while (i < this._rowTable.size() && this._rowTable.get(i).intValue() <= i2) {
            this._rowTable.remove(i);
        }
    }

    private void resetRowTable() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(new Integer(0));
        this._rowTable = arrayList;
    }

    private void updateWordWrapAfterEdit(int i, int i2, int i3) {
        if (i > 0) {
            i--;
        }
        int iIntValue = this._rowTable.get(i).intValue();
        removeRowMetadata(i + 1, i2 - i3);
        adjustOffsetOfRowsFrom(i + 1, i3);
        analyzeWordWrap(i + 1, iIntValue, i2);
    }

    public void analyzeWordWrap() {
        resetRowTable();
        if (!this._isWordWrap || hasMinimumWidthForWordWrap()) {
            analyzeWordWrap(1, 0, getTextLength());
        } else if (this._metrics.getRowWidth() > 0) {
            TextWarriorException.fail("Text field has non-zero width but still too small for word wrap");
        }
    }

    @Override
    public synchronized void delete(int i, int i2, long j, boolean z) {
        super.delete(i, i2, j, z);
        updateWordWrapAfterEdit(findRowNumber(i), findNextLineFrom(i), -i2);
    }

    public int findRowNumber(int i) {
        if (!isValid(i)) {
            return -1;
        }
        int i2 = 0;
        int size = this._rowTable.size() - 1;
        while (size >= i2) {
            int i3 = (i2 + size) / 2;
            int iIntValue = i3 + 1 < this._rowTable.size() ? this._rowTable.get(i3 + 1).intValue() : getTextLength();
            if (i >= this._rowTable.get(i3).intValue() && i < iIntValue) {
                return i3;
            }
            if (i >= iIntValue) {
                i2 = i3 + 1;
            } else {
                size = i3 - 1;
            }
        }
        return -1;
    }

    public String getRow(int i) {
        int rowSize = getRowSize(i);
        return rowSize == 0 ? new String() : subSequence(this._rowTable.get(i).intValue(), rowSize).toString();
    }

    public int getRowCount() {
        return this._rowTable.size();
    }

    public int getRowOffset(int i) {
        if (isInvalidRow(i)) {
            return -1;
        }
        return this._rowTable.get(i).intValue();
    }

    public int getRowSize(int i) {
        if (isInvalidRow(i)) {
            return 0;
        }
        return i != this._rowTable.size() + (-1) ? this._rowTable.get(i + 1).intValue() - this._rowTable.get(i).intValue() : getTextLength() - this._rowTable.get(i).intValue();
    }

    @Override
    public synchronized void insert(char[] cArr, int i, long j, boolean z) {
        super.insert(cArr, i, j, z);
        updateWordWrapAfterEdit(findRowNumber(i), findNextLineFrom(cArr.length + i), cArr.length);
    }

    protected boolean isInvalidRow(int i) {
        return i < 0 || i >= this._rowTable.size();
    }

    public boolean isWordWrap() {
        return this._isWordWrap;
    }

    public void setMetrics(TextFieldMetrics textFieldMetrics) {
        this._metrics = textFieldMetrics;
    }

    public void setText(CharSequence charSequence) {
        int i = 1;
        int length = charSequence.length();
        char[] cArr = new char[TextBuffer.memoryNeeded(length)];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = charSequence.charAt(i2);
            if (charSequence.charAt(i2) == '\n') {
                i++;
            }
        }
        setBuffer(cArr, length, i);
    }

    public void setWordWrap(boolean z) {
        if (z && !this._isWordWrap) {
            this._isWordWrap = true;
            analyzeWordWrap();
        } else {
            if (z || !this._isWordWrap) {
                return;
            }
            this._isWordWrap = false;
            analyzeWordWrap();
        }
    }

    @Override
    synchronized void shiftGapStart(int i) {
        super.shiftGapStart(i);
        if (i != 0) {
            updateWordWrapAfterEdit(findRowNumber(i > 0 ? this._gapStartIndex - i : this._gapStartIndex), findNextLineFrom(this._gapStartIndex), i);
        }
    }
}
