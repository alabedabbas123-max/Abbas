package com.google.googlejavaformat.java;

import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import java.util.ArrayList;
import java.util.List;

public class SnippetFormatter {
    private static final int INDENTATION_SIZE = 2;
    private static final CharMatcher NOT_WHITESPACE = CharMatcher.whitespace().negate();
    private final Formatter formatter = new Formatter();

    public enum SnippetKind {
        COMPILATION_UNIT,
        CLASS_BODY_DECLARATIONS,
        STATEMENTS,
        EXPRESSION
    }

    private static Range<Integer> offsetRange(Range<Integer> range, int offset) {
        Range<C> rangeCanonical = range.canonical(DiscreteDomain.integers());
        return Range.closedOpen(Integer.valueOf(((Integer) rangeCanonical.lowerEndpoint()).intValue() + offset), Integer.valueOf(((Integer) rangeCanonical.upperEndpoint()).intValue() + offset));
    }

    private static List<Range<Integer>> offsetRanges(List<Range<Integer>> ranges, int offset) {
        List<Range<Integer>> result = new ArrayList<>();
        for (Range<Integer> range : ranges) {
            result.add(offsetRange(range, offset));
        }
        return result;
    }

    private static List<Replacement> toReplacements(String source, String replacement) {
        if (!NOT_WHITESPACE.retainFrom(source).equals(NOT_WHITESPACE.retainFrom(replacement))) {
            throw new IllegalArgumentException("source = \"" + source + "\", replacement = \"" + replacement + "\"");
        }
        List<Replacement> replacements = new ArrayList<>();
        int i = NOT_WHITESPACE.indexIn(source);
        int j = NOT_WHITESPACE.indexIn(replacement);
        if (i != 0 || j != 0) {
            replacements.add(Replacement.create(Range.closedOpen(0, Integer.valueOf(i)), replacement.substring(0, j)));
        }
        while (i != -1 && j != -1) {
            int i2 = NOT_WHITESPACE.indexIn(source, i + 1);
            int j2 = NOT_WHITESPACE.indexIn(replacement, j + 1);
            if (i2 == -1 || j2 == -1) {
                break;
            }
            if (i2 - i != j2 - j || !source.substring(i + 1, i2).equals(replacement.substring(j + 1, j2))) {
                replacements.add(Replacement.create(Range.closedOpen(Integer.valueOf(i + 1), Integer.valueOf(i2)), replacement.substring(j + 1, j2)));
            }
            i = i2;
            j = j2;
        }
        return replacements;
    }

    public String createIndentationString(int indentationLevel) {
        Preconditions.checkArgument(indentationLevel >= 0, "Indentation level cannot be less than zero. Given: %s", indentationLevel);
        int spaces = indentationLevel * 2;
        StringBuilder buf = new StringBuilder(spaces);
        for (int i = 0; i < spaces; i++) {
            buf.append(' ');
        }
        return buf.toString();
    }

    public List<Replacement> format(SnippetKind kind, String source, List<Range<Integer>> ranges, int initialIndent, boolean includeComments) throws FormatterException {
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        for (Range<Integer> range : ranges) {
            rangeSet.mo129add(range);
        }
        if (includeComments) {
            if (kind != SnippetKind.COMPILATION_UNIT) {
                throw new IllegalArgumentException("comment formatting is only supported for compilation units");
            }
            return this.formatter.getFormatReplacements(source, ranges);
        }
        SnippetWrapper wrapper = snippetWrapper(kind, source, initialIndent);
        String replacement = this.formatter.formatSource(wrapper.contents.toString(), offsetRanges(ranges, wrapper.offset));
        List<Replacement> replacements = toReplacements(source, replacement.substring(wrapper.offset, replacement.length() - ((wrapper.contents.length() - wrapper.offset) - source.length())));
        List<Replacement> filtered = new ArrayList<>();
        for (Replacement r : replacements) {
            if (rangeSet.encloses(r.getReplaceRange())) {
                filtered.add(r);
            }
        }
        return filtered;
    }

    static class C05461 {

        static final int[] f275x3ca22f12;

        static {
            int[] iArr = new int[SnippetKind.values().length];
            f275x3ca22f12 = iArr;
            try {
                iArr[SnippetKind.COMPILATION_UNIT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f275x3ca22f12[SnippetKind.CLASS_BODY_DECLARATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f275x3ca22f12[SnippetKind.STATEMENTS.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f275x3ca22f12[SnippetKind.EXPRESSION.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    private SnippetWrapper snippetWrapper(SnippetKind kind, String source, int initialIndent) {
        int i = C05461.f275x3ca22f12[kind.ordinal()];
        C05461 c05461 = null;
        if (i == 1) {
            SnippetWrapper wrapper = new SnippetWrapper(this, c05461);
            for (int i2 = 1; i2 <= initialIndent; i2++) {
                wrapper.append("class Dummy {\n").append(createIndentationString(i2));
            }
            wrapper.appendSource(source);
            wrapper.closeBraces(initialIndent);
            return wrapper;
        }
        if (i == 2) {
            SnippetWrapper wrapper2 = new SnippetWrapper(this, c05461);
            for (int i3 = 1; i3 <= initialIndent; i3++) {
                wrapper2.append("class Dummy {\n").append(createIndentationString(i3));
            }
            wrapper2.appendSource(source);
            wrapper2.closeBraces(initialIndent);
            return wrapper2;
        }
        if (i == 3) {
            SnippetWrapper wrapper3 = new SnippetWrapper(this, c05461);
            wrapper3.append("class Dummy {\n").append(createIndentationString(1));
            for (int i4 = 2; i4 <= initialIndent; i4++) {
                wrapper3.append("{\n").append(createIndentationString(i4));
            }
            wrapper3.appendSource(source);
            wrapper3.closeBraces(initialIndent);
            return wrapper3;
        }
        if (i == 4) {
            SnippetWrapper wrapper4 = new SnippetWrapper(this, c05461);
            wrapper4.append("class Dummy {\n").append(createIndentationString(1));
            for (int i5 = 2; i5 <= initialIndent; i5++) {
                wrapper4.append("{\n").append(createIndentationString(i5));
            }
            wrapper4.append("Object o = ");
            wrapper4.appendSource(source);
            wrapper4.append(";");
            wrapper4.closeBraces(initialIndent);
            return wrapper4;
        }
        throw new IllegalArgumentException("Unknown snippet kind: " + kind);
    }

    private class SnippetWrapper {
        final StringBuilder contents;
        int offset;

        private SnippetWrapper() {
            this.contents = new StringBuilder();
        }

        SnippetWrapper(SnippetFormatter x0, C05461 x1) {
            this();
        }

        public SnippetWrapper append(String str) {
            this.contents.append(str);
            return this;
        }

        public SnippetWrapper appendSource(String source) {
            this.offset = this.contents.length();
            this.contents.append(source);
            return this;
        }

        public void closeBraces(int initialIndent) {
            int i = initialIndent;
            while (true) {
                i--;
                if (i >= 0) {
                    StringBuilder sb = this.contents;
                    sb.append("\n");
                    sb.append(SnippetFormatter.this.createIndentationString(i));
                    sb.append("}");
                } else {
                    return;
                }
            }
        }
    }
}
