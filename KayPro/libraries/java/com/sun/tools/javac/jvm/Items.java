package com.sun.tools.javac.jvm;

import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Symtab;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.code.Types;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.util.Assert;

public class Items {
    Code code;
    Pool pool;
    Symtab syms;
    Types types;
    private final Item[] stackItem = new Item[9];
    private final Item voidItem = new Item(8) {
        @Override
        public String toString() {
            return "void";
        }
    };
    private final Item thisItem = new SelfItem(false);
    private final Item superItem = new SelfItem(true);

    public Items(Pool pool, Code code, Symtab syms, Types types) {
        this.code = code;
        this.pool = pool;
        this.types = types;
        for (int i = 0; i < 8; i++) {
            this.stackItem[i] = new StackItem(i);
        }
        this.stackItem[8] = this.voidItem;
        this.syms = syms;
    }

    Item makeVoidItem() {
        return this.voidItem;
    }

    Item makeThisItem() {
        return this.thisItem;
    }

    Item makeSuperItem() {
        return this.superItem;
    }

    Item makeStackItem(Type type) {
        return this.stackItem[Code.typecode(type)];
    }

    Item makeIndexedItem(Type type) {
        return new IndexedItem(type);
    }

    LocalItem makeLocalItem(Symbol.VarSymbol v) {
        return new LocalItem(v.erasure(this.types), v.f341adr);
    }

    private LocalItem makeLocalItem(Type type, int reg) {
        return new LocalItem(type, reg);
    }

    Item makeStaticItem(Symbol member) {
        return new StaticItem(member);
    }

    Item makeMemberItem(Symbol member, boolean nonvirtual) {
        return new MemberItem(member, nonvirtual);
    }

    Item makeImmediateItem(Type type, Object value) {
        return new ImmediateItem(type, value);
    }

    Item makeAssignItem(Item lhs) {
        return new AssignItem(lhs);
    }

    CondItem makeCondItem(int opcode, Code.Chain trueJumps, Code.Chain falseJumps) {
        return new CondItem(opcode, trueJumps, falseJumps);
    }

    CondItem makeCondItem(int opcode) {
        return makeCondItem(opcode, null, null);
    }

    abstract class Item {
        int typecode;

        public abstract String toString();

        Item(int typecode) {
            this.typecode = typecode;
        }

        Item load() {
            throw new AssertionError();
        }

        void store() {
            throw new AssertionError("store unsupported: " + this);
        }

        Item invoke() {
            throw new AssertionError(this);
        }

        void duplicate() {
        }

        void drop() {
        }

        void stash(int toscode) {
            Items.this.stackItem[toscode].duplicate();
        }

        CondItem mkCond() {
            load();
            return Items.this.makeCondItem(ByteCodes.ifne);
        }

        Item coerce(int targetcode) {
            if (this.typecode == targetcode) {
                return this;
            }
            load();
            int typecode1 = Code.truncate(this.typecode);
            int targetcode1 = Code.truncate(targetcode);
            if (typecode1 != targetcode1) {
                int offset = targetcode1 > typecode1 ? targetcode1 - 1 : targetcode1;
                Items.this.code.emitop0((typecode1 * 3) + ByteCodes.f410i2l + offset);
            }
            if (targetcode != targetcode1) {
                Items.this.code.emitop0((targetcode + ByteCodes.int2byte) - 5);
            }
            return Items.this.stackItem[targetcode];
        }

        Item coerce(Type targettype) {
            return coerce(Code.typecode(targettype));
        }

        int width() {
            return 0;
        }
    }

    class StackItem extends Item {
        StackItem(int typecode) {
            super(typecode);
        }

        @Override
        Item load() {
            return this;
        }

        @Override
        void duplicate() {
            Items.this.code.emitop0(width() == 2 ? 92 : 89);
        }

        @Override
        void drop() {
            Items.this.code.emitop0(width() == 2 ? 88 : 87);
        }

        @Override
        void stash(int toscode) {
            Items.this.code.emitop0((width() == 2 ? 91 : 90) + ((Code.width(toscode) - 1) * 3));
        }

        @Override
        int width() {
            return Code.width(this.typecode);
        }

        @Override
        public String toString() {
            return "stack(" + ByteCodes.typecodeNames[this.typecode] + ")";
        }
    }

    class IndexedItem extends Item {
        IndexedItem(Type type) {
            super(Code.typecode(type));
        }

        @Override
        Item load() {
            Items.this.code.emitop0(this.typecode + 46);
            return Items.this.stackItem[this.typecode];
        }

        @Override
        void store() {
            Items.this.code.emitop0(this.typecode + 79);
        }

        @Override
        void duplicate() {
            Items.this.code.emitop0(92);
        }

        @Override
        void drop() {
            Items.this.code.emitop0(88);
        }

        @Override
        void stash(int toscode) {
            Items.this.code.emitop0(((Code.width(toscode) - 1) * 3) + 91);
        }

        @Override
        int width() {
            return 2;
        }

        @Override
        public String toString() {
            return "indexed(" + ByteCodes.typecodeNames[this.typecode] + ")";
        }
    }

    class SelfItem extends Item {
        boolean isSuper;

        SelfItem(boolean isSuper) {
            super(4);
            this.isSuper = isSuper;
        }

        @Override
        Item load() {
            Items.this.code.emitop0(42);
            return Items.this.stackItem[this.typecode];
        }

        @Override
        public String toString() {
            return this.isSuper ? "super" : "this";
        }
    }

    class LocalItem extends Item {

        int f446reg;
        Type type;

        LocalItem(Type type, int reg) {
            super(Code.typecode(type));
            Assert.check(reg >= 0);
            this.type = type;
            this.f446reg = reg;
        }

        @Override
        Item load() {
            if (this.f446reg <= 3) {
                Items.this.code.emitop0((Code.truncate(this.typecode) * 4) + 26 + this.f446reg);
            } else {
                Items.this.code.emitop1w(Code.truncate(this.typecode) + 21, this.f446reg);
            }
            return Items.this.stackItem[this.typecode];
        }

        @Override
        void store() {
            if (this.f446reg <= 3) {
                Items.this.code.emitop0((Code.truncate(this.typecode) * 4) + 59 + this.f446reg);
            } else {
                Items.this.code.emitop1w(Code.truncate(this.typecode) + 54, this.f446reg);
            }
            Items.this.code.setDefined(this.f446reg);
        }

        void incr(int x) {
            if (this.typecode == 0 && x >= -32768 && x <= 32767) {
                Items.this.code.emitop1w(ByteCodes.iinc, this.f446reg, x);
                return;
            }
            load();
            if (x >= 0) {
                Items items = Items.this;
                items.makeImmediateItem(items.syms.intType, Integer.valueOf(x)).load();
                Items.this.code.emitop0(96);
            } else {
                Items items2 = Items.this;
                items2.makeImmediateItem(items2.syms.intType, Integer.valueOf(-x)).load();
                Items.this.code.emitop0(100);
            }
            Items items3 = Items.this;
            items3.makeStackItem(items3.syms.intType).coerce(this.typecode);
            store();
        }

        @Override
        public String toString() {
            return "localItem(type=" + this.type + "; reg=" + this.f446reg + ")";
        }
    }

    class StaticItem extends Item {
        Symbol member;

        StaticItem(Symbol member) {
            super(Code.typecode(member.erasure(Items.this.types)));
            this.member = member;
        }

        @Override
        Item load() {
            Items.this.code.emitop2(ByteCodes.getstatic, Items.this.pool.m478put(this.member));
            return Items.this.stackItem[this.typecode];
        }

        @Override
        void store() {
            Items.this.code.emitop2(ByteCodes.putstatic, Items.this.pool.m478put(this.member));
        }

        @Override
        Item invoke() {
            Type.MethodType mtype = (Type.MethodType) this.member.erasure(Items.this.types);
            int rescode = Code.typecode(mtype.restype);
            Items.this.code.emitInvokestatic(Items.this.pool.m478put(this.member), mtype);
            return Items.this.stackItem[rescode];
        }

        @Override
        public String toString() {
            return "static(" + this.member + ")";
        }
    }

    class MemberItem extends Item {
        Symbol member;
        boolean nonvirtual;

        MemberItem(Symbol member, boolean nonvirtual) {
            super(Code.typecode(member.erasure(Items.this.types)));
            this.member = member;
            this.nonvirtual = nonvirtual;
        }

        @Override
        Item load() {
            Items.this.code.emitop2(ByteCodes.getfield, Items.this.pool.m478put(this.member));
            return Items.this.stackItem[this.typecode];
        }

        @Override
        void store() {
            Items.this.code.emitop2(ByteCodes.putfield, Items.this.pool.m478put(this.member));
        }

        @Override
        Item invoke() {
            Type.MethodType mtype = (Type.MethodType) this.member.externalType(Items.this.types);
            int rescode = Code.typecode(mtype.restype);
            if ((this.member.owner.flags() & 512) != 0) {
                Items.this.code.emitInvokeinterface(Items.this.pool.m478put(this.member), mtype);
            } else if (this.nonvirtual) {
                Items.this.code.emitInvokespecial(Items.this.pool.m478put(this.member), mtype);
            } else {
                Items.this.code.emitInvokevirtual(Items.this.pool.m478put(this.member), mtype);
            }
            return Items.this.stackItem[rescode];
        }

        @Override
        void duplicate() {
            Items.this.stackItem[4].duplicate();
        }

        @Override
        void drop() {
            Items.this.stackItem[4].drop();
        }

        @Override
        void stash(int toscode) {
            Items.this.stackItem[4].stash(toscode);
        }

        @Override
        int width() {
            return 1;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("member(");
            sb.append(this.member);
            sb.append(this.nonvirtual ? " nonvirtual)" : ")");
            return sb.toString();
        }
    }

    class ImmediateItem extends Item {
        Object value;

        ImmediateItem(Type type, Object value) {
            super(Code.typecode(type));
            this.value = value;
        }

        private void m476ldc() {
            int idx = Items.this.pool.m478put(this.value);
            if (this.typecode == 1 || this.typecode == 3) {
                Items.this.code.emitop2(20, idx);
            } else if (idx <= 255) {
                Items.this.code.emitop1(18, idx);
            } else {
                Items.this.code.emitop2(19, idx);
            }
        }

        @Override
        Item load() {
            switch (this.typecode) {
                case 0:
                case 5:
                case 6:
                case 7:
                    int ival = ((Number) this.value).intValue();
                    if (-1 <= ival && ival <= 5) {
                        Items.this.code.emitop0(ival + 3);
                    } else if (-128 <= ival && ival <= 127) {
                        Items.this.code.emitop1(16, ival);
                    } else if (-32768 <= ival && ival <= 32767) {
                        Items.this.code.emitop2(17, ival);
                    } else {
                        m476ldc();
                    }
                    break;
                case 1:
                    long lval = ((Number) this.value).longValue();
                    if (lval == 0 || lval == 1) {
                        Items.this.code.emitop0(((int) lval) + 9);
                    } else {
                        m476ldc();
                    }
                    break;
                case 2:
                    float fval = ((Number) this.value).floatValue();
                    if (isPosZero(fval) || fval == 1.0d || fval == 2.0d) {
                        Items.this.code.emitop0(((int) fval) + 11);
                    } else {
                        m476ldc();
                    }
                    break;
                case 3:
                    double dval = ((Number) this.value).doubleValue();
                    if (isPosZero(dval) || dval == 1.0d) {
                        Items.this.code.emitop0(((int) dval) + 14);
                    } else {
                        m476ldc();
                    }
                    break;
                case 4:
                    m476ldc();
                    break;
                default:
                    Assert.error();
                    break;
            }
            return Items.this.stackItem[this.typecode];
        }

        private boolean isPosZero(float x) {
            return x == 0.0f && 1.0f / x > 0.0f;
        }

        private boolean isPosZero(double x) {
            return x == 0.0d && 1.0d / x > 0.0d;
        }

        @Override
        CondItem mkCond() {
            int ival = ((Number) this.value).intValue();
            return Items.this.makeCondItem(ival != 0 ? ByteCodes.goto_ : 168);
        }

        @Override
        Item coerce(int targetcode) {
            if (this.typecode == targetcode) {
                return this;
            }
            if (targetcode == 0) {
                if (Code.truncate(this.typecode) == 0) {
                    return this;
                }
                Items items = Items.this;
                return items.new ImmediateItem(items.syms.intType, Integer.valueOf(((Number) this.value).intValue()));
            }
            if (targetcode == 1) {
                Items items2 = Items.this;
                return items2.new ImmediateItem(items2.syms.longType, Long.valueOf(((Number) this.value).longValue()));
            }
            if (targetcode == 2) {
                Items items3 = Items.this;
                return items3.new ImmediateItem(items3.syms.floatType, Float.valueOf(((Number) this.value).floatValue()));
            }
            if (targetcode == 3) {
                Items items4 = Items.this;
                return items4.new ImmediateItem(items4.syms.doubleType, Double.valueOf(((Number) this.value).doubleValue()));
            }
            if (targetcode == 5) {
                Items items5 = Items.this;
                return items5.new ImmediateItem(items5.syms.byteType, Integer.valueOf((byte) ((Number) this.value).intValue()));
            }
            if (targetcode == 6) {
                Items items6 = Items.this;
                return items6.new ImmediateItem(items6.syms.charType, Integer.valueOf((char) ((Number) this.value).intValue()));
            }
            if (targetcode == 7) {
                Items items7 = Items.this;
                return items7.new ImmediateItem(items7.syms.shortType, Integer.valueOf((short) ((Number) this.value).intValue()));
            }
            return super.coerce(targetcode);
        }

        @Override
        public String toString() {
            return "immediate(" + this.value + ")";
        }
    }

    class AssignItem extends Item {

        Item f445lhs;

        AssignItem(Item lhs) {
            super(lhs.typecode);
            this.f445lhs = lhs;
        }

        @Override
        Item load() {
            this.f445lhs.stash(this.typecode);
            this.f445lhs.store();
            return Items.this.stackItem[this.typecode];
        }

        @Override
        void duplicate() {
            load().duplicate();
        }

        @Override
        void drop() {
            this.f445lhs.store();
        }

        @Override
        void stash(int toscode) {
            Assert.error();
        }

        @Override
        int width() {
            return this.f445lhs.width() + Code.width(this.typecode);
        }

        @Override
        public String toString() {
            return "assign(lhs = " + this.f445lhs + ")";
        }
    }

    class CondItem extends Item {
        Code.Chain falseJumps;
        int opcode;
        JCTree tree;
        Code.Chain trueJumps;

        CondItem(int opcode, Code.Chain truejumps, Code.Chain falsejumps) {
            super(5);
            this.opcode = opcode;
            this.trueJumps = truejumps;
            this.falseJumps = falsejumps;
        }

        @Override
        Item load() {
            Code.Chain trueChain = null;
            Code.Chain falseChain = jumpFalse();
            if (!isFalse()) {
                Items.this.code.resolve(this.trueJumps);
                Items.this.code.emitop0(4);
                trueChain = Items.this.code.branch(ByteCodes.goto_);
            }
            if (falseChain != null) {
                Items.this.code.resolve(falseChain);
                Items.this.code.emitop0(3);
            }
            Items.this.code.resolve(trueChain);
            return Items.this.stackItem[this.typecode];
        }

        @Override
        void duplicate() {
            load().duplicate();
        }

        @Override
        void drop() {
            load().drop();
        }

        @Override
        void stash(int toscode) {
            Assert.error();
        }

        @Override
        CondItem mkCond() {
            return this;
        }

        Code.Chain jumpTrue() {
            if (this.tree == null) {
                return Code.mergeChains(this.trueJumps, Items.this.code.branch(this.opcode));
            }
            int startpc = Items.this.code.curPc();
            Code.Chain c = Code.mergeChains(this.trueJumps, Items.this.code.branch(this.opcode));
            Items.this.code.f434crt.m467put(this.tree, 128, startpc, Items.this.code.curPc());
            return c;
        }

        Code.Chain jumpFalse() {
            if (this.tree == null) {
                return Code.mergeChains(this.falseJumps, Items.this.code.branch(Code.negate(this.opcode)));
            }
            int startpc = Items.this.code.curPc();
            Code.Chain c = Code.mergeChains(this.falseJumps, Items.this.code.branch(Code.negate(this.opcode)));
            Items.this.code.f434crt.m467put(this.tree, 256, startpc, Items.this.code.curPc());
            return c;
        }

        CondItem negate() {
            CondItem c = Items.this.new CondItem(Code.negate(this.opcode), this.falseJumps, this.trueJumps);
            c.tree = this.tree;
            return c;
        }

        @Override
        int width() {
            throw new AssertionError();
        }

        boolean isTrue() {
            return this.falseJumps == null && this.opcode == 167;
        }

        boolean isFalse() {
            return this.trueJumps == null && this.opcode == 168;
        }

        @Override
        public String toString() {
            return "cond(" + Code.mnem(this.opcode) + ")";
        }
    }
}
