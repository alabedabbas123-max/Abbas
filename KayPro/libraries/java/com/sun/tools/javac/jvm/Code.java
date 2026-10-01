package com.sun.tools.javac.jvm;

import com.google.common.primitives.UnsignedBytes;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Symtab;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.code.Types;
import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.Bits;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;
import com.sun.tools.javac.util.Position;

public class Code {
    static Type jsrReturnValue = new Type(4, null);

    public CRTable f434crt;
    public final boolean debugCode;
    public boolean fatcode;
    boolean lineDebugInfo;
    Position.LineMap lineMap;
    LocalVar[] lvar;
    final Symbol.MethodSymbol meth;
    public final boolean needStackMap;
    final Pool pool;
    StackMapFormat stackMap;
    State state;
    final Symtab syms;
    final Types types;
    LocalVar[] varBuffer;
    int varBufferSize;
    boolean varDebugInfo;
    public int max_stack = 0;
    public int max_locals = 0;
    public byte[] code = new byte[64];

    public int f433cp = 0;
    ListBuffer<char[]> catchInfo = new ListBuffer<>();
    List<char[]> lineInfo = List.m507nil();
    private boolean alive = true;
    private boolean fixedPc = false;
    public int nextreg = 0;
    Chain pendingJumps = null;
    int pendingStatPos = -1;
    boolean pendingStackMap = false;
    StackMapFrame[] stackMapBuffer = null;
    ClassWriter.StackMapTableFrame[] stackMapTableBuffer = null;
    int stackMapBufferSize = 0;
    int lastStackMapPC = -1;
    StackMapFrame lastFrame = null;
    StackMapFrame frameBeforeLast = null;

    public enum StackMapFormat {
        NONE,
        CLDC {
            @Override
            Name getAttributeName(Names names) {
                return names.StackMap;
            }
        },
        JSR202 {
            @Override
            Name getAttributeName(Names names) {
                return names.StackMapTable;
            }
        };

        StackMapFormat(C06751 x2) {
            this();
        }

        Name getAttributeName(Names names) {
            return names.empty;
        }
    }

    public boolean checkLimits(JCDiagnostic.DiagnosticPosition pos, Log log) {
        if (this.f433cp > 65535) {
            log.error(pos, "limit.code", new Object[0]);
            return true;
        }
        if (this.max_locals > 65535) {
            log.error(pos, "limit.locals", new Object[0]);
            return true;
        }
        if (this.max_stack <= 65535) {
            return false;
        }
        log.error(pos, "limit.stack", new Object[0]);
        return true;
    }

    public Code(Symbol.MethodSymbol meth, boolean fatcode, Position.LineMap lineMap, boolean varDebugInfo, StackMapFormat stackMap, boolean debugCode, CRTable crt, Symtab syms, Types types, Pool pool) {
        this.meth = meth;
        this.fatcode = fatcode;
        this.lineMap = lineMap;
        this.lineDebugInfo = lineMap != null;
        this.varDebugInfo = varDebugInfo;
        this.f434crt = crt;
        this.syms = syms;
        this.types = types;
        this.debugCode = debugCode;
        this.stackMap = stackMap;
        int i = C06751.f435x81e00a58[stackMap.ordinal()];
        if (i == 1 || i == 2) {
            this.needStackMap = true;
        } else {
            this.needStackMap = false;
        }
        this.state = new State();
        this.lvar = new LocalVar[20];
        this.pool = pool;
    }

    static class C06751 {

        static final int[] f435x81e00a58;

        static {
            int[] iArr = new int[StackMapFormat.values().length];
            f435x81e00a58 = iArr;
            try {
                iArr[StackMapFormat.CLDC.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f435x81e00a58[StackMapFormat.JSR202.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    public static int typecode(Type type) {
        int i = type.f344tag;
        if (i != 14 && i != 17 && i != 22 && i != 23) {
            switch (i) {
                case 1:
                    return 5;
                case 2:
                    return 6;
                case 3:
                    return 7;
                case 4:
                    return 0;
                case 5:
                    return 1;
                case 6:
                    return 2;
                case 7:
                    return 3;
                case 8:
                    return 5;
                case 9:
                    return 8;
                case 10:
                case 11:
                case 12:
                    return 4;
                default:
                    throw new AssertionError("typecode " + type.f344tag);
            }
        }
        return 4;
    }

    public static int truncate(int tc) {
        if (tc == 5 || tc == 6 || tc == 7) {
            return 0;
        }
        return tc;
    }

    public static int width(int typecode) {
        if (typecode == 1 || typecode == 3) {
            return 2;
        }
        if (typecode != 8) {
            return 1;
        }
        return 0;
    }

    public static int width(Type type) {
        if (type == null) {
            return 1;
        }
        return width(typecode(type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int width(List<Type> types) {
        int w = 0;
        for (List list = types; list.nonEmpty(); list = list.tail) {
            w += width((Type) list.head);
        }
        return w;
    }

    public static int arraycode(Type type) {
        switch (type.f344tag) {
            case 1:
                return 8;
            case 2:
                return 5;
            case 3:
                return 9;
            case 4:
                return 10;
            case 5:
                return 11;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 4;
            case 9:
            default:
                throw new AssertionError("arraycode " + type);
            case 10:
                return 0;
            case 11:
                return 1;
        }
    }

    public int curPc() {
        if (this.pendingJumps != null) {
            resolvePending();
        }
        if (this.pendingStatPos != -1) {
            markStatBegin();
        }
        this.fixedPc = true;
        return this.f433cp;
    }

    private void emit1(int od) {
        if (this.alive) {
            int i = this.f433cp;
            byte[] bArr = this.code;
            if (i == bArr.length) {
                byte[] newcode = new byte[i * 2];
                System.arraycopy(bArr, 0, newcode, 0, i);
                this.code = newcode;
            }
            byte[] bArr2 = this.code;
            int i2 = this.f433cp;
            this.f433cp = i2 + 1;
            bArr2[i2] = (byte) od;
        }
    }

    private void emit2(int od) {
        if (this.alive) {
            int i = this.f433cp;
            int i2 = i + 2;
            byte[] bArr = this.code;
            if (i2 > bArr.length) {
                emit1(od >> 8);
                emit1(od);
                return;
            }
            int i3 = i + 1;
            this.f433cp = i3;
            bArr[i] = (byte) (od >> 8);
            this.f433cp = i3 + 1;
            bArr[i3] = (byte) od;
        }
    }

    public void emit4(int od) {
        if (this.alive) {
            int i = this.f433cp;
            int i2 = i + 4;
            byte[] bArr = this.code;
            if (i2 > bArr.length) {
                emit1(od >> 24);
                emit1(od >> 16);
                emit1(od >> 8);
                emit1(od);
                return;
            }
            int i3 = i + 1;
            this.f433cp = i3;
            bArr[i] = (byte) (od >> 24);
            int i4 = i3 + 1;
            this.f433cp = i4;
            bArr[i3] = (byte) (od >> 16);
            int i5 = i4 + 1;
            this.f433cp = i5;
            bArr[i4] = (byte) (od >> 8);
            this.f433cp = i5 + 1;
            bArr[i5] = (byte) od;
        }
    }

    private void emitop(int op) {
        if (this.pendingJumps != null) {
            resolvePending();
        }
        if (this.alive) {
            if (this.pendingStatPos != -1) {
                markStatBegin();
            }
            if (this.pendingStackMap) {
                this.pendingStackMap = false;
                emitStackMap();
            }
            if (this.debugCode) {
                System.err.println("emit@" + this.f433cp + " stack=" + this.state.stacksize + ": " + mnem(op));
            }
            emit1(op);
        }
    }

    void postop() {
        Assert.check(this.alive || this.state.stacksize == 0);
    }

    public void emitMultianewarray(int ndims, int type, Type arrayType) {
        emitop(ByteCodes.multianewarray);
        if (this.alive) {
            emit2(type);
            emit1(ndims);
            this.state.m472pop(ndims);
            this.state.push(arrayType);
        }
    }

    public void emitNewarray(int elemcode, Type arrayType) {
        emitop(ByteCodes.newarray);
        if (this.alive) {
            emit1(elemcode);
            this.state.m472pop(1);
            this.state.push(arrayType);
        }
    }

    public void emitAnewarray(int od, Type arrayType) {
        emitop(ByteCodes.anewarray);
        if (this.alive) {
            emit2(od);
            this.state.m472pop(1);
            this.state.push(arrayType);
        }
    }

    public void emitInvokeinterface(int meth, Type mtype) {
        int argsize = width(mtype.mo573getParameterTypes());
        emitop(ByteCodes.invokeinterface);
        if (this.alive) {
            emit2(meth);
            emit1(argsize + 1);
            emit1(0);
            this.state.m472pop(argsize + 1);
            this.state.push(mtype.mo574getReturnType());
        }
    }

    public void emitInvokespecial(int meth, Type mtype) {
        int argsize = width(mtype.mo573getParameterTypes());
        emitop(ByteCodes.invokespecial);
        if (this.alive) {
            emit2(meth);
            Symbol sym = (Symbol) this.pool.pool[meth];
            this.state.m472pop(argsize);
            if (sym.isConstructor()) {
                State state = this.state;
                state.markInitialized((UninitializedType) state.peek());
            }
            this.state.m472pop(1);
            this.state.push(mtype.mo574getReturnType());
        }
    }

    public void emitInvokestatic(int meth, Type mtype) {
        int argsize = width(mtype.mo573getParameterTypes());
        emitop(ByteCodes.invokestatic);
        if (this.alive) {
            emit2(meth);
            this.state.m472pop(argsize);
            this.state.push(mtype.mo574getReturnType());
        }
    }

    public void emitInvokevirtual(int meth, Type mtype) {
        int argsize = width(mtype.mo573getParameterTypes());
        emitop(ByteCodes.invokevirtual);
        if (this.alive) {
            emit2(meth);
            this.state.m472pop(argsize + 1);
            this.state.push(mtype.mo574getReturnType());
        }
    }

    public void emitInvokedynamic(int desc, Type mtype) {
        int argsize = width(mtype.mo573getParameterTypes());
        emitop(ByteCodes.invokedynamic);
        if (this.alive) {
            emit2(desc);
            emit2(0);
            this.state.m472pop(argsize);
            this.state.push(mtype.mo574getReturnType());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:106:0x044b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0455  */
    /* JADX WARN: Code duplicated, block: B:108:0x045f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0469  */
    public void emitop0(int op) {
        Type stackType;
        emitop(op);
        if (this.alive) {
            if (op == 167) {
                markDead();
            } else if (op == 190) {
                this.state.m472pop(1);
                this.state.push(this.syms.intType);
            } else if (op != 191) {
                switch (op) {
                    case 0:
                        break;
                    case 1:
                        this.state.push(this.syms.botType);
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        this.state.push(this.syms.intType);
                        break;
                    case 9:
                    case 10:
                        this.state.push(this.syms.longType);
                        break;
                    case 11:
                    case 12:
                    case 13:
                        this.state.push(this.syms.floatType);
                        break;
                    case 14:
                    case 15:
                        this.state.push(this.syms.doubleType);
                        break;
                    default:
                        switch (op) {
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                                this.state.push(this.syms.intType);
                                break;
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                                this.state.push(this.syms.longType);
                                break;
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                                this.state.push(this.syms.floatType);
                                break;
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                                this.state.push(this.syms.doubleType);
                                break;
                            case 42:
                                this.state.push(this.lvar[0].f438sym.type);
                                break;
                            case 43:
                                this.state.push(this.lvar[1].f438sym.type);
                                break;
                            case 44:
                                this.state.push(this.lvar[2].f438sym.type);
                                break;
                            case 45:
                                this.state.push(this.lvar[3].f438sym.type);
                                break;
                            case 46:
                            case 51:
                            case 52:
                            case 53:
                                this.state.m472pop(2);
                                this.state.push(this.syms.intType);
                                break;
                            case 47:
                                this.state.m472pop(2);
                                this.state.push(this.syms.longType);
                                break;
                            case 48:
                                this.state.m472pop(2);
                                this.state.push(this.syms.floatType);
                                break;
                            case 49:
                                this.state.m472pop(2);
                                this.state.push(this.syms.doubleType);
                                break;
                            case 50:
                                this.state.m472pop(1);
                                Type a = this.state.stack[this.state.stacksize - 1];
                                this.state.m472pop(1);
                                if (a.f344tag == 17) {
                                    stackType = this.syms.objectType;
                                } else {
                                    Types types = this.types;
                                    stackType = types.erasure(types.elemtype(a));
                                }
                                this.state.push(stackType);
                                break;
                            default:
                                switch (op) {
                                    case 59:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 75:
                                    case 76:
                                    case 77:
                                    case 78:
                                    case 87:
                                    case ByteCodes.lshl:
                                    case ByteCodes.lshr:
                                    case ByteCodes.lushr:
                                        this.state.m472pop(1);
                                        break;
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 88:
                                        this.state.m472pop(2);
                                        break;
                                    case ByteCodes.iastore:
                                    case ByteCodes.fastore:
                                    case 85:
                                    case 86:
                                        this.state.m472pop(3);
                                        break;
                                    case ByteCodes.lastore:
                                    case ByteCodes.dastore:
                                        this.state.m472pop(4);
                                        break;
                                    case ByteCodes.aastore:
                                        this.state.m472pop(3);
                                        break;
                                    case ByteCodes.bastore:
                                        this.state.m472pop(3);
                                        break;
                                    case 89:
                                        State state = this.state;
                                        state.push(state.stack[this.state.stacksize - 1]);
                                        break;
                                    case 90:
                                        Type val1 = this.state.pop1();
                                        Type val2 = this.state.pop1();
                                        this.state.push(val1);
                                        this.state.push(val2);
                                        this.state.push(val1);
                                        break;
                                    case 91:
                                        Type value1 = this.state.pop1();
                                        if (this.state.stack[this.state.stacksize - 1] != null) {
                                            Type value2 = this.state.pop1();
                                            Type value3 = this.state.pop1();
                                            this.state.push(value1);
                                            this.state.push(value3);
                                            this.state.push(value2);
                                            this.state.push(value1);
                                        } else {
                                            Type value4 = this.state.pop2();
                                            this.state.push(value1);
                                            this.state.push(value4);
                                            this.state.push(value1);
                                        }
                                        break;
                                    case 92:
                                        if (this.state.stack[this.state.stacksize - 1] != null) {
                                            Type value5 = this.state.pop1();
                                            Type value6 = this.state.pop1();
                                            this.state.push(value6);
                                            this.state.push(value5);
                                            this.state.push(value6);
                                            this.state.push(value5);
                                        } else {
                                            Type value = this.state.pop2();
                                            this.state.push(value);
                                            this.state.push(value);
                                        }
                                        break;
                                    case 93:
                                        if (this.state.stack[this.state.stacksize - 1] != null) {
                                            Type value7 = this.state.pop1();
                                            Type value8 = this.state.pop1();
                                            Type value9 = this.state.pop1();
                                            this.state.push(value8);
                                            this.state.push(value7);
                                            this.state.push(value9);
                                            this.state.push(value8);
                                            this.state.push(value7);
                                        } else {
                                            Type value10 = this.state.pop2();
                                            Type value11 = this.state.pop1();
                                            this.state.push(value10);
                                            this.state.push(value11);
                                            this.state.push(value10);
                                        }
                                        break;
                                    case ByteCodes.dup2_x2:
                                        if (this.state.stack[this.state.stacksize - 1] != null) {
                                            Type value12 = this.state.pop1();
                                            Type value13 = this.state.pop1();
                                            if (this.state.stack[this.state.stacksize - 1] != null) {
                                                Type value14 = this.state.pop1();
                                                Type value15 = this.state.pop1();
                                                this.state.push(value13);
                                                this.state.push(value12);
                                                this.state.push(value15);
                                                this.state.push(value14);
                                                this.state.push(value13);
                                                this.state.push(value12);
                                            } else {
                                                Type value16 = this.state.pop2();
                                                this.state.push(value13);
                                                this.state.push(value12);
                                                this.state.push(value16);
                                                this.state.push(value13);
                                                this.state.push(value12);
                                            }
                                        } else {
                                            Type value17 = this.state.pop2();
                                            if (this.state.stack[this.state.stacksize - 1] != null) {
                                                Type value18 = this.state.pop1();
                                                Type value19 = this.state.pop1();
                                                this.state.push(value17);
                                                this.state.push(value19);
                                                this.state.push(value18);
                                                this.state.push(value17);
                                            } else {
                                                Type value20 = this.state.pop2();
                                                this.state.push(value17);
                                                this.state.push(value20);
                                                this.state.push(value17);
                                            }
                                        }
                                        break;
                                    case ByteCodes.swap:
                                        Type value21 = this.state.pop1();
                                        Type value22 = this.state.pop1();
                                        this.state.push(value21);
                                        this.state.push(value22);
                                        break;
                                    case ByteCodes.iadd:
                                    case ByteCodes.isub:
                                    case ByteCodes.imul:
                                    case ByteCodes.idiv:
                                    case ByteCodes.imod:
                                    case ByteCodes.ishl:
                                    case ByteCodes.ishr:
                                    case ByteCodes.iushr:
                                    case ByteCodes.iand:
                                    case 128:
                                    case ByteCodes.ixor:
                                        this.state.m472pop(1);
                                        break;
                                    case ByteCodes.ladd:
                                    case ByteCodes.lsub:
                                    case ByteCodes.lmul:
                                    case ByteCodes.ldiv:
                                    case ByteCodes.lmod:
                                    case 127:
                                    case ByteCodes.f416lor:
                                    case ByteCodes.lxor:
                                        this.state.m472pop(2);
                                        break;
                                    case ByteCodes.fadd:
                                    case ByteCodes.fsub:
                                    case ByteCodes.fmul:
                                    case ByteCodes.fdiv:
                                    case ByteCodes.fmod:
                                        this.state.m472pop(1);
                                        break;
                                    case ByteCodes.dadd:
                                    case ByteCodes.dsub:
                                    case ByteCodes.dmul:
                                    case ByteCodes.ddiv:
                                    case ByteCodes.dmod:
                                        this.state.m472pop(2);
                                        break;
                                    case ByteCodes.ineg:
                                    case ByteCodes.lneg:
                                    case ByteCodes.fneg:
                                    case ByteCodes.dneg:
                                        break;
                                    default:
                                        switch (op) {
                                            case ByteCodes.f410i2l:
                                                this.state.m472pop(1);
                                                this.state.push(this.syms.longType);
                                                break;
                                            case ByteCodes.f409i2f:
                                                this.state.m472pop(1);
                                                this.state.push(this.syms.floatType);
                                                break;
                                            case ByteCodes.f408i2d:
                                                this.state.m472pop(1);
                                                this.state.push(this.syms.doubleType);
                                                break;
                                            case ByteCodes.f415l2i:
                                                this.state.m472pop(2);
                                                this.state.push(this.syms.intType);
                                                break;
                                            case ByteCodes.f414l2f:
                                                this.state.m472pop(2);
                                                this.state.push(this.syms.floatType);
                                                break;
                                            case ByteCodes.f413l2d:
                                                this.state.m472pop(2);
                                                this.state.push(this.syms.doubleType);
                                                break;
                                            case ByteCodes.f406f2i:
                                                this.state.m472pop(1);
                                                this.state.push(this.syms.intType);
                                                break;
                                            case ByteCodes.f407f2l:
                                                this.state.m472pop(1);
                                                this.state.push(this.syms.longType);
                                                break;
                                            case ByteCodes.f405f2d:
                                                this.state.m472pop(1);
                                                this.state.push(this.syms.doubleType);
                                                break;
                                            case ByteCodes.f402d2i:
                                                this.state.m472pop(2);
                                                this.state.push(this.syms.intType);
                                                break;
                                            case ByteCodes.f403d2l:
                                                this.state.m472pop(2);
                                                this.state.push(this.syms.longType);
                                                break;
                                            case ByteCodes.f401d2f:
                                                this.state.m472pop(2);
                                                this.state.push(this.syms.floatType);
                                                break;
                                            case ByteCodes.int2byte:
                                            case ByteCodes.int2char:
                                            case ByteCodes.int2short:
                                                break;
                                            case ByteCodes.lcmp:
                                                this.state.m472pop(4);
                                                this.state.push(this.syms.intType);
                                                break;
                                            case ByteCodes.fcmpl:
                                            case ByteCodes.fcmpg:
                                                this.state.m472pop(2);
                                                this.state.push(this.syms.intType);
                                                break;
                                            case ByteCodes.dcmpl:
                                            case ByteCodes.dcmpg:
                                                this.state.m472pop(4);
                                                this.state.push(this.syms.intType);
                                                break;
                                            default:
                                                switch (op) {
                                                    case ByteCodes.f419ret:
                                                        markDead();
                                                        break;
                                                    case ByteCodes.tableswitch:
                                                    case ByteCodes.lookupswitch:
                                                        this.state.m472pop(1);
                                                        break;
                                                    case ByteCodes.ireturn:
                                                    case ByteCodes.freturn:
                                                    case ByteCodes.areturn:
                                                        Assert.check(this.state.nlocks == 0);
                                                        this.state.m472pop(1);
                                                        markDead();
                                                        break;
                                                    case ByteCodes.lreturn:
                                                    case ByteCodes.dreturn:
                                                        Assert.check(this.state.nlocks == 0);
                                                        this.state.m472pop(2);
                                                        markDead();
                                                        break;
                                                    case ByteCodes.return_:
                                                        Assert.check(this.state.nlocks == 0);
                                                        markDead();
                                                        break;
                                                    default:
                                                        switch (op) {
                                                            case ByteCodes.monitorenter:
                                                            case ByteCodes.monitorexit:
                                                                this.state.m472pop(1);
                                                                break;
                                                            case ByteCodes.wide:
                                                                return;
                                                            default:
                                                                throw new AssertionError(mnem(op));
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                this.state.m472pop(1);
                markDead();
            }
            postop();
        }
    }

    public void emitop1(int op, int od) {
        emitop(op);
        if (this.alive) {
            emit1(od);
            if (op == 16) {
                this.state.push(this.syms.intType);
            } else if (op == 18) {
                this.state.push(typeForPool(this.pool.pool[od]));
            } else {
                throw new AssertionError(mnem(op));
            }
            postop();
        }
    }

    private Type typeForPool(Object o) {
        if (o instanceof Integer) {
            return this.syms.intType;
        }
        if (o instanceof Float) {
            return this.syms.floatType;
        }
        if (o instanceof String) {
            return this.syms.stringType;
        }
        if (o instanceof Long) {
            return this.syms.longType;
        }
        if (o instanceof Double) {
            return this.syms.doubleType;
        }
        if (!(o instanceof Symbol.ClassSymbol) && !(o instanceof Type.ArrayType)) {
            throw new AssertionError(o);
        }
        return this.syms.classType;
    }

    public void emitop1w(int op, int od) {
        if (od > 255) {
            emitop(ByteCodes.wide);
            emitop(op);
            emit2(od);
        } else {
            emitop(op);
            emit1(od);
        }
        if (this.alive) {
            if (op != 169) {
                switch (op) {
                    case 21:
                        this.state.push(this.syms.intType);
                        break;
                    case 22:
                        this.state.push(this.syms.longType);
                        break;
                    case 23:
                        this.state.push(this.syms.floatType);
                        break;
                    case 24:
                        this.state.push(this.syms.doubleType);
                        break;
                    case 25:
                        this.state.push(this.lvar[od].f438sym.type);
                        break;
                    default:
                        switch (op) {
                            case 54:
                            case 56:
                            case 58:
                                this.state.m472pop(1);
                                break;
                            case 55:
                            case 57:
                                this.state.m472pop(2);
                                break;
                            default:
                                throw new AssertionError(mnem(op));
                        }
                        break;
                }
            } else {
                markDead();
            }
            postop();
        }
    }

    public void emitop1w(int op, int od1, int od2) {
        if (od1 > 255 || od2 < -128 || od2 > 127) {
            emitop(ByteCodes.wide);
            emitop(op);
            emit2(od1);
            emit2(od2);
        } else {
            emitop(op);
            emit1(od1);
            emit1(od2);
        }
        if (this.alive && op != 132) {
            throw new AssertionError(mnem(op));
        }
    }

    public void emitop2(int op, int od) {
        Type t;
        emitop(op);
        if (this.alive) {
            emit2(od);
            if (op == 17) {
                this.state.push(this.syms.intType);
                return;
            }
            if (op == 187) {
                this.state.push(UninitializedType.uninitializedObject(((Symbol) this.pool.pool[od]).erasure(this.types), this.f433cp - 3));
                return;
            }
            if (op == 19) {
                this.state.push(typeForPool(this.pool.pool[od]));
                return;
            }
            if (op == 20) {
                this.state.push(typeForPool(this.pool.pool[od]));
                return;
            }
            if (op == 192) {
                this.state.m472pop(1);
                Object o = this.pool.pool[od];
                if (o instanceof Symbol) {
                    t = ((Symbol) o).erasure(this.types);
                } else {
                    t = this.types.erasure((Type) o);
                }
                this.state.push(t);
                return;
            }
            if (op != 193) {
                if (op != 198 && op != 199) {
                    switch (op) {
                        case ByteCodes.ifeq:
                        case ByteCodes.ifne:
                        case ByteCodes.iflt:
                        case ByteCodes.ifge:
                        case ByteCodes.ifgt:
                        case ByteCodes.ifle:
                            break;
                        case ByteCodes.if_icmpeq:
                        case ByteCodes.if_icmpne:
                        case ByteCodes.if_icmplt:
                        case ByteCodes.if_icmpge:
                        case ByteCodes.if_icmpgt:
                        case ByteCodes.if_icmple:
                        case ByteCodes.if_acmpeq:
                        case ByteCodes.if_acmpne:
                            this.state.m472pop(2);
                            return;
                        case ByteCodes.goto_:
                            markDead();
                            return;
                        case 168:
                            return;
                        default:
                            switch (op) {
                                case ByteCodes.getstatic:
                                    this.state.push(((Symbol) this.pool.pool[od]).erasure(this.types));
                                    return;
                                case ByteCodes.putstatic:
                                    this.state.m473pop(((Symbol) this.pool.pool[od]).erasure(this.types));
                                    return;
                                case ByteCodes.getfield:
                                    this.state.m472pop(1);
                                    this.state.push(((Symbol) this.pool.pool[od]).erasure(this.types));
                                    return;
                                case ByteCodes.putfield:
                                    this.state.m473pop(((Symbol) this.pool.pool[od]).erasure(this.types));
                                    this.state.m472pop(1);
                                    return;
                                default:
                                    throw new AssertionError(mnem(op));
                            }
                    }
                }
                this.state.m472pop(1);
                return;
            }
            this.state.m472pop(1);
            this.state.push(this.syms.intType);
        }
    }

    public void emitop4(int op, int od) {
        emitop(op);
        if (this.alive) {
            emit4(od);
            if (op == 200) {
                markDead();
            } else if (op != 201) {
                throw new AssertionError(mnem(op));
            }
        }
    }

    public void align(int incr) {
        if (this.alive) {
            while (this.f433cp % incr != 0) {
                emitop0(0);
            }
        }
    }

    private void put1(int pc, int op) {
        this.code[pc] = (byte) op;
    }

    private void put2(int pc, int od) {
        put1(pc, od >> 8);
        put1(pc + 1, od);
    }

    public void put4(int pc, int od) {
        put1(pc, od >> 24);
        put1(pc + 1, od >> 16);
        put1(pc + 2, od >> 8);
        put1(pc + 3, od);
    }

    private int get1(int pc) {
        return this.code[pc] & UnsignedBytes.MAX_VALUE;
    }

    private int get2(int pc) {
        return (get1(pc) << 8) | get1(pc + 1);
    }

    public int get4(int pc) {
        return (get1(pc) << 24) | (get1(pc + 1) << 16) | (get1(pc + 2) << 8) | get1(pc + 3);
    }

    public boolean isAlive() {
        return this.alive || this.pendingJumps != null;
    }

    public void markDead() {
        this.alive = false;
    }

    public int entryPoint() {
        int pc = curPc();
        this.alive = true;
        this.pendingStackMap = this.needStackMap;
        return pc;
    }

    public int entryPoint(State state) {
        int pc = curPc();
        this.alive = true;
        this.state = state.m471dup();
        Assert.check(state.stacksize <= this.max_stack);
        if (this.debugCode) {
            System.err.println("entry point " + state);
        }
        this.pendingStackMap = this.needStackMap;
        return pc;
    }

    public int entryPoint(State state, Type pushed) {
        int pc = curPc();
        this.alive = true;
        this.state = state.m471dup();
        Assert.check(state.stacksize <= this.max_stack);
        this.state.push(pushed);
        if (this.debugCode) {
            System.err.println("entry point " + state);
        }
        this.pendingStackMap = this.needStackMap;
        return pc;
    }

    static class StackMapFrame {
        Type[] locals;

        int f439pc;
        Type[] stack;

        StackMapFrame() {
        }
    }

    public void emitStackMap() {
        int pc = curPc();
        if (this.needStackMap) {
            int i = C06751.f435x81e00a58[this.stackMap.ordinal()];
            if (i == 1) {
                emitCLDCStackMap(pc, getLocalsSize());
            } else if (i == 2) {
                emitStackMapFrame(pc, getLocalsSize());
            } else {
                throw new AssertionError("Should have chosen a stackmap format");
            }
            if (this.debugCode) {
                this.state.dump(pc);
            }
        }
    }

    private int getLocalsSize() {
        for (int i = this.max_locals - 1; i >= 0; i--) {
            if (this.state.defined.isMember(i)) {
                LocalVar[] localVarArr = this.lvar;
                if (localVarArr[i] != null) {
                    int nextLocal = i + width(localVarArr[i].f438sym.erasure(this.types));
                    return nextLocal;
                }
            }
        }
        return 0;
    }

    void emitCLDCStackMap(int pc, int localsSize) {
        if (this.lastStackMapPC == pc) {
            StackMapFrame[] stackMapFrameArr = this.stackMapBuffer;
            int i = this.stackMapBufferSize - 1;
            this.stackMapBufferSize = i;
            stackMapFrameArr[i] = null;
        }
        this.lastStackMapPC = pc;
        StackMapFrame[] stackMapFrameArr2 = this.stackMapBuffer;
        if (stackMapFrameArr2 == null) {
            this.stackMapBuffer = new StackMapFrame[20];
        } else {
            int length = stackMapFrameArr2.length;
            int i2 = this.stackMapBufferSize;
            if (length == i2) {
                StackMapFrame[] newStackMapBuffer = new StackMapFrame[i2 << 1];
                System.arraycopy(stackMapFrameArr2, 0, newStackMapBuffer, 0, i2);
                this.stackMapBuffer = newStackMapBuffer;
            }
        }
        StackMapFrame[] stackMapFrameArr3 = this.stackMapBuffer;
        int i3 = this.stackMapBufferSize;
        this.stackMapBufferSize = i3 + 1;
        StackMapFrame frame = new StackMapFrame();
        stackMapFrameArr3[i3] = frame;
        frame.f439pc = pc;
        frame.locals = new Type[localsSize];
        for (int i4 = 0; i4 < localsSize; i4++) {
            if (this.state.defined.isMember(i4)) {
                LocalVar[] localVarArr = this.lvar;
                if (localVarArr[i4] != null) {
                    Type vtype = localVarArr[i4].f438sym.type;
                    if (!(vtype instanceof UninitializedType)) {
                        vtype = this.types.erasure(vtype);
                    }
                    frame.locals[i4] = vtype;
                }
            }
        }
        frame.stack = new Type[this.state.stacksize];
        for (int i5 = 0; i5 < this.state.stacksize; i5++) {
            frame.stack[i5] = this.state.stack[i5];
        }
    }

    void emitStackMapFrame(int pc, int localsSize) {
        StackMapFrame stackMapFrame = this.lastFrame;
        if (stackMapFrame == null) {
            this.lastFrame = getInitialFrame();
        } else if (stackMapFrame.f439pc == pc) {
            ClassWriter.StackMapTableFrame[] stackMapTableFrameArr = this.stackMapTableBuffer;
            int i = this.stackMapBufferSize - 1;
            this.stackMapBufferSize = i;
            stackMapTableFrameArr[i] = null;
            this.lastFrame = this.frameBeforeLast;
            this.frameBeforeLast = null;
        }
        StackMapFrame frame = new StackMapFrame();
        frame.f439pc = pc;
        int localCount = 0;
        Type[] locals = new Type[localsSize];
        int i2 = 0;
        while (i2 < localsSize) {
            if (this.state.defined.isMember(i2)) {
                LocalVar[] localVarArr = this.lvar;
                if (localVarArr[i2] != null) {
                    Type vtype = localVarArr[i2].f438sym.type;
                    if (!(vtype instanceof UninitializedType)) {
                        vtype = this.types.erasure(vtype);
                    }
                    locals[i2] = vtype;
                    if (width(vtype) > 1) {
                        i2++;
                    }
                }
            }
            i2++;
            localCount++;
        }
        frame.locals = new Type[localCount];
        int i3 = 0;
        int j = 0;
        while (true) {
            if (i3 >= localsSize) {
                break;
            }
            Assert.check(j < localCount);
            frame.locals[j] = locals[i3];
            if (width(locals[i3]) > 1) {
                i3++;
            }
            i3++;
            j++;
        }
        int stackCount = 0;
        for (int i4 = 0; i4 < this.state.stacksize; i4++) {
            if (this.state.stack[i4] != null) {
                stackCount++;
            }
        }
        frame.stack = new Type[stackCount];
        int stackCount2 = 0;
        for (int i5 = 0; i5 < this.state.stacksize; i5++) {
            if (this.state.stack[i5] != null) {
                frame.stack[stackCount2] = this.types.erasure(this.state.stack[i5]);
                stackCount2++;
            }
        }
        ClassWriter.StackMapTableFrame[] stackMapTableFrameArr2 = this.stackMapTableBuffer;
        if (stackMapTableFrameArr2 == null) {
            this.stackMapTableBuffer = new ClassWriter.StackMapTableFrame[20];
        } else {
            int length = stackMapTableFrameArr2.length;
            int i6 = this.stackMapBufferSize;
            if (length == i6) {
                ClassWriter.StackMapTableFrame[] newStackMapTableBuffer = new ClassWriter.StackMapTableFrame[i6 << 1];
                System.arraycopy(stackMapTableFrameArr2, 0, newStackMapTableBuffer, 0, i6);
                this.stackMapTableBuffer = newStackMapTableBuffer;
            }
        }
        ClassWriter.StackMapTableFrame[] stackMapTableFrameArr3 = this.stackMapTableBuffer;
        int i7 = this.stackMapBufferSize;
        this.stackMapBufferSize = i7 + 1;
        stackMapTableFrameArr3[i7] = ClassWriter.StackMapTableFrame.getInstance(frame, this.lastFrame.f439pc, this.lastFrame.locals, this.types);
        this.frameBeforeLast = this.lastFrame;
        this.lastFrame = frame;
    }

    StackMapFrame getInitialFrame() {
        StackMapFrame frame = new StackMapFrame();
        List<Type> arg_types = ((Type.MethodType) this.meth.externalType(this.types)).argtypes;
        int len = arg_types.length();
        int count = 0;
        if (!this.meth.isStatic()) {
            Type thisType = this.meth.owner.type;
            frame.locals = new Type[len + 1];
            if (!this.meth.isConstructor() || thisType == this.syms.objectType) {
                int count2 = 0 + 1;
                frame.locals[0] = this.types.erasure(thisType);
                count = count2;
            } else {
                int count3 = 0 + 1;
                frame.locals[0] = UninitializedType.uninitializedThis(thisType);
                count = count3;
            }
        } else {
            frame.locals = new Type[len];
        }
        for (Type arg_type : arg_types) {
            frame.locals[count] = this.types.erasure(arg_type);
            count++;
        }
        frame.f439pc = -1;
        frame.stack = null;
        return frame;
    }

    public static class Chain {
        public final Chain next;

        public final int f436pc;
        State state;

        public Chain(int pc, Chain next, State state) {
            this.f436pc = pc;
            this.next = next;
            this.state = state;
        }
    }

    public static int negate(int opcode) {
        if (opcode == 198) {
            return ByteCodes.if_acmp_nonnull;
        }
        return opcode == 199 ? ByteCodes.if_acmp_null : ((opcode + 1) ^ 1) - 1;
    }

    public int emitJump(int opcode) {
        if (this.fatcode) {
            if (opcode == 167 || opcode == 168) {
                emitop4((opcode + ByteCodes.goto_w) - ByteCodes.goto_, 0);
            } else {
                emitop2(negate(opcode), 8);
                emitop4(ByteCodes.goto_w, 0);
                this.alive = true;
                this.pendingStackMap = this.needStackMap;
            }
            return this.f433cp - 5;
        }
        emitop2(opcode, 0);
        return this.f433cp - 3;
    }

    public Chain branch(int opcode) {
        Chain result = null;
        if (opcode == 167) {
            result = this.pendingJumps;
            this.pendingJumps = null;
        }
        if (opcode != 168 && isAlive()) {
            result = new Chain(emitJump(opcode), result, this.state.m471dup());
            this.fixedPc = this.fatcode;
            if (opcode == 167) {
                this.alive = false;
            }
        }
        return result;
    }

    public void resolve(Chain chain, int target) {
        int i;
        boolean changed = false;
        State newState = this.state;
        while (true) {
            boolean z = false;
            if (chain == null) {
                break;
            }
            Assert.check(this.state != chain.state && (target > chain.f436pc || this.state.stacksize == 0));
            if (target >= this.f433cp) {
                target = this.f433cp;
            } else if (get1(target) == 167) {
                target = this.fatcode ? target + get4(target + 1) : target + get2(target + 1);
            }
            if (get1(chain.f436pc) == 167 && chain.f436pc + 3 == target && target == (i = this.f433cp) && !this.fixedPc) {
                this.f433cp = i - 3;
                target -= 3;
                if (chain.next == null) {
                    this.alive = true;
                    break;
                }
            } else {
                if (this.fatcode) {
                    put4(chain.f436pc + 1, target - chain.f436pc);
                } else if (target - chain.f436pc < -32768 || target - chain.f436pc > 32767) {
                    this.fatcode = true;
                } else {
                    put2(chain.f436pc + 1, target - chain.f436pc);
                }
                if (!this.alive || (chain.state.stacksize == newState.stacksize && chain.state.nlocks == newState.nlocks)) {
                    z = true;
                }
                Assert.check(z);
            }
            this.fixedPc = true;
            if (this.f433cp == target) {
                changed = true;
                if (this.debugCode) {
                    System.err.println("resolving chain state=" + chain.state);
                }
                if (this.alive) {
                    newState = chain.state.join(newState);
                } else {
                    newState = chain.state;
                    this.alive = true;
                }
            }
            chain = chain.next;
        }
        Assert.check((changed && this.state == newState) ? false : true);
        if (this.state != newState) {
            setDefined(newState.defined);
            this.state = newState;
            this.pendingStackMap = this.needStackMap;
        }
    }

    public void resolve(Chain chain) {
        Assert.check(!this.alive || chain == null || (this.state.stacksize == chain.state.stacksize && this.state.nlocks == chain.state.nlocks));
        this.pendingJumps = mergeChains(chain, this.pendingJumps);
    }

    public void resolvePending() {
        Chain x = this.pendingJumps;
        this.pendingJumps = null;
        resolve(x, this.f433cp);
    }

    public static Chain mergeChains(Chain chain1, Chain chain2) {
        if (chain2 == null) {
            return chain1;
        }
        if (chain1 == null) {
            return chain2;
        }
        Assert.check(chain1.state.stacksize == chain2.state.stacksize && chain1.state.nlocks == chain2.state.nlocks);
        if (chain1.f436pc < chain2.f436pc) {
            return new Chain(chain2.f436pc, mergeChains(chain1, chain2.next), chain2.state);
        }
        return new Chain(chain1.f436pc, mergeChains(chain1.next, chain2), chain1.state);
    }

    public void addCatch(char startPc, char endPc, char handlerPc, char catchType) {
        this.catchInfo.append(new char[]{startPc, endPc, handlerPc, catchType});
    }

    public void addLineNumber(char startPc, char lineNumber) {
        if (this.lineDebugInfo) {
            if (this.lineInfo.nonEmpty() && this.lineInfo.head[0] == startPc) {
                this.lineInfo = this.lineInfo.tail;
            }
            if (this.lineInfo.isEmpty() || this.lineInfo.head[1] != lineNumber) {
                this.lineInfo = this.lineInfo.prepend(new char[]{startPc, lineNumber});
            }
        }
    }

    public void statBegin(int pos) {
        if (pos != -1) {
            this.pendingStatPos = pos;
        }
    }

    public void markStatBegin() {
        if (this.alive && this.lineDebugInfo) {
            int line = this.lineMap.getLineNumber(this.pendingStatPos);
            int i = this.f433cp;
            char cp1 = (char) i;
            char line1 = (char) line;
            if (cp1 == i && line1 == line) {
                addLineNumber(cp1, line1);
            }
        }
        this.pendingStatPos = -1;
    }

    class State implements Cloneable {
        int[] locks;
        int nlocks;
        int stacksize;
        Bits defined = new Bits();
        Type[] stack = new Type[16];

        State() {
        }

        State m471dup() {
            try {
                State state = (State) super.clone();
                state.defined = this.defined.m499dup();
                state.stack = (Type[]) this.stack.clone();
                if (this.locks != null) {
                    state.locks = (int[]) this.locks.clone();
                }
                if (Code.this.debugCode) {
                    System.err.println("duping state " + this);
                    dump();
                }
                return state;
            } catch (CloneNotSupportedException ex) {
                throw new AssertionError(ex);
            }
        }

        void lock(int register) {
            int[] iArr = this.locks;
            if (iArr == null) {
                this.locks = new int[20];
            } else if (iArr.length == this.nlocks) {
                int[] newLocks = new int[iArr.length << 1];
                System.arraycopy(iArr, 0, newLocks, 0, iArr.length);
                this.locks = newLocks;
            }
            int[] iArr2 = this.locks;
            int i = this.nlocks;
            iArr2[i] = register;
            this.nlocks = i + 1;
        }

        void unlock(int register) {
            int i = this.nlocks - 1;
            this.nlocks = i;
            Assert.check(this.locks[i] == register);
            this.locks[this.nlocks] = -1;
        }

        void push(Type t) {
            if (Code.this.debugCode) {
                System.err.println("   pushing " + t);
            }
            int i = t.f344tag;
            if (i == 1 || i == 2 || i == 3 || i == 8) {
                t = Code.this.syms.intType;
            } else if (i == 9) {
                return;
            }
            int i2 = this.stacksize + 2;
            Type[] typeArr = this.stack;
            if (i2 >= typeArr.length) {
                Type[] newstack = new Type[typeArr.length * 2];
                System.arraycopy(typeArr, 0, newstack, 0, typeArr.length);
                this.stack = newstack;
            }
            Type[] newstack2 = this.stack;
            int i3 = this.stacksize;
            this.stacksize = i3 + 1;
            newstack2[i3] = t;
            int iWidth = Code.width(t);
            if (iWidth != 1) {
                if (iWidth == 2) {
                    Type[] typeArr2 = this.stack;
                    int i4 = this.stacksize;
                    this.stacksize = i4 + 1;
                    typeArr2[i4] = null;
                } else {
                    throw new AssertionError(t);
                }
            }
            if (this.stacksize > Code.this.max_stack) {
                Code.this.max_stack = this.stacksize;
            }
        }

        Type pop1() {
            if (Code.this.debugCode) {
                System.err.println("   popping 1");
            }
            int i = this.stacksize - 1;
            this.stacksize = i;
            Type[] typeArr = this.stack;
            Type result = typeArr[i];
            typeArr[i] = null;
            Assert.check(result != null && Code.width(result) == 1);
            return result;
        }

        Type peek() {
            return this.stack[this.stacksize - 1];
        }

        Type pop2() {
            if (Code.this.debugCode) {
                System.err.println("   popping 2");
            }
            int i = this.stacksize - 2;
            this.stacksize = i;
            Type[] typeArr = this.stack;
            Type result = typeArr[i];
            typeArr[i] = null;
            Assert.check(typeArr[i + 1] == null && result != null && Code.width(result) == 2);
            return result;
        }

        void m472pop(int n) {
            if (Code.this.debugCode) {
                System.err.println("   popping " + n);
            }
            while (n > 0) {
                Type[] typeArr = this.stack;
                int i = this.stacksize - 1;
                this.stacksize = i;
                typeArr[i] = null;
                n--;
            }
        }

        void m473pop(Type t) {
            m472pop(Code.width(t));
        }

        void forceStackTop(Type t) {
            if (Code.this.alive) {
                int i = t.f344tag;
                if (i == 10 || i == 11) {
                    int width = Code.width(t);
                    Type old = this.stack[this.stacksize - width];
                    Assert.check(Code.this.types.isSubtype(Code.this.types.erasure(old), Code.this.types.erasure(t)));
                    this.stack[this.stacksize - width] = t;
                }
            }
        }

        void markInitialized(UninitializedType old) {
            Type newtype = old.initializedType();
            for (int i = 0; i < this.stacksize; i++) {
                Type[] typeArr = this.stack;
                if (typeArr[i] == old) {
                    typeArr[i] = newtype;
                }
            }
            for (int i2 = 0; i2 < Code.this.lvar.length; i2++) {
                LocalVar lv = Code.this.lvar[i2];
                if (lv != null && lv.f438sym.type == old) {
                    Symbol.VarSymbol sym = lv.f438sym;
                    Symbol.VarSymbol sym2 = sym.clone(sym.owner);
                    sym2.type = newtype;
                    LocalVar[] localVarArr = Code.this.lvar;
                    LocalVar newlv = new LocalVar(sym2);
                    localVarArr[i2] = newlv;
                    newlv.start_pc = lv.start_pc;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0042  */
        State join(State other) {
            Type result;
            this.defined = this.defined.andSet(other.defined);
            Assert.check(this.stacksize == other.stacksize && this.nlocks == other.nlocks);
            int i = 0;
            while (i < this.stacksize) {
                Type t = this.stack[i];
                Type tother = other.stack[i];
                if (t != tother) {
                    if (Code.this.types.isSubtype(t, tother)) {
                        result = tother;
                    } else if (Code.this.types.isSubtype(tother, t)) {
                        result = t;
                    } else {
                        result = error();
                    }
                } else {
                    result = t;
                }
                int w = Code.width(result);
                Type[] typeArr = this.stack;
                typeArr[i] = result;
                if (w == 2) {
                    Assert.checkNull(typeArr[i + 1]);
                }
                i += w;
            }
            return this;
        }

        Type error() {
            throw new AssertionError("inconsistent stack types at join point");
        }

        void dump() {
            dump(-1);
        }

        void dump(int pc) {
            System.err.print("stackMap for " + Code.this.meth.owner + "." + Code.this.meth);
            if (pc == -1) {
                System.out.println();
            } else {
                System.out.println(" at " + pc);
            }
            System.err.println(" stack (from bottom):");
            for (int i = 0; i < this.stacksize; i++) {
                System.err.println("  " + i + ": " + this.stack[i]);
            }
            int lastLocal = 0;
            for (int i2 = Code.this.max_locals - 1; i2 >= 0; i2--) {
                if (this.defined.isMember(i2)) {
                    lastLocal = i2;
                    break;
                }
            }
            if (lastLocal >= 0) {
                System.err.println(" locals:");
            }
            for (int i3 = 0; i3 <= lastLocal; i3++) {
                System.err.print("  " + i3 + ": ");
                if (this.defined.isMember(i3)) {
                    LocalVar var = Code.this.lvar[i3];
                    if (var == null) {
                        System.err.println("(none)");
                    } else if (var.f438sym == null) {
                        System.err.println("UNKNOWN!");
                    } else {
                        System.err.println("" + var.f438sym + " of type " + var.f438sym.erasure(Code.this.types));
                    }
                } else {
                    System.err.println("undefined");
                }
            }
            int i4 = this.nlocks;
            if (i4 != 0) {
                System.err.print(" locks:");
                for (int i5 = 0; i5 < this.nlocks; i5++) {
                    System.err.print(" " + this.locks[i5]);
                }
                System.err.println();
            }
        }
    }

    static class LocalVar {

        final char f437reg;

        final Symbol.VarSymbol f438sym;
        char start_pc = 65535;
        char length = 65535;

        LocalVar(Symbol.VarSymbol v) {
            this.f438sym = v;
            this.f437reg = (char) v.f341adr;
        }

        public LocalVar m470dup() {
            return new LocalVar(this.f438sym);
        }

        public String toString() {
            return "" + this.f438sym + " in register " + ((int) this.f437reg) + " starts at pc=" + ((int) this.start_pc) + " length=" + ((int) this.length);
        }
    }

    private void addLocalVar(Symbol.VarSymbol v) {
        int adr = v.f341adr;
        int i = adr + 1;
        LocalVar[] localVarArr = this.lvar;
        if (i >= localVarArr.length) {
            int newlength = localVarArr.length << 1;
            if (newlength <= adr) {
                newlength = adr + 10;
            }
            LocalVar[] new_lvar = new LocalVar[newlength];
            LocalVar[] localVarArr2 = this.lvar;
            System.arraycopy(localVarArr2, 0, new_lvar, 0, localVarArr2.length);
            this.lvar = new_lvar;
        }
        Assert.checkNull(this.lvar[adr]);
        if (this.pendingJumps != null) {
            resolvePending();
        }
        this.lvar[adr] = new LocalVar(v);
        this.state.defined.excl(adr);
    }

    public void setDefined(Bits newDefined) {
        if (this.alive && newDefined != this.state.defined) {
            Bits diff = this.state.defined.m499dup().xorSet(newDefined);
            for (int adr = diff.nextBit(0); adr >= 0; adr = diff.nextBit(adr + 1)) {
                if (adr >= this.nextreg) {
                    this.state.defined.excl(adr);
                } else if (this.state.defined.isMember(adr)) {
                    setUndefined(adr);
                } else {
                    setDefined(adr);
                }
            }
        }
    }

    public void setDefined(int adr) {
        LocalVar v = this.lvar[adr];
        if (v == null) {
            this.state.defined.excl(adr);
            return;
        }
        this.state.defined.incl(adr);
        if (this.f433cp < 65535 && v.start_pc == 65535) {
            v.start_pc = (char) this.f433cp;
        }
    }

    public void setUndefined(int adr) {
        this.state.defined.excl(adr);
        LocalVar[] localVarArr = this.lvar;
        if (adr < localVarArr.length && localVarArr[adr] != null && localVarArr[adr].start_pc != 65535) {
            LocalVar v = this.lvar[adr];
            char length = (char) (curPc() - v.start_pc);
            if (length > 0 && length < 65535) {
                this.lvar[adr] = v.m470dup();
                v.length = length;
                putVar(v);
                return;
            }
            v.start_pc = (char) 65535;
        }
    }

    private void endScope(int adr) {
        char length;
        LocalVar[] localVarArr = this.lvar;
        LocalVar v = localVarArr[adr];
        if (v != null) {
            localVarArr[adr] = null;
            if (v.start_pc != 65535 && (length = (char) (curPc() - v.start_pc)) < 65535) {
                v.length = length;
                putVar(v);
            }
        }
        this.state.defined.excl(adr);
    }

    void putVar(LocalVar var) {
        if (this.varDebugInfo && (var.f438sym.flags() & 4096) == 0) {
            LocalVar[] localVarArr = this.varBuffer;
            if (localVarArr == null) {
                this.varBuffer = new LocalVar[20];
            } else {
                int i = this.varBufferSize;
                if (i >= localVarArr.length) {
                    LocalVar[] newVarBuffer = new LocalVar[i * 2];
                    System.arraycopy(localVarArr, 0, newVarBuffer, 0, localVarArr.length);
                    this.varBuffer = newVarBuffer;
                }
            }
            LocalVar[] localVarArr2 = this.varBuffer;
            int i2 = this.varBufferSize;
            this.varBufferSize = i2 + 1;
            localVarArr2[i2] = var;
        }
    }

    private int newLocal(int typecode) {
        int reg = this.nextreg;
        int w = width(typecode);
        int i = reg + w;
        this.nextreg = i;
        if (i > this.max_locals) {
            this.max_locals = i;
        }
        return reg;
    }

    private int newLocal(Type type) {
        return newLocal(typecode(type));
    }

    public int newLocal(Symbol.VarSymbol v) {
        int reg = newLocal(v.erasure(this.types));
        v.f341adr = reg;
        addLocalVar(v);
        return reg;
    }

    public void newRegSegment() {
        this.nextreg = this.max_locals;
    }

    public void endScopes(int first) {
        int prevNextReg = this.nextreg;
        this.nextreg = first;
        for (int i = this.nextreg; i < prevNextReg; i++) {
            endScope(i);
        }
    }

    public static String mnem(int opcode) {
        return Mneumonics.mnem[opcode];
    }

    private static class Mneumonics {
        private static final String[] mnem = {"nop", "aconst_null", "iconst_m1", "iconst_0", "iconst_1", "iconst_2", "iconst_3", "iconst_4", "iconst_5", "lconst_0", "lconst_1", "fconst_0", "fconst_1", "fconst_2", "dconst_0", "dconst_1", "bipush", "sipush", "ldc1", "ldc2", "ldc2w", "iload", "lload", "fload", "dload", "aload", "iload_0", "iload_1", "iload_2", "iload_3", "lload_0", "lload_1", "lload_2", "lload_3", "fload_0", "fload_1", "fload_2", "fload_3", "dload_0", "dload_1", "dload_2", "dload_3", "aload_0", "aload_1", "aload_2", "aload_3", "iaload", "laload", "faload", "daload", "aaload", "baload", "caload", "saload", "istore", "lstore", "fstore", "dstore", "astore", "istore_0", "istore_1", "istore_2", "istore_3", "lstore_0", "lstore_1", "lstore_2", "lstore_3", "fstore_0", "fstore_1", "fstore_2", "fstore_3", "dstore_0", "dstore_1", "dstore_2", "dstore_3", "astore_0", "astore_1", "astore_2", "astore_3", "iastore", "lastore", "fastore", "dastore", "aastore", "bastore", "castore", "sastore", "pop", "pop2", "dup", "dup_x1", "dup_x2", "dup2", "dup2_x1", "dup2_x2", "swap", "iadd", "ladd", "fadd", "dadd", "isub", "lsub", "fsub", "dsub", "imul", "lmul", "fmul", "dmul", "idiv", "ldiv", "fdiv", "ddiv", "imod", "lmod", "fmod", "dmod", "ineg", "lneg", "fneg", "dneg", "ishl", "lshl", "ishr", "lshr", "iushr", "lushr", "iand", "land", "ior", "lor", "ixor", "lxor", "iinc", "i2l", "i2f", "i2d", "l2i", "l2f", "l2d", "f2i", "f2l", "f2d", "d2i", "d2l", "d2f", "int2byte", "int2char", "int2short", "lcmp", "fcmpl", "fcmpg", "dcmpl", "dcmpg", "ifeq", "ifne", "iflt", "ifge", "ifgt", "ifle", "if_icmpeq", "if_icmpne", "if_icmplt", "if_icmpge", "if_icmpgt", "if_icmple", "if_acmpeq", "if_acmpne", "goto_", "jsr", "ret", "tableswitch", "lookupswitch", "ireturn", "lreturn", "freturn", "dreturn", "areturn", "return_", "getstatic", "putstatic", "getfield", "putfield", "invokevirtual", "invokespecial", "invokestatic", "invokeinterface", "invokedynamic", "new_", "newarray", "anewarray", "arraylength", "athrow", "checkcast", "instanceof_", "monitorenter", "monitorexit", "wide", "multianewarray", "if_acmp_null", "if_acmp_nonnull", "goto_w", "jsr_w", "breakpoint"};

        private Mneumonics() {
        }
    }
}
