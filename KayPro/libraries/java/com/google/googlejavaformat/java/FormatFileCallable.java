package com.google.googlejavaformat.java;

import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import java.util.concurrent.Callable;

public class FormatFileCallable implements Callable<String> {
    private final String input;
    private final JavaFormatterOptions options;
    private final CommandLineOptions parameters;

    public FormatFileCallable(CommandLineOptions parameters, String input, JavaFormatterOptions options) {
        this.input = input;
        this.parameters = parameters;
        this.options = options;
    }

    @Override
    public String call() throws FormatterException {
        if (this.parameters.fixImportsOnly()) {
            return fixImports(this.input);
        }
        Formatter formatter = new Formatter(this.options);
        String str = this.input;
        String formatted = formatter.formatSource(str, characterRanges(str).asRanges());
        return fixImports(formatted);
    }

    private String fixImports(String input) throws FormatterException {
        if (this.parameters.removeUnusedImports()) {
            input = RemoveUnusedImports.removeUnusedImports(input, new Object());
        }
        if (this.parameters.sortImports()) {
            return ImportOrderer.reorderImports(input);
        }
        return input;
    }

    private RangeSet<Integer> characterRanges(String input) {
        RangeSet<Integer> characterRanges = TreeRangeSet.create();
        if (this.parameters.lines().isEmpty() && this.parameters.offsets().isEmpty()) {
            characterRanges.mo129add(Range.closedOpen(0, Integer.valueOf(input.length())));
            return characterRanges;
        }
        characterRanges.addAll(Formatter.lineRangesToCharRanges(input, this.parameters.lines()));
        for (int i = 0; i < this.parameters.offsets().size(); i++) {
            Integer length = this.parameters.lengths().get(i);
            if (length.intValue() == 0) {
                length = 1;
            }
            characterRanges.mo129add(Range.closedOpen(this.parameters.offsets().get(i), Integer.valueOf(this.parameters.offsets().get(i).intValue() + length.intValue())));
        }
        return characterRanges;
    }
}
