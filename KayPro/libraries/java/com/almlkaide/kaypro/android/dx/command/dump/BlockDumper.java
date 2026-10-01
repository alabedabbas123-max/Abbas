package com.almlkaide.kaypro.android.dx.command.dump;

import com.almlkaide.kaypro.android.dx.cf.code.BasicBlocker;
import com.almlkaide.kaypro.android.dx.cf.code.ByteBlock;
import com.almlkaide.kaypro.android.dx.cf.code.ByteBlockList;
import com.almlkaide.kaypro.android.dx.cf.code.ByteCatchList;
import com.almlkaide.kaypro.android.dx.cf.code.BytecodeArray;
import com.almlkaide.kaypro.android.dx.cf.code.ConcreteMethod;
import com.almlkaide.kaypro.android.dx.cf.code.Ropper;
import com.almlkaide.kaypro.android.dx.cf.direct.CodeObserver;
import com.almlkaide.kaypro.android.dx.cf.direct.DirectClassFile;
import com.almlkaide.kaypro.android.dx.cf.direct.StdAttributeFactory;
import com.almlkaide.kaypro.android.dx.cf.iface.Member;
import com.almlkaide.kaypro.android.dx.cf.iface.Method;
import com.almlkaide.kaypro.android.dx.rop.code.AccessFlags;
import com.almlkaide.kaypro.android.dx.rop.code.BasicBlock;
import com.almlkaide.kaypro.android.dx.rop.code.BasicBlockList;
import com.almlkaide.kaypro.android.dx.rop.code.DexTranslationAdvice;
import com.almlkaide.kaypro.android.dx.rop.code.InsnList;
import com.almlkaide.kaypro.android.dx.rop.code.RopMethod;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.ssa.Optimizer;
import com.almlkaide.kaypro.android.dx.util.ByteArray;
import com.almlkaide.kaypro.android.dx.util.Hex;
import com.almlkaide.kaypro.android.dx.util.IntList;
import java.io.PrintStream;
import org.apache.commons.io.IOUtils;

public class BlockDumper extends BaseDumper {
    protected DirectClassFile classFile;
    private boolean first;
    private final boolean optimize;

    private final boolean f5017rop;
    protected boolean suppressDump;

    public static void dump(byte[] bArr, PrintStream printStream, String str, boolean z, Args args) {
        new BlockDumper(bArr, printStream, str, z, args).dump();
    }

    BlockDumper(byte[] bArr, PrintStream printStream, String str, boolean z, Args args) {
        super(bArr, printStream, str, args);
        this.f5017rop = z;
        this.classFile = (DirectClassFile) null;
        this.suppressDump = true;
        this.first = true;
        this.optimize = args.optimize;
    }

    public void dump() {
        ByteArray byteArray = new ByteArray(getBytes());
        this.classFile = new DirectClassFile(byteArray, getFilePath(), getStrictParse());
        this.classFile.setAttributeFactory(StdAttributeFactory.THE_ONE);
        this.classFile.getMagic();
        DirectClassFile directClassFile = new DirectClassFile(byteArray, getFilePath(), getStrictParse());
        directClassFile.setAttributeFactory(StdAttributeFactory.THE_ONE);
        directClassFile.setObserver(this);
        directClassFile.getMagic();
    }

    @Override
    public void changeIndent(int i) {
        if (this.suppressDump) {
            return;
        }
        super.changeIndent(i);
    }

    @Override
    public void parsed(ByteArray byteArray, int i, int i2, String str) {
        if (this.suppressDump) {
            return;
        }
        super.parsed(byteArray, i, i2, str);
    }

    protected boolean shouldDumpMethod(String str) {
        return this.args.method == null || this.args.method.equals(str);
    }

    @Override
    public void startParsingMember(ByteArray byteArray, int i, String str, String str2) {
        if (str2.indexOf(40) >= 0 && shouldDumpMethod(str)) {
            this.suppressDump = false;
            if (this.first) {
                this.first = false;
            } else {
                parsed(byteArray, i, 0, IOUtils.LINE_SEPARATOR_UNIX);
            }
            parsed(byteArray, i, 0, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("method ").append(str).toString()).append(" ").toString()).append(str2).toString());
            this.suppressDump = true;
        }
    }

    @Override
    public void endParsingMember(ByteArray byteArray, int i, String str, String str2, Member member) {
        if ((member instanceof Method) && shouldDumpMethod(str) && (member.getAccessFlags() & 1280) == 0) {
            ConcreteMethod concreteMethod = new ConcreteMethod((Method) member, this.classFile, true, true);
            if (this.f5017rop) {
                ropDump(concreteMethod);
            } else {
                regularDump(concreteMethod);
            }
        }
    }

    private void regularDump(ConcreteMethod concreteMethod) {
        BytecodeArray code = concreteMethod.getCode();
        ByteArray bytes = code.getBytes();
        ByteBlockList byteBlockListIdentifyBlocks = BasicBlocker.identifyBlocks(concreteMethod);
        int size = byteBlockListIdentifyBlocks.size();
        CodeObserver codeObserver = new CodeObserver(bytes, this);
        this.suppressDump = false;
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            ByteBlock byteBlockM7120get = byteBlockListIdentifyBlocks.m7120get(i2);
            int start = byteBlockM7120get.getStart();
            int end = byteBlockM7120get.getEnd();
            if (i < start) {
                parsed(bytes, i, start - i, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("dead code ").append(Hex.m7225u2(i)).toString()).append("..").toString()).append(Hex.m7225u2(start)).toString());
            }
            parsed(bytes, start, 0, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("block ").append(Hex.m7225u2(byteBlockM7120get.getLabel())).toString()).append(": ").toString()).append(Hex.m7225u2(start)).toString()).append("..").toString()).append(Hex.m7225u2(end)).toString());
            changeIndent(1);
            while (start < end) {
                int instruction = code.parseInstruction(start, codeObserver);
                codeObserver.setPreviousOffset(start);
                start += instruction;
            }
            IntList successors = byteBlockM7120get.getSuccessors();
            int size2 = successors.size();
            if (size2 == 0) {
                parsed(bytes, end, 0, "returns");
            } else {
                for (int i3 = 0; i3 < size2; i3++) {
                    parsed(bytes, end, 0, new StringBuffer().append("next ").append(Hex.m7225u2(successors.m7231get(i3))).toString());
                }
            }
            ByteCatchList catches = byteBlockM7120get.getCatches();
            int size3 = catches.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ByteCatchList.Item itemM7122get = catches.m7122get(i4);
                CstType exceptionClass = itemM7122get.getExceptionClass();
                parsed(bytes, end, 0, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("catch ").append(exceptionClass == CstType.OBJECT ? "<any>" : exceptionClass.toHuman()).toString()).append(" -> ").toString()).append(Hex.m7225u2(itemM7122get.getHandlerPc())).toString());
            }
            changeIndent(-1);
            i2++;
            i = end;
        }
        int size4 = bytes.size();
        if (i < size4) {
            parsed(bytes, i, size4 - i, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("dead code ").append(Hex.m7225u2(i)).toString()).append("..").toString()).append(Hex.m7225u2(size4)).toString());
        }
        this.suppressDump = true;
    }

    private void ropDump(ConcreteMethod concreteMethod) {
        DexTranslationAdvice dexTranslationAdvice = DexTranslationAdvice.THE_ONE;
        ByteArray bytes = concreteMethod.getCode().getBytes();
        RopMethod ropMethodConvert = Ropper.convert(concreteMethod, dexTranslationAdvice, this.classFile.getMethods(), this.dexOptions);
        StringBuilder sb = new StringBuilder(2000);
        if (this.optimize) {
            boolean zIsStatic = AccessFlags.isStatic(concreteMethod.getAccessFlags());
            ropMethodConvert = Optimizer.optimize(ropMethodConvert, BaseDumper.computeParamWidth(concreteMethod, zIsStatic), zIsStatic, true, dexTranslationAdvice);
        }
        BasicBlockList blocks = ropMethodConvert.getBlocks();
        int[] labelsInOrder = blocks.getLabelsInOrder();
        sb.append(new StringBuffer().append(new StringBuffer().append("first ").append(Hex.m7225u2(ropMethodConvert.getFirstLabel())).toString()).append(IOUtils.LINE_SEPARATOR_UNIX).toString());
        for (int i : labelsInOrder) {
            BasicBlock basicBlockM7181get = blocks.m7181get(blocks.indexOfLabel(i));
            sb.append("block ");
            sb.append(Hex.m7225u2(i));
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            IntList intListLabelToPredecessors = ropMethodConvert.labelToPredecessors(i);
            int size = intListLabelToPredecessors.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append("  pred ");
                sb.append(Hex.m7225u2(intListLabelToPredecessors.m7231get(i2)));
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            InsnList insns = basicBlockM7181get.getInsns();
            int size2 = insns.size();
            for (int i3 = 0; i3 < size2; i3++) {
                insns.m7183get(i3);
                sb.append("  ");
                sb.append(insns.m7183get(i3).toHuman());
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            IntList successors = basicBlockM7181get.getSuccessors();
            int size3 = successors.size();
            if (size3 == 0) {
                sb.append("  returns\n");
            } else {
                int primarySuccessor = basicBlockM7181get.getPrimarySuccessor();
                for (int i4 = 0; i4 < size3; i4++) {
                    int iM7231get = successors.m7231get(i4);
                    sb.append("  next ");
                    sb.append(Hex.m7225u2(iM7231get));
                    if (size3 != 1 && iM7231get == primarySuccessor) {
                        sb.append(" *");
                    }
                    sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                }
            }
        }
        this.suppressDump = false;
        parsed(bytes, 0, bytes.size(), sb.toString());
        this.suppressDump = true;
    }
}
