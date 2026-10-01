package com.almlkaide.kaypro.android.dx.util;

import java.util.NoSuchElementException;

public class BitIntSet implements IntSet {
    int[] bits;

    public BitIntSet(int i) {
        this.bits = Bits.makeBitSet(i);
    }

    @Override
    public void mo7214add(int i) {
        ensureCapacity(i);
        Bits.m7219set(this.bits, i, true);
    }

    private void ensureCapacity(int i) {
        if (i >= Bits.getMax(this.bits)) {
            int[] iArrMakeBitSet = Bits.makeBitSet(Math.max(i + 1, Bits.getMax(this.bits) * 2));
            System.arraycopy(this.bits, 0, iArrMakeBitSet, 0, this.bits.length);
            this.bits = iArrMakeBitSet;
        }
    }

    @Override
    public void remove(int i) {
        if (i < Bits.getMax(this.bits)) {
            Bits.m7219set(this.bits, i, false);
        }
    }

    @Override
    public boolean mo7215has(int i) {
        return i < Bits.getMax(this.bits) && Bits.m7216get(this.bits, i);
    }

    @Override
    public void merge(IntSet intSet) {
        if (intSet instanceof BitIntSet) {
            BitIntSet bitIntSet = (BitIntSet) intSet;
            ensureCapacity(Bits.getMax(bitIntSet.bits) + 1);
            Bits.m7217or(this.bits, bitIntSet.bits);
        } else {
            if (intSet instanceof ListIntSet) {
                ListIntSet listIntSet = (ListIntSet) intSet;
                int size = listIntSet.ints.size();
                if (size > 0) {
                    ensureCapacity(listIntSet.ints.m7231get(size - 1));
                }
                for (int i = 0; i < listIntSet.ints.size(); i++) {
                    Bits.m7219set(this.bits, listIntSet.ints.m7231get(i), true);
                }
                return;
            }
            IntIterator it = intSet.iterator();
            while (it.hasNext()) {
                mo7214add(it.next());
            }
        }
    }

    @Override
    public int elements() {
        return Bits.bitCount(this.bits);
    }

    @Override
    public IntIterator iterator() {
        return new IntIterator(this) {

            private int f5084idx;
            private final BitIntSet this$0;

            {
                this.this$0 = this;
                this.f5084idx = Bits.findFirst(this.this$0.bits, 0);
            }

            @Override
            public boolean hasNext() {
                return this.f5084idx >= 0;
            }

            @Override
            public int next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f5084idx;
                this.f5084idx = Bits.findFirst(this.this$0.bits, this.f5084idx + 1);
                return i;
            }
        };
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        int iFindFirst = Bits.findFirst(this.bits, 0);
        while (iFindFirst >= 0) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(iFindFirst);
            iFindFirst = Bits.findFirst(this.bits, iFindFirst + 1);
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
