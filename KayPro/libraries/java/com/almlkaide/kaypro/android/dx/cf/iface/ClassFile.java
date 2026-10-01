package com.almlkaide.kaypro.android.dx.cf.iface;

import com.almlkaide.kaypro.android.dx.cf.code.BootstrapMethodsList;
import com.almlkaide.kaypro.android.dx.rop.cst.ConstantPool;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.type.TypeList;

public interface ClassFile extends HasAttribute {
    int getAccessFlags();

    @Override
    AttributeList getAttributes();

    BootstrapMethodsList getBootstrapMethods();

    ConstantPool getConstantPool();

    FieldList getFields();

    TypeList getInterfaces();

    int getMagic();

    int getMajorVersion();

    MethodList getMethods();

    int getMinorVersion();

    CstString getSourceFile();

    CstType getSuperclass();

    CstType getThisClass();
}
