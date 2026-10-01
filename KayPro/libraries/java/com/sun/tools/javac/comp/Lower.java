package com.sun.tools.javac.comp;

import com.sun.tools.javac.code.Attribute;
import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.code.RetentionPolicy;
import com.sun.tools.javac.code.Scope;
import com.sun.tools.javac.code.Source;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Symtab;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.code.Types;
import com.sun.tools.javac.main.RecognizedOptions;
import com.sun.tools.javac.jvm.ByteCodes;
import com.sun.tools.javac.jvm.ClassReader;
import com.sun.tools.javac.jvm.ClassWriter;
import com.sun.tools.javac.jvm.Target;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeInfo;
import com.sun.tools.javac.tree.TreeMaker;
import com.sun.tools.javac.tree.TreeScanner;
import com.sun.tools.javac.tree.TreeTranslator;
import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.Convert;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;
import com.sun.tools.javac.util.Options;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Lower extends TreeTranslator {
    private static final int ASSIGNcode = 2;
    private static final int DEREFcode = 0;
    private static final int FIRSTASGOPcode = 12;
    private static final int POSTDECcode = 10;
    private static final int POSTINCcode = 8;
    private static final int PREDECcode = 6;
    private static final int PREINCcode = 4;
    private List<Symbol.ClassSymbol> accessConstrTags;
    private Map<Symbol, Symbol.MethodSymbol> accessConstrs;
    private Map<Symbol, Integer> accessNums;
    private Map<Symbol, Symbol.MethodSymbol[]> accessSyms;
    private ListBuffer<Symbol> accessed;
    Map<Symbol, Symbol> actualSymbols;
    private boolean allowEnums;
    private Attr attr;
    Env<AttrContext> attrEnv;
    private ConstFold cfolder;

    private Check f377chk;
    private final Name classDollar;
    Map<Symbol.ClassSymbol, JCTree.JCClassDecl> classdefs;
    Symbol.ClassSymbol currentClass;
    JCTree.JCMethodDecl currentMethodDef;
    Symbol.MethodSymbol currentMethodSym;
    private boolean debugLower;
    private final Name dollarAssertionsDisabled;
    private JCTree.JCExpression enclOp;
    Map<JCTree, Integer> endPositions;
    Map<Symbol.ClassSymbol, List<Symbol.VarSymbol>> freevarCache;

    private Log f378log;
    private TreeMaker make;
    private JCDiagnostic.DiagnosticPosition make_pos;
    private Names names;
    List<Symbol.VarSymbol> outerThisStack;
    JCTree.JCClassDecl outermostClassDef;
    JCTree outermostMemberDef;
    private RecognizedOptions.PkgInfo pkginfoOpt;
    Scope proxies;
    private ClassReader reader;

    private Resolve f379rs;
    private Source source;
    private Symtab syms;
    private Symbol.MethodSymbol systemArraycopyMethod;
    private Target target;
    ListBuffer<JCTree> translated;
    Scope twrVars;
    private Types types;
    private ClassWriter writer;
    protected static final Context.C0723Key<Lower> lowerKey = new Context.C0723Key<>();
    private static final int NCODES = accessCode(ByteCodes.lushrl) + 2;
    ClassMap classMap = new ClassMap();
    Map<Symbol.TypeSymbol, EnumMapping> enumSwitchMap = new LinkedHashMap();
    JCTree.Visitor conflictsChecker = new TreeScanner() {
        Symbol.TypeSymbol currentClass;

        @Override
        public void visitMethodDef(JCTree.JCMethodDecl that) {
            Lower.this.f377chk.checkConflicts(that.m489pos(), that.f544sym, this.currentClass);
            super.visitMethodDef(that);
        }

        @Override
        public void visitVarDef(JCTree.JCVariableDecl that) {
            if (that.f547sym.owner.kind == 2) {
                Lower.this.f377chk.checkConflicts(that.m489pos(), that.f547sym, this.currentClass);
            }
            super.visitVarDef(that);
        }

        @Override
        public void visitClassDef(JCTree.JCClassDecl that) {
            Symbol.TypeSymbol prevCurrentClass = this.currentClass;
            this.currentClass = that.f539sym;
            try {
                super.visitClassDef(that);
            } finally {
                this.currentClass = prevCurrentClass;
            }
        }
    };

    interface TreeBuilder {
        JCTree build(JCTree jCTree);
    }

    public static Lower instance(Context context) {
        Lower instance = (Lower) context.m501get(lowerKey);
        if (instance == null) {
            return new Lower(context);
        }
        return instance;
    }

    protected Lower(Context context) {
        context.m504put(lowerKey, this);
        this.names = Names.instance(context);
        this.f378log = Log.instance(context);
        this.syms = Symtab.instance(context);
        this.f379rs = Resolve.instance(context);
        this.f377chk = Check.instance(context);
        this.attr = Attr.instance(context);
        this.make = TreeMaker.instance(context);
        this.writer = ClassWriter.instance(context);
        this.reader = ClassReader.instance(context);
        this.cfolder = ConstFold.instance(context);
        this.target = Target.instance(context);
        Source sourceInstance = Source.instance(context);
        this.source = sourceInstance;
        this.allowEnums = sourceInstance.allowEnums();
        this.dollarAssertionsDisabled = this.names.fromString(this.target.syntheticNameChar() + "assertionsDisabled");
        this.classDollar = this.names.fromString("class" + this.target.syntheticNameChar());
        this.types = Types.instance(context);
        Options options = Options.instance(context);
        this.debugLower = options.isSet("debuglower");
        this.pkginfoOpt = RecognizedOptions.PkgInfo.m483get(options);
    }

    class ClassMap extends TreeScanner {
        ClassMap() {
        }

        @Override
        public void visitClassDef(JCTree.JCClassDecl tree) {
            Lower.this.classdefs.put(tree.f539sym, tree);
            super.visitClassDef(tree);
        }
    }

    JCTree.JCClassDecl classDef(Symbol.ClassSymbol c) {
        JCTree jCTree;
        JCTree.JCClassDecl def = this.classdefs.get(c);
        if (def == null && (jCTree = this.outermostMemberDef) != null) {
            this.classMap.scan(jCTree);
            def = this.classdefs.get(c);
        }
        if (def == null) {
            this.classMap.scan(this.outermostClassDef);
            return this.classdefs.get(c);
        }
        return def;
    }

    class FreeVarCollector extends TreeScanner {
        Symbol.ClassSymbol clazz;

        List<Symbol.VarSymbol> f382fvs = List.m507nil();
        Symbol owner;

        FreeVarCollector(Symbol.ClassSymbol clazz) {
            this.clazz = clazz;
            this.owner = clazz.owner;
        }

        private void addFreeVar(Symbol.VarSymbol v) {
            for (List list = this.f382fvs; list.nonEmpty(); list = list.tail) {
                if (list.head == v) {
                    return;
                }
            }
            List<Symbol.VarSymbol> l = this.f382fvs;
            this.f382fvs = l.prepend(v);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void addFreeVars(Symbol.ClassSymbol c) {
            List<Symbol.VarSymbol> fvs = Lower.this.freevarCache.get(c);
            if (fvs != null) {
                for (List list = fvs; list.nonEmpty(); list = list.tail) {
                    addFreeVar((Symbol.VarSymbol) list.head);
                }
            }
        }

        @Override
        public void visitIdent(JCTree.JCIdent tree) {
            Lower.this.result = tree;
            visitSymbol(tree.f543sym);
        }

        private void visitSymbol(Symbol _sym) {
            Symbol sym = _sym;
            if (sym.kind == 4 || sym.kind == 16) {
                while (sym != null && sym.owner != this.owner) {
                    sym = Lower.this.proxies.lookup(Lower.this.proxyName(sym.name)).f338sym;
                }
                if (sym != null && sym.owner == this.owner) {
                    Symbol.VarSymbol v = (Symbol.VarSymbol) sym;
                    if (v.getConstValue() == null) {
                        addFreeVar(v);
                        return;
                    }
                    return;
                }
                if (Lower.this.outerThisStack.head != null && Lower.this.outerThisStack.head != _sym) {
                    visitSymbol(Lower.this.outerThisStack.head);
                }
            }
        }

        @Override
        public void visitNewClass(JCTree.JCNewClass tree) {
            Symbol.ClassSymbol c = (Symbol.ClassSymbol) tree.constructor.owner;
            addFreeVars(c);
            if (tree.encl == null && c.hasOuterInstance() && Lower.this.outerThisStack.head != null) {
                visitSymbol(Lower.this.outerThisStack.head);
            }
            super.visitNewClass(tree);
        }

        @Override
        public void visitSelect(JCTree.JCFieldAccess tree) {
            if ((tree.name == Lower.this.names._this || tree.name == Lower.this.names._super) && tree.selected.type.tsym != this.clazz && Lower.this.outerThisStack.head != null) {
                visitSymbol(Lower.this.outerThisStack.head);
            }
            super.visitSelect(tree);
        }

        @Override
        public void visitApply(JCTree.JCMethodInvocation tree) {
            if (TreeInfo.name(tree.meth) == Lower.this.names._super) {
                addFreeVars((Symbol.ClassSymbol) TreeInfo.symbol(tree.meth).owner);
                Symbol constructor = TreeInfo.symbol(tree.meth);
                Symbol.ClassSymbol c = (Symbol.ClassSymbol) constructor.owner;
                if (c.hasOuterInstance() && tree.meth.getTag() != 34 && Lower.this.outerThisStack.head != null) {
                    visitSymbol(Lower.this.outerThisStack.head);
                }
            }
            super.visitApply(tree);
        }
    }

    List<Symbol.VarSymbol> freevars(Symbol.ClassSymbol c) {
        if ((c.owner.kind & 20) != 0) {
            List<Symbol.VarSymbol> fvs = this.freevarCache.get(c);
            if (fvs == null) {
                FreeVarCollector collector = new FreeVarCollector(c);
                collector.scan(classDef(c));
                List<Symbol.VarSymbol> fvs2 = collector.f382fvs;
                this.freevarCache.put(c, fvs2);
                return fvs2;
            }
            return fvs;
        }
        return List.m507nil();
    }

    EnumMapping mapForEnum(JCDiagnostic.DiagnosticPosition pos, Symbol.TypeSymbol enumClass) {
        EnumMapping map = this.enumSwitchMap.get(enumClass);
        if (map == null) {
            Map<Symbol.TypeSymbol, EnumMapping> map2 = this.enumSwitchMap;
            EnumMapping map3 = new EnumMapping(pos, enumClass);
            map2.put(enumClass, map3);
            return map3;
        }
        return map;
    }

    class EnumMapping {
        final Symbol.TypeSymbol forEnum;
        final Symbol.VarSymbol mapVar;

        JCDiagnostic.DiagnosticPosition f381pos;
        int next = 1;
        final Map<Symbol.VarSymbol, Integer> values = new LinkedHashMap();

        EnumMapping(JCDiagnostic.DiagnosticPosition pos, Symbol.TypeSymbol forEnum) {
            this.f381pos = null;
            this.forEnum = forEnum;
            this.f381pos = pos;
            Name varName = Lower.this.names.fromString(Lower.this.target.syntheticNameChar() + "SwitchMap" + Lower.this.target.syntheticNameChar() + Lower.this.writer.xClassName(forEnum.type).toString().replace('/', '.').replace('.', Lower.this.target.syntheticNameChar()));
            Symbol.ClassSymbol outerCacheClass = Lower.this.outerCacheClass();
            Symbol.VarSymbol varSymbol = new Symbol.VarSymbol(4120L, varName, new Type.ArrayType(Lower.this.syms.intType, Lower.this.syms.arrayClass), outerCacheClass);
            this.mapVar = varSymbol;
            Lower.this.enterSynthetic(pos, varSymbol, outerCacheClass.members());
        }

        JCTree.JCLiteral forConstant(Symbol.VarSymbol v) {
            Integer result = this.values.get(v);
            if (result == null) {
                Map<Symbol.VarSymbol, Integer> map = this.values;
                int i = this.next;
                this.next = i + 1;
                Integer numValueOf = Integer.valueOf(i);
                result = numValueOf;
                map.put(v, numValueOf);
            }
            return Lower.this.make.Literal(result);
        }

        void translate() {
            Lower.this.make.m495at(this.f381pos.getStartPosition());
            JCTree.JCClassDecl owner = Lower.this.classDef((Symbol.ClassSymbol) this.mapVar.owner);
            Lower lower = Lower.this;
            Symbol.MethodSymbol valuesMethod = lower.lookupMethod(this.f381pos, lower.names.values, this.forEnum.type, List.m507nil());
            JCTree.JCExpression size = Lower.this.make.Select(Lower.this.make.m493App(Lower.this.make.QualIdent(valuesMethod)), Lower.this.syms.lengthVar);
            JCTree.JCExpression mapVarInit = Lower.this.make.NewArray(Lower.this.make.Type(Lower.this.syms.intType), List.m508of(size), null).setType((Type) new Type.ArrayType(Lower.this.syms.intType, Lower.this.syms.arrayClass));
            ListBuffer<JCTree.JCStatement> stmts = new ListBuffer<>();
            Lower lower2 = Lower.this;
            Symbol ordinalMethod = lower2.lookupMethod(this.f381pos, lower2.names.ordinal, this.forEnum.type, List.m507nil());
            List<JCTree.JCCatch> catcher = List.m507nil().prepend(Lower.this.make.Catch(Lower.this.make.VarDef(new Symbol.VarSymbol(Flags.PARAMETER, Lower.this.names.f575ex, Lower.this.syms.noSuchFieldErrorType, Lower.this.syms.noSymbol), null), Lower.this.make.Block(0L, List.m507nil())));
            for (Map.Entry<Symbol.VarSymbol, Integer> e : this.values.entrySet()) {
                Symbol.VarSymbol enumerator = e.getKey();
                Integer mappedValue = e.getValue();
                Symbol.MethodSymbol valuesMethod2 = valuesMethod;
                JCTree.JCExpression size2 = size;
                JCTree.JCExpression assign = Lower.this.make.Assign(Lower.this.make.Indexed(this.mapVar, Lower.this.make.m493App(Lower.this.make.Select(Lower.this.make.QualIdent(enumerator), ordinalMethod))), Lower.this.make.Literal(mappedValue)).setType(Lower.this.syms.intType);
                JCTree.JCStatement exec = Lower.this.make.Exec(assign);
                JCTree.JCStatement _try = Lower.this.make.mo491Try(Lower.this.make.Block(0L, List.m508of(exec)), catcher, null);
                stmts.append(_try);
                valuesMethod = valuesMethod2;
                size = size2;
            }
            owner.defs = owner.defs.prepend(Lower.this.make.Block(8L, stmts.toList())).prepend(Lower.this.make.VarDef(this.mapVar, mapVarInit));
        }
    }

    TreeMaker make_at(JCDiagnostic.DiagnosticPosition pos) {
        this.make_pos = pos;
        return this.make.m496at(pos);
    }

    JCTree.JCExpression makeLit(Type type, Object value) {
        return this.make.Literal(type.f344tag, value).setType(type.constType(value));
    }

    JCTree.JCExpression makeNull() {
        return makeLit(this.syms.botType, null);
    }

    JCTree.JCNewClass makeNewClass(Type ctype, List<JCTree.JCExpression> args) {
        TreeMaker treeMaker = this.make;
        JCTree.JCNewClass tree = treeMaker.NewClass(null, null, treeMaker.QualIdent(ctype.tsym), args, null);
        tree.constructor = this.f379rs.resolveConstructor(this.make_pos, this.attrEnv, ctype, TreeInfo.types(args), null, false, false);
        tree.type = ctype;
        return tree;
    }

    JCTree.JCUnary makeUnary(int optag, JCTree.JCExpression arg) {
        JCTree.JCUnary tree = this.make.Unary(optag, arg);
        tree.operator = this.f379rs.resolveUnaryOperator(this.make_pos, optag, this.attrEnv, arg.type);
        tree.type = tree.operator.type.mo574getReturnType();
        return tree;
    }

    JCTree.JCBinary makeBinary(int optag, JCTree.JCExpression lhs, JCTree.JCExpression rhs) {
        JCTree.JCBinary tree = this.make.Binary(optag, lhs, rhs);
        tree.operator = this.f379rs.resolveBinaryOperator(this.make_pos, optag, this.attrEnv, lhs.type, rhs.type);
        tree.type = tree.operator.type.mo574getReturnType();
        return tree;
    }

    JCTree.JCAssignOp makeAssignop(int optag, JCTree lhs, JCTree rhs) {
        JCTree.JCAssignOp tree = this.make.Assignop(optag, lhs, rhs);
        tree.operator = this.f379rs.resolveBinaryOperator(this.make_pos, tree.getTag() - 17, this.attrEnv, lhs.type, rhs.type);
        tree.type = lhs.type;
        return tree;
    }

    JCTree.JCExpression makeString(JCTree.JCExpression tree) {
        if (tree.type.f344tag >= 10) {
            return tree;
        }
        Symbol valueOfSym = lookupMethod(tree.m489pos(), this.names.valueOf, this.syms.stringType, List.m508of(tree.type));
        TreeMaker treeMaker = this.make;
        return treeMaker.m494App(treeMaker.QualIdent(valueOfSym), List.m508of(tree));
    }

    Symbol.ClassSymbol makeEmptyClass(long flags, Symbol.ClassSymbol owner) {
        Symbol.ClassSymbol c = this.reader.defineClass(this.names.empty, owner);
        c.flatname = this.f377chk.localClassName(c);
        c.sourcefile = owner.sourcefile;
        c.completer = null;
        c.members_field = new Scope(c);
        c.flags_field = flags;
        Type.ClassType ctype = (Type.ClassType) c.type;
        ctype.supertype_field = this.syms.objectType;
        ctype.interfaces_field = List.m507nil();
        JCTree.JCClassDecl odef = classDef(owner);
        enterSynthetic(odef.m489pos(), c, owner.members());
        this.f377chk.compiled.put(c.flatname, c);
        TreeMaker treeMaker = this.make;
        JCTree.JCClassDecl cdef = treeMaker.ClassDef(treeMaker.Modifiers(flags), this.names.empty, List.m507nil(), null, List.m507nil(), List.m507nil());
        cdef.f539sym = c;
        cdef.type = c.type;
        odef.defs = odef.defs.prepend(cdef);
        return c;
    }

    public void enterSynthetic(JCDiagnostic.DiagnosticPosition pos, Symbol sym, Scope s) {
        s.enter(sym);
    }

    private Name makeSyntheticName(Name name, Scope s) {
        do {
            name = name.append(this.target.syntheticNameChar(), this.names.empty);
        } while (lookupSynthetic(name, s) != null);
        return name;
    }

    void checkConflicts(List<JCTree> translatedTrees) {
        for (JCTree t : translatedTrees) {
            t.accept(this.conflictsChecker);
        }
    }

    private Symbol lookupSynthetic(Name name, Scope s) {
        Symbol sym = s.lookup(name).f338sym;
        if (sym == null || (sym.flags() & 4096) == 0) {
            return null;
        }
        return sym;
    }

    public Symbol.MethodSymbol lookupMethod(JCDiagnostic.DiagnosticPosition pos, Name name, Type qual, List<Type> args) {
        return this.f379rs.resolveInternalMethod(pos, this.attrEnv, qual, name, args, null);
    }

    private Symbol.MethodSymbol lookupConstructor(JCDiagnostic.DiagnosticPosition pos, Type qual, List<Type> args) {
        return this.f379rs.resolveInternalConstructor(pos, this.attrEnv, qual, args, null);
    }

    private Symbol.VarSymbol lookupField(JCDiagnostic.DiagnosticPosition pos, Type qual, Name name) {
        return this.f379rs.resolveInternalField(pos, this.attrEnv, qual, name);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void checkAccessConstructorTags() {
        for (List list = this.accessConstrTags; list.nonEmpty(); list = list.tail) {
            Symbol.ClassSymbol c = (Symbol.ClassSymbol) list.head;
            if (!isTranslatedClassAvailable(c)) {
                TreeMaker treeMaker = this.make;
                JCTree.JCClassDecl cdef = treeMaker.ClassDef(treeMaker.Modifiers(4104L), this.names.empty, List.m507nil(), null, List.m507nil(), List.m507nil());
                cdef.f539sym = c;
                cdef.type = c.type;
                this.translated.append(cdef);
            }
        }
    }

    private boolean isTranslatedClassAvailable(Symbol.ClassSymbol c) {
        for (JCTree tree : this.translated) {
            if (tree.getTag() == 3 && ((JCTree.JCClassDecl) tree).f539sym == c) {
                return true;
            }
        }
        return false;
    }

    private static int accessCode(int bytecode) {
        if (96 <= bytecode && bytecode <= 131) {
            return ((bytecode - 96) * 2) + 12;
        }
        if (bytecode == 256) {
            return 84;
        }
        if (270 <= bytecode && bytecode <= 275) {
            return (((((bytecode - 270) + ByteCodes.lxor) + 2) - 96) * 2) + 12;
        }
        return -1;
    }

    private static int accessCode(JCTree tree, JCTree enclOp) {
        if (enclOp == null) {
            return 0;
        }
        if (enclOp.getTag() == 30 && tree == TreeInfo.skipParens(((JCTree.JCAssign) enclOp).f532lhs)) {
            return 2;
        }
        if (52 <= enclOp.getTag() && enclOp.getTag() <= 55 && tree == TreeInfo.skipParens(((JCTree.JCUnary) enclOp).f546arg)) {
            return ((enclOp.getTag() - 52) * 2) + 4;
        }
        if (76 > enclOp.getTag() || enclOp.getTag() > 92 || tree != TreeInfo.skipParens(((JCTree.JCAssignOp) enclOp).f534lhs)) {
            return 0;
        }
        return accessCode(((Symbol.OperatorSymbol) ((JCTree.JCAssignOp) enclOp).operator).opcode);
    }

    private Symbol.OperatorSymbol binaryAccessOperator(int acode) {
        for (Scope.Entry e = this.syms.predefClass.members().elems; e != null; e = e.sibling) {
            if (e.f338sym instanceof Symbol.OperatorSymbol) {
                Symbol.OperatorSymbol op = (Symbol.OperatorSymbol) e.f338sym;
                if (accessCode(op.opcode) == acode) {
                    return op;
                }
            }
        }
        return null;
    }

    private static int treeTag(Symbol.OperatorSymbol operator) {
        int i = operator.opcode;
        if (i != 256) {
            switch (i) {
                case ByteCodes.iadd:
                case ByteCodes.ladd:
                case ByteCodes.fadd:
                case ByteCodes.dadd:
                    return 88;
                case ByteCodes.isub:
                case ByteCodes.lsub:
                case ByteCodes.fsub:
                case ByteCodes.dsub:
                    return 89;
                case ByteCodes.imul:
                case ByteCodes.lmul:
                case ByteCodes.fmul:
                case ByteCodes.dmul:
                    return 90;
                case ByteCodes.idiv:
                case ByteCodes.ldiv:
                case ByteCodes.fdiv:
                case ByteCodes.ddiv:
                    return 91;
                case ByteCodes.imod:
                case ByteCodes.lmod:
                case ByteCodes.fmod:
                case ByteCodes.dmod:
                    return 92;
                default:
                    switch (i) {
                        case ByteCodes.ishl:
                        case ByteCodes.lshl:
                            return 85;
                        case ByteCodes.ishr:
                        case ByteCodes.lshr:
                            return 86;
                        case ByteCodes.iushr:
                        case ByteCodes.lushr:
                            return 87;
                        case ByteCodes.iand:
                        case 127:
                            return 78;
                        case 128:
                        case ByteCodes.f416lor:
                            return 76;
                        case ByteCodes.ixor:
                        case ByteCodes.lxor:
                            return 77;
                        default:
                            switch (i) {
                                case ByteCodes.ishll:
                                case ByteCodes.lshll:
                                    return 85;
                                case ByteCodes.ishrl:
                                case ByteCodes.lshrl:
                                    return 86;
                                case ByteCodes.iushrl:
                                case ByteCodes.lushrl:
                                    return 87;
                                default:
                                    throw new AssertionError();
                            }
                    }
            }
        }
        return 88;
    }

    Name accessName(int anum, int acode) {
        return this.names.fromString("access" + this.target.syntheticNameChar() + anum + (acode / 10) + (acode % 10));
    }

    Symbol.MethodSymbol accessSymbol(Symbol sym, JCTree tree, JCTree enclOp, boolean protAccess, boolean refSuper) {
        Symbol.ClassSymbol accOwner;
        Symbol vsym;
        Integer anum;
        int acode;
        List<Type> argtypes;
        Type restype;
        List<Type> thrown;
        List<Type> argtypes2;
        List<Type> argtypes3;
        if (refSuper && protAccess) {
            accOwner = (Symbol.ClassSymbol) ((JCTree.JCFieldAccess) tree).selected.type.tsym;
        } else {
            accOwner = accessClass(sym, protAccess, tree);
        }
        if (sym.owner == accOwner) {
            vsym = sym;
        } else {
            Symbol vsym2 = sym.clone(accOwner);
            this.actualSymbols.put(vsym2, sym);
            vsym = vsym2;
        }
        Integer anum2 = this.accessNums.get(vsym);
        if (anum2 != null) {
            anum = anum2;
        } else {
            Integer anum3 = Integer.valueOf(this.accessed.length());
            this.accessNums.put(vsym, anum3);
            this.accessSyms.put(vsym, new Symbol.MethodSymbol[NCODES]);
            this.accessed.append(vsym);
            anum = anum3;
        }
        int i = vsym.kind;
        if (i == 4) {
            acode = accessCode(tree, enclOp);
            if (acode >= 12) {
                Symbol.OperatorSymbol operator = binaryAccessOperator(acode);
                if (operator.opcode == 256) {
                    argtypes2 = List.m508of(this.syms.objectType);
                } else {
                    argtypes2 = operator.type.mo573getParameterTypes().tail;
                }
                argtypes = argtypes2;
            } else if (acode == 2) {
                argtypes = List.m508of(vsym.erasure(this.types));
            } else {
                argtypes = List.m507nil();
            }
            Type restype2 = vsym.erasure(this.types);
            List<Type> thrown2 = List.m507nil();
            restype = restype2;
            thrown = thrown2;
        } else if (i == 16) {
            acode = 0;
            argtypes = vsym.erasure(this.types).mo573getParameterTypes();
            Type restype3 = vsym.erasure(this.types).mo574getReturnType();
            List<Type> thrown3 = vsym.type.mo575getThrownTypes();
            restype = restype3;
            thrown = thrown3;
        } else {
            throw new AssertionError();
        }
        int acode2 = (protAccess && refSuper) ? acode + 1 : acode;
        if ((vsym.flags() & 8) == 0) {
            argtypes3 = argtypes.prepend(vsym.owner.erasure(this.types));
        } else {
            argtypes3 = argtypes;
        }
        Symbol.MethodSymbol[] accessors = this.accessSyms.get(vsym);
        Symbol.MethodSymbol accessor = accessors[acode2];
        if (accessor == null) {
            Symbol.MethodSymbol accessor2 = new Symbol.MethodSymbol(4104L, accessName(anum.intValue(), acode2), new Type.MethodType(argtypes3, restype, thrown, this.syms.methodClass), accOwner);
            enterSynthetic(tree.m489pos(), accessor2, accOwner.members());
            accessors[acode2] = accessor2;
            return accessor2;
        }
        return accessor;
    }

    JCTree.JCExpression accessBase(JCDiagnostic.DiagnosticPosition pos, Symbol sym) {
        if ((sym.flags() & 8) != 0) {
            return access(this.make.m495at(pos.getStartPosition()).QualIdent(sym.owner));
        }
        return makeOwnerThis(pos, sym, true);
    }

    boolean needsPrivateAccess(Symbol sym) {
        if ((sym.flags() & 2) == 0 || sym.owner == this.currentClass) {
            return false;
        }
        if (sym.name == this.names.init && (sym.owner.owner.kind & 20) != 0) {
            sym.flags_field &= -3;
            return false;
        }
        return true;
    }

    boolean needsProtectedAccess(Symbol sym, JCTree tree) {
        if ((sym.flags() & 4) == 0 || sym.owner.owner == this.currentClass.owner || sym.packge() == this.currentClass.packge()) {
            return false;
        }
        if (!this.currentClass.isSubClass(sym.owner, this.types)) {
            return true;
        }
        if ((sym.flags() & 8) == 0 && tree.getTag() == 34 && TreeInfo.name(((JCTree.JCFieldAccess) tree).selected) != this.names._super) {
            return !((JCTree.JCFieldAccess) tree).selected.type.tsym.isSubClass(this.currentClass, this.types);
        }
        return false;
    }

    Symbol.ClassSymbol accessClass(Symbol sym, boolean protAccess, JCTree tree) {
        if (protAccess) {
            Symbol.ClassSymbol c = this.currentClass;
            if (tree.getTag() == 34 && (sym.flags() & 8) == 0) {
                Symbol qualifier = ((JCTree.JCFieldAccess) tree).selected.type.tsym;
                while (!qualifier.isSubClass(c, this.types)) {
                    c = c.owner.enclClass();
                }
                return c;
            }
            while (!c.isSubClass(sym.owner, this.types)) {
                c = c.owner.enclClass();
            }
            return c;
        }
        Symbol qualifier2 = sym.owner;
        return qualifier2.enclClass();
    }

    JCTree.JCExpression access(Symbol sym, JCTree.JCExpression tree, JCTree.JCExpression enclOp, boolean refSuper) {
        boolean z;
        JCTree.JCExpression jCExpression;
        JCTree.JCExpression base;
        List<JCTree.JCExpression> args;
        Object cv;
        Symbol sym2 = sym;
        JCTree.JCExpression tree2 = tree;
        while (true) {
            z = false;
            if (sym2.kind != 4 || sym2.owner.kind != 16 || sym2.owner.enclClass() == this.currentClass) {
                break;
            }
            Object cv2 = ((Symbol.VarSymbol) sym2).getConstValue();
            if (cv2 != null) {
                this.make.m495at(tree2.f531pos);
                return makeLit(sym2.type, cv2);
            }
            sym2 = this.proxies.lookup(proxyName(sym2.name)).f338sym;
            if (sym2 != null && (sym2.flags_field & 16) != 0) {
                z = true;
            }
            Assert.check(z);
            tree2 = this.make.m495at(tree2.f531pos).Ident(sym2);
        }
        JCTree.JCExpression base2 = tree2.getTag() == 34 ? ((JCTree.JCFieldAccess) tree2).selected : null;
        int i = sym2.kind;
        if (i == 2) {
            if (sym2.owner.kind != 1) {
                Name flatname = Convert.shortName(sym2.flatName());
                while (base2 != null && TreeInfo.symbol(base2) != null && TreeInfo.symbol(base2).kind != 1) {
                    if (base2.getTag() == 34) {
                        jCExpression = ((JCTree.JCFieldAccess) base2).selected;
                    } else {
                        jCExpression = null;
                    }
                    base2 = jCExpression;
                }
                if (tree2.getTag() == 35) {
                    ((JCTree.JCIdent) tree2).name = flatname;
                    return tree2;
                }
                if (base2 == null) {
                    JCTree.JCExpression tree3 = this.make.m495at(tree2.f531pos).Ident(sym2);
                    ((JCTree.JCIdent) tree3).name = flatname;
                    return tree3;
                }
                ((JCTree.JCFieldAccess) tree2).selected = base2;
                ((JCTree.JCFieldAccess) tree2).name = flatname;
                return tree2;
            }
            return tree2;
        }
        if ((i == 4 || i == 16) && sym2.owner.kind == 2) {
            boolean protAccess = (refSuper && !needsPrivateAccess(sym2)) || needsProtectedAccess(sym2, tree2);
            boolean accReq = protAccess || needsPrivateAccess(sym2);
            if (base2 == null && sym2.owner != this.syms.predefClass && !sym2.isMemberOf(this.currentClass, this.types)) {
                z = true;
            }
            boolean baseReq = z;
            if (accReq || baseReq) {
                this.make.m495at(tree2.f531pos);
                if (sym2.kind == 4 && (cv = ((Symbol.VarSymbol) sym2).getConstValue()) != null) {
                    return makeLit(sym2.type, cv);
                }
                if (accReq) {
                    List<JCTree.JCExpression> args2 = List.m507nil();
                    if ((sym2.flags() & 8) != 0) {
                        base = base2;
                        args = args2;
                    } else {
                        if (base2 == null) {
                            base2 = makeOwnerThis(tree2.m489pos(), sym2, true);
                        }
                        base = null;
                        args = args2.prepend(base2);
                    }
                    Symbol access = accessSymbol(sym2, tree2, enclOp, protAccess, refSuper);
                    TreeMaker treeMaker = this.make;
                    JCTree.JCExpression receiver = treeMaker.Select(base != null ? base : treeMaker.QualIdent(access.owner), access);
                    return this.make.m494App(receiver, args);
                }
                if (baseReq) {
                    return this.make.m495at(tree2.f531pos).Select(accessBase(tree2.m489pos(), sym2), sym2).setType(tree2.type);
                }
                return tree2;
            }
            return tree2;
        }
        return tree2;
    }

    JCTree.JCExpression access(JCTree.JCExpression tree) {
        Symbol sym = TreeInfo.symbol(tree);
        return sym == null ? tree : access(sym, tree, null, false);
    }

    Symbol accessConstructor(JCDiagnostic.DiagnosticPosition pos, Symbol constr) {
        List<Type> argtypes;
        if (needsPrivateAccess(constr)) {
            Symbol.ClassSymbol accOwner = constr.owner.enclClass();
            Symbol.MethodSymbol aconstr = this.accessConstrs.get(constr);
            if (aconstr == null) {
                List<Type> argtypes2 = constr.type.mo573getParameterTypes();
                if ((accOwner.flags_field & 16384) == 0) {
                    argtypes = argtypes2;
                } else {
                    argtypes = argtypes2.prepend(this.syms.intType).prepend(this.syms.stringType);
                }
                Symbol.MethodSymbol aconstr2 = new Symbol.MethodSymbol(4096L, this.names.init, new Type.MethodType(argtypes.append(accessConstructorTag().erasure(this.types)), constr.type.mo574getReturnType(), constr.type.mo575getThrownTypes(), this.syms.methodClass), accOwner);
                enterSynthetic(pos, aconstr2, accOwner.members());
                this.accessConstrs.put(constr, aconstr2);
                this.accessed.append(constr);
                return aconstr2;
            }
            return aconstr;
        }
        return constr;
    }

    Symbol.ClassSymbol accessConstructorTag() {
        Symbol.ClassSymbol topClass = this.currentClass.outermostClass();
        Name flatname = this.names.fromString("" + ((Object) topClass.getQualifiedName()) + this.target.syntheticNameChar() + "1");
        Symbol.ClassSymbol ctag = this.f377chk.compiled.get(flatname);
        if (ctag == null) {
            ctag = makeEmptyClass(4104L, topClass);
        }
        this.accessConstrTags = this.accessConstrTags.prepend(ctag);
        return ctag;
    }

    void makeAccessible(Symbol sym) {
        JCTree.JCClassDecl cdef = classDef(sym.owner.enclClass());
        if (cdef == null) {
            Assert.error("class def not found: " + sym + " in " + sym.owner);
        }
        if (sym.name == this.names.init) {
            cdef.defs = cdef.defs.prepend(accessConstructorDef(cdef.f531pos, sym, this.accessConstrs.get(sym)));
            return;
        }
        Symbol.MethodSymbol[] accessors = this.accessSyms.get(sym);
        for (int i = 0; i < NCODES; i++) {
            if (accessors[i] != null) {
                cdef.defs = cdef.defs.prepend(accessDef(cdef.f531pos, sym, accessors[i], i));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [A, com.sun.tools.javac.tree.JCTree$JCExpression] */
    JCTree accessDef(int pos, Symbol vsym, Symbol.MethodSymbol accessor, int acode) {
        JCTree.JCExpression ref;
        List<JCTree.JCExpression> args;
        JCTree.JCStatement stat;
        JCTree.JCExpression expr;
        this.currentClass = vsym.owner.enclClass();
        this.make.m495at(pos);
        JCTree.JCMethodDecl md = this.make.MethodDef(accessor, null);
        Symbol sym = this.actualSymbols.get(vsym);
        if (sym == null) {
            sym = vsym;
        }
        if ((sym.flags() & 8) != 0) {
            ref = this.make.Ident(sym);
            args = this.make.Idents(md.params);
        } else {
            TreeMaker treeMaker = this.make;
            ref = treeMaker.Select(treeMaker.Ident(md.params.head), sym);
            args = this.make.Idents(md.params.tail);
        }
        if (sym.kind == 4) {
            int acode1 = acode - (acode & 1);
            if (acode1 == 0) {
                expr = ref;
            } else if (acode1 == 2) {
                expr = this.make.Assign(ref, args.head);
            } else if (acode1 == 4 || acode1 == 6 || acode1 == 8 || acode1 == 10) {
                expr = makeUnary(((acode1 - 4) >> 1) + 52, ref);
            } else {
                expr = this.make.Assignop(treeTag(binaryAccessOperator(acode1)), ref, args.head);
                ((JCTree.JCAssignOp) expr).operator = binaryAccessOperator(acode1);
            }
            stat = this.make.Return(expr.setType(sym.type));
        } else {
            TreeMaker treeMaker2 = this.make;
            stat = treeMaker2.Call(treeMaker2.m494App(ref, args));
        }
        md.body = this.make.Block(0L, List.m508of(stat));
        for (List list = md.params; list.nonEmpty(); list = list.tail) {
            ((JCTree.JCVariableDecl) list.head).vartype = access(((JCTree.JCVariableDecl) list.head).vartype);
        }
        md.restype = access(md.restype);
        for (List list2 = md.thrown; list2.nonEmpty(); list2 = list2.tail) {
            list2.head = access((JCTree.JCExpression) list2.head);
        }
        return md;
    }

    JCTree accessConstructorDef(int pos, Symbol constr, Symbol.MethodSymbol accessor) {
        this.make.m495at(pos);
        JCTree.JCMethodDecl md = this.make.MethodDef(accessor, accessor.externalType(this.types), null);
        JCTree.JCIdent callee = this.make.Ident(this.names._this);
        callee.f543sym = constr;
        callee.type = constr.type;
        TreeMaker treeMaker = this.make;
        md.body = treeMaker.Block(0L, List.m508of(treeMaker.Call(treeMaker.m494App(callee, treeMaker.Idents(md.params.reverse().tail.reverse())))));
        return md;
    }

    Name proxyName(Name name) {
        return this.names.fromString("val" + this.target.syntheticNameChar() + ((Object) name));
    }

    /* JADX WARN: Multi-variable type inference failed */
    List<JCTree.JCVariableDecl> freevarDefs(int pos, List<Symbol.VarSymbol> freevars, Symbol owner) {
        long flags = 4112;
        if (owner.kind == 2 && this.target.usePrivateSyntheticFields()) {
            flags = 4112 | 2;
        }
        List<JCTree.JCVariableDecl> defs = List.m507nil();
        List<JCTree.JCVariableDecl> defs2 = defs;
        for (List list = freevars; list.nonEmpty(); list = list.tail) {
            Symbol.VarSymbol v = (Symbol.VarSymbol) list.head;
            Symbol.VarSymbol proxy = new Symbol.VarSymbol(flags, proxyName(v.name), v.erasure(this.types), owner);
            this.proxies.enter(proxy);
            JCTree.JCVariableDecl vd = this.make.m495at(pos).VarDef(proxy, null);
            vd.vartype = access(vd.vartype);
            defs2 = defs2.prepend(vd);
        }
        return defs2;
    }

    Name outerThisName(Type type, Symbol owner) {
        Type t = type.getEnclosingType();
        int nestingLevel = 0;
        while (t.f344tag == 10) {
            t = t.getEnclosingType();
            nestingLevel++;
        }
        Name result = this.names.fromString("this" + this.target.syntheticNameChar() + nestingLevel);
        while (owner.kind == 2 && ((Symbol.ClassSymbol) owner).members().lookup(result).scope != null) {
            result = this.names.fromString(result.toString() + this.target.syntheticNameChar());
        }
        return result;
    }

    JCTree.JCVariableDecl outerThisDef(int pos, Symbol owner) {
        long flags = 4112;
        if (owner.kind == 2 && this.target.usePrivateSyntheticFields()) {
            flags = 4112 | 2;
        }
        Type target = this.types.erasure(owner.enclClass().type.getEnclosingType());
        Symbol.VarSymbol outerThis = new Symbol.VarSymbol(flags, outerThisName(target, owner), target, owner);
        this.outerThisStack = this.outerThisStack.prepend(outerThis);
        JCTree.JCVariableDecl vd = this.make.m495at(pos).VarDef(outerThis, null);
        vd.vartype = access(vd.vartype);
        return vd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    List<JCTree.JCExpression> loadFreevars(JCDiagnostic.DiagnosticPosition pos, List<Symbol.VarSymbol> freevars) {
        List<JCTree.JCExpression> args = List.m507nil();
        for (List list = freevars; list.nonEmpty(); list = list.tail) {
            args = args.prepend(loadFreevar(pos, (Symbol.VarSymbol) list.head));
        }
        return args;
    }

    JCTree.JCExpression loadFreevar(JCDiagnostic.DiagnosticPosition pos, Symbol.VarSymbol v) {
        return access(v, this.make.m496at(pos).Ident(v), null, false);
    }

    JCTree.JCExpression makeThis(JCDiagnostic.DiagnosticPosition pos, Symbol.TypeSymbol c) {
        if (this.currentClass == c) {
            return this.make.m496at(pos).This(c.erasure(this.types));
        }
        return makeOuterThis(pos, c);
    }

    JCTree makeTwrTry(JCTree.JCTry tree) {
        make_at(tree.m489pos());
        this.twrVars = this.twrVars.mo450dup();
        JCTree.JCBlock twrBlock = makeTwrBlock(tree.resources, tree.body, 0);
        if (tree.catchers.isEmpty() && tree.finalizer == null) {
            this.result = translate(twrBlock);
        } else {
            this.result = translate(this.make.mo491Try(twrBlock, tree.catchers, tree.finalizer));
        }
        this.twrVars = this.twrVars.leave();
        return this.result;
    }

    private JCTree.JCBlock makeTwrBlock(List<JCTree> resources, JCTree.JCBlock block, int depth) {
        JCTree.JCExpression expr;
        if (resources.isEmpty()) {
            return block;
        }
        ListBuffer<JCTree.JCStatement> stats = new ListBuffer<>();
        JCTree resource = resources.head;
        if (resource instanceof JCTree.JCVariableDecl) {
            JCTree.JCVariableDecl var = (JCTree.JCVariableDecl) resource;
            expr = this.make.Ident(var.f547sym).setType(resource.type);
            stats.add(var);
        } else {
            Assert.check(resource instanceof JCTree.JCExpression);
            Symbol.VarSymbol syntheticTwrVar = new Symbol.VarSymbol(4112L, makeSyntheticName(this.names.fromString("twrVar" + depth), this.twrVars), resource.type.f344tag == 17 ? this.syms.autoCloseableType : resource.type, this.currentMethodSym);
            this.twrVars.enter(syntheticTwrVar);
            JCTree.JCVariableDecl syntheticTwrVarDecl = this.make.VarDef(syntheticTwrVar, (JCTree.JCExpression) resource);
            expr = this.make.Ident(syntheticTwrVar);
            stats.add(syntheticTwrVarDecl);
        }
        Symbol.VarSymbol primaryException = new Symbol.VarSymbol(4096L, makeSyntheticName(this.names.fromString("primaryException" + depth), this.twrVars), this.syms.throwableType, this.currentMethodSym);
        this.twrVars.enter(primaryException);
        JCTree.JCVariableDecl primaryExceptionTreeDecl = this.make.VarDef(primaryException, makeNull());
        stats.add(primaryExceptionTreeDecl);
        Symbol.VarSymbol param = new Symbol.VarSymbol(4112L, this.names.fromString("t" + this.target.syntheticNameChar()), this.syms.throwableType, this.currentMethodSym);
        JCTree.JCVariableDecl paramTree = this.make.VarDef(param, null);
        TreeMaker treeMaker = this.make;
        JCTree.JCStatement assign = treeMaker.Assignment(primaryException, treeMaker.Ident(param));
        TreeMaker treeMaker2 = this.make;
        JCTree.JCStatement rethrowStat = treeMaker2.Throw(treeMaker2.Ident(param));
        JCTree.JCBlock catchBlock = this.make.Block(0L, List.m509of(assign, rethrowStat));
        JCTree.JCCatch catchClause = this.make.Catch(paramTree, catchBlock);
        int oldPos = this.make.f550pos;
        this.make.m495at(TreeInfo.endPos(block));
        JCTree.JCBlock finallyClause = makeTwrFinallyClause(primaryException, expr);
        this.make.m495at(oldPos);
        JCTree.JCTry outerTry = this.make.mo491Try(makeTwrBlock(resources.tail, block, depth + 1), List.m508of(catchClause), finallyClause);
        stats.add(outerTry);
        return this.make.Block(0L, stats.toList());
    }

    private JCTree.JCBlock makeTwrFinallyClause(Symbol primaryException, JCTree.JCExpression resource) {
        Symbol.VarSymbol catchException = new Symbol.VarSymbol(0L, this.make.paramName(2), this.syms.throwableType, this.currentMethodSym);
        TreeMaker treeMaker = this.make;
        JCTree.JCStatement addSuppressionStatement = treeMaker.Exec(makeCall(treeMaker.Ident(primaryException), this.names.addSuppressed, List.m508of(this.make.Ident(catchException))));
        JCTree.JCBlock tryBlock = this.make.Block(0L, List.m508of(makeResourceCloseInvocation(resource)));
        JCTree.JCVariableDecl catchExceptionDecl = this.make.VarDef(catchException, null);
        JCTree.JCBlock catchBlock = this.make.Block(0L, List.m508of(addSuppressionStatement));
        List<JCTree.JCCatch> catchClauses = List.m508of(this.make.Catch(catchExceptionDecl, catchBlock));
        JCTree.JCTry tryTree = this.make.mo491Try(tryBlock, catchClauses, null);
        TreeMaker treeMaker2 = this.make;
        JCTree.JCIf closeIfStatement = treeMaker2.mo490If(makeNonNullCheck(treeMaker2.Ident(primaryException)), tryTree, makeResourceCloseInvocation(resource));
        TreeMaker treeMaker3 = this.make;
        return treeMaker3.Block(0L, List.m508of(treeMaker3.mo490If(makeNonNullCheck(resource), closeIfStatement, null)));
    }

    private JCTree.JCStatement makeResourceCloseInvocation(JCTree.JCExpression resource) {
        JCTree.JCExpression resourceClose = makeCall(resource, this.names.close, List.m507nil());
        return this.make.Exec(resourceClose);
    }

    private JCTree.JCExpression makeNonNullCheck(JCTree.JCExpression expression) {
        return makeBinary(63, expression, makeNull());
    }

    /* JADX WARN: Multi-variable type inference failed */
    JCTree.JCExpression makeOuterThis(JCDiagnostic.DiagnosticPosition pos, Symbol.TypeSymbol c) {
        Symbol.VarSymbol ot;
        List list = this.outerThisStack;
        if (list.isEmpty()) {
            this.f378log.error(pos, "no.encl.instance.of.type.in.scope", c);
            Assert.error();
            return makeNull();
        }
        Symbol.VarSymbol ot2 = (Symbol.VarSymbol) list.head;
        JCTree.JCExpression tree = access(this.make.m496at(pos).Ident(ot2));
        Symbol.TypeSymbol otc = ot2.type.tsym;
        while (otc != c) {
            do {
                list = list.tail;
                if (list.isEmpty()) {
                    this.f378log.error(pos, "no.encl.instance.of.type.in.scope", c);
                    Assert.error();
                    return tree;
                }
                ot = (Symbol.VarSymbol) list.head;
            } while (ot.owner != otc);
            if (otc.owner.kind != 1 && !otc.hasOuterInstance()) {
                this.f377chk.earlyRefError(pos, c);
                Assert.error();
                return makeNull();
            }
            tree = access(this.make.m496at(pos).Select(tree, ot));
            otc = ot.type.tsym;
        }
        return tree;
    }

    JCTree.JCExpression makeOwnerThis(JCDiagnostic.DiagnosticPosition pos, Symbol sym, boolean preciseMatch) {
        Symbol c = sym.owner;
        Symbol.ClassSymbol classSymbol = this.currentClass;
        if (!preciseMatch ? classSymbol.isSubClass(sym.owner, this.types) : sym.isMemberOf(classSymbol, this.types)) {
            return this.make.m496at(pos).This(c.erasure(this.types));
        }
        return makeOwnerThisN(pos, sym, preciseMatch);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    JCTree.JCExpression makeOwnerThisN(JCDiagnostic.DiagnosticPosition pos, Symbol sym, boolean preciseMatch) {
        Symbol.VarSymbol ot;
        Symbol c = sym.owner;
        List list = this.outerThisStack;
        if (list.isEmpty()) {
            this.f378log.error(pos, "no.encl.instance.of.type.in.scope", c);
            Assert.error();
            return makeNull();
        }
        Symbol.VarSymbol ot2 = (Symbol.VarSymbol) list.head;
        JCTree.JCExpression tree = access(this.make.m496at(pos).Ident(ot2));
        Symbol.TypeSymbol otc = ot2.type.tsym;
        while (true) {
            if (preciseMatch) {
                if (sym.isMemberOf(otc, this.types)) {
                    break;
                }
                do {
                    list = list.tail;
                    if (list.isEmpty()) {
                        this.f378log.error(pos, "no.encl.instance.of.type.in.scope", c);
                        Assert.error();
                        return tree;
                    }
                    ot = (Symbol.VarSymbol) list.head;
                } while (ot.owner != otc);
                tree = access(this.make.m496at(pos).Select(tree, ot));
                otc = ot.type.tsym;
            } else {
                if (otc.isSubClass(sym.owner, this.types)) {
                    break;
                }
                do {
                    list = list.tail;
                    if (list.isEmpty()) {
                        this.f378log.error(pos, "no.encl.instance.of.type.in.scope", c);
                        Assert.error();
                        return tree;
                    }
                    ot = (Symbol.VarSymbol) list.head;
                } while (ot.owner != otc);
                tree = access(this.make.m496at(pos).Select(tree, ot));
                otc = ot.type.tsym;
            }
        }
        return tree;
    }

    JCTree.JCStatement initField(int pos, Name name) {
        Scope.Entry e = this.proxies.lookup(name);
        Symbol rhs = e.f338sym;
        Assert.check(rhs.owner.kind == 16);
        Symbol lhs = e.next().f338sym;
        Assert.check(rhs.owner.owner == lhs.owner);
        this.make.m495at(pos);
        TreeMaker treeMaker = this.make;
        return treeMaker.Exec(treeMaker.Assign(treeMaker.Select(treeMaker.This(lhs.owner.erasure(this.types)), lhs), this.make.Ident(rhs)).setType(lhs.erasure(this.types)));
    }

    JCTree.JCStatement initOuterThis(int pos) {
        Symbol.VarSymbol rhs = this.outerThisStack.head;
        Assert.check(rhs.owner.kind == 16);
        Symbol.VarSymbol lhs = this.outerThisStack.tail.head;
        Assert.check(rhs.owner.owner == lhs.owner);
        this.make.m495at(pos);
        TreeMaker treeMaker = this.make;
        return treeMaker.Exec(treeMaker.Assign(treeMaker.Select(treeMaker.This(lhs.owner.erasure(this.types)), lhs), this.make.Ident(rhs)).setType(lhs.erasure(this.types)));
    }

    public Symbol.ClassSymbol outerCacheClass() {
        Symbol.ClassSymbol clazz = this.outermostClassDef.f539sym;
        if ((clazz.flags() & 512) == 0 && !this.target.useInnerCacheClass()) {
            return clazz;
        }
        Scope s = clazz.members();
        for (Scope.Entry e = s.elems; e != null; e = e.sibling) {
            if (e.f338sym.kind == 2 && e.f338sym.name == this.names.empty && (e.f338sym.flags() & 512) == 0) {
                return (Symbol.ClassSymbol) e.f338sym;
            }
        }
        return makeEmptyClass(4104L, clazz);
    }

    private Symbol.MethodSymbol classDollarSym(JCDiagnostic.DiagnosticPosition pos) {
        Symbol.ClassSymbol outerCacheClass = outerCacheClass();
        Symbol.MethodSymbol classDollarSym = (Symbol.MethodSymbol) lookupSynthetic(this.classDollar, outerCacheClass.members());
        if (classDollarSym == null) {
            classDollarSym = new Symbol.MethodSymbol(4104L, this.classDollar, new Type.MethodType(List.m508of(this.syms.stringType), this.types.erasure(this.syms.classType), List.m507nil(), this.syms.methodClass), outerCacheClass);
            enterSynthetic(pos, classDollarSym, outerCacheClass.members());
            JCTree.JCMethodDecl md = this.make.MethodDef(classDollarSym, null);
            try {
                md.body = classDollarSymBody(pos, md);
            } catch (Symbol.CompletionFailure ex) {
                md.body = this.make.Block(0L, List.m507nil());
                this.f377chk.completionError(pos, ex);
            }
            JCTree.JCClassDecl outerCacheClassDef = classDef(outerCacheClass);
            outerCacheClassDef.defs = outerCacheClassDef.defs.prepend(md);
        }
        return classDollarSym;
    }

    JCTree.JCBlock classDollarSymBody(JCDiagnostic.DiagnosticPosition pos, JCTree.JCMethodDecl md) {
        long j;
        JCTree.JCBlock returnResult;
        JCTree throwExpr;
        Symbol.MethodSymbol classDollarSym = md.f544sym;
        Symbol.ClassSymbol outerCacheClass = (Symbol.ClassSymbol) classDollarSym.owner;
        if (this.target.classLiteralsNoInit()) {
            Symbol.VarSymbol clsym = new Symbol.VarSymbol(4104L, this.names.fromString("cl" + this.target.syntheticNameChar()), this.syms.classLoaderType, outerCacheClass);
            enterSynthetic(pos, clsym, outerCacheClass.members());
            JCTree.JCVariableDecl cldef = this.make.VarDef(clsym, null);
            JCTree.JCClassDecl outerCacheClassDef = classDef(outerCacheClass);
            outerCacheClassDef.defs = outerCacheClassDef.defs.prepend(cldef);
            TreeMaker treeMaker = this.make;
            JCTree.JCNewArray newcache = treeMaker.NewArray(treeMaker.Type(outerCacheClass.type), List.m508of(this.make.Literal(4, 0).setType(this.syms.intType)), null);
            newcache.type = new Type.ArrayType(this.types.erasure(outerCacheClass.type), this.syms.arrayClass);
            Symbol.MethodSymbol forNameSym = lookupMethod(this.make_pos, this.names.forName, this.types.erasure(this.syms.classType), List.m510of(this.syms.stringType, this.syms.booleanType, this.syms.classLoaderType));
            TreeMaker treeMaker2 = this.make;
            JCTree.JCBinary jCBinaryMakeBinary = makeBinary(62, treeMaker2.Ident(clsym), makeNull());
            TreeMaker treeMaker3 = this.make;
            JCTree.JCExpression clvalue = treeMaker2.Conditional(jCBinaryMakeBinary, treeMaker3.Assign(treeMaker3.Ident(clsym), makeCall(makeCall(makeCall(newcache, this.names.getClass, List.m507nil()), this.names.getComponentType, List.m507nil()), this.names.getClassLoader, List.m507nil())).setType(this.syms.classLoaderType), this.make.Ident(clsym)).setType(this.syms.classLoaderType);
            List<JCTree.JCExpression> args = List.m510of((JCTree.JCExpression) this.make.Ident(md.params.head.f547sym), makeLit(this.syms.booleanType, 0), clvalue);
            TreeMaker treeMaker4 = this.make;
            JCTree.JCBlock returnResult2 = treeMaker4.Block(0L, List.m508of(treeMaker4.Call(treeMaker4.m494App(treeMaker4.Ident(forNameSym), args))));
            returnResult = returnResult2;
            j = 0;
        } else {
            Symbol.MethodSymbol forNameSym2 = lookupMethod(this.make_pos, this.names.forName, this.types.erasure(this.syms.classType), List.m508of(this.syms.stringType));
            TreeMaker treeMaker5 = this.make;
            j = 0;
            returnResult = treeMaker5.Block(0L, List.m508of(treeMaker5.Call(treeMaker5.m494App(treeMaker5.QualIdent(forNameSym2), List.m508of(this.make.Ident(md.params.head.f547sym))))));
        }
        long j2 = j;
        Symbol.VarSymbol catchParam = new Symbol.VarSymbol(0L, this.make.paramName(1), this.syms.classNotFoundExceptionType, classDollarSym);
        if (this.target.hasInitCause()) {
            JCTree.JCMethodInvocation throwExpr2 = makeCall(makeNewClass(this.syms.noClassDefFoundErrorType, List.m507nil()), this.names.initCause, List.m508of(this.make.Ident(catchParam)));
            throwExpr = this.make.Throw(throwExpr2);
        } else {
            Symbol.MethodSymbol getMessageSym = lookupMethod(this.make_pos, this.names.getMessage, this.syms.classNotFoundExceptionType, List.m507nil());
            TreeMaker treeMaker6 = this.make;
            Type type = this.syms.noClassDefFoundErrorType;
            TreeMaker treeMaker7 = this.make;
            throwExpr = treeMaker6.Throw(makeNewClass(type, List.m508of(treeMaker7.m494App(treeMaker7.Select(treeMaker7.Ident(catchParam), getMessageSym), List.m507nil()))));
        }
        JCTree.JCBlock rethrowStmt = this.make.Block(j2, List.m508of(throwExpr));
        TreeMaker treeMaker8 = this.make;
        JCTree.JCCatch catchBlock = treeMaker8.Catch(treeMaker8.VarDef(catchParam, null), rethrowStmt);
        JCTree.JCStatement tryCatch = this.make.mo491Try(returnResult, List.m508of(catchBlock), null);
        return this.make.Block(j2, List.m508of(tryCatch));
    }

    private JCTree.JCMethodInvocation makeCall(JCTree.JCExpression left, Name name, List<JCTree.JCExpression> args) {
        Assert.checkNonNull(left.type);
        Symbol funcsym = lookupMethod(this.make_pos, name, left.type, TreeInfo.types(args));
        TreeMaker treeMaker = this.make;
        return treeMaker.m494App(treeMaker.Select(left, funcsym), args);
    }

    private Name cacheName(String sig) {
        StringBuffer buf;
        StringBuffer buf2 = new StringBuffer();
        if (sig.startsWith("[")) {
            buf = buf2.append("array");
            while (sig.startsWith("[")) {
                buf = buf.append(this.target.syntheticNameChar());
                sig = sig.substring(1);
            }
            if (sig.startsWith("L")) {
                sig = sig.substring(0, sig.length() - 1);
            }
        } else {
            buf = buf2.append("class" + this.target.syntheticNameChar());
        }
        return this.names.fromString(buf.append(sig.replace('.', this.target.syntheticNameChar())).toString());
    }

    private Symbol.VarSymbol cacheSym(JCDiagnostic.DiagnosticPosition pos, String sig) {
        Symbol.ClassSymbol outerCacheClass = outerCacheClass();
        Name cname = cacheName(sig);
        Symbol.VarSymbol cacheSym = (Symbol.VarSymbol) lookupSynthetic(cname, outerCacheClass.members());
        if (cacheSym == null) {
            Symbol.VarSymbol cacheSym2 = new Symbol.VarSymbol(4104L, cname, this.types.erasure(this.syms.classType), outerCacheClass);
            enterSynthetic(pos, cacheSym2, outerCacheClass.members());
            JCTree.JCVariableDecl cacheDef = this.make.VarDef(cacheSym2, null);
            JCTree.JCClassDecl outerCacheClassDef = classDef(outerCacheClass);
            outerCacheClassDef.defs = outerCacheClassDef.defs.prepend(cacheDef);
            return cacheSym2;
        }
        return cacheSym;
    }

    private JCTree.JCExpression classOf(JCTree clazz) {
        return classOfType(clazz.type, clazz.m489pos());
    }

    private JCTree.JCExpression classOfType(Type type, JCDiagnostic.DiagnosticPosition pos) {
        switch (type.f344tag) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                Symbol.ClassSymbol c = this.types.boxedClass(type);
                Resolve resolve = this.f379rs;
                Symbol typeSym = resolve.access(resolve.findIdentInType(this.attrEnv, c.type, this.names.TYPE, 4), pos, c.type, this.names.TYPE, true);
                if (typeSym.kind == 4) {
                    ((Symbol.VarSymbol) typeSym).getConstValue();
                }
                return this.make.QualIdent(typeSym);
            case 10:
            case 11:
                if (this.target.hasClassLiterals()) {
                    Symbol.VarSymbol sym = new Symbol.VarSymbol(25L, this.names._class, this.syms.classType, type.tsym);
                    return make_at(pos).Select(this.make.Type(type), sym);
                }
                String sig = this.writer.xClassName(type).toString().replace('/', '.');
                Symbol cs = cacheSym(pos, sig);
                TreeMaker treeMakerMake_at = make_at(pos);
                JCTree.JCBinary jCBinaryMakeBinary = makeBinary(62, this.make.Ident(cs), makeNull());
                TreeMaker treeMaker = this.make;
                JCTree.JCIdent jCIdentIdent = treeMaker.Ident(cs);
                TreeMaker treeMaker2 = this.make;
                return treeMakerMake_at.Conditional(jCBinaryMakeBinary, treeMaker.Assign(jCIdentIdent, treeMaker2.m494App(treeMaker2.Ident(classDollarSym(pos)), List.m508of(this.make.Literal(10, sig).setType(this.syms.stringType)))).setType(this.types.erasure(this.syms.classType)), this.make.Ident(cs)).setType(this.types.erasure(this.syms.classType));
            default:
                throw new AssertionError();
        }
    }

    private JCTree.JCExpression assertFlagTest(JCDiagnostic.DiagnosticPosition pos) {
        Symbol.ClassSymbol outermostClass = this.outermostClassDef.f539sym;
        Symbol.ClassSymbol container = this.currentClass;
        Symbol.VarSymbol assertDisabledSym = (Symbol.VarSymbol) lookupSynthetic(this.dollarAssertionsDisabled, container.members());
        if (assertDisabledSym == null) {
            assertDisabledSym = new Symbol.VarSymbol(4120L, this.dollarAssertionsDisabled, this.syms.booleanType, container);
            enterSynthetic(pos, assertDisabledSym, container.members());
            Symbol.MethodSymbol desiredAssertionStatusSym = lookupMethod(pos, this.names.desiredAssertionStatus, this.types.erasure(this.syms.classType), List.m507nil());
            JCTree.JCClassDecl containerDef = classDef(container);
            make_at(containerDef.m489pos());
            TreeMaker treeMaker = this.make;
            JCTree.JCUnary notStatus = makeUnary(50, treeMaker.m493App(treeMaker.Select(classOfType(this.types.erasure(outermostClass.type), containerDef.m489pos()), desiredAssertionStatusSym)));
            JCTree.JCVariableDecl assertDisabledDef = this.make.VarDef(assertDisabledSym, notStatus);
            containerDef.defs = containerDef.defs.prepend(assertDisabledDef);
        }
        make_at(pos);
        return makeUnary(50, this.make.Ident(assertDisabledSym));
    }

    JCTree abstractRval(JCTree rval, Type type, TreeBuilder builder) {
        JCTree rval2 = TreeInfo.skipParens(rval);
        int tag = rval2.getTag();
        if (tag == 35) {
            JCTree.JCIdent id = (JCTree.JCIdent) rval2;
            if ((id.f543sym.flags() & 16) != 0 && id.f543sym.owner.kind == 16) {
                return builder.build(rval2);
            }
        } else if (tag == 36) {
            return builder.build(rval2);
        }
        Symbol.VarSymbol var = new Symbol.VarSymbol(4112L, this.names.fromString(this.target.syntheticNameChar() + "" + rval2.hashCode()), type, this.currentMethodSym);
        JCTree.JCVariableDecl def = this.make.VarDef(var, (JCTree.JCExpression) convert(rval2, type));
        JCTree built = builder.build(this.make.Ident(var));
        JCTree res = this.make.LetExpr(def, built);
        res.type = built.type;
        return res;
    }

    JCTree abstractRval(JCTree rval, TreeBuilder builder) {
        return abstractRval(rval, rval.type, builder);
    }

    JCTree abstractLval(JCTree lval, final TreeBuilder builder) {
        JCTree lval2 = TreeInfo.skipParens(lval);
        switch (lval2.getTag()) {
            case 31:
                return abstractLval(((JCTree.JCTypeCast) lval2).expr, builder);
            case 32:
            default:
                throw new AssertionError(lval2);
            case 33:
                final JCTree.JCArrayAccess i = (JCTree.JCArrayAccess) lval2;
                return abstractRval(i.indexed, new TreeBuilder() {
                    @Override
                    public JCTree build(final JCTree indexed) {
                        return Lower.this.abstractRval(i.index, Lower.this.syms.intType, new TreeBuilder() {
                            @Override
                            public JCTree build(JCTree index) {
                                JCTree newLval = Lower.this.make.Indexed((JCTree.JCExpression) indexed, (JCTree.JCExpression) index);
                                newLval.setType(i.type);
                                return builder.build(newLval);
                            }
                        });
                    }
                });
            case 34:
                final JCTree.JCFieldAccess s = (JCTree.JCFieldAccess) lval2;
                TreeInfo.skipParens(s.selected);
                Symbol lid = TreeInfo.symbol(s.selected);
                return (lid == null || lid.kind != 2) ? abstractRval(s.selected, new TreeBuilder() {
                    @Override
                    public JCTree build(JCTree selected) {
                        return builder.build(Lower.this.make.Select((JCTree.JCExpression) selected, s.f542sym));
                    }
                }) : builder.build(lval2);
            case 35:
                return builder.build(lval2);
        }
    }

    JCTree makeComma(JCTree expr1, final JCTree expr2) {
        return abstractRval(expr1, new TreeBuilder() {
            @Override
            public JCTree build(JCTree discarded) {
                return expr2;
            }
        });
    }

    @Override
    public <T extends JCTree> T translate(T t) {
        Integer numRemove;
        if (t == null) {
            return null;
        }
        make_at(t.m489pos());
        T t2 = (T) super.translate(t);
        Map<JCTree, Integer> map = this.endPositions;
        if (map != null && t2 != t && (numRemove = map.remove(t)) != null) {
            this.endPositions.put(t2, numRemove);
        }
        return t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends JCTree> T translate(T t, Type type) {
        if (t == null) {
            return null;
        }
        return (T) boxIfNeeded(translate(t), type);
    }

    public <T extends JCTree> T translate(T t, JCTree.JCExpression jCExpression) {
        JCTree.JCExpression jCExpression2 = this.enclOp;
        this.enclOp = jCExpression;
        T t2 = (T) translate(t);
        this.enclOp = jCExpression2;
        return t2;
    }

    public <T extends JCTree> List<T> translate(List<T> trees, JCTree.JCExpression enclOp) {
        JCTree.JCExpression prevEnclOp = this.enclOp;
        this.enclOp = enclOp;
        List<T> res = translate(trees);
        this.enclOp = prevEnclOp;
        return res;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [A, com.sun.tools.javac.tree.JCTree] */
    public <T extends JCTree> List<T> translate(List<T> trees, Type type) {
        if (trees == null) {
            return null;
        }
        for (List list = trees; list.nonEmpty(); list = list.tail) {
            list.head = translate((JCTree) list.head, type);
        }
        return trees;
    }

    @Override
    public void visitTopLevel(JCTree.JCCompilationUnit tree) {
        long flags;
        if (needPackageInfoClass(tree)) {
            Name name = this.names.package_info;
            if (this.target.isPackageInfoSynthetic()) {
                long flags2 = 1536 | 4096;
                flags = flags2;
            } else {
                flags = 1536;
            }
            TreeMaker treeMaker = this.make;
            JCTree.JCClassDecl packageAnnotationsClass = treeMaker.ClassDef(treeMaker.Modifiers(flags, tree.packageAnnotations), name, List.m507nil(), null, List.m507nil(), List.m507nil());
            Symbol.ClassSymbol c = tree.packge.package_info;
            c.flags_field |= flags;
            c.attributes_field = tree.packge.attributes_field;
            Type.ClassType ctype = (Type.ClassType) c.type;
            ctype.supertype_field = this.syms.objectType;
            ctype.interfaces_field = List.m507nil();
            packageAnnotationsClass.f539sym = c;
            this.translated.append(packageAnnotationsClass);
        }
    }

    static class C06357 {

        static final int[] f380xfefbf21a;

        static {
            int[] iArr = new int[RecognizedOptions.PkgInfo.values().length];
            f380xfefbf21a = iArr;
            try {
                iArr[RecognizedOptions.PkgInfo.ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f380xfefbf21a[RecognizedOptions.PkgInfo.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f380xfefbf21a[RecognizedOptions.PkgInfo.NONEMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    private boolean needPackageInfoClass(JCTree.JCCompilationUnit tree) {
        int i = C06357.f380xfefbf21a[this.pkginfoOpt.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return tree.packageAnnotations.nonEmpty();
        }
        if (i == 3) {
            for (Attribute.Compound a : tree.packge.attributes_field) {
                RetentionPolicy p = this.types.getRetention(a);
                if (p != RetentionPolicy.SOURCE) {
                    return true;
                }
            }
            return false;
        }
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [A, com.sun.tools.javac.tree.JCTree] */
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
    public void visitClassDef(JCTree.JCClassDecl tree) {
        Symbol.ClassSymbol currentClassPrev = this.currentClass;
        Symbol.MethodSymbol currentMethodSymPrev = this.currentMethodSym;
        Symbol.ClassSymbol classSymbol = tree.f539sym;
        this.currentClass = classSymbol;
        this.currentMethodSym = null;
        this.classdefs.put(classSymbol, tree);
        this.proxies = this.proxies.mo451dup(this.currentClass);
        List<Symbol.VarSymbol> prevOuterThisStack = this.outerThisStack;
        if ((tree.mods.flags & 16384) != 0 && (this.types.supertype(this.currentClass.type).tsym.flags() & 16384) == 0) {
            visitEnumDef(tree);
        }
        JCTree.JCVariableDecl otdef = null;
        if (this.currentClass.hasOuterInstance()) {
            otdef = outerThisDef(tree.f531pos, this.currentClass);
        }
        List<JCTree.JCVariableDecl> fvdefs = freevarDefs(tree.f531pos, freevars(this.currentClass), this.currentClass);
        tree.extending = (JCTree.JCExpression) translate(tree.extending);
        tree.implementing = translate(tree.implementing);
        if (this.currentClass.isLocal()) {
            Symbol.ClassSymbol encl = this.currentClass.owner.enclClass();
            if (encl.trans_local == null) {
                encl.trans_local = List.m507nil();
            }
            encl.trans_local = encl.trans_local.prepend(this.currentClass);
        }
        List<JCTree> seen = List.m507nil();
        while (tree.defs != seen) {
            List<JCTree> unseen = tree.defs;
            for (List list = unseen; list.nonEmpty() && list != seen; list = list.tail) {
                JCTree outermostMemberDefPrev = this.outermostMemberDef;
                if (outermostMemberDefPrev == null) {
                    this.outermostMemberDef = (JCTree) list.head;
                }
                list.head = translate((JCTree) list.head);
                this.outermostMemberDef = outermostMemberDefPrev;
            }
            seen = unseen;
        }
        if ((tree.mods.flags & 4) != 0) {
            tree.mods.flags |= 1;
        }
        tree.mods.flags &= 32273;
        tree.name = Convert.shortName(this.currentClass.flatName());
        for (List list2 = fvdefs; list2.nonEmpty(); list2 = list2.tail) {
            tree.defs = tree.defs.prepend(list2.head);
            enterSynthetic(tree.m489pos(), ((JCTree.JCVariableDecl) list2.head).f547sym, this.currentClass.members());
        }
        if (this.currentClass.hasOuterInstance()) {
            tree.defs = tree.defs.prepend(otdef);
            enterSynthetic(tree.m489pos(), otdef.f547sym, this.currentClass.members());
        }
        this.proxies = this.proxies.leave();
        this.outerThisStack = prevOuterThisStack;
        this.translated.append(tree);
        this.currentClass = currentClassPrev;
        this.currentMethodSym = currentMethodSymPrev;
        this.result = make_at(tree.m489pos()).Block(0L, List.m507nil());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void visitEnumDef(JCTree.JCClassDecl tree) {
        List<JCTree.JCStatement> valuesBody;
        make_at(tree.m489pos());
        if (tree.extending == null) {
            tree.extending = this.make.Type(this.types.supertype(tree.type));
        }
        JCTree.JCExpression e_class = classOfType(tree.f539sym.type, tree.m489pos()).setType(this.types.erasure(this.syms.classType));
        int nextOrdinal = 0;
        ListBuffer<JCTree.JCExpression> values = new ListBuffer<>();
        ListBuffer<JCTree> enumDefs = new ListBuffer<>();
        ListBuffer listBuffer = new ListBuffer();
        for (List list = tree.defs; list.nonEmpty(); list = list.tail) {
            if (((JCTree) list.head).getTag() == 5 && (((JCTree.JCVariableDecl) list.head).mods.flags & 16384) != 0) {
                JCTree.JCVariableDecl var = (JCTree.JCVariableDecl) list.head;
                visitEnumConstantDef(var, nextOrdinal);
                values.append(this.make.QualIdent(var.f547sym));
                enumDefs.append(var);
                nextOrdinal++;
            } else {
                listBuffer.append(list.head);
            }
        }
        Name valuesName = this.names.fromString(this.target.syntheticNameChar() + "VALUES");
        while (tree.f539sym.members().lookup(valuesName).scope != null) {
            valuesName = this.names.fromString(((Object) valuesName) + "" + this.target.syntheticNameChar());
        }
        Type arrayType = new Type.ArrayType(this.types.erasure(tree.type), this.syms.arrayClass);
        Symbol.VarSymbol valuesVar = new Symbol.VarSymbol(4122L, valuesName, arrayType, tree.type.tsym);
        TreeMaker treeMaker = this.make;
        JCTree.JCNewArray newArray = treeMaker.NewArray(treeMaker.Type(this.types.erasure(tree.type)), List.m507nil(), values.toList());
        newArray.type = arrayType;
        enumDefs.append(this.make.VarDef(valuesVar, newArray));
        tree.f539sym.members().enter(valuesVar);
        Symbol valuesSym = lookupMethod(tree.m489pos(), this.names.values, tree.type, List.m507nil());
        if (!useClone()) {
            Name resultName = this.names.fromString(this.target.syntheticNameChar() + "result");
            while (tree.f539sym.members().lookup(resultName).scope != null) {
                resultName = this.names.fromString(((Object) resultName) + "" + this.target.syntheticNameChar());
            }
            Symbol.VarSymbol resultVar = new Symbol.VarSymbol(4112L, resultName, arrayType, valuesSym);
            TreeMaker treeMaker2 = this.make;
            JCTree.JCExpression jCExpressionType = treeMaker2.Type(this.types.erasure(tree.type));
            TreeMaker treeMaker3 = this.make;
            JCTree.JCNewArray resultArray = treeMaker2.NewArray(jCExpressionType, List.m508of(treeMaker3.Select(treeMaker3.Ident(valuesVar), this.syms.lengthVar)), null);
            resultArray.type = arrayType;
            JCTree.JCVariableDecl decl = this.make.VarDef(resultVar, resultArray);
            if (this.systemArraycopyMethod == null) {
                this.systemArraycopyMethod = new Symbol.MethodSymbol(9L, this.names.fromString("arraycopy"), new Type.MethodType(List.m511of(this.syms.objectType, this.syms.intType, this.syms.objectType, this.syms.intType, this.syms.intType), this.syms.voidType, List.m507nil(), this.syms.methodClass), this.syms.systemType.tsym);
            }
            TreeMaker treeMaker4 = this.make;
            JCTree.JCExpression jCExpressionSelect = treeMaker4.Select(treeMaker4.Ident(this.syms.systemType.tsym), this.systemArraycopyMethod);
            JCTree.JCIdent jCIdentIdent = this.make.Ident(valuesVar);
            JCTree.JCLiteral jCLiteralLiteral = this.make.Literal(0);
            JCTree.JCIdent jCIdentIdent2 = this.make.Ident(resultVar);
            TreeMaker treeMaker5 = this.make;
            JCTree.JCStatement copy = treeMaker4.Exec(treeMaker4.m494App(jCExpressionSelect, List.m511of(jCIdentIdent, (JCTree.JCIdent) jCLiteralLiteral, jCIdentIdent2, (JCTree.JCIdent[]) new JCTree.JCExpression[]{this.make.Literal(0), treeMaker5.Select(treeMaker5.Ident(valuesVar), this.syms.lengthVar)})));
            TreeMaker treeMaker6 = this.make;
            JCTree.JCStatement ret = treeMaker6.Return(treeMaker6.Ident(resultVar));
            valuesBody = List.m510of((JCTree.JCStatement) decl, copy, ret);
        } else {
            TreeMaker treeMaker7 = this.make;
            Type typeMo574getReturnType = valuesSym.type.mo574getReturnType();
            TreeMaker treeMaker8 = this.make;
            JCTree.JCTypeCast valuesResult = treeMaker7.TypeCast(typeMo574getReturnType, treeMaker8.m493App(treeMaker8.Select(treeMaker8.Ident(valuesVar), this.syms.arrayCloneMethod)));
            valuesBody = List.m508of(this.make.Return(valuesResult));
        }
        TreeMaker treeMaker9 = this.make;
        JCTree.JCMethodDecl valuesDef = treeMaker9.MethodDef((Symbol.MethodSymbol) valuesSym, treeMaker9.Block(0L, valuesBody));
        enumDefs.append(valuesDef);
        if (this.debugLower) {
            System.err.println(tree.f539sym + ".valuesDef = " + valuesDef);
        }
        Symbol.MethodSymbol valueOfSym = lookupMethod(tree.m489pos(), this.names.valueOf, tree.f539sym.type, List.m508of(this.syms.stringType));
        Assert.check((valueOfSym.flags() & 8) != 0);
        Symbol.VarSymbol nameArgSym = valueOfSym.params.head;
        JCTree.JCIdent nameVal = this.make.Ident(nameArgSym);
        TreeMaker treeMaker10 = this.make;
        JCTree.JCStatement enum_ValueOf = treeMaker10.Return(treeMaker10.TypeCast(tree.f539sym.type, makeCall(this.make.Ident(this.syms.enumSym), this.names.valueOf, List.m509of((JCTree.JCIdent) e_class, nameVal))));
        TreeMaker treeMaker11 = this.make;
        JCTree.JCMethodDecl valueOf = treeMaker11.MethodDef(valueOfSym, treeMaker11.Block(0L, List.m508of(enum_ValueOf)));
        nameVal.f543sym = valueOf.params.head.f547sym;
        if (this.debugLower) {
            System.err.println(tree.f539sym + ".valueOf = " + valueOf);
        }
        enumDefs.append(valueOf);
        enumDefs.appendList(listBuffer.toList());
        tree.defs = enumDefs.toList();
        if (this.target.compilerBootstrap(tree.f539sym)) {
            addEnumCompatibleMembers(tree);
        }
    }

    private boolean useClone() {
        try {
            Scope.Entry e = this.syms.objectType.tsym.members().lookup(this.names.clone);
            return e.f338sym != null;
        } catch (Symbol.CompletionFailure e2) {
            return false;
        }
    }

    private void visitEnumConstantDef(JCTree.JCVariableDecl var, int ordinal) {
        JCTree.JCNewClass varDef = (JCTree.JCNewClass) var.init;
        varDef.args = varDef.args.prepend(makeLit(this.syms.intType, Integer.valueOf(ordinal))).prepend(makeLit(this.syms.stringType, var.name.toString()));
    }

    @Override
    public void visitMethodDef(JCTree.JCMethodDecl tree) {
        if (tree.name == this.names.init && (this.currentClass.flags_field & 16384) != 0) {
            JCTree.JCVariableDecl nameParam = make_at(tree.m489pos()).Param(this.names.fromString(this.target.syntheticNameChar() + "enum" + this.target.syntheticNameChar() + "name"), this.syms.stringType, tree.f544sym);
            JCTree.JCModifiers jCModifiers = nameParam.mods;
            jCModifiers.flags = jCModifiers.flags | 4096;
            Symbol.VarSymbol varSymbol = nameParam.f547sym;
            varSymbol.flags_field = varSymbol.flags_field | 4096;
            JCTree.JCVariableDecl ordParam = this.make.Param(this.names.fromString(this.target.syntheticNameChar() + "enum" + this.target.syntheticNameChar() + "ordinal"), this.syms.intType, tree.f544sym);
            JCTree.JCModifiers jCModifiers2 = ordParam.mods;
            jCModifiers2.flags = jCModifiers2.flags | 4096;
            Symbol.VarSymbol varSymbol2 = ordParam.f547sym;
            varSymbol2.flags_field = varSymbol2.flags_field | 4096;
            tree.params = tree.params.prepend(ordParam).prepend(nameParam);
            Symbol.MethodSymbol m = tree.f544sym;
            Type olderasure = m.erasure(this.types);
            m.erasure_field = new Type.MethodType(olderasure.mo573getParameterTypes().prepend(this.syms.intType).prepend(this.syms.stringType), olderasure.mo574getReturnType(), olderasure.mo575getThrownTypes(), this.syms.methodClass);
            if (this.target.compilerBootstrap(m.owner)) {
                Symbol nameVarSym = lookupSynthetic(this.names.fromString("$name"), tree.f544sym.owner.members());
                JCTree.JCIdent nameIdent = this.make.Ident(nameParam.f547sym);
                JCTree.JCIdent id1 = this.make.Ident(nameVarSym);
                JCTree.JCAssign newAssign = this.make.Assign(id1, nameIdent);
                newAssign.type = id1.type;
                JCTree.JCExpressionStatement nameAssign = this.make.Exec(newAssign);
                nameAssign.type = id1.type;
                tree.body.stats = tree.body.stats.prepend(nameAssign);
                Symbol ordinalVarSym = lookupSynthetic(this.names.fromString("$ordinal"), tree.f544sym.owner.members());
                JCTree.JCIdent ordIdent = this.make.Ident(ordParam.f547sym);
                JCTree.JCIdent id2 = this.make.Ident(ordinalVarSym);
                JCTree.JCAssign newAssign2 = this.make.Assign(id2, ordIdent);
                newAssign2.type = id2.type;
                JCTree.JCExpressionStatement ordinalAssign = this.make.Exec(newAssign2);
                ordinalAssign.type = id2.type;
                tree.body.stats = tree.body.stats.prepend(ordinalAssign);
            }
        }
        JCTree.JCMethodDecl prevMethodDef = this.currentMethodDef;
        Symbol.MethodSymbol prevMethodSym = this.currentMethodSym;
        try {
            this.currentMethodDef = tree;
            this.currentMethodSym = tree.f544sym;
            visitMethodDefInternal(tree);
        } finally {
            this.currentMethodDef = prevMethodDef;
            this.currentMethodSym = prevMethodSym;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void visitMethodDefInternal(JCTree.JCMethodDecl tree) {
        if (tree.name == this.names.init && (this.currentClass.isInner() || (this.currentClass.owner.kind & 20) != 0)) {
            Symbol.MethodSymbol m = tree.f544sym;
            this.proxies = this.proxies.mo451dup(m);
            List<Symbol.VarSymbol> prevOuterThisStack = this.outerThisStack;
            List<Symbol.VarSymbol> fvs = freevars(this.currentClass);
            JCTree.JCVariableDecl otdef = null;
            if (this.currentClass.hasOuterInstance()) {
                otdef = outerThisDef(tree.f531pos, m);
            }
            List<JCTree.JCVariableDecl> fvdefs = freevarDefs(tree.f531pos, fvs, m);
            tree.restype = (JCTree.JCExpression) translate(tree.restype);
            tree.params = translateVarDefs(tree.params);
            tree.thrown = translate(tree.thrown);
            if (tree.body == null) {
                this.result = tree;
                return;
            }
            tree.params = tree.params.appendList(fvdefs);
            if (this.currentClass.hasOuterInstance()) {
                tree.params = tree.params.prepend(otdef);
            }
            JCTree.JCStatement selfCall = (JCTree.JCStatement) translate(tree.body.stats.head);
            List<JCTree.JCStatement> added = List.m507nil();
            if (fvs.nonEmpty()) {
                List<Type> addedargtypes = List.m507nil();
                for (List list = fvs; list.nonEmpty(); list = list.tail) {
                    if (TreeInfo.isInitialConstructor(tree)) {
                        added = added.prepend(initField(tree.body.f531pos, proxyName(((Symbol.VarSymbol) list.head).name)));
                    }
                    addedargtypes = addedargtypes.prepend(((Symbol.VarSymbol) list.head).erasure(this.types));
                }
                Type olderasure = m.erasure(this.types);
                m.erasure_field = new Type.MethodType(olderasure.mo573getParameterTypes().appendList(addedargtypes), olderasure.mo574getReturnType(), olderasure.mo575getThrownTypes(), this.syms.methodClass);
            }
            if (this.currentClass.hasOuterInstance() && TreeInfo.isInitialConstructor(tree)) {
                added = added.prepend(initOuterThis(tree.body.f531pos));
            }
            this.proxies = this.proxies.leave();
            List<JCTree.JCStatement> stats = translate(tree.body.stats.tail);
            if (this.target.initializeFieldsBeforeSuper()) {
                tree.body.stats = stats.prepend(selfCall).prependList(added);
            } else {
                tree.body.stats = stats.prependList(added).prepend(selfCall);
            }
            this.outerThisStack = prevOuterThisStack;
        } else {
            super.visitMethodDef(tree);
        }
        this.result = tree;
    }

    @Override
    public void visitTypeCast(JCTree.JCTypeCast tree) {
        tree.clazz = translate(tree.clazz);
        if (tree.type.isPrimitive() != tree.expr.type.isPrimitive()) {
            tree.expr = (JCTree.JCExpression) translate(tree.expr, tree.type);
        } else {
            tree.expr = (JCTree.JCExpression) translate(tree.expr);
        }
        this.result = tree;
    }

    @Override
    public void visitNewClass(JCTree.JCNewClass tree) {
        JCTree.JCExpression thisArg;
        Symbol.ClassSymbol c = (Symbol.ClassSymbol) tree.constructor.owner;
        boolean isEnum = (tree.constructor.owner.flags() & 16384) != 0;
        List<Type> argTypes = tree.constructor.type.mo573getParameterTypes();
        if (isEnum) {
            argTypes = argTypes.prepend(this.syms.intType).prepend(this.syms.stringType);
        }
        tree.args = boxArgs(argTypes, tree.args, tree.varargsElement);
        tree.varargsElement = null;
        if ((c.owner.kind & 20) != 0) {
            tree.args = tree.args.appendList(loadFreevars(tree.m489pos(), freevars(c)));
        }
        Symbol constructor = accessConstructor(tree.m489pos(), tree.constructor);
        if (constructor != tree.constructor) {
            tree.args = tree.args.append(makeNull());
            tree.constructor = constructor;
        }
        if (c.hasOuterInstance()) {
            if (tree.encl != null) {
                thisArg = this.attr.makeNullCheck((JCTree.JCExpression) translate(tree.encl));
                thisArg.type = tree.encl.type;
            } else if ((c.owner.kind & 20) != 0) {
                thisArg = makeThis(tree.m489pos(), c.type.getEnclosingType().tsym);
            } else {
                thisArg = makeOwnerThis(tree.m489pos(), c, false);
            }
            tree.args = tree.args.prepend(thisArg);
        }
        tree.encl = null;
        if (tree.f545def != null) {
            translate(tree.f545def);
            tree.clazz = access(make_at(tree.clazz.m489pos()).Ident(tree.f545def.f539sym));
            tree.f545def = null;
        } else {
            tree.clazz = access(c, tree.clazz, this.enclOp, false);
        }
        this.result = tree;
    }

    @Override
    public void visitConditional(JCTree.JCConditional tree) {
        JCTree.JCExpression jCExpression = (JCTree.JCExpression) translate(tree.cond, this.syms.booleanType);
        tree.cond = jCExpression;
        if (jCExpression.type.isTrue()) {
            this.result = convert(translate(tree.truepart, tree.type), tree.type);
        } else {
            if (jCExpression.type.isFalse()) {
                this.result = convert(translate(tree.falsepart, tree.type), tree.type);
                return;
            }
            tree.truepart = (JCTree.JCExpression) translate(tree.truepart, tree.type);
            tree.falsepart = (JCTree.JCExpression) translate(tree.falsepart, tree.type);
            this.result = tree;
        }
    }

    private JCTree convert(JCTree tree, Type pt) {
        if (tree.type == pt || tree.type.f344tag == 17) {
            return tree;
        }
        JCTree result = make_at(tree.m489pos()).TypeCast(this.make.Type(pt), (JCTree.JCExpression) tree);
        result.type = tree.type.constValue() != null ? this.cfolder.coerce(tree.type, pt) : pt;
        return result;
    }

    @Override
    public void visitIf(JCTree.JCIf tree) {
        JCTree.JCExpression jCExpression = (JCTree.JCExpression) translate(tree.cond, this.syms.booleanType);
        tree.cond = jCExpression;
        if (jCExpression.type.isTrue()) {
            this.result = translate(tree.thenpart);
            return;
        }
        if (jCExpression.type.isFalse()) {
            if (tree.elsepart != null) {
                this.result = translate(tree.elsepart);
                return;
            } else {
                this.result = this.make.Skip();
                return;
            }
        }
        tree.thenpart = (JCTree.JCStatement) translate(tree.thenpart);
        tree.elsepart = (JCTree.JCStatement) translate(tree.elsepart);
        this.result = tree;
    }

    @Override
    public void visitAssert(JCTree.JCAssert tree) {
        JCDiagnostic.DiagnosticPosition detailPos = tree.detail == null ? tree.m489pos() : tree.detail.m489pos();
        tree.cond = (JCTree.JCExpression) translate(tree.cond, this.syms.booleanType);
        if (!tree.cond.type.isTrue()) {
            JCTree.JCExpression cond = assertFlagTest(tree.m489pos());
            List<JCTree.JCExpression> exnArgs = tree.detail == null ? List.m507nil() : List.m508of(translate(tree.detail));
            if (!tree.cond.type.isFalse()) {
                cond = makeBinary(58, cond, makeUnary(50, tree.cond));
            }
            this.result = this.make.mo490If(cond, make_at(detailPos).Throw(makeNewClass(this.syms.assertionErrorType, exnArgs)), null);
            return;
        }
        this.result = this.make.Skip();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void visitApply(JCTree.JCMethodInvocation tree) {
        JCTree.JCExpression thisArg;
        Symbol meth = TreeInfo.symbol(tree.meth);
        List listMo573getParameterTypes = meth.type.mo573getParameterTypes();
        if (this.allowEnums && meth.name == this.names.init && meth.owner == this.syms.enumSym) {
            listMo573getParameterTypes = listMo573getParameterTypes.tail.tail;
        }
        tree.args = boxArgs(listMo573getParameterTypes, tree.args, tree.varargsElement);
        tree.varargsElement = null;
        Name methName = TreeInfo.name(tree.meth);
        if (meth.name == this.names.init) {
            Symbol constructor = accessConstructor(tree.m489pos(), meth);
            if (constructor != meth) {
                tree.args = tree.args.append(makeNull());
                TreeInfo.setSymbol(tree.meth, constructor);
            }
            Symbol.ClassSymbol c = (Symbol.ClassSymbol) constructor.owner;
            if ((c.owner.kind & 20) != 0) {
                tree.args = tree.args.appendList(loadFreevars(tree.m489pos(), freevars(c)));
            }
            if ((c.flags_field & 16384) != 0 || c.getQualifiedName() == this.names.java_lang_Enum) {
                List list = this.currentMethodDef.params;
                if (this.currentMethodSym.owner.hasOuterInstance()) {
                    list = list.tail;
                }
                tree.args = tree.args.prepend(make_at(tree.m489pos()).Ident(((JCTree.JCVariableDecl) list.tail.head).f547sym)).prepend(this.make.Ident(((JCTree.JCVariableDecl) list.head).f547sym));
            }
            if (c.hasOuterInstance()) {
                if (tree.meth.getTag() == 34) {
                    thisArg = this.attr.makeNullCheck((JCTree.JCExpression) translate(((JCTree.JCFieldAccess) tree.meth).selected));
                    tree.meth = this.make.Ident(constructor);
                    ((JCTree.JCIdent) tree.meth).name = methName;
                } else if ((c.owner.kind & 20) != 0 || methName == this.names._this) {
                    JCTree.JCExpression thisArg2 = tree.meth;
                    thisArg = makeThis(thisArg2.m489pos(), c.type.getEnclosingType().tsym);
                } else {
                    thisArg = makeOwnerThisN(tree.meth.m489pos(), c, false);
                }
                tree.args = tree.args.prepend(thisArg);
            }
        } else {
            tree.meth = (JCTree.JCExpression) translate(tree.meth);
            if (tree.meth.getTag() == 26) {
                JCTree.JCMethodInvocation app = (JCTree.JCMethodInvocation) tree.meth;
                app.args = tree.args.prependList(app.args);
                this.result = app;
                return;
            }
        }
        this.result = tree;
    }

    /* JADX WARN: Multi-variable type inference failed */
    List<JCTree.JCExpression> boxArgs(List<Type> list, List<JCTree.JCExpression> list2, Type type) {
        List list3 = list2;
        if (list.isEmpty()) {
            return list3;
        }
        boolean z = false;
        ListBuffer listBuffer = new ListBuffer();
        List list4 = list;
        while (true) {
            boolean z2 = false;
            if (!list4.tail.nonEmpty()) {
                break;
            }
            JCTree.JCExpression jCExpression = (JCTree.JCExpression) translate((JCTree) list3.head, (Type) list4.head);
            if (jCExpression != list3.head) {
                z2 = true;
            }
            z |= z2;
            listBuffer.append(jCExpression);
            list3 = list3.tail;
            list4 = list4.tail;
        }
        Type type2 = (Type) list4.head;
        if (type != null) {
            ListBuffer listBuffer2 = new ListBuffer();
            while (list3.nonEmpty()) {
                listBuffer2.append((JCTree.JCExpression) translate((JCTree) list3.head, type));
                list3 = list3.tail;
            }
            TreeMaker treeMaker = this.make;
            JCTree.JCNewArray jCNewArrayNewArray = treeMaker.NewArray(treeMaker.Type(type), List.m507nil(), listBuffer2.toList());
            jCNewArrayNewArray.type = new Type.ArrayType(type, this.syms.arrayClass);
            listBuffer.append(jCNewArrayNewArray);
        } else {
            if (list3.length() != 1) {
                throw new AssertionError(list3);
            }
            JCTree.JCExpression jCExpression2 = (JCTree.JCExpression) translate((JCTree) list3.head, type2);
            boolean z3 = z | (jCExpression2 != list3.head);
            listBuffer.append(jCExpression2);
            if (!z3) {
                return list2;
            }
        }
        return listBuffer.toList();
    }

    <T extends JCTree> T boxIfNeeded(T tree, Type type) {
        boolean havePrimitive = tree.type.isPrimitive();
        if (havePrimitive == type.isPrimitive()) {
            return tree;
        }
        if (havePrimitive) {
            Type unboxedTarget = this.types.unboxedType(type);
            if (unboxedTarget.f344tag != 18) {
                if (!this.types.isSubtype(tree.type, unboxedTarget)) {
                    tree.type = unboxedTarget.constType(tree.type.constValue());
                }
                return boxPrimitive((JCTree.JCExpression) tree, type);
            }
            return boxPrimitive((JCTree.JCExpression) tree);
        }
        return unbox((JCTree.JCExpression) tree, type);
    }

    JCTree.JCExpression boxPrimitive(JCTree.JCExpression tree) {
        return boxPrimitive(tree, this.types.boxedClass(tree.type).type);
    }

    JCTree.JCExpression boxPrimitive(JCTree.JCExpression tree, Type box) {
        make_at(tree.m489pos());
        if (this.target.boxWithConstructors()) {
            Symbol ctor = lookupConstructor(tree.m489pos(), box, List.m507nil().prepend(tree.type));
            return this.make.Create(ctor, List.m508of(tree));
        }
        Symbol valueOfSym = lookupMethod(tree.m489pos(), this.names.valueOf, box, List.m507nil().prepend(tree.type));
        TreeMaker treeMaker = this.make;
        return treeMaker.m494App(treeMaker.QualIdent(valueOfSym), List.m508of(tree));
    }

    JCTree.JCExpression unbox(JCTree.JCExpression tree, Type primitive) {
        Type unboxedType = this.types.unboxedType(tree.type);
        if (unboxedType.f344tag == 18) {
            unboxedType = primitive;
            if (!unboxedType.isPrimitive()) {
                throw new AssertionError(unboxedType);
            }
            make_at(tree.m489pos());
            tree = this.make.TypeCast(this.types.boxedClass(unboxedType).type, tree);
        } else if (!this.types.isSubtype(unboxedType, primitive)) {
            throw new AssertionError(tree);
        }
        make_at(tree.m489pos());
        Symbol valueSym = lookupMethod(tree.m489pos(), unboxedType.tsym.name.append(this.names.Value), tree.type, List.m507nil());
        TreeMaker treeMaker = this.make;
        return treeMaker.m493App(treeMaker.Select(tree, valueSym));
    }

    @Override
    public void visitParens(JCTree.JCParens tree) {
        JCTree expr = translate(tree.expr);
        this.result = expr == tree.expr ? tree : expr;
    }

    @Override
    public void visitIndexed(JCTree.JCArrayAccess tree) {
        tree.indexed = (JCTree.JCExpression) translate(tree.indexed);
        tree.index = (JCTree.JCExpression) translate(tree.index, this.syms.intType);
        this.result = tree;
    }

    @Override
    public void visitAssign(JCTree.JCAssign tree) {
        tree.f532lhs = (JCTree.JCExpression) translate(tree.f532lhs, tree);
        tree.f533rhs = (JCTree.JCExpression) translate(tree.f533rhs, tree.f532lhs.type);
        if (tree.f532lhs.getTag() == 26) {
            JCTree.JCMethodInvocation app = (JCTree.JCMethodInvocation) tree.f532lhs;
            app.args = List.m508of(tree.f533rhs).prependList(app.args);
            this.result = app;
            return;
        }
        this.result = tree;
    }

    @Override
    public void visitAssignop(final JCTree.JCAssignOp tree) {
        JCTree.JCExpression rhs;
        if (!tree.f534lhs.type.isPrimitive() && tree.operator.type.mo574getReturnType().isPrimitive()) {
            JCTree newTree = abstractLval(tree.f534lhs, new TreeBuilder() {
                @Override
                public JCTree build(JCTree lhs) {
                    int newTag = tree.getTag() - 17;
                    Symbol newOperator = Lower.this.f379rs.resolveBinaryOperator(tree.m489pos(), newTag, Lower.this.attrEnv, tree.type, tree.f535rhs.type);
                    JCTree.JCExpression expr = (JCTree.JCExpression) lhs;
                    if (expr.type != tree.type) {
                        expr = Lower.this.make.TypeCast(tree.type, expr);
                    }
                    JCTree.JCBinary opResult = Lower.this.make.Binary(newTag, expr, tree.f535rhs);
                    opResult.operator = newOperator;
                    opResult.type = newOperator.type.mo574getReturnType();
                    JCTree.JCTypeCast newRhs = Lower.this.make.TypeCast(Lower.this.types.unboxedType(tree.type), opResult);
                    return Lower.this.make.Assign((JCTree.JCExpression) lhs, newRhs).setType(tree.type);
                }
            });
            this.result = translate(newTree);
            return;
        }
        tree.f534lhs = (JCTree.JCExpression) translate(tree.f534lhs, tree);
        tree.f535rhs = (JCTree.JCExpression) translate(tree.f535rhs, tree.operator.type.mo573getParameterTypes().tail.head);
        if (tree.f534lhs.getTag() == 26) {
            JCTree.JCMethodInvocation app = (JCTree.JCMethodInvocation) tree.f534lhs;
            if (((Symbol.OperatorSymbol) tree.operator).opcode == 256) {
                rhs = makeString(tree.f535rhs);
            } else {
                rhs = tree.f535rhs;
            }
            app.args = List.m508of(rhs).prependList(app.args);
            this.result = app;
            return;
        }
        this.result = tree;
    }

    JCTree lowerBoxedPostop(final JCTree.JCUnary tree) {
        final boolean cast = TreeInfo.skipParens(tree.f546arg).getTag() == 31;
        return abstractLval(tree.f546arg, new TreeBuilder() {
            @Override
            public JCTree build(final JCTree tmp1) {
                return Lower.this.abstractRval(tmp1, tree.f546arg.type, new TreeBuilder() {
                    @Override
                    public JCTree build(JCTree tmp2) {
                        JCTree lhs;
                        int opcode = tree.getTag() == 54 ? 88 : 89;
                        if (cast) {
                            lhs = Lower.this.make.TypeCast(tree.f546arg.type, (JCTree.JCExpression) tmp1);
                        } else {
                            lhs = tmp1;
                        }
                        JCTree update = Lower.this.makeAssignop(opcode, lhs, Lower.this.make.Literal(1));
                        return Lower.this.makeComma(update, tmp2);
                    }
                });
            }
        });
    }

    @Override
    public void visitUnary(JCTree.JCUnary tree) {
        boolean isUpdateOperator = 52 <= tree.getTag() && tree.getTag() <= 55;
        if (isUpdateOperator && !tree.f546arg.type.isPrimitive()) {
            switch (tree.getTag()) {
                case 52:
                case 53:
                    int opcode = tree.getTag() == 52 ? 88 : 89;
                    JCTree.JCAssignOp newTree = makeAssignop(opcode, tree.f546arg, this.make.Literal(1));
                    this.result = translate(newTree, tree.type);
                    return;
                case 54:
                case 55:
                    this.result = translate(lowerBoxedPostop(tree), tree.type);
                    return;
                default:
                    throw new AssertionError(tree);
            }
        }
        tree.f546arg = (JCTree.JCExpression) boxIfNeeded(translate(tree.f546arg, tree), tree.type);
        if (tree.getTag() == 50 && tree.f546arg.type.constValue() != null) {
            tree.type = this.cfolder.fold1(ByteCodes.bool_not, tree.f546arg.type);
        }
        if (isUpdateOperator && tree.f546arg.getTag() == 26) {
            this.result = tree.f546arg;
        } else {
            this.result = tree;
        }
    }

    @Override
    public void visitBinary(JCTree.JCBinary tree) {
        List<Type> formals = tree.operator.type.mo573getParameterTypes();
        JCTree.JCExpression jCExpression = (JCTree.JCExpression) translate(tree.f536lhs, formals.head);
        tree.f536lhs = jCExpression;
        int tag = tree.getTag();
        if (tag != 57) {
            if (tag == 58) {
                if (jCExpression.type.isFalse()) {
                    this.result = jCExpression;
                    return;
                } else if (jCExpression.type.isTrue()) {
                    this.result = translate(tree.f537rhs, formals.tail.head);
                    return;
                }
            }
        } else if (jCExpression.type.isTrue()) {
            this.result = jCExpression;
            return;
        } else if (jCExpression.type.isFalse()) {
            this.result = translate(tree.f537rhs, formals.tail.head);
            return;
        }
        tree.f537rhs = (JCTree.JCExpression) translate(tree.f537rhs, formals.tail.head);
        this.result = tree;
    }

    @Override
    public void visitIdent(JCTree.JCIdent tree) {
        this.result = access(tree.f543sym, tree, this.enclOp, false);
    }

    @Override
    public void visitForeachLoop(JCTree.JCEnhancedForLoop tree) {
        if (this.types.elemtype(tree.expr.type) == null) {
            visitIterableForeachLoop(tree);
        } else {
            visitArrayForeachLoop(tree);
        }
    }

    private void visitArrayForeachLoop(JCTree.JCEnhancedForLoop tree) {
        make_at(tree.expr.m489pos());
        Symbol.VarSymbol arraycache = new Symbol.VarSymbol(0L, this.names.fromString("arr" + this.target.syntheticNameChar()), tree.expr.type, this.currentMethodSym);
        JCTree.JCStatement arraycachedef = this.make.VarDef(arraycache, tree.expr);
        Symbol.VarSymbol lencache = new Symbol.VarSymbol(0L, this.names.fromString("len" + this.target.syntheticNameChar()), this.syms.intType, this.currentMethodSym);
        TreeMaker treeMaker = this.make;
        JCTree.JCStatement lencachedef = treeMaker.VarDef(lencache, treeMaker.Select(treeMaker.Ident(arraycache), this.syms.lengthVar));
        Symbol.VarSymbol index = new Symbol.VarSymbol(0L, this.names.fromString("i" + this.target.syntheticNameChar()), this.syms.intType, this.currentMethodSym);
        TreeMaker treeMaker2 = this.make;
        JCTree.JCVariableDecl indexdef = treeMaker2.VarDef(index, treeMaker2.Literal(4, 0));
        JCTree.JCExpression jCExpression = indexdef.init;
        Type typeConstType = this.syms.intType.constType(0);
        indexdef.type = typeConstType;
        jCExpression.type = typeConstType;
        List<JCTree.JCStatement> loopinit = List.m510of((JCTree.JCVariableDecl) arraycachedef, (JCTree.JCVariableDecl) lencachedef, indexdef);
        JCTree.JCBinary cond = makeBinary(64, this.make.Ident(index), this.make.Ident(lencache));
        TreeMaker treeMaker3 = this.make;
        JCTree.JCExpressionStatement step = treeMaker3.Exec(makeUnary(52, treeMaker3.Ident(index)));
        Type elemtype = this.types.elemtype(tree.expr.type);
        TreeMaker treeMaker4 = this.make;
        JCTree.JCExpression loopvarinit = treeMaker4.Indexed(treeMaker4.Ident(arraycache), this.make.Ident(index)).setType(elemtype);
        JCTree.JCVariableDecl loopvardef = (JCTree.JCVariableDecl) this.make.VarDef(tree.f541var.mods, tree.f541var.name, tree.f541var.vartype, loopvarinit).setType(tree.f541var.type);
        loopvardef.f547sym = tree.f541var.f547sym;
        JCTree.JCBlock body = this.make.Block(0L, List.m509of((JCTree.JCStatement) loopvardef, tree.body));
        this.result = translate(this.make.ForLoop(loopinit, cond, List.m508of(step), body));
        patchTargets(body, tree, this.result);
    }

    private void patchTargets(JCTree body, final JCTree src, final JCTree dest) {
        new TreeScanner() {
            @Override
            public void visitBreak(JCTree.JCBreak tree) {
                if (tree.target == src) {
                    tree.target = dest;
                }
            }

            @Override
            public void visitContinue(JCTree.JCContinue tree) {
                if (tree.target == src) {
                    tree.target = dest;
                }
            }

            @Override
            public void visitClassDef(JCTree.JCClassDecl tree) {
            }
        }.scan(body);
    }

    private void visitIterableForeachLoop(JCTree.JCEnhancedForLoop tree) {
        JCTree.JCExpression vardefinit;
        make_at(tree.expr.m489pos());
        Type iteratorTarget = this.syms.objectType;
        Types types = this.types;
        Type iterableType = types.asSuper(types.upperBound(tree.expr.type), this.syms.iterableType.tsym);
        if (iterableType.getTypeArguments().nonEmpty()) {
            iteratorTarget = this.types.erasure(iterableType.getTypeArguments().head);
        }
        Type eType = tree.expr.type;
        tree.expr.type = this.types.erasure(eType);
        if (eType.f344tag == 14 && eType.mo576getUpperBound().isCompound()) {
            tree.expr = this.make.TypeCast(this.types.erasure(iterableType), tree.expr);
        }
        Symbol.MethodSymbol iterator = lookupMethod(tree.expr.m489pos(), this.names.iterator, this.types.erasure(this.syms.iterableType), List.m507nil());
        Symbol.VarSymbol itvar = new Symbol.VarSymbol(0L, this.names.fromString("i" + this.target.syntheticNameChar()), this.types.erasure(iterator.type.mo574getReturnType()), this.currentMethodSym);
        TreeMaker treeMaker = this.make;
        JCTree.JCStatement init = treeMaker.VarDef(itvar, treeMaker.m493App(treeMaker.Select(tree.expr, iterator)));
        Symbol.MethodSymbol hasNext = lookupMethod(tree.expr.m489pos(), this.names.hasNext, itvar.type, List.m507nil());
        TreeMaker treeMaker2 = this.make;
        JCTree.JCMethodInvocation cond = treeMaker2.m493App(treeMaker2.Select(treeMaker2.Ident(itvar), hasNext));
        Symbol.MethodSymbol next = lookupMethod(tree.expr.m489pos(), this.names.next, itvar.type, List.m507nil());
        TreeMaker treeMaker3 = this.make;
        JCTree.JCExpression vardefinit2 = treeMaker3.m493App(treeMaker3.Select(treeMaker3.Ident(itvar), next));
        if (tree.f541var.type.isPrimitive()) {
            vardefinit = this.make.TypeCast(this.types.upperBound(iteratorTarget), vardefinit2);
        } else {
            vardefinit = this.make.TypeCast(tree.f541var.type, vardefinit2);
        }
        JCTree.JCVariableDecl indexDef = (JCTree.JCVariableDecl) this.make.VarDef(tree.f541var.mods, tree.f541var.name, tree.f541var.vartype, vardefinit).setType(tree.f541var.type);
        indexDef.f547sym = tree.f541var.f547sym;
        JCTree.JCBlock body = this.make.Block(0L, List.m509of((JCTree.JCStatement) indexDef, tree.body));
        body.endpos = TreeInfo.endPos(tree.body);
        this.result = translate(this.make.ForLoop(List.m508of(init), cond, List.m507nil(), body));
        patchTargets(body, tree, this.result);
    }

    @Override
    public void visitVarDef(JCTree.JCVariableDecl tree) {
        Symbol.MethodSymbol oldMethodSym = this.currentMethodSym;
        tree.mods = (JCTree.JCModifiers) translate(tree.mods);
        tree.vartype = (JCTree.JCExpression) translate(tree.vartype);
        if (this.currentMethodSym == null) {
            this.currentMethodSym = new Symbol.MethodSymbol(1048576 | (tree.mods.flags & 8), this.names.empty, null, this.currentClass);
        }
        if (tree.init != null) {
            tree.init = (JCTree.JCExpression) translate(tree.init, tree.type);
        }
        this.result = tree;
        this.currentMethodSym = oldMethodSym;
    }

    @Override
    public void visitBlock(JCTree.JCBlock tree) {
        Symbol.MethodSymbol oldMethodSym = this.currentMethodSym;
        if (this.currentMethodSym == null) {
            this.currentMethodSym = new Symbol.MethodSymbol(1048576 | tree.flags, this.names.empty, null, this.currentClass);
        }
        super.visitBlock(tree);
        this.currentMethodSym = oldMethodSym;
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
        tree.init = translate(tree.init);
        if (tree.cond != null) {
            tree.cond = (JCTree.JCExpression) translate(tree.cond, this.syms.booleanType);
        }
        tree.step = translate(tree.step);
        tree.body = (JCTree.JCStatement) translate(tree.body);
        this.result = tree;
    }

    @Override
    public void visitReturn(JCTree.JCReturn tree) {
        if (tree.expr != null) {
            tree.expr = (JCTree.JCExpression) translate(tree.expr, this.types.erasure(this.currentMethodDef.restype.type));
        }
        this.result = tree;
    }

    @Override
    public void visitSwitch(JCTree.JCSwitch tree) {
        Type target;
        Type selsuper = this.types.supertype(tree.selector.type);
        boolean enumSwitch = (selsuper == null || (tree.selector.type.tsym.flags() & 16384) == 0) ? false : true;
        boolean stringSwitch = selsuper != null && this.types.isSameType(tree.selector.type, this.syms.stringType);
        if (enumSwitch) {
            target = tree.selector.type;
        } else {
            Symtab symtab = this.syms;
            target = stringSwitch ? symtab.stringType : symtab.intType;
        }
        tree.selector = (JCTree.JCExpression) translate(tree.selector, target);
        tree.cases = translateCases(tree.cases);
        if (enumSwitch) {
            this.result = visitEnumSwitch(tree);
        } else if (stringSwitch) {
            this.result = visitStringSwitch(tree);
        } else {
            this.result = tree;
        }
    }

    public JCTree visitEnumSwitch(JCTree.JCSwitch tree) {
        Symbol.TypeSymbol enumSym = tree.selector.type.tsym;
        EnumMapping map = mapForEnum(tree.m489pos(), enumSym);
        make_at(tree.m489pos());
        Symbol ordinalMethod = lookupMethod(tree.m489pos(), this.names.ordinal, tree.selector.type, List.m507nil());
        TreeMaker treeMaker = this.make;
        Symbol.VarSymbol varSymbol = map.mapVar;
        TreeMaker treeMaker2 = this.make;
        JCTree.JCArrayAccess selector = treeMaker.Indexed(varSymbol, treeMaker2.m493App(treeMaker2.Select(tree.selector, ordinalMethod)));
        ListBuffer<JCTree.JCCase> cases = new ListBuffer<>();
        for (JCTree.JCCase c : tree.cases) {
            if (c.f538pat != null) {
                Symbol.VarSymbol label = (Symbol.VarSymbol) TreeInfo.symbol(c.f538pat);
                JCTree.JCLiteral pat = map.forConstant(label);
                cases.append(this.make.Case(pat, c.stats));
            } else {
                cases.append(c);
            }
        }
        JCTree.JCSwitch enumSwitch = this.make.Switch(selector, cases.toList());
        patchTargets(enumSwitch, tree, enumSwitch);
        return enumSwitch;
    }

    public JCTree visitStringSwitch(JCTree.JCSwitch tree) {
        int i;
        JCTree.JCExpression caseExpr;
        List<JCTree.JCCase> caseList = tree.getCases();
        int alternatives = caseList.size();
        if (alternatives == 0) {
            return this.make.m496at(tree.m489pos()).Exec(this.attr.makeNullCheck(tree.getExpression()));
        }
        ListBuffer<JCTree.JCStatement> stmtList = new ListBuffer<>();
        Map<String, Integer> caseLabelToPosition = new LinkedHashMap<>(alternatives + 1, 1.0f);
        Map<Integer, Set<String>> hashToString = new LinkedHashMap<>(alternatives + 1, 1.0f);
        int casePosition = 0;
        Iterator<JCTree.JCCase> it = caseList.iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            JCTree.JCExpression expression = it.next().getExpression();
            if (expression != null) {
                String labelExpr = (String) TreeInfo.skipParens(expression).type.constValue();
                Integer mapping = caseLabelToPosition.put(labelExpr, Integer.valueOf(casePosition));
                Assert.checkNull(mapping);
                int hashCode = labelExpr.hashCode();
                Set<String> stringSet = hashToString.get(Integer.valueOf(hashCode));
                if (stringSet == null) {
                    Set<String> stringSet2 = new LinkedHashSet<>(1, 1.0f);
                    stringSet2.add(labelExpr);
                    hashToString.put(Integer.valueOf(hashCode), stringSet2);
                } else {
                    boolean added = stringSet.add(labelExpr);
                    Assert.check(added);
                }
            }
            casePosition++;
            alternatives = alternatives;
            it = it;
        }
        Symbol.VarSymbol dollar_s = new Symbol.VarSymbol(4112L, this.names.fromString("s" + tree.f531pos + this.target.syntheticNameChar()), this.syms.stringType, this.currentMethodSym);
        stmtList.append(this.make.m496at(tree.m489pos()).VarDef(dollar_s, tree.getExpression()).setType(dollar_s.type));
        Symbol.VarSymbol dollar_tmp = new Symbol.VarSymbol(4096L, this.names.fromString("tmp" + tree.f531pos + this.target.syntheticNameChar()), this.syms.intType, this.currentMethodSym);
        TreeMaker treeMaker = this.make;
        JCTree.JCVariableDecl dollar_tmp_def = (JCTree.JCVariableDecl) treeMaker.VarDef(dollar_tmp, treeMaker.Literal(4, -1)).setType(dollar_tmp.type);
        JCTree.JCExpression jCExpression = dollar_tmp_def.init;
        Type type = this.syms.intType;
        dollar_tmp.type = type;
        jCExpression.type = type;
        stmtList.append(dollar_tmp_def);
        ListBuffer<JCTree.JCCase> caseBuffer = ListBuffer.m512lb();
        JCTree.JCMethodInvocation hashCodeCall = makeCall(this.make.Ident(dollar_s), this.names.hashCode, List.m507nil()).setType(this.syms.intType);
        JCTree.JCSwitch switch1 = this.make.Switch(hashCodeCall, caseBuffer.toList());
        Iterator<Map.Entry<Integer, Set<String>>> it2 = hashToString.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<Integer, Set<String>> entry = it2.next();
            int hashCode2 = entry.getKey().intValue();
            Set<String> stringsWithHashCode = entry.getValue();
            Map<Integer, Set<String>> hashToString2 = hashToString;
            Assert.check(stringsWithHashCode.size() >= i);
            JCTree.JCStatement elsepart = null;
            for (String caseLabel : stringsWithHashCode) {
                int casePosition2 = casePosition;
                Symbol.VarSymbol dollar_s2 = dollar_s;
                JCTree.JCMethodInvocation stringEqualsCall = makeCall(this.make.Ident(dollar_s), this.names.equals, List.m508of(this.make.Literal(caseLabel)));
                TreeMaker treeMaker2 = this.make;
                elsepart = treeMaker2.mo490If(stringEqualsCall, treeMaker2.Exec(treeMaker2.Assign(treeMaker2.Ident(dollar_tmp), this.make.Literal(caseLabelToPosition.get(caseLabel))).setType(dollar_tmp.type)), elsepart);
                casePosition = casePosition2;
                dollar_s = dollar_s2;
                dollar_tmp_def = dollar_tmp_def;
                hashCodeCall = hashCodeCall;
                it2 = it2;
            }
            Symbol.VarSymbol dollar_s3 = dollar_s;
            int casePosition3 = casePosition;
            JCTree.JCVariableDecl dollar_tmp_def2 = dollar_tmp_def;
            ListBuffer<JCTree.JCStatement> lb = ListBuffer.m512lb();
            JCTree.JCBreak breakStmt = this.make.Break(null);
            breakStmt.target = switch1;
            lb.append(elsepart).append(breakStmt);
            TreeMaker treeMaker3 = this.make;
            caseBuffer.append(treeMaker3.Case(treeMaker3.Literal(Integer.valueOf(hashCode2)), lb.toList()));
            hashToString = hashToString2;
            casePosition = casePosition3;
            dollar_s = dollar_s3;
            dollar_tmp_def = dollar_tmp_def2;
            hashCodeCall = hashCodeCall;
            i = 1;
        }
        switch1.cases = caseBuffer.toList();
        stmtList.append(switch1);
        ListBuffer<JCTree.JCCase> lb2 = ListBuffer.m512lb();
        TreeMaker treeMaker4 = this.make;
        JCTree.JCSwitch switch2 = treeMaker4.Switch(treeMaker4.Ident(dollar_tmp), lb2.toList());
        for (JCTree.JCCase oneCase : caseList) {
            patchTargets(oneCase, tree, switch2);
            boolean isDefault = oneCase.getExpression() == null;
            if (isDefault) {
                caseExpr = null;
            } else {
                caseExpr = this.make.Literal(caseLabelToPosition.get((String) TreeInfo.skipParens(oneCase.getExpression()).type.constValue()));
            }
            lb2.append(this.make.Case(caseExpr, oneCase.getStatements()));
        }
        switch2.cases = lb2.toList();
        stmtList.append(switch2);
        return this.make.Block(0L, stmtList.toList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [A, com.sun.tools.javac.tree.JCTree] */
    @Override
    public void visitNewArray(JCTree.JCNewArray tree) {
        tree.elemtype = (JCTree.JCExpression) translate(tree.elemtype);
        for (List list = tree.dims; list.tail != null; list = list.tail) {
            if (list.head != 0) {
                list.head = translate((JCTree) list.head, this.syms.intType);
            }
        }
        List<JCTree.JCExpression> t = tree.elems;
        tree.elems = translate(t, this.types.elemtype(tree.type));
        this.result = tree;
    }

    @Override
    public void visitSelect(JCTree.JCFieldAccess tree) {
        boolean qualifiedSuperAccess = tree.selected.getTag() == 34 && TreeInfo.name(tree.selected) == this.names._super;
        tree.selected = (JCTree.JCExpression) translate(tree.selected);
        if (tree.name == this.names._class) {
            this.result = classOf(tree.selected);
        } else if (tree.name == this.names._this || tree.name == this.names._super) {
            this.result = makeThis(tree.m489pos(), tree.selected.type.tsym);
        } else {
            this.result = access(tree.f542sym, tree, this.enclOp, qualifiedSuperAccess);
        }
    }

    @Override
    public void visitLetExpr(JCTree.LetExpr tree) {
        tree.defs = translateVarDefs(tree.defs);
        tree.expr = translate(tree.expr, tree.type);
        this.result = tree;
    }

    @Override
    public void visitAnnotation(JCTree.JCAnnotation tree) {
        this.result = tree;
    }

    @Override
    public void visitTry(JCTree.JCTry tree) {
        if (tree.resources.isEmpty()) {
            super.visitTry(tree);
        } else {
            this.result = makeTwrTry(tree);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<JCTree> translateTopLevelClass(Env<AttrContext> c0621Env, JCTree jCTree, TreeMaker treeMaker) {
        try {
            this.attrEnv = c0621Env;
            this.make = treeMaker;
            this.endPositions = c0621Env.toplevel.endPositions;
            this.currentClass = null;
            this.currentMethodDef = null;
            this.outermostClassDef = jCTree.getTag() == 3 ? (JCTree.JCClassDecl) jCTree : null;
            this.outermostMemberDef = null;
            this.translated = new ListBuffer<>();
            this.classdefs = new HashMap();
            this.actualSymbols = new HashMap();
            this.freevarCache = new HashMap();
            this.proxies = new Scope(this.syms.noSymbol);
            this.twrVars = new Scope(this.syms.noSymbol);
            this.outerThisStack = List.m507nil();
            this.accessNums = new HashMap();
            this.accessSyms = new HashMap();
            this.accessConstrs = new HashMap();
            this.accessConstrTags = List.m507nil();
            this.accessed = new ListBuffer<>();
            translate(jCTree, (JCTree.JCExpression) null);
            for (List list = this.accessed.toList(); list.nonEmpty(); list = list.tail) {
                makeAccessible((Symbol) list.head);
            }
            Iterator<EnumMapping> it = this.enumSwitchMap.values().iterator();
            while (it.hasNext()) {
                it.next().translate();
            }
            checkConflicts(this.translated.toList());
            checkAccessConstructorTags();
            ListBuffer<JCTree> listBuffer = this.translated;
            Object[] objArr = objArr == true ? 1 : 0;
            Object[] objArr2 = objArr == true ? 1 : 0;
            Object[] objArr3 = objArr == true ? 1 : 0;
            Object[] objArr4 = objArr == true ? 1 : 0;
            Object[] objArr5 = objArr == true ? 1 : 0;
            Object[] objArr6 = objArr == true ? 1 : 0;
            Object[] objArr7 = objArr == true ? 1 : 0;
            Object[] objArr8 = objArr == true ? 1 : 0;
            Object[] objArr9 = objArr == true ? 1 : 0;
            Object[] objArr10 = objArr == true ? 1 : 0;
            Object[] objArr11 = objArr == true ? 1 : 0;
            Object[] objArr12 = objArr == true ? 1 : 0;
            Object[] objArr13 = objArr == true ? 1 : 0;
            Object[] objArr14 = objArr == true ? 1 : 0;
            Object[] objArr15 = objArr == true ? 1 : 0;
            Object[] objArr16 = objArr == true ? 1 : 0;
            Object[] objArr17 = objArr == true ? 1 : 0;
            return listBuffer.toList();
        } finally {
            this.attrEnv = null;
            this.make = null;
            this.endPositions = null;
            this.currentClass = null;
            this.currentMethodDef = null;
            this.outermostClassDef = null;
            this.outermostMemberDef = null;
            this.translated = null;
            this.classdefs = null;
            this.actualSymbols = null;
            this.freevarCache = null;
            this.proxies = null;
            this.outerThisStack = null;
            this.accessNums = null;
            this.accessSyms = null;
            this.accessConstrs = null;
            this.accessConstrTags = null;
            this.accessed = null;
            this.enumSwitchMap.clear();
        }
    }

    private void addEnumCompatibleMembers(JCTree.JCClassDecl cdef) {
        make_at(null);
        Symbol.VarSymbol ordinalFieldSym = addEnumOrdinalField(cdef);
        Symbol.VarSymbol nameFieldSym = addEnumNameField(cdef);
        addEnumFieldOrdinalMethod(cdef, ordinalFieldSym);
        addEnumFieldNameMethod(cdef, nameFieldSym);
        addEnumToString(cdef, nameFieldSym);
        addEnumCompareTo(cdef, ordinalFieldSym);
    }

    private Symbol.VarSymbol addEnumOrdinalField(JCTree.JCClassDecl cdef) {
        Symbol.VarSymbol ordinal = new Symbol.VarSymbol(4114L, this.names.fromString("$ordinal"), this.syms.intType, cdef.f539sym);
        cdef.f539sym.members().enter(ordinal);
        cdef.defs = cdef.defs.prepend(this.make.VarDef(ordinal, null));
        return ordinal;
    }

    private Symbol.VarSymbol addEnumNameField(JCTree.JCClassDecl cdef) {
        Symbol.VarSymbol name = new Symbol.VarSymbol(4114L, this.names.fromString("$name"), this.syms.stringType, cdef.f539sym);
        cdef.f539sym.members().enter(name);
        cdef.defs = cdef.defs.prepend(this.make.VarDef(name, null));
        return name;
    }

    private Symbol.MethodSymbol addEnumFieldOrdinalMethod(JCTree.JCClassDecl cdef, Symbol.VarSymbol ordinalSymbol) {
        Symbol ordinalSym = lookupMethod(cdef.m489pos(), this.names.ordinal, cdef.type, List.m507nil());
        Assert.check(ordinalSym instanceof Symbol.MethodSymbol);
        TreeMaker treeMaker = this.make;
        JCTree.JCStatement ret = treeMaker.Return(treeMaker.Ident(ordinalSymbol));
        List<JCTree> list = cdef.defs;
        TreeMaker treeMaker2 = this.make;
        cdef.defs = list.append(treeMaker2.MethodDef((Symbol.MethodSymbol) ordinalSym, treeMaker2.Block(0L, List.m508of(ret))));
        return (Symbol.MethodSymbol) ordinalSym;
    }

    private Symbol.MethodSymbol addEnumFieldNameMethod(JCTree.JCClassDecl cdef, Symbol.VarSymbol nameSymbol) {
        Symbol nameSym = lookupMethod(cdef.m489pos(), this.names._name, cdef.type, List.m507nil());
        Assert.check(nameSym instanceof Symbol.MethodSymbol);
        TreeMaker treeMaker = this.make;
        JCTree.JCStatement ret = treeMaker.Return(treeMaker.Ident(nameSymbol));
        List<JCTree> list = cdef.defs;
        TreeMaker treeMaker2 = this.make;
        cdef.defs = list.append(treeMaker2.MethodDef((Symbol.MethodSymbol) nameSym, treeMaker2.Block(0L, List.m508of(ret))));
        return (Symbol.MethodSymbol) nameSym;
    }

    private Symbol.MethodSymbol addEnumToString(JCTree.JCClassDecl cdef, Symbol.VarSymbol nameSymbol) {
        Symbol toStringSym = lookupMethod(cdef.m489pos(), this.names.toString, cdef.type, List.m507nil());
        JCTree toStringDecl = null;
        if (toStringSym != null) {
            toStringDecl = TreeInfo.declarationFor(toStringSym, cdef);
        }
        if (toStringDecl != null) {
            return (Symbol.MethodSymbol) toStringSym;
        }
        TreeMaker treeMaker = this.make;
        JCTree.JCStatement ret = treeMaker.Return(treeMaker.Ident(nameSymbol));
        this.make.Type(this.syms.stringType);
        Type.MethodType toStringType = new Type.MethodType(List.m507nil(), this.syms.stringType, List.m507nil(), cdef.f539sym);
        Symbol toStringSym2 = new Symbol.MethodSymbol(1L, this.names.toString, toStringType, cdef.type.tsym);
        TreeMaker treeMaker2 = this.make;
        JCTree toStringDecl2 = treeMaker2.MethodDef((Symbol.MethodSymbol) toStringSym2, treeMaker2.Block(0L, List.m508of(ret)));
        cdef.defs = cdef.defs.prepend(toStringDecl2);
        cdef.f539sym.members().enter(toStringSym2);
        return (Symbol.MethodSymbol) toStringSym2;
    }

    private Symbol.MethodSymbol addEnumCompareTo(JCTree.JCClassDecl cdef, Symbol.VarSymbol ordinalSymbol) {
        Symbol compareToSym = lookupMethod(cdef.m489pos(), this.names.compareTo, cdef.type, List.m508of(cdef.f539sym.type));
        Assert.check(compareToSym instanceof Symbol.MethodSymbol);
        ListBuffer<JCTree.JCStatement> blockStatements = new ListBuffer<>();
        JCTree.JCModifiers mod1 = this.make.Modifiers(0L);
        Name oName = this.names.fromString("o");
        JCTree.JCVariableDecl par1 = this.make.Param(oName, cdef.type, compareToSym);
        JCTree.JCIdent paramId1 = this.make.Ident(this.names.java_lang_Object);
        paramId1.type = cdef.type;
        paramId1.f543sym = par1.f547sym;
        ((Symbol.MethodSymbol) compareToSym).params = List.m508of(par1.f547sym);
        JCTree.JCIdent par1UsageId = this.make.Ident(par1.f547sym);
        JCTree.JCIdent castTargetIdent = this.make.Ident(cdef.f539sym);
        JCTree.JCTypeCast cast = this.make.TypeCast(castTargetIdent, par1UsageId);
        cast.setType(castTargetIdent.type);
        Name otherName = this.names.fromString("other");
        Symbol.VarSymbol otherVarSym = new Symbol.VarSymbol(mod1.flags, otherName, cdef.type, compareToSym);
        JCTree.JCVariableDecl otherVar = this.make.VarDef(otherVarSym, cast);
        blockStatements.append(otherVar);
        JCTree.JCIdent id1 = this.make.Ident(ordinalSymbol);
        JCTree.JCIdent fLocUsageId = this.make.Ident(otherVarSym);
        JCTree.JCExpression sel = this.make.Select(fLocUsageId, ordinalSymbol);
        JCTree.JCBinary bin = makeBinary(72, id1, sel);
        JCTree.JCReturn ret = this.make.Return(bin);
        blockStatements.append(ret);
        TreeMaker treeMaker = this.make;
        JCTree.JCMethodDecl compareToMethod = treeMaker.MethodDef((Symbol.MethodSymbol) compareToSym, treeMaker.Block(0L, blockStatements.toList()));
        compareToMethod.params = List.m508of(par1);
        cdef.defs = cdef.defs.append(compareToMethod);
        return (Symbol.MethodSymbol) compareToSym;
    }
}
