package com.sun.tools.javac.parser;

import com.sun.tools.javac.code.Source;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.Names;
import java.nio.CharBuffer;

public class ScannerFactory {
    public static final Context.C0723Key<ScannerFactory> scannerFactoryKey = new Context.C0723Key<>();
    public final Keywords keywords;

    public final Log f490log;
    public final Names names;
    public final Source source;

    protected ScannerFactory(Context context) {
        context.m504put(scannerFactoryKey, this);
        this.f490log = Log.instance(context);
        this.names = Names.instance(context);
        this.source = Source.instance(context);
        this.keywords = Keywords.instance(context);
    }

    public static ScannerFactory instance(Context context) {
        ScannerFactory instance = (ScannerFactory) context.m501get(scannerFactoryKey);
        if (instance == null) {
            return new ScannerFactory(context);
        }
        return instance;
    }

    public Scanner newScanner(CharSequence input, boolean keepDocComments) {
        if (input instanceof CharBuffer) {
            CharBuffer buf = (CharBuffer) input;
            if (keepDocComments) {
                return new DocCommentScanner(this, buf);
            }
            return new Scanner(this, buf);
        }
        char[] array = input.toString().toCharArray();
        return newScanner(array, array.length, keepDocComments);
    }

    public Scanner newScanner(char[] input, int inputLength, boolean keepDocComments) {
        if (keepDocComments) {
            return new DocCommentScanner(this, input, inputLength);
        }
        return new Scanner(this, input, inputLength);
    }
}
