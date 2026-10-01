package com.myopicmobile.textwarrior.common;

public class LinearSearchStrategy implements SearchStrategy {
    private int _unitsDone = 0;

    protected boolean equals(DocumentProvider documentProvider, String str, int i, boolean z) {
        if (documentProvider.docLength() - i < str.length()) {
            return false;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (z && str.charAt(i2) != documentProvider.charAt(i2 + i)) {
                return false;
            }
            if (!z && Character.toLowerCase(str.charAt(i2)) != Character.toLowerCase(documentProvider.charAt(i2 + i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int find(DocumentProvider documentProvider, String str, int i, int i2, boolean z, boolean z2) {
        if (str.length() == 0) {
            return -1;
        }
        if (i < 0) {
            TextWarriorException.fail("TextBuffer.find: Invalid start position");
            i = 0;
        }
        if (i2 > documentProvider.docLength()) {
            TextWarriorException.fail("TextBuffer.find: Invalid end position");
            i2 = documentProvider.docLength();
        }
        int iMin = Math.min(i2, (documentProvider.docLength() - str.length()) + 1);
        int i3 = i;
        while (i3 < iMin && (!equals(documentProvider, str, i3, z) || (z2 && !isSandwichedByWhitespace(documentProvider, i3, str.length())))) {
            i3++;
            this._unitsDone++;
        }
        if (i3 < iMin) {
            return i3;
        }
        return -1;
    }

    @Override
    public int findBackwards(DocumentProvider documentProvider, String str, int i, int i2, boolean z, boolean z2) {
        if (str.length() == 0) {
            return -1;
        }
        if (i >= documentProvider.docLength()) {
            TextWarriorException.fail("Invalid start position given to TextBuffer.find");
            i = documentProvider.docLength() - 1;
        }
        if (i2 < -1) {
            TextWarriorException.fail("Invalid end position given to TextBuffer.find");
            i2 = -1;
        }
        int iMin = Math.min(i, documentProvider.docLength() - str.length());
        while (iMin > i2 && (!equals(documentProvider, str, iMin, z) || (z2 && !isSandwichedByWhitespace(documentProvider, iMin, str.length())))) {
            iMin--;
        }
        if (iMin > i2) {
            return iMin;
        }
        return -1;
    }

    @Override
    public int getProgress() {
        return this._unitsDone;
    }

    protected boolean isSandwichedByWhitespace(DocumentProvider documentProvider, int i, int i2) {
        Language language = Lexer.getLanguage();
        int i3 = i + i2;
        return (i == 0 ? true : language.isWhitespace(documentProvider.charAt(i + (-1)))) && (i3 == documentProvider.docLength() ? true : language.isWhitespace(documentProvider.charAt(i3)));
    }

    @Override
    public Pair replaceAll(DocumentProvider documentProvider, String str, String str2, int i, boolean z, boolean z2) {
        this._unitsDone = 0;
        char[] charArray = str2.toCharArray();
        int iFind = find(documentProvider, str, 0, documentProvider.docLength(), z, z2);
        long jNanoTime = System.nanoTime();
        documentProvider.beginBatchEdit();
        int length = i;
        int i2 = 0;
        while (iFind != -1) {
            documentProvider.deleteAt(iFind, str.length(), jNanoTime);
            documentProvider.insertBefore(charArray, iFind, jNanoTime);
            if (iFind < length) {
                length += str2.length() - str.length();
            }
            this._unitsDone += str.length();
            iFind = find(documentProvider, str, iFind + str2.length(), documentProvider.docLength(), z, z2);
            length = length;
            i2++;
        }
        documentProvider.endBatchEdit();
        return new Pair(i2, Math.max(length, 0));
    }

    @Override
    public int wrappedFind(DocumentProvider documentProvider, String str, int i, boolean z, boolean z2) {
        int iFind = find(documentProvider, str, i, documentProvider.docLength(), z, z2);
        return iFind < 0 ? find(documentProvider, str, 0, i, z, z2) : iFind;
    }

    @Override
    public int wrappedFindBackwards(DocumentProvider documentProvider, String str, int i, boolean z, boolean z2) {
        int iFindBackwards = findBackwards(documentProvider, str, i, -1, z, z2);
        return iFindBackwards < 0 ? findBackwards(documentProvider, str, documentProvider.docLength() - 1, i, z, z2) : iFindBackwards;
    }
}
