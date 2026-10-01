package com.sun.tools.javac.code;

import com.sun.tools.javac.jvm.ByteCodes;
import com.sun.tools.javac.jvm.ClassReader;
import com.sun.tools.javac.jvm.Target;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.JavacMessages;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;
import java.util.HashMap;
import java.util.Map;
import javax.lang.model.element.ElementVisitor;
import javax.lang.model.type.TypeVisitor;

public class Symtab {
    protected static final Context.C0723Key<Symtab> symtabKey = new Context.C0723Key<>();
    public final Type annotationTargetType;
    public final Type annotationType;
    public final Symbol.ClassSymbol arrayClass;
    public final Symbol.MethodSymbol arrayCloneMethod;
    public final Type arraysType;
    public final Type assertionErrorType;
    public final Symbol.MethodSymbol autoCloseableClose;
    public final Type autoCloseableType;
    public final Symbol.ClassSymbol boundClass;
    public final Type classLoaderType;
    public final Type classNotFoundExceptionType;
    public final Type classType;
    public final Type cloneNotSupportedExceptionType;
    public final Type cloneableType;
    public final Type collectionsType;
    public final Type comparableType;
    public final Type deprecatedType;
    public final Symbol.MethodSymbol enumFinalFinalize;
    public final Symbol.TypeSymbol enumSym;
    public final Symbol.ClassSymbol errSymbol;
    public final Type errType;
    public final Type errorType;
    public final Type exceptionType;
    public final Type illegalArgumentExceptionType;
    public final Type inheritedType;
    public final Type interruptedExceptionType;
    public final Type iterableType;
    public final Type iteratorType;
    public final Symbol.VarSymbol lengthVar;
    public final Type listType;
    public final Symbol.ClassSymbol methodClass;
    public final Type methodHandleType;
    private final Names names;
    public final Type noClassDefFoundErrorType;
    public final Type noSuchFieldErrorType;
    public final Symbol.TypeSymbol noSymbol;
    public final Symbol.OperatorSymbol nullcheck;
    public final Type objectType;
    public final Type overrideType;
    public final Type polymorphicSignatureType;
    public final Symbol.ClassSymbol predefClass;
    public final Type proprietaryType;
    private final ClassReader reader;
    public final Type retentionType;
    public final Symbol.PackageSymbol rootPackage;
    public final Type runtimeExceptionType;
    public final Type serializableType;
    public final Type stringBufferType;
    public final Type stringBuilderType;
    public final Type stringType;
    public final Type suppressWarningsType;
    public final Type systemType;
    private final Target target;
    public final Type throwableType;
    public final Type trustMeType;
    public final Symbol.ClassSymbol unknownSymbol;
    public final Type unknownType;
    public final Symbol.PackageSymbol unnamedPackage;
    public final Type byteType = new Type(1, null);
    public final Type charType = new Type(2, null);
    public final Type shortType = new Type(3, null);
    public final Type intType = new Type(4, null);
    public final Type longType = new Type(5, null);
    public final Type floatType = new Type(6, null);
    public final Type doubleType = new Type(7, null);
    public final Type booleanType = new Type(8, null);
    public final Type botType = new Type.BottomType();
    public final Type.JCNoType voidType = new Type.JCNoType(9);
    public final Type[] typeOfTag = new Type[22];
    public final Name[] boxedName = new Name[22];
    public final Map<Name, Symbol.ClassSymbol> classes = new HashMap();
    public final Map<Name, Symbol.PackageSymbol> packages = new HashMap();

    public static Symtab instance(Context context) {
        Symtab instance = (Symtab) context.m501get(symtabKey);
        if (instance == null) {
            return new Symtab(context);
        }
        return instance;
    }

    public void initType(Type type, Symbol.ClassSymbol c) {
        type.tsym = c;
        this.typeOfTag[type.f344tag] = type;
    }

    public void initType(Type type, String name) {
        initType(type, new Symbol.ClassSymbol(1L, this.names.fromString(name), type, this.rootPackage));
    }

    public void initType(Type type, String name, String bname) {
        initType(type, name);
        this.boxedName[type.f344tag] = this.names.fromString("java.lang." + bname);
    }

    private Symbol.VarSymbol enterConstant(String name, Type type) {
        Symbol.VarSymbol c = new Symbol.VarSymbol(25L, this.names.fromString(name), type, this.predefClass);
        c.setData(type.constValue());
        this.predefClass.members().enter(c);
        return c;
    }

    private void enterBinop(String name, Type left, Type right, Type res, int opcode) {
        this.predefClass.members().enter(new Symbol.OperatorSymbol(this.names.fromString(name), new Type.MethodType(List.m509of(left, right), res, List.m507nil(), this.methodClass), opcode, this.predefClass));
    }

    private void enterBinop(String name, Type left, Type right, Type res, int opcode1, int opcode2) {
        enterBinop(name, left, right, res, (opcode1 << 9) | opcode2);
    }

    private Symbol.OperatorSymbol enterUnop(String name, Type arg, Type res, int opcode) {
        Symbol.OperatorSymbol sym = new Symbol.OperatorSymbol(this.names.fromString(name), new Type.MethodType(List.m508of(arg), res, List.m507nil(), this.methodClass), opcode, this.predefClass);
        this.predefClass.members().enter(sym);
        return sym;
    }

    private Type enterClass(String s) {
        return this.reader.enterClass(this.names.fromString(s)).type;
    }

    public void synthesizeEmptyInterfaceIfMissing(Type type) {
        final Symbol.Completer completer = type.tsym.completer;
        if (completer != null) {
            type.tsym.completer = new Symbol.Completer() {
                @Override
                public void complete(Symbol sym) throws Symbol.CompletionFailure {
                    try {
                        completer.complete(sym);
                    } catch (Symbol.CompletionFailure e) {
                        sym.flags_field |= 513;
                        ((Type.ClassType) sym.type).supertype_field = Symtab.this.objectType;
                    }
                }
            };
        }
    }

    public void synthesizeBoxTypeIfMissing(final Type type) {
        Symbol.ClassSymbol sym = this.reader.enterClass(this.boxedName[type.f344tag]);
        final Symbol.Completer completer = sym.completer;
        if (completer != null) {
            sym.completer = new Symbol.Completer() {
                @Override
                public void complete(Symbol sym2) throws Symbol.CompletionFailure {
                    try {
                        completer.complete(sym2);
                    } catch (Symbol.CompletionFailure e) {
                        sym2.flags_field |= 1;
                        ((Type.ClassType) sym2.type).supertype_field = Symtab.this.objectType;
                        Name n = Symtab.this.target.boxWithConstructors() ? Symtab.this.names.init : Symtab.this.names.valueOf;
                        Symbol.MethodSymbol boxMethod = new Symbol.MethodSymbol(9L, n, new Type.MethodType(List.m508of(type), sym2.type, List.m507nil(), Symtab.this.methodClass), sym2);
                        sym2.members().enter(boxMethod);
                        Symbol.MethodSymbol unboxMethod = new Symbol.MethodSymbol(1L, type.tsym.name.append(Symtab.this.names.Value), new Type.MethodType(List.m507nil(), type, List.m507nil(), Symtab.this.methodClass), sym2);
                        sym2.members().enter(unboxMethod);
                    }
                }
            };
        }
    }

    protected Symtab(Context context) throws Symbol.CompletionFailure {
        context.m504put(symtabKey, this);
        this.names = Names.instance(context);
        this.target = Target.instance(context);
        this.unknownType = new Type(20, null) {
            @Override
            public <R, P> R accept(TypeVisitor<R, P> v, P p) {
                return v.visitUnknown(this, p);
            }
        };
        this.rootPackage = new Symbol.PackageSymbol(this.names.empty, null);
        final JavacMessages messages = JavacMessages.instance(context);
        this.unnamedPackage = new Symbol.PackageSymbol(this.names.empty, this.rootPackage) {
            @Override
            public String toString() {
                return messages.getLocalizedString("compiler.misc.unnamed.package", new Object[0]);
            }
        };
        Symbol.TypeSymbol typeSymbol = new Symbol.TypeSymbol(0L, this.names.empty, Type.noType, this.rootPackage) {
            @Override
            public <R, P> R accept(ElementVisitor<R, P> v, P p) {
                return v.visitUnknown(this, p);
            }
        };
        this.noSymbol = typeSymbol;
        typeSymbol.kind = 0;
        this.errSymbol = new Symbol.ClassSymbol(1073741833L, this.names.f574any, null, this.rootPackage);
        this.errType = new Type.ErrorType(this.errSymbol, Type.noType);
        Symbol.ClassSymbol classSymbol = new Symbol.ClassSymbol(1073741833L, this.names.fromString("<any?>"), null, this.rootPackage);
        this.unknownSymbol = classSymbol;
        classSymbol.members_field = new Scope.ErrorScope(this.unknownSymbol);
        this.unknownSymbol.type = this.unknownType;
        initType(this.byteType, "byte", "Byte");
        initType(this.shortType, "short", "Short");
        initType(this.charType, "char", "Character");
        initType(this.intType, "int", "Integer");
        initType(this.longType, "long", "Long");
        initType(this.floatType, "float", "Float");
        initType(this.doubleType, "double", "Double");
        initType(this.booleanType, "boolean", "Boolean");
        initType(this.voidType, "void", "Void");
        initType(this.botType, "<nulltype>");
        initType(this.errType, this.errSymbol);
        initType(this.unknownType, this.unknownSymbol);
        this.arrayClass = new Symbol.ClassSymbol(1073741825L, this.names.Array, this.noSymbol);
        Symbol.ClassSymbol classSymbol2 = new Symbol.ClassSymbol(1073741825L, this.names.Bound, this.noSymbol);
        this.boundClass = classSymbol2;
        classSymbol2.members_field = new Scope.ErrorScope(this.boundClass);
        Symbol.ClassSymbol classSymbol3 = new Symbol.ClassSymbol(1073741825L, this.names.Method, this.noSymbol);
        this.methodClass = classSymbol3;
        classSymbol3.members_field = new Scope.ErrorScope(this.boundClass);
        this.predefClass = new Symbol.ClassSymbol(1073741825L, this.names.empty, this.rootPackage);
        Scope scope = new Scope(this.predefClass);
        this.predefClass.members_field = scope;
        scope.enter(this.byteType.tsym);
        scope.enter(this.shortType.tsym);
        scope.enter(this.charType.tsym);
        scope.enter(this.intType.tsym);
        scope.enter(this.longType.tsym);
        scope.enter(this.floatType.tsym);
        scope.enter(this.doubleType.tsym);
        scope.enter(this.booleanType.tsym);
        scope.enter(this.errType.tsym);
        scope.enter(this.errSymbol);
        this.classes.put(this.predefClass.fullname, this.predefClass);
        ClassReader classReaderInstance = ClassReader.instance(context);
        this.reader = classReaderInstance;
        classReaderInstance.init(this);
        this.objectType = enterClass("java.lang.Object");
        this.classType = enterClass("java.lang.Class");
        this.stringType = enterClass("java.lang.String");
        this.stringBufferType = enterClass("java.lang.StringBuffer");
        this.stringBuilderType = enterClass("java.lang.StringBuilder");
        this.cloneableType = enterClass("java.lang.Cloneable");
        this.throwableType = enterClass("java.lang.Throwable");
        this.serializableType = enterClass("java.io.Serializable");
        this.methodHandleType = enterClass("java.lang.invoke.MethodHandle");
        this.polymorphicSignatureType = enterClass("java.lang.invoke.MethodHandle$PolymorphicSignature");
        this.errorType = enterClass("java.lang.Error");
        this.illegalArgumentExceptionType = enterClass("java.lang.IllegalArgumentException");
        this.interruptedExceptionType = enterClass("java.lang.InterruptedException");
        this.exceptionType = enterClass("java.lang.Exception");
        this.runtimeExceptionType = enterClass("java.lang.RuntimeException");
        this.classNotFoundExceptionType = enterClass("java.lang.ClassNotFoundException");
        this.noClassDefFoundErrorType = enterClass("java.lang.NoClassDefFoundError");
        this.noSuchFieldErrorType = enterClass("java.lang.NoSuchFieldError");
        this.assertionErrorType = enterClass("java.lang.AssertionError");
        this.cloneNotSupportedExceptionType = enterClass("java.lang.CloneNotSupportedException");
        this.annotationType = enterClass("java.lang.annotation.Annotation");
        this.classLoaderType = enterClass("java.lang.ClassLoader");
        this.enumSym = this.reader.enterClass(this.names.java_lang_Enum);
        this.enumFinalFinalize = new Symbol.MethodSymbol(137438953492L, this.names.finalize, new Type.MethodType(List.m507nil(), this.voidType, List.m507nil(), this.methodClass), this.enumSym);
        this.listType = enterClass("java.util.List");
        this.collectionsType = enterClass("java.util.Collections");
        this.comparableType = enterClass("java.lang.Comparable");
        this.arraysType = enterClass("java.util.Arrays");
        this.iterableType = this.target.hasIterable() ? enterClass("java.lang.Iterable") : enterClass("java.util.Collection");
        this.iteratorType = enterClass("java.util.Iterator");
        this.annotationTargetType = enterClass("java.lang.annotation.Target");
        this.overrideType = enterClass("java.lang.Override");
        this.retentionType = enterClass("java.lang.annotation.Retention");
        this.deprecatedType = enterClass("java.lang.Deprecated");
        this.suppressWarningsType = enterClass("java.lang.SuppressWarnings");
        this.inheritedType = enterClass("java.lang.annotation.Inherited");
        this.systemType = enterClass("java.lang.System");
        this.autoCloseableType = enterClass("java.lang.AutoCloseable");
        this.autoCloseableClose = new Symbol.MethodSymbol(1L, this.names.close, new Type.MethodType(List.m507nil(), this.voidType, List.m508of(this.exceptionType), this.methodClass), this.autoCloseableType.tsym);
        this.trustMeType = enterClass("java.lang.SafeVarargs");
        synthesizeEmptyInterfaceIfMissing(this.autoCloseableType);
        synthesizeEmptyInterfaceIfMissing(this.cloneableType);
        synthesizeEmptyInterfaceIfMissing(this.serializableType);
        synthesizeEmptyInterfaceIfMissing(this.polymorphicSignatureType);
        synthesizeBoxTypeIfMissing(this.doubleType);
        synthesizeBoxTypeIfMissing(this.floatType);
        synthesizeBoxTypeIfMissing(this.voidType);
        Type.ClassType proprietaryType = (Type.ClassType) enterClass("sun.Proprietary+Annotation");
        this.proprietaryType = proprietaryType;
        Symbol.ClassSymbol proprietarySymbol = (Symbol.ClassSymbol) proprietaryType.tsym;
        proprietarySymbol.completer = null;
        proprietarySymbol.flags_field = 1073750529L;
        proprietarySymbol.erasure_field = proprietaryType;
        proprietarySymbol.members_field = new Scope(proprietarySymbol);
        proprietaryType.typarams_field = List.m507nil();
        proprietaryType.allparams_field = List.m507nil();
        proprietaryType.supertype_field = this.annotationType;
        proprietaryType.interfaces_field = List.m507nil();
        Type.ClassType arrayClassType = (Type.ClassType) this.arrayClass.type;
        arrayClassType.supertype_field = this.objectType;
        arrayClassType.interfaces_field = List.m509of(this.cloneableType, this.serializableType);
        this.arrayClass.members_field = new Scope(this.arrayClass);
        this.lengthVar = new Symbol.VarSymbol(17L, this.names.length, this.intType, this.arrayClass);
        this.arrayClass.members().enter(this.lengthVar);
        this.arrayCloneMethod = new Symbol.MethodSymbol(1L, this.names.clone, new Type.MethodType(List.m507nil(), this.objectType, List.m507nil(), this.methodClass), this.arrayClass);
        this.arrayClass.members().enter(this.arrayCloneMethod);
        Type type = this.doubleType;
        enterUnop("+", type, type, 0);
        Type type2 = this.floatType;
        enterUnop("+", type2, type2, 0);
        Type type3 = this.longType;
        enterUnop("+", type3, type3, 0);
        Type type4 = this.intType;
        enterUnop("+", type4, type4, 0);
        Type type5 = this.doubleType;
        enterUnop("-", type5, type5, ByteCodes.dneg);
        Type type6 = this.floatType;
        enterUnop("-", type6, type6, ByteCodes.fneg);
        Type type7 = this.longType;
        enterUnop("-", type7, type7, ByteCodes.lneg);
        Type type8 = this.intType;
        enterUnop("-", type8, type8, ByteCodes.ineg);
        Type type9 = this.longType;
        enterUnop("~", type9, type9, ByteCodes.lxor);
        Type type10 = this.intType;
        enterUnop("~", type10, type10, ByteCodes.ixor);
        Type type11 = this.doubleType;
        enterUnop("++", type11, type11, 99);
        Type type12 = this.floatType;
        enterUnop("++", type12, type12, 98);
        Type type13 = this.longType;
        enterUnop("++", type13, type13, 97);
        Type type14 = this.intType;
        enterUnop("++", type14, type14, 96);
        Type type15 = this.charType;
        enterUnop("++", type15, type15, 96);
        Type type16 = this.shortType;
        enterUnop("++", type16, type16, 96);
        Type type17 = this.byteType;
        enterUnop("++", type17, type17, 96);
        Type type18 = this.doubleType;
        enterUnop("--", type18, type18, ByteCodes.dsub);
        Type type19 = this.floatType;
        enterUnop("--", type19, type19, ByteCodes.fsub);
        Type type20 = this.longType;
        enterUnop("--", type20, type20, ByteCodes.lsub);
        Type type21 = this.intType;
        enterUnop("--", type21, type21, 100);
        Type type22 = this.charType;
        enterUnop("--", type22, type22, 100);
        Type type23 = this.shortType;
        enterUnop("--", type23, type23, 100);
        Type type24 = this.byteType;
        enterUnop("--", type24, type24, 100);
        Type type25 = this.booleanType;
        enterUnop("!", type25, type25, ByteCodes.bool_not);
        Type type26 = this.objectType;
        this.nullcheck = enterUnop("<*nullchk*>", type26, type26, ByteCodes.nullchk);
        Type type27 = this.stringType;
        enterBinop("+", type27, this.objectType, type27, 256);
        Type type28 = this.objectType;
        Type type29 = this.stringType;
        enterBinop("+", type28, type29, type29, 256);
        Type type30 = this.stringType;
        enterBinop("+", type30, type30, type30, 256);
        Type type31 = this.stringType;
        enterBinop("+", type31, this.intType, type31, 256);
        Type type32 = this.stringType;
        enterBinop("+", type32, this.longType, type32, 256);
        Type type33 = this.stringType;
        enterBinop("+", type33, this.floatType, type33, 256);
        Type type34 = this.stringType;
        enterBinop("+", type34, this.doubleType, type34, 256);
        Type type35 = this.stringType;
        enterBinop("+", type35, this.booleanType, type35, 256);
        Type type36 = this.stringType;
        enterBinop("+", type36, this.botType, type36, 256);
        Type type37 = this.intType;
        Type type38 = this.stringType;
        enterBinop("+", type37, type38, type38, 256);
        Type type39 = this.longType;
        Type type40 = this.stringType;
        enterBinop("+", type39, type40, type40, 256);
        Type type41 = this.floatType;
        Type type42 = this.stringType;
        enterBinop("+", type41, type42, type42, 256);
        Type type43 = this.doubleType;
        Type type44 = this.stringType;
        enterBinop("+", type43, type44, type44, 256);
        Type type45 = this.booleanType;
        Type type46 = this.stringType;
        enterBinop("+", type45, type46, type46, 256);
        Type type47 = this.botType;
        Type type48 = this.stringType;
        enterBinop("+", type47, type48, type48, 256);
        Type type49 = this.botType;
        enterBinop("+", type49, type49, type49, ByteCodes.error);
        Type type50 = this.botType;
        enterBinop("+", type50, this.intType, type50, ByteCodes.error);
        Type type51 = this.botType;
        enterBinop("+", type51, this.longType, type51, ByteCodes.error);
        Type type52 = this.botType;
        enterBinop("+", type52, this.floatType, type52, ByteCodes.error);
        Type type53 = this.botType;
        enterBinop("+", type53, this.doubleType, type53, ByteCodes.error);
        Type type54 = this.botType;
        enterBinop("+", type54, this.booleanType, type54, ByteCodes.error);
        Type type55 = this.botType;
        enterBinop("+", type55, this.objectType, type55, ByteCodes.error);
        Type type56 = this.intType;
        Type type57 = this.botType;
        enterBinop("+", type56, type57, type57, ByteCodes.error);
        Type type58 = this.longType;
        Type type59 = this.botType;
        enterBinop("+", type58, type59, type59, ByteCodes.error);
        Type type60 = this.floatType;
        Type type61 = this.botType;
        enterBinop("+", type60, type61, type61, ByteCodes.error);
        Type type62 = this.doubleType;
        Type type63 = this.botType;
        enterBinop("+", type62, type63, type63, ByteCodes.error);
        Type type64 = this.booleanType;
        Type type65 = this.botType;
        enterBinop("+", type64, type65, type65, ByteCodes.error);
        Type type66 = this.objectType;
        Type type67 = this.botType;
        enterBinop("+", type66, type67, type67, ByteCodes.error);
        Type type68 = this.doubleType;
        enterBinop("+", type68, type68, type68, 99);
        Type type69 = this.floatType;
        enterBinop("+", type69, type69, type69, 98);
        Type type70 = this.longType;
        enterBinop("+", type70, type70, type70, 97);
        Type type71 = this.intType;
        enterBinop("+", type71, type71, type71, 96);
        Type type72 = this.doubleType;
        enterBinop("-", type72, type72, type72, ByteCodes.dsub);
        Type type73 = this.floatType;
        enterBinop("-", type73, type73, type73, ByteCodes.fsub);
        Type type74 = this.longType;
        enterBinop("-", type74, type74, type74, ByteCodes.lsub);
        Type type75 = this.intType;
        enterBinop("-", type75, type75, type75, 100);
        Type type76 = this.doubleType;
        enterBinop("*", type76, type76, type76, ByteCodes.dmul);
        Type type77 = this.floatType;
        enterBinop("*", type77, type77, type77, ByteCodes.fmul);
        Type type78 = this.longType;
        enterBinop("*", type78, type78, type78, ByteCodes.lmul);
        Type type79 = this.intType;
        enterBinop("*", type79, type79, type79, ByteCodes.imul);
        Type type80 = this.doubleType;
        enterBinop("/", type80, type80, type80, ByteCodes.ddiv);
        Type type81 = this.floatType;
        enterBinop("/", type81, type81, type81, ByteCodes.fdiv);
        Type type82 = this.longType;
        enterBinop("/", type82, type82, type82, ByteCodes.ldiv);
        Type type83 = this.intType;
        enterBinop("/", type83, type83, type83, ByteCodes.idiv);
        Type type84 = this.doubleType;
        enterBinop("%", type84, type84, type84, ByteCodes.dmod);
        Type type85 = this.floatType;
        enterBinop("%", type85, type85, type85, ByteCodes.fmod);
        Type type86 = this.longType;
        enterBinop("%", type86, type86, type86, ByteCodes.lmod);
        Type type87 = this.intType;
        enterBinop("%", type87, type87, type87, ByteCodes.imod);
        Type type88 = this.booleanType;
        enterBinop("&", type88, type88, type88, ByteCodes.iand);
        Type type89 = this.longType;
        enterBinop("&", type89, type89, type89, 127);
        Type type90 = this.intType;
        enterBinop("&", type90, type90, type90, ByteCodes.iand);
        Type type91 = this.booleanType;
        enterBinop("|", type91, type91, type91, 128);
        Type type92 = this.longType;
        enterBinop("|", type92, type92, type92, ByteCodes.f416lor);
        Type type93 = this.intType;
        enterBinop("|", type93, type93, type93, 128);
        Type type94 = this.booleanType;
        enterBinop("^", type94, type94, type94, ByteCodes.ixor);
        Type type95 = this.longType;
        enterBinop("^", type95, type95, type95, ByteCodes.lxor);
        Type type96 = this.intType;
        enterBinop("^", type96, type96, type96, ByteCodes.ixor);
        Type type97 = this.longType;
        enterBinop("<<", type97, type97, type97, ByteCodes.lshll);
        Type type98 = this.intType;
        enterBinop("<<", type98, this.longType, type98, ByteCodes.ishll);
        Type type99 = this.longType;
        enterBinop("<<", type99, this.intType, type99, ByteCodes.lshl);
        Type type100 = this.intType;
        enterBinop("<<", type100, type100, type100, ByteCodes.ishl);
        Type type101 = this.longType;
        enterBinop(">>", type101, type101, type101, ByteCodes.lshrl);
        Type type102 = this.intType;
        enterBinop(">>", type102, this.longType, type102, ByteCodes.ishrl);
        Type type103 = this.longType;
        enterBinop(">>", type103, this.intType, type103, ByteCodes.lshr);
        Type type104 = this.intType;
        enterBinop(">>", type104, type104, type104, ByteCodes.ishr);
        Type type105 = this.longType;
        enterBinop(">>>", type105, type105, type105, ByteCodes.lushrl);
        Type type106 = this.intType;
        enterBinop(">>>", type106, this.longType, type106, ByteCodes.iushrl);
        Type type107 = this.longType;
        enterBinop(">>>", type107, this.intType, type107, ByteCodes.lushr);
        Type type108 = this.intType;
        enterBinop(">>>", type108, type108, type108, ByteCodes.iushr);
        Type type109 = this.doubleType;
        enterBinop("<", type109, type109, this.booleanType, ByteCodes.dcmpg, ByteCodes.iflt);
        Type type110 = this.floatType;
        enterBinop("<", type110, type110, this.booleanType, ByteCodes.fcmpg, ByteCodes.iflt);
        Type type111 = this.longType;
        enterBinop("<", type111, type111, this.booleanType, ByteCodes.lcmp, ByteCodes.iflt);
        Type type112 = this.intType;
        enterBinop("<", type112, type112, this.booleanType, ByteCodes.if_icmplt);
        Type type113 = this.doubleType;
        enterBinop(">", type113, type113, this.booleanType, ByteCodes.dcmpl, ByteCodes.ifgt);
        Type type114 = this.floatType;
        enterBinop(">", type114, type114, this.booleanType, ByteCodes.fcmpl, ByteCodes.ifgt);
        Type type115 = this.longType;
        enterBinop(">", type115, type115, this.booleanType, ByteCodes.lcmp, ByteCodes.ifgt);
        Type type116 = this.intType;
        enterBinop(">", type116, type116, this.booleanType, ByteCodes.if_icmpgt);
        Type type117 = this.doubleType;
        enterBinop("<=", type117, type117, this.booleanType, ByteCodes.dcmpg, ByteCodes.ifle);
        Type type118 = this.floatType;
        enterBinop("<=", type118, type118, this.booleanType, ByteCodes.fcmpg, ByteCodes.ifle);
        Type type119 = this.longType;
        enterBinop("<=", type119, type119, this.booleanType, ByteCodes.lcmp, ByteCodes.ifle);
        Type type120 = this.intType;
        enterBinop("<=", type120, type120, this.booleanType, ByteCodes.if_icmple);
        Type type121 = this.doubleType;
        enterBinop(">=", type121, type121, this.booleanType, ByteCodes.dcmpl, ByteCodes.ifge);
        Type type122 = this.floatType;
        enterBinop(">=", type122, type122, this.booleanType, ByteCodes.fcmpl, ByteCodes.ifge);
        Type type123 = this.longType;
        enterBinop(">=", type123, type123, this.booleanType, ByteCodes.lcmp, ByteCodes.ifge);
        Type type124 = this.intType;
        enterBinop(">=", type124, type124, this.booleanType, ByteCodes.if_icmpge);
        Type type125 = this.objectType;
        enterBinop("==", type125, type125, this.booleanType, ByteCodes.if_acmpeq);
        Type type126 = this.booleanType;
        enterBinop("==", type126, type126, type126, ByteCodes.if_icmpeq);
        Type type127 = this.doubleType;
        enterBinop("==", type127, type127, this.booleanType, ByteCodes.dcmpl, ByteCodes.ifeq);
        Type type128 = this.floatType;
        enterBinop("==", type128, type128, this.booleanType, ByteCodes.fcmpl, ByteCodes.ifeq);
        Type type129 = this.longType;
        enterBinop("==", type129, type129, this.booleanType, ByteCodes.lcmp, ByteCodes.ifeq);
        Type type130 = this.intType;
        enterBinop("==", type130, type130, this.booleanType, ByteCodes.if_icmpeq);
        Type type131 = this.objectType;
        enterBinop("!=", type131, type131, this.booleanType, ByteCodes.if_acmpne);
        Type type132 = this.booleanType;
        enterBinop("!=", type132, type132, type132, ByteCodes.if_icmpne);
        Type type133 = this.doubleType;
        enterBinop("!=", type133, type133, this.booleanType, ByteCodes.dcmpl, ByteCodes.ifne);
        Type type134 = this.floatType;
        enterBinop("!=", type134, type134, this.booleanType, ByteCodes.fcmpl, ByteCodes.ifne);
        Type type135 = this.longType;
        enterBinop("!=", type135, type135, this.booleanType, ByteCodes.lcmp, ByteCodes.ifne);
        Type type136 = this.intType;
        enterBinop("!=", type136, type136, this.booleanType, ByteCodes.if_icmpne);
        Type type137 = this.booleanType;
        enterBinop("&&", type137, type137, type137, ByteCodes.bool_and);
        Type type138 = this.booleanType;
        enterBinop("||", type138, type138, type138, ByteCodes.bool_or);
    }
}
