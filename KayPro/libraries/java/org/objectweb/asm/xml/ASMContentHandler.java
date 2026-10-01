package org.objectweb.asm.xml;

import com.baidu.android.common.util.DeviceId;
import com.baidu.mobstat.Config;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ASMContentHandler extends DefaultHandler implements Opcodes {
    private static final String BASE = "class";
    static final HashMap OPCODES;
    static final HashMap TYPES;

    protected ClassVisitor f6706cv;
    protected Map labels;
    private final ArrayList stack = new ArrayList();
    String match = "";
    private final RuleSet RULES = new RuleSet();

    final class AnnotationDefaultRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnnotationDefaultRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public void begin(String str, Attributes attributes) {
            MethodVisitor methodVisitor = (MethodVisitor) this.this$0.peek();
            this.this$0.push(methodVisitor == null ? null : methodVisitor.visitAnnotationDefault());
        }

        @Override
        public void mo9031end(String str) {
            AnnotationVisitor annotationVisitor = (AnnotationVisitor) this.this$0.m9030pop();
            if (annotationVisitor != null) {
                annotationVisitor.visitEnd();
            }
        }
    }

    final class AnnotationParameterRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnnotationParameterRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public void begin(String str, Attributes attributes) {
            this.this$0.push(((MethodVisitor) this.this$0.peek()).visitParameterAnnotation(Integer.parseInt(attributes.getValue("parameter")), attributes.getValue("desc"), Boolean.valueOf(attributes.getValue("visible")).booleanValue()));
        }

        @Override
        public void mo9031end(String str) {
            AnnotationVisitor annotationVisitor = (AnnotationVisitor) this.this$0.m9030pop();
            if (annotationVisitor != null) {
                annotationVisitor.visitEnd();
            }
        }
    }

    final class AnnotationRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnnotationRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public void begin(String str, Attributes attributes) {
            String value = attributes.getValue("desc");
            boolean zBooleanValue = Boolean.valueOf(attributes.getValue("visible")).booleanValue();
            Object objPeek = this.this$0.peek();
            if (objPeek instanceof ClassVisitor) {
                this.this$0.push(((ClassVisitor) objPeek).visitAnnotation(value, zBooleanValue));
            } else if (objPeek instanceof FieldVisitor) {
                this.this$0.push(((FieldVisitor) objPeek).visitAnnotation(value, zBooleanValue));
            } else if (objPeek instanceof MethodVisitor) {
                this.this$0.push(((MethodVisitor) objPeek).visitAnnotation(value, zBooleanValue));
            }
        }

        @Override
        public void mo9031end(String str) {
            AnnotationVisitor annotationVisitor = (AnnotationVisitor) this.this$0.m9030pop();
            if (annotationVisitor != null) {
                annotationVisitor.visitEnd();
            }
        }
    }

    final class AnnotationValueAnnotationRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnnotationValueAnnotationRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public void begin(String str, Attributes attributes) {
            AnnotationVisitor annotationVisitor = (AnnotationVisitor) this.this$0.peek();
            this.this$0.push(annotationVisitor == null ? null : annotationVisitor.visitAnnotation(attributes.getValue("name"), attributes.getValue("desc")));
        }

        @Override
        public void mo9031end(String str) {
            AnnotationVisitor annotationVisitor = (AnnotationVisitor) this.this$0.m9030pop();
            if (annotationVisitor != null) {
                annotationVisitor.visitEnd();
            }
        }
    }

    final class AnnotationValueArrayRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnnotationValueArrayRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public void begin(String str, Attributes attributes) {
            AnnotationVisitor annotationVisitor = (AnnotationVisitor) this.this$0.peek();
            this.this$0.push(annotationVisitor == null ? null : annotationVisitor.visitArray(attributes.getValue("name")));
        }

        @Override
        public void mo9031end(String str) {
            AnnotationVisitor annotationVisitor = (AnnotationVisitor) this.this$0.m9030pop();
            if (annotationVisitor != null) {
                annotationVisitor.visitEnd();
            }
        }
    }

    final class AnnotationValueEnumRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnnotationValueEnumRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public void begin(String str, Attributes attributes) {
            AnnotationVisitor annotationVisitor = (AnnotationVisitor) this.this$0.peek();
            if (annotationVisitor != null) {
                annotationVisitor.visitEnum(attributes.getValue("name"), attributes.getValue("desc"), attributes.getValue("value"));
            }
        }
    }

    final class AnnotationValueRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnnotationValueRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public void begin(String str, Attributes attributes) throws SAXException {
            AnnotationVisitor annotationVisitor = (AnnotationVisitor) this.this$0.peek();
            if (annotationVisitor != null) {
                annotationVisitor.visit(attributes.getValue("name"), getValue(attributes.getValue("desc"), attributes.getValue("value")));
            }
        }
    }

    final class ClassRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ClassRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public final void begin(String str, Attributes attributes) {
            int i = Integer.parseInt(attributes.getValue("major"));
            int i2 = Integer.parseInt(attributes.getValue("minor"));
            HashMap map = new HashMap();
            map.put(Config.INPUT_DEF_VERSION, new Integer(i | (i2 << 16)));
            map.put("access", attributes.getValue("access"));
            map.put("name", attributes.getValue("name"));
            map.put("parent", attributes.getValue("parent"));
            map.put("source", attributes.getValue("source"));
            map.put("signature", attributes.getValue("signature"));
            map.put("interfaces", new ArrayList());
            this.this$0.push(map);
        }
    }

    final class ExceptionRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ExceptionRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public final void begin(String str, Attributes attributes) {
            ((ArrayList) ((HashMap) this.this$0.peek()).get("exceptions")).add(attributes.getValue("name"));
        }
    }

    final class ExceptionsRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ExceptionsRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public final void mo9031end(String str) {
            HashMap map = (HashMap) this.this$0.m9030pop();
            int access = getAccess((String) map.get("access"));
            String str2 = (String) map.get("name");
            String str3 = (String) map.get("desc");
            String str4 = (String) map.get("signature");
            ArrayList arrayList = (ArrayList) map.get("exceptions");
            this.this$0.push(this.this$0.f6706cv.visitMethod(access, str2, str3, str4, (String[]) arrayList.toArray(new String[arrayList.size()])));
        }
    }

    final class FieldRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        FieldRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public final void begin(String str, Attributes attributes) throws SAXException {
            int access = getAccess(attributes.getValue("access"));
            String value = attributes.getValue("name");
            String value2 = attributes.getValue("signature");
            String value3 = attributes.getValue("desc");
            this.this$0.push(this.this$0.f6706cv.visitField(access, value, value3, value2, getValue(value3, attributes.getValue("value"))));
        }

        @Override
        public void mo9031end(String str) {
            ((FieldVisitor) this.this$0.m9030pop()).visitEnd();
        }
    }

    final class FrameRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        FrameRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public void begin(String str, Attributes attributes) {
            HashMap map = new HashMap();
            map.put("local", new ArrayList());
            map.put("stack", new ArrayList());
            this.this$0.push(attributes.getValue("type"));
            this.this$0.push(attributes.getValue(Config.TRACE_VISIT_RECENT_COUNT) == null ? DeviceId.CUIDInfo.I_EMPTY : attributes.getValue(Config.TRACE_VISIT_RECENT_COUNT));
            this.this$0.push(map);
        }

        @Override
        public void mo9031end(String str) {
            HashMap map = (HashMap) this.this$0.m9030pop();
            ArrayList arrayList = (ArrayList) map.get("local");
            int size = arrayList.size();
            Object[] array = arrayList.toArray();
            ArrayList arrayList2 = (ArrayList) map.get("stack");
            int size2 = arrayList2.size();
            Object[] array2 = arrayList2.toArray();
            String str2 = (String) this.this$0.m9030pop();
            String str3 = (String) this.this$0.m9030pop();
            if ("NEW".equals(str3)) {
                getCodeVisitor().visitFrame(-1, size, array, size2, array2);
                return;
            }
            if ("FULL".equals(str3)) {
                getCodeVisitor().visitFrame(0, size, array, size2, array2);
                return;
            }
            if ("APPEND".equals(str3)) {
                getCodeVisitor().visitFrame(1, size, array, 0, null);
                return;
            }
            if ("CHOP".equals(str3)) {
                getCodeVisitor().visitFrame(2, Integer.parseInt(str2), null, 0, null);
            } else if ("SAME".equals(str3)) {
                getCodeVisitor().visitFrame(3, 0, null, 0, null);
            } else if ("SAME1".equals(str3)) {
                getCodeVisitor().visitFrame(4, 0, null, size2, array2);
            }
        }
    }

    final class FrameTypeRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        FrameTypeRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public void begin(String str, Attributes attributes) {
            ArrayList arrayList = (ArrayList) ((HashMap) this.this$0.peek()).get(str);
            String value = attributes.getValue("type");
            if ("uninitialized".equals(value)) {
                arrayList.add(getLabel(attributes.getValue("label")));
                return;
            }
            Integer num = (Integer) ASMContentHandler.TYPES.get(value);
            if (num == null) {
                arrayList.add(value);
            } else {
                arrayList.add(num);
            }
        }
    }

    final class InnerClassRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        InnerClassRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public final void begin(String str, Attributes attributes) {
            int access = getAccess(attributes.getValue("access"));
            this.this$0.f6706cv.visitInnerClass(attributes.getValue("name"), attributes.getValue("outerName"), attributes.getValue("innerName"), access);
        }
    }

    final class InsnAnnotationRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        InsnAnnotationRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public void begin(String str, Attributes attributes) {
            String value = attributes.getValue("desc");
            boolean zBooleanValue = Boolean.valueOf(attributes.getValue("visible")).booleanValue();
            this.this$0.push(((MethodVisitor) this.this$0.peek()).visitInsnAnnotation(Integer.parseInt(attributes.getValue("typeRef")), TypePath.fromString(attributes.getValue("typePath")), value, zBooleanValue));
        }

        @Override
        public void mo9031end(String str) {
            AnnotationVisitor annotationVisitor = (AnnotationVisitor) this.this$0.m9030pop();
            if (annotationVisitor != null) {
                annotationVisitor.visitEnd();
            }
        }
    }

    final class InterfaceRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        InterfaceRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public final void begin(String str, Attributes attributes) {
            ((ArrayList) ((HashMap) this.this$0.peek()).get("interfaces")).add(attributes.getValue("name"));
        }
    }

    final class InterfacesRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        InterfacesRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public final void mo9031end(String str) {
            HashMap map = (HashMap) this.this$0.m9030pop();
            int iIntValue = ((Integer) map.get(Config.INPUT_DEF_VERSION)).intValue();
            int access = getAccess((String) map.get("access"));
            String str2 = (String) map.get("name");
            String str3 = (String) map.get("signature");
            String str4 = (String) map.get("parent");
            ArrayList arrayList = (ArrayList) map.get("interfaces");
            this.this$0.f6706cv.visit(iIntValue, access, str2, str3, str4, (String[]) arrayList.toArray(new String[arrayList.size()]));
            this.this$0.push(this.this$0.f6706cv);
        }
    }

    final class InvokeDynamicBsmArgumentsRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        InvokeDynamicBsmArgumentsRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public final void begin(String str, Attributes attributes) throws SAXException {
            ((ArrayList) this.this$0.peek()).add(getValue(attributes.getValue("desc"), attributes.getValue("cst")));
        }
    }

    final class InvokeDynamicRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        InvokeDynamicRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public final void begin(String str, Attributes attributes) throws SAXException {
            this.this$0.push(attributes.getValue("name"));
            this.this$0.push(attributes.getValue("desc"));
            this.this$0.push(decodeHandle(attributes.getValue("bsm")));
            this.this$0.push(new ArrayList());
        }

        @Override
        public final void mo9031end(String str) {
            ArrayList arrayList = (ArrayList) this.this$0.m9030pop();
            Handle handle = (Handle) this.this$0.m9030pop();
            String str2 = (String) this.this$0.m9030pop();
            getCodeVisitor().visitInvokeDynamicInsn((String) this.this$0.m9030pop(), str2, handle, arrayList.toArray());
        }
    }

    final class LabelRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        LabelRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public final void begin(String str, Attributes attributes) {
            getCodeVisitor().visitLabel(getLabel(attributes.getValue("name")));
        }
    }

    final class LineNumberRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        LineNumberRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public final void begin(String str, Attributes attributes) {
            getCodeVisitor().visitLineNumber(Integer.parseInt(attributes.getValue("line")), getLabel(attributes.getValue("start")));
        }
    }

    final class LocalVarRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        LocalVarRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public final void begin(String str, Attributes attributes) {
            getCodeVisitor().visitLocalVariable(attributes.getValue("name"), attributes.getValue("desc"), attributes.getValue("signature"), getLabel(attributes.getValue("start")), getLabel(attributes.getValue("end")), Integer.parseInt(attributes.getValue("var")));
        }
    }

    final class LocalVariableAnnotationRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        LocalVariableAnnotationRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public void begin(String str, Attributes attributes) {
            String value = attributes.getValue("desc");
            boolean zBooleanValue = Boolean.valueOf(attributes.getValue("visible")).booleanValue();
            int i = Integer.parseInt(attributes.getValue("typeRef"));
            TypePath typePathFromString = TypePath.fromString(attributes.getValue("typePath"));
            String[] strArrSplit = attributes.getValue("start").split(" ");
            Label[] labelArr = new Label[strArrSplit.length];
            for (int i2 = 0; i2 < labelArr.length; i2++) {
                labelArr[i2] = getLabel(strArrSplit[i2]);
            }
            String[] strArrSplit2 = attributes.getValue("end").split(" ");
            Label[] labelArr2 = new Label[strArrSplit2.length];
            for (int i3 = 0; i3 < labelArr2.length; i3++) {
                labelArr2[i3] = getLabel(strArrSplit2[i3]);
            }
            String[] strArrSplit3 = attributes.getValue(Config.FEED_LIST_ITEM_INDEX).split(" ");
            int[] iArr = new int[strArrSplit3.length];
            for (int i4 = 0; i4 < iArr.length; i4++) {
                iArr[i4] = Integer.parseInt(strArrSplit3[i4]);
            }
            this.this$0.push(((MethodVisitor) this.this$0.peek()).visitLocalVariableAnnotation(i, typePathFromString, labelArr, labelArr2, iArr, value, zBooleanValue));
        }

        @Override
        public void mo9031end(String str) {
            AnnotationVisitor annotationVisitor = (AnnotationVisitor) this.this$0.m9030pop();
            if (annotationVisitor != null) {
                annotationVisitor.visitEnd();
            }
        }
    }

    final class LookupSwitchLabelRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        LookupSwitchLabelRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public final void begin(String str, Attributes attributes) {
            HashMap map = (HashMap) this.this$0.peek();
            ((ArrayList) map.get("labels")).add(getLabel(attributes.getValue("name")));
            ((ArrayList) map.get("keys")).add(attributes.getValue("key"));
        }
    }

    final class LookupSwitchRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        LookupSwitchRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public final void begin(String str, Attributes attributes) {
            HashMap map = new HashMap();
            map.put("dflt", attributes.getValue("dflt"));
            map.put("labels", new ArrayList());
            map.put("keys", new ArrayList());
            this.this$0.push(map);
        }

        @Override
        public final void mo9031end(String str) {
            HashMap map = (HashMap) this.this$0.m9030pop();
            Label label = getLabel(map.get("dflt"));
            ArrayList arrayList = (ArrayList) map.get("keys");
            ArrayList arrayList2 = (ArrayList) map.get("labels");
            Label[] labelArr = (Label[]) arrayList2.toArray(new Label[arrayList2.size()]);
            int[] iArr = new int[arrayList.size()];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= iArr.length) {
                    getCodeVisitor().visitLookupSwitchInsn(label, iArr, labelArr);
                    return;
                } else {
                    iArr[i2] = Integer.parseInt((String) arrayList.get(i2));
                    i = i2 + 1;
                }
            }
        }
    }

    final class MaxRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MaxRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public final void begin(String str, Attributes attributes) {
            getCodeVisitor().visitMaxs(Integer.parseInt(attributes.getValue("maxStack")), Integer.parseInt(attributes.getValue("maxLocals")));
        }
    }

    final class MethodParameterRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MethodParameterRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public void begin(String str, Attributes attributes) {
            getCodeVisitor().visitParameter(attributes.getValue("name"), getAccess(attributes.getValue("access")));
        }
    }

    final class MethodRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MethodRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public final void begin(String str, Attributes attributes) {
            this.this$0.labels = new HashMap();
            HashMap map = new HashMap();
            map.put("access", attributes.getValue("access"));
            map.put("name", attributes.getValue("name"));
            map.put("desc", attributes.getValue("desc"));
            map.put("signature", attributes.getValue("signature"));
            map.put("exceptions", new ArrayList());
            this.this$0.push(map);
        }

        @Override
        public final void mo9031end(String str) {
            ((MethodVisitor) this.this$0.m9030pop()).visitEnd();
            this.this$0.labels = null;
        }
    }

    final class Opcode {
        public final int opcode;
        public final int type;

        Opcode(int i, int i2) {
            this.opcode = i;
            this.type = i2;
        }
    }

    interface OpcodeGroup {
        public static final int INSN = 0;
        public static final int INSN_FIELD = 4;
        public static final int INSN_IINC = 8;
        public static final int INSN_INT = 1;
        public static final int INSN_JUMP = 6;
        public static final int INSN_LDC = 7;
        public static final int INSN_METHOD = 5;
        public static final int INSN_MULTIANEWARRAY = 9;
        public static final int INSN_TYPE = 3;
        public static final int INSN_VAR = 2;
    }

    final class OpcodesRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        OpcodesRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public final void begin(String str, Attributes attributes) throws SAXException {
            Opcode opcode = (Opcode) ASMContentHandler.OPCODES.get(str);
            if (opcode == null) {
                throw new SAXException(new StringBuffer().append("Invalid element: ").append(str).append(" at ").append(this.this$0.match).toString());
            }
            switch (opcode.type) {
                case 0:
                    getCodeVisitor().visitInsn(opcode.opcode);
                    return;
                case 1:
                    getCodeVisitor().visitIntInsn(opcode.opcode, Integer.parseInt(attributes.getValue("value")));
                    return;
                case 2:
                    getCodeVisitor().visitVarInsn(opcode.opcode, Integer.parseInt(attributes.getValue("var")));
                    return;
                case 3:
                    getCodeVisitor().visitTypeInsn(opcode.opcode, attributes.getValue("desc"));
                    return;
                case 4:
                    getCodeVisitor().visitFieldInsn(opcode.opcode, attributes.getValue("owner"), attributes.getValue("name"), attributes.getValue("desc"));
                    return;
                case 5:
                    getCodeVisitor().visitMethodInsn(opcode.opcode, attributes.getValue("owner"), attributes.getValue("name"), attributes.getValue("desc"), attributes.getValue("itf").equals("true"));
                    return;
                case 6:
                    getCodeVisitor().visitJumpInsn(opcode.opcode, getLabel(attributes.getValue("label")));
                    return;
                case 7:
                    getCodeVisitor().visitLdcInsn(getValue(attributes.getValue("desc"), attributes.getValue("cst")));
                    return;
                case 8:
                    getCodeVisitor().visitIincInsn(Integer.parseInt(attributes.getValue("var")), Integer.parseInt(attributes.getValue("inc")));
                    return;
                case 9:
                    getCodeVisitor().visitMultiANewArrayInsn(attributes.getValue("desc"), Integer.parseInt(attributes.getValue("dims")));
                    return;
                default:
                    throw new Error("Internal error");
            }
        }
    }

    final class OuterClassRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        OuterClassRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public final void begin(String str, Attributes attributes) {
            this.this$0.f6706cv.visitOuterClass(attributes.getValue("owner"), attributes.getValue("name"), attributes.getValue("desc"));
        }
    }

    public abstract class Rule {
        final ASMContentHandler this$0;
        static Class class$org$objectweb$asm$Type = class$("org.objectweb.asm.Type");
        static Class class$org$objectweb$asm$Handle = class$("org.objectweb.asm.Handle");

        protected Rule(ASMContentHandler aSMContentHandler) {
            this.this$0 = aSMContentHandler;
        }

        static Class class$(String str) {
            try {
                return Class.forName(str);
            } catch (ClassNotFoundException e) {
                throw new NoClassDefFoundError(e.getMessage());
            }
        }

        private final String decode(String str) throws SAXException {
            StringBuffer stringBuffer = new StringBuffer(str.length());
            int i = 0;
            while (i < str.length()) {
                try {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == '\\') {
                        i++;
                        if (str.charAt(i) == '\\') {
                            stringBuffer.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                        } else {
                            int i2 = i + 1;
                            stringBuffer.append((char) Integer.parseInt(str.substring(i2, i2 + 4), 16));
                            i = i2 + 3;
                        }
                    } else {
                        stringBuffer.append(cCharAt);
                    }
                    i++;
                } catch (RuntimeException e) {
                    throw new SAXException(e);
                }
            }
            return stringBuffer.toString();
        }

        public void begin(String str, Attributes attributes) throws SAXException {
        }

        Handle decodeHandle(String str) throws SAXException {
            try {
                int iIndexOf = str.indexOf(46);
                int iIndexOf2 = str.indexOf(40, iIndexOf + 1);
                int iLastIndexOf = str.lastIndexOf(40);
                return new Handle(Integer.parseInt(str.substring(iLastIndexOf + 1, str.length() - 1)), str.substring(0, iIndexOf), str.substring(iIndexOf + 1, iIndexOf2), str.substring(iIndexOf2, iLastIndexOf - 1));
            } catch (RuntimeException e) {
                throw new SAXException(new StringBuffer().append("Malformed handle ").append(str).toString(), e);
            }
        }

        public void mo9031end(String str) {
        }

        protected final int getAccess(String str) {
            int i = str.indexOf("public") != -1 ? 1 : 0;
            if (str.indexOf("private") != -1) {
                i |= 2;
            }
            if (str.indexOf("protected") != -1) {
                i |= 4;
            }
            if (str.indexOf("static") != -1) {
                i |= 8;
            }
            if (str.indexOf("final") != -1) {
                i |= 16;
            }
            if (str.indexOf("super") != -1) {
                i |= 32;
            }
            if (str.indexOf("synchronized") != -1) {
                i |= 32;
            }
            if (str.indexOf("volatile") != -1) {
                i |= 64;
            }
            if (str.indexOf("bridge") != -1) {
                i |= 64;
            }
            if (str.indexOf("varargs") != -1) {
                i |= 128;
            }
            if (str.indexOf("transient") != -1) {
                i |= 128;
            }
            if (str.indexOf("native") != -1) {
                i |= 256;
            }
            if (str.indexOf("interface") != -1) {
                i |= 512;
            }
            if (str.indexOf("abstract") != -1) {
                i |= 1024;
            }
            if (str.indexOf("strict") != -1) {
                i |= 2048;
            }
            if (str.indexOf("synthetic") != -1) {
                i |= 4096;
            }
            if (str.indexOf("annotation") != -1) {
                i |= 8192;
            }
            if (str.indexOf("enum") != -1) {
                i |= 16384;
            }
            if (str.indexOf("deprecated") != -1) {
                i |= 131072;
            }
            return str.indexOf("mandated") != -1 ? i | 32768 : i;
        }

        protected final MethodVisitor getCodeVisitor() {
            return (MethodVisitor) this.this$0.peek();
        }

        protected final Label getLabel(Object obj) {
            Label label = (Label) this.this$0.labels.get(obj);
            if (label != null) {
                return label;
            }
            Label label2 = new Label();
            this.this$0.labels.put(obj, label2);
            return label2;
        }

        protected final Object getValue(String str, String str2) throws SAXException {
            if (str2 == null) {
                return null;
            }
            if ("Ljava/lang/String;".equals(str)) {
                return decode(str2);
            }
            if ("Ljava/lang/Integer;".equals(str) || "I".equals(str) || "S".equals(str) || "B".equals(str) || "C".equals(str) || "Z".equals(str)) {
                return new Integer(str2);
            }
            if ("Ljava/lang/Short;".equals(str)) {
                return new Short(str2);
            }
            if ("Ljava/lang/Byte;".equals(str)) {
                return new Byte(str2);
            }
            if ("Ljava/lang/Character;".equals(str)) {
                return new Character(decode(str2).charAt(0));
            }
            if ("Ljava/lang/Boolean;".equals(str)) {
                return Boolean.valueOf(str2);
            }
            if ("Ljava/lang/Long;".equals(str) || "J".equals(str)) {
                return new Long(str2);
            }
            if ("Ljava/lang/Float;".equals(str) || "F".equals(str)) {
                return new Float(str2);
            }
            if ("Ljava/lang/Double;".equals(str) || "D".equals(str)) {
                return new Double(str2);
            }
            if (Type.getDescriptor(class$org$objectweb$asm$Type).equals(str)) {
                return Type.getType(str2);
            }
            if (Type.getDescriptor(class$org$objectweb$asm$Handle).equals(str)) {
                return decodeHandle(str2);
            }
            throw new SAXException(new StringBuffer().append("Invalid value:").append(str2).append(" desc:").append(str).append(" ctx:").append(this).toString());
        }
    }

    final class RuleSet {
        private final HashMap rules = new HashMap();
        private final ArrayList lpatterns = new ArrayList();
        private final ArrayList rpatterns = new ArrayList();

        RuleSet() {
        }

        public void m9032add(String str, Object obj) {
            if (str.startsWith("*/")) {
                str = str.substring(1);
                this.lpatterns.add(str);
            } else if (str.endsWith("/*")) {
                str = str.substring(0, str.length() - 1);
                this.rpatterns.add(str);
            }
            this.rules.put(str, obj);
        }

        public Object match(String str) {
            if (this.rules.containsKey(str)) {
                return this.rules.get(str);
            }
            int iLastIndexOf = str.lastIndexOf(47);
            for (String str2 : this.lpatterns) {
                if (str.substring(iLastIndexOf).endsWith(str2)) {
                    return this.rules.get(str2);
                }
            }
            for (String str3 : this.rpatterns) {
                if (str.startsWith(str3)) {
                    return this.rules.get(str3);
                }
            }
            return null;
        }
    }

    final class SourceRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        SourceRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public void begin(String str, Attributes attributes) {
            this.this$0.f6706cv.visitSource(attributes.getValue("file"), attributes.getValue("debug"));
        }
    }

    final class TableSwitchLabelRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        TableSwitchLabelRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public final void begin(String str, Attributes attributes) {
            ((ArrayList) ((HashMap) this.this$0.peek()).get("labels")).add(getLabel(attributes.getValue("name")));
        }
    }

    final class TableSwitchRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        TableSwitchRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public final void begin(String str, Attributes attributes) {
            HashMap map = new HashMap();
            map.put("min", attributes.getValue("min"));
            map.put("max", attributes.getValue("max"));
            map.put("dflt", attributes.getValue("dflt"));
            map.put("labels", new ArrayList());
            this.this$0.push(map);
        }

        @Override
        public final void mo9031end(String str) {
            HashMap map = (HashMap) this.this$0.m9030pop();
            int i = Integer.parseInt((String) map.get("min"));
            int i2 = Integer.parseInt((String) map.get("max"));
            Label label = getLabel(map.get("dflt"));
            ArrayList arrayList = (ArrayList) map.get("labels");
            getCodeVisitor().visitTableSwitchInsn(i, i2, label, (Label[]) arrayList.toArray(new Label[arrayList.size()]));
        }
    }

    final class TryCatchAnnotationRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        TryCatchAnnotationRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public void begin(String str, Attributes attributes) {
            String value = attributes.getValue("desc");
            boolean zBooleanValue = Boolean.valueOf(attributes.getValue("visible")).booleanValue();
            this.this$0.push(((MethodVisitor) this.this$0.peek()).visitTryCatchAnnotation(Integer.parseInt(attributes.getValue("typeRef")), TypePath.fromString(attributes.getValue("typePath")), value, zBooleanValue));
        }

        @Override
        public void mo9031end(String str) {
            AnnotationVisitor annotationVisitor = (AnnotationVisitor) this.this$0.m9030pop();
            if (annotationVisitor != null) {
                annotationVisitor.visitEnd();
            }
        }
    }

    final class TryCatchRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        TryCatchRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public final void begin(String str, Attributes attributes) {
            getCodeVisitor().visitTryCatchBlock(getLabel(attributes.getValue("start")), getLabel(attributes.getValue("end")), getLabel(attributes.getValue("handler")), attributes.getValue("type"));
        }
    }

    final class TypeAnnotationRule extends Rule {
        final ASMContentHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        TypeAnnotationRule(ASMContentHandler aSMContentHandler) {
            super(aSMContentHandler);
            this.this$0 = aSMContentHandler;
        }

        @Override
        public void begin(String str, Attributes attributes) {
            String value = attributes.getValue("desc");
            boolean zBooleanValue = Boolean.valueOf(attributes.getValue("visible")).booleanValue();
            int i = Integer.parseInt(attributes.getValue("typeRef"));
            TypePath typePathFromString = TypePath.fromString(attributes.getValue("typePath"));
            Object objPeek = this.this$0.peek();
            if (objPeek instanceof ClassVisitor) {
                this.this$0.push(((ClassVisitor) objPeek).visitTypeAnnotation(i, typePathFromString, value, zBooleanValue));
            } else if (objPeek instanceof FieldVisitor) {
                this.this$0.push(((FieldVisitor) objPeek).visitTypeAnnotation(i, typePathFromString, value, zBooleanValue));
            } else if (objPeek instanceof MethodVisitor) {
                this.this$0.push(((MethodVisitor) objPeek).visitTypeAnnotation(i, typePathFromString, value, zBooleanValue));
            }
        }

        @Override
        public void mo9031end(String str) {
            AnnotationVisitor annotationVisitor = (AnnotationVisitor) this.this$0.m9030pop();
            if (annotationVisitor != null) {
                annotationVisitor.visitEnd();
            }
        }
    }

    static {
        _clinit_();
        OPCODES = new HashMap();
        addOpcode("NOP", 0, 0);
        addOpcode("ACONST_NULL", 1, 0);
        addOpcode("ICONST_M1", 2, 0);
        addOpcode("ICONST_0", 3, 0);
        addOpcode("ICONST_1", 4, 0);
        addOpcode("ICONST_2", 5, 0);
        addOpcode("ICONST_3", 6, 0);
        addOpcode("ICONST_4", 7, 0);
        addOpcode("ICONST_5", 8, 0);
        addOpcode("LCONST_0", 9, 0);
        addOpcode("LCONST_1", 10, 0);
        addOpcode("FCONST_0", 11, 0);
        addOpcode("FCONST_1", 12, 0);
        addOpcode("FCONST_2", 13, 0);
        addOpcode("DCONST_0", 14, 0);
        addOpcode("DCONST_1", 15, 0);
        addOpcode("BIPUSH", 16, 1);
        addOpcode("SIPUSH", 17, 1);
        addOpcode("LDC", 18, 7);
        addOpcode("ILOAD", 21, 2);
        addOpcode("LLOAD", 22, 2);
        addOpcode("FLOAD", 23, 2);
        addOpcode("DLOAD", 24, 2);
        addOpcode("ALOAD", 25, 2);
        addOpcode("IALOAD", 46, 0);
        addOpcode("LALOAD", 47, 0);
        addOpcode("FALOAD", 48, 0);
        addOpcode("DALOAD", 49, 0);
        addOpcode("AALOAD", 50, 0);
        addOpcode("BALOAD", 51, 0);
        addOpcode("CALOAD", 52, 0);
        addOpcode("SALOAD", 53, 0);
        addOpcode("ISTORE", 54, 2);
        addOpcode("LSTORE", 55, 2);
        addOpcode("FSTORE", 56, 2);
        addOpcode("DSTORE", 57, 2);
        addOpcode("ASTORE", 58, 2);
        addOpcode("IASTORE", 79, 0);
        addOpcode("LASTORE", 80, 0);
        addOpcode("FASTORE", 81, 0);
        addOpcode("DASTORE", 82, 0);
        addOpcode("AASTORE", 83, 0);
        addOpcode("BASTORE", 84, 0);
        addOpcode("CASTORE", 85, 0);
        addOpcode("SASTORE", 86, 0);
        addOpcode("POP", 87, 0);
        addOpcode("POP2", 88, 0);
        addOpcode("DUP", 89, 0);
        addOpcode("DUP_X1", 90, 0);
        addOpcode("DUP_X2", 91, 0);
        addOpcode("DUP2", 92, 0);
        addOpcode("DUP2_X1", 93, 0);
        addOpcode("DUP2_X2", 94, 0);
        addOpcode("SWAP", 95, 0);
        addOpcode("IADD", 96, 0);
        addOpcode("LADD", 97, 0);
        addOpcode("FADD", 98, 0);
        addOpcode("DADD", 99, 0);
        addOpcode("ISUB", 100, 0);
        addOpcode("LSUB", 101, 0);
        addOpcode("FSUB", 102, 0);
        addOpcode("DSUB", 103, 0);
        addOpcode("IMUL", 104, 0);
        addOpcode("LMUL", 105, 0);
        addOpcode("FMUL", 106, 0);
        addOpcode("DMUL", 107, 0);
        addOpcode("IDIV", 108, 0);
        addOpcode("LDIV", 109, 0);
        addOpcode("FDIV", 110, 0);
        addOpcode("DDIV", 111, 0);
        addOpcode("IREM", 112, 0);
        addOpcode("LREM", 113, 0);
        addOpcode("FREM", 114, 0);
        addOpcode("DREM", 115, 0);
        addOpcode("INEG", 116, 0);
        addOpcode("LNEG", 117, 0);
        addOpcode("FNEG", 118, 0);
        addOpcode("DNEG", 119, 0);
        addOpcode("ISHL", 120, 0);
        addOpcode("LSHL", 121, 0);
        addOpcode("ISHR", 122, 0);
        addOpcode("LSHR", 123, 0);
        addOpcode("IUSHR", 124, 0);
        addOpcode("LUSHR", 125, 0);
        addOpcode("IAND", 126, 0);
        addOpcode("LAND", 127, 0);
        addOpcode("IOR", 128, 0);
        addOpcode("LOR", 129, 0);
        addOpcode("IXOR", 130, 0);
        addOpcode("LXOR", 131, 0);
        addOpcode("IINC", 132, 8);
        addOpcode("I2L", 133, 0);
        addOpcode("I2F", 134, 0);
        addOpcode("I2D", 135, 0);
        addOpcode("L2I", 136, 0);
        addOpcode("L2F", 137, 0);
        addOpcode("L2D", 138, 0);
        addOpcode("F2I", 139, 0);
        addOpcode("F2L", 140, 0);
        addOpcode("F2D", 141, 0);
        addOpcode("D2I", 142, 0);
        addOpcode("D2L", 143, 0);
        addOpcode("D2F", 144, 0);
        addOpcode("I2B", 145, 0);
        addOpcode("I2C", 146, 0);
        addOpcode("I2S", 147, 0);
        addOpcode("LCMP", 148, 0);
        addOpcode("FCMPL", 149, 0);
        addOpcode("FCMPG", 150, 0);
        addOpcode("DCMPL", 151, 0);
        addOpcode("DCMPG", 152, 0);
        addOpcode("IFEQ", 153, 6);
        addOpcode("IFNE", 154, 6);
        addOpcode("IFLT", 155, 6);
        addOpcode("IFGE", 156, 6);
        addOpcode("IFGT", 157, 6);
        addOpcode("IFLE", 158, 6);
        addOpcode("IF_ICMPEQ", 159, 6);
        addOpcode("IF_ICMPNE", 160, 6);
        addOpcode("IF_ICMPLT", 161, 6);
        addOpcode("IF_ICMPGE", 162, 6);
        addOpcode("IF_ICMPGT", 163, 6);
        addOpcode("IF_ICMPLE", 164, 6);
        addOpcode("IF_ACMPEQ", 165, 6);
        addOpcode("IF_ACMPNE", 166, 6);
        addOpcode("GOTO", 167, 6);
        addOpcode("JSR", 168, 6);
        addOpcode("RET", 169, 2);
        addOpcode("IRETURN", 172, 0);
        addOpcode("LRETURN", 173, 0);
        addOpcode("FRETURN", 174, 0);
        addOpcode("DRETURN", 175, 0);
        addOpcode("ARETURN", 176, 0);
        addOpcode("RETURN", 177, 0);
        addOpcode("GETSTATIC", 178, 4);
        addOpcode("PUTSTATIC", 179, 4);
        addOpcode("GETFIELD", 180, 4);
        addOpcode("PUTFIELD", 181, 4);
        addOpcode("INVOKEVIRTUAL", 182, 5);
        addOpcode("INVOKESPECIAL", 183, 5);
        addOpcode("INVOKESTATIC", 184, 5);
        addOpcode("INVOKEINTERFACE", 185, 5);
        addOpcode("NEW", 187, 3);
        addOpcode("NEWARRAY", 188, 1);
        addOpcode("ANEWARRAY", 189, 3);
        addOpcode("ARRAYLENGTH", 190, 0);
        addOpcode("ATHROW", 191, 0);
        addOpcode("CHECKCAST", 192, 3);
        addOpcode("INSTANCEOF", 193, 3);
        addOpcode("MONITORENTER", 194, 0);
        addOpcode("MONITOREXIT", 195, 0);
        addOpcode("MULTIANEWARRAY", 197, 9);
        addOpcode("IFNULL", 198, 6);
        addOpcode("IFNONNULL", 199, 6);
        TYPES = new HashMap();
        String[] strArr = SAXCodeAdapter.TYPES;
        for (int i = 0; i < strArr.length; i++) {
            TYPES.put(strArr[i], new Integer(i));
        }
    }

    public ASMContentHandler(ClassVisitor classVisitor) {
        this.RULES.m9032add("class", new ClassRule(this));
        this.RULES.m9032add("class/interfaces/interface", new InterfaceRule(this));
        this.RULES.m9032add("class/interfaces", new InterfacesRule(this));
        this.RULES.m9032add("class/outerclass", new OuterClassRule(this));
        this.RULES.m9032add("class/innerclass", new InnerClassRule(this));
        this.RULES.m9032add("class/source", new SourceRule(this));
        this.RULES.m9032add("class/field", new FieldRule(this));
        this.RULES.m9032add("class/method", new MethodRule(this));
        this.RULES.m9032add("class/method/exceptions/exception", new ExceptionRule(this));
        this.RULES.m9032add("class/method/exceptions", new ExceptionsRule(this));
        this.RULES.m9032add("class/method/parameter", new MethodParameterRule(this));
        this.RULES.m9032add("class/method/annotationDefault", new AnnotationDefaultRule(this));
        this.RULES.m9032add("class/method/code/*", new OpcodesRule(this));
        this.RULES.m9032add("class/method/code/frame", new FrameRule(this));
        this.RULES.m9032add("class/method/code/frame/local", new FrameTypeRule(this));
        this.RULES.m9032add("class/method/code/frame/stack", new FrameTypeRule(this));
        this.RULES.m9032add("class/method/code/TABLESWITCH", new TableSwitchRule(this));
        this.RULES.m9032add("class/method/code/TABLESWITCH/label", new TableSwitchLabelRule(this));
        this.RULES.m9032add("class/method/code/LOOKUPSWITCH", new LookupSwitchRule(this));
        this.RULES.m9032add("class/method/code/LOOKUPSWITCH/label", new LookupSwitchLabelRule(this));
        this.RULES.m9032add("class/method/code/INVOKEDYNAMIC", new InvokeDynamicRule(this));
        this.RULES.m9032add("class/method/code/INVOKEDYNAMIC/bsmArg", new InvokeDynamicBsmArgumentsRule(this));
        this.RULES.m9032add("class/method/code/Label", new LabelRule(this));
        this.RULES.m9032add("class/method/code/TryCatch", new TryCatchRule(this));
        this.RULES.m9032add("class/method/code/LineNumber", new LineNumberRule(this));
        this.RULES.m9032add("class/method/code/LocalVar", new LocalVarRule(this));
        this.RULES.m9032add("class/method/code/Max", new MaxRule(this));
        this.RULES.m9032add("*/annotation", new AnnotationRule(this));
        this.RULES.m9032add("*/typeAnnotation", new TypeAnnotationRule(this));
        this.RULES.m9032add("*/parameterAnnotation", new AnnotationParameterRule(this));
        this.RULES.m9032add("*/insnAnnotation", new InsnAnnotationRule(this));
        this.RULES.m9032add("*/tryCatchAnnotation", new TryCatchAnnotationRule(this));
        this.RULES.m9032add("*/localVariableAnnotation", new LocalVariableAnnotationRule(this));
        this.RULES.m9032add("*/annotationValue", new AnnotationValueRule(this));
        this.RULES.m9032add("*/annotationValueAnnotation", new AnnotationValueAnnotationRule(this));
        this.RULES.m9032add("*/annotationValueEnum", new AnnotationValueEnumRule(this));
        this.RULES.m9032add("*/annotationValueArray", new AnnotationValueArrayRule(this));
        this.f6706cv = classVisitor;
    }

    static void _clinit_() {
    }

    private static void addOpcode(String str, int i, int i2) {
        OPCODES.put(str, new Opcode(i, i2));
    }

    @Override
    public final void endElement(String str, String str2, String str3) throws SAXException {
        if (str2 == null || str2.length() == 0) {
            str2 = str3;
        }
        Rule rule = (Rule) this.RULES.match(this.match);
        if (rule != null) {
            rule.mo9031end(str2);
        }
        int iLastIndexOf = this.match.lastIndexOf(47);
        if (iLastIndexOf >= 0) {
            this.match = this.match.substring(0, iLastIndexOf);
        } else {
            this.match = "";
        }
    }

    final Object peek() {
        int size = this.stack.size();
        if (size == 0) {
            return null;
        }
        return this.stack.get(size - 1);
    }

    final Object m9030pop() {
        int size = this.stack.size();
        if (size == 0) {
            return null;
        }
        return this.stack.remove(size - 1);
    }

    final void push(Object obj) {
        this.stack.add(obj);
    }

    @Override
    public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        if (str2 == null || str2.length() == 0) {
            str2 = str3;
        }
        StringBuffer stringBuffer = new StringBuffer(this.match);
        if (this.match.length() > 0) {
            stringBuffer.append('/');
        }
        stringBuffer.append(str2);
        this.match = stringBuffer.toString();
        Rule rule = (Rule) this.RULES.match(this.match);
        if (rule != null) {
            rule.begin(str2, attributes);
        }
    }
}
