package com.almlkaide.kaypro.android.dx.dex.code;

import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpec;
import com.almlkaide.kaypro.android.dx.rop.code.RegisterSpecSet;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.util.FixedSizeList;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

public final class LocalList extends FixedSizeList {
    private static final boolean DEBUG = false;
    public static final LocalList EMPTY = new LocalList(0);

    public LocalList(int i) {
        super(i);
    }

    public Entry m7156get(int i) {
        return (Entry) get0(i);
    }

    public void m7157set(int i, Entry entry) {
        set0(i, entry);
    }

    public void debugPrint(PrintStream printStream, String str) {
        int size = size();
        for (int i = 0; i < size; i++) {
            printStream.print(str);
            printStream.println(m7156get(i));
        }
    }

    public enum Disposition {
        START,
        END_SIMPLY,
        END_REPLACED,
        END_MOVED,
        END_CLOBBERED_BY_PREV,
        END_CLOBBERED_BY_NEXT;

        public static Disposition valueOf(String str) {
            for (Disposition disposition : values()) {
                if (disposition.name().equals(str)) {
                    return disposition;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    public static class Entry implements Comparable<Entry> {
        private final int address;
        private final Disposition disposition;
        private final RegisterSpec spec;
        private final CstType type;

        @Override
        public int compareTo(Entry entry) {
            return compareTo2(entry);
        }

        public Entry(int i, Disposition disposition, RegisterSpec registerSpec) {
            if (i < 0) {
                throw new IllegalArgumentException("address < 0");
            }
            if (disposition == null) {
                throw new NullPointerException("disposition == null");
            }
            try {
                if (registerSpec.getLocalItem() == null) {
                    throw new NullPointerException("spec.getLocalItem() == null");
                }
                this.address = i;
                this.disposition = disposition;
                this.spec = registerSpec;
                this.type = CstType.intern(registerSpec.getType());
            } catch (NullPointerException e) {
                throw new NullPointerException("spec == null");
            }
        }

        public String toString() {
            return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(Integer.toHexString(this.address)).append(" ").toString()).append(this.disposition).toString()).append(" ").toString()).append(this.spec).toString();
        }

        public boolean equals(Object obj) {
            return (obj instanceof Entry) && compareTo2((Entry) obj) == 0;
        }

        public int compareTo2(Entry entry) {
            if (this.address < entry.address) {
                return -1;
            }
            if (this.address > entry.address) {
                return 1;
            }
            boolean zIsStart = isStart();
            boolean zIsStart2 = entry.isStart();
            if (zIsStart ? !zIsStart2 : zIsStart2) {
                return !zIsStart ? -1 : 1;
            }
            return this.spec.compareTo2(entry.spec);
        }

        public int getAddress() {
            return this.address;
        }

        public Disposition getDisposition() {
            return this.disposition;
        }

        public boolean isStart() {
            return this.disposition == Disposition.START;
        }

        public CstString getName() {
            return this.spec.getLocalItem().getName();
        }

        public CstString getSignature() {
            return this.spec.getLocalItem().getSignature();
        }

        public CstType getType() {
            return this.type;
        }

        public int getRegister() {
            return this.spec.getReg();
        }

        public RegisterSpec getRegisterSpec() {
            return this.spec;
        }

        public boolean matches(RegisterSpec registerSpec) {
            return this.spec.equalsUsingSimpleType(registerSpec);
        }

        public boolean matches(Entry entry) {
            return matches(entry.spec);
        }

        public Entry withDisposition(Disposition disposition) {
            return disposition == this.disposition ? this : new Entry(this.address, disposition, this.spec);
        }
    }

    public static LocalList make(DalvInsnList dalvInsnList) {
        int size = dalvInsnList.size();
        MakeState makeState = new MakeState(size);
        for (int i = 0; i < size; i++) {
            DalvInsn dalvInsnM7152get = dalvInsnList.m7152get(i);
            if (dalvInsnM7152get instanceof LocalSnapshot) {
                makeState.snapshot(dalvInsnM7152get.getAddress(), ((LocalSnapshot) dalvInsnM7152get).getLocals());
            } else if (dalvInsnM7152get instanceof LocalStart) {
                makeState.startLocal(dalvInsnM7152get.getAddress(), ((LocalStart) dalvInsnM7152get).getLocal());
            }
        }
        return makeState.finish();
    }

    private static void debugVerify(LocalList localList) {
        try {
            debugVerify0(localList);
        } catch (RuntimeException e) {
            int size = localList.size();
            for (int i = 0; i < size; i++) {
                System.err.println(localList.m7156get(i));
            }
            throw e;
        }
    }

    private static void debugVerify0(LocalList localList) {
        int size = localList.size();
        Entry[] entryArr = new Entry[65536];
        for (int i = 0; i < size; i++) {
            Entry entryM7156get = localList.m7156get(i);
            int register = entryM7156get.getRegister();
            if (entryM7156get.isStart()) {
                Entry entry = entryArr[register];
                if (entry != null && entryM7156get.matches(entry)) {
                    throw new RuntimeException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("redundant start at ").append(Integer.toHexString(entryM7156get.getAddress())).toString()).append(": got ").toString()).append(entryM7156get).toString()).append("; had ").toString()).append(entry).toString());
                }
                entryArr[register] = entryM7156get;
            } else {
                if (entryArr[register] == null) {
                    throw new RuntimeException(new StringBuffer().append("redundant end at ").append(Integer.toHexString(entryM7156get.getAddress())).toString());
                }
                int address = entryM7156get.getAddress();
                boolean z = false;
                for (int i2 = i + 1; i2 < size; i2++) {
                    Entry entryM7156get2 = localList.m7156get(i2);
                    if (entryM7156get2.getAddress() != address) {
                        break;
                    }
                    if (entryM7156get2.getRegisterSpec().getReg() == register) {
                        if (entryM7156get2.isStart()) {
                            if (entryM7156get.getDisposition() != Disposition.END_REPLACED) {
                                throw new RuntimeException(new StringBuffer().append("improperly marked end at ").append(Integer.toHexString(address)).toString());
                            }
                            z = true;
                        } else {
                            throw new RuntimeException(new StringBuffer().append("redundant end at ").append(Integer.toHexString(address)).toString());
                        }
                    }
                }
                if (!z && entryM7156get.getDisposition() == Disposition.END_REPLACED) {
                    throw new RuntimeException(new StringBuffer().append("improper end replacement claim at ").append(Integer.toHexString(address)).toString());
                }
                entryArr[register] = (Entry) null;
            }
        }
    }

    public static class MakeState {
        private final ArrayList<Entry> result;
        private int nullResultCount = 0;
        private RegisterSpecSet regs = (RegisterSpecSet) null;
        private int[] endIndices = (int[]) null;
        private final int lastAddress = 0;

        public MakeState(int i) {
            this.result = new ArrayList<>(i);
        }

        private void aboutToProcess(int i, int i2) {
            boolean z = this.endIndices == null;
            if (i != this.lastAddress || z) {
                if (i < this.lastAddress) {
                    throw new RuntimeException("shouldn't happen");
                }
                if (z || i2 >= this.endIndices.length) {
                    int i3 = i2 + 1;
                    RegisterSpecSet registerSpecSet = new RegisterSpecSet(i3);
                    int[] iArr = new int[i3];
                    Arrays.fill(iArr, -1);
                    if (!z) {
                        registerSpecSet.putAll(this.regs);
                        System.arraycopy(this.endIndices, 0, iArr, 0, this.endIndices.length);
                    }
                    this.regs = registerSpecSet;
                    this.endIndices = iArr;
                }
            }
        }

        public void snapshot(int i, RegisterSpecSet registerSpecSet) {
            int maxSize = registerSpecSet.getMaxSize();
            aboutToProcess(i, maxSize - 1);
            for (int i2 = 0; i2 < maxSize; i2++) {
                RegisterSpec registerSpecM7190get = this.regs.m7190get(i2);
                RegisterSpec registerSpecFilterSpec = filterSpec(registerSpecSet.m7190get(i2));
                if (registerSpecM7190get == null) {
                    if (registerSpecFilterSpec != null) {
                        startLocal(i, registerSpecFilterSpec);
                    }
                } else if (registerSpecFilterSpec == null) {
                    endLocal(i, registerSpecM7190get);
                } else if (!registerSpecFilterSpec.equalsUsingSimpleType(registerSpecM7190get)) {
                    endLocal(i, registerSpecM7190get);
                    startLocal(i, registerSpecFilterSpec);
                }
            }
        }

        public void startLocal(int i, RegisterSpec registerSpec) {
            RegisterSpec registerSpecM7190get;
            RegisterSpec registerSpecM7190get2;
            int reg = registerSpec.getReg();
            RegisterSpec registerSpecFilterSpec = filterSpec(registerSpec);
            aboutToProcess(i, reg);
            RegisterSpec registerSpecM7190get3 = this.regs.m7190get(reg);
            if (!registerSpecFilterSpec.equalsUsingSimpleType(registerSpecM7190get3)) {
                RegisterSpec registerSpecFindMatchingLocal = this.regs.findMatchingLocal(registerSpecFilterSpec);
                if (registerSpecFindMatchingLocal != null) {
                    addOrUpdateEnd(i, Disposition.END_MOVED, registerSpecFindMatchingLocal);
                }
                int i2 = this.endIndices[reg];
                if (registerSpecM7190get3 != null) {
                    m7158add(i, Disposition.END_REPLACED, registerSpecM7190get3);
                } else if (i2 >= 0) {
                    Entry entry = this.result.get(i2);
                    if (entry.getAddress() == i) {
                        if (entry.matches(registerSpecFilterSpec)) {
                            this.result.set(i2, (Entry) null);
                            this.nullResultCount++;
                            this.regs.m7192put(registerSpecFilterSpec);
                            this.endIndices[reg] = -1;
                            return;
                        }
                        this.result.set(i2, entry.withDisposition(Disposition.END_REPLACED));
                    }
                }
                if (reg > 0 && (registerSpecM7190get2 = this.regs.m7190get(reg - 1)) != null && registerSpecM7190get2.isCategory2()) {
                    addOrUpdateEnd(i, Disposition.END_CLOBBERED_BY_NEXT, registerSpecM7190get2);
                }
                if (registerSpecFilterSpec.isCategory2() && (registerSpecM7190get = this.regs.m7190get(reg + 1)) != null) {
                    addOrUpdateEnd(i, Disposition.END_CLOBBERED_BY_PREV, registerSpecM7190get);
                }
                m7158add(i, Disposition.START, registerSpecFilterSpec);
            }
        }

        public void endLocal(int i, RegisterSpec registerSpec) {
            endLocal(i, registerSpec, Disposition.END_SIMPLY);
        }

        public void endLocal(int i, RegisterSpec registerSpec, Disposition disposition) {
            int reg = registerSpec.getReg();
            RegisterSpec registerSpecFilterSpec = filterSpec(registerSpec);
            aboutToProcess(i, reg);
            if (this.endIndices[reg] < 0 && !checkForEmptyRange(i, registerSpecFilterSpec)) {
                m7158add(i, disposition, registerSpecFilterSpec);
            }
        }

        private boolean checkForEmptyRange(int i, RegisterSpec registerSpec) {
            boolean z = false;
            int size = this.result.size() - 1;
            while (size >= 0) {
                Entry entry = this.result.get(size);
                if (entry != null) {
                    if (entry.getAddress() != i) {
                        return false;
                    }
                    if (entry.matches(registerSpec)) {
                        break;
                    }
                }
                size--;
            }
            this.regs.remove(registerSpec);
            this.result.set(size, (Entry) null);
            this.nullResultCount++;
            int reg = registerSpec.getReg();
            int i2 = size - 1;
            Entry entry2 = (Entry) null;
            while (i2 >= 0) {
                entry2 = this.result.get(i2);
                if (entry2 != null && entry2.getRegisterSpec().getReg() == reg) {
                    z = true;
                    break;
                }
                i2--;
            }
            if (z) {
                this.endIndices[reg] = i2;
                if (entry2.getAddress() == i) {
                    this.result.set(i2, entry2.withDisposition(Disposition.END_SIMPLY));
                }
            }
            return true;
        }

        private static RegisterSpec filterSpec(RegisterSpec registerSpec) {
            if (registerSpec != null && registerSpec.getType() == Type.KNOWN_NULL) {
                return registerSpec.withType(Type.OBJECT);
            }
            return registerSpec;
        }

        private void m7158add(int i, Disposition disposition, RegisterSpec registerSpec) {
            int reg = registerSpec.getReg();
            this.result.add(new Entry(i, disposition, registerSpec));
            if (disposition == Disposition.START) {
                this.regs.m7192put(registerSpec);
                this.endIndices[reg] = -1;
            } else {
                this.regs.remove(registerSpec);
                this.endIndices[reg] = this.result.size() - 1;
            }
        }

        private void addOrUpdateEnd(int i, Disposition disposition, RegisterSpec registerSpec) {
            if (disposition == Disposition.START) {
                throw new RuntimeException("shouldn't happen");
            }
            int i2 = this.endIndices[registerSpec.getReg()];
            if (i2 >= 0) {
                Entry entry = this.result.get(i2);
                if (entry.getAddress() == i && entry.getRegisterSpec().equals(registerSpec)) {
                    this.result.set(i2, entry.withDisposition(disposition));
                    this.regs.remove(registerSpec);
                    return;
                }
            }
            endLocal(i, registerSpec, disposition);
        }

        public LocalList finish() {
            aboutToProcess(Integer.MAX_VALUE, 0);
            int size = this.result.size();
            int i = size - this.nullResultCount;
            if (i == 0) {
                return LocalList.EMPTY;
            }
            Entry[] entryArr = new Entry[i];
            if (size == i) {
                this.result.toArray(entryArr);
            } else {
                int i2 = 0;
                for (Entry entry : this.result) {
                    if (entry != null) {
                        entryArr[i2] = entry;
                        i2++;
                    }
                }
            }
            Arrays.sort(entryArr);
            LocalList localList = new LocalList(i);
            for (int i3 = 0; i3 < i; i3++) {
                localList.m7157set(i3, entryArr[i3]);
            }
            localList.setImmutable();
            return localList;
        }
    }
}
