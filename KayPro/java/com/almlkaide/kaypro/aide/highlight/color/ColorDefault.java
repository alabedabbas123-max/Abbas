package com.almlkaide.kaypro.aide.highlight.color;

import android.support.annotation.Keep;
import com.almlkaide.kaypro.util.Utils;

@Keep
public class ColorDefault extends ColorImpl {
    public final Colors BACKGROUND;
    public final Colors COMMENT;
    public final Colors IDENTIFIER;
    public final Colors KEYWORD;
    public final Colors LINE_BACKGROUND;
    public final Colors LINE_NUMBER;
    public final Colors LITERAL;
    public final Colors NAMESPACE_IDENTIFIER;
    public final Colors OPERATOR;
    public final Colors PLAIN;
    public final Colors SELECTED_BACKGROUND;
    public final Colors SEPARATOR;
    public final Colors TYPE_IDENTIFIER;
    private Colors[] colors;

    @Override
    public Colors[] values() {
        return this.colors;
    }

    public ColorDefault() {
        this.BACKGROUND = new Colors("background", Utils.isCN() ? "背景颜色" : "Background", "#00FFFFFF", "#FF181818");
        this.PLAIN = new Colors("Plain", Utils.isCN() ? "文字颜色" : "Plain", "#FF000000", "#FFFFFFFF");
        this.KEYWORD = new Colors("Keyword", Utils.isCN() ? "关键词颜色" : "Keyword", "#FF0096FF", "#FFFF5252");
        this.IDENTIFIER = new Colors("Identifier", Utils.isCN() ? "标识符颜色" : "Identifier", "#FF000000", "#FFFFD740");
        this.LITERAL = new Colors("Literal", Utils.isCN() ? "字符串、数字、布尔值颜色" : "Literal", "#FFE91E63", "#FF8BC34A");
        this.OPERATOR = new Colors("Operator", Utils.isCN() ? "操作符颜色" : "Operator", "#FF03A9F4", "#FFEC407A");
        this.TYPE_IDENTIFIER = new Colors("Type Identifier", Utils.isCN() ? "类型标识符颜色" : "Type Identifier", "#FF0096FF", "#FF23BBFF");
        this.NAMESPACE_IDENTIFIER = new Colors("Namespace/Package Identifier", Utils.isCN() ? "包名颜色" : "Namespace/Package Identifier", "#FF818181", "#FFFFD740");
        this.SEPARATOR = new Colors("Separator/Punctuator", Utils.isCN() ? "括号、标点颜色" : "Separator/Punctuator", "#FF0096FF", "#FF4DD0E1");
        this.COMMENT = new Colors("Comment", Utils.isCN() ? "代码注释颜色" : "Comment", "#FF818181", "#FF00C853");
        this.LINE_NUMBER = new Colors("line number", Utils.isCN() ? "行号颜色" : "Line number", "#FFBDBDBD", "#FF23BBFF");
        this.LINE_BACKGROUND = new Colors("line background", Utils.isCN() ? "已选行背景颜色" : "Selested line background", "#10000000", "#15FFFFFF");
        this.SELECTED_BACKGROUND = new Colors("selected background", Utils.isCN() ? "已选文字背景颜色" : "Selected text background", "#FF2ABFFF", "#FF2E94C2");
        this.colors = new Colors[]{this.BACKGROUND, this.PLAIN, this.KEYWORD, this.IDENTIFIER, this.LITERAL, this.OPERATOR, this.TYPE_IDENTIFIER, this.NAMESPACE_IDENTIFIER, this.SEPARATOR, this.COMMENT, this.LINE_NUMBER, this.LINE_BACKGROUND, this.SELECTED_BACKGROUND};
    }
}
