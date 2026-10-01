package com.sun.tools.javac.util;

import java.util.BitSet;

public class Position {
    public static final int FIRSTCOLUMN = 1;
    public static final int FIRSTLINE = 1;
    public static final int FIRSTPOS = 0;
    public static final int LINESHIFT = 10;
    public static final int MAXCOLUMN = 1023;
    public static final int MAXLINE = 4194303;
    public static final int MAXPOS = Integer.MAX_VALUE;
    public static final int NOPOS = -1;

    public interface LineMap extends com.sun.source.tree.LineMap {
        int getColumnNumber(int i);

        int getLineNumber(int i);

        int getPosition(int i, int i2);

        int getStartPosition(int i);
    }

    private Position() {
    }

    public static LineMap makeLineMap(char[] src, int max, boolean expandTabs) {
        LineMapImpl lineMap = expandTabs ? new LineTabMapImpl(max) : new LineMapImpl();
        lineMap.build(src, max);
        return lineMap;
    }

    public static int encodePosition(int line, int col) {
        if (line < 1) {
            throw new IllegalArgumentException("line must be greater than 0");
        }
        if (col < 1) {
            throw new IllegalArgumentException("column must be greater than 0");
        }
        if (line > 4194303 || col > 1023) {
            return -1;
        }
        return (line << 10) + col;
    }

    static class LineMapImpl implements LineMap {
        protected int[] startPosition;
        private int lastPosition = 0;
        private int lastLine = 1;

        protected LineMapImpl() {
        }

        protected void build(char[] src, int max) {
            int c = 0;
            int i = 0;
            int[] linebuf = new int[max];
            while (i < max) {
                c++;
                linebuf[c] = i;
                do {
                    char ch = src[i];
                    if (ch == '\r' || ch == '\n') {
                        if (ch == '\r' && i + 1 < max && src[i + 1] == '\n') {
                            i += 2;
                            break;
                        } else {
                            i++;
                            break;
                        }
                    }
                    if (ch == '\t') {
                        setTabPosition(i);
                    }
                    i++;
                } while (i < max);
            }
            int[] iArr = new int[c];
            this.startPosition = iArr;
            System.arraycopy(linebuf, 0, iArr, 0, c);
        }

        @Override
        public int getStartPosition(int line) {
            return this.startPosition[line - 1];
        }

        @Override
        public long getStartPosition(long line) {
            return getStartPosition(longToInt(line));
        }

        @Override
        public int getPosition(int line, int column) {
            return (this.startPosition[line - 1] + column) - 1;
        }

        @Override
        public long getPosition(long line, long column) {
            return getPosition(longToInt(line), longToInt(column));
        }

        @Override
        public int getLineNumber(int pos) {
            if (pos == this.lastPosition) {
                return this.lastLine;
            }
            this.lastPosition = pos;
            int low = 0;
            int high = this.startPosition.length - 1;
            while (low <= high) {
                int mid = (low + high) >> 1;
                int midVal = this.startPosition[mid];
                if (midVal < pos) {
                    low = mid + 1;
                } else if (midVal > pos) {
                    high = mid - 1;
                } else {
                    int i = mid + 1;
                    this.lastLine = i;
                    return i;
                }
            }
            this.lastLine = low;
            return low;
        }

        @Override
        public long getLineNumber(long pos) {
            return getLineNumber(longToInt(pos));
        }

        @Override
        public int getColumnNumber(int pos) {
            return (pos - this.startPosition[getLineNumber(pos) - 1]) + 1;
        }

        @Override
        public long getColumnNumber(long pos) {
            return getColumnNumber(longToInt(pos));
        }

        private static int longToInt(long longValue) {
            int intValue = (int) longValue;
            if (intValue != longValue) {
                throw new IndexOutOfBoundsException();
            }
            return intValue;
        }

        protected void setTabPosition(int offset) {
        }
    }

    public static class LineTabMapImpl extends LineMapImpl {
        private BitSet tabMap;

        @Override
        public long getColumnNumber(long j) {
            return super.getColumnNumber(j);
        }

        @Override
        public int getLineNumber(int i) {
            return super.getLineNumber(i);
        }

        @Override
        public long getLineNumber(long j) {
            return super.getLineNumber(j);
        }

        @Override
        public long getPosition(long j, long j2) {
            return super.getPosition(j, j2);
        }

        @Override
        public int getStartPosition(int i) {
            return super.getStartPosition(i);
        }

        @Override
        public long getStartPosition(long j) {
            return super.getStartPosition(j);
        }

        public LineTabMapImpl(int max) {
            this.tabMap = new BitSet(max);
        }

        @Override
        protected void setTabPosition(int offset) {
            this.tabMap.set(offset);
        }

        @Override
        public int getColumnNumber(int pos) {
            int lineStart = this.startPosition[getLineNumber(pos) - 1];
            int column = 0;
            for (int bp = lineStart; bp < pos; bp++) {
                if (this.tabMap.get(bp)) {
                    column = ((column / 8) * 8) + 8;
                } else {
                    column++;
                }
            }
            int bp2 = column + 1;
            return bp2;
        }

        @Override
        public int getPosition(int line, int column) {
            int pos = this.startPosition[line - 1];
            int column2 = column - 1;
            int col = 0;
            while (col < column2) {
                pos++;
                if (this.tabMap.get(pos)) {
                    col = ((col / 8) * 8) + 8;
                } else {
                    col++;
                }
            }
            return pos;
        }
    }
}
