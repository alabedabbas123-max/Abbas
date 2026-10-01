package com.almlkaide.kaypro.android.dx.io;

import com.almlkaide.kaypro.android.dx.io.instructions.DecodedInstruction;

public final class CodeReader {
    private Visitor fallbackVisitor = (Visitor) null;
    private Visitor stringVisitor = (Visitor) null;
    private Visitor typeVisitor = (Visitor) null;
    private Visitor fieldVisitor = (Visitor) null;
    private Visitor methodVisitor = (Visitor) null;
    private Visitor methodAndProtoVisitor = (Visitor) null;
    private Visitor callSiteVisitor = (Visitor) null;

    public interface Visitor {
        void visit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction);
    }

    public void setAllVisitors(Visitor visitor) {
        this.fallbackVisitor = visitor;
        this.stringVisitor = visitor;
        this.typeVisitor = visitor;
        this.fieldVisitor = visitor;
        this.methodVisitor = visitor;
        this.methodAndProtoVisitor = visitor;
        this.callSiteVisitor = visitor;
    }

    public void setFallbackVisitor(Visitor visitor) {
        this.fallbackVisitor = visitor;
    }

    public void setStringVisitor(Visitor visitor) {
        this.stringVisitor = visitor;
    }

    public void setTypeVisitor(Visitor visitor) {
        this.typeVisitor = visitor;
    }

    public void setFieldVisitor(Visitor visitor) {
        this.fieldVisitor = visitor;
    }

    public void setMethodVisitor(Visitor visitor) {
        this.methodVisitor = visitor;
    }

    public void setMethodAndProtoVisitor(Visitor visitor) {
        this.methodAndProtoVisitor = visitor;
    }

    public void setCallSiteVisitor(Visitor visitor) {
        this.callSiteVisitor = visitor;
    }

    public void visitAll(DecodedInstruction[] decodedInstructionArr) {
        for (DecodedInstruction decodedInstruction : decodedInstructionArr) {
            if (decodedInstruction != null) {
                callVisit(decodedInstructionArr, decodedInstruction);
            }
        }
    }

    public void visitAll(short[] sArr) {
        visitAll(DecodedInstruction.decodeAll(sArr));
    }

    private void callVisit(DecodedInstruction[] decodedInstructionArr, DecodedInstruction decodedInstruction) {
        Visitor visitor = (Visitor) null;
        IndexType indexType = OpcodeInfo.getIndexType(decodedInstruction.getOpcode());
        if (indexType == IndexType.STRING_REF) {
            visitor = this.stringVisitor;
        } else if (indexType == IndexType.TYPE_REF) {
            visitor = this.typeVisitor;
        } else if (indexType == IndexType.FIELD_REF) {
            visitor = this.fieldVisitor;
        } else if (indexType == IndexType.METHOD_REF) {
            visitor = this.methodVisitor;
        } else if (indexType == IndexType.METHOD_AND_PROTO_REF) {
            visitor = this.methodAndProtoVisitor;
        } else if (indexType == IndexType.CALL_SITE_REF) {
            visitor = this.callSiteVisitor;
        }
        if (visitor == null) {
            visitor = this.fallbackVisitor;
        }
        if (visitor != null) {
            visitor.visit(decodedInstructionArr, decodedInstruction);
        }
    }
}
