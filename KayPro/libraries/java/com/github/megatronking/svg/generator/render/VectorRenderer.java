package com.github.megatronking.svg.generator.render;

import com.github.megatronking.svg.generator.vector.model.Group;
import com.github.megatronking.svg.generator.vector.model.Path;
import com.github.megatronking.svg.generator.vector.model.Vector;
import java.util.Iterator;

public class VectorRenderer implements IVectorRenderer<Vector>, NotifyVectorRenderer.VectorRendererListener {
    private VectorPathRenderer mPathRenderer;
    private StringBuilder mRenderResult;
    private VectorRootRenderer mRootRenderer = new VectorRootRenderer();

    public VectorRenderer() {
        this.mRootRenderer.setVectorRendererListener(this);
        this.mPathRenderer = new VectorPathRenderer();
        this.mPathRenderer.setVectorRendererListener(this);
        this.mRenderResult = new StringBuilder();
    }

    private void renderChild(Object obj) {
        if (obj instanceof Path) {
            this.mPathRenderer.render((Path) obj);
        } else if (obj instanceof Group) {
            Iterator<Object> it = ((Group) obj).children.iterator();
            while (it.hasNext()) {
                renderChild(it.next());
            }
        }
    }

    @Override
    public void receiveResult(String str) {
        this.mRenderResult.append(str);
    }

    public void render2(Vector vector) {
        this.mRootRenderer.render(vector);
        Iterator<Object> it = vector.children.iterator();
        while (it.hasNext()) {
            renderChild(it.next());
        }
    }

    @Override
    public void render(Vector vector) {
        render2(vector);
    }

    public String renderResult() {
        return this.mRenderResult.toString();
    }
}
