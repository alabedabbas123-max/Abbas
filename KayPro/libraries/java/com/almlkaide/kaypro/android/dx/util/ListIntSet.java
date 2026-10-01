package com.almlkaide.kaypro.android.dx.util;

import java.util.NoSuchElementException;

public class ListIntSet implements IntSet {
    final IntList ints = new IntList();

    public ListIntSet() {
        this.ints.sort();
    }

    @Override
    public void mo7214add(int i) {
        int iBinarysearch = this.ints.binarysearch(i);
        if (iBinarysearch < 0) {
            this.ints.insert(-(iBinarysearch + 1), i);
        }
    }

    @Override
    public void remove(int i) {
        int iIndexOf = this.ints.indexOf(i);
        if (iIndexOf >= 0) {
            this.ints.removeIndex(iIndexOf);
        }
    }

    @Override
    public boolean mo7215has(int i) {
        return this.ints.indexOf(i) >= 0;
    }

    @Override
    public void merge(IntSet intSet) {
        if (intSet instanceof ListIntSet) {
            ListIntSet listIntSet = (ListIntSet) intSet;
            int size = this.ints.size();
            int size2 = listIntSet.ints.size();
            int i = 0;
            int i2 = 0;
            while (i < size2 && i2 < size) {
                while (i < size2 && listIntSet.ints.m7231get(i) < this.ints.m7231get(i2)) {
                    mo7214add(listIntSet.ints.m7231get(i));
                    i++;
                }
                if (i == size2) {
                    break;
                }
                int i3 = i2;
                while (i3 < size && listIntSet.ints.m7231get(i) >= this.ints.m7231get(i3)) {
                    i3++;
                }
                i2 = i3;
            }
            while (i < size2) {
                mo7214add(listIntSet.ints.m7231get(i));
                i++;
            }
            this.ints.sort();
            return;
        }
        if (intSet instanceof BitIntSet) {
            BitIntSet bitIntSet = (BitIntSet) intSet;
            for (int iFindFirst = 0; iFindFirst >= 0; iFindFirst = Bits.findFirst(bitIntSet.bits, iFindFirst + 1)) {
                this.ints.m7230add(iFindFirst);
            }
            this.ints.sort();
            return;
        }
        IntIterator it = intSet.iterator();
        while (it.hasNext()) {
            mo7214add(it.next());
        }
    }

    @Override
    public int elements() {
        return this.ints.size();
    }

    @Override
    public IntIterator iterator() {
        return new IntIterator(this) {

            private int f5087idx = 0;
            private final ListIntSet this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean hasNext() {
                return this.f5087idx < this.this$0.ints.size();
            }

            @Override
            public int next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                IntList intList = this.this$0.ints;
                int i = this.f5087idx;
                this.f5087idx = i + 1;
                return intList.m7231get(i);
            }
        };
    }

    public String toString() {
        return this.ints.toString();
    }
}
