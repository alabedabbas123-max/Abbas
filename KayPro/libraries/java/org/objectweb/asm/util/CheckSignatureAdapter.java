package org.objectweb.asm.util;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.signature.SignatureVisitor;

public class CheckSignatureAdapter extends SignatureVisitor {
    public static final int CLASS_SIGNATURE = 0;
    public static final int METHOD_SIGNATURE = 1;
    public static final int TYPE_SIGNATURE = 2;
    private boolean canBeVoid;
    private int state;

    private final SignatureVisitor f6697sv;
    private final int type;

    protected CheckSignatureAdapter(int i, int i2, SignatureVisitor signatureVisitor) {
        super(i);
        this.type = i2;
        this.state = 1;
        this.f6697sv = signatureVisitor;
    }

    public CheckSignatureAdapter(int i, SignatureVisitor signatureVisitor) {
        this(Opcodes.ASM5, i, signatureVisitor);
    }

    @Override
    public SignatureVisitor visitArrayType() {
        if (this.type != 2 || this.state != 1) {
            throw new IllegalStateException();
        }
        this.state = 64;
        return new CheckSignatureAdapter(2, this.f6697sv == null ? null : this.f6697sv.visitArrayType());
    }

    @Override
    public void visitBaseType(char c) {
        if (this.type != 2 || this.state != 1) {
            throw new IllegalStateException();
        }
        if (c == 'V') {
            if (!this.canBeVoid) {
                throw new IllegalArgumentException();
            }
        } else if ("ZCBSIFJD".indexOf(c) == -1) {
            throw new IllegalArgumentException();
        }
        this.state = 64;
        if (this.f6697sv != null) {
            this.f6697sv.visitBaseType(c);
        }
    }

    @Override
    public SignatureVisitor visitClassBound() {
        if (this.state != 2) {
            throw new IllegalStateException();
        }
        this.state = 4;
        return new CheckSignatureAdapter(2, this.f6697sv == null ? null : this.f6697sv.visitClassBound());
    }

    @Override
    public void visitClassType(String str) {
        if (this.type != 2 || this.state != 1) {
            throw new IllegalStateException();
        }
        CheckMethodAdapter.checkInternalName(str, "class name");
        this.state = 128;
        if (this.f6697sv != null) {
            this.f6697sv.visitClassType(str);
        }
    }

    @Override
    public void visitEnd() {
        if (this.state != 128) {
            throw new IllegalStateException();
        }
        this.state = 256;
        if (this.f6697sv != null) {
            this.f6697sv.visitEnd();
        }
    }

    @Override
    public SignatureVisitor visitExceptionType() {
        if (this.state != 32) {
            throw new IllegalStateException();
        }
        return new CheckSignatureAdapter(2, this.f6697sv == null ? null : this.f6697sv.visitExceptionType());
    }

    @Override
    public void visitFormalTypeParameter(String str) {
        if (this.type == 2 || !(this.state == 1 || this.state == 2 || this.state == 4)) {
            throw new IllegalStateException();
        }
        CheckMethodAdapter.checkIdentifier(str, "formal type parameter");
        this.state = 2;
        if (this.f6697sv != null) {
            this.f6697sv.visitFormalTypeParameter(str);
        }
    }

    @Override
    public void visitInnerClassType(String str) {
        if (this.state != 128) {
            throw new IllegalStateException();
        }
        CheckMethodAdapter.checkIdentifier(str, "inner class name");
        if (this.f6697sv != null) {
            this.f6697sv.visitInnerClassType(str);
        }
    }

    @Override
    public SignatureVisitor visitInterface() {
        if (this.state != 8) {
            throw new IllegalStateException();
        }
        return new CheckSignatureAdapter(2, this.f6697sv == null ? null : this.f6697sv.visitInterface());
    }

    @Override
    public SignatureVisitor visitInterfaceBound() {
        if (this.state == 2 || this.state == 4) {
            return new CheckSignatureAdapter(2, this.f6697sv == null ? null : this.f6697sv.visitInterfaceBound());
        }
        throw new IllegalArgumentException();
    }

    @Override
    public SignatureVisitor visitParameterType() {
        if (this.type != 1 || (this.state & 23) == 0) {
            throw new IllegalArgumentException();
        }
        this.state = 16;
        return new CheckSignatureAdapter(2, this.f6697sv == null ? null : this.f6697sv.visitParameterType());
    }

    @Override
    public SignatureVisitor visitReturnType() {
        if (this.type != 1 || (this.state & 23) == 0) {
            throw new IllegalArgumentException();
        }
        this.state = 32;
        CheckSignatureAdapter checkSignatureAdapter = new CheckSignatureAdapter(2, this.f6697sv == null ? null : this.f6697sv.visitReturnType());
        checkSignatureAdapter.canBeVoid = true;
        return checkSignatureAdapter;
    }

    @Override
    public SignatureVisitor visitSuperclass() {
        if (this.type != 0 || (this.state & 7) == 0) {
            throw new IllegalArgumentException();
        }
        this.state = 8;
        return new CheckSignatureAdapter(2, this.f6697sv == null ? null : this.f6697sv.visitSuperclass());
    }

    @Override
    public SignatureVisitor visitTypeArgument(char c) {
        if (this.state != 128) {
            throw new IllegalStateException();
        }
        if ("+-=".indexOf(c) == -1) {
            throw new IllegalArgumentException();
        }
        return new CheckSignatureAdapter(2, this.f6697sv == null ? null : this.f6697sv.visitTypeArgument(c));
    }

    @Override
    public void visitTypeArgument() {
        if (this.state != 128) {
            throw new IllegalStateException();
        }
        if (this.f6697sv != null) {
            this.f6697sv.visitTypeArgument();
        }
    }

    @Override
    public void visitTypeVariable(String str) {
        if (this.type != 2 || this.state != 1) {
            throw new IllegalStateException();
        }
        CheckMethodAdapter.checkIdentifier(str, "type variable");
        this.state = 64;
        if (this.f6697sv != null) {
            this.f6697sv.visitTypeVariable(str);
        }
    }
}
