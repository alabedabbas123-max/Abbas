package com.sun.tools.javac.jvm;

import com.sun.tools.javac.code.Scope;
import com.sun.tools.javac.code.Source;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Symtab;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.code.Types;
import com.sun.tools.javac.comp.AttrContext;
import com.sun.tools.javac.comp.Env;
import com.sun.tools.javac.comp.Check;
import com.sun.tools.javac.comp.Resolve;
import com.sun.tools.javac.main.OptionName;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeInfo;
import com.sun.tools.javac.tree.TreeMaker;
import com.sun.tools.javac.tree.TreeScanner;
import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;
import com.sun.tools.javac.util.Options;
import com.sun.tools.javac.util.Position;
import java.util.HashMap;
import java.util.Map;
import sun.misc.FloatConsts;

public class Gen extends JCTree.Visitor {
    protected static final Context.C0723Key<Gen> genKey = new Context.C0723Key<>();
    private Name accessDollar;
    private final boolean allowGenerics;
    private final boolean allowInvokedynamic;
    private Env<AttrContext> attrEnv;

    private final Check f440chk;
    private Code code;
    private final boolean debugCode;
    private Map<JCTree, Integer> endPositions;

    Env<GenContext> f441env;
    private final boolean genCrt;
    private final boolean generateIproxies;
    private Items items;
    private final int jsrlimit;
    private final boolean lineDebugInfo;

    private final Log f442log;
    private final TreeMaker make;
    private final Type methodType;
    private final Names names;

    Type f443pt;
    Items.Item result;

    private final Resolve f444rs;
    private final Code.StackMapFormat stackMap;
    private final Map<Type, Symbol> stringBufferAppend;
    private final Type stringBufferType;
    private final Symtab syms;
    private final Target target;
    private JCTree.JCCompilationUnit toplevel;
    private final Types types;
    private boolean useJsrLocally;
    private final boolean varDebugInfo;
    private Pool pool = new Pool();
    private int nerrs = 0;

    public static class CodeSizeOverflow extends RuntimeException {
        private static final long serialVersionUID = 0;
    }

    public static Gen instance(Context context) {
        Gen instance = (Gen) context.m501get(genKey);
        if (instance == null) {
            return new Gen(context);
        }
        return instance;
    }

    protected Gen(Context context) {
        Type type;
        boolean zIsSet;
        context.m504put(genKey, this);
        this.names = Names.instance(context);
        this.f442log = Log.instance(context);
        this.syms = Symtab.instance(context);
        this.f440chk = Check.instance(context);
        this.f444rs = Resolve.instance(context);
        this.make = TreeMaker.instance(context);
        this.target = Target.instance(context);
        this.types = Types.instance(context);
        this.methodType = new Type.MethodType(null, null, null, this.syms.methodClass);
        this.allowGenerics = Source.instance(context).allowGenerics();
        if (this.target.useStringBuilder()) {
            type = this.syms.stringBuilderType;
        } else {
            type = this.syms.stringBufferType;
        }
        this.stringBufferType = type;
        this.stringBufferAppend = new HashMap();
        this.accessDollar = this.names.fromString("access" + this.target.syntheticNameChar());
        Options options = Options.instance(context);
        boolean z = true;
        this.lineDebugInfo = options.isUnset(OptionName.G_CUSTOM) || options.isSet(OptionName.G_CUSTOM, "lines");
        if (options.isUnset(OptionName.G_CUSTOM)) {
            zIsSet = options.isSet(OptionName.G);
        } else {
            zIsSet = options.isSet(OptionName.G_CUSTOM, "vars");
        }
        this.varDebugInfo = zIsSet;
        this.genCrt = options.isSet(OptionName.XJCOV);
        this.debugCode = options.isSet("debugcode");
        this.allowInvokedynamic = this.target.hasInvokedynamic() || options.isSet("invokedynamic");
        if (!this.target.requiresIproxy() && !options.isSet("miranda")) {
            z = false;
        }
        this.generateIproxies = z;
        if (this.target.generateStackMapTable()) {
            this.stackMap = Code.StackMapFormat.JSR202;
        } else if (this.target.generateCLDCStackmap()) {
            this.stackMap = Code.StackMapFormat.CLDC;
        } else {
            this.stackMap = Code.StackMapFormat.NONE;
        }
        int setjsrlimit = 50;
        String jsrlimitString = options.m515get("jsrlimit");
        if (jsrlimitString != null) {
            try {
                setjsrlimit = Integer.parseInt(jsrlimitString);
            } catch (NumberFormatException e) {
            }
        }
        this.jsrlimit = setjsrlimit;
        this.useJsrLocally = false;
    }

    void loadIntConst(int n) {
        this.items.makeImmediateItem(this.syms.intType, Integer.valueOf(n)).load();
    }

    public static int zero(int tc) {
        if (tc != 0) {
            if (tc == 1) {
                return 9;
            }
            if (tc != 2) {
                if (tc == 3) {
                    return 14;
                }
                if (tc != 5 && tc != 6 && tc != 7) {
                    throw new AssertionError("zero");
                }
            } else {
                return 11;
            }
        }
        return 3;
    }

    public static int m474one(int tc) {
        return zero(tc) + 1;
    }

    void emitMinusOne(int tc) {
        if (tc == 1) {
            this.items.makeImmediateItem(this.syms.longType, new Long(-1L)).load();
        } else {
            this.code.emitop0(2);
        }
    }

    Symbol binaryQualifier(Symbol sym, Type site) {
        Symbol qualifier;
        if (site.f344tag == 11) {
            if (sym == this.syms.lengthVar || sym.owner != this.syms.arrayClass) {
                return sym;
            }
            if (this.target.arrayBinaryCompatibility()) {
                qualifier = new Symbol.ClassSymbol(1L, site.tsym.name, site, this.syms.noSymbol);
            } else {
                qualifier = this.syms.objectType.tsym;
            }
            return sym.clone(qualifier);
        }
        if (sym.owner == site.tsym || (sym.flags() & 4104) == 4104) {
            return sym;
        }
        if (!this.target.obeyBinaryCompatibility()) {
            if (this.f444rs.isAccessible(this.attrEnv, (Symbol.TypeSymbol) sym.owner)) {
                return sym;
            }
            return sym.clone(site.tsym);
        }
        if ((!this.target.interfaceFieldsBinaryCompatibility() && (sym.owner.flags() & 512) != 0 && sym.kind == 4) || sym.owner == this.syms.objectType.tsym) {
            return sym;
        }
        if (!this.target.interfaceObjectOverridesBinaryCompatibility() && (512 & sym.owner.flags()) != 0 && this.syms.objectType.tsym.members().lookup(sym.name).scope != null) {
            return sym;
        }
        return sym.clone(site.tsym);
    }

    int makeRef(JCDiagnostic.DiagnosticPosition pos, Type type) {
        checkDimension(pos, type);
        return this.pool.m478put(type.f344tag == 10 ? type.tsym : type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void checkDimension(JCDiagnostic.DiagnosticPosition pos, Type t) {
        int i = t.f344tag;
        if (i == 11) {
            if (this.types.dimensions(t) > 255) {
                this.f442log.error(pos, "limit.dimensions", new Object[0]);
                this.nerrs++;
                return;
            }
            return;
        }
        if (i == 12) {
            checkDimension(pos, t.mo574getReturnType());
            for (List listMo573getParameterTypes = t.mo573getParameterTypes(); listMo573getParameterTypes.nonEmpty(); listMo573getParameterTypes = listMo573getParameterTypes.tail) {
                checkDimension(pos, (Type) listMo573getParameterTypes.head);
            }
        }
    }

    Items.LocalItem makeTemp(Type type) {
        Symbol.VarSymbol v = new Symbol.VarSymbol(4096L, this.names.empty, type, this.f441env.enclMethod.f544sym);
        this.code.newLocal(v);
        return this.items.makeLocalItem(v);
    }

    void callMethod(JCDiagnostic.DiagnosticPosition pos, Type site, Name name, List<Type> argtypes, boolean isStatic) {
        Symbol msym = this.f444rs.resolveInternalMethod(pos, this.attrEnv, site, name, argtypes, null);
        if (isStatic) {
            this.items.makeStaticItem(msym).invoke();
        } else {
            this.items.makeMemberItem(msym, name == this.names.init).invoke();
        }
    }

    private boolean isAccessSuper(JCTree.JCMethodDecl enclMethod) {
        return (enclMethod.mods.flags & 4096) != 0 && isOddAccessName(enclMethod.name);
    }

    private boolean isOddAccessName(Name name) {
        return name.startsWith(this.accessDollar) && (name.getByteAt(name.getByteLength() - 1) & 1) == 1;
    }

    void genFinalizer(Env<GenContext> env) {
        if (this.code.isAlive() && env.info.finalize != null) {
            env.info.finalize.mo475gen();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.sun.tools.javac.jvm.Gen] */
    Env<GenContext> unwind(JCTree jCTree, Env<GenContext> c0621Env) {
        Env c0621Env2 = c0621Env;
        while (true) {
            genFinalizer(c0621Env2);
            if (c0621Env2.tree != jCTree) {
                c0621Env2 = c0621Env2.next;
            } else {
                return c0621Env2;
            }
        }
    }

    void endFinalizerGap(Env<GenContext> env) {
        if (env.info.gaps != null && env.info.gaps.length() % 2 == 1) {
            env.info.gaps.append(Integer.valueOf(this.code.curPc()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void endFinalizerGaps(Env<GenContext> c0621Env, Env<GenContext> c0621Env2) {
        Env c0621Env3 = null;
        Env c0621Env4 = c0621Env;
        while (c0621Env3 != c0621Env2) {
            endFinalizerGap(c0621Env4);
            c0621Env3 = c0621Env4;
            c0621Env4 = c0621Env4.next;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean hasFinally(JCTree jCTree, Env<GenContext> c0621Env) {
        for (Env c0621Env2 = c0621Env; c0621Env2.tree != jCTree; c0621Env2 = c0621Env2.next) {
            if (c0621Env2.tree.getTag() == 16 && ((GenContext) c0621Env2.info).finalize.hasFinalizer()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    List<JCTree> normalizeDefs(List<JCTree> defs, Symbol.ClassSymbol c) {
        Integer endPos;
        Integer endPos2;
        ListBuffer<JCTree.JCStatement> initCode = new ListBuffer<>();
        ListBuffer<JCTree.JCStatement> clinitCode = new ListBuffer<>();
        ListBuffer<JCTree> methodDefs = new ListBuffer<>();
        for (List list = defs; list.nonEmpty(); list = list.tail) {
            JCTree def = (JCTree) list.head;
            int tag = def.getTag();
            if (tag == 4) {
                methodDefs.append(def);
            } else if (tag == 5) {
                JCTree.JCVariableDecl vdef = (JCTree.JCVariableDecl) def;
                Symbol.VarSymbol sym = vdef.f547sym;
                checkDimension(vdef.m489pos(), sym.type);
                if (vdef.init != null) {
                    if ((8 & sym.flags()) == 0) {
                        JCTree.JCStatement init = this.make.m496at(vdef.m489pos()).Assignment(sym, vdef.init);
                        initCode.append(init);
                        Map<JCTree, Integer> map = this.endPositions;
                        if (map != null && (endPos2 = map.remove(vdef)) != null) {
                            this.endPositions.put(init, endPos2);
                        }
                    } else if (sym.getConstValue() == null) {
                        JCTree.JCStatement init2 = this.make.m495at(vdef.f531pos).Assignment(sym, vdef.init);
                        clinitCode.append(init2);
                        Map<JCTree, Integer> map2 = this.endPositions;
                        if (map2 != null && (endPos = map2.remove(vdef)) != null) {
                            this.endPositions.put(init2, endPos);
                        }
                    } else {
                        checkStringConstant(vdef.init.m489pos(), sym.getConstValue());
                    }
                }
            } else if (tag == 7) {
                JCTree.JCBlock block = (JCTree.JCBlock) def;
                if ((8 & block.flags) != 0) {
                    clinitCode.append(block);
                } else {
                    initCode.append(block);
                }
            } else {
                Assert.error();
            }
        }
        if (initCode.length() != 0) {
            List<JCTree.JCStatement> inits = initCode.toList();
            for (JCTree t : methodDefs) {
                normalizeMethod((JCTree.JCMethodDecl) t, inits);
            }
        }
        if (clinitCode.length() != 0) {
            Symbol.MethodSymbol clinit = new Symbol.MethodSymbol(8L, this.names.clinit, new Type.MethodType(List.m507nil(), this.syms.voidType, List.m507nil(), this.syms.methodClass), c);
            c.members().enter(clinit);
            List<JCTree.JCStatement> clinitStats = clinitCode.toList();
            JCTree.JCBlock block2 = this.make.m496at(clinitStats.head.m489pos()).Block(0L, clinitStats);
            block2.endpos = TreeInfo.endPos(clinitStats.last());
            methodDefs.append(this.make.MethodDef(clinit, block2));
        }
        return methodDefs.toList();
    }

    private void checkStringConstant(JCDiagnostic.DiagnosticPosition pos, Object constValue) {
        if (this.nerrs != 0 || constValue == null || !(constValue instanceof String) || ((String) constValue).length() < 65535) {
            return;
        }
        this.f442log.error(pos, "limit.string", new Object[0]);
        this.nerrs++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void normalizeMethod(JCTree.JCMethodDecl md, List<JCTree.JCStatement> initCode) {
        if (md.name == this.names.init && TreeInfo.isInitialConstructor(md)) {
            List list = md.body.stats;
            ListBuffer listBuffer = new ListBuffer();
            if (list.nonEmpty()) {
                while (TreeInfo.isSyntheticInit((JCTree) list.head)) {
                    listBuffer.append(list.head);
                    list = list.tail;
                }
                listBuffer.append(list.head);
                List list2 = list.tail;
                while (list2.nonEmpty() && TreeInfo.isSyntheticInit((JCTree) list2.head)) {
                    listBuffer.append(list2.head);
                    list2 = list2.tail;
                }
                listBuffer.appendList(initCode);
                while (list2.nonEmpty()) {
                    listBuffer.append(list2.head);
                    list2 = list2.tail;
                }
            }
            md.body.stats = listBuffer.toList();
            if (md.body.endpos == -1) {
                md.body.endpos = TreeInfo.endPos(md.body.stats.last());
            }
        }
    }

    void implementInterfaceMethods(Symbol.ClassSymbol c) {
        implementInterfaceMethods(c, c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void implementInterfaceMethods(Symbol.ClassSymbol c, Symbol.ClassSymbol site) {
        for (List listInterfaces = this.types.interfaces(c.type); listInterfaces.nonEmpty(); listInterfaces = listInterfaces.tail) {
            Symbol.ClassSymbol i = (Symbol.ClassSymbol) ((Type) listInterfaces.head).tsym;
            for (Scope.Entry e = i.members().elems; e != null; e = e.sibling) {
                if (e.f338sym.kind == 16 && (e.f338sym.flags() & 8) == 0) {
                    Symbol.MethodSymbol absMeth = (Symbol.MethodSymbol) e.f338sym;
                    Symbol.MethodSymbol implMeth = absMeth.binaryImplementation(site, this.types);
                    if (implMeth == null) {
                        addAbstractMethod(site, absMeth);
                    } else if ((implMeth.flags() & 2097152) != 0) {
                        adjustAbstractMethod(site, implMeth, absMeth);
                    }
                }
            }
            implementInterfaceMethods(i, site);
        }
    }

    private void addAbstractMethod(Symbol.ClassSymbol c, Symbol.MethodSymbol m) {
        Symbol.MethodSymbol absMeth = new Symbol.MethodSymbol(4096 | m.flags() | 2097152, m.name, m.type, c);
        c.members().enter(absMeth);
    }

    private void adjustAbstractMethod(Symbol.ClassSymbol c, Symbol.MethodSymbol pm, Symbol.MethodSymbol im) {
        Type.MethodType pmt = (Type.MethodType) pm.type;
        Type imt = this.types.memberType(c.type, im);
        pmt.thrown = this.f440chk.intersect(pmt.mo575getThrownTypes(), imt.mo575getThrownTypes());
    }

    public void genDef(JCTree tree, Env<GenContext> env) {
        Env<GenContext> prevEnv = this.f441env;
        try {
            try {
                this.f441env = env;
                tree.accept(this);
            } catch (Symbol.CompletionFailure ex) {
                this.f440chk.completionError(tree.m489pos(), ex);
            }
        } finally {
            this.f441env = prevEnv;
        }
    }

    public void genStat(JCTree tree, Env<GenContext> env, int crtFlags) {
        if (!this.genCrt) {
            genStat(tree, env);
            return;
        }
        int startpc = this.code.curPc();
        genStat(tree, env);
        if (tree.getTag() == 7) {
            crtFlags |= 2;
        }
        this.code.f434crt.m467put(tree, crtFlags, startpc, this.code.curPc());
    }

    public void genStat(JCTree tree, Env<GenContext> env) {
        if (this.code.isAlive()) {
            this.code.statBegin(tree.f531pos);
            genDef(tree, env);
        } else if (env.info.isSwitch && tree.getTag() == 5) {
            this.code.newLocal(((JCTree.JCVariableDecl) tree).f547sym);
        }
    }

    public void genStats(List<JCTree.JCStatement> trees, Env<GenContext> env, int crtFlags) {
        if (!this.genCrt) {
            genStats(trees, env);
        } else {
            if (trees.length() == 1) {
                genStat(trees.head, env, crtFlags | 1);
                return;
            }
            int startpc = this.code.curPc();
            genStats(trees, env);
            this.code.f434crt.m467put(trees, crtFlags, startpc, this.code.curPc());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void genStats(List<? extends JCTree> trees, Env<GenContext> env) {
        for (List list = trees; list.nonEmpty(); list = list.tail) {
            genStat((JCTree) list.head, env, 1);
        }
    }

    public Items.CondItem genCond(JCTree tree, int crtFlags) {
        if (!this.genCrt) {
            return genCond(tree, false);
        }
        int startpc = this.code.curPc();
        Items.CondItem item = genCond(tree, (crtFlags & 8) != 0);
        this.code.f434crt.m467put(tree, crtFlags, startpc, this.code.curPc());
        return item;
    }

    public Items.CondItem genCond(JCTree _tree, boolean markBranches) {
        JCTree inner_tree = TreeInfo.skipParens(_tree);
        if (inner_tree.getTag() == 18) {
            JCTree.JCConditional tree = (JCTree.JCConditional) inner_tree;
            Items.CondItem cond = genCond(tree.cond, 8);
            if (cond.isTrue()) {
                this.code.resolve(cond.trueJumps);
                Items.CondItem result = genCond(tree.truepart, 16);
                if (markBranches) {
                    result.tree = tree.truepart;
                }
                return result;
            }
            if (cond.isFalse()) {
                this.code.resolve(cond.falseJumps);
                Items.CondItem result2 = genCond(tree.falsepart, 16);
                if (markBranches) {
                    result2.tree = tree.falsepart;
                }
                return result2;
            }
            Code.Chain secondJumps = cond.jumpFalse();
            this.code.resolve(cond.trueJumps);
            Items.CondItem first = genCond(tree.truepart, 16);
            if (markBranches) {
                first.tree = tree.truepart;
            }
            Code.Chain falseJumps = first.jumpFalse();
            this.code.resolve(first.trueJumps);
            Code.Chain trueJumps = this.code.branch(ByteCodes.goto_);
            this.code.resolve(secondJumps);
            Items.CondItem second = genCond(tree.falsepart, 16);
            Items.CondItem result3 = this.items.makeCondItem(second.opcode, Code.mergeChains(trueJumps, second.trueJumps), Code.mergeChains(falseJumps, second.falseJumps));
            if (markBranches) {
                result3.tree = tree.falsepart;
            }
            return result3;
        }
        Items.CondItem result4 = genExpr(_tree, this.syms.booleanType).mkCond();
        if (markBranches) {
            result4.tree = _tree;
        }
        return result4;
    }

    public Items.Item genExpr(JCTree tree, Type pt) {
        Type prevPt = this.f443pt;
        try {
            if (tree.type.constValue() != null) {
                checkStringConstant(tree.m489pos(), tree.type.constValue());
                this.result = this.items.makeImmediateItem(tree.type, tree.type.constValue());
            } else {
                this.f443pt = pt;
                tree.accept(this);
            }
            return this.result.coerce(pt);
        } catch (Symbol.CompletionFailure ex) {
            this.f440chk.completionError(tree.m489pos(), ex);
            this.code.state.stacksize = 1;
            return this.items.makeStackItem(pt);
        } finally {
            this.f443pt = prevPt;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void genArgs(List<JCTree.JCExpression> list, List<Type> list2) {
        List list3 = list;
        List list4 = list2;
        while (list3.nonEmpty()) {
            genExpr((JCTree) list3.head, (Type) list4.head).load();
            List list5 = list4.tail;
            list3 = list3.tail;
            list4 = list5;
        }
        Assert.check(list4.isEmpty());
    }

    @Override
    public void visitMethodDef(JCTree.JCMethodDecl tree) {
        Env<GenContext> localEnv = this.f441env.m465dup(tree);
        localEnv.enclMethod = tree;
        this.f443pt = tree.f544sym.erasure(this.types).mo574getReturnType();
        checkDimension(tree.m489pos(), tree.f544sym.erasure(this.types));
        genMethod(tree, localEnv, false);
    }

    void genMethod(JCTree.JCMethodDecl tree, Env<GenContext> env, boolean fatcode) {
        Symbol.MethodSymbol meth = tree.f544sym;
        if (Code.width(this.types.erasure(env.enclMethod.f544sym.type).mo573getParameterTypes()) + (((tree.mods.flags & 8) == 0 || meth.isConstructor()) ? 1 : 0) > 255) {
            this.f442log.error(tree.m489pos(), "limit.parameters", new Object[0]);
            this.nerrs++;
            return;
        }
        if (tree.body != null) {
            int startpcCrt = initCode(tree, env, fatcode);
            try {
                genStat(tree.body, env);
            } catch (CodeSizeOverflow e) {
                startpcCrt = initCode(tree, env, fatcode);
                genStat(tree.body, env);
            }
            if (this.code.state.stacksize != 0) {
                this.f442log.error(tree.body.m489pos(), "stack.sim.error", tree);
                throw new AssertionError();
            }
            if (this.code.isAlive()) {
                this.code.statBegin(TreeInfo.endPos(tree.body));
                if (env.enclMethod == null || env.enclMethod.f544sym.type.mo574getReturnType().f344tag == 9) {
                    this.code.emitop0(ByteCodes.return_);
                } else {
                    int startpc = this.code.entryPoint();
                    Items.CondItem c = this.items.makeCondItem(ByteCodes.goto_);
                    this.code.resolve(c.jumpTrue(), startpc);
                }
            }
            if (this.genCrt) {
                this.code.f434crt.m467put(tree.body, 2, startpcCrt, this.code.curPc());
            }
            this.code.endScopes(0);
            if (this.code.checkLimits(tree.m489pos(), this.f442log)) {
                this.nerrs++;
                return;
            }
            if (!fatcode && this.code.fatcode) {
                genMethod(tree, env, true);
            }
            if (this.stackMap == Code.StackMapFormat.JSR202) {
                this.code.lastFrame = null;
                this.code.frameBeforeLast = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int initCode(JCTree.JCMethodDecl tree, Env<GenContext> env, boolean fatcode) {
        Symbol.MethodSymbol meth = tree.f544sym;
        Code code = new Code(meth, fatcode, this.lineDebugInfo ? this.toplevel.lineMap : null, this.varDebugInfo, this.stackMap, this.debugCode, this.genCrt ? new CRTable(tree, env.toplevel.endPositions) : null, this.syms, this.types, this.pool);
        this.code = code;
        meth.code = code;
        this.items = new Items(this.pool, this.code, this.syms, this.types);
        if (this.code.debugCode) {
            System.err.println(meth + " for body " + tree);
        }
        if ((tree.mods.flags & 8) == 0) {
            Type selfType = meth.owner.type;
            if (meth.isConstructor() && selfType != this.syms.objectType) {
                selfType = UninitializedType.uninitializedThis(selfType);
            }
            Code code2 = this.code;
            code2.setDefined(code2.newLocal(new Symbol.VarSymbol(16L, this.names._this, selfType, meth.owner)));
        }
        for (List list = tree.params; list.nonEmpty(); list = list.tail) {
            checkDimension(((JCTree.JCVariableDecl) list.head).m489pos(), ((JCTree.JCVariableDecl) list.head).f547sym.type);
            Code code3 = this.code;
            code3.setDefined(code3.newLocal(((JCTree.JCVariableDecl) list.head).f547sym));
        }
        int startpcCrt = this.genCrt ? this.code.curPc() : 0;
        this.code.entryPoint();
        this.code.pendingStackMap = false;
        return startpcCrt;
    }

    @Override
    public void visitVarDef(JCTree.JCVariableDecl tree) {
        Symbol.VarSymbol v = tree.f547sym;
        this.code.newLocal(v);
        if (tree.init != null) {
            checkStringConstant(tree.init.m489pos(), v.getConstValue());
            if (v.getConstValue() == null || this.varDebugInfo) {
                genExpr(tree.init, v.erasure(this.types)).load();
                this.items.makeLocalItem(v).store();
            }
        }
        checkDimension(tree.m489pos(), v.type);
    }

    @Override
    public void visitSkip(JCTree.JCSkip tree) {
    }

    @Override
    public void visitBlock(JCTree.JCBlock tree) {
        int limit = this.code.nextreg;
        Env<GenContext> localEnv = this.f441env.m466dup(tree, new GenContext());
        genStats(tree.stats, localEnv);
        if (this.f441env.tree.getTag() != 4) {
            this.code.statBegin(tree.endpos);
            this.code.endScopes(limit);
            this.code.pendingStatPos = -1;
        }
    }

    @Override
    public void visitDoLoop(JCTree.JCDoWhileLoop tree) {
        genLoop(tree, tree.body, tree.cond, List.m507nil(), false);
    }

    @Override
    public void visitWhileLoop(JCTree.JCWhileLoop tree) {
        genLoop(tree, tree.body, tree.cond, List.m507nil(), true);
    }

    @Override
    public void visitForLoop(JCTree.JCForLoop tree) {
        int limit = this.code.nextreg;
        genStats(tree.init, this.f441env);
        genLoop(tree, tree.body, tree.cond, tree.step, true);
        this.code.endScopes(limit);
    }

    private void genLoop(JCTree.JCStatement loop, JCTree.JCStatement body, JCTree.JCExpression cond, List<JCTree.JCExpressionStatement> step, boolean testFirst) {
        Items.CondItem c;
        Items.CondItem c2;
        Env<GenContext> loopEnv = this.f441env.m466dup(loop, new GenContext());
        int startpc = this.code.entryPoint();
        if (testFirst) {
            if (cond != null) {
                this.code.statBegin(cond.f531pos);
                c2 = genCond(TreeInfo.skipParens(cond), 8);
            } else {
                c2 = this.items.makeCondItem(ByteCodes.goto_);
            }
            Code.Chain loopDone = c2.jumpFalse();
            this.code.resolve(c2.trueJumps);
            genStat(body, loopEnv, 17);
            this.code.resolve(loopEnv.info.cont);
            genStats(step, loopEnv);
            Code code = this.code;
            code.resolve(code.branch(ByteCodes.goto_), startpc);
            this.code.resolve(loopDone);
        } else {
            genStat(body, loopEnv, 17);
            this.code.resolve(loopEnv.info.cont);
            genStats(step, loopEnv);
            if (cond != null) {
                this.code.statBegin(cond.f531pos);
                c = genCond(TreeInfo.skipParens(cond), 8);
            } else {
                c = this.items.makeCondItem(ByteCodes.goto_);
            }
            this.code.resolve(c.jumpTrue(), startpc);
            this.code.resolve(c.falseJumps);
        }
        this.code.resolve(loopEnv.info.exit);
    }

    @Override
    public void visitForeachLoop(JCTree.JCEnhancedForLoop tree) {
        throw new AssertionError();
    }

    @Override
    public void visitLabelled(JCTree.JCLabeledStatement tree) {
        Env<GenContext> localEnv = this.f441env.m466dup(tree, new GenContext());
        genStat(tree.body, localEnv, 1);
        this.code.resolve(localEnv.info.exit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void visitSwitch(JCTree.JCSwitch tree) {
        int limit;
        int lo;
        int startpc;
        int[] offsets;
        int limit2;
        List list;
        int limit3 = this.code.nextreg;
        Assert.check(tree.selector.type.f344tag != 10);
        int startpcCrt = this.genCrt ? this.code.curPc() : 0;
        Items.Item sel = genExpr(tree.selector, this.syms.intType);
        List<JCTree.JCCase> cases = tree.cases;
        if (cases.isEmpty()) {
            sel.load().drop();
            if (!this.genCrt) {
                limit2 = limit3;
            } else {
                this.code.f434crt.m467put(TreeInfo.skipParens(tree.selector), 8, startpcCrt, this.code.curPc());
                limit2 = limit3;
            }
        } else {
            sel.load();
            if (this.genCrt) {
                this.code.f434crt.m467put(TreeInfo.skipParens(tree.selector), 8, startpcCrt, this.code.curPc());
            }
            Env<GenContext> switchEnv = this.f441env.m466dup(tree, new GenContext());
            switchEnv.info.isSwitch = true;
            int lo2 = Position.MAXPOS;
            int hi = FloatConsts.SIGN_BIT_MASK;
            int nlabels = 0;
            int[] labels = new int[cases.length()];
            int defaultIndex = -1;
            List list2 = cases;
            for (int i = 0; i < labels.length; i++) {
                if (((JCTree.JCCase) list2.head).f538pat != null) {
                    int val = ((Number) ((JCTree.JCCase) list2.head).f538pat.type.constValue()).intValue();
                    labels[i] = val;
                    if (val < lo2) {
                        lo2 = val;
                    }
                    if (hi < val) {
                        hi = val;
                    }
                    nlabels++;
                } else {
                    Assert.check(defaultIndex == -1);
                    defaultIndex = i;
                }
                list2 = list2.tail;
            }
            long table_space_cost = (((long) hi) - ((long) lo2)) + 1 + 4;
            long lookup_space_cost = (((long) nlabels) * 2) + 3;
            int lo3 = lo2;
            long lookup_time_cost = nlabels;
            int opcode = (nlabels <= 0 || table_space_cost + (3 * 3) > lookup_space_cost + (lookup_time_cost * 3)) ? ByteCodes.lookupswitch : ByteCodes.tableswitch;
            int startpc2 = this.code.curPc();
            this.code.emitop0(opcode);
            this.code.align(4);
            int tableBase = this.code.curPc();
            this.code.emit4(-1);
            if (opcode == 170) {
                lo = lo3;
                this.code.emit4(lo);
                this.code.emit4(hi);
                long i2 = lo;
                while (true) {
                    startpc = startpc2;
                    limit = limit3;
                    if (i2 > hi) {
                        break;
                    }
                    this.code.emit4(-1);
                    i2++;
                    limit3 = limit;
                    startpc2 = startpc;
                }
                offsets = null;
            } else {
                limit = limit3;
                lo = lo3;
                startpc = startpc2;
                this.code.emit4(nlabels);
                for (int i3 = 0; i3 < nlabels; i3++) {
                    this.code.emit4(-1);
                    this.code.emit4(-1);
                }
                int i4 = labels.length;
                offsets = new int[i4];
            }
            Code.State stateSwitch = this.code.state.m471dup();
            this.code.markDead();
            List list3 = cases;
            int i5 = 0;
            while (i5 < labels.length) {
                JCTree.JCCase c = (JCTree.JCCase) list3.head;
                List list4 = list3.tail;
                List<JCTree.JCCase> cases2 = cases;
                int pc = this.code.entryPoint(stateSwitch);
                if (i5 == defaultIndex) {
                    list = list4;
                    this.code.put4(tableBase, pc - startpc);
                } else {
                    list = list4;
                    if (opcode == 170) {
                        int nlabels2 = pc - startpc;
                        this.code.put4(tableBase + (((labels[i5] - lo) + 3) * 4), nlabels2);
                    } else {
                        offsets[i5] = pc - startpc;
                    }
                }
                genStats(c.stats, switchEnv, 16);
                i5++;
                cases = cases2;
                list3 = list;
                nlabels = nlabels;
                limit = limit;
            }
            limit2 = limit;
            int nlabels3 = nlabels;
            this.code.resolve(switchEnv.info.exit);
            if (this.code.get4(tableBase) == -1) {
                Code code = this.code;
                code.put4(tableBase, code.entryPoint(stateSwitch) - startpc);
            }
            if (opcode == 170) {
                int defaultOffset = this.code.get4(tableBase);
                long i6 = lo;
                while (true) {
                    Env<GenContext> switchEnv2 = switchEnv;
                    Code.State stateSwitch2 = stateSwitch;
                    if (i6 > hi) {
                        break;
                    }
                    List list5 = list3;
                    int hi2 = hi;
                    int t = (int) (((long) tableBase) + (((i6 - ((long) lo)) + 3) * 4));
                    if (this.code.get4(t) == -1) {
                        this.code.put4(t, defaultOffset);
                    }
                    i6++;
                    switchEnv = switchEnv2;
                    stateSwitch = stateSwitch2;
                    hi = hi2;
                    list3 = list5;
                }
            } else {
                int[] offsets2 = offsets;
                if (defaultIndex >= 0) {
                    for (int i7 = defaultIndex; i7 < labels.length - 1; i7++) {
                        labels[i7] = labels[i7 + 1];
                        offsets2[i7] = offsets2[i7 + 1];
                    }
                }
                if (nlabels3 > 0) {
                    qsort2(labels, offsets2, 0, nlabels3 - 1);
                }
                int i8 = 0;
                while (true) {
                    int nlabels4 = nlabels3;
                    if (i8 >= nlabels4) {
                        break;
                    }
                    int caseidx = ((i8 + 1) * 8) + tableBase;
                    this.code.put4(caseidx, labels[i8]);
                    this.code.put4(caseidx + 4, offsets2[i8]);
                    i8++;
                    nlabels3 = nlabels4;
                }
            }
        }
        this.code.endScopes(limit2);
    }

    static void qsort2(int[] keys, int[] values, int lo, int hi) {
        int i = lo;
        int j = hi;
        int pivot = keys[(i + j) / 2];
        while (true) {
            if (keys[i] < pivot) {
                i++;
            } else {
                while (pivot < keys[j]) {
                    j--;
                }
                if (i <= j) {
                    int temp1 = keys[i];
                    keys[i] = keys[j];
                    keys[j] = temp1;
                    int temp2 = values[i];
                    values[i] = values[j];
                    values[j] = temp2;
                    i++;
                    j--;
                }
                if (i > j) {
                    break;
                }
            }
        }
        if (lo < j) {
            qsort2(keys, values, lo, j);
        }
        if (i < hi) {
            qsort2(keys, values, i, hi);
        }
    }

    @Override
    public void visitSynchronized(JCTree.JCSynchronized tree) {
        int limit = this.code.nextreg;
        final Items.LocalItem lockVar = makeTemp(this.syms.objectType);
        genExpr(tree.lock, tree.lock.type).load().duplicate();
        lockVar.store();
        this.code.emitop0(ByteCodes.monitorenter);
        this.code.state.lock(lockVar.f446reg);
        final Env<GenContext> syncEnv = this.f441env.m466dup(tree, new GenContext());
        syncEnv.info.finalize = new GenFinalizer() {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override
            void mo475gen() {
                genLast();
                Assert.check(((GenContext) syncEnv.info).gaps.length() % 2 == 0);
                ((GenContext) syncEnv.info).gaps.append(Integer.valueOf(Gen.this.code.curPc()));
            }

            @Override
            void genLast() {
                if (Gen.this.code.isAlive()) {
                    lockVar.load();
                    Gen.this.code.emitop0(ByteCodes.monitorexit);
                    Gen.this.code.state.unlock(lockVar.f446reg);
                }
            }
        };
        syncEnv.info.gaps = new ListBuffer<>();
        genTry(tree.body, List.m507nil(), syncEnv);
        this.code.endScopes(limit);
    }

    @Override
    public void visitTry(final JCTree.JCTry tree) {
        int i;
        final Env<GenContext> tryEnv = this.f441env.m466dup(tree, new GenContext());
        final Env<GenContext> oldEnv = this.f441env;
        if (!this.useJsrLocally) {
            this.useJsrLocally = this.stackMap == Code.StackMapFormat.NONE && ((i = this.jsrlimit) <= 0 || (i < 100 && estimateCodeComplexity(tree.finalizer) > this.jsrlimit));
        }
        tryEnv.info.finalize = new GenFinalizer() {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override
            void mo475gen() {
                if (Gen.this.useJsrLocally) {
                    if (tree.finalizer != null) {
                        Code.State jsrState = Gen.this.code.state.m471dup();
                        jsrState.push(Code.jsrReturnValue);
                        ((GenContext) tryEnv.info).cont = new Code.Chain(Gen.this.code.emitJump(168), ((GenContext) tryEnv.info).cont, jsrState);
                    }
                    Assert.check(((GenContext) tryEnv.info).gaps.length() % 2 == 0);
                    ((GenContext) tryEnv.info).gaps.append(Integer.valueOf(Gen.this.code.curPc()));
                    return;
                }
                Assert.check(((GenContext) tryEnv.info).gaps.length() % 2 == 0);
                ((GenContext) tryEnv.info).gaps.append(Integer.valueOf(Gen.this.code.curPc()));
                genLast();
            }

            @Override
            void genLast() {
                if (tree.finalizer != null) {
                    Gen.this.genStat(tree.finalizer, oldEnv, 2);
                }
            }

            @Override
            boolean hasFinalizer() {
                return tree.finalizer != null;
            }
        };
        tryEnv.info.gaps = new ListBuffer<>();
        genTry(tree.body, tree.catchers, tryEnv);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void genTry(JCTree body, List<JCTree.JCCatch> catchers, Env<GenContext> env) {
        Code.Chain exitChain;
        int limit = this.code.nextreg;
        int startpc = this.code.curPc();
        Code.State stateTry = this.code.state.m471dup();
        genStat(body, env, 2);
        int endpc = this.code.curPc();
        boolean hasFinalizer = env.info.finalize != null && env.info.finalize.hasFinalizer();
        List<Integer> gaps = env.info.gaps.toList();
        this.code.statBegin(TreeInfo.endPos(body));
        genFinalizer(env);
        this.code.statBegin(TreeInfo.endPos(env.tree));
        Code.Chain exitChain2 = this.code.branch(ByteCodes.goto_);
        endFinalizerGap(env);
        if (startpc != endpc) {
            Code.Chain exitChain3 = exitChain2;
            List list = catchers;
            while (list.nonEmpty()) {
                this.code.entryPoint(stateTry, ((JCTree.JCCatch) list.head).param.f547sym.type);
                List list2 = list;
                Code.Chain exitChain4 = exitChain3;
                genCatch((JCTree.JCCatch) list.head, env, startpc, endpc, gaps);
                genFinalizer(env);
                if (hasFinalizer || list2.tail.nonEmpty()) {
                    this.code.statBegin(TreeInfo.endPos(env.tree));
                    exitChain3 = Code.mergeChains(exitChain4, this.code.branch(ByteCodes.goto_));
                } else {
                    exitChain3 = exitChain4;
                }
                endFinalizerGap(env);
                list = list2.tail;
            }
            exitChain = exitChain3;
        } else {
            exitChain = exitChain2;
        }
        if (hasFinalizer) {
            this.code.newRegSegment();
            int catchallpc = this.code.entryPoint(stateTry, this.syms.throwableType);
            int startseg = startpc;
            while (env.info.gaps.nonEmpty()) {
                int endseg = env.info.gaps.next().intValue();
                registerCatch(body.m489pos(), startseg, endseg, catchallpc, 0);
                startseg = env.info.gaps.next().intValue();
            }
            this.code.statBegin(TreeInfo.finalizerPos(env.tree));
            this.code.markStatBegin();
            Items.Item excVar = makeTemp(this.syms.throwableType);
            excVar.store();
            genFinalizer(env);
            excVar.load();
            registerCatch(body.m489pos(), startseg, env.info.gaps.next().intValue(), catchallpc, 0);
            this.code.emitop0(ByteCodes.athrow);
            this.code.markDead();
            if (env.info.cont != null) {
                this.code.resolve(env.info.cont);
                this.code.statBegin(TreeInfo.finalizerPos(env.tree));
                this.code.markStatBegin();
                Items.LocalItem retVar = makeTemp(this.syms.throwableType);
                retVar.store();
                env.info.finalize.genLast();
                this.code.emitop1w(ByteCodes.f419ret, retVar.f446reg);
                this.code.markDead();
            }
        }
        this.code.resolve(exitChain);
        this.code.endScopes(limit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void genCatch(JCTree.JCCatch tree, Env<GenContext> env, int startpc, int endpc, List<Integer> gaps) {
        List<JCTree.JCExpression> listM508of;
        if (startpc != endpc) {
            if (TreeInfo.isMultiCatch(tree)) {
                listM508of = ((JCTree.JCTypeUnion) tree.param.vartype).alternatives;
            } else {
                listM508of = List.m508of(tree.param.vartype);
            }
            List<JCTree.JCExpression> subClauses = listM508of;
            List list = gaps;
            int startpc2 = startpc;
            while (list.nonEmpty()) {
                for (JCTree.JCExpression subCatch : subClauses) {
                    int catchType = makeRef(tree.m489pos(), subCatch.type);
                    int end = ((Integer) list.head).intValue();
                    registerCatch(tree.m489pos(), startpc2, end, this.code.curPc(), catchType);
                }
                List<A> list2 = list.tail;
                startpc2 = ((Integer) list2.head).intValue();
                list = list2.tail;
            }
            if (startpc2 < endpc) {
                for (JCTree.JCExpression subCatch2 : subClauses) {
                    int catchType2 = makeRef(tree.m489pos(), subCatch2.type);
                    registerCatch(tree.m489pos(), startpc2, endpc, this.code.curPc(), catchType2);
                }
            }
            Symbol.VarSymbol exparam = tree.param.f547sym;
            this.code.statBegin(tree.f531pos);
            this.code.markStatBegin();
            int limit = this.code.nextreg;
            this.code.newLocal(exparam);
            this.items.makeLocalItem(exparam).store();
            this.code.statBegin(TreeInfo.firstStatPos(tree.body));
            genStat(tree.body, env, 2);
            this.code.endScopes(limit);
            this.code.statBegin(TreeInfo.endPos(tree.body));
        }
    }

    void registerCatch(JCDiagnostic.DiagnosticPosition pos, int startpc, int endpc, int handler_pc, int catch_type) {
        if (startpc != endpc) {
            char startpc1 = (char) startpc;
            char endpc1 = (char) endpc;
            char handler_pc1 = (char) handler_pc;
            if (startpc1 == startpc && endpc1 == endpc && handler_pc1 == handler_pc) {
                this.code.addCatch(startpc1, endpc1, handler_pc1, (char) catch_type);
            } else {
                if (!this.useJsrLocally && !this.target.generateStackMapTable()) {
                    this.useJsrLocally = true;
                    throw new CodeSizeOverflow();
                }
                this.f442log.error(pos, "limit.code.too.large.for.try.stmt", new Object[0]);
                this.nerrs++;
            }
        }
    }

    class C1ComplexityScanner extends TreeScanner {
        int complexity = 0;

        C1ComplexityScanner() {
        }

        @Override
        public void scan(JCTree tree) {
            if (this.complexity > Gen.this.jsrlimit) {
                return;
            }
            super.scan(tree);
        }

        @Override
        public void visitClassDef(JCTree.JCClassDecl tree) {
        }

        @Override
        public void visitDoLoop(JCTree.JCDoWhileLoop tree) {
            super.visitDoLoop(tree);
            this.complexity++;
        }

        @Override
        public void visitWhileLoop(JCTree.JCWhileLoop tree) {
            super.visitWhileLoop(tree);
            this.complexity++;
        }

        @Override
        public void visitForLoop(JCTree.JCForLoop tree) {
            super.visitForLoop(tree);
            this.complexity++;
        }

        @Override
        public void visitSwitch(JCTree.JCSwitch tree) {
            super.visitSwitch(tree);
            this.complexity += 5;
        }

        @Override
        public void visitCase(JCTree.JCCase tree) {
            super.visitCase(tree);
            this.complexity++;
        }

        @Override
        public void visitSynchronized(JCTree.JCSynchronized tree) {
            super.visitSynchronized(tree);
            this.complexity += 6;
        }

        @Override
        public void visitTry(JCTree.JCTry tree) {
            super.visitTry(tree);
            if (tree.finalizer != null) {
                this.complexity += 6;
            }
        }

        @Override
        public void visitCatch(JCTree.JCCatch tree) {
            super.visitCatch(tree);
            this.complexity += 2;
        }

        @Override
        public void visitConditional(JCTree.JCConditional tree) {
            super.visitConditional(tree);
            this.complexity += 2;
        }

        @Override
        public void visitIf(JCTree.JCIf tree) {
            super.visitIf(tree);
            this.complexity += 2;
        }

        @Override
        public void visitBreak(JCTree.JCBreak tree) {
            super.visitBreak(tree);
            this.complexity++;
        }

        @Override
        public void visitContinue(JCTree.JCContinue tree) {
            super.visitContinue(tree);
            this.complexity++;
        }

        @Override
        public void visitReturn(JCTree.JCReturn tree) {
            super.visitReturn(tree);
            this.complexity++;
        }

        @Override
        public void visitThrow(JCTree.JCThrow tree) {
            super.visitThrow(tree);
            this.complexity++;
        }

        @Override
        public void visitAssert(JCTree.JCAssert tree) {
            super.visitAssert(tree);
            this.complexity += 5;
        }

        @Override
        public void visitApply(JCTree.JCMethodInvocation tree) {
            super.visitApply(tree);
            this.complexity += 2;
        }

        @Override
        public void visitNewClass(JCTree.JCNewClass tree) {
            scan(tree.encl);
            scan(tree.args);
            this.complexity += 2;
        }

        @Override
        public void visitNewArray(JCTree.JCNewArray tree) {
            super.visitNewArray(tree);
            this.complexity += 5;
        }

        @Override
        public void visitAssign(JCTree.JCAssign tree) {
            super.visitAssign(tree);
            this.complexity++;
        }

        @Override
        public void visitAssignop(JCTree.JCAssignOp tree) {
            super.visitAssignop(tree);
            this.complexity += 2;
        }

        @Override
        public void visitUnary(JCTree.JCUnary tree) {
            this.complexity++;
            if (tree.type.constValue() == null) {
                super.visitUnary(tree);
            }
        }

        @Override
        public void visitBinary(JCTree.JCBinary tree) {
            this.complexity++;
            if (tree.type.constValue() == null) {
                super.visitBinary(tree);
            }
        }

        @Override
        public void visitTypeTest(JCTree.JCInstanceOf tree) {
            super.visitTypeTest(tree);
            this.complexity++;
        }

        @Override
        public void visitIndexed(JCTree.JCArrayAccess tree) {
            super.visitIndexed(tree);
            this.complexity++;
        }

        @Override
        public void visitSelect(JCTree.JCFieldAccess tree) {
            super.visitSelect(tree);
            if (tree.f542sym.kind == 4) {
                this.complexity++;
            }
        }

        @Override
        public void visitIdent(JCTree.JCIdent tree) {
            if (tree.f543sym.kind == 4) {
                this.complexity++;
                if (tree.type.constValue() == null && tree.f543sym.owner.kind == 2) {
                    this.complexity++;
                }
            }
        }

        @Override
        public void visitLiteral(JCTree.JCLiteral tree) {
            this.complexity++;
        }

        @Override
        public void visitTree(JCTree tree) {
        }

        @Override
        public void visitWildcard(JCTree.JCWildcard tree) {
            throw new AssertionError(getClass().getName());
        }
    }

    int estimateCodeComplexity(JCTree tree) {
        if (tree == null) {
            return 0;
        }
        C1ComplexityScanner scanner = new C1ComplexityScanner();
        tree.accept(scanner);
        return scanner.complexity;
    }

    @Override
    public void visitIf(JCTree.JCIf tree) {
        int limit = this.code.nextreg;
        Code.Chain thenExit = null;
        Items.CondItem c = genCond(TreeInfo.skipParens(tree.cond), 8);
        Code.Chain elseChain = c.jumpFalse();
        if (!c.isFalse()) {
            this.code.resolve(c.trueJumps);
            genStat(tree.thenpart, this.f441env, 17);
            thenExit = this.code.branch(ByteCodes.goto_);
        }
        if (elseChain != null) {
            this.code.resolve(elseChain);
            if (tree.elsepart != null) {
                genStat(tree.elsepart, this.f441env, 17);
            }
        }
        this.code.resolve(thenExit);
        this.code.endScopes(limit);
    }

    @Override
    public void visitExec(JCTree.JCExpressionStatement tree) {
        JCTree.JCExpression e = tree.expr;
        int tag = e.getTag();
        if (tag == 54) {
            ((JCTree.JCUnary) e).setTag(52);
        } else if (tag == 55) {
            ((JCTree.JCUnary) e).setTag(53);
        }
        genExpr(tree.expr, tree.expr.type).drop();
    }

    @Override
    public void visitBreak(JCTree.JCBreak tree) {
        Env<GenContext> targetEnv = unwind(tree.target, this.f441env);
        Assert.check(this.code.state.stacksize == 0);
        targetEnv.info.addExit(this.code.branch(ByteCodes.goto_));
        endFinalizerGaps(this.f441env, targetEnv);
    }

    @Override
    public void visitContinue(JCTree.JCContinue tree) {
        Env<GenContext> targetEnv = unwind(tree.target, this.f441env);
        Assert.check(this.code.state.stacksize == 0);
        targetEnv.info.addCont(this.code.branch(ByteCodes.goto_));
        endFinalizerGaps(this.f441env, targetEnv);
    }

    @Override
    public void visitReturn(JCTree.JCReturn tree) {
        Env<GenContext> targetEnv;
        int limit = this.code.nextreg;
        if (tree.expr != null) {
            Items.Item r = genExpr(tree.expr, this.f443pt).load();
            if (hasFinally(this.f441env.enclMethod, this.f441env)) {
                r = makeTemp(this.f443pt);
                r.store();
            }
            targetEnv = unwind(this.f441env.enclMethod, this.f441env);
            r.load();
            this.code.emitop0(Code.truncate(Code.typecode(this.f443pt)) + ByteCodes.ireturn);
        } else {
            targetEnv = unwind(this.f441env.enclMethod, this.f441env);
            this.code.emitop0(ByteCodes.return_);
        }
        endFinalizerGaps(this.f441env, targetEnv);
        this.code.endScopes(limit);
    }

    @Override
    public void visitThrow(JCTree.JCThrow tree) {
        genExpr(tree.expr, tree.expr.type).load();
        this.code.emitop0(ByteCodes.athrow);
    }

    @Override
    public void visitApply(JCTree.JCMethodInvocation tree) {
        Items.Item m = genExpr(tree.meth, this.methodType);
        genArgs(tree.args, TreeInfo.symbol(tree.meth).externalType(this.types).mo573getParameterTypes());
        this.result = m.invoke();
    }

    @Override
    public void visitConditional(JCTree.JCConditional tree) {
        Code.Chain thenExit = null;
        Items.CondItem c = genCond(tree.cond, 8);
        Code.Chain elseChain = c.jumpFalse();
        if (!c.isFalse()) {
            this.code.resolve(c.trueJumps);
            int startpc = this.genCrt ? this.code.curPc() : 0;
            genExpr(tree.truepart, this.f443pt).load();
            this.code.state.forceStackTop(tree.type);
            if (this.genCrt) {
                this.code.f434crt.m467put(tree.truepart, 16, startpc, this.code.curPc());
            }
            thenExit = this.code.branch(ByteCodes.goto_);
        }
        if (elseChain != null) {
            this.code.resolve(elseChain);
            int startpc2 = this.genCrt ? this.code.curPc() : 0;
            genExpr(tree.falsepart, this.f443pt).load();
            this.code.state.forceStackTop(tree.type);
            if (this.genCrt) {
                this.code.f434crt.m467put(tree.falsepart, 16, startpc2, this.code.curPc());
            }
        }
        this.code.resolve(thenExit);
        this.result = this.items.makeStackItem(this.f443pt);
    }

    @Override
    public void visitNewClass(JCTree.JCNewClass tree) {
        Assert.check(tree.encl == null && tree.f545def == null);
        this.code.emitop2(ByteCodes.new_, makeRef(tree.m489pos(), tree.type));
        this.code.emitop0(89);
        genArgs(tree.args, tree.constructor.externalType(this.types).mo573getParameterTypes());
        this.items.makeMemberItem(tree.constructor, true).invoke();
        this.result = this.items.makeStackItem(tree.type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void visitNewArray(JCTree.JCNewArray tree) {
        if (tree.elems != null) {
            Type elemtype = this.types.elemtype(tree.type);
            loadIntConst(tree.elems.length());
            Items.Item arr = makeNewArray(tree.m489pos(), tree.type, 1);
            int i = 0;
            for (List list = tree.elems; list.nonEmpty(); list = list.tail) {
                arr.duplicate();
                loadIntConst(i);
                i++;
                genExpr((JCTree) list.head, elemtype).load();
                this.items.makeIndexedItem(elemtype).store();
            }
            this.result = arr;
            return;
        }
        for (List list2 = tree.dims; list2.nonEmpty(); list2 = list2.tail) {
            genExpr((JCTree) list2.head, this.syms.intType).load();
        }
        this.result = makeNewArray(tree.m489pos(), tree.type, tree.dims.length());
    }

    Items.Item makeNewArray(JCDiagnostic.DiagnosticPosition pos, Type type, int ndims) {
        Type elemtype = this.types.elemtype(type);
        if (this.types.dimensions(type) > 255) {
            this.f442log.error(pos, "limit.dimensions", new Object[0]);
            this.nerrs++;
        }
        int elemcode = Code.arraycode(elemtype);
        if (elemcode == 0 || (elemcode == 1 && ndims == 1)) {
            this.code.emitAnewarray(makeRef(pos, elemtype), type);
        } else if (elemcode == 1) {
            this.code.emitMultianewarray(ndims, makeRef(pos, type), type);
        } else {
            this.code.emitNewarray(elemcode, type);
        }
        return this.items.makeStackItem(type);
    }

    @Override
    public void visitParens(JCTree.JCParens tree) {
        this.result = genExpr(tree.expr, tree.expr.type);
    }

    @Override
    public void visitAssign(JCTree.JCAssign tree) {
        Items.Item l = genExpr(tree.f532lhs, tree.f532lhs.type);
        genExpr(tree.f533rhs, tree.f532lhs.type).load();
        this.result = this.items.makeAssignItem(l);
    }

    @Override
    public void visitAssignop(JCTree.JCAssignOp tree) {
        Items.Item l;
        Symbol.OperatorSymbol operator = (Symbol.OperatorSymbol) tree.operator;
        if (operator.opcode == 256) {
            makeStringBuffer(tree.m489pos());
            l = genExpr(tree.f534lhs, tree.f534lhs.type);
            if (l.width() > 0) {
                this.code.emitop0(((l.width() - 1) * 3) + 90);
            }
            l.load();
            appendString(tree.f534lhs);
            appendStrings(tree.f535rhs);
            bufferToString(tree.m489pos());
        } else {
            l = genExpr(tree.f534lhs, tree.f534lhs.type);
            if ((tree.getTag() == 88 || tree.getTag() == 89) && (l instanceof Items.LocalItem) && tree.f534lhs.type.f344tag <= 4 && tree.f535rhs.type.f344tag <= 4 && tree.f535rhs.type.constValue() != null) {
                int ival = ((Number) tree.f535rhs.type.constValue()).intValue();
                if (tree.getTag() == 89) {
                    ival = -ival;
                }
                ((Items.LocalItem) l).incr(ival);
                this.result = l;
                return;
            }
            l.duplicate();
            l.coerce(operator.type.mo573getParameterTypes().head).load();
            completeBinop(tree.f534lhs, tree.f535rhs, operator).coerce(tree.f534lhs.type);
        }
        this.result = this.items.makeAssignItem(l);
    }

    @Override
    public void visitUnary(JCTree.JCUnary tree) {
        Symbol.OperatorSymbol operator = (Symbol.OperatorSymbol) tree.operator;
        if (tree.getTag() == 50) {
            this.result = genCond((JCTree) tree.f546arg, false).negate();
            return;
        }
        Items.Item od = genExpr(tree.f546arg, operator.type.mo573getParameterTypes().head);
        switch (tree.getTag()) {
            case 48:
                this.result = od.load();
                break;
            case 49:
                this.result = od.load();
                this.code.emitop0(operator.opcode);
                break;
            case 50:
            default:
                Assert.error();
                break;
            case 51:
                this.result = od.load();
                emitMinusOne(od.typecode);
                this.code.emitop0(operator.opcode);
                break;
            case 52:
            case 53:
                od.duplicate();
                if ((od instanceof Items.LocalItem) && (operator.opcode == 96 || operator.opcode == 100)) {
                    ((Items.LocalItem) od).incr(tree.getTag() != 52 ? -1 : 1);
                    this.result = od;
                } else {
                    od.load();
                    this.code.emitop0(m474one(od.typecode));
                    this.code.emitop0(operator.opcode);
                    if (od.typecode != 0 && Code.truncate(od.typecode) == 0) {
                        this.code.emitop0((od.typecode + ByteCodes.int2byte) - 5);
                    }
                    this.result = this.items.makeAssignItem(od);
                }
                break;
            case 54:
            case 55:
                od.duplicate();
                if ((od instanceof Items.LocalItem) && (operator.opcode == 96 || operator.opcode == 100)) {
                    Items.Item res = od.load();
                    ((Items.LocalItem) od).incr(tree.getTag() != 54 ? -1 : 1);
                    this.result = res;
                } else {
                    Items.Item res2 = od.load();
                    od.stash(od.typecode);
                    this.code.emitop0(m474one(od.typecode));
                    this.code.emitop0(operator.opcode);
                    if (od.typecode != 0 && Code.truncate(od.typecode) == 0) {
                        this.code.emitop0((od.typecode + ByteCodes.int2byte) - 5);
                    }
                    od.store();
                    this.result = res2;
                }
                break;
            case 56:
                this.result = od.load();
                this.code.emitop0(89);
                genNullCheck(tree.m489pos());
                break;
        }
    }

    private void genNullCheck(JCDiagnostic.DiagnosticPosition pos) {
        callMethod(pos, this.syms.objectType, this.names.getClass, List.m507nil(), false);
        this.code.emitop0(87);
    }

    @Override
    public void visitBinary(JCTree.JCBinary tree) {
        Symbol.OperatorSymbol operator = (Symbol.OperatorSymbol) tree.operator;
        if (operator.opcode == 256) {
            makeStringBuffer(tree.m489pos());
            appendStrings(tree);
            bufferToString(tree.m489pos());
            this.result = this.items.makeStackItem(this.syms.stringType);
            return;
        }
        if (tree.getTag() == 58) {
            Items.CondItem lcond = genCond(tree.f536lhs, 8);
            if (!lcond.isFalse()) {
                Code.Chain falseJumps = lcond.jumpFalse();
                this.code.resolve(lcond.trueJumps);
                Items.CondItem rcond = genCond(tree.f537rhs, 16);
                this.result = this.items.makeCondItem(rcond.opcode, rcond.trueJumps, Code.mergeChains(falseJumps, rcond.falseJumps));
                return;
            }
            this.result = lcond;
            return;
        }
        if (tree.getTag() == 57) {
            Items.CondItem lcond2 = genCond(tree.f536lhs, 8);
            if (!lcond2.isTrue()) {
                Code.Chain trueJumps = lcond2.jumpTrue();
                this.code.resolve(lcond2.falseJumps);
                Items.CondItem rcond2 = genCond(tree.f537rhs, 16);
                this.result = this.items.makeCondItem(rcond2.opcode, Code.mergeChains(trueJumps, rcond2.trueJumps), rcond2.falseJumps);
                return;
            }
            this.result = lcond2;
            return;
        }
        Items.Item od = genExpr(tree.f536lhs, operator.type.mo573getParameterTypes().head);
        od.load();
        this.result = completeBinop(tree.f536lhs, tree.f537rhs, operator);
    }

    void makeStringBuffer(JCDiagnostic.DiagnosticPosition pos) {
        this.code.emitop2(ByteCodes.new_, makeRef(pos, this.stringBufferType));
        this.code.emitop0(89);
        callMethod(pos, this.stringBufferType, this.names.init, List.m507nil(), false);
    }

    void appendString(JCTree tree) {
        Type t = tree.type.baseType();
        if (t.f344tag > 8 && t.tsym != this.syms.stringType.tsym) {
            t = this.syms.objectType;
        }
        this.items.makeMemberItem(getStringBufferAppend(tree, t), false).invoke();
    }

    Symbol getStringBufferAppend(JCTree tree, Type t) {
        Assert.checkNull(t.constValue());
        Symbol method = this.stringBufferAppend.get(t);
        if (method == null) {
            Symbol method2 = this.f444rs.resolveInternalMethod(tree.m489pos(), this.attrEnv, this.stringBufferType, this.names.append, List.m508of(t), null);
            this.stringBufferAppend.put(t, method2);
            return method2;
        }
        return method;
    }

    void appendStrings(JCTree tree) {
        JCTree tree2 = TreeInfo.skipParens(tree);
        if (tree2.getTag() == 71 && tree2.type.constValue() == null) {
            JCTree.JCBinary op = (JCTree.JCBinary) tree2;
            if (op.operator.kind == 16 && ((Symbol.OperatorSymbol) op.operator).opcode == 256) {
                appendStrings(op.f536lhs);
                appendStrings(op.f537rhs);
                return;
            }
        }
        genExpr(tree2, tree2.type).load();
        appendString(tree2);
    }

    void bufferToString(JCDiagnostic.DiagnosticPosition pos) {
        callMethod(pos, this.stringBufferType, this.names.toString, List.m507nil(), false);
    }

    Items.Item completeBinop(JCTree lhs, JCTree rhs, Symbol.OperatorSymbol operator) {
        Type.MethodType optype = (Type.MethodType) operator.type;
        int opcode = operator.opcode;
        if (opcode >= 159 && opcode <= 164 && (rhs.type.constValue() instanceof Number) && ((Number) rhs.type.constValue()).intValue() == 0) {
            opcode -= 6;
        } else if (opcode >= 165 && opcode <= 166 && TreeInfo.isNull(rhs)) {
            opcode += 33;
        } else {
            Type rtype = operator.erasure(this.types).mo573getParameterTypes().tail.head;
            if (opcode >= 270 && opcode <= 275) {
                opcode -= 150;
                rtype = this.syms.intType;
            }
            genExpr(rhs, rtype).load();
            if (opcode >= 512) {
                this.code.emitop0(opcode >> 9);
                opcode &= 255;
            }
        }
        if ((opcode >= 153 && opcode <= 166) || opcode == 198 || opcode == 199) {
            return this.items.makeCondItem(opcode);
        }
        this.code.emitop0(opcode);
        return this.items.makeStackItem(optype.restype);
    }

    @Override
    public void visitTypeCast(JCTree.JCTypeCast tree) {
        this.result = genExpr(tree.expr, tree.clazz.type).load();
        if (tree.clazz.type.f344tag > 8 && this.types.asSuper(tree.expr.type, tree.clazz.type.tsym) == null) {
            this.code.emitop2(ByteCodes.checkcast, makeRef(tree.m489pos(), tree.clazz.type));
        }
    }

    @Override
    public void visitWildcard(JCTree.JCWildcard tree) {
        throw new AssertionError(getClass().getName());
    }

    @Override
    public void visitTypeTest(JCTree.JCInstanceOf tree) {
        genExpr(tree.expr, tree.expr.type).load();
        this.code.emitop2(ByteCodes.instanceof_, makeRef(tree.m489pos(), tree.clazz.type));
        this.result = this.items.makeStackItem(this.syms.booleanType);
    }

    @Override
    public void visitIndexed(JCTree.JCArrayAccess tree) {
        genExpr(tree.indexed, tree.indexed.type).load();
        genExpr(tree.index, this.syms.intType).load();
        this.result = this.items.makeIndexedItem(tree.type);
    }

    @Override
    public void visitIdent(JCTree.JCIdent tree) {
        Items.Item res;
        Symbol sym = tree.f543sym;
        if (tree.name == this.names._this || tree.name == this.names._super) {
            if (tree.name == this.names._this) {
                res = this.items.makeThisItem();
            } else {
                res = this.items.makeSuperItem();
            }
            if (sym.kind == 16) {
                res.load();
                res = this.items.makeMemberItem(sym, true);
            }
            this.result = res;
            return;
        }
        if (sym.kind == 4 && sym.owner.kind == 16) {
            this.result = this.items.makeLocalItem((Symbol.VarSymbol) sym);
            return;
        }
        if ((sym.flags() & 8) != 0) {
            if (!isAccessSuper(this.f441env.enclMethod)) {
                sym = binaryQualifier(sym, this.f441env.enclClass.type);
            }
            this.result = this.items.makeStaticItem(sym);
        } else {
            this.items.makeThisItem().load();
            Symbol sym2 = binaryQualifier(sym, this.f441env.enclClass.type);
            this.result = this.items.makeMemberItem(sym2, (sym2.flags() & 2) != 0);
        }
    }

    @Override
    public void visitSelect(JCTree.JCFieldAccess tree) {
        Items.Item base;
        Symbol sym = tree.f542sym;
        if (tree.name == this.names._class) {
            Assert.check(this.target.hasClassLiterals());
            this.code.emitop2(19, makeRef(tree.m489pos(), tree.selected.type));
            this.result = this.items.makeStackItem(this.f443pt);
            return;
        }
        Symbol ssym = TreeInfo.symbol(tree.selected);
        boolean z = true;
        boolean selectSuper = ssym != null && (ssym.kind == 2 || ssym.name == this.names._super);
        boolean accessSuper = isAccessSuper(this.f441env.enclMethod);
        if (selectSuper) {
            base = this.items.makeSuperItem();
        } else {
            base = genExpr(tree.selected, tree.selected.type);
        }
        if (sym.kind == 4 && ((Symbol.VarSymbol) sym).getConstValue() != null) {
            if ((sym.flags() & 8) != 0) {
                if (!selectSuper && (ssym == null || ssym.kind != 2)) {
                    base = base.load();
                }
                base.drop();
            } else {
                base.load();
                genNullCheck(tree.selected.m489pos());
            }
            this.result = this.items.makeImmediateItem(sym.type, ((Symbol.VarSymbol) sym).getConstValue());
            return;
        }
        if (!accessSuper) {
            sym = binaryQualifier(sym, tree.selected.type);
        }
        if ((sym.flags() & 8) != 0) {
            if (!selectSuper && (ssym == null || ssym.kind != 2)) {
                base = base.load();
            }
            base.drop();
            this.result = this.items.makeStaticItem(sym);
            return;
        }
        base.load();
        if (sym == this.syms.lengthVar) {
            this.code.emitop0(ByteCodes.arraylength);
            this.result = this.items.makeStackItem(this.syms.intType);
            return;
        }
        Items items = this.items;
        if ((sym.flags() & 2) == 0 && !selectSuper && !accessSuper) {
            z = false;
        }
        this.result = items.makeMemberItem(sym, z);
    }

    @Override
    public void visitLiteral(JCTree.JCLiteral tree) {
        if (tree.type.f344tag == 17) {
            this.code.emitop0(1);
            if (this.types.dimensions(this.f443pt) > 1) {
                this.code.emitop2(ByteCodes.checkcast, makeRef(tree.m489pos(), this.f443pt));
                this.result = this.items.makeStackItem(this.f443pt);
                return;
            } else {
                this.result = this.items.makeStackItem(tree.type);
                return;
            }
        }
        this.result = this.items.makeImmediateItem(tree.type, tree.value);
    }

    @Override
    public void visitLetExpr(JCTree.LetExpr tree) {
        int limit = this.code.nextreg;
        genStats(tree.defs, this.f441env);
        this.result = genExpr(tree.expr, tree.expr.type).load();
        this.code.endScopes(limit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean genClass(Env<AttrContext> c0621Env, JCTree.JCClassDecl jCClassDecl) {
        try {
            this.attrEnv = c0621Env;
            Symbol.ClassSymbol classSymbol = jCClassDecl.f539sym;
            JCTree.JCCompilationUnit jCCompilationUnit = c0621Env.toplevel;
            this.toplevel = jCCompilationUnit;
            this.endPositions = jCCompilationUnit.endPositions;
            if (this.generateIproxies && (classSymbol.flags() & 1536) == 1024 && !this.allowGenerics) {
                implementInterfaceMethods(classSymbol);
            }
            jCClassDecl.defs = normalizeDefs(jCClassDecl.defs, classSymbol);
            classSymbol.pool = this.pool;
            this.pool.reset();
            Env<GenContext> c0621Env2 = new Env<>(jCClassDecl, new GenContext());
            c0621Env2.toplevel = c0621Env.toplevel;
            c0621Env2.enclClass = jCClassDecl;
            for (List list = jCClassDecl.defs; list.nonEmpty(); list = list.tail) {
                genDef((JCTree) list.head, c0621Env2);
            }
            if (this.pool.numEntries() > 65535) {
                this.f442log.error(jCClassDecl.m489pos(), "limit.pool", new Object[0]);
                this.nerrs++;
            }
            if (this.nerrs != 0) {
                for (List list2 = jCClassDecl.defs; list2.nonEmpty(); list2 = list2.tail) {
                    if (((JCTree) list2.head).getTag() == 4) {
                        ((JCTree.JCMethodDecl) list2.head).f544sym.code = null;
                    }
                }
            }
            jCClassDecl.defs = List.m507nil();
            return this.nerrs == 0;
        } finally {
            this.attrEnv = null;
            this.f441env = null;
            this.toplevel = null;
            this.endPositions = null;
            this.nerrs = 0;
        }
    }

    abstract class GenFinalizer {
        abstract void mo475gen();

        abstract void genLast();

        GenFinalizer() {
        }

        boolean hasFinalizer() {
            return true;
        }
    }

    static class GenContext {
        Code.Chain exit = null;
        Code.Chain cont = null;
        GenFinalizer finalize = null;
        boolean isSwitch = false;
        ListBuffer<Integer> gaps = null;

        GenContext() {
        }

        void addExit(Code.Chain c) {
            this.exit = Code.mergeChains(c, this.exit);
        }

        void addCont(Code.Chain c) {
            this.cont = Code.mergeChains(c, this.cont);
        }
    }
}
