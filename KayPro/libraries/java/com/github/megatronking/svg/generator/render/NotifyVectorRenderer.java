package com.github.megatronking.svg.generator.render;

public abstract class NotifyVectorRenderer<T> extends CountableVectorRenderer<T> {
    private VectorRendererListener mVectorRendererListener;

    public interface VectorRendererListener {
        void receiveResult(String str);
    }

    protected void notifyResult(String str) {
        if (this.mVectorRendererListener != null) {
            this.mVectorRendererListener.receiveResult(str);
        }
    }

    public void setVectorRendererListener(VectorRendererListener vectorRendererListener) {
        this.mVectorRendererListener = vectorRendererListener;
    }

    protected void writeNewLine() {
        notifyResult("");
    }
}
