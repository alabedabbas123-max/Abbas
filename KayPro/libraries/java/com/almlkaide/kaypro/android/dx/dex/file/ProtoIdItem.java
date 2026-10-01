package com.almlkaide.kaypro.android.dx.dex.file;

import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.type.Prototype;
import com.almlkaide.kaypro.android.dx.rop.type.StdTypeList;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.util.AnnotatedOutput;
import com.almlkaide.kaypro.android.dx.util.Hex;

public final class ProtoIdItem extends IndexedItem {
    private TypeListItem parameterTypes;
    private final Prototype prototype;
    private final CstString shortForm;

    public ProtoIdItem(Prototype prototype) {
        if (prototype == null) {
            throw new NullPointerException("prototype == null");
        }
        this.prototype = prototype;
        this.shortForm = makeShortForm(prototype);
        StdTypeList parameterTypes = prototype.getParameterTypes();
        this.parameterTypes = parameterTypes.size() == 0 ? (TypeListItem) null : new TypeListItem(parameterTypes);
    }

    private static CstString makeShortForm(Prototype prototype) {
        StdTypeList parameterTypes = prototype.getParameterTypes();
        int size = parameterTypes.size();
        StringBuilder sb = new StringBuilder(size + 1);
        sb.append(shortFormCharFor(prototype.getReturnType()));
        for (int i = 0; i < size; i++) {
            sb.append(shortFormCharFor(parameterTypes.getType(i)));
        }
        return new CstString(sb.toString());
    }

    private static char shortFormCharFor(Type type) {
        char cCharAt = type.getDescriptor().charAt(0);
        if (cCharAt == '[') {
            return 'L';
        }
        return cCharAt;
    }

    @Override
    public ItemType itemType() {
        return ItemType.TYPE_PROTO_ID_ITEM;
    }

    @Override
    public int writeSize() {
        return 12;
    }

    @Override
    public void addContents(DexFile dexFile) {
        StringIdsSection stringIds = dexFile.getStringIds();
        TypeIdsSection typeIds = dexFile.getTypeIds();
        MixedItemSection typeLists = dexFile.getTypeLists();
        typeIds.intern(this.prototype.getReturnType());
        stringIds.intern(this.shortForm);
        if (this.parameterTypes != null) {
            this.parameterTypes = (TypeListItem) typeLists.intern(this.parameterTypes);
        }
    }

    @Override
    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int iIndexOf = dexFile.getStringIds().indexOf(this.shortForm);
        int iIndexOf2 = dexFile.getTypeIds().indexOf(this.prototype.getReturnType());
        int absoluteOffsetOr0 = OffsettedItem.getAbsoluteOffsetOr0(this.parameterTypes);
        if (annotatedOutput.annotates()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.prototype.getReturnType().toHuman());
            sb.append(" proto(");
            StdTypeList parameterTypes = this.prototype.getParameterTypes();
            int size = parameterTypes.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(parameterTypes.getType(i).toHuman());
            }
            sb.append(")");
            annotatedOutput.annotate(0, new StringBuffer().append(new StringBuffer().append(indexString()).append(' ').toString()).append(sb.toString()).toString());
            annotatedOutput.annotate(4, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("  shorty_idx:      ").append(Hex.m7227u4(iIndexOf)).toString()).append(" // ").toString()).append(this.shortForm.toQuoted()).toString());
            annotatedOutput.annotate(4, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("  return_type_idx: ").append(Hex.m7227u4(iIndexOf2)).toString()).append(" // ").toString()).append(this.prototype.getReturnType().toHuman()).toString());
            annotatedOutput.annotate(4, new StringBuffer().append("  parameters_off:  ").append(Hex.m7227u4(absoluteOffsetOr0)).toString());
        }
        annotatedOutput.writeInt(iIndexOf);
        annotatedOutput.writeInt(iIndexOf2);
        annotatedOutput.writeInt(absoluteOffsetOr0);
    }
}
