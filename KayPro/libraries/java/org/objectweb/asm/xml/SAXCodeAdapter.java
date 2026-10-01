package org.objectweb.asm.xml;

import com.baidu.mobstat.Config;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
import org.objectweb.asm.util.Printer;
import org.xml.sax.helpers.AttributesImpl;

public final class SAXCodeAdapter extends MethodVisitor {
    static final String[] TYPES;
    int access;
    private final Map labelNames;

    SAXAdapter f6718sa;

    static {
        _clinit_();
        TYPES = new String[]{"top", "int", "float", "double", "long", "null", "uninitializedThis"};
    }

    public SAXCodeAdapter(SAXAdapter sAXAdapter, int i) {
        super(Opcodes.ASM5);
        this.f6718sa = sAXAdapter;
        this.access = i;
        this.labelNames = new HashMap();
    }

    static void _clinit_() {
    }

    private void appendFrameTypes(boolean z, int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            AttributesImpl attributesImpl = new AttributesImpl();
            if (obj instanceof String) {
                attributesImpl.addAttribute("", "type", "type", "", (String) obj);
            } else if (obj instanceof Integer) {
                attributesImpl.addAttribute("", "type", "type", "", TYPES[((Integer) obj).intValue()]);
            } else {
                attributesImpl.addAttribute("", "type", "type", "", "uninitialized");
                attributesImpl.addAttribute("", "label", "label", "", getLabel((Label) obj));
            }
            this.f6718sa.addElement(z ? "local" : "stack", attributesImpl);
        }
    }

    private static AttributesImpl getConstantAttribute(Object obj) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "cst", "cst", "", SAXClassAdapter.encode(obj.toString()));
        attributesImpl.addAttribute("", "desc", "desc", "", Type.getDescriptor(obj.getClass()));
        return attributesImpl;
    }

    private final String getLabel(Label label) {
        String str = (String) this.labelNames.get(label);
        if (str != null) {
            return str;
        }
        String string = Integer.toString(this.labelNames.size());
        this.labelNames.put(label, string);
        return string;
    }

    @Override
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        return new SAXAnnotationAdapter(this.f6718sa, "annotation", z ? 1 : -1, (String) null, str);
    }

    @Override
    public AnnotationVisitor visitAnnotationDefault() {
        return new SAXAnnotationAdapter(this.f6718sa, "annotationDefault", 0, (String) null, (String) null);
    }

    @Override
    public final void visitCode() {
        if ((this.access & 1792) == 0) {
            this.f6718sa.addStart("code", new AttributesImpl());
        }
    }

    @Override
    public void visitEnd() {
        this.f6718sa.addEnd("method");
    }

    @Override
    public final void visitFieldInsn(int i, String str, String str2, String str3) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "owner", "owner", "", str);
        attributesImpl.addAttribute("", "name", "name", "", str2);
        attributesImpl.addAttribute("", "desc", "desc", "", str3);
        this.f6718sa.addElement(Printer.OPCODES[i], attributesImpl);
    }

    @Override
    public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        AttributesImpl attributesImpl = new AttributesImpl();
        switch (i) {
            case -1:
            case 0:
                if (i == -1) {
                    attributesImpl.addAttribute("", "type", "type", "", "NEW");
                } else {
                    attributesImpl.addAttribute("", "type", "type", "", "FULL");
                }
                this.f6718sa.addStart("frame", attributesImpl);
                appendFrameTypes(true, i2, objArr);
                appendFrameTypes(false, i3, objArr2);
                break;
            case 1:
                attributesImpl.addAttribute("", "type", "type", "", "APPEND");
                this.f6718sa.addStart("frame", attributesImpl);
                appendFrameTypes(true, i2, objArr);
                break;
            case 2:
                attributesImpl.addAttribute("", "type", "type", "", "CHOP");
                attributesImpl.addAttribute("", Config.TRACE_VISIT_RECENT_COUNT, Config.TRACE_VISIT_RECENT_COUNT, "", Integer.toString(i2));
                this.f6718sa.addStart("frame", attributesImpl);
                break;
            case 3:
                attributesImpl.addAttribute("", "type", "type", "", "SAME");
                this.f6718sa.addStart("frame", attributesImpl);
                break;
            case 4:
                attributesImpl.addAttribute("", "type", "type", "", "SAME1");
                this.f6718sa.addStart("frame", attributesImpl);
                appendFrameTypes(false, 1, objArr2);
                break;
        }
        this.f6718sa.addEnd("frame");
    }

    @Override
    public final void visitIincInsn(int i, int i2) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "var", "var", "", Integer.toString(i));
        attributesImpl.addAttribute("", "inc", "inc", "", Integer.toString(i2));
        this.f6718sa.addElement(Printer.OPCODES[132], attributesImpl);
    }

    @Override
    public final void visitInsn(int i) {
        this.f6718sa.addElement(Printer.OPCODES[i], new AttributesImpl());
    }

    @Override
    public AnnotationVisitor visitInsnAnnotation(int i, TypePath typePath, String str, boolean z) {
        return new SAXAnnotationAdapter(this.f6718sa, "insnAnnotation", z ? 1 : -1, (String) null, str, i, typePath);
    }

    @Override
    public final void visitIntInsn(int i, int i2) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "value", "value", "", Integer.toString(i2));
        this.f6718sa.addElement(Printer.OPCODES[i], attributesImpl);
    }

    @Override
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "name", "name", "", str);
        attributesImpl.addAttribute("", "desc", "desc", "", str2);
        attributesImpl.addAttribute("", "bsm", "bsm", "", SAXClassAdapter.encode(handle.toString()));
        this.f6718sa.addStart("INVOKEDYNAMIC", attributesImpl);
        for (Object obj : objArr) {
            this.f6718sa.addElement("bsmArg", getConstantAttribute(obj));
        }
        this.f6718sa.addEnd("INVOKEDYNAMIC");
    }

    @Override
    public final void visitJumpInsn(int i, Label label) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "label", "label", "", getLabel(label));
        this.f6718sa.addElement(Printer.OPCODES[i], attributesImpl);
    }

    @Override
    public final void visitLabel(Label label) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "name", "name", "", getLabel(label));
        this.f6718sa.addElement("Label", attributesImpl);
    }

    @Override
    public final void visitLdcInsn(Object obj) {
        this.f6718sa.addElement(Printer.OPCODES[18], getConstantAttribute(obj));
    }

    @Override
    public final void visitLineNumber(int i, Label label) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "line", "line", "", Integer.toString(i));
        attributesImpl.addAttribute("", "start", "start", "", getLabel(label));
        this.f6718sa.addElement("LineNumber", attributesImpl);
    }

    @Override
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "name", "name", "", str);
        attributesImpl.addAttribute("", "desc", "desc", "", str2);
        if (str3 != null) {
            attributesImpl.addAttribute("", "signature", "signature", "", SAXClassAdapter.encode(str3));
        }
        attributesImpl.addAttribute("", "start", "start", "", getLabel(label));
        attributesImpl.addAttribute("", "end", "end", "", getLabel(label2));
        attributesImpl.addAttribute("", "var", "var", "", Integer.toString(i));
        this.f6718sa.addElement("LocalVar", attributesImpl);
    }

    @Override
    public AnnotationVisitor visitLocalVariableAnnotation(int i, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z) {
        String[] strArr = new String[labelArr.length];
        String[] strArr2 = new String[labelArr2.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr[i2] = getLabel(labelArr[i2]);
        }
        for (int i3 = 0; i3 < strArr2.length; i3++) {
            strArr2[i3] = getLabel(labelArr2[i3]);
        }
        return new SAXAnnotationAdapter(this.f6718sa, "localVariableAnnotation", z ? 1 : -1, null, str, i, typePath, strArr, strArr2, iArr);
    }

    @Override
    public final void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "dflt", "dflt", "", getLabel(label));
        String str = Printer.OPCODES[171];
        this.f6718sa.addStart(str, attributesImpl);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= labelArr.length) {
                this.f6718sa.addEnd(str);
                return;
            }
            AttributesImpl attributesImpl2 = new AttributesImpl();
            attributesImpl2.addAttribute("", "name", "name", "", getLabel(labelArr[i2]));
            attributesImpl2.addAttribute("", "key", "key", "", Integer.toString(iArr[i2]));
            this.f6718sa.addElement("label", attributesImpl2);
            i = i2 + 1;
        }
    }

    @Override
    public final void visitMaxs(int i, int i2) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "maxStack", "maxStack", "", Integer.toString(i));
        attributesImpl.addAttribute("", "maxLocals", "maxLocals", "", Integer.toString(i2));
        this.f6718sa.addElement("Max", attributesImpl);
        this.f6718sa.addEnd("code");
    }

    @Override
    public final void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "owner", "owner", "", str);
        attributesImpl.addAttribute("", "name", "name", "", str2);
        attributesImpl.addAttribute("", "desc", "desc", "", str3);
        attributesImpl.addAttribute("", "itf", "itf", "", z ? "true" : "false");
        this.f6718sa.addElement(Printer.OPCODES[i], attributesImpl);
    }

    @Override
    public final void visitMultiANewArrayInsn(String str, int i) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "desc", "desc", "", str);
        attributesImpl.addAttribute("", "dims", "dims", "", Integer.toString(i));
        this.f6718sa.addElement(Printer.OPCODES[197], attributesImpl);
    }

    @Override
    public void visitParameter(String str, int i) {
        AttributesImpl attributesImpl = new AttributesImpl();
        if (str != null) {
            attributesImpl.addAttribute("", "name", "name", "", str);
        }
        StringBuffer stringBuffer = new StringBuffer();
        SAXClassAdapter.appendAccess(i, stringBuffer);
        attributesImpl.addAttribute("", "access", "access", "", stringBuffer.toString());
        this.f6718sa.addElement("parameter", attributesImpl);
    }

    @Override
    public AnnotationVisitor visitParameterAnnotation(int i, String str, boolean z) {
        return new SAXAnnotationAdapter(this.f6718sa, "parameterAnnotation", z ? 1 : -1, i, str);
    }

    @Override
    public final void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "min", "min", "", Integer.toString(i));
        attributesImpl.addAttribute("", "max", "max", "", Integer.toString(i2));
        attributesImpl.addAttribute("", "dflt", "dflt", "", getLabel(label));
        String str = Printer.OPCODES[170];
        this.f6718sa.addStart(str, attributesImpl);
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= labelArr.length) {
                this.f6718sa.addEnd(str);
                return;
            }
            AttributesImpl attributesImpl2 = new AttributesImpl();
            attributesImpl2.addAttribute("", "name", "name", "", getLabel(labelArr[i4]));
            this.f6718sa.addElement("label", attributesImpl2);
            i3 = i4 + 1;
        }
    }

    @Override
    public AnnotationVisitor visitTryCatchAnnotation(int i, TypePath typePath, String str, boolean z) {
        return new SAXAnnotationAdapter(this.f6718sa, "tryCatchAnnotation", z ? 1 : -1, (String) null, str, i, typePath);
    }

    @Override
    public final void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "start", "start", "", getLabel(label));
        attributesImpl.addAttribute("", "end", "end", "", getLabel(label2));
        attributesImpl.addAttribute("", "handler", "handler", "", getLabel(label3));
        if (str != null) {
            attributesImpl.addAttribute("", "type", "type", "", str);
        }
        this.f6718sa.addElement("TryCatch", attributesImpl);
    }

    @Override
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        return new SAXAnnotationAdapter(this.f6718sa, "typeAnnotation", z ? 1 : -1, (String) null, str, i, typePath);
    }

    @Override
    public final void visitTypeInsn(int i, String str) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "desc", "desc", "", str);
        this.f6718sa.addElement(Printer.OPCODES[i], attributesImpl);
    }

    @Override
    public final void visitVarInsn(int i, int i2) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "var", "var", "", Integer.toString(i2));
        this.f6718sa.addElement(Printer.OPCODES[i], attributesImpl);
    }
}
