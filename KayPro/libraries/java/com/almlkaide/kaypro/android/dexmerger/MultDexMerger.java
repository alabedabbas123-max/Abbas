package com.almlkaide.kaypro.android.dexmerger;

import com.almlkaide.kaypro.android.dex.Dex;
import com.almlkaide.kaypro.android.dex.DexIndexOverflowException;
import com.almlkaide.kaypro.android.dx.command.dexer.DxContext;
import com.almlkaide.kaypro.android.dx.merge.CollisionPolicy;
import com.almlkaide.kaypro.android.dx.merge.DexMerger;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MultDexMerger {
    private static final int COMPACT_WASTE_THRESHOLD = 1048576;
    private final DxContext mContext;
    private final Parameter mParameter;

    public MultDexMerger(DxContext dxContext, Parameter parameter) {
        this.mContext = dxContext;
        this.mParameter = parameter;
    }

    public List<Dex> merger() throws IOException {
        ArrayList arrayList = new ArrayList();
        mergerTo(arrayList);
        return arrayList;
    }

    public void mergerTo(List<Dex> list) throws IOException {
        List<List<Dex>> groupDexs = this.mParameter.getGroupDexs();
        for (int i = 0; list != null && groupDexs != null && i < groupDexs.size(); i++) {
            list.add(merger((Dex[]) groupDexs.get(i).toArray(new Dex[0])));
        }
    }

    public Dex merger(Dex... c1679DexArr) throws IOException {
        DexMerger dexMerger = new DexMerger(c1679DexArr, this.mParameter.getCollisionPolicy(), this.mContext);
        dexMerger.setCompactWasteThreshold(this.mParameter.getCompactWasteThreshold());
        return dexMerger.merge();
    }

    public DxContext getContext() {
        return this.mContext;
    }

    public static class Parameter {
        private CollisionPolicy mCollisionPolicy = CollisionPolicy.KEEP_FIRST;
        private int mCompactWasteThreshold = 1048576;
        private List<List<Dex>> mGroupDexs;

        public Parameter setGroupDexs(List<List<Dex>> list) {
            this.mGroupDexs = list;
            return this;
        }

        public List<List<Dex>> getGroupDexs() {
            return this.mGroupDexs;
        }

        public Parameter setCollisionPolicy(CollisionPolicy collisionPolicy) {
            this.mCollisionPolicy = collisionPolicy;
            return this;
        }

        public CollisionPolicy getCollisionPolicy() {
            return this.mCollisionPolicy;
        }

        public Parameter setCompactWasteThreshold(int i) {
            this.mCompactWasteThreshold = i;
            return this;
        }

        public int getCompactWasteThreshold() {
            return this.mCompactWasteThreshold;
        }
    }

    public static class Builder {
        private CollisionPolicy mCollisionPolicy;
        private int mCompactWasteThreshold;
        private List<Dex> mDexs;
        private final DxContext mDxContext;
        private int mMaxIndex;

        public Builder() {
            this(new DxContext());
        }

        public Builder(DxContext dxContext) {
            this.mDexs = new ArrayList();
            this.mCollisionPolicy = CollisionPolicy.KEEP_FIRST;
            this.mCompactWasteThreshold = 1048576;
            this.mMaxIndex = 65535;
            this.mDxContext = dxContext;
        }

        public void setDexs(List<Dex> list) {
            this.mDexs = list;
        }

        public List<Dex> getDexs() {
            return this.mDexs;
        }

        public Builder m7106add(Dex c1679Dex) {
            if (c1679Dex != null) {
                this.mDexs.add(c1679Dex);
            }
            return this;
        }

        public Builder m7109add(Dex... c1679DexArr) {
            for (int i = 0; c1679DexArr != null && i < c1679DexArr.length; i++) {
                m7106add(c1679DexArr[i]);
            }
            return this;
        }

        public Builder m7107add(File file) throws IOException {
            return m7106add(new Dex(file));
        }

        public Builder m7110add(File... fileArr) throws IOException {
            for (int i = 0; fileArr != null && i < fileArr.length; i++) {
                m7107add(fileArr[i]);
            }
            return this;
        }

        public Builder m7108add(String str) throws IOException {
            return m7107add(new File(str));
        }

        public Builder m7111add(String... strArr) throws IOException {
            for (int i = 0; strArr != null && i < strArr.length; i++) {
                m7108add(strArr[i]);
            }
            return this;
        }

        public Builder setCollisionPolicy(CollisionPolicy collisionPolicy) {
            if (collisionPolicy == null) {
                throw new IllegalArgumentException("collisionPolicy is null");
            }
            this.mCollisionPolicy = collisionPolicy;
            return this;
        }

        public CollisionPolicy getCollisionPolicy() {
            return this.mCollisionPolicy;
        }

        public Builder setCompactWasteThreshold(int i) {
            this.mCompactWasteThreshold = i;
            return this;
        }

        public void setMaxIndex(int i) {
            if (i < 0 || i > 65535) {
                throw new DexIndexOverflowException(new StringBuffer().append("type ID not in [0, 0xffff]: ").append(i).toString());
            }
            this.mMaxIndex = i;
        }

        public Builder clear() {
            this.mDexs.clear();
            return this;
        }

        public Builder builder() {
            return this;
        }

        public MultDexMerger create() {
            ArrayList arrayList = new ArrayList();
            m7105add(arrayList, 0);
            print(arrayList);
            Parameter parameter = new Parameter();
            parameter.setGroupDexs(arrayList);
            parameter.setCollisionPolicy(this.mCollisionPolicy);
            parameter.setCompactWasteThreshold(this.mCompactWasteThreshold);
            return new MultDexMerger(this.mDxContext, parameter);
        }

        private void m7105add(List<List<Dex>> list, int i) {
            if (list != null && i >= 0 && i < this.mDexs.size()) {
                ArrayList arrayList = new ArrayList();
                int i2 = i;
                int size = 0;
                int size2 = 0;
                int size3 = 0;
                int size4 = 0;
                int i3 = i;
                while (i2 < this.mDexs.size()) {
                    Dex c1679Dex = this.mDexs.get(i2);
                    size4 += c1679Dex.fieldIds().size();
                    size3 += c1679Dex.methodIds().size();
                    size2 += c1679Dex.typeIds().size();
                    size += c1679Dex.protoIds().size();
                    if (!isIndexOverflow(size4, size3, size2, size)) {
                        i3++;
                        arrayList.add(c1679Dex);
                    }
                    i2++;
                    i3 = i3;
                }
                list.add(arrayList);
                m7105add(list, i3);
            }
        }

        private boolean isIndexOverflow(int... iArr) {
            for (int i = 0; iArr != null && i < iArr.length; i++) {
                if (iArr[i] > this.mMaxIndex) {
                    return true;
                }
            }
            return false;
        }

        private void print(List<List<Dex>> list) {
            this.mDxContext.f5014out.println(new StringBuffer().append("group size:").append(list.size()).toString());
            for (int i = 0; i < list.size(); i++) {
                List<Dex> list2 = list.get(i);
                Iterator<Dex> it = list2.iterator();
                int size = 0;
                while (it.hasNext()) {
                    size = it.next().methodIds().size() + size;
                }
                this.mDxContext.f5014out.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("[").append(i).toString()).append("] size:").toString()).append(list2.size()).toString()).append(", method=").toString()).append(size).toString());
            }
        }
    }
}
