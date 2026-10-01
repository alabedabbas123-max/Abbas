package com.google.googlejavaformat;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDoc {
    private static final Range<Integer> EMPTY_RANGE = Range.closedOpen(-1, -1);
    private static final DiscreteDomain<Integer> INTEGERS = DiscreteDomain.integers();
    private boolean widthComputed = false;
    private float width = 0.0f;
    private boolean flatComputed = false;
    private String flat = "";
    private boolean rangeComputed = false;
    private Range<Integer> range = EMPTY_RANGE;

    public enum FillMode {
        UNIFIED,
        INDEPENDENT,
        FORCED
    }

    public abstract State computeBreaks(CommentsHelper commentsHelper, int i, State state);

    abstract String computeFlat();

    abstract Range<Integer> computeRange();

    abstract float computeWidth();

    public abstract void write(Output output);

    public static final class State {
        final int column;
        final int indent;
        final int lastIndent;
        final boolean mustBreak;

        State(int lastIndent, int indent, int column, boolean mustBreak) {
            this.lastIndent = lastIndent;
            this.indent = indent;
            this.column = column;
            this.mustBreak = mustBreak;
        }

        public State(int indent0, int column0) {
            this(indent0, indent0, column0, false);
        }

        State withColumn(int column) {
            return new State(this.lastIndent, this.indent, column, this.mustBreak);
        }

        State withMustBreak(boolean mustBreak) {
            return new State(this.lastIndent, this.indent, this.column, mustBreak);
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).m91add("lastIndent", this.lastIndent).m91add("indent", this.indent).m91add("column", this.column).m94add("mustBreak", this.mustBreak).toString();
        }
    }

    final float getWidth() {
        if (!this.widthComputed) {
            this.width = computeWidth();
            this.widthComputed = true;
        }
        return this.width;
    }

    final String getFlat() {
        if (!this.flatComputed) {
            this.flat = computeFlat();
            this.flatComputed = true;
        }
        return this.flat;
    }

    final Range<Integer> range() {
        if (!this.rangeComputed) {
            this.range = computeRange();
            this.rangeComputed = true;
        }
        return this.range;
    }

    static final class Level extends AbstractDoc {
        private final Indent plusIndent;
        private final List<AbstractDoc> docs = new ArrayList();
        boolean oneLine = false;
        List<List<AbstractDoc>> splits = new ArrayList();
        List<Break> breaks = new ArrayList();

        private Level(Indent plusIndent) {
            this.plusIndent = plusIndent;
        }

        static Level make(Indent plusIndent) {
            return new Level(plusIndent);
        }

        void m440add(AbstractDoc doc) {
            this.docs.add(doc);
        }

        @Override
        float computeWidth() {
            float thisWidth = 0.0f;
            for (AbstractDoc doc : this.docs) {
                thisWidth += doc.getWidth();
            }
            return thisWidth;
        }

        @Override
        String computeFlat() {
            StringBuilder builder = new StringBuilder();
            for (AbstractDoc doc : this.docs) {
                builder.append(doc.getFlat());
            }
            return builder.toString();
        }

        @Override
        Range<Integer> computeRange() {
            Range<Integer> docRange = AbstractDoc.EMPTY_RANGE;
            for (AbstractDoc doc : this.docs) {
                docRange = union(docRange, doc.range());
            }
            return docRange;
        }

        @Override
        public State computeBreaks(CommentsHelper commentsHelper, int maxWidth, State state) {
            float thisWidth = getWidth();
            if (state.column + thisWidth <= maxWidth) {
                this.oneLine = true;
                return state.withColumn(state.column + ((int) thisWidth));
            }
            State broken = computeBroken(commentsHelper, maxWidth, new State(state.indent + this.plusIndent.eval(), state.column));
            return state.withColumn(broken.column);
        }

        private static void splitByBreaks(List<AbstractDoc> docs, List<List<AbstractDoc>> splits, List<Break> breaks) {
            splits.clear();
            breaks.clear();
            splits.add(new ArrayList());
            for (AbstractDoc doc : docs) {
                if (doc instanceof Break) {
                    breaks.add((Break) doc);
                    splits.add(new ArrayList());
                } else {
                    ((List) Iterables.getLast(splits)).add(doc);
                }
            }
        }

        private State computeBroken(CommentsHelper commentsHelper, int maxWidth, State state) {
            splitByBreaks(this.docs, this.splits, this.breaks);
            State state2 = computeBreakAndSplit(commentsHelper, maxWidth, state, Optional.absent(), this.splits.get(0));
            for (int i = 0; i < this.breaks.size(); i++) {
                state2 = computeBreakAndSplit(commentsHelper, maxWidth, state2, Optional.m95of(this.breaks.get(i)), this.splits.get(i + 1));
            }
            return state2;
        }

        private static State computeBreakAndSplit(CommentsHelper commentsHelper, int maxWidth, State state, Optional<Break> optBreakDoc, List<AbstractDoc> split) {
            float breakWidth = optBreakDoc.isPresent() ? optBreakDoc.mo75get().getWidth() : 0.0f;
            float splitWidth = getWidth(split);
            boolean shouldBreak = (optBreakDoc.isPresent() && optBreakDoc.mo75get().fillMode == FillMode.UNIFIED) || state.mustBreak || (((float) state.column) + breakWidth) + splitWidth > ((float) maxWidth);
            if (optBreakDoc.isPresent()) {
                state = optBreakDoc.mo75get().computeBreaks(state, state.lastIndent, shouldBreak);
            }
            boolean enoughRoom = ((float) state.column) + splitWidth <= ((float) maxWidth);
            State state2 = computeSplit(commentsHelper, maxWidth, split, state.withMustBreak(false));
            if (!enoughRoom) {
                return state2.withMustBreak(true);
            }
            return state2;
        }

        private static State computeSplit(CommentsHelper commentsHelper, int maxWidth, List<AbstractDoc> docs, State state) {
            for (AbstractDoc doc : docs) {
                state = doc.computeBreaks(commentsHelper, maxWidth, state);
            }
            return state;
        }

        @Override
        public void write(Output output) {
            if (this.oneLine) {
                output.append(getFlat(), range());
            } else {
                writeFilled(output);
            }
        }

        private void writeFilled(Output output) {
            for (AbstractDoc doc : this.splits.get(0)) {
                doc.write(output);
            }
            for (int i = 0; i < this.breaks.size(); i++) {
                this.breaks.get(i).write(output);
                for (AbstractDoc doc2 : this.splits.get(i + 1)) {
                    doc2.write(output);
                }
            }
        }

        static float getWidth(List<AbstractDoc> docs) {
            float width = 0.0f;
            for (AbstractDoc doc : docs) {
                width += doc.getWidth();
            }
            return width;
        }

        private static Range<Integer> union(Range<Integer> x, Range<Integer> y) {
            if (x.isEmpty()) {
                return y;
            }
            return y.isEmpty() ? x : x.span(y).canonical(AbstractDoc.INTEGERS);
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).m93add("plusIndent", this.plusIndent).m93add("docs", this.docs).toString();
        }
    }

    public static final class Token extends AbstractDoc implements InterfaceOp {
        private final Optional<Indent> breakAndIndentTrailingComment;
        private final Indent plusIndentCommentsBefore;
        private final RealOrImaginary realOrImaginary;
        private final Input.Token token;

        public enum RealOrImaginary {
            REAL,
            IMAGINARY;

            boolean isReal() {
                return this == REAL;
            }
        }

        private Token(Input.Token token, RealOrImaginary realOrImaginary, Indent plusIndentCommentsBefore, Optional<Indent> breakAndIndentTrailingComment) {
            this.token = token;
            this.realOrImaginary = realOrImaginary;
            this.plusIndentCommentsBefore = plusIndentCommentsBefore;
            this.breakAndIndentTrailingComment = breakAndIndentTrailingComment;
        }

        Indent getPlusIndentCommentsBefore() {
            return this.plusIndentCommentsBefore;
        }

        Optional<Indent> breakAndIndentTrailingComment() {
            return this.breakAndIndentTrailingComment;
        }

        static InterfaceOp make(Input.Token token, RealOrImaginary realOrImaginary, Indent plusIndentCommentsBefore, Optional<Indent> breakAndIndentTrailingComment) {
            return new Token(token, realOrImaginary, plusIndentCommentsBefore, breakAndIndentTrailingComment);
        }

        Input.Token getToken() {
            return this.token;
        }

        RealOrImaginary realOrImaginary() {
            return this.realOrImaginary;
        }

        @Override
        public void mo439add(DocBuilder builder) {
            builder.m441add(this);
        }

        @Override
        float computeWidth() {
            return this.token.getTok().length();
        }

        @Override
        String computeFlat() {
            return this.token.getTok().getOriginalText();
        }

        @Override
        Range<Integer> computeRange() {
            return Range.singleton(Integer.valueOf(this.token.getTok().getIndex())).canonical(AbstractDoc.INTEGERS);
        }

        @Override
        public State computeBreaks(CommentsHelper commentsHelper, int maxWidth, State state) {
            String text = this.token.getTok().getOriginalText();
            return state.withColumn(state.column + text.length());
        }

        @Override
        public void write(Output output) {
            String text = this.token.getTok().getOriginalText();
            output.append(text, range());
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).m93add("token", this.token).m93add("realOrImaginary", this.realOrImaginary).m93add("plusIndentCommentsBefore", this.plusIndentCommentsBefore).toString();
        }
    }

    static final class Space extends AbstractDoc implements InterfaceOp {
        private static final Space SPACE = new Space();

        private Space() {
        }

        static Space make() {
            return SPACE;
        }

        @Override
        public void mo439add(DocBuilder builder) {
            builder.m441add(this);
        }

        @Override
        float computeWidth() {
            return 1.0f;
        }

        @Override
        String computeFlat() {
            return " ";
        }

        @Override
        Range<Integer> computeRange() {
            return AbstractDoc.EMPTY_RANGE;
        }

        @Override
        public State computeBreaks(CommentsHelper commentsHelper, int maxWidth, State state) {
            return state.withColumn(state.column + 1);
        }

        @Override
        public void write(Output output) {
            output.append(" ", range());
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).toString();
        }
    }

    public static final class Break extends AbstractDoc implements InterfaceOp {
        boolean broken;
        private final FillMode fillMode;
        private final String flat;
        int newIndent;
        private final Optional<Output.BreakTag> optTag;
        private final Indent plusIndent;

        private Break(FillMode fillMode, String flat, Indent plusIndent, Optional<Output.BreakTag> optTag) {
            this.fillMode = fillMode;
            this.flat = flat;
            this.plusIndent = plusIndent;
            this.optTag = optTag;
        }

        public static Break make(FillMode fillMode, String flat, Indent plusIndent) {
            return new Break(fillMode, flat, plusIndent, Optional.absent());
        }

        public static Break make(FillMode fillMode, String flat, Indent plusIndent, Optional<Output.BreakTag> optTag) {
            return new Break(fillMode, flat, plusIndent, optTag);
        }

        public static Break makeForced() {
            return make(FillMode.FORCED, "", Indent.Const.ZERO);
        }

        int getPlusIndent() {
            return this.plusIndent.eval();
        }

        boolean isForced() {
            return this.fillMode == FillMode.FORCED;
        }

        @Override
        public void mo439add(DocBuilder builder) {
            builder.breakDoc(this);
        }

        @Override
        float computeWidth() {
            if (isForced()) {
                return Float.POSITIVE_INFINITY;
            }
            return this.flat.length();
        }

        @Override
        String computeFlat() {
            return this.flat;
        }

        @Override
        Range<Integer> computeRange() {
            return AbstractDoc.EMPTY_RANGE;
        }

        public State computeBreaks(State state, int lastIndent, boolean broken) {
            if (this.optTag.isPresent()) {
                this.optTag.mo75get().recordBroken(broken);
            }
            if (broken) {
                this.broken = true;
                int iMax = Math.max(this.plusIndent.eval() + lastIndent, 0);
                this.newIndent = iMax;
                return state.withColumn(iMax);
            }
            this.broken = false;
            this.newIndent = -1;
            return state.withColumn(state.column + this.flat.length());
        }

        @Override
        public State computeBreaks(CommentsHelper commentsHelper, int maxWidth, State state) {
            throw new UnsupportedOperationException("Did you mean computeBreaks(State, int, boolean)?");
        }

        @Override
        public void write(Output output) {
            if (this.broken) {
                output.append("\n", AbstractDoc.EMPTY_RANGE);
                output.indent(this.newIndent);
            } else {
                output.append(this.flat, range());
            }
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).m93add("fillMode", this.fillMode).m93add("flat", this.flat).m93add("plusIndent", this.plusIndent).m93add("optTag", this.optTag).toString();
        }
    }

    static final class Tok extends AbstractDoc implements InterfaceOp {
        String text;

        private final Input.InterfaceC0532Tok f242tok;

        private Tok(Input.InterfaceC0532Tok tok) {
            this.f242tok = tok;
        }

        static Tok make(Input.InterfaceC0532Tok tok) {
            return new Tok(tok);
        }

        @Override
        public void mo439add(DocBuilder builder) {
            builder.m441add(this);
        }

        @Override
        float computeWidth() {
            int idx = Newlines.firstBreak(this.f242tok.getOriginalText());
            if (this.f242tok.isComment()) {
                if (idx > 0) {
                    return idx;
                }
                if (this.f242tok.isSlashSlashComment() && !this.f242tok.getOriginalText().startsWith("// ")) {
                    return this.f242tok.length() + 1;
                }
                return this.f242tok.length();
            }
            if (idx != -1) {
                return Float.POSITIVE_INFINITY;
            }
            return this.f242tok.length();
        }

        @Override
        String computeFlat() {
            if (this.f242tok.isSlashSlashComment() && !this.f242tok.getOriginalText().startsWith("// ")) {
                return "// " + this.f242tok.getOriginalText().substring("//".length());
            }
            return this.f242tok.getOriginalText();
        }

        @Override
        Range<Integer> computeRange() {
            return Range.singleton(Integer.valueOf(this.f242tok.getIndex())).canonical(AbstractDoc.INTEGERS);
        }

        @Override
        public State computeBreaks(CommentsHelper commentsHelper, int maxWidth, State state) {
            String strRewrite = commentsHelper.rewrite(this.f242tok, maxWidth, state.column);
            this.text = strRewrite;
            int firstLineLength = strRewrite.length() - ((Integer) Iterators.getLast(Newlines.lineOffsetIterator(this.text))).intValue();
            return state.withColumn(state.column + firstLineLength);
        }

        @Override
        public void write(Output output) {
            output.append(this.text, range());
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).m93add("tok", this.f242tok).toString();
        }
    }
}
