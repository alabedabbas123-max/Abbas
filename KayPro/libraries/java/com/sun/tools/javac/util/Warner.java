package com.sun.tools.javac.util;

import com.sun.tools.javac.code.Lint;
import java.util.EnumSet;

public class Warner {
    public static final Warner noWarnings = new Warner();
    private EnumSet<Lint.LintCategory> nonSilentLintSet;

    private JCDiagnostic.DiagnosticPosition f581pos;
    private EnumSet<Lint.LintCategory> silentLintSet;
    protected boolean warned;

    public JCDiagnostic.DiagnosticPosition m520pos() {
        return this.f581pos;
    }

    public void warn(Lint.LintCategory lint) {
        this.nonSilentLintSet.add(lint);
    }

    public void silentWarn(Lint.LintCategory lint) {
        this.silentLintSet.add(lint);
    }

    public Warner(JCDiagnostic.DiagnosticPosition pos) {
        this.f581pos = null;
        this.warned = false;
        this.nonSilentLintSet = EnumSet.noneOf(Lint.LintCategory.class);
        this.silentLintSet = EnumSet.noneOf(Lint.LintCategory.class);
        this.f581pos = pos;
    }

    public boolean hasSilentLint(Lint.LintCategory lint) {
        return this.silentLintSet.contains(lint);
    }

    public boolean hasNonSilentLint(Lint.LintCategory lint) {
        return this.nonSilentLintSet.contains(lint);
    }

    public boolean hasLint(Lint.LintCategory lint) {
        return hasSilentLint(lint) || hasNonSilentLint(lint);
    }

    public void clear() {
        this.nonSilentLintSet.clear();
        this.silentLintSet.clear();
        this.warned = false;
    }

    public Warner() {
        this(null);
    }
}
