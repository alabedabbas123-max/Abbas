package com.almlkaide.kaypro.android.dx.ssa;

import com.almlkaide.kaypro.android.dx.cf.code.Merger;
import com.almlkaide.kaypro.android.dx.rop.code.LocalItem;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecList;
import com.almlkaide.kaypro.android.dx.rop.type.TypeBearer;
import java.util.BitSet;
import java.util.List;

public class PhiTypeResolver {
    SsaMethod ssaMeth;
    private final BitSet worklist;

    public static void process(SsaMethod ssaMethod) {
        new PhiTypeResolver(ssaMethod).m7207run();
    }

    PhiTypeResolver(SsaMethod ssaMethod) {
        this.ssaMeth = ssaMethod;
        this.worklist = new BitSet(ssaMethod.getRegCount());
    }

    private void m7207run() {
        int regCount = this.ssaMeth.getRegCount();
        for (int i = 0; i < regCount; i++) {
            SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i);
            if (definitionForRegister != null && definitionForRegister.getResult().getBasicType() == 0) {
                this.worklist.set(i);
            }
        }
        while (true) {
            int iNextSetBit = this.worklist.nextSetBit(0);
            if (iNextSetBit < 0) {
                return;
            }
            this.worklist.clear(iNextSetBit);
            if (resolveResultType((PhiInsn) this.ssaMeth.getDefinitionForRegister(iNextSetBit))) {
                List<SsaInsn> useListForRegister = this.ssaMeth.getUseListForRegister(iNextSetBit);
                int size = useListForRegister.size();
                for (int i2 = 0; i2 < size; i2++) {
                    SsaInsn ssaInsn = useListForRegister.get(i2);
                    RegisterSpec result = ssaInsn.getResult();
                    if (result != null && (ssaInsn instanceof PhiInsn)) {
                        this.worklist.set(result.getReg());
                    }
                }
            }
        }
    }

    private static boolean equalsHandlesNulls(LocalItem localItem, LocalItem localItem2) {
        return localItem == localItem2 || (localItem != null && localItem.equals(localItem2));
    }

    boolean resolveResultType(PhiInsn phiInsn) {
        int i;
        phiInsn.updateSourcesToDefinitions(this.ssaMeth);
        RegisterSpecList sources = phiInsn.getSources();
        int i2 = -1;
        int size = sources.size();
        int i3 = 0;
        RegisterSpec registerSpec = (RegisterSpec) null;
        while (i3 < size) {
            RegisterSpec registerSpecM7188get = sources.m7188get(i3);
            if (registerSpecM7188get.getBasicType() != 0) {
                i = i3;
            } else {
                i = i2;
                registerSpecM7188get = registerSpec;
            }
            i3++;
            i2 = i;
            registerSpec = registerSpecM7188get;
        }
        if (registerSpec == null) {
            return false;
        }
        LocalItem localItem = registerSpec.getLocalItem();
        TypeBearer type = registerSpec.getType();
        boolean z = true;
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 != i2) {
                RegisterSpec registerSpecM7188get2 = sources.m7188get(i4);
                if (registerSpecM7188get2.getBasicType() != 0) {
                    z = z && equalsHandlesNulls(localItem, registerSpecM7188get2.getLocalItem());
                    type = Merger.mergeType(type, registerSpecM7188get2.getType());
                }
            }
        }
        if (type == null) {
            StringBuilder sb = new StringBuilder();
            for (int i5 = 0; i5 < size; i5++) {
                sb.append(sources.m7188get(i5).toString());
                sb.append(' ');
            }
            throw new RuntimeException(new StringBuffer().append("Couldn't map types in phi insn:").append((Object) sb).toString());
        }
        LocalItem localItem2 = z ? localItem : (LocalItem) null;
        RegisterSpec result = phiInsn.getResult();
        if (result.getTypeBearer() == type && equalsHandlesNulls(localItem2, result.getLocalItem())) {
            return false;
        }
        phiInsn.changeResultType(type, localItem2);
        return true;
    }
}
