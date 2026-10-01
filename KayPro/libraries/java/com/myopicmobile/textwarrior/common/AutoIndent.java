package com.myopicmobile.textwarrior.common;

import java.io.IOException;

public class AutoIndent {
    public static int createAutoIndent(CharSequence charSequence) {
        LuaLexer luaLexer = new LuaLexer(charSequence);
        int iIndent = 0;
        while (true) {
            try {
                LuaTokenTypes luaTokenTypesAdvance = luaLexer.advance();
                if (luaTokenTypesAdvance == null) {
                    break;
                }
                iIndent += indent(luaTokenTypesAdvance);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return iIndent;
    }

    private static char[] createIntdent(int i) {
        if (i < 0) {
            return new char[0];
        }
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = ' ';
        }
        return cArr;
    }

    public static CharSequence format(CharSequence charSequence, int i) {
        StringBuilder sb = new StringBuilder();
        LuaLexer luaLexer = new LuaLexer(charSequence);
        int iMax = 0;
        boolean z = true;
        while (true) {
            try {
                LuaTokenTypes luaTokenTypesAdvance = luaLexer.advance();
                if (luaTokenTypesAdvance == null) {
                    break;
                }
                if (luaTokenTypesAdvance == LuaTokenTypes.NEWLINE) {
                    sb.append('\n');
                    iMax = Math.max(0, iMax);
                    z = true;
                } else if (z) {
                    if (luaTokenTypesAdvance != LuaTokenTypes.WS) {
                        if (luaTokenTypesAdvance == LuaTokenTypes.ELSE) {
                            int i2 = iMax - 1;
                            sb.append(createIntdent(i2 * i));
                            sb.append(luaLexer.yytext());
                            iMax = i2 + 1;
                            z = false;
                        } else if (luaTokenTypesAdvance == LuaTokenTypes.ELSEIF || luaTokenTypesAdvance == LuaTokenTypes.END || luaTokenTypesAdvance == LuaTokenTypes.UNTIL || luaTokenTypesAdvance == LuaTokenTypes.RCURLY) {
                            iMax--;
                            sb.append(createIntdent(iMax * i));
                            sb.append(luaLexer.yytext());
                            z = false;
                        } else {
                            sb.append(createIntdent(iMax * i));
                            sb.append(luaLexer.yytext());
                            iMax += indent(luaTokenTypesAdvance);
                            z = false;
                        }
                    }
                } else if (luaTokenTypesAdvance == LuaTokenTypes.WS) {
                    sb.append(' ');
                } else {
                    sb.append(luaLexer.yytext());
                    iMax += indent(luaTokenTypesAdvance);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb;
    }

    private static int indent(LuaTokenTypes luaTokenTypes) {
        if (luaTokenTypes == LuaTokenTypes.DO || luaTokenTypes == LuaTokenTypes.FUNCTION || luaTokenTypes == LuaTokenTypes.THEN || luaTokenTypes == LuaTokenTypes.REPEAT || luaTokenTypes == LuaTokenTypes.LCURLY) {
            return 1;
        }
        return (luaTokenTypes == LuaTokenTypes.UNTIL || luaTokenTypes == LuaTokenTypes.ELSEIF || luaTokenTypes == LuaTokenTypes.END || luaTokenTypes == LuaTokenTypes.RCURLY) ? -1 : 0;
    }
}
