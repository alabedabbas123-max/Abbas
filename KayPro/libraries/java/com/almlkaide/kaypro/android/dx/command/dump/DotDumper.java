package com.almlkaide.kaypro.android.dx.command.dump;

import com.almlkaide.kaypro.android.dx.cf.code.ConcreteMethod;
import com.almlkaide.kaypro.android.dx.cf.code.Ropper;
import com.almlkaide.kaypro.android.dx.cf.direct.DirectClassFile;
import com.almlkaide.kaypro.android.dx.cf.direct.StdAttributeFactory;
import com.almlkaide.kaypro.android.dx.cf.iface.Member;
import com.almlkaide.kaypro.android.dx.cf.iface.Method;
import com.almlkaide.kaypro.android.dx.cf.iface.ParseObserver;
import com.almlkaide.kaypro.android.dx.dex.DexOptions;
import com.almlkaide.kaypro.android.dx.rop.code.AccessFlags;
import com.almlkaide.kaypro.android.dx.rop.code.BasicBlock;
import com.almlkaide.kaypro.android.dx.rop.code.BasicBlockList;
import com.almlkaide.kaypro.android.dx.rop.code.DexTranslationAdvice;
import com.almlkaide.kaypro.android.dx.rop.code.RopMethod;
import com.almlkaide.kaypro.android.dx.ssa.Optimizer;
import com.almlkaide.kaypro.android.dx.util.ByteArray;
import com.almlkaide.kaypro.android.dx.util.Hex;
import com.almlkaide.kaypro.android.dx.util.IntList;

public class DotDumper implements ParseObserver {
    private final Args args;
    private final byte[] bytes;
    private DirectClassFile classFile;
    private final DexOptions dexOptions = new DexOptions();
    private final String filePath;
    private final boolean optimize;
    private final boolean strictParse;

    @Override
    public void changeIndent(int i) {
    }

    @Override
    public void parsed(ByteArray byteArray, int i, int i2, String str) {
    }

    @Override
    public void startParsingMember(ByteArray byteArray, int i, String str, String str2) {
    }

    static void dump(byte[] bArr, String str, Args args) {
        new DotDumper(bArr, str, args).m7145run();
    }

    DotDumper(byte[] bArr, String str, Args args) {
        this.bytes = bArr;
        this.filePath = str;
        this.strictParse = args.strictParse;
        this.optimize = args.optimize;
        this.args = args;
    }

    private void m7145run() {
        ByteArray byteArray = new ByteArray(this.bytes);
        this.classFile = new DirectClassFile(byteArray, this.filePath, this.strictParse);
        this.classFile.setAttributeFactory(StdAttributeFactory.THE_ONE);
        this.classFile.getMagic();
        DirectClassFile directClassFile = new DirectClassFile(byteArray, this.filePath, this.strictParse);
        directClassFile.setAttributeFactory(StdAttributeFactory.THE_ONE);
        directClassFile.setObserver(this);
        directClassFile.getMagic();
    }

    protected boolean shouldDumpMethod(String str) {
        return this.args.method == null || this.args.method.equals(str);
    }

    @Override
    public void endParsingMember(ByteArray byteArray, int i, String str, String str2, Member member) {
        if ((member instanceof Method) && shouldDumpMethod(str)) {
            ConcreteMethod concreteMethod = new ConcreteMethod((Method) member, this.classFile, true, true);
            DexTranslationAdvice dexTranslationAdvice = DexTranslationAdvice.THE_ONE;
            RopMethod ropMethodConvert = Ropper.convert(concreteMethod, dexTranslationAdvice, this.classFile.getMethods(), this.dexOptions);
            if (this.optimize) {
                boolean zIsStatic = AccessFlags.isStatic(concreteMethod.getAccessFlags());
                ropMethodConvert = Optimizer.optimize(ropMethodConvert, BaseDumper.computeParamWidth(concreteMethod, zIsStatic), zIsStatic, true, dexTranslationAdvice);
            }
            System.out.println(new StringBuffer().append(new StringBuffer().append("digraph ").append(str).toString()).append("{").toString());
            System.out.println(new StringBuffer().append(new StringBuffer().append("\tfirst -> n").append(Hex.m7225u2(ropMethodConvert.getFirstLabel())).toString()).append(";").toString());
            BasicBlockList blocks = ropMethodConvert.getBlocks();
            int size = blocks.size();
            for (int i2 = 0; i2 < size; i2++) {
                BasicBlock basicBlockM7181get = blocks.m7181get(i2);
                int label = basicBlockM7181get.getLabel();
                IntList successors = basicBlockM7181get.getSuccessors();
                if (successors.size() == 0) {
                    System.out.println(new StringBuffer().append(new StringBuffer().append("\tn").append(Hex.m7225u2(label)).toString()).append(" -> returns;").toString());
                } else if (successors.size() == 1) {
                    System.out.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("\tn").append(Hex.m7225u2(label)).toString()).append(" -> n").toString()).append(Hex.m7225u2(successors.m7231get(0))).toString()).append(";").toString());
                } else {
                    System.out.print(new StringBuffer().append(new StringBuffer().append("\tn").append(Hex.m7225u2(label)).toString()).append(" -> {").toString());
                    for (int i3 = 0; i3 < successors.size(); i3++) {
                        int iM7231get = successors.m7231get(i3);
                        if (iM7231get != basicBlockM7181get.getPrimarySuccessor()) {
                            System.out.print(new StringBuffer().append(new StringBuffer().append(" n").append(Hex.m7225u2(iM7231get)).toString()).append(" ").toString());
                        }
                    }
                    System.out.println("};");
                    System.out.println(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("\tn").append(Hex.m7225u2(label)).toString()).append(" -> n").toString()).append(Hex.m7225u2(basicBlockM7181get.getPrimarySuccessor())).toString()).append(" [label=\"primary\"];").toString());
                }
            }
            System.out.println("}");
        }
    }
}
