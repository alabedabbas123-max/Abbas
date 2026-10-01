package com.google.googlejavaformat.java.javadoc;

final class NestingCounter {
    private int value;

    NestingCounter() {
    }

    int value() {
        return this.value;
    }

    void increment() {
        this.value++;
    }

    void incrementIfPositive() {
        int i = this.value;
        if (i > 0) {
            this.value = i + 1;
        }
    }

    void decrementIfPositive() {
        int i = this.value;
        if (i > 0) {
            this.value = i - 1;
        }
    }

    boolean isPositive() {
        return this.value > 0;
    }

    void reset() {
        this.value = 0;
    }
}
