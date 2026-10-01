package com.sun.tools.javac.jvm;

import com.google.common.primitives.UnsignedBytes;
import com.sun.tools.javac.code.Attribute;
import com.sun.tools.javac.code.BoundKind;
import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.code.Lint;
import com.sun.tools.javac.code.Scope;
import com.sun.tools.javac.code.Source;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Symtab;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.code.TypeAnnotationPosition;
import com.sun.tools.javac.code.Types;
import com.sun.tools.javac.comp.Annotate;
import com.sun.tools.javac.file.BaseFileObject;
import com.sun.tools.javac.main.OptionName;
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
import com.sun.tools.javac.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.lang.model.SourceVersion;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import sun.reflect.ClassFileConstants;

public class ClassReader implements Symbol.Completer {
    public static final int INITIAL_BUFFER_SIZE = 65520;
    protected static final Context.C0723Key<ClassReader> classReaderKey = new Context.C0723Key<>();
    boolean allowAnnotations;
    boolean allowGenerics;
    boolean allowSimplifiedVarargs;
    boolean allowVarargs;
    Annotate annotate;

    int f423bp;
    private boolean cacheCompletionFailure;
    private Symbol.CompletionFailure cachedCompletionFailure;
    boolean checkClassFile;
    private Map<Name, Symbol.ClassSymbol> classes;
    final Name completionFailureName;
    protected JavaFileManager.Location currentLoc;
    JCDiagnostic.Factory diagFactory;
    private final JavaFileManager fileManager;
    boolean haveParameterNameIndices;
    boolean lintClassfile;

    final Log f425log;
    int majorVersion;
    int minorVersion;
    final Names names;
    private Map<Name, Symbol.PackageSymbol> packages;
    int[] parameterNameIndices;
    int[] poolIdx;
    Object[] poolObj;
    public boolean preferSource;
    public boolean saveParameterNames;
    int siglimit;
    byte[] signature;
    int sigp;
    Symtab syms;
    Types types;
    protected Scope typevars;
    boolean verbose;
    private boolean verbosePath;
    public boolean readAllOfClassFile = false;
    public SourceCompleter sourceCompleter = null;
    protected JavaFileObject currentClassFile = null;
    protected Symbol currentOwner = null;

    byte[] f424buf = new byte[INITIAL_BUFFER_SIZE];
    Set<Name> warnedAttrs = new HashSet();
    boolean sigEnterPhase = false;
    byte[] signatureBuffer = new byte[0];

    int f426sbp = 0;
    protected Set<AttributeKind> CLASS_ATTRIBUTE = EnumSet.of(AttributeKind.CLASS);
    protected Set<AttributeKind> MEMBER_ATTRIBUTE = EnumSet.of(AttributeKind.MEMBER);
    protected Set<AttributeKind> CLASS_OR_MEMBER_ATTRIBUTE = EnumSet.of(AttributeKind.CLASS, AttributeKind.MEMBER);
    protected Map<Name, AttributeReader> attributeReaders = new HashMap();
    private boolean readingClassAttr = false;
    private List<Type> missingTypeVariables = List.m507nil();
    private List<Type> foundTypeVariables = List.m507nil();
    private boolean suppressFlush = false;
    private boolean filling = false;

    protected enum AttributeKind {
        CLASS,
        MEMBER
    }

    interface ProxyVisitor extends Attribute.Visitor {
        void visitArrayAttributeProxy(ArrayAttributeProxy arrayAttributeProxy);

        void visitCompoundAnnotationProxy(CompoundAnnotationProxy compoundAnnotationProxy);

        void visitEnumAttributeProxy(EnumAttributeProxy enumAttributeProxy);
    }

    public interface SourceCompleter {
        void complete(Symbol.ClassSymbol classSymbol) throws Symbol.CompletionFailure;
    }

    public static ClassReader instance(Context context) {
        ClassReader instance = (ClassReader) context.m501get(classReaderKey);
        if (instance == null) {
            return new ClassReader(context, true);
        }
        return instance;
    }

    public void init(Symtab syms) {
        init(syms, true);
    }

    private void init(Symtab syms, boolean definitive) {
        if (this.classes != null) {
            return;
        }
        if (definitive) {
            Map<Name, Symbol.PackageSymbol> map = this.packages;
            Assert.check(map == null || map == syms.packages);
            this.packages = syms.packages;
            Map<Name, Symbol.ClassSymbol> map2 = this.classes;
            Assert.check(map2 == null || map2 == syms.classes);
            this.classes = syms.classes;
        } else {
            this.packages = new HashMap();
            this.classes = new HashMap();
        }
        this.packages.put(this.names.empty, syms.rootPackage);
        syms.rootPackage.completer = this;
        syms.unnamedPackage.completer = this;
    }

    protected ClassReader(Context context, boolean definitive) {
        Symbol.CompletionFailure completionFailure = new Symbol.CompletionFailure((Symbol) null, (JCDiagnostic) null);
        this.cachedCompletionFailure = completionFailure;
        completionFailure.setStackTrace(new StackTraceElement[0]);
        this.verbosePath = true;
        if (definitive) {
            context.m504put(classReaderKey, this);
        }
        this.names = Names.instance(context);
        this.syms = Symtab.instance(context);
        this.types = Types.instance(context);
        JavaFileManager javaFileManager = (JavaFileManager) context.m502get(JavaFileManager.class);
        this.fileManager = javaFileManager;
        if (javaFileManager == null) {
            throw new AssertionError("FileManager initialization error");
        }
        this.diagFactory = JCDiagnostic.Factory.instance(context);
        init(this.syms, definitive);
        this.f425log = Log.instance(context);
        Options options = Options.instance(context);
        this.annotate = Annotate.instance(context);
        this.verbose = options.isSet(OptionName.VERBOSE);
        this.checkClassFile = options.isSet("-checkclassfile");
        Source source = Source.instance(context);
        this.allowGenerics = source.allowGenerics();
        this.allowVarargs = source.allowVarargs();
        this.allowAnnotations = source.allowAnnotations();
        this.allowSimplifiedVarargs = source.allowSimplifiedVarargs();
        this.saveParameterNames = options.isSet("save-parameter-names");
        this.cacheCompletionFailure = options.isUnset("dev");
        this.preferSource = "source".equals(options.m515get("-Xprefer"));
        this.completionFailureName = options.isSet("failcomplete") ? this.names.fromString(options.m515get("failcomplete")) : null;
        this.typevars = new Scope(this.syms.noSymbol);
        this.lintClassfile = Lint.instance(context).isEnabled(Lint.LintCategory.CLASSFILE);
        initAttributeReaders();
    }

    private void enterMember(Symbol.ClassSymbol c, Symbol sym) {
        if ((sym.flags_field & 2147487744L) != 4096) {
            c.members_field.enter(sym);
        }
    }

    public class BadClassFile extends Symbol.CompletionFailure {
        private static final long serialVersionUID = 0;

        public BadClassFile(Symbol.TypeSymbol sym, JavaFileObject file, JCDiagnostic diag) {
            super(sym, ClassReader.this.createBadClassFileDiagnostic(file, diag));
        }
    }

    public JCDiagnostic createBadClassFileDiagnostic(JavaFileObject file, JCDiagnostic diag) {
        String key = file.getKind() == JavaFileObject.Kind.SOURCE ? "bad.source.file.header" : "bad.class.file.header";
        return this.diagFactory.fragment(key, file, diag);
    }

    public BadClassFile badClassFile(String key, Object... args) {
        return new BadClassFile(this.currentOwner.enclClass(), this.currentClassFile, this.diagFactory.fragment(key, args));
    }

    char nextChar() {
        byte[] bArr = this.f424buf;
        int i = this.f423bp;
        int i2 = i + 1;
        this.f423bp = i2;
        int i3 = (bArr[i] & UnsignedBytes.MAX_VALUE) << 8;
        this.f423bp = i2 + 1;
        return (char) (i3 + (bArr[i2] & UnsignedBytes.MAX_VALUE));
    }

    byte nextByte() {
        byte[] bArr = this.f424buf;
        int i = this.f423bp;
        this.f423bp = i + 1;
        return bArr[i];
    }

    int nextInt() {
        byte[] bArr = this.f424buf;
        int i = this.f423bp;
        int i2 = i + 1;
        this.f423bp = i2;
        int i3 = (bArr[i] & UnsignedBytes.MAX_VALUE) << 24;
        int i4 = i2 + 1;
        this.f423bp = i4;
        int i5 = i3 + ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 16);
        int i6 = i4 + 1;
        this.f423bp = i6;
        int i7 = i5 + ((bArr[i4] & UnsignedBytes.MAX_VALUE) << 8);
        this.f423bp = i6 + 1;
        return i7 + (bArr[i6] & UnsignedBytes.MAX_VALUE);
    }

    char getChar(int bp) {
        byte[] bArr = this.f424buf;
        return (char) (((bArr[bp] & UnsignedBytes.MAX_VALUE) << 8) + (bArr[bp + 1] & UnsignedBytes.MAX_VALUE));
    }

    int getInt(int bp) {
        byte[] bArr = this.f424buf;
        return ((bArr[bp] & UnsignedBytes.MAX_VALUE) << 24) + ((bArr[bp + 1] & UnsignedBytes.MAX_VALUE) << 16) + ((bArr[bp + 2] & UnsignedBytes.MAX_VALUE) << 8) + (bArr[bp + 3] & UnsignedBytes.MAX_VALUE);
    }

    long getLong(int bp) {
        DataInputStream bufin = new DataInputStream(new ByteArrayInputStream(this.f424buf, bp, 8));
        try {
            return bufin.readLong();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    float getFloat(int bp) {
        DataInputStream bufin = new DataInputStream(new ByteArrayInputStream(this.f424buf, bp, 4));
        try {
            return bufin.readFloat();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    double getDouble(int bp) {
        DataInputStream bufin = new DataInputStream(new ByteArrayInputStream(this.f424buf, bp, 8));
        try {
            return bufin.readDouble();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    void indexPool() {
        int[] iArr = new int[nextChar()];
        this.poolIdx = iArr;
        this.poolObj = new Object[iArr.length];
        int i = 1;
        while (true) {
            int[] iArr2 = this.poolIdx;
            if (i < iArr2.length) {
                int i2 = i + 1;
                int i3 = this.f423bp;
                iArr2[i] = i3;
                byte[] bArr = this.f424buf;
                int i4 = i3 + 1;
                this.f423bp = i4;
                byte tag = bArr[i3];
                switch (tag) {
                    case 1:
                    case 2:
                        int len = nextChar();
                        this.f423bp += len;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 18:
                        this.f423bp = i4 + 4;
                        break;
                    case 5:
                    case 6:
                        this.f423bp = i4 + 8;
                        i = i2 + 1;
                        continue;
                    case 7:
                    case 8:
                    case 16:
                        this.f423bp = i4 + 2;
                        break;
                    case 13:
                    case 14:
                    case 17:
                    default:
                        throw badClassFile("bad.const.pool.tag.at", Byte.toString(tag), Integer.toString(this.f423bp - 1));
                    case 15:
                        this.f423bp = i4 + 3;
                        break;
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    Object readPool(int i) {
        Object[] objArr = this.poolObj;
        Object result = objArr[i];
        if (result != null) {
            return result;
        }
        int index = this.poolIdx[i];
        if (index == 0) {
            return null;
        }
        byte[] bArr = this.f424buf;
        byte tag = bArr[index];
        switch (tag) {
            case 1:
                objArr[i] = this.names.fromUtf(bArr, index + 3, getChar(index + 1));
                break;
            case 2:
                throw badClassFile("unicode.str.not.supported", new Object[0]);
            case 3:
                objArr[i] = Integer.valueOf(getInt(index + 1));
                break;
            case 4:
                objArr[i] = new Float(getFloat(index + 1));
                break;
            case 5:
                objArr[i] = new Long(getLong(index + 1));
                break;
            case 6:
                objArr[i] = new Double(getDouble(index + 1));
                break;
            case 7:
                objArr[i] = readClassOrType(getChar(index + 1));
                break;
            case 8:
                objArr[i] = readName(getChar(index + 1)).toString();
                break;
            case 9:
                Symbol.ClassSymbol owner = readClassSymbol(getChar(index + 1));
                ClassFile.NameAndType nt = (ClassFile.NameAndType) readPool(getChar(index + 3));
                this.poolObj[i] = new Symbol.VarSymbol(0L, nt.name, nt.type, owner);
                break;
            case 10:
            case 11:
                Symbol.ClassSymbol owner2 = readClassSymbol(getChar(index + 1));
                ClassFile.NameAndType nt2 = (ClassFile.NameAndType) readPool(getChar(index + 3));
                this.poolObj[i] = new Symbol.MethodSymbol(0L, nt2.name, nt2.type, owner2);
                break;
            case 12:
                objArr[i] = new ClassFile.NameAndType(readName(getChar(index + 1)), readType(getChar(index + 3)));
                break;
            case 13:
            case 14:
            case 17:
            default:
                throw badClassFile("bad.const.pool.tag", Byte.toString(tag));
            case 15:
                skipBytes(4);
                break;
            case 16:
                skipBytes(3);
                break;
            case 18:
                skipBytes(5);
                break;
        }
        return this.poolObj[i];
    }

    Type readType(int i) {
        int index = this.poolIdx[i];
        return sigToType(this.f424buf, index + 3, getChar(index + 1));
    }

    Object readClassOrType(int i) {
        int index = this.poolIdx[i];
        int len = getChar(index + 1);
        int start = index + 3;
        byte[] bArr = this.f424buf;
        Assert.check(bArr[start] == 91 || bArr[(start + len) - 1] != 59);
        byte[] bArr2 = this.f424buf;
        if (bArr2[start] == 91 || bArr2[(start + len) - 1] == 59) {
            return sigToType(this.f424buf, start, len);
        }
        return enterClass(this.names.fromUtf(ClassFile.internalize(bArr2, start, len)));
    }

    List<Type> readTypeParams(int i) {
        int index = this.poolIdx[i];
        return sigToTypeParams(this.f424buf, index + 3, getChar(index + 1));
    }

    Symbol.ClassSymbol readClassSymbol(int i) {
        return (Symbol.ClassSymbol) readPool(i);
    }

    Name readName(int i) {
        return (Name) readPool(i);
    }

    Type sigToType(byte[] sig, int offset, int len) {
        this.signature = sig;
        this.sigp = offset;
        this.siglimit = offset + len;
        return sigToType();
    }

    Type sigToType() {
        byte[] bArr;
        int i;
        byte[] bArr2 = this.signature;
        int i2 = this.sigp;
        char c = (char) bArr2[i2];
        if (c != '(') {
            if (c == '-') {
                this.sigp = i2 + 1;
                Type t = sigToType();
                return new Type.WildcardType(t, BoundKind.SUPER, this.syms.boundClass);
            }
            if (c == '<') {
                this.typevars = this.typevars.mo451dup(this.currentOwner);
                Type poly = new Type.ForAll(sigToTypeParams(), sigToType());
                this.typevars = this.typevars.leave();
                return poly;
            }
            if (c == 'F') {
                this.sigp = i2 + 1;
                return this.syms.floatType;
            }
            if (c == 'L') {
                Type t2 = classSigToType();
                int i3 = this.sigp;
                if (i3 < this.siglimit && this.signature[i3] == 46) {
                    throw badClassFile("deprecated inner class signature syntax (please recompile from source)", new Object[0]);
                }
                return t2;
            }
            if (c == 'V') {
                this.sigp = i2 + 1;
                return this.syms.voidType;
            }
            if (c == '*') {
                this.sigp = i2 + 1;
                return new Type.WildcardType(this.syms.objectType, BoundKind.UNBOUND, this.syms.boundClass);
            }
            if (c == '+') {
                this.sigp = i2 + 1;
                Type t3 = sigToType();
                return new Type.WildcardType(t3, BoundKind.EXTENDS, this.syms.boundClass);
            }
            if (c == 'I') {
                this.sigp = i2 + 1;
                return this.syms.intType;
            }
            if (c == 'J') {
                this.sigp = i2 + 1;
                return this.syms.longType;
            }
            if (c == 'S') {
                this.sigp = i2 + 1;
                return this.syms.shortType;
            }
            if (c == 'T') {
                this.sigp = i2 + 1;
                int start = this.sigp;
                while (true) {
                    bArr = this.signature;
                    i = this.sigp;
                    if (bArr[i] == 59) {
                        break;
                    }
                    this.sigp = i + 1;
                }
                int i4 = i + 1;
                this.sigp = i4;
                if (this.sigEnterPhase) {
                    return Type.noType;
                }
                return findTypeVar(this.names.fromUtf(bArr, start, (i4 - 1) - start));
            }
            if (c == 'Z') {
                this.sigp = i2 + 1;
                return this.syms.booleanType;
            }
            if (c != '[') {
                switch (c) {
                    case 'B':
                        this.sigp = i2 + 1;
                        return this.syms.byteType;
                    case 'C':
                        this.sigp = i2 + 1;
                        return this.syms.charType;
                    case 'D':
                        this.sigp = i2 + 1;
                        return this.syms.doubleType;
                    default:
                        throw badClassFile("bad.signature", Convert.utf2string(bArr2, i2, 10));
                }
            }
            this.sigp = i2 + 1;
            return new Type.ArrayType(sigToType(), this.syms.arrayClass);
        }
        this.sigp = i2 + 1;
        List<Type> argtypes = sigToTypes(')');
        Type restype = sigToType();
        List<Type> thrown = List.m507nil();
        while (true) {
            byte[] bArr3 = this.signature;
            int i5 = this.sigp;
            if (bArr3[i5] == 94) {
                this.sigp = i5 + 1;
                thrown = thrown.prepend(sigToType());
            } else {
                return new Type.MethodType(argtypes, restype, thrown.reverse(), this.syms.methodClass);
            }
        }
    }

    Type classSigToType() {
        Type outer;
        byte[] bArr = this.signature;
        int i = this.sigp;
        if (bArr[i] != 76) {
            throw badClassFile("bad.class.signature", Convert.utf2string(bArr, i, 10));
        }
        this.sigp = i + 1;
        Type outer2 = Type.noType;
        int startSbp = this.f426sbp;
        while (true) {
            byte[] bArr2 = this.signature;
            int i2 = this.sigp;
            this.sigp = i2 + 1;
            byte c = bArr2[i2];
            if (c == 46) {
                byte[] bArr3 = this.signatureBuffer;
                int i3 = this.f426sbp;
                this.f426sbp = i3 + 1;
                bArr3[i3] = ClassFileConstants.opc_fload_2;
            } else if (c == 47) {
                byte[] bArr4 = this.signatureBuffer;
                int i4 = this.f426sbp;
                this.f426sbp = i4 + 1;
                bArr4[i4] = 46;
            } else {
                if (c == 59) {
                    Symbol.ClassSymbol t = enterClass(this.names.fromUtf(this.signatureBuffer, startSbp, this.f426sbp - startSbp));
                    if (outer2 == Type.noType) {
                        outer = t.erasure(this.types);
                    } else {
                        outer = new Type.ClassType(outer2, List.m507nil(), t);
                    }
                    this.f426sbp = startSbp;
                    return outer;
                }
                if (c == 60) {
                    outer2 = new Type.ClassType(outer2, sigToTypes('>'), enterClass(this.names.fromUtf(this.signatureBuffer, startSbp, this.f426sbp - startSbp))) {
                        boolean completed = false;

                        @Override
                        public Type getEnclosingType() {
                            if (!this.completed) {
                                this.completed = true;
                                this.tsym.complete();
                                Type enclosingType = this.tsym.type.getEnclosingType();
                                if (enclosingType != Type.noType) {
                                    List<Type> typeArgs = super.getEnclosingType().allparams();
                                    List<Type> typeParams = enclosingType.allparams();
                                    if (typeParams.length() != typeArgs.length()) {
                                        super.setEnclosingType(ClassReader.this.types.erasure(enclosingType));
                                    } else {
                                        super.setEnclosingType(ClassReader.this.types.subst(enclosingType, typeParams, typeArgs));
                                    }
                                } else {
                                    super.setEnclosingType(Type.noType);
                                }
                            }
                            return super.getEnclosingType();
                        }

                        @Override
                        public void setEnclosingType(Type outer3) {
                            throw new UnsupportedOperationException();
                        }
                    };
                    byte[] bArr5 = this.signature;
                    int i5 = this.sigp;
                    int i6 = i5 + 1;
                    this.sigp = i6;
                    byte b = bArr5[i5];
                    if (b == 46) {
                        byte[] bArr6 = this.signatureBuffer;
                        int i7 = this.f426sbp;
                        this.f426sbp = i7 + 1;
                        bArr6[i7] = ClassFileConstants.opc_fload_2;
                    } else if (b == 59) {
                        if (i6 < bArr5.length && bArr5[i6] == 46) {
                            int i8 = this.f426sbp;
                            this.sigp = i6 + (i8 - startSbp) + 3;
                            byte[] bArr7 = this.signatureBuffer;
                            this.f426sbp = i8 + 1;
                            bArr7[i8] = ClassFileConstants.opc_fload_2;
                        } else {
                            this.f426sbp = startSbp;
                            return outer2;
                        }
                    } else {
                        throw new AssertionError((int) this.signature[this.sigp - 1]);
                    }
                } else {
                    byte[] bArr8 = this.signatureBuffer;
                    int i9 = this.f426sbp;
                    this.f426sbp = i9 + 1;
                    bArr8[i9] = c;
                }
            }
        }
    }

    List<Type> sigToTypes(char terminator) {
        List<Type> head = List.m508of((Object) null);
        List<Type> tail = head;
        while (true) {
            byte[] bArr = this.signature;
            int i = this.sigp;
            if (bArr[i] != terminator) {
                tail = tail.setTail(List.m508of(sigToType()));
            } else {
                this.sigp = i + 1;
                return head.tail;
            }
        }
    }

    List<Type> sigToTypeParams(byte[] sig, int offset, int len) {
        this.signature = sig;
        this.sigp = offset;
        this.siglimit = offset + len;
        return sigToTypeParams();
    }

    List<Type> sigToTypeParams() {
        int i;
        List<Type> tvars = List.m507nil();
        byte[] bArr = this.signature;
        int i2 = this.sigp;
        if (bArr[i2] == 60) {
            this.sigp = i2 + 1;
            int start = this.sigp;
            this.sigEnterPhase = true;
            while (this.signature[this.sigp] != 62) {
                tvars = tvars.prepend(sigToTypeParam());
            }
            this.sigEnterPhase = false;
            this.sigp = start;
            while (true) {
                byte[] bArr2 = this.signature;
                i = this.sigp;
                if (bArr2[i] == 62) {
                    break;
                }
                sigToTypeParam();
            }
            this.sigp = i + 1;
        }
        return tvars.reverse();
    }

    Type sigToTypeParam() {
        byte[] bArr;
        int i;
        Type.TypeVar tvar;
        int start = this.sigp;
        while (true) {
            bArr = this.signature;
            i = this.sigp;
            if (bArr[i] == 58) {
                break;
            }
            this.sigp = i + 1;
        }
        Name name = this.names.fromUtf(bArr, start, i - start);
        if (this.sigEnterPhase) {
            tvar = new Type.TypeVar(name, this.currentOwner, this.syms.botType);
            this.typevars.enter(tvar.tsym);
        } else {
            tvar = (Type.TypeVar) findTypeVar(name);
        }
        List<Type> bounds = List.m507nil();
        Type st = null;
        byte[] bArr2 = this.signature;
        int i2 = this.sigp;
        if (bArr2[i2] == 58 && bArr2[i2 + 1] == 58) {
            this.sigp = i2 + 1;
            st = this.syms.objectType;
        }
        while (true) {
            byte[] bArr3 = this.signature;
            int i3 = this.sigp;
            if (bArr3[i3] != 58) {
                break;
            }
            this.sigp = i3 + 1;
            bounds = bounds.prepend(sigToType());
        }
        if (!this.sigEnterPhase) {
            this.types.setBounds(tvar, bounds.reverse(), st);
        }
        return tvar;
    }

    Type findTypeVar(Name name) {
        Scope.Entry e = this.typevars.lookup(name);
        if (e.scope != null) {
            return e.f338sym.type;
        }
        if (!this.readingClassAttr) {
            throw badClassFile("undecl.type.var", name);
        }
        Type.TypeVar t = new Type.TypeVar(name, this.currentOwner, this.syms.botType);
        this.missingTypeVariables = this.missingTypeVariables.prepend(t);
        return t;
    }

    protected abstract class AttributeReader {
        final Set<AttributeKind> kinds;
        final Name name;
        final ClassFile.Version version;

        abstract void read(Symbol symbol, int i);

        AttributeReader(Name name, ClassFile.Version version, Set<AttributeKind> kinds) {
            this.name = name;
            this.version = version;
            this.kinds = kinds;
        }

        boolean accepts(AttributeKind kind) {
            if (this.kinds.contains(kind)) {
                if (ClassReader.this.majorVersion > this.version.major || (ClassReader.this.majorVersion == this.version.major && ClassReader.this.minorVersion >= this.version.minor)) {
                    return true;
                }
                if (ClassReader.this.lintClassfile && !ClassReader.this.warnedAttrs.contains(this.name)) {
                    JavaFileObject prev = ClassReader.this.f425log.useSource(ClassReader.this.currentClassFile);
                    try {
                        ClassReader.this.f425log.warning(Lint.LintCategory.CLASSFILE, (JCDiagnostic.DiagnosticPosition) null, "future.attr", this.name, Integer.valueOf(this.version.major), Integer.valueOf(this.version.minor), Integer.valueOf(ClassReader.this.majorVersion), Integer.valueOf(ClassReader.this.minorVersion));
                        ClassReader.this.f425log.useSource(prev);
                        ClassReader.this.warnedAttrs.add(this.name);
                    } catch (Throwable th) {
                        ClassReader.this.f425log.useSource(prev);
                        throw th;
                    }
                }
            }
            return false;
        }
    }

    private void initAttributeReaders() {
        AttributeReader[] readers = {new AttributeReader(this.names.Code, ClassFile.Version.V45_3, this.MEMBER_ATTRIBUTE) {
            @Override
            void read(Symbol sym, int attrLen) {
                if (ClassReader.this.readAllOfClassFile || ClassReader.this.saveParameterNames) {
                    ((Symbol.MethodSymbol) sym).code = ClassReader.this.readCode(sym);
                } else {
                    ClassReader.this.f423bp += attrLen;
                }
            }
        }, new AttributeReader(this.names.ConstantValue, ClassFile.Version.V45_3, this.MEMBER_ATTRIBUTE) {
            @Override
            void read(Symbol sym, int attrLen) {
                ClassReader classReader = ClassReader.this;
                Object v = classReader.readPool(classReader.nextChar());
                if ((sym.flags() & 16) != 0) {
                    ((Symbol.VarSymbol) sym).setData(v);
                }
            }
        }, new AttributeReader(this.names.Deprecated, ClassFile.Version.V45_3, this.CLASS_OR_MEMBER_ATTRIBUTE) {
            @Override
            void read(Symbol sym, int attrLen) {
                sym.flags_field |= 131072;
            }
        }, new AttributeReader(this.names.Exceptions, ClassFile.Version.V45_3, this.CLASS_OR_MEMBER_ATTRIBUTE) {
            @Override
            void read(Symbol sym, int attrLen) {
                int nexceptions = ClassReader.this.nextChar();
                List<Type> thrown = List.m507nil();
                for (int j = 0; j < nexceptions; j++) {
                    ClassReader classReader = ClassReader.this;
                    thrown = thrown.prepend(classReader.readClassSymbol(classReader.nextChar()).type);
                }
                if (sym.type.mo575getThrownTypes().isEmpty()) {
                    sym.type.asMethodType().thrown = thrown.reverse();
                }
            }
        }, new AttributeReader(this.names.InnerClasses, ClassFile.Version.V45_3, this.CLASS_ATTRIBUTE) {
            @Override
            void read(Symbol sym, int attrLen) {
                Symbol.ClassSymbol c = (Symbol.ClassSymbol) sym;
                ClassReader.this.readInnerClasses(c);
            }
        }, new AttributeReader(this.names.LocalVariableTable, ClassFile.Version.V45_3, this.CLASS_OR_MEMBER_ATTRIBUTE) {
            @Override
            void read(Symbol sym, int attrLen) {
                int newbp = ClassReader.this.f423bp + attrLen;
                if (ClassReader.this.saveParameterNames) {
                    int numEntries = ClassReader.this.nextChar();
                    for (int i = 0; i < numEntries; i++) {
                        int start_pc = ClassReader.this.nextChar();
                        ClassReader.this.nextChar();
                        int nameIndex = ClassReader.this.nextChar();
                        ClassReader.this.nextChar();
                        int register = ClassReader.this.nextChar();
                        if (start_pc == 0) {
                            if (register >= ClassReader.this.parameterNameIndices.length) {
                                int newSize = Math.max(register, ClassReader.this.parameterNameIndices.length + 8);
                                ClassReader classReader = ClassReader.this;
                                classReader.parameterNameIndices = Arrays.copyOf(classReader.parameterNameIndices, newSize);
                            }
                            ClassReader.this.parameterNameIndices[register] = nameIndex;
                            ClassReader.this.haveParameterNameIndices = true;
                        }
                    }
                }
                ClassReader.this.f423bp = newbp;
            }
        }, new AttributeReader(this.names.SourceFile, ClassFile.Version.V45_3, this.CLASS_ATTRIBUTE) {
            @Override
            void read(Symbol sym, int attrLen) {
                Symbol.ClassSymbol c = (Symbol.ClassSymbol) sym;
                ClassReader classReader = ClassReader.this;
                Name n = classReader.readName(classReader.nextChar());
                c.sourcefile = new SourceFileObject(n, c.flatname);
            }
        }, new AttributeReader(this.names.Synthetic, ClassFile.Version.V45_3, this.CLASS_OR_MEMBER_ATTRIBUTE) {
            @Override
            void read(Symbol sym, int attrLen) {
                if (ClassReader.this.allowGenerics || (sym.flags_field & Flags.BRIDGE) == 0) {
                    sym.flags_field |= 4096;
                }
            }
        }, new AttributeReader(this.names.EnclosingMethod, ClassFile.Version.V49, this.CLASS_ATTRIBUTE) {
            @Override
            void read(Symbol sym, int attrLen) {
                int newbp = ClassReader.this.f423bp + attrLen;
                ClassReader.this.readEnclosingMethodAttr(sym);
                ClassReader.this.f423bp = newbp;
            }
        }, new AttributeReader(this.names.Signature, ClassFile.Version.V49, this.CLASS_OR_MEMBER_ATTRIBUTE) {
            @Override
            boolean accepts(AttributeKind kind) {
                return super.accepts(kind) && ClassReader.this.allowGenerics;
            }

            @Override
            void read(Symbol sym, int attrLen) {
                if (sym.kind == 2) {
                    Symbol.ClassSymbol c = (Symbol.ClassSymbol) sym;
                    boolean z = true;
                    ClassReader.this.readingClassAttr = true;
                    try {
                        Type.ClassType ct1 = (Type.ClassType) c.type;
                        if (c != ClassReader.this.currentOwner) {
                            z = false;
                        }
                        Assert.check(z);
                        ct1.typarams_field = ClassReader.this.readTypeParams(ClassReader.this.nextChar());
                        ct1.supertype_field = ClassReader.this.sigToType();
                        ListBuffer<Type> is = new ListBuffer<>();
                        while (ClassReader.this.sigp != ClassReader.this.siglimit) {
                            is.append(ClassReader.this.sigToType());
                        }
                        ct1.interfaces_field = is.toList();
                        return;
                    } finally {
                        ClassReader.this.readingClassAttr = false;
                    }
                }
                List<Type> thrown = sym.type.mo575getThrownTypes();
                ClassReader classReader = ClassReader.this;
                sym.type = classReader.readType(classReader.nextChar());
                if (sym.kind == 16 && sym.type.mo575getThrownTypes().isEmpty()) {
                    sym.type.asMethodType().thrown = thrown;
                }
            }
        }, new AttributeReader(this.names.AnnotationDefault, ClassFile.Version.V49, this.CLASS_OR_MEMBER_ATTRIBUTE) {
            @Override
            void read(Symbol sym, int attrLen) {
                ClassReader.this.attachAnnotationDefault(sym);
            }
        }, new AttributeReader(this.names.RuntimeInvisibleAnnotations, ClassFile.Version.V49, this.CLASS_OR_MEMBER_ATTRIBUTE) {
            @Override
            void read(Symbol sym, int attrLen) {
                ClassReader.this.attachAnnotations(sym);
            }
        }, new AttributeReader(this.names.RuntimeInvisibleParameterAnnotations, ClassFile.Version.V49, this.CLASS_OR_MEMBER_ATTRIBUTE) {
            @Override
            void read(Symbol sym, int attrLen) {
                ClassReader.this.attachParameterAnnotations(sym);
            }
        }, new AttributeReader(this.names.RuntimeVisibleAnnotations, ClassFile.Version.V49, this.CLASS_OR_MEMBER_ATTRIBUTE) {
            @Override
            void read(Symbol sym, int attrLen) {
                ClassReader.this.attachAnnotations(sym);
            }
        }, new AttributeReader(this.names.RuntimeVisibleParameterAnnotations, ClassFile.Version.V49, this.CLASS_OR_MEMBER_ATTRIBUTE) {
            @Override
            void read(Symbol sym, int attrLen) {
                ClassReader.this.attachParameterAnnotations(sym);
            }
        }, new AttributeReader(this.names.Annotation, ClassFile.Version.V49, this.CLASS_OR_MEMBER_ATTRIBUTE) {
            @Override
            void read(Symbol sym, int attrLen) {
                if (ClassReader.this.allowAnnotations) {
                    sym.flags_field |= 8192;
                }
            }
        }, new AttributeReader(this.names.Bridge, ClassFile.Version.V49, this.MEMBER_ATTRIBUTE) {
            @Override
            void read(Symbol sym, int attrLen) {
                sym.flags_field |= Flags.BRIDGE;
                if (!ClassReader.this.allowGenerics) {
                    sym.flags_field &= -4097;
                }
            }
        }, new AttributeReader(this.names.Enum, ClassFile.Version.V49, this.CLASS_OR_MEMBER_ATTRIBUTE) {
            @Override
            void read(Symbol sym, int attrLen) {
                sym.flags_field |= 16384;
            }
        }, new AttributeReader(this.names.Varargs, ClassFile.Version.V49, this.CLASS_OR_MEMBER_ATTRIBUTE) {
            @Override
            void read(Symbol sym, int attrLen) {
                if (ClassReader.this.allowVarargs) {
                    sym.flags_field |= Flags.VARARGS;
                }
            }
        }};
        for (AttributeReader r : readers) {
            this.attributeReaders.put(r.name, r);
        }
    }

    void unrecognized(Name attrName) {
        if (this.checkClassFile) {
            printCCF("ccf.unrecognized.attribute", attrName);
        }
    }

    void readEnclosingMethodAttr(Symbol sym) {
        sym.owner.members().remove(sym);
        Symbol.ClassSymbol self = (Symbol.ClassSymbol) sym;
        Symbol.ClassSymbol c = readClassSymbol(nextChar());
        ClassFile.NameAndType nt = (ClassFile.NameAndType) readPool(nextChar());
        if (c.members_field == null) {
            throw badClassFile("bad.enclosing.class", self, c);
        }
        Symbol.MethodSymbol m = findMethod(nt, c.members_field, self.flags());
        if (nt != null && m == null) {
            throw badClassFile("bad.enclosing.method", self);
        }
        self.name = simpleBinaryName(self.flatname, c.flatname);
        self.owner = m != null ? m : c;
        if (self.name.isEmpty()) {
            self.fullname = this.names.empty;
        } else {
            self.fullname = Symbol.ClassSymbol.formFullName(self.name, self.owner);
        }
        if (m != null) {
            ((Type.ClassType) sym.type).setEnclosingType(m.type);
        } else if ((self.flags_field & 8) == 0) {
            ((Type.ClassType) sym.type).setEnclosingType(c.type);
        } else {
            ((Type.ClassType) sym.type).setEnclosingType(Type.noType);
        }
        enterTypevars(self);
        if (!this.missingTypeVariables.isEmpty()) {
            ListBuffer<Type> typeVars = new ListBuffer<>();
            for (Type typevar : this.missingTypeVariables) {
                typeVars.append(findTypeVar(typevar.tsym.name));
            }
            this.foundTypeVariables = typeVars.toList();
            return;
        }
        this.foundTypeVariables = List.m507nil();
    }

    private Name simpleBinaryName(Name self, Name enclosing) {
        String simpleBinaryName = self.toString().substring(enclosing.toString().length());
        if (simpleBinaryName.length() < 1 || simpleBinaryName.charAt(0) != '$') {
            throw badClassFile("bad.enclosing.method", self);
        }
        int index = 1;
        while (index < simpleBinaryName.length() && isAsciiDigit(simpleBinaryName.charAt(index))) {
            index++;
        }
        return this.names.fromString(simpleBinaryName.substring(index));
    }

    private Symbol.MethodSymbol findMethod(ClassFile.NameAndType nt, Scope scope, long flags) {
        if (nt == null) {
            return null;
        }
        Type.MethodType type = nt.type.asMethodType();
        for (Scope.Entry e = scope.lookup(nt.name); e.scope != null; e = e.next()) {
            if (e.f338sym.kind == 16 && isSameBinaryType(e.f338sym.type.asMethodType(), type)) {
                return (Symbol.MethodSymbol) e.f338sym;
            }
        }
        if (nt.name != this.names.init || (512 & flags) != 0 || nt.type.mo573getParameterTypes().isEmpty()) {
            return null;
        }
        nt.type = new Type.MethodType(nt.type.mo573getParameterTypes().tail, nt.type.mo574getReturnType(), nt.type.mo575getThrownTypes(), this.syms.methodClass);
        return findMethod(nt, scope, flags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isSameBinaryType(Type.MethodType mt1, Type.MethodType mt2) {
        List listPrepend = this.types.erasure(mt1.mo573getParameterTypes()).prepend(this.types.erasure(mt1.mo574getReturnType()));
        List listPrepend2 = mt2.mo573getParameterTypes().prepend(mt2.mo574getReturnType());
        while (!listPrepend.isEmpty() && !listPrepend2.isEmpty()) {
            if (((Type) listPrepend.head).tsym != ((Type) listPrepend2.head).tsym) {
                return false;
            }
            listPrepend = listPrepend.tail;
            listPrepend2 = listPrepend2.tail;
        }
        return listPrepend.isEmpty() && listPrepend2.isEmpty();
    }

    private static boolean isAsciiDigit(char c) {
        return '0' <= c && c <= '9';
    }

    void readMemberAttrs(Symbol sym) {
        readAttrs(sym, AttributeKind.MEMBER);
    }

    void readAttrs(Symbol sym, AttributeKind kind) {
        char ac = nextChar();
        for (int i = 0; i < ac; i++) {
            Name attrName = readName(nextChar());
            int attrLen = nextInt();
            AttributeReader r = this.attributeReaders.get(attrName);
            if (r != null && r.accepts(kind)) {
                r.read(sym, attrLen);
            } else {
                unrecognized(attrName);
                this.f423bp += attrLen;
            }
        }
    }

    void readClassAttrs(Symbol.ClassSymbol c) {
        readAttrs(c, AttributeKind.CLASS);
    }

    Code readCode(Symbol owner) {
        nextChar();
        nextChar();
        int code_length = nextInt();
        this.f423bp += code_length;
        char exception_table_length = nextChar();
        this.f423bp += exception_table_length * '\b';
        readMemberAttrs(owner);
        return null;
    }

    void attachAnnotations(Symbol sym) {
        int numAttributes = nextChar();
        if (numAttributes != 0) {
            ListBuffer<CompoundAnnotationProxy> proxies = new ListBuffer<>();
            for (int i = 0; i < numAttributes; i++) {
                CompoundAnnotationProxy proxy = readCompoundAnnotation();
                if (proxy.type.tsym == this.syms.proprietaryType.tsym) {
                    sym.flags_field |= Flags.PROPRIETARY;
                } else {
                    proxies.append(proxy);
                }
                if (this.majorVersion >= ClassFile.Version.V51.major && proxy.type.tsym == this.syms.polymorphicSignatureType.tsym) {
                    sym.flags_field |= Flags.POLYMORPHIC_SIGNATURE;
                }
            }
            this.annotate.later(new AnnotationCompleter(sym, proxies.toList()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void attachParameterAnnotations(Symbol method) {
        Symbol.MethodSymbol meth = (Symbol.MethodSymbol) method;
        byte[] bArr = this.f424buf;
        int i = this.f423bp;
        this.f423bp = i + 1;
        int numParameters = bArr[i] & UnsignedBytes.MAX_VALUE;
        List listParams = meth.params();
        int pnum = 0;
        while (listParams.tail != null) {
            attachAnnotations((Symbol) listParams.head);
            listParams = listParams.tail;
            pnum++;
        }
        if (pnum != numParameters) {
            throw badClassFile("bad.runtime.invisible.param.annotations", meth);
        }
    }

    void attachAnnotationDefault(Symbol sym) {
        Symbol.MethodSymbol meth = (Symbol.MethodSymbol) sym;
        Attribute value = readAttributeValue();
        this.annotate.later(new AnnotationDefaultCompleter(meth, value));
    }

    Type readTypeOrClassSymbol(int i) {
        if (this.f424buf[this.poolIdx[i]] == 7) {
            return readClassSymbol(i).type;
        }
        return readType(i);
    }

    Type readEnumType(int i) {
        int index = this.poolIdx[i];
        int length = getChar(index + 1);
        if (this.f424buf[index + length + 2] != 59) {
            return enterClass(readName(i)).type;
        }
        return readType(i);
    }

    CompoundAnnotationProxy readCompoundAnnotation() {
        Type t = readTypeOrClassSymbol(nextChar());
        int numFields = nextChar();
        ListBuffer<Pair<Name, Attribute>> pairs = new ListBuffer<>();
        for (int i = 0; i < numFields; i++) {
            Name name = readName(nextChar());
            Attribute value = readAttributeValue();
            pairs.append(new Pair<>(name, value));
        }
        return new CompoundAnnotationProxy(t, pairs.toList());
    }

    Attribute readAttributeValue() {
        byte[] bArr = this.f424buf;
        int i = this.f423bp;
        this.f423bp = i + 1;
        char c = (char) bArr[i];
        if (c == '@') {
            return readCompoundAnnotation();
        }
        if (c == 'F') {
            return new Attribute.Constant(this.syms.floatType, readPool(nextChar()));
        }
        if (c == 'S') {
            return new Attribute.Constant(this.syms.shortType, readPool(nextChar()));
        }
        if (c == 'c') {
            return new Attribute.Class(this.types, readTypeOrClassSymbol(nextChar()));
        }
        if (c == 'e') {
            return new EnumAttributeProxy(readEnumType(nextChar()), readName(nextChar()));
        }
        if (c == 's') {
            return new Attribute.Constant(this.syms.stringType, readPool(nextChar()).toString());
        }
        if (c == 'I') {
            return new Attribute.Constant(this.syms.intType, readPool(nextChar()));
        }
        if (c == 'J') {
            return new Attribute.Constant(this.syms.longType, readPool(nextChar()));
        }
        if (c == 'Z') {
            return new Attribute.Constant(this.syms.booleanType, readPool(nextChar()));
        }
        if (c != '[') {
            switch (c) {
                case 'B':
                    return new Attribute.Constant(this.syms.byteType, readPool(nextChar()));
                case 'C':
                    return new Attribute.Constant(this.syms.charType, readPool(nextChar()));
                case 'D':
                    return new Attribute.Constant(this.syms.doubleType, readPool(nextChar()));
                default:
                    throw new AssertionError("unknown annotation tag '" + c + "'");
            }
        }
        int n = nextChar();
        ListBuffer<Attribute> l = new ListBuffer<>();
        for (int i2 = 0; i2 < n; i2++) {
            l.append(readAttributeValue());
        }
        return new ArrayAttributeProxy(l.toList());
    }

    static class EnumAttributeProxy extends Attribute {
        Type enumType;
        Name enumerator;

        public EnumAttributeProxy(Type enumType, Name enumerator) {
            super(null);
            this.enumType = enumType;
            this.enumerator = enumerator;
        }

        @Override
        public void accept(Attribute.Visitor v) {
            ((ProxyVisitor) v).visitEnumAttributeProxy(this);
        }

        @Override
        public String toString() {
            return "/*proxy enum*/" + this.enumType + "." + ((Object) this.enumerator);
        }
    }

    static class ArrayAttributeProxy extends Attribute {
        List<Attribute> values;

        ArrayAttributeProxy(List<Attribute> values) {
            super(null);
            this.values = values;
        }

        @Override
        public void accept(Attribute.Visitor v) {
            ((ProxyVisitor) v).visitArrayAttributeProxy(this);
        }

        @Override
        public String toString() {
            return "{" + this.values + "}";
        }
    }

    static class CompoundAnnotationProxy extends Attribute {
        final List<Pair<Name, Attribute>> values;

        public CompoundAnnotationProxy(Type type, List<Pair<Name, Attribute>> values) {
            super(type);
            this.values = values;
        }

        @Override
        public void accept(Attribute.Visitor v) {
            ((ProxyVisitor) v).visitCompoundAnnotationProxy(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder();
            buf.append("@");
            buf.append((CharSequence) this.type.tsym.getQualifiedName());
            buf.append("/*proxy*/{");
            boolean first = true;
            for (List list = this.values; list.nonEmpty(); list = list.tail) {
                Pair<Name, Attribute> value = (Pair) list.head;
                if (!first) {
                    buf.append(",");
                }
                first = false;
                buf.append((CharSequence) value.f577fst);
                buf.append("=");
                buf.append(value.f578snd);
            }
            buf.append("}");
            return buf.toString();
        }
    }

    static class TypeAnnotationProxy {
        final CompoundAnnotationProxy compound;
        final TypeAnnotationPosition position;

        public TypeAnnotationProxy(CompoundAnnotationProxy compound, TypeAnnotationPosition position) {
            this.compound = compound;
            this.position = position;
        }
    }

    class AnnotationDeproxy implements ProxyVisitor {
        private Symbol.ClassSymbol requestingOwner;
        Attribute result;
        Type type;

        AnnotationDeproxy() {
            this.requestingOwner = ClassReader.this.currentOwner.kind == 16 ? ClassReader.this.currentOwner.enclClass() : (Symbol.ClassSymbol) ClassReader.this.currentOwner;
        }

        /* JADX WARN: Multi-variable type inference failed */
        List<Attribute.Compound> deproxyCompoundList(List<CompoundAnnotationProxy> pl) {
            ListBuffer<Attribute.Compound> buf = new ListBuffer<>();
            for (List list = pl; list.nonEmpty(); list = list.tail) {
                buf.append(deproxyCompound((CompoundAnnotationProxy) list.head));
            }
            return buf.toList();
        }

        /* JADX WARN: Multi-variable type inference failed */
        Attribute.Compound deproxyCompound(CompoundAnnotationProxy a) {
            ListBuffer<Pair<Symbol.MethodSymbol, Attribute>> buf = new ListBuffer<>();
            for (List list = a.values; list.nonEmpty(); list = list.tail) {
                Symbol.MethodSymbol meth = findAccessMethod(a.type, (Name) ((Pair) list.head).f577fst);
                buf.append(new Pair<>(meth, deproxy(meth.type.mo574getReturnType(), (Attribute) ((Pair) list.head).f578snd)));
            }
            return new Attribute.Compound(a.type, buf.toList());
        }

        Symbol.MethodSymbol findAccessMethod(Type container, Name name) {
            Symbol.CompletionFailure failure = null;
            try {
                for (Scope.Entry e = container.tsym.members().lookup(name); e.scope != null; e = e.next()) {
                    Symbol sym = e.f338sym;
                    if (sym.kind == 16 && sym.type.mo573getParameterTypes().length() == 0) {
                        return (Symbol.MethodSymbol) sym;
                    }
                }
            } catch (Symbol.CompletionFailure ex) {
                failure = ex;
            }
            JavaFileObject prevSource = ClassReader.this.f425log.useSource(this.requestingOwner.classfile);
            try {
                if (failure == null) {
                    ClassReader.this.f425log.warning("annotation.method.not.found", container, name);
                } else {
                    ClassReader.this.f425log.warning("annotation.method.not.found.reason", container, name, failure.getDetailValue());
                }
                ClassReader.this.f425log.useSource(prevSource);
                Type.MethodType mt = new Type.MethodType(List.m507nil(), ClassReader.this.syms.botType, List.m507nil(), ClassReader.this.syms.methodClass);
                return new Symbol.MethodSymbol(1025L, name, mt, container.tsym);
            } catch (Throwable th) {
                ClassReader.this.f425log.useSource(prevSource);
                throw th;
            }
        }

        Attribute deproxy(Type t, Attribute a) {
            Type oldType = this.type;
            try {
                this.type = t;
                a.accept(this);
                return this.result;
            } finally {
                this.type = oldType;
            }
        }

        @Override
        public void visitConstant(Attribute.Constant value) {
            this.result = value;
        }

        @Override
        public void visitClass(Attribute.Class clazz) {
            this.result = clazz;
        }

        @Override
        public void visitEnum(Attribute.Enum e) {
            throw new AssertionError();
        }

        @Override
        public void visitCompound(Attribute.Compound compound) {
            throw new AssertionError();
        }

        @Override
        public void visitArray(Attribute.Array array) {
            throw new AssertionError();
        }

        @Override
        public void visitError(Attribute.Error e) {
            throw new AssertionError();
        }

        @Override
        public void visitEnumAttributeProxy(EnumAttributeProxy proxy) {
            Symbol.VarSymbol enumerator;
            Symbol.CompletionFailure failure;
            Symbol.TypeSymbol enumTypeSym = proxy.enumType.tsym;
            Symbol.VarSymbol enumerator2 = null;
            try {
                for (Scope.Entry e = enumTypeSym.members().lookup(proxy.enumerator); e.scope != null; e = e.next()) {
                    if (e.f338sym.kind == 4) {
                        enumerator2 = (Symbol.VarSymbol) e.f338sym;
                        break;
                    }
                }
                enumerator = enumerator2;
                failure = null;
            } catch (Symbol.CompletionFailure ex) {
                enumerator = enumerator2;
                failure = ex;
            }
            if (enumerator == null) {
                if (failure != null) {
                    ClassReader.this.f425log.warning("unknown.enum.constant.reason", ClassReader.this.currentClassFile, enumTypeSym, proxy.enumerator, failure.getDiagnostic());
                } else {
                    ClassReader.this.f425log.warning("unknown.enum.constant", ClassReader.this.currentClassFile, enumTypeSym, proxy.enumerator);
                }
                this.result = new Attribute.Enum(enumTypeSym.type, new Symbol.VarSymbol(0L, proxy.enumerator, ClassReader.this.syms.botType, enumTypeSym));
                return;
            }
            this.result = new Attribute.Enum(enumTypeSym.type, enumerator);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override
        public void visitArrayAttributeProxy(ArrayAttributeProxy proxy) {
            int length = proxy.values.length();
            Attribute[] ats = new Attribute[length];
            Type elemtype = ClassReader.this.types.elemtype(this.type);
            int i = 0;
            List list = proxy.values;
            while (list.nonEmpty()) {
                ats[i] = deproxy(elemtype, (Attribute) list.head);
                list = list.tail;
                i++;
            }
            this.result = new Attribute.Array(this.type, ats);
        }

        @Override
        public void visitCompoundAnnotationProxy(CompoundAnnotationProxy proxy) {
            this.result = deproxyCompound(proxy);
        }
    }

    class AnnotationDefaultCompleter extends AnnotationDeproxy implements Annotate.Annotator {
        final JavaFileObject classFile;

        final Symbol.MethodSymbol f429sym;
        final Attribute value;

        @Override
        public String toString() {
            return " ClassReader store default for " + this.f429sym.owner + "." + this.f429sym + " is " + this.value;
        }

        AnnotationDefaultCompleter(Symbol.MethodSymbol sym, Attribute value) {
            super();
            this.classFile = ClassReader.this.currentClassFile;
            this.f429sym = sym;
            this.value = value;
        }

        @Override
        public void enterAnnotation() {
            JavaFileObject previousClassFile = ClassReader.this.currentClassFile;
            try {
                ClassReader.this.currentClassFile = this.classFile;
                this.f429sym.defaultValue = deproxy(this.f429sym.type.mo574getReturnType(), this.value);
            } finally {
                ClassReader.this.currentClassFile = previousClassFile;
            }
        }
    }

    class AnnotationCompleter extends AnnotationDeproxy implements Annotate.Annotator {
        final JavaFileObject classFile;

        final List<CompoundAnnotationProxy> f427l;

        final Symbol f428sym;

        @Override
        public String toString() {
            return " ClassReader annotate " + this.f428sym.owner + "." + this.f428sym + " with " + this.f427l;
        }

        AnnotationCompleter(Symbol sym, List<CompoundAnnotationProxy> l) {
            super();
            this.f428sym = sym;
            this.f427l = l;
            this.classFile = ClassReader.this.currentClassFile;
        }

        @Override
        public void enterAnnotation() {
            List<Attribute.Compound> listPrependList;
            JavaFileObject previousClassFile = ClassReader.this.currentClassFile;
            try {
                ClassReader.this.currentClassFile = this.classFile;
                List<Attribute.Compound> newList = deproxyCompoundList(this.f427l);
                Symbol symbol = this.f428sym;
                if (this.f428sym.attributes_field == null) {
                    listPrependList = newList;
                } else {
                    listPrependList = newList.prependList(this.f428sym.attributes_field);
                }
                symbol.attributes_field = listPrependList;
            } finally {
                ClassReader.this.currentClassFile = previousClassFile;
            }
        }
    }

    Symbol.VarSymbol readField() {
        long flags = adjustFieldFlags(nextChar());
        Name name = readName(nextChar());
        Type type = readType(nextChar());
        Symbol.VarSymbol v = new Symbol.VarSymbol(flags, name, type, this.currentOwner);
        readMemberAttrs(v);
        return v;
    }

    Symbol.MethodSymbol readMethod() {
        Type type;
        long flags = adjustMethodFlags(nextChar());
        Name name = readName(nextChar());
        Type type2 = readType(nextChar());
        if (name == this.names.init && this.currentOwner.hasOuterInstance() && !this.currentOwner.name.isEmpty()) {
            type = new Type.MethodType(adjustMethodParams(flags, type2.mo573getParameterTypes()), type2.mo574getReturnType(), type2.mo575getThrownTypes(), this.syms.methodClass);
        } else {
            type = type2;
        }
        Symbol.MethodSymbol m = new Symbol.MethodSymbol(flags, name, type, this.currentOwner);
        if (this.saveParameterNames) {
            initParameterNames(m);
        }
        Symbol prevOwner = this.currentOwner;
        this.currentOwner = m;
        try {
            readMemberAttrs(m);
            this.currentOwner = prevOwner;
            if (this.saveParameterNames) {
                setParameterNames(m, type);
            }
            return m;
        } catch (Throwable th) {
            this.currentOwner = prevOwner;
            throw th;
        }
    }

    private List<Type> adjustMethodParams(long flags, List<Type> args) {
        Type typeMakeVarargs;
        boolean isVarargs = (Flags.VARARGS & flags) != 0;
        if (isVarargs) {
            Type varargsElem = args.last();
            ListBuffer<Type> adjustedArgs = ListBuffer.m512lb();
            for (Type t : args) {
                if (t != varargsElem) {
                    typeMakeVarargs = t;
                } else {
                    typeMakeVarargs = ((Type.ArrayType) t).makeVarargs();
                }
                adjustedArgs.append(typeMakeVarargs);
            }
            args = adjustedArgs.toList();
        }
        return args.tail;
    }

    void initParameterNames(Symbol.MethodSymbol sym) {
        int expectedParameterSlots = Code.width(sym.type.mo573getParameterTypes()) + 4;
        int[] iArr = this.parameterNameIndices;
        if (iArr == null || iArr.length < expectedParameterSlots) {
            this.parameterNameIndices = new int[expectedParameterSlots];
        } else {
            Arrays.fill(iArr, 0);
        }
        this.haveParameterNameIndices = false;
    }

    void setParameterNames(Symbol.MethodSymbol sym, Type jvmType) {
        if (!this.haveParameterNameIndices) {
            return;
        }
        int firstParam = (sym.flags() & 8) == 0 ? 1 : 0;
        if (sym.name == this.names.init && this.currentOwner.hasOuterInstance() && !this.currentOwner.name.isEmpty()) {
            firstParam++;
        }
        if (sym.type != jvmType) {
            int skip = Code.width(jvmType.mo573getParameterTypes()) - Code.width(sym.type.mo573getParameterTypes());
            firstParam += skip;
        }
        List<Name> paramNames = List.m507nil();
        int index = firstParam;
        for (Type t : sym.type.mo573getParameterTypes()) {
            int[] iArr = this.parameterNameIndices;
            int nameIdx = index < iArr.length ? iArr[index] : 0;
            Name name = nameIdx == 0 ? this.names.empty : readName(nameIdx);
            paramNames = paramNames.prepend(name);
            index += Code.width(t);
        }
        sym.savedParameterNames = paramNames.reverse();
    }

    void skipBytes(int n) {
        this.f423bp += n;
    }

    void skipMember() {
        this.f423bp += 6;
        char ac = nextChar();
        for (int i = 0; i < ac; i++) {
            this.f423bp += 2;
            int attrLen = nextInt();
            this.f423bp += attrLen;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void enterTypevars(Type t) {
        if (t.getEnclosingType() != null && t.getEnclosingType().f344tag == 10) {
            enterTypevars(t.getEnclosingType());
        }
        for (List typeArguments = t.getTypeArguments(); typeArguments.nonEmpty(); typeArguments = typeArguments.tail) {
            this.typevars.enter(((Type) typeArguments.head).tsym);
        }
    }

    protected void enterTypevars(Symbol sym) {
        if (sym.owner.kind == 16) {
            enterTypevars(sym.owner);
            enterTypevars(sym.owner.owner);
        }
        enterTypevars(sym.type);
    }

    void readClass(Symbol.ClassSymbol c) {
        Type typeErasure;
        Type.ClassType ct = (Type.ClassType) c.type;
        c.members_field = new Scope(c);
        this.typevars = this.typevars.mo451dup(this.currentOwner);
        if (ct.getEnclosingType().f344tag == 10) {
            enterTypevars(ct.getEnclosingType());
        }
        long flags = adjustClassFlags(nextChar());
        if (c.owner.kind == 1) {
            c.flags_field = flags;
        }
        Symbol.ClassSymbol self = readClassSymbol(nextChar());
        if (c != self) {
            throw badClassFile("class.file.wrong.class", self.flatname);
        }
        int startbp = this.f423bp;
        nextChar();
        char interfaceCount = nextChar();
        this.f423bp += interfaceCount * 2;
        char fieldCount = nextChar();
        for (int i = 0; i < fieldCount; i++) {
            skipMember();
        }
        int methodCount = nextChar();
        for (int i2 = 0; i2 < methodCount; i2++) {
            skipMember();
        }
        readClassAttrs(c);
        if (this.readAllOfClassFile) {
            for (int i3 = 1; i3 < this.poolObj.length; i3++) {
                readPool(i3);
            }
            Object[] objArr = this.poolObj;
            c.pool = new Pool(objArr.length, objArr);
        }
        this.f423bp = startbp;
        int n = nextChar();
        if (ct.supertype_field == null) {
            if (n != 0) {
                typeErasure = readClassSymbol(n).erasure(this.types);
            } else {
                typeErasure = Type.noType;
            }
            ct.supertype_field = typeErasure;
        }
        int n2 = nextChar();
        List<Type> is = List.m507nil();
        for (int i4 = 0; i4 < n2; i4++) {
            Type _inter = readClassSymbol(nextChar()).erasure(this.types);
            is = is.prepend(_inter);
        }
        if (ct.interfaces_field == null) {
            ct.interfaces_field = is.reverse();
        }
        Assert.check(fieldCount == nextChar());
        for (int i5 = 0; i5 < fieldCount; i5++) {
            enterMember(c, readField());
        }
        int i6 = nextChar();
        Assert.check(methodCount == i6);
        for (int i7 = 0; i7 < methodCount; i7++) {
            enterMember(c, readMethod());
        }
        this.typevars = this.typevars.leave();
    }

    void readInnerClasses(Symbol.ClassSymbol c) {
        int n = nextChar();
        for (int i = 0; i < n; i++) {
            nextChar();
            Symbol.ClassSymbol outer = readClassSymbol(nextChar());
            Name name = readName(nextChar());
            if (name == null) {
                name = this.names.empty;
            }
            long flags = adjustClassFlags(nextChar());
            if (outer != null) {
                if (name == this.names.empty) {
                    name = this.names.f576one;
                }
                Symbol.ClassSymbol member = enterClass(name, outer);
                if ((8 & flags) == 0) {
                    ((Type.ClassType) member.type).setEnclosingType(outer.type);
                    if (member.erasure_field != null) {
                        ((Type.ClassType) member.erasure_field).setEnclosingType(this.types.erasure(outer.type));
                    }
                }
                if (c == outer) {
                    member.flags_field = flags;
                    enterMember(c, member);
                }
            }
        }
    }

    private void readClassFile(Symbol.ClassSymbol c) throws IOException {
        int i;
        int magic = nextInt();
        if (magic != -889275714) {
            throw badClassFile("illegal.start.of.class.file", new Object[0]);
        }
        this.minorVersion = nextChar();
        this.majorVersion = nextChar();
        int maxMajor = Target.m479MAX().majorVersion;
        int maxMinor = Target.m479MAX().minorVersion;
        int i2 = this.majorVersion;
        if (i2 > maxMajor || (i2 * 1000) + this.minorVersion < (Target.m480MIN().majorVersion * 1000) + Target.m480MIN().minorVersion) {
            int i3 = this.majorVersion;
            if (i3 == maxMajor + 1) {
                this.f425log.warning("big.major.version", this.currentClassFile, Integer.valueOf(i3), Integer.valueOf(maxMajor));
            } else {
                throw badClassFile("wrong.version", Integer.toString(i3), Integer.toString(this.minorVersion), Integer.toString(maxMajor), Integer.toString(maxMinor));
            }
        } else if (this.checkClassFile && this.majorVersion == maxMajor && (i = this.minorVersion) > maxMinor) {
            printCCF("found.later.version", Integer.toString(i));
        }
        indexPool();
        int length = this.signatureBuffer.length;
        int i4 = this.f423bp;
        if (length < i4) {
            int ns = Integer.highestOneBit(i4) << 1;
            this.signatureBuffer = new byte[ns];
        }
        readClass(c);
    }

    long adjustFieldFlags(long flags) {
        return flags;
    }

    long adjustMethodFlags(long flags) {
        if ((64 & flags) != 0) {
            flags = (flags & (-65)) | Flags.BRIDGE;
            if (!this.allowGenerics) {
                flags &= -4097;
            }
        }
        if ((128 & flags) != 0) {
            return (flags & (-129)) | Flags.VARARGS;
        }
        return flags;
    }

    long adjustClassFlags(long flags) {
        return (-33) & flags;
    }

    public Symbol.ClassSymbol defineClass(Name name, Symbol owner) {
        Symbol.ClassSymbol c = new Symbol.ClassSymbol(0L, name, owner);
        if (owner.kind == 1) {
            Assert.checkNull(this.classes.get(c.flatname), c);
        }
        c.completer = this;
        return c;
    }

    public Symbol.ClassSymbol enterClass(Name name, Symbol.TypeSymbol owner) {
        Name flatname = Symbol.TypeSymbol.formFlatName(name, owner);
        Symbol.ClassSymbol c = this.classes.get(flatname);
        if (c == null) {
            Symbol.ClassSymbol c2 = defineClass(name, owner);
            this.classes.put(flatname, c2);
            return c2;
        }
        if ((c.name != name || c.owner != owner) && owner.kind == 2 && c.owner.kind == 1) {
            c.owner.members().remove(c);
            c.name = name;
            c.owner = owner;
            c.fullname = Symbol.ClassSymbol.formFullName(name, owner);
            return c;
        }
        return c;
    }

    public Symbol.ClassSymbol enterClass(Name flatName, JavaFileObject classFile) {
        Symbol.PackageSymbol owner;
        Symbol.ClassSymbol cs = this.classes.get(flatName);
        if (cs != null) {
            String msg = Log.format("%s: completer = %s; class file = %s; source file = %s", cs.fullname, cs.completer, cs.classfile, cs.sourcefile);
            throw new AssertionError(msg);
        }
        Name packageName = Convert.packagePart(flatName);
        if (packageName.isEmpty()) {
            owner = this.syms.unnamedPackage;
        } else {
            owner = enterPackage(packageName);
        }
        Symbol.ClassSymbol cs2 = defineClass(Convert.shortName(flatName), owner);
        cs2.classfile = classFile;
        this.classes.put(flatName, cs2);
        return cs2;
    }

    public Symbol.ClassSymbol enterClass(Name flatname) {
        Symbol.ClassSymbol c = this.classes.get(flatname);
        if (c == null) {
            return enterClass(flatname, (JavaFileObject) null);
        }
        return c;
    }

    @Override
    public void complete(Symbol sym) throws Symbol.CompletionFailure {
        if (sym.kind == 2) {
            Symbol.ClassSymbol c = (Symbol.ClassSymbol) sym;
            c.members_field = new Scope.ErrorScope(c);
            boolean saveSuppressFlush = this.suppressFlush;
            this.suppressFlush = true;
            try {
                completeOwners(c.owner);
                completeEnclosing(c);
                this.suppressFlush = saveSuppressFlush;
                fillIn(c);
            } catch (Throwable th) {
                this.suppressFlush = saveSuppressFlush;
                throw th;
            }
        } else if (sym.kind == 1) {
            Symbol.PackageSymbol p = (Symbol.PackageSymbol) sym;
            try {
                fillIn(p);
            } catch (IOException ex) {
                throw new Symbol.CompletionFailure(sym, ex.getLocalizedMessage()).initCause((Throwable) ex);
            }
        }
        if (!this.filling && !this.suppressFlush) {
            this.annotate.flush();
        }
    }

    private void completeOwners(Symbol o) {
        if (o.kind != 1) {
            completeOwners(o.owner);
        }
        o.complete();
    }

    private void completeEnclosing(Symbol.ClassSymbol c) {
        if (c.owner.kind == 1) {
            Symbol owner = c.owner;
            for (Name name : Convert.enclosingCandidates(Convert.shortName(c.name))) {
                Symbol encl = owner.members().lookup(name).f338sym;
                if (encl == null) {
                    encl = this.classes.get(Symbol.TypeSymbol.formFlatName(name, owner));
                }
                if (encl != null) {
                    encl.complete();
                }
            }
        }
    }

    private void fillIn(Symbol.ClassSymbol c) {
        if (this.completionFailureName == c.fullname) {
            throw new Symbol.CompletionFailure(c, "user-selected completion failure by class name");
        }
        this.currentOwner = c;
        this.warnedAttrs.clear();
        JavaFileObject classfile = c.classfile;
        if (classfile != null) {
            JavaFileObject previousClassFile = this.currentClassFile;
            try {
                try {
                    if (this.filling) {
                        Assert.error("Filling " + classfile.toUri() + " during " + previousClassFile);
                    }
                    this.currentClassFile = classfile;
                    if (this.verbose) {
                        this.f425log.printVerbose("loading", classfile.toString());
                    }
                    if (classfile.getKind() == JavaFileObject.Kind.CLASS) {
                        this.filling = true;
                        try {
                            this.f423bp = 0;
                            this.f424buf = readInputStream(this.f424buf, classfile.openInputStream());
                            readClassFile(c);
                            if (!this.missingTypeVariables.isEmpty() && !this.foundTypeVariables.isEmpty()) {
                                List<Type> missing = this.missingTypeVariables;
                                List<Type> found = this.foundTypeVariables;
                                this.missingTypeVariables = List.m507nil();
                                this.foundTypeVariables = List.m507nil();
                                this.filling = false;
                                Type.ClassType ct = (Type.ClassType) this.currentOwner.type;
                                ct.supertype_field = this.types.subst(ct.supertype_field, missing, found);
                                ct.interfaces_field = this.types.subst(ct.interfaces_field, missing, found);
                            } else if (this.missingTypeVariables.isEmpty() != this.foundTypeVariables.isEmpty()) {
                                Name name = this.missingTypeVariables.head.tsym.name;
                                throw badClassFile("undecl.type.var", name);
                            }
                            this.missingTypeVariables = List.m507nil();
                            this.foundTypeVariables = List.m507nil();
                            this.filling = false;
                        } catch (Throwable th) {
                            this.missingTypeVariables = List.m507nil();
                            this.foundTypeVariables = List.m507nil();
                            this.filling = false;
                            throw th;
                        }
                    } else if (this.sourceCompleter != null) {
                        this.sourceCompleter.complete(c);
                    } else {
                        throw new IllegalStateException("Source completer required to read " + classfile.toUri());
                    }
                    this.currentClassFile = previousClassFile;
                    return;
                } catch (Throwable th2) {
                    this.currentClassFile = previousClassFile;
                    throw th2;
                }
            } catch (IOException ex) {
                throw badClassFile("unable.to.access.file", ex.getMessage());
            }
        }
        JCDiagnostic diag = this.diagFactory.fragment("class.file.not.found", c.flatname);
        throw newCompletionFailure(c, diag);
    }

    private static byte[] readInputStream(byte[] buf, InputStream s) throws IOException {
        try {
            byte[] buf2 = ensureCapacity(buf, s.available());
            int r = s.read(buf2);
            int bp = 0;
            while (r != -1) {
                bp += r;
                buf2 = ensureCapacity(buf2, bp);
                r = s.read(buf2, bp, buf2.length - bp);
            }
            try {
                s.close();
            } catch (IOException e) {
            }
            return buf2;
        } catch (Throwable th) {
            try {
                s.close();
            } catch (IOException e2) {
            }
            throw th;
        }
    }

    private static byte[] ensureCapacity(byte[] buf, int needed) {
        if (buf.length <= needed) {
            byte[] buf2 = new byte[Integer.highestOneBit(needed) << 1];
            System.arraycopy(buf, 0, buf2, 0, buf.length);
            return buf2;
        }
        return buf;
    }

    private Symbol.CompletionFailure newCompletionFailure(Symbol.TypeSymbol c, JCDiagnostic diag) {
        if (!this.cacheCompletionFailure) {
            return new Symbol.CompletionFailure(c, diag);
        }
        Symbol.CompletionFailure result = this.cachedCompletionFailure;
        result.f340sym = c;
        result.diag = diag;
        return result;
    }

    public Symbol.ClassSymbol loadClass(Name flatname) throws Symbol.CompletionFailure {
        boolean absent = this.classes.get(flatname) == null;
        Symbol.ClassSymbol c = enterClass(flatname);
        if (c.members_field == null && c.completer != null) {
            try {
                c.complete();
            } catch (Symbol.CompletionFailure ex) {
                if (absent) {
                    this.classes.remove(flatname);
                }
                throw ex;
            }
        }
        return c;
    }

    public boolean packageExists(Name fullname) {
        return enterPackage(fullname).exists();
    }

    public Symbol.PackageSymbol enterPackage(Name fullname) {
        Symbol.PackageSymbol p = this.packages.get(fullname);
        if (p == null) {
            Assert.check(!fullname.isEmpty(), "rootPackage missing!");
            Symbol.PackageSymbol p2 = new Symbol.PackageSymbol(Convert.shortName(fullname), enterPackage(Convert.packagePart(fullname)));
            p2.completer = this;
            this.packages.put(fullname, p2);
            return p2;
        }
        return p;
    }

    public Symbol.PackageSymbol enterPackage(Name name, Symbol.PackageSymbol owner) {
        return enterPackage(Symbol.TypeSymbol.formFullName(name, owner));
    }

    protected void includeClassFile(Symbol.PackageSymbol p, JavaFileObject file) {
        int seen;
        Symbol.ClassSymbol c;
        if ((p.flags_field & 8388608) == 0) {
            for (Symbol q = p; q != null && q.kind == 1; q = q.owner) {
                q.flags_field |= 8388608;
            }
        }
        JavaFileObject.Kind kind = file.getKind();
        if (kind == JavaFileObject.Kind.CLASS) {
            seen = Flags.CLASS_SEEN;
        } else {
            seen = Flags.SOURCE_SEEN;
        }
        String binaryName = this.fileManager.inferBinaryName(this.currentLoc, file);
        int lastDot = binaryName.lastIndexOf(".");
        Name classname = this.names.fromString(binaryName.substring(lastDot + 1));
        boolean isPkgInfo = classname == this.names.package_info;
        if (isPkgInfo) {
            c = p.package_info;
        } else {
            c = (Symbol.ClassSymbol) p.members_field.lookup(classname).f338sym;
        }
        if (c == null) {
            c = enterClass(classname, p);
            if (c.classfile == null) {
                c.classfile = file;
            }
            if (isPkgInfo) {
                p.package_info = c;
            } else if (c.owner == p) {
                p.members_field.enter(c);
            }
        } else if (c.classfile != null && (c.flags_field & ((long) seen)) == 0 && (c.flags_field & 100663296) != 0) {
            c.classfile = preferredFileObject(file, c.classfile);
        }
        c.flags_field |= (long) seen;
    }

    protected JavaFileObject preferredFileObject(JavaFileObject a, JavaFileObject b) {
        if (this.preferSource) {
            return a.getKind() == JavaFileObject.Kind.SOURCE ? a : b;
        }
        long adate = a.getLastModified();
        long bdate = b.getLastModified();
        return adate > bdate ? a : b;
    }

    protected EnumSet<JavaFileObject.Kind> getPackageFileKinds() {
        return EnumSet.of(JavaFileObject.Kind.CLASS, JavaFileObject.Kind.SOURCE);
    }

    protected void extraFileActions(Symbol.PackageSymbol pack, JavaFileObject fe) {
    }

    private void fillIn(Symbol.PackageSymbol p) throws IOException {
        if (p.members_field == null) {
            p.members_field = new Scope(p);
        }
        String packageName = p.fullname.toString();
        Set<JavaFileObject.Kind> kinds = getPackageFileKinds();
        fillIn(p, StandardLocation.PLATFORM_CLASS_PATH, this.fileManager.list(StandardLocation.PLATFORM_CLASS_PATH, packageName, EnumSet.of(JavaFileObject.Kind.CLASS), false));
        Set<JavaFileObject.Kind> classKinds = EnumSet.copyOf((Collection) kinds);
        classKinds.remove(JavaFileObject.Kind.SOURCE);
        boolean wantClassFiles = !classKinds.isEmpty();
        Set<JavaFileObject.Kind> sourceKinds = EnumSet.copyOf((Collection) kinds);
        sourceKinds.remove(JavaFileObject.Kind.CLASS);
        boolean wantSourceFiles = !sourceKinds.isEmpty();
        boolean haveSourcePath = this.fileManager.hasLocation(StandardLocation.SOURCE_PATH);
        if (this.verbose && this.verbosePath) {
            JavaFileManager javaFileManager = this.fileManager;
            if (javaFileManager instanceof StandardJavaFileManager) {
                StandardJavaFileManager fm = (StandardJavaFileManager) javaFileManager;
                if (haveSourcePath && wantSourceFiles) {
                    List<File> path = List.m507nil();
                    for (File file : fm.getLocation(StandardLocation.SOURCE_PATH)) {
                        path = path.prepend(file);
                    }
                    this.f425log.printVerbose("sourcepath", path.reverse().toString());
                } else if (wantSourceFiles) {
                    List<File> path2 = List.m507nil();
                    for (File file2 : fm.getLocation(StandardLocation.CLASS_PATH)) {
                        path2 = path2.prepend(file2);
                    }
                    this.f425log.printVerbose("sourcepath", path2.reverse().toString());
                }
                if (wantClassFiles) {
                    List<File> path3 = List.m507nil();
                    for (File file3 : fm.getLocation(StandardLocation.PLATFORM_CLASS_PATH)) {
                        path3 = path3.prepend(file3);
                    }
                    for (File file4 : fm.getLocation(StandardLocation.CLASS_PATH)) {
                        path3 = path3.prepend(file4);
                    }
                    this.f425log.printVerbose("classpath", path3.reverse().toString());
                }
            }
        }
        if (wantSourceFiles && !haveSourcePath) {
            fillIn(p, StandardLocation.CLASS_PATH, this.fileManager.list(StandardLocation.CLASS_PATH, packageName, kinds, false));
        } else {
            if (wantClassFiles) {
                fillIn(p, StandardLocation.CLASS_PATH, this.fileManager.list(StandardLocation.CLASS_PATH, packageName, classKinds, false));
            }
            if (wantSourceFiles) {
                fillIn(p, StandardLocation.SOURCE_PATH, this.fileManager.list(StandardLocation.SOURCE_PATH, packageName, sourceKinds, false));
            }
        }
        this.verbosePath = false;
    }

    private void fillIn(Symbol.PackageSymbol p, JavaFileManager.Location location, Iterable<JavaFileObject> files) {
        this.currentLoc = location;
        for (JavaFileObject fo : files) {
            int i = C066621.$SwitchMap$javax$tools$JavaFileObject$Kind[fo.getKind().ordinal()];
            if (i == 1 || i == 2) {
                String binaryName = this.fileManager.inferBinaryName(this.currentLoc, fo);
                String simpleName = binaryName.substring(binaryName.lastIndexOf(".") + 1);
                if (SourceVersion.isIdentifier(simpleName) || simpleName.equals("package-info")) {
                    includeClassFile(p, fo);
                }
            } else {
                extraFileActions(p, fo);
            }
        }
    }

    static class C066621 {
        static final int[] $SwitchMap$javax$tools$JavaFileObject$Kind;

        static {
            int[] iArr = new int[JavaFileObject.Kind.values().length];
            $SwitchMap$javax$tools$JavaFileObject$Kind = iArr;
            try {
                iArr[JavaFileObject.Kind.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$javax$tools$JavaFileObject$Kind[JavaFileObject.Kind.SOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    private void printCCF(String key, Object arg) {
        this.f425log.printNoteLines(key, arg);
    }

    private static class SourceFileObject extends BaseFileObject {
        private Name flatname;
        private Name name;

        public SourceFileObject(Name name, Name flatname) {
            super(null);
            this.name = name;
            this.flatname = flatname;
        }

        @Override
        public URI toUri() {
            try {
                return new URI(null, this.name.toString(), null);
            } catch (URISyntaxException e) {
                throw new BaseFileObject.CannotCreateUriError(this.name.toString(), e);
            }
        }

        @Override
        public String getName() {
            return this.name.toString();
        }

        @Override
        public String getShortName() {
            return getName();
        }

        @Override
        public JavaFileObject.Kind getKind() {
            return getKind(getName());
        }

        @Override
        public InputStream openInputStream() {
            throw new UnsupportedOperationException();
        }

        @Override
        public OutputStream openOutputStream() {
            throw new UnsupportedOperationException();
        }

        @Override
        public CharBuffer getCharContent(boolean ignoreEncodingErrors) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Reader openReader(boolean ignoreEncodingErrors) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Writer openWriter() {
            throw new UnsupportedOperationException();
        }

        @Override
        public long getLastModified() {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean delete() {
            throw new UnsupportedOperationException();
        }

        @Override
        protected String inferBinaryName(Iterable<? extends File> path) {
            return this.flatname.toString();
        }

        @Override
        public boolean isNameCompatible(String simpleName, JavaFileObject.Kind kind) {
            return true;
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SourceFileObject)) {
                return false;
            }
            SourceFileObject o = (SourceFileObject) other;
            return this.name.equals(o.name);
        }

        @Override
        public int hashCode() {
            return this.name.hashCode();
        }
    }
}
