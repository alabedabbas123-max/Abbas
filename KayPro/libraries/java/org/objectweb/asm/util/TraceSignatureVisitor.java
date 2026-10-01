package org.objectweb.asm.util;

import org.apache.commons.io.FilenameUtils;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.signature.SignatureVisitor;

public final class TraceSignatureVisitor extends SignatureVisitor {
    private int argumentStack;
    private int arrayStack;
    private final StringBuffer declaration;
    private StringBuffer exceptions;
    private boolean isInterface;
    private StringBuffer returnType;
    private boolean seenFormalParameter;
    private boolean seenInterface;
    private boolean seenInterfaceBound;
    private boolean seenParameter;
    private String separator;

    public TraceSignatureVisitor(int i) {
        super(Opcodes.ASM5);
        this.separator = "";
        this.isInterface = (i & 512) != 0;
        this.declaration = new StringBuffer();
    }

    private TraceSignatureVisitor(StringBuffer stringBuffer) {
        super(Opcodes.ASM5);
        this.separator = "";
        this.declaration = stringBuffer;
    }

    private void endFormals() {
        if (this.seenFormalParameter) {
            this.declaration.append('>');
            this.seenFormalParameter = false;
        }
    }

    private void endType() {
        if (this.arrayStack % 2 == 0) {
            this.arrayStack /= 2;
            return;
        }
        while (this.arrayStack % 2 != 0) {
            this.arrayStack /= 2;
            this.declaration.append("[]");
        }
    }

    private void startType() {
        this.arrayStack *= 2;
    }

    public String getDeclaration() {
        return this.declaration.toString();
    }

    public String getExceptions() {
        if (this.exceptions == null) {
            return null;
        }
        return this.exceptions.toString();
    }

    public String getReturnType() {
        if (this.returnType == null) {
            return null;
        }
        return this.returnType.toString();
    }

    @Override
    public SignatureVisitor visitArrayType() {
        startType();
        this.arrayStack |= 1;
        return this;
    }

    @Override
    public void visitBaseType(char c) {
        switch (c) {
            case 'B':
                this.declaration.append("byte");
                break;
            case 'C':
                this.declaration.append("char");
                break;
            case 'F':
                this.declaration.append("float");
                break;
            case 'I':
                this.declaration.append("int");
                break;
            case 'J':
                this.declaration.append("long");
                break;
            case 'S':
                this.declaration.append("short");
                break;
            case 'V':
                this.declaration.append("void");
                break;
            case 'Z':
                this.declaration.append("boolean");
                break;
            default:
                this.declaration.append("double");
                break;
        }
        endType();
    }

    @Override
    public SignatureVisitor visitClassBound() {
        this.separator = " extends ";
        startType();
        return this;
    }

    @Override
    public void visitClassType(String str) {
        if ("java/lang/Object".equals(str)) {
            if (this.argumentStack % 2 != 0 || this.seenParameter) {
                this.declaration.append(this.separator).append(str.replace('/', FilenameUtils.EXTENSION_SEPARATOR));
            }
        } else {
            this.declaration.append(this.separator).append(str.replace('/', FilenameUtils.EXTENSION_SEPARATOR));
        }
        this.separator = "";
        this.argumentStack *= 2;
    }

    @Override
    public void visitEnd() {
        if (this.argumentStack % 2 != 0) {
            this.declaration.append('>');
        }
        this.argumentStack /= 2;
        endType();
    }

    @Override
    public SignatureVisitor visitExceptionType() {
        if (this.exceptions == null) {
            this.exceptions = new StringBuffer();
        } else {
            this.exceptions.append(", ");
        }
        return new TraceSignatureVisitor(this.exceptions);
    }

    @Override
    public void visitFormalTypeParameter(String str) {
        this.declaration.append(this.seenFormalParameter ? ", " : "<").append(str);
        this.seenFormalParameter = true;
        this.seenInterfaceBound = false;
    }

    @Override
    public void visitInnerClassType(String str) {
        if (this.argumentStack % 2 != 0) {
            this.declaration.append('>');
        }
        this.argumentStack /= 2;
        this.declaration.append(FilenameUtils.EXTENSION_SEPARATOR);
        this.declaration.append(this.separator).append(str.replace('/', FilenameUtils.EXTENSION_SEPARATOR));
        this.separator = "";
        this.argumentStack *= 2;
    }

    @Override
    public SignatureVisitor visitInterface() {
        String str;
        if (this.seenInterface) {
            str = ", ";
        } else {
            str = this.isInterface ? " extends " : " implements ";
        }
        this.separator = str;
        this.seenInterface = true;
        startType();
        return this;
    }

    @Override
    public SignatureVisitor visitInterfaceBound() {
        this.separator = this.seenInterfaceBound ? ", " : " extends ";
        this.seenInterfaceBound = true;
        startType();
        return this;
    }

    @Override
    public SignatureVisitor visitParameterType() {
        endFormals();
        if (this.seenParameter) {
            this.declaration.append(", ");
        } else {
            this.seenParameter = true;
            this.declaration.append('(');
        }
        startType();
        return this;
    }

    @Override
    public SignatureVisitor visitReturnType() {
        endFormals();
        if (this.seenParameter) {
            this.seenParameter = false;
        } else {
            this.declaration.append('(');
        }
        this.declaration.append(')');
        this.returnType = new StringBuffer();
        return new TraceSignatureVisitor(this.returnType);
    }

    @Override
    public SignatureVisitor visitSuperclass() {
        endFormals();
        this.separator = " extends ";
        startType();
        return this;
    }

    @Override
    public SignatureVisitor visitTypeArgument(char c) {
        if (this.argumentStack % 2 == 0) {
            this.argumentStack++;
            this.declaration.append('<');
        } else {
            this.declaration.append(", ");
        }
        if (c == '+') {
            this.declaration.append("? extends ");
        } else if (c == '-') {
            this.declaration.append("? super ");
        }
        startType();
        return this;
    }

    @Override
    public void visitTypeArgument() {
        if (this.argumentStack % 2 == 0) {
            this.argumentStack++;
            this.declaration.append('<');
        } else {
            this.declaration.append(", ");
        }
        this.declaration.append('?');
    }

    @Override
    public void visitTypeVariable(String str) {
        this.declaration.append(str);
        endType();
    }
}
