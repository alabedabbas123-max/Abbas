package com.sun.tools.javac.code;

import com.sun.tools.javac.api.Messages;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import java.util.Locale;

public abstract class Printer implements Type.Visitor<String, Locale>, Symbol.Visitor<String, Locale> {
    static final int PRIME = 997;
    List<Type> seenCaptured = List.m507nil();

    protected abstract String capturedVarId(Type.CapturedType capturedType, Locale locale);

    protected abstract String localize(Locale locale, String str, Object... objArr);

    public static Printer createStandardPrinter(final Messages messages) {
        return new Printer() {
            @Override
            public String visitArrayType(Type.ArrayType arrayType, Locale locale) {
                return super.visitArrayType(arrayType, locale);
            }

            @Override
            public String visitCapturedType(Type.CapturedType capturedType, Locale locale) {
                return super.visitCapturedType(capturedType, locale);
            }

            @Override
            public String visitClassSymbol(Symbol.ClassSymbol classSymbol, Locale locale) {
                return super.visitClassSymbol(classSymbol, locale);
            }

            @Override
            public String visitClassType(Type.ClassType classType, Locale locale) {
                return super.visitClassType(classType, locale);
            }

            @Override
            public String visitErrorType(Type.ErrorType errorType, Locale locale) {
                return super.visitErrorType(errorType, locale);
            }

            @Override
            public String visitForAll(Type.ForAll forAll, Locale locale) {
                return super.visitForAll(forAll, locale);
            }

            @Override
            public String visitMethodSymbol(Symbol.MethodSymbol methodSymbol, Locale locale) {
                return super.visitMethodSymbol(methodSymbol, locale);
            }

            @Override
            public String visitMethodType(Type.MethodType methodType, Locale locale) {
                return super.visitMethodType(methodType, locale);
            }

            @Override
            public String visitOperatorSymbol(Symbol.OperatorSymbol operatorSymbol, Locale locale) {
                return super.visitOperatorSymbol(operatorSymbol, locale);
            }

            @Override
            public String visitPackageSymbol(Symbol.PackageSymbol packageSymbol, Locale locale) {
                return super.visitPackageSymbol(packageSymbol, locale);
            }

            @Override
            public String visitPackageType(Type.PackageType packageType, Locale locale) {
                return super.visitPackageType(packageType, locale);
            }

            @Override
            public String visitSymbol(Symbol symbol, Locale locale) {
                return super.visitSymbol(symbol, locale);
            }

            @Override
            public String visitType(Type type, Locale locale) {
                return super.visitType(type, locale);
            }

            @Override
            public String visitTypeSymbol(Symbol.TypeSymbol typeSymbol, Locale locale) {
                return super.visitTypeSymbol(typeSymbol, locale);
            }

            @Override
            public String visitTypeVar(Type.TypeVar typeVar, Locale locale) {
                return super.visitTypeVar(typeVar, locale);
            }

            @Override
            public String visitUndetVar(Type.UndetVar undetVar, Locale locale) {
                return super.visitUndetVar(undetVar, locale);
            }

            @Override
            public String visitVarSymbol(Symbol.VarSymbol varSymbol, Locale locale) {
                return super.visitVarSymbol(varSymbol, locale);
            }

            @Override
            public String visitWildcardType(Type.WildcardType wildcardType, Locale locale) {
                return super.visitWildcardType(wildcardType, locale);
            }

            @Override
            protected String localize(Locale locale, String key, Object... args) {
                return messages.getLocalizedString(locale, key, args);
            }

            @Override
            protected String capturedVarId(Type.CapturedType t, Locale locale) {
                return ((((long) t.hashCode()) & 4294967295L) % 997) + "";
            }
        };
    }

    public String visitTypes(List<Type> ts, Locale locale) {
        ListBuffer<String> sbuf = ListBuffer.m512lb();
        for (Type t : ts) {
            sbuf.append(visit(t, locale));
        }
        return sbuf.toList().toString();
    }

    public String visitSymbols(List<Symbol> ts, Locale locale) {
        ListBuffer<String> sbuf = ListBuffer.m512lb();
        for (Symbol t : ts) {
            sbuf.append(visit(t, locale));
        }
        return sbuf.toList().toString();
    }

    public String visit(Type t, Locale locale) {
        return (String) t.accept(this, locale);
    }

    public String visit(Symbol s, Locale locale) {
        return (String) s.accept(this, locale);
    }

    @Override
    public String visitCapturedType(Type.CapturedType t, Locale locale) {
        if (this.seenCaptured.contains(t)) {
            return localize(locale, "compiler.misc.type.captureof.1", capturedVarId(t, locale));
        }
        try {
            this.seenCaptured = this.seenCaptured.prepend(t);
            return localize(locale, "compiler.misc.type.captureof", capturedVarId(t, locale), visit(t.wildcard, locale));
        } finally {
            this.seenCaptured = this.seenCaptured.tail;
        }
    }

    @Override
    public String visitForAll(Type.ForAll t, Locale locale) {
        return "<" + visitTypes(t.tvars, locale) + ">" + visit(t.qtype, locale);
    }

    @Override
    public String visitUndetVar(Type.UndetVar t, Locale locale) {
        if (t.inst != null) {
            return visit(t.inst, locale);
        }
        return visit(t.qtype, locale) + "?";
    }

    @Override
    public String visitArrayType(Type.ArrayType t, Locale locale) {
        return visit(t.elemtype, locale) + "[]";
    }

    @Override
    public String visitClassType(Type.ClassType t, Locale locale) {
        StringBuffer buf = new StringBuffer();
        if (t.getEnclosingType().f344tag == 10 && t.tsym.owner.kind == 2) {
            buf.append(visit(t.getEnclosingType(), locale));
            buf.append(".");
            buf.append(className(t, false, locale));
        } else {
            buf.append(className(t, true, locale));
        }
        if (t.getTypeArguments().nonEmpty()) {
            buf.append('<');
            buf.append(visitTypes(t.getTypeArguments(), locale));
            buf.append(">");
        }
        return buf.toString();
    }

    @Override
    public String visitMethodType(Type.MethodType t, Locale locale) {
        return "(" + printMethodArgs(t.argtypes, false, locale) + ")" + visit(t.restype, locale);
    }

    @Override
    public String visitPackageType(Type.PackageType t, Locale locale) {
        return t.tsym.getQualifiedName().toString();
    }

    @Override
    public String visitWildcardType(Type.WildcardType t, Locale locale) {
        StringBuffer s = new StringBuffer();
        s.append(t.kind);
        if (t.kind != BoundKind.UNBOUND) {
            s.append(visit(t.type, locale));
        }
        return s.toString();
    }

    @Override
    public String visitErrorType(Type.ErrorType t, Locale locale) {
        return visitType((Type) t, locale);
    }

    @Override
    public String visitTypeVar(Type.TypeVar t, Locale locale) {
        return visitType((Type) t, locale);
    }

    @Override
    public String visitType(Type t, Locale locale) {
        if (t.tsym == null || t.tsym.name == null) {
            String s = localize(locale, "compiler.misc.type.none", new Object[0]);
            return s;
        }
        String s2 = t.tsym.name.toString();
        return s2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String className(Type.ClassType t, boolean longform, Locale locale) {
        Symbol sym = t.tsym;
        if (sym.name.length() == 0 && (sym.flags() & 16777216) != 0) {
            StringBuffer s = new StringBuffer(visit(t.supertype_field, locale));
            for (List list = t.interfaces_field; list.nonEmpty(); list = list.tail) {
                s.append("&");
                s.append(visit((Type) list.head, locale));
            }
            return s.toString();
        }
        if (sym.name.length() == 0) {
            Type.ClassType norm = (Type.ClassType) t.tsym.type;
            if (norm == null) {
                String s2 = localize(locale, "compiler.misc.anonymous.class", null);
                return s2;
            }
            if (norm.interfaces_field.nonEmpty()) {
                String s3 = localize(locale, "compiler.misc.anonymous.class", visit(norm.interfaces_field.head, locale));
                return s3;
            }
            String s4 = localize(locale, "compiler.misc.anonymous.class", visit(norm.supertype_field, locale));
            return s4;
        }
        if (longform) {
            return sym.getQualifiedName().toString();
        }
        return sym.name.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String printMethodArgs(List<Type> list, boolean z, Locale locale) {
        if (!z) {
            return visitTypes(list, locale);
        }
        StringBuffer stringBuffer = new StringBuffer();
        List list2 = list;
        while (list2.tail.nonEmpty()) {
            stringBuffer.append(visit((Type) list2.head, locale));
            List list3 = list2.tail;
            stringBuffer.append(',');
            list2 = list3;
        }
        if (((Type) list2.head).f344tag == 11) {
            stringBuffer.append(visit(((Type.ArrayType) list2.head).elemtype, locale));
            stringBuffer.append("...");
        } else {
            stringBuffer.append(visit((Type) list2.head, locale));
        }
        return stringBuffer.toString();
    }

    @Override
    public String visitClassSymbol(Symbol.ClassSymbol sym, Locale locale) {
        return sym.name.isEmpty() ? localize(locale, "compiler.misc.anonymous.class", sym.flatname) : sym.fullname.toString();
    }

    @Override
    public String visitMethodSymbol(Symbol.MethodSymbol s, Locale locale) {
        String ms;
        if (s.isStaticOrInstanceInit()) {
            return s.owner.name.toString();
        }
        if (s.name == s.name.table.names.init) {
            ms = s.owner.name.toString();
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

    @Override
    public String visitOperatorSymbol(Symbol.OperatorSymbol s, Locale locale) {
        return visitMethodSymbol((Symbol.MethodSymbol) s, locale);
    }

    @Override
    public String visitPackageSymbol(Symbol.PackageSymbol s, Locale locale) {
        if (s.isUnnamed()) {
            return localize(locale, "compiler.misc.unnamed.package", new Object[0]);
        }
        return s.fullname.toString();
    }

    @Override
    public String visitTypeSymbol(Symbol.TypeSymbol s, Locale locale) {
        return visitSymbol((Symbol) s, locale);
    }

    @Override
    public String visitVarSymbol(Symbol.VarSymbol s, Locale locale) {
        return visitSymbol((Symbol) s, locale);
    }

    @Override
    public String visitSymbol(Symbol s, Locale locale) {
        return s.name.toString();
    }
}
