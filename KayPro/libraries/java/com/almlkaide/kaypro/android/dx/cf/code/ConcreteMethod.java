package com.almlkaide.kaypro.android.dx.cf.code;

import com.almlkaide.kaypro.android.dx.cf.attrib.AttCode;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLineNumberTable;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLocalVariableTable;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttLocalVariableTypeTable;
import com.almlkaide.kaypro.android.dx.cf.iface.AttributeList;
import com.almlkaide.kaypro.android.dx.cf.iface.ClassFile;
import com.almlkaide.kaypro.android.dx.cf.iface.Method;
import com.almlkaide.kaypro.android.dx.rop.code.SourcePosition;
import com.almlkaide.kaypro.android.dx.rop.cst.CstNat;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.type.Prototype;

public final class ConcreteMethod implements Method {
    private final AttCode attCode;
    private final ClassFile classFile;
    private final LineNumberList lineNumbers;
    private final LocalVariableList localVariables;
    private final Method method;

    /* JADX WARN: Code duplicated, block: B:20:0x0080 A[PHI: r1
      0x0080: PHI (r1v4 com.almlkaide.kaypro.android.dx.cf.code.LocalVariableList) = 
      (r1v3 com.almlkaide.kaypro.android.dx.cf.code.LocalVariableList)
      (r1v5 com.almlkaide.kaypro.android.dx.cf.code.LocalVariableList)
     binds: [B:7:0x002e, B:13:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    public ConcreteMethod(Method method, ClassFile classFile, boolean z, boolean z2) {
        LocalVariableList localVariableListMergeDescriptorsAndSignatures;
        this.method = method;
        this.classFile = classFile;
        this.attCode = (AttCode) method.getAttributes().findFirst(AttCode.ATTRIBUTE_NAME);
        AttributeList attributes = this.attCode.getAttributes();
        LineNumberList lineNumberListConcat = LineNumberList.EMPTY;
        if (z) {
            for (AttLineNumberTable attLineNumberTable = (AttLineNumberTable) attributes.findFirst(AttLineNumberTable.ATTRIBUTE_NAME); attLineNumberTable != null; attLineNumberTable = (AttLineNumberTable) attributes.findNext(attLineNumberTable)) {
                lineNumberListConcat = LineNumberList.concat(lineNumberListConcat, attLineNumberTable.getLineNumbers());
            }
        }
        this.lineNumbers = lineNumberListConcat;
        LocalVariableList localVariableListConcat = LocalVariableList.EMPTY;
        if (z2) {
            for (AttLocalVariableTable attLocalVariableTable = (AttLocalVariableTable) attributes.findFirst(AttLocalVariableTable.ATTRIBUTE_NAME); attLocalVariableTable != null; attLocalVariableTable = (AttLocalVariableTable) attributes.findNext(attLocalVariableTable)) {
                localVariableListConcat = LocalVariableList.concat(localVariableListConcat, attLocalVariableTable.getLocalVariables());
            }
            LocalVariableList localVariableListConcat2 = LocalVariableList.EMPTY;
            for (AttLocalVariableTypeTable attLocalVariableTypeTable = (AttLocalVariableTypeTable) attributes.findFirst(AttLocalVariableTypeTable.ATTRIBUTE_NAME); attLocalVariableTypeTable != null; attLocalVariableTypeTable = (AttLocalVariableTypeTable) attributes.findNext(attLocalVariableTypeTable)) {
                localVariableListConcat2 = LocalVariableList.concat(localVariableListConcat2, attLocalVariableTypeTable.getLocalVariables());
            }
            if (localVariableListConcat2.size() != 0) {
                localVariableListMergeDescriptorsAndSignatures = LocalVariableList.mergeDescriptorsAndSignatures(localVariableListConcat, localVariableListConcat2);
            } else {
                localVariableListMergeDescriptorsAndSignatures = localVariableListConcat;
            }
        } else {
            localVariableListMergeDescriptorsAndSignatures = localVariableListConcat;
        }
        this.localVariables = localVariableListMergeDescriptorsAndSignatures;
    }

    public CstString getSourceFile() {
        return this.classFile.getSourceFile();
    }

    public final boolean isDefaultOrStaticInterfaceMethod() {
        return ((this.classFile.getAccessFlags() & 512) == 0 || getNat().isClassInit()) ? false : true;
    }

    public final boolean isStaticMethod() {
        return (getAccessFlags() & 8) != 0;
    }

    @Override
    public CstNat getNat() {
        return this.method.getNat();
    }

    @Override
    public CstString getName() {
        return this.method.getName();
    }

    @Override
    public CstString getDescriptor() {
        return this.method.getDescriptor();
    }

    @Override
    public int getAccessFlags() {
        return this.method.getAccessFlags();
    }

    @Override
    public AttributeList getAttributes() {
        return this.method.getAttributes();
    }

    @Override
    public CstType getDefiningClass() {
        return this.method.getDefiningClass();
    }

    @Override
    public Prototype getEffectiveDescriptor() {
        return this.method.getEffectiveDescriptor();
    }

    public int getMaxStack() {
        return this.attCode.getMaxStack();
    }

    public int getMaxLocals() {
        return this.attCode.getMaxLocals();
    }

    public BytecodeArray getCode() {
        return this.attCode.getCode();
    }

    public ByteCatchList getCatches() {
        return this.attCode.getCatches();
    }

    public LineNumberList getLineNumbers() {
        return this.lineNumbers;
    }

    public LocalVariableList getLocalVariables() {
        return this.localVariables;
    }

    public SourcePosition makeSourcePosistion(int i) {
        return new SourcePosition(getSourceFile(), i, this.lineNumbers.pcToLine(i));
    }
}
