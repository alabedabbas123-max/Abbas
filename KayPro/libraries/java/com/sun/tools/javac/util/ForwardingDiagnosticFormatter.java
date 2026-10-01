package com.sun.tools.javac.util;

import com.sun.tools.javac.api.DiagnosticFormatter;
import java.util.Locale;
import javax.tools.Diagnostic;

public class ForwardingDiagnosticFormatter<D extends Diagnostic<?>, F extends DiagnosticFormatter<D>> implements DiagnosticFormatter<D> {
    protected ForwardingConfiguration configuration;
    protected F formatter;

    public ForwardingDiagnosticFormatter(F formatter) {
        this.formatter = formatter;
        this.configuration = new ForwardingConfiguration(formatter.getConfiguration());
    }

    public F getDelegatedFormatter() {
        return this.formatter;
    }

    @Override
    public DiagnosticFormatter.Configuration getConfiguration() {
        return this.configuration;
    }

    @Override
    public boolean displaySource(D diag) {
        return this.formatter.displaySource(diag);
    }

    @Override
    public String format(D diag, Locale l) {
        return this.formatter.format(diag, l);
    }

    @Override
    public String formatKind(D diag, Locale l) {
        return this.formatter.formatKind(diag, l);
    }

    @Override
    public String formatMessage(D diag, Locale l) {
        return this.formatter.formatMessage(diag, l);
    }

    @Override
    public String formatPosition(D diag, DiagnosticFormatter.PositionKind pk, Locale l) {
        return this.formatter.formatPosition(diag, pk, l);
    }

    @Override
    public String formatSource(D diag, boolean fullname, Locale l) {
        return this.formatter.formatSource(diag, fullname, l);
    }
}
