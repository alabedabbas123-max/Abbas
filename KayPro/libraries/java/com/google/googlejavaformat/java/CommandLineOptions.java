package com.google.googlejavaformat.java;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableRangeSet;

final class CommandLineOptions {
    private final boolean aosp;
    private final ImmutableList<String> files;
    private final boolean fixImportsOnly;
    private final boolean help;
    private final boolean inPlace;
    private final ImmutableList<Integer> lengths;
    private final ImmutableRangeSet<Integer> lines;
    private final ImmutableList<Integer> offsets;
    private final boolean removeJavadocOnlyImports;
    private final boolean removeUnusedImports;
    private final boolean sortImports;
    private final boolean stdin;
    private final boolean version;

    CommandLineOptions(ImmutableList<String> files, boolean inPlace, ImmutableRangeSet<Integer> lines, ImmutableList<Integer> offsets, ImmutableList<Integer> lengths, boolean aosp, boolean version, boolean help, boolean stdin, boolean fixImportsOnly, boolean removeJavadocOnlyImports, boolean sortImports, boolean removeUnusedImports) {
        this.files = files;
        this.inPlace = inPlace;
        this.lines = lines;
        this.offsets = offsets;
        this.lengths = lengths;
        this.aosp = aosp;
        this.version = version;
        this.help = help;
        this.stdin = stdin;
        this.fixImportsOnly = fixImportsOnly;
        this.removeJavadocOnlyImports = removeJavadocOnlyImports;
        this.sortImports = sortImports;
        this.removeUnusedImports = removeUnusedImports;
    }

    static Builder builder() {
        return new Builder();
    }

    ImmutableList<String> files() {
        return this.files;
    }

    boolean inPlace() {
        return this.inPlace;
    }

    ImmutableRangeSet<Integer> lines() {
        return this.lines;
    }

    ImmutableList<Integer> offsets() {
        return this.offsets;
    }

    ImmutableList<Integer> lengths() {
        return this.lengths;
    }

    boolean aosp() {
        return this.aosp;
    }

    boolean version() {
        return this.version;
    }

    boolean help() {
        return this.help;
    }

    boolean stdin() {
        return this.stdin;
    }

    boolean fixImportsOnly() {
        return this.fixImportsOnly;
    }

    boolean removeJavadocOnlyImports() {
        return this.removeJavadocOnlyImports;
    }

    boolean sortImports() {
        return this.sortImports;
    }

    boolean removeUnusedImports() {
        return this.removeUnusedImports;
    }

    boolean isSelection() {
        return (lines().isEmpty() && offsets().isEmpty() && lengths().isEmpty()) ? false : true;
    }

    static class Builder {
        private final ImmutableList.Builder<String> files = ImmutableList.builder();
        private final ImmutableRangeSet.Builder<Integer> lines = ImmutableRangeSet.builder();
        private final ImmutableList.Builder<Integer> offsets = ImmutableList.builder();
        private final ImmutableList.Builder<Integer> lengths = ImmutableList.builder();
        private Boolean inPlace = false;
        private Boolean aosp = false;
        private Boolean version = false;
        private Boolean help = false;
        private Boolean stdin = false;
        private Boolean fixImportsOnly = false;
        private Boolean removeJavadocOnlyImports = false;
        private Boolean sortImports = true;
        private Boolean removeUnusedImports = true;

        Builder() {
        }

        ImmutableList.Builder<String> filesBuilder() {
            return this.files;
        }

        Builder inPlace(boolean inPlace) {
            this.inPlace = Boolean.valueOf(inPlace);
            return this;
        }

        ImmutableRangeSet.Builder<Integer> linesBuilder() {
            return this.lines;
        }

        Builder addOffset(Integer offset) {
            this.offsets.mo158add(offset);
            return this;
        }

        Builder addLength(Integer length) {
            this.lengths.mo158add(length);
            return this;
        }

        Builder aosp(boolean aosp) {
            this.aosp = Boolean.valueOf(aosp);
            return this;
        }

        Builder version(boolean version) {
            this.version = Boolean.valueOf(version);
            return this;
        }

        Builder help(boolean help) {
            this.help = Boolean.valueOf(help);
            return this;
        }

        Builder stdin(boolean stdin) {
            this.stdin = Boolean.valueOf(stdin);
            return this;
        }

        Builder fixImportsOnly(boolean fixImportsOnly) {
            this.fixImportsOnly = Boolean.valueOf(fixImportsOnly);
            return this;
        }

        Builder removeJavadocOnlyImports(boolean removeJavadocOnlyImports) {
            this.removeJavadocOnlyImports = Boolean.valueOf(removeJavadocOnlyImports);
            return this;
        }

        Builder sortImports(boolean sortImports) {
            this.sortImports = Boolean.valueOf(sortImports);
            return this;
        }

        Builder removeUnusedImports(boolean removeUnusedImports) {
            this.removeUnusedImports = Boolean.valueOf(removeUnusedImports);
            return this;
        }

        CommandLineOptions build() {
            return new CommandLineOptions(this.files.build(), this.inPlace.booleanValue(), this.lines.build(), this.offsets.build(), this.lengths.build(), this.aosp.booleanValue(), this.version.booleanValue(), this.help.booleanValue(), this.stdin.booleanValue(), this.fixImportsOnly.booleanValue(), this.removeJavadocOnlyImports.booleanValue(), this.sortImports.booleanValue(), this.removeUnusedImports.booleanValue());
        }
    }
}
