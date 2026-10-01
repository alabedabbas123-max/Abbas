package com.almlkaide.kaypro.android.dx.cf.direct;

import com.almlkaide.kaypro.android.dx.cf.iface.AttributeList;
import com.almlkaide.kaypro.android.dx.cf.iface.Member;
import com.almlkaide.kaypro.android.dx.cf.iface.ParseException;
import com.almlkaide.kaypro.android.dx.cf.iface.ParseObserver;
import com.almlkaide.kaypro.android.dx.cf.iface.StdAttributeList;
import com.almlkaide.kaypro.android.dx.rop.cst.ConstantPool;
import com.almlkaide.kaypro.android.dx.rop.cst.CstNat;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.util.ByteArray;
import com.almlkaide.kaypro.android.dx.util.Hex;
import org.apache.commons.io.IOUtils;

abstract class MemberListParser {
    private final AttributeFactory attributeFactory;

    private final DirectClassFile f5011cf;
    private final CstType definer;
    private int endOffset;
    private ParseObserver observer;
    private final int offset;

    protected abstract int getAttributeContext();

    protected abstract String humanAccessFlags(int i);

    protected abstract String humanName();

    protected abstract Member mo7137set(int i, int i2, CstNat cstNat, AttributeList attributeList);

    public MemberListParser(DirectClassFile directClassFile, CstType cstType, int i, AttributeFactory attributeFactory) {
        if (directClassFile == null) {
            throw new NullPointerException("cf == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (attributeFactory == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        this.f5011cf = directClassFile;
        this.definer = cstType;
        this.offset = i;
        this.attributeFactory = attributeFactory;
        this.endOffset = -1;
    }

    public int getEndOffset() {
        parseIfNecessary();
        return this.endOffset;
    }

    public final void setObserver(ParseObserver parseObserver) {
        this.observer = parseObserver;
    }

    protected final void parseIfNecessary() {
        if (this.endOffset < 0) {
            parse();
        }
    }

    protected final int getCount() {
        return this.f5011cf.getBytes().getUnsignedShort(this.offset);
    }

    protected final CstType getDefiner() {
        return this.definer;
    }

    private void parse() {
        int attributeContext = getAttributeContext();
        int count = getCount();
        int endOffset = this.offset + 2;
        ByteArray bytes = this.f5011cf.getBytes();
        ConstantPool constantPool = this.f5011cf.getConstantPool();
        if (this.observer != null) {
            this.observer.parsed(bytes, this.offset, 2, new StringBuffer().append(new StringBuffer().append(humanName()).append("s_count: ").toString()).append(Hex.m7225u2(count)).toString());
        }
        for (int i = 0; i < count; i++) {
            try {
                int unsignedShort = bytes.getUnsignedShort(endOffset);
                int unsignedShort2 = bytes.getUnsignedShort(endOffset + 2);
                int unsignedShort3 = bytes.getUnsignedShort(endOffset + 4);
                CstString cstString = (CstString) constantPool.mo7193get(unsignedShort2);
                CstString cstString2 = (CstString) constantPool.mo7193get(unsignedShort3);
                if (this.observer != null) {
                    this.observer.startParsingMember(bytes, endOffset, cstString.getString(), cstString2.getString());
                    this.observer.parsed(bytes, endOffset, 0, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(IOUtils.LINE_SEPARATOR_UNIX).append(humanName()).toString()).append("s[").toString()).append(i).toString()).append("]:\n").toString());
                    this.observer.changeIndent(1);
                    this.observer.parsed(bytes, endOffset, 2, new StringBuffer().append("access_flags: ").append(humanAccessFlags(unsignedShort)).toString());
                    this.observer.parsed(bytes, endOffset + 2, 2, new StringBuffer().append("name: ").append(cstString.toHuman()).toString());
                    this.observer.parsed(bytes, endOffset + 4, 2, new StringBuffer().append("descriptor: ").append(cstString2.toHuman()).toString());
                }
                AttributeListParser attributeListParser = new AttributeListParser(this.f5011cf, attributeContext, endOffset + 6, this.attributeFactory);
                attributeListParser.setObserver(this.observer);
                endOffset = attributeListParser.getEndOffset();
                StdAttributeList list = attributeListParser.getList();
                list.setImmutable();
                Member memberMo7137set = mo7137set(i, unsignedShort, new CstNat(cstString, cstString2), list);
                if (this.observer != null) {
                    this.observer.changeIndent(-1);
                    this.observer.parsed(bytes, endOffset, 0, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("end ").append(humanName()).toString()).append("s[").toString()).append(i).toString()).append("]\n").toString());
                    this.observer.endParsingMember(bytes, endOffset, cstString.getString(), cstString2.getString(), memberMo7137set);
                }
            } catch (ParseException e) {
                e.addContext(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("...while parsing ").append(humanName()).toString()).append("s[").toString()).append(i).toString()).append("]").toString());
                throw e;
            } catch (RuntimeException e2) {
                ParseException parseException = new ParseException(e2);
                parseException.addContext(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("...while parsing ").append(humanName()).toString()).append("s[").toString()).append(i).toString()).append("]").toString());
                throw parseException;
            }
        }
        this.endOffset = endOffset;
    }
}
