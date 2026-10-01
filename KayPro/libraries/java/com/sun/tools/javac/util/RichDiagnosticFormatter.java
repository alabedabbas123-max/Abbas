package com.sun.tools.javac.util;

import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.code.Kinds;
import com.sun.tools.javac.code.Printer;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Symtab;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.code.Types;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class RichDiagnosticFormatter extends ForwardingDiagnosticFormatter<JCDiagnostic, AbstractDiagnosticFormatter> {
    final JCDiagnostic.Factory diags;
    final JavacMessages messages;
    protected ClassNameSimplifier nameSimplifier;
    private RichPrinter printer;
    protected Types.DefaultSymbolVisitor<Void, Void> symbolPreprocessor;
    final Symtab syms;
    protected Types.UnaryVisitor<Void> typePreprocessor;
    final Types types;
    Map<WhereClauseKind, Map<Type, JCDiagnostic>> whereClauses;

    public static RichDiagnosticFormatter instance(Context context) {
        RichDiagnosticFormatter instance = (RichDiagnosticFormatter) context.m502get(RichDiagnosticFormatter.class);
        if (instance == null) {
            return new RichDiagnosticFormatter(context);
        }
        return instance;
    }

    protected RichDiagnosticFormatter(Context context) {
        super((AbstractDiagnosticFormatter) Log.instance(context).getDiagnosticFormatter());
        this.typePreprocessor = new Types.UnaryVisitor<Void>() {
            public Void visit(List<Type> ts) {
                for (Type t : ts) {
                    visit(t);
                }
                return null;
            }

            @Override
            public Void visitForAll(Type.ForAll t, Void ignored) {
                visit(t.tvars);
                visit(t.qtype);
                return null;
            }

            @Override
            public Void visitMethodType(Type.MethodType t, Void ignored) {
                visit(t.argtypes);
                visit(t.restype);
                return null;
            }

            @Override
            public Void visitErrorType(Type.ErrorType t, Void ignored) {
                Type ot = t.getOriginalType();
                if (ot != null) {
                    visit(ot);
                    return null;
                }
                return null;
            }

            @Override
            public Void visitArrayType(Type.ArrayType t, Void ignored) {
                visit(t.elemtype);
                return null;
            }

            @Override
            public Void visitWildcardType(Type.WildcardType t, Void ignored) {
                visit(t.type);
                return null;
            }

            @Override
            public Void visitType(Type t, Void ignored) {
                return null;
            }

            @Override
            public Void visitCapturedType(Type.CapturedType t, Void ignored) {
                if (RichDiagnosticFormatter.this.indexOf(t, WhereClauseKind.CAPTURED) == -1) {
                    String suffix = t.lower == RichDiagnosticFormatter.this.syms.botType ? ".1" : "";
                    JCDiagnostic d = RichDiagnosticFormatter.this.diags.fragment("where.captured" + suffix, t, t.bound, t.lower, t.wildcard);
                    RichDiagnosticFormatter.this.whereClauses.get(WhereClauseKind.CAPTURED).put(t, d);
                    visit(t.wildcard);
                    visit(t.lower);
                    visit(t.bound);
                    return null;
                }
                return null;
            }

            @Override
            public Void visitClassType(Type.ClassType t, Void ignored) {
                if (t.isCompound() && RichDiagnosticFormatter.this.indexOf(t, WhereClauseKind.INTERSECTION) == -1) {
                    Type supertype = RichDiagnosticFormatter.this.types.supertype(t);
                    List<Type> interfaces = RichDiagnosticFormatter.this.types.interfaces(t);
                    JCDiagnostic d = RichDiagnosticFormatter.this.diags.fragment("where.intersection", t, interfaces.prepend(supertype));
                    RichDiagnosticFormatter.this.whereClauses.get(WhereClauseKind.INTERSECTION).put(t, d);
                    visit(supertype);
                    visit(interfaces);
                }
                RichDiagnosticFormatter.this.nameSimplifier.addUsage(t.tsym);
                visit(t.getTypeArguments());
                if (t.getEnclosingType() != Type.noType) {
                    visit(t.getEnclosingType());
                    return null;
                }
                return null;
            }

            @Override
            public Void visitTypeVar(Type.TypeVar t, Void ignored) {
                List<Type> bounds;
                if (RichDiagnosticFormatter.this.indexOf(t, WhereClauseKind.TYPEVAR) == -1) {
                    Type bound = t.bound;
                    while (bound instanceof Type.ErrorType) {
                        bound = ((Type.ErrorType) bound).getOriginalType();
                    }
                    if (bound != null) {
                        bounds = RichDiagnosticFormatter.this.types.getBounds(t);
                    } else {
                        bounds = List.m507nil();
                    }
                    RichDiagnosticFormatter.this.nameSimplifier.addUsage(t.tsym);
                    boolean boundErroneous = bounds.head == null || bounds.head.f344tag == 18 || bounds.head.f344tag == 19;
                    JCDiagnostic.Factory factory = RichDiagnosticFormatter.this.diags;
                    StringBuilder sb = new StringBuilder();
                    sb.append("where.typevar");
                    sb.append(boundErroneous ? ".1" : "");
                    JCDiagnostic d = factory.fragment(sb.toString(), t, bounds, Kinds.kindName(t.tsym.location()), t.tsym.location());
                    RichDiagnosticFormatter.this.whereClauses.get(WhereClauseKind.TYPEVAR).put(t, d);
                    RichDiagnosticFormatter.this.symbolPreprocessor.visit(t.tsym.location(), null);
                    visit(bounds);
                }
                return null;
            }
        };
        this.symbolPreprocessor = new Types.DefaultSymbolVisitor<Void, Void>() {
            @Override
            public Void visitClassSymbol(Symbol.ClassSymbol s, Void ignored) {
                RichDiagnosticFormatter.this.nameSimplifier.addUsage(s);
                return null;
            }

            @Override
            public Void visitSymbol(Symbol s, Void ignored) {
                return null;
            }

            @Override
            public Void visitMethodSymbol(Symbol.MethodSymbol s, Void ignored) {
                visit(s.owner, null);
                if (s.type != null) {
                    RichDiagnosticFormatter.this.typePreprocessor.visit(s.type);
                }
                return null;
            }
        };
        setRichPrinter(new RichPrinter());
        this.syms = Symtab.instance(context);
        this.diags = JCDiagnostic.Factory.instance(context);
        this.types = Types.instance(context);
        this.messages = JavacMessages.instance(context);
        this.whereClauses = new LinkedHashMap();
        this.configuration = new RichConfiguration(Options.instance(context), (AbstractDiagnosticFormatter) this.formatter);
        for (WhereClauseKind kind : WhereClauseKind.values()) {
            this.whereClauses.put(kind, new LinkedHashMap());
        }
    }

    @Override
    public String format(JCDiagnostic diag, Locale l) {
        StringBuilder sb = new StringBuilder();
        this.nameSimplifier = new ClassNameSimplifier();
        for (WhereClauseKind kind : WhereClauseKind.values()) {
            this.whereClauses.get(kind).clear();
        }
        preprocessDiagnostic(diag);
        sb.append(((AbstractDiagnosticFormatter) this.formatter).format(diag, l));
        if (getConfiguration().isEnabled(RichConfiguration.RichFormatterFeature.WHERE_CLAUSES)) {
            List<JCDiagnostic> clauses = getWhereClauses();
            String indent = ((AbstractDiagnosticFormatter) this.formatter).isRaw() ? "" : ((AbstractDiagnosticFormatter) this.formatter).indentString(2);
            for (JCDiagnostic d : clauses) {
                String whereClause = ((AbstractDiagnosticFormatter) this.formatter).format(d, l);
                if (whereClause.length() > 0) {
                    sb.append('\n' + indent + whereClause);
                }
            }
        }
        return sb.toString();
    }

    protected void setRichPrinter(RichPrinter printer) {
        this.printer = printer;
        ((AbstractDiagnosticFormatter) this.formatter).setPrinter(printer);
    }

    protected RichPrinter getRichPrinter() {
        return this.printer;
    }

    protected void preprocessDiagnostic(JCDiagnostic diag) {
        for (Object o : diag.getArgs()) {
            if (o != null) {
                preprocessArgument(o);
            }
        }
        if (diag.isMultiline()) {
            for (JCDiagnostic d : diag.getSubdiagnostics()) {
                preprocessDiagnostic(d);
            }
        }
    }

    protected void preprocessArgument(Object arg) {
        if (arg instanceof Type) {
            preprocessType((Type) arg);
            return;
        }
        if (arg instanceof Symbol) {
            preprocessSymbol((Symbol) arg);
            return;
        }
        if (arg instanceof JCDiagnostic) {
            preprocessDiagnostic((JCDiagnostic) arg);
        } else if (arg instanceof Iterable) {
            for (Object o : (Iterable) arg) {
                preprocessArgument(o);
            }
        }
    }

    protected List<JCDiagnostic> getWhereClauses() {
        List<JCDiagnostic> clauses = List.m507nil();
        for (WhereClauseKind kind : WhereClauseKind.values()) {
            List<JCDiagnostic> lines = List.m507nil();
            for (Map.Entry<Type, JCDiagnostic> entry : this.whereClauses.get(kind).entrySet()) {
                lines = lines.prepend(entry.getValue());
            }
            if (!lines.isEmpty()) {
                String key = kind.m519key();
                if (lines.size() > 1) {
                    key = key + ".1";
                }
                JCDiagnostic d = this.diags.fragment(key, this.whereClauses.get(kind).keySet());
                clauses = clauses.prepend(new JCDiagnostic.MultilineDiagnostic(d, lines.reverse()));
            }
        }
        return clauses.reverse();
    }

    public int indexOf(Type type, WhereClauseKind kind) {
        int index = 1;
        for (Type t : this.whereClauses.get(kind).keySet()) {
            if (t.tsym == type.tsym) {
                return index;
            }
            if (kind != WhereClauseKind.TYPEVAR || t.toString().equals(type.toString())) {
                index++;
            }
        }
        return -1;
    }

    public boolean unique(Type.TypeVar typevar) {
        int found = 0;
        for (Type t : this.whereClauses.get(WhereClauseKind.TYPEVAR).keySet()) {
            if (t.toString().equals(typevar.toString())) {
                found++;
            }
        }
        if (found >= 1) {
            return found == 1;
        }
        throw new AssertionError("Missing type variable in where clause " + typevar);
    }

    enum WhereClauseKind {
        TYPEVAR("where.description.typevar"),
        CAPTURED("where.description.captured"),
        INTERSECTION("where.description.intersection");


        private String f579key;

        WhereClauseKind(String key) {
            this.f579key = key;
        }

        String m519key() {
            return this.f579key;
        }
    }

    protected class ClassNameSimplifier {
        Map<Name, List<Symbol>> nameClashes = new HashMap();

        protected ClassNameSimplifier() {
        }

        protected void addUsage(Symbol sym) {
            Name n = sym.getSimpleName();
            List<Symbol> conflicts = this.nameClashes.get(n);
            if (conflicts == null) {
                conflicts = List.m507nil();
            }
            if (!conflicts.contains(sym)) {
                this.nameClashes.put(n, conflicts.append(sym));
            }
        }

        public String simplify(Symbol s) {
            String name = s.getQualifiedName().toString();
            if (!s.type.isCompound()) {
                List<Symbol> conflicts = this.nameClashes.get(s.getSimpleName());
                if (conflicts == null || (conflicts.size() == 1 && conflicts.contains(s))) {
                    List<Name> l = List.m507nil();
                    Symbol s2 = s;
                    while (s2.type.getEnclosingType().f344tag == 10 && s2.owner.kind == 2) {
                        l = l.prepend(s2.getSimpleName());
                        s2 = s2.owner;
                    }
                    List<Name> l2 = l.prepend(s2.getSimpleName());
                    StringBuilder buf = new StringBuilder();
                    String sep = "";
                    for (Name n2 : l2) {
                        buf.append(sep);
                        buf.append((CharSequence) n2);
                        sep = ".";
                    }
                    return buf.toString();
                }
                return name;
            }
            return name;
        }
    }

    protected class RichPrinter extends Printer {
        protected RichPrinter() {
        }

        @Override
        public String localize(Locale locale, String key, Object... args) {
            return ((AbstractDiagnosticFormatter) RichDiagnosticFormatter.this.formatter).localize(locale, key, args);
        }

        @Override
        public String capturedVarId(Type.CapturedType t, Locale locale) {
            return RichDiagnosticFormatter.this.indexOf(t, WhereClauseKind.CAPTURED) + "";
        }

        @Override
        public String visitType(Type t, Locale locale) {
            String s = super.visitType(t, locale);
            if (t == RichDiagnosticFormatter.this.syms.botType) {
                String s2 = localize(locale, "compiler.misc.type.null", new Object[0]);
                return s2;
            }
            return s;
        }

        @Override
        public String visitCapturedType(Type.CapturedType t, Locale locale) {
            if (RichDiagnosticFormatter.this.getConfiguration().isEnabled(RichConfiguration.RichFormatterFeature.WHERE_CLAUSES)) {
                return localize(locale, "compiler.misc.captured.type", Integer.valueOf(RichDiagnosticFormatter.this.indexOf(t, WhereClauseKind.CAPTURED)));
            }
            return super.visitCapturedType(t, locale);
        }

        @Override
        public String visitClassType(Type.ClassType t, Locale locale) {
            if (t.isCompound() && RichDiagnosticFormatter.this.getConfiguration().isEnabled(RichConfiguration.RichFormatterFeature.WHERE_CLAUSES)) {
                return localize(locale, "compiler.misc.intersection.type", Integer.valueOf(RichDiagnosticFormatter.this.indexOf(t, WhereClauseKind.INTERSECTION)));
            }
            return super.visitClassType(t, locale);
        }

        @Override
        protected String className(Type.ClassType t, boolean longform, Locale locale) {
            Symbol sym = t.tsym;
            if (sym.name.length() == 0 || !RichDiagnosticFormatter.this.getConfiguration().isEnabled(RichConfiguration.RichFormatterFeature.SIMPLE_NAMES)) {
                return super.className(t, longform, locale);
            }
            if (longform) {
                return RichDiagnosticFormatter.this.nameSimplifier.simplify(sym).toString();
            }
            return sym.name.toString();
        }

        @Override
        public String visitTypeVar(Type.TypeVar t, Locale locale) {
            if (RichDiagnosticFormatter.this.unique(t) || !RichDiagnosticFormatter.this.getConfiguration().isEnabled(RichConfiguration.RichFormatterFeature.UNIQUE_TYPEVAR_NAMES)) {
                return t.toString();
            }
            return localize(locale, "compiler.misc.type.var", t.toString(), Integer.valueOf(RichDiagnosticFormatter.this.indexOf(t, WhereClauseKind.TYPEVAR)));
        }

        @Override
        protected String printMethodArgs(List<Type> args, boolean varArgs, Locale locale) {
            return super.printMethodArgs(args, varArgs, locale);
        }

        @Override
        public String visitClassSymbol(Symbol.ClassSymbol s, Locale locale) {
            String name = RichDiagnosticFormatter.this.nameSimplifier.simplify(s);
            if (name.length() == 0 || !RichDiagnosticFormatter.this.getConfiguration().isEnabled(RichConfiguration.RichFormatterFeature.SIMPLE_NAMES)) {
                return super.visitClassSymbol(s, locale);
            }
            return name;
        }

        @Override
        public String visitMethodSymbol(Symbol.MethodSymbol s, Locale locale) {
            String ms;
            String ownerName = visit(s.owner, locale);
            if (s.isStaticOrInstanceInit()) {
                return ownerName;
            }
            if (s.name == s.name.table.names.init) {
                ms = ownerName;
            } else {
                ms = s.name.toString();
            }
            if (s.type != null) {
                if (s.type.f344tag == 16) {
                    ms = "<" + visitTypes(s.type.getTypeArguments(), locale) + ">" + ms;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(ms);
                sb.append("(");
                sb.append(printMethodArgs(s.type.mo573getParameterTypes(), (s.flags() & Flags.VARARGS) != 0, locale));
                sb.append(")");
                String ms2 = sb.toString();
                return ms2;
            }
            return ms;
        }
    }

    protected void preprocessType(Type t) {
        this.typePreprocessor.visit(t);
    }

    protected void preprocessSymbol(Symbol s) {
        this.symbolPreprocessor.visit(s, null);
    }

    @Override
    public RichConfiguration getConfiguration() {
        return (RichConfiguration) this.configuration;
    }
}
