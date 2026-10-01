package org.objectweb.asm.xml;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypePath;
import org.xml.sax.Attributes;

public final class SAXFieldAdapter extends FieldVisitor {

    SAXAdapter f6719sa;

    public SAXFieldAdapter(SAXAdapter sAXAdapter, Attributes attributes) {
        super(Opcodes.ASM5);
        this.f6719sa = sAXAdapter;
        sAXAdapter.addStart("field", attributes);
    }

    @Override
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        return new SAXAnnotationAdapter(this.f6719sa, "annotation", z ? 1 : -1, (String) null, str);
    }

    @Override
    public void visitEnd() {
        this.f6719sa.addEnd("field");
    }

    @Override
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        return new SAXAnnotationAdapter(this.f6719sa, "typeAnnotation", z ? 1 : -1, (String) null, str, i, typePath);
    }
}
