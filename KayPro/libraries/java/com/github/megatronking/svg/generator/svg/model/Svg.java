package com.github.megatronking.svg.generator.svg.model;

import com.github.megatronking.svg.generator.utils.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Svg extends SvgGroupNode {

    public float f4795h;
    public float[] viewBox;

    public float f4796w;

    private SvgNode cloneNode(SvgNode svgNode) {
        try {
            return (SvgNode) svgNode.clone();
        } catch (CloneNotSupportedException e) {
            return (SvgNode) null;
        }
    }

    private List<Style> findAllStylesFromSvg() {
        ArrayList arrayList = new ArrayList();
        recursiveFindStyles(this.children, arrayList);
        return arrayList;
    }

    private List<SvgNode> findNodesById(String str) {
        ArrayList arrayList = new ArrayList();
        recursiveFindNodesById(str, this.children, arrayList);
        return arrayList;
    }

    private void recursiveFindNodesById(String str, List<SvgNode> list, List<SvgNode> list2) {
        if (list == null || list.isEmpty() || list2 == null) {
            return;
        }
        for (SvgNode svgNode : list) {
            if (!TextUtils.isEmpty(svgNode.f4797id) && svgNode.f4797id.equals(str)) {
                list2.add(svgNode);
            } else if (svgNode instanceof SvgGroupNode) {
                recursiveFindNodesById(str, ((SvgGroupNode) svgNode).children, list2);
            }
        }
    }

    private void recursiveFindStyles(List<SvgNode> list, List<Style> list2) {
        if (list == null || list.isEmpty() || list2 == null) {
            return;
        }
        for (SvgNode svgNode : list) {
            if (svgNode instanceof Style) {
                list2.add((Style) svgNode);
            } else if (svgNode instanceof SvgGroupNode) {
                recursiveFindStyles(((SvgGroupNode) svgNode).children, list2);
            }
        }
    }

    private void replaceUseTagWithHrefLink(List<SvgNode> list) {
        List<SvgNode> listFindNodesById;
        SvgNode svgNodeCloneNode;
        if (list == null) {
            return;
        }
        for (SvgNode svgNode : list) {
            if (svgNode instanceof Use) {
                if (!TextUtils.isEmpty(((Use) svgNode).href) && ((Use) svgNode).href.startsWith("#") && (listFindNodesById = findNodesById(((Use) svgNode).href.substring(1))) != null && !listFindNodesById.isEmpty() && (svgNodeCloneNode = cloneNode(listFindNodesById.get(0))) != null) {
                    if (svgNodeCloneNode instanceof Symbol) {
                        ((Symbol) svgNodeCloneNode).isInUse = true;
                    }
                    ((Use) svgNode).children.add(svgNodeCloneNode);
                }
            } else if (svgNode instanceof SvgGroupNode) {
                replaceUseTagWithHrefLink(((SvgGroupNode) svgNode).children);
            }
        }
    }

    private void transform(SvgNode svgNode) {
        if (this.matrix != null) {
            svgNode.transform(this.matrix[0], this.matrix[1], this.matrix[2], this.matrix[3], this.matrix[4], this.matrix[5]);
        }
        if (this.viewBox != null) {
            svgNode.transform(1, 0, 0, 1, -this.viewBox[0], -this.viewBox[1]);
        }
    }

    @Override
    public boolean isValid() {
        return true;
    }

    public void parseEnd() {
        HashMap map = new HashMap();
        Iterator<Style> it = findAllStylesFromSvg().iterator();
        while (it.hasNext()) {
            map.putAll(it.next().toStyle());
        }
        replaceUseTagWithHrefLink(this.children);
        applyStyles((Map) null, map);
        transform(1.0f, 0, 0, 1.0f, 0, 0);
    }

    @Override
    public void transform(float f, float f2, float f3, float f4, float f5, float f6) {
        Iterator<SvgNode> it = this.children.iterator();
        while (it.hasNext()) {
            transform(it.next());
        }
    }
}
