package com.github.megatronking.svg.generator.svg.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class SvgGroupNode extends SvgNode {
    public List<SvgNode> children = new ArrayList();

    @Override
    public void applyStyles(Map<String, String> map, Map<String, Map<String, String>> map2) {
        super.applyStyles(map, map2);
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        Iterator<SvgNode> it = this.children.iterator();
        while (it.hasNext()) {
            it.next().applyStyles(this.styleMaps, map2);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        SvgGroupNode svgGroupNode = (SvgGroupNode) super.clone();
        if (svgGroupNode != null) {
            svgGroupNode.children = new ArrayList();
            Iterator<SvgNode> it = this.children.iterator();
            while (it.hasNext()) {
                SvgNode svgNode = (SvgNode) it.next().clone();
                if (svgNode != null) {
                    svgGroupNode.children.add(svgNode);
                }
            }
        }
        return svgGroupNode;
    }

    @Override
    public boolean isValid() {
        boolean z = false;
        Iterator<SvgNode> it = this.children.iterator();
        while (it.hasNext()) {
            if (it.next().isValid()) {
                z = true;
            }
        }
        return z;
    }

    @Override
    public void toPath() {
    }
}
