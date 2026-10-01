package org.objectweb.asm.commons;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.signature.SignatureVisitor;

public class RemappingSignatureAdapter extends SignatureVisitor {
    private String className;
    private final Remapper remapper;

    private final SignatureVisitor f6669v;

    protected RemappingSignatureAdapter(int i, SignatureVisitor signatureVisitor, Remapper remapper) {
        super(i);
        this.f6669v = signatureVisitor;
        this.remapper = remapper;
    }

    public RemappingSignatureAdapter(SignatureVisitor signatureVisitor, Remapper remapper) {
        this(Opcodes.ASM5, signatureVisitor, remapper);
    }

    @Override
    public SignatureVisitor visitArrayType() {
        this.f6669v.visitArrayType();
        return this;
    }

    @Override
    public void visitBaseType(char c) {
        this.f6669v.visitBaseType(c);
    }

    @Override
    public SignatureVisitor visitClassBound() {
        this.f6669v.visitClassBound();
        return this;
    }

    @Override
    public void visitClassType(String str) {
        this.className = str;
        this.f6669v.visitClassType(this.remapper.mapType(str));
    }

    @Override
    public void visitEnd() {
        this.f6669v.visitEnd();
    }

    @Override
    public SignatureVisitor visitExceptionType() {
        this.f6669v.visitExceptionType();
        return this;
    }

    @Override
    public void visitFormalTypeParameter(String str) {
        this.f6669v.visitFormalTypeParameter(str);
    }

    @Override
    public void visitInnerClassType(String str) {
        String string = new StringBuffer().append(this.remapper.mapType(this.className)).append('$').toString();
        this.className = new StringBuffer().append(this.className).append('$').append(str).toString();
        String strMapType = this.remapper.mapType(this.className);
        this.f6669v.visitInnerClassType(strMapType.substring(strMapType.startsWith(string) ? string.length() : strMapType.lastIndexOf(36) + 1));
    }

    @Override
    public SignatureVisitor visitInterface() {
        this.f6669v.visitInterface();
        return this;
    }

    @Override
    public SignatureVisitor visitInterfaceBound() {
        this.f6669v.visitInterfaceBound();
        return this;
    }

    @Override
    public SignatureVisitor visitParameterType() {
        this.f6669v.visitParameterType();
        return this;
    }

    @Override
    public SignatureVisitor visitReturnType() {
        this.f6669v.visitReturnType();
        return this;
    }

    @Override
    public SignatureVisitor visitSuperclass() {
        this.f6669v.visitSuperclass();
        return this;
    }

    @Override
    public SignatureVisitor visitTypeArgument(char c) {
        this.f6669v.visitTypeArgument(c);
        return this;
    }

    @Override
    public void visitTypeArgument() {
        this.f6669v.visitTypeArgument();
    }

    @Override
    public void visitTypeVariable(String str) {
        this.f6669v.visitTypeVariable(str);
    }
}
