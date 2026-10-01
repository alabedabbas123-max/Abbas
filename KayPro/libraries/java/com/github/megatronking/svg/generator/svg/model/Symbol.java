package com.github.megatronking.svg.generator.svg.model;

public class Symbol extends G {
    public boolean isInUse;
    public float[] viewBox;

    @Override
    public boolean isValid() {
        return this.isInUse;
    }
}
