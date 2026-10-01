package com.almlkaide.kaypro.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Json2Java {
    public static String createBean(String str, Configurd configurd) throws JSONException {
        try {
            return createBean(new JSONObject(str), configurd);
        } catch (JSONException e) {
            try {
                return createBean(new JSONArray(str), configurd);
            } catch (JSONException e2) {
                throw new JSONException(str);
            }
        }
    }

    public static String createBean(JSONArray jSONArray, Configurd configurd) throws JSONException {
        if (jSONArray.length() > 0) {
            Object obj = jSONArray.get(0);
            if (obj instanceof JSONObject) {
                return createBean((JSONObject) obj, configurd);
            }
            throw new JSONException(Utils.isCN() ? "不支持此无key类型数组转换" : "This array conversion without key type is not supported");
        }
        return createClass("", configurd);
    }

    public static String createBean(JSONObject jSONObject, Configurd configurd) throws JSONException {
        return createClass(createObject(jSONObject, (String) null, 0, configurd), configurd);
    }

    private static String createClass(String str, Configurd configurd) {
        StringBuffer stringBuffer = new StringBuffer();
        if (configurd.getPackageName() != null) {
            stringBuffer.append(new StringBuffer().append(new StringBuffer().append("package ").append(configurd.getPackageName()).toString()).append(";").toString());
            stringBuffer.append("\n\n");
        }
        if (configurd.getClassName() != null) {
            if (configurd.getImports().keySet().size() > 0) {
                for (String str2 : configurd.getImports().keySet()) {
                    stringBuffer.append("import ");
                    stringBuffer.append(str2);
                    stringBuffer.append(";\n");
                }
                stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            stringBuffer.append(new StringBuffer().append(new StringBuffer().append("public class ").append(configurd.getClassName()).toString()).append(" {").toString());
            stringBuffer.append("\n\n");
            stringBuffer.append(str);
            stringBuffer.append("}");
            return stringBuffer.toString();
        }
        return new StringBuffer().append(configurd.getSpace()).append(str.trim()).toString();
    }

    private static String createObject(JSONObject jSONObject, String str, int i, Configurd configurd) throws JSONException {
        Object cls;
        String simpleName;
        String space = configurd.getSpace();
        int i2 = 0;
        String string = space;
        String str2 = "";
        while (i2 < i) {
            String string2 = new StringBuffer().append(str2).append(space).toString();
            i2++;
            string = new StringBuffer().append(string).append(space).toString();
            str2 = string2;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray.length() > 0) {
                    Object obj2 = jSONArray.get(0);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= jSONArray.length()) {
                            cls = obj2;
                            break;
                        }
                        if (jSONArray.get(i3).getClass().equals(obj2.getClass())) {
                            i3++;
                        } else {
                            try {
                                cls = Class.forName("java.lang.Object");
                                break;
                            } catch (ClassNotFoundException e) {
                                throw new NoClassDefFoundError(e.getMessage());
                            }
                        }
                    }
                    if (cls instanceof JSONObject) {
                        simpleName = toUpperCaseFirst(next);
                    } else {
                        if (cls instanceof Class) {
                        }
                        simpleName = getSimpleName(cls, configurd);
                    }
                    arrayList.add(createField(jSONArray, simpleName, next, configurd));
                    if (obj2 instanceof JSONObject) {
                        arrayList2.add(createObject((JSONObject) obj2, toUpperCaseFirst(next), i + 1, configurd));
                    }
                } else {
                    try {
                        arrayList.add(createField(jSONArray, Class.forName("java.lang.Object").getSimpleName(), next, configurd));
                    } catch (ClassNotFoundException e2) {
                        throw new NoClassDefFoundError(e2.getMessage());
                    }
                }
            } else if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) obj;
                String upperCaseFirst = toUpperCaseFirst(next);
                arrayList.add(createField(jSONObject2, upperCaseFirst, next, configurd));
                arrayList2.add(createObject(jSONObject2, upperCaseFirst, i + 1, configurd));
            } else {
                arrayList.add(createField(obj, getSimpleName(obj, configurd), next, configurd));
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuffer stringBuffer3 = new StringBuffer();
        StringBuffer stringBuffer4 = new StringBuffer();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= arrayList.size()) {
                break;
            }
            Field field = (Field) arrayList.get(i5);
            stringBuffer2.append(new StringBuffer().append(string).append(field.toString()).toString());
            stringBuffer2.append(IOUtils.LINE_SEPARATOR_UNIX);
            if (i5 + 1 < arrayList.size()) {
                stringBuffer2.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            if (configurd.isSetters()) {
                String type = field.getType();
                if (configurd.isUseArray() && field.isArray()) {
                    type = new StringBuffer().append(type.substring(0, type.length() - 2)).append("...").toString();
                }
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append(new StringBuffer().append(new StringBuffer().append(string).append("public void set").toString()).append(toUpperCaseFirst(field.getName())).toString());
                stringBuffer5.append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("(").append(type).toString()).append(" ").toString()).append(field.getName()).toString()).append(") {").toString());
                stringBuffer5.append(IOUtils.LINE_SEPARATOR_UNIX);
                stringBuffer5.append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(string).append(space).toString()).append("this.").toString()).append(field.getName()).toString()).append(" = ").toString()).append(field.getName()).toString()).append(";").toString());
                stringBuffer5.append(IOUtils.LINE_SEPARATOR_UNIX);
                stringBuffer5.append(new StringBuffer().append(string).append("}").toString());
                arrayList3.add(stringBuffer5.toString());
            }
            if (configurd.isGetters()) {
                StringBuffer stringBuffer6 = new StringBuffer();
                String str3 = "get";
                if (Boolean.TYPE.getSimpleName().equals(field.getType())) {
                    str3 = "is";
                }
                stringBuffer6.append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(string).append("public ").toString()).append(field.getType()).toString()).append(" ").toString()).append(str3).toString()).append(toUpperCaseFirst(field.getName())).toString()).append("() {").toString());
                stringBuffer6.append(IOUtils.LINE_SEPARATOR_UNIX);
                stringBuffer6.append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(string).append(space).toString()).append("return ").toString()).append(field.getName()).toString()).append(";").toString());
                stringBuffer6.append(IOUtils.LINE_SEPARATOR_UNIX);
                stringBuffer6.append(new StringBuffer().append(string).append("}").toString());
                arrayList4.add(stringBuffer6.toString());
            }
            i4 = i5 + 1;
        }
        if (configurd.isSortMethod()) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                stringBuffer3.append((String) it.next());
                stringBuffer3.append("\n\n");
            }
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                stringBuffer3.append((String) it2.next());
                stringBuffer3.append("\n\n");
            }
        } else if (configurd.isSetters() && configurd.isGetters()) {
            int i6 = 0;
            while (true) {
                int i7 = i6;
                if (i7 >= arrayList3.size()) {
                    break;
                }
                stringBuffer3.append((String) arrayList3.get(i7));
                stringBuffer3.append("\n\n");
                stringBuffer3.append((String) arrayList4.get(i7));
                stringBuffer3.append("\n\n");
                i6 = i7 + 1;
            }
        } else {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                stringBuffer3.append((String) it3.next());
                stringBuffer3.append("\n\n");
            }
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                stringBuffer3.append((String) it4.next());
                stringBuffer3.append("\n\n");
            }
        }
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            stringBuffer4.append((String) it5.next());
            stringBuffer4.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        stringBuffer.append(stringBuffer2);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
        stringBuffer.append(stringBuffer3);
        stringBuffer.append(stringBuffer4);
        StringBuffer stringBuffer7 = new StringBuffer();
        String string3 = "";
        if (configurd.isToString()) {
            String string4 = "\"[\"+getClass().getCanonicalName()+\"]\"";
            int i8 = 0;
            while (true) {
                int i9 = i8;
                if (i9 >= arrayList.size()) {
                    break;
                }
                Field field2 = (Field) arrayList.get(i9);
                string4 = new StringBuffer().append(string4).append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(IOUtils.LINE_SEPARATOR_UNIX).append(string).toString()).append(space).toString()).append(" + \"").toString()).append(i9 == 0 ? "" : ",").toString()).append("\\").toString()).append("n").toString()).append(field2.getName()).toString()).append("=\" + ").toString()).append(field2.getName()).toString()).toString();
                i8 = i9 + 1;
            }
            string3 = new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(string).append("@Override").toString()).append(IOUtils.LINE_SEPARATOR_UNIX).toString()).append(string).toString()).append("public String toString() {").toString()).append(IOUtils.LINE_SEPARATOR_UNIX).toString()).append(string).toString()).append(space).toString()).append("return ").toString()).append(string4).toString()).append(";").toString()).append(IOUtils.LINE_SEPARATOR_UNIX).toString()).append(string).toString()).append("}\n\n").toString();
        }
        if (i > 0) {
            stringBuffer7.append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(str2).append("public static class ").toString()).append(str).toString()).append(" {").toString());
            stringBuffer7.append("\n\n");
            if (stringBuffer.toString().trim().length() != 0) {
                stringBuffer7.append(stringBuffer);
            }
            stringBuffer7.append(string3);
            stringBuffer7.append(str2);
            stringBuffer7.append("}\n");
        } else {
            stringBuffer7.append(stringBuffer);
            stringBuffer7.append(string3);
        }
        return stringBuffer7.toString();
    }

    private static String toUpperCaseFirst(CharSequence charSequence) {
        char[] charArray = charSequence.toString().toCharArray();
        charArray[0] = Character.toUpperCase(charArray[0]);
        return String.valueOf(charArray);
    }

    private static String getSimpleName(Object obj, Configurd configurd) {
        if (JSONObject.NULL == obj) {
            try {
                return Class.forName("java.lang.Object").getSimpleName();
            } catch (ClassNotFoundException e) {
                throw new NoClassDefFoundError(e.getMessage());
            }
        }
        Class[] clsArr = new Class[4];
        try {
            clsArr[0] = Class.forName("java.lang.Boolean");
            try {
                clsArr[1] = Class.forName("java.lang.Integer");
                try {
                    clsArr[2] = Class.forName("java.lang.Long");
                    try {
                        clsArr[3] = Class.forName("java.lang.Double");
                        Class[] clsArr2 = {Boolean.TYPE, Integer.TYPE, Long.TYPE, Double.TYPE};
                        Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
                        if (configurd.isUseInteger()) {
                            try {
                                if (Class.forName("java.lang.Integer").equals(cls)) {
                                    return cls.getSimpleName();
                                }
                            } catch (ClassNotFoundException e2) {
                                throw new NoClassDefFoundError(e2.getMessage());
                            }
                        }
                        for (int i = 0; i < clsArr.length; i++) {
                            if (clsArr[i].equals(cls)) {
                                return clsArr2[i].getSimpleName();
                            }
                        }
                        return cls.getSimpleName();
                    } catch (ClassNotFoundException e3) {
                        throw new NoClassDefFoundError(e3.getMessage());
                    }
                } catch (ClassNotFoundException e4) {
                    throw new NoClassDefFoundError(e4.getMessage());
                }
            } catch (ClassNotFoundException e5) {
                throw new NoClassDefFoundError(e5.getMessage());
            }
        } catch (ClassNotFoundException e6) {
            throw new NoClassDefFoundError(e6.getMessage());
        }
    }

    private static Field createField(Object obj, String str, String str2, Configurd configurd) {
        String str3 = configurd.isPublicField() ? "public" : "private";
        if (obj instanceof JSONArray) {
            Field field = new Field();
            field.setModifier(str3);
            field.setName(str2);
            field.setArray(true);
            if (configurd.isUseArray()) {
                field.setType(new StringBuffer().append(str).append("[]").toString());
            } else {
                try {
                    Class<?> cls = Class.forName("java.util.List");
                    if (Integer.TYPE.getSimpleName().equals(str)) {
                        try {
                            str = Class.forName("java.lang.Integer").getSimpleName();
                        } catch (ClassNotFoundException e) {
                            throw new NoClassDefFoundError(e.getMessage());
                        }
                    }
                    field.setType(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(cls.getSimpleName()).append("<").toString()).append(str).toString()).append(">").toString());
                    configurd.addImport(cls.getCanonicalName());
                } catch (ClassNotFoundException e2) {
                    throw new NoClassDefFoundError(e2.getMessage());
                }
            }
            return field;
        }
        return new Field(str3, str, str2);
    }

    private static class Field {
        private boolean array;
        private String modifier;
        private String name;
        private String type;

        public Field() {
        }

        public Field(String str, String str2, String str3) {
            this.modifier = str;
            this.type = str2;
            this.name = str3;
        }

        public Field setModifier(String str) {
            this.modifier = str;
            return this;
        }

        public String getModifier() {
            return this.modifier;
        }

        public Field setType(String str) {
            this.type = str;
            return this;
        }

        public String getType() {
            return this.type;
        }

        public Field setName(String str) {
            this.name = str;
            return this;
        }

        public String getName() {
            return this.name;
        }

        public Field setArray(boolean z) {
            this.array = z;
            return this;
        }

        public boolean isArray() {
            return this.array;
        }

        public String toString() {
            return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(this.modifier).append(" ").toString()).append(this.type).toString()).append(" ").toString()).append(this.name).toString()).append(";").toString();
        }
    }

    public static class Configurd {
        private String className;
        private String packageName;
        private boolean publicField;
        private boolean sortMethod;
        private boolean toString;
        private boolean useArray;
        private boolean useInteger;
        private int indentation = 4;
        private boolean setters = true;
        private boolean getters = true;
        private Map<String, Void> imports = new HashMap();

        public Configurd() {
        }

        public Configurd(String str, String str2) {
            this.packageName = str;
            this.className = str2;
        }

        public void setUseInteger(boolean z) {
            this.useInteger = z;
        }

        public boolean isUseInteger() {
            return this.useInteger;
        }

        public Configurd setIndentation(int i) {
            this.indentation = i;
            return this;
        }

        public int getIndentation() {
            return this.indentation;
        }

        public Configurd setPackageName(String str) {
            this.packageName = str;
            return this;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public Configurd setClassName(String str) {
            this.className = str;
            return this;
        }

        public String getClassName() {
            return this.className;
        }

        public Configurd setSetters(boolean z) {
            this.setters = z;
            return this;
        }

        public boolean isSetters() {
            return this.setters;
        }

        public Configurd setGetters(boolean z) {
            this.getters = z;
            return this;
        }

        public boolean isGetters() {
            return this.getters;
        }

        public Configurd setSortMethod(boolean z) {
            this.sortMethod = z;
            return this;
        }

        public boolean isSortMethod() {
            return this.sortMethod;
        }

        public Configurd setPublicField(boolean z) {
            this.publicField = z;
            return this;
        }

        public boolean isPublicField() {
            return this.publicField;
        }

        public Configurd setUseArray(boolean z) {
            this.useArray = z;
            return this;
        }

        public boolean isUseArray() {
            return this.useArray;
        }

        public Configurd setToString(boolean z) {
            this.toString = z;
            return this;
        }

        public boolean isToString() {
            return this.toString;
        }

        public Map<String, Void> getImports() {
            return this.imports;
        }

        public Configurd addImport(String str) {
            getImports().put(str, (Void) null);
            return this;
        }

        public String getSpace() {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < getIndentation(); i++) {
                stringBuffer.append(" ");
            }
            return stringBuffer.toString();
        }
    }
}
