package org.objectweb.asm.signature;

import org.apache.commons.io.FilenameUtils;
import org.objectweb.asm.Opcodes;

public class SignatureWriter extends SignatureVisitor {

    private final StringBuffer f6673a;

    private boolean f6674b;

    private boolean f6675c;

    private int f6676d;

    public SignatureWriter() {
        super(Opcodes.ASM5);
        this.f6673a = new StringBuffer();
    }

    private void m9023a() {
        if (this.f6674b) {
            this.f6674b = false;
            this.f6673a.append('>');
        }
    }

    private void m9024b() {
        if (this.f6676d % 2 != 0) {
            this.f6673a.append('>');
        }
        this.f6676d /= 2;
    }

    public String toString() {
        return this.f6673a.toString();
    }

    @Override
    public SignatureVisitor visitArrayType() {
        this.f6673a.append('[');
        return this;
    }

    @Override
    public void visitBaseType(char c) {
        this.f6673a.append(c);
    }

    @Override
    public SignatureVisitor visitClassBound() {
        return this;
    }

    @Override
    public void visitClassType(String str) {
        this.f6673a.append('L');
        this.f6673a.append(str);
        this.f6676d *= 2;
    }

    @Override
    public void visitEnd() {
        m9024b();
        this.f6673a.append(';');
    }

    @Override
    public SignatureVisitor visitExceptionType() {
        this.f6673a.append('^');
        return this;
    }

    @Override
    public void visitFormalTypeParameter(String str) {
        if (!this.f6674b) {
            this.f6674b = true;
            this.f6673a.append('<');
        }
        this.f6673a.append(str);
        this.f6673a.append(':');
    }

    @Override
    public void visitInnerClassType(String str) {
        m9024b();
        this.f6673a.append(FilenameUtils.EXTENSION_SEPARATOR);
        this.f6673a.append(str);
        this.f6676d *= 2;
    }

    @Override
    public SignatureVisitor visitInterface() {
        return this;
    }

    @Override
    public SignatureVisitor visitInterfaceBound() {
        this.f6673a.append(':');
        return this;
    }

    @Override
    public SignatureVisitor visitParameterType() {
        m9023a();
        if (!this.f6675c) {
            this.f6675c = true;
            this.f6673a.append('(');
        }
        return this;
    }

    @Override
    public SignatureVisitor visitReturnType() {
        m9023a();
        if (!this.f6675c) {
            this.f6673a.append('(');
        }
        this.f6673a.append(')');
        return this;
    }

    @Override
    public SignatureVisitor visitSuperclass() {
        m9023a();
        return this;
    }

    @Override
    public SignatureVisitor visitTypeArgument(char c) {
        if (this.f6676d % 2 == 0) {
            this.f6676d++;
            this.f6673a.append('<');
        }
        if (c != '=') {
            this.f6673a.append(c);
        }
        return this;
    }

    @Override
    public void visitTypeArgument() {
        if (this.f6676d % 2 == 0) {
            this.f6676d++;
            this.f6673a.append('<');
        }
        this.f6673a.append('*');
    }

    @Override
    public void visitTypeVariable(String str) {
        this.f6673a.append('T');
        this.f6673a.append(str);
        this.f6673a.append(';');
    }
}
