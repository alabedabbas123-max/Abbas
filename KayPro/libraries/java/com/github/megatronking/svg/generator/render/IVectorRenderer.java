package com.github.megatronking.svg.generator.render;

public interface IVectorRenderer<T> {
    public static final String HEAD_SPACE = "    ";

    void render(T t);
}
