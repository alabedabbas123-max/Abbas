package com.sun.tools.javac.util;

import com.sun.tools.javac.code.Lint;
import com.sun.tools.javac.code.Printer;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.file.BaseFileObject;
import com.sun.tools.javac.api.DiagnosticFormatter;
import com.sun.tools.javac.api.Formattable;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.tools.JavaFileObject;

public abstract class AbstractDiagnosticFormatter implements DiagnosticFormatter<JCDiagnostic> {
    private SimpleConfiguration config;
    protected JavacMessages messages;
    protected int depth = 0;
    private List<Type> allCaptured = List.m507nil();
    protected Printer printer = new Printer() {
        @Override
        protected String localize(Locale locale, String key, Object... args) {
            return AbstractDiagnosticFormatter.this.localize(locale, key, args);
        }

        @Override
        protected String capturedVarId(Type.CapturedType t, Locale locale) {
            return "" + (AbstractDiagnosticFormatter.this.allCaptured.indexOf(t) + 1);
        }

        @Override
        public String visitCapturedType(Type.CapturedType t, Locale locale) {
            if (!AbstractDiagnosticFormatter.this.allCaptured.contains(t)) {
                AbstractDiagnosticFormatter abstractDiagnosticFormatter = AbstractDiagnosticFormatter.this;
                abstractDiagnosticFormatter.allCaptured = abstractDiagnosticFormatter.allCaptured.append(t);
            }
            return super.visitCapturedType(t, locale);
        }
    };

    protected abstract String formatDiagnostic(JCDiagnostic jCDiagnostic, Locale locale);

    protected AbstractDiagnosticFormatter(JavacMessages messages, SimpleConfiguration config) {
        this.messages = messages;
        this.config = config;
    }

    @Override
    public String formatKind(JCDiagnostic d, Locale l) {
        int i = C07202.f552xe4eead0a[d.getType().ordinal()];
        if (i == 1) {
            return "";
        }
        if (i == 2) {
            return localize(l, "compiler.note.note", new Object[0]);
        }
        if (i == 3) {
            return localize(l, "compiler.warn.warning", new Object[0]);
        }
        if (i == 4) {
            return localize(l, "compiler.err.error", new Object[0]);
        }
        throw new AssertionError("Unknown diagnostic type: " + d.getType());
    }

    @Override
    public String format(JCDiagnostic d, Locale locale) {
        this.allCaptured = List.m507nil();
        return formatDiagnostic(d, locale);
    }

    @Override
    public String formatPosition(JCDiagnostic d, DiagnosticFormatter.PositionKind pk, Locale l) {
        Assert.check(d.getPosition() != -1);
        return String.valueOf(getPosition(d, pk));
    }

    static class C07202 {

        static final int[] f551x727b6c2f;

        static final int[] f552xe4eead0a;

        static {
            int[] iArr = new int[DiagnosticFormatter.PositionKind.values().length];
            f551x727b6c2f = iArr;
            try {
                iArr[DiagnosticFormatter.PositionKind.START.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f551x727b6c2f[DiagnosticFormatter.PositionKind.END.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f551x727b6c2f[DiagnosticFormatter.PositionKind.LINE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f551x727b6c2f[DiagnosticFormatter.PositionKind.COLUMN.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f551x727b6c2f[DiagnosticFormatter.PositionKind.OFFSET.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            int[] iArr2 = new int[JCDiagnostic.DiagnosticType.values().length];
            f552xe4eead0a = iArr2;
            try {
                iArr2[JCDiagnostic.DiagnosticType.FRAGMENT.ordinal()] = 1;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f552xe4eead0a[JCDiagnostic.DiagnosticType.NOTE.ordinal()] = 2;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f552xe4eead0a[JCDiagnostic.DiagnosticType.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f552xe4eead0a[JCDiagnostic.DiagnosticType.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError e9) {
            }
        }
    }

    private long getPosition(JCDiagnostic d, DiagnosticFormatter.PositionKind pk) {
        int i = C07202.f551x727b6c2f[pk.ordinal()];
        if (i == 1) {
            return d.getIntStartPosition();
        }
        if (i == 2) {
            return d.getIntEndPosition();
        }
        if (i == 3) {
            return d.getLineNumber();
        }
        if (i == 4) {
            return d.getColumnNumber();
        }
        if (i == 5) {
            return d.getIntPosition();
        }
        throw new AssertionError("Unknown diagnostic position: " + pk);
    }

    @Override
    public String formatSource(JCDiagnostic d, boolean fullname, Locale l) {
        JavaFileObject fo = d.getSource();
        if (fo == null) {
            throw new IllegalArgumentException();
        }
        if (fullname) {
            return fo.getName();
        }
        if (fo instanceof BaseFileObject) {
            return ((BaseFileObject) fo).getShortName();
        }
        return BaseFileObject.getSimpleName(fo);
    }

    protected Collection<String> formatArguments(JCDiagnostic d, Locale l) {
        ListBuffer<String> buf = new ListBuffer<>();
        for (Object o : d.getArgs()) {
            buf.append(formatArgument(d, o, l));
        }
        return buf.toList();
    }

    protected String formatArgument(JCDiagnostic d, Object arg, Locale l) {
        if (arg instanceof JCDiagnostic) {
            this.depth++;
            try {
                String s = formatMessage((JCDiagnostic) arg, l);
                return s;
            } finally {
                this.depth--;
            }
        }
        if (arg instanceof Iterable) {
            return formatIterable(d, (Iterable) arg, l);
        }
        if (arg instanceof Type) {
            return this.printer.visit((Type) arg, l);
        }
        if (arg instanceof Symbol) {
            return this.printer.visit((Symbol) arg, l);
        }
        if (arg instanceof JavaFileObject) {
            return ((JavaFileObject) arg).getName();
        }
        if (arg instanceof Formattable) {
            return ((Formattable) arg).toString(l, this.messages);
        }
        return String.valueOf(arg);
    }

    protected String formatIterable(JCDiagnostic d, Iterable<?> it, Locale l) {
        StringBuilder sbuf = new StringBuilder();
        String sep = "";
        for (Object o : it) {
            sbuf.append(sep);
            sbuf.append(formatArgument(d, o, l));
            sep = ",";
        }
        return sbuf.toString();
    }

    protected List<String> formatSubdiagnostics(JCDiagnostic d, Locale l) {
        List<String> subdiagnostics = List.m507nil();
        int maxDepth = this.config.getMultilineLimit(DiagnosticFormatter.Configuration.MultilineLimit.DEPTH);
        if (maxDepth == -1 || this.depth < maxDepth) {
            this.depth++;
            try {
                int maxCount = this.config.getMultilineLimit(DiagnosticFormatter.Configuration.MultilineLimit.LENGTH);
                int count = 0;
                for (JCDiagnostic d2 : d.getSubdiagnostics()) {
                    if (maxCount != -1 && count >= maxCount) {
                        break;
                    }
                    subdiagnostics = subdiagnostics.append(formatSubdiagnostic(d, d2, l));
                    count++;
                }
                this.depth--;
            } catch (Throwable th) {
                this.depth--;
                throw th;
            }
        }
        return subdiagnostics;
    }

    protected String formatSubdiagnostic(JCDiagnostic parent, JCDiagnostic sub, Locale l) {
        return formatMessage(sub, l);
    }

    protected String formatSourceLine(JCDiagnostic d, int nSpaces) {
        StringBuilder buf = new StringBuilder();
        DiagnosticSource source = d.getDiagnosticSource();
        int pos = d.getIntPosition();
        if (d.getIntPosition() == -1) {
            throw new AssertionError();
        }
        String line = source == null ? null : source.getLine(pos);
        if (line == null) {
            return "";
        }
        buf.append(indent(line, nSpaces));
        int col = source.getColumnNumber(pos, false);
        if (this.config.isCaretEnabled()) {
            buf.append("\n");
            for (int i = 0; i < col - 1; i++) {
                buf.append(line.charAt(i) == '\t' ? "\t" : " ");
            }
            buf.append(indent("^", nSpaces));
        }
        return buf.toString();
    }

    protected String formatLintCategory(JCDiagnostic d, Locale l) {
        Lint.LintCategory lc = d.getLintCategory();
        return lc == null ? "" : localize(l, "compiler.warn.lintOption", lc.option);
    }

    protected String localize(Locale l, String key, Object... args) {
        return this.messages.getLocalizedString(l, key, args);
    }

    @Override
    public boolean displaySource(JCDiagnostic d) {
        return (!this.config.getVisible().contains(DiagnosticFormatter.Configuration.DiagnosticPart.SOURCE) || d.getType() == JCDiagnostic.DiagnosticType.FRAGMENT || d.getIntPosition() == -1) ? false : true;
    }

    public boolean isRaw() {
        return false;
    }

    protected String indentString(int nSpaces) {
        if (nSpaces <= "                        ".length()) {
            return "                        ".substring(0, nSpaces);
        }
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < nSpaces; i++) {
            buf.append(" ");
        }
        return buf.toString();
    }

    protected String indent(String s, int nSpaces) {
        String indent = indentString(nSpaces);
        StringBuilder buf = new StringBuilder();
        String nl = "";
        for (String line : s.split("\n")) {
            buf.append(nl);
            buf.append(indent + line);
            nl = "\n";
        }
        return buf.toString();
    }

    @Override
    public SimpleConfiguration getConfiguration() {
        return this.config;
    }

    public static class SimpleConfiguration implements DiagnosticFormatter.Configuration {
        protected boolean caretEnabled;
        protected Map<DiagnosticFormatter.Configuration.MultilineLimit, Integer> multilineLimits;
        protected EnumSet<DiagnosticFormatter.Configuration.DiagnosticPart> visibleParts;

        public SimpleConfiguration(Set<DiagnosticFormatter.Configuration.DiagnosticPart> parts) {
            this.multilineLimits = new HashMap();
            setVisible(parts);
            setMultilineLimit(DiagnosticFormatter.Configuration.MultilineLimit.DEPTH, -1);
            setMultilineLimit(DiagnosticFormatter.Configuration.MultilineLimit.LENGTH, -1);
            setCaretEnabled(true);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00ba A[Catch: NumberFormatException -> 0x00c6, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x00c6, blocks: (B:29:0x0096, B:35:0x009f, B:37:0x00a7, B:38:0x00b2, B:40:0x00ba), top: B:51:0x0096 }] */
        public SimpleConfiguration(Options options, Set<DiagnosticFormatter.Configuration.DiagnosticPart> parts) {
            this(parts);
            String showSource = options.m515get("showSource");
            if (showSource != null) {
                if (showSource.equals("true")) {
                    setVisiblePart(DiagnosticFormatter.Configuration.DiagnosticPart.SOURCE, true);
                } else if (showSource.equals("false")) {
                    setVisiblePart(DiagnosticFormatter.Configuration.DiagnosticPart.SOURCE, false);
                }
            }
            String diagOpts = options.m515get("diags");
            if (diagOpts != null) {
                Collection<String> args = Arrays.asList(diagOpts.split(","));
                if (args.contains("short")) {
                    setVisiblePart(DiagnosticFormatter.Configuration.DiagnosticPart.DETAILS, false);
                    setVisiblePart(DiagnosticFormatter.Configuration.DiagnosticPart.SUBDIAGNOSTICS, false);
                }
                if (args.contains("source")) {
                    setVisiblePart(DiagnosticFormatter.Configuration.DiagnosticPart.SOURCE, true);
                }
                if (args.contains("-source")) {
                    setVisiblePart(DiagnosticFormatter.Configuration.DiagnosticPart.SOURCE, false);
                }
            }
            String multiPolicy = options.m515get("multilinePolicy");
            if (multiPolicy != null) {
                if (multiPolicy.equals("disabled")) {
                    setVisiblePart(DiagnosticFormatter.Configuration.DiagnosticPart.SUBDIAGNOSTICS, false);
                } else if (multiPolicy.startsWith("limit:")) {
                    String limitString = multiPolicy.substring("limit:".length());
                    String[] limits = limitString.split(":");
                    try {
                        int length = limits.length;
                        if (length == 1) {
                            if (!limits[0].equals("*")) {
                                setMultilineLimit(DiagnosticFormatter.Configuration.MultilineLimit.LENGTH, Integer.parseInt(limits[0]));
                            }
                        } else if (length == 2) {
                            if (!limits[1].equals("*")) {
                                setMultilineLimit(DiagnosticFormatter.Configuration.MultilineLimit.DEPTH, Integer.parseInt(limits[1]));
                            }
                            if (!limits[0].equals("*")) {
                                setMultilineLimit(DiagnosticFormatter.Configuration.MultilineLimit.LENGTH, Integer.parseInt(limits[0]));
                            }
                        }
                    } catch (NumberFormatException e) {
                        setMultilineLimit(DiagnosticFormatter.Configuration.MultilineLimit.DEPTH, -1);
                        setMultilineLimit(DiagnosticFormatter.Configuration.MultilineLimit.LENGTH, -1);
                    }
                }
            }
            String showCaret = options.m515get("showCaret");
            if (showCaret != null && showCaret.equals("false")) {
                setCaretEnabled(false);
            } else {
                setCaretEnabled(true);
            }
        }

        @Override
        public int getMultilineLimit(DiagnosticFormatter.Configuration.MultilineLimit limit) {
            return this.multilineLimits.get(limit).intValue();
        }

        @Override
        public EnumSet<DiagnosticFormatter.Configuration.DiagnosticPart> getVisible() {
            return EnumSet.copyOf((EnumSet) this.visibleParts);
        }

        @Override
        public void setMultilineLimit(DiagnosticFormatter.Configuration.MultilineLimit limit, int value) {
            this.multilineLimits.put(limit, Integer.valueOf(value >= -1 ? value : -1));
        }

        @Override
        public void setVisible(Set<DiagnosticFormatter.Configuration.DiagnosticPart> diagParts) {
            this.visibleParts = EnumSet.copyOf((Collection) diagParts);
        }

        public void setVisiblePart(DiagnosticFormatter.Configuration.DiagnosticPart diagParts, boolean enabled) {
            if (enabled) {
                this.visibleParts.add(diagParts);
            } else {
                this.visibleParts.remove(diagParts);
            }
        }

        public void setCaretEnabled(boolean caretEnabled) {
            this.caretEnabled = caretEnabled;
        }

        public boolean isCaretEnabled() {
            return this.caretEnabled;
        }
    }

    public Printer getPrinter() {
        return this.printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
}
