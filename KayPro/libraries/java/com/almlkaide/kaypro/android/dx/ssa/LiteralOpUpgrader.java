package com.almlkaide.kaypro.android.dx.ssa;

import com.almlkaide.kaypro.android.dx.rop.code.Rop;
import com.almlkaide.kaypro.android.dx.rop.code.Insn;
import com.almlkaide.kaypro.android.dx.rop.code.PlainCstInsn;
import com.almlkaide.kaypro.android.dx.rop.code.PlainInsn;
import com.almlkaide.kaypro.android.dx.rop.code.RegOps;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.code.Rops;
import com.almlkaide.kaypro.android.dx.rop.code.TranslationAdvice;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstLiteralBits;
import com.almlkaide.kaypro.android.dx.rop.type.TypeBearer;
import java.util.ArrayList;

public class LiteralOpUpgrader {
    private final SsaMethod ssaMeth;

    public static void process(SsaMethod ssaMethod) {
        new LiteralOpUpgrader(ssaMethod).m7205run();
    }

    LiteralOpUpgrader(SsaMethod ssaMethod) {
        this.ssaMeth = ssaMethod;
    }

    public static boolean isConstIntZeroOrKnownNull(RegisterSpec registerSpec) {
        TypeBearer typeBearer = registerSpec.getTypeBearer();
        return (typeBearer instanceof CstLiteralBits) && ((CstLiteralBits) typeBearer).getLongBits() == ((long) 0);
    }

    private void m7205run() {
        this.ssaMeth.forEachInsn(new SsaInsn.Visitor(this, Optimizer.getAdvice()) {
            private final LiteralOpUpgrader this$0;
            private final TranslationAdvice val$advice;

            {
                this.this$0 = this;
                this.val$advice = translationAdvice;
            }

            @Override
            public void visitMoveInsn(NormalSsaInsn normalSsaInsn) {
            }

            @Override
            public void visitPhiInsn(PhiInsn phiInsn) {
            }

            @Override
            public void visitNonMoveInsn(NormalSsaInsn normalSsaInsn) {
                Rop opcode = normalSsaInsn.getOriginalRopInsn().getOpcode();
                RegisterSpecList sources = normalSsaInsn.getSources();
                if (!this.this$0.tryReplacingWithConstant(normalSsaInsn) && sources.size() == 2) {
                    if (opcode.getBranchingness() == 4) {
                        if (LiteralOpUpgrader.isConstIntZeroOrKnownNull(sources.m7188get(0))) {
                            this.this$0.replacePlainInsn(normalSsaInsn, sources.withoutFirst(), RegOps.flippedIfOpcode(opcode.getOpcode()), (Constant) null);
                            return;
                        } else {
                            if (LiteralOpUpgrader.isConstIntZeroOrKnownNull(sources.m7188get(1))) {
                                this.this$0.replacePlainInsn(normalSsaInsn, sources.withoutLast(), opcode.getOpcode(), (Constant) null);
                                return;
                            }
                            return;
                        }
                    }
                    if (this.val$advice.hasConstantOperation(opcode, sources.m7188get(0), sources.m7188get(1))) {
                        normalSsaInsn.upgradeToLiteral();
                    } else if (opcode.isCommutative() && this.val$advice.hasConstantOperation(opcode, sources.m7188get(1), sources.m7188get(0))) {
                        normalSsaInsn.setNewSources(RegisterSpecList.make(sources.m7188get(1), sources.m7188get(0)));
                        normalSsaInsn.upgradeToLiteral();
                    }
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean tryReplacingWithConstant(NormalSsaInsn normalSsaInsn) {
        Rop opcode = normalSsaInsn.getOriginalRopInsn().getOpcode();
        RegisterSpec result = normalSsaInsn.getResult();
        if (result != null && !this.ssaMeth.isRegALocal(result) && opcode.getOpcode() != 5) {
            TypeBearer typeBearer = normalSsaInsn.getResult().getTypeBearer();
            if (typeBearer.isConstant() && typeBearer.getBasicType() == 6) {
                replacePlainInsn(normalSsaInsn, RegisterSpecList.EMPTY, 5, (Constant) typeBearer);
                if (opcode.getOpcode() == 56) {
                    ArrayList<SsaInsn> insns = this.ssaMeth.getBlocks().get(normalSsaInsn.getBlock().getPredecessors().nextSetBit(0)).getInsns();
                    replacePlainInsn((NormalSsaInsn) insns.get(insns.size() - 1), RegisterSpecList.EMPTY, 6, (Constant) null);
                }
                return true;
            }
        }
        return false;
    }

    public void replacePlainInsn(NormalSsaInsn normalSsaInsn, RegisterSpecList registerSpecList, int i, Constant constant) {
        Insn plainCstInsn;
        Insn originalRopInsn = normalSsaInsn.getOriginalRopInsn();
        Rop c1681RopRopFor = Rops.ropFor(i, normalSsaInsn.getResult(), registerSpecList, constant);
        if (constant == null) {
            plainCstInsn = new PlainInsn(c1681RopRopFor, originalRopInsn.getPosition(), normalSsaInsn.getResult(), registerSpecList);
        } else {
            plainCstInsn = new PlainCstInsn(c1681RopRopFor, originalRopInsn.getPosition(), normalSsaInsn.getResult(), registerSpecList, constant);
        }
        NormalSsaInsn normalSsaInsn2 = new NormalSsaInsn(plainCstInsn, normalSsaInsn.getBlock());
        ArrayList<SsaInsn> insns = normalSsaInsn.getBlock().getInsns();
        this.ssaMeth.onInsnRemoved(normalSsaInsn);
        insns.set(insns.lastIndexOf(normalSsaInsn), normalSsaInsn2);
        this.ssaMeth.onInsnAdded(normalSsaInsn2);
    }
}
