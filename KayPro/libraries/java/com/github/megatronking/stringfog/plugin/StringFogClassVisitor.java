package com.github.megatronking.stringfog.plugin;

import com.github.megatronking.stringfog.IStringFog;
import com.github.megatronking.stringfog.plugin.utils.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.FilenameUtils;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

class StringFogClassVisitor extends ClassVisitor {
    private static final String IGNORE_ANNOTATION = "Lcom/github/megatronking/stringfog/annotation/StringFogIgnore;";
    private boolean isClInitExists;
    private String mClassName;
    private List<ClassStringField> mFields;
    private List<ClassStringField> mFinalFields;
    private String mFogClassName;
    private boolean mIgnoreClass;
    private final String mKey;
    private StringFogMappingPrinter mMappingPrinter;
    private List<ClassStringField> mStaticFields;
    private List<ClassStringField> mStaticFinalFields;
    private IStringFog mStringFogImpl;

    StringFogClassVisitor(IStringFog iStringFog, StringFogMappingPrinter stringFogMappingPrinter, String str, String str2, ClassWriter classWriter) {
        super(Opcodes.ASM5, classWriter);
        this.mStaticFinalFields = new ArrayList();
        this.mStaticFields = new ArrayList();
        this.mFinalFields = new ArrayList();
        this.mFields = new ArrayList();
        this.mStringFogImpl = iStringFog;
        this.mMappingPrinter = stringFogMappingPrinter;
        this.mKey = str2;
        this.mFogClassName = str.replace(FilenameUtils.EXTENSION_SEPARATOR, '/');
    }

    public boolean canEncrypted(String str) {
        return (TextUtils.isEmptyAfterTrim(str) || this.mStringFogImpl.overflow(str, this.mKey)) ? false : true;
    }

    public String getJavaClassName() {
        return this.mClassName != null ? this.mClassName.replace('/', FilenameUtils.EXTENSION_SEPARATOR) : (String) null;
    }

    @Override
    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.mClassName = str;
        super.visit(i, i2, str, str2, str3, strArr);
    }

    @Override
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        this.mIgnoreClass = IGNORE_ANNOTATION.equals(str);
        return super.visitAnnotation(str, z);
    }

    @Override
    public void visitEnd() {
        if (!this.mIgnoreClass && !this.isClInitExists && !this.mStaticFinalFields.isEmpty()) {
            MethodVisitor methodVisitorVisitMethod = super.visitMethod(8, "<clinit>", "()V", (String) null, (String[]) null);
            methodVisitorVisitMethod.visitCode();
            for (ClassStringField classStringField : this.mStaticFinalFields) {
                if (canEncrypted(classStringField.value)) {
                    String str = classStringField.value;
                    String strEncrypt = this.mStringFogImpl.encrypt(str, this.mKey);
                    this.mMappingPrinter.output(getJavaClassName(), str, strEncrypt);
                    methodVisitorVisitMethod.visitLdcInsn(strEncrypt);
                    methodVisitorVisitMethod.visitMethodInsn(184, this.mFogClassName, "decrypt", "(Ljava/lang/String;)Ljava/lang/String;", false);
                    methodVisitorVisitMethod.visitFieldInsn(179, this.mClassName, classStringField.name, "Ljava/lang/String;");
                }
            }
            methodVisitorVisitMethod.visitInsn(177);
            methodVisitorVisitMethod.visitMaxs(1, 0);
            methodVisitorVisitMethod.visitEnd();
        }
        super.visitEnd();
    }

    @Override
    public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        Object obj2;
        Object obj3;
        if (!ClassStringField.STRING_DESC.equals(str2) || str == null || this.mIgnoreClass) {
            obj2 = obj;
        } else {
            if ((i & 8) == 0 || (i & 16) == 0) {
                obj3 = obj;
            } else {
                this.mStaticFinalFields.add(new ClassStringField(str, (String) obj));
                obj3 = (Object) null;
            }
            if ((i & 8) != 0 && (i & 16) == 0) {
                this.mStaticFields.add(new ClassStringField(str, (String) obj3));
                obj3 = (Object) null;
            }
            if ((i & 8) == 0 && (i & 16) != 0) {
                this.mFinalFields.add(new ClassStringField(str, (String) obj3));
                obj3 = (Object) null;
            }
            if ((i & 8) == 0 || (i & 16) == 0) {
                obj2 = obj3;
            } else {
                this.mFields.add(new ClassStringField(str, (String) obj3));
                obj2 = (Object) null;
            }
        }
        return super.visitField(i, str, str2, str3, obj2);
    }

    @Override
    public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        int i2 = Opcodes.ASM5;
        MethodVisitor methodVisitorVisitMethod = super.visitMethod(i, str, str2, str3, strArr);
        if (methodVisitorVisitMethod == null || this.mIgnoreClass) {
            return methodVisitorVisitMethod;
        }
        if (!"<clinit>".equals(str)) {
            return "<init>".equals(str) ? new MethodVisitor(this, i2, methodVisitorVisitMethod) {
                private final StringFogClassVisitor this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public void visitLdcInsn(Object obj) {
                    if (obj == null || !(obj instanceof String) || !this.this$0.canEncrypted((String) obj)) {
                        super.visitLdcInsn(obj);
                        return;
                    }
                    String str4 = (String) obj;
                    String strEncrypt = this.this$0.mStringFogImpl.encrypt(str4, this.this$0.mKey);
                    this.this$0.mMappingPrinter.output(this.this$0.getJavaClassName(), str4, strEncrypt);
                    super.visitLdcInsn(strEncrypt);
                    super.visitMethodInsn(184, this.this$0.mFogClassName, "decrypt", "(Ljava/lang/String;)Ljava/lang/String;", false);
                }
            } : new MethodVisitor(this, i2, methodVisitorVisitMethod) {
                private final StringFogClassVisitor this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public void visitLdcInsn(Object obj) {
                    if (obj == null || !(obj instanceof String) || !this.this$0.canEncrypted((String) obj)) {
                        super.visitLdcInsn(obj);
                        return;
                    }
                    for (ClassStringField classStringField : this.this$0.mStaticFinalFields) {
                        if (obj.equals(classStringField.value)) {
                            super.visitFieldInsn(178, this.this$0.mClassName, classStringField.name, "Ljava/lang/String;");
                            return;
                        }
                    }
                    for (ClassStringField classStringField2 : this.this$0.mFinalFields) {
                        if (obj.equals(classStringField2.value)) {
                            super.visitVarInsn(25, 0);
                            super.visitFieldInsn(180, this.this$0.mClassName, classStringField2.name, "Ljava/lang/String;");
                            return;
                        }
                    }
                    String str4 = (String) obj;
                    String strEncrypt = this.this$0.mStringFogImpl.encrypt(str4, this.this$0.mKey);
                    this.this$0.mMappingPrinter.output(this.this$0.getJavaClassName(), str4, strEncrypt);
                    super.visitLdcInsn(strEncrypt);
                    super.visitMethodInsn(184, this.this$0.mFogClassName, "decrypt", "(Ljava/lang/String;)Ljava/lang/String;", false);
                }
            };
        }
        this.isClInitExists = true;
        return new MethodVisitor(this, i2, methodVisitorVisitMethod) {
            private String lastStashCst;
            private final StringFogClassVisitor this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void visitCode() {
                super.visitCode();
                for (ClassStringField classStringField : this.this$0.mStaticFinalFields) {
                    if (this.this$0.canEncrypted(classStringField.value)) {
                        String str4 = classStringField.value;
                        String strEncrypt = this.this$0.mStringFogImpl.encrypt(str4, this.this$0.mKey);
                        this.this$0.mMappingPrinter.output(this.this$0.getJavaClassName(), str4, strEncrypt);
                        super.visitLdcInsn(strEncrypt);
                        super.visitMethodInsn(184, this.this$0.mFogClassName, "decrypt", "(Ljava/lang/String;)Ljava/lang/String;", false);
                        super.visitFieldInsn(179, this.this$0.mClassName, classStringField.name, "Ljava/lang/String;");
                    }
                }
            }

            @Override
            public void visitFieldInsn(int i3, String str4, String str5, String str6) {
                boolean z;
                if (this.this$0.mClassName.equals(str4) && this.lastStashCst != null) {
                    Iterator it = this.this$0.mStaticFields.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((ClassStringField) it.next()).name.equals(str5)) {
                                z = true;
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (!z) {
                        for (ClassStringField classStringField : this.this$0.mStaticFinalFields) {
                            if (classStringField.name.equals(str5) && classStringField.value == null) {
                                classStringField.value = this.lastStashCst;
                                break;
                            }
                        }
                    }
                }
                this.lastStashCst = (String) null;
                super.visitFieldInsn(i3, str4, str5, str6);
            }

            @Override
            public void visitLdcInsn(Object obj) {
                if (obj == null || !(obj instanceof String) || !this.this$0.canEncrypted((String) obj)) {
                    this.lastStashCst = (String) null;
                    super.visitLdcInsn(obj);
                    return;
                }
                this.lastStashCst = (String) obj;
                String str4 = this.lastStashCst;
                String strEncrypt = this.this$0.mStringFogImpl.encrypt(str4, this.this$0.mKey);
                this.this$0.mMappingPrinter.output(this.this$0.getJavaClassName(), str4, strEncrypt);
                super.visitLdcInsn(strEncrypt);
                super.visitMethodInsn(184, this.this$0.mFogClassName, "decrypt", "(Ljava/lang/String;)Ljava/lang/String;", false);
            }
        };
    }
}
