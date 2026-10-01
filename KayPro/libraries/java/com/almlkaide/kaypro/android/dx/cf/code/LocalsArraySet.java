package com.almlkaide.kaypro.android.dx.cf.code;

import com.almlkaide.kaypro.android.dex.util.ExceptionWithContext;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeBearer;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.util.ArrayList;

public class LocalsArraySet extends LocalsArray {
    private final OneLocalsArray primary;
    private final ArrayList<LocalsArray> secondaries;

    @Override
    public LocalsArray merge(LocalsArray localsArray) {
        return merge(localsArray);
    }

    public LocalsArraySet(int i) {
        super(i != 0);
        this.primary = new OneLocalsArray(i);
        this.secondaries = new ArrayList<>();
    }

    public LocalsArraySet(OneLocalsArray oneLocalsArray, ArrayList<LocalsArray> arrayList) {
        super(oneLocalsArray.getMaxLocals() > 0);
        this.primary = oneLocalsArray;
        this.secondaries = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocalsArraySet(LocalsArraySet localsArraySet) {
        super(localsArraySet.getMaxLocals() > 0);
        this.primary = localsArraySet.primary.copy();
        this.secondaries = new ArrayList<>(localsArraySet.secondaries.size());
        int size = localsArraySet.secondaries.size();
        for (int i = 0; i < size; i++) {
            LocalsArray localsArray = localsArraySet.secondaries.get(i);
            if (localsArray == null) {
                this.secondaries.add((LocalsArray) null);
            } else {
                this.secondaries.add(localsArray.copy());
            }
        }
    }

    @Override
    public void setImmutable() {
        this.primary.setImmutable();
        for (LocalsArray localsArray : this.secondaries) {
            if (localsArray != null) {
                localsArray.setImmutable();
            }
        }
        super.setImmutable();
    }

    @Override
    public LocalsArray copy() {
        return new LocalsArraySet(this);
    }

    @Override
    public void annotate(ExceptionWithContext exceptionWithContext) {
        exceptionWithContext.addContext("(locals array set; primary)");
        this.primary.annotate(exceptionWithContext);
        int size = this.secondaries.size();
        for (int i = 0; i < size; i++) {
            LocalsArray localsArray = this.secondaries.get(i);
            if (localsArray != null) {
                exceptionWithContext.addContext(new StringBuffer().append(new StringBuffer().append("(locals array set: primary for caller ").append(Hex.m7225u2(i)).toString()).append(')').toString());
                localsArray.getPrimary().annotate(exceptionWithContext);
            }
        }
    }

    @Override
    public String toHuman() {
        StringBuilder sb = new StringBuilder();
        sb.append("(locals array set; primary)\n");
        sb.append(getPrimary().toHuman());
        sb.append('\n');
        int size = this.secondaries.size();
        for (int i = 0; i < size; i++) {
            LocalsArray localsArray = this.secondaries.get(i);
            if (localsArray != null) {
                sb.append(new StringBuffer().append(new StringBuffer().append("(locals array set: primary for caller ").append(Hex.m7225u2(i)).toString()).append(")\n").toString());
                sb.append(localsArray.getPrimary().toHuman());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    @Override
    public void makeInitialized(Type type) {
        if (this.primary.getMaxLocals() != 0) {
            throwIfImmutable();
            this.primary.makeInitialized(type);
            for (LocalsArray localsArray : this.secondaries) {
                if (localsArray != null) {
                    localsArray.makeInitialized(type);
                }
            }
        }
    }

    @Override
    public int getMaxLocals() {
        return this.primary.getMaxLocals();
    }

    @Override
    public void mo7133set(int i, TypeBearer typeBearer) {
        throwIfImmutable();
        this.primary.mo7133set(i, typeBearer);
        for (LocalsArray localsArray : this.secondaries) {
            if (localsArray != null) {
                localsArray.mo7133set(i, typeBearer);
            }
        }
    }

    @Override
    public void mo7134set(RegisterSpec registerSpec) {
        mo7133set(registerSpec.getReg(), registerSpec);
    }

    @Override
    public void invalidate(int i) {
        throwIfImmutable();
        this.primary.invalidate(i);
        for (LocalsArray localsArray : this.secondaries) {
            if (localsArray != null) {
                localsArray.invalidate(i);
            }
        }
    }

    @Override
    public TypeBearer getOrNull(int i) {
        return this.primary.getOrNull(i);
    }

    @Override
    public TypeBearer mo7132get(int i) {
        return this.primary.mo7132get(i);
    }

    @Override
    public TypeBearer getCategory1(int i) {
        return this.primary.getCategory1(i);
    }

    @Override
    public TypeBearer getCategory2(int i) {
        return this.primary.getCategory2(i);
    }

    private LocalsArraySet mergeWithSet(LocalsArraySet localsArraySet) {
        OneLocalsArray oneLocalsArrayMerge = this.primary.merge(localsArraySet.getPrimary());
        int size = this.secondaries.size();
        int size2 = localsArraySet.secondaries.size();
        int iMax = Math.max(size, size2);
        ArrayList arrayList = new ArrayList(iMax);
        int i = 0;
        boolean z = false;
        while (i < iMax) {
            LocalsArray localsArray = i < size ? this.secondaries.get(i) : (LocalsArray) null;
            LocalsArray localsArrayMerge = i < size2 ? localsArraySet.secondaries.get(i) : (LocalsArray) null;
            LocalsArray localsArray2 = (LocalsArray) null;
            if (localsArray == localsArrayMerge) {
                localsArrayMerge = localsArray;
            } else if (localsArray != null) {
                if (localsArrayMerge == null) {
                    localsArrayMerge = localsArray;
                } else {
                    try {
                        localsArrayMerge = localsArray.merge(localsArrayMerge);
                    } catch (SimException e) {
                        e.addContext(new StringBuffer().append("Merging locals set for caller block ").append(Hex.m7225u2(i)).toString());
                        localsArrayMerge = localsArray2;
                    }
                }
            }
            boolean z2 = z || localsArray != localsArrayMerge;
            arrayList.add(localsArrayMerge);
            i++;
            z = z2;
        }
        return (this.primary != oneLocalsArrayMerge || z) ? new LocalsArraySet(oneLocalsArrayMerge, arrayList) : this;
    }

    private LocalsArraySet mergeWithOne(OneLocalsArray oneLocalsArray) {
        OneLocalsArray oneLocalsArrayMerge = this.primary.merge(oneLocalsArray.getPrimary());
        ArrayList arrayList = new ArrayList(this.secondaries.size());
        int size = this.secondaries.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            LocalsArray localsArray = this.secondaries.get(i);
            LocalsArray localsArrayMerge = (LocalsArray) null;
            if (localsArray != null) {
                try {
                    localsArrayMerge = localsArray.merge(oneLocalsArray);
                } catch (SimException e) {
                    e.addContext(new StringBuffer().append("Merging one locals against caller block ").append(Hex.m7225u2(i)).toString());
                }
            }
            boolean z2 = z || localsArray != localsArrayMerge;
            arrayList.add(localsArrayMerge);
            i++;
            z = z2;
        }
        return (this.primary != oneLocalsArrayMerge || z) ? new LocalsArraySet(oneLocalsArrayMerge, arrayList) : this;
    }

    @Override
    public LocalsArraySet merge(LocalsArray localsArray) {
        LocalsArraySet localsArraySetMergeWithOne;
        try {
            if (localsArray instanceof LocalsArraySet) {
                localsArraySetMergeWithOne = mergeWithSet((LocalsArraySet) localsArray);
            } else {
                localsArraySetMergeWithOne = mergeWithOne((OneLocalsArray) localsArray);
            }
            localsArraySetMergeWithOne.setImmutable();
            return localsArraySetMergeWithOne;
        } catch (SimException e) {
            e.addContext("underlay locals:");
            annotate(e);
            e.addContext("overlay locals:");
            localsArray.annotate(e);
            throw e;
        }
    }

    private LocalsArray getSecondaryForLabel(int i) {
        return i >= this.secondaries.size() ? (LocalsArray) null : this.secondaries.get(i);
    }

    @Override
    public LocalsArraySet mergeWithSubroutineCaller(LocalsArray localsArray, int i) {
        LocalsArray localsArrayMerge;
        LocalsArray localsArray2;
        OneLocalsArray oneLocalsArrayMerge;
        LocalsArray secondaryForLabel = getSecondaryForLabel(i);
        OneLocalsArray oneLocalsArrayMerge2 = this.primary.merge(localsArray.getPrimary());
        if (secondaryForLabel == localsArray) {
            localsArrayMerge = secondaryForLabel;
        } else {
            localsArrayMerge = secondaryForLabel == null ? localsArray : secondaryForLabel.merge(localsArray);
        }
        if (localsArrayMerge != secondaryForLabel || oneLocalsArrayMerge2 != this.primary) {
            int size = this.secondaries.size();
            int iMax = Math.max(i + 1, size);
            ArrayList arrayList = new ArrayList(iMax);
            int i2 = 0;
            OneLocalsArray oneLocalsArray = (OneLocalsArray) null;
            while (i2 < iMax) {
                LocalsArray localsArray3 = (LocalsArray) null;
                if (i2 == i) {
                    localsArray2 = localsArrayMerge;
                } else {
                    localsArray2 = i2 < size ? this.secondaries.get(i2) : localsArray3;
                }
                if (localsArray2 == null) {
                    oneLocalsArrayMerge = oneLocalsArray;
                } else if (oneLocalsArray == null) {
                    oneLocalsArrayMerge = localsArray2.getPrimary();
                } else {
                    oneLocalsArrayMerge = oneLocalsArray.merge(localsArray2.getPrimary());
                }
                arrayList.add(localsArray2);
                i2++;
                oneLocalsArray = oneLocalsArrayMerge;
            }
            LocalsArraySet localsArraySet = new LocalsArraySet(oneLocalsArray, arrayList);
            localsArraySet.setImmutable();
            return localsArraySet;
        }
        return this;
    }

    public LocalsArray subArrayForLabel(int i) {
        return getSecondaryForLabel(i);
    }

    @Override
    protected OneLocalsArray getPrimary() {
        return this.primary;
    }
}
