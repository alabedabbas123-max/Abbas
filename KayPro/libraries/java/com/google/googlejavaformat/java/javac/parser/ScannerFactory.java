package com.google.googlejavaformat.java.javac.parser;

import com.sun.tools.javac.code.Source;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.Names;
import java.nio.CharBuffer;

public class ScannerFactory {
    public static final Context.C0723Key<ScannerFactory> scannerFactoryKey = new Context.C0723Key<>();

    final Log f284log;
    final Names names;
    final Source source;
    final Tokens tokens;

    protected ScannerFactory(Context context) {
        context.m504put(scannerFactoryKey, this);
        this.f284log = Log.instance(context);
        this.names = Names.instance(context);
        this.source = Source.instance(context);
        this.tokens = Tokens.instance(context);
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
                return new Scanner(this, new JavadocTokenizer(this, buf));
            }
            return new Scanner(this, buf);
        }
        char[] array = input.toString().toCharArray();
        return newScanner(array, array.length, keepDocComments);
    }

    public Scanner newScanner(char[] input, int inputLength, boolean keepDocComments) {
        if (keepDocComments) {
            return new Scanner(this, new JavadocTokenizer(this, input, inputLength));
        }
        return new Scanner(this, input, inputLength);
    }
}
