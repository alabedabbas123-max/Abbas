package com.myopicmobile.textwarrior.common;

import java.util.List;

public class DocumentProvider implements CharSequence {
    private int _currIndex = 0;
    private final Document _theText;

    public DocumentProvider(Document.TextFieldMetrics textFieldMetrics) {
        this._theText = new Document(textFieldMetrics);
    }

    public DocumentProvider(Document document) {
        this._theText = document;
    }

    public DocumentProvider(DocumentProvider documentProvider) {
        this._theText = documentProvider._theText;
    }

    public void analyzeWordWrap() {
        this._theText.analyzeWordWrap();
    }

    public void beginBatchEdit() {
        this._theText.beginBatchEdit();
    }

    public boolean canRedo() {
        return this._theText.canRedo();
    }

    public boolean canUndo() {
        return this._theText.canUndo();
    }

    @Override
    public char charAt(int i) {
        if (this._theText.isValid(i)) {
            return this._theText.charAt(i);
        }
        return (char) 0;
    }

    public void clearSpans() {
        this._theText.clearSpans();
    }

    public void deleteAt(int i, int i2, long j) {
        if (!this._theText.isValid(i) || i2 <= 0) {
            return;
        }
        this._theText.delete(i, Math.min(i2, this._theText.getTextLength() - i), j, true);
    }

    public void deleteAt(int i, long j) {
        if (this._theText.isValid(i)) {
            this._theText.delete(i, 1, j, true);
        }
    }

    public int docLength() {
        return this._theText.getTextLength();
    }

    public void endBatchEdit() {
        this._theText.endBatchEdit();
    }

    public int findLineNumber(int i) {
        return this._theText.findLineNumber(i);
    }

    public int findRowNumber(int i) {
        return this._theText.findRowNumber(i);
    }

    public int getLineOffset(int i) {
        return this._theText.getLineOffset(i);
    }

    public String getRow(int i) {
        return this._theText.getRow(i);
    }

    public int getRowCount() {
        return this._theText.getRowCount();
    }

    public int getRowOffset(int i) {
        return this._theText.getRowOffset(i);
    }

    public int getRowSize(int i) {
        return this._theText.getRowSize(i);
    }

    public List<Pair> getSpans() {
        return this._theText.getSpans();
    }

    public boolean hasNext() {
        return this._currIndex >= 0 && this._currIndex < this._theText.getTextLength();
    }

    public void insert(int i, CharSequence charSequence) {
        this._theText.insert(new char[]{charSequence.charAt(0)}, i, System.nanoTime(), true);
    }

    public void insertBefore(char c, int i, long j) {
        if (this._theText.isValid(i)) {
            this._theText.insert(new char[]{c}, i, j, true);
        }
    }

    public void insertBefore(char[] cArr, int i, long j) {
        if (!this._theText.isValid(i) || cArr.length == 0) {
            return;
        }
        this._theText.insert(cArr, i, j, true);
    }

    public boolean isBatchEdit() {
        return this._theText.isBatchEdit();
    }

    public boolean isWordWrap() {
        return this._theText.isWordWrap();
    }

    @Override
    public int length() {
        return this._theText.length();
    }

    public char next() {
        char cCharAt = this._theText.charAt(this._currIndex);
        this._currIndex++;
        return cCharAt;
    }

    public int redo() {
        return this._theText.redo();
    }

    public int seekChar(int i) {
        if (this._theText.isValid(i)) {
            this._currIndex = i;
        } else {
            this._currIndex = -1;
        }
        return this._currIndex;
    }

    public void setMetrics(Document.TextFieldMetrics textFieldMetrics) {
        this._theText.setMetrics(textFieldMetrics);
    }

    public void setSpans(List<Pair> list) {
        this._theText.setSpans(list);
    }

    public void setWordWrap(boolean z) {
        this._theText.setWordWrap(z);
    }

    @Override
    public CharSequence subSequence(int i, int i2) {
        return this._theText.subSequence(i, i2);
    }

    @Override
    public String toString() {
        return this._theText.toString();
    }

    public int undo() {
        return this._theText.undo();
    }
}
