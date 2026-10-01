package com.github.megatronking.svg.generator.svg.model;

import com.baidu.android.common.util.DeviceId;
import com.github.megatronking.svg.generator.svg.utils.TransformUtils;
import com.github.megatronking.svg.generator.utils.SCU;
import com.github.megatronking.svg.generator.utils.Color;
import com.github.megatronking.svg.generator.utils.Dimen;
import com.github.megatronking.svg.generator.utils.FloatUtils;
import com.github.megatronking.svg.generator.utils.PathDataNode;
import java.util.HashMap;
import java.util.Map;

public abstract class SvgNode implements Cloneable {
    public String clazz;

    public String f4797id;
    public float[] matrix;
    protected String pathData;
    public Map<String, String> styleMaps;

    private void applyDefineStylesByRef(String str, Map<String, Map<String, String>> map) {
        Map<String, String> map2;
        if (map == null || map.isEmpty() || !map.containsKey(str) || (map2 = map.get(str)) == null || map2.isEmpty()) {
            return;
        }
        for (String str2 : map2.keySet()) {
            if (!this.styleMaps.containsKey(str2)) {
                this.styleMaps.put(str2, map2.get(str2));
            }
        }
    }

    private boolean somethingToDraw() {
        if (this.styleMaps == null) {
            this.styleMaps = new HashMap();
        }
        if (DeviceId.CUIDInfo.I_EMPTY.equals(this.styleMaps.get("opacity"))) {
            return false;
        }
        if (!"none".equals(this.styleMaps.get(SvgConstants.ATTR_DISPLAY))) {
            boolean z = (this.styleMaps.containsKey(SvgConstants.ATTR_FILL) ? Color.convert(this.styleMaps.get(SvgConstants.ATTR_FILL)) : -16777216) == 0 || (this.styleMaps.containsKey(SvgConstants.ATTR_FILL_OPACITY) ? SCU.parseFloat(this.styleMaps.get(SvgConstants.ATTR_FILL_OPACITY), 1.0f) : 1.0f) == ((float) 0);
            int iConvert = Color.convert(this.styleMaps.get(SvgConstants.ATTR_STROKE));
            float fConvert = Dimen.convert(this.styleMaps.get(SvgConstants.ATTR_STROKE_WIDTH));
            boolean z2 = iConvert == 0 || ((iConvert == 0 || (fConvert > ((float) 0) ? 1 : (fConvert == ((float) 0) ? 0 : -1)) != 0) ? fConvert : 1.0f) <= 0.0f || (this.styleMaps.containsKey(SvgConstants.ATTR_STROKE_OPACITY) ? SCU.parseFloat(this.styleMaps.get(SvgConstants.ATTR_STROKE_OPACITY), 1.0f) : 1.0f) == ((float) 0);
            if (!z || !z2) {
                return true;
            }
        }
        return false;
    }

    public void applyStyles(Map<String, String> map, Map<String, Map<String, String>> map2) {
        if (this.styleMaps == null) {
            this.styleMaps = new HashMap();
        }
        for (String str : this.styleMaps.keySet()) {
            if ("inherit".equals(this.styleMaps.get(str).trim())) {
                this.styleMaps.remove(str);
            }
        }
        String lowerCase = getClass().getSimpleName().toLowerCase();
        applyDefineStylesByRef(lowerCase, map2);
        if (this.clazz != null) {
            applyDefineStylesByRef(new StringBuffer().append(".").append(this.clazz).toString(), map2);
            applyDefineStylesByRef(new StringBuffer().append(new StringBuffer().append(lowerCase).append(".").toString()).append(this.clazz).toString(), map2);
        }
        if (this.f4797id != null) {
            applyDefineStylesByRef(new StringBuffer().append("#").append(this.f4797id).toString(), map2);
            applyDefineStylesByRef(new StringBuffer().append(new StringBuffer().append(lowerCase).append("#").toString()).append(this.f4797id).toString(), map2);
        }
        if (map == null || map.isEmpty()) {
            return;
        }
        for (String str2 : map.keySet()) {
            if (!this.styleMaps.containsKey(str2)) {
                this.styleMaps.put(str2, map.get(str2));
            }
        }
    }

    protected Object clone() throws CloneNotSupportedException {
        SvgNode svgNode = (SvgNode) super.clone();
        if (svgNode != null && this.styleMaps != null) {
            svgNode.styleMaps = new HashMap(this.styleMaps);
        }
        return svgNode;
    }

    public String convert2VectorXml(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("<path\n");
        if (this.f4797id != null && this.f4797id.length() != 0) {
            sb.append(str).append("    android:name=\"").append(this.f4797id).append("\"\n");
        }
        int iConvert = (this.styleMaps == null || !this.styleMaps.containsKey(SvgConstants.ATTR_FILL)) ? -16777216 : Color.convert(this.styleMaps.get(SvgConstants.ATTR_FILL));
        if (iConvert != 0) {
            sb.append(str).append("    android:fillColor=\"#").append(Integer.toHexString(iConvert)).append("\"\n");
        }
        String str2 = this.styleMaps.get(SvgConstants.ATTR_FILL_OPACITY);
        if (str2 != null) {
            float f = SCU.parseFloat(str2, 1.0f);
            if (f != 0) {
                sb.append(str).append("    android:fillAlpha=\"").append(f).append("\"\n");
            }
        }
        String str3 = this.styleMaps.get(SvgConstants.ATTR_FILL_RULE);
        if (str3 != null && !"inherit".equals(str3)) {
            if ("evenodd".equals(str3)) {
                str3 = "evenOdd";
            }
            if ("nonzero".equals(str3)) {
                str3 = "nonZero";
            }
            sb.append(str).append("    android:fillType=\"").append(str3).append("\"\n");
        }
        if (this.styleMaps != null) {
            int iConvert2 = Color.convert(this.styleMaps.get(SvgConstants.ATTR_STROKE));
            float fConvert = Dimen.convert(this.styleMaps.get(SvgConstants.ATTR_STROKE_WIDTH));
            if (iConvert2 != 0) {
                if (fConvert == 0) {
                    fConvert = 1.0f;
                }
                sb.append(str).append("    android:strokeColor=\"#").append(Integer.toHexString(iConvert2)).append("\"\n");
                sb.append(str).append("    android:strokeWidth=\"").append(FloatUtils.format2String(fConvert)).append("\"\n");
            }
            String str4 = this.styleMaps.get(SvgConstants.ATTR_STROKE_LINEJOINE);
            if (str4 != null && !"inherit".equals(str4)) {
                sb.append(str).append("    android:strokeLineJoin=\"").append(str4).append("\"\n");
            }
            String str5 = this.styleMaps.get(SvgConstants.ATTR_STROKE_LINECAP);
            if (str5 != null && !"inherit".equals(str5)) {
                sb.append(str).append("    android:strokeLineCap=\"").append(str5).append("\"\n");
            }
            String str6 = this.styleMaps.get(SvgConstants.ATTR_STROKE_MITERLIMIT);
            if (str6 != null) {
                float f2 = SCU.parseFloat(str6, 4.0f);
                if (!"inherit".equals(str6) && f2 >= 1) {
                    sb.append(str).append("    android:strokeMiterLimit=\"").append(f2).append("\"\n");
                }
            }
            String str7 = this.styleMaps.get(SvgConstants.ATTR_STROKE_OPACITY);
            if (str7 != null) {
                float f3 = SCU.parseFloat(str7, 1.0f);
                if (f3 != 0) {
                    sb.append(str).append("    android:strokeAlpha=\"").append(f3).append("\"\n");
                }
            }
        }
        sb.append(str).append("    android:pathData=\"").append(this.pathData).append("\"/>\n");
        return sb.toString();
    }

    public boolean isValid() {
        return this.pathData != null && somethingToDraw();
    }

    public abstract void toPath();

    public void transform(float f, float f2, float f3, float f4, float f5, float f6) {
        PathDataNode[] pathDataNodeArrCreateNodesFromPathData;
        if (isValid()) {
            this.matrix = TransformUtils.preConcat(this.matrix, new float[]{f, f2, f3, f4, f5, f6});
            if (this.pathData == null || (pathDataNodeArrCreateNodesFromPathData = PathDataNode.createNodesFromPathData(this.pathData)) == null) {
                return;
            }
            if (this.matrix[0] != 1.0f || this.matrix[1] != 0.0f || this.matrix[2] != 0.0f || this.matrix[3] != 1.0f || this.matrix[4] != 0.0f || this.matrix[5] != 0.0f) {
                PathDataNode.transform(this.matrix[0], this.matrix[1], this.matrix[2], this.matrix[3], this.matrix[4], this.matrix[5], pathDataNodeArrCreateNodesFromPathData);
            }
            this.pathData = PathDataNode.nodeListToString(pathDataNodeArrCreateNodesFromPathData);
        }
    }
}
