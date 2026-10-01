package com.almlkaide.kaypro.android.dx.merge;

import com.almlkaide.kaypro.android.dex.Annotation;
import com.almlkaide.kaypro.android.dex.Dex;
import com.almlkaide.kaypro.android.dex.CallSiteId;
import com.almlkaide.kaypro.android.dex.ClassDef;
import com.almlkaide.kaypro.android.dex.DexException;
import com.almlkaide.kaypro.android.dex.EncodedValue;
import com.almlkaide.kaypro.android.dex.EncodedValueCodec;
import com.almlkaide.kaypro.android.dex.EncodedValueReader;
import com.almlkaide.kaypro.android.dex.FieldId;
import com.almlkaide.kaypro.android.dex.Leb128;
import com.almlkaide.kaypro.android.dex.MethodHandle;
import com.almlkaide.kaypro.android.dex.MethodId;
import com.almlkaide.kaypro.android.dex.ProtoId;
import com.almlkaide.kaypro.android.dex.TableOfContents;
import com.almlkaide.kaypro.android.dex.TypeList;
import com.almlkaide.kaypro.android.dex.util.ByteOutput;
import com.almlkaide.kaypro.android.dx.util.ByteArrayAnnotatedOutput;
import java.util.HashMap;

public final class IndexMap {
    public final int[] callSiteIds;
    public final short[] fieldIds;
    public final short[] methodIds;
    public final short[] protoIds;
    public final int[] stringIds;
    private final Dex target;
    public final short[] typeIds;
    public final HashMap<Integer, Integer> methodHandleIds = new HashMap<>();
    private final HashMap<Integer, Integer> typeListOffsets = new HashMap<>();
    private final HashMap<Integer, Integer> annotationOffsets = new HashMap<>();
    private final HashMap<Integer, Integer> annotationSetOffsets = new HashMap<>();
    private final HashMap<Integer, Integer> annotationSetRefListOffsets = new HashMap<>();
    private final HashMap<Integer, Integer> annotationDirectoryOffsets = new HashMap<>();
    private final HashMap<Integer, Integer> encodedArrayValueOffset = new HashMap<>();

    public IndexMap(Dex c1679Dex, TableOfContents tableOfContents) {
        this.target = c1679Dex;
        this.stringIds = new int[tableOfContents.stringIds.size];
        this.typeIds = new short[tableOfContents.typeIds.size];
        this.protoIds = new short[tableOfContents.protoIds.size];
        this.fieldIds = new short[tableOfContents.fieldIds.size];
        this.methodIds = new short[tableOfContents.methodIds.size];
        this.callSiteIds = new int[tableOfContents.callSiteIds.size];
        this.typeListOffsets.put(new Integer(0), new Integer(0));
        this.annotationSetOffsets.put(new Integer(0), new Integer(0));
        this.annotationDirectoryOffsets.put(new Integer(0), new Integer(0));
        this.encodedArrayValueOffset.put(new Integer(0), new Integer(0));
    }

    public void putTypeListOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.typeListOffsets.put(new Integer(i), new Integer(i2));
    }

    public void putAnnotationOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.annotationOffsets.put(new Integer(i), new Integer(i2));
    }

    public void putAnnotationSetOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.annotationSetOffsets.put(new Integer(i), new Integer(i2));
    }

    public void putAnnotationSetRefListOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.annotationSetRefListOffsets.put(new Integer(i), new Integer(i2));
    }

    public void putAnnotationDirectoryOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.annotationDirectoryOffsets.put(new Integer(i), new Integer(i2));
    }

    public void putEncodedArrayValueOffset(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        this.encodedArrayValueOffset.put(new Integer(i), new Integer(i2));
    }

    public int adjustString(int i) {
        if (i == -1) {
            return -1;
        }
        return this.stringIds[i];
    }

    public int adjustType(int i) {
        if (i == -1) {
            return -1;
        }
        return this.typeIds[i] & 65535;
    }

    public TypeList adjustTypeList(TypeList typeList) {
        if (typeList != TypeList.EMPTY) {
            short[] sArr = (short[]) typeList.getTypes().clone();
            for (int i = 0; i < sArr.length; i++) {
                sArr[i] = (short) adjustType(sArr[i]);
            }
            return new TypeList(this.target, sArr);
        }
        return typeList;
    }

    public int adjustProto(int i) {
        return this.protoIds[i] & 65535;
    }

    public int adjustField(int i) {
        return this.fieldIds[i] & 65535;
    }

    public int adjustMethod(int i) {
        return this.methodIds[i] & 65535;
    }

    public int adjustTypeListOffset(int i) {
        return this.typeListOffsets.get(new Integer(i)).intValue();
    }

    public int adjustAnnotation(int i) {
        return this.annotationOffsets.get(new Integer(i)).intValue();
    }

    public int adjustAnnotationSet(int i) {
        return this.annotationSetOffsets.get(new Integer(i)).intValue();
    }

    public int adjustAnnotationSetRefList(int i) {
        return this.annotationSetRefListOffsets.get(new Integer(i)).intValue();
    }

    public int adjustAnnotationDirectory(int i) {
        return this.annotationDirectoryOffsets.get(new Integer(i)).intValue();
    }

    public int adjustEncodedArray(int i) {
        return this.encodedArrayValueOffset.get(new Integer(i)).intValue();
    }

    public int adjustCallSite(int i) {
        return this.callSiteIds[i];
    }

    public int adjustMethodHandle(int i) {
        return this.methodHandleIds.get(new Integer(i)).intValue();
    }

    public MethodId adjust(MethodId methodId) {
        return new MethodId(this.target, adjustType(methodId.getDeclaringClassIndex()), adjustProto(methodId.getProtoIndex()), adjustString(methodId.getNameIndex()));
    }

    public CallSiteId adjust(CallSiteId callSiteId) {
        return new CallSiteId(this.target, adjustEncodedArray(callSiteId.getCallSiteOffset()));
    }

    public MethodHandle adjust(MethodHandle methodHandle) {
        return new MethodHandle(this.target, methodHandle.getMethodHandleType(), methodHandle.getUnused1(), methodHandle.getMethodHandleType().isField() ? adjustField(methodHandle.getFieldOrMethodId()) : adjustMethod(methodHandle.getFieldOrMethodId()), methodHandle.getUnused2());
    }

    public FieldId adjust(FieldId fieldId) {
        return new FieldId(this.target, adjustType(fieldId.getDeclaringClassIndex()), adjustType(fieldId.getTypeIndex()), adjustString(fieldId.getNameIndex()));
    }

    public ProtoId adjust(ProtoId protoId) {
        return new ProtoId(this.target, adjustString(protoId.getShortyIndex()), adjustType(protoId.getReturnTypeIndex()), adjustTypeListOffset(protoId.getParametersOffset()));
    }

    public ClassDef adjust(ClassDef classDef) {
        return new ClassDef(this.target, classDef.getOffset(), adjustType(classDef.getTypeIndex()), classDef.getAccessFlags(), adjustType(classDef.getSupertypeIndex()), adjustTypeListOffset(classDef.getInterfacesOffset()), classDef.getSourceFileIndex(), classDef.getAnnotationsOffset(), classDef.getClassDataOffset(), classDef.getStaticValuesOffset());
    }

    public SortableType adjust(SortableType sortableType) {
        return new SortableType(sortableType.getDex(), sortableType.getIndexMap(), adjust(sortableType.getClassDef()));
    }

    public EncodedValue adjustEncodedValue(EncodedValue encodedValue) {
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput(32);
        new EncodedValueTransformer(this, byteArrayAnnotatedOutput).transform(new EncodedValueReader(encodedValue));
        return new EncodedValue(byteArrayAnnotatedOutput.toByteArray());
    }

    public EncodedValue adjustEncodedArray(EncodedValue encodedValue) {
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput(32);
        new EncodedValueTransformer(this, byteArrayAnnotatedOutput).transformArray(new EncodedValueReader(encodedValue, 28));
        return new EncodedValue(byteArrayAnnotatedOutput.toByteArray());
    }

    public Annotation adjust(Annotation annotation) {
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput(32);
        new EncodedValueTransformer(this, byteArrayAnnotatedOutput).transformAnnotation(annotation.getReader());
        return new Annotation(this.target, annotation.getVisibility(), new EncodedValue(byteArrayAnnotatedOutput.toByteArray()));
    }

    private final class EncodedValueTransformer {

        private final ByteOutput f5054out;
        private final IndexMap this$0;

        public EncodedValueTransformer(IndexMap indexMap, ByteOutput byteOutput) {
            this.this$0 = indexMap;
            this.f5054out = byteOutput;
        }

        public void transform(EncodedValueReader encodedValueReader) {
            switch (encodedValueReader.peek()) {
                case 0:
                    EncodedValueCodec.writeSignedIntegralValue(this.f5054out, 0, encodedValueReader.readByte());
                    return;
                case 1:
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 18:
                case 19:
                case 20:
                default:
                    throw new DexException(new StringBuffer().append("Unexpected type: ").append(Integer.toHexString(encodedValueReader.peek())).toString());
                case 2:
                    EncodedValueCodec.writeSignedIntegralValue(this.f5054out, 2, encodedValueReader.readShort());
                    return;
                case 3:
                    EncodedValueCodec.writeUnsignedIntegralValue(this.f5054out, 3, encodedValueReader.readChar());
                    return;
                case 4:
                    EncodedValueCodec.writeSignedIntegralValue(this.f5054out, 4, encodedValueReader.readInt());
                    return;
                case 6:
                    EncodedValueCodec.writeSignedIntegralValue(this.f5054out, 6, encodedValueReader.readLong());
                    return;
                case 16:
                    EncodedValueCodec.writeRightZeroExtendedValue(this.f5054out, 16, ((long) Float.floatToIntBits(encodedValueReader.readFloat())) << 32);
                    return;
                case 17:
                    EncodedValueCodec.writeRightZeroExtendedValue(this.f5054out, 17, Double.doubleToLongBits(encodedValueReader.readDouble()));
                    return;
                case 21:
                    EncodedValueCodec.writeUnsignedIntegralValue(this.f5054out, 21, this.this$0.adjustProto(encodedValueReader.readMethodType()));
                    return;
                case 22:
                    EncodedValueCodec.writeUnsignedIntegralValue(this.f5054out, 22, this.this$0.adjustMethodHandle(encodedValueReader.readMethodHandle()));
                    return;
                case 23:
                    EncodedValueCodec.writeUnsignedIntegralValue(this.f5054out, 23, this.this$0.adjustString(encodedValueReader.readString()));
                    return;
                case 24:
                    EncodedValueCodec.writeUnsignedIntegralValue(this.f5054out, 24, this.this$0.adjustType(encodedValueReader.readType()));
                    return;
                case 25:
                    EncodedValueCodec.writeUnsignedIntegralValue(this.f5054out, 25, this.this$0.adjustField(encodedValueReader.readField()));
                    return;
                case 26:
                    EncodedValueCodec.writeUnsignedIntegralValue(this.f5054out, 26, this.this$0.adjustMethod(encodedValueReader.readMethod()));
                    return;
                case 27:
                    EncodedValueCodec.writeUnsignedIntegralValue(this.f5054out, 27, this.this$0.adjustField(encodedValueReader.readEnum()));
                    return;
                case 28:
                    writeTypeAndArg(28, 0);
                    transformArray(encodedValueReader);
                    return;
                case 29:
                    writeTypeAndArg(29, 0);
                    transformAnnotation(encodedValueReader);
                    return;
                case 30:
                    encodedValueReader.readNull();
                    writeTypeAndArg(30, 0);
                    return;
                case 31:
                    writeTypeAndArg(31, encodedValueReader.readBoolean() ? 1 : 0);
                    return;
            }
        }

        public void transformAnnotation(EncodedValueReader encodedValueReader) {
            int annotation = encodedValueReader.readAnnotation();
            Leb128.writeUnsignedLeb128(this.f5054out, this.this$0.adjustType(encodedValueReader.getAnnotationType()));
            Leb128.writeUnsignedLeb128(this.f5054out, annotation);
            for (int i = 0; i < annotation; i++) {
                Leb128.writeUnsignedLeb128(this.f5054out, this.this$0.adjustString(encodedValueReader.readAnnotationName()));
                transform(encodedValueReader);
            }
        }

        public void transformArray(EncodedValueReader encodedValueReader) {
            int array = encodedValueReader.readArray();
            Leb128.writeUnsignedLeb128(this.f5054out, array);
            for (int i = 0; i < array; i++) {
                transform(encodedValueReader);
            }
        }

        private void writeTypeAndArg(int i, int i2) {
            this.f5054out.writeByte((i2 << 5) | i);
        }
    }
}
