package com.myopicmobile.textwarrior.common;

import com.almlkaide.kaypro.android.dx.cf.code.ByteOps;
import java.io.IOException;
import java.io.Reader;

public class LuaLexer {
    public static final int XLONGCOMMENT = 8;
    public static final int XLONGSTRING = 2;
    public static final int XLONGSTRING_BEGIN = 4;
    public static final int XSHORTCOMMENT = 6;
    public static final int XSTRINGA = 12;
    public static final int XSTRINGQ = 10;
    public static final int YYEOF = -1;
    public static final int YYINITIAL = 0;
    private static final String ZZ_ACTION_PACKED_0 = "\u0007\u0000\u0001\u0001\u0001\u0002\u0002\u0003\u0001\u0004\u0001\u0005\u0001\u0006\u0001\u0007\u0001\u0006\u0001\b\u0001\t\u0001\n\r\u0005\u0001\u000b\u0001\f\u0001\r\u0001\u000e\u0001\u000f\u0001\u0001\u0001\u0010\u0001\u0011\u0001\u0012\u0001\u0013\u0001\u0014\u0001\u0015\u0001\u0016\u0001\u0017\u0001\u0018\u0001\u0019\u0001\u001a\u0001\u001b\u0003\u001c\u0001\u001d\u0002\u001e\u0001\u001f\u0002 \u0003!\u0001\"\u0002#\u0001$\u0001\"\u0002%\u0001$\u0001\"\u0001&\u0002\u0000\u0001\u0006\u0001\u0000\u0001\u0006\u0001'\u0001(\u0001)\u0003\u0005\u0001*\u0004\u0005\u0001+\u0001\u0005\u0001,\u0001-\u0007\u0005\u0001.\u0001/\u00010\u00011\u0001\u0000\u00012\u0001\u0000\u00013\u0001\u0000\u0002\u0006\u00014\u0001\u0000\u0001)\u00015\u00016\u00017\u0003\u0005\u00018\u0003\u0005\u00019\u0005\u0005\u0001:\u0001\u0000\u0002;\u0003\u0005\u0001<\u0004\u0005\u0001=\u0001>\u0001\u0005\u0002\u0000\u0001?\u0003\u0005\u0001@\u0001A\u0001\u0005\u0001B\u0001C\u0001\u0000\u0001D\u0001E\u0001F\u0001\u0005\u0001\u0000\u0001\u0005\u0001G";
    private static final String ZZ_ATTRIBUTE_PACKED_0 = "\u0007\u0000\u0001\t\u0001\u0001\u0001\t\u0004\u0001\u0001\t\u0011\u0001\u0002\t\u0004\u0001\r\t\u0002\u0001\u0002\t\u0001\u0001\u0002\t\u0001\u0001\u0001\t\u0002\u0001\u0002\t\u0003\u0001\u0001\t\u0003\u0001\u0001\t\u0002\u0000\u0001\u0001\u0001\u0000\u0002\u0001\u0001\t\u0014\u0001\u0004\t\u0001\u0000\u0001\t\u0001\u0000\u0001\t\u0001\u0000\u0002\u0001\u0001\t\u0001\u0000\u0011\u0001\u0001\t\u0001\u0000\r\u0001\u0002\u0000\t\u0001\u0001\u0000\u0004\u0001\u0001\u0000\u0002\u0001";
    private static final int ZZ_BUFFERSIZE = 16384;
    private static final int ZZ_NO_MATCH = 1;
    private static final int ZZ_PUSHBACK_2BIG = 2;
    private static final String ZZ_ROWMAP_PACKED_0 = "\u0000\u0000\u00007\u0000n\u0000¥\u0000Ü\u0000ē\u0000Ŋ\u0000Ɓ\u0000Ƹ\u0000Ɓ\u0000ǯ\u0000Ȧ\u0000ɝ\u0000ʔ\u0000Ɓ\u0000ˋ\u0000̂\u0000̹\u0000Ͱ\u0000Χ\u0000Ϟ\u0000Е\u0000ь\u0000҃\u0000Һ\u0000ӱ\u0000Ԩ\u0000՟\u0000֖\u0000\u05cd\u0000\u0604\u0000ػ\u0000Ɓ\u0000Ɓ\u0000ٲ\u0000ک\u0000۠\u0000ܗ\u0000Ɓ\u0000Ɓ\u0000Ɓ\u0000Ɓ\u0000Ɓ\u0000Ɓ\u0000Ɓ\u0000Ɓ\u0000Ɓ\u0000Ɓ\u0000Ɓ\u0000Ɓ\u0000Ɓ\u0000ݎ\u0000ޅ\u0000Ɓ\u0000Ɓ\u0000\u07bc\u0000Ɓ\u0000Ɓ\u0000߳\u0000Ɓ\u0000ࠪ\u0000ࡡ\u0000Ɓ\u0000Ɓ\u0000࢘\u0000࣏\u0000आ\u0000Ɓ\u0000ऽ\u0000ॴ\u0000ফ\u0000Ɓ\u0000Ȧ\u0000ৢ\u0000ਙ\u0000\u0a50\u0000ઇ\u0000ા\u0000Ɓ\u0000\u0af5\u0000ବ\u0000ୣ\u0000ச\u0000ɝ\u0000\u0bd1\u0000ఈ\u0000ి\u0000\u0c76\u0000ɝ\u0000ಭ\u0000ɝ\u0000ɝ\u0000\u0ce4\u0000ഛ\u0000\u0d52\u0000ඉ\u0000ව\u0000\u0df7\u0000ฮ\u0000Ɓ\u0000Ɓ\u0000Ɓ\u0000Ɓ\u0000ޅ\u0000Ɓ\u0000ࡡ\u0000Ɓ\u0000ઇ\u0000\u0e65\u0000\u0a50\u0000Ɓ\u0000ຜ\u0000໓\u0000ɝ\u0000ɝ\u0000ɝ\u0000༊\u0000ཁ\u0000ླྀ\u0000ɝ\u0000ྯ\u0000\u0fe6\u0000ဝ\u0000ɝ\u0000ၔ\u0000ႋ\u0000Ⴢ\u0000ჹ\u0000ᄰ\u0000Ɓ\u0000ᅧ\u0000ᆞ\u0000ᇕ\u0000ሌ\u0000ቃ\u0000ቺ\u0000\u12b1\u0000የ\u0000ጟ\u0000ፖ\u0000ᎍ\u0000ɝ\u0000ɝ\u0000Ꮔ\u0000ᆞ\u0000ᏻ\u0000ɝ\u0000ᐲ\u0000ᑩ\u0000ᒠ\u0000ɝ\u0000ɝ\u0000ᓗ\u0000ɝ\u0000ɝ\u0000ᔎ\u0000ɝ\u0000ɝ\u0000ɝ\u0000ᕅ\u0000ᕼ\u0000ᖳ\u0000ɝ";
    private static final String ZZ_TRANS_PACKED_0 = "\u0001\b\u0001\t\u0001\n\u0001\u000b\u0001\f\u0001\r\u0001\u000e\u0001\r\u0001\u000f\u0001\u0010\u0002\r\u0001\u0011\u0001\u0012\u0001\u0013\u0001\u0014\u0001\u0015\u0001\u0016\u0001\u0017\u0001\u0018\u0001\u0019\u0001\r\u0001\u001a\u0001\u001b\u0001\r\u0001\u001c\u0001\u001d\u0001\u001e\u0001\r\u0001\u001f\u0002\r\u0001 \u0001!\u0001\"\u0001#\u0001\b\u0001$\u0001%\u0001&\u0001'\u0001(\u0001)\u0001*\u0001+\u0001,\u0001-\u0001.\u0001/\u00010\u00011\u00012\u0001\b\u0001\r\u0001\u0000\u00033\u00014)3\u00015\b3\u0001\u0000\u00026\u00017\u0001826\u0001\u0000\u00029\u0001:\u0001;29\u0001\u0000\u0003<\u0001=)<\u0001>\b<\u0001\u0000\u0002?\u0001@\u0001A\u001d?\u0001B\u0012?\u0001C\u0001?\u0001\u0000\u0002?\u0001D\u0001E\u001e?\u0001F\u0011?\u0001G\u0001?9\u0000\u0001\t7\u0000\u0001\n8\u0000\u0001H\b\u0000\u0001I.\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0012\r\u0014\u0000\u0001\r\u0007\u0000\u0001\u000e\u0001J\u0001\u0000\u0001\u000e\u0002\u0000\u0001K\u0007\u0000\u0001J(\u0000\u0001\u000e\u0001J\u0001\u0000\u0001\u000e\u0001L\u0001\u0000\u0001K\u0007\u0000\u0001J(\u0000\u0001M\u0002\u0000\u0001M\u0002\u0000\u0001N7\u0000\u0001O7\u0000\u0001P-\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0001\r\u0001Q\u0010\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0007\r\u0001R\u0002\r\u0001S\u0007\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0007\r\u0001T\n\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0004\r\u0001U\r\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0005\r\u0001V\f\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0001\r\u0001W\u0006\r\u0001X\t\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0004\r\u0001Y\r\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0007\r\u0001Z\n\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0001\r\u0001[\t\r\u0001\\\u0006\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0001]\u0006\r\u0001^\u0004\r\u0001_\u0005\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0001\r\u0001`\u0010\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0004\r\u0001a\u000b\r\u0001b\u0001\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0010\r\u0001c\u0001\r\u0014\u0000\u0001\r%\u0000\u0001d\u001f\u0000\u0001e6\u0000\u0001f6\u0000\u0001g+\u0000\u00013A\u0000\u0001h\u001f\u0000\u0001i\u000b\u0000\u000176\u0000\u0001:6\u0000\u0001<A\u0000\u0001j\u001f\u0000\u0001k\u000b\u0000\u0001@U\u0000\u0001?\u0017\u0000\u0001?\u0001\u0000\u0001?\n\u0000\u0002?\u0001\u0000\u0002?\u0006\u0000\u0001?\u0002\u0000\u0001?\u0003\u0000\u0002?\n\u0000\u0001?\u0006\u0000\u0002?\u0003\u0000\u0001DV\u0000\u0001?\u0016\u0000\u0001?\u0001\u0000\u0001?\n\u0000\u0002?\u0001\u0000\u0002?\u0006\u0000\u0001?\u0002\u0000\u0001?\u0004\u0000\u0001?\n\u0000\u0001?\u0006\u0000\u0002?\u0007\u0000\u0001M\u0001\u0000\u0001l\u0001M\u0004\u0000\u0001l.\u0000\u0001m\u0002\u0000\u0001m3\u0000\u0002n\u0001\u0000\u0001n\u0001\u0000\u0001n\u0003\u0000\u0001n\u0001\u0000\u0002n\u0001\u0000\u0001n\u0005\u0000\u0001n\u0001\u0000\u0001n \u0000\u0001M\u0002\u0000\u0001M9\u0000\u0001o.\u0000\u0001p\t\u0000\u0001q-\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0002\r\u0001r\u000f\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u000e\r\u0001s\u0003\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\b\r\u0001t\t\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0005\r\u0001u\f\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u000e\r\u0001v\u0001w\u0002\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0002\r\u0001x\u000f\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\t\r\u0001y\b\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\r\r\u0001z\u0004\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\b\r\u0001{\t\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0004\r\u0001|\r\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0001\r\u0001}\u0010\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u000e\r\u0001~\u0003\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\f\r\u0001\u007f\u0005\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0005\r\u0001\u0080\f\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\n\r\u0001\u0081\u0007\r\u0014\u0000\u0001\r\u0007\u0000\u0001m\u0001J\u0001\u0000\u0001m\n\u0000\u0001J&\u0000\u0001\u0082\b\u0000\u0001p)\u0000\u0002\u0083\u0001\u0084\u0001\u0085\n\u0083\u0001q(\u0083\u0005\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0001\u0086\u0011\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\f\r\u0001\u0087\u0005\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0005\r\u0001\u0088\f\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0005\r\u0001\u0089\f\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0001\u008a\u0011\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\t\r\u0001\u008b\b\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\r\r\u0001\u008c\u0004\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\n\r\u0001\u008d\u0007\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0005\r\u0001\u008e\f\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0001\r\u0001\u008f\u0010\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\b\r\u0001\u0090\t\r\u0014\u0000\u0001\r\u0001\u0000\u0002\u0083\u0001\u0084\u0001\u00853\u0083\u0001\u0000\u0001\u0091\f\u0000\u0001\u0092)\u0000\u0001\u0091\u0001\u0084\u000b\u0000\u0001\u0092-\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0006\r\u0001\u0093\u000b\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0004\r\u0001\u0094\r\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0001\u0095\u0011\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\n\r\u0001\u0096\u0007\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\b\r\u0001\u0097\t\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0005\r\u0001\u0098\f\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u000e\r\u0001\u0099\u0003\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\b\r\u0001\u009a\t\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0005\r\u0001\u009b\f\r\u0014\u0000\u0001\r\u000f\u0000\u0001\u009c-\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0001\r\u0001\u009d\u0010\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u000e\r\u0001\u009e\u0003\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u000b\r\u0001\u009f\u0006\r\u0014\u0000\u0001\r\u0006\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\n\r\u0001 \u0007\r\u0014\u0000\u0001\r\u0001\u0000\u0002\u0083\u0001\u0084\u0001\u0085\u0001¡2\u0083\u0005\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0007\r\u0001¢\n\r\u0014\u0000\u0001\r\u0003\u0000\u0001\u0084\u0001\u00858\u0000\u0003\r\u0001\u0000\u0003\r\u0003\u0000\u0001\r\u0001£\u0010\r\u0014\u0000\u0001\r\u0001\u0000";
    private static final int ZZ_UNKNOWN_ERROR = 0;
    ExtendedSyntaxStrCommentHandler longCommentOrStringHandler;
    private int yychar;
    private int yycolumn;
    private int yyline;
    private boolean zzAtBOL;
    private boolean zzAtEOF;
    private char[] zzBuffer;
    private int zzCurrentPos;
    private boolean zzEOFDone;
    private int zzEndRead;
    private int zzFinalHighSurrogate;
    private int zzLexicalState;
    private int zzMarkedPos;
    private Reader zzReader;
    private int zzStartRead;
    private int zzState;
    private static final int[] ZZ_LEXSTATE = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6};
    private static final String ZZ_CMAP_PACKED = "\t\u0000\u0001\u0001\u0001\u0002\u00016\u00016\u0001\u0003\u0012\u0000\u0001\u0001\u0001$\u0001!\u0001#\u0001\u0000\u0001)\u0001\u0000\u0001\"\u0001+\u0001,\u0001(\u0001\b\u00010\u0001\u000e\u0001\f\u0001*\u0001\t\t\u0006\u00012\u00011\u0001&\u0001\r\u0001%\u0002\u0000\u0004\u000b\u0001\u0007\u0001\u000b\u0011\u0005\u0001\n\u0002\u0005\u0001\u0004\u00014\u0001-\u00013\u0001\u0005\u0001\u0000\u0001\u000f\u0001\u0012\u0001\u001c\u0001\u0011\u0001\u0014\u0001\u001a\u0001\u0005\u0001\u001f\u0001\u0019\u0001\u0005\u0001\u0015\u0001\u0017\u0001\u0005\u0001\u0010\u0001\u0016\u0001\u001e\u0001\u0005\u0001\u0013\u0001\u0018\u0001\u001d\u0001\u001b\u00015\u0001 \u0001\n\u0002\u0005\u0001.\u0001\u0000\u0001/\u0001'\u0006\u0000\u00016ᾢ\u0000\u00016\u00016\uffff\u0000\uffff\u0000\uffff\u0000\uffff\u0000\uffff\u0000\uffff\u0000\uffff\u0000\uffff\u0000\uffff\u0000\uffff\u0000\uffff\u0000\uffff\u0000\uffff\u0000\uffff\u0000\uffff\u0000\uffff\u0000\udfe6\u0000";
    private static final char[] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);
    private static final int[] ZZ_ACTION = zzUnpackAction();
    private static final int[] ZZ_ROWMAP = zzUnpackRowMap();
    private static final int[] ZZ_TRANS = zzUnpackTrans();
    private static final String[] ZZ_ERROR_MSG = {"Unknown internal scanner error", "Error: could not match input", "Error: pushback value was too large"};
    private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();

    static class CharSeqReader extends Reader {
        int offset = 0;

        CharSequence f4833src;

        CharSeqReader(CharSequence charSequence) {
            this.f4833src = charSequence;
        }

        @Override
        public void close() throws IOException {
            this.f4833src = (CharSequence) null;
            this.offset = 0;
        }

        @Override
        public int read(char[] cArr, int i, int i2) throws IOException {
            int iMin = Math.min(this.f4833src.length() - this.offset, i2);
            int i3 = 0;
            while (i3 < iMin) {
                CharSequence charSequence = this.f4833src;
                int i4 = this.offset;
                this.offset = i4 + 1;
                cArr[i] = charSequence.charAt(i4);
                i3++;
                i++;
            }
            if (iMin <= 0) {
                return -1;
            }
            return iMin;
        }
    }

    static class ExtendedSyntaxStrCommentHandler {
        int longQLevel = 0;

        private static int getLevel(CharSequence charSequence) {
            int i = 0;
            int i2 = 0;
            while (charSequence.charAt(i2) == '-') {
                i2++;
            }
            while (charSequence.length() > i2 + i && charSequence.charAt(i2 + 1 + i) == '=') {
                i++;
            }
            return i;
        }

        boolean isCurrentExtQuoteStart(CharSequence charSequence) {
            return this.longQLevel == getLevel(charSequence);
        }

        void resetCurrentExtQuoteStart() {
            this.longQLevel = 0;
        }

        void setCurrentExtQuoteStart(CharSequence charSequence) {
            this.longQLevel = getLevel(charSequence);
        }
    }

    public LuaLexer(Reader reader) {
        this.zzLexicalState = 0;
        this.zzBuffer = new char[16384];
        this.zzAtBOL = true;
        this.zzFinalHighSurrogate = 0;
        this.longCommentOrStringHandler = new ExtendedSyntaxStrCommentHandler();
        this.zzReader = reader;
    }

    public LuaLexer(CharSequence charSequence) {
        this.zzLexicalState = 0;
        this.zzBuffer = new char[16384];
        this.zzAtBOL = true;
        this.zzFinalHighSurrogate = 0;
        this.longCommentOrStringHandler = new ExtendedSyntaxStrCommentHandler();
        this.zzReader = new CharSeqReader(charSequence);
    }

    private void zzDoEOF() {
        if (this.zzEOFDone) {
            return;
        }
        this.zzEOFDone = true;
    }

    private boolean zzRefill() throws IOException {
        if (this.zzStartRead > 0) {
            this.zzEndRead += this.zzFinalHighSurrogate;
            this.zzFinalHighSurrogate = 0;
            System.arraycopy(this.zzBuffer, this.zzStartRead, this.zzBuffer, 0, this.zzEndRead - this.zzStartRead);
            this.zzEndRead -= this.zzStartRead;
            this.zzCurrentPos -= this.zzStartRead;
            this.zzMarkedPos -= this.zzStartRead;
            this.zzStartRead = 0;
        }
        if (this.zzCurrentPos >= this.zzBuffer.length - this.zzFinalHighSurrogate) {
            char[] cArr = new char[this.zzBuffer.length * 2];
            System.arraycopy(this.zzBuffer, 0, cArr, 0, this.zzBuffer.length);
            this.zzBuffer = cArr;
            this.zzEndRead += this.zzFinalHighSurrogate;
            this.zzFinalHighSurrogate = 0;
        }
        int length = this.zzBuffer.length - this.zzEndRead;
        int i = this.zzReader.read(this.zzBuffer, this.zzEndRead, length);
        if (i == 0) {
            throw new IOException("Reader returned 0 characters. See JFlex examples for workaround.");
        }
        if (i <= 0) {
            return true;
        }
        this.zzEndRead += i;
        if (i != length || !Character.isHighSurrogate(this.zzBuffer[this.zzEndRead - 1])) {
            return false;
        }
        this.zzEndRead--;
        this.zzFinalHighSurrogate = 1;
        return false;
    }

    private void zzScanError(int i) {
        String str;
        try {
            str = ZZ_ERROR_MSG[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            str = ZZ_ERROR_MSG[0];
        }
        throw new Error(str);
    }

    private static int zzUnpackAction(String str, int i, int[] iArr) {
        int i2;
        int i3 = 0;
        int length = str.length();
        int i4 = i;
        while (i3 < length) {
            int i5 = i3 + 1;
            int iCharAt = str.charAt(i3);
            int i6 = i5 + 1;
            char cCharAt = str.charAt(i5);
            while (true) {
                i2 = i4 + 1;
                iArr[i4] = cCharAt;
                iCharAt--;
                if (iCharAt <= 0) {
                    break;
                }
                i4 = i2;
            }
            i4 = i2;
            i3 = i6;
        }
        return i4;
    }

    private static int[] zzUnpackAction() {
        int[] iArr = new int[163];
        zzUnpackAction(ZZ_ACTION_PACKED_0, 0, iArr);
        return iArr;
    }

    private static int zzUnpackAttribute(String str, int i, int[] iArr) {
        int i2;
        int i3 = 0;
        int length = str.length();
        int i4 = i;
        while (i3 < length) {
            int i5 = i3 + 1;
            int iCharAt = str.charAt(i3);
            int i6 = i5 + 1;
            char cCharAt = str.charAt(i5);
            while (true) {
                i2 = i4 + 1;
                iArr[i4] = cCharAt;
                iCharAt--;
                if (iCharAt <= 0) {
                    break;
                }
                i4 = i2;
            }
            i4 = i2;
            i3 = i6;
        }
        return i4;
    }

    private static int[] zzUnpackAttribute() {
        int[] iArr = new int[163];
        zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, 0, iArr);
        return iArr;
    }

    private static char[] zzUnpackCMap(String str) {
        int i;
        char[] cArr = new char[1114112];
        int i2 = 0;
        int i3 = 0;
        while (i3 < 188) {
            int i4 = i3 + 1;
            int iCharAt = str.charAt(i3);
            int i5 = i4 + 1;
            char cCharAt = str.charAt(i4);
            while (true) {
                i = i2 + 1;
                cArr[i2] = cCharAt;
                iCharAt--;
                if (iCharAt <= 0) {
                    break;
                }
                i2 = i;
            }
            i2 = i;
            i3 = i5;
        }
        return cArr;
    }

    private static int zzUnpackRowMap(String str, int i, int[] iArr) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            int iCharAt = str.charAt(i2) << 16;
            i2 = i3 + 1;
            iArr[i] = str.charAt(i3) | iCharAt;
            i++;
        }
        return i;
    }

    private static int[] zzUnpackRowMap() {
        int[] iArr = new int[163];
        zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, 0, iArr);
        return iArr;
    }

    private static int zzUnpackTrans(String str, int i, int[] iArr) {
        int i2;
        int i3 = 0;
        int length = str.length();
        int i4 = i;
        while (i3 < length) {
            int i5 = i3 + 1;
            int iCharAt = str.charAt(i3);
            int i6 = i5 + 1;
            int iCharAt2 = str.charAt(i5) - 1;
            while (true) {
                i2 = i4 + 1;
                iArr[i4] = iCharAt2;
                iCharAt--;
                if (iCharAt <= 0) {
                    break;
                }
                i4 = i2;
            }
            i4 = i2;
            i3 = i6;
        }
        return i4;
    }

    private static int[] zzUnpackTrans() {
        int[] iArr = new int[5610];
        zzUnpackTrans(ZZ_TRANS_PACKED_0, 0, iArr);
        return iArr;
    }

    public LuaTokenTypes advance() throws IOException {
        int i;
        int i2 = this.zzEndRead;
        char[] cArr = this.zzBuffer;
        char[] cArr2 = ZZ_CMAP;
        int[] iArr = ZZ_TRANS;
        int[] iArr2 = ZZ_ROWMAP;
        int[] iArr3 = ZZ_ATTRIBUTE;
        while (true) {
            int i3 = this.zzMarkedPos;
            this.zzStartRead = i3;
            this.zzCurrentPos = i3;
            this.zzState = ZZ_LEXSTATE[this.zzLexicalState];
            int i4 = i3;
            int iCharCount = i3;
            int i5 = (iArr3[this.zzState] & 1) == 1 ? this.zzState : -1;
            while (true) {
                if (iCharCount < i2) {
                    int iCodePointAt = Character.codePointAt(cArr, iCharCount, i2);
                    iCharCount = Character.charCount(iCodePointAt) + iCharCount;
                    i = iCodePointAt;
                } else if (this.zzAtEOF) {
                    i = -1;
                } else {
                    this.zzCurrentPos = iCharCount;
                    this.zzMarkedPos = i4;
                    boolean zZzRefill = zzRefill();
                    int i6 = this.zzCurrentPos;
                    i4 = this.zzMarkedPos;
                    cArr = this.zzBuffer;
                    i2 = this.zzEndRead;
                    if (zZzRefill) {
                        i = -1;
                    } else {
                        int iCodePointAt2 = Character.codePointAt(cArr, i6, i2);
                        iCharCount = Character.charCount(iCodePointAt2) + i6;
                        i = iCodePointAt2;
                    }
                }
                int i7 = iArr[iArr2[this.zzState] + cArr2[i]];
                if (i7 != -1) {
                    this.zzState = i7;
                    int i8 = iArr3[this.zzState];
                    if ((i8 & 1) == 1) {
                        int i9 = this.zzState;
                        if ((i8 & 8) == 8) {
                            i4 = iCharCount;
                            i5 = i9;
                        } else {
                            i4 = iCharCount;
                            i5 = i9;
                        }
                    }
                }
            }
            this.zzMarkedPos = i4;
            if (i != -1 || this.zzStartRead != this.zzCurrentPos) {
                if (i5 >= 0) {
                    i5 = ZZ_ACTION[i5];
                }
                switch (i5) {
                    case 1:
                        return LuaTokenTypes.WRONG;
                    case 2:
                        return LuaTokenTypes.WS;
                    case 3:
                        return LuaTokenTypes.NEWLINE;
                    case 4:
                        return LuaTokenTypes.LBRACK;
                    case 5:
                        return LuaTokenTypes.NAME;
                    case 6:
                        return LuaTokenTypes.NUMBER;
                    case 7:
                        return LuaTokenTypes.PLUS;
                    case 8:
                        return LuaTokenTypes.DOT;
                    case 9:
                        return LuaTokenTypes.ASSIGN;
                    case 10:
                        return LuaTokenTypes.MINUS;
                    case 11:
                        yybegin(10);
                        return LuaTokenTypes.STRING;
                    case 12:
                        yybegin(12);
                        return LuaTokenTypes.STRING;
                    case 13:
                        return LuaTokenTypes.GETN;
                    case 14:
                        return LuaTokenTypes.GT;
                    case 15:
                        return LuaTokenTypes.LT;
                    case 16:
                        return LuaTokenTypes.MULT;
                    case 17:
                        return LuaTokenTypes.MOD;
                    case 18:
                        return LuaTokenTypes.DIV;
                    case 19:
                        return LuaTokenTypes.LPAREN;
                    case 20:
                        return LuaTokenTypes.RPAREN;
                    case 21:
                        return LuaTokenTypes.RBRACK;
                    case 22:
                        return LuaTokenTypes.LCURLY;
                    case 23:
                        return LuaTokenTypes.RCURLY;
                    case 24:
                        return LuaTokenTypes.COMMA;
                    case 25:
                        return LuaTokenTypes.SEMI;
                    case 26:
                        return LuaTokenTypes.COLON;
                    case 27:
                        return LuaTokenTypes.EXP;
                    case 28:
                        return LuaTokenTypes.LONGSTRING;
                    case 29:
                        yypushback(yytext().length());
                        yybegin(2);
                        return advance();
                    case 30:
                        return LuaTokenTypes.NL_BEFORE_LONGSTRING;
                    case 31:
                        return LuaTokenTypes.SHORTCOMMENT;
                    case 32:
                        yybegin(0);
                        yypushback(yytext().length());
                        return advance();
                    case 33:
                        return LuaTokenTypes.LONGCOMMENT;
                    case 34:
                        return LuaTokenTypes.STRING;
                    case 35:
                        yybegin(0);
                        return LuaTokenTypes.WRONG;
                    case 36:
                        yybegin(0);
                        return LuaTokenTypes.STRING;
                    case 37:
                        yybegin(0);
                        return LuaTokenTypes.WRONG;
                    case 38:
                        this.longCommentOrStringHandler.setCurrentExtQuoteStart(yytext().toString());
                        yybegin(4);
                        return LuaTokenTypes.LONGSTRING_BEGIN;
                    case 39:
                        return LuaTokenTypes.CONCAT;
                    case 40:
                        return LuaTokenTypes.EQ;
                    case 41:
                        yypushback(yytext().length());
                        yybegin(6);
                        return advance();
                    case 42:
                        return LuaTokenTypes.DO;
                    case 43:
                        return LuaTokenTypes.OR;
                    case 44:
                        return LuaTokenTypes.IN;
                    case 45:
                        return LuaTokenTypes.IF;
                    case 46:
                        yybegin(6);
                        return LuaTokenTypes.SHEBANG;
                    case 47:
                        return LuaTokenTypes.GE;
                    case 48:
                        return LuaTokenTypes.LE;
                    case 49:
                        return LuaTokenTypes.NE;
                    case 50:
                        if (!this.longCommentOrStringHandler.isCurrentExtQuoteStart(yytext())) {
                            yypushback(yytext().length() - 1);
                            return LuaTokenTypes.LONGSTRING;
                        }
                        yybegin(0);
                        this.longCommentOrStringHandler.resetCurrentExtQuoteStart();
                        return LuaTokenTypes.LONGSTRING_END;
                    case 51:
                        if (!this.longCommentOrStringHandler.isCurrentExtQuoteStart(yytext())) {
                            yypushback(yytext().length() - 1);
                            return LuaTokenTypes.LONGCOMMENT;
                        }
                        yybegin(0);
                        this.longCommentOrStringHandler.resetCurrentExtQuoteStart();
                        return LuaTokenTypes.LONGCOMMENT_END;
                    case 52:
                        return LuaTokenTypes.ELLIPSIS;
                    case 53:
                        return LuaTokenTypes.AND;
                    case 54:
                        return LuaTokenTypes.NOT;
                    case 55:
                        return LuaTokenTypes.NIL;
                    case 56:
                        return LuaTokenTypes.END;
                    case 57:
                        return LuaTokenTypes.FOR;
                    case 58:
                        this.longCommentOrStringHandler.setCurrentExtQuoteStart(yytext().toString());
                        yybegin(8);
                        return LuaTokenTypes.LONGCOMMENT_BEGIN;
                    case 59:
                        yypushback(1);
                        return LuaTokenTypes.LUADOC_COMMENT;
                    case 60:
                        return LuaTokenTypes.ELSE;
                    case 61:
                        return LuaTokenTypes.TRUE;
                    case ByteOps.ISTORE_3:
                        return LuaTokenTypes.THEN;
                    case 63:
                        return LuaTokenTypes.BREAK;
                    case 64:
                        return LuaTokenTypes.LOCAL;
                    case 65:
                        return LuaTokenTypes.FALSE;
                    case 66:
                        return LuaTokenTypes.UNTIL;
                    case 67:
                        return LuaTokenTypes.WHILE;
                    case 68:
                        return LuaTokenTypes.RETURN;
                    case 69:
                        return LuaTokenTypes.REPEAT;
                    case 70:
                        return LuaTokenTypes.ELSEIF;
                    case 71:
                        return LuaTokenTypes.FUNCTION;
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                    case 118:
                    case 119:
                    case 120:
                    case 121:
                    case 122:
                    case 123:
                    case 124:
                    case 125:
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case 132:
                    case 133:
                    case 134:
                    case 135:
                    case 136:
                    case 137:
                    case 138:
                    case 139:
                    case 140:
                    case 141:
                    case 142:
                        break;
                    default:
                        zzScanError(1);
                        break;
                }
            } else {
                this.zzAtEOF = true;
                zzDoEOF();
                return (LuaTokenTypes) null;
            }
        }
    }

    public final void yybegin(int i) {
        this.zzLexicalState = i;
    }

    public final char yycharat(int i) {
        return this.zzBuffer[this.zzStartRead + i];
    }

    public final void yyclose() throws IOException {
        this.zzAtEOF = true;
        this.zzEndRead = this.zzStartRead;
        if (this.zzReader != null) {
            this.zzReader.close();
        }
    }

    public final int yylength() {
        return this.zzMarkedPos - this.zzStartRead;
    }

    public void yypushback(int i) {
        if (i > yylength()) {
            zzScanError(2);
        }
        this.zzMarkedPos -= i;
    }

    public final void yyreset(Reader reader) {
        this.zzReader = reader;
        this.zzAtBOL = true;
        this.zzAtEOF = false;
        this.zzEOFDone = false;
        this.zzStartRead = 0;
        this.zzEndRead = 0;
        this.zzMarkedPos = 0;
        this.zzCurrentPos = 0;
        this.zzFinalHighSurrogate = 0;
        this.yycolumn = 0;
        this.yychar = 0;
        this.yyline = 0;
        this.zzLexicalState = 0;
        if (this.zzBuffer.length > 16384) {
            this.zzBuffer = new char[16384];
        }
    }

    public final int yystate() {
        return this.zzLexicalState;
    }

    public final String yytext() {
        return new String(this.zzBuffer, this.zzStartRead, this.zzMarkedPos - this.zzStartRead);
    }
}
