package com.github.megatronking.svg.generator.render;

import com.github.megatronking.svg.generator.vector.model.Group;
import com.github.megatronking.svg.generator.vector.model.Path;
import com.github.megatronking.svg.generator.vector.model.Vector;
import java.util.List;
import org.apache.commons.io.IOUtils;

public class VectorRootRenderer extends NotifyVectorRenderer<Vector> {
    private boolean hasPathNeedMinScale(List<Object> list) {
        if (list != null && !list.isEmpty()) {
            for (Object obj : list) {
                if (obj instanceof Path) {
                    if (((Path) obj).strokeColor != 0) {
                        return true;
                    }
                } else if (hasPathNeedMinScale(((Group) obj).children)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    protected void notifyResult(String str) {
        super.notifyResult(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("    ").append("    ").toString()).append(str).toString()).append(IOUtils.LINE_SEPARATOR_UNIX).toString());
    }

    public void render(Vector vector) {
        notifyResult(new StringBuffer().append(new StringBuffer().append("final float scaleX = w / ").append(vector.viewportWidth).toString()).append("f;").toString());
        notifyResult(new StringBuffer().append(new StringBuffer().append("final float scaleY = h / ").append(vector.viewportHeight).toString()).append("f;").toString());
        if (hasPathNeedMinScale(vector.children)) {
            notifyResult("final float minScale = Math.min(scaleX, scaleY);");
        }
        writeNewLine();
    }

    @Override
    public void render(Object obj) {
        render((Vector) obj);
    }
}
