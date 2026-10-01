package com.almlkaide.kaypro.android.dx.merge;

import com.almlkaide.kaypro.android.dex.Dex;
import com.almlkaide.kaypro.android.dex.ClassDef;
import com.almlkaide.kaypro.android.dex.DexException;
import java.util.Comparator;

final class SortableType {
    public static final Comparator<SortableType> NULLS_LAST_ORDER = new Comparator<SortableType>() {
        @Override
        public int compare(SortableType sortableType, SortableType sortableType2) {
            return compare2(sortableType, sortableType2);
        }

        public int compare2(SortableType sortableType, SortableType sortableType2) {
            if (sortableType == sortableType2) {
                return 0;
            }
            if (sortableType2 == null) {
                return -1;
            }
            if (sortableType == null) {
                return 1;
            }
            if (sortableType.depth != sortableType2.depth) {
                return sortableType.depth - sortableType2.depth;
            }
            return sortableType.getTypeIndex() - sortableType2.getTypeIndex();
        }
    };
    private final ClassDef classDef;
    private int depth = -1;

    private final Dex f5055dex;
    private final IndexMap indexMap;

    public SortableType(Dex c1679Dex, IndexMap indexMap, ClassDef classDef) {
        this.f5055dex = c1679Dex;
        this.indexMap = indexMap;
        this.classDef = classDef;
    }

    public Dex getDex() {
        return this.f5055dex;
    }

    public IndexMap getIndexMap() {
        return this.indexMap;
    }

    public ClassDef getClassDef() {
        return this.classDef;
    }

    public int getTypeIndex() {
        return this.classDef.getTypeIndex();
    }

    public boolean tryAssignDepth(SortableType[] sortableTypeArr) {
        int i;
        if (this.classDef.getSupertypeIndex() == -1) {
            i = 0;
        } else {
            if (this.classDef.getSupertypeIndex() == this.classDef.getTypeIndex()) {
                throw new DexException(new StringBuffer().append(new StringBuffer().append("Class with type index ").append(this.classDef.getTypeIndex()).toString()).append(" extends itself").toString());
            }
            SortableType sortableType = sortableTypeArr[this.classDef.getSupertypeIndex()];
            if (sortableType == null) {
                i = 1;
            } else {
                if (sortableType.depth == -1) {
                    return false;
                }
                i = sortableType.depth;
            }
        }
        int iMax = i;
        for (short s : this.classDef.getInterfaces()) {
            SortableType sortableType2 = sortableTypeArr[s];
            if (sortableType2 == null) {
                iMax = Math.max(iMax, 1);
            } else {
                if (sortableType2.depth == -1) {
                    return false;
                }
                iMax = Math.max(iMax, sortableType2.depth);
            }
        }
        this.depth = iMax + 1;
        return true;
    }

    public boolean isDepthAssigned() {
        return this.depth != -1;
    }
}
