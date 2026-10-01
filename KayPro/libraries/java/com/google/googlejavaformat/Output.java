package com.google.googlejavaformat;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.Range;

public abstract class Output extends InputOutput {
    public abstract void append(String str, Range<Integer> range);

    public abstract void blankLine(int i, OpsBuilder.BlankLineWanted blankLineWanted);

    public abstract CommentsHelper getCommentsHelper();

    public abstract void indent(int i);

    public abstract void markForPartialFormat(Input.Token token, Input.Token token2);

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).m93add("super", super.toString()).toString();
    }

    public static final class BreakTag {
        Optional<Boolean> taken = Optional.absent();

        public void recordBroken(boolean broken) {
            this.taken = Optional.m95of(Boolean.valueOf(broken));
        }

        public boolean wasBreakTaken() {
            return this.taken.mo78or(false).booleanValue();
        }
    }
}
