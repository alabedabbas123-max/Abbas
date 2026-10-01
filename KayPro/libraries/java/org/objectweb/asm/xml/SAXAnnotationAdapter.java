package org.objectweb.asm.xml;

import com.baidu.mobstat.Config;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
import org.xml.sax.helpers.AttributesImpl;

public final class SAXAnnotationAdapter extends AnnotationVisitor {
    private final String elementName;

    SAXAdapter f6716sa;

    protected SAXAnnotationAdapter(int i, SAXAdapter sAXAdapter, String str, int i2, String str2, String str3, int i3) {
        this(i, sAXAdapter, str, i2, str2, str3, i3, -1, null, null, null, null);
    }

    protected SAXAnnotationAdapter(int i, SAXAdapter sAXAdapter, String str, int i2, String str2, String str3, int i3, int i4, TypePath typePath, String[] strArr, String[] strArr2, int[] iArr) {
        super(i);
        this.f6716sa = sAXAdapter;
        this.elementName = str;
        AttributesImpl attributesImpl = new AttributesImpl();
        if (str3 != null) {
            attributesImpl.addAttribute("", "name", "name", "", str3);
        }
        if (i2 != 0) {
            attributesImpl.addAttribute("", "visible", "visible", "", i2 > 0 ? "true" : "false");
        }
        if (i3 != -1) {
            attributesImpl.addAttribute("", "parameter", "parameter", "", Integer.toString(i3));
        }
        if (str2 != null) {
            attributesImpl.addAttribute("", "desc", "desc", "", str2);
        }
        if (i4 != -1) {
            attributesImpl.addAttribute("", "typeRef", "typeRef", "", Integer.toString(i4));
        }
        if (typePath != null) {
            attributesImpl.addAttribute("", "typePath", "typePath", "", typePath.toString());
        }
        if (strArr != null) {
            StringBuffer stringBuffer = new StringBuffer(strArr[0]);
            for (int i5 = 1; i5 < strArr.length; i5++) {
                stringBuffer.append(" ").append(strArr[i5]);
            }
            attributesImpl.addAttribute("", "start", "start", "", stringBuffer.toString());
        }
        if (strArr2 != null) {
            StringBuffer stringBuffer2 = new StringBuffer(strArr2[0]);
            for (int i6 = 1; i6 < strArr2.length; i6++) {
                stringBuffer2.append(" ").append(strArr2[i6]);
            }
            attributesImpl.addAttribute("", "end", "end", "", stringBuffer2.toString());
        }
        if (iArr != null) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(iArr[0]);
            for (int i7 = 1; i7 < iArr.length; i7++) {
                stringBuffer3.append(" ").append(iArr[i7]);
            }
            attributesImpl.addAttribute("", Config.FEED_LIST_ITEM_INDEX, Config.FEED_LIST_ITEM_INDEX, "", stringBuffer3.toString());
        }
        sAXAdapter.addStart(str, attributesImpl);
    }

    public SAXAnnotationAdapter(SAXAdapter sAXAdapter, String str, int i, int i2, String str2) {
        this(Opcodes.ASM5, sAXAdapter, str, i, str2, null, i2, -1, null, null, null, null);
    }

    public SAXAnnotationAdapter(SAXAdapter sAXAdapter, String str, int i, String str2, String str3) {
        this(Opcodes.ASM5, sAXAdapter, str, i, str3, str2, -1, -1, null, null, null, null);
    }

    public SAXAnnotationAdapter(SAXAdapter sAXAdapter, String str, int i, String str2, String str3, int i2, TypePath typePath) {
        this(Opcodes.ASM5, sAXAdapter, str, i, str3, str2, -1, i2, typePath, null, null, null);
    }

    public SAXAnnotationAdapter(SAXAdapter sAXAdapter, String str, int i, String str2, String str3, int i2, TypePath typePath, String[] strArr, String[] strArr2, int[] iArr) {
        this(Opcodes.ASM5, sAXAdapter, str, i, str3, str2, -1, i2, typePath, strArr, strArr2, iArr);
    }

    private void addValueElement(String str, String str2, String str3, String str4) {
        AttributesImpl attributesImpl = new AttributesImpl();
        if (str2 != null) {
            attributesImpl.addAttribute("", "name", "name", "", str2);
        }
        if (str3 != null) {
            attributesImpl.addAttribute("", "desc", "desc", "", str3);
        }
        if (str4 != null) {
            attributesImpl.addAttribute("", "value", "value", "", SAXClassAdapter.encode(str4));
        }
        this.f6716sa.addElement(str, attributesImpl);
    }

    @Override
    public void visit(String str, Object obj) {
        int i = 0;
        Class<?> cls = obj.getClass();
        if (!cls.isArray()) {
            addValueElement("annotationValue", str, Type.getDescriptor(cls), obj.toString());
            return;
        }
        AnnotationVisitor annotationVisitorVisitArray = visitArray(str);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            while (i < bArr.length) {
                annotationVisitorVisitArray.visit(null, new Byte(bArr[i]));
                i++;
            }
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            while (i < cArr.length) {
                annotationVisitorVisitArray.visit(null, new Character(cArr[i]));
                i++;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            while (i < sArr.length) {
                annotationVisitorVisitArray.visit(null, new Short(sArr[i]));
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            while (i < zArr.length) {
                annotationVisitorVisitArray.visit(null, Boolean.valueOf(zArr[i]));
                i++;
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            while (i < iArr.length) {
                annotationVisitorVisitArray.visit(null, new Integer(iArr[i]));
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            while (i < jArr.length) {
                annotationVisitorVisitArray.visit(null, new Long(jArr[i]));
                i++;
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            while (i < fArr.length) {
                annotationVisitorVisitArray.visit(null, new Float(fArr[i]));
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            while (i < dArr.length) {
                annotationVisitorVisitArray.visit(null, new Double(dArr[i]));
                i++;
            }
        }
        annotationVisitorVisitArray.visitEnd();
    }

    @Override
    public AnnotationVisitor visitAnnotation(String str, String str2) {
        return new SAXAnnotationAdapter(this.f6716sa, "annotationValueAnnotation", 0, str, str2);
    }

    @Override
    public AnnotationVisitor visitArray(String str) {
        return new SAXAnnotationAdapter(this.f6716sa, "annotationValueArray", 0, str, (String) null);
    }

    @Override
    public void visitEnd() {
        this.f6716sa.addEnd(this.elementName);
    }

    @Override
    public void visitEnum(String str, String str2, String str3) {
        addValueElement("annotationValueEnum", str, str2, str3);
    }
}
