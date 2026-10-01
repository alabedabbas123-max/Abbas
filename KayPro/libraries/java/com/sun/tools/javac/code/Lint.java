package com.sun.tools.javac.code;

import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.Options;
import com.sun.tools.javac.util.Pair;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class Lint {
    protected static final Context.C0723Key<Lint> lintKey = new Context.C0723Key<>();

    private static Map<String, LintCategory> f335map = new HashMap();
    private final AugmentVisitor augmentor;
    private final EnumSet<LintCategory> suppressedValues;
    private final EnumSet<LintCategory> values;

    public static Lint instance(Context context) {
        Lint instance = (Lint) context.m501get(lintKey);
        if (instance == null) {
            return new Lint(context);
        }
        return instance;
    }

    public Lint augment(Attribute.Compound attr) {
        return this.augmentor.augment(this, attr);
    }

    public Lint augment(List<Attribute.Compound> attrs) {
        return this.augmentor.augment(this, attrs);
    }

    public Lint augment(List<Attribute.Compound> attrs, long flags) {
        Lint l = this.augmentor.augment(this, attrs);
        if ((131072 & flags) != 0) {
            if (l == this) {
                l = new Lint(this);
            }
            l.values.remove(LintCategory.DEPRECATION);
            l.suppressedValues.add(LintCategory.DEPRECATION);
        }
        return l;
    }

    protected Lint(Context context) {
        Options options = Options.instance(context);
        this.values = EnumSet.noneOf(LintCategory.class);
        for (Map.Entry<String, LintCategory> e : f335map.entrySet()) {
            if (options.lint(e.getKey())) {
                this.values.add(e.getValue());
            }
        }
        this.suppressedValues = EnumSet.noneOf(LintCategory.class);
        context.m504put(lintKey, this);
        this.augmentor = new AugmentVisitor(context);
    }

    protected Lint(Lint other) {
        this.augmentor = other.augmentor;
        this.values = other.values.clone();
        this.suppressedValues = other.suppressedValues.clone();
    }

    public String toString() {
        return "Lint:[values" + this.values + " suppressedValues" + this.suppressedValues + "]";
    }

    public enum LintCategory {
        CAST("cast"),
        CLASSFILE("classfile"),
        DEPRECATION("deprecation"),
        DEP_ANN("dep-ann"),
        DIVZERO("divzero"),
        EMPTY("empty"),
        FALLTHROUGH("fallthrough"),
        FINALLY("finally"),
        OPTIONS("options"),
        OVERRIDES("overrides"),
        PATH("path"),
        PROCESSING("processing"),
        RAW("rawtypes"),
        SERIAL("serial"),
        STATIC("static"),
        SUNAPI("sunapi", true),
        TRY("try"),
        UNCHECKED("unchecked"),
        VARARGS("varargs");

        public final boolean hidden;
        public final String option;

        LintCategory(String option) {
            this(option, false);
        }

        LintCategory(String option, boolean hidden) {
            this.option = option;
            this.hidden = hidden;
            Lint.f335map.put(option, this);
        }

        static LintCategory m449get(String option) {
            return (LintCategory) Lint.f335map.get(option);
        }
    }

    public boolean isEnabled(LintCategory lc) {
        return this.values.contains(lc);
    }

    public boolean isSuppressed(LintCategory lc) {
        return this.suppressedValues.contains(lc);
    }

    protected static class AugmentVisitor implements Attribute.Visitor {
        private final Context context;
        private Lint lint;
        private Lint parent;
        private Symtab syms;

        AugmentVisitor(Context context) {
            this.context = context;
        }

        Lint augment(Lint parent, Attribute.Compound attr) {
            initSyms();
            this.parent = parent;
            this.lint = null;
            attr.accept(this);
            Lint lint = this.lint;
            return lint == null ? parent : lint;
        }

        Lint augment(Lint parent, List<Attribute.Compound> attrs) {
            initSyms();
            this.parent = parent;
            this.lint = null;
            for (Attribute.Compound a : attrs) {
                a.accept(this);
            }
            Lint lint = this.lint;
            return lint == null ? parent : lint;
        }

        private void initSyms() {
            if (this.syms == null) {
                this.syms = Symtab.instance(this.context);
            }
        }

        private void suppress(LintCategory lc) {
            if (this.lint == null) {
                this.lint = new Lint(this.parent);
            }
            this.lint.suppressedValues.add(lc);
            this.lint.values.remove(lc);
        }

        @Override
        public void visitConstant(Attribute.Constant value) {
            LintCategory lc;
            if (value.type.tsym == this.syms.stringType.tsym && (lc = LintCategory.m449get((String) value.value)) != null) {
                suppress(lc);
            }
        }

        @Override
        public void visitClass(Attribute.Class clazz) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override
        public void visitCompound(Attribute.Compound compound) {
            if (compound.type.tsym == this.syms.suppressWarningsType.tsym) {
                for (List list = compound.values; list.nonEmpty(); list = list.tail) {
                    Pair<Symbol.MethodSymbol, Attribute> value = (Pair) list.head;
                    if (value.f577fst.name.toString().equals("value")) {
                        value.f578snd.accept(this);
                    }
                }
            }
        }

        @Override
        public void visitArray(Attribute.Array array) {
            for (Attribute value : array.values) {
                value.accept(this);
            }
        }

        @Override
        public void visitEnum(Attribute.Enum e) {
        }

        @Override
        public void visitError(Attribute.Error e) {
        }
    }
}
