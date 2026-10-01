package com.sun.tools.javac.comp;

import com.sun.tools.javac.code.Attribute;
import com.sun.tools.javac.code.DeferredLintHandler;
import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.code.Kinds;
import com.sun.tools.javac.code.Scope;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Symtab;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.code.Types;
import com.sun.tools.javac.jvm.ClassReader;
import com.sun.tools.javac.jvm.Target;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeInfo;
import com.sun.tools.javac.tree.TreeMaker;
import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.FatalError;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;
import com.sun.tools.javac.util.Options;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.tools.JavaFileObject;

public class MemberEnter extends JCTree.Visitor implements Symbol.Completer {
    static final boolean checkClash = true;
    protected static final Context.C0723Key<MemberEnter> memberEnterKey = new Context.C0723Key<>();
    private final Annotate annotate;
    private final Attr attr;

    private final Check f383chk;
    private final DeferredLintHandler deferredLintHandler;
    private final JCDiagnostic.Factory diags;
    private final Enter enter;

    protected Env<AttrContext> f384env;

    private final Log f385log;
    private final TreeMaker make;
    private final Names names;
    private final ClassReader reader;
    private final boolean skipAnnotations;
    private final Symtab syms;
    private final Target target;
    private final Todo todo;
    private final Types types;
    ListBuffer<Env<AttrContext>> halfcompleted = new ListBuffer<>();
    boolean isFirst = checkClash;
    boolean completionEnabled = checkClash;

    public static MemberEnter instance(Context context) {
        MemberEnter instance = (MemberEnter) context.m501get(memberEnterKey);
        if (instance == null) {
            return new MemberEnter(context);
        }
        return instance;
    }

    protected MemberEnter(Context context) {
        context.m504put(memberEnterKey, this);
        this.names = Names.instance(context);
        this.enter = Enter.instance(context);
        this.f385log = Log.instance(context);
        this.f383chk = Check.instance(context);
        this.attr = Attr.instance(context);
        this.syms = Symtab.instance(context);
        this.make = TreeMaker.instance(context);
        this.reader = ClassReader.instance(context);
        this.todo = Todo.instance(context);
        this.annotate = Annotate.instance(context);
        this.types = Types.instance(context);
        this.diags = JCDiagnostic.Factory.instance(context);
        this.target = Target.instance(context);
        this.deferredLintHandler = DeferredLintHandler.instance(context);
        Options options = Options.instance(context);
        this.skipAnnotations = options.isSet("skipAnnotations");
    }

    private void importAll(int pos, Symbol.TypeSymbol tsym, Env<AttrContext> env) {
        if (tsym.kind == 1 && tsym.members().elems == null && !tsym.exists()) {
            if (((Symbol.PackageSymbol) tsym).fullname.equals(this.names.java_lang)) {
                JCDiagnostic msg = this.diags.fragment("fatal.err.no.java.lang", new Object[0]);
                throw new FatalError(msg);
            }
            this.f385log.error(JCDiagnostic.DiagnosticFlag.RESOLVE_ERROR, pos, "doesnt.exist", tsym);
        }
        env.toplevel.starImportScope.importAll(tsym.members());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.sun.tools.javac.comp.MemberEnter$1] */
    private void importStaticAll(int pos, final Symbol.TypeSymbol tsym, Env<AttrContext> env) {
        final JavaFileObject sourcefile = env.toplevel.sourcefile;
        final Scope toScope = env.toplevel.starImportScope;
        final Symbol.PackageSymbol packge = env.toplevel.packge;
        new Object() {
            Set<Symbol> processed = new HashSet();

            void importFrom(Symbol.TypeSymbol tsym2) {
                if (tsym2 != null && this.processed.add(tsym2)) {
                    importFrom(MemberEnter.this.types.supertype(tsym2.type).tsym);
                    for (Type t : MemberEnter.this.types.interfaces(tsym2.type)) {
                        importFrom(t.tsym);
                    }
                    Scope fromScope = tsym2.members();
                    for (Scope.Entry e = fromScope.elems; e != null; e = e.sibling) {
                        Symbol sym = e.f338sym;
                        if (sym.kind == 2 && (sym.flags() & 8) != 0 && MemberEnter.this.staticImportAccessible(sym, packge) && sym.isMemberOf(tsym, MemberEnter.this.types) && !toScope.includes(sym)) {
                            toScope.enter(sym, fromScope, tsym.members());
                        }
                    }
                }
            }
        }.importFrom(tsym);
        this.annotate.earlier(new Annotate.Annotator() {
            Set<Symbol> processed = new HashSet();

            @Override
            public String toString() {
                return "import static " + tsym + ".* in " + sourcefile;
            }

            void importFrom(Symbol.TypeSymbol tsym2) {
                if (tsym2 != null && this.processed.add(tsym2)) {
                    importFrom(MemberEnter.this.types.supertype(tsym2.type).tsym);
                    for (Type t : MemberEnter.this.types.interfaces(tsym2.type)) {
                        importFrom(t.tsym);
                    }
                    Scope fromScope = tsym2.members();
                    for (Scope.Entry e = fromScope.elems; e != null; e = e.sibling) {
                        Symbol sym = e.f338sym;
                        if (sym.isStatic() && sym.kind != 2 && MemberEnter.this.staticImportAccessible(sym, packge) && !toScope.includes(sym) && sym.isMemberOf(tsym, MemberEnter.this.types)) {
                            toScope.enter(sym, fromScope, tsym.members());
                        }
                    }
                }
            }

            @Override
            public void enterAnnotation() {
                importFrom(tsym);
            }
        });
    }

    boolean staticImportAccessible(Symbol sym, Symbol.PackageSymbol packge) {
        int flags = (int) (sym.flags() & 7);
        if (flags != 0) {
            if (flags == 2) {
                return false;
            }
            if (flags != 4) {
                return checkClash;
            }
        }
        if (sym.packge() == packge) {
            return checkClash;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [com.sun.tools.javac.comp.MemberEnter$3] */
    private void importNamedStatic(final JCDiagnostic.DiagnosticPosition pos, final Symbol.TypeSymbol tsym, final Name name, final Env<AttrContext> env) {
        if (tsym.kind != 2) {
            this.f385log.error(JCDiagnostic.DiagnosticFlag.RECOVERABLE, pos, "static.imp.only.classes.and.interfaces", new Object[0]);
            return;
        }
        final Scope toScope = env.toplevel.namedImportScope;
        final Symbol.PackageSymbol packge = env.toplevel.packge;
        new Object() {
            Set<Symbol> processed = new HashSet();

            void importFrom(Symbol.TypeSymbol tsym2) {
                if (tsym2 != null && this.processed.add(tsym2)) {
                    importFrom(MemberEnter.this.types.supertype(tsym2.type).tsym);
                    for (Type t : MemberEnter.this.types.interfaces(tsym2.type)) {
                        importFrom(t.tsym);
                    }
                    for (Scope.Entry e = tsym2.members().lookup(name); e.scope != null; e = e.next()) {
                        Symbol sym = e.f338sym;
                        if (sym.isStatic() && sym.kind == 2 && MemberEnter.this.staticImportAccessible(sym, packge) && sym.isMemberOf(tsym, MemberEnter.this.types) && MemberEnter.this.f383chk.checkUniqueStaticImport(pos, sym, toScope)) {
                            toScope.enter(sym, sym.owner.members(), tsym.members());
                        }
                    }
                }
            }
        }.importFrom(tsym);
        this.annotate.earlier(new Annotate.Annotator() {
            Set<Symbol> processed = new HashSet();
            boolean found = false;

            @Override
            public String toString() {
                return "import static " + tsym + "." + ((Object) name);
            }

            void importFrom(Symbol.TypeSymbol tsym2) {
                if (tsym2 != null && this.processed.add(tsym2)) {
                    importFrom(MemberEnter.this.types.supertype(tsym2.type).tsym);
                    for (Type t : MemberEnter.this.types.interfaces(tsym2.type)) {
                        importFrom(t.tsym);
                    }
                    for (Scope.Entry e = tsym2.members().lookup(name); e.scope != null; e = e.next()) {
                        Symbol sym = e.f338sym;
                        if (sym.isStatic() && MemberEnter.this.staticImportAccessible(sym, packge) && sym.isMemberOf(tsym, MemberEnter.this.types)) {
                            this.found = MemberEnter.checkClash;
                            if (sym.kind == 16 || (sym.kind != 2 && MemberEnter.this.f383chk.checkUniqueStaticImport(pos, sym, toScope))) {
                                toScope.enter(sym, sym.owner.members(), tsym.members());
                            }
                        }
                    }
                }
            }

            @Override
            public void enterAnnotation() {
                JavaFileObject prev = MemberEnter.this.f385log.useSource(env.toplevel.sourcefile);
                try {
                    importFrom(tsym);
                    if (!this.found) {
                        MemberEnter.this.f385log.error(pos, "cant.resolve.location", Kinds.KindName.STATIC, name, List.m507nil(), List.m507nil(), Kinds.typeKindName(tsym.type), tsym.type);
                    }
                } finally {
                    MemberEnter.this.f385log.useSource(prev);
                }
            }
        });
    }

    private void importNamed(JCDiagnostic.DiagnosticPosition pos, Symbol tsym, Env<AttrContext> env) {
        if (tsym.kind == 2 && this.f383chk.checkUniqueImport(pos, tsym, env.toplevel.namedImportScope)) {
            env.toplevel.namedImportScope.enter(tsym, tsym.owner.members());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    Type signature(List<JCTree.JCTypeParameter> typarams, List<JCTree.JCVariableDecl> params, JCTree res, List<JCTree.JCExpression> thrown, Env<AttrContext> env) {
        List<Type> tvars = this.enter.classEnter(typarams, env);
        this.attr.attribTypeVariables(typarams, env);
        ListBuffer<Type> argbuf = new ListBuffer<>();
        for (List list = params; list.nonEmpty(); list = list.tail) {
            memberEnter((JCTree) list.head, env);
            argbuf.append(((JCTree.JCVariableDecl) list.head).vartype.type);
        }
        Type restype = res == null ? this.syms.voidType : this.attr.attribType(res, env);
        ListBuffer<Type> thrownbuf = new ListBuffer<>();
        for (List list2 = thrown; list2.nonEmpty(); list2 = list2.tail) {
            Type exc = this.attr.attribType((JCTree) list2.head, env);
            if (exc.f344tag != 14) {
                exc = this.f383chk.checkClassType(((JCTree.JCExpression) list2.head).m489pos(), exc);
            }
            thrownbuf.append(exc);
        }
        Type mtype = new Type.MethodType(argbuf.toList(), restype, thrownbuf.toList(), this.syms.methodClass);
        return tvars.isEmpty() ? mtype : new Type.ForAll(tvars, mtype);
    }

    protected void memberEnter(JCTree tree, Env<AttrContext> env) {
        Env<AttrContext> prevEnv = this.f384env;
        try {
            try {
                this.f384env = env;
                tree.accept(this);
            } catch (Symbol.CompletionFailure ex) {
                this.f383chk.completionError(tree.m489pos(), ex);
            }
        } finally {
            this.f384env = prevEnv;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void memberEnter(List<? extends JCTree> trees, Env<AttrContext> env) {
        for (List list = trees; list.nonEmpty(); list = list.tail) {
            memberEnter((JCTree) list.head, env);
        }
    }

    void finishClass(JCTree.JCClassDecl tree, Env<AttrContext> env) {
        if ((tree.mods.flags & 16384) != 0 && (this.types.supertype(tree.f539sym.type).tsym.flags() & 16384) == 0) {
            addEnumMembers(tree, env);
        }
        memberEnter(tree.defs, env);
    }

    private void addEnumMembers(JCTree.JCClassDecl tree, Env<AttrContext> env) {
        JCTree.JCExpression valuesType = this.make.Type(new Type.ArrayType(tree.f539sym.type, this.syms.arrayClass));
        TreeMaker treeMaker = this.make;
        JCTree.JCMethodDecl values = treeMaker.MethodDef(treeMaker.Modifiers(9L), this.names.values, valuesType, List.m507nil(), List.m507nil(), List.m507nil(), null, null);
        memberEnter(values, env);
        TreeMaker treeMaker2 = this.make;
        JCTree.JCModifiers jCModifiersModifiers = treeMaker2.Modifiers(9L);
        Name name = this.names.valueOf;
        JCTree.JCExpression jCExpressionType = this.make.Type(tree.f539sym.type);
        List<JCTree.JCTypeParameter> listM507nil = List.m507nil();
        TreeMaker treeMaker3 = this.make;
        JCTree.JCMethodDecl valueOf = treeMaker2.MethodDef(jCModifiersModifiers, name, jCExpressionType, listM507nil, List.m508of(treeMaker3.VarDef(treeMaker3.Modifiers(Flags.PARAMETER), this.names.fromString("name"), this.make.Type(this.syms.stringType), null)), List.m507nil(), null, null);
        memberEnter(valueOf, env);
        if (this.target.compilerBootstrap(tree.f539sym)) {
            JCTree.JCMethodDecl ordinal = this.make.m495at(tree.f531pos).MethodDef(this.make.Modifiers(17L), this.names.ordinal, this.make.Type(this.syms.intType), List.m507nil(), List.m507nil(), List.m507nil(), null, null);
            memberEnter(ordinal, env);
            TreeMaker treeMaker4 = this.make;
            JCTree.JCMethodDecl name2 = treeMaker4.MethodDef(treeMaker4.Modifiers(17L), this.names._name, this.make.Type(this.syms.stringType), List.m507nil(), List.m507nil(), List.m507nil(), null, null);
            memberEnter(name2, env);
            Symbol.MethodSymbol compareTo = new Symbol.MethodSymbol(1L, this.names.compareTo, new Type.MethodType(List.m508of(tree.f539sym.type), this.syms.intType, List.m507nil(), this.syms.methodClass), tree.f539sym);
            memberEnter(this.make.MethodDef(compareTo, null), env);
        }
    }

    @Override
    public void visitTopLevel(JCTree.JCCompilationUnit tree) {
        if (tree.starImportScope.elems != null) {
            return;
        }
        if (tree.f540pid != null) {
            for (Symbol p = tree.packge; p.owner != this.syms.rootPackage; p = p.owner) {
                p.owner.complete();
                if (this.syms.classes.get(p.getQualifiedName()) != null) {
                    this.f385log.error(tree.f531pos, "pkg.clashes.with.class.of.same.name", p);
                }
            }
        }
        annotateLater(tree.packageAnnotations, this.f384env, tree.packge);
        importAll(tree.f531pos, this.reader.enterPackage(this.names.java_lang), this.f384env);
        memberEnter(tree.defs, this.f384env);
    }

    @Override
    public void visitImport(JCTree.JCImport tree) {
        JCTree imp = tree.qualid;
        Name name = TreeInfo.name(imp);
        Env<AttrContext> localEnv = this.f384env.m465dup(tree);
        JCTree.JCFieldAccess s = (JCTree.JCFieldAccess) imp;
        Symbol.TypeSymbol p = this.attr.attribTree(s.selected, localEnv, tree.staticImport ? 2 : 3, Type.noType).tsym;
        if (name == this.names.asterisk) {
            this.f383chk.checkCanonical(s.selected);
            if (tree.staticImport) {
                importStaticAll(tree.f531pos, p, this.f384env);
                return;
            } else {
                importAll(tree.f531pos, p, this.f384env);
                return;
            }
        }
        if (tree.staticImport) {
            importNamedStatic(tree.m489pos(), p, name, localEnv);
            this.f383chk.checkCanonical(s.selected);
        } else {
            Symbol.TypeSymbol c = attribImportType(imp, localEnv).tsym;
            this.f383chk.checkCanonical(imp);
            importNamed(tree.m489pos(), c, this.f384env);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void visitMethodDef(JCTree.JCMethodDecl tree) {
        Scope enclScope = this.enter.enterScope(this.f384env);
        Symbol.MethodSymbol m = new Symbol.MethodSymbol(0L, tree.name, null, enclScope.owner);
        m.flags_field = this.f383chk.checkFlags(tree.m489pos(), tree.mods.flags, m, tree);
        tree.f544sym = m;
        Env<AttrContext> localEnv = methodEnv(tree, this.f384env);
        DeferredLintHandler prevLintHandler = this.f383chk.setDeferredLintHandler(this.deferredLintHandler.setPos(tree.m489pos()));
        try {
            m.type = signature(tree.typarams, tree.params, tree.restype, tree.thrown, localEnv);
            this.f383chk.setDeferredLintHandler(prevLintHandler);
            ListBuffer listBuffer = new ListBuffer();
            JCTree.JCVariableDecl lastParam = null;
            for (List list = tree.params; list.nonEmpty(); list = list.tail) {
                JCTree.JCVariableDecl param = (JCTree.JCVariableDecl) list.head;
                lastParam = param;
                listBuffer.append(Assert.checkNonNull(param.f547sym));
            }
            m.params = listBuffer.toList();
            if (lastParam != null && (lastParam.mods.flags & Flags.VARARGS) != 0) {
                m.flags_field |= Flags.VARARGS;
            }
            localEnv.info.scope.leave();
            if (this.f383chk.checkUnique(tree.m489pos(), m, enclScope)) {
                enclScope.enter(m);
            }
            annotateLater(tree.mods.annotations, localEnv, m);
            if (tree.defaultValue != null) {
                annotateDefaultValueLater(tree.defaultValue, localEnv, m);
            }
        } catch (Throwable th) {
            this.f383chk.setDeferredLintHandler(prevLintHandler);
            throw th;
        }
    }

    Env<AttrContext> methodEnv(JCTree.JCMethodDecl tree, Env<AttrContext> env) {
        Env<AttrContext> localEnv = env.m466dup(tree, env.info.m463dup(env.info.scope.dupUnshared()));
        localEnv.enclMethod = tree;
        localEnv.info.scope.owner = tree.f544sym;
        if ((tree.mods.flags & 8) != 0) {
            localEnv.info.staticLevel++;
        }
        return localEnv;
    }

    @Override
    public void visitVarDef(JCTree.JCVariableDecl tree) {
        Env<AttrContext> localEnv;
        Env<AttrContext> localEnv2 = this.f384env;
        if ((tree.mods.flags & 8) == 0 && (this.f384env.info.scope.owner.flags() & 512) == 0) {
            localEnv = localEnv2;
        } else {
            Env<AttrContext> c0621Env = this.f384env;
            Env<AttrContext> localEnv3 = c0621Env.m466dup(tree, c0621Env.info.m462dup());
            localEnv3.info.staticLevel++;
            localEnv = localEnv3;
        }
        DeferredLintHandler prevLintHandler = this.f383chk.setDeferredLintHandler(this.deferredLintHandler.setPos(tree.m489pos()));
        try {
            this.attr.attribType(tree.vartype, localEnv);
            this.f383chk.setDeferredLintHandler(prevLintHandler);
            if ((tree.mods.flags & Flags.VARARGS) != 0) {
                Type.ArrayType atype = (Type.ArrayType) tree.vartype.type;
                tree.vartype.type = atype.makeVarargs();
            }
            Scope enclScope = this.enter.enterScope(this.f384env);
            Symbol.VarSymbol v = new Symbol.VarSymbol(0L, tree.name, tree.vartype.type, enclScope.owner);
            v.flags_field = this.f383chk.checkFlags(tree.m489pos(), tree.mods.flags, v, tree);
            tree.f547sym = v;
            if (tree.init != null) {
                v.flags_field |= 262144;
                if ((v.flags_field & 16) != 0 && tree.init.getTag() != 27) {
                    Env<AttrContext> initEnv = getInitEnv(tree, this.f384env);
                    initEnv.info.enclVar = v;
                    v.setLazyConstValue(initEnv(tree, initEnv), this.attr, tree.init);
                }
            }
            if (this.f383chk.checkUnique(tree.m489pos(), v, enclScope)) {
                this.f383chk.checkTransparentVar(tree.m489pos(), v, enclScope);
                enclScope.enter(v);
            }
            annotateLater(tree.mods.annotations, localEnv, v);
            v.f342pos = tree.f531pos;
        } catch (Throwable th) {
            this.f383chk.setDeferredLintHandler(prevLintHandler);
            throw th;
        }
    }

    Env<AttrContext> initEnv(JCTree.JCVariableDecl tree, Env<AttrContext> env) {
        Env<AttrContext> localEnv = env.dupto(new AttrContextEnv(tree, env.info.m462dup()));
        if (tree.f547sym.owner.kind == 2) {
            localEnv.info.scope = new Scope.DelegatedScope(env.info.scope);
            localEnv.info.scope.owner = tree.f547sym;
        }
        if ((tree.mods.flags & 8) != 0 || (env.enclClass.f539sym.flags() & 512) != 0) {
            localEnv.info.staticLevel++;
        }
        return localEnv;
    }

    @Override
    public void visitTree(JCTree tree) {
    }

    @Override
    public void visitErroneous(JCTree.JCErroneous tree) {
        if (tree.errs != null) {
            memberEnter(tree.errs, this.f384env);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Env<AttrContext> getMethodEnv(JCTree.JCMethodDecl tree, Env<AttrContext> env) {
        Env<AttrContext> mEnv = methodEnv(tree, env);
        mEnv.info.lint = mEnv.info.lint.augment(tree.f544sym.attributes_field, tree.f544sym.flags());
        for (List list = tree.typarams; list.nonEmpty(); list = list.tail) {
            mEnv.info.scope.enterIfAbsent(((JCTree.JCTypeParameter) list.head).type.tsym);
        }
        for (List list2 = tree.params; list2.nonEmpty(); list2 = list2.tail) {
            mEnv.info.scope.enterIfAbsent(((JCTree.JCVariableDecl) list2.head).f547sym);
        }
        return mEnv;
    }

    public Env<AttrContext> getInitEnv(JCTree.JCVariableDecl tree, Env<AttrContext> env) {
        Env<AttrContext> iEnv = initEnv(tree, env);
        return iEnv;
    }

    Type attribImportType(JCTree tree, Env<AttrContext> env) {
        Assert.check(this.completionEnabled);
        try {
            this.completionEnabled = false;
            return this.attr.attribType(tree, env);
        } finally {
            this.completionEnabled = checkClash;
        }
    }

    void annotateLater(final List<JCTree.JCAnnotation> annotations, final Env<AttrContext> localEnv, final Symbol s) {
        if (annotations.isEmpty()) {
            return;
        }
        if (s.kind != 1) {
            s.attributes_field = null;
        }
        this.annotate.later(new Annotate.Annotator() {
            @Override
            public String toString() {
                return "annotate " + annotations + " onto " + s + " in " + s.owner;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override
            public void enterAnnotation() {
                Assert.check((s.kind == 1 || s.attributes_field == null) ? MemberEnter.checkClash : false);
                JavaFileObject prev = MemberEnter.this.f385log.useSource(localEnv.toplevel.sourcefile);
                try {
                    if (s.attributes_field != null && s.attributes_field.nonEmpty() && annotations.nonEmpty()) {
                        MemberEnter.this.f385log.error(((JCTree.JCAnnotation) annotations.head).f531pos, "already.annotated", Kinds.kindName(s), s);
                    }
                    MemberEnter.this.enterAnnotations(annotations, localEnv, s);
                } finally {
                    MemberEnter.this.f385log.useSource(prev);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean hasDeprecatedAnnotation(List<JCTree.JCAnnotation> annotations) {
        for (List list = annotations; list.nonEmpty(); list = list.tail) {
            JCTree.JCAnnotation a = (JCTree.JCAnnotation) list.head;
            if (a.annotationType.type == this.syms.deprecatedType && a.args.isEmpty()) {
                return checkClash;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void enterAnnotations(List<JCTree.JCAnnotation> annotations, Env<AttrContext> env, Symbol s) {
        ListBuffer<Attribute.Compound> buf = new ListBuffer<>();
        Set<Symbol.TypeSymbol> annotated = new HashSet<>();
        if (!this.skipAnnotations) {
            for (List list = annotations; list.nonEmpty(); list = list.tail) {
                JCTree.JCAnnotation a = (JCTree.JCAnnotation) list.head;
                Attribute.Compound c = this.annotate.enterAnnotation(a, this.syms.annotationType, env);
                if (c != null) {
                    buf.append(c);
                    if (!c.type.isErroneous() && s.owner.kind != 16 && this.types.isSameType(c.type, this.syms.deprecatedType)) {
                        s.flags_field |= 131072;
                    }
                    if (!c.type.isErroneous() && this.types.isSameType(c.type, this.syms.polymorphicSignatureType)) {
                        if (!this.target.hasMethodHandles()) {
                            this.f385log.error(env.tree.m489pos(), "wrong.target.for.polymorphic.signature.definition", this.target.name);
                        }
                        s.flags_field |= Flags.POLYMORPHIC_SIGNATURE;
                    }
                    if (!annotated.add(a.type.tsym)) {
                        this.f385log.error(a.f531pos, "duplicate.annotation", new Object[0]);
                    }
                }
            }
        }
        s.attributes_field = buf.toList();
    }

    void annotateDefaultValueLater(final JCTree.JCExpression defaultValue, final Env<AttrContext> localEnv, final Symbol.MethodSymbol m) {
        this.annotate.later(new Annotate.Annotator() {
            @Override
            public String toString() {
                return "annotate " + m.owner + "." + m + " default " + defaultValue;
            }

            @Override
            public void enterAnnotation() {
                JavaFileObject prev = MemberEnter.this.f385log.useSource(localEnv.toplevel.sourcefile);
                try {
                    MemberEnter.this.enterDefaultValue(defaultValue, localEnv, m);
                } finally {
                    MemberEnter.this.f385log.useSource(prev);
                }
            }
        });
    }

    public void enterDefaultValue(JCTree.JCExpression defaultValue, Env<AttrContext> localEnv, Symbol.MethodSymbol m) {
        m.defaultValue = this.annotate.enterAttributeValue(m.type.mo574getReturnType(), defaultValue, localEnv);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0253 A[Catch: all -> 0x020c, CompletionFailure -> 0x0215, TRY_LEAVE, TryCatch #16 {CompletionFailure -> 0x0215, all -> 0x020c, blocks: (B:67:0x01ab, B:70:0x01bd, B:71:0x01c7, B:81:0x01fd, B:95:0x0237, B:97:0x023b, B:98:0x024b, B:100:0x0253, B:103:0x0281, B:110:0x02c9, B:112:0x02d3, B:114:0x02fb, B:116:0x030a, B:89:0x0226), top: B:180:0x01ab }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0281 A[Catch: all -> 0x020c, CompletionFailure -> 0x0215, TRY_ENTER, TRY_LEAVE, TryCatch #16 {CompletionFailure -> 0x0215, all -> 0x020c, blocks: (B:67:0x01ab, B:70:0x01bd, B:71:0x01c7, B:81:0x01fd, B:95:0x0237, B:97:0x023b, B:98:0x024b, B:100:0x0253, B:103:0x0281, B:110:0x02c9, B:112:0x02d3, B:114:0x02fb, B:116:0x030a, B:89:0x0226), top: B:180:0x01ab }] */
    /* JADX WARN: Code duplicated, block: B:106:0x02a9 A[Catch: all -> 0x03fc, CompletionFailure -> 0x0405, TryCatch #14 {CompletionFailure -> 0x0405, all -> 0x03fc, blocks: (B:78:0x01f2, B:93:0x022f, B:101:0x026e, B:104:0x0289, B:106:0x02a9, B:108:0x02b1, B:121:0x031f, B:87:0x021e, B:92:0x022d, B:91:0x0229), top: B:183:0x01f2 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0366 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:128:0x0383 A[Catch: CompletionFailure -> 0x03fa, all -> 0x0468, TryCatch #6 {all -> 0x0468, blocks: (B:154:0x0432, B:123:0x0346, B:126:0x0378, B:128:0x0383, B:130:0x03a9, B:132:0x03c9, B:134:0x03d0, B:136:0x03d8, B:138:0x03e2), top: B:172:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x03a9 A[Catch: CompletionFailure -> 0x03fa, all -> 0x0468, TryCatch #6 {all -> 0x0468, blocks: (B:154:0x0432, B:123:0x0346, B:126:0x0378, B:128:0x0383, B:130:0x03a9, B:132:0x03c9, B:134:0x03d0, B:136:0x03d8, B:138:0x03e2), top: B:172:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:134:0x03d0 A[Catch: CompletionFailure -> 0x03fa, all -> 0x0468, TryCatch #6 {all -> 0x0468, blocks: (B:154:0x0432, B:123:0x0346, B:126:0x0378, B:128:0x0383, B:130:0x03a9, B:132:0x03c9, B:134:0x03d0, B:136:0x03d8, B:138:0x03e2), top: B:172:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x044c A[Catch: all -> 0x0462, TRY_LEAVE, TryCatch #1 {all -> 0x0462, blocks: (B:157:0x0444, B:159:0x044c), top: B:170:0x0444 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0467 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:170:0x0444 A[EXC_TOP_SPLITTER, LOOP:1: B:170:0x0444->B:193:?, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0082 A[Catch: all -> 0x0067, CompletionFailure -> 0x0071, TRY_ENTER, TRY_LEAVE, TryCatch #15 {CompletionFailure -> 0x0071, all -> 0x0067, blocks: (B:12:0x0058, B:21:0x0082, B:25:0x0091, B:30:0x00b0, B:32:0x00b8, B:36:0x00d7), top: B:182:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0091 A[Catch: all -> 0x0067, CompletionFailure -> 0x0071, TRY_ENTER, TRY_LEAVE, TryCatch #15 {CompletionFailure -> 0x0071, all -> 0x0067, blocks: (B:12:0x0058, B:21:0x0082, B:25:0x0091, B:30:0x00b0, B:32:0x00b8, B:36:0x00d7), top: B:182:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a6 A[Catch: all -> 0x0421, CompletionFailure -> 0x042a, TRY_ENTER, TRY_LEAVE, TryCatch #19 {CompletionFailure -> 0x042a, all -> 0x0421, blocks: (B:10:0x0045, B:18:0x007b, B:22:0x0087, B:39:0x00de, B:27:0x00a6, B:34:0x00cf, B:38:0x00da), top: B:172:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf A[Catch: all -> 0x0421, CompletionFailure -> 0x042a, TRY_ENTER, TRY_LEAVE, TryCatch #19 {CompletionFailure -> 0x042a, all -> 0x0421, blocks: (B:10:0x0045, B:18:0x007b, B:22:0x0087, B:39:0x00de, B:27:0x00a6, B:34:0x00cf, B:38:0x00da), top: B:172:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d7 A[Catch: all -> 0x0067, CompletionFailure -> 0x0071, TRY_ENTER, TRY_LEAVE, TryCatch #15 {CompletionFailure -> 0x0071, all -> 0x0067, blocks: (B:12:0x0058, B:21:0x0082, B:25:0x0091, B:30:0x00b0, B:32:0x00b8, B:36:0x00d7), top: B:182:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00da A[Catch: all -> 0x0421, CompletionFailure -> 0x042a, TRY_ENTER, TryCatch #19 {CompletionFailure -> 0x042a, all -> 0x0421, blocks: (B:10:0x0045, B:18:0x007b, B:22:0x0087, B:39:0x00de, B:27:0x00a6, B:34:0x00cf, B:38:0x00da), top: B:172:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x010b A[Catch: all -> 0x0158, CompletionFailure -> 0x0162, TRY_LEAVE, TryCatch #12 {CompletionFailure -> 0x0162, all -> 0x0158, blocks: (B:42:0x0103, B:44:0x010b), top: B:187:0x0103 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x016c  */
    /* JADX WARN: Code duplicated, block: B:62:0x019b A[Catch: all -> 0x01d8, CompletionFailure -> 0x01e3, TRY_LEAVE, TryCatch #13 {CompletionFailure -> 0x01e3, all -> 0x01d8, blocks: (B:60:0x017b, B:62:0x019b, B:65:0x01a3), top: B:185:0x017b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01a0 A[Catch: all -> 0x0142, CompletionFailure -> 0x014d, TRY_ENTER, TRY_LEAVE, TryCatch #17 {CompletionFailure -> 0x014d, all -> 0x0142, blocks: (B:46:0x011f, B:64:0x01a0), top: B:178:0x011f }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bd A[Catch: all -> 0x020c, CompletionFailure -> 0x0215, TryCatch #16 {CompletionFailure -> 0x0215, all -> 0x020c, blocks: (B:67:0x01ab, B:70:0x01bd, B:71:0x01c7, B:81:0x01fd, B:95:0x0237, B:97:0x023b, B:98:0x024b, B:100:0x0253, B:103:0x0281, B:110:0x02c9, B:112:0x02d3, B:114:0x02fb, B:116:0x030a, B:89:0x0226), top: B:180:0x01ab }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01fd A[Catch: all -> 0x020c, CompletionFailure -> 0x0215, TRY_ENTER, TRY_LEAVE, TryCatch #16 {CompletionFailure -> 0x0215, all -> 0x020c, blocks: (B:67:0x01ab, B:70:0x01bd, B:71:0x01c7, B:81:0x01fd, B:95:0x0237, B:97:0x023b, B:98:0x024b, B:100:0x0253, B:103:0x0281, B:110:0x02c9, B:112:0x02d3, B:114:0x02fb, B:116:0x030a, B:89:0x0226), top: B:180:0x01ab }] */
    /* JADX WARN: Code duplicated, block: B:87:0x021e A[Catch: all -> 0x03fc, CompletionFailure -> 0x0405, TRY_ENTER, TRY_LEAVE, TryCatch #14 {CompletionFailure -> 0x0405, all -> 0x03fc, blocks: (B:78:0x01f2, B:93:0x022f, B:101:0x026e, B:104:0x0289, B:106:0x02a9, B:108:0x02b1, B:121:0x031f, B:87:0x021e, B:92:0x022d, B:91:0x0229), top: B:183:0x01f2 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0226 A[Catch: all -> 0x020c, CompletionFailure -> 0x0215, TRY_ENTER, TRY_LEAVE, TryCatch #16 {CompletionFailure -> 0x0215, all -> 0x020c, blocks: (B:67:0x01ab, B:70:0x01bd, B:71:0x01c7, B:81:0x01fd, B:95:0x0237, B:97:0x023b, B:98:0x024b, B:100:0x0253, B:103:0x0281, B:110:0x02c9, B:112:0x02d3, B:114:0x02fb, B:116:0x030a, B:89:0x0226), top: B:180:0x01ab }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0229 A[Catch: all -> 0x03fc, CompletionFailure -> 0x0405, TRY_ENTER, TryCatch #14 {CompletionFailure -> 0x0405, all -> 0x03fc, blocks: (B:78:0x01f2, B:93:0x022f, B:101:0x026e, B:104:0x0289, B:106:0x02a9, B:108:0x02b1, B:121:0x031f, B:87:0x021e, B:92:0x022d, B:91:0x0229), top: B:183:0x01f2 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0237 A[Catch: all -> 0x020c, CompletionFailure -> 0x0215, TRY_ENTER, TryCatch #16 {CompletionFailure -> 0x0215, all -> 0x020c, blocks: (B:67:0x01ab, B:70:0x01bd, B:71:0x01c7, B:81:0x01fd, B:95:0x0237, B:97:0x023b, B:98:0x024b, B:100:0x0253, B:103:0x0281, B:110:0x02c9, B:112:0x02d3, B:114:0x02fb, B:116:0x030a, B:89:0x0226), top: B:180:0x01ab }] */
    /* JADX WARN: Code duplicated, block: B:97:0x023b A[Catch: all -> 0x020c, CompletionFailure -> 0x0215, TryCatch #16 {CompletionFailure -> 0x0215, all -> 0x020c, blocks: (B:67:0x01ab, B:70:0x01bd, B:71:0x01c7, B:81:0x01fd, B:95:0x0237, B:97:0x023b, B:98:0x024b, B:100:0x0253, B:103:0x0281, B:110:0x02c9, B:112:0x02d3, B:114:0x02fb, B:116:0x030a, B:89:0x0226), top: B:180:0x01ab }] */
    /* JADX WARN: Code duplicated, block: B:98:0x024b A[Catch: all -> 0x020c, CompletionFailure -> 0x0215, TryCatch #16 {CompletionFailure -> 0x0215, all -> 0x020c, blocks: (B:67:0x01ab, B:70:0x01bd, B:71:0x01c7, B:81:0x01fd, B:95:0x0237, B:97:0x023b, B:98:0x024b, B:100:0x0253, B:103:0x0281, B:110:0x02c9, B:112:0x02d3, B:114:0x02fb, B:116:0x030a, B:89:0x0226), top: B:180:0x01ab }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.sun.tools.javac.code.Symbol] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v3, types: [javax.tools.JavaFileObject] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.sun.tools.javac.util.Log] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.$r8$lambda$3Jn-YhBaujEHu2U7RtYHYfrstds(FixTypesVisitor.java:0)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor$$ExternalSyntheticLambda8.apply(D8$$SyntheticClass:0)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override
    public void complete(Symbol sym) throws Throwable {
        JavaFileObject prev;
        boolean wasFirst;
        JCTree.JCClassDecl tree;
        Env<AttrContext> baseEnv;
        Type typeAttribBase;
        Type supertype;
        ListBuffer<Type> interfaces;
        Set<Type> interfaceSet;
        List<JCTree.JCExpression> interfaceTrees;
        JavaFileObject prev2;
        List<JCTree.JCExpression> interfaceTrees2;
        Iterator<JCTree.JCExpression> it;
        ListBuffer<Type> all_interfaces;
        List<Type> list;
        List<Type> argtypes;
        List<Type> typarams;
        List<Type> thrown;
        List<Type> argtypes2;
        JCTree.JCExpression iface;
        Type i;
        Set<Type> interfaceSet2;
        ?? r11 = sym;
        if (!this.completionEnabled) {
            Assert.check((sym.flags() & 16777216) == 0 ? checkClash : false);
            r11.completer = this;
            return;
        }
        Symbol.ClassSymbol c = (Symbol.ClassSymbol) r11;
        Type.ClassType ct = (Type.ClassType) c.type;
        Env<AttrContext> env = this.enter.typeEnvs.get(c);
        JCTree.JCClassDecl tree2 = (JCTree.JCClassDecl) env.tree;
        boolean wasFirst2 = this.isFirst;
        this.isFirst = false;
        JavaFileObject prev3 = this.f385log.useSource(env.toplevel.sourcefile);
        try {
            try {
                this.halfcompleted.append(env);
                c.flags_field |= 268435456;
                if (c.owner.kind == 1) {
                    try {
                        memberEnter(env.toplevel, env.enclosing(1));
                        this.todo.append(env);
                        if (c.owner.kind == 2) {
                            c.owner.complete();
                        }
                        baseEnv = baseEnv(tree2, env);
                        if (tree2.extending != null) {
                            typeAttribBase = this.attr.attribBase(tree2.extending, baseEnv, checkClash, false, checkClash);
                        } else if ((tree2.mods.flags & 16384) == 0 && !this.target.compilerBootstrap(c)) {
                            typeAttribBase = this.attr.attribBase(enumBase(tree2.f531pos, c), baseEnv, checkClash, false, false);
                        } else if (c.fullname == this.names.java_lang_Object) {
                            typeAttribBase = Type.noType;
                        } else {
                            typeAttribBase = this.syms.objectType;
                        }
                        supertype = typeAttribBase;
                        ct.supertype_field = modelMissingTypes(supertype, tree2.extending, false);
                        interfaces = new ListBuffer<>();
                        interfaceSet = new HashSet<>();
                        interfaceTrees = tree2.implementing;
                        if ((tree2.mods.flags & 16384) != 0) {
                            try {
                                if (this.target.compilerBootstrap(c)) {
                                    prev2 = prev3;
                                    try {
                                        interfaceTrees2 = interfaceTrees.prepend(this.make.Type(new Type.ClassType(this.syms.comparableType.getEnclosingType(), List.m508of(c.type), this.syms.comparableType.tsym))).prepend(this.make.Type(this.syms.serializableType));
                                    } catch (Symbol.CompletionFailure e) {
                                        ex = e;
                                        wasFirst = wasFirst2;
                                        tree = tree2;
                                        prev = prev2;
                                        this.f383chk.completionError(tree.m489pos(), ex);
                                        this.f385log.useSource(prev);
                                        if (wasFirst) {
                                            while (this.halfcompleted.nonEmpty()) {
                                                try {
                                                    finish(this.halfcompleted.next());
                                                } catch (Throwable th) {
                                                    this.isFirst = checkClash;
                                                    throw th;
                                                }
                                            }
                                            this.isFirst = checkClash;
                                            this.annotate.flush();
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r11 = prev2;
                                        this.f385log.useSource(r11);
                                        throw th;
                                    }
                                } else {
                                    prev2 = prev3;
                                    interfaceTrees2 = interfaceTrees;
                                }
                                try {
                                    it = interfaceTrees2.iterator();
                                    all_interfaces = null;
                                    while (it.hasNext()) {
                                        try {
                                            iface = it.next();
                                            i = this.attr.attribBase(iface, baseEnv, false, checkClash, checkClash);
                                            Iterator<JCTree.JCExpression> it2 = it;
                                            if (i.f344tag == 10) {
                                                interfaces.append(i);
                                                if (all_interfaces != null) {
                                                    all_interfaces.append(i);
                                                }
                                                wasFirst = wasFirst2;
                                                try {
                                                    interfaceSet2 = interfaceSet;
                                                    this.f383chk.checkNotRepeated(iface.m489pos(), this.types.erasure(i), interfaceSet2);
                                                } catch (Symbol.CompletionFailure e2) {
                                                    ex = e2;
                                                    tree = tree2;
                                                    prev = prev2;
                                                    this.f383chk.completionError(tree.m489pos(), ex);
                                                    this.f385log.useSource(prev);
                                                    if (wasFirst) {
                                                        while (this.halfcompleted.nonEmpty()) {
                                                            finish(this.halfcompleted.next());
                                                        }
                                                        this.isFirst = checkClash;
                                                        this.annotate.flush();
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    r11 = prev2;
                                                    this.f385log.useSource(r11);
                                                    throw th;
                                                }
                                            } else {
                                                wasFirst = wasFirst2;
                                                interfaceSet2 = interfaceSet;
                                                if (all_interfaces == null) {
                                                    all_interfaces = new ListBuffer().appendList(interfaces);
                                                }
                                                all_interfaces.append(modelMissingTypes(i, iface, checkClash));
                                            }
                                            interfaceSet = interfaceSet2;
                                            it = it2;
                                            wasFirst2 = wasFirst;
                                        } catch (Symbol.CompletionFailure e3) {
                                            ex = e3;
                                            wasFirst = wasFirst2;
                                            tree = tree2;
                                            prev = prev2;
                                            this.f383chk.completionError(tree.m489pos(), ex);
                                            this.f385log.useSource(prev);
                                            if (wasFirst) {
                                                while (this.halfcompleted.nonEmpty()) {
                                                    finish(this.halfcompleted.next());
                                                }
                                                this.isFirst = checkClash;
                                                this.annotate.flush();
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            r11 = prev2;
                                            this.f385log.useSource(r11);
                                            throw th;
                                        }
                                    }
                                    wasFirst = wasFirst2;
                                    try {
                                        if ((c.flags_field & 8192) != 0) {
                                            ct.interfaces_field = List.m508of(this.syms.annotationType);
                                            ct.all_interfaces_field = ct.interfaces_field;
                                        } else {
                                            ct.interfaces_field = interfaces.toList();
                                            if (all_interfaces == null) {
                                                list = ct.interfaces_field;
                                            } else {
                                                list = all_interfaces.toList();
                                            }
                                            ct.all_interfaces_field = list;
                                        }
                                        if (c.fullname == this.names.java_lang_Object) {
                                            if (tree2.extending != null) {
                                                this.f383chk.checkNonCyclic(tree2.extending.m489pos(), supertype);
                                                ct.supertype_field = Type.noType;
                                            } else if (tree2.implementing.nonEmpty()) {
                                                this.f383chk.checkNonCyclic(tree2.implementing.head.m489pos(), ct.interfaces_field.head);
                                                ct.interfaces_field = List.m507nil();
                                            }
                                        }
                                        this.attr.attribAnnotationTypes(tree2.mods.annotations, baseEnv);
                                        if (hasDeprecatedAnnotation(tree2.mods.annotations)) {
                                            c.flags_field |= 131072;
                                        }
                                        annotateLater(tree2.mods.annotations, baseEnv, c);
                                        this.f383chk.checkNonCyclicDecl(tree2);
                                        this.attr.attribTypeVariables(tree2.typarams, baseEnv);
                                        if ((c.flags() & 512) == 0 || TreeInfo.hasConstructors(tree2.defs)) {
                                            baseEnv = baseEnv;
                                            prev = prev2;
                                            tree = tree2;
                                        } else {
                                            List<Type> argtypes3 = List.m507nil();
                                            List<Type> typarams2 = List.m507nil();
                                            List<Type> thrown2 = List.m507nil();
                                            long ctorFlags = 0;
                                            boolean based = false;
                                            try {
                                                if (c.name.isEmpty()) {
                                                    JCTree.JCNewClass nc = (JCTree.JCNewClass) env.next.tree;
                                                    if (nc.constructor != null) {
                                                        baseEnv = baseEnv;
                                                        Type superConstrType = this.types.memberType(c.type, nc.constructor);
                                                        List<Type> argtypes4 = superConstrType.mo573getParameterTypes();
                                                        List<Type> typarams3 = superConstrType.getTypeArguments();
                                                        ctorFlags = nc.constructor.flags() & Flags.VARARGS;
                                                        if (nc.encl != null) {
                                                            based = true;
                                                            argtypes2 = argtypes4.prepend(nc.encl.type);
                                                        } else {
                                                            argtypes2 = argtypes4;
                                                        }
                                                        List<Type> thrown3 = superConstrType.mo575getThrownTypes();
                                                        argtypes = argtypes2;
                                                        typarams = typarams3;
                                                        thrown = thrown3;
                                                    }
                                                    prev = prev2;
                                                    tree = tree2;
                                                    JCTree constrDef = DefaultConstructor(this.make.m495at(tree2.f531pos), c, typarams, argtypes, thrown, ctorFlags, based);
                                                    tree.defs = tree.defs.prepend(constrDef);
                                                }
                                                JCTree constrDef2 = DefaultConstructor(this.make.m495at(tree2.f531pos), c, typarams, argtypes, thrown, ctorFlags, based);
                                                tree.defs = tree.defs.prepend(constrDef2);
                                            } catch (Symbol.CompletionFailure e4) {
                                                ex = e4;
                                                this.f383chk.completionError(tree.m489pos(), ex);
                                            }
                                            argtypes = argtypes3;
                                            typarams = typarams2;
                                            thrown = thrown2;
                                            prev = prev2;
                                            tree = tree2;
                                        }
                                        if ((c.flags_field & 512) == 0) {
                                            Symbol.VarSymbol thisSym = new Symbol.VarSymbol(262160L, this.names._this, c.type, c);
                                            thisSym.f342pos = 0;
                                            env.info.scope.enter(thisSym);
                                            if (ct.supertype_field.f344tag == 10) {
                                                Symbol.VarSymbol superSym = new Symbol.VarSymbol(262160L, this.names._super, ct.supertype_field, c);
                                                superSym.f342pos = 0;
                                                env.info.scope.enter(superSym);
                                            }
                                        }
                                        if (c.owner.kind == 1 && c.owner != this.syms.unnamedPackage && this.reader.packageExists(c.fullname)) {
                                            this.f385log.error(tree.f531pos, "clash.with.pkg.of.same.name", Kinds.kindName(sym), c);
                                        }
                                    } catch (Symbol.CompletionFailure e5) {
                                        ex = e5;
                                        tree = tree2;
                                        prev = prev2;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        r11 = prev2;
                                        this.f385log.useSource(r11);
                                        throw th;
                                    }
                                } catch (Symbol.CompletionFailure e6) {
                                    ex = e6;
                                    wasFirst = wasFirst2;
                                    tree = tree2;
                                    prev = prev2;
                                } catch (Throwable th6) {
                                    th = th6;
                                    r11 = prev2;
                                }
                            } catch (Symbol.CompletionFailure e7) {
                                ex = e7;
                                prev = prev3;
                                wasFirst = wasFirst2;
                                tree = tree2;
                                this.f383chk.completionError(tree.m489pos(), ex);
                                this.f385log.useSource(prev);
                                if (wasFirst) {
                                    while (this.halfcompleted.nonEmpty()) {
                                        finish(this.halfcompleted.next());
                                    }
                                    this.isFirst = checkClash;
                                    this.annotate.flush();
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                r11 = prev3;
                                this.f385log.useSource(r11);
                                throw th;
                            }
                        } else {
                            prev2 = prev3;
                            interfaceTrees2 = interfaceTrees;
                            it = interfaceTrees2.iterator();
                            all_interfaces = null;
                            while (it.hasNext()) {
                                iface = it.next();
                                i = this.attr.attribBase(iface, baseEnv, false, checkClash, checkClash);
                                Iterator<JCTree.JCExpression> it3 = it;
                                if (i.f344tag == 10) {
                                    interfaces.append(i);
                                    if (all_interfaces != null) {
                                        all_interfaces.append(i);
                                    }
                                    wasFirst = wasFirst2;
                                    interfaceSet2 = interfaceSet;
                                    this.f383chk.checkNotRepeated(iface.m489pos(), this.types.erasure(i), interfaceSet2);
                                } else {
                                    wasFirst = wasFirst2;
                                    interfaceSet2 = interfaceSet;
                                    if (all_interfaces == null) {
                                        all_interfaces = new ListBuffer().appendList(interfaces);
                                    }
                                    all_interfaces.append(modelMissingTypes(i, iface, checkClash));
                                }
                                interfaceSet = interfaceSet2;
                                it = it3;
                                wasFirst2 = wasFirst;
                            }
                            wasFirst = wasFirst2;
                            if ((c.flags_field & 8192) != 0) {
                                ct.interfaces_field = List.m508of(this.syms.annotationType);
                                ct.all_interfaces_field = ct.interfaces_field;
                            } else {
                                ct.interfaces_field = interfaces.toList();
                                if (all_interfaces == null) {
                                    list = ct.interfaces_field;
                                } else {
                                    list = all_interfaces.toList();
                                }
                                ct.all_interfaces_field = list;
                            }
                            if (c.fullname == this.names.java_lang_Object) {
                                if (tree2.extending != null) {
                                    this.f383chk.checkNonCyclic(tree2.extending.m489pos(), supertype);
                                    ct.supertype_field = Type.noType;
                                } else if (tree2.implementing.nonEmpty()) {
                                    this.f383chk.checkNonCyclic(tree2.implementing.head.m489pos(), ct.interfaces_field.head);
                                    ct.interfaces_field = List.m507nil();
                                }
                            }
                            this.attr.attribAnnotationTypes(tree2.mods.annotations, baseEnv);
                            if (hasDeprecatedAnnotation(tree2.mods.annotations)) {
                                c.flags_field |= 131072;
                            }
                            annotateLater(tree2.mods.annotations, baseEnv, c);
                            this.f383chk.checkNonCyclicDecl(tree2);
                            this.attr.attribTypeVariables(tree2.typarams, baseEnv);
                            if ((c.flags() & 512) == 0) {
                                baseEnv = baseEnv;
                                prev = prev2;
                                tree = tree2;
                            } else {
                                baseEnv = baseEnv;
                                prev = prev2;
                                tree = tree2;
                            }
                            if ((c.flags_field & 512) == 0) {
                                Symbol.VarSymbol thisSym2 = new Symbol.VarSymbol(262160L, this.names._this, c.type, c);
                                thisSym2.f342pos = 0;
                                env.info.scope.enter(thisSym2);
                                if (ct.supertype_field.f344tag == 10) {
                                    Symbol.VarSymbol superSym2 = new Symbol.VarSymbol(262160L, this.names._super, ct.supertype_field, c);
                                    superSym2.f342pos = 0;
                                    env.info.scope.enter(superSym2);
                                }
                            }
                            if (c.owner.kind == 1) {
                                this.f385log.error(tree.f531pos, "clash.with.pkg.of.same.name", Kinds.kindName(sym), c);
                            }
                        }
                    } catch (Symbol.CompletionFailure e8) {
                        ex = e8;
                        prev = prev3;
                        wasFirst = wasFirst2;
                        tree = tree2;
                        this.f383chk.completionError(tree.m489pos(), ex);
                        this.f385log.useSource(prev);
                        if (wasFirst) {
                            while (this.halfcompleted.nonEmpty()) {
                                finish(this.halfcompleted.next());
                            }
                            this.isFirst = checkClash;
                            this.annotate.flush();
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        r11 = prev3;
                        this.f385log.useSource(r11);
                        throw th;
                    }
                } else {
                    if (c.owner.kind == 2) {
                        c.owner.complete();
                    }
                    baseEnv = baseEnv(tree2, env);
                    if (tree2.extending != null) {
                        typeAttribBase = this.attr.attribBase(tree2.extending, baseEnv, checkClash, false, checkClash);
                    } else if ((tree2.mods.flags & 16384) == 0) {
                        if (c.fullname == this.names.java_lang_Object) {
                            typeAttribBase = Type.noType;
                        } else {
                            typeAttribBase = this.syms.objectType;
                        }
                    } else if (c.fullname == this.names.java_lang_Object) {
                        typeAttribBase = Type.noType;
                    } else {
                        typeAttribBase = this.syms.objectType;
                    }
                    supertype = typeAttribBase;
                    ct.supertype_field = modelMissingTypes(supertype, tree2.extending, false);
                    interfaces = new ListBuffer<>();
                    interfaceSet = new HashSet<>();
                    interfaceTrees = tree2.implementing;
                    if ((tree2.mods.flags & 16384) != 0) {
                        if (this.target.compilerBootstrap(c)) {
                            prev2 = prev3;
                            interfaceTrees2 = interfaceTrees.prepend(this.make.Type(new Type.ClassType(this.syms.comparableType.getEnclosingType(), List.m508of(c.type), this.syms.comparableType.tsym))).prepend(this.make.Type(this.syms.serializableType));
                        } else {
                            prev2 = prev3;
                            interfaceTrees2 = interfaceTrees;
                        }
                        it = interfaceTrees2.iterator();
                        all_interfaces = null;
                        while (it.hasNext()) {
                            iface = it.next();
                            i = this.attr.attribBase(iface, baseEnv, false, checkClash, checkClash);
                            Iterator<JCTree.JCExpression> it4 = it;
                            if (i.f344tag == 10) {
                                interfaces.append(i);
                                if (all_interfaces != null) {
                                    all_interfaces.append(i);
                                }
                                wasFirst = wasFirst2;
                                interfaceSet2 = interfaceSet;
                                this.f383chk.checkNotRepeated(iface.m489pos(), this.types.erasure(i), interfaceSet2);
                            } else {
                                wasFirst = wasFirst2;
                                interfaceSet2 = interfaceSet;
                                if (all_interfaces == null) {
                                    all_interfaces = new ListBuffer().appendList(interfaces);
                                }
                                all_interfaces.append(modelMissingTypes(i, iface, checkClash));
                            }
                            interfaceSet = interfaceSet2;
                            it = it4;
                            wasFirst2 = wasFirst;
                        }
                        wasFirst = wasFirst2;
                        if ((c.flags_field & 8192) != 0) {
                            ct.interfaces_field = List.m508of(this.syms.annotationType);
                            ct.all_interfaces_field = ct.interfaces_field;
                        } else {
                            ct.interfaces_field = interfaces.toList();
                            if (all_interfaces == null) {
                                list = ct.interfaces_field;
                            } else {
                                list = all_interfaces.toList();
                            }
                            ct.all_interfaces_field = list;
                        }
                        if (c.fullname == this.names.java_lang_Object) {
                            if (tree2.extending != null) {
                                this.f383chk.checkNonCyclic(tree2.extending.m489pos(), supertype);
                                ct.supertype_field = Type.noType;
                            } else if (tree2.implementing.nonEmpty()) {
                                this.f383chk.checkNonCyclic(tree2.implementing.head.m489pos(), ct.interfaces_field.head);
                                ct.interfaces_field = List.m507nil();
                            }
                        }
                        this.attr.attribAnnotationTypes(tree2.mods.annotations, baseEnv);
                        if (hasDeprecatedAnnotation(tree2.mods.annotations)) {
                            c.flags_field |= 131072;
                        }
                        annotateLater(tree2.mods.annotations, baseEnv, c);
                        this.f383chk.checkNonCyclicDecl(tree2);
                        this.attr.attribTypeVariables(tree2.typarams, baseEnv);
                        if ((c.flags() & 512) == 0) {
                            baseEnv = baseEnv;
                            prev = prev2;
                            tree = tree2;
                        } else {
                            baseEnv = baseEnv;
                            prev = prev2;
                            tree = tree2;
                        }
                        if ((c.flags_field & 512) == 0) {
                            Symbol.VarSymbol thisSym3 = new Symbol.VarSymbol(262160L, this.names._this, c.type, c);
                            thisSym3.f342pos = 0;
                            env.info.scope.enter(thisSym3);
                            if (ct.supertype_field.f344tag == 10) {
                                Symbol.VarSymbol superSym3 = new Symbol.VarSymbol(262160L, this.names._super, ct.supertype_field, c);
                                superSym3.f342pos = 0;
                                env.info.scope.enter(superSym3);
                            }
                        }
                        if (c.owner.kind == 1) {
                            this.f385log.error(tree.f531pos, "clash.with.pkg.of.same.name", Kinds.kindName(sym), c);
                        }
                    } else {
                        prev2 = prev3;
                        interfaceTrees2 = interfaceTrees;
                        it = interfaceTrees2.iterator();
                        all_interfaces = null;
                        while (it.hasNext()) {
                            iface = it.next();
                            i = this.attr.attribBase(iface, baseEnv, false, checkClash, checkClash);
                            Iterator<JCTree.JCExpression> it5 = it;
                            if (i.f344tag == 10) {
                                interfaces.append(i);
                                if (all_interfaces != null) {
                                    all_interfaces.append(i);
                                }
                                wasFirst = wasFirst2;
                                interfaceSet2 = interfaceSet;
                                this.f383chk.checkNotRepeated(iface.m489pos(), this.types.erasure(i), interfaceSet2);
                            } else {
                                wasFirst = wasFirst2;
                                interfaceSet2 = interfaceSet;
                                if (all_interfaces == null) {
                                    all_interfaces = new ListBuffer().appendList(interfaces);
                                }
                                all_interfaces.append(modelMissingTypes(i, iface, checkClash));
                            }
                            interfaceSet = interfaceSet2;
                            it = it5;
                            wasFirst2 = wasFirst;
                        }
                        wasFirst = wasFirst2;
                        if ((c.flags_field & 8192) != 0) {
                            ct.interfaces_field = List.m508of(this.syms.annotationType);
                            ct.all_interfaces_field = ct.interfaces_field;
                        } else {
                            ct.interfaces_field = interfaces.toList();
                            if (all_interfaces == null) {
                                list = ct.interfaces_field;
                            } else {
                                list = all_interfaces.toList();
                            }
                            ct.all_interfaces_field = list;
                        }
                        if (c.fullname == this.names.java_lang_Object) {
                            if (tree2.extending != null) {
                                this.f383chk.checkNonCyclic(tree2.extending.m489pos(), supertype);
                                ct.supertype_field = Type.noType;
                            } else if (tree2.implementing.nonEmpty()) {
                                this.f383chk.checkNonCyclic(tree2.implementing.head.m489pos(), ct.interfaces_field.head);
                                ct.interfaces_field = List.m507nil();
                            }
                        }
                        this.attr.attribAnnotationTypes(tree2.mods.annotations, baseEnv);
                        if (hasDeprecatedAnnotation(tree2.mods.annotations)) {
                            c.flags_field |= 131072;
                        }
                        annotateLater(tree2.mods.annotations, baseEnv, c);
                        this.f383chk.checkNonCyclicDecl(tree2);
                        this.attr.attribTypeVariables(tree2.typarams, baseEnv);
                        if ((c.flags() & 512) == 0) {
                            baseEnv = baseEnv;
                            prev = prev2;
                            tree = tree2;
                        } else {
                            baseEnv = baseEnv;
                            prev = prev2;
                            tree = tree2;
                        }
                        if ((c.flags_field & 512) == 0) {
                            Symbol.VarSymbol thisSym4 = new Symbol.VarSymbol(262160L, this.names._this, c.type, c);
                            thisSym4.f342pos = 0;
                            env.info.scope.enter(thisSym4);
                            if (ct.supertype_field.f344tag == 10) {
                                Symbol.VarSymbol superSym4 = new Symbol.VarSymbol(262160L, this.names._super, ct.supertype_field, c);
                                superSym4.f342pos = 0;
                                env.info.scope.enter(superSym4);
                            }
                        }
                        if (c.owner.kind == 1) {
                            this.f385log.error(tree.f531pos, "clash.with.pkg.of.same.name", Kinds.kindName(sym), c);
                        }
                    }
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Symbol.CompletionFailure e9) {
            ex = e9;
            prev = prev3;
            wasFirst = wasFirst2;
            tree = tree2;
        } catch (Throwable th10) {
            th = th10;
            r11 = prev3;
        }
        this.f385log.useSource(prev);
        if (wasFirst) {
            while (this.halfcompleted.nonEmpty()) {
                finish(this.halfcompleted.next());
            }
            this.isFirst = checkClash;
            this.annotate.flush();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private Env<AttrContext> baseEnv(JCTree.JCClassDecl jCClassDecl, Env<AttrContext> c0621Env) {
        Scope scope = new Scope(jCClassDecl.f539sym);
        for (Scope.Entry entry = c0621Env.outer.info.scope.elems; entry != null; entry = entry.sibling) {
            if (entry.f338sym.isLocal()) {
                scope.enter(entry.f338sym);
            }
        }
        if (jCClassDecl.typarams != null) {
            for (List list = jCClassDecl.typarams; list.nonEmpty(); list = list.tail) {
                scope.enter(((JCTree.JCTypeParameter) list.head).type.tsym);
            }
        }
        Env<A> c0621Env2 = c0621Env.outer;
        Env<AttrContext> c0621EnvM466dup = c0621Env2.m466dup(jCClassDecl, (A) ((AttrContext) c0621Env2.info).m463dup(scope));
        c0621EnvM466dup.baseClause = checkClash;
        c0621EnvM466dup.outer = c0621Env2;
        c0621EnvM466dup.info.isSelfCall = false;
        return c0621EnvM466dup;
    }

    private void finish(Env<AttrContext> env) {
        JavaFileObject prev = this.f385log.useSource(env.toplevel.sourcefile);
        try {
            JCTree.JCClassDecl tree = (JCTree.JCClassDecl) env.tree;
            finishClass(tree, env);
        } finally {
            this.f385log.useSource(prev);
        }
    }

    private JCTree.JCExpression enumBase(int pos, Symbol.ClassSymbol c) {
        JCTree.JCExpression result = this.make.m495at(pos).TypeApply(this.make.QualIdent(this.syms.enumSym), List.m508of(this.make.Type(c.type)));
        return result;
    }

    Type modelMissingTypes(Type t, final JCTree.JCExpression tree, final boolean interfaceExpected) {
        if (t.f344tag != 19) {
            return t;
        }
        return new Type.ErrorType(((Type.ErrorType) t).getOriginalType(), t.tsym) {
            private Type modelType;

            @Override
            public Type getModelType() {
                if (this.modelType == null) {
                    this.modelType = MemberEnter.this.new Synthesizer(getOriginalType(), interfaceExpected).visit(tree);
                }
                return this.modelType;
            }
        };
    }

    private class Synthesizer extends JCTree.Visitor {
        boolean interfaceExpected;
        Type originalType;
        Type result;
        List<Symbol.ClassSymbol> synthesizedSymbols = List.m507nil();

        Synthesizer(Type originalType, boolean interfaceExpected) {
            this.originalType = originalType;
            this.interfaceExpected = interfaceExpected;
        }

        Type visit(JCTree tree) {
            tree.accept(this);
            return this.result;
        }

        List<Type> visit(List<? extends JCTree> trees) {
            ListBuffer<Type> lb = new ListBuffer<>();
            for (JCTree t : trees) {
                lb.append(visit(t));
            }
            return lb.toList();
        }

        @Override
        public void visitTree(JCTree tree) {
            this.result = MemberEnter.this.syms.errType;
        }

        @Override
        public void visitIdent(JCTree.JCIdent tree) {
            if (tree.type.f344tag == 19) {
                this.result = synthesizeClass(tree.name, MemberEnter.this.syms.unnamedPackage).type;
            } else {
                this.result = tree.type;
            }
        }

        @Override
        public void visitSelect(JCTree.JCFieldAccess tree) {
            if (tree.type.f344tag != 19) {
                this.result = tree.type;
                return;
            }
            boolean prev = this.interfaceExpected;
            try {
                this.interfaceExpected = false;
                Type selectedType = visit(tree.selected);
                this.interfaceExpected = prev;
                Symbol.ClassSymbol c = synthesizeClass(tree.name, selectedType.tsym);
                this.result = c.type;
            } catch (Throwable th) {
                this.interfaceExpected = prev;
                throw th;
            }
        }

        @Override
        public void visitTypeApply(JCTree.JCTypeApply tree) {
            if (tree.type.f344tag != 19) {
                this.result = tree.type;
                return;
            }
            Type.ClassType clazzType = (Type.ClassType) visit(tree.clazz);
            if (this.synthesizedSymbols.contains(clazzType.tsym)) {
                synthesizeTyparams((Symbol.ClassSymbol) clazzType.tsym, tree.arguments.size());
            }
            final List<Type> actuals = visit(tree.arguments);
            this.result = new Type.ErrorType(tree.type, clazzType.tsym) {
                @Override
                public List<Type> getTypeArguments() {
                    return actuals;
                }
            };
        }

        Symbol.ClassSymbol synthesizeClass(Name name, Symbol owner) {
            int flags = this.interfaceExpected ? Flags.INTERFACE : 0;
            Symbol.ClassSymbol c = new Symbol.ClassSymbol(flags, name, owner);
            c.members_field = new Scope.ErrorScope(c);
            c.type = new Type.ErrorType(this.originalType, c) {
                @Override
                public List<Type> getTypeArguments() {
                    return this.typarams_field;
                }
            };
            this.synthesizedSymbols = this.synthesizedSymbols.prepend(c);
            return c;
        }

        void synthesizeTyparams(Symbol.ClassSymbol sym, int n) {
            Type.ClassType ct = (Type.ClassType) sym.type;
            Assert.check(ct.typarams_field.isEmpty());
            if (n == 1) {
                Type.TypeVar v = new Type.TypeVar(MemberEnter.this.names.fromString("T"), sym, MemberEnter.this.syms.botType);
                ct.typarams_field = ct.typarams_field.prepend(v);
                return;
            }
            for (int i = n; i > 0; i += -1) {
                Type.TypeVar v2 = new Type.TypeVar(MemberEnter.this.names.fromString("T" + i), sym, MemberEnter.this.syms.botType);
                ct.typarams_field = ct.typarams_field.prepend(v2);
            }
        }
    }

    JCTree DefaultConstructor(TreeMaker make, Symbol.ClassSymbol c, List<Type> typarams, List<Type> argtypes, List<Type> thrown, long flags, boolean based) {
        long flags2;
        List<JCTree.JCVariableDecl> params = make.Params(argtypes, this.syms.noSymbol);
        List<JCTree.JCStatement> stats = List.m507nil();
        List<JCTree.JCStatement> stats2 = c.type != this.syms.objectType ? stats.prepend(SuperCall(make, typarams, params, based)) : stats;
        if ((c.flags() & 16384) != 0 && (this.types.supertype(c.type).tsym == this.syms.enumSym || this.target.compilerBootstrap(c))) {
            flags2 = (flags & (-8)) | 2 | Flags.GENERATEDCONSTR;
        } else {
            flags2 = flags | (c.flags() & 7) | Flags.GENERATEDCONSTR;
        }
        if (c.name.isEmpty()) {
            flags2 |= 536870912;
        }
        JCTree result = make.MethodDef(make.Modifiers(flags2), this.names.init, null, make.TypeParams(typarams), params, make.Types(thrown), make.Block(0L, stats2), null);
        return result;
    }

    JCTree.JCExpressionStatement SuperCall(TreeMaker treeMaker, List<Type> list, List<JCTree.JCVariableDecl> list2, boolean z) {
        JCTree.JCExpression jCExpressionIdent;
        List<JCTree.JCVariableDecl> list3;
        if (z) {
            jCExpressionIdent = treeMaker.Select(treeMaker.Ident(list2.head), this.names._super);
            list3 = list2.tail;
        } else {
            jCExpressionIdent = treeMaker.Ident(this.names._super);
            list3 = list2;
        }
        return treeMaker.Exec(treeMaker.Apply(list.nonEmpty() ? treeMaker.Types(list) : null, jCExpressionIdent, treeMaker.Idents(list3)));
    }
}
