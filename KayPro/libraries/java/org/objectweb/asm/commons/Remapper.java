package org.objectweb.asm.commons;

import org.objectweb.asm.Handle;
import org.objectweb.asm.Type;
import org.objectweb.asm.signature.SignatureReader;
import org.objectweb.asm.signature.SignatureVisitor;
import org.objectweb.asm.signature.SignatureWriter;

public abstract class Remapper {
    private Type mapType(Type type) {
        switch (type.getSort()) {
            case 9:
                String strMapDesc = mapDesc(type.getElementType().getDescriptor());
                for (int i = 0; i < type.getDimensions(); i++) {
                    strMapDesc = new StringBuffer().append('[').append(strMapDesc).toString();
                }
                return Type.getType(strMapDesc);
            case 10:
                String strMo9021map = mo9021map(type.getInternalName());
                return strMo9021map != null ? Type.getObjectType(strMo9021map) : type;
            case 11:
                return Type.getMethodType(mapMethodDesc(type.getDescriptor()));
            default:
                return type;
        }
    }

    protected SignatureVisitor createRemappingSignatureAdapter(SignatureVisitor signatureVisitor) {
        return new RemappingSignatureAdapter(signatureVisitor, this);
    }

    public String mo9021map(String str) {
        return str;
    }

    public String mapDesc(String str) {
        Type type = Type.getType(str);
        switch (type.getSort()) {
            case 9:
                String strMapDesc = mapDesc(type.getElementType().getDescriptor());
                for (int i = 0; i < type.getDimensions(); i++) {
                    strMapDesc = new StringBuffer().append('[').append(strMapDesc).toString();
                }
                return strMapDesc;
            case 10:
                String strMo9021map = mo9021map(type.getInternalName());
                return strMo9021map != null ? new StringBuffer().append('L').append(strMo9021map).append(';').toString() : str;
            default:
                return str;
        }
    }

    public String mapFieldName(String str, String str2, String str3) {
        return str2;
    }

    public String mapInvokeDynamicMethodName(String str, String str2) {
        return str;
    }

    public String mapMethodDesc(String str) {
        if ("()V".equals(str)) {
            return str;
        }
        Type[] argumentTypes = Type.getArgumentTypes(str);
        StringBuffer stringBuffer = new StringBuffer("(");
        for (Type type : argumentTypes) {
            stringBuffer.append(mapDesc(type.getDescriptor()));
        }
        Type returnType = Type.getReturnType(str);
        if (returnType == Type.VOID_TYPE) {
            stringBuffer.append(")V");
            return stringBuffer.toString();
        }
        stringBuffer.append(')').append(mapDesc(returnType.getDescriptor()));
        return stringBuffer.toString();
    }

    public String mapMethodName(String str, String str2, String str3) {
        return str2;
    }

    public String mapSignature(String str, boolean z) {
        if (str == null) {
            return null;
        }
        SignatureReader signatureReader = new SignatureReader(str);
        SignatureWriter signatureWriter = new SignatureWriter();
        SignatureVisitor signatureVisitorCreateRemappingSignatureAdapter = createRemappingSignatureAdapter(signatureWriter);
        if (z) {
            signatureReader.acceptType(signatureVisitorCreateRemappingSignatureAdapter);
        } else {
            signatureReader.accept(signatureVisitorCreateRemappingSignatureAdapter);
        }
        return signatureWriter.toString();
    }

    public String mapType(String str) {
        if (str == null) {
            return null;
        }
        return mapType(Type.getObjectType(str)).getInternalName();
    }

    public String[] mapTypes(String[] strArr) {
        boolean z = false;
        String[] strArr2 = null;
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            String strMo9021map = mo9021map(str);
            if (strMo9021map != null && strArr2 == null) {
                strArr2 = new String[strArr.length];
                if (i > 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, i);
                }
                z = true;
            }
            if (z) {
                if (strMo9021map != null) {
                    str = strMo9021map;
                }
                strArr2[i] = str;
            }
        }
        return z ? strArr2 : strArr;
    }

    public Object mapValue(Object obj) {
        if (obj instanceof Type) {
            return mapType((Type) obj);
        }
        if (!(obj instanceof Handle)) {
            return obj;
        }
        Handle handle = (Handle) obj;
        return new Handle(handle.getTag(), mapType(handle.getOwner()), mapMethodName(handle.getOwner(), handle.getName(), handle.getDesc()), mapMethodDesc(handle.getDesc()));
    }
}
