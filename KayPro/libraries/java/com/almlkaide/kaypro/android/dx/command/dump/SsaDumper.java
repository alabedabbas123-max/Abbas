package com.almlkaide.kaypro.android.dx.command.dump;

import com.almlkaide.kaypro.android.dx.cf.code.ConcreteMethod;
import com.almlkaide.kaypro.android.dx.cf.code.Ropper;
import com.almlkaide.kaypro.android.dx.cf.iface.Member;
import com.almlkaide.kaypro.android.dx.cf.iface.Method;
import com.almlkaide.kaypro.android.dx.rop.code.AccessFlags;
import com.almlkaide.kaypro.android.dx.rop.code.DexTranslationAdvice;
import com.almlkaide.kaypro.android.dx.rop.code.RopMethod;
import com.almlkaide.kaypro.android.dx.ssa.Optimizer;
import com.almlkaide.kaypro.android.dx.ssa.SsaBasicBlock;
import com.almlkaide.kaypro.android.dx.ssa.SsaInsn;
import com.almlkaide.kaypro.android.dx.ssa.SsaMethod;
import com.almlkaide.kaypro.android.dx.util.ByteArray;
import com.almlkaide.kaypro.android.dx.util.Hex;
import com.almlkaide.kaypro.android.dx.util.IntList;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumSet;
import org.apache.commons.io.IOUtils;

public class SsaDumper extends BlockDumper {
    public static void dump(byte[] bArr, PrintStream printStream, String str, Args args) {
        new SsaDumper(bArr, printStream, str, args).dump();
    }

    SsaDumper(byte[] bArr, PrintStream printStream, String str, Args args) {
        super(bArr, printStream, str, true, args);
    }

    @Override
    public void endParsingMember(ByteArray byteArray, int i, String str, String str2, Member member) {
        if ((member instanceof Method) && shouldDumpMethod(str) && (member.getAccessFlags() & 1280) == 0) {
            ConcreteMethod concreteMethod = new ConcreteMethod((Method) member, this.classFile, true, true);
            DexTranslationAdvice dexTranslationAdvice = DexTranslationAdvice.THE_ONE;
            RopMethod ropMethodConvert = Ropper.convert(concreteMethod, dexTranslationAdvice, this.classFile.getMethods(), this.dexOptions);
            SsaMethod ssaMethodDebugDeadCodeRemover = (SsaMethod) null;
            boolean zIsStatic = AccessFlags.isStatic(concreteMethod.getAccessFlags());
            int iComputeParamWidth = BaseDumper.computeParamWidth(concreteMethod, zIsStatic);
            if (this.args.ssaStep == null) {
                try {
                    ssaMethodDebugDeadCodeRemover = Optimizer.debugNoRegisterAllocation(ropMethodConvert, iComputeParamWidth, zIsStatic, true, dexTranslationAdvice, EnumSet.allOf(Class.forName("com.almlkaide.kaypro.android.dx.ssa.Optimizer$OptionalStep")));
                } catch (ClassNotFoundException e) {
                    throw new NoClassDefFoundError(e.getMessage());
                }
            } else if ("edge-split".equals(this.args.ssaStep)) {
                ssaMethodDebugDeadCodeRemover = Optimizer.debugEdgeSplit(ropMethodConvert, iComputeParamWidth, zIsStatic, true, dexTranslationAdvice);
            } else if ("phi-placement".equals(this.args.ssaStep)) {
                ssaMethodDebugDeadCodeRemover = Optimizer.debugPhiPlacement(ropMethodConvert, iComputeParamWidth, zIsStatic, true, dexTranslationAdvice);
            } else if ("renaming".equals(this.args.ssaStep)) {
                ssaMethodDebugDeadCodeRemover = Optimizer.debugRenaming(ropMethodConvert, iComputeParamWidth, zIsStatic, true, dexTranslationAdvice);
            } else if ("dead-code".equals(this.args.ssaStep)) {
                ssaMethodDebugDeadCodeRemover = Optimizer.debugDeadCodeRemover(ropMethodConvert, iComputeParamWidth, zIsStatic, true, dexTranslationAdvice);
            }
            StringBuilder sb = new StringBuilder(2000);
            sb.append("first ");
            sb.append(Hex.m7225u2(ssaMethodDebugDeadCodeRemover.blockIndexToRopLabel(ssaMethodDebugDeadCodeRemover.getEntryBlockIndex())));
            sb.append('\n');
            ArrayList<SsaBasicBlock> arrayList = (ArrayList) ssaMethodDebugDeadCodeRemover.getBlocks().clone();
            Collections.sort(arrayList, SsaBasicBlock.LABEL_COMPARATOR);
            for (SsaBasicBlock ssaBasicBlock : arrayList) {
                sb.append("block ").append(Hex.m7225u2(ssaBasicBlock.getRopLabel())).append('\n');
                BitSet predecessors = ssaBasicBlock.getPredecessors();
                for (int iNextSetBit = predecessors.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = predecessors.nextSetBit(iNextSetBit + 1)) {
                    sb.append("  pred ");
                    sb.append(Hex.m7225u2(ssaMethodDebugDeadCodeRemover.blockIndexToRopLabel(iNextSetBit)));
                    sb.append('\n');
                }
                sb.append(new StringBuffer().append("  live in:").append(ssaBasicBlock.getLiveInRegs()).toString());
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                for (SsaInsn ssaInsn : ssaBasicBlock.getInsns()) {
                    sb.append("  ");
                    sb.append(ssaInsn.toHuman());
                    sb.append('\n');
                }
                if (ssaBasicBlock.getSuccessors().cardinality() == 0) {
                    sb.append("  returns\n");
                } else {
                    int primarySuccessorRopLabel = ssaBasicBlock.getPrimarySuccessorRopLabel();
                    IntList ropLabelSuccessorList = ssaBasicBlock.getRopLabelSuccessorList();
                    int size = ropLabelSuccessorList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        sb.append("  next ");
                        sb.append(Hex.m7225u2(ropLabelSuccessorList.m7231get(i2)));
                        if (size != 1 && primarySuccessorRopLabel == ropLabelSuccessorList.m7231get(i2)) {
                            sb.append(" *");
                        }
                        sb.append('\n');
                    }
                }
                sb.append(new StringBuffer().append("  live out:").append(ssaBasicBlock.getLiveOutRegs()).toString());
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            this.suppressDump = false;
            parsed(byteArray, 0, byteArray.size(), sb.toString());
            this.suppressDump = true;
        }
    }
}
