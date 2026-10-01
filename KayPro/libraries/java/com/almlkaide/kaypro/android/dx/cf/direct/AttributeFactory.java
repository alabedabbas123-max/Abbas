package com.almlkaide.kaypro.android.dx.cf.direct;

import com.almlkaide.kaypro.android.dx.cf.attrib.RawAttribute;
import com.almlkaide.kaypro.android.dx.cf.iface.Attribute;
import com.almlkaide.kaypro.android.dx.cf.iface.ParseException;
import com.almlkaide.kaypro.android.dx.cf.iface.ParseObserver;
import com.almlkaide.kaypro.android.dx.rop.cst.ConstantPool;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.util.ByteArray;
import com.almlkaide.kaypro.android.dx.util.Hex;

public class AttributeFactory {
    public static final int CTX_CLASS = 0;
    public static final int CTX_CODE = 3;
    public static final int CTX_COUNT = 4;
    public static final int CTX_FIELD = 1;
    public static final int CTX_METHOD = 2;

    public final Attribute parse(DirectClassFile directClassFile, int i, int i2, ParseObserver parseObserver) {
        CstString cstString;
        if (directClassFile == null) {
            throw new NullPointerException("cf == null");
        }
        if (i < 0 || i >= 4) {
            throw new IllegalArgumentException("bad context");
        }
        CstString cstString2 = (CstString) null;
        try {
            ByteArray bytes = directClassFile.getBytes();
            ConstantPool constantPool = directClassFile.getConstantPool();
            int unsignedShort = bytes.getUnsignedShort(i2);
            int i3 = bytes.getInt(i2 + 2);
            cstString = (CstString) constantPool.mo7193get(unsignedShort);
            if (parseObserver != null) {
                try {
                    parseObserver.parsed(bytes, i2, 2, new StringBuffer().append("name: ").append(cstString.toHuman()).toString());
                    parseObserver.parsed(bytes, i2 + 2, 4, new StringBuffer().append("length: ").append(Hex.m7227u4(i3)).toString());
                } catch (ParseException e) {
                    e = e;
                    e.addContext(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("...while parsing ").append(cstString != null ? new StringBuffer().append(cstString.toHuman()).append(" ").toString() : "").toString()).append("attribute at offset ").toString()).append(Hex.m7227u4(i2)).toString());
                    throw e;
                }
            }
            return parse0(directClassFile, i, cstString.getString(), i2 + 6, i3, parseObserver);
        } catch (ParseException e2) {
            e = e2;
            cstString = cstString2;
        }
    }

    protected Attribute parse0(DirectClassFile directClassFile, int i, String str, int i2, int i3, ParseObserver parseObserver) {
        ByteArray bytes = directClassFile.getBytes();
        RawAttribute rawAttribute = new RawAttribute(str, bytes, i2, i3, directClassFile.getConstantPool());
        if (parseObserver != null) {
            parseObserver.parsed(bytes, i2, i3, "attribute data");
        }
        return rawAttribute;
    }
}
