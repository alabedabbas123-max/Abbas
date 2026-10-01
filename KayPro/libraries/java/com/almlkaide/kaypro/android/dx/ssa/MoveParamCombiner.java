package com.almlkaide.kaypro.android.dx.ssa;

import com.almlkaide.kaypro.android.dx.rop.code.CstInsn;
import com.almlkaide.kaypro.android.dx.rop.code.LocalItem;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInteger;
import java.util.HashSet;
import java.util.List;

public class MoveParamCombiner {
    private final SsaMethod ssaMeth;

    public static void process(SsaMethod ssaMethod) {
        new MoveParamCombiner(ssaMethod).m7206run();
    }

    MoveParamCombiner(SsaMethod ssaMethod) {
        this.ssaMeth = ssaMethod;
    }

    private void m7206run() {
        RegisterSpec[] registerSpecArr = new RegisterSpec[this.ssaMeth.getParamWidth()];
        HashSet hashSet = new HashSet();
        this.ssaMeth.forEachInsn(new AnonymousClass100000001(this, registerSpecArr, hashSet));
        this.ssaMeth.deleteInsns(hashSet);
    }

    class AnonymousClass100000001 implements SsaInsn.Visitor {
        private final MoveParamCombiner this$0;
        private final HashSet val$deletedInsns;
        private final RegisterSpec[] val$paramSpecs;

        AnonymousClass100000001(MoveParamCombiner moveParamCombiner, RegisterSpec[] registerSpecArr, HashSet hashSet) {
            this.this$0 = moveParamCombiner;
            this.val$paramSpecs = registerSpecArr;
            this.val$deletedInsns = hashSet;
        }

        @Override
        public void visitMoveInsn(NormalSsaInsn normalSsaInsn) {
        }

        @Override
        public void visitPhiInsn(PhiInsn phiInsn) {
        }

        @Override
        public void visitNonMoveInsn(NormalSsaInsn normalSsaInsn) {
            if (normalSsaInsn.getOpcode().getOpcode() == 3) {
                int paramIndex = this.this$0.getParamIndex(normalSsaInsn);
                if (this.val$paramSpecs[paramIndex] == null) {
                    this.val$paramSpecs[paramIndex] = normalSsaInsn.getResult();
                    return;
                }
                RegisterSpec registerSpec = this.val$paramSpecs[paramIndex];
                RegisterSpec result = normalSsaInsn.getResult();
                LocalItem localItem = registerSpec.getLocalItem();
                LocalItem localItem2 = result.getLocalItem();
                if (localItem != null) {
                    if (localItem2 != null && !localItem.equals(localItem2)) {
                        return;
                    } else {
                        localItem2 = localItem;
                    }
                }
                this.this$0.ssaMeth.getDefinitionForRegister(registerSpec.getReg()).setResultLocal(localItem2);
                RegisterMapper registerMapper = new RegisterMapper(this, result, registerSpec) {
                    private final AnonymousClass100000001 this$0;
                    private final RegisterSpec val$specA;
                    private final RegisterSpec val$specB;

                    {
                        this.this$0 = this;
                        this.val$specB = result;
                        this.val$specA = registerSpec;
                    }

                    @Override
                    public int getNewRegisterCount() {
                        return this.this$0.this$0.ssaMeth.getRegCount();
                    }

                    @Override
                    public RegisterSpec mo7199map(RegisterSpec registerSpec2) {
                        if (registerSpec2.getReg() == this.val$specB.getReg()) {
                            return this.val$specA;
                        }
                        return registerSpec2;
                    }
                };
                List<SsaInsn> useListForRegister = this.this$0.ssaMeth.getUseListForRegister(result.getReg());
                for (int size = useListForRegister.size() - 1; size >= 0; size--) {
                    useListForRegister.get(size).mapSourceRegisters(registerMapper);
                }
                this.val$deletedInsns.add(normalSsaInsn);
            }
        }
    }

    public int getParamIndex(NormalSsaInsn normalSsaInsn) {
        return ((CstInteger) ((CstInsn) normalSsaInsn.getOriginalRopInsn()).getConstant()).getValue();
    }
}
