package com.github.megatronking.svg.generator.svg.css;

public interface CSSParserCallback {
    void endRule();

    void handleImport(String str);

    void handleProperty(String str);

    void handleSelector(String str);

    void handleValue(String str);

    void startRule();
}
