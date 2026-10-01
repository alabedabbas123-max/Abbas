package com.almlkaide.kaypro.android.dx.rop.code;

import com.almlkaide.kaypro.android.dx.rop.type.StdTypeList;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeList;
import com.almlkaide.kaypro.android.dx.util.ToHuman;

public abstract class Insn implements ToHuman {
    private final Rop opcode;
    private final SourcePosition position;
    private final RegisterSpec result;
    private final RegisterSpecList sources;

    public static class BaseVisitor implements Visitor {
        @Override
        public void visitFillArrayDataInsn(FillArrayDataInsn fillArrayDataInsn) {
        }

        @Override
        public void visitInvokePolymorphicInsn(InvokePolymorphicInsn invokePolymorphicInsn) {
        }

        @Override
        public void visitPlainCstInsn(PlainCstInsn plainCstInsn) {
        }

        @Override
        public void visitPlainInsn(PlainInsn plainInsn) {
        }

        @Override
        public void visitSwitchInsn(SwitchInsn switchInsn) {
        }

        @Override
        public void visitThrowingCstInsn(ThrowingCstInsn throwingCstInsn) {
        }

        @Override
        public void visitThrowingInsn(ThrowingInsn throwingInsn) {
        }
    }

    public interface Visitor {
        void visitFillArrayDataInsn(FillArrayDataInsn fillArrayDataInsn);

        void visitInvokePolymorphicInsn(InvokePolymorphicInsn invokePolymorphicInsn);

        void visitPlainCstInsn(PlainCstInsn plainCstInsn);

        void visitPlainInsn(PlainInsn plainInsn);

        void visitSwitchInsn(SwitchInsn switchInsn);

        void visitThrowingCstInsn(ThrowingCstInsn throwingCstInsn);

        void visitThrowingInsn(ThrowingInsn throwingInsn);
    }

    public abstract void accept(Visitor visitor);

    public abstract TypeList getCatches();

    public abstract Insn withAddedCatch(Type type);

    public abstract Insn withNewRegisters(RegisterSpec registerSpec, RegisterSpecList registerSpecList);

    public abstract Insn withRegisterOffset(int i);

    public Insn(Rop c1681Rop, SourcePosition sourcePosition, RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        if (c1681Rop == null) {
            throw new NullPointerException("opcode == null");
        }
        if (sourcePosition == null) {
            throw new NullPointerException("position == null");
        }
        if (registerSpecList == null) {
            throw new NullPointerException("sources == null");
        }
        this.opcode = c1681Rop;
        this.position = sourcePosition;
        this.result = registerSpec;
        this.sources = registerSpecList;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public String toString() {
        return toStringWithInline(getInlineString());
    }

    @Override
    public String toHuman() {
        return toHumanWithInline(getInlineString());
    }

    public String getInlineString() {
        return (String) null;
    }

    public final Rop getOpcode() {
        return this.opcode;
    }

    public final SourcePosition getPosition() {
        return this.position;
    }

    public final RegisterSpec getResult() {
        return this.result;
    }

    public final RegisterSpec getLocalAssignment() {
        RegisterSpec registerSpecM7188get;
        if (this.opcode.getOpcode() == 54) {
            registerSpecM7188get = this.sources.m7188get(0);
        } else {
            registerSpecM7188get = this.result;
        }
        if (registerSpecM7188get == null) {
            return (RegisterSpec) null;
        }
        return registerSpecM7188get.getLocalItem() == null ? (RegisterSpec) null : registerSpecM7188get;
    }

    public final RegisterSpecList getSources() {
        return this.sources;
    }

    public final boolean canThrow() {
        return this.opcode.canThrow();
    }

    public Insn withSourceLiteral() {
        return this;
    }

    public Insn copy() {
        return withRegisterOffset(0);
    }

    private static boolean equalsHandleNulls(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean contentEquals(Insn insn) {
        return this.opcode == insn.getOpcode() && this.position.equals(insn.getPosition()) && getClass() == insn.getClass() && equalsHandleNulls(this.result, insn.getResult()) && equalsHandleNulls(this.sources, insn.getSources()) && StdTypeList.equalContents(getCatches(), insn.getCatches());
    }

    protected final String toStringWithInline(String str) {
        StringBuilder sb = new StringBuilder(80);
        sb.append("Insn{");
        sb.append(this.position);
        sb.append(' ');
        sb.append(this.opcode);
        if (str != null) {
            sb.append(' ');
            sb.append(str);
        }
        sb.append(" :: ");
        if (this.result != null) {
            sb.append(this.result);
            sb.append(" <- ");
        }
        sb.append(this.sources);
        sb.append('}');
        return sb.toString();
    }

    protected final String toHumanWithInline(String str) {
        StringBuilder sb = new StringBuilder(80);
        sb.append(this.position);
        sb.append(": ");
        sb.append(this.opcode.getNickname());
        if (str != null) {
            sb.append("(");
            sb.append(str);
            sb.append(")");
        }
        if (this.result == null) {
            sb.append(" .");
        } else {
            sb.append(" ");
            sb.append(this.result.toHuman());
        }
        sb.append(" <-");
        int size = this.sources.size();
        if (size == 0) {
            sb.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                sb.append(" ");
                sb.append(this.sources.m7188get(i).toHuman());
            }
        }
        return sb.toString();
    }
}
