package com.github.megatronking.svg.generator.svg.model;

public class Path extends SvgNode {

    public String f4792d;

    @Override
    public void toPath() {
        this.pathData = this.f4792d == null ? (String) null : this.f4792d.replaceAll("(\\d)-", "$1,-");
    }
}
