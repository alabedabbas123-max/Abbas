package com.google.googlejavaformat;

import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class InputOutput {
    protected static final Range<Integer> EMPTY_RANGE = Range.closedOpen(-1, -1);
    private static final DiscreteDomain<Integer> INTEGERS = DiscreteDomain.integers();
    private ImmutableList<String> lines = ImmutableList.m160of();
    protected final List<Range<Integer>> range0s = new ArrayList();
    protected final List<Range<Integer>> ranges = new ArrayList();
    protected final List<Range<Integer>> range1s = new ArrayList();

    protected final void setLines(ImmutableList<String> lines) {
        this.lines = lines;
    }

    public final int getLineCount() {
        return this.lines.size();
    }

    public final String getLine(int lineI) {
        return this.lines.get(lineI);
    }

    private static void addToRanges(List<Range<Integer>> ranges, int i, int k) {
        while (ranges.size() <= i) {
            ranges.add(EMPTY_RANGE);
        }
        Range<Integer> oldValue = ranges.get(i);
        ranges.set(i, Range.closedOpen(Integer.valueOf(oldValue.isEmpty() ? k : ((Integer) oldValue.lowerEndpoint()).intValue()), Integer.valueOf(k + 1)));
    }

    protected final void computeRanges(List<? extends Input.InterfaceC0532Tok> toks) {
        int lineI = 0;
        for (Input.InterfaceC0532Tok tok : toks) {
            String txt = tok.getOriginalText();
            int lineI0 = lineI;
            lineI += Newlines.count(txt);
            int k = tok.getIndex();
            if (k >= 0) {
                addToRanges(this.range0s, lineI0, k);
                for (int i = lineI0; i <= lineI; i++) {
                    addToRanges(this.ranges, i, k);
                }
                addToRanges(this.range1s, lineI0, k);
            }
        }
    }

    public static Map<Integer, Range<Integer>> makeKToIJ(InputOutput put, int kN) {
        Map<Integer, Range<Integer>> map = new HashMap<>();
        int ijN = put.getLineCount();
        for (int ij = 0; ij <= ijN; ij++) {
            Range<C> rangeCanonical = put.getRanges(ij).canonical(INTEGERS);
            for (int k = ((Integer) rangeCanonical.lowerEndpoint()).intValue(); k < ((Integer) rangeCanonical.upperEndpoint()).intValue(); k++) {
                if (map.containsKey(Integer.valueOf(k))) {
                    map.put(Integer.valueOf(k), Range.closedOpen(map.get(Integer.valueOf(k)).lowerEndpoint(), Integer.valueOf(ij + 1)));
                } else {
                    map.put(Integer.valueOf(k), Range.closedOpen(Integer.valueOf(ij), Integer.valueOf(ij + 1)));
                }
            }
        }
        return map;
    }

    public final Range<Integer> getRange0s(int lineI) {
        return (lineI < 0 || lineI >= this.range0s.size()) ? EMPTY_RANGE : this.range0s.get(lineI);
    }

    public final Range<Integer> getRanges(int lineI) {
        return (lineI < 0 || lineI >= this.ranges.size()) ? EMPTY_RANGE : this.ranges.get(lineI);
    }

    public final Range<Integer> getRange1s(int lineI) {
        return (lineI < 0 || lineI >= this.range1s.size()) ? EMPTY_RANGE : this.range1s.get(lineI);
    }

    public String toString() {
        return "InputOutput{lines=" + this.lines + ", range0s=" + this.range0s + ", ranges=" + this.ranges + ", range1s=" + this.range1s + '}';
    }
}
