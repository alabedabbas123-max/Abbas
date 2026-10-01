package org.objectweb.asm.xml;

import com.github.megatronking.svg.generator.svg.model.SvgConstants;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypePath;
import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.AttributesImpl;

public final class SAXClassAdapter extends ClassVisitor {

    SAXAdapter f6717sa;
    private final boolean singleDocument;

    public SAXClassAdapter(ContentHandler contentHandler, boolean z) {
        super(Opcodes.ASM5);
        this.f6717sa = new SAXAdapter(contentHandler);
        this.singleDocument = z;
        if (z) {
            return;
        }
        this.f6717sa.addDocumentStart();
    }

    static void appendAccess(int i, StringBuffer stringBuffer) {
        if ((i & 1) != 0) {
            stringBuffer.append("public ");
        }
        if ((i & 2) != 0) {
            stringBuffer.append("private ");
        }
        if ((i & 4) != 0) {
            stringBuffer.append("protected ");
        }
        if ((i & 16) != 0) {
            stringBuffer.append("final ");
        }
        if ((i & 8) != 0) {
            stringBuffer.append("static ");
        }
        if ((i & 32) != 0) {
            if ((262144 & i) == 0) {
                stringBuffer.append("synchronized ");
            } else {
                stringBuffer.append("super ");
            }
        }
        if ((i & 64) != 0) {
            if ((i & 524288) == 0) {
                stringBuffer.append("bridge ");
            } else {
                stringBuffer.append("volatile ");
            }
        }
        if ((i & 128) != 0) {
            if ((i & 524288) == 0) {
                stringBuffer.append("varargs ");
            } else {
                stringBuffer.append("transient ");
            }
        }
        if ((i & 256) != 0) {
            stringBuffer.append("native ");
        }
        if ((i & 2048) != 0) {
            stringBuffer.append("strict ");
        }
        if ((i & 512) != 0) {
            stringBuffer.append("interface ");
        }
        if ((i & 1024) != 0) {
            stringBuffer.append("abstract ");
        }
        if ((i & 4096) != 0) {
            stringBuffer.append("synthetic ");
        }
        if ((i & 8192) != 0) {
            stringBuffer.append("annotation ");
        }
        if ((i & 16384) != 0) {
            stringBuffer.append("enum ");
        }
        if ((131072 & i) != 0) {
            stringBuffer.append("deprecated ");
        }
        if ((32768 & i) != 0) {
            stringBuffer.append("mandated ");
        }
    }

    static final String encode(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                stringBuffer.append("\\\\");
            } else if (cCharAt < ' ' || cCharAt > 127) {
                stringBuffer.append("\\u");
                if (cCharAt < 16) {
                    stringBuffer.append("000");
                } else if (cCharAt < 256) {
                    stringBuffer.append("00");
                } else if (cCharAt < 4096) {
                    stringBuffer.append('0');
                }
                stringBuffer.append(Integer.toString(cCharAt, 16));
            } else {
                stringBuffer.append(cCharAt);
            }
        }
        return stringBuffer.toString();
    }

    @Override
    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        appendAccess(262144 | i2, stringBuffer);
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "access", "access", "", stringBuffer.toString());
        if (str != null) {
            attributesImpl.addAttribute("", "name", "name", "", str);
        }
        if (str2 != null) {
            attributesImpl.addAttribute("", "signature", "signature", "", encode(str2));
        }
        if (str3 != null) {
            attributesImpl.addAttribute("", "parent", "parent", "", str3);
        }
        attributesImpl.addAttribute("", "major", "major", "", Integer.toString(65535 & i));
        attributesImpl.addAttribute("", "minor", "minor", "", Integer.toString(i >>> 16));
        this.f6717sa.addStart(SvgConstants.ATTR_CLASS, attributesImpl);
        this.f6717sa.addStart("interfaces", new AttributesImpl());
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= strArr.length) {
                    break;
                }
                AttributesImpl attributesImpl2 = new AttributesImpl();
                attributesImpl2.addAttribute("", "name", "name", "", strArr[i4]);
                this.f6717sa.addElement("interface", attributesImpl2);
                i3 = i4 + 1;
            }
        }
        this.f6717sa.addEnd("interfaces");
    }

    @Override
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        return new SAXAnnotationAdapter(this.f6717sa, "annotation", z ? 1 : -1, (String) null, str);
    }

    @Override
    public final void visitEnd() {
        this.f6717sa.addEnd(SvgConstants.ATTR_CLASS);
        if (this.singleDocument) {
            return;
        }
        this.f6717sa.addDocumentEnd();
    }

    @Override
    public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        StringBuffer stringBuffer = new StringBuffer();
        appendAccess(524288 | i, stringBuffer);
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "access", "access", "", stringBuffer.toString());
        attributesImpl.addAttribute("", "name", "name", "", str);
        attributesImpl.addAttribute("", "desc", "desc", "", str2);
        if (str3 != null) {
            attributesImpl.addAttribute("", "signature", "signature", "", encode(str3));
        }
        if (obj != null) {
            attributesImpl.addAttribute("", "value", "value", "", encode(obj.toString()));
        }
        return new SAXFieldAdapter(this.f6717sa, attributesImpl);
    }

    @Override
    public final void visitInnerClass(String str, String str2, String str3, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        appendAccess(1048576 | i, stringBuffer);
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "access", "access", "", stringBuffer.toString());
        if (str != null) {
            attributesImpl.addAttribute("", "name", "name", "", str);
        }
        if (str2 != null) {
            attributesImpl.addAttribute("", "outerName", "outerName", "", str2);
        }
        if (str3 != null) {
            attributesImpl.addAttribute("", "innerName", "innerName", "", str3);
        }
        this.f6717sa.addElement("innerclass", attributesImpl);
    }

    @Override
    public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        appendAccess(i, stringBuffer);
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "access", "access", "", stringBuffer.toString());
        attributesImpl.addAttribute("", "name", "name", "", str);
        attributesImpl.addAttribute("", "desc", "desc", "", str2);
        if (str3 != null) {
            attributesImpl.addAttribute("", "signature", "signature", "", str3);
        }
        this.f6717sa.addStart("method", attributesImpl);
        this.f6717sa.addStart("exceptions", new AttributesImpl());
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= strArr.length) {
                    break;
                }
                AttributesImpl attributesImpl2 = new AttributesImpl();
                attributesImpl2.addAttribute("", "name", "name", "", strArr[i3]);
                this.f6717sa.addElement("exception", attributesImpl2);
                i2 = i3 + 1;
            }
        }
        this.f6717sa.addEnd("exceptions");
        return new SAXCodeAdapter(this.f6717sa, i);
    }

    @Override
    public void visitOuterClass(String str, String str2, String str3) {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute("", "owner", "owner", "", str);
        if (str2 != null) {
            attributesImpl.addAttribute("", "name", "name", "", str2);
        }
        if (str3 != null) {
            attributesImpl.addAttribute("", "desc", "desc", "", str3);
        }
        this.f6717sa.addElement("outerclass", attributesImpl);
    }

    @Override
    public void visitSource(String str, String str2) {
        AttributesImpl attributesImpl = new AttributesImpl();
        if (str != null) {
            attributesImpl.addAttribute("", "file", "file", "", encode(str));
        }
        if (str2 != null) {
            attributesImpl.addAttribute("", "debug", "debug", "", encode(str2));
        }
        this.f6717sa.addElement("source", attributesImpl);
    }

    @Override
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        return new SAXAnnotationAdapter(this.f6717sa, "typeAnnotation", z ? 1 : -1, (String) null, str, i, typePath);
    }
}
