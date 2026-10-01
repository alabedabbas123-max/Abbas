package com.google.googlejavaformat.java;

import com.google.common.base.Charsets;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import com.google.common.io.CharSink;
import com.google.common.io.CharSource;
import com.google.googlejavaformat.AbstractDoc;
import com.google.googlejavaformat.DocBuilder;
import com.google.googlejavaformat.FormattingError;
import com.google.googlejavaformat.Newlines;
import com.google.googlejavaformat.OpsBuilder;
import com.sun.source.tree.Tree;
import com.sun.tools.javac.file.JavacFileManager;
import com.sun.tools.javac.parser.Parser;
import com.sun.tools.javac.parser.ParserFactory;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.Options;
import java.io.IOError;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.DiagnosticListener;
import javax.tools.JavaFileObject;
import javax.tools.SimpleJavaFileObject;
import javax.tools.StandardLocation;

public final class Formatter {
    static final Range<Integer> EMPTY_RANGE = Range.closedOpen(-1, -1);
    static final Predicate<Diagnostic<?>> ERROR_DIAGNOSTIC = new Predicate<Diagnostic<?>>() {
        @Override
        public boolean apply(Diagnostic<?> input) {
            if (input.getKind() != Diagnostic.Kind.ERROR) {
                return false;
            }
            String code = input.getCode();
            byte b = -1;
            if (code.hashCode() == 1084466472 && code.equals("compiler.err.invalid.meth.decl.ret.type.req")) {
                b = 0;
            }
            return b != 0;
        }
    };
    private final JavaFormatterOptions options;

    public Formatter() {
        this(JavaFormatterOptions.defaultOptions());
    }

    public Formatter(JavaFormatterOptions options) {
        this.options = options;
    }

    static void format(final JavaInput javaInput, JavaOutput javaOutput, JavaFormatterOptions options) {
        Context context = new Context();
        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
        context.m506put((Class<DiagnosticCollector<JavaFileObject>>) DiagnosticListener.class, diagnostics);
        Options.instance(context).m517put("allowStringFolding", "false");
        JavacFileManager fileManager = new JavacFileManager(context, true, Charsets.UTF_8);
        try {
            fileManager.setLocation(StandardLocation.PLATFORM_CLASS_PATH, ImmutableList.m160of());
            SimpleJavaFileObject source = new SimpleJavaFileObject(URI.create("source"), JavaFileObject.Kind.SOURCE) {
                @Override
                public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {
                    return javaInput.getText();
                }
            };
            Log.instance(context).useSource(source);
            ParserFactory parserFactory = ParserFactory.instance(context);
            Parser parser = parserFactory.newParser(javaInput.getText(), true, true, true);
            JCTree.JCCompilationUnit unit = parser.parseCompilationUnit();
            unit.sourcefile = source;
            javaInput.setCompilationUnit(unit);
            Iterable<Diagnostic<? extends JavaFileObject>> errorDiagnostics = Iterables.filter(diagnostics.getDiagnostics(), ERROR_DIAGNOSTIC);
            if (Iterables.isEmpty(errorDiagnostics)) {
                OpsBuilder builder = new OpsBuilder(javaInput, javaOutput);
                new JavaInputAstVisitor(builder, options.indentationMultiplier()).scan((Tree) unit, (Void) null);
                builder.sync(javaInput.getText().length());
                builder.drain();
                AbstractDoc doc = new DocBuilder().withOps(builder.build()).build();
                doc.computeBreaks(javaOutput.getCommentsHelper(), options.maxLineLength(), new AbstractDoc.State(0, 0));
                doc.write(javaOutput);
                javaOutput.flush();
                return;
            }
            throw FormattingError.fromJavacDiagnostics(errorDiagnostics);
        } catch (IOException e) {
            throw new IOError(e);
        }
    }

    public static RangeSet<Integer> lineRangesToCharRanges(String input, RangeSet<Integer> lineRanges) {
        List<Integer> lines = new ArrayList<>();
        Iterators.addAll(lines, Newlines.lineOffsetIterator(input));
        lines.add(Integer.valueOf(input.length() + 1));
        RangeSet<Integer> characterRanges = TreeRangeSet.create();
        for (Range<Integer> lineRange : lineRanges.subRangeSet(Range.closedOpen(0, Integer.valueOf(lines.size() - 1))).asRanges()) {
            int lineStart = lines.get(((Integer) lineRange.lowerEndpoint()).intValue()).intValue();
            int lineEnd = lines.get(((Integer) lineRange.upperEndpoint()).intValue()).intValue() - 1;
            Range<Integer> range = Range.closedOpen(Integer.valueOf(lineStart), Integer.valueOf(lineEnd));
            characterRanges.mo129add(range);
        }
        return characterRanges;
    }

    public void formatSource(CharSource input, CharSink output) throws Throwable {
        output.write(formatSource(input.read()));
    }

    public String formatSource(String input) throws FormatterException {
        return formatSource(input, Collections.singleton(Range.closedOpen(0, Integer.valueOf(input.length()))));
    }

    public String formatSource(String input, Collection<Range<Integer>> characterRanges) throws FormatterException {
        return JavaOutput.applyReplacements(input, getFormatReplacements(input, characterRanges));
    }

    public ImmutableList<Replacement> getFormatReplacements(String input, Collection<Range<Integer>> characterRanges) throws FormatterException {
        JavaInput javaInput = ModifierOrderer.reorderModifiers(new JavaInput(input), characterRanges);
        String lineSeparator = Newlines.guessLineSeparator(input);
        JavaOutput javaOutput = new JavaOutput(lineSeparator, javaInput, new JavaCommentsHelper(lineSeparator, this.options));
        try {
            format(javaInput, javaOutput, this.options);
            RangeSet<Integer> tokenRangeSet = javaInput.characterRangesToTokenRanges(characterRanges);
            return javaOutput.getFormatReplacements(tokenRangeSet);
        } catch (FormattingError e) {
            throw new FormatterException(e.diagnostics());
        }
    }
}
