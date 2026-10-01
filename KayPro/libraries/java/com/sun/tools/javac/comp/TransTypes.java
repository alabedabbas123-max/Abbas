package com.sun.tools.javac.comp;

import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.code.Scope;
import com.sun.tools.javac.code.Source;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Symtab;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.code.Types;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeInfo;
import com.sun.tools.javac.tree.TreeMaker;
import com.sun.tools.javac.tree.TreeTranslator;
import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.Filter;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Names;
import com.sun.tools.javac.util.Warner;
import java.util.HashMap;
import java.util.Map;

public class TransTypes extends TreeTranslator {
    protected static final Context.C0723Key<TransTypes> transTypesKey = new Context.C0723Key<>();
    private final boolean addBridges;
    private boolean allowEnums;
    private Enter enter;

    private Env<AttrContext> f393env;

    private Log f394log;
    private TreeMaker make;
    private Names names;
    Map<Symbol.MethodSymbol, Symbol.MethodSymbol> overridden;

    private Type f395pt;
    private final Resolve resolve;
    private Symtab syms;
    private Types types;
    Filter<Symbol> overrideBridgeFilter = new Filter<Symbol>() {
        @Override
        public boolean accepts(Symbol s) {
            return (s.flags() & 2199023259648L) != 4096;
        }
    };
    JCTree.JCMethodDecl currentMethod = null;

    public static TransTypes instance(Context context) {
        TransTypes instance = (TransTypes) context.m501get(transTypesKey);
        if (instance == null) {
            return new TransTypes(context);
        }
        return instance;
    }

    protected TransTypes(Context context) {
        context.m504put(transTypesKey, this);
        this.names = Names.instance(context);
        this.f394log = Log.instance(context);
        this.syms = Symtab.instance(context);
        this.enter = Enter.instance(context);
        this.overridden = new HashMap();
        Source source = Source.instance(context);
        this.allowEnums = source.allowEnums();
        this.addBridges = source.addBridges();
        this.types = Types.instance(context);
        this.make = TreeMaker.instance(context);
        this.resolve = Resolve.instance(context);
    }

    JCTree.JCExpression cast(JCTree.JCExpression tree, Type target) {
        int oldpos = this.make.f550pos;
        this.make.m495at(tree.f531pos);
        if (!this.types.isSameType(tree.type, target)) {
            if (!this.resolve.isAccessible(this.f393env, target.tsym)) {
                this.resolve.logAccessErrorInternal(this.f393env, tree, target);
            }
            TreeMaker treeMaker = this.make;
            tree = treeMaker.TypeCast(treeMaker.Type(target), tree).setType(target);
        }
        this.make.f550pos = oldpos;
        return tree;
    }

    JCTree.JCExpression coerce(JCTree.JCExpression tree, Type target) {
        Type btarget = target.baseType();
        if (tree.type.isPrimitive() == target.isPrimitive()) {
            if (this.types.isAssignable(tree.type, btarget, Warner.noWarnings)) {
                return tree;
            }
            return cast(tree, btarget);
        }
        return tree;
    }

    JCTree.JCExpression retype(JCTree.JCExpression tree, Type erasedType, Type target) {
        if (erasedType.f344tag > 8) {
            if (target != null && target.isPrimitive()) {
                target = erasure(tree.type);
            }
            tree.type = erasedType;
            if (target != null) {
                return coerce(tree, target);
            }
        }
        return tree;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [A, com.sun.tools.javac.tree.JCTree] */
    /* JADX WARN: Type inference failed for: r2v4, types: [A, com.sun.tools.javac.tree.JCTree] */
    /* JADX WARN: Type inference failed for: r2v8, types: [A, com.sun.tools.javac.tree.JCTree] */
    <T extends JCTree> List<T> translateArgs(List<T> list, List<Type> list2, Type type) {
        if (list2.isEmpty()) {
            return list;
        }
        List list3 = list;
        List list4 = list2;
        while (list4.tail.nonEmpty()) {
            list3.head = translate((JCTree) list3.head, (Type) list4.head);
            list3 = list3.tail;
            list4 = list4.tail;
        }
        Type type2 = (Type) list4.head;
        boolean z = true;
        if (type == null && list3.length() != 1) {
            z = false;
        }
        Assert.check(z);
        if (type != null) {
            while (list3.nonEmpty()) {
                list3.head = translate((JCTree) list3.head, type);
                list3 = list3.tail;
            }
        } else {
            list3.head = translate((JCTree) list3.head, type2);
        }
        return list;
    }

    void addBridge(JCDiagnostic.DiagnosticPosition pos, Symbol.MethodSymbol meth, Symbol.MethodSymbol impl, Symbol.ClassSymbol origin, boolean hypothetical, ListBuffer<JCTree> bridges) {
        JCTree.JCStatement stat;
        this.make.m496at(pos);
        Type origType = this.types.memberType(origin.type, meth);
        Type origErasure = erasure(origType);
        Type bridgeType = meth.erasure(this.types);
        long flags = (impl.flags() & 7) | 4096 | Flags.BRIDGE;
        if (hypothetical) {
            flags |= Flags.HYPOTHETICAL;
        }
        Symbol.MethodSymbol bridge = new Symbol.MethodSymbol(flags, meth.name, bridgeType, origin);
        if (!hypothetical) {
            JCTree.JCMethodDecl md = this.make.MethodDef(bridge, null);
            JCTree.JCExpression receiver = impl.owner == origin ? this.make.This(origin.erasure(this.types)) : this.make.Super(this.types.supertype(origin.type).tsym.erasure(this.types), origin);
            Type calltype = erasure(impl.type.mo574getReturnType());
            TreeMaker treeMaker = this.make;
            JCTree.JCExpression call = treeMaker.Apply(null, treeMaker.Select(receiver, impl).setType(calltype), translateArgs(this.make.Idents(md.params), origErasure.mo573getParameterTypes(), null)).setType(calltype);
            if (origErasure.mo574getReturnType().f344tag != 9) {
                stat = this.make.Return(coerce(call, bridgeType.mo574getReturnType()));
            } else {
                stat = this.make.Exec(call);
            }
            md.body = this.make.Block(0L, List.m508of(stat));
            bridges.append(md);
        }
        origin.members().enter(bridge);
        this.overridden.put(bridge, meth);
    }

    void addBridgeIfNeeded(JCDiagnostic.DiagnosticPosition pos, Symbol sym, Symbol.ClassSymbol origin, ListBuffer<JCTree> bridges) {
        if (sym.kind == 16 && sym.name != this.names.init && (sym.flags() & 10) == 0 && (sym.flags() & 2199023259648L) != 4096 && sym.isMemberOf(origin, this.types)) {
            Symbol.MethodSymbol meth = (Symbol.MethodSymbol) sym;
            Symbol.MethodSymbol bridge = meth.binaryImplementation(origin, this.types);
            Symbol.MethodSymbol impl = meth.implementation(origin, this.types, true, this.overrideBridgeFilter);
            if (bridge == null || bridge == meth || !(impl == null || bridge.owner.isSubClass(impl.owner, this.types))) {
                if (impl != null && isBridgeNeeded(meth, impl, origin.type)) {
                    addBridge(pos, meth, impl, origin, bridge == impl, bridges);
                    return;
                }
                if (impl == meth && impl.owner != origin && (impl.flags() & 16) == 0 && (meth.flags() & 1025) == 1 && (origin.flags() & 1) > (1 & impl.owner.flags())) {
                    addBridge(pos, meth, impl, origin, false, bridges);
                    return;
                }
                return;
            }
            if ((bridge.flags() & 2199023259648L) == 4096) {
                Symbol.MethodSymbol other = this.overridden.get(bridge);
                if (other != null && other != meth) {
                    if (impl == null || !impl.overrides(other, origin, this.types, true)) {
                        this.f394log.error(pos, "name.clash.same.erasure.no.override", other, other.location(origin.type, this.types), meth, meth.location(origin.type, this.types));
                        return;
                    }
                    return;
                }
                return;
            }
            if (!bridge.overrides(meth, origin, this.types, true)) {
                if (bridge.owner == origin || this.types.asSuper(bridge.owner.type, meth.owner) == null) {
                    this.f394log.error(pos, "name.clash.same.erasure.no.override", bridge, bridge.location(origin.type, this.types), meth, meth.location(origin.type, this.types));
                }
            }
        }
    }

    private boolean isBridgeNeeded(Symbol.MethodSymbol method, Symbol.MethodSymbol impl, Type dest) {
        if (impl == method) {
            if ((method.flags() & 1024) == 0) {
                return true ^ isSameMemberWhenErased(dest, method, method.erasure(this.types));
            }
            return false;
        }
        Type method_erasure = method.erasure(this.types);
        if (!isSameMemberWhenErased(dest, method, method_erasure)) {
            return true;
        }
        Type impl_erasure = impl.erasure(this.types);
        if (!isSameMemberWhenErased(dest, impl, impl_erasure)) {
            return true;
        }
        return true ^ this.types.isSameType(impl_erasure.mo574getReturnType(), method_erasure.mo574getReturnType());
    }

    private boolean isSameMemberWhenErased(Type type, Symbol.MethodSymbol method, Type erasure) {
        Types types = this.types;
        return types.isSameType(erasure(types.memberType(type, method)), erasure);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void addBridges(JCDiagnostic.DiagnosticPosition pos, Symbol.TypeSymbol i, Symbol.ClassSymbol origin, ListBuffer<JCTree> bridges) {
        for (Scope.Entry e = i.members().elems; e != null; e = e.sibling) {
            addBridgeIfNeeded(pos, e.f338sym, origin, bridges);
        }
        for (List listInterfaces = this.types.interfaces(i.type); listInterfaces.nonEmpty(); listInterfaces = listInterfaces.tail) {
            addBridges(pos, ((Type) listInterfaces.head).tsym, origin, bridges);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void addBridges(JCDiagnostic.DiagnosticPosition pos, Symbol.ClassSymbol origin, ListBuffer<JCTree> bridges) {
        Type st = this.types.supertype(origin.type);
        while (st.f344tag == 10) {
            addBridges(pos, st.tsym, origin, bridges);
            st = this.types.supertype(st);
        }
        for (List listInterfaces = this.types.interfaces(origin.type); listInterfaces.nonEmpty(); listInterfaces = listInterfaces.tail) {
            addBridges(pos, ((Type) listInterfaces.head).tsym, origin, bridges);
        }
    }

    public <T extends JCTree> T translate(T t, Type type) {
        Type type2 = this.f395pt;
        try {
            this.f395pt = type;
            return (T) translate(t);
        } finally {
            this.f395pt = type2;
        }
    }

    public <T extends JCTree> List<T> translate(List<T> trees, Type pt) {
        Type prevPt = this.f395pt;
        try {
            this.f395pt = pt;
            List<T> res = translate(trees);
            return res;
        } finally {
            this.f395pt = prevPt;
        }
    }

    @Override
    public void visitClassDef(JCTree.JCClassDecl tree) {
        translateClass(tree.f539sym);
        this.result = tree;
    }

    @Override
    public void visitMethodDef(JCTree.JCMethodDecl tree) {
        JCTree.JCMethodDecl previousMethod = this.currentMethod;
        try {
            this.currentMethod = tree;
            tree.restype = (JCTree.JCExpression) translate(tree.restype, (Type) null);
            tree.typarams = List.m507nil();
            tree.params = translateVarDefs(tree.params);
            tree.thrown = translate(tree.thrown, (Type) null);
            tree.body = (JCTree.JCBlock) translate(tree.body, tree.f544sym.erasure(this.types).mo574getReturnType());
            tree.type = erasure(tree.type);
            this.result = tree;
            this.currentMethod = previousMethod;
            for (Scope.Entry e = tree.f544sym.owner.members().lookup(tree.name); e.f338sym != null; e = e.next()) {
                if (e.f338sym != tree.f544sym && this.types.isSameType(erasure(e.f338sym.type), tree.type)) {
                    this.f394log.error(tree.m489pos(), "name.clash.same.erasure", tree.f544sym, e.f338sym);
                    return;
                }
            }
        } catch (Throwable th) {
            this.currentMethod = previousMethod;
            throw th;
        }
    }

    @Override
    public void visitVarDef(JCTree.JCVariableDecl tree) {
        tree.vartype = (JCTree.JCExpression) translate(tree.vartype, (Type) null);
        tree.init = (JCTree.JCExpression) translate(tree.init, tree.f547sym.erasure(this.types));
        tree.type = erasure(tree.type);
        this.result = tree;
    }

    @Override
    public void visitDoLoop(JCTree.JCDoWhileLoop tree) {
        tree.body = (JCTree.JCStatement) translate(tree.body);
        tree.cond = (JCTree.JCExpression) translate(tree.cond, this.syms.booleanType);
        this.result = tree;
    }

    @Override
    public void visitWhileLoop(JCTree.JCWhileLoop tree) {
        tree.cond = (JCTree.JCExpression) translate(tree.cond, this.syms.booleanType);
        tree.body = (JCTree.JCStatement) translate(tree.body);
        this.result = tree;
    }

    @Override
    public void visitForLoop(JCTree.JCForLoop tree) {
        tree.init = translate(tree.init, (Type) null);
        if (tree.cond != null) {
            tree.cond = (JCTree.JCExpression) translate(tree.cond, this.syms.booleanType);
        }
        tree.step = translate(tree.step, (Type) null);
        tree.body = (JCTree.JCStatement) translate(tree.body);
        this.result = tree;
    }

    @Override
    public void visitForeachLoop(JCTree.JCEnhancedForLoop tree) {
        tree.f541var = (JCTree.JCVariableDecl) translate(tree.f541var, (Type) null);
        Type iterableType = tree.expr.type;
        tree.expr = (JCTree.JCExpression) translate(tree.expr, erasure(tree.expr.type));
        if (this.types.elemtype(tree.expr.type) == null) {
            tree.expr.type = iterableType;
        }
        tree.body = (JCTree.JCStatement) translate(tree.body);
        this.result = tree;
    }

    @Override
    public void visitSwitch(JCTree.JCSwitch tree) {
        Type selsuper = this.types.supertype(tree.selector.type);
        boolean enumSwitch = selsuper != null && selsuper.tsym == this.syms.enumSym;
        Type target = enumSwitch ? erasure(tree.selector.type) : this.syms.intType;
        tree.selector = (JCTree.JCExpression) translate(tree.selector, target);
        tree.cases = translateCases(tree.cases);
        this.result = tree;
    }

    @Override
    public void visitCase(JCTree.JCCase tree) {
        tree.f538pat = (JCTree.JCExpression) translate(tree.f538pat, (Type) null);
        tree.stats = translate(tree.stats);
        this.result = tree;
    }

    @Override
    public void visitSynchronized(JCTree.JCSynchronized tree) {
        tree.lock = (JCTree.JCExpression) translate(tree.lock, erasure(tree.lock.type));
        tree.body = (JCTree.JCBlock) translate(tree.body);
        this.result = tree;
    }

    @Override
    public void visitTry(JCTree.JCTry tree) {
        tree.resources = translate(tree.resources, this.syms.autoCloseableType);
        tree.body = (JCTree.JCBlock) translate(tree.body);
        tree.catchers = translateCatchers(tree.catchers);
        tree.finalizer = (JCTree.JCBlock) translate(tree.finalizer);
        this.result = tree;
    }

    @Override
    public void visitConditional(JCTree.JCConditional tree) {
        tree.cond = (JCTree.JCExpression) translate(tree.cond, this.syms.booleanType);
        tree.truepart = (JCTree.JCExpression) translate(tree.truepart, erasure(tree.type));
        tree.falsepart = (JCTree.JCExpression) translate(tree.falsepart, erasure(tree.type));
        tree.type = erasure(tree.type);
        this.result = retype(tree, tree.type, this.f395pt);
    }

    @Override
    public void visitIf(JCTree.JCIf tree) {
        tree.cond = (JCTree.JCExpression) translate(tree.cond, this.syms.booleanType);
        tree.thenpart = (JCTree.JCStatement) translate(tree.thenpart);
        tree.elsepart = (JCTree.JCStatement) translate(tree.elsepart);
        this.result = tree;
    }

    @Override
    public void visitExec(JCTree.JCExpressionStatement tree) {
        tree.expr = (JCTree.JCExpression) translate(tree.expr, (Type) null);
        this.result = tree;
    }

    @Override
    public void visitReturn(JCTree.JCReturn tree) {
        tree.expr = (JCTree.JCExpression) translate(tree.expr, this.currentMethod.f544sym.erasure(this.types).mo574getReturnType());
        this.result = tree;
    }

    @Override
    public void visitThrow(JCTree.JCThrow tree) {
        tree.expr = (JCTree.JCExpression) translate(tree.expr, erasure(tree.expr.type));
        this.result = tree;
    }

    @Override
    public void visitAssert(JCTree.JCAssert tree) {
        tree.cond = (JCTree.JCExpression) translate(tree.cond, this.syms.booleanType);
        if (tree.detail != null) {
            tree.detail = (JCTree.JCExpression) translate(tree.detail, erasure(tree.detail.type));
        }
        this.result = tree;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void visitApply(JCTree.JCMethodInvocation tree) {
        tree.meth = (JCTree.JCExpression) translate(tree.meth, (Type) null);
        Symbol meth = TreeInfo.symbol(tree.meth);
        Type mt = meth.erasure(this.types);
        List listMo573getParameterTypes = mt.mo573getParameterTypes();
        if (this.allowEnums && meth.name == this.names.init && meth.owner == this.syms.enumSym) {
            listMo573getParameterTypes = listMo573getParameterTypes.tail.tail;
        }
        if (tree.varargsElement != null) {
            tree.varargsElement = this.types.erasure(tree.varargsElement);
        } else {
            Assert.check(tree.args.length() == listMo573getParameterTypes.length());
        }
        tree.args = translateArgs(tree.args, listMo573getParameterTypes, tree.varargsElement);
        this.result = retype(tree, mt.mo574getReturnType(), this.f395pt);
    }

    @Override
    public void visitNewClass(JCTree.JCNewClass tree) {
        if (tree.encl != null) {
            tree.encl = (JCTree.JCExpression) translate(tree.encl, erasure(tree.encl.type));
        }
        tree.clazz = (JCTree.JCExpression) translate(tree.clazz, (Type) null);
        if (tree.varargsElement != null) {
            tree.varargsElement = this.types.erasure(tree.varargsElement);
        }
        tree.args = translateArgs(tree.args, tree.constructor.erasure(this.types).mo573getParameterTypes(), tree.varargsElement);
        tree.f545def = (JCTree.JCClassDecl) translate(tree.f545def, (Type) null);
        tree.type = erasure(tree.type);
        this.result = tree;
    }

    @Override
    public void visitNewArray(JCTree.JCNewArray tree) {
        tree.elemtype = (JCTree.JCExpression) translate(tree.elemtype, (Type) null);
        translate(tree.dims, this.syms.intType);
        if (tree.type != null) {
            tree.elems = translate(tree.elems, erasure(this.types.elemtype(tree.type)));
            tree.type = erasure(tree.type);
        } else {
            tree.elems = translate(tree.elems, (Type) null);
        }
        this.result = tree;
    }

    @Override
    public void visitParens(JCTree.JCParens tree) {
        tree.expr = (JCTree.JCExpression) translate(tree.expr, this.f395pt);
        tree.type = erasure(tree.type);
        this.result = tree;
    }

    @Override
    public void visitAssign(JCTree.JCAssign tree) {
        tree.f532lhs = (JCTree.JCExpression) translate(tree.f532lhs, (Type) null);
        tree.f533rhs = (JCTree.JCExpression) translate(tree.f533rhs, erasure(tree.f532lhs.type));
        tree.type = erasure(tree.type);
        this.result = tree;
    }

    @Override
    public void visitAssignop(JCTree.JCAssignOp tree) {
        tree.f534lhs = (JCTree.JCExpression) translate(tree.f534lhs, (Type) null);
        tree.f535rhs = (JCTree.JCExpression) translate(tree.f535rhs, tree.operator.type.mo573getParameterTypes().tail.head);
        tree.type = erasure(tree.type);
        this.result = tree;
    }

    @Override
    public void visitUnary(JCTree.JCUnary tree) {
        tree.f546arg = (JCTree.JCExpression) translate(tree.f546arg, tree.operator.type.mo573getParameterTypes().head);
        this.result = tree;
    }

    @Override
    public void visitBinary(JCTree.JCBinary tree) {
        tree.f536lhs = (JCTree.JCExpression) translate(tree.f536lhs, tree.operator.type.mo573getParameterTypes().head);
        tree.f537rhs = (JCTree.JCExpression) translate(tree.f537rhs, tree.operator.type.mo573getParameterTypes().tail.head);
        this.result = tree;
    }

    @Override
    public void visitTypeCast(JCTree.JCTypeCast tree) {
        tree.clazz = translate(tree.clazz, (Type) null);
        tree.type = erasure(tree.type);
        tree.expr = (JCTree.JCExpression) translate(tree.expr, tree.type);
        this.result = tree;
    }

    @Override
    public void visitTypeTest(JCTree.JCInstanceOf tree) {
        tree.expr = (JCTree.JCExpression) translate(tree.expr, (Type) null);
        tree.clazz = translate(tree.clazz, (Type) null);
        this.result = tree;
    }

    @Override
    public void visitIndexed(JCTree.JCArrayAccess tree) {
        tree.indexed = (JCTree.JCExpression) translate(tree.indexed, erasure(tree.indexed.type));
        tree.index = (JCTree.JCExpression) translate(tree.index, this.syms.intType);
        this.result = retype(tree, this.types.elemtype(tree.indexed.type), this.f395pt);
    }

    @Override
    public void visitAnnotation(JCTree.JCAnnotation tree) {
        this.result = tree;
    }

    @Override
    public void visitIdent(JCTree.JCIdent tree) {
        Type et = tree.f543sym.erasure(this.types);
        if (tree.f543sym.kind == 2 && tree.f543sym.type.f344tag == 14) {
            this.result = this.make.m495at(tree.f531pos).Type(et);
            return;
        }
        if (tree.type.constValue() != null) {
            this.result = tree;
        } else if (tree.f543sym.kind == 4) {
            this.result = retype(tree, et, this.f395pt);
        } else {
            tree.type = erasure(tree.type);
            this.result = tree;
        }
    }

    @Override
    public void visitSelect(JCTree.JCFieldAccess tree) {
        Type t = tree.selected.type;
        while (t.f344tag == 14) {
            t = t.mo576getUpperBound();
        }
        if (t.isCompound()) {
            if ((tree.f542sym.flags() & 2097152) != 0) {
                tree.f542sym = ((Symbol.MethodSymbol) tree.f542sym).implemented((Symbol.TypeSymbol) tree.f542sym.owner, this.types);
            }
            tree.selected = coerce((JCTree.JCExpression) translate(tree.selected, erasure(tree.selected.type)), erasure(tree.f542sym.owner.type));
        } else {
            tree.selected = (JCTree.JCExpression) translate(tree.selected, erasure(t));
        }
        if (tree.type.constValue() != null) {
            this.result = tree;
        } else if (tree.f542sym.kind == 4) {
            this.result = retype(tree, tree.f542sym.erasure(this.types), this.f395pt);
        } else {
            tree.type = erasure(tree.type);
            this.result = tree;
        }
    }

    @Override
    public void visitTypeArray(JCTree.JCArrayTypeTree tree) {
        tree.elemtype = (JCTree.JCExpression) translate(tree.elemtype, (Type) null);
        tree.type = erasure(tree.type);
        this.result = tree;
    }

    @Override
    public void visitTypeApply(JCTree.JCTypeApply tree) {
        JCTree clazz = translate(tree.clazz, (Type) null);
        this.result = clazz;
    }

    private Type erasure(Type t) {
        return this.types.erasure(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean boundsRestricted(Symbol.ClassSymbol c) {
        Type st = this.types.supertype(c.type);
        if (st.isParameterized()) {
            List listAllparams = st.allparams();
            for (List listAllparams2 = st.tsym.type.allparams(); !listAllparams.isEmpty() && !listAllparams2.isEmpty(); listAllparams2 = listAllparams2.tail) {
                Type actual = (Type) listAllparams.head;
                Type formal = (Type) listAllparams2.head;
                Types types = this.types;
                if (!types.isSameType(types.erasure(actual), this.types.erasure(formal))) {
                    return true;
                }
                listAllparams = listAllparams.tail;
            }
            return false;
        }
        return false;
    }

    private List<JCTree> addOverrideBridgesIfNeeded(JCDiagnostic.DiagnosticPosition pos, Symbol.ClassSymbol c) {
        ListBuffer<JCTree> buf = ListBuffer.m512lb();
        if (c.isInterface() || !boundsRestricted(c)) {
            return buf.toList();
        }
        Type t = this.types.supertype(c.type);
        Scope s = t.tsym.members();
        if (s.elems != null) {
            for (Symbol sym : s.getElements(new NeedsOverridBridgeFilter(c))) {
                Symbol.MethodSymbol m = (Symbol.MethodSymbol) sym;
                Symbol.MethodSymbol member = (Symbol.MethodSymbol) m.asMemberOf(c.type, this.types);
                Symbol.MethodSymbol impl = m.implementation(c, this.types, false);
                if (impl == null || impl.owner != c) {
                    Types types = this.types;
                    if (!types.isSameType(member.erasure(types), m.erasure(this.types))) {
                        addOverrideBridges(pos, m, member, c, buf);
                    }
                }
            }
        }
        return buf.toList();
    }

    class NeedsOverridBridgeFilter implements Filter<Symbol> {

        Symbol.ClassSymbol f396c;

        NeedsOverridBridgeFilter(Symbol.ClassSymbol c) {
            this.f396c = c;
        }

        @Override
        public boolean accepts(Symbol s) {
            return s.kind == 16 && !s.isConstructor() && s.isInheritedIn(this.f396c, TransTypes.this.types) && (s.flags() & 16) == 0 && (s.flags() & 2199023259648L) != 4096;
        }
    }

    private void addOverrideBridges(JCDiagnostic.DiagnosticPosition pos, Symbol.MethodSymbol impl, Symbol.MethodSymbol member, Symbol.ClassSymbol c, ListBuffer<JCTree> bridges) {
        JCTree.JCStatement stat;
        Type implErasure = impl.erasure(this.types);
        long flags = (impl.flags() & 7) | 4096 | Flags.BRIDGE | Flags.OVERRIDE_BRIDGE;
        Symbol.MethodSymbol member2 = new Symbol.MethodSymbol(flags, member.name, member.type, c);
        JCTree.JCMethodDecl md = this.make.MethodDef(member2, null);
        JCTree.JCExpression receiver = this.make.Super(this.types.supertype(c.type).tsym.erasure(this.types), c);
        Type calltype = erasure(impl.type.mo574getReturnType());
        TreeMaker treeMaker = this.make;
        JCTree.JCExpression call = treeMaker.Apply(null, treeMaker.Select(receiver, impl).setType(calltype), translateArgs(this.make.Idents(md.params), implErasure.mo573getParameterTypes(), null)).setType(calltype);
        if (member2.getReturnType().f344tag != 9) {
            stat = this.make.Return(coerce(call, member2.erasure(this.types).mo574getReturnType()));
        } else {
            stat = this.make.Exec(call);
        }
        md.body = this.make.Block(0L, List.m508of(stat));
        c.members().enter(member2);
        bridges.append(md);
    }

    void translateClass(Symbol.ClassSymbol c) {
        Type st = this.types.supertype(c.type);
        if (st.f344tag == 10) {
            translateClass((Symbol.ClassSymbol) st.tsym);
        }
        Env<AttrContext> myEnv = this.enter.typeEnvs.remove(c);
        if (myEnv == null) {
            return;
        }
        Env<AttrContext> oldEnv = this.f393env;
        try {
            this.f393env = myEnv;
            TreeMaker savedMake = this.make;
            Type savedPt = this.f395pt;
            this.make = this.make.forToplevel(myEnv.toplevel);
            this.f395pt = null;
            try {
                JCTree.JCClassDecl tree = (JCTree.JCClassDecl) this.f393env.tree;
                tree.typarams = List.m507nil();
                super.visitClassDef(tree);
                this.make.m495at(tree.f531pos);
                if (this.addBridges) {
                    ListBuffer<JCTree> bridges = new ListBuffer<>();
                    if ((tree.f539sym.flags() & 512) == 0) {
                        addBridges(tree.m489pos(), tree.f539sym, bridges);
                    }
                    tree.defs = bridges.toList().prependList(tree.defs);
                }
                tree.type = erasure(tree.type);
                this.make = savedMake;
                this.f395pt = savedPt;
                this.f393env = oldEnv;
            } catch (Throwable th) {
                this.make = savedMake;
                this.f395pt = savedPt;
                throw th;
            }
        } catch (Throwable th2) {
            this.f393env = oldEnv;
            throw th2;
        }
    }

    public JCTree translateTopLevelClass(JCTree cdef, TreeMaker make) {
        this.make = make;
        this.f395pt = null;
        return translate(cdef, (Type) null);
    }
}
