package com.google.googlejavaformat;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.util.Locale;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;

public class FormattingError extends Error {
    private static final Function<Diagnostic<?>, FormatterDiagnostic> TO_FORMATTER_DIAGNOSTIC = new Function<Diagnostic<?>, FormatterDiagnostic>() {
        @Override
        public FormatterDiagnostic apply(Diagnostic<?> input) {
            return FormatterDiagnostic.create((int) input.getLineNumber(), (int) input.getColumnNumber(), input.getMessage(Locale.ENGLISH));
        }
    };
    private final ImmutableList<FormatterDiagnostic> diagnostics;

    public FormattingError(FormatterDiagnostic diagnostic) {
        this(ImmutableList.m161of(diagnostic));
    }

    public FormattingError(Iterable<FormatterDiagnostic> diagnostics) {
        super(Joiner.m87on("\n").join(diagnostics) + "\n");
        this.diagnostics = ImmutableList.copyOf(diagnostics);
    }

    public ImmutableList<FormatterDiagnostic> diagnostics() {
        return this.diagnostics;
    }

    public static FormattingError fromJavacDiagnostics(Iterable<Diagnostic<? extends JavaFileObject>> diagnostics) {
        return new FormattingError((Iterable<FormatterDiagnostic>) Iterables.transform(diagnostics, TO_FORMATTER_DIAGNOSTIC));
    }
}
