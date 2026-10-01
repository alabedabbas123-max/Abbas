package com.google.googlejavaformat;

import com.google.common.base.CharMatcher;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Newlines {
    private static final ImmutableSet<String> BREAKS = ImmutableSet.m214of("\r\n", "\n", "\r");

    public static int count(String input) {
        return Iterators.size(lineOffsetIterator(input)) - 1;
    }

    public static int firstBreak(String input) {
        Iterator<Integer> it = lineOffsetIterator(input);
        it.next();
        if (it.hasNext()) {
            return it.next().intValue();
        }
        return -1;
    }

    public static boolean isNewline(String input) {
        return BREAKS.contains(input);
    }

    public static int hasNewlineAt(String input, int idx) {
        UnmodifiableIterator<String> it = BREAKS.iterator();
        while (it.hasNext()) {
            String b = it.next();
            if (input.startsWith(b, idx)) {
                return b.length();
            }
        }
        return -1;
    }

    public static String getLineEnding(String input) {
        UnmodifiableIterator<String> it = BREAKS.iterator();
        while (it.hasNext()) {
            String b = it.next();
            if (input.endsWith(b)) {
                return b;
            }
        }
        return null;
    }

    public static String guessLineSeparator(String text) {
        char c;
        for (int i = 0; i < text.length() && (c = text.charAt(i)) != '\n'; i++) {
            if (c == '\r') {
                if (i + 1 < text.length() && text.charAt(i + 1) == '\n') {
                    return "\r\n";
                }
                return "\r";
            }
        }
        return "\n";
    }

    public static boolean containsBreaks(String text) {
        return CharMatcher.anyOf("\n\r").matchesAnyOf(text);
    }

    public static Iterator<Integer> lineOffsetIterator(String input) {
        return new LineOffsetIterator(input);
    }

    public static Iterator<String> lineIterator(String input) {
        return new LineIterator(input);
    }

    private static class LineOffsetIterator implements Iterator<Integer> {
        private int curr;

        private int f245idx;
        private final String input;

        private LineOffsetIterator(String input) {
            this.curr = 0;
            this.f245idx = 0;
            this.input = input;
        }

        @Override
        public boolean hasNext() {
            return this.curr != -1;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public Integer next() {
            if (this.curr == -1) {
                throw new NoSuchElementException();
            }
            int result = this.curr;
            advance();
            return Integer.valueOf(result);
        }

        private void advance() {
            while (this.f245idx < this.input.length()) {
                char c = this.input.charAt(this.f245idx);
                if (c != '\n') {
                    if (c != '\r') {
                        this.f245idx++;
                    } else if (this.f245idx + 1 < this.input.length() && this.input.charAt(this.f245idx + 1) == '\n') {
                        this.f245idx++;
                    }
                }
                int i = this.f245idx + 1;
                this.f245idx = i;
                this.curr = i;
                return;
            }
            this.curr = -1;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    private static class LineIterator implements Iterator<String> {
        String curr;

        int f244idx;
        private final Iterator<Integer> indices;
        private final String input;

        private LineIterator(String input) {
            this.input = input;
            Iterator<Integer> itLineOffsetIterator = Newlines.lineOffsetIterator(input);
            this.indices = itLineOffsetIterator;
            this.f244idx = itLineOffsetIterator.next().intValue();
        }

        private void advance() {
            int last = this.f244idx;
            if (this.indices.hasNext()) {
                this.f244idx = this.indices.next().intValue();
            } else if (hasNext()) {
                this.f244idx = this.input.length();
            } else {
                throw new NoSuchElementException();
            }
            this.curr = this.input.substring(last, this.f244idx);
        }

        @Override
        public boolean hasNext() {
            return this.f244idx < this.input.length();
        }

        @Override
        public String next() {
            advance();
            return this.curr;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }
}
