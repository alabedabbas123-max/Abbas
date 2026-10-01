package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.annotation.Annotations;
import com.almlkaide.kaypro.android.dx.rop.annotation.AnnotationsList;
import com.almlkaide.kaypro.android.dx.rop.code.AccessFlags;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstArray;
import com.almlkaide.kaypro.android.dx.rop.cst.CstFieldRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.type.StdTypeList;
import com.almlkaide.kaypro.android.dx.rop.type.TypeList;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;
import com.almlkaide.kaypro.android.dx.util.Writers;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;

public final class ClassDefItem extends IndexedItem {
    private final int accessFlags;
    private AnnotationsDirectoryItem annotationsDirectory;
    private final ClassDataItem classData;
    private TypeListItem interfaces;
    private final CstString sourceFile;
    private EncodedArrayItem staticValuesItem;
    private final CstType superclass;
    private final CstType thisClass;

    public ClassDefItem(CstType cstType, int i, CstType cstType2, TypeList typeList, CstString cstString) {
        if (cstType == null) {
            throw new NullPointerException("thisClass == null");
        }
        if (typeList == null) {
            throw new NullPointerException("interfaces == null");
        }
        this.thisClass = cstType;
        this.accessFlags = i;
        this.superclass = cstType2;
        this.interfaces = typeList.size() == 0 ? (TypeListItem) null : new TypeListItem(typeList);
        this.sourceFile = cstString;
        this.classData = new ClassDataItem(cstType);
        this.staticValuesItem = (EncodedArrayItem) null;
        this.annotationsDirectory = new AnnotationsDirectoryItem();
    }

    @Override
    public ItemType itemType() {
        return ItemType.TYPE_CLASS_DEF_ITEM;
    }

    @Override
    public int writeSize() {
        return 32;
    }

    @Override
    public void addContents(DexFile dexFile) {
        TypeIdsSection typeIds = dexFile.getTypeIds();
        MixedItemSection byteData = dexFile.getByteData();
        MixedItemSection wordData = dexFile.getWordData();
        MixedItemSection typeLists = dexFile.getTypeLists();
        StringIdsSection stringIds = dexFile.getStringIds();
        typeIds.intern(this.thisClass);
        if (!this.classData.isEmpty()) {
            dexFile.getClassData().m7168add(this.classData);
            CstArray staticValuesConstant = this.classData.getStaticValuesConstant();
            if (staticValuesConstant != null) {
                this.staticValuesItem = (EncodedArrayItem) byteData.intern(new EncodedArrayItem(staticValuesConstant));
            }
        }
        if (this.superclass != null) {
            typeIds.intern(this.superclass);
        }
        if (this.interfaces != null) {
            this.interfaces = (TypeListItem) typeLists.intern(this.interfaces);
        }
        if (this.sourceFile != null) {
            stringIds.intern(this.sourceFile);
        }
        if (!this.annotationsDirectory.isEmpty()) {
            if (this.annotationsDirectory.isInternable()) {
                this.annotationsDirectory = (AnnotationsDirectoryItem) wordData.intern(this.annotationsDirectory);
            } else {
                wordData.m7168add(this.annotationsDirectory);
            }
        }
    }

    @Override
    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        boolean zAnnotates = annotatedOutput.annotates();
        TypeIdsSection typeIds = dexFile.getTypeIds();
        int iIndexOf = typeIds.indexOf(this.thisClass);
        int iIndexOf2 = this.superclass == null ? -1 : typeIds.indexOf(this.superclass);
        int absoluteOffsetOr0 = OffsettedItem.getAbsoluteOffsetOr0(this.interfaces);
        int absoluteOffset = this.annotationsDirectory.isEmpty() ? 0 : this.annotationsDirectory.getAbsoluteOffset();
        int iIndexOf3 = this.sourceFile == null ? -1 : dexFile.getStringIds().indexOf(this.sourceFile);
        int absoluteOffset2 = this.classData.isEmpty() ? 0 : this.classData.getAbsoluteOffset();
        int absoluteOffsetOr1 = OffsettedItem.getAbsoluteOffsetOr0(this.staticValuesItem);
        if (zAnnotates) {
            annotatedOutput.annotate(0, new StringBuffer().append(new StringBuffer().append(indexString()).append(' ').toString()).append(this.thisClass.toHuman()).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("  class_idx:           ").append(Hex.m7227u4(iIndexOf)).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("  access_flags:        ").append(AccessFlags.classString(this.accessFlags)).toString());
            annotatedOutput.annotate(4, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("  superclass_idx:      ").append(Hex.m7227u4(iIndexOf2)).toString()).append(" // ").toString()).append(this.superclass == null ? "<none>" : this.superclass.toHuman()).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("  interfaces_off:      ").append(Hex.m7227u4(absoluteOffsetOr0)).toString());
            if (absoluteOffsetOr0 != 0) {
                TypeList list = this.interfaces.getList();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    annotatedOutput.annotate(0, new StringBuffer().append("    ").append(list.getType(i).toHuman()).toString());
                }
            }
            annotatedOutput.annotate(4, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("  source_file_idx:     ").append(Hex.m7227u4(iIndexOf3)).toString()).append(" // ").toString()).append(this.sourceFile == null ? "<none>" : this.sourceFile.toHuman()).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("  annotations_off:     ").append(Hex.m7227u4(absoluteOffset)).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("  class_data_off:      ").append(Hex.m7227u4(absoluteOffset2)).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("  static_values_off:   ").append(Hex.m7227u4(absoluteOffsetOr1)).toString());
        }
        annotatedOutput.writeInt(iIndexOf);
        annotatedOutput.writeInt(this.accessFlags);
        annotatedOutput.writeInt(iIndexOf2);
        annotatedOutput.writeInt(absoluteOffsetOr0);
        annotatedOutput.writeInt(iIndexOf3);
        annotatedOutput.writeInt(absoluteOffset);
        annotatedOutput.writeInt(absoluteOffset2);
        annotatedOutput.writeInt(absoluteOffsetOr1);
    }

    public CstType getThisClass() {
        return this.thisClass;
    }

    public int getAccessFlags() {
        return this.accessFlags;
    }

    public CstType getSuperclass() {
        return this.superclass;
    }

    public TypeList getInterfaces() {
        return this.interfaces == null ? StdTypeList.EMPTY : this.interfaces.getList();
    }

    public CstString getSourceFile() {
        return this.sourceFile;
    }

    public void addStaticField(EncodedField encodedField, Constant constant) {
        this.classData.addStaticField(encodedField, constant);
    }

    public void addInstanceField(EncodedField encodedField) {
        this.classData.addInstanceField(encodedField);
    }

    public void addDirectMethod(EncodedMethod encodedMethod) {
        this.classData.addDirectMethod(encodedMethod);
    }

    public void addVirtualMethod(EncodedMethod encodedMethod) {
        this.classData.addVirtualMethod(encodedMethod);
    }

    public ArrayList<EncodedMethod> getMethods() {
        return this.classData.getMethods();
    }

    public void setClassAnnotations(Annotations annotations, DexFile dexFile) {
        this.annotationsDirectory.setClassAnnotations(annotations, dexFile);
    }

    public void addFieldAnnotations(CstFieldRef cstFieldRef, Annotations annotations, DexFile dexFile) {
        this.annotationsDirectory.addFieldAnnotations(cstFieldRef, annotations, dexFile);
    }

    public void addMethodAnnotations(CstMethodRef cstMethodRef, Annotations annotations, DexFile dexFile) {
        this.annotationsDirectory.addMethodAnnotations(cstMethodRef, annotations, dexFile);
    }

    public void addParameterAnnotations(CstMethodRef cstMethodRef, AnnotationsList annotationsList, DexFile dexFile) {
        this.annotationsDirectory.addParameterAnnotations(cstMethodRef, annotationsList, dexFile);
    }

    public Annotations getMethodAnnotations(CstMethodRef cstMethodRef) {
        return this.annotationsDirectory.getMethodAnnotations(cstMethodRef);
    }

    public AnnotationsList getParameterAnnotations(CstMethodRef cstMethodRef) {
        return this.annotationsDirectory.getParameterAnnotations(cstMethodRef);
    }

    public void debugPrint(Writer writer, boolean z) {
        PrintWriter printWriterPrintWriterFor = Writers.printWriterFor(writer);
        printWriterPrintWriterFor.println(new StringBuffer().append(getClass().getName()).append(" {").toString());
        printWriterPrintWriterFor.println(new StringBuffer().append("  accessFlags: ").append(Hex.m7225u2(this.accessFlags)).toString());
        printWriterPrintWriterFor.println(new StringBuffer().append("  superclass: ").append(this.superclass).toString());
        printWriterPrintWriterFor.println(new StringBuffer().append("  interfaces: ").append(this.interfaces == null ? "<none>" : this.interfaces).toString());
        printWriterPrintWriterFor.println(new StringBuffer().append("  sourceFile: ").append(this.sourceFile == null ? "<none>" : this.sourceFile.toQuoted()).toString());
        this.classData.debugPrint(writer, z);
        this.annotationsDirectory.debugPrint(printWriterPrintWriterFor);
        printWriterPrintWriterFor.println("}");
    }
}
