package com.github.megatronking.svg.generator.svg.model;

import com.github.megatronking.svg.generator.svg.utils.StyleUtils;
import java.util.HashMap;
import java.util.Map;

public class Style extends SvgNode {
    public String cssStyle;

    @Override
    public void applyStyles(Map<String, String> map, Map<String, Map<String, String>> map2) {
    }

    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public void toPath() {
    }

    public Map<String, Map<String, String>> toStyle() {
        HashMap map = new HashMap();
        StyleUtils.fill2Map(this.cssStyle, map);
        return map;
    }
}
