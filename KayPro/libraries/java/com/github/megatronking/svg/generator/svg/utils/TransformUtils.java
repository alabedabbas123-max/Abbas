package com.github.megatronking.svg.generator.svg.utils;

import com.github.megatronking.svg.generator.utils.SCU;
import com.github.megatronking.svg.generator.utils.Matrix;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TransformUtils {
    private static final String VALUE_REGEX = "\\([([1-9/-]/d*/./d*|0/./d*[1-9/-]/d*|0?/.0+|0|,)\\s]+\\)";

    private static void doRotation(Matrix matrix, String str) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8 = 0.0f;
        String strTrim = str.replace("rotate", "").replace("(", "").replace(")", "").trim();
        if (strTrim.contains(",")) {
            String[] strArrSplit = strTrim.split(",");
            if (strArrSplit.length == 2) {
                f7 = SCU.parseFloat(strArrSplit[0].trim(), 0.0f);
                f6 = SCU.parseFloat(strArrSplit[1].trim(), 0.0f);
            } else {
                f6 = 0.0f;
                f7 = 0.0f;
            }
            if (strArrSplit.length == 3) {
                f7 = SCU.parseFloat(strArrSplit[0].trim(), 0.0f);
                f6 = SCU.parseFloat(strArrSplit[1].trim(), 0.0f);
                f8 = SCU.parseFloat(strArrSplit[2].trim(), 0.0f);
            }
            f = f8;
            f2 = f7;
            f3 = f6;
        } else if (strTrim.contains(" ")) {
            int iIndexOf = strTrim.indexOf(" ");
            int iLastIndexOf = strTrim.lastIndexOf(" ");
            if (iIndexOf != iLastIndexOf) {
                f4 = SCU.parseFloat(strTrim.substring(0, iIndexOf).trim(), 0.0f);
                f5 = SCU.parseFloat(strTrim.substring(iIndexOf, iLastIndexOf).trim(), 0.0f);
                f = SCU.parseFloat(strTrim.substring(iLastIndexOf).trim(), 0.0f);
            } else {
                f4 = 0.0f;
                f5 = 0.0f;
                f = 0.0f;
            }
            f2 = f4;
            f3 = f5;
        } else {
            float f9 = SCU.parseFloat(strTrim, 0.0f);
            f = 0.0f;
            f2 = f9;
            f3 = 0.0f;
        }
        matrix.postRotate(f2, f3, f);
    }

    private static void doScale(Matrix matrix, String str) {
        float f;
        float f2 = 1.0f;
        String strTrim = str.replace("scale", "").replace("(", "").replace(")", "").trim();
        if (strTrim.contains(",")) {
            String[] strArrSplit = strTrim.split(",");
            f = SCU.parseFloat(strArrSplit[0].trim(), 1.0f);
            f2 = SCU.parseFloat(strArrSplit[1].trim(), 1.0f);
        } else if (strTrim.contains(" ")) {
            int iIndexOf = strTrim.indexOf(" ");
            f = SCU.parseFloat(strTrim.substring(0, iIndexOf).trim(), 1.0f);
            f2 = SCU.parseFloat(strTrim.substring(iIndexOf).trim(), 1.0f);
        } else {
            f = SCU.parseFloat(strTrim, 1.0f);
        }
        matrix.postScale(f, f2);
    }

    private static void doTranslate(Matrix matrix, String str) {
        float f;
        float f2 = 0.0f;
        String strTrim = str.replace("translate", "").replace("(", "").replace(")", "").trim();
        if (strTrim.contains(",")) {
            String[] strArrSplit = strTrim.split(",");
            f = SCU.parseFloat(strArrSplit[0].trim(), 0.0f);
            f2 = SCU.parseFloat(strArrSplit[1].trim(), 0.0f);
        } else if (strTrim.contains(" ")) {
            int iIndexOf = strTrim.indexOf(" ");
            f = SCU.parseFloat(strTrim.substring(0, iIndexOf).trim(), 0.0f);
            f2 = SCU.parseFloat(strTrim.substring(iIndexOf).trim(), 0.0f);
        } else {
            f = SCU.parseFloat(strTrim, 0.0f);
        }
        matrix.postTranslate(f, f2);
    }

    public static float[] formatTransform(String str) {
        TreeMap treeMap = new TreeMap(new Comparator<Integer>() {
            public int compare2(Integer num, Integer num2) {
                return num.compareTo(num2);
            }

            @Override
            public int compare(Integer num, Integer num2) {
                return compare2(num, num2);
            }
        });
        regexMatch(str, new StringBuffer().append("translate").append(VALUE_REGEX).toString(), treeMap);
        regexMatch(str, new StringBuffer().append("scale").append(VALUE_REGEX).toString(), treeMap);
        regexMatch(str, new StringBuffer().append("rotate").append(VALUE_REGEX).toString(), treeMap);
        Matrix matrix = new Matrix();
        for (String str2 : treeMap.values()) {
            Matrix matrix2 = new Matrix();
            if (str2.startsWith("translate")) {
                doTranslate(matrix2, str2);
            }
            if (str2.startsWith("scale")) {
                doScale(matrix2, str2);
            }
            if (str2.startsWith("rotate")) {
                doRotation(matrix2, str2);
            }
            matrix.preConcat(matrix2);
        }
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], fArr[1], fArr[4], fArr[2], fArr[5]};
    }

    public static float[] preConcat(float[] fArr, float[] fArr2) {
        if (fArr == null) {
            fArr = new float[]{1, 0, 0, 1, 0, 0};
        }
        if (fArr2 == null) {
            fArr2 = new float[]{1, 0, 0, 1, 0, 0};
        }
        Matrix matrix = new Matrix();
        matrix.setValues(new float[]{fArr[0], fArr[2], fArr[4], fArr[1], fArr[3], fArr[5], 0, 0, 1});
        Matrix matrix2 = new Matrix();
        matrix2.setValues(new float[]{fArr2[0], fArr2[2], fArr2[4], fArr2[1], fArr2[3], fArr2[5], 0, 0, 1});
        matrix2.preConcat(matrix);
        float[] fArr3 = new float[9];
        matrix2.getValues(fArr3);
        return new float[]{fArr3[0], fArr3[3], fArr3[1], fArr3[4], fArr3[2], fArr3[5]};
    }

    private static void regexMatch(String str, String str2, Map<Integer, String> map) {
        Matcher matcher = Pattern.compile(str2).matcher(str);
        while (matcher.find()) {
            map.put(new Integer(matcher.start()), matcher.group().trim());
        }
    }
}
