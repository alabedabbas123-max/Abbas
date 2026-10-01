package com.sun.tools.javac.util;

import com.sun.tools.javac.code.Lint;
import java.util.HashSet;
import java.util.Set;
import javax.tools.JavaFileObject;

public class MandatoryWarningHandler {
    private Object deferredDiagnosticArg;
    private DeferredDiagnosticKind deferredDiagnosticKind;
    private JavaFileObject deferredDiagnosticSource;
    private final boolean enforceMandatory;
    private final Lint.LintCategory lintCategory;

    private Log f572log;
    private String prefix;
    private Set<JavaFileObject> sourcesWithReportedWarnings;
    private boolean verbose;

    private enum DeferredDiagnosticKind {
        IN_FILE(".filename"),
        ADDITIONAL_IN_FILE(".filename.additional"),
        IN_FILES(".plural"),
        ADDITIONAL_IN_FILES(".plural.additional");

        private String value;

        DeferredDiagnosticKind(String v) {
            this.value = v;
        }

        String getKey(String prefix) {
            return prefix + this.value;
        }
    }

    public MandatoryWarningHandler(Log log, boolean verbose, boolean enforceMandatory, String prefix, Lint.LintCategory lc) {
        this.f572log = log;
        this.verbose = verbose;
        this.prefix = prefix;
        this.enforceMandatory = enforceMandatory;
        this.lintCategory = lc;
    }

    public void report(JCDiagnostic.DiagnosticPosition pos, String msg, Object... args) {
        JavaFileObject currentSource = this.f572log.currentSourceFile();
        if (this.verbose) {
            if (this.sourcesWithReportedWarnings == null) {
                this.sourcesWithReportedWarnings = new HashSet();
            }
            if (this.f572log.nwarnings < this.f572log.MaxWarnings) {
                logMandatoryWarning(pos, msg, args);
                this.sourcesWithReportedWarnings.add(currentSource);
                return;
            }
            DeferredDiagnosticKind deferredDiagnosticKind = this.deferredDiagnosticKind;
            if (deferredDiagnosticKind == null) {
                if (this.sourcesWithReportedWarnings.contains(currentSource)) {
                    this.deferredDiagnosticKind = DeferredDiagnosticKind.ADDITIONAL_IN_FILE;
                } else {
                    this.deferredDiagnosticKind = DeferredDiagnosticKind.IN_FILE;
                }
                this.deferredDiagnosticSource = currentSource;
                this.deferredDiagnosticArg = currentSource;
                return;
            }
            if ((deferredDiagnosticKind == DeferredDiagnosticKind.IN_FILE || this.deferredDiagnosticKind == DeferredDiagnosticKind.ADDITIONAL_IN_FILE) && !equal(this.deferredDiagnosticSource, currentSource)) {
                this.deferredDiagnosticKind = DeferredDiagnosticKind.ADDITIONAL_IN_FILES;
                this.deferredDiagnosticArg = null;
                return;
            }
            return;
        }
        DeferredDiagnosticKind deferredDiagnosticKind2 = this.deferredDiagnosticKind;
        if (deferredDiagnosticKind2 == null) {
            this.deferredDiagnosticKind = DeferredDiagnosticKind.IN_FILE;
            this.deferredDiagnosticSource = currentSource;
            this.deferredDiagnosticArg = currentSource;
        } else if (deferredDiagnosticKind2 == DeferredDiagnosticKind.IN_FILE && !equal(this.deferredDiagnosticSource, currentSource)) {
            this.deferredDiagnosticKind = DeferredDiagnosticKind.IN_FILES;
            this.deferredDiagnosticArg = null;
        }
    }

    public void reportDeferredDiagnostic() {
        DeferredDiagnosticKind deferredDiagnosticKind = this.deferredDiagnosticKind;
        if (deferredDiagnosticKind != null) {
            if (this.deferredDiagnosticArg == null) {
                logMandatoryNote(this.deferredDiagnosticSource, deferredDiagnosticKind.getKey(this.prefix), new Object[0]);
            } else {
                logMandatoryNote(this.deferredDiagnosticSource, deferredDiagnosticKind.getKey(this.prefix), this.deferredDiagnosticArg);
            }
            if (!this.verbose) {
                logMandatoryNote(this.deferredDiagnosticSource, this.prefix + ".recompile", new Object[0]);
            }
        }
    }

    private static boolean equal(Object o1, Object o2) {
        if (o1 == null || o2 == null) {
            return o1 == o2;
        }
        return o1.equals(o2);
    }

    private void logMandatoryWarning(JCDiagnostic.DiagnosticPosition pos, String msg, Object... args) {
        if (this.enforceMandatory) {
            this.f572log.mandatoryWarning(this.lintCategory, pos, msg, args);
        } else {
            this.f572log.warning(this.lintCategory, pos, msg, args);
        }
    }

    private void logMandatoryNote(JavaFileObject file, String msg, Object... args) {
        if (this.enforceMandatory) {
            this.f572log.mandatoryNote(file, msg, args);
        } else {
            this.f572log.note(file, msg, args);
        }
    }
}
