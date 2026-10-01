package com.almlkaide.kaypro.android.dx.dex.cf;

import com.almlkaide.kaypro.android.dex.util.ExceptionWithContext;
import com.almlkaide.kaypro.android.dx.command.dexer.DxContext;
import com.almlkaide.kaypro.android.dx.cf.code.BootstrapMethodsList;
import com.almlkaide.kaypro.android.dx.cf.code.ConcreteMethod;
import com.almlkaide.kaypro.android.dx.cf.code.Ropper;
import com.almlkaide.kaypro.android.dx.cf.direct.DirectClassFile;
import com.almlkaide.kaypro.android.dx.cf.iface.Field;
import com.almlkaide.kaypro.android.dx.cf.iface.FieldList;
import com.almlkaide.kaypro.android.dx.cf.iface.Method;
import com.almlkaide.kaypro.android.dx.cf.iface.MethodList;
import com.almlkaide.kaypro.android.dx.dex.DexOptions;
import com.almlkaide.kaypro.android.dx.dex.code.DalvCode;
import com.almlkaide.kaypro.android.dx.dex.code.RopTranslator;
import com.almlkaide.kaypro.android.dx.dex.file.CallSiteIdsSection;
import com.almlkaide.kaypro.android.dx.dex.file.ClassDefItem;
import com.almlkaide.kaypro.android.dx.dex.file.DexFile;
import com.almlkaide.kaypro.android.dx.dex.file.EncodedField;
import com.almlkaide.kaypro.android.dx.dex.file.EncodedMethod;
import com.almlkaide.kaypro.android.dx.dex.file.FieldIdsSection;
import com.almlkaide.kaypro.android.dx.dex.file.MethodHandlesSection;
import com.almlkaide.kaypro.android.dx.dex.file.MethodIdsSection;
import com.almlkaide.kaypro.android.dx.rop.annotation.Annotations;
import com.almlkaide.kaypro.android.dx.rop.annotation.AnnotationsList;
import com.almlkaide.kaypro.android.dx.rop.code.AccessFlags;
import com.almlkaide.kaypro.android.dx.rop.code.DexTranslationAdvice;
import com.almlkaide.kaypro.android.dx.rop.code.LocalVariableExtractor;
import com.almlkaide.kaypro.android.dx.rop.code.LocalVariableInfo;
import com.almlkaide.kaypro.android.dx.rop.code.RopMethod;
import com.almlkaide.kaypro.android.dx.rop.cst.Constant;
import com.almlkaide.kaypro.android.dx.rop.cst.ConstantPool;
import com.almlkaide.kaypro.android.dx.rop.cst.CstBaseMethodRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstBoolean;
import com.almlkaide.kaypro.android.dx.rop.cst.CstByte;
import com.almlkaide.kaypro.android.dx.rop.cst.CstCallSite;
import com.almlkaide.kaypro.android.dx.rop.cst.CstCallSiteRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstChar;
import com.almlkaide.kaypro.android.dx.rop.cst.CstEnumRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstFieldRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInteger;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInterfaceMethodRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstInvokeDynamic;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodHandle;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstShort;
import com.almlkaide.kaypro.android.dx.rop.cst.CstString;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.cst.TypedConstant;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.ssa.Optimizer;
import java.util.Iterator;

public class CfTranslator {
    private static final boolean DEBUG = false;

    CfTranslator() {
    }

    public static ClassDefItem translate(DxContext dxContext, DirectClassFile directClassFile, byte[] bArr, CfOptions cfOptions, DexOptions dexOptions, DexFile dexFile) {
        try {
            return translate0(dxContext, directClassFile, bArr, cfOptions, dexOptions, dexFile);
        } catch (RuntimeException e) {
            throw ExceptionWithContext.withContext(e, new StringBuffer().append("...while processing ").append(directClassFile.getFilePath()).toString());
        }
    }

    private static ClassDefItem translate0(DxContext dxContext, DirectClassFile directClassFile, byte[] bArr, CfOptions cfOptions, DexOptions dexOptions, DexFile dexFile) {
        dxContext.optimizerOptions.loadOptimizeLists(cfOptions.optimizeListFile, cfOptions.dontOptimizeListFile);
        ClassDefItem classDefItem = new ClassDefItem(directClassFile.getThisClass(), directClassFile.getAccessFlags() & (-33), directClassFile.getSuperclass(), directClassFile.getInterfaces(), cfOptions.positionInfo == 1 ? (CstString) null : directClassFile.getSourceFile());
        Annotations classAnnotations = AttributeTranslator.getClassAnnotations(directClassFile, cfOptions);
        if (classAnnotations.size() != 0) {
            classDefItem.setClassAnnotations(classAnnotations, dexFile);
        }
        FieldIdsSection fieldIds = dexFile.getFieldIds();
        MethodIdsSection methodIds = dexFile.getMethodIds();
        MethodHandlesSection methodHandles = dexFile.getMethodHandles();
        CallSiteIdsSection callSiteIds = dexFile.getCallSiteIds();
        processFields(directClassFile, classDefItem, dexFile);
        processMethods(dxContext, directClassFile, cfOptions, dexOptions, classDefItem, dexFile);
        ConstantPool constantPool = directClassFile.getConstantPool();
        int size = constantPool.size();
        for (int i = 0; i < size; i++) {
            Constant orNull = constantPool.getOrNull(i);
            if (orNull instanceof CstMethodRef) {
                methodIds.intern((CstBaseMethodRef) orNull);
            } else if (orNull instanceof CstInterfaceMethodRef) {
                methodIds.intern(((CstInterfaceMethodRef) orNull).toMethodRef());
            } else if (orNull instanceof CstFieldRef) {
                fieldIds.intern((CstFieldRef) orNull);
            } else if (orNull instanceof CstEnumRef) {
                fieldIds.intern(((CstEnumRef) orNull).getFieldRef());
            } else if (orNull instanceof CstMethodHandle) {
                methodHandles.intern((CstMethodHandle) orNull);
            } else if (orNull instanceof CstInvokeDynamic) {
                CstInvokeDynamic cstInvokeDynamic = (CstInvokeDynamic) orNull;
                BootstrapMethodsList.Item itemM7117get = directClassFile.getBootstrapMethods().m7117get(cstInvokeDynamic.getBootstrapMethodIndex());
                CstCallSite cstCallSiteMake = CstCallSite.make(itemM7117get.getBootstrapMethodHandle(), cstInvokeDynamic.getNat(), itemM7117get.getBootstrapMethodArguments());
                cstInvokeDynamic.setDeclaringClass(directClassFile.getThisClass());
                cstInvokeDynamic.setCallSite(cstCallSiteMake);
                Iterator<CstCallSiteRef> it = cstInvokeDynamic.getReferences().iterator();
                while (it.hasNext()) {
                    callSiteIds.intern(it.next());
                }
            }
        }
        return classDefItem;
    }

    private static void processFields(DirectClassFile directClassFile, ClassDefItem classDefItem, DexFile dexFile) {
        CstType thisClass = directClassFile.getThisClass();
        FieldList fields = directClassFile.getFields();
        int size = fields.size();
        for (int i = 0; i < size; i++) {
            Field fieldMo7139get = fields.mo7139get(i);
            try {
                CstFieldRef cstFieldRef = new CstFieldRef(thisClass, fieldMo7139get.getNat());
                int accessFlags = fieldMo7139get.getAccessFlags();
                if (AccessFlags.isStatic(accessFlags)) {
                    TypedConstant constantValue = fieldMo7139get.getConstantValue();
                    EncodedField encodedField = new EncodedField(cstFieldRef, accessFlags);
                    if (constantValue != null) {
                        constantValue = coerceConstant(constantValue, cstFieldRef.getType());
                    }
                    classDefItem.addStaticField(encodedField, constantValue);
                } else {
                    classDefItem.addInstanceField(new EncodedField(cstFieldRef, accessFlags));
                }
                Annotations annotations = AttributeTranslator.getAnnotations(fieldMo7139get.getAttributes());
                if (annotations.size() != 0) {
                    classDefItem.addFieldAnnotations(cstFieldRef, annotations, dexFile);
                }
                dexFile.getFieldIds().intern(cstFieldRef);
            } catch (RuntimeException e) {
                throw ExceptionWithContext.withContext(e, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("...while processing ").append(fieldMo7139get.getName().toHuman()).toString()).append(" ").toString()).append(fieldMo7139get.getDescriptor().toHuman()).toString());
            }
        }
    }

    private static TypedConstant coerceConstant(TypedConstant typedConstant, Type type) {
        if (!typedConstant.getType().equals(type)) {
            switch (type.getBasicType()) {
                case 1:
                    return CstBoolean.make(((CstInteger) typedConstant).getValue());
                case 2:
                    return CstByte.make(((CstInteger) typedConstant).getValue());
                case 3:
                    return CstChar.make(((CstInteger) typedConstant).getValue());
                case 4:
                case 5:
                case 6:
                case 7:
                default:
                    throw new UnsupportedOperationException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("can't coerce ").append(typedConstant).toString()).append(" to ").toString()).append(type).toString());
                case 8:
                    return CstShort.make(((CstInteger) typedConstant).getValue());
            }
        }
        return typedConstant;
    }

    private static void processMethods(DxContext dxContext, DirectClassFile directClassFile, CfOptions cfOptions, DexOptions dexOptions, ClassDefItem classDefItem, DexFile dexFile) {
        DalvCode dalvCode;
        int i;
        RopMethod ropMethod;
        RopMethod ropMethodOptimize;
        CstType thisClass = directClassFile.getThisClass();
        MethodList methods = directClassFile.getMethods();
        int size = methods.size();
        for (int i2 = 0; i2 < size; i2++) {
            Method methodMo7140get = methods.mo7140get(i2);
            try {
                CstMethodRef cstMethodRef = new CstMethodRef(thisClass, methodMo7140get.getNat());
                int accessFlags = methodMo7140get.getAccessFlags();
                boolean zIsStatic = AccessFlags.isStatic(accessFlags);
                boolean zIsPrivate = AccessFlags.isPrivate(accessFlags);
                boolean zIsNative = AccessFlags.isNative(accessFlags);
                boolean zIsAbstract = AccessFlags.isAbstract(accessFlags);
                boolean z = cstMethodRef.isInstanceInit() || cstMethodRef.isClassInit();
                if (zIsNative || zIsAbstract) {
                    dalvCode = (DalvCode) null;
                } else {
                    ConcreteMethod concreteMethod = new ConcreteMethod(methodMo7140get, directClassFile, cfOptions.positionInfo != 1, cfOptions.localInfo);
                    DexTranslationAdvice dexTranslationAdvice = DexTranslationAdvice.THE_ONE;
                    RopMethod ropMethodConvert = Ropper.convert(concreteMethod, dexTranslationAdvice, methods, dexOptions);
                    RopMethod ropMethod2 = (RopMethod) null;
                    int parameterWordCount = cstMethodRef.getParameterWordCount(zIsStatic);
                    String string = new StringBuffer().append(new StringBuffer().append(thisClass.getClassType().getDescriptor()).append(".").toString()).append(methodMo7140get.getName().getString()).toString();
                    if (cfOptions.optimize && dxContext.optimizerOptions.shouldOptimize(string)) {
                        ropMethodOptimize = Optimizer.optimize(ropMethodConvert, parameterWordCount, zIsStatic, cfOptions.localInfo, dexTranslationAdvice);
                        if (cfOptions.statistics) {
                            dxContext.codeStatistics.updateRopStatistics(ropMethodConvert, ropMethodOptimize);
                        }
                        ropMethod = ropMethodConvert;
                    } else {
                        ropMethod = ropMethod2;
                        ropMethodOptimize = ropMethodConvert;
                    }
                    LocalVariableInfo localVariableInfoExtract = cfOptions.localInfo ? LocalVariableExtractor.extract(ropMethodOptimize) : (LocalVariableInfo) null;
                    DalvCode dalvCodeTranslate = RopTranslator.translate(ropMethodOptimize, cfOptions.positionInfo, localVariableInfoExtract, parameterWordCount, dexOptions);
                    if (cfOptions.statistics && ropMethod != null) {
                        updateDexStatistics(dxContext, cfOptions, dexOptions, ropMethodOptimize, ropMethod, localVariableInfoExtract, parameterWordCount, concreteMethod.getCode().size());
                    }
                    dalvCode = dalvCodeTranslate;
                }
                if (AccessFlags.isSynchronized(accessFlags)) {
                    i = 131072 | accessFlags;
                    if (!zIsNative) {
                        i &= -33;
                    }
                } else {
                    i = accessFlags;
                }
                if (z) {
                    i |= 65536;
                }
                EncodedMethod encodedMethod = new EncodedMethod(cstMethodRef, i, dalvCode, AttributeTranslator.getExceptions(methodMo7140get));
                if (cstMethodRef.isInstanceInit() || cstMethodRef.isClassInit() || zIsStatic || zIsPrivate) {
                    classDefItem.addDirectMethod(encodedMethod);
                } else {
                    classDefItem.addVirtualMethod(encodedMethod);
                }
                Annotations methodAnnotations = AttributeTranslator.getMethodAnnotations(methodMo7140get);
                if (methodAnnotations.size() != 0) {
                    classDefItem.addMethodAnnotations(cstMethodRef, methodAnnotations, dexFile);
                }
                AnnotationsList parameterAnnotations = AttributeTranslator.getParameterAnnotations(methodMo7140get);
                if (parameterAnnotations.size() != 0) {
                    classDefItem.addParameterAnnotations(cstMethodRef, parameterAnnotations, dexFile);
                }
                dexFile.getMethodIds().intern(cstMethodRef);
            } catch (RuntimeException e) {
                throw ExceptionWithContext.withContext(e, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("...while processing ").append(methodMo7140get.getName().toHuman()).toString()).append(" ").toString()).append(methodMo7140get.getDescriptor().toHuman()).toString());
            }
        }
    }

    private static void updateDexStatistics(DxContext dxContext, CfOptions cfOptions, DexOptions dexOptions, RopMethod ropMethod, RopMethod ropMethod2, LocalVariableInfo localVariableInfo, int i, int i2) {
        DalvCode dalvCodeTranslate = RopTranslator.translate(ropMethod, cfOptions.positionInfo, localVariableInfo, i, dexOptions);
        DalvCode dalvCodeTranslate2 = RopTranslator.translate(ropMethod2, cfOptions.positionInfo, localVariableInfo, i, dexOptions);
        DalvCode.AssignIndicesCallback assignIndicesCallback = new DalvCode.AssignIndicesCallback() {
            @Override
            public int getIndex(Constant constant) {
                return 0;
            }
        };
        dalvCodeTranslate.assignIndices(assignIndicesCallback);
        dalvCodeTranslate2.assignIndices(assignIndicesCallback);
        dxContext.codeStatistics.updateDexStatistics(dalvCodeTranslate2, dalvCodeTranslate);
        dxContext.codeStatistics.updateOriginalByteCount(i2);
    }
}
