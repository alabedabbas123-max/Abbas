package com.google.googlejavaformat.java;

import com.google.common.base.CharMatcher;
import com.google.common.base.MoreObjects;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.googlejavaformat.CommentsHelper;
import com.google.googlejavaformat.Input;
import com.google.googlejavaformat.Newlines;
import com.google.googlejavaformat.OpsBuilder;
import com.google.googlejavaformat.Output;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class JavaOutput extends Output {
    private final CommentsHelper commentsHelper;
    private final JavaInput javaInput;

    private final int f271kN;
    private final String lineSeparator;
    private final Map<Integer, OpsBuilder.BlankLineWanted> blankLines = new HashMap();
    private final RangeSet<Integer> partialFormatRanges = TreeRangeSet.create();
    private final List<String> mutableLines = new ArrayList();
    private int iLine = 0;
    private int lastK = -1;
    private int spacesPending = 0;
    private int newlinesPending = 0;
    private StringBuilder lineBuilder = new StringBuilder();

    public JavaOutput(String lineSeparator, JavaInput javaInput, CommentsHelper commentsHelper) {
        this.lineSeparator = lineSeparator;
        this.javaInput = javaInput;
        this.commentsHelper = commentsHelper;
        this.f271kN = javaInput.getkN();
    }

    public static String applyReplacements(String input, List<Replacement> replacements) {
        List<Replacement> replacements2 = new ArrayList<>(replacements);
        Collections.sort(replacements2, new Comparator<Replacement>() {
            @Override
            public int compare(Replacement o1, Replacement o2) {
                return Integer.compare(((Integer) o2.getReplaceRange().lowerEndpoint()).intValue(), ((Integer) o1.getReplaceRange().lowerEndpoint()).intValue());
            }
        });
        StringBuilder writer = new StringBuilder(input);
        for (Replacement replacement : replacements2) {
            writer.replace(((Integer) replacement.getReplaceRange().lowerEndpoint()).intValue(), ((Integer) replacement.getReplaceRange().upperEndpoint()).intValue(), replacement.getReplacementString());
        }
        return writer.toString();
    }

    public static int startPosition(Input.Token token) {
        int min = token.getTok().getPosition();
        UnmodifiableIterator<? extends Input.InterfaceC0532Tok> it = token.getToksBefore().iterator();
        while (it.hasNext()) {
            Input.InterfaceC0532Tok tok = it.next();
            min = Math.min(min, tok.getPosition());
        }
        return min;
    }

    public static Input.InterfaceC0532Tok startTok(Input.Token token) {
        UnmodifiableIterator<? extends Input.InterfaceC0532Tok> it = token.getToksBefore().iterator();
        while (it.hasNext()) {
            Input.InterfaceC0532Tok tok = it.next();
            if (tok.getIndex() >= 0) {
                return tok;
            }
        }
        return token.getTok();
    }

    public static Input.InterfaceC0532Tok endTok(Input.Token token) {
        for (int i = token.getToksAfter().size() - 1; i >= 0; i--) {
            Input.InterfaceC0532Tok tok = token.getToksAfter().get(i);
            if (tok.getIndex() >= 0) {
                return tok;
            }
        }
        return token.getTok();
    }

    private static Range<Integer> union(Range<Integer> x, Range<Integer> y) {
        if (x.isEmpty()) {
            return y;
        }
        return y.isEmpty() ? x : x.span(y).canonical(DiscreteDomain.integers());
    }

    @Override
    public void blankLine(int k, OpsBuilder.BlankLineWanted wanted) {
        if (this.blankLines.containsKey(Integer.valueOf(k))) {
            this.blankLines.put(Integer.valueOf(k), this.blankLines.get(Integer.valueOf(k)).merge(wanted));
        } else {
            this.blankLines.put(Integer.valueOf(k), wanted);
        }
    }

    @Override
    public void markForPartialFormat(Input.Token start, Input.Token end) {
        int lo = startTok(start).getIndex();
        int hi = endTok(end).getIndex();
        this.partialFormatRanges.mo129add(Range.closed(Integer.valueOf(lo), Integer.valueOf(hi)));
    }

    @Override
    public void append(String text, Range<Integer> range) {
        if (!range.isEmpty()) {
            boolean sawNewlines = false;
            int iN = this.javaInput.getLineCount();
            while (true) {
                int i = this.iLine;
                if (i >= iN || (!this.javaInput.getRange1s(i).isEmpty() && ((Integer) this.javaInput.getRange1s(this.iLine).upperEndpoint()).intValue() > ((Integer) range.lowerEndpoint()).intValue())) {
                    break;
                }
                if (this.javaInput.getRanges(this.iLine).isEmpty()) {
                    sawNewlines = true;
                }
                this.iLine++;
            }
            OpsBuilder.BlankLineWanted wanted = (OpsBuilder.BlankLineWanted) MoreObjects.firstNonNull(this.blankLines.get(Integer.valueOf(this.lastK)), OpsBuilder.BlankLineWanted.f247NO);
            if (!isComment(text) ? wanted.wanted().mo78or(Boolean.valueOf(sawNewlines)).booleanValue() : sawNewlines) {
                this.newlinesPending++;
            }
        }
        boolean sawNewlines2 = Newlines.isNewline(text);
        if (sawNewlines2) {
            int i2 = this.newlinesPending;
            if (i2 == 0) {
                this.newlinesPending = i2 + 1;
            }
            this.spacesPending = 0;
        } else {
            boolean range0sSet = false;
            boolean rangesSet = false;
            int textN = text.length();
            int i3 = 0;
            while (i3 < textN) {
                char c = text.charAt(i3);
                if (c == '\n') {
                    this.spacesPending = 0;
                    this.newlinesPending++;
                } else if (c == '\r') {
                    if (i3 + 1 < text.length() && text.charAt(i3 + 1) == '\n') {
                        i3++;
                    }
                    this.spacesPending = 0;
                    this.newlinesPending++;
                } else if (c == ' ') {
                    this.spacesPending++;
                } else {
                    while (this.newlinesPending > 0) {
                        if (!this.mutableLines.isEmpty() || this.lineBuilder.length() > 0) {
                            this.mutableLines.add(this.lineBuilder.toString());
                        }
                        this.lineBuilder = new StringBuilder();
                        rangesSet = false;
                        this.newlinesPending--;
                    }
                    while (this.spacesPending > 0) {
                        this.lineBuilder.append(' ');
                        this.spacesPending--;
                    }
                    this.lineBuilder.append(c);
                    if (!range.isEmpty()) {
                        if (!range0sSet && !range.isEmpty()) {
                            while (this.range0s.size() <= this.mutableLines.size()) {
                                this.range0s.add(Formatter.EMPTY_RANGE);
                            }
                            this.range0s.set(this.mutableLines.size(), union(this.range0s.get(this.mutableLines.size()), range));
                            range0sSet = true;
                        }
                        if (!rangesSet) {
                            while (this.ranges.size() <= this.mutableLines.size()) {
                                this.ranges.add(Formatter.EMPTY_RANGE);
                            }
                            this.ranges.set(this.mutableLines.size(), union(this.ranges.get(this.mutableLines.size()), range));
                            rangesSet = true;
                        }
                    }
                }
                i3++;
            }
            if (!range.isEmpty()) {
                while (this.range1s.size() <= this.mutableLines.size()) {
                    this.range1s.add(Formatter.EMPTY_RANGE);
                }
                this.range1s.set(this.mutableLines.size(), union(this.range1s.get(this.mutableLines.size()), range));
            }
        }
        boolean range0sSet2 = range.isEmpty();
        if (!range0sSet2) {
            this.lastK = ((Integer) range.upperEndpoint()).intValue();
        }
    }

    @Override
    public void indent(int indent) {
        this.spacesPending = indent;
    }

    void flush() {
        String lastLine = this.lineBuilder.toString();
        if (!lastLine.isEmpty()) {
            this.mutableLines.add(lastLine);
        }
        int jN = this.mutableLines.size();
        Range<Integer> eofRange = Range.closedOpen(Integer.valueOf(this.f271kN), Integer.valueOf(this.f271kN + 1));
        while (this.range0s.size() < jN) {
            this.range0s.add(Formatter.EMPTY_RANGE);
        }
        this.range0s.add(eofRange);
        while (this.ranges.size() < jN) {
            this.ranges.add(Formatter.EMPTY_RANGE);
        }
        this.ranges.add(eofRange);
        while (this.range1s.size() < jN) {
            this.range1s.add(Formatter.EMPTY_RANGE);
        }
        this.range1s.add(eofRange);
        setLines(ImmutableList.copyOf((Collection) this.mutableLines));
    }

    @Override
    public CommentsHelper getCommentsHelper() {
        return this.commentsHelper;
    }

    public ImmutableList<Replacement> getFormatReplacements(RangeSet<Integer> iRangeSet0) {
        Map<Integer, Range<Integer>> kToJ;
        JavaOutput javaOutput = this;
        ImmutableList.Builder<Replacement> result = ImmutableList.builder();
        Map<Integer, Range<Integer>> kToJ2 = makeKToIJ(javaOutput, javaOutput.f271kN);
        RangeSet<Integer> breakableRanges = TreeRangeSet.create();
        for (Range<Integer> iRange : iRangeSet0.subRangeSet(Range.closed(0, Integer.valueOf(javaOutput.javaInput.getkN()))).asRanges()) {
            Range<Integer> range = javaOutput.expandToBreakableRegions(iRange.canonical(DiscreteDomain.integers()));
            if (!range.equals(EMPTY_RANGE)) {
                breakableRanges.mo129add(range);
            }
        }
        Iterator it = breakableRanges.asRanges().iterator();
        while (it.hasNext()) {
            Range<Integer> range2 = (Range) it.next();
            Input.InterfaceC0532Tok startTok = startTok(javaOutput.javaInput.getToken(((Integer) range2.lowerEndpoint()).intValue()));
            Input.InterfaceC0532Tok endTok = endTok(javaOutput.javaInput.getToken(((Integer) range2.upperEndpoint()).intValue() - 1));
            StringBuilder replacement = new StringBuilder();
            int replaceFrom = startTok.getPosition();
            while (replaceFrom > 0) {
                char previous = javaOutput.javaInput.getText().charAt(replaceFrom - 1);
                if (!CharMatcher.whitespace().matches(previous)) {
                    break;
                }
                replaceFrom--;
            }
            int i = ((Integer) kToJ2.get(Integer.valueOf(startTok.getIndex())).lowerEndpoint()).intValue();
            while (i > 0 && javaOutput.getLine(i - 1).isEmpty()) {
                i--;
            }
            while (i < ((Integer) kToJ2.get(Integer.valueOf(endTok.getIndex())).upperEndpoint()).intValue()) {
                if (i < getLineCount()) {
                    if (i > 0) {
                        replacement.append(javaOutput.lineSeparator);
                    }
                    replacement.append(javaOutput.getLine(i));
                }
                i++;
            }
            int replaceTo = Math.min(endTok.getPosition() + endTok.length(), javaOutput.javaInput.getText().length());
            if (endTok.getIndex() == javaOutput.javaInput.getkN() - 1) {
                replaceTo = javaOutput.javaInput.getText().length();
            }
            int newline = -1;
            while (true) {
                kToJ = kToJ2;
                if (replaceTo >= javaOutput.javaInput.getText().length()) {
                    break;
                }
                char next = javaOutput.javaInput.getText().charAt(replaceTo);
                if (!CharMatcher.whitespace().matches(next)) {
                    break;
                }
                int newlineLength = Newlines.hasNewlineAt(javaOutput.javaInput.getText(), replaceTo);
                RangeSet<Integer> breakableRanges2 = breakableRanges;
                if (newlineLength != -1) {
                    int newline2 = replaceTo;
                    replaceTo += newlineLength;
                    newline = newline2;
                } else {
                    replaceTo++;
                }
                kToJ2 = kToJ;
                breakableRanges = breakableRanges2;
            }
            if (newline != -1) {
                replaceTo = newline;
            }
            if (newline == -1) {
                replacement.append(javaOutput.lineSeparator);
            }
            while (i < getLineCount()) {
                String after = javaOutput.getLine(i);
                if (after.isEmpty()) {
                    replacement.append(javaOutput.lineSeparator);
                    i++;
                } else {
                    if (newline != -1) {
                        break;
                    }
                    int idx = CharMatcher.whitespace().negate().indexIn(after);
                    replacement.append(after.substring(0, idx));
                    break;
                }
            }
            result.mo158add(Replacement.create(replaceFrom, replaceTo, replacement.toString()));
            javaOutput = this;
            kToJ2 = kToJ;
            breakableRanges = breakableRanges;
        }
        return result.build();
    }

    private Range<Integer> expandToBreakableRegions(Range<Integer> iRange) {
        int loTok = ((Integer) iRange.lowerEndpoint()).intValue();
        int hiTok = ((Integer) iRange.upperEndpoint()).intValue() - 1;
        if (!this.partialFormatRanges.contains(Integer.valueOf(loTok)) || !this.partialFormatRanges.contains(Integer.valueOf(hiTok))) {
            return EMPTY_RANGE;
        }
        return Range.closedOpen(Integer.valueOf(((Integer) this.partialFormatRanges.rangeContaining(Integer.valueOf(loTok)).lowerEndpoint()).intValue()), Integer.valueOf(((Integer) this.partialFormatRanges.rangeContaining(Integer.valueOf(hiTok)).upperEndpoint()).intValue() + 1));
    }

    private boolean isComment(String text) {
        return text.startsWith("//") || text.startsWith("/*");
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).m91add("iLine", this.iLine).m91add("lastK", this.lastK).m91add("spacesPending", this.spacesPending).m91add("newlinesPending", this.newlinesPending).m93add("blankLines", this.blankLines).m93add("super", super.toString()).toString();
    }
}
