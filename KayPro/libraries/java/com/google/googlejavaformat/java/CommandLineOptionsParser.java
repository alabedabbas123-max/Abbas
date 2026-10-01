package com.google.googlejavaformat.java;

import com.google.common.base.Ascii;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import java.util.Iterator;
import java.util.List;

final class CommandLineOptionsParser {
    private static final Splitter COMMA_SPLITTER = Splitter.m104on(',');
    private static final Splitter COLON_SPLITTER = Splitter.m104on(':');

    CommandLineOptionsParser() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    static CommandLineOptions parse(Iterable<String> options) {
        String flag;
        String value;
        CommandLineOptions.Builder optionsBuilder = CommandLineOptions.builder();
        Iterator<String> it = options.iterator();
        while (it.hasNext()) {
            String option = it.next();
            if (!option.startsWith("-")) {
                optionsBuilder.filesBuilder().mo158add(option).addAll((Iterator<? extends String>) it);
                return optionsBuilder.build();
            }
            int idx = option.indexOf(61);
            if (idx >= 0) {
                flag = option.substring(0, idx);
                value = option.substring(idx + 1, option.length());
            } else {
                flag = option;
                value = null;
            }
            byte b = -1;
            switch (flag.hashCode()) {
                case -2083416601:
                    if (flag.equals("-replace")) {
                        b = 2;
                    }
                    break;
                case -1814488812:
                    if (flag.equals("--replace")) {
                        b = 3;
                    }
                    break;
                case -1620718241:
                    if (flag.equals("--lines")) {
                        b = 4;
                    }
                    break;
                case -688688265:
                    if (flag.equals("--skip-sorting-imports")) {
                        b = Ascii.f37ETB;
                    }
                    break;
                case -64267005:
                    if (flag.equals("--fix-imports-only")) {
                        b = Ascii.f46NAK;
                    }
                    break;
                case 45:
                    if (flag.equals("-")) {
                        b = Ascii.f33EM;
                    }
                    break;
                case 1492:
                    if (flag.equals("-a")) {
                        b = Ascii.f51SO;
                    }
                    break;
                case 1499:
                    if (flag.equals("-h")) {
                        b = Ascii.f30DC4;
                    }
                    break;
                case 1500:
                    if (flag.equals("-i")) {
                        b = 0;
                    }
                    break;
                case 1509:
                    if (flag.equals("-r")) {
                        b = 1;
                    }
                    break;
                case 1513:
                    if (flag.equals("-v")) {
                        b = 17;
                    }
                    break;
                case 44558520:
                    if (flag.equals("-aosp")) {
                        b = 13;
                    }
                    break;
                case 44757230:
                    if (flag.equals("-help")) {
                        b = 19;
                    }
                    break;
                case 44880289:
                    if (flag.equals("-line")) {
                        b = 7;
                    }
                    break;
                case 176596307:
                    if (flag.equals("-length")) {
                        b = 11;
                    }
                    break;
                case 263180032:
                    if (flag.equals("-offset")) {
                        b = 9;
                    }
                    break;
                case 304725717:
                    if (flag.equals("--skip-removing-unused-imports")) {
                        b = Ascii.f25CAN;
                    }
                    break;
                case 1293650054:
                    if (flag.equals("--length")) {
                        b = 10;
                    }
                    break;
                case 1332870315:
                    if (flag.equals("--aosp")) {
                        b = 12;
                    }
                    break;
                case 1333069025:
                    if (flag.equals("--help")) {
                        b = 18;
                    }
                    break;
                case 1333192084:
                    if (flag.equals("--line")) {
                        b = 6;
                    }
                    break;
                case 1380233779:
                    if (flag.equals("--offset")) {
                        b = 8;
                    }
                    break;
                case 1391289074:
                    if (flag.equals("-lines")) {
                        b = 5;
                    }
                    break;
                case 1468661771:
                    if (flag.equals("-version")) {
                        b = Ascii.f32DLE;
                    }
                    break;
                case 1644766408:
                    if (flag.equals("--experimental-remove-javadoc-only-imports")) {
                        b = Ascii.f56SYN;
                    }
                    break;
                case 1737589560:
                    if (flag.equals("--version")) {
                        b = Ascii.f50SI;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                    optionsBuilder.inPlace(true);
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    parseRangeSet(optionsBuilder.linesBuilder(), getValue(flag, it, value));
                    break;
                case 8:
                case 9:
                    optionsBuilder.addOffset(parseInteger(it, flag, value));
                    break;
                case 10:
                case 11:
                    optionsBuilder.addLength(parseInteger(it, flag, value));
                    break;
                case 12:
                case 13:
                case 14:
                    optionsBuilder.aosp(true);
                    break;
                case 15:
                case 16:
                case 17:
                    optionsBuilder.version(true);
                    break;
                case 18:
                case 19:
                case 20:
                    optionsBuilder.help(true);
                    break;
                case 21:
                    optionsBuilder.fixImportsOnly(true);
                    break;
                case 22:
                    optionsBuilder.removeJavadocOnlyImports(true);
                    break;
                case 23:
                    optionsBuilder.sortImports(false);
                    break;
                case 24:
                    optionsBuilder.removeUnusedImports(false);
                    break;
                case 25:
                    optionsBuilder.stdin(true);
                    break;
                default:
                    throw new IllegalArgumentException("unexpected flag: " + flag);
            }
        }
        return optionsBuilder.build();
    }

    private static Integer parseInteger(Iterator<String> it, String flag, String value) {
        try {
            return Integer.valueOf(getValue(flag, it, value));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("invalid integer value for %s: %s", flag, value), e);
        }
    }

    private static String getValue(String flag, Iterator<String> it, String value) {
        if (value != null) {
            return value;
        }
        if (!it.hasNext()) {
            throw new IllegalArgumentException("required value was not provided for: " + flag);
        }
        return it.next();
    }

    private static void parseRangeSet(ImmutableRangeSet.Builder<Integer> result, String ranges) {
        for (String range : COMMA_SPLITTER.split(ranges)) {
            result.m210add(parseRange(range));
        }
    }

    private static Range<Integer> parseRange(String arg) {
        List<String> args = COLON_SPLITTER.splitToList(arg);
        int size = args.size();
        if (size == 1) {
            int line = Integer.parseInt(args.get(0)) - 1;
            return Range.closedOpen(Integer.valueOf(line), Integer.valueOf(line + 1));
        }
        if (size == 2) {
            int line0 = Integer.parseInt(args.get(0)) - 1;
            int line1 = Integer.parseInt(args.get(1)) - 1;
            return Range.closedOpen(Integer.valueOf(line0), Integer.valueOf(line1 + 1));
        }
        throw new IllegalArgumentException(arg);
    }
}
