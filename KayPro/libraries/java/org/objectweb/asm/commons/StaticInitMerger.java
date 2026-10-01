package org.objectweb.asm.commons;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class StaticInitMerger extends ClassVisitor {
    private MethodVisitor clinit;
    private int counter;
    private String name;
    private final String prefix;

    protected StaticInitMerger(int i, String str, ClassVisitor classVisitor) {
        super(i, classVisitor);
        this.prefix = str;
    }

    public StaticInitMerger(String str, ClassVisitor classVisitor) {
        this(Opcodes.ASM5, str, classVisitor);
    }

    @Override
    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.f6446cv.visit(i, i2, str, str2, str3, strArr);
        this.name = str;
    }

    @Override
    public void visitEnd() {
        if (this.clinit != null) {
            this.clinit.visitInsn(177);
            this.clinit.visitMaxs(0, 0);
        }
        this.f6446cv.visitEnd();
    }

    @Override
    public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        if (!"<clinit>".equals(str)) {
            return this.f6446cv.visitMethod(i, str, str2, str3, strArr);
        }
        StringBuffer stringBufferAppend = new StringBuffer().append(this.prefix);
        int i2 = this.counter;
        this.counter = i2 + 1;
        String string = stringBufferAppend.append(i2).toString();
        MethodVisitor methodVisitorVisitMethod = this.f6446cv.visitMethod(10, string, str2, str3, strArr);
        if (this.clinit == null) {
            this.clinit = this.f6446cv.visitMethod(10, str, str2, null, null);
        }
        this.clinit.visitMethodInsn(184, this.name, string, str2, false);
        return methodVisitorVisitMethod;
    }
}
