package com.myopicmobile.textwarrior.common;

import org.objectweb.asm.signature.SignatureVisitor;

public class LanguageLua extends Language {
    private static final String extFunctionTarget = "activity|call|compile|dump|each|enum|import|loadbitmap|loadlayout|loadmenu|set|task|thread|timer";
    private static final String globalTarget = "__add|__band|__bnot|__bor|__bxor|__call|__concat|__div|__eq|__idiv|__index|__le|__len|__lt|__mod|__mul|__newindex|__pow|__shl|__shr|__sub|__unm|_ENV|_G|assert|collectgarbage|dofile|error|findtable|getmetatable|ipairs|load|loadfile|loadstring|module|next|pairs|pcall|print|rawequal|rawget|rawlen|rawset|require|select|self|setmetatable|tointeger|tonumber|tostring|type|unpack|xpcall";
    private static final String packageName = "coroutine|debug|io|luajava|math|os|package|string|table|utf8";
    private static final String package_coroutine = "create|isyieldable|resume|running|status|wrap|yield";
    private static final String package_debug = "debug|gethook|getinfo|getlocal|getmetatable|getregistry|getupvalue|getuservalue|sethook|setlocal|setmetatable|setupvalue|setuservalue|traceback|upvalueid|upvaluejoin";
    private static final String package_io = "close|flush|input|lines|open|output|popen|read|stderr|stdin|stdout|tmpfile|type|write";
    private static final String package_luajava = "astable|bindClass|clear|coding|createArray|createProxy|instanceof|loadLib|loaded|luapath|new|newInstance|package|tostring";
    private static final String package_math = "abs|acos|asin|atan|atan2|ceil|cos|cosh|deg|exp|floor|fmod|frexp|huge|ldexp|log|log10|max|maxinteger|min|mininteger|modf|pi|pow|rad|random|randomseed|sin|sinh|sqrt|tan|tanh|tointeger|type|ult";
    private static final String package_os = "clock|date|difftime|execute|exit|getenv|remove|rename|setlocale|time|tmpname";
    private static final String package_package = "config|cpath|loaded|loaders|loadlib|path|preload|searchers|searchpath|seeall";
    private static final String package_string = "byte|char|dump|find|format|gfind|gmatch|gsub|len|lower|match|pack|packsize|rep|reverse|sub|unpack|upper";
    private static final String package_table = "concat|foreach|foreachi|insert|maxn|move|pack|remove|sort|unpack";
    private static final String package_utf8 = "char|charpattern|codepoint|codes|len|offset";
    private static Language _theOne = (Language) null;
    private static final String keywordTarget = "and|break|do|else|elseif|end|false|for|function|goto|if|in|local|nil|not|or|repeat|return|then|true|until|while";
    private static final String[] keywords = keywordTarget.split("\\|");
    private static final String functionTarget = "__add|__band|__bnot|__bor|__bxor|__call|__concat|__div|__eq|__idiv|__index|__le|__len|__lt|__mod|__mul|__newindex|__pow|__shl|__shr|__sub|__unm|_ENV|_G|assert|collectgarbage|dofile|error|findtable|getmetatable|ipairs|load|loadfile|loadstring|module|next|pairs|pcall|print|rawequal|rawget|rawlen|rawset|require|select|self|setmetatable|tointeger|tonumber|tostring|type|unpack|xpcall|activity|call|compile|dump|each|enum|import|loadbitmap|loadlayout|loadmenu|set|task|thread|timer|coroutine|debug|io|luajava|math|os|package|string|table|utf8";
    private static final String[] names = functionTarget.split("\\|");
    private static final char[] LUA_OPERATORS = {'(', ')', '{', '}', ',', ';', SignatureVisitor.INSTANCEOF, SignatureVisitor.EXTENDS, SignatureVisitor.SUPER, '/', '*', '&', '!', '|', ':', '[', ']', '<', '>', '?', '~', '%', '^'};

    LanguageLua() {
        super.setOperators(LUA_OPERATORS);
        super.setKeywords(keywords);
        super.setNames(names);
        super.addBasePackage("io", package_io.split("\\|"));
        super.addBasePackage("string", package_string.split("\\|"));
        super.addBasePackage("luajava", package_luajava.split("\\|"));
        super.addBasePackage("os", package_os.split("\\|"));
        super.addBasePackage("table", package_table.split("\\|"));
        super.addBasePackage("math", package_math.split("\\|"));
        super.addBasePackage("utf8", package_utf8.split("\\|"));
        super.addBasePackage("coroutine", package_coroutine.split("\\|"));
        super.addBasePackage("package", package_package.split("\\|"));
        super.addBasePackage("debug", package_debug.split("\\|"));
    }

    public static Language getInstance() {
        if (_theOne == null) {
            _theOne = new LanguageLua();
        }
        return _theOne;
    }

    @Override
    public boolean isLineAStart(char c) {
        return false;
    }

    @Override
    public boolean isLineStart(char c, char c2) {
        return c == '-' && c2 == '-';
    }

    @Override
    public boolean isMultilineEndDelimiter(char c, char c2) {
        return c == ']' && c2 == ']';
    }

    @Override
    public boolean isMultilineStartDelimiter(char c, char c2) {
        return c == '[' && c2 == '[';
    }

    public boolean isWordStart2(char c) {
        return c == '.';
    }
}
