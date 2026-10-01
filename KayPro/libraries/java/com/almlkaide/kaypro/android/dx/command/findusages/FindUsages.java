package com.almlkaide.kaypro.android.dx.command.findusages;

import com.almlkaide.kaypro.android.dex.Dex;
import com.almlkaide.kaypro.android.dex.ClassData;
import com.almlkaide.kaypro.android.dex.ClassDef;
import com.almlkaide.kaypro.android.dex.FieldId;
import com.almlkaide.kaypro.android.dex.MethodId;
import com.almlkaide.kaypro.android.dx.io.CodeReader;
import com.almlkaide.kaypro.android.dx.io.OpcodeInfo;
import com.almlkaide.kaypro.android.dx.io.instructions.DecodedInstruction;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public final class FindUsages {
    private final CodeReader codeReader = new CodeReader();
    private ClassDef currentClass;
    private ClassData.Method currentMethod;

    private final Dex f5018dex;
    private final Set<Integer> fieldIds;
    private final Set<Integer> methodIds;

    private final PrintWriter f5019out;

    public FindUsages(Dex c1679Dex, String str, String str2, PrintWriter printWriter) {
        this.f5018dex = c1679Dex;
        this.f5019out = printWriter;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Pattern patternCompile = Pattern.compile(str);
        Pattern patternCompile2 = Pattern.compile(str2);
        List<String> listStrings = c1679Dex.strings();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= listStrings.size()) {
                break;
            }
            String str3 = listStrings.get(i2);
            if (patternCompile.matcher(str3).matches()) {
                hashSet.add(new Integer(i2));
            }
            if (patternCompile2.matcher(str3).matches()) {
                hashSet2.add(new Integer(i2));
            }
            i = i2 + 1;
        }
        if (hashSet.isEmpty() || hashSet2.isEmpty()) {
            Set<Integer> set = (Set) null;
            this.fieldIds = set;
            this.methodIds = set;
            return;
        }
        this.methodIds = new HashSet();
        this.fieldIds = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iBinarySearch = Collections.binarySearch(c1679Dex.typeIds(), new Integer(((Integer) it.next()).intValue()));
            if (iBinarySearch >= 0) {
                this.methodIds.addAll(getMethodIds(c1679Dex, hashSet2, iBinarySearch));
                this.fieldIds.addAll(getFieldIds(c1679Dex, hashSet2, iBinarySearch));
            }
        }
        this.codeReader.setFieldVisitor(new CodeReader.Visitor(this, printWriter, c1679Dex) {
            private final FindUsages this$0;
            private final Dex val$dex;
            private final PrintWriter val$out;

            {
                this.this$0 = this;
                this.val$out = printWriter;
                this.val$dex = c1679Dex;
            }

            @Override
            public void visit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction) {
                int index = decodedInstruction.getIndex();
                if (this.this$0.fieldIds.contains(new Integer(index))) {
                    this.val$out.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(this.this$0.location()).append(": field reference ").toString()).append(this.val$dex.fieldIds().get(index)).toString()).append(" (").toString()).append(OpcodeInfo.getName(decodedInstruction.getOpcode())).toString()).append(")").toString());
                }
            }
        });
        this.codeReader.setMethodVisitor(new CodeReader.Visitor(this, printWriter, c1679Dex) {
            private final FindUsages this$0;
            private final Dex val$dex;
            private final PrintWriter val$out;

            {
                this.this$0 = this;
                this.val$out = printWriter;
                this.val$dex = c1679Dex;
            }

            @Override
            public void visit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction) {
                int index = decodedInstruction.getIndex();
                if (this.this$0.methodIds.contains(new Integer(index))) {
                    this.val$out.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(this.this$0.location()).append(": method reference ").toString()).append(this.val$dex.methodIds().get(index)).toString()).append(" (").toString()).append(OpcodeInfo.getName(decodedInstruction.getOpcode())).toString()).append(")").toString());
                }
            }
        });
    }

    public String location() {
        String str = this.f5018dex.typeNames().get(this.currentClass.getTypeIndex());
        if (this.currentMethod != null) {
            return new StringBuffer().append(new StringBuffer().append(str).append(".").toString()).append(this.f5018dex.strings().get(this.f5018dex.methodIds().get(this.currentMethod.getMethodIndex()).getNameIndex())).toString();
        }
        return str;
    }

    public void findUsages() {
        if (this.fieldIds != null && this.methodIds != null) {
            for (ClassDef classDef : this.f5018dex.classDefs()) {
                this.currentClass = classDef;
                this.currentMethod = (ClassData.Method) null;
                if (classDef.getClassDataOffset() != 0) {
                    ClassData classData = this.f5018dex.readClassData(classDef);
                    for (ClassData.Field field : classData.allFields()) {
                        int fieldIndex = field.getFieldIndex();
                        if (this.fieldIds.contains(new Integer(fieldIndex))) {
                            this.f5019out.println(new StringBuffer().append(new StringBuffer().append(location()).append(" field declared ").toString()).append(this.f5018dex.fieldIds().get(fieldIndex)).toString());
                        }
                    }
                    for (ClassData.Method method : classData.allMethods()) {
                        this.currentMethod = method;
                        int methodIndex = method.getMethodIndex();
                        if (this.methodIds.contains(new Integer(methodIndex))) {
                            this.f5019out.println(new StringBuffer().append(new StringBuffer().append(location()).append(" method declared ").toString()).append(this.f5018dex.methodIds().get(methodIndex)).toString());
                        }
                        if (method.getCodeOffset() != 0) {
                            this.codeReader.visitAll(this.f5018dex.readCode(method).getInstructions());
                        }
                    }
                }
            }
            this.currentClass = (ClassDef) null;
            this.currentMethod = (ClassData.Method) null;
        }
    }

    private Set<Integer> getFieldIds(Dex c1679Dex, Set<Integer> set, int i) {
        HashSet hashSet = new HashSet();
        int i2 = 0;
        for (FieldId fieldId : c1679Dex.fieldIds()) {
            if (set.contains(new Integer(fieldId.getNameIndex())) && i == fieldId.getDeclaringClassIndex()) {
                hashSet.add(new Integer(i2));
            }
            i2++;
        }
        return hashSet;
    }

    private Set<Integer> getMethodIds(Dex c1679Dex, Set<Integer> set, int i) {
        Set<Integer> setFindAssignableTypes = findAssignableTypes(c1679Dex, i);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        for (MethodId methodId : c1679Dex.methodIds()) {
            if (set.contains(new Integer(methodId.getNameIndex())) && setFindAssignableTypes.contains(new Integer(methodId.getDeclaringClassIndex()))) {
                hashSet.add(new Integer(i2));
            }
            i2++;
        }
        return hashSet;
    }

    private Set<Integer> findAssignableTypes(Dex c1679Dex, int i) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Integer(i));
        for (ClassDef classDef : c1679Dex.classDefs()) {
            if (hashSet.contains(new Integer(classDef.getSupertypeIndex()))) {
                hashSet.add(new Integer(classDef.getTypeIndex()));
            } else {
                for (short s : classDef.getInterfaces()) {
                    if (hashSet.contains(new Integer(s))) {
                        hashSet.add(new Integer(classDef.getTypeIndex()));
                        break;
                    }
                }
            }
        }
        return hashSet;
    }
}
