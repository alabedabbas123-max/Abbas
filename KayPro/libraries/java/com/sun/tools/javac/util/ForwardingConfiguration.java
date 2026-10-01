package com.sun.tools.javac.util;

import com.sun.tools.javac.api.DiagnosticFormatter;
import java.util.Set;

public class ForwardingConfiguration implements DiagnosticFormatter.Configuration {
    protected DiagnosticFormatter.Configuration configuration;

    public ForwardingConfiguration(DiagnosticFormatter.Configuration configuration) {
        this.configuration = configuration;
    }

    public DiagnosticFormatter.Configuration getDelegatedConfiguration() {
        return this.configuration;
    }

    @Override
    public int getMultilineLimit(DiagnosticFormatter.Configuration.MultilineLimit limit) {
        return this.configuration.getMultilineLimit(limit);
    }

    @Override
    public Set<DiagnosticFormatter.Configuration.DiagnosticPart> getVisible() {
        return this.configuration.getVisible();
    }

    @Override
    public void setMultilineLimit(DiagnosticFormatter.Configuration.MultilineLimit limit, int value) {
        this.configuration.setMultilineLimit(limit, value);
    }

    @Override
    public void setVisible(Set<DiagnosticFormatter.Configuration.DiagnosticPart> diagParts) {
        this.configuration.setVisible(diagParts);
    }
}
