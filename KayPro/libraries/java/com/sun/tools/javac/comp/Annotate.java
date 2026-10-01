package com.sun.tools.javac.comp;

import com.sun.tools.javac.code.Attribute;
import com.sun.tools.javac.code.Kinds;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Symtab;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.code.Types;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeInfo;
import com.sun.tools.javac.tree.TreeMaker;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Names;
import com.sun.tools.javac.util.Pair;

public class Annotate {
    protected static final Context.C0723Key<Annotate> annotateKey = new Context.C0723Key<>();
    final Attr attr;
    final ConstFold cfolder;

    final Check f354chk;

    final Log f355log;
    final TreeMaker make;
    final Names names;

    final Resolve f357rs;
    final Symtab syms;
    final Types types;
    private int enterCount = 0;

    ListBuffer<Annotator> f356q = new ListBuffer<>();

    public interface Annotator {
        void enterAnnotation();

        String toString();
    }

    public static Annotate instance(Context context) {
        Annotate instance = (Annotate) context.m501get(annotateKey);
        if (instance == null) {
            return new Annotate(context);
        }
        return instance;
    }

    protected Annotate(Context context) {
        context.m504put(annotateKey, this);
        this.attr = Attr.instance(context);
        this.make = TreeMaker.instance(context);
        this.f355log = Log.instance(context);
        this.syms = Symtab.instance(context);
        this.names = Names.instance(context);
        this.f357rs = Resolve.instance(context);
        this.types = Types.instance(context);
        this.cfolder = ConstFold.instance(context);
        this.f354chk = Check.instance(context);
    }

    public void later(Annotator a) {
        this.f356q.append(a);
    }

    public void earlier(Annotator a) {
        this.f356q.prepend(a);
    }

    public void enterStart() {
        this.enterCount++;
    }

    public void enterDone() {
        this.enterCount--;
        flush();
    }

    public void flush() {
        int i = this.enterCount;
        if (i != 0) {
            return;
        }
        this.enterCount = i + 1;
        while (this.f356q.nonEmpty()) {
            try {
                this.f356q.next().enterAnnotation();
            } catch (Throwable th) {
                this.enterCount--;
                throw th;
            }
        }
        this.enterCount--;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v33, types: [A, com.sun.tools.javac.tree.JCTree$JCAssign] */
    Attribute.Compound enterAnnotation(JCTree.JCAnnotation a, Type expected, Env<AttrContext> env) {
        Type at = a.annotationType.type != null ? a.annotationType.type : this.attr.attribType(a.annotationType, env);
        a.type = this.f354chk.checkType(a.annotationType.m489pos(), at, expected);
        if (a.type.isErroneous()) {
            return new Attribute.Compound(a.type, List.m507nil());
        }
        if ((a.type.tsym.flags() & 8192) == 0) {
            this.f355log.error(a.annotationType.m489pos(), "not.annotation.type", a.type.toString());
            return new Attribute.Compound(a.type, List.m507nil());
        }
        List<JCTree.JCExpression> args = a.args;
        int i = 30;
        if (args.length() == 1 && args.head.getTag() != 30) {
            args.head = this.make.m495at(args.head.f531pos).Assign(this.make.Ident(this.names.value), args.head);
        }
        ListBuffer<Pair<Symbol.MethodSymbol, Attribute>> buf = new ListBuffer<>();
        List list = args;
        while (list.nonEmpty()) {
            JCTree.JCExpression t = (JCTree.JCExpression) list.head;
            if (t.getTag() != i) {
                this.f355log.error(t.m489pos(), "annotation.value.must.be.name.value", new Object[0]);
            } else {
                JCTree.JCAssign assign = (JCTree.JCAssign) t;
                if (assign.f532lhs.getTag() != 35) {
                    this.f355log.error(t.m489pos(), "annotation.value.must.be.name.value", new Object[0]);
                } else {
                    JCTree.JCIdent left = (JCTree.JCIdent) assign.f532lhs;
                    ListBuffer<Pair<Symbol.MethodSymbol, Attribute>> buf2 = buf;
                    Symbol method = this.f357rs.resolveQualifiedMethod(left.m489pos(), env, a.type, left.name, List.m507nil(), null);
                    left.f543sym = method;
                    left.type = method.type;
                    if (method.owner != a.type.tsym) {
                        this.f355log.error(left.m489pos(), "no.annotation.member", left.name, a.type);
                    }
                    Type result = method.type.mo574getReturnType();
                    Attribute value = enterAttributeValue(result, assign.f533rhs, env);
                    if (method.type.isErroneous()) {
                        buf = buf2;
                    } else {
                        buf = buf2;
                        buf.append(new Pair<>((Symbol.MethodSymbol) method, value));
                    }
                    t.type = result;
                }
            }
            list = list.tail;
            i = 30;
        }
        return new Attribute.Compound(a.type, buf.toList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    Attribute enterAttributeValue(Type expected, JCTree.JCExpression tree, Env<AttrContext> env) {
        try {
            expected.tsym.complete();
            if (expected.isPrimitive() || this.types.isSameType(expected, this.syms.stringType)) {
                Type result = this.attr.attribExpr(tree, env, expected);
                if (result.isErroneous()) {
                    return new Attribute.Error(expected);
                }
                if (result.constValue() == null) {
                    this.f355log.error(tree.m489pos(), "attribute.value.must.be.constant", new Object[0]);
                    return new Attribute.Error(expected);
                }
                return new Attribute.Constant(expected, this.cfolder.coerce(result, expected).constValue());
            }
            if (expected.tsym == this.syms.classType.tsym) {
                if (this.attr.attribExpr(tree, env, expected).isErroneous()) {
                    return new Attribute.Error(expected);
                }
                if (TreeInfo.name(tree) != this.names._class) {
                    this.f355log.error(tree.m489pos(), "annotation.value.must.be.class.literal", new Object[0]);
                    return new Attribute.Error(expected);
                }
                return new Attribute.Class(this.types, ((JCTree.JCFieldAccess) tree).selected.type);
            }
            if ((expected.tsym.flags() & 8192) != 0) {
                if (tree.getTag() != 44) {
                    this.f355log.error(tree.m489pos(), "annotation.value.must.be.annotation", new Object[0]);
                    expected = this.syms.errorType;
                }
                return enterAnnotation((JCTree.JCAnnotation) tree, expected, env);
            }
            if (expected.f344tag == 11) {
                if (tree.getTag() != 28) {
                    tree = this.make.m495at(tree.f531pos).NewArray(null, List.m507nil(), List.m508of(tree));
                }
                JCTree.JCNewArray na = (JCTree.JCNewArray) tree;
                if (na.elemtype != null) {
                    this.f355log.error(na.elemtype.m489pos(), "new.not.allowed.in.annotation", new Object[0]);
                    return new Attribute.Error(expected);
                }
                ListBuffer<Attribute> buf = new ListBuffer<>();
                for (List list = na.elems; list.nonEmpty(); list = list.tail) {
                    buf.append(enterAttributeValue(this.types.elemtype(expected), (JCTree.JCExpression) list.head, env));
                }
                na.type = expected;
                return new Attribute.Array(expected, (Attribute[]) buf.toArray(new Attribute[buf.length()]));
            }
            if (expected.f344tag == 10 && (expected.tsym.flags() & 16384) != 0) {
                this.attr.attribExpr(tree, env, expected);
                Symbol sym = TreeInfo.symbol(tree);
                if (sym == null || TreeInfo.nonstaticSelect(tree) || sym.kind != 4 || (16384 & sym.flags()) == 0) {
                    this.f355log.error(tree.m489pos(), "enum.annotation.must.be.enum.constant", new Object[0]);
                    return new Attribute.Error(expected);
                }
                Symbol.VarSymbol enumerator = (Symbol.VarSymbol) sym;
                return new Attribute.Enum(expected, enumerator);
            }
            if (!expected.isErroneous()) {
                this.f355log.error(tree.m489pos(), "annotation.value.not.allowable.type", new Object[0]);
            }
            return new Attribute.Error(this.attr.attribExpr(tree, env, expected));
        } catch (Symbol.CompletionFailure e) {
            this.f355log.error(tree.m489pos(), "cant.resolve", Kinds.kindName(e.f340sym), e.f340sym);
            return new Attribute.Error(expected);
        }
    }
}
