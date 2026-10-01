package com.google.googlejavaformat;

import com.google.common.base.MoreObjects;

public abstract class Indent {
    abstract int eval();

    public static final class Const extends Indent {
        public static final Const ZERO = new Const(0);

        private final int f243n;

        private Const(int n) {
            this.f243n = n;
        }

        public static Const make(int n, int indentMultiplier) {
            return new Const(n * indentMultiplier);
        }

        @Override
        int eval() {
            return this.f243n;
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).m91add("n", this.f243n).toString();
        }
    }

    public static final class C0531If extends Indent {
        private final Output.BreakTag condition;
        private final Indent elseIndent;
        private final Indent thenIndent;

        private C0531If(Output.BreakTag condition, Indent thenIndent, Indent elseIndent) {
            this.condition = condition;
            this.thenIndent = thenIndent;
            this.elseIndent = elseIndent;
        }

        public static C0531If make(Output.BreakTag condition, Indent thenIndent, Indent elseIndent) {
            return new C0531If(condition, thenIndent, elseIndent);
        }

        @Override
        int eval() {
            return (this.condition.wasBreakTaken() ? this.thenIndent : this.elseIndent).eval();
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).m93add("condition", this.condition).m93add("thenIndent", this.thenIndent).m93add("elseIndent", this.elseIndent).toString();
        }
    }
}
