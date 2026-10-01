package com.sun.tools.javac.jvm;

import com.sun.tools.javac.code.Attribute;
import com.sun.tools.javac.code.BoundKind;
import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.code.RetentionPolicy;
import com.sun.tools.javac.code.Scope;
import com.sun.tools.javac.code.Source;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Symtab;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.code.Types;
import com.sun.tools.javac.file.BaseFileObject;
import com.sun.tools.javac.main.OptionName;
import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.ByteBuffer;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;
import com.sun.tools.javac.util.Options;
import com.sun.tools.javac.util.Pair;
import com.sun.tools.javac.util.Position;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.tools.FileObject;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.StandardLocation;

public class ClassWriter extends ClassFile {
    static final int DATA_BUF_SIZE = 65520;
    static final int FULL_FRAME = 255;
    static final int MAX_LOCAL_LENGTH_DIFF = 4;
    static final int POOL_BUF_SIZE = 131056;
    static final int SAME_FRAME_EXTENDED = 251;
    static final int SAME_FRAME_SIZE = 64;
    static final int SAME_LOCALS_1_STACK_ITEM_EXTENDED = 247;
    protected static final Context.C0723Key<ClassWriter> classWriterKey = new Context.C0723Key<>();
    private static final String[] flagName = {"PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "FINAL", "SUPER", "VOLATILE", "TRANSIENT", "NATIVE", "INTERFACE", "ABSTRACT", "STRICTFP"};
    boolean debugstackmap;
    private final boolean dumpClassModifiers;
    private final boolean dumpFieldModifiers;
    private final boolean dumpInnerClassModifiers;
    private final boolean dumpMethodModifiers;
    private boolean emitSourceFile;
    private final JavaFileManager fileManager;
    private boolean genCrt;
    Set<Symbol.ClassSymbol> innerClasses;
    ListBuffer<Symbol.ClassSymbol> innerClassesQueue;

    private final Log f430log;
    private final Names names;
    private final Options options;
    Pool pool;
    private boolean retrofit;
    private boolean scramble;
    private boolean scrambleAll;
    private Source source;
    private final Symtab syms;
    private Target target;
    private Types types;
    private boolean verbose;
    ByteBuffer databuf = new ByteBuffer(65520);
    ByteBuffer poolbuf = new ByteBuffer(POOL_BUF_SIZE);
    ByteBuffer sigbuf = new ByteBuffer();
    AttributeWriter awriter = new AttributeWriter();

    public static class PoolOverflow extends Exception {
        private static final long serialVersionUID = 0;
    }

    public static ClassWriter instance(Context context) {
        ClassWriter instance = (ClassWriter) context.m501get(classWriterKey);
        if (instance == null) {
            return new ClassWriter(context);
        }
        return instance;
    }

    private ClassWriter(Context context) {
        context.m504put(classWriterKey, this);
        this.f430log = Log.instance(context);
        this.names = Names.instance(context);
        this.syms = Symtab.instance(context);
        this.options = Options.instance(context);
        this.target = Target.instance(context);
        this.source = Source.instance(context);
        this.types = Types.instance(context);
        this.fileManager = (JavaFileManager) context.m502get(JavaFileManager.class);
        this.verbose = this.options.isSet(OptionName.VERBOSE);
        this.scramble = this.options.isSet("-scramble");
        this.scrambleAll = this.options.isSet("-scrambleAll");
        this.retrofit = this.options.isSet("-retrofit");
        this.genCrt = this.options.isSet(OptionName.XJCOV);
        this.debugstackmap = this.options.isSet("debugstackmap");
        boolean z = false;
        this.emitSourceFile = this.options.isUnset(OptionName.G_CUSTOM) || this.options.isSet(OptionName.G_CUSTOM, "source");
        String dumpModFlags = this.options.m515get("dumpmodifiers");
        this.dumpClassModifiers = (dumpModFlags == null || dumpModFlags.indexOf(99) == -1) ? false : true;
        this.dumpFieldModifiers = (dumpModFlags == null || dumpModFlags.indexOf(ByteCodes.fsub) == -1) ? false : true;
        this.dumpInnerClassModifiers = (dumpModFlags == null || dumpModFlags.indexOf(ByteCodes.lmul) == -1) ? false : true;
        if (dumpModFlags != null && dumpModFlags.indexOf(ByteCodes.ldiv) != -1) {
            z = true;
        }
        this.dumpMethodModifiers = z;
    }

    public static String flagNames(long flags) {
        StringBuilder sbuf = new StringBuilder();
        int i = 0;
        long f = 4095 & flags;
        while (f != 0) {
            if ((1 & f) != 0) {
                sbuf.append(" ");
                sbuf.append(flagName[i]);
            }
            f >>= 1;
            i++;
        }
        return sbuf.toString();
    }

    void putChar(ByteBuffer buf, int op, int x) {
        buf.elems[op] = (byte) ((x >> 8) & 255);
        buf.elems[op + 1] = (byte) (x & 255);
    }

    void putInt(ByteBuffer buf, int adr, int x) {
        buf.elems[adr] = (byte) ((x >> 24) & 255);
        buf.elems[adr + 1] = (byte) ((x >> 16) & 255);
        buf.elems[adr + 2] = (byte) ((x >> 8) & 255);
        buf.elems[adr + 3] = (byte) (x & 255);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void assembleSig(Type type) {
        switch (type.f344tag) {
            case 1:
                this.sigbuf.appendByte(66);
                return;
            case 2:
                this.sigbuf.appendByte(67);
                return;
            case 3:
                this.sigbuf.appendByte(83);
                return;
            case 4:
                this.sigbuf.appendByte(73);
                return;
            case 5:
                this.sigbuf.appendByte(74);
                return;
            case 6:
                this.sigbuf.appendByte(70);
                return;
            case 7:
                this.sigbuf.appendByte(68);
                return;
            case 8:
                this.sigbuf.appendByte(90);
                return;
            case 9:
                this.sigbuf.appendByte(86);
                return;
            case 10:
                this.sigbuf.appendByte(76);
                assembleClassSig(type);
                this.sigbuf.appendByte(59);
                return;
            case 11:
                Type.ArrayType at = (Type.ArrayType) type;
                this.sigbuf.appendByte(91);
                assembleSig(at.elemtype);
                return;
            case 12:
                Type.MethodType mt = (Type.MethodType) type;
                this.sigbuf.appendByte(40);
                assembleSig(mt.argtypes);
                this.sigbuf.appendByte(41);
                assembleSig(mt.restype);
                if (hasTypeVar(mt.thrown)) {
                    for (List list = mt.thrown; list.nonEmpty(); list = list.tail) {
                        this.sigbuf.appendByte(94);
                        assembleSig((Type) list.head);
                    }
                    return;
                }
                return;
            case 13:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            default:
                throw new AssertionError("typeSig " + type.f344tag);
            case 14:
                this.sigbuf.appendByte(84);
                this.sigbuf.appendName(type.tsym.name);
                this.sigbuf.appendByte(59);
                return;
            case 15:
                Type.WildcardType ta = (Type.WildcardType) type;
                int i = C06741.$SwitchMap$com$sun$tools$javac$code$BoundKind[ta.kind.ordinal()];
                if (i == 1) {
                    this.sigbuf.appendByte(45);
                    assembleSig(ta.type);
                    return;
                } else if (i == 2) {
                    this.sigbuf.appendByte(43);
                    assembleSig(ta.type);
                    return;
                } else {
                    if (i == 3) {
                        this.sigbuf.appendByte(42);
                        return;
                    }
                    throw new AssertionError(ta.kind);
                }
            case 16:
                Type.ForAll ft = (Type.ForAll) type;
                assembleParamsSig(ft.tvars);
                assembleSig(ft.qtype);
                return;
            case 22:
            case 23:
                assembleSig(this.types.erasure(((UninitializedType) type).qtype));
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean hasTypeVar(List<Type> list) {
        for (List list2 = list; list2.nonEmpty(); list2 = list2.tail) {
            if (((Type) list2.head).f344tag == 14) {
                return true;
            }
        }
        return false;
    }

    void assembleClassSig(Type type) {
        Type typeErasure;
        Name nameSubName;
        Type.ClassType ct = (Type.ClassType) type;
        Symbol.ClassSymbol c = (Symbol.ClassSymbol) ct.tsym;
        enterInner(c);
        Type outer = ct.getEnclosingType();
        if (outer.allparams().nonEmpty()) {
            boolean rawOuter = c.owner.kind == 16 || c.name == this.names.empty;
            if (rawOuter) {
                typeErasure = this.types.erasure(outer);
            } else {
                typeErasure = outer;
            }
            assembleClassSig(typeErasure);
            this.sigbuf.appendByte(46);
            Assert.check(c.flatname.startsWith(c.owner.enclClass().flatname));
            ByteBuffer byteBuffer = this.sigbuf;
            if (rawOuter) {
                nameSubName = c.flatname.subName(c.owner.enclClass().flatname.getByteLength() + 1, c.flatname.getByteLength());
            } else {
                nameSubName = c.name;
            }
            byteBuffer.appendName(nameSubName);
        } else {
            this.sigbuf.appendBytes(externalize(c.flatname));
        }
        if (ct.getTypeArguments().nonEmpty()) {
            this.sigbuf.appendByte(60);
            assembleSig(ct.getTypeArguments());
            this.sigbuf.appendByte(62);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void assembleSig(List<Type> types) {
        for (List list = types; list.nonEmpty(); list = list.tail) {
            assembleSig((Type) list.head);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void assembleParamsSig(List<Type> typarams) {
        this.sigbuf.appendByte(60);
        for (List list = typarams; list.nonEmpty(); list = list.tail) {
            Type.TypeVar tvar = (Type.TypeVar) list.head;
            this.sigbuf.appendName(tvar.tsym.name);
            List<Type> bounds = this.types.getBounds(tvar);
            if ((bounds.head.tsym.flags() & 512) != 0) {
                this.sigbuf.appendByte(58);
            }
            for (List list2 = bounds; list2.nonEmpty(); list2 = list2.tail) {
                this.sigbuf.appendByte(58);
                assembleSig((Type) list2.head);
            }
        }
        this.sigbuf.appendByte(62);
    }

    Name typeSig(Type type) {
        Assert.check(this.sigbuf.length == 0);
        assembleSig(type);
        Name n = this.sigbuf.toName(this.names);
        this.sigbuf.reset();
        return n;
    }

    public Name xClassName(Type t) {
        if (t.f344tag == 10) {
            return this.names.fromUtf(externalize(t.tsym.flatName()));
        }
        if (t.f344tag == 11) {
            return typeSig(this.types.erasure(t));
        }
        throw new AssertionError("xClassName");
    }

    public static class StringOverflow extends Exception {
        private static final long serialVersionUID = 0;
        public final String value;

        public StringOverflow(String s) {
            this.value = s;
        }
    }

    void writePool(Pool pool) throws StringOverflow, PoolOverflow {
        int poolCountIdx = this.poolbuf.length;
        this.poolbuf.appendChar(0);
        int i = 1;
        while (i < pool.f447pp) {
            Object value = pool.pool[i];
            Assert.checkNonNull(value);
            if (value instanceof Pool.Method) {
                value = ((Pool.Method) value).f448m;
            } else if (value instanceof Pool.Variable) {
                value = ((Pool.Variable) value).f449v;
            }
            if (value instanceof Symbol.MethodSymbol) {
                Symbol.MethodSymbol m = (Symbol.MethodSymbol) value;
                this.poolbuf.appendByte((m.owner.flags() & 512) == 0 ? 10 : 11);
                this.poolbuf.appendChar(pool.m478put(m.owner));
                this.poolbuf.appendChar(pool.m478put(nameType(m)));
            } else if (value instanceof Symbol.VarSymbol) {
                Symbol.VarSymbol v = (Symbol.VarSymbol) value;
                this.poolbuf.appendByte(9);
                this.poolbuf.appendChar(pool.m478put(v.owner));
                this.poolbuf.appendChar(pool.m478put(nameType(v)));
            } else if (value instanceof Name) {
                this.poolbuf.appendByte(1);
                byte[] bs = ((Name) value).toUtf();
                this.poolbuf.appendChar(bs.length);
                this.poolbuf.appendBytes(bs, 0, bs.length);
                if (bs.length > 65535) {
                    throw new StringOverflow(value.toString());
                }
            } else if (value instanceof Symbol.ClassSymbol) {
                Symbol.ClassSymbol c = (Symbol.ClassSymbol) value;
                if (c.owner.kind == 2) {
                    pool.m478put(c.owner);
                }
                this.poolbuf.appendByte(7);
                if (c.type.f344tag == 11) {
                    this.poolbuf.appendChar(pool.m478put(typeSig(c.type)));
                } else {
                    this.poolbuf.appendChar(pool.m478put(this.names.fromUtf(externalize(c.flatname))));
                    enterInner(c);
                }
            } else if (value instanceof ClassFile.NameAndType) {
                ClassFile.NameAndType nt = (ClassFile.NameAndType) value;
                this.poolbuf.appendByte(12);
                this.poolbuf.appendChar(pool.m478put(nt.name));
                this.poolbuf.appendChar(pool.m478put(typeSig(nt.type)));
            } else if (value instanceof Integer) {
                this.poolbuf.appendByte(3);
                this.poolbuf.appendInt(((Integer) value).intValue());
            } else if (value instanceof Long) {
                this.poolbuf.appendByte(5);
                this.poolbuf.appendLong(((Long) value).longValue());
                i++;
            } else if (value instanceof Float) {
                this.poolbuf.appendByte(4);
                this.poolbuf.appendFloat(((Float) value).floatValue());
            } else if (value instanceof Double) {
                this.poolbuf.appendByte(6);
                this.poolbuf.appendDouble(((Double) value).doubleValue());
                i++;
            } else if (value instanceof String) {
                this.poolbuf.appendByte(8);
                this.poolbuf.appendChar(pool.m478put(this.names.fromString((String) value)));
            } else if (value instanceof Type) {
                Type type = (Type) value;
                if (type.f344tag == 10) {
                    enterInner((Symbol.ClassSymbol) type.tsym);
                }
                this.poolbuf.appendByte(7);
                this.poolbuf.appendChar(pool.m478put(xClassName(type)));
            } else {
                Assert.error("writePool " + value);
            }
            i++;
        }
        if (pool.f447pp > 65535) {
            throw new PoolOverflow();
        }
        putChar(this.poolbuf, poolCountIdx, pool.f447pp);
    }

    Name fieldName(Symbol sym) {
        if ((this.scramble && (sym.flags() & 2) != 0) || (this.scrambleAll && (sym.flags() & 5) == 0)) {
            return this.names.fromString("_$" + sym.name.getIndex());
        }
        return sym.name;
    }

    ClassFile.NameAndType nameType(Symbol sym) {
        Type typeExternalType;
        Name nameFieldName = fieldName(sym);
        if (this.retrofit) {
            typeExternalType = sym.erasure(this.types);
        } else {
            typeExternalType = sym.externalType(this.types);
        }
        return new ClassFile.NameAndType(nameFieldName, typeExternalType);
    }

    int writeAttr(Name attrName) {
        this.databuf.appendChar(this.pool.m478put(attrName));
        this.databuf.appendInt(0);
        return this.databuf.length;
    }

    void endAttr(int index) {
        ByteBuffer byteBuffer = this.databuf;
        putInt(byteBuffer, index - 4, byteBuffer.length - index);
    }

    int beginAttrs() {
        this.databuf.appendChar(0);
        return this.databuf.length;
    }

    void endAttrs(int index, int count) {
        putChar(this.databuf, index - 2, count);
    }

    int writeEnclosingMethodAttribute(Symbol.ClassSymbol c) {
        Symbol.MethodSymbol enclMethod;
        if (!this.target.hasEnclosingMethodAttribute() || (c.owner.kind != 16 && c.name != this.names.empty)) {
            return 0;
        }
        int alenIdx = writeAttr(this.names.EnclosingMethod);
        Symbol.ClassSymbol enclClass = c.owner.enclClass();
        if (c.owner.type == null || c.owner.kind != 16) {
            enclMethod = null;
        } else {
            enclMethod = (Symbol.MethodSymbol) c.owner;
        }
        this.databuf.appendChar(this.pool.m478put(enclClass));
        this.databuf.appendChar(enclMethod != null ? this.pool.m478put(nameType(c.owner)) : 0);
        endAttr(alenIdx);
        return 1;
    }

    int writeFlagAttrs(long flags) {
        int acount = 0;
        if ((131072 & flags) != 0) {
            int alenIdx = writeAttr(this.names.Deprecated);
            endAttr(alenIdx);
            acount = 0 + 1;
        }
        if ((16384 & flags) != 0 && !this.target.useEnumFlag()) {
            int alenIdx2 = writeAttr(this.names.Enum);
            endAttr(alenIdx2);
            acount++;
        }
        if ((4096 & flags) != 0 && !this.target.useSyntheticFlag()) {
            int alenIdx3 = writeAttr(this.names.Synthetic);
            endAttr(alenIdx3);
            acount++;
        }
        if ((Flags.BRIDGE & flags) != 0 && !this.target.useBridgeFlag()) {
            int alenIdx4 = writeAttr(this.names.Bridge);
            endAttr(alenIdx4);
            acount++;
        }
        if ((Flags.VARARGS & flags) != 0 && !this.target.useVarargsFlag()) {
            int alenIdx5 = writeAttr(this.names.Varargs);
            endAttr(alenIdx5);
            acount++;
        }
        if ((8192 & flags) != 0 && !this.target.useAnnotationFlag()) {
            int alenIdx6 = writeAttr(this.names.Annotation);
            endAttr(alenIdx6);
            return acount + 1;
        }
        return acount;
    }

    int writeMemberAttrs(Symbol sym) {
        int acount = writeFlagAttrs(sym.flags());
        long flags = sym.flags();
        if (this.source.allowGenerics() && (2147487744L & flags) != 4096 && (536870912 & flags) == 0 && (!this.types.isSameType(sym.type, sym.erasure(this.types)) || hasTypeVar(sym.type.mo575getThrownTypes()))) {
            int alenIdx = writeAttr(this.names.Signature);
            this.databuf.appendChar(this.pool.m478put(typeSig(sym.type)));
            endAttr(alenIdx);
            acount++;
        }
        return acount + writeJavaAnnotations(sym.getAnnotationMirrors());
    }

    int writeParameterAttrs(Symbol.MethodSymbol m) {
        boolean hasVisible = false;
        boolean hasInvisible = false;
        if (m.params != null) {
            for (Symbol.VarSymbol s : m.params) {
                Iterator it = s.getAnnotationMirrors().iterator();
                while (it.hasNext()) {
                    int i = C06741.f431x675e4340[this.types.getRetention((Attribute.Compound) it.next()).ordinal()];
                    if (i == 2) {
                        hasInvisible = true;
                    } else if (i == 3) {
                        hasVisible = true;
                    }
                }
            }
        }
        int attrCount = 0;
        if (hasVisible) {
            int attrIndex = writeAttr(this.names.RuntimeVisibleParameterAnnotations);
            this.databuf.appendByte(m.params.length());
            for (Symbol.VarSymbol s2 : m.params) {
                ListBuffer<Attribute.Compound> buf = new ListBuffer<>();
                for (Attribute.Compound a : s2.getAnnotationMirrors()) {
                    if (this.types.getRetention(a) == RetentionPolicy.RUNTIME) {
                        buf.append(a);
                    }
                }
                this.databuf.appendChar(buf.length());
                Iterator<Attribute.Compound> it2 = buf.iterator();
                while (it2.hasNext()) {
                    writeCompoundAttribute(it2.next());
                }
            }
            endAttr(attrIndex);
            attrCount = 0 + 1;
        }
        if (hasInvisible) {
            int attrIndex2 = writeAttr(this.names.RuntimeInvisibleParameterAnnotations);
            this.databuf.appendByte(m.params.length());
            for (Symbol.VarSymbol s3 : m.params) {
                ListBuffer<Attribute.Compound> buf2 = new ListBuffer<>();
                for (Attribute.Compound a2 : s3.getAnnotationMirrors()) {
                    if (this.types.getRetention(a2) == RetentionPolicy.CLASS) {
                        buf2.append(a2);
                    }
                }
                this.databuf.appendChar(buf2.length());
                Iterator<Attribute.Compound> it3 = buf2.iterator();
                while (it3.hasNext()) {
                    writeCompoundAttribute(it3.next());
                }
            }
            endAttr(attrIndex2);
            return attrCount + 1;
        }
        return attrCount;
    }

    int writeJavaAnnotations(List<Attribute.Compound> attrs) {
        if (attrs.isEmpty()) {
            return 0;
        }
        ListBuffer<Attribute.Compound> visibles = new ListBuffer<>();
        ListBuffer<Attribute.Compound> invisibles = new ListBuffer<>();
        for (Attribute.Compound a : attrs) {
            int i = C06741.f431x675e4340[this.types.getRetention(a).ordinal()];
            if (i == 2) {
                invisibles.append(a);
            } else if (i == 3) {
                visibles.append(a);
            }
        }
        int attrCount = 0;
        if (visibles.length() != 0) {
            int attrIndex = writeAttr(this.names.RuntimeVisibleAnnotations);
            this.databuf.appendChar(visibles.length());
            for (Attribute.Compound a2 : visibles) {
                writeCompoundAttribute(a2);
            }
            endAttr(attrIndex);
            attrCount = 0 + 1;
        }
        int attrIndex2 = invisibles.length();
        if (attrIndex2 != 0) {
            int attrIndex3 = writeAttr(this.names.RuntimeInvisibleAnnotations);
            this.databuf.appendChar(invisibles.length());
            for (Attribute.Compound a3 : invisibles) {
                writeCompoundAttribute(a3);
            }
            endAttr(attrIndex3);
            return attrCount + 1;
        }
        return attrCount;
    }

    class AttributeWriter implements Attribute.Visitor {
        AttributeWriter() {
        }

        @Override
        public void visitConstant(Attribute.Constant _value) {
            Object value = _value.value;
            switch (_value.type.f344tag) {
                case 1:
                    ClassWriter.this.databuf.appendByte(66);
                    break;
                case 2:
                    ClassWriter.this.databuf.appendByte(67);
                    break;
                case 3:
                    ClassWriter.this.databuf.appendByte(83);
                    break;
                case 4:
                    ClassWriter.this.databuf.appendByte(73);
                    break;
                case 5:
                    ClassWriter.this.databuf.appendByte(74);
                    break;
                case 6:
                    ClassWriter.this.databuf.appendByte(70);
                    break;
                case 7:
                    ClassWriter.this.databuf.appendByte(68);
                    break;
                case 8:
                    ClassWriter.this.databuf.appendByte(90);
                    break;
                case 9:
                default:
                    throw new AssertionError(_value.type);
                case 10:
                    Assert.check(value instanceof String);
                    ClassWriter.this.databuf.appendByte(ByteCodes.dmod);
                    value = ClassWriter.this.names.fromString(value.toString());
                    break;
            }
            ClassWriter.this.databuf.appendChar(ClassWriter.this.pool.m478put(value));
        }

        @Override
        public void visitEnum(Attribute.Enum e) {
            ClassWriter.this.databuf.appendByte(ByteCodes.lsub);
            ClassWriter.this.databuf.appendChar(ClassWriter.this.pool.m478put(ClassWriter.this.typeSig(e.value.type)));
            ClassWriter.this.databuf.appendChar(ClassWriter.this.pool.m478put(e.value.name));
        }

        @Override
        public void visitClass(Attribute.Class clazz) {
            ClassWriter.this.databuf.appendByte(99);
            ClassWriter.this.databuf.appendChar(ClassWriter.this.pool.m478put(ClassWriter.this.typeSig(clazz.type)));
        }

        @Override
        public void visitCompound(Attribute.Compound compound) {
            ClassWriter.this.databuf.appendByte(64);
            ClassWriter.this.writeCompoundAttribute(compound);
        }

        @Override
        public void visitError(Attribute.Error x) {
            throw new AssertionError(x);
        }

        @Override
        public void visitArray(Attribute.Array array) {
            ClassWriter.this.databuf.appendByte(91);
            ClassWriter.this.databuf.appendChar(array.values.length);
            for (Attribute a : array.values) {
                a.accept(this);
            }
        }
    }

    void writeCompoundAttribute(Attribute.Compound c) {
        this.databuf.appendChar(this.pool.m478put(typeSig(c.type)));
        this.databuf.appendChar(c.values.length());
        for (Pair<Symbol.MethodSymbol, Attribute> p : c.values) {
            this.databuf.appendChar(this.pool.m478put(p.f577fst.name));
            p.f578snd.accept(this.awriter);
        }
    }

    void enterInner(Symbol.ClassSymbol c) {
        if (c.type.isCompound()) {
            throw new AssertionError("Unexpected intersection type: " + c.type);
        }
        try {
            c.complete();
            if (c.type.f344tag == 10 && this.pool != null && c.owner.enclClass() != null) {
                Set<Symbol.ClassSymbol> set = this.innerClasses;
                if (set == null || !set.contains(c)) {
                    enterInner(c.owner.enclClass());
                    this.pool.m478put(c);
                    this.pool.m478put(c.name);
                    if (this.innerClasses == null) {
                        this.innerClasses = new HashSet();
                        this.innerClassesQueue = new ListBuffer<>();
                        this.pool.m478put(this.names.InnerClasses);
                    }
                    this.innerClasses.add(c);
                    this.innerClassesQueue.append(c);
                }
            }
        } catch (Symbol.CompletionFailure ex) {
            System.err.println("error: " + c + ": " + ex.getMessage());
            throw ex;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void writeInnerClasses() {
        int alenIdx = writeAttr(this.names.InnerClasses);
        this.databuf.appendChar(this.innerClassesQueue.length());
        for (List list = this.innerClassesQueue.toList(); list.nonEmpty(); list = list.tail) {
            Symbol.ClassSymbol inner = (Symbol.ClassSymbol) list.head;
            char flags = (char) adjustFlags(inner.flags_field);
            if ((flags & 512) != 0) {
                flags = (char) (flags | 1024);
            }
            if (inner.name.isEmpty()) {
                flags = (char) (flags & (-17));
            }
            if (this.dumpInnerClassModifiers) {
                this.f430log.errWriter.println("INNERCLASS  " + ((Object) inner.name));
                this.f430log.errWriter.println("---" + flagNames(flags));
            }
            this.databuf.appendChar(this.pool.m477get(inner));
            int iM477get = 0;
            this.databuf.appendChar(inner.owner.kind == 2 ? this.pool.m477get(inner.owner) : 0);
            ByteBuffer byteBuffer = this.databuf;
            if (!inner.name.isEmpty()) {
                iM477get = this.pool.m477get(inner.name);
            }
            byteBuffer.appendChar(iM477get);
            this.databuf.appendChar(flags);
        }
        endAttr(alenIdx);
    }

    void writeField(Symbol.VarSymbol v) {
        int flags = adjustFlags(v.flags());
        this.databuf.appendChar(flags);
        if (this.dumpFieldModifiers) {
            this.f430log.errWriter.println("FIELD  " + ((Object) fieldName(v)));
            this.f430log.errWriter.println("---" + flagNames(v.flags()));
        }
        this.databuf.appendChar(this.pool.m478put(fieldName(v)));
        this.databuf.appendChar(this.pool.m478put(typeSig(v.erasure(this.types))));
        int acountIdx = beginAttrs();
        int acount = 0;
        if (v.getConstValue() != null) {
            int alenIdx = writeAttr(this.names.ConstantValue);
            this.databuf.appendChar(this.pool.m478put(v.getConstValue()));
            endAttr(alenIdx);
            acount = 0 + 1;
        }
        int alenIdx2 = writeMemberAttrs(v);
        endAttrs(acountIdx, acount + alenIdx2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void writeMethod(Symbol.MethodSymbol m) {
        int flags = adjustFlags(m.flags());
        this.databuf.appendChar(flags);
        if (this.dumpMethodModifiers) {
            this.f430log.errWriter.println("METHOD  " + ((Object) fieldName(m)));
            this.f430log.errWriter.println("---" + flagNames(m.flags()));
        }
        this.databuf.appendChar(this.pool.m478put(fieldName(m)));
        this.databuf.appendChar(this.pool.m478put(typeSig(m.externalType(this.types))));
        int acountIdx = beginAttrs();
        int acount = 0;
        if (m.code != null) {
            int alenIdx = writeAttr(this.names.Code);
            writeCode(m.code);
            m.code = null;
            endAttr(alenIdx);
            acount = 0 + 1;
        }
        List<Type> thrown = m.erasure(this.types).mo575getThrownTypes();
        if (thrown.nonEmpty()) {
            int alenIdx2 = writeAttr(this.names.Exceptions);
            this.databuf.appendChar(thrown.length());
            for (List list = thrown; list.nonEmpty(); list = list.tail) {
                this.databuf.appendChar(this.pool.m478put(((Type) list.head).tsym));
            }
            endAttr(alenIdx2);
            acount++;
        }
        if (m.defaultValue != null) {
            int alenIdx3 = writeAttr(this.names.AnnotationDefault);
            m.defaultValue.accept(this.awriter);
            endAttr(alenIdx3);
            acount++;
        }
        int alenIdx4 = writeMemberAttrs(m);
        endAttrs(acountIdx, acount + alenIdx4 + writeParameterAttrs(m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    void writeCode(Code code) {
        this.databuf.appendChar(code.max_stack);
        this.databuf.appendChar(code.max_locals);
        this.databuf.appendInt(code.f433cp);
        this.databuf.appendBytes(code.code, 0, code.f433cp);
        this.databuf.appendChar(code.catchInfo.length());
        for (List list = code.catchInfo.toList(); list.nonEmpty(); list = list.tail) {
            for (int i = 0; i < ((char[]) list.head).length; i++) {
                this.databuf.appendChar(((char[]) list.head)[i]);
            }
        }
        int acountIdx = beginAttrs();
        int acount = 0;
        if (code.lineInfo.nonEmpty()) {
            int alenIdx = writeAttr(this.names.LineNumberTable);
            this.databuf.appendChar(code.lineInfo.length());
            for (List listReverse = code.lineInfo.reverse(); listReverse.nonEmpty(); listReverse = listReverse.tail) {
                for (int i2 = 0; i2 < ((char[]) listReverse.head).length; i2++) {
                    this.databuf.appendChar(((char[]) listReverse.head)[i2]);
                }
            }
            endAttr(alenIdx);
            acount = 0 + 1;
        }
        if (this.genCrt && code.f434crt != null) {
            CRTable crt = code.f434crt;
            int alenIdx2 = writeAttr(this.names.CharacterRangeTable);
            int crtIdx = beginAttrs();
            int crtEntries = crt.writeCRT(this.databuf, code.lineMap, this.f430log);
            endAttrs(crtIdx, crtEntries);
            endAttr(alenIdx2);
            acount++;
        }
        int nGenericVars = 0;
        if (code.varBufferSize > 0) {
            int alenIdx3 = writeAttr(this.names.LocalVariableTable);
            this.databuf.appendChar(code.varBufferSize);
            for (int i3 = 0; i3 < code.varBufferSize; i3++) {
                Code.LocalVar var = code.varBuffer[i3];
                Assert.check(var.start_pc >= 0 && var.start_pc <= code.f433cp);
                this.databuf.appendChar(var.start_pc);
                Assert.check(var.length >= 0 && var.start_pc + var.length <= code.f433cp);
                this.databuf.appendChar(var.length);
                Symbol.VarSymbol sym = var.f438sym;
                this.databuf.appendChar(this.pool.m478put(sym.name));
                Type vartype = sym.erasure(this.types);
                if (needsLocalVariableTypeEntry(sym.type)) {
                    nGenericVars++;
                }
                this.databuf.appendChar(this.pool.m478put(typeSig(vartype)));
                this.databuf.appendChar(var.f437reg);
            }
            endAttr(alenIdx3);
            acount++;
        }
        if (nGenericVars > 0) {
            int alenIdx4 = writeAttr(this.names.LocalVariableTypeTable);
            this.databuf.appendChar(nGenericVars);
            int count = 0;
            for (int i4 = 0; i4 < code.varBufferSize; i4++) {
                Code.LocalVar var2 = code.varBuffer[i4];
                Symbol.VarSymbol sym2 = var2.f438sym;
                if (needsLocalVariableTypeEntry(sym2.type)) {
                    count++;
                    this.databuf.appendChar(var2.start_pc);
                    this.databuf.appendChar(var2.length);
                    this.databuf.appendChar(this.pool.m478put(sym2.name));
                    this.databuf.appendChar(this.pool.m478put(typeSig(sym2.type)));
                    this.databuf.appendChar(var2.f437reg);
                }
            }
            Assert.check(count == nGenericVars);
            endAttr(alenIdx4);
            acount++;
        }
        if (code.stackMapBufferSize > 0) {
            if (this.debugstackmap) {
                System.out.println("Stack map for " + code.meth);
            }
            int alenIdx5 = writeAttr(code.stackMap.getAttributeName(this.names));
            writeStackMap(code);
            endAttr(alenIdx5);
            acount++;
        }
        endAttrs(acountIdx, acount);
    }

    private boolean needsLocalVariableTypeEntry(Type t) {
        Types types = this.types;
        return (types.isSameType(t, types.erasure(t)) || t.isCompound()) ? false : true;
    }

    void writeStackMap(Code code) {
        int nframes = code.stackMapBufferSize;
        if (this.debugstackmap) {
            System.out.println(" nframes = " + nframes);
        }
        this.databuf.appendChar(nframes);
        int i = C06741.f432x81e00a58[code.stackMap.ordinal()];
        if (i != 1) {
            if (i == 2) {
                Assert.checkNull(code.stackMapBuffer);
                for (int i2 = 0; i2 < nframes; i2++) {
                    if (this.debugstackmap) {
                        System.out.print("  " + i2 + ":");
                    }
                    code.stackMapTableBuffer[i2].write(this);
                    if (this.debugstackmap) {
                        System.out.println();
                    }
                }
                return;
            }
            throw new AssertionError("Unexpected stackmap format value");
        }
        for (int i3 = 0; i3 < nframes; i3++) {
            if (this.debugstackmap) {
                System.out.print("  " + i3 + ":");
            }
            Code.StackMapFrame frame = code.stackMapBuffer[i3];
            if (this.debugstackmap) {
                System.out.print(" pc=" + frame.f439pc);
            }
            this.databuf.appendChar(frame.f439pc);
            int localCount = 0;
            int j = 0;
            while (j < frame.locals.length) {
                localCount++;
                j += this.target.generateEmptyAfterBig() ? 1 : Code.width(frame.locals[j]);
            }
            if (this.debugstackmap) {
                System.out.print(" nlocals=" + localCount);
            }
            this.databuf.appendChar(localCount);
            int j2 = 0;
            while (j2 < frame.locals.length) {
                if (this.debugstackmap) {
                    System.out.print(" local[" + j2 + "]=");
                }
                writeStackMapType(frame.locals[j2]);
                j2 += this.target.generateEmptyAfterBig() ? 1 : Code.width(frame.locals[j2]);
            }
            int stackCount = 0;
            int j3 = 0;
            while (j3 < frame.stack.length) {
                stackCount++;
                j3 += this.target.generateEmptyAfterBig() ? 1 : Code.width(frame.stack[j3]);
            }
            if (this.debugstackmap) {
                System.out.print(" nstack=" + stackCount);
            }
            this.databuf.appendChar(stackCount);
            int j4 = 0;
            while (j4 < frame.stack.length) {
                if (this.debugstackmap) {
                    System.out.print(" stack[" + j4 + "]=");
                }
                writeStackMapType(frame.stack[j4]);
                j4 += this.target.generateEmptyAfterBig() ? 1 : Code.width(frame.stack[j4]);
            }
            if (this.debugstackmap) {
                System.out.println();
            }
        }
    }

    static class C06741 {
        static final int[] $SwitchMap$com$sun$tools$javac$code$BoundKind;

        static final int[] f431x675e4340;

        static final int[] f432x81e00a58;

        static {
            int[] iArr = new int[Code.StackMapFormat.values().length];
            f432x81e00a58 = iArr;
            try {
                iArr[Code.StackMapFormat.CLDC.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f432x81e00a58[Code.StackMapFormat.JSR202.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            int[] iArr2 = new int[RetentionPolicy.values().length];
            f431x675e4340 = iArr2;
            try {
                iArr2[RetentionPolicy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f431x675e4340[RetentionPolicy.CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f431x675e4340[RetentionPolicy.RUNTIME.ordinal()] = 3;
            } catch (NoSuchFieldError e5) {
            }
            int[] iArr3 = new int[BoundKind.values().length];
            $SwitchMap$com$sun$tools$javac$code$BoundKind = iArr3;
            try {
                iArr3[BoundKind.SUPER.ordinal()] = 1;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$BoundKind[BoundKind.EXTENDS.ordinal()] = 2;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$com$sun$tools$javac$code$BoundKind[BoundKind.UNBOUND.ordinal()] = 3;
            } catch (NoSuchFieldError e8) {
            }
        }
    }

    void writeStackMapType(Type t) {
        if (t == null) {
            if (this.debugstackmap) {
                System.out.print("empty");
            }
            this.databuf.appendByte(0);
            return;
        }
        int i = t.f344tag;
        if (i == 10 || i == 11) {
            if (this.debugstackmap) {
                System.out.print("object(" + t + ")");
            }
            this.databuf.appendByte(7);
            this.databuf.appendChar(this.pool.m478put(t));
            return;
        }
        if (i == 14) {
            if (this.debugstackmap) {
                System.out.print("object(" + this.types.erasure(t).tsym + ")");
            }
            this.databuf.appendByte(7);
            this.databuf.appendChar(this.pool.m478put(this.types.erasure(t).tsym));
            return;
        }
        if (i == 17) {
            if (this.debugstackmap) {
                System.out.print("null");
            }
            this.databuf.appendByte(5);
            return;
        }
        if (i == 22) {
            if (this.debugstackmap) {
                System.out.print("uninit_this");
            }
            this.databuf.appendByte(6);
            return;
        }
        if (i != 23) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 8:
                    if (this.debugstackmap) {
                        System.out.print("int");
                    }
                    this.databuf.appendByte(1);
                    return;
                case 5:
                    if (this.debugstackmap) {
                        System.out.print("long");
                    }
                    this.databuf.appendByte(4);
                    return;
                case 6:
                    if (this.debugstackmap) {
                        System.out.print("float");
                    }
                    this.databuf.appendByte(2);
                    return;
                case 7:
                    if (this.debugstackmap) {
                        System.out.print("double");
                    }
                    this.databuf.appendByte(3);
                    return;
                default:
                    throw new AssertionError();
            }
        }
        UninitializedType uninitType = (UninitializedType) t;
        this.databuf.appendByte(8);
        if (this.debugstackmap) {
            System.out.print("uninit_object@" + uninitType.offset);
        }
        this.databuf.appendChar(uninitType.offset);
    }

    static abstract class StackMapTableFrame {
        abstract int getFrameType();

        StackMapTableFrame() {
        }

        void write(ClassWriter writer) {
            int frameType = getFrameType();
            writer.databuf.appendByte(frameType);
            if (writer.debugstackmap) {
                System.out.print(" frame_type=" + frameType);
            }
        }

        static class SameFrame extends StackMapTableFrame {
            final int offsetDelta;

            SameFrame(int offsetDelta) {
                this.offsetDelta = offsetDelta;
            }

            @Override
            int getFrameType() {
                int i = this.offsetDelta;
                return i < 64 ? i : ClassWriter.SAME_FRAME_EXTENDED;
            }

            @Override
            void write(ClassWriter writer) {
                super.write(writer);
                if (getFrameType() == ClassWriter.SAME_FRAME_EXTENDED) {
                    writer.databuf.appendChar(this.offsetDelta);
                    if (writer.debugstackmap) {
                        System.out.print(" offset_delta=" + this.offsetDelta);
                    }
                }
            }
        }

        static class SameLocals1StackItemFrame extends StackMapTableFrame {
            final int offsetDelta;
            final Type stack;

            SameLocals1StackItemFrame(int offsetDelta, Type stack) {
                this.offsetDelta = offsetDelta;
                this.stack = stack;
            }

            @Override
            int getFrameType() {
                int i = this.offsetDelta;
                if (i < 64) {
                    return i + 64;
                }
                return ClassWriter.SAME_LOCALS_1_STACK_ITEM_EXTENDED;
            }

            @Override
            void write(ClassWriter writer) {
                super.write(writer);
                if (getFrameType() == ClassWriter.SAME_LOCALS_1_STACK_ITEM_EXTENDED) {
                    writer.databuf.appendChar(this.offsetDelta);
                    if (writer.debugstackmap) {
                        System.out.print(" offset_delta=" + this.offsetDelta);
                    }
                }
                if (writer.debugstackmap) {
                    System.out.print(" stack[0]=");
                }
                writer.writeStackMapType(this.stack);
            }
        }

        static class ChopFrame extends StackMapTableFrame {
            final int frameType;
            final int offsetDelta;

            ChopFrame(int frameType, int offsetDelta) {
                this.frameType = frameType;
                this.offsetDelta = offsetDelta;
            }

            @Override
            int getFrameType() {
                return this.frameType;
            }

            @Override
            void write(ClassWriter writer) {
                super.write(writer);
                writer.databuf.appendChar(this.offsetDelta);
                if (writer.debugstackmap) {
                    System.out.print(" offset_delta=" + this.offsetDelta);
                }
            }
        }

        static class AppendFrame extends StackMapTableFrame {
            final int frameType;
            final Type[] locals;
            final int offsetDelta;

            AppendFrame(int frameType, int offsetDelta, Type[] locals) {
                this.frameType = frameType;
                this.offsetDelta = offsetDelta;
                this.locals = locals;
            }

            @Override
            int getFrameType() {
                return this.frameType;
            }

            @Override
            void write(ClassWriter writer) {
                super.write(writer);
                writer.databuf.appendChar(this.offsetDelta);
                if (writer.debugstackmap) {
                    System.out.print(" offset_delta=" + this.offsetDelta);
                }
                for (int i = 0; i < this.locals.length; i++) {
                    if (writer.debugstackmap) {
                        System.out.print(" locals[" + i + "]=");
                    }
                    writer.writeStackMapType(this.locals[i]);
                }
            }
        }

        static class FullFrame extends StackMapTableFrame {
            final Type[] locals;
            final int offsetDelta;
            final Type[] stack;

            FullFrame(int offsetDelta, Type[] locals, Type[] stack) {
                this.offsetDelta = offsetDelta;
                this.locals = locals;
                this.stack = stack;
            }

            @Override
            int getFrameType() {
                return 255;
            }

            @Override
            void write(ClassWriter writer) {
                super.write(writer);
                writer.databuf.appendChar(this.offsetDelta);
                writer.databuf.appendChar(this.locals.length);
                if (writer.debugstackmap) {
                    System.out.print(" offset_delta=" + this.offsetDelta);
                    System.out.print(" nlocals=" + this.locals.length);
                }
                for (int i = 0; i < this.locals.length; i++) {
                    if (writer.debugstackmap) {
                        System.out.print(" locals[" + i + "]=");
                    }
                    writer.writeStackMapType(this.locals[i]);
                }
                writer.databuf.appendChar(this.stack.length);
                if (writer.debugstackmap) {
                    System.out.print(" nstack=" + this.stack.length);
                }
                for (int i2 = 0; i2 < this.stack.length; i2++) {
                    if (writer.debugstackmap) {
                        System.out.print(" stack[" + i2 + "]=");
                    }
                    writer.writeStackMapType(this.stack[i2]);
                }
            }
        }

        static StackMapTableFrame getInstance(Code.StackMapFrame this_frame, int prev_pc, Type[] prev_locals, Types types) {
            Type[] locals = this_frame.locals;
            Type[] stack = this_frame.stack;
            int offset_delta = (this_frame.f439pc - prev_pc) - 1;
            if (stack.length == 1) {
                if (locals.length == prev_locals.length && compare(prev_locals, locals, types) == 0) {
                    return new SameLocals1StackItemFrame(offset_delta, stack[0]);
                }
            } else if (stack.length == 0) {
                int diff_length = compare(prev_locals, locals, types);
                if (diff_length == 0) {
                    return new SameFrame(offset_delta);
                }
                if (-4 < diff_length && diff_length < 0) {
                    Type[] local_diff = new Type[-diff_length];
                    int i = prev_locals.length;
                    int j = 0;
                    while (i < locals.length) {
                        local_diff[j] = locals[i];
                        i++;
                        j++;
                    }
                    return new AppendFrame(251 - diff_length, offset_delta, local_diff);
                }
                if (diff_length > 0 && diff_length < 4) {
                    return new ChopFrame(251 - diff_length, offset_delta);
                }
            }
            return new FullFrame(offset_delta, locals, stack);
        }

        static boolean isInt(Type t) {
            return t.f344tag < 4 || t.f344tag == 8;
        }

        static boolean isSameType(Type t1, Type t2, Types types) {
            if (t1 == null) {
                return t2 == null;
            }
            if (t2 == null) {
                return false;
            }
            if (isInt(t1) && isInt(t2)) {
                return true;
            }
            if (t1.f344tag == 22) {
                return t2.f344tag == 22;
            }
            if (t1.f344tag == 23) {
                return t2.f344tag == 23 && ((UninitializedType) t1).offset == ((UninitializedType) t2).offset;
            }
            if (t2.f344tag == 22 || t2.f344tag == 23) {
                return false;
            }
            return types.isSameType(t1, t2);
        }

        static int compare(Type[] arr1, Type[] arr2, Types types) {
            int diff_length = arr1.length - arr2.length;
            if (diff_length > 4 || diff_length < -4) {
                return Position.MAXPOS;
            }
            int len = diff_length > 0 ? arr2.length : arr1.length;
            for (int i = 0; i < len; i++) {
                if (!isSameType(arr1[i], arr2[i], types)) {
                    return Position.MAXPOS;
                }
            }
            return diff_length;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void writeFields(Scope.Entry e) {
        List listM507nil = List.m507nil();
        for (Scope.Entry i = e; i != null; i = i.sibling) {
            if (i.f338sym.kind == 4) {
                listM507nil = listM507nil.prepend((Symbol.VarSymbol) i.f338sym);
            }
        }
        while (listM507nil.nonEmpty()) {
            writeField((Symbol.VarSymbol) listM507nil.head);
            listM507nil = listM507nil.tail;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void writeMethods(Scope.Entry e) {
        List listM507nil = List.m507nil();
        for (Scope.Entry i = e; i != null; i = i.sibling) {
            if (i.f338sym.kind == 16 && (i.f338sym.flags() & Flags.HYPOTHETICAL) == 0) {
                listM507nil = listM507nil.prepend((Symbol.MethodSymbol) i.f338sym);
            }
        }
        while (listM507nil.nonEmpty()) {
            writeMethod((Symbol.MethodSymbol) listM507nil.head);
            listM507nil = listM507nil.tail;
        }
    }

    public JavaFileObject writeClass(Symbol.ClassSymbol c) throws StringOverflow, IOException, PoolOverflow {
        JavaFileObject outFile = this.fileManager.getJavaFileForOutput(StandardLocation.CLASS_OUTPUT, c.flatname.toString(), JavaFileObject.Kind.CLASS, c.sourcefile);
        OutputStream out = outFile.openOutputStream();
        try {
            writeClassFile(out, c);
            if (this.verbose) {
                this.f430log.printVerbose("wrote.file", outFile);
            }
            out.close();
            OutputStream out2 = null;
            if (0 != 0) {
                out2.close();
                outFile.delete();
                return null;
            }
            return outFile;
        } catch (Throwable th) {
            if (out != null) {
                out.close();
                outFile.delete();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeClassFile(OutputStream out, Symbol.ClassSymbol c) throws StringOverflow, PoolOverflow, IOException {
        Assert.check((c.flags() & 16777216) == 0);
        this.databuf.reset();
        this.poolbuf.reset();
        this.sigbuf.reset();
        this.pool = c.pool;
        this.innerClasses = null;
        this.innerClassesQueue = null;
        Type supertype = this.types.supertype(c.type);
        List<Type> interfaces = this.types.interfaces(c.type);
        List<Type> typarams = c.type.getTypeArguments();
        int flags = adjustFlags(c.flags());
        if ((flags & 4) != 0) {
            flags |= 1;
        }
        int flags2 = flags & Flags.ClassFlags & (-2049);
        if ((flags2 & Flags.INTERFACE) == 0) {
            flags2 |= 32;
        }
        if (c.isInner() && c.name.isEmpty()) {
            flags2 &= -17;
        }
        if (this.dumpClassModifiers) {
            this.f430log.errWriter.println();
            this.f430log.errWriter.println("CLASSFILE  " + ((Object) c.getQualifiedName()));
            this.f430log.errWriter.println("---" + flagNames(flags2));
        }
        this.databuf.appendChar(flags2);
        this.databuf.appendChar(this.pool.m478put(c));
        this.databuf.appendChar(supertype.f344tag == 10 ? this.pool.m478put(supertype.tsym) : 0);
        this.databuf.appendChar(interfaces.length());
        for (List list = interfaces; list.nonEmpty(); list = list.tail) {
            this.databuf.appendChar(this.pool.m478put(((Type) list.head).tsym));
        }
        int fieldsCount = 0;
        int methodsCount = 0;
        for (Scope.Entry e = c.members().elems; e != null; e = e.sibling) {
            int i = e.f338sym.kind;
            if (i == 2) {
                enterInner((Symbol.ClassSymbol) e.f338sym);
            } else if (i == 4) {
                fieldsCount++;
            } else if (i != 16) {
                Assert.error();
            } else if ((e.f338sym.flags() & Flags.HYPOTHETICAL) == 0) {
                methodsCount++;
            }
        }
        if (c.trans_local != null) {
            for (Symbol.ClassSymbol local : c.trans_local) {
                enterInner(local);
            }
        }
        this.databuf.appendChar(fieldsCount);
        writeFields(c.members().elems);
        this.databuf.appendChar(methodsCount);
        writeMethods(c.members().elems);
        int acountIdx = beginAttrs();
        int acount = 0;
        boolean sigReq = (typarams.length() == 0 && supertype.allparams().length() == 0) ? false : true;
        for (List list2 = interfaces; !sigReq && list2.nonEmpty(); list2 = list2.tail) {
            sigReq = ((Type) list2.head).allparams().length() != 0;
        }
        if (sigReq) {
            Assert.check(this.source.allowGenerics());
            int alenIdx = writeAttr(this.names.Signature);
            if (typarams.length() != 0) {
                assembleParamsSig(typarams);
            }
            assembleSig(supertype);
            for (List list3 = interfaces; list3.nonEmpty(); list3 = list3.tail) {
                assembleSig((Type) list3.head);
            }
            this.databuf.appendChar(this.pool.m478put(this.sigbuf.toName(this.names)));
            this.sigbuf.reset();
            endAttr(alenIdx);
            acount = 0 + 1;
        }
        if (c.sourcefile != null && this.emitSourceFile) {
            int alenIdx2 = writeAttr(this.names.SourceFile);
            String simpleName = BaseFileObject.getSimpleName(c.sourcefile);
            this.databuf.appendChar(c.pool.m478put(this.names.fromString(simpleName)));
            endAttr(alenIdx2);
            acount++;
        }
        if (this.genCrt) {
            int alenIdx3 = writeAttr(this.names.SourceID);
            this.databuf.appendChar(c.pool.m478put(this.names.fromString(Long.toString(getLastModified(c.sourcefile)))));
            endAttr(alenIdx3);
            int alenIdx4 = writeAttr(this.names.CompilationID);
            this.databuf.appendChar(c.pool.m478put(this.names.fromString(Long.toString(System.currentTimeMillis()))));
            endAttr(alenIdx4);
            acount = acount + 1 + 1;
        }
        int acount2 = acount + writeFlagAttrs(c.flags()) + writeJavaAnnotations(c.getAnnotationMirrors()) + writeEnclosingMethodAttribute(c);
        this.poolbuf.appendInt(ClassFile.JAVA_MAGIC);
        this.poolbuf.appendChar(this.target.minorVersion);
        this.poolbuf.appendChar(this.target.majorVersion);
        writePool(c.pool);
        if (this.innerClasses != null) {
            writeInnerClasses();
            acount2++;
        }
        endAttrs(acountIdx, acount2);
        this.poolbuf.appendBytes(this.databuf.elems, 0, this.databuf.length);
        out.write(this.poolbuf.elems, 0, this.poolbuf.length);
        c.pool = null;
        this.pool = null;
    }

    int adjustFlags(long flags) {
        int result = (int) flags;
        if ((4096 & flags) != 0 && !this.target.useSyntheticFlag()) {
            result &= -4097;
        }
        if ((16384 & flags) != 0 && !this.target.useEnumFlag()) {
            result &= -16385;
        }
        if ((8192 & flags) != 0 && !this.target.useAnnotationFlag()) {
            result &= -8193;
        }
        if ((Flags.BRIDGE & flags) != 0 && this.target.useBridgeFlag()) {
            result |= 64;
        }
        if ((Flags.VARARGS & flags) != 0 && this.target.useVarargsFlag()) {
            return result | 128;
        }
        return result;
    }

    long getLastModified(FileObject filename) {
        try {
            long mod = filename.getLastModified();
            return mod;
        } catch (SecurityException e) {
            throw new AssertionError("CRT: couldn't get source file modification date: " + e.getMessage());
        }
    }
}
