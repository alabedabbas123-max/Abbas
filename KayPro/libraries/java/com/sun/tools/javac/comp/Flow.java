package com.sun.tools.javac.comp;

import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.code.Lint;
import com.sun.tools.javac.code.Scope;
import com.sun.tools.javac.code.Source;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Symtab;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.code.Types;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeInfo;
import com.sun.tools.javac.tree.TreeMaker;
import com.sun.tools.javac.tree.TreeScanner;
import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.Bits;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Names;
import java.util.HashMap;
import java.util.Iterator;

public class Flow extends TreeScanner {
    protected static final Context.C0723Key<Flow> flowKey = new Context.C0723Key<>();
    private boolean alive;
    private final boolean allowImprovedCatchAnalysis;
    private final boolean allowImprovedRethrowAnalysis;
    private Env<AttrContext> attrEnv;
    List<Type> caught;

    private final Check f371chk;
    JCTree.JCClassDecl classDef;
    int firstadr;
    Bits inits;
    Bits initsWhenFalse;
    Bits initsWhenTrue;
    private Lint lint;

    private final Log f372log;
    boolean loopPassTwo = false;
    private TreeMaker make;
    private final Names names;
    int nextadr;
    ListBuffer<PendingExit> pendingExits;
    HashMap<Symbol, List<Type>> preciseRethrowTypes;

    private final Resolve f373rs;
    private final Symtab syms;
    List<Type> thrown;
    private final Types types;
    Bits uninits;
    Bits uninitsTry;
    Bits uninitsWhenFalse;
    Bits uninitsWhenTrue;
    Scope unrefdResources;
    Symbol.VarSymbol[] vars;

    public static Flow instance(Context context) {
        Flow instance = (Flow) context.m501get(flowKey);
        if (instance == null) {
            return new Flow(context);
        }
        return instance;
    }

    protected Flow(Context context) {
        context.m504put(flowKey, this);
        this.names = Names.instance(context);
        this.f372log = Log.instance(context);
        this.syms = Symtab.instance(context);
        this.types = Types.instance(context);
        this.f371chk = Check.instance(context);
        this.lint = Lint.instance(context);
        this.f373rs = Resolve.instance(context);
        Source source = Source.instance(context);
        this.allowImprovedRethrowAnalysis = source.allowImprovedRethrowAnalysis();
        this.allowImprovedCatchAnalysis = source.allowImprovedCatchAnalysis();
    }

    static class PendingExit {
        Bits inits;
        Type thrown;
        JCTree tree;
        Bits uninits;

        PendingExit(JCTree tree, Bits inits, Bits uninits) {
            this.tree = tree;
            this.inits = inits.m499dup();
            this.uninits = uninits.m499dup();
        }

        PendingExit(JCTree tree, Type thrown) {
            this.tree = tree;
            this.thrown = thrown;
        }
    }

    void errorUncaught() {
        PendingExit exit = this.pendingExits.next();
        while (exit != null) {
            JCTree.JCClassDecl jCClassDecl = this.classDef;
            if (jCClassDecl != null && jCClassDecl.f531pos == exit.tree.f531pos) {
                this.f372log.error(exit.tree.m489pos(), "unreported.exception.default.constructor", exit.thrown);
            } else if (exit.tree.getTag() == 5 && ((JCTree.JCVariableDecl) exit.tree).f547sym.isResourceVariable()) {
                this.f372log.error(exit.tree.m489pos(), "unreported.exception.implicit.close", exit.thrown, ((JCTree.JCVariableDecl) exit.tree).f547sym.name);
            } else {
                this.f372log.error(exit.tree.m489pos(), "unreported.exception.need.to.catch.or.throw", exit.thrown);
            }
            PendingExit exit2 = this.pendingExits.next();
            exit = exit2;
        }
    }

    void markThrown(JCTree tree, Type exc) {
        if (!this.f371chk.isUnchecked(tree.m489pos(), exc)) {
            if (!this.f371chk.isHandled(exc, this.caught)) {
                this.pendingExits.append(new PendingExit(tree, exc));
            }
            this.thrown = this.f371chk.incl(exc, this.thrown);
        }
    }

    boolean trackable(Symbol.VarSymbol sym) {
        return sym.owner.kind == 16 || ((sym.flags() & 8590196752L) == 16 && this.classDef.f539sym.isEnclosedBy((Symbol.ClassSymbol) sym.owner));
    }

    void newVar(Symbol.VarSymbol sym) {
        int i = this.nextadr;
        Symbol.VarSymbol[] varSymbolArr = this.vars;
        if (i == varSymbolArr.length) {
            Symbol.VarSymbol[] newvars = new Symbol.VarSymbol[i * 2];
            System.arraycopy(varSymbolArr, 0, newvars, 0, i);
            this.vars = newvars;
        }
        sym.f341adr = this.nextadr;
        Symbol.VarSymbol[] varSymbolArr2 = this.vars;
        int i2 = this.nextadr;
        varSymbolArr2[i2] = sym;
        this.inits.excl(i2);
        this.uninits.incl(this.nextadr);
        this.nextadr++;
    }

    void letInit(JCDiagnostic.DiagnosticPosition pos, Symbol.VarSymbol sym) {
        if (sym.f341adr < this.firstadr || !trackable(sym)) {
            if ((sym.flags() & 16) != 0) {
                this.f372log.error(pos, "var.might.already.be.assigned", sym);
                return;
            }
            return;
        }
        if ((sym.flags() & 16) != 0) {
            if ((sym.flags() & Flags.PARAMETER) != 0) {
                if ((sym.flags() & Flags.UNION) != 0) {
                    this.f372log.error(pos, "multicatch.parameter.may.not.be.assigned", sym);
                } else {
                    this.f372log.error(pos, "final.parameter.may.not.be.assigned", sym);
                }
            } else if (!this.uninits.isMember(sym.f341adr)) {
                this.f372log.error(pos, this.loopPassTwo ? "var.might.be.assigned.in.loop" : "var.might.already.be.assigned", sym);
            } else if (!this.inits.isMember(sym.f341adr)) {
                this.uninits.excl(sym.f341adr);
                this.uninitsTry.excl(sym.f341adr);
            } else {
                this.uninits.excl(sym.f341adr);
            }
        }
        this.inits.incl(sym.f341adr);
    }

    void letInit(JCTree tree) {
        JCTree tree2 = TreeInfo.skipParens(tree);
        if (tree2.getTag() == 35 || tree2.getTag() == 34) {
            Symbol sym = TreeInfo.symbol(tree2);
            if (sym.kind == 4) {
                letInit(tree2.m489pos(), (Symbol.VarSymbol) sym);
            }
        }
    }

    void checkInit(JCDiagnostic.DiagnosticPosition pos, Symbol.VarSymbol sym) {
        if ((sym.f341adr >= this.firstadr || sym.owner.kind != 2) && trackable(sym) && !this.inits.isMember(sym.f341adr)) {
            this.f372log.error(pos, "var.might.not.have.been.initialized", sym);
            this.inits.incl(sym.f341adr);
        }
    }

    void recordExit(JCTree tree) {
        this.pendingExits.append(new PendingExit(tree, this.inits, this.uninits));
        markDead();
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean resolveBreaks(JCTree tree, ListBuffer<PendingExit> oldPendingExits) {
        boolean result = false;
        this.pendingExits = oldPendingExits;
        for (List list = this.pendingExits.toList(); list.nonEmpty(); list = list.tail) {
            PendingExit exit = (PendingExit) list.head;
            if (exit.tree.getTag() == 21 && ((JCTree.JCBreak) exit.tree).target == tree) {
                this.inits.andSet(exit.inits);
                this.uninits.andSet(exit.uninits);
                result = true;
            } else {
                this.pendingExits.append(exit);
            }
        }
        return result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean resolveContinues(JCTree tree) {
        boolean result = false;
        this.pendingExits = new ListBuffer<>();
        for (List list = this.pendingExits.toList(); list.nonEmpty(); list = list.tail) {
            PendingExit exit = (PendingExit) list.head;
            if (exit.tree.getTag() == 22 && ((JCTree.JCContinue) exit.tree).target == tree) {
                this.inits.andSet(exit.inits);
                this.uninits.andSet(exit.uninits);
                result = true;
            } else {
                this.pendingExits.append(exit);
            }
        }
        return result;
    }

    void markDead() {
        this.inits.inclRange(this.firstadr, this.nextadr);
        this.uninits.inclRange(this.firstadr, this.nextadr);
        this.alive = false;
    }

    void split(boolean setToNull) {
        this.initsWhenFalse = this.inits.m499dup();
        this.uninitsWhenFalse = this.uninits.m499dup();
        this.initsWhenTrue = this.inits;
        this.uninitsWhenTrue = this.uninits;
        if (setToNull) {
            this.uninits = null;
            this.inits = null;
        }
    }

    void merge() {
        this.inits = this.initsWhenFalse.andSet(this.initsWhenTrue);
        this.uninits = this.uninitsWhenFalse.andSet(this.uninitsWhenTrue);
    }

    void scanDef(JCTree tree) {
        scanStat(tree);
        if (tree != null && tree.getTag() == 7 && !this.alive) {
            this.f372log.error(tree.m489pos(), "initializer.must.be.able.to.complete.normally", new Object[0]);
        }
    }

    void scanStat(JCTree tree) {
        if (!this.alive && tree != null) {
            this.f372log.error(tree.m489pos(), "unreachable.stmt", new Object[0]);
            if (tree.getTag() != 6) {
                this.alive = true;
            }
        }
        scan(tree);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void scanStats(List<? extends JCTree.JCStatement> trees) {
        if (trees != null) {
            for (List list = trees; list.nonEmpty(); list = list.tail) {
                scanStat((JCTree) list.head);
            }
        }
    }

    void scanExpr(JCTree tree) {
        if (tree != null) {
            scan(tree);
            if (this.inits == null) {
                merge();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void scanExprs(List<? extends JCTree.JCExpression> trees) {
        if (trees != null) {
            for (List list = trees; list.nonEmpty(); list = list.tail) {
                scanExpr((JCTree) list.head);
            }
        }
    }

    void scanCond(JCTree tree) {
        if (tree.type.isFalse()) {
            if (this.inits == null) {
                merge();
            }
            Bits bitsM499dup = this.inits.m499dup();
            this.initsWhenTrue = bitsM499dup;
            bitsM499dup.inclRange(this.firstadr, this.nextadr);
            Bits bitsM499dup2 = this.uninits.m499dup();
            this.uninitsWhenTrue = bitsM499dup2;
            bitsM499dup2.inclRange(this.firstadr, this.nextadr);
            this.initsWhenFalse = this.inits;
            this.uninitsWhenFalse = this.uninits;
        } else if (tree.type.isTrue()) {
            if (this.inits == null) {
                merge();
            }
            Bits bitsM499dup3 = this.inits.m499dup();
            this.initsWhenFalse = bitsM499dup3;
            bitsM499dup3.inclRange(this.firstadr, this.nextadr);
            Bits bitsM499dup4 = this.uninits.m499dup();
            this.uninitsWhenFalse = bitsM499dup4;
            bitsM499dup4.inclRange(this.firstadr, this.nextadr);
            this.initsWhenTrue = this.inits;
            this.uninitsWhenTrue = this.uninits;
        } else {
            scan(tree);
            if (this.inits != null) {
                split(tree.type != this.syms.unknownType);
            }
        }
        if (tree.type != this.syms.unknownType) {
            this.uninits = null;
            this.inits = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void visitClassDef(JCTree.JCClassDecl tree) {
        if (tree.f539sym == null) {
            return;
        }
        JCTree.JCClassDecl classDefPrev = this.classDef;
        List<Type> thrownPrev = this.thrown;
        List<Type> caughtPrev = this.caught;
        boolean alivePrev = this.alive;
        int firstadrPrev = this.firstadr;
        int nextadrPrev = this.nextadr;
        ListBuffer<PendingExit> pendingExitsPrev = this.pendingExits;
        Lint lintPrev = this.lint;
        this.pendingExits = new ListBuffer<>();
        if (tree.name != this.names.empty) {
            this.caught = List.m507nil();
            this.firstadr = this.nextadr;
        }
        this.classDef = tree;
        this.thrown = List.m507nil();
        this.lint = this.lint.augment(tree.f539sym.attributes_field);
        try {
            for (List list = tree.defs; list.nonEmpty(); list = list.tail) {
                if (((JCTree) list.head).getTag() == 5) {
                    JCTree.JCVariableDecl def = (JCTree.JCVariableDecl) list.head;
                    if ((def.mods.flags & 8) != 0) {
                        Symbol.VarSymbol sym = def.f547sym;
                        if (trackable(sym)) {
                            newVar(sym);
                        }
                    }
                }
            }
            for (List list2 = tree.defs; list2.nonEmpty(); list2 = list2.tail) {
                if (((JCTree) list2.head).getTag() != 4 && (TreeInfo.flags((JCTree) list2.head) & 8) != 0) {
                    scanDef((JCTree) list2.head);
                    errorUncaught();
                }
            }
            if (tree.name != this.names.empty) {
                boolean firstConstructor = true;
                for (List list3 = tree.defs; list3.nonEmpty(); list3 = list3.tail) {
                    if (TreeInfo.isInitialConstructor((JCTree) list3.head)) {
                        List<Type> mthrown = ((JCTree.JCMethodDecl) list3.head).f544sym.type.mo575getThrownTypes();
                        if (!firstConstructor) {
                            this.caught = this.f371chk.intersect(mthrown, this.caught);
                        } else {
                            this.caught = mthrown;
                            firstConstructor = false;
                        }
                    }
                }
            }
            for (List list4 = tree.defs; list4.nonEmpty(); list4 = list4.tail) {
                if (((JCTree) list4.head).getTag() == 5) {
                    JCTree.JCVariableDecl def2 = (JCTree.JCVariableDecl) list4.head;
                    if ((def2.mods.flags & 8) == 0) {
                        Symbol.VarSymbol sym2 = def2.f547sym;
                        if (trackable(sym2)) {
                            newVar(sym2);
                        }
                    }
                }
            }
            for (List list5 = tree.defs; list5.nonEmpty(); list5 = list5.tail) {
                if (((JCTree) list5.head).getTag() != 4 && (TreeInfo.flags((JCTree) list5.head) & 8) == 0) {
                    scanDef((JCTree) list5.head);
                    errorUncaught();
                }
            }
            if (tree.name == this.names.empty) {
                for (List list6 = tree.defs; list6.nonEmpty(); list6 = list6.tail) {
                    if (TreeInfo.isInitialConstructor((JCTree) list6.head)) {
                        JCTree.JCMethodDecl mdef = (JCTree.JCMethodDecl) list6.head;
                        mdef.thrown = this.make.Types(this.thrown);
                        mdef.f544sym.type = this.types.createMethodTypeWithThrown(mdef.f544sym.type, this.thrown);
                    }
                }
                thrownPrev = this.f371chk.union(this.thrown, thrownPrev);
            }
            for (List list7 = tree.defs; list7.nonEmpty(); list7 = list7.tail) {
                if (((JCTree) list7.head).getTag() == 4) {
                    scan((JCTree) list7.head);
                    errorUncaught();
                }
            }
            this.thrown = thrownPrev;
        } finally {
            this.pendingExits = pendingExitsPrev;
            this.alive = alivePrev;
            this.nextadr = nextadrPrev;
            this.firstadr = firstadrPrev;
            this.caught = caughtPrev;
            this.classDef = classDefPrev;
            this.lint = lintPrev;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void visitMethodDef(JCTree.JCMethodDecl tree) {
        if (tree.body == null) {
            return;
        }
        List<Type> caughtPrev = this.caught;
        List<Type> mthrown = tree.f544sym.type.mo575getThrownTypes();
        Bits initsPrev = this.inits.m499dup();
        Bits uninitsPrev = this.uninits.m499dup();
        int nextadrPrev = this.nextadr;
        int firstadrPrev = this.firstadr;
        Lint lintPrev = this.lint;
        this.lint = this.lint.augment(tree.f544sym.attributes_field);
        Assert.check(this.pendingExits.isEmpty());
        try {
            boolean isInitialConstructor = TreeInfo.isInitialConstructor(tree);
            if (!isInitialConstructor) {
                this.firstadr = this.nextadr;
            }
            for (List list = tree.params; list.nonEmpty(); list = list.tail) {
                JCTree.JCVariableDecl def = (JCTree.JCVariableDecl) list.head;
                scan(def);
                this.inits.incl(def.f547sym.f341adr);
                this.uninits.excl(def.f547sym.f341adr);
            }
            if (isInitialConstructor) {
                this.caught = this.f371chk.union(this.caught, mthrown);
            } else if ((tree.f544sym.flags() & 1048584) != 1048576) {
                this.caught = mthrown;
            }
            this.alive = true;
            scanStat(tree.body);
            if (this.alive && tree.f544sym.type.mo574getReturnType().f344tag != 9) {
                this.f372log.error(TreeInfo.diagEndPos(tree.body), "missing.ret.stmt", new Object[0]);
            }
            if (isInitialConstructor) {
                for (int i = this.firstadr; i < this.nextadr; i++) {
                    if (this.vars[i].owner == this.classDef.f539sym) {
                        checkInit(TreeInfo.diagEndPos(tree.body), this.vars[i]);
                    }
                }
            }
            List list2 = this.pendingExits.toList();
            this.pendingExits = new ListBuffer<>();
            while (list2.nonEmpty()) {
                PendingExit exit = (PendingExit) list2.head;
                list2 = list2.tail;
                if (exit.thrown == null) {
                    Assert.check(exit.tree.getTag() == 23);
                    if (isInitialConstructor) {
                        this.inits = exit.inits;
                        for (int i2 = this.firstadr; i2 < this.nextadr; i2++) {
                            checkInit(exit.tree.m489pos(), this.vars[i2]);
                        }
                    }
                } else {
                    this.pendingExits.append(exit);
                }
            }
        } finally {
            this.inits = initsPrev;
            this.uninits = uninitsPrev;
            this.nextadr = nextadrPrev;
            this.firstadr = firstadrPrev;
            this.caught = caughtPrev;
            this.lint = lintPrev;
        }
    }

    @Override
    public void visitVarDef(JCTree.JCVariableDecl tree) {
        boolean track = trackable(tree.f547sym);
        if (track && tree.f547sym.owner.kind == 16) {
            newVar(tree.f547sym);
        }
        if (tree.init != null) {
            Lint lintPrev = this.lint;
            this.lint = this.lint.augment(tree.f547sym.attributes_field);
            try {
                scanExpr(tree.init);
                if (track) {
                    letInit(tree.m489pos(), tree.f547sym);
                }
            } finally {
                this.lint = lintPrev;
            }
        }
    }

    @Override
    public void visitBlock(JCTree.JCBlock tree) {
        int nextadrPrev = this.nextadr;
        scanStats(tree.stats);
        this.nextadr = nextadrPrev;
    }

    @Override
    public void visitDoLoop(JCTree.JCDoWhileLoop tree) {
        ListBuffer<PendingExit> prevPendingExits = this.pendingExits;
        boolean prevLoopPassTwo = this.loopPassTwo;
        this.pendingExits = new ListBuffer<>();
        int prevErrors = this.f372log.nerrors;
        while (true) {
            Bits uninitsEntry = this.uninits.m499dup();
            uninitsEntry.excludeFrom(this.nextadr);
            scanStat(tree.body);
            this.alive |= resolveContinues(tree);
            scanCond(tree.cond);
            if (this.f372log.nerrors != prevErrors || this.loopPassTwo || uninitsEntry.m499dup().diffSet(this.uninitsWhenTrue).nextBit(this.firstadr) == -1) {
                break;
            }
            this.inits = this.initsWhenTrue;
            this.uninits = uninitsEntry.andSet(this.uninitsWhenTrue);
            this.loopPassTwo = true;
            this.alive = true;
        }
        this.loopPassTwo = prevLoopPassTwo;
        this.inits = this.initsWhenFalse;
        this.uninits = this.uninitsWhenFalse;
        boolean z = this.alive && !tree.cond.type.isTrue();
        this.alive = z;
        this.alive = resolveBreaks(tree, prevPendingExits) | z;
    }

    @Override
    public void visitWhileLoop(JCTree.JCWhileLoop tree) {
        Bits initsCond;
        Bits uninitsCond;
        boolean z;
        ListBuffer<PendingExit> prevPendingExits = this.pendingExits;
        boolean prevLoopPassTwo = this.loopPassTwo;
        this.pendingExits = new ListBuffer<>();
        int prevErrors = this.f372log.nerrors;
        while (true) {
            Bits uninitsEntry = this.uninits.m499dup();
            uninitsEntry.excludeFrom(this.nextadr);
            scanCond(tree.cond);
            initsCond = this.initsWhenFalse;
            uninitsCond = this.uninitsWhenFalse;
            this.inits = this.initsWhenTrue;
            this.uninits = this.uninitsWhenTrue;
            z = true;
            this.alive = !tree.cond.type.isFalse();
            scanStat(tree.body);
            this.alive |= resolveContinues(tree);
            if (this.f372log.nerrors != prevErrors || this.loopPassTwo || uninitsEntry.m499dup().diffSet(this.uninits).nextBit(this.firstadr) == -1) {
                break;
            }
            this.uninits = uninitsEntry.andSet(this.uninits);
            this.loopPassTwo = true;
            this.alive = true;
        }
        this.loopPassTwo = prevLoopPassTwo;
        this.inits = initsCond;
        this.uninits = uninitsCond;
        if (!resolveBreaks(tree, prevPendingExits) && tree.cond.type.isTrue()) {
            z = false;
        }
        this.alive = z;
    }

    @Override
    public void visitForLoop(JCTree.JCForLoop tree) {
        boolean z;
        Bits initsCond;
        Bits uninitsCond;
        ListBuffer<PendingExit> prevPendingExits = this.pendingExits;
        boolean prevLoopPassTwo = this.loopPassTwo;
        int nextadrPrev = this.nextadr;
        scanStats(tree.init);
        this.pendingExits = new ListBuffer<>();
        int prevErrors = this.f372log.nerrors;
        while (true) {
            Bits uninitsEntry = this.uninits.m499dup();
            uninitsEntry.excludeFrom(this.nextadr);
            z = true;
            if (tree.cond != null) {
                scanCond(tree.cond);
                initsCond = this.initsWhenFalse;
                uninitsCond = this.uninitsWhenFalse;
                this.inits = this.initsWhenTrue;
                this.uninits = this.uninitsWhenTrue;
                this.alive = !tree.cond.type.isFalse();
            } else {
                initsCond = this.inits.m499dup();
                initsCond.inclRange(this.firstadr, this.nextadr);
                uninitsCond = this.uninits.m499dup();
                uninitsCond.inclRange(this.firstadr, this.nextadr);
                this.alive = true;
            }
            scanStat(tree.body);
            this.alive |= resolveContinues(tree);
            scan(tree.step);
            if (this.f372log.nerrors != prevErrors || this.loopPassTwo || uninitsEntry.m499dup().diffSet(this.uninits).nextBit(this.firstadr) == -1) {
                break;
            }
            this.uninits = uninitsEntry.andSet(this.uninits);
            this.loopPassTwo = true;
            this.alive = true;
        }
        this.loopPassTwo = prevLoopPassTwo;
        this.inits = initsCond;
        this.uninits = uninitsCond;
        if (!resolveBreaks(tree, prevPendingExits) && (tree.cond == null || tree.cond.type.isTrue())) {
            z = false;
        }
        this.alive = z;
        this.nextadr = nextadrPrev;
    }

    @Override
    public void visitForeachLoop(JCTree.JCEnhancedForLoop tree) {
        visitVarDef(tree.f541var);
        ListBuffer<PendingExit> prevPendingExits = this.pendingExits;
        boolean prevLoopPassTwo = this.loopPassTwo;
        int nextadrPrev = this.nextadr;
        scan(tree.expr);
        Bits initsStart = this.inits.m499dup();
        Bits uninitsStart = this.uninits.m499dup();
        letInit(tree.m489pos(), tree.f541var.f547sym);
        this.pendingExits = new ListBuffer<>();
        int prevErrors = this.f372log.nerrors;
        while (true) {
            Bits uninitsEntry = this.uninits.m499dup();
            uninitsEntry.excludeFrom(this.nextadr);
            scanStat(tree.body);
            this.alive |= resolveContinues(tree);
            if (this.f372log.nerrors != prevErrors || this.loopPassTwo || uninitsEntry.m499dup().diffSet(this.uninits).nextBit(this.firstadr) == -1) {
                break;
            }
            this.uninits = uninitsEntry.andSet(this.uninits);
            this.loopPassTwo = true;
            this.alive = true;
        }
        this.loopPassTwo = prevLoopPassTwo;
        this.inits = initsStart;
        this.uninits = uninitsStart.andSet(this.uninits);
        resolveBreaks(tree, prevPendingExits);
        this.alive = true;
        this.nextadr = nextadrPrev;
    }

    @Override
    public void visitLabelled(JCTree.JCLabeledStatement tree) {
        ListBuffer<PendingExit> prevPendingExits = this.pendingExits;
        this.pendingExits = new ListBuffer<>();
        scanStat(tree.body);
        this.alive |= resolveBreaks(tree, prevPendingExits);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void visitSwitch(JCTree.JCSwitch tree) {
        ListBuffer<PendingExit> prevPendingExits = this.pendingExits;
        this.pendingExits = new ListBuffer<>();
        int nextadrPrev = this.nextadr;
        scanExpr(tree.selector);
        Bits initsSwitch = this.inits;
        Bits uninitsSwitch = this.uninits.m499dup();
        boolean hasDefault = false;
        for (List list = tree.cases; list.nonEmpty(); list = list.tail) {
            this.alive = true;
            this.inits = initsSwitch.m499dup();
            this.uninits = this.uninits.andSet(uninitsSwitch);
            JCTree.JCCase c = (JCTree.JCCase) list.head;
            if (c.f538pat == null) {
                hasDefault = true;
            } else {
                scanExpr(c.f538pat);
            }
            scanStats(c.stats);
            addVars(c.stats, initsSwitch, uninitsSwitch);
            if (!this.loopPassTwo && this.alive && this.lint.isEnabled(Lint.LintCategory.FALLTHROUGH) && c.stats.nonEmpty() && list.tail.nonEmpty()) {
                this.f372log.warning(Lint.LintCategory.FALLTHROUGH, ((JCTree.JCCase) list.tail.head).m489pos(), "possible.fall-through.into.case", new Object[0]);
            }
        }
        if (!hasDefault) {
            this.inits.andSet(initsSwitch);
            this.alive = true;
        }
        this.alive |= resolveBreaks(tree, prevPendingExits);
        this.nextadr = nextadrPrev;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void addVars(List<JCTree.JCStatement> list, Bits bits, Bits bits2) {
        for (List list2 = list; list2.nonEmpty(); list2 = list2.tail) {
            JCTree jCTree = (JCTree) list2.head;
            if (jCTree.getTag() == 5) {
                int i = ((JCTree.JCVariableDecl) jCTree).f547sym.f341adr;
                bits.excl(i);
                bits2.incl(i);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void visitTry(JCTree.JCTry tree) {
        List<Type> thrownInTry;
        boolean aliveEnd;
        List<JCTree.JCExpression> subClauses;
        List<Type> listM508of;
        Iterator<JCTree> it;
        JCTree resource;
        List<JCTree.JCExpression> subClauses2;
        List<Type> caughtPrev = this.caught;
        List<Type> thrownPrev = this.thrown;
        this.thrown = List.m507nil();
        for (List list = tree.catchers; list.nonEmpty(); list = list.tail) {
            if (TreeInfo.isMultiCatch((JCTree.JCCatch) list.head)) {
                subClauses2 = ((JCTree.JCTypeUnion) ((JCTree.JCCatch) list.head).param.vartype).alternatives;
            } else {
                subClauses2 = List.m508of(((JCTree.JCCatch) list.head).param.vartype);
            }
            for (JCTree.JCExpression ct : subClauses2) {
                this.caught = this.f371chk.incl(ct.type, this.caught);
            }
        }
        ListBuffer<JCTree.JCVariableDecl> resourceVarDecls = ListBuffer.m512lb();
        Bits uninitsTryPrev = this.uninitsTry;
        ListBuffer<PendingExit> prevPendingExits = this.pendingExits;
        this.pendingExits = new ListBuffer<>();
        Bits initsTry = this.inits.m499dup();
        this.uninitsTry = this.uninits.m499dup();
        for (JCTree resource2 : tree.resources) {
            if (resource2 instanceof JCTree.JCVariableDecl) {
                JCTree.JCVariableDecl vdecl = (JCTree.JCVariableDecl) resource2;
                visitVarDef(vdecl);
                this.unrefdResources.enter(vdecl.f547sym);
                resourceVarDecls.append(vdecl);
            } else if (resource2 instanceof JCTree.JCExpression) {
                scanExpr((JCTree.JCExpression) resource2);
            } else {
                throw new AssertionError(tree);
            }
        }
        Iterator<JCTree> it2 = tree.resources.iterator();
        while (it2.hasNext()) {
            JCTree resource3 = it2.next();
            if (resource3.type.isCompound()) {
                listM508of = this.types.interfaces(resource3.type).prepend(this.types.supertype(resource3.type));
            } else {
                listM508of = List.m508of(resource3.type);
            }
            List<Type> closeableSupertypes = listM508of;
            for (Type sup : closeableSupertypes) {
                if (this.types.asSuper(sup, this.syms.autoCloseableType.tsym) != null) {
                    it = it2;
                    resource = resource3;
                    Symbol closeMethod = this.f373rs.resolveQualifiedMethod(tree, this.attrEnv, sup, this.names.close, List.m507nil(), List.m507nil());
                    if (closeMethod.kind == 16) {
                        for (Type t : ((Symbol.MethodSymbol) closeMethod).getThrownTypes()) {
                            markThrown(resource, t);
                        }
                    }
                } else {
                    it = it2;
                    resource = resource3;
                }
                resource3 = resource;
                it2 = it;
            }
            it2 = it2;
        }
        scanStat(tree.body);
        if (this.allowImprovedCatchAnalysis) {
            thrownInTry = this.f371chk.union(this.thrown, List.m509of(this.syms.runtimeExceptionType, this.syms.errorType));
        } else {
            thrownInTry = this.thrown;
        }
        this.thrown = thrownPrev;
        this.caught = caughtPrev;
        boolean aliveEnd2 = this.alive;
        this.uninitsTry.andSet(this.uninits);
        Bits initsEnd = this.inits;
        Bits uninitsEnd = this.uninits;
        int nextadrCatch = this.nextadr;
        if (resourceVarDecls.isEmpty() || !this.lint.isEnabled(Lint.LintCategory.TRY)) {
            aliveEnd = aliveEnd2;
        } else {
            Iterator<JCTree.JCVariableDecl> it3 = resourceVarDecls.iterator();
            while (it3.hasNext()) {
                JCTree.JCVariableDecl resVar = it3.next();
                boolean aliveEnd3 = aliveEnd2;
                if (this.unrefdResources.includes(resVar.f547sym)) {
                    this.f372log.warning(Lint.LintCategory.TRY, resVar.m489pos(), "try.resource.not.referenced", resVar.f547sym);
                    this.unrefdResources.remove(resVar.f547sym);
                }
                aliveEnd2 = aliveEnd3;
                it3 = it3;
                caughtPrev = caughtPrev;
                resourceVarDecls = resourceVarDecls;
            }
            aliveEnd = aliveEnd2;
        }
        List<Type> caughtInTry = List.m507nil();
        List list2 = tree.catchers;
        boolean aliveEnd4 = aliveEnd;
        while (list2.nonEmpty()) {
            this.alive = true;
            JCTree.JCVariableDecl param = ((JCTree.JCCatch) list2.head).param;
            if (TreeInfo.isMultiCatch((JCTree.JCCatch) list2.head)) {
                subClauses = ((JCTree.JCTypeUnion) ((JCTree.JCCatch) list2.head).param.vartype).alternatives;
            } else {
                subClauses = List.m508of(((JCTree.JCCatch) list2.head).param.vartype);
            }
            List<Type> ctypes = List.m507nil();
            List<Type> rethrownTypes = this.f371chk.diff(thrownInTry, caughtInTry);
            List<Type> ctypes2 = ctypes;
            for (JCTree.JCExpression ct2 : subClauses) {
                uninitsTryPrev = uninitsTryPrev;
                thrownPrev = thrownPrev;
                Type exc = ct2.type;
                if (exc != this.syms.unknownType) {
                    List<Type> ctypes3 = ctypes2.append(exc);
                    if (this.types.isSameType(exc, this.syms.objectType)) {
                        ctypes2 = ctypes3;
                    } else {
                        checkCaughtType(((JCTree.JCCatch) list2.head).m489pos(), exc, thrownInTry, caughtInTry);
                        caughtInTry = this.f371chk.incl(exc, caughtInTry);
                        ctypes2 = ctypes3;
                    }
                }
            }
            this.inits = initsTry.m499dup();
            this.uninits = this.uninitsTry.m499dup();
            scan(param);
            this.inits.incl(param.f547sym.f341adr);
            this.uninits.excl(param.f547sym.f341adr);
            this.preciseRethrowTypes.put(param.f547sym, this.f371chk.intersect(ctypes2, rethrownTypes));
            scanStat(((JCTree.JCCatch) list2.head).body);
            initsEnd.andSet(this.inits);
            uninitsEnd.andSet(this.uninits);
            this.nextadr = nextadrCatch;
            this.preciseRethrowTypes.remove(param.f547sym);
            aliveEnd4 |= this.alive;
            list2 = list2.tail;
            caughtInTry = caughtInTry;
            thrownPrev = thrownPrev;
            uninitsTryPrev = uninitsTryPrev;
        }
        List<Type> thrownPrev2 = thrownPrev;
        Bits uninitsTryPrev2 = uninitsTryPrev;
        if (tree.finalizer == null) {
            Check check = this.f371chk;
            this.thrown = check.union(this.thrown, check.diff(thrownInTry, caughtInTry));
            this.inits = initsEnd;
            this.uninits = uninitsEnd;
            this.alive = aliveEnd4;
            ListBuffer<PendingExit> exits = this.pendingExits;
            this.pendingExits = prevPendingExits;
            while (exits.nonEmpty()) {
                this.pendingExits.append(exits.next());
            }
        } else {
            List<Type> savedThrown = this.thrown;
            this.thrown = List.m507nil();
            this.inits = initsTry.m499dup();
            this.uninits = this.uninitsTry.m499dup();
            ListBuffer<PendingExit> exits2 = this.pendingExits;
            this.pendingExits = prevPendingExits;
            this.alive = true;
            scanStat(tree.finalizer);
            if (!this.alive) {
                this.thrown = this.f371chk.union(this.thrown, thrownPrev2);
                if (!this.loopPassTwo && this.lint.isEnabled(Lint.LintCategory.FINALLY)) {
                    this.f372log.warning(Lint.LintCategory.FINALLY, TreeInfo.diagEndPos(tree.finalizer), "finally.cannot.complete", new Object[0]);
                }
            } else {
                Check check2 = this.f371chk;
                List<Type> listUnion = check2.union(this.thrown, check2.diff(thrownInTry, caughtInTry));
                this.thrown = listUnion;
                this.thrown = this.f371chk.union(listUnion, savedThrown);
                this.uninits.andSet(uninitsEnd);
                while (exits2.nonEmpty()) {
                    PendingExit exit = exits2.next();
                    if (exit.inits != null) {
                        exit.inits.orSet(this.inits);
                        exit.uninits.andSet(this.uninits);
                    }
                    this.pendingExits.append(exit);
                }
                this.inits.orSet(initsEnd);
                this.alive = aliveEnd4;
            }
        }
        this.uninitsTry.andSet(uninitsTryPrev2).andSet(this.uninits);
    }

    void checkCaughtType(JCDiagnostic.DiagnosticPosition pos, Type exc, List<Type> thrownInTry, List<Type> caughtInTry) {
        String key;
        if (this.f371chk.subset(exc, caughtInTry)) {
            this.f372log.error(pos, "except.already.caught", exc);
            return;
        }
        if (!this.f371chk.isUnchecked(pos, exc) && !isExceptionOrThrowable(exc) && !this.f371chk.intersects(exc, thrownInTry)) {
            this.f372log.error(pos, "except.never.thrown.in.try", exc);
            return;
        }
        if (this.allowImprovedCatchAnalysis) {
            List<Type> catchableThrownTypes = this.f371chk.intersect(List.m508of(exc), thrownInTry);
            if (this.f371chk.diff(catchableThrownTypes, caughtInTry).isEmpty() && !isExceptionOrThrowable(exc)) {
                if (catchableThrownTypes.length() == 1) {
                    key = "unreachable.catch";
                } else {
                    key = "unreachable.catch.1";
                }
                this.f372log.warning(pos, key, catchableThrownTypes);
            }
        }
    }

    private boolean isExceptionOrThrowable(Type exc) {
        return exc.tsym == this.syms.throwableType.tsym || exc.tsym == this.syms.exceptionType.tsym;
    }

    @Override
    public void visitConditional(JCTree.JCConditional tree) {
        scanCond(tree.cond);
        Bits initsBeforeElse = this.initsWhenFalse;
        Bits uninitsBeforeElse = this.uninitsWhenFalse;
        this.inits = this.initsWhenTrue;
        this.uninits = this.uninitsWhenTrue;
        if (tree.truepart.type.f344tag == 8 && tree.falsepart.type.f344tag == 8) {
            scanCond(tree.truepart);
            Bits initsAfterThenWhenTrue = this.initsWhenTrue.m499dup();
            Bits initsAfterThenWhenFalse = this.initsWhenFalse.m499dup();
            Bits uninitsAfterThenWhenTrue = this.uninitsWhenTrue.m499dup();
            Bits uninitsAfterThenWhenFalse = this.uninitsWhenFalse.m499dup();
            this.inits = initsBeforeElse;
            this.uninits = uninitsBeforeElse;
            scanCond(tree.falsepart);
            this.initsWhenTrue.andSet(initsAfterThenWhenTrue);
            this.initsWhenFalse.andSet(initsAfterThenWhenFalse);
            this.uninitsWhenTrue.andSet(uninitsAfterThenWhenTrue);
            this.uninitsWhenFalse.andSet(uninitsAfterThenWhenFalse);
            return;
        }
        scanExpr(tree.truepart);
        Bits initsAfterThen = this.inits.m499dup();
        Bits uninitsAfterThen = this.uninits.m499dup();
        this.inits = initsBeforeElse;
        this.uninits = uninitsBeforeElse;
        scanExpr(tree.falsepart);
        this.inits.andSet(initsAfterThen);
        this.uninits.andSet(uninitsAfterThen);
    }

    @Override
    public void visitIf(JCTree.JCIf tree) {
        scanCond(tree.cond);
        Bits initsBeforeElse = this.initsWhenFalse;
        Bits uninitsBeforeElse = this.uninitsWhenFalse;
        this.inits = this.initsWhenTrue;
        this.uninits = this.uninitsWhenTrue;
        scanStat(tree.thenpart);
        if (tree.elsepart != null) {
            boolean aliveAfterThen = this.alive;
            this.alive = true;
            Bits initsAfterThen = this.inits.m499dup();
            Bits uninitsAfterThen = this.uninits.m499dup();
            this.inits = initsBeforeElse;
            this.uninits = uninitsBeforeElse;
            scanStat(tree.elsepart);
            this.inits.andSet(initsAfterThen);
            this.uninits.andSet(uninitsAfterThen);
            this.alive |= aliveAfterThen;
            return;
        }
        this.inits.andSet(initsBeforeElse);
        this.uninits.andSet(uninitsBeforeElse);
        this.alive = true;
    }

    @Override
    public void visitBreak(JCTree.JCBreak tree) {
        recordExit(tree);
    }

    @Override
    public void visitContinue(JCTree.JCContinue tree) {
        recordExit(tree);
    }

    @Override
    public void visitReturn(JCTree.JCReturn tree) {
        scanExpr(tree.expr);
        recordExit(tree);
    }

    @Override
    public void visitThrow(JCTree.JCThrow tree) {
        scanExpr(tree.expr);
        Symbol sym = TreeInfo.symbol(tree.expr);
        if (sym != null && sym.kind == 4 && (sym.flags() & 4398046511120L) != 0 && this.preciseRethrowTypes.get(sym) != null && this.allowImprovedRethrowAnalysis) {
            for (Type t : this.preciseRethrowTypes.get(sym)) {
                markThrown(tree, t);
            }
        } else {
            markThrown(tree, tree.expr.type);
        }
        markDead();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void visitApply(JCTree.JCMethodInvocation tree) {
        scanExpr(tree.meth);
        scanExprs(tree.args);
        for (List listMo575getThrownTypes = tree.meth.type.mo575getThrownTypes(); listMo575getThrownTypes.nonEmpty(); listMo575getThrownTypes = listMo575getThrownTypes.tail) {
            markThrown(tree, (Type) listMo575getThrownTypes.head);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void visitNewClass(JCTree.JCNewClass tree) {
        scanExpr(tree.encl);
        scanExprs(tree.args);
        for (List listMo575getThrownTypes = tree.constructorType.mo575getThrownTypes(); listMo575getThrownTypes.nonEmpty(); listMo575getThrownTypes = listMo575getThrownTypes.tail) {
            markThrown(tree, (Type) listMo575getThrownTypes.head);
        }
        List<Type> l = this.caught;
        try {
            if (tree.f545def != null) {
                for (List listMo575getThrownTypes2 = tree.constructor.type.mo575getThrownTypes(); listMo575getThrownTypes2.nonEmpty(); listMo575getThrownTypes2 = listMo575getThrownTypes2.tail) {
                    this.caught = this.f371chk.incl((Type) listMo575getThrownTypes2.head, this.caught);
                }
            }
            scan(tree.f545def);
        } finally {
            this.caught = l;
        }
    }

    @Override
    public void visitNewArray(JCTree.JCNewArray tree) {
        scanExprs(tree.dims);
        scanExprs(tree.elems);
    }

    @Override
    public void visitAssert(JCTree.JCAssert tree) {
        Bits initsExit = this.inits.m499dup();
        Bits uninitsExit = this.uninits.m499dup();
        scanCond(tree.cond);
        uninitsExit.andSet(this.uninitsWhenTrue);
        if (tree.detail != null) {
            this.inits = this.initsWhenFalse;
            this.uninits = this.uninitsWhenFalse;
            scanExpr(tree.detail);
        }
        this.inits = initsExit;
        this.uninits = uninitsExit;
    }

    @Override
    public void visitAssign(JCTree.JCAssign tree) {
        JCTree lhs = TreeInfo.skipParens(tree.f532lhs);
        if (!(lhs instanceof JCTree.JCIdent)) {
            scanExpr(lhs);
        }
        scanExpr(tree.f533rhs);
        letInit(lhs);
    }

    @Override
    public void visitAssignop(JCTree.JCAssignOp tree) {
        scanExpr(tree.f534lhs);
        scanExpr(tree.f535rhs);
        letInit(tree.f534lhs);
    }

    @Override
    public void visitUnary(JCTree.JCUnary tree) {
        switch (tree.getTag()) {
            case 50:
                scanCond(tree.f546arg);
                Bits t = this.initsWhenFalse;
                this.initsWhenFalse = this.initsWhenTrue;
                this.initsWhenTrue = t;
                Bits t2 = this.uninitsWhenFalse;
                this.uninitsWhenFalse = this.uninitsWhenTrue;
                this.uninitsWhenTrue = t2;
                break;
            case 51:
            default:
                scanExpr(tree.f546arg);
                break;
            case 52:
            case 53:
            case 54:
            case 55:
                scanExpr(tree.f546arg);
                letInit(tree.f546arg);
                break;
        }
    }

    @Override
    public void visitBinary(JCTree.JCBinary tree) {
        int tag = tree.getTag();
        if (tag == 57) {
            scanCond(tree.f536lhs);
            Bits initsWhenTrueLeft = this.initsWhenTrue;
            Bits uninitsWhenTrueLeft = this.uninitsWhenTrue;
            this.inits = this.initsWhenFalse;
            this.uninits = this.uninitsWhenFalse;
            scanCond(tree.f537rhs);
            this.initsWhenTrue.andSet(initsWhenTrueLeft);
            this.uninitsWhenTrue.andSet(uninitsWhenTrueLeft);
            return;
        }
        if (tag == 58) {
            scanCond(tree.f536lhs);
            Bits initsWhenFalseLeft = this.initsWhenFalse;
            Bits uninitsWhenFalseLeft = this.uninitsWhenFalse;
            this.inits = this.initsWhenTrue;
            this.uninits = this.uninitsWhenTrue;
            scanCond(tree.f537rhs);
            this.initsWhenFalse.andSet(initsWhenFalseLeft);
            this.uninitsWhenFalse.andSet(uninitsWhenFalseLeft);
            return;
        }
        scanExpr(tree.f536lhs);
        scanExpr(tree.f537rhs);
    }

    @Override
    public void visitIdent(JCTree.JCIdent tree) {
        if (tree.f543sym.kind == 4) {
            checkInit(tree.m489pos(), (Symbol.VarSymbol) tree.f543sym);
            referenced(tree.f543sym);
        }
    }

    void referenced(Symbol sym) {
        this.unrefdResources.remove(sym);
    }

    @Override
    public void visitTypeCast(JCTree.JCTypeCast tree) {
        super.visitTypeCast(tree);
        if (!tree.type.isErroneous() && this.lint.isEnabled(Lint.LintCategory.CAST) && this.types.isSameType(tree.expr.type, tree.clazz.type) && !is292targetTypeCast(tree)) {
            this.f372log.warning(Lint.LintCategory.CAST, tree.m489pos(), "redundant.cast", tree.expr.type);
        }
    }

    private boolean is292targetTypeCast(JCTree.JCTypeCast tree) {
        JCTree.JCExpression expr = TreeInfo.skipParens(tree.expr);
        if (expr.getTag() != 26) {
            return false;
        }
        JCTree.JCMethodInvocation apply = (JCTree.JCMethodInvocation) expr;
        Symbol sym = TreeInfo.symbol(apply.meth);
        boolean is292targetTypeCast = (sym == null || sym.kind != 16 || (sym.flags() & Flags.POLYMORPHIC_SIGNATURE) == 0) ? false : true;
        return is292targetTypeCast;
    }

    @Override
    public void visitTopLevel(JCTree.JCCompilationUnit tree) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void analyzeTree(Env<AttrContext> c0621Env, TreeMaker treeMaker) {
        Symbol.VarSymbol[] varSymbolArr;
        try {
            this.attrEnv = c0621Env;
            JCTree jCTree = c0621Env.tree;
            this.make = treeMaker;
            this.inits = new Bits();
            this.uninits = new Bits();
            this.uninitsTry = new Bits();
            this.uninitsWhenFalse = null;
            this.uninitsWhenTrue = null;
            this.initsWhenFalse = null;
            this.initsWhenTrue = null;
            if (this.vars == null) {
                this.vars = new Symbol.VarSymbol[32];
            } else {
                for (int i = 0; i < this.vars.length; i++) {
                    this.vars[i] = null;
                }
            }
            this.firstadr = 0;
            this.nextadr = 0;
            this.pendingExits = new ListBuffer<>();
            this.preciseRethrowTypes = new HashMap<>();
            this.alive = true;
            this.caught = null;
            this.thrown = null;
            this.classDef = null;
            this.unrefdResources = new Scope(c0621Env.enclClass.f539sym);
            scan(jCTree);
            if (varSymbolArr != null) {
                while (true) {
                }
            }
        } finally {
            this.uninitsTry = null;
            this.uninits = null;
            this.inits = null;
            this.uninitsWhenFalse = null;
            this.uninitsWhenTrue = null;
            this.initsWhenFalse = null;
            this.initsWhenTrue = null;
            if (this.vars != null) {
                int i2 = 0;
                while (true) {
                    Symbol.VarSymbol[] varSymbolArr2 = this.vars;
                    if (i2 >= varSymbolArr2.length) {
                        break;
                    }
                    varSymbolArr2[i2] = null;
                    i2++;
                }
            }
            this.firstadr = 0;
            this.nextadr = 0;
            this.pendingExits = null;
            this.make = null;
            this.caught = null;
            this.thrown = null;
            this.classDef = null;
            this.unrefdResources = null;
        }
    }
}
