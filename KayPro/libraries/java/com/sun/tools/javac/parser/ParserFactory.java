package com.sun.tools.javac.parser;

import com.sun.tools.javac.code.Source;
import com.sun.tools.javac.tree.TreeMaker;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.Names;
import com.sun.tools.javac.util.Options;

public class ParserFactory {
    protected static final Context.C0723Key<ParserFactory> parserFactoryKey = new Context.C0723Key<>();

    final TreeMaker f482F;
    final Keywords keywords;

    final Log f483log;
    final Names names;
    final Options options;
    final ScannerFactory scannerFactory;
    final Source source;

    public static ParserFactory instance(Context context) {
        ParserFactory instance = (ParserFactory) context.m501get(parserFactoryKey);
        if (instance == null) {
            return new ParserFactory(context);
        }
        return instance;
    }

    protected ParserFactory(Context context) {
        context.m504put(parserFactoryKey, this);
        this.f482F = TreeMaker.instance(context);
        this.f483log = Log.instance(context);
        this.names = Names.instance(context);
        this.keywords = Keywords.instance(context);
        this.source = Source.instance(context);
        this.options = Options.instance(context);
        this.scannerFactory = ScannerFactory.instance(context);
    }

    public Parser newParser(CharSequence input, boolean keepDocComments, boolean keepEndPos, boolean keepLineMap) {
        Lexer lexer = this.scannerFactory.newScanner(input, keepDocComments);
        if (keepEndPos) {
            return new EndPosParser(this, lexer, keepDocComments, keepLineMap);
        }
        return new JavacParser(this, lexer, keepDocComments, keepLineMap);
    }
}
