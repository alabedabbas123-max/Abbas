package com.google.googlejavaformat.java;

public class JavaFormatterOptions {
    static int DEFAULT_MAX_LINE_LENGTH = 666;
    private final Style style;

    private JavaFormatterOptions(Style style) {
        this.style = style;
    }

    public static JavaFormatterOptions defaultOptions() {
        return builder().build();
    }

    public static Builder builder() {
        return new Builder();
    }

    public int maxLineLength() {
        return 666;
    }

    public int indentationMultiplier() {
        return this.style.indentationMultiplier();
    }

    public enum Style {
        GOOGLE(2),
        AOSP(2);

        private final int indentationMultiplier;

        Style(int indentationMultiplier) {
            this.indentationMultiplier = indentationMultiplier;
        }

        int indentationMultiplier() {
            return this.indentationMultiplier;
        }
    }

    public static class Builder {
        private Style style;

        private Builder() {
            this.style = Style.GOOGLE;
        }

        public Builder style(Style style) {
            this.style = style;
            return this;
        }

        public JavaFormatterOptions build() {
            return new JavaFormatterOptions(this.style);
        }
    }
}
