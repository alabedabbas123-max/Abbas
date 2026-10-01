package com.sun.tools.javac.util;

import com.sun.tools.javac.code.Lint;
import com.sun.tools.javac.api.DiagnosticFormatter;
import com.sun.tools.javac.tree.JCTree;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;

public class JCDiagnostic implements Diagnostic<JavaFileObject> {

    @Deprecated
    private static DiagnosticFormatter<JCDiagnostic> fragmentFormatter;
    protected final Object[] args;
    private final int column;
    private DiagnosticFormatter<JCDiagnostic> defaultFormatter;
    private final Set<DiagnosticFlag> flags;

    private final String f561key;
    private final int line;
    private final Lint.LintCategory lintCategory;
    private final DiagnosticPosition position;
    private final DiagnosticSource source;
    private final DiagnosticType type;

    public enum DiagnosticFlag {
        MANDATORY,
        RESOLVE_ERROR,
        SYNTAX,
        RECOVERABLE
    }

    public interface DiagnosticPosition {
        int getEndPosition(Map<JCTree, Integer> map);

        int getPreferredPosition();

        int getStartPosition();

        JCTree getTree();
    }

    public static class Factory {
        protected static final Context.C0723Key<Factory> diagnosticFactoryKey = new Context.C0723Key<>();
        final Set<DiagnosticFlag> defaultErrorFlags;
        DiagnosticFormatter<JCDiagnostic> formatter;
        final String prefix;

        public static Factory instance(Context context) {
            Factory instance = (Factory) context.m501get(diagnosticFactoryKey);
            if (instance == null) {
                return new Factory(context);
            }
            return instance;
        }

        protected Factory(Context context) {
            this(JavacMessages.instance(context), "compiler");
            context.m504put(diagnosticFactoryKey, this);
            Options options = Options.instance(context);
            if (options.isSet("onlySyntaxErrorsUnrecoverable")) {
                this.defaultErrorFlags.add(DiagnosticFlag.RECOVERABLE);
            }
        }

        public Factory(JavacMessages messages, String prefix) {
            this.prefix = prefix;
            this.formatter = new BasicDiagnosticFormatter(messages);
            this.defaultErrorFlags = EnumSet.of(DiagnosticFlag.MANDATORY);
        }

        public JCDiagnostic error(DiagnosticSource source, DiagnosticPosition pos, String key, Object... args) {
            return create(DiagnosticType.ERROR, null, this.defaultErrorFlags, source, pos, key, args);
        }

        public JCDiagnostic mandatoryWarning(DiagnosticSource source, DiagnosticPosition pos, String key, Object... args) {
            return create(DiagnosticType.WARNING, null, EnumSet.of(DiagnosticFlag.MANDATORY), source, pos, key, args);
        }

        public JCDiagnostic mandatoryWarning(Lint.LintCategory lc, DiagnosticSource source, DiagnosticPosition pos, String key, Object... args) {
            return create(DiagnosticType.WARNING, lc, EnumSet.of(DiagnosticFlag.MANDATORY), source, pos, key, args);
        }

        public JCDiagnostic warning(Lint.LintCategory lc, String key, Object... args) {
            return create(DiagnosticType.WARNING, lc, EnumSet.noneOf(DiagnosticFlag.class), null, null, key, args);
        }

        public JCDiagnostic warning(DiagnosticSource source, DiagnosticPosition pos, String key, Object... args) {
            return create(DiagnosticType.WARNING, null, EnumSet.noneOf(DiagnosticFlag.class), source, pos, key, args);
        }

        public JCDiagnostic warning(Lint.LintCategory lc, DiagnosticSource source, DiagnosticPosition pos, String key, Object... args) {
            return create(DiagnosticType.WARNING, lc, EnumSet.noneOf(DiagnosticFlag.class), source, pos, key, args);
        }

        public JCDiagnostic mandatoryNote(DiagnosticSource source, String key, Object... args) {
            return create(DiagnosticType.NOTE, null, EnumSet.of(DiagnosticFlag.MANDATORY), source, null, key, args);
        }

        public JCDiagnostic note(String key, Object... args) {
            return create(DiagnosticType.NOTE, null, EnumSet.noneOf(DiagnosticFlag.class), null, null, key, args);
        }

        public JCDiagnostic note(DiagnosticSource source, DiagnosticPosition pos, String key, Object... args) {
            return create(DiagnosticType.NOTE, null, EnumSet.noneOf(DiagnosticFlag.class), source, pos, key, args);
        }

        public JCDiagnostic fragment(String key, Object... args) {
            return create(DiagnosticType.FRAGMENT, null, EnumSet.noneOf(DiagnosticFlag.class), null, null, key, args);
        }

        public JCDiagnostic create(DiagnosticType kind, DiagnosticSource source, DiagnosticPosition pos, String key, Object... args) {
            return create(kind, null, EnumSet.noneOf(DiagnosticFlag.class), source, pos, key, args);
        }

        public JCDiagnostic create(DiagnosticType kind, Lint.LintCategory lc, Set<DiagnosticFlag> flags, DiagnosticSource source, DiagnosticPosition pos, String key, Object... args) {
            return new JCDiagnostic(this.formatter, kind, lc, flags, source, pos, qualify(kind, key), args);
        }

        protected String qualify(DiagnosticType t, String key) {
            return this.prefix + "." + t.f564key + "." + key;
        }
    }

    @Deprecated
    public static JCDiagnostic fragment(String key, Object... args) {
        return new JCDiagnostic(getFragmentFormatter(), DiagnosticType.FRAGMENT, null, EnumSet.noneOf(DiagnosticFlag.class), null, null, "compiler." + DiagnosticType.FRAGMENT.f564key + "." + key, args);
    }

    @Deprecated
    public static DiagnosticFormatter<JCDiagnostic> getFragmentFormatter() {
        if (fragmentFormatter == null) {
            fragmentFormatter = new BasicDiagnosticFormatter(JavacMessages.getDefaultMessages());
        }
        return fragmentFormatter;
    }

    public enum DiagnosticType {
        FRAGMENT("misc"),
        NOTE("note"),
        WARNING("warn"),
        ERROR("err");


        final String f564key;

        DiagnosticType(String key) {
            this.f564key = key;
        }
    }

    public static class SimpleDiagnosticPosition implements DiagnosticPosition {

        private final int f565pos;

        public SimpleDiagnosticPosition(int pos) {
            this.f565pos = pos;
        }

        @Override
        public JCTree getTree() {
            return null;
        }

        @Override
        public int getStartPosition() {
            return this.f565pos;
        }

        @Override
        public int getPreferredPosition() {
            return this.f565pos;
        }

        @Override
        public int getEndPosition(Map<JCTree, Integer> endPosTable) {
            return this.f565pos;
        }
    }

    protected JCDiagnostic(DiagnosticFormatter<JCDiagnostic> formatter, DiagnosticType dt, Lint.LintCategory lc, Set<DiagnosticFlag> flags, DiagnosticSource source, DiagnosticPosition pos, String key, Object... args) {
        if (source == null && pos != null && pos.getPreferredPosition() != -1) {
            throw new IllegalArgumentException();
        }
        this.defaultFormatter = formatter;
        this.type = dt;
        this.lintCategory = lc;
        this.flags = flags;
        this.source = source;
        this.position = pos;
        this.f561key = key;
        this.args = args;
        int n = pos == null ? -1 : pos.getPreferredPosition();
        if (n == -1 || source == null) {
            this.column = -1;
            this.line = -1;
        } else {
            this.line = source.getLineNumber(n);
            this.column = source.getColumnNumber(n, true);
        }
    }

    public DiagnosticType getType() {
        return this.type;
    }

    public List<JCDiagnostic> getSubdiagnostics() {
        return List.m507nil();
    }

    public boolean isMultiline() {
        return false;
    }

    public boolean isMandatory() {
        return this.flags.contains(DiagnosticFlag.MANDATORY);
    }

    public boolean hasLintCategory() {
        return this.lintCategory != null;
    }

    public Lint.LintCategory getLintCategory() {
        return this.lintCategory;
    }

    @Override
    public JavaFileObject getSource() {
        DiagnosticSource diagnosticSource = this.source;
        if (diagnosticSource == null) {
            return null;
        }
        return diagnosticSource.getFile();
    }

    public DiagnosticSource getDiagnosticSource() {
        return this.source;
    }

    protected int getIntStartPosition() {
        DiagnosticPosition diagnosticPosition = this.position;
        if (diagnosticPosition == null) {
            return -1;
        }
        return diagnosticPosition.getStartPosition();
    }

    protected int getIntPosition() {
        DiagnosticPosition diagnosticPosition = this.position;
        if (diagnosticPosition == null) {
            return -1;
        }
        return diagnosticPosition.getPreferredPosition();
    }

    protected int getIntEndPosition() {
        DiagnosticPosition diagnosticPosition = this.position;
        if (diagnosticPosition == null) {
            return -1;
        }
        return diagnosticPosition.getEndPosition(this.source.getEndPosTable());
    }

    @Override
    public long getStartPosition() {
        return getIntStartPosition();
    }

    @Override
    public long getPosition() {
        return getIntPosition();
    }

    @Override
    public long getEndPosition() {
        return getIntEndPosition();
    }

    @Override
    public long getLineNumber() {
        return this.line;
    }

    @Override
    public long getColumnNumber() {
        return this.column;
    }

    public Object[] getArgs() {
        return this.args;
    }

    public String getPrefix() {
        return getPrefix(this.type);
    }

    public String getPrefix(DiagnosticType dt) {
        return this.defaultFormatter.formatKind(this, Locale.getDefault());
    }

    public String toString() {
        return this.defaultFormatter.format(this, Locale.getDefault());
    }

    @Override
    public Diagnostic.Kind getKind() {
        int i = C07251.f563xe4eead0a[this.type.ordinal()];
        if (i == 1) {
            return Diagnostic.Kind.NOTE;
        }
        if (i != 2) {
            if (i == 3) {
                return Diagnostic.Kind.ERROR;
            }
            return Diagnostic.Kind.OTHER;
        }
        if (this.flags.contains(DiagnosticFlag.MANDATORY)) {
            return Diagnostic.Kind.MANDATORY_WARNING;
        }
        return Diagnostic.Kind.WARNING;
    }

    @Override
    public String getCode() {
        return this.f561key;
    }

    @Override
    public String getMessage(Locale locale) {
        return this.defaultFormatter.formatMessage(this, locale);
    }

    public void setFlag(DiagnosticFlag flag) {
        this.flags.add(flag);
        if (this.type == DiagnosticType.ERROR) {
            int i = C07251.f562xe4e81d3c[flag.ordinal()];
            if (i == 1) {
                this.flags.remove(DiagnosticFlag.RECOVERABLE);
            } else if (i == 2) {
                this.flags.add(DiagnosticFlag.RECOVERABLE);
            }
        }
    }

    static class C07251 {

        static final int[] f562xe4e81d3c;

        static final int[] f563xe4eead0a;

        static {
            int[] iArr = new int[DiagnosticFlag.values().length];
            f562xe4e81d3c = iArr;
            try {
                iArr[DiagnosticFlag.SYNTAX.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f562xe4e81d3c[DiagnosticFlag.RESOLVE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            int[] iArr2 = new int[DiagnosticType.values().length];
            f563xe4eead0a = iArr2;
            try {
                iArr2[DiagnosticType.NOTE.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f563xe4eead0a[DiagnosticType.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f563xe4eead0a[DiagnosticType.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    public boolean isFlagSet(DiagnosticFlag flag) {
        return this.flags.contains(flag);
    }

    public static class MultilineDiagnostic extends JCDiagnostic {
        private final List<JCDiagnostic> subdiagnostics;

        @Override
        public JavaFileObject getSource() {
            return super.getSource();
        }

        public MultilineDiagnostic(JCDiagnostic other, List<JCDiagnostic> subdiagnostics) {
            super(other.defaultFormatter, other.getType(), other.getLintCategory(), other.flags, other.getDiagnosticSource(), other.position, other.getCode(), other.getArgs());
            this.subdiagnostics = subdiagnostics;
        }

        @Override
        public List<JCDiagnostic> getSubdiagnostics() {
            return this.subdiagnostics;
        }

        @Override
        public boolean isMultiline() {
            return true;
        }
    }
}
