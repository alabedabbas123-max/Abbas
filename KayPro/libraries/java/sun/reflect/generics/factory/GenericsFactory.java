package sun.reflect.generics.factory;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import sun.reflect.generics.tree.FieldTypeSignature;

public interface GenericsFactory {
    TypeVariable<?> findTypeVariable(String str);

    Type makeArrayType(Type type);

    Type makeBool();

    Type makeByte();

    Type makeChar();

    Type makeDouble();

    Type makeFloat();

    Type makeInt();

    Type makeLong();

    Type makeNamedType(String str);

    ParameterizedType makeParameterizedType(Type type, Type[] typeArr, Type type2);

    Type makeShort();

    TypeVariable<?> makeTypeVariable(String str, FieldTypeSignature[] fieldTypeSignatureArr);

    Type makeVoid();

    WildcardType makeWildcard(FieldTypeSignature[] fieldTypeSignatureArr, FieldTypeSignature[] fieldTypeSignatureArr2);
}
