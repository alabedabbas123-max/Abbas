package com.almlkaide.kaypro.android.dx.cf.attrib;

import com.almlkaide.kaypro.android.dx.cf.code.LocalVariableList;

public final class AttLocalVariableTable extends BaseLocalVariables {
    public static final String ATTRIBUTE_NAME = "LocalVariableTable";

    public AttLocalVariableTable(LocalVariableList localVariableList) {
        super(ATTRIBUTE_NAME, localVariableList);
    }
}
