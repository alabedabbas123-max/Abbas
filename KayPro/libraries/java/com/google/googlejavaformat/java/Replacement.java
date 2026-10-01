package com.google.googlejavaformat.java;

import com.google.common.collect.Range;
import java.util.Objects;

public class Replacement {
    private final Range<Integer> replaceRange;
    private final String replacementString;

    Replacement(Range<Integer> replaceRange, String replacementString) {
        if (replaceRange == null) {
            throw new NullPointerException("Null replaceRange");
        }
        this.replaceRange = replaceRange;
        if (replacementString == null) {
            throw new NullPointerException("Null replacementString");
        }
        this.replacementString = replacementString;
    }

    public static Replacement create(int startPosition, int endPosition, String replaceWith) {
        return new Replacement(Range.closedOpen(Integer.valueOf(startPosition), Integer.valueOf(endPosition)), replaceWith);
    }

    public static Replacement create(Range<Integer> range, String replaceWith) {
        return new Replacement(range, replaceWith);
    }

    public Range<Integer> getReplaceRange() {
        return this.replaceRange;
    }

    public String getReplacementString() {
        return this.replacementString;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Replacement)) {
            return false;
        }
        Replacement that = (Replacement) o;
        return this.replaceRange.equals(that.getReplaceRange()) && this.replacementString.equals(that.getReplacementString());
    }

    public int hashCode() {
        return Objects.hash(this.replaceRange, this.replacementString);
    }
}
