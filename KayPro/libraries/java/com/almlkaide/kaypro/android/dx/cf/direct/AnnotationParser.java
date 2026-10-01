package com.almlkaide.kaypro.android.dx.cf.direct;

import com.almlkaide.kaypro.android.dx.cf.iface.ParseException;
import com.almlkaide.kaypro.android.dx.cf.iface.ParseObserver;
import com.almlkaide.kaypro.android.dx.rop.annotation.Annotation;
import com.almlkaide.kaypro.android.dx.rop.annotation.AnnotationVisibility;
import com.almlkaide.kaypro.android.dx.rop.annotation.Annotations;
import com.almlkaide.kaypro.android.dx.rop.annotation.AnnotationsList;
import com.almlkaide.kaypro.android.dx.rop.annotation.NameValuePair;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.ConstantPool;
import com.almlkaide.kaypro.android.dx.rop.cst.CstAnnotation;
import com.almlkaide.kaypro.android.dx.rop.cst.CstArray;
import com.almlkaide.kaypro.android.dx.rop.cst.CstBoolean;
import com.almlkaide.kaypro.android.dx.rop.cst.CstByte;
import com.almlkaide.kaypro.android.dx.rop.cst.CstChar;
import com.almlkaide.kaypro.android.dx.rop.cst.CstDouble;
import com.almlkaide.kaypro.android.dx.rop.cst.CstEnumRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstFloat;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInteger;
import com.almlkaide.kaypro.android.dx.rop.cst.CstLong;
import com.almlkaide.kaypro.android.dx.rop.cst.CstNat;
import com.almlkaide.kaypro.android.dx.rop.cst.CstShort;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.util.ByteArray;
import com.almlkaide.kaypro.android.dx.util.Hex;
import java.io.IOException;

public final class AnnotationParser {
    private final ByteArray bytes;

    private final DirectClassFile f5009cf;
    private final ByteArray.MyDataInputStream input;
    private final ParseObserver observer;
    private int parseCursor;
    private final ConstantPool pool;

    public AnnotationParser(DirectClassFile directClassFile, int i, int i2, ParseObserver parseObserver) {
        if (directClassFile == null) {
            throw new NullPointerException("cf == null");
        }
        this.f5009cf = directClassFile;
        this.pool = directClassFile.getConstantPool();
        this.observer = parseObserver;
        this.bytes = directClassFile.getBytes().slice(i, i + i2);
        this.input = this.bytes.makeDataInputStream();
        this.parseCursor = 0;
    }

    public Constant parseValueAttribute() {
        try {
            Constant value = parseValue();
            if (this.input.available() != 0) {
                throw new ParseException("extra data in attribute");
            }
            return value;
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    public AnnotationsList parseParameterAttribute(AnnotationVisibility annotationVisibility) {
        try {
            AnnotationsList annotationsList = parseAnnotationsList(annotationVisibility);
            if (this.input.available() != 0) {
                throw new ParseException("extra data in attribute");
            }
            return annotationsList;
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    public Annotations parseAnnotationAttribute(AnnotationVisibility annotationVisibility) {
        try {
            Annotations annotations = parseAnnotations(annotationVisibility);
            if (this.input.available() != 0) {
                throw new ParseException("extra data in attribute");
            }
            return annotations;
        } catch (IOException e) {
            throw new RuntimeException("shouldn't happen", e);
        }
    }

    private AnnotationsList parseAnnotationsList(AnnotationVisibility annotationVisibility) throws IOException {
        int unsignedByte = this.input.readUnsignedByte();
        if (this.observer != null) {
            parsed(1, new StringBuffer().append("num_parameters: ").append(Hex.m7224u1(unsignedByte)).toString());
        }
        AnnotationsList annotationsList = new AnnotationsList(unsignedByte);
        for (int i = 0; i < unsignedByte; i++) {
            if (this.observer != null) {
                parsed(0, new StringBuffer().append(new StringBuffer().append("parameter_annotations[").append(i).toString()).append("]:").toString());
                changeIndent(1);
            }
            annotationsList.m7180set(i, parseAnnotations(annotationVisibility));
            if (this.observer != null) {
                this.observer.changeIndent(-1);
            }
        }
        annotationsList.setImmutable();
        return annotationsList;
    }

    private Annotations parseAnnotations(AnnotationVisibility annotationVisibility) throws IOException {
        int unsignedShort = this.input.readUnsignedShort();
        if (this.observer != null) {
            parsed(2, new StringBuffer().append("num_annotations: ").append(Hex.m7225u2(unsignedShort)).toString());
        }
        Annotations annotations = new Annotations();
        for (int i = 0; i < unsignedShort; i++) {
            if (this.observer != null) {
                parsed(0, new StringBuffer().append(new StringBuffer().append("annotations[").append(i).toString()).append("]:").toString());
                changeIndent(1);
            }
            annotations.m7178add(parseAnnotation(annotationVisibility));
            if (this.observer != null) {
                this.observer.changeIndent(-1);
            }
        }
        annotations.setImmutable();
        return annotations;
    }

    private Annotation parseAnnotation(AnnotationVisibility annotationVisibility) throws IOException {
        requireLength(4);
        int unsignedShort = this.input.readUnsignedShort();
        int unsignedShort2 = this.input.readUnsignedShort();
        CstType cstType = new CstType(Type.intern(((CstString) this.pool.mo7193get(unsignedShort)).getString()));
        if (this.observer != null) {
            parsed(2, new StringBuffer().append("type: ").append(cstType.toHuman()).toString());
            parsed(2, new StringBuffer().append("num_elements: ").append(unsignedShort2).toString());
        }
        Annotation annotation = new Annotation(cstType, annotationVisibility);
        for (int i = 0; i < unsignedShort2; i++) {
            if (this.observer != null) {
                parsed(0, new StringBuffer().append(new StringBuffer().append("elements[").append(i).toString()).append("]:").toString());
                changeIndent(1);
            }
            annotation.m7176add(parseElement());
            if (this.observer != null) {
                changeIndent(-1);
            }
        }
        annotation.setImmutable();
        return annotation;
    }

    private NameValuePair parseElement() throws IOException {
        requireLength(5);
        CstString cstString = (CstString) this.pool.mo7193get(this.input.readUnsignedShort());
        if (this.observer != null) {
            parsed(2, new StringBuffer().append("element_name: ").append(cstString.toHuman()).toString());
            parsed(0, "value: ");
            changeIndent(1);
        }
        Constant value = parseValue();
        if (this.observer != null) {
            changeIndent(-1);
        }
        return new NameValuePair(cstString, value);
    }

    private Constant parseValue() throws IOException {
        int unsignedByte = this.input.readUnsignedByte();
        if (this.observer != null) {
            parsed(1, new StringBuffer().append("tag: ").append(new CstString(Character.toString((char) unsignedByte)).toQuoted()).toString());
        }
        switch (unsignedByte) {
            case 64:
                return new CstAnnotation(parseAnnotation(AnnotationVisibility.EMBEDDED));
            case 66:
                return CstByte.make(((CstInteger) parseConstant()).getValue());
            case 67:
                CstInteger cstInteger = (CstInteger) parseConstant();
                cstInteger.getValue();
                return CstChar.make(cstInteger.getValue());
            case 68:
                return (CstDouble) parseConstant();
            case 70:
                return (CstFloat) parseConstant();
            case 73:
                return (CstInteger) parseConstant();
            case 74:
                return (CstLong) parseConstant();
            case 83:
                return CstShort.make(((CstInteger) parseConstant()).getValue());
            case 90:
                return CstBoolean.make(((CstInteger) parseConstant()).getValue());
            case 91:
                requireLength(2);
                int unsignedShort = this.input.readUnsignedShort();
                CstArray.List list = new CstArray.List(unsignedShort);
                if (this.observer != null) {
                    parsed(2, new StringBuffer().append("num_values: ").append(unsignedShort).toString());
                    changeIndent(1);
                }
                for (int i = 0; i < unsignedShort; i++) {
                    if (this.observer != null) {
                        changeIndent(-1);
                        parsed(0, new StringBuffer().append(new StringBuffer().append("element_value[").append(i).toString()).append("]:").toString());
                        changeIndent(1);
                    }
                    list.m7195set(i, parseValue());
                }
                if (this.observer != null) {
                    changeIndent(-1);
                }
                list.setImmutable();
                return new CstArray(list);
            case 99:
                Type typeInternReturnType = Type.internReturnType(((CstString) this.pool.mo7193get(this.input.readUnsignedShort())).getString());
                if (this.observer != null) {
                    parsed(2, new StringBuffer().append("class_info: ").append(typeInternReturnType.toHuman()).toString());
                }
                return new CstType(typeInternReturnType);
            case 101:
                requireLength(4);
                int unsignedShort2 = this.input.readUnsignedShort();
                int unsignedShort3 = this.input.readUnsignedShort();
                CstString cstString = (CstString) this.pool.mo7193get(unsignedShort2);
                CstString cstString2 = (CstString) this.pool.mo7193get(unsignedShort3);
                if (this.observer != null) {
                    parsed(2, new StringBuffer().append("type_name: ").append(cstString.toHuman()).toString());
                    parsed(2, new StringBuffer().append("const_name: ").append(cstString2.toHuman()).toString());
                }
                return new CstEnumRef(new CstNat(cstString2, cstString));
            case 115:
                return parseConstant();
            default:
                throw new ParseException(new StringBuffer().append("unknown annotation tag: ").append(Hex.m7224u1(unsignedByte)).toString());
        }
    }

    private Constant parseConstant() throws IOException {
        Constant constantMo7193get = this.pool.mo7193get(this.input.readUnsignedShort());
        if (this.observer != null) {
            parsed(2, new StringBuffer().append("constant_value: ").append(constantMo7193get instanceof CstString ? ((CstString) constantMo7193get).toQuoted() : constantMo7193get.toHuman()).toString());
        }
        return constantMo7193get;
    }

    private void requireLength(int i) throws IOException {
        if (this.input.available() < i) {
            throw new ParseException("truncated annotation attribute");
        }
    }

    private void parsed(int i, String str) {
        this.observer.parsed(this.bytes, this.parseCursor, i, str);
        this.parseCursor += i;
    }

    private void changeIndent(int i) {
        this.observer.changeIndent(i);
    }
}
