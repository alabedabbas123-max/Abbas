package com.almlkaide.kaypro.android.dx.dex.cf;

import com.almlkaide.kaypro.android.dx.cf.attrib.AttAnnotationDefault;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttEnclosingMethod;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttExceptions;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttInnerClasses;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeInvisibleAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeInvisibleParameterAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeVisibleAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttRuntimeVisibleParameterAnnotations;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSignature;
import com.almlkaide.kaypro.android.dx.cf.attrib.AttSourceDebugExtension;
import com.almlkaide.kaypro.android.dx.cf.attrib.InnerClassList;
import com.almlkaide.kaypro.android.dx.cf.direct.DirectClassFile;
import com.almlkaide.kaypro.android.dx.cf.iface.AttributeList;
import com.almlkaide.kaypro.android.dx.cf.iface.Method;
import com.almlkaide.kaypro.android.dx.cf.iface.MethodList;
import com.almlkaide.kaypro.android.dx.dex.file.AnnotationUtils;
import com.almlkaide.kaypro.android.dx.rop.annotation.Annotation;
import com.almlkaide.kaypro.android.dx.rop.annotation.AnnotationVisibility;
import com.almlkaide.kaypro.android.dx.rop.annotation.Annotations;
import com.almlkaide.kaypro.android.dx.rop.annotation.AnnotationsList;
import com.almlkaide.kaypro.android.dx.rop.annotation.NameValuePair;
import com.almlkaide.kaypro.android.dx.rop.code.AccessFlags;
import com.almlkaide.kaypro.android.dx.rop.cst.CstMethodRef;
import com.almlkaide.kaypro.android.dx.rop.cst.CstNat;
import com.almlkaide.kaypro.android.dx.rop.cst.CstType;
import com.almlkaide.kaypro.android.dx.rop.type.StdTypeList;
import com.almlkaide.kaypro.android.dx.rop.type.Type;
import com.almlkaide.kaypro.android.dx.rop.type.TypeList;
import com.almlkaide.kaypro.android.dx.util.Warning;
import java.util.ArrayList;

class AttributeTranslator {
    AttributeTranslator() {
    }

    public static TypeList getExceptions(Method method) {
        AttExceptions attExceptions = (AttExceptions) method.getAttributes().findFirst(AttExceptions.ATTRIBUTE_NAME);
        return attExceptions == null ? StdTypeList.EMPTY : attExceptions.getExceptions();
    }

    public static Annotations getAnnotations(AttributeList attributeList) {
        Annotations annotations0 = getAnnotations0(attributeList);
        Annotation signature = getSignature(attributeList);
        Annotation sourceDebugExtension = getSourceDebugExtension(attributeList);
        if (signature != null) {
            annotations0 = Annotations.combine(annotations0, signature);
        }
        if (sourceDebugExtension != null) {
            return Annotations.combine(annotations0, sourceDebugExtension);
        }
        return annotations0;
    }

    public static Annotations getClassAnnotations(DirectClassFile directClassFile, CfOptions cfOptions) {
        Annotation annotationTranslateAnnotationDefaults;
        CstType thisClass = directClassFile.getThisClass();
        AttributeList attributes = directClassFile.getAttributes();
        Annotations annotations = getAnnotations(attributes);
        Annotation annotationTranslateEnclosingMethod = translateEnclosingMethod(attributes);
        try {
            Annotations annotationsTranslateInnerClasses = translateInnerClasses(thisClass, attributes, annotationTranslateEnclosingMethod == null);
            if (annotationsTranslateInnerClasses != null) {
                annotations = Annotations.combine(annotations, annotationsTranslateInnerClasses);
            }
        } catch (Warning e) {
            cfOptions.warn.println(new StringBuffer().append("warning: ").append(e.getMessage()).toString());
        }
        if (annotationTranslateEnclosingMethod != null) {
            annotations = Annotations.combine(annotations, annotationTranslateEnclosingMethod);
        }
        if (AccessFlags.isAnnotation(directClassFile.getAccessFlags()) && (annotationTranslateAnnotationDefaults = translateAnnotationDefaults(directClassFile)) != null) {
            return Annotations.combine(annotations, annotationTranslateAnnotationDefaults);
        }
        return annotations;
    }

    public static Annotations getMethodAnnotations(Method method) {
        Annotations annotations = getAnnotations(method.getAttributes());
        TypeList exceptions = getExceptions(method);
        if (exceptions.size() != 0) {
            return Annotations.combine(annotations, AnnotationUtils.makeThrows(exceptions));
        }
        return annotations;
    }

    private static Annotations getAnnotations0(AttributeList attributeList) {
        AttRuntimeVisibleAnnotations attRuntimeVisibleAnnotations = (AttRuntimeVisibleAnnotations) attributeList.findFirst(AttRuntimeVisibleAnnotations.ATTRIBUTE_NAME);
        AttRuntimeInvisibleAnnotations attRuntimeInvisibleAnnotations = (AttRuntimeInvisibleAnnotations) attributeList.findFirst(AttRuntimeInvisibleAnnotations.ATTRIBUTE_NAME);
        if (attRuntimeVisibleAnnotations == null) {
            if (attRuntimeInvisibleAnnotations == null) {
                return Annotations.EMPTY;
            }
            return attRuntimeInvisibleAnnotations.getAnnotations();
        }
        if (attRuntimeInvisibleAnnotations == null) {
            return attRuntimeVisibleAnnotations.getAnnotations();
        }
        return Annotations.combine(attRuntimeVisibleAnnotations.getAnnotations(), attRuntimeInvisibleAnnotations.getAnnotations());
    }

    private static Annotation getSignature(AttributeList attributeList) {
        AttSignature attSignature = (AttSignature) attributeList.findFirst(AttSignature.ATTRIBUTE_NAME);
        return attSignature == null ? (Annotation) null : AnnotationUtils.makeSignature(attSignature.getSignature());
    }

    private static Annotation getSourceDebugExtension(AttributeList attributeList) {
        AttSourceDebugExtension attSourceDebugExtension = (AttSourceDebugExtension) attributeList.findFirst(AttSourceDebugExtension.ATTRIBUTE_NAME);
        return attSourceDebugExtension == null ? (Annotation) null : AnnotationUtils.makeSourceDebugExtension(attSourceDebugExtension.getSmapString());
    }

    private static Annotation translateEnclosingMethod(AttributeList attributeList) {
        AttEnclosingMethod attEnclosingMethod = (AttEnclosingMethod) attributeList.findFirst(AttEnclosingMethod.ATTRIBUTE_NAME);
        if (attEnclosingMethod == null) {
            return (Annotation) null;
        }
        CstType enclosingClass = attEnclosingMethod.getEnclosingClass();
        CstNat method = attEnclosingMethod.getMethod();
        if (method == null) {
            return AnnotationUtils.makeEnclosingClass(enclosingClass);
        }
        return AnnotationUtils.makeEnclosingMethod(new CstMethodRef(enclosingClass, method));
    }

    private static Annotations translateInnerClasses(CstType cstType, AttributeList attributeList, boolean z) {
        AttInnerClasses attInnerClasses = (AttInnerClasses) attributeList.findFirst(AttInnerClasses.ATTRIBUTE_NAME);
        if (attInnerClasses == null) {
            return (Annotations) null;
        }
        InnerClassList innerClasses = attInnerClasses.getInnerClasses();
        int size = innerClasses.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        InnerClassList.Item item = (InnerClassList.Item) null;
        while (i < size) {
            InnerClassList.Item itemM7112get = innerClasses.m7112get(i);
            CstType innerClass = itemM7112get.getInnerClass();
            if (!innerClass.equals(cstType)) {
                if (cstType.equals(itemM7112get.getOuterClass())) {
                    arrayList.add(innerClass.getClassType());
                }
                itemM7112get = item;
            }
            i++;
            item = itemM7112get;
        }
        int size2 = arrayList.size();
        if (item == null && size2 == 0) {
            return (Annotations) null;
        }
        Annotations annotations = new Annotations();
        if (item != null) {
            annotations.m7178add(AnnotationUtils.makeInnerClass(item.getInnerName(), item.getAccessFlags()));
            if (z) {
                if (item.getOuterClass() == null) {
                    throw new Warning(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("Ignoring InnerClasses attribute for an ").append("anonymous inner class\n").toString()).append("(").toString()).append(cstType.toHuman()).toString()).append(") that doesn't come with an\n").toString()).append("associated EnclosingMethod attribute. ").toString()).append("This class was probably produced by a\n").toString()).append("compiler that did not target the modern ").toString()).append(".class file format. The recommended\n").toString()).append("solution is to recompile the class from ").toString()).append("source, using an up-to-date compiler\n").toString()).append("and without specifying any \"-target\" type ").toString()).append("options. The consequence of ignoring\n").toString()).append("this warning is that reflective operations ").toString()).append("on this class will incorrectly\n").toString()).append("indicate that it is *not* an inner class.").toString());
                }
                annotations.m7178add(AnnotationUtils.makeEnclosingClass(item.getOuterClass()));
            }
        }
        if (size2 != 0) {
            StdTypeList stdTypeList = new StdTypeList(size2);
            for (int i2 = 0; i2 < size2; i2++) {
                stdTypeList.m7198set(i2, (Type) arrayList.get(i2));
            }
            stdTypeList.setImmutable();
            annotations.m7178add(AnnotationUtils.makeMemberClasses(stdTypeList));
        }
        annotations.setImmutable();
        return annotations;
    }

    public static AnnotationsList getParameterAnnotations(Method method) {
        AttributeList attributes = method.getAttributes();
        AttRuntimeVisibleParameterAnnotations attRuntimeVisibleParameterAnnotations = (AttRuntimeVisibleParameterAnnotations) attributes.findFirst(AttRuntimeVisibleParameterAnnotations.ATTRIBUTE_NAME);
        AttRuntimeInvisibleParameterAnnotations attRuntimeInvisibleParameterAnnotations = (AttRuntimeInvisibleParameterAnnotations) attributes.findFirst(AttRuntimeInvisibleParameterAnnotations.ATTRIBUTE_NAME);
        if (attRuntimeVisibleParameterAnnotations == null) {
            if (attRuntimeInvisibleParameterAnnotations == null) {
                return AnnotationsList.EMPTY;
            }
            return attRuntimeInvisibleParameterAnnotations.getParameterAnnotations();
        }
        if (attRuntimeInvisibleParameterAnnotations == null) {
            return attRuntimeVisibleParameterAnnotations.getParameterAnnotations();
        }
        return AnnotationsList.combine(attRuntimeVisibleParameterAnnotations.getParameterAnnotations(), attRuntimeInvisibleParameterAnnotations.getParameterAnnotations());
    }

    private static Annotation translateAnnotationDefaults(DirectClassFile directClassFile) {
        boolean z;
        CstType thisClass = directClassFile.getThisClass();
        MethodList methods = directClassFile.getMethods();
        int size = methods.size();
        Annotation annotation = new Annotation(thisClass, AnnotationVisibility.EMBEDDED);
        int i = 0;
        boolean z2 = false;
        while (i < size) {
            Method methodMo7140get = methods.mo7140get(i);
            AttAnnotationDefault attAnnotationDefault = (AttAnnotationDefault) methodMo7140get.getAttributes().findFirst(AttAnnotationDefault.ATTRIBUTE_NAME);
            if (attAnnotationDefault != null) {
                annotation.m7176add(new NameValuePair(methodMo7140get.getNat().getName(), attAnnotationDefault.getValue()));
                z = true;
            } else {
                z = z2;
            }
            i++;
            z2 = z;
        }
        if (!z2) {
            return (Annotation) null;
        }
        annotation.setImmutable();
        return AnnotationUtils.makeAnnotationDefault(annotation);
    }
}
