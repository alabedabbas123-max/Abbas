package com.almlkaide.kaypro.android.dx.command.grep;

import com.almlkaide.kaypro.android.dex.Dex;
import com.almlkaide.kaypro.android.dex.ClassData;
import com.almlkaide.kaypro.android.dex.ClassDef;
import com.almlkaide.kaypro.android.dex.EncodedValueReader;
import com.almlkaide.kaypro.android.dx.io.CodeReader;
import com.almlkaide.kaypro.android.dx.io.instructions.DecodedInstruction;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

public final class Grep {
    private final CodeReader codeReader = new CodeReader();
    private int count = 0;
    private ClassDef currentClass;
    private ClassData.Method currentMethod;

    private final Dex f5020dex;

    private final PrintWriter f5021out;
    private final Set<Integer> stringIds;

    public Grep(Dex c1679Dex, Pattern pattern, PrintWriter printWriter) {
        this.f5020dex = c1679Dex;
        this.f5021out = printWriter;
        this.stringIds = getStringIds(c1679Dex, pattern);
        this.codeReader.setStringVisitor(new CodeReader.Visitor(this) {
            private final Grep this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void visit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction) {
                this.this$0.encounterString(decodedInstruction.getIndex());
            }
        });
    }

    private void readArray(EncodedValueReader encodedValueReader) {
        int array = encodedValueReader.readArray();
        for (int i = 0; i < array; i++) {
            switch (encodedValueReader.peek()) {
                case 23:
                    encounterString(encodedValueReader.readString());
                    break;
                case 28:
                    readArray(encodedValueReader);
                    break;
            }
        }
    }

    public void encounterString(int i) {
        if (this.stringIds.contains(new Integer(i))) {
            this.f5021out.println(new StringBuffer().append(new StringBuffer().append(location()).append(" ").toString()).append(this.f5020dex.strings().get(i)).toString());
            this.count++;
        }
    }

    private String location() {
        String str = this.f5020dex.typeNames().get(this.currentClass.getTypeIndex());
        if (this.currentMethod != null) {
            return new StringBuffer().append(new StringBuffer().append(str).append(".").toString()).append(this.f5020dex.strings().get(this.f5020dex.methodIds().get(this.currentMethod.getMethodIndex()).getNameIndex())).toString();
        }
        return str;
    }

    public int grep() {
        for (ClassDef classDef : this.f5020dex.classDefs()) {
            this.currentClass = classDef;
            this.currentMethod = (ClassData.Method) null;
            if (classDef.getClassDataOffset() != 0) {
                ClassData classData = this.f5020dex.readClassData(classDef);
                int staticValuesOffset = classDef.getStaticValuesOffset();
                if (staticValuesOffset != 0) {
                    readArray(new EncodedValueReader(this.f5020dex.open(staticValuesOffset)));
                }
                for (ClassData.Method method : classData.allMethods()) {
                    this.currentMethod = method;
                    if (method.getCodeOffset() != 0) {
                        this.codeReader.visitAll(this.f5020dex.readCode(method).getInstructions());
                    }
                }
            }
        }
        this.currentClass = (ClassDef) null;
        this.currentMethod = (ClassData.Method) null;
        return this.count;
    }

    private Set<Integer> getStringIds(Dex c1679Dex, Pattern pattern) {
        HashSet hashSet = new HashSet();
        int i = 0;
        Iterator<String> it = c1679Dex.strings().iterator();
        while (it.hasNext()) {
            if (pattern.matcher(it.next()).find()) {
                hashSet.add(new Integer(i));
            }
            i++;
        }
        return hashSet;
    }
}
