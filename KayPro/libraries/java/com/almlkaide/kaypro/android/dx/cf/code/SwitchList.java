package com.almlkaide.kaypro.android.dx.cf.code;

import com.almlkaide.kaypro.android.dx.util.IntList;
import com.almlkaide.kaypro.android.dx.util.MutabilityControl;

public final class SwitchList extends MutabilityControl {
    private int size;
    private final IntList targets;
    private final IntList values;

    public SwitchList(int i) {
        super(true);
        this.values = new IntList(i);
        this.targets = new IntList(i + 1);
        this.size = i;
    }

    @Override
    public void setImmutable() {
        this.values.setImmutable();
        this.targets.setImmutable();
        super.setImmutable();
    }

    public int size() {
        return this.size;
    }

    public int getValue(int i) {
        return this.values.m7231get(i);
    }

    public int getTarget(int i) {
        return this.targets.m7231get(i);
    }

    public int getDefaultTarget() {
        return this.targets.m7231get(this.size);
    }

    public IntList getTargets() {
        return this.targets;
    }

    public IntList getValues() {
        return this.values;
    }

    public void setDefaultTarget(int i) {
        throwIfImmutable();
        if (i < 0) {
            throw new IllegalArgumentException("target < 0");
        }
        if (this.targets.size() != this.size) {
            throw new RuntimeException("non-default elements not all set");
        }
        this.targets.m7230add(i);
    }

    public void m7136add(int i, int i2) {
        throwIfImmutable();
        if (i2 < 0) {
            throw new IllegalArgumentException("target < 0");
        }
        this.values.m7230add(i);
        this.targets.m7230add(i2);
    }

    public void removeSuperfluousDefaults() {
        throwIfImmutable();
        int i = this.size;
        if (i != this.targets.size() - 1) {
            throw new IllegalArgumentException("incomplete instance");
        }
        int iM7231get = this.targets.m7231get(i);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int iM7231get2 = this.targets.m7231get(i3);
            if (iM7231get2 != iM7231get) {
                if (i3 != i2) {
                    this.targets.m7234set(i2, iM7231get2);
                    this.values.m7234set(i2, this.values.m7231get(i3));
                }
                i2++;
            }
        }
        if (i2 != i) {
            this.values.shrink(i2);
            this.targets.m7234set(i2, iM7231get);
            this.targets.shrink(i2 + 1);
            this.size = i2;
        }
    }
}
