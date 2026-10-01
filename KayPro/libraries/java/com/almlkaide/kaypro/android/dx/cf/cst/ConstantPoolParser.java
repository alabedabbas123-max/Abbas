package com.almlkaide.kaypro.android.dx.cf.cst;

import com.almlkaide.kaypro.android.dx.cf.iface.ParseException;
import com.almlkaide.kaypro.android.dx.cf.iface.ParseObserver;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstDouble;
import com.almlkaide.kaypro.android.dx.rop.cst.CstFieldRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstFloat;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInteger;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInterfaceMethodRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInvokeDynamic;
import com.almlkaide.kaypro.android.dx.rop.cst.CstLong;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodHandle;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstNat;
import com.almlkaide.kaypro.android.dx.rop.cst.CstProtoRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.cst.StdConstantPool;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.util.ByteArray;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.util.BitSet;

public final class ConstantPoolParser {
    private final ByteArray bytes;
    private int endOffset;
    private ParseObserver observer;
    private final int[] offsets;
    private final StdConstantPool pool;

    public ConstantPoolParser(ByteArray byteArray) {
        int unsignedShort = byteArray.getUnsignedShort(8);
        this.bytes = byteArray;
        this.pool = new StdConstantPool(unsignedShort);
        this.offsets = new int[unsignedShort];
        this.endOffset = -1;
    }

    public void setObserver(ParseObserver parseObserver) {
        this.observer = parseObserver;
    }

    public int getEndOffset() {
        parseIfNecessary();
        return this.endOffset;
    }

    public StdConstantPool getPool() {
        parseIfNecessary();
        return this.pool;
    }

    private void parseIfNecessary() {
        if (this.endOffset < 0) {
            parse();
        }
    }

    private void parse() {
        int i;
        determineOffsets();
        if (this.observer != null) {
            this.observer.parsed(this.bytes, 8, 2, new StringBuffer().append("constant_pool_count: ").append(Hex.m7225u2(this.offsets.length)).toString());
            this.observer.parsed(this.bytes, 10, 0, "\nconstant_pool:");
            this.observer.changeIndent(1);
        }
        BitSet bitSet = new BitSet(this.offsets.length);
        for (int i2 = 1; i2 < this.offsets.length; i2++) {
            if (this.offsets[i2] != 0 && this.pool.getOrNull(i2) == null) {
                parse0(i2, bitSet);
            }
        }
        if (this.observer != null) {
            for (int i3 = 1; i3 < this.offsets.length; i3++) {
                Constant orNull = this.pool.getOrNull(i3);
                if (orNull != null) {
                    int i4 = this.offsets[i3];
                    int i5 = this.endOffset;
                    int i6 = i3 + 1;
                    while (true) {
                        if (i6 >= this.offsets.length) {
                            i = i5;
                            break;
                        }
                        int i7 = this.offsets[i6];
                        if (i7 != 0) {
                            i = i7;
                            break;
                        }
                        i6++;
                    }
                    this.observer.parsed(this.bytes, i4, i - i4, bitSet.get(i3) ? new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(Hex.m7225u2(i3)).append(": utf8{\"").toString()).append(orNull.toHuman()).toString()).append("\"}").toString() : new StringBuffer().append(new StringBuffer().append(Hex.m7225u2(i3)).append(": ").toString()).append(orNull.toString()).toString());
                }
            }
            this.observer.changeIndent(-1);
            this.observer.parsed(this.bytes, this.endOffset, 0, "end constant_pool");
        }
    }

    private void determineOffsets() {
        int i;
        int unsignedShort = 10;
        int i2 = 1;
        while (i2 < this.offsets.length) {
            this.offsets[i2] = unsignedShort;
            int unsignedByte = this.bytes.getUnsignedByte(unsignedShort);
            switch (unsignedByte) {
                case 1:
                    try {
                        unsignedShort += this.bytes.getUnsignedShort(unsignedShort + 1) + 3;
                        i = 1;
                        continue;
                        i2 += i;
                    } catch (ParseException e) {
                        e.addContext(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("...while preparsing cst ").append(Hex.m7225u2(i2)).toString()).append(" at offset ").toString()).append(Hex.m7227u4(unsignedShort)).toString());
                        throw e;
                    }
                    break;
                case 2:
                case 13:
                case 14:
                case 17:
                default:
                    throw new ParseException(new StringBuffer().append("unknown tag byte: ").append(Hex.m7224u1(unsignedByte)).toString());
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                    unsignedShort += 5;
                    i = 1;
                    continue;
                    i2 += i;
                    break;
                case 5:
                case 6:
                    i = 2;
                    unsignedShort += 9;
                    continue;
                    i2 += i;
                    break;
                case 7:
                case 8:
                    unsignedShort += 3;
                    i = 1;
                    continue;
                    i2 += i;
                    break;
                case 15:
                    unsignedShort += 4;
                    i = 1;
                    continue;
                    i2 += i;
                    break;
                case 16:
                    unsignedShort += 3;
                    i = 1;
                    continue;
                    i2 += i;
                    break;
                case 18:
                    unsignedShort += 5;
                    i = 1;
                    continue;
                    i2 += i;
                    break;
            }
            e.addContext(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("...while preparsing cst ").append(Hex.m7225u2(i2)).toString()).append(" at offset ").toString()).append(Hex.m7227u4(unsignedShort)).toString());
            throw e;
        }
        this.endOffset = unsignedShort;
    }

    private Constant parse0(int i, BitSet bitSet) {
        Constant constant;
        Constant orNull = this.pool.getOrNull(i);
        if (orNull == null) {
            int i2 = this.offsets[i];
            try {
                int unsignedByte = this.bytes.getUnsignedByte(i2);
                switch (unsignedByte) {
                    case 1:
                        orNull = parseUtf8(i2);
                        bitSet.set(i);
                        break;
                    case 2:
                    case 13:
                    case 14:
                    case 17:
                    default:
                        throw new ParseException(new StringBuffer().append("unknown tag byte: ").append(Hex.m7224u1(unsignedByte)).toString());
                    case 3:
                        orNull = CstInteger.make(this.bytes.getInt(i2 + 1));
                        break;
                    case 4:
                        orNull = CstFloat.make(this.bytes.getInt(i2 + 1));
                        break;
                    case 5:
                        orNull = CstLong.make(this.bytes.getLong(i2 + 1));
                        break;
                    case 6:
                        orNull = CstDouble.make(this.bytes.getLong(i2 + 1));
                        break;
                    case 7:
                        orNull = new CstType(Type.internClassName(((CstString) parse0(this.bytes.getUnsignedShort(i2 + 1), bitSet)).getString()));
                        break;
                    case 8:
                        orNull = parse0(this.bytes.getUnsignedShort(i2 + 1), bitSet);
                        break;
                    case 9:
                        orNull = new CstFieldRef((CstType) parse0(this.bytes.getUnsignedShort(i2 + 1), bitSet), (CstNat) parse0(this.bytes.getUnsignedShort(i2 + 3), bitSet));
                        break;
                    case 10:
                        orNull = new CstMethodRef((CstType) parse0(this.bytes.getUnsignedShort(i2 + 1), bitSet), (CstNat) parse0(this.bytes.getUnsignedShort(i2 + 3), bitSet));
                        break;
                    case 11:
                        orNull = new CstInterfaceMethodRef((CstType) parse0(this.bytes.getUnsignedShort(i2 + 1), bitSet), (CstNat) parse0(this.bytes.getUnsignedShort(i2 + 3), bitSet));
                        break;
                    case 12:
                        orNull = new CstNat((CstString) parse0(this.bytes.getUnsignedShort(i2 + 1), bitSet), (CstString) parse0(this.bytes.getUnsignedShort(i2 + 3), bitSet));
                        break;
                    case 15:
                        int unsignedByte2 = this.bytes.getUnsignedByte(i2 + 1);
                        int unsignedShort = this.bytes.getUnsignedShort(i2 + 2);
                        switch (unsignedByte2) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                constant = (CstFieldRef) parse0(unsignedShort, bitSet);
                                break;
                            case 5:
                            case 8:
                                constant = (CstMethodRef) parse0(unsignedShort, bitSet);
                                break;
                            case 6:
                            case 7:
                                constant = parse0(unsignedShort, bitSet);
                                if (!(constant instanceof CstMethodRef) && !(constant instanceof CstInterfaceMethodRef)) {
                                    throw new ParseException(new StringBuffer().append("Unsupported ref constant type for MethodHandle ").append(constant.getClass()).toString());
                                }
                                break;
                            case 9:
                                constant = (CstInterfaceMethodRef) parse0(unsignedShort, bitSet);
                                break;
                            default:
                                throw new ParseException(new StringBuffer().append("Unsupported MethodHandle kind: ").append(unsignedByte2).toString());
                        }
                        orNull = CstMethodHandle.make(getMethodHandleTypeForKind(unsignedByte2), constant);
                        break;
                    case 16:
                        orNull = CstProtoRef.make((CstString) parse0(this.bytes.getUnsignedShort(i2 + 1), bitSet));
                        break;
                    case 18:
                        orNull = CstInvokeDynamic.make(this.bytes.getUnsignedShort(i2 + 1), (CstNat) parse0(this.bytes.getUnsignedShort(i2 + 3), bitSet));
                        break;
                }
                this.pool.m7196set(i, orNull);
            } catch (ParseException e) {
                e.addContext(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("...while parsing cst ").append(Hex.m7225u2(i)).toString()).append(" at offset ").toString()).append(Hex.m7227u4(i2)).toString());
                throw e;
            } catch (RuntimeException e2) {
                ParseException parseException = new ParseException(e2);
                parseException.addContext(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("...while parsing cst ").append(Hex.m7225u2(i)).toString()).append(" at offset ").toString()).append(Hex.m7227u4(i2)).toString());
                throw parseException;
            }
        }
        return orNull;
    }

    private CstString parseUtf8(int i) {
        int i2 = i + 3;
        try {
            return new CstString(this.bytes.slice(i2, this.bytes.getUnsignedShort(i + 1) + i2));
        } catch (IllegalArgumentException e) {
            throw new ParseException(e);
        }
    }

    private static int getMethodHandleTypeForKind(int i) {
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 0;
            case 5:
                return 5;
            case 6:
                return 4;
            case 7:
                return 7;
            case 8:
                return 6;
            case 9:
                return 8;
            default:
                throw new IllegalArgumentException(new StringBuffer().append("invalid kind: ").append(i).toString());
        }
    }
}
