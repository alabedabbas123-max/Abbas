package com.almlkaide.kaypro.android.dx.rop.code;

import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.CstCallSiteRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodRef;
import com.almlkaide.kaypro.android.dx.rop.type.Prototype;
import com.almlkaide.kaypro.android.dx.rop.type.StdTypeList;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeBearer;
import com.almlkaide.kaypro.android.dx.rop.type.TypeList;

public final class Rops {

    public static final Rop f5072NOP = new Rop(1, Type.VOID, StdTypeList.EMPTY, "nop");
    public static final Rop MOVE_INT = new Rop(2, Type.f5078INT, StdTypeList.f5077INT, "move-int");
    public static final Rop MOVE_LONG = new Rop(2, Type.LONG, StdTypeList.LONG, "move-long");
    public static final Rop MOVE_FLOAT = new Rop(2, Type.FLOAT, StdTypeList.FLOAT, "move-float");
    public static final Rop MOVE_DOUBLE = new Rop(2, Type.DOUBLE, StdTypeList.DOUBLE, "move-double");
    public static final Rop MOVE_OBJECT = new Rop(2, Type.OBJECT, StdTypeList.OBJECT, "move-object");
    public static final Rop MOVE_RETURN_ADDRESS = new Rop(2, Type.RETURN_ADDRESS, StdTypeList.RETURN_ADDRESS, "move-return-address");
    public static final Rop MOVE_PARAM_INT = new Rop(3, Type.f5078INT, StdTypeList.EMPTY, "move-param-int");
    public static final Rop MOVE_PARAM_LONG = new Rop(3, Type.LONG, StdTypeList.EMPTY, "move-param-long");
    public static final Rop MOVE_PARAM_FLOAT = new Rop(3, Type.FLOAT, StdTypeList.EMPTY, "move-param-float");
    public static final Rop MOVE_PARAM_DOUBLE = new Rop(3, Type.DOUBLE, StdTypeList.EMPTY, "move-param-double");
    public static final Rop MOVE_PARAM_OBJECT = new Rop(3, Type.OBJECT, StdTypeList.EMPTY, "move-param-object");
    public static final Rop CONST_INT = new Rop(5, Type.f5078INT, StdTypeList.EMPTY, "const-int");
    public static final Rop CONST_LONG = new Rop(5, Type.LONG, StdTypeList.EMPTY, "const-long");
    public static final Rop CONST_FLOAT = new Rop(5, Type.FLOAT, StdTypeList.EMPTY, "const-float");
    public static final Rop CONST_DOUBLE = new Rop(5, Type.DOUBLE, StdTypeList.EMPTY, "const-double");
    public static final Rop CONST_OBJECT = new Rop(5, Type.OBJECT, StdTypeList.EMPTY, Exceptions.LIST_Error, "const-object");
    public static final Rop CONST_OBJECT_NOTHROW = new Rop(5, Type.OBJECT, StdTypeList.EMPTY, "const-object-nothrow");
    public static final Rop GOTO = new Rop(6, Type.VOID, StdTypeList.EMPTY, 3, "goto");
    public static final Rop IF_EQZ_INT = new Rop(7, Type.VOID, StdTypeList.f5077INT, 4, "if-eqz-int");
    public static final Rop IF_NEZ_INT = new Rop(8, Type.VOID, StdTypeList.f5077INT, 4, "if-nez-int");
    public static final Rop IF_LTZ_INT = new Rop(9, Type.VOID, StdTypeList.f5077INT, 4, "if-ltz-int");
    public static final Rop IF_GEZ_INT = new Rop(10, Type.VOID, StdTypeList.f5077INT, 4, "if-gez-int");
    public static final Rop IF_LEZ_INT = new Rop(11, Type.VOID, StdTypeList.f5077INT, 4, "if-lez-int");
    public static final Rop IF_GTZ_INT = new Rop(12, Type.VOID, StdTypeList.f5077INT, 4, "if-gtz-int");
    public static final Rop IF_EQZ_OBJECT = new Rop(7, Type.VOID, StdTypeList.OBJECT, 4, "if-eqz-object");
    public static final Rop IF_NEZ_OBJECT = new Rop(8, Type.VOID, StdTypeList.OBJECT, 4, "if-nez-object");
    public static final Rop IF_EQ_INT = new Rop(7, Type.VOID, StdTypeList.INT_INT, 4, "if-eq-int");
    public static final Rop IF_NE_INT = new Rop(8, Type.VOID, StdTypeList.INT_INT, 4, "if-ne-int");
    public static final Rop IF_LT_INT = new Rop(9, Type.VOID, StdTypeList.INT_INT, 4, "if-lt-int");
    public static final Rop IF_GE_INT = new Rop(10, Type.VOID, StdTypeList.INT_INT, 4, "if-ge-int");
    public static final Rop IF_LE_INT = new Rop(11, Type.VOID, StdTypeList.INT_INT, 4, "if-le-int");
    public static final Rop IF_GT_INT = new Rop(12, Type.VOID, StdTypeList.INT_INT, 4, "if-gt-int");
    public static final Rop IF_EQ_OBJECT = new Rop(7, Type.VOID, StdTypeList.OBJECT_OBJECT, 4, "if-eq-object");
    public static final Rop IF_NE_OBJECT = new Rop(8, Type.VOID, StdTypeList.OBJECT_OBJECT, 4, "if-ne-object");
    public static final Rop SWITCH = new Rop(13, Type.VOID, StdTypeList.f5077INT, 5, "switch");
    public static final Rop ADD_INT = new Rop(14, Type.f5078INT, StdTypeList.INT_INT, "add-int");
    public static final Rop ADD_LONG = new Rop(14, Type.LONG, StdTypeList.LONG_LONG, "add-long");
    public static final Rop ADD_FLOAT = new Rop(14, Type.FLOAT, StdTypeList.FLOAT_FLOAT, "add-float");
    public static final Rop ADD_DOUBLE = new Rop(14, Type.DOUBLE, StdTypeList.DOUBLE_DOUBLE, 1, "add-double");
    public static final Rop SUB_INT = new Rop(15, Type.f5078INT, StdTypeList.INT_INT, "sub-int");
    public static final Rop SUB_LONG = new Rop(15, Type.LONG, StdTypeList.LONG_LONG, "sub-long");
    public static final Rop SUB_FLOAT = new Rop(15, Type.FLOAT, StdTypeList.FLOAT_FLOAT, "sub-float");
    public static final Rop SUB_DOUBLE = new Rop(15, Type.DOUBLE, StdTypeList.DOUBLE_DOUBLE, 1, "sub-double");
    public static final Rop MUL_INT = new Rop(16, Type.f5078INT, StdTypeList.INT_INT, "mul-int");
    public static final Rop MUL_LONG = new Rop(16, Type.LONG, StdTypeList.LONG_LONG, "mul-long");
    public static final Rop MUL_FLOAT = new Rop(16, Type.FLOAT, StdTypeList.FLOAT_FLOAT, "mul-float");
    public static final Rop MUL_DOUBLE = new Rop(16, Type.DOUBLE, StdTypeList.DOUBLE_DOUBLE, 1, "mul-double");
    public static final Rop DIV_INT = new Rop(17, Type.f5078INT, StdTypeList.INT_INT, Exceptions.LIST_Error_ArithmeticException, "div-int");
    public static final Rop DIV_LONG = new Rop(17, Type.LONG, StdTypeList.LONG_LONG, Exceptions.LIST_Error_ArithmeticException, "div-long");
    public static final Rop DIV_FLOAT = new Rop(17, Type.FLOAT, StdTypeList.FLOAT_FLOAT, "div-float");
    public static final Rop DIV_DOUBLE = new Rop(17, Type.DOUBLE, StdTypeList.DOUBLE_DOUBLE, "div-double");
    public static final Rop REM_INT = new Rop(18, Type.f5078INT, StdTypeList.INT_INT, Exceptions.LIST_Error_ArithmeticException, "rem-int");
    public static final Rop REM_LONG = new Rop(18, Type.LONG, StdTypeList.LONG_LONG, Exceptions.LIST_Error_ArithmeticException, "rem-long");
    public static final Rop REM_FLOAT = new Rop(18, Type.FLOAT, StdTypeList.FLOAT_FLOAT, "rem-float");
    public static final Rop REM_DOUBLE = new Rop(18, Type.DOUBLE, StdTypeList.DOUBLE_DOUBLE, "rem-double");
    public static final Rop NEG_INT = new Rop(19, Type.f5078INT, StdTypeList.f5077INT, "neg-int");
    public static final Rop NEG_LONG = new Rop(19, Type.LONG, StdTypeList.LONG, "neg-long");
    public static final Rop NEG_FLOAT = new Rop(19, Type.FLOAT, StdTypeList.FLOAT, "neg-float");
    public static final Rop NEG_DOUBLE = new Rop(19, Type.DOUBLE, StdTypeList.DOUBLE, "neg-double");
    public static final Rop AND_INT = new Rop(20, Type.f5078INT, StdTypeList.INT_INT, "and-int");
    public static final Rop AND_LONG = new Rop(20, Type.LONG, StdTypeList.LONG_LONG, "and-long");
    public static final Rop OR_INT = new Rop(21, Type.f5078INT, StdTypeList.INT_INT, "or-int");
    public static final Rop OR_LONG = new Rop(21, Type.LONG, StdTypeList.LONG_LONG, "or-long");
    public static final Rop XOR_INT = new Rop(22, Type.f5078INT, StdTypeList.INT_INT, "xor-int");
    public static final Rop XOR_LONG = new Rop(22, Type.LONG, StdTypeList.LONG_LONG, "xor-long");
    public static final Rop SHL_INT = new Rop(23, Type.f5078INT, StdTypeList.INT_INT, "shl-int");
    public static final Rop SHL_LONG = new Rop(23, Type.LONG, StdTypeList.LONG_INT, "shl-long");
    public static final Rop SHR_INT = new Rop(24, Type.f5078INT, StdTypeList.INT_INT, "shr-int");
    public static final Rop SHR_LONG = new Rop(24, Type.LONG, StdTypeList.LONG_INT, "shr-long");
    public static final Rop USHR_INT = new Rop(25, Type.f5078INT, StdTypeList.INT_INT, "ushr-int");
    public static final Rop USHR_LONG = new Rop(25, Type.LONG, StdTypeList.LONG_INT, "ushr-long");
    public static final Rop NOT_INT = new Rop(26, Type.f5078INT, StdTypeList.f5077INT, "not-int");
    public static final Rop NOT_LONG = new Rop(26, Type.LONG, StdTypeList.LONG, "not-long");
    public static final Rop ADD_CONST_INT = new Rop(14, Type.f5078INT, StdTypeList.f5077INT, "add-const-int");
    public static final Rop ADD_CONST_LONG = new Rop(14, Type.LONG, StdTypeList.LONG, "add-const-long");
    public static final Rop ADD_CONST_FLOAT = new Rop(14, Type.FLOAT, StdTypeList.FLOAT, "add-const-float");
    public static final Rop ADD_CONST_DOUBLE = new Rop(14, Type.DOUBLE, StdTypeList.DOUBLE, "add-const-double");
    public static final Rop SUB_CONST_INT = new Rop(15, Type.f5078INT, StdTypeList.f5077INT, "sub-const-int");
    public static final Rop SUB_CONST_LONG = new Rop(15, Type.LONG, StdTypeList.LONG, "sub-const-long");
    public static final Rop SUB_CONST_FLOAT = new Rop(15, Type.FLOAT, StdTypeList.FLOAT, "sub-const-float");
    public static final Rop SUB_CONST_DOUBLE = new Rop(15, Type.DOUBLE, StdTypeList.DOUBLE, "sub-const-double");
    public static final Rop MUL_CONST_INT = new Rop(16, Type.f5078INT, StdTypeList.f5077INT, "mul-const-int");
    public static final Rop MUL_CONST_LONG = new Rop(16, Type.LONG, StdTypeList.LONG, "mul-const-long");
    public static final Rop MUL_CONST_FLOAT = new Rop(16, Type.FLOAT, StdTypeList.FLOAT, "mul-const-float");
    public static final Rop MUL_CONST_DOUBLE = new Rop(16, Type.DOUBLE, StdTypeList.DOUBLE, "mul-const-double");
    public static final Rop DIV_CONST_INT = new Rop(17, Type.f5078INT, StdTypeList.f5077INT, Exceptions.LIST_Error_ArithmeticException, "div-const-int");
    public static final Rop DIV_CONST_LONG = new Rop(17, Type.LONG, StdTypeList.LONG, Exceptions.LIST_Error_ArithmeticException, "div-const-long");
    public static final Rop DIV_CONST_FLOAT = new Rop(17, Type.FLOAT, StdTypeList.FLOAT, "div-const-float");
    public static final Rop DIV_CONST_DOUBLE = new Rop(17, Type.DOUBLE, StdTypeList.DOUBLE, "div-const-double");
    public static final Rop REM_CONST_INT = new Rop(18, Type.f5078INT, StdTypeList.f5077INT, Exceptions.LIST_Error_ArithmeticException, "rem-const-int");
    public static final Rop REM_CONST_LONG = new Rop(18, Type.LONG, StdTypeList.LONG, Exceptions.LIST_Error_ArithmeticException, "rem-const-long");
    public static final Rop REM_CONST_FLOAT = new Rop(18, Type.FLOAT, StdTypeList.FLOAT, "rem-const-float");
    public static final Rop REM_CONST_DOUBLE = new Rop(18, Type.DOUBLE, StdTypeList.DOUBLE, "rem-const-double");
    public static final Rop AND_CONST_INT = new Rop(20, Type.f5078INT, StdTypeList.f5077INT, "and-const-int");
    public static final Rop AND_CONST_LONG = new Rop(20, Type.LONG, StdTypeList.LONG, "and-const-long");
    public static final Rop OR_CONST_INT = new Rop(21, Type.f5078INT, StdTypeList.f5077INT, "or-const-int");
    public static final Rop OR_CONST_LONG = new Rop(21, Type.LONG, StdTypeList.LONG, "or-const-long");
    public static final Rop XOR_CONST_INT = new Rop(22, Type.f5078INT, StdTypeList.f5077INT, "xor-const-int");
    public static final Rop XOR_CONST_LONG = new Rop(22, Type.LONG, StdTypeList.LONG, "xor-const-long");
    public static final Rop SHL_CONST_INT = new Rop(23, Type.f5078INT, StdTypeList.f5077INT, "shl-const-int");
    public static final Rop SHL_CONST_LONG = new Rop(23, Type.LONG, StdTypeList.f5077INT, "shl-const-long");
    public static final Rop SHR_CONST_INT = new Rop(24, Type.f5078INT, StdTypeList.f5077INT, "shr-const-int");
    public static final Rop SHR_CONST_LONG = new Rop(24, Type.LONG, StdTypeList.f5077INT, "shr-const-long");
    public static final Rop USHR_CONST_INT = new Rop(25, Type.f5078INT, StdTypeList.f5077INT, "ushr-const-int");
    public static final Rop USHR_CONST_LONG = new Rop(25, Type.LONG, StdTypeList.f5077INT, "ushr-const-long");
    public static final Rop CMPL_LONG = new Rop(27, Type.f5078INT, StdTypeList.LONG_LONG, "cmpl-long");
    public static final Rop CMPL_FLOAT = new Rop(27, Type.f5078INT, StdTypeList.FLOAT_FLOAT, "cmpl-float");
    public static final Rop CMPL_DOUBLE = new Rop(27, Type.f5078INT, StdTypeList.DOUBLE_DOUBLE, "cmpl-double");
    public static final Rop CMPG_FLOAT = new Rop(28, Type.f5078INT, StdTypeList.FLOAT_FLOAT, "cmpg-float");
    public static final Rop CMPG_DOUBLE = new Rop(28, Type.f5078INT, StdTypeList.DOUBLE_DOUBLE, "cmpg-double");
    public static final Rop CONV_L2I = new Rop(29, Type.f5078INT, StdTypeList.LONG, "conv-l2i");
    public static final Rop CONV_F2I = new Rop(29, Type.f5078INT, StdTypeList.FLOAT, "conv-f2i");
    public static final Rop CONV_D2I = new Rop(29, Type.f5078INT, StdTypeList.DOUBLE, "conv-d2i");
    public static final Rop CONV_I2L = new Rop(29, Type.LONG, StdTypeList.f5077INT, "conv-i2l");
    public static final Rop CONV_F2L = new Rop(29, Type.LONG, StdTypeList.FLOAT, "conv-f2l");
    public static final Rop CONV_D2L = new Rop(29, Type.LONG, StdTypeList.DOUBLE, "conv-d2l");
    public static final Rop CONV_I2F = new Rop(29, Type.FLOAT, StdTypeList.f5077INT, "conv-i2f");
    public static final Rop CONV_L2F = new Rop(29, Type.FLOAT, StdTypeList.LONG, "conv-l2f");
    public static final Rop CONV_D2F = new Rop(29, Type.FLOAT, StdTypeList.DOUBLE, "conv-d2f");
    public static final Rop CONV_I2D = new Rop(29, Type.DOUBLE, StdTypeList.f5077INT, "conv-i2d");
    public static final Rop CONV_L2D = new Rop(29, Type.DOUBLE, StdTypeList.LONG, "conv-l2d");
    public static final Rop CONV_F2D = new Rop(29, Type.DOUBLE, StdTypeList.FLOAT, "conv-f2d");
    public static final Rop TO_BYTE = new Rop(30, Type.f5078INT, StdTypeList.f5077INT, "to-byte");
    public static final Rop TO_CHAR = new Rop(31, Type.f5078INT, StdTypeList.f5077INT, "to-char");
    public static final Rop TO_SHORT = new Rop(32, Type.f5078INT, StdTypeList.f5077INT, "to-short");
    public static final Rop RETURN_VOID = new Rop(33, Type.VOID, StdTypeList.EMPTY, 2, "return-void");
    public static final Rop RETURN_INT = new Rop(33, Type.VOID, StdTypeList.f5077INT, 2, "return-int");
    public static final Rop RETURN_LONG = new Rop(33, Type.VOID, StdTypeList.LONG, 2, "return-long");
    public static final Rop RETURN_FLOAT = new Rop(33, Type.VOID, StdTypeList.FLOAT, 2, "return-float");
    public static final Rop RETURN_DOUBLE = new Rop(33, Type.VOID, StdTypeList.DOUBLE, 2, "return-double");
    public static final Rop RETURN_OBJECT = new Rop(33, Type.VOID, StdTypeList.OBJECT, 2, "return-object");
    public static final Rop ARRAY_LENGTH = new Rop(34, Type.f5078INT, StdTypeList.OBJECT, Exceptions.LIST_Error_NullPointerException, "array-length");
    public static final Rop THROW = new Rop(35, Type.VOID, StdTypeList.THROWABLE, StdTypeList.THROWABLE, "throw");
    public static final Rop MONITOR_ENTER = new Rop(36, Type.VOID, StdTypeList.OBJECT, Exceptions.LIST_Error_NullPointerException, "monitor-enter");
    public static final Rop MONITOR_EXIT = new Rop(37, Type.VOID, StdTypeList.OBJECT, Exceptions.LIST_Error_Null_IllegalMonitorStateException, "monitor-exit");
    public static final Rop AGET_INT = new Rop(38, Type.f5078INT, StdTypeList.INTARR_INT, Exceptions.LIST_Error_Null_ArrayIndexOutOfBounds, "aget-int");
    public static final Rop AGET_LONG = new Rop(38, Type.LONG, StdTypeList.LONGARR_INT, Exceptions.LIST_Error_Null_ArrayIndexOutOfBounds, "aget-long");
    public static final Rop AGET_FLOAT = new Rop(38, Type.FLOAT, StdTypeList.FLOATARR_INT, Exceptions.LIST_Error_Null_ArrayIndexOutOfBounds, "aget-float");
    public static final Rop AGET_DOUBLE = new Rop(38, Type.DOUBLE, StdTypeList.DOUBLEARR_INT, Exceptions.LIST_Error_Null_ArrayIndexOutOfBounds, "aget-double");
    public static final Rop AGET_OBJECT = new Rop(38, Type.OBJECT, StdTypeList.OBJECTARR_INT, Exceptions.LIST_Error_Null_ArrayIndexOutOfBounds, "aget-object");
    public static final Rop AGET_BOOLEAN = new Rop(38, Type.f5078INT, StdTypeList.BOOLEANARR_INT, Exceptions.LIST_Error_Null_ArrayIndexOutOfBounds, "aget-boolean");
    public static final Rop AGET_BYTE = new Rop(38, Type.f5078INT, StdTypeList.BYTEARR_INT, Exceptions.LIST_Error_Null_ArrayIndexOutOfBounds, "aget-byte");
    public static final Rop AGET_CHAR = new Rop(38, Type.f5078INT, StdTypeList.CHARARR_INT, Exceptions.LIST_Error_Null_ArrayIndexOutOfBounds, "aget-char");
    public static final Rop AGET_SHORT = new Rop(38, Type.f5078INT, StdTypeList.SHORTARR_INT, Exceptions.LIST_Error_Null_ArrayIndexOutOfBounds, "aget-short");
    public static final Rop APUT_INT = new Rop(39, Type.VOID, StdTypeList.INT_INTARR_INT, Exceptions.LIST_Error_Null_ArrayIndexOutOfBounds, "aput-int");
    public static final Rop APUT_LONG = new Rop(39, Type.VOID, StdTypeList.LONG_LONGARR_INT, Exceptions.LIST_Error_Null_ArrayIndexOutOfBounds, "aput-long");
    public static final Rop APUT_FLOAT = new Rop(39, Type.VOID, StdTypeList.FLOAT_FLOATARR_INT, Exceptions.LIST_Error_Null_ArrayIndexOutOfBounds, "aput-float");
    public static final Rop APUT_DOUBLE = new Rop(39, Type.VOID, StdTypeList.DOUBLE_DOUBLEARR_INT, Exceptions.LIST_Error_Null_ArrayIndexOutOfBounds, "aput-double");
    public static final Rop APUT_OBJECT = new Rop(39, Type.VOID, StdTypeList.OBJECT_OBJECTARR_INT, Exceptions.LIST_Error_Null_ArrayIndex_ArrayStore, "aput-object");
    public static final Rop APUT_BOOLEAN = new Rop(39, Type.VOID, StdTypeList.INT_BOOLEANARR_INT, Exceptions.LIST_Error_Null_ArrayIndex_ArrayStore, "aput-boolean");
    public static final Rop APUT_BYTE = new Rop(39, Type.VOID, StdTypeList.INT_BYTEARR_INT, Exceptions.LIST_Error_Null_ArrayIndex_ArrayStore, "aput-byte");
    public static final Rop APUT_CHAR = new Rop(39, Type.VOID, StdTypeList.INT_CHARARR_INT, Exceptions.LIST_Error_Null_ArrayIndex_ArrayStore, "aput-char");
    public static final Rop APUT_SHORT = new Rop(39, Type.VOID, StdTypeList.INT_SHORTARR_INT, Exceptions.LIST_Error_Null_ArrayIndex_ArrayStore, "aput-short");
    public static final Rop NEW_INSTANCE = new Rop(40, Type.OBJECT, StdTypeList.EMPTY, Exceptions.LIST_Error, "new-instance");
    public static final Rop NEW_ARRAY_INT = new Rop(41, Type.INT_ARRAY, StdTypeList.f5077INT, Exceptions.LIST_Error_NegativeArraySizeException, "new-array-int");
    public static final Rop NEW_ARRAY_LONG = new Rop(41, Type.LONG_ARRAY, StdTypeList.f5077INT, Exceptions.LIST_Error_NegativeArraySizeException, "new-array-long");
    public static final Rop NEW_ARRAY_FLOAT = new Rop(41, Type.FLOAT_ARRAY, StdTypeList.f5077INT, Exceptions.LIST_Error_NegativeArraySizeException, "new-array-float");
    public static final Rop NEW_ARRAY_DOUBLE = new Rop(41, Type.DOUBLE_ARRAY, StdTypeList.f5077INT, Exceptions.LIST_Error_NegativeArraySizeException, "new-array-double");
    public static final Rop NEW_ARRAY_BOOLEAN = new Rop(41, Type.BOOLEAN_ARRAY, StdTypeList.f5077INT, Exceptions.LIST_Error_NegativeArraySizeException, "new-array-boolean");
    public static final Rop NEW_ARRAY_BYTE = new Rop(41, Type.BYTE_ARRAY, StdTypeList.f5077INT, Exceptions.LIST_Error_NegativeArraySizeException, "new-array-byte");
    public static final Rop NEW_ARRAY_CHAR = new Rop(41, Type.CHAR_ARRAY, StdTypeList.f5077INT, Exceptions.LIST_Error_NegativeArraySizeException, "new-array-char");
    public static final Rop NEW_ARRAY_SHORT = new Rop(41, Type.SHORT_ARRAY, StdTypeList.f5077INT, Exceptions.LIST_Error_NegativeArraySizeException, "new-array-short");
    public static final Rop CHECK_CAST = new Rop(43, Type.VOID, StdTypeList.OBJECT, Exceptions.LIST_Error_ClassCastException, "check-cast");
    public static final Rop INSTANCE_OF = new Rop(44, Type.f5078INT, StdTypeList.OBJECT, Exceptions.LIST_Error, "instance-of");
    public static final Rop GET_FIELD_INT = new Rop(45, Type.f5078INT, StdTypeList.OBJECT, Exceptions.LIST_Error_NullPointerException, "get-field-int");
    public static final Rop GET_FIELD_LONG = new Rop(45, Type.LONG, StdTypeList.OBJECT, Exceptions.LIST_Error_NullPointerException, "get-field-long");
    public static final Rop GET_FIELD_FLOAT = new Rop(45, Type.FLOAT, StdTypeList.OBJECT, Exceptions.LIST_Error_NullPointerException, "get-field-float");
    public static final Rop GET_FIELD_DOUBLE = new Rop(45, Type.DOUBLE, StdTypeList.OBJECT, Exceptions.LIST_Error_NullPointerException, "get-field-double");
    public static final Rop GET_FIELD_OBJECT = new Rop(45, Type.OBJECT, StdTypeList.OBJECT, Exceptions.LIST_Error_NullPointerException, "get-field-object");
    public static final Rop GET_FIELD_BOOLEAN = new Rop(45, Type.f5078INT, StdTypeList.OBJECT, Exceptions.LIST_Error_NullPointerException, "get-field-boolean");
    public static final Rop GET_FIELD_BYTE = new Rop(45, Type.f5078INT, StdTypeList.OBJECT, Exceptions.LIST_Error_NullPointerException, "get-field-byte");
    public static final Rop GET_FIELD_CHAR = new Rop(45, Type.f5078INT, StdTypeList.OBJECT, Exceptions.LIST_Error_NullPointerException, "get-field-char");
    public static final Rop GET_FIELD_SHORT = new Rop(45, Type.f5078INT, StdTypeList.OBJECT, Exceptions.LIST_Error_NullPointerException, "get-field-short");
    public static final Rop GET_STATIC_INT = new Rop(46, Type.f5078INT, StdTypeList.EMPTY, Exceptions.LIST_Error, "get-static-int");
    public static final Rop GET_STATIC_LONG = new Rop(46, Type.LONG, StdTypeList.EMPTY, Exceptions.LIST_Error, "get-static-long");
    public static final Rop GET_STATIC_FLOAT = new Rop(46, Type.FLOAT, StdTypeList.EMPTY, Exceptions.LIST_Error, "get-static-float");
    public static final Rop GET_STATIC_DOUBLE = new Rop(46, Type.DOUBLE, StdTypeList.EMPTY, Exceptions.LIST_Error, "get-static-double");
    public static final Rop GET_STATIC_OBJECT = new Rop(46, Type.OBJECT, StdTypeList.EMPTY, Exceptions.LIST_Error, "get-static-object");
    public static final Rop GET_STATIC_BOOLEAN = new Rop(46, Type.f5078INT, StdTypeList.EMPTY, Exceptions.LIST_Error, "get-field-boolean");
    public static final Rop GET_STATIC_BYTE = new Rop(46, Type.f5078INT, StdTypeList.EMPTY, Exceptions.LIST_Error, "get-field-byte");
    public static final Rop GET_STATIC_CHAR = new Rop(46, Type.f5078INT, StdTypeList.EMPTY, Exceptions.LIST_Error, "get-field-char");
    public static final Rop GET_STATIC_SHORT = new Rop(46, Type.f5078INT, StdTypeList.EMPTY, Exceptions.LIST_Error, "get-field-short");
    public static final Rop PUT_FIELD_INT = new Rop(47, Type.VOID, StdTypeList.INT_OBJECT, Exceptions.LIST_Error_NullPointerException, "put-field-int");
    public static final Rop PUT_FIELD_LONG = new Rop(47, Type.VOID, StdTypeList.LONG_OBJECT, Exceptions.LIST_Error_NullPointerException, "put-field-long");
    public static final Rop PUT_FIELD_FLOAT = new Rop(47, Type.VOID, StdTypeList.FLOAT_OBJECT, Exceptions.LIST_Error_NullPointerException, "put-field-float");
    public static final Rop PUT_FIELD_DOUBLE = new Rop(47, Type.VOID, StdTypeList.DOUBLE_OBJECT, Exceptions.LIST_Error_NullPointerException, "put-field-double");
    public static final Rop PUT_FIELD_OBJECT = new Rop(47, Type.VOID, StdTypeList.OBJECT_OBJECT, Exceptions.LIST_Error_NullPointerException, "put-field-object");
    public static final Rop PUT_FIELD_BOOLEAN = new Rop(47, Type.VOID, StdTypeList.INT_OBJECT, Exceptions.LIST_Error_NullPointerException, "put-field-boolean");
    public static final Rop PUT_FIELD_BYTE = new Rop(47, Type.VOID, StdTypeList.INT_OBJECT, Exceptions.LIST_Error_NullPointerException, "put-field-byte");
    public static final Rop PUT_FIELD_CHAR = new Rop(47, Type.VOID, StdTypeList.INT_OBJECT, Exceptions.LIST_Error_NullPointerException, "put-field-char");
    public static final Rop PUT_FIELD_SHORT = new Rop(47, Type.VOID, StdTypeList.INT_OBJECT, Exceptions.LIST_Error_NullPointerException, "put-field-short");
    public static final Rop PUT_STATIC_INT = new Rop(48, Type.VOID, StdTypeList.f5077INT, Exceptions.LIST_Error, "put-static-int");
    public static final Rop PUT_STATIC_LONG = new Rop(48, Type.VOID, StdTypeList.LONG, Exceptions.LIST_Error, "put-static-long");
    public static final Rop PUT_STATIC_FLOAT = new Rop(48, Type.VOID, StdTypeList.FLOAT, Exceptions.LIST_Error, "put-static-float");
    public static final Rop PUT_STATIC_DOUBLE = new Rop(48, Type.VOID, StdTypeList.DOUBLE, Exceptions.LIST_Error, "put-static-double");
    public static final Rop PUT_STATIC_OBJECT = new Rop(48, Type.VOID, StdTypeList.OBJECT, Exceptions.LIST_Error, "put-static-object");
    public static final Rop PUT_STATIC_BOOLEAN = new Rop(48, Type.VOID, StdTypeList.f5077INT, Exceptions.LIST_Error, "put-static-boolean");
    public static final Rop PUT_STATIC_BYTE = new Rop(48, Type.VOID, StdTypeList.f5077INT, Exceptions.LIST_Error, "put-static-byte");
    public static final Rop PUT_STATIC_CHAR = new Rop(48, Type.VOID, StdTypeList.f5077INT, Exceptions.LIST_Error, "put-static-char");
    public static final Rop PUT_STATIC_SHORT = new Rop(48, Type.VOID, StdTypeList.f5077INT, Exceptions.LIST_Error, "put-static-short");
    public static final Rop MARK_LOCAL_INT = new Rop(54, Type.VOID, StdTypeList.f5077INT, "mark-local-int");
    public static final Rop MARK_LOCAL_LONG = new Rop(54, Type.VOID, StdTypeList.LONG, "mark-local-long");
    public static final Rop MARK_LOCAL_FLOAT = new Rop(54, Type.VOID, StdTypeList.FLOAT, "mark-local-float");
    public static final Rop MARK_LOCAL_DOUBLE = new Rop(54, Type.VOID, StdTypeList.DOUBLE, "mark-local-double");
    public static final Rop MARK_LOCAL_OBJECT = new Rop(54, Type.VOID, StdTypeList.OBJECT, "mark-local-object");
    public static final Rop FILL_ARRAY_DATA = new Rop(57, Type.VOID, StdTypeList.EMPTY, "fill-array-data");

    public static Rop ropFor(int i, TypeBearer typeBearer, TypeList typeList, Constant constant) {
        Type componentType;
        Type componentType2;
        switch (i) {
            case 1:
                return f5072NOP;
            case 2:
                return opMove(typeBearer);
            case 3:
                return opMoveParam(typeBearer);
            case 4:
                return opMoveException(typeBearer);
            case 5:
                return opConst(typeBearer);
            case 6:
                return GOTO;
            case 7:
                return opIfEq(typeList);
            case 8:
                return opIfNe(typeList);
            case 9:
                return opIfLt(typeList);
            case 10:
                return opIfGe(typeList);
            case 11:
                return opIfLe(typeList);
            case 12:
                return opIfGt(typeList);
            case 13:
                return SWITCH;
            case 14:
                return opAdd(typeList);
            case 15:
                return opSub(typeList);
            case 16:
                return opMul(typeList);
            case 17:
                return opDiv(typeList);
            case 18:
                return opRem(typeList);
            case 19:
                return opNeg(typeBearer);
            case 20:
                return opAnd(typeList);
            case 21:
                return opOr(typeList);
            case 22:
                return opXor(typeList);
            case 23:
                return opShl(typeList);
            case 24:
                return opShr(typeList);
            case 25:
                return opUshr(typeList);
            case 26:
                return opNot(typeBearer);
            case 27:
                return opCmpl(typeList.getType(0));
            case 28:
                return opCmpg(typeList.getType(0));
            case 29:
                return opConv(typeBearer, typeList.getType(0));
            case 30:
                return TO_BYTE;
            case 31:
                return TO_CHAR;
            case 32:
                return TO_SHORT;
            case 33:
                if (typeList.size() == 0) {
                    return RETURN_VOID;
                }
                return opReturn(typeList.getType(0));
            case 34:
                return ARRAY_LENGTH;
            case 35:
                return THROW;
            case 36:
                return MONITOR_ENTER;
            case 37:
                return MONITOR_EXIT;
            case 38:
                Type type = typeList.getType(0);
                if (type == Type.KNOWN_NULL) {
                    componentType2 = typeBearer.getType();
                } else {
                    componentType2 = type.getComponentType();
                }
                return opAget(componentType2);
            case 39:
                Type type2 = typeList.getType(1);
                if (type2 == Type.KNOWN_NULL) {
                    componentType = typeList.getType(0);
                } else {
                    componentType = type2.getComponentType();
                }
                return opAput(componentType);
            case 40:
                return NEW_INSTANCE;
            case 41:
                return opNewArray(typeBearer.getType());
            case 42:
            case 54:
            case 55:
            case 56:
            case 57:
            default:
                throw new RuntimeException(new StringBuffer().append("unknown opcode ").append(RegOps.opName(i)).toString());
            case 43:
                return CHECK_CAST;
            case 44:
                return INSTANCE_OF;
            case 45:
                return opGetField(typeBearer);
            case 46:
                return opGetStatic(typeBearer);
            case 47:
                return opPutField(typeList.getType(0));
            case 48:
                return opPutStatic(typeList.getType(0));
            case 49:
                return opInvokeStatic(((CstMethodRef) constant).getPrototype());
            case 50:
                CstMethodRef cstMethodRef = (CstMethodRef) constant;
                return opInvokeVirtual(cstMethodRef.getPrototype().withFirstParameter(cstMethodRef.getDefiningClass().getClassType()));
            case 51:
                CstMethodRef cstMethodRef2 = (CstMethodRef) constant;
                return opInvokeSuper(cstMethodRef2.getPrototype().withFirstParameter(cstMethodRef2.getDefiningClass().getClassType()));
            case 52:
                CstMethodRef cstMethodRef3 = (CstMethodRef) constant;
                return opInvokeDirect(cstMethodRef3.getPrototype().withFirstParameter(cstMethodRef3.getDefiningClass().getClassType()));
            case 53:
                CstMethodRef cstMethodRef4 = (CstMethodRef) constant;
                return opInvokeInterface(cstMethodRef4.getPrototype().withFirstParameter(cstMethodRef4.getDefiningClass().getClassType()));
            case 58:
                CstMethodRef cstMethodRef5 = (CstMethodRef) constant;
                return opInvokePolymorphic(cstMethodRef5.getPrototype().withFirstParameter(cstMethodRef5.getDefiningClass().getClassType()));
            case 59:
                return opInvokeCustom(((CstCallSiteRef) constant).getPrototype());
        }
    }

    public static Rop opMove(TypeBearer typeBearer) {
        switch (typeBearer.getBasicFrameType()) {
            case 4:
                return MOVE_DOUBLE;
            case 5:
                return MOVE_FLOAT;
            case 6:
                return MOVE_INT;
            case 7:
                return MOVE_LONG;
            case 8:
            default:
                return throwBadType(typeBearer);
            case 9:
                return MOVE_OBJECT;
            case 10:
                return MOVE_RETURN_ADDRESS;
        }
    }

    public static Rop opMoveParam(TypeBearer typeBearer) {
        switch (typeBearer.getBasicFrameType()) {
            case 4:
                return MOVE_PARAM_DOUBLE;
            case 5:
                return MOVE_PARAM_FLOAT;
            case 6:
                return MOVE_PARAM_INT;
            case 7:
                return MOVE_PARAM_LONG;
            case 8:
            default:
                return throwBadType(typeBearer);
            case 9:
                return MOVE_PARAM_OBJECT;
        }
    }

    public static Rop opMoveException(TypeBearer typeBearer) {
        return new Rop(4, typeBearer.getType(), StdTypeList.EMPTY, (String) null);
    }

    public static Rop opMoveResult(TypeBearer typeBearer) {
        return new Rop(55, typeBearer.getType(), StdTypeList.EMPTY, (String) null);
    }

    public static Rop opMoveResultPseudo(TypeBearer typeBearer) {
        return new Rop(56, typeBearer.getType(), StdTypeList.EMPTY, (String) null);
    }

    public static Rop opConst(TypeBearer typeBearer) {
        if (typeBearer.getType() == Type.KNOWN_NULL) {
            return CONST_OBJECT_NOTHROW;
        }
        switch (typeBearer.getBasicFrameType()) {
            case 4:
                return CONST_DOUBLE;
            case 5:
                return CONST_FLOAT;
            case 6:
                return CONST_INT;
            case 7:
                return CONST_LONG;
            case 8:
            default:
                return throwBadType(typeBearer);
            case 9:
                return CONST_OBJECT;
        }
    }

    public static Rop opIfEq(TypeList typeList) {
        return pickIf(typeList, IF_EQZ_INT, IF_EQZ_OBJECT, IF_EQ_INT, IF_EQ_OBJECT);
    }

    public static Rop opIfNe(TypeList typeList) {
        return pickIf(typeList, IF_NEZ_INT, IF_NEZ_OBJECT, IF_NE_INT, IF_NE_OBJECT);
    }

    public static Rop opIfLt(TypeList typeList) {
        return pickIf(typeList, IF_LTZ_INT, (Rop) null, IF_LT_INT, (Rop) null);
    }

    public static Rop opIfGe(TypeList typeList) {
        return pickIf(typeList, IF_GEZ_INT, (Rop) null, IF_GE_INT, (Rop) null);
    }

    public static Rop opIfGt(TypeList typeList) {
        return pickIf(typeList, IF_GTZ_INT, (Rop) null, IF_GT_INT, (Rop) null);
    }

    public static Rop opIfLe(TypeList typeList) {
        return pickIf(typeList, IF_LEZ_INT, (Rop) null, IF_LE_INT, (Rop) null);
    }

    private static Rop pickIf(TypeList typeList, Rop c1681Rop, Rop c1681Rop2, Rop c1681Rop3, Rop c1681Rop4) {
        switch (typeList.size()) {
            case 1:
                switch (typeList.getType(0).getBasicFrameType()) {
                    case 6:
                        return c1681Rop;
                    case 9:
                        if (c1681Rop2 != null) {
                            return c1681Rop2;
                        }
                        break;
                }
                break;
            case 2:
                int basicFrameType = typeList.getType(0).getBasicFrameType();
                if (basicFrameType == typeList.getType(1).getBasicFrameType()) {
                    switch (basicFrameType) {
                        case 6:
                            return c1681Rop3;
                        case 9:
                            if (c1681Rop4 != null) {
                                return c1681Rop4;
                            }
                            break;
                    }
                }
                break;
        }
        return throwBadTypes(typeList);
    }

    public static Rop opAdd(TypeList typeList) {
        return pickBinaryOp(typeList, ADD_CONST_INT, ADD_CONST_LONG, ADD_CONST_FLOAT, ADD_CONST_DOUBLE, ADD_INT, ADD_LONG, ADD_FLOAT, ADD_DOUBLE);
    }

    public static Rop opSub(TypeList typeList) {
        return pickBinaryOp(typeList, SUB_CONST_INT, SUB_CONST_LONG, SUB_CONST_FLOAT, SUB_CONST_DOUBLE, SUB_INT, SUB_LONG, SUB_FLOAT, SUB_DOUBLE);
    }

    public static Rop opMul(TypeList typeList) {
        return pickBinaryOp(typeList, MUL_CONST_INT, MUL_CONST_LONG, MUL_CONST_FLOAT, MUL_CONST_DOUBLE, MUL_INT, MUL_LONG, MUL_FLOAT, MUL_DOUBLE);
    }

    public static Rop opDiv(TypeList typeList) {
        return pickBinaryOp(typeList, DIV_CONST_INT, DIV_CONST_LONG, DIV_CONST_FLOAT, DIV_CONST_DOUBLE, DIV_INT, DIV_LONG, DIV_FLOAT, DIV_DOUBLE);
    }

    public static Rop opRem(TypeList typeList) {
        return pickBinaryOp(typeList, REM_CONST_INT, REM_CONST_LONG, REM_CONST_FLOAT, REM_CONST_DOUBLE, REM_INT, REM_LONG, REM_FLOAT, REM_DOUBLE);
    }

    public static Rop opAnd(TypeList typeList) {
        return pickBinaryOp(typeList, AND_CONST_INT, AND_CONST_LONG, (Rop) null, (Rop) null, AND_INT, AND_LONG, (Rop) null, (Rop) null);
    }

    public static Rop opOr(TypeList typeList) {
        return pickBinaryOp(typeList, OR_CONST_INT, OR_CONST_LONG, (Rop) null, (Rop) null, OR_INT, OR_LONG, (Rop) null, (Rop) null);
    }

    public static Rop opXor(TypeList typeList) {
        return pickBinaryOp(typeList, XOR_CONST_INT, XOR_CONST_LONG, (Rop) null, (Rop) null, XOR_INT, XOR_LONG, (Rop) null, (Rop) null);
    }

    public static Rop opShl(TypeList typeList) {
        return pickBinaryOp(typeList, SHL_CONST_INT, SHL_CONST_LONG, (Rop) null, (Rop) null, SHL_INT, SHL_LONG, (Rop) null, (Rop) null);
    }

    public static Rop opShr(TypeList typeList) {
        return pickBinaryOp(typeList, SHR_CONST_INT, SHR_CONST_LONG, (Rop) null, (Rop) null, SHR_INT, SHR_LONG, (Rop) null, (Rop) null);
    }

    public static Rop opUshr(TypeList typeList) {
        return pickBinaryOp(typeList, USHR_CONST_INT, USHR_CONST_LONG, (Rop) null, (Rop) null, USHR_INT, USHR_LONG, (Rop) null, (Rop) null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Rop pickBinaryOp(TypeList typeList, Rop c1681Rop, Rop c1681Rop2, Rop c1681Rop3, Rop c1681Rop4, Rop c1681Rop5, Rop c1681Rop6, Rop c1681Rop7, Rop c1681Rop8) {
        Rop c1681Rop9;
        int basicFrameType = typeList.getType(0).getBasicFrameType();
        Rop c1681Rop10 = (Rop) null;
        switch (typeList.size()) {
            case 1:
                switch (basicFrameType) {
                    case 4:
                        c1681Rop3 = c1681Rop4;
                        c1681Rop9 = c1681Rop3;
                        break;
                    case 5:
                        c1681Rop9 = c1681Rop3;
                        break;
                    case 6:
                        return c1681Rop;
                    case 7:
                        return c1681Rop2;
                    default:
                        c1681Rop3 = c1681Rop10;
                        c1681Rop9 = c1681Rop3;
                        break;
                }
                break;
            case 2:
                switch (basicFrameType) {
                    case 4:
                        c1681Rop7 = c1681Rop8;
                        c1681Rop9 = c1681Rop7;
                        break;
                    case 5:
                        c1681Rop9 = c1681Rop7;
                        break;
                    case 6:
                        return c1681Rop5;
                    case 7:
                        return c1681Rop6;
                    default:
                        c1681Rop7 = c1681Rop10;
                        c1681Rop9 = c1681Rop7;
                        break;
                }
                break;
            default:
                c1681Rop9 = c1681Rop10;
                break;
        }
        if (c1681Rop9 == null) {
            return throwBadTypes(typeList);
        }
        return c1681Rop9;
    }

    public static Rop opNeg(TypeBearer typeBearer) {
        switch (typeBearer.getBasicFrameType()) {
            case 4:
                return NEG_DOUBLE;
            case 5:
                return NEG_FLOAT;
            case 6:
                return NEG_INT;
            case 7:
                return NEG_LONG;
            default:
                return throwBadType(typeBearer);
        }
    }

    public static Rop opNot(TypeBearer typeBearer) {
        switch (typeBearer.getBasicFrameType()) {
            case 6:
                return NOT_INT;
            case 7:
                return NOT_LONG;
            default:
                return throwBadType(typeBearer);
        }
    }

    public static Rop opCmpl(TypeBearer typeBearer) {
        switch (typeBearer.getBasicType()) {
            case 4:
                return CMPL_DOUBLE;
            case 5:
                return CMPL_FLOAT;
            case 6:
            default:
                return throwBadType(typeBearer);
            case 7:
                return CMPL_LONG;
        }
    }

    public static Rop opCmpg(TypeBearer typeBearer) {
        switch (typeBearer.getBasicType()) {
            case 4:
                return CMPG_DOUBLE;
            case 5:
                return CMPG_FLOAT;
            default:
                return throwBadType(typeBearer);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    /* JADX WARN: Switch 'out' block B:4:0x000b for B:8:0x0022 already processed. Defaulting to fallback option. */
    /* JADX WARN: Switch 'out' block B:8:0x0022 for B:6:0x001c already processed. Defaulting to fallback option. */
    /* JADX WARN: Switch 'out' block B:9:0x0025 for B:7:0x001f already processed. Defaulting to fallback option. */
    public static Rop opConv(TypeBearer typeBearer, TypeBearer typeBearer2) {
        int basicFrameType = typeBearer.getBasicFrameType();
        switch (typeBearer2.getBasicFrameType()) {
            case 4:
                switch (basicFrameType) {
                    case 5:
                        return CONV_D2F;
                    case 6:
                        return CONV_D2I;
                    case 7:
                        return CONV_D2L;
                    default:
                        return throwBadTypes(StdTypeList.make(typeBearer.getType(), typeBearer2.getType()));
                }
            case 5:
                switch (basicFrameType) {
                    case 4:
                        return CONV_F2D;
                    case 5:
                    default:
                        switch (basicFrameType) {
                            case 5:
                                return CONV_D2F;
                            case 6:
                                return CONV_D2I;
                            case 7:
                                return CONV_D2L;
                            default:
                                return throwBadTypes(StdTypeList.make(typeBearer.getType(), typeBearer2.getType()));
                        }
                    case 6:
                        return CONV_F2I;
                    case 7:
                        return CONV_F2L;
                }
            case 6:
                switch (basicFrameType) {
                    case 4:
                        return CONV_I2D;
                    case 5:
                        return CONV_I2F;
                    case 6:
                    default:
                        switch (basicFrameType) {
                            case 4:
                                return CONV_L2D;
                            case 5:
                                return CONV_L2F;
                            case 6:
                                return CONV_L2I;
                            default:
                                switch (basicFrameType) {
                                    case 4:
                                        return CONV_F2D;
                                    case 5:
                                    default:
                                        switch (basicFrameType) {
                                            case 5:
                                                return CONV_D2F;
                                            case 6:
                                                return CONV_D2I;
                                            case 7:
                                                return CONV_D2L;
                                            default:
                                                return throwBadTypes(StdTypeList.make(typeBearer.getType(), typeBearer2.getType()));
                                        }
                                    case 6:
                                        return CONV_F2I;
                                    case 7:
                                        return CONV_F2L;
                                }
                        }
                    case 7:
                        return CONV_I2L;
                }
            case 7:
                switch (basicFrameType) {
                    case 4:
                        return CONV_L2D;
                    case 5:
                        return CONV_L2F;
                    case 6:
                        return CONV_L2I;
                    default:
                        switch (basicFrameType) {
                            case 4:
                                return CONV_F2D;
                            case 5:
                            default:
                                switch (basicFrameType) {
                                    case 5:
                                        return CONV_D2F;
                                    case 6:
                                        return CONV_D2I;
                                    case 7:
                                        return CONV_D2L;
                                    default:
                                        return throwBadTypes(StdTypeList.make(typeBearer.getType(), typeBearer2.getType()));
                                }
                            case 6:
                                return CONV_F2I;
                            case 7:
                                return CONV_F2L;
                        }
                }
            default:
                return throwBadTypes(StdTypeList.make(typeBearer.getType(), typeBearer2.getType()));
        }
    }

    public static Rop opReturn(TypeBearer typeBearer) {
        switch (typeBearer.getBasicFrameType()) {
            case 0:
                return RETURN_VOID;
            case 1:
            case 2:
            case 3:
            case 8:
            default:
                return throwBadType(typeBearer);
            case 4:
                return RETURN_DOUBLE;
            case 5:
                return RETURN_FLOAT;
            case 6:
                return RETURN_INT;
            case 7:
                return RETURN_LONG;
            case 9:
                return RETURN_OBJECT;
        }
    }

    public static Rop opAget(TypeBearer typeBearer) {
        switch (typeBearer.getBasicType()) {
            case 1:
                return AGET_BOOLEAN;
            case 2:
                return AGET_BYTE;
            case 3:
                return AGET_CHAR;
            case 4:
                return AGET_DOUBLE;
            case 5:
                return AGET_FLOAT;
            case 6:
                return AGET_INT;
            case 7:
                return AGET_LONG;
            case 8:
                return AGET_SHORT;
            case 9:
                return AGET_OBJECT;
            default:
                return throwBadType(typeBearer);
        }
    }

    public static Rop opAput(TypeBearer typeBearer) {
        switch (typeBearer.getBasicType()) {
            case 1:
                return APUT_BOOLEAN;
            case 2:
                return APUT_BYTE;
            case 3:
                return APUT_CHAR;
            case 4:
                return APUT_DOUBLE;
            case 5:
                return APUT_FLOAT;
            case 6:
                return APUT_INT;
            case 7:
                return APUT_LONG;
            case 8:
                return APUT_SHORT;
            case 9:
                return APUT_OBJECT;
            default:
                return throwBadType(typeBearer);
        }
    }

    public static Rop opNewArray(TypeBearer typeBearer) {
        Type type = typeBearer.getType();
        switch (type.getComponentType().getBasicType()) {
            case 1:
                return NEW_ARRAY_BOOLEAN;
            case 2:
                return NEW_ARRAY_BYTE;
            case 3:
                return NEW_ARRAY_CHAR;
            case 4:
                return NEW_ARRAY_DOUBLE;
            case 5:
                return NEW_ARRAY_FLOAT;
            case 6:
                return NEW_ARRAY_INT;
            case 7:
                return NEW_ARRAY_LONG;
            case 8:
                return NEW_ARRAY_SHORT;
            case 9:
                return new Rop(41, type, StdTypeList.f5077INT, Exceptions.LIST_Error_NegativeArraySizeException, "new-array-object");
            default:
                return throwBadType(type);
        }
    }

    public static Rop opFilledNewArray(TypeBearer typeBearer, int i) {
        Type componentType = typeBearer.getType().getComponentType();
        if (componentType.isCategory2()) {
            return throwBadType(typeBearer);
        }
        if (i < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        StdTypeList stdTypeList = new StdTypeList(i);
        for (int i2 = 0; i2 < i; i2++) {
            stdTypeList.m7198set(i2, componentType);
        }
        return new Rop(42, stdTypeList, Exceptions.LIST_Error);
    }

    public static Rop opGetField(TypeBearer typeBearer) {
        switch (typeBearer.getBasicType()) {
            case 1:
                return GET_FIELD_BOOLEAN;
            case 2:
                return GET_FIELD_BYTE;
            case 3:
                return GET_FIELD_CHAR;
            case 4:
                return GET_FIELD_DOUBLE;
            case 5:
                return GET_FIELD_FLOAT;
            case 6:
                return GET_FIELD_INT;
            case 7:
                return GET_FIELD_LONG;
            case 8:
                return GET_FIELD_SHORT;
            case 9:
                return GET_FIELD_OBJECT;
            default:
                return throwBadType(typeBearer);
        }
    }

    public static Rop opPutField(TypeBearer typeBearer) {
        switch (typeBearer.getBasicType()) {
            case 1:
                return PUT_FIELD_BOOLEAN;
            case 2:
                return PUT_FIELD_BYTE;
            case 3:
                return PUT_FIELD_CHAR;
            case 4:
                return PUT_FIELD_DOUBLE;
            case 5:
                return PUT_FIELD_FLOAT;
            case 6:
                return PUT_FIELD_INT;
            case 7:
                return PUT_FIELD_LONG;
            case 8:
                return PUT_FIELD_SHORT;
            case 9:
                return PUT_FIELD_OBJECT;
            default:
                return throwBadType(typeBearer);
        }
    }

    public static Rop opGetStatic(TypeBearer typeBearer) {
        switch (typeBearer.getBasicType()) {
            case 1:
                return GET_STATIC_BOOLEAN;
            case 2:
                return GET_STATIC_BYTE;
            case 3:
                return GET_STATIC_CHAR;
            case 4:
                return GET_STATIC_DOUBLE;
            case 5:
                return GET_STATIC_FLOAT;
            case 6:
                return GET_STATIC_INT;
            case 7:
                return GET_STATIC_LONG;
            case 8:
                return GET_STATIC_SHORT;
            case 9:
                return GET_STATIC_OBJECT;
            default:
                return throwBadType(typeBearer);
        }
    }

    public static Rop opPutStatic(TypeBearer typeBearer) {
        switch (typeBearer.getBasicType()) {
            case 1:
                return PUT_STATIC_BOOLEAN;
            case 2:
                return PUT_STATIC_BYTE;
            case 3:
                return PUT_STATIC_CHAR;
            case 4:
                return PUT_STATIC_DOUBLE;
            case 5:
                return PUT_STATIC_FLOAT;
            case 6:
                return PUT_STATIC_INT;
            case 7:
                return PUT_STATIC_LONG;
            case 8:
                return PUT_STATIC_SHORT;
            case 9:
                return PUT_STATIC_OBJECT;
            default:
                return throwBadType(typeBearer);
        }
    }

    public static Rop opInvokeStatic(Prototype prototype) {
        return new Rop(49, prototype.getParameterFrameTypes(), StdTypeList.THROWABLE);
    }

    public static Rop opInvokeVirtual(Prototype prototype) {
        return new Rop(50, prototype.getParameterFrameTypes(), StdTypeList.THROWABLE);
    }

    public static Rop opInvokeSuper(Prototype prototype) {
        return new Rop(51, prototype.getParameterFrameTypes(), StdTypeList.THROWABLE);
    }

    public static Rop opInvokeDirect(Prototype prototype) {
        return new Rop(52, prototype.getParameterFrameTypes(), StdTypeList.THROWABLE);
    }

    public static Rop opInvokeInterface(Prototype prototype) {
        return new Rop(53, prototype.getParameterFrameTypes(), StdTypeList.THROWABLE);
    }

    public static Rop opInvokePolymorphic(Prototype prototype) {
        return new Rop(58, prototype.getParameterFrameTypes(), StdTypeList.THROWABLE);
    }

    private static Rop opInvokeCustom(Prototype prototype) {
        return new Rop(59, prototype.getParameterFrameTypes(), StdTypeList.THROWABLE);
    }

    public static Rop opMarkLocal(TypeBearer typeBearer) {
        switch (typeBearer.getBasicFrameType()) {
            case 4:
                return MARK_LOCAL_DOUBLE;
            case 5:
                return MARK_LOCAL_FLOAT;
            case 6:
                return MARK_LOCAL_INT;
            case 7:
                return MARK_LOCAL_LONG;
            case 8:
            default:
                return throwBadType(typeBearer);
            case 9:
                return MARK_LOCAL_OBJECT;
        }
    }

    Rops() {
    }

    private static Rop throwBadType(TypeBearer typeBearer) {
        throw new IllegalArgumentException(new StringBuffer().append("bad type: ").append(typeBearer).toString());
    }

    private static Rop throwBadTypes(TypeList typeList) {
        throw new IllegalArgumentException(new StringBuffer().append("bad types: ").append(typeList).toString());
    }
}
