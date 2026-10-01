package com.google.googlejavaformat;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multimap;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.List;
import sun.misc.FloatConsts;

public final class OpsBuilder {
    private final Input input;
    private final Output output;
    private static final Indent.Const ZERO = Indent.Const.ZERO;
    private static final AbstractDoc.Space SPACE = AbstractDoc.Space.make();

    private final List<InterfaceOp> f246ops = new ArrayList();
    int depth = 0;
    private int tokenI = 0;
    private int inputPosition = FloatConsts.SIGN_BIT_MASK;
    private int lastPartialFormatBoundary = -1;

    public OpsBuilder(Input input, Output output) {
        this.input = input;
        this.output = output;
    }

    private static int getI(Input.Token token) {
        UnmodifiableIterator<? extends Input.InterfaceC0532Tok> it = token.getToksBefore().iterator();
        while (it.hasNext()) {
            Input.InterfaceC0532Tok tok = it.next();
            if (tok.getIndex() >= 0) {
                return tok.getIndex();
            }
        }
        return token.getTok().getIndex();
    }

    private static boolean isForcedBreak(InterfaceOp op) {
        return (op instanceof AbstractDoc.Break) && ((AbstractDoc.Break) op).isForced();
    }

    private static List<InterfaceOp> makeComment(Input.InterfaceC0532Tok comment) {
        if (comment.isSlashStarComment()) {
            return ImmutableList.m161of(AbstractDoc.Tok.make(comment));
        }
        return ImmutableList.m162of((AbstractDoc.Break) AbstractDoc.Tok.make(comment), AbstractDoc.Break.makeForced());
    }

    public int actualSize(int position, int length) {
        Input.Token startToken = this.input.getPositionTokenMap().mo204get(Integer.valueOf(position));
        int start = startToken.getTok().getPosition();
        UnmodifiableIterator<? extends Input.InterfaceC0532Tok> it = startToken.getToksBefore().iterator();
        while (it.hasNext()) {
            Input.InterfaceC0532Tok tok = it.next();
            if (tok.isComment()) {
                start = Math.min(start, tok.getPosition());
            }
        }
        Input.Token endToken = this.input.getPositionTokenMap().mo204get(Integer.valueOf((position + length) - 1));
        int end = endToken.getTok().getPosition() + endToken.getTok().length();
        UnmodifiableIterator<? extends Input.InterfaceC0532Tok> it2 = endToken.getToksAfter().iterator();
        while (it2.hasNext()) {
            Input.InterfaceC0532Tok tok2 = it2.next();
            if (tok2.isComment()) {
                end = Math.max(end, tok2.getPosition() + tok2.length());
            }
        }
        return end - start;
    }

    public Integer actualStartColumn(int position) {
        Input.Token startToken = this.input.getPositionTokenMap().mo204get(Integer.valueOf(position));
        int start = startToken.getTok().getPosition();
        int line0 = this.input.getLineNumber(start);
        UnmodifiableIterator<? extends Input.InterfaceC0532Tok> it = startToken.getToksBefore().iterator();
        while (it.hasNext()) {
            Input.InterfaceC0532Tok tok = it.next();
            if (line0 != this.input.getLineNumber(tok.getPosition())) {
                return Integer.valueOf(start);
            }
            if (tok.isComment()) {
                start = Math.min(start, tok.getPosition());
            }
        }
        return Integer.valueOf(start);
    }

    private void m442add(InterfaceOp op) {
        if (op instanceof OpenOp) {
            this.depth++;
        } else if (op instanceof CloseOp) {
            int i = this.depth - 1;
            this.depth = i;
            if (i < 0) {
                throw new AssertionError();
            }
        }
        this.f246ops.add(op);
    }

    public final void addAll(List<InterfaceOp> ops) {
        for (InterfaceOp op : ops) {
            m442add(op);
        }
    }

    public final Input getInput() {
        return this.input;
    }

    public int depth() {
        return this.depth;
    }

    public void checkClosed(int previous) {
        if (this.depth != previous) {
            throw new FormattingError(diagnostic(String.format("saw %d unclosed ops", Integer.valueOf(this.depth))));
        }
    }

    public FormatterDiagnostic diagnostic(String message) {
        System.err.printf(">>>> %d: %s\n", Integer.valueOf(this.inputPosition), message);
        return this.input.createDiagnostic(this.inputPosition, message);
    }

    public final void sync(int inputPosition) {
        if (inputPosition > this.inputPosition) {
            ImmutableList<? extends Input.Token> tokens = this.input.getTokens();
            int tokensN = tokens.size();
            this.inputPosition = inputPosition;
            int i = this.tokenI;
            if (i < tokensN && inputPosition > tokens.get(i).getTok().getPosition()) {
                int i2 = this.tokenI;
                this.tokenI = i2 + 1;
                Input.Token token = tokens.get(i2);
                throw new FormattingError(diagnostic(String.format("did not generate token \"%s\"", token.getTok().getText())));
            }
        }
    }

    public final void drain() {
        int inputPosition = this.input.getText().length() + 1;
        if (inputPosition > this.inputPosition) {
            ImmutableList<? extends Input.Token> tokens = this.input.getTokens();
            int tokensN = tokens.size();
            while (true) {
                int i = this.tokenI;
                if (i >= tokensN || inputPosition <= tokens.get(i).getTok().getPosition()) {
                    break;
                }
                int i2 = this.tokenI;
                this.tokenI = i2 + 1;
                Input.Token token = tokens.get(i2);
                m442add(AbstractDoc.Token.make(token, AbstractDoc.Token.RealOrImaginary.IMAGINARY, ZERO, Optional.absent()));
            }
        }
        this.inputPosition = inputPosition;
        checkClosed(0);
    }

    public final void open(Indent plusIndent) {
        m442add(OpenOp.make(plusIndent));
    }

    public final void close() {
        m442add(CloseOp.make());
    }

    public final Optional<String> peekToken() {
        ImmutableList<? extends Input.Token> tokens = this.input.getTokens();
        if (this.tokenI < tokens.size()) {
            return Optional.m95of(tokens.get(this.tokenI).getTok().getOriginalText());
        }
        return Optional.absent();
    }

    public final void guessToken(String token) {
        token(token, AbstractDoc.Token.RealOrImaginary.IMAGINARY, ZERO, Optional.absent());
    }

    public final void token(String token, AbstractDoc.Token.RealOrImaginary realOrImaginary, Indent plusIndentCommentsBefore, Optional<Indent> breakAndIndentTrailingComment) {
        ImmutableList<? extends Input.Token> tokens = this.input.getTokens();
        if (token.equals(peekToken().orNull())) {
            int i = this.tokenI;
            this.tokenI = i + 1;
            m442add(AbstractDoc.Token.make(tokens.get(i), AbstractDoc.Token.RealOrImaginary.REAL, plusIndentCommentsBefore, breakAndIndentTrailingComment));
        } else if (realOrImaginary.isReal()) {
            throw new FormattingError(diagnostic(String.format("expected token: '%s'; generated %s instead", peekToken().orNull(), token)));
        }
    }

    public final void m443op(String op) {
        int opN = op.length();
        for (int i = 0; i < opN; i++) {
            token(op.substring(i, i + 1), AbstractDoc.Token.RealOrImaginary.REAL, ZERO, Optional.absent());
        }
    }

    public final void space() {
        m442add(AbstractDoc.Space.make());
    }

    public final void breakOp() {
        breakOp(AbstractDoc.FillMode.UNIFIED, "", ZERO);
    }

    public final void breakOp(Indent plusIndent) {
        breakOp(AbstractDoc.FillMode.UNIFIED, "", plusIndent);
    }

    public final void breakToFill() {
        breakOp(AbstractDoc.FillMode.INDEPENDENT, "", ZERO);
    }

    public final void forcedBreak() {
        breakOp(AbstractDoc.FillMode.FORCED, "", ZERO);
    }

    public final void forcedBreak(Indent plusIndent) {
        breakOp(AbstractDoc.FillMode.FORCED, "", plusIndent);
    }

    public final void breakOp(String flat) {
        breakOp(AbstractDoc.FillMode.UNIFIED, flat, ZERO);
    }

    public final void breakToFill(String flat) {
        breakOp(AbstractDoc.FillMode.INDEPENDENT, flat, ZERO);
    }

    public final void breakOp(AbstractDoc.FillMode fillMode, String flat, Indent plusIndent) {
        breakOp(fillMode, flat, plusIndent, Optional.absent());
    }

    public final void breakOp(AbstractDoc.FillMode fillMode, String flat, Indent plusIndent, Optional<Output.BreakTag> optionalTag) {
        m442add(AbstractDoc.Break.make(fillMode, flat, plusIndent, optionalTag));
    }

    public void markForPartialFormat() {
        int i = this.lastPartialFormatBoundary;
        if (i == -1) {
            this.lastPartialFormatBoundary = this.tokenI;
        } else {
            if (this.tokenI == i) {
                return;
            }
            Input.Token start = this.input.getTokens().get(this.lastPartialFormatBoundary);
            Input.Token end = this.input.getTokens().get(this.tokenI - 1);
            this.output.markForPartialFormat(start, end);
            this.lastPartialFormatBoundary = this.tokenI;
        }
    }

    public final void blankLineWanted(BlankLineWanted wanted) {
        this.output.blankLine(getI(this.input.getTokens().get(this.tokenI)), wanted);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ImmutableList<InterfaceOp> build() {
        int opsN;
        int opsN2;
        markForPartialFormat();
        Multimap<Integer, InterfaceOp> tokOps = ArrayListMultimap.create();
        int opsN3 = this.f246ops.size();
        int i = 0;
        while (i < opsN3) {
            InterfaceOp op = this.f246ops.get(i);
            if (!(op instanceof AbstractDoc.Token)) {
                opsN2 = opsN3;
            } else {
                AbstractDoc.Token tokenOp = (AbstractDoc.Token) op;
                Input.Token token = tokenOp.getToken();
                int j = i;
                while (j > 0 && (this.f246ops.get(j - 1) instanceof OpenOp)) {
                    j--;
                }
                int k = i;
                while (k + 1 < opsN3 && (this.f246ops.get(k + 1) instanceof CloseOp)) {
                    k++;
                }
                if (tokenOp.realOrImaginary().isReal()) {
                    int newlines = 0;
                    boolean space = false;
                    boolean lastWasComment = false;
                    boolean allowBlankAfterLastComment = false;
                    UnmodifiableIterator<? extends Input.InterfaceC0532Tok> it = token.getToksBefore().iterator();
                    while (true) {
                        InterfaceOp op2 = op;
                        if (!it.hasNext()) {
                            break;
                        }
                        Input.InterfaceC0532Tok tokBefore = it.next();
                        if (tokBefore.isNewline()) {
                            newlines++;
                        } else if (tokBefore.isComment()) {
                            tokOps.mo126put(Integer.valueOf(j), AbstractDoc.Break.make(tokBefore.isSlashSlashComment() ? AbstractDoc.FillMode.FORCED : AbstractDoc.FillMode.UNIFIED, "", tokenOp.getPlusIndentCommentsBefore()));
                            tokOps.putAll(Integer.valueOf(j), makeComment(tokBefore));
                            boolean space2 = tokBefore.isSlashStarComment();
                            if (tokBefore.isJavadocComment()) {
                                tokOps.mo126put(Integer.valueOf(j), AbstractDoc.Break.makeForced());
                            }
                            lastWasComment = true;
                            allowBlankAfterLastComment = tokBefore.isSlashSlashComment() || (tokBefore.isSlashStarComment() && !tokBefore.isJavadocComment());
                            space = space2;
                            newlines = 0;
                        }
                        op = op2;
                        opsN3 = opsN3;
                        it = it;
                    }
                    opsN2 = opsN3;
                    if (allowBlankAfterLastComment && newlines > 1) {
                        this.output.blankLine(token.getTok().getIndex(), BlankLineWanted.f248YES);
                    }
                    if (lastWasComment && newlines > 0) {
                        tokOps.mo126put(Integer.valueOf(j), AbstractDoc.Break.makeForced());
                    } else if (space) {
                        tokOps.mo126put(Integer.valueOf(j), SPACE);
                    }
                    UnmodifiableIterator<? extends Input.InterfaceC0532Tok> it2 = token.getToksAfter().iterator();
                    while (it2.hasNext()) {
                        Input.InterfaceC0532Tok tokAfter = it2.next();
                        if (!tokAfter.isComment()) {
                            it2 = it2;
                            tokenOp = tokenOp;
                            newlines = newlines;
                        } else {
                            boolean breakAfter = tokAfter.isJavadocComment() || (tokAfter.isSlashStarComment() && tokenOp.breakAndIndentTrailingComment().isPresent());
                            if (breakAfter) {
                                tokOps.mo126put(Integer.valueOf(k + 1), AbstractDoc.Break.make(AbstractDoc.FillMode.FORCED, "", tokenOp.breakAndIndentTrailingComment().mo78or(Indent.Const.ZERO)));
                            } else {
                                tokOps.mo126put(Integer.valueOf(k + 1), SPACE);
                            }
                            tokOps.putAll(Integer.valueOf(k + 1), makeComment(tokAfter));
                            if (breakAfter) {
                                tokOps.mo126put(Integer.valueOf(k + 1), AbstractDoc.Break.make(AbstractDoc.FillMode.FORCED, "", ZERO));
                            }
                        }
                        it2 = it2;
                        newlines = newlines;
                        tokenOp = tokenOp;
                    }
                } else {
                    opsN2 = opsN3;
                    UnmodifiableIterator<? extends Input.InterfaceC0532Tok> it3 = token.getToksBefore().iterator();
                    while (it3.hasNext()) {
                        tokOps.mo126put(Integer.valueOf(j), AbstractDoc.Tok.make(it3.next()));
                    }
                    UnmodifiableIterator<? extends Input.InterfaceC0532Tok> it4 = token.getToksAfter().iterator();
                    while (it4.hasNext()) {
                        tokOps.mo126put(Integer.valueOf(k + 1), AbstractDoc.Tok.make(it4.next()));
                    }
                }
            }
            i++;
            opsN3 = opsN2;
        }
        int opsN4 = opsN3;
        ImmutableList.Builder builder = ImmutableList.builder();
        boolean afterForcedBreak = false;
        int i2 = 0;
        while (true) {
            opsN = opsN4;
            if (i2 >= opsN) {
                break;
            }
            for (InterfaceOp op3 : tokOps.mo125get(Integer.valueOf(i2))) {
                if (!afterForcedBreak || !(op3 instanceof AbstractDoc.Space)) {
                    builder.mo158add(op3);
                    afterForcedBreak = isForcedBreak(op3);
                }
            }
            InterfaceOp interfaceC0534Op = this.f246ops.get(i2);
            if (!afterForcedBreak || (!(interfaceC0534Op instanceof AbstractDoc.Space) && (!(interfaceC0534Op instanceof AbstractDoc.Break) || ((AbstractDoc.Break) interfaceC0534Op).getPlusIndent() != 0 || !" ".equals(((AbstractDoc) interfaceC0534Op).getFlat())))) {
                builder.mo158add(interfaceC0534Op);
                if (!(interfaceC0534Op instanceof OpenOp)) {
                    afterForcedBreak = isForcedBreak(interfaceC0534Op);
                }
            }
            i2++;
            opsN4 = opsN;
        }
        for (InterfaceOp op4 : tokOps.mo125get(Integer.valueOf(opsN))) {
            if (!afterForcedBreak || !(op4 instanceof AbstractDoc.Space)) {
                builder.mo158add(op4);
                afterForcedBreak = isForcedBreak(op4);
            }
        }
        return builder.build();
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).m93add("input", this.input).m93add("ops", this.f246ops).m93add("output", this.output).m91add("tokenI", this.tokenI).m91add("inputPosition", this.inputPosition).toString();
    }

    public static abstract class BlankLineWanted {

        public static final BlankLineWanted f248YES = new SimpleBlankLine(Optional.m95of(true));

        public static final BlankLineWanted f247NO = new SimpleBlankLine(Optional.m95of(false));
        public static final BlankLineWanted PRESERVE = new SimpleBlankLine(Optional.absent());

        public abstract BlankLineWanted merge(BlankLineWanted blankLineWanted);

        public abstract Optional<Boolean> wanted();

        public static BlankLineWanted conditional(Output.BreakTag breakTag) {
            return new ConditionalBlankLine(ImmutableList.m161of(breakTag));
        }

        private static final class SimpleBlankLine extends BlankLineWanted {
            private final Optional<Boolean> wanted;

            SimpleBlankLine(Optional<Boolean> wanted) {
                this.wanted = wanted;
            }

            @Override
            public Optional<Boolean> wanted() {
                return this.wanted;
            }

            @Override
            public BlankLineWanted merge(BlankLineWanted other) {
                return this;
            }
        }

        private static final class ConditionalBlankLine extends BlankLineWanted {
            private final ImmutableList<Output.BreakTag> tags;

            ConditionalBlankLine(Iterable<Output.BreakTag> tags) {
                this.tags = ImmutableList.copyOf(tags);
            }

            @Override
            public Optional<Boolean> wanted() {
                UnmodifiableIterator<Output.BreakTag> it = this.tags.iterator();
                while (it.hasNext()) {
                    Output.BreakTag tag = it.next();
                    if (tag.wasBreakTaken()) {
                        return Optional.m95of(true);
                    }
                }
                return Optional.absent();
            }

            @Override
            public BlankLineWanted merge(BlankLineWanted other) {
                if (!(other instanceof ConditionalBlankLine)) {
                    return other;
                }
                return new ConditionalBlankLine(Iterables.concat(this.tags, ((ConditionalBlankLine) other).tags));
            }
        }
    }
}
