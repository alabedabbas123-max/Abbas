package com.caverock.androidsvg;

public class PreserveAspectRatio {
    private Alignment alignment;
    private Scale scale;

    @SuppressWarnings("unused")
    public static final PreserveAspectRatio UNSCALED = new PreserveAspectRatio((Alignment) null, (Scale) null);

    @SuppressWarnings("WeakerAccess")
    public static final PreserveAspectRatio STRETCH = new PreserveAspectRatio(Alignment.none, (Scale) null);

    @SuppressWarnings("WeakerAccess")
    public static final PreserveAspectRatio LETTERBOX = new PreserveAspectRatio(Alignment.xMidYMid, Scale.meet);

    @SuppressWarnings("unused")
    public static final PreserveAspectRatio START = new PreserveAspectRatio(Alignment.xMinYMin, Scale.meet);

    @SuppressWarnings("unused")
    public static final PreserveAspectRatio f4687END = new PreserveAspectRatio(Alignment.xMaxYMax, Scale.meet);

    @SuppressWarnings("unused")
    public static final PreserveAspectRatio f4688TOP = new PreserveAspectRatio(Alignment.xMidYMin, Scale.meet);

    @SuppressWarnings("unused")
    public static final PreserveAspectRatio BOTTOM = new PreserveAspectRatio(Alignment.xMidYMax, Scale.meet);

    @SuppressWarnings("unused")
    public static final PreserveAspectRatio FULLSCREEN = new PreserveAspectRatio(Alignment.xMidYMid, Scale.slice);

    @SuppressWarnings("unused")
    public static final PreserveAspectRatio FULLSCREEN_START = new PreserveAspectRatio(Alignment.xMinYMin, Scale.slice);

    public enum Alignment {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax;

        public static Alignment valueOf(String str) {
            for (Alignment alignment : values()) {
                if (alignment.name().equals(str)) {
                    return alignment;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    public enum Scale {
        meet,
        slice;

        public static Scale valueOf(String str) {
            for (Scale scale : values()) {
                if (scale.name().equals(str)) {
                    return scale;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    PreserveAspectRatio(Alignment alignment, Scale scale) {
        this.alignment = alignment;
        this.scale = scale;
    }

    public static PreserveAspectRatio m7050of(String str) {
        try {
            return SVGParser.parsePreserveAspectRatio(str);
        } catch (SVGParseException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PreserveAspectRatio preserveAspectRatio = (PreserveAspectRatio) obj;
            if (this.alignment != preserveAspectRatio.alignment || this.scale != preserveAspectRatio.scale) {
                return false;
            }
        }
        return true;
    }

    @SuppressWarnings("WeakerAccess")
    public Alignment getAlignment() {
        return this.alignment;
    }

    @SuppressWarnings("WeakerAccess")
    public Scale getScale() {
        return this.scale;
    }

    public String toString() {
        return new StringBuffer().append(new StringBuffer().append(this.alignment).append(" ").toString()).append(this.scale).toString();
    }
}
