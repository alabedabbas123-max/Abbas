package com.sun.tools.javac.util;

import com.sun.tools.javac.main.OptionName;
import com.sun.tools.javac.api.DiagnosticFormatter;
import com.sun.tools.javac.tree.JCTree;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import javax.tools.Diagnostic;
import javax.tools.DiagnosticListener;
import javax.tools.JavaFileObject;

public class Log extends AbstractLog {
    public static final Context.C0723Key<Log> logKey = new Context.C0723Key<>();
    public static final Context.C0723Key<PrintWriter> outKey = new Context.C0723Key<>();
    public final int MaxErrors;
    public final int MaxWarnings;
    public boolean deferDiagnostics;
    public Queue<JCDiagnostic> deferredDiagnostics;
    private DiagnosticFormatter<JCDiagnostic> diagFormatter;
    protected DiagnosticListener<? super JavaFileObject> diagListener;
    public boolean dumpOnError;
    public boolean emitWarnings;
    public final PrintWriter errWriter;
    public Set<String> expectDiagKeys;
    private JavacMessages messages;
    public boolean multipleErrors;
    public int nerrors;
    public final PrintWriter noticeWriter;
    public int nwarnings;
    public boolean promptOnError;
    private Set<Pair<JavaFileObject, Integer>> recorded;
    public boolean suppressNotes;
    public final PrintWriter warnWriter;

    @Deprecated
    protected Log(Context context, PrintWriter errWriter, PrintWriter warnWriter, PrintWriter noticeWriter) {
        super(JCDiagnostic.Factory.instance(context));
        this.deferredDiagnostics = new ListBuffer();
        this.nerrors = 0;
        this.nwarnings = 0;
        this.recorded = new HashSet();
        context.m504put(logKey, this);
        this.errWriter = errWriter;
        this.warnWriter = warnWriter;
        this.noticeWriter = noticeWriter;
        Options options = Options.instance(context);
        this.dumpOnError = options.isSet(OptionName.DOE);
        this.promptOnError = options.isSet(OptionName.PROMPT);
        this.emitWarnings = options.isUnset(OptionName.XLINT_CUSTOM, "none");
        this.suppressNotes = options.isSet("suppressNotes");
        this.MaxErrors = getIntOption(options, OptionName.XMAXERRS, getDefaultMaxErrors());
        this.MaxWarnings = getIntOption(options, OptionName.XMAXWARNS, getDefaultMaxWarnings());
        boolean rawDiagnostics = options.isSet("rawDiagnostics");
        this.messages = JavacMessages.instance(context);
        this.diagFormatter = rawDiagnostics ? new RawDiagnosticFormatter(options) : new BasicDiagnosticFormatter(options, this.messages);
        DiagnosticListener<? super JavaFileObject> dl = (DiagnosticListener) context.m502get(DiagnosticListener.class);
        this.diagListener = dl;
        String ek = options.m515get("expectKeys");
        if (ek != null) {
            this.expectDiagKeys = new HashSet(Arrays.asList(ek.split(", *")));
        }
    }

    protected Log(Context context) {
        this(context, defaultWriter(context));
    }

    protected Log(Context context, PrintWriter defaultWriter) {
        this(context, defaultWriter, defaultWriter, defaultWriter);
    }

    static final PrintWriter defaultWriter(Context context) {
        PrintWriter result = (PrintWriter) context.m501get(outKey);
        if (result == null) {
            Context.C0723Key<PrintWriter> c0723Key = outKey;
            PrintWriter result2 = new PrintWriter(System.err);
            context.m504put(c0723Key, result2);
            return result2;
        }
        return result;
    }

    public static Log instance(Context context) {
        Log instance = (Log) context.m501get(logKey);
        if (instance == null) {
            return new Log(context);
        }
        return instance;
    }

    public static void printLines(PrintWriter writer, String msg) {
        while (true) {
            int nl = msg.indexOf(10);
            if (nl == -1) {
                break;
            }
            writer.println(msg.substring(0, nl));
            msg = msg.substring(nl + 1);
        }
        if (msg.length() != 0) {
            writer.println(msg);
        }
    }

    public static String getLocalizedString(String key, Object... args) {
        return JavacMessages.getDefaultLocalizedString("compiler.misc." + key, args);
    }

    public static String format(String fmt, Object... args) {
        return String.format((Locale) null, fmt, args);
    }

    private int getIntOption(Options options, OptionName optionName, int defaultValue) {
        String s = options.m514get(optionName);
        if (s != null) {
            try {
                int n = Integer.parseInt(s);
                return n <= 0 ? Position.MAXPOS : n;
            } catch (NumberFormatException e) {
            }
        }
        return defaultValue;
    }

    protected int getDefaultMaxErrors() {
        return 100;
    }

    protected int getDefaultMaxWarnings() {
        return 100;
    }

    public boolean hasDiagnosticListener() {
        return this.diagListener != null;
    }

    public void setEndPosTable(JavaFileObject name, Map<JCTree, Integer> table) {
        name.getClass();
        getSource(name).setEndPosTable(table);
    }

    public JavaFileObject currentSourceFile() {
        if (this.source == null) {
            return null;
        }
        return this.source.getFile();
    }

    public DiagnosticFormatter<JCDiagnostic> getDiagnosticFormatter() {
        return this.diagFormatter;
    }

    public void setDiagnosticFormatter(DiagnosticFormatter<JCDiagnostic> diagFormatter) {
        this.diagFormatter = diagFormatter;
    }

    public void flush() {
        this.errWriter.flush();
        this.warnWriter.flush();
        this.noticeWriter.flush();
    }

    protected boolean shouldReport(JavaFileObject file, int pos) {
        if (this.multipleErrors || file == null) {
            return true;
        }
        Pair<JavaFileObject, Integer> coords = new Pair<>(file, Integer.valueOf(pos));
        boolean shouldReport = true ^ this.recorded.contains(coords);
        if (shouldReport) {
            this.recorded.add(coords);
        }
        return shouldReport;
    }

    public void prompt() {
        int i;
        if (this.promptOnError) {
            System.err.println(localize("resume.abort", new Object[0]));
            do {
                try {
                    i = System.in.read();
                    if (i == 65 || i == 82) {
                        return;
                    }
                    if (i == 88) {
                        break;
                    } else if (i == 97 || i == 114) {
                        return;
                    }
                } catch (IOException e) {
                    return;
                }
            } while (i != 120);
            throw new AssertionError("user abort");
        }
    }

    private void printErrLine(int pos, PrintWriter writer) {
        String line = this.source == null ? null : this.source.getLine(pos);
        if (line == null) {
            return;
        }
        int col = this.source.getColumnNumber(pos, false);
        printLines(writer, line);
        for (int i = 0; i < col - 1; i++) {
            writer.print(line.charAt(i) == '\t' ? "\t" : " ");
        }
        writer.println("^");
        writer.flush();
    }

    public void printErrLines(String key, Object... args) {
        printLines(this.errWriter, localize(key, args));
    }

    public void printNoteLines(String key, Object... args) {
        printLines(this.noticeWriter, localize(key, args));
    }

    public void printVerbose(String key, Object... args) {
        printLines(this.noticeWriter, localize("verbose." + key, args));
    }

    @Override
    protected void directError(String key, Object... args) {
        printErrLines(key, args);
        this.errWriter.flush();
    }

    public void strictWarning(JCDiagnostic.DiagnosticPosition pos, String key, Object... args) {
        writeDiagnostic(this.diags.warning(this.source, pos, key, args));
        this.nwarnings++;
    }

    public void reportDeferredDiagnostics() {
        reportDeferredDiagnostics(EnumSet.allOf(Diagnostic.Kind.class));
    }

    public void reportDeferredDiagnostics(Set<Diagnostic.Kind> kinds) {
        this.deferDiagnostics = false;
        while (true) {
            JCDiagnostic d = this.deferredDiagnostics.poll();
            if (d != null) {
                if (kinds.contains(d.getKind())) {
                    report(d);
                }
            } else {
                return;
            }
        }
    }

    @Override
    public void report(JCDiagnostic diagnostic) {
        if (this.deferDiagnostics) {
            this.deferredDiagnostics.add(diagnostic);
            return;
        }
        Set<String> set = this.expectDiagKeys;
        if (set != null) {
            set.remove(diagnostic.getCode());
        }
        int i = AnonymousClass1.f571xe4eead0a[diagnostic.getType().ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        }
        if (i == 2) {
            if ((this.emitWarnings || diagnostic.isMandatory()) && !this.suppressNotes) {
                writeDiagnostic(diagnostic);
                return;
            }
            return;
        }
        if (i == 3) {
            if ((this.emitWarnings || diagnostic.isMandatory()) && this.nwarnings < this.MaxWarnings) {
                writeDiagnostic(diagnostic);
                this.nwarnings++;
                return;
            }
            return;
        }
        if (i == 4 && this.nerrors < this.MaxErrors && shouldReport(diagnostic.getSource(), diagnostic.getIntPosition())) {
            writeDiagnostic(diagnostic);
            this.nerrors++;
        }
    }

    static class AnonymousClass1 {

        static final int[] f571xe4eead0a;

        static {
            int[] iArr = new int[JCDiagnostic.DiagnosticType.values().length];
            f571xe4eead0a = iArr;
            try {
                iArr[JCDiagnostic.DiagnosticType.FRAGMENT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f571xe4eead0a[JCDiagnostic.DiagnosticType.NOTE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f571xe4eead0a[JCDiagnostic.DiagnosticType.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f571xe4eead0a[JCDiagnostic.DiagnosticType.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    protected void writeDiagnostic(JCDiagnostic diag) {
        int i;
        DiagnosticListener<? super JavaFileObject> diagnosticListener = this.diagListener;
        if (diagnosticListener != null) {
            diagnosticListener.report(diag);
        }
        PrintWriter writer = getWriterForDiagnosticType(diag.getType());
        printLines(writer, this.diagFormatter.format(diag, this.messages.getCurrentLocale()));
        if (this.promptOnError && ((i = AnonymousClass1.f571xe4eead0a[diag.getType().ordinal()]) == 3 || i == 4)) {
            prompt();
        }
        if (this.dumpOnError) {
            new RuntimeException().printStackTrace(writer);
        }
        writer.flush();
    }

    @Deprecated
    protected PrintWriter getWriterForDiagnosticType(JCDiagnostic.DiagnosticType dt) {
        int i = AnonymousClass1.f571xe4eead0a[dt.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        }
        if (i == 2) {
            return this.noticeWriter;
        }
        if (i == 3) {
            return this.warnWriter;
        }
        if (i == 4) {
            return this.errWriter;
        }
        throw new Error();
    }

    public String localize(String key, Object... args) {
        return this.messages.getLocalizedString("compiler.misc." + key, args);
    }

    private void printRawError(int pos, String msg) {
        if (this.source == null || pos == -1) {
            printLines(this.errWriter, "error: " + msg);
        } else {
            int line = this.source.getLineNumber(pos);
            JavaFileObject file = this.source.getFile();
            if (file != null) {
                printLines(this.errWriter, file.getName() + ":" + line + ": " + msg);
            }
            printErrLine(pos, this.errWriter);
        }
        this.errWriter.flush();
    }

    public void rawError(int pos, String msg) {
        if (this.nerrors < this.MaxErrors && shouldReport(currentSourceFile(), pos)) {
            printRawError(pos, msg);
            prompt();
            this.nerrors++;
        }
        this.errWriter.flush();
    }

    public void rawWarning(int pos, String msg) {
        if (this.nwarnings < this.MaxWarnings && this.emitWarnings) {
            printRawError(pos, "warning: " + msg);
        }
        prompt();
        this.nwarnings++;
        this.errWriter.flush();
    }
}
