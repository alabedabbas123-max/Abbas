package com.sun.tools.javac.util;

import java.util.EnumSet;

public class RichConfiguration extends ForwardingConfiguration {
    protected EnumSet<RichFormatterFeature> features;

    public enum RichFormatterFeature {
        WHERE_CLAUSES,
        SIMPLE_NAMES,
        UNIQUE_TYPEVAR_NAMES
    }

    public RichConfiguration(Options options, AbstractDiagnosticFormatter formatter) {
        super(formatter.getConfiguration());
        this.features = formatter.isRaw() ? EnumSet.noneOf(RichFormatterFeature.class) : EnumSet.of(RichFormatterFeature.SIMPLE_NAMES, RichFormatterFeature.WHERE_CLAUSES, RichFormatterFeature.UNIQUE_TYPEVAR_NAMES);
        String diagOpts = options.m515get("diags");
        if (diagOpts != null) {
            for (String args : diagOpts.split(",")) {
                if (args.equals("-where")) {
                    this.features.remove(RichFormatterFeature.WHERE_CLAUSES);
                } else if (args.equals("where")) {
                    this.features.add(RichFormatterFeature.WHERE_CLAUSES);
                }
                if (args.equals("-simpleNames")) {
                    this.features.remove(RichFormatterFeature.SIMPLE_NAMES);
                } else if (args.equals("simpleNames")) {
                    this.features.add(RichFormatterFeature.SIMPLE_NAMES);
                }
                if (args.equals("-disambiguateTvars")) {
                    this.features.remove(RichFormatterFeature.UNIQUE_TYPEVAR_NAMES);
                } else if (args.equals("disambiguateTvars")) {
                    this.features.add(RichFormatterFeature.UNIQUE_TYPEVAR_NAMES);
                }
            }
        }
    }

    public RichFormatterFeature[] getAvailableFeatures() {
        return RichFormatterFeature.values();
    }

    public void enable(RichFormatterFeature feature) {
        this.features.add(feature);
    }

    public void disable(RichFormatterFeature feature) {
        this.features.remove(feature);
    }

    public boolean isEnabled(RichFormatterFeature feature) {
        return this.features.contains(feature);
    }
}
