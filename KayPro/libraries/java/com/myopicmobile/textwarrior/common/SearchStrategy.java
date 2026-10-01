package com.myopicmobile.textwarrior.common;

public interface SearchStrategy {
    int find(DocumentProvider documentProvider, String str, int i, int i2, boolean z, boolean z2);

    int findBackwards(DocumentProvider documentProvider, String str, int i, int i2, boolean z, boolean z2);

    int getProgress();

    Pair replaceAll(DocumentProvider documentProvider, String str, String str2, int i, boolean z, boolean z2);

    int wrappedFind(DocumentProvider documentProvider, String str, int i, boolean z, boolean z2);

    int wrappedFindBackwards(DocumentProvider documentProvider, String str, int i, boolean z, boolean z2);
}
