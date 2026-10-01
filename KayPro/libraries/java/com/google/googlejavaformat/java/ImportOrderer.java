package com.google.googlejavaformat.java;

import com.google.common.base.CharMatcher;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.UnmodifiableIterator;
import com.google.googlejavaformat.Newlines;
import com.google.googlejavaformat.java.javac.parser.Tokens;
import java.util.ArrayList;
import java.util.List;

public class ImportOrderer {
    static final boolean $assertionsDisabled = false;
    private static final ImmutableSet<Tokens.TokenKind> CLASS_START = ImmutableSet.m214of(Tokens.TokenKind.CLASS, Tokens.TokenKind.INTERFACE, Tokens.TokenKind.ENUM);
    private static final ImmutableSet<String> IMPORT_OR_CLASS_START = ImmutableSet.m215of("import", "class", "interface", "enum");
    private final String lineSeparator;
    private final String text;
    private final ImmutableList<JavaInput.C0540Tok> toks;

    private ImportOrderer(String text, ImmutableList<JavaInput.C0540Tok> toks) throws FormatterException {
        this.text = text;
        this.toks = toks;
        this.lineSeparator = Newlines.guessLineSeparator(text);
    }

    public static String reorderImports(String text) throws FormatterException {
        ImmutableList<JavaInput.C0540Tok> toks = JavaInput.buildToks(text, CLASS_START);
        return new ImportOrderer(text, toks).reorderImports();
    }

    private String reorderImports() throws FormatterException {
        Optional<Integer> maybeFirstImport = findIdentifier(0, IMPORT_OR_CLASS_START);
        if (!maybeFirstImport.isPresent() || !tokenAt(maybeFirstImport.mo75get().intValue()).equals("import")) {
            return this.text;
        }
        int firstImportStart = maybeFirstImport.mo75get().intValue();
        int unindentedFirstImportStart = unindent(firstImportStart);
        ImportsAndIndex imports = scanImports(firstImportStart);
        int afterLastImport = imports.index;
        Optional<Integer> maybeLaterImport = findIdentifier(afterLastImport, IMPORT_OR_CLASS_START);
        if (maybeLaterImport.isPresent() && tokenAt(maybeLaterImport.mo75get().intValue()).equals("import")) {
            throw new FormatterException("Imports not contiguous (perhaps a comment separates them?)");
        }
        StringBuilder result = new StringBuilder();
        result.append(CharMatcher.whitespace().trimTrailingFrom(tokString(0, unindentedFirstImportStart)));
        if (result.length() > 0) {
            result.append(this.lineSeparator);
            result.append(this.lineSeparator);
        }
        result.append(reorderedImportsString(imports.imports));
        List<String> tail = new ArrayList<>();
        tail.add(CharMatcher.whitespace().trimLeadingFrom(tokString(afterLastImport, this.toks.size())));
        if (!this.toks.isEmpty()) {
            JavaInput.C0540Tok lastTok = (JavaInput.C0540Tok) Iterables.getLast(this.toks);
            int tailStart = lastTok.getPosition() + lastTok.length();
            tail.add(this.text.substring(tailStart));
        }
        for (String s : tail) {
            if (!s.isEmpty()) {
                result.append(this.lineSeparator);
                for (String s1 : tail) {
                    result.append(s1);
                }
                break;
            }
        }
        return result.toString();
    }

    private String tokString(int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(this.toks.get(i).getOriginalText());
        }
        return sb.toString();
    }

    private ImportsAndIndex scanImports(int i) throws FormatterException {
        int afterLastImport = i;
        ImmutableSortedSet.Builder<Import> imports = ImmutableSortedSet.naturalOrder();
        while (i < this.toks.size() && tokenAt(i).equals("import")) {
            int i2 = i + 1;
            if (isSpaceToken(i2)) {
                i2++;
            }
            boolean isStatic = tokenAt(i2).equals("static");
            if (isStatic) {
                i2++;
                if (isSpaceToken(i2)) {
                    i2++;
                }
            }
            if (!isIdentifierToken(i2)) {
                throw new FormatterException("Unexpected token after import: " + tokenAt(i2));
            }
            StringAndIndex imported = scanImported(i2);
            String importedName = imported.string;
            int i3 = imported.index;
            if (isSpaceToken(i3)) {
                i3++;
            }
            if (!tokenAt(i3).equals(";")) {
                throw new FormatterException("Expected ; after import");
            }
            while (tokenAt(i3).equals(";")) {
                i3++;
            }
            StringBuilder trailing = new StringBuilder();
            if (isSpaceToken(i3)) {
                trailing.append(tokenAt(i3));
                i3++;
            }
            if (isSlashSlashCommentToken(i3)) {
                trailing.append(tokenAt(i3));
                i3++;
            }
            if (!isNewlineToken(i3)) {
                throw new FormatterException("Extra tokens after import: " + tokenAt(i3));
            }
            trailing.append(tokenAt(i3));
            i = i3 + 1;
            imports.mo158add(new Import(importedName, trailing.toString(), isStatic));
            while (true) {
                if (isNewlineToken(i) || isSpaceToken(i)) {
                    i++;
                }
            }
            afterLastImport = i;
        }
        return new ImportsAndIndex(imports.build(), afterLastImport);
    }

    private String reorderedImportsString(ImmutableSortedSet<Import> imports) {
        Import firstImport = imports.iterator().next();
        boolean lastWasStatic = firstImport.isStatic;
        StringBuilder sb = new StringBuilder();
        UnmodifiableIterator<Import> it = imports.iterator();
        while (it.hasNext()) {
            Import thisImport = it.next();
            if (lastWasStatic && !thisImport.isStatic) {
                sb.append(this.lineSeparator);
            }
            lastWasStatic = thisImport.isStatic;
            sb.append(thisImport);
        }
        return sb.toString();
    }

    private StringAndIndex scanImported(int start) throws FormatterException {
        int i = start;
        StringBuilder imported = new StringBuilder();
        do {
            imported.append(tokenAt(i));
            int i2 = i + 1;
            if (!tokenAt(i2).equals(".")) {
                return new StringAndIndex(imported.toString(), i2);
            }
            imported.append('.');
            i = i2 + 1;
            if (tokenAt(i).equals("*")) {
                imported.append('*');
                return new StringAndIndex(imported.toString(), i + 1);
            }
        } while (isIdentifierToken(i));
        throw new FormatterException("Could not parse imported name, at: " + tokenAt(i));
    }

    private Optional<Integer> findIdentifier(int start, ImmutableSet<String> identifiers) {
        for (int i = start; i < this.toks.size(); i++) {
            if (isIdentifierToken(i)) {
                String id = tokenAt(i);
                if (identifiers.contains(id)) {
                    return Optional.m95of(Integer.valueOf(i));
                }
            }
        }
        return Optional.absent();
    }

    private int unindent(int i) {
        if (i > 0 && isSpaceToken(i - 1)) {
            return i - 1;
        }
        return i;
    }

    private String tokenAt(int i) {
        return this.toks.get(i).getOriginalText();
    }

    private boolean isIdentifierToken(int i) {
        String s = tokenAt(i);
        return !s.isEmpty() && Character.isJavaIdentifierStart(s.codePointAt(0));
    }

    private boolean isSpaceToken(int i) {
        String s = tokenAt(i);
        return !s.isEmpty() && " \t\f".indexOf(s.codePointAt(0)) >= 0;
    }

    private boolean isSlashSlashCommentToken(int i) {
        return this.toks.get(i).isSlashSlashComment();
    }

    private boolean isNewlineToken(int i) {
        return this.toks.get(i).isNewline();
    }

    private static class Import implements Comparable<Import> {
        final String imported;
        final boolean isStatic;
        final String trailing;

        Import(String imported, String trailing, boolean isStatic) {
            this.imported = imported;
            this.trailing = trailing;
            this.isStatic = isStatic;
        }

        @Override
        public int compareTo(Import that) {
            boolean z = this.isStatic;
            if (z != that.isStatic) {
                return z ? -1 : 1;
            }
            return this.imported.compareTo(that.imported);
        }

        public String toString() {
            String staticString = this.isStatic ? "static " : "";
            return "import " + staticString + this.imported + ";" + this.trailing;
        }
    }

    private static class ImportsAndIndex {
        final ImmutableSortedSet<Import> imports;
        final int index;

        ImportsAndIndex(ImmutableSortedSet<Import> imports, int index) {
            this.imports = imports;
            this.index = index;
        }
    }

    private static class StringAndIndex {
        private final int index;
        private final String string;

        StringAndIndex(String string, int index) {
            this.string = string;
            this.index = index;
        }
    }
}
