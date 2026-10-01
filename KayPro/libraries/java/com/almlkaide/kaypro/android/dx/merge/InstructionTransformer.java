package com.almlkaide.kaypro.android.dx.merge;

import com.almlkaide.kaypro.android.dex.DexIndexOverflowException;
import com.almlkaide.kaypro.android.dx.io.CodeReader;
import com.almlkaide.kaypro.android.dx.io.instructions.DecodedInstruction;
import com.almlkaide.kaypro.android.dx.io.instructions.ShortArrayCodeOutput;

final class InstructionTransformer {
    private IndexMap indexMap;
    private int mappedAt;
    private DecodedInstruction[] mappedInstructions;
    private final CodeReader reader = new CodeReader();

    public InstructionTransformer() {
        this.reader.setAllVisitors(new GenericVisitor(this));
        this.reader.setStringVisitor(new StringVisitor(this));
        this.reader.setTypeVisitor(new TypeVisitor(this));
        this.reader.setFieldVisitor(new FieldVisitor(this));
        this.reader.setMethodVisitor(new MethodVisitor(this));
        this.reader.setMethodAndProtoVisitor(new MethodAndProtoVisitor(this));
        this.reader.setCallSiteVisitor(new CallSiteVisitor(this));
    }

    public short[] transform(IndexMap indexMap, short[] sArr) {
        DecodedInstruction[] decodedInstructionArrDecodeAll = DecodedInstruction.decodeAll(sArr);
        int length = decodedInstructionArrDecodeAll.length;
        this.indexMap = indexMap;
        this.mappedInstructions = new DecodedInstruction[length];
        this.mappedAt = 0;
        this.reader.visitAll(decodedInstructionArrDecodeAll);
        ShortArrayCodeOutput shortArrayCodeOutput = new ShortArrayCodeOutput(length);
        for (DecodedInstruction decodedInstruction : this.mappedInstructions) {
            if (decodedInstruction != null) {
                decodedInstruction.encode(shortArrayCodeOutput);
            }
        }
        this.indexMap = (IndexMap) null;
        return shortArrayCodeOutput.getArray();
    }

    private class GenericVisitor implements CodeReader.Visitor {
        private final InstructionTransformer this$0;

        @Override
        public void visit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction) {
            DecodedInstruction[] decodedInstructionArr2 = this.this$0.mappedInstructions;
            InstructionTransformer instructionTransformer = this.this$0;
            int i = instructionTransformer.mappedAt;
            instructionTransformer.mappedAt = i + 1;
            decodedInstructionArr2[i] = decodedInstruction;
        }

        public GenericVisitor(InstructionTransformer instructionTransformer) {
            this.this$0 = instructionTransformer;
        }
    }

    private class StringVisitor implements CodeReader.Visitor {
        private final InstructionTransformer this$0;

        @Override
        public void visit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction) {
            int iAdjustString = this.this$0.indexMap.adjustString(decodedInstruction.getIndex());
            InstructionTransformer.jumboCheck(decodedInstruction.getOpcode() == 27, iAdjustString);
            DecodedInstruction[] decodedInstructionArr2 = this.this$0.mappedInstructions;
            InstructionTransformer instructionTransformer = this.this$0;
            int i = instructionTransformer.mappedAt;
            instructionTransformer.mappedAt = i + 1;
            decodedInstructionArr2[i] = decodedInstruction.withIndex(iAdjustString);
        }

        public StringVisitor(InstructionTransformer instructionTransformer) {
            this.this$0 = instructionTransformer;
        }
    }

    private class FieldVisitor implements CodeReader.Visitor {
        private final InstructionTransformer this$0;

        @Override
        public void visit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction) {
            int iAdjustField = this.this$0.indexMap.adjustField(decodedInstruction.getIndex());
            InstructionTransformer.jumboCheck(decodedInstruction.getOpcode() == 27, iAdjustField);
            DecodedInstruction[] decodedInstructionArr2 = this.this$0.mappedInstructions;
            InstructionTransformer instructionTransformer = this.this$0;
            int i = instructionTransformer.mappedAt;
            instructionTransformer.mappedAt = i + 1;
            decodedInstructionArr2[i] = decodedInstruction.withIndex(iAdjustField);
        }

        public FieldVisitor(InstructionTransformer instructionTransformer) {
            this.this$0 = instructionTransformer;
        }
    }

    private class TypeVisitor implements CodeReader.Visitor {
        private final InstructionTransformer this$0;

        @Override
        public void visit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction) {
            int iAdjustType = this.this$0.indexMap.adjustType(decodedInstruction.getIndex());
            InstructionTransformer.jumboCheck(decodedInstruction.getOpcode() == 27, iAdjustType);
            DecodedInstruction[] decodedInstructionArr2 = this.this$0.mappedInstructions;
            InstructionTransformer instructionTransformer = this.this$0;
            int i = instructionTransformer.mappedAt;
            instructionTransformer.mappedAt = i + 1;
            decodedInstructionArr2[i] = decodedInstruction.withIndex(iAdjustType);
        }

        public TypeVisitor(InstructionTransformer instructionTransformer) {
            this.this$0 = instructionTransformer;
        }
    }

    private class MethodVisitor implements CodeReader.Visitor {
        private final InstructionTransformer this$0;

        @Override
        public void visit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction) {
            int iAdjustMethod = this.this$0.indexMap.adjustMethod(decodedInstruction.getIndex());
            InstructionTransformer.jumboCheck(decodedInstruction.getOpcode() == 27, iAdjustMethod);
            DecodedInstruction[] decodedInstructionArr2 = this.this$0.mappedInstructions;
            InstructionTransformer instructionTransformer = this.this$0;
            int i = instructionTransformer.mappedAt;
            instructionTransformer.mappedAt = i + 1;
            decodedInstructionArr2[i] = decodedInstruction.withIndex(iAdjustMethod);
        }

        public MethodVisitor(InstructionTransformer instructionTransformer) {
            this.this$0 = instructionTransformer;
        }
    }

    private class MethodAndProtoVisitor implements CodeReader.Visitor {
        private final InstructionTransformer this$0;

        @Override
        public void visit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction) {
            int index = decodedInstruction.getIndex();
            short protoIndex = decodedInstruction.getProtoIndex();
            DecodedInstruction[] decodedInstructionArr2 = this.this$0.mappedInstructions;
            InstructionTransformer instructionTransformer = this.this$0;
            int i = instructionTransformer.mappedAt;
            instructionTransformer.mappedAt = i + 1;
            decodedInstructionArr2[i] = decodedInstruction.withProtoIndex(this.this$0.indexMap.adjustMethod(index), this.this$0.indexMap.adjustProto(protoIndex));
        }

        public MethodAndProtoVisitor(InstructionTransformer instructionTransformer) {
            this.this$0 = instructionTransformer;
        }
    }

    private class CallSiteVisitor implements CodeReader.Visitor {
        private final InstructionTransformer this$0;

        @Override
        public void visit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction) {
            int iAdjustCallSite = this.this$0.indexMap.adjustCallSite(decodedInstruction.getIndex());
            DecodedInstruction[] decodedInstructionArr2 = this.this$0.mappedInstructions;
            InstructionTransformer instructionTransformer = this.this$0;
            int i = instructionTransformer.mappedAt;
            instructionTransformer.mappedAt = i + 1;
            decodedInstructionArr2[i] = decodedInstruction.withIndex(iAdjustCallSite);
        }

        public CallSiteVisitor(InstructionTransformer instructionTransformer) {
            this.this$0 = instructionTransformer;
        }
    }

    public static void jumboCheck(boolean z, int i) {
        if (!z && i > 65535) {
            throw new DexIndexOverflowException(new StringBuffer().append(new StringBuffer().append("Cannot merge new index ").append(i).toString()).append(" into a non-jumbo instruction!").toString());
        }
    }
}
