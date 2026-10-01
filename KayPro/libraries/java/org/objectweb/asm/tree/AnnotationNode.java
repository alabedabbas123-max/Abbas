package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Opcodes;

public class AnnotationNode extends AnnotationVisitor {
    static Class class$org$objectweb$asm$tree$AnnotationNode = class$("org.objectweb.asm.tree.AnnotationNode");
    public String desc;
    public List values;

    public AnnotationNode(int i, String str) {
        super(i);
        this.desc = str;
    }

    public AnnotationNode(String str) {
        this(Opcodes.ASM5, str);
        if (getClass() != class$org$objectweb$asm$tree$AnnotationNode) {
            throw new IllegalStateException();
        }
    }

    AnnotationNode(List list) {
        super(Opcodes.ASM5);
        this.values = list;
    }

    static void accept(AnnotationVisitor annotationVisitor, String str, Object obj) {
        if (annotationVisitor != null) {
            if (obj instanceof String[]) {
                String[] strArr = (String[]) obj;
                annotationVisitor.visitEnum(str, strArr[0], strArr[1]);
                return;
            }
            if (obj instanceof AnnotationNode) {
                AnnotationNode annotationNode = (AnnotationNode) obj;
                annotationNode.accept(annotationVisitor.visitAnnotation(str, annotationNode.desc));
                return;
            }
            if (!(obj instanceof List)) {
                annotationVisitor.visit(str, obj);
                return;
            }
            AnnotationVisitor annotationVisitorVisitArray = annotationVisitor.visitArray(str);
            if (annotationVisitorVisitArray != null) {
                List list = (List) obj;
                for (int i = 0; i < list.size(); i++) {
                    accept(annotationVisitorVisitArray, null, list.get(i));
                }
                annotationVisitorVisitArray.visitEnd();
            }
        }
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public void accept(AnnotationVisitor annotationVisitor) {
        if (annotationVisitor != null) {
            if (this.values != null) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= this.values.size()) {
                        break;
                    }
                    accept(annotationVisitor, (String) this.values.get(i2), this.values.get(i2 + 1));
                    i = i2 + 2;
                }
            }
            annotationVisitor.visitEnd();
        }
    }

    public void check(int i) {
    }

    @Override
    public void visit(String str, Object obj) {
        if (this.values == null) {
            this.values = new ArrayList(this.desc != null ? 2 : 1);
        }
        if (this.desc != null) {
            this.values.add(str);
        }
        this.values.add(obj);
    }

    @Override
    public AnnotationVisitor visitAnnotation(String str, String str2) {
        if (this.values == null) {
            this.values = new ArrayList(this.desc != null ? 2 : 1);
        }
        if (this.desc != null) {
            this.values.add(str);
        }
        AnnotationNode annotationNode = new AnnotationNode(str2);
        this.values.add(annotationNode);
        return annotationNode;
    }

    @Override
    public AnnotationVisitor visitArray(String str) {
        if (this.values == null) {
            this.values = new ArrayList(this.desc != null ? 2 : 1);
        }
        if (this.desc != null) {
            this.values.add(str);
        }
        ArrayList arrayList = new ArrayList();
        this.values.add(arrayList);
        return new AnnotationNode(arrayList);
    }

    @Override
    public void visitEnd() {
    }

    @Override
    public void visitEnum(String str, String str2, String str3) {
        if (this.values == null) {
            this.values = new ArrayList(this.desc != null ? 2 : 1);
        }
        if (this.desc != null) {
            this.values.add(str);
        }
        this.values.add(new String[]{str2, str3});
    }
}
