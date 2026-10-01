package com.google.googlejavaformat.java;

import com.google.common.base.Charsets;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Verify;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.googlejavaformat.Input;
import com.google.googlejavaformat.Newlines;
import com.google.googlejavaformat.java.javac.parser.Tokens;
import com.sun.tools.javac.file.JavacFileManager;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Context;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.DiagnosticListener;
import javax.tools.JavaFileObject;
import javax.tools.SimpleJavaFileObject;

public final class JavaInput extends Input {

    private int f251kN;
    private final Token[] kToToken;
    private final ImmutableMap<Integer, Integer> positionToColumnMap;
    private final ImmutableRangeMap<Integer, Token> positionTokenMap;
    private final String text;
    private final ImmutableList<Token> tokens;
    private JCTree.JCCompilationUnit unit;

    public JavaInput(String text) throws FormatterException {
        this.text = (String) Preconditions.checkNotNull(text);
        setLines(ImmutableList.copyOf(Newlines.lineIterator(text)));
        ImmutableList<C0540Tok> toks = buildToks(text);
        this.positionToColumnMap = makePositionToColumnMap(toks);
        this.tokens = buildTokens(toks);
        ImmutableRangeMap.Builder<Integer, Token> tokenLocations = ImmutableRangeMap.builder();
        UnmodifiableIterator<Token> it = this.tokens.iterator();
        while (it.hasNext()) {
            Token token = it.next();
            Input.InterfaceC0532Tok end = JavaOutput.endTok(token);
            int upper = end.getPosition();
            if (!end.getText().isEmpty()) {
                upper += end.length() - 1;
            }
            tokenLocations.m206put(Range.closed(Integer.valueOf(JavaOutput.startTok(token).getPosition()), Integer.valueOf(upper)), token);
        }
        this.positionTokenMap = tokenLocations.build();
        this.kToToken = new Token[this.f251kN + 1];
        UnmodifiableIterator<Token> it2 = this.tokens.iterator();
        while (it2.hasNext()) {
            Token token2 = it2.next();
            UnmodifiableIterator<? extends Input.InterfaceC0532Tok> it3 = token2.getToksBefore().iterator();
            while (it3.hasNext()) {
                Input.InterfaceC0532Tok tok = it3.next();
                if (tok.getIndex() >= 0) {
                    this.kToToken[tok.getIndex()] = token2;
                }
            }
            this.kToToken[token2.getTok().getIndex()] = token2;
            UnmodifiableIterator<? extends Input.InterfaceC0532Tok> it4 = token2.getToksAfter().iterator();
            while (it4.hasNext()) {
                Input.InterfaceC0532Tok tok2 = it4.next();
                if (tok2.getIndex() >= 0) {
                    this.kToToken[tok2.getIndex()] = token2;
                }
            }
        }
    }

    private static ImmutableMap<Integer, Integer> makePositionToColumnMap(List<C0540Tok> toks) {
        ImmutableMap.Builder<Integer, Integer> builder = ImmutableMap.builder();
        for (C0540Tok tok : toks) {
            builder.mo153put(Integer.valueOf(tok.getPosition()), Integer.valueOf(tok.getColumn()));
        }
        return builder.build();
    }

    static ImmutableList<C0540Tok> buildToks(String text, ImmutableSet<Tokens.TokenKind> stopTokens) throws FormatterException {
        String tokText;
        ImmutableSet<Tokens.TokenKind> stopTokens2;
        Context context;
        List<String> strings;
        String originalTokText;
        String tokText2;
        String extraNewline;
        boolean isToken;
        boolean isNumbered;
        int columnI;
        int i;
        ImmutableSet<Tokens.TokenKind> stopTokens3;
        Context context2;
        List<String> strings2;
        final String originalTokText2 = text;
        ImmutableSet<Tokens.TokenKind> stopTokens4 = ImmutableSet.builder().addAll((Iterable) stopTokens).mo158add(Tokens.TokenKind.EOF).build();
        Context context3 = new Context();
        new JavacFileManager(context3, true, Charsets.UTF_8);
        DiagnosticCollector<JavaFileObject> diagnosticCollector = new DiagnosticCollector<>();
        context3.m506put((Class<DiagnosticCollector<JavaFileObject>>) DiagnosticListener.class, diagnosticCollector);
        Log log = Log.instance(context3);
        log.useSource(new SimpleJavaFileObject(URI.create("Source.java"), JavaFileObject.Kind.SOURCE) {
            @Override
            public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {
                return originalTokText2;
            }
        });
        ImmutableList<JavacTokens.RawTok> rawToks = JavacTokens.getTokens(originalTokText2, context3, stopTokens4);
        for (Diagnostic<? extends JavaFileObject> diagnostic : diagnosticCollector.getDiagnostics()) {
            if (diagnostic.getKind() == Diagnostic.Kind.ERROR) {
                return ImmutableList.m161of(new C0540Tok(0, "", "", 0, 0, true, null));
            }
        }
        int kN = 0;
        List<C0540Tok> toks = new ArrayList<>();
        int charI = 0;
        int columnI2 = 0;
        UnmodifiableIterator<JavacTokens.RawTok> it = rawToks.iterator();
        while (it.hasNext()) {
            JavacTokens.RawTok t = it.next();
            if (stopTokens4.contains(t.kind())) {
                break;
            }
            int charI0 = t.m444pos();
            String originalTokText3 = originalTokText2.substring(charI0, t.endPos());
            if (t.kind() == Tokens.TokenKind.STRINGLITERAL) {
                tokText = t.stringVal();
            } else {
                tokText = originalTokText3;
            }
            char tokText0 = tokText.charAt(0);
            String extraNewline2 = null;
            List<String> strings3 = new ArrayList<>();
            if (Character.isWhitespace(tokText0)) {
                Iterator<String> it2 = Newlines.lineIterator(originalTokText3);
                while (it2.hasNext()) {
                    String line = it2.next();
                    String newline = Newlines.getLineEnding(line);
                    if (newline != null) {
                        stopTokens3 = stopTokens4;
                        context2 = context3;
                        String spaces = line.substring(0, line.length() - newline.length());
                        if (spaces.isEmpty()) {
                            strings2 = strings3;
                        } else {
                            strings2 = strings3;
                            strings2.add(spaces);
                        }
                        strings2.add(newline);
                    } else {
                        stopTokens3 = stopTokens4;
                        context2 = context3;
                        strings2 = strings3;
                        if (!line.isEmpty()) {
                            strings2.add(line);
                        }
                    }
                    strings3 = strings2;
                    context3 = context2;
                    stopTokens4 = stopTokens3;
                }
                stopTokens2 = stopTokens4;
                context = context3;
                strings = strings3;
                originalTokText = originalTokText3;
                tokText2 = tokText;
                extraNewline = null;
                isToken = false;
                isNumbered = false;
            } else {
                stopTokens2 = stopTokens4;
                context = context3;
                strings = strings3;
                if (tokText.startsWith("'") || tokText.startsWith("\"")) {
                    strings.add(originalTokText3);
                    originalTokText = originalTokText3;
                    tokText2 = tokText;
                    extraNewline = null;
                    isToken = true;
                    isNumbered = true;
                } else if (tokText.startsWith("//") || tokText.startsWith("/*")) {
                    if (tokText.startsWith("//") && (originalTokText3.endsWith("\n") || originalTokText3.endsWith("\r"))) {
                        extraNewline2 = Newlines.getLineEnding(originalTokText3);
                        tokText = tokText.substring(0, tokText.length() - extraNewline2.length());
                        originalTokText3 = originalTokText3.substring(0, originalTokText3.length() - extraNewline2.length());
                    }
                    strings.add(originalTokText3);
                    originalTokText = originalTokText3;
                    tokText2 = tokText;
                    extraNewline = extraNewline2;
                    isToken = false;
                    isNumbered = true;
                } else if (Character.isJavaIdentifierStart(tokText0) || Character.isDigit(tokText0) || (tokText0 == '.' && tokText.length() > 1 && Character.isDigit(tokText.charAt(1)))) {
                    strings.add(tokText);
                    originalTokText = originalTokText3;
                    tokText2 = tokText;
                    extraNewline = null;
                    isToken = true;
                    isNumbered = true;
                } else {
                    char[] charArray = tokText.toCharArray();
                    int length = charArray.length;
                    int i2 = 0;
                    while (i2 < length) {
                        char c = charArray[i2];
                        strings.add(String.valueOf(c));
                        i2++;
                        charArray = charArray;
                    }
                    originalTokText = originalTokText3;
                    tokText2 = tokText;
                    extraNewline = null;
                    isToken = true;
                    isNumbered = true;
                }
            }
            int i3 = -1;
            if (strings.size() == 1) {
                if (isNumbered) {
                    i3 = kN;
                    kN++;
                }
                toks.add(new C0540Tok(i3, originalTokText, tokText2, charI, columnI2, isToken, t.kind()));
                charI += originalTokText.length();
                columnI = updateColumn(columnI2, originalTokText);
            } else {
                if (strings.size() != 1 && !tokText2.equals(originalTokText)) {
                    throw new FormatterException("Unicode escapes not allowed in whitespace or multi-character operators");
                }
                for (String str : strings) {
                    if (isNumbered) {
                        i = kN;
                        kN++;
                    } else {
                        i = -1;
                    }
                    toks.add(new C0540Tok(i, str, str, charI, columnI2, isToken, null));
                    charI += str.length();
                    columnI2 = updateColumn(columnI2, originalTokText);
                }
                columnI = columnI2;
            }
            if (extraNewline != null) {
                toks.add(new C0540Tok(-1, extraNewline, extraNewline, charI, columnI, false, null));
                columnI = 0;
                charI += extraNewline.length();
            }
            columnI2 = columnI;
            originalTokText2 = text;
            context3 = context;
            stopTokens4 = stopTokens2;
            diagnosticCollector = diagnosticCollector;
        }
        toks.add(new C0540Tok(kN, "", "", charI, columnI2, true, null));
        return ImmutableList.copyOf((Collection) toks);
    }

    private static int updateColumn(int columnI, String originalTokText) {
        Integer last = (Integer) Iterators.getLast(Newlines.lineOffsetIterator(originalTokText));
        if (last.intValue() > 0) {
            int columnI2 = originalTokText.length() - last.intValue();
            return columnI2;
        }
        int columnI3 = originalTokText.length();
        return columnI3 + columnI;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:59:0x0103 A[LOOP:4: B:57:0x00f7->B:59:0x0103, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x0109  */
    /* JADX WARN: Code duplicated, block: B:64:0x0120 A[LOOP:3: B:15:0x004b->B:64:0x0120, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9 A[SYNTHETIC] */
    private static ImmutableList<Token> buildTokens(List<C0540Tok> toks) {
        int k;
        int k2;
        C0540Tok nonTokenAfter;
        String text;
        byte b;
        ImmutableList.Builder<Token> tokens = ImmutableList.builder();
        int k3 = 0;
        int kN = toks.size();
        ImmutableList.Builder<C0540Tok> toksBefore = ImmutableList.builder();
        while (k3 < kN) {
            while (!toks.get(k3).isToken()) {
                int k4 = k3 + 1;
                C0540Tok tok = toks.get(k3);
                toksBefore.mo158add(tok);
                if (!isParamComment(tok)) {
                    k3 = k4;
                } else {
                    while (toks.get(k4).isNewline()) {
                        k4++;
                    }
                    k3 = k4;
                }
            }
            int k5 = k3 + 1;
            C0540Tok tok2 = toks.get(k3);
            ImmutableList.Builder<C0540Tok> toksAfter = ImmutableList.builder();
            while (true) {
                if (k5 < kN && !toks.get(k5).isToken()) {
                    if (toks.get(k5).isSlashStarComment()) {
                        String text2 = tok2.getText();
                        int iHashCode = text2.hashCode();
                        if (iHashCode != 40) {
                            if (iHashCode != 46) {
                                if (iHashCode == 60 && text2.equals("<")) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                            } else if (text2.equals(".")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (text2.equals("(")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                        if (b != 0 && b != 1 && b != 2) {
                            if (toks.get(k5).isJavadocComment()) {
                                text = tok2.getText();
                                if (((text.hashCode() == 59 || !text.equals(";")) ? (byte) -1 : (byte) 0) != 0) {
                                    if (isParamComment(toks.get(k5))) {
                                        tokens.mo158add(new Token(toksBefore.build(), tok2, toksAfter.build()));
                                        k = k5 + 1;
                                        toksBefore = ImmutableList.builder().mo158add(toks.get(k5));
                                        while (toks.get(k).isNewline()) {
                                            k++;
                                        }
                                        k3 = k;
                                        break;
                                        break;
                                    }
                                    k2 = k5 + 1;
                                    nonTokenAfter = toks.get(k5);
                                    toksAfter.mo158add(nonTokenAfter);
                                    if (Newlines.containsBreaks(nonTokenAfter.getText())) {
                                        k5 = k2;
                                    } else {
                                        k5 = k2;
                                    }
                                }
                            } else {
                                if (isParamComment(toks.get(k5))) {
                                    tokens.mo158add(new Token(toksBefore.build(), tok2, toksAfter.build()));
                                    k = k5 + 1;
                                    toksBefore = ImmutableList.builder().mo158add(toks.get(k5));
                                    while (toks.get(k).isNewline()) {
                                        k++;
                                    }
                                    k3 = k;
                                    break;
                                    break;
                                }
                                k2 = k5 + 1;
                                nonTokenAfter = toks.get(k5);
                                toksAfter.mo158add(nonTokenAfter);
                                if (Newlines.containsBreaks(nonTokenAfter.getText())) {
                                    k5 = k2;
                                } else {
                                    k5 = k2;
                                }
                            }
                        }
                    } else if (toks.get(k5).isJavadocComment()) {
                        text = tok2.getText();
                        if (((text.hashCode() == 59 || !text.equals(";")) ? (byte) -1 : (byte) 0) != 0) {
                            if (isParamComment(toks.get(k5))) {
                                tokens.mo158add(new Token(toksBefore.build(), tok2, toksAfter.build()));
                                k = k5 + 1;
                                toksBefore = ImmutableList.builder().mo158add(toks.get(k5));
                                while (toks.get(k).isNewline()) {
                                    k++;
                                }
                                k3 = k;
                                break;
                            }
                            k2 = k5 + 1;
                            nonTokenAfter = toks.get(k5);
                            toksAfter.mo158add(nonTokenAfter);
                            if (Newlines.containsBreaks(nonTokenAfter.getText())) {
                                k5 = k2;
                            } else {
                                k5 = k2;
                            }
                        }
                    } else {
                        if (isParamComment(toks.get(k5))) {
                            tokens.mo158add(new Token(toksBefore.build(), tok2, toksAfter.build()));
                            k = k5 + 1;
                            toksBefore = ImmutableList.builder().mo158add(toks.get(k5));
                            while (toks.get(k).isNewline()) {
                                k++;
                            }
                            k3 = k;
                            break;
                            break;
                        }
                        k2 = k5 + 1;
                        nonTokenAfter = toks.get(k5);
                        toksAfter.mo158add(nonTokenAfter);
                        if (Newlines.containsBreaks(nonTokenAfter.getText())) {
                            k5 = k2;
                        } else {
                            k5 = k2;
                        }
                    }
                }
                tokens.mo158add(new Token(toksBefore.build(), tok2, toksAfter.build()));
                toksBefore = ImmutableList.builder();
                k3 = k5;
                break;
            }
        }
        return tokens.build();
    }

    private static boolean isParamComment(C0540Tok tok) {
        return tok.isSlashStarComment() && tok.getText().matches("\\/\\*[A-Za-z0-9\\s_\\-]+=\\s*\\*\\/");
    }

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public ImmutableMap<Integer, Integer> getPositionToColumnMap() {
        return this.positionToColumnMap;
    }

    private ImmutableList<C0540Tok> buildToks(String text) throws FormatterException {
        ImmutableList<C0540Tok> toks = buildToks(text, ImmutableSet.m211of());
        this.f251kN = ((C0540Tok) Iterables.getLast(toks)).getIndex();
        computeRanges(toks);
        return toks;
    }

    Range<Integer> characterRangeToTokenRange(int offset, int length) throws FormatterException {
        int requiredLength = offset + length;
        if (requiredLength > this.text.length()) {
            throw new FormatterException(String.format("error: invalid length %d, offset + length (%d) is outside the file", Integer.valueOf(length), Integer.valueOf(requiredLength)));
        }
        if (length < 0) {
            return EMPTY_RANGE;
        }
        if (length == 0) {
            length = 1;
        }
        ImmutableCollection<Token> enclosed = getPositionTokenMap().subRangeMap((Range) Range.closedOpen(Integer.valueOf(offset), Integer.valueOf(offset + length))).asMapOfRanges().values();
        if (enclosed.isEmpty()) {
            return EMPTY_RANGE;
        }
        return Range.closedOpen(Integer.valueOf(enclosed.iterator().next().getTok().getIndex()), Integer.valueOf(((Token) Iterables.getLast(enclosed)).getTok().getIndex() + 1));
    }

    int getkN() {
        return this.f251kN;
    }

    Token getToken(int k) {
        return this.kToToken[k];
    }

    @Override
    public ImmutableList<? extends Input.Token> getTokens() {
        return this.tokens;
    }

    @Override
    public ImmutableRangeMap<Integer, Token> getPositionTokenMap() {
        return this.positionTokenMap;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).m93add("tokens", this.tokens).m93add("super", super.toString()).toString();
    }

    @Override
    public int getLineNumber(int inputPosition) {
        Verify.verifyNotNull(this.unit, "Expected compilation unit to be set.", new Object[0]);
        return this.unit.getLineMap().getLineNumber(inputPosition);
    }

    @Override
    public int getColumnNumber(int inputPosition) {
        Verify.verifyNotNull(this.unit, "Expected compilation unit to be set.", new Object[0]);
        return this.unit.getLineMap().getColumnNumber(inputPosition);
    }

    public void setCompilationUnit(JCTree.JCCompilationUnit unit) {
        this.unit = unit;
    }

    public RangeSet<Integer> characterRangesToTokenRanges(Collection<Range<Integer>> characterRanges) throws FormatterException {
        RangeSet<Integer> tokenRangeSet = TreeRangeSet.create();
        for (Range<Integer> characterRange0 : characterRanges) {
            Range<C> rangeCanonical = characterRange0.canonical(DiscreteDomain.integers());
            tokenRangeSet.mo129add(characterRangeToTokenRange(((Integer) rangeCanonical.lowerEndpoint()).intValue(), ((Integer) rangeCanonical.upperEndpoint()).intValue() - ((Integer) rangeCanonical.lowerEndpoint()).intValue()));
        }
        return tokenRangeSet;
    }

    static final class C0540Tok implements Input.InterfaceC0532Tok {
        private final int columnI;
        private final int index;
        private final boolean isToken;
        private final Tokens.TokenKind kind;
        private final String originalText;
        private final int position;
        private final String text;

        C0540Tok(int index, String originalText, String text, int position, int columnI, boolean isToken, Tokens.TokenKind kind) {
            this.index = index;
            this.originalText = originalText;
            this.text = text;
            this.position = position;
            this.columnI = columnI;
            this.isToken = isToken;
            this.kind = kind;
        }

        @Override
        public int getIndex() {
            return this.index;
        }

        @Override
        public String getText() {
            return this.text;
        }

        @Override
        public String getOriginalText() {
            return this.originalText;
        }

        @Override
        public int length() {
            return this.originalText.length();
        }

        @Override
        public int getPosition() {
            return this.position;
        }

        @Override
        public int getColumn() {
            return this.columnI;
        }

        boolean isToken() {
            return this.isToken;
        }

        @Override
        public boolean isNewline() {
            return Newlines.isNewline(this.text);
        }

        @Override
        public boolean isSlashSlashComment() {
            return this.text.startsWith("//");
        }

        @Override
        public boolean isSlashStarComment() {
            return this.text.startsWith("/*");
        }

        @Override
        public boolean isJavadocComment() {
            return this.text.startsWith("/**") && this.text.length() > 4;
        }

        @Override
        public boolean isComment() {
            return isSlashSlashComment() || isSlashStarComment();
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).m91add("index", this.index).m93add("text", this.text).m91add("position", this.position).m91add("columnI", this.columnI).m94add("isToken", this.isToken).toString();
        }

        public Tokens.TokenKind kind() {
            return this.kind;
        }
    }

    static final class Token implements Input.Token {

        private final C0540Tok f252tok;
        private final ImmutableList<C0540Tok> toksAfter;
        private final ImmutableList<C0540Tok> toksBefore;

        Token(List<C0540Tok> toksBefore, C0540Tok tok, List<C0540Tok> toksAfter) {
            this.toksBefore = ImmutableList.copyOf((Collection) toksBefore);
            this.f252tok = tok;
            this.toksAfter = ImmutableList.copyOf((Collection) toksAfter);
        }

        @Override
        public C0540Tok getTok() {
            return this.f252tok;
        }

        @Override
        public ImmutableList<? extends Input.InterfaceC0532Tok> getToksBefore() {
            return this.toksBefore;
        }

        @Override
        public ImmutableList<? extends Input.InterfaceC0532Tok> getToksAfter() {
            return this.toksAfter;
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).m93add("tok", this.f252tok).m93add("toksBefore", this.toksBefore).m93add("toksAfter", this.toksAfter).toString();
        }
    }
}
