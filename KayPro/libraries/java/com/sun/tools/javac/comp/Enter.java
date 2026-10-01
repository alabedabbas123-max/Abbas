package com.sun.tools.javac.comp;

import com.sun.tools.javac.code.Lint;
import com.sun.tools.javac.code.Scope;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Symtab;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.code.Types;
import com.sun.tools.javac.main.RecognizedOptions;
import com.sun.tools.javac.jvm.ClassReader;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeInfo;
import com.sun.tools.javac.tree.TreeMaker;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;
import com.sun.tools.javac.util.Options;
import java.util.HashMap;
import java.util.Map;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;

public class Enter extends JCTree.Visitor {
    protected static final Context.C0723Key<Enter> enterKey = new Context.C0723Key<>();
    Annotate annotate;

    Check f368chk;

    protected Env<AttrContext> f369env;
    JavaFileManager fileManager;
    Lint lint;

    Log f370log;
    TreeMaker make;
    MemberEnter memberEnter;
    Names names;
    RecognizedOptions.PkgInfo pkginfoOpt;
    private JCTree.JCClassDecl predefClassDef;
    ClassReader reader;
    Type result;
    Symtab syms;
    private final Todo todo;
    Map<Symbol.TypeSymbol, Env<AttrContext>> typeEnvs = new HashMap();
    Types types;
    ListBuffer<Symbol.ClassSymbol> uncompleted;

    public static Enter instance(Context context) {
        Enter instance = (Enter) context.m501get(enterKey);
        if (instance == null) {
            return new Enter(context);
        }
        return instance;
    }

    protected Enter(Context context) {
        context.m504put(enterKey, this);
        this.f370log = Log.instance(context);
        this.reader = ClassReader.instance(context);
        this.make = TreeMaker.instance(context);
        this.syms = Symtab.instance(context);
        this.f368chk = Check.instance(context);
        this.memberEnter = MemberEnter.instance(context);
        this.types = Types.instance(context);
        this.annotate = Annotate.instance(context);
        this.lint = Lint.instance(context);
        this.names = Names.instance(context);
        TreeMaker treeMaker = this.make;
        JCTree.JCClassDecl jCClassDeclClassDef = treeMaker.ClassDef(treeMaker.Modifiers(1L), this.syms.predefClass.name, null, null, null, null);
        this.predefClassDef = jCClassDeclClassDef;
        jCClassDeclClassDef.f539sym = this.syms.predefClass;
        this.todo = Todo.instance(context);
        this.fileManager = (JavaFileManager) context.m502get(JavaFileManager.class);
        Options options = Options.instance(context);
        this.pkginfoOpt = RecognizedOptions.PkgInfo.m483get(options);
    }

    public Env<AttrContext> getEnv(Symbol.TypeSymbol sym) {
        return this.typeEnvs.get(sym);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Env<AttrContext> getClassEnv(Symbol.TypeSymbol sym) {
        Env<AttrContext> localEnv = getEnv(sym);
        Env c0621Env = localEnv;
        while (((AttrContext) c0621Env.info).lint == null) {
            c0621Env = c0621Env.next;
        }
        localEnv.info.lint = ((AttrContext) c0621Env.info).lint.augment(sym.attributes_field, sym.flags());
        return localEnv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Env<AttrContext> classEnv(JCTree.JCClassDecl tree, Env<AttrContext> c0621Env) {
        Env<AttrContext> localEnv = c0621Env.m466dup(tree, ((AttrContext) c0621Env.info).m463dup(new Scope(tree.f539sym)));
        localEnv.enclClass = tree;
        localEnv.outer = c0621Env;
        localEnv.info.isSelfCall = false;
        localEnv.info.lint = null;
        return localEnv;
    }

    Env<AttrContext> topLevelEnv(JCTree.JCCompilationUnit tree) {
        Env<AttrContext> localEnv = new Env<>(tree, new AttrContext());
        localEnv.toplevel = tree;
        localEnv.enclClass = this.predefClassDef;
        tree.namedImportScope = new Scope.ImportScope(tree.packge);
        tree.starImportScope = new Scope.StarImportScope(tree.packge);
        localEnv.info.scope = tree.namedImportScope;
        localEnv.info.lint = this.lint;
        return localEnv;
    }

    public Env<AttrContext> getTopLevelEnv(JCTree.JCCompilationUnit tree) {
        Env<AttrContext> localEnv = new Env<>(tree, new AttrContext());
        localEnv.toplevel = tree;
        localEnv.enclClass = this.predefClassDef;
        localEnv.info.scope = tree.namedImportScope;
        localEnv.info.lint = this.lint;
        return localEnv;
    }

    Scope enterScope(Env<AttrContext> env) {
        if (env.tree.getTag() == 3) {
            return ((JCTree.JCClassDecl) env.tree).f539sym.members_field;
        }
        return env.info.scope;
    }

    Type classEnter(JCTree tree, Env<AttrContext> env) {
        Env<AttrContext> prevEnv = this.f369env;
        try {
            this.f369env = env;
            tree.accept(this);
            return this.result;
        } catch (Symbol.CompletionFailure ex) {
            return this.f368chk.completionError(tree.m489pos(), ex);
        } finally {
            this.f369env = prevEnv;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    <T extends JCTree> List<Type> classEnter(List<T> trees, Env<AttrContext> env) {
        ListBuffer<Type> ts = new ListBuffer<>();
        for (List list = trees; list.nonEmpty(); list = list.tail) {
            Type t = classEnter((JCTree) list.head, env);
            if (t != null) {
                ts.append(t);
            }
        }
        return ts.toList();
    }

    @Override
    public void visitTopLevel(JCTree.JCCompilationUnit tree) {
        JavaFileObject prev = this.f370log.useSource(tree.sourcefile);
        boolean addEnv = false;
        boolean isPkgInfo = tree.sourcefile.isNameCompatible("package-info", JavaFileObject.Kind.SOURCE);
        if (tree.f540pid != null) {
            tree.packge = this.reader.enterPackage(TreeInfo.fullName(tree.f540pid));
            if (tree.packageAnnotations.nonEmpty() || this.pkginfoOpt == RecognizedOptions.PkgInfo.ALWAYS) {
                if (isPkgInfo) {
                    addEnv = true;
                } else {
                    this.f370log.error(tree.packageAnnotations.head.m489pos(), "pkg.annotations.sb.in.package-info.java", new Object[0]);
                }
            }
        } else {
            tree.packge = this.syms.unnamedPackage;
        }
        tree.packge.complete();
        Env<AttrContext> topEnv = topLevelEnv(tree);
        if (isPkgInfo) {
            Env<AttrContext> env0 = this.typeEnvs.get(tree.packge);
            if (env0 == null) {
                this.typeEnvs.put(tree.packge, topEnv);
            } else {
                JCTree.JCCompilationUnit tree0 = env0.toplevel;
                if (!this.fileManager.isSameFile(tree.sourcefile, tree0.sourcefile)) {
                    this.f370log.warning(tree.f540pid != null ? tree.f540pid.m489pos() : null, "pkg-info.already.seen", tree.packge);
                    if (addEnv || (tree0.packageAnnotations.isEmpty() && tree.docComments != null && tree.docComments.get(tree) != null)) {
                        this.typeEnvs.put(tree.packge, topEnv);
                    }
                }
            }
            for (Symbol q = tree.packge; q != null && q.kind == 1; q = q.owner) {
                q.flags_field |= 8388608;
            }
            Name name = this.names.package_info;
            Symbol.ClassSymbol c = this.reader.enterClass(name, tree.packge);
            c.flatname = this.names.fromString(tree.packge + "." + ((Object) name));
            c.sourcefile = tree.sourcefile;
            c.completer = null;
            c.members_field = new Scope(c);
            tree.packge.package_info = c;
        }
        classEnter(tree.defs, topEnv);
        if (addEnv) {
            this.todo.append(topEnv);
        }
        this.f370log.useSource(prev);
        this.result = null;
    }

    @Override
    public void visitClassDef(JCTree.JCClassDecl tree) {
        Symbol.ClassSymbol c;
        Symbol.ClassSymbol c2;
        ListBuffer<Symbol.ClassSymbol> listBuffer;
        Symbol owner = this.f369env.info.scope.owner;
        Scope enclScope = enterScope(this.f369env);
        if (owner.kind == 1) {
            Symbol.PackageSymbol packge = (Symbol.PackageSymbol) owner;
            for (Symbol q = packge; q != null && q.kind == 1; q = q.owner) {
                q.flags_field |= 8388608;
            }
            Symbol.ClassSymbol c3 = this.reader.enterClass(tree.name, packge);
            packge.members().enterIfAbsent(c3);
            if ((tree.mods.flags & 1) != 0 && !classNameMatchesFileName(c3, this.f369env)) {
                this.f370log.error(tree.m489pos(), "class.public.should.be.in.file", tree.name);
            }
            c2 = c3;
        } else {
            if (!tree.name.isEmpty() && !this.f368chk.checkUniqueClassName(tree.m489pos(), tree.name, enclScope)) {
                this.result = null;
                return;
            }
            if (owner.kind == 2) {
                c = this.reader.enterClass(tree.name, (Symbol.TypeSymbol) owner);
                if ((owner.flags_field & 512) != 0) {
                    tree.mods.flags |= 9;
                }
            } else {
                c = this.reader.defineClass(tree.name, owner);
                c.flatname = this.f368chk.localClassName(c);
                if (!c.name.isEmpty()) {
                    this.f368chk.checkTransparentClass(tree.m489pos(), c, this.f369env.info.scope);
                }
            }
            c2 = c;
        }
        tree.f539sym = c2;
        if (this.f368chk.compiled.get(c2.flatname) != null) {
            duplicateClass(tree.m489pos(), c2);
            Type typeCreateErrorType = this.types.createErrorType(tree.name, (Symbol.TypeSymbol) owner, Type.noType);
            this.result = typeCreateErrorType;
            tree.f539sym = (Symbol.ClassSymbol) typeCreateErrorType.tsym;
            return;
        }
        this.f368chk.compiled.put(c2.flatname, c2);
        enclScope.enter(c2);
        Env<AttrContext> localEnv = classEnv(tree, this.f369env);
        this.typeEnvs.put(c2, localEnv);
        c2.completer = this.memberEnter;
        c2.flags_field = this.f368chk.checkFlags(tree.m489pos(), tree.mods.flags, c2, tree);
        c2.sourcefile = this.f369env.toplevel.sourcefile;
        c2.members_field = new Scope(c2);
        Type.ClassType ct = (Type.ClassType) c2.type;
        if (owner.kind != 1 && (c2.flags_field & 8) == 0) {
            Symbol owner1 = owner;
            while ((owner1.kind & 20) != 0) {
                Symbol owner2 = owner;
                Scope enclScope2 = enclScope;
                if ((owner1.flags_field & 8) != 0) {
                    break;
                }
                owner1 = owner1.owner;
                owner = owner2;
                enclScope = enclScope2;
            }
            if (owner1.kind == 2) {
                ct.setEnclosingType(owner1.type);
            }
        }
        ct.typarams_field = classEnter(tree.typarams, localEnv);
        if (!c2.isLocal() && (listBuffer = this.uncompleted) != null) {
            listBuffer.append(c2);
        }
        classEnter(tree.defs, localEnv);
        this.result = c2.type;
    }

    private static boolean classNameMatchesFileName(Symbol.ClassSymbol c, Env<AttrContext> env) {
        return env.toplevel.sourcefile.isNameCompatible(c.name.toString(), JavaFileObject.Kind.SOURCE);
    }

    protected void duplicateClass(JCDiagnostic.DiagnosticPosition pos, Symbol.ClassSymbol c) {
        this.f370log.error(pos, "duplicate.class", c.fullname);
    }

    @Override
    public void visitTypeParameter(JCTree.JCTypeParameter tree) {
        Type.TypeVar a;
        if (tree.type != null) {
            a = (Type.TypeVar) tree.type;
        } else {
            a = new Type.TypeVar(tree.name, this.f369env.info.scope.owner, this.syms.botType);
        }
        tree.type = a;
        if (this.f368chk.checkUnique(tree.m489pos(), a.tsym, this.f369env.info.scope)) {
            this.f369env.info.scope.enter(a.tsym);
        }
        this.result = a;
    }

    @Override
    public void visitTree(JCTree tree) {
        this.result = null;
    }

    public void main(List<JCTree.JCCompilationUnit> trees) {
        complete(trees, null);
    }

    public void complete(List<JCTree.JCCompilationUnit> trees, Symbol.ClassSymbol c) {
        this.annotate.enterStart();
        ListBuffer<Symbol.ClassSymbol> prevUncompleted = this.uncompleted;
        if (this.memberEnter.completionEnabled) {
            this.uncompleted = new ListBuffer<>();
        }
        try {
            classEnter(trees, (Env<AttrContext>) null);
            if (this.memberEnter.completionEnabled) {
                while (this.uncompleted.nonEmpty()) {
                    Symbol.ClassSymbol clazz = this.uncompleted.next();
                    if (c == null || c == clazz || prevUncompleted == null) {
                        clazz.complete();
                    } else {
                        prevUncompleted.append(clazz);
                    }
                }
                for (JCTree.JCCompilationUnit tree : trees) {
                    if (tree.starImportScope.elems == null) {
                        JavaFileObject prev = this.f370log.useSource(tree.sourcefile);
                        Env<AttrContext> topEnv = topLevelEnv(tree);
                        this.memberEnter.memberEnter(tree, topEnv);
                        this.f370log.useSource(prev);
                    }
                }
            }
        } finally {
            this.uncompleted = prevUncompleted;
            this.annotate.enterDone();
        }
    }
}
