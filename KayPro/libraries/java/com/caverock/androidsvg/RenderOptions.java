package com.caverock.androidsvg;

public class RenderOptions {

    CSSParser.Ruleset f4689css;
    PreserveAspectRatio preserveAspectRatio;
    String targetId;
    SVG.Box viewBox;
    String viewId;
    SVG.Box viewPort;

    public RenderOptions() {
        this.f4689css = (CSSParser.Ruleset) null;
        this.preserveAspectRatio = (PreserveAspectRatio) null;
        this.targetId = (String) null;
        this.viewBox = (SVG.Box) null;
        this.viewId = (String) null;
        this.viewPort = (SVG.Box) null;
    }

    public RenderOptions(RenderOptions renderOptions) {
        this.f4689css = (CSSParser.Ruleset) null;
        this.preserveAspectRatio = (PreserveAspectRatio) null;
        this.targetId = (String) null;
        this.viewBox = (SVG.Box) null;
        this.viewId = (String) null;
        this.viewPort = (SVG.Box) null;
        if (renderOptions == null) {
            return;
        }
        this.f4689css = renderOptions.f4689css;
        this.preserveAspectRatio = renderOptions.preserveAspectRatio;
        this.viewBox = renderOptions.viewBox;
        this.viewId = renderOptions.viewId;
        this.viewPort = renderOptions.viewPort;
    }

    public static RenderOptions create() {
        return new RenderOptions();
    }

    public RenderOptions m7051css(String str) {
        this.f4689css = new CSSParser(CSSParser.Source.RenderOptions).parse(str);
        return this;
    }

    public boolean hasCss() {
        return this.f4689css != null && this.f4689css.ruleCount() > 0;
    }

    public boolean hasPreserveAspectRatio() {
        return this.preserveAspectRatio != null;
    }

    public boolean hasTarget() {
        return this.targetId != null;
    }

    public boolean hasView() {
        return this.viewId != null;
    }

    public boolean hasViewBox() {
        return this.viewBox != null;
    }

    public boolean hasViewPort() {
        return this.viewPort != null;
    }

    public RenderOptions preserveAspectRatio(PreserveAspectRatio preserveAspectRatio) {
        this.preserveAspectRatio = preserveAspectRatio;
        return this;
    }

    public RenderOptions target(String str) {
        this.targetId = str;
        return this;
    }

    public RenderOptions view(String str) {
        this.viewId = str;
        return this;
    }

    public RenderOptions viewBox(float f, float f2, float f3, float f4) {
        this.viewBox = new SVG.Box(f, f2, f3, f4);
        return this;
    }

    public RenderOptions viewPort(float f, float f2, float f3, float f4) {
        this.viewPort = new SVG.Box(f, f2, f3, f4);
        return this;
    }
}
