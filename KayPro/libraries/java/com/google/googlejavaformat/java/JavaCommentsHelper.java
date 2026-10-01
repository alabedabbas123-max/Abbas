package com.google.googlejavaformat.java;

import com.google.common.base.CharMatcher;
import com.google.common.base.Strings;
import com.google.googlejavaformat.CommentsHelper;
import com.google.googlejavaformat.Input;
import com.google.googlejavaformat.Newlines;
import com.google.googlejavaformat.java.javadoc.JavadocFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class JavaCommentsHelper implements CommentsHelper {
    private final String lineSeparator;
    private final JavaFormatterOptions options;

    public JavaCommentsHelper(String lineSeparator, JavaFormatterOptions options) {
        this.lineSeparator = lineSeparator;
        this.options = options;
    }

    private static boolean javadocShaped(List<String> lines) {
        Iterator<String> it = lines.iterator();
        if (!it.hasNext()) {
            return false;
        }
        String first = it.next().trim();
        if (first.startsWith("/**")) {
            return true;
        }
        if (!first.startsWith("/*")) {
            return false;
        }
        while (it.hasNext()) {
            if (!it.next().trim().startsWith("*")) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String rewrite(Input.InterfaceC0532Tok tok, int maxWidth, int column0) {
        if (!tok.isComment()) {
            return tok.getOriginalText();
        }
        String text = tok.getOriginalText();
        if (tok.isJavadocComment()) {
            text = JavadocFormatter.formatJavadoc(text, column0, this.options);
        }
        List<String> lines = new ArrayList<>();
        Iterator<String> it = Newlines.lineIterator(text);
        while (it.hasNext()) {
            lines.add(CharMatcher.whitespace().trimTrailingFrom(it.next()));
        }
        if (tok.isSlashSlashComment()) {
            return indentLineComments(lines, column0);
        }
        if (javadocShaped(lines)) {
            return indentJavadoc(lines, column0);
        }
        return preserveIndentation(lines, column0);
    }

    private String preserveIndentation(List<String> lines, int column0) {
        StringBuilder builder = new StringBuilder();
        int startCol = -1;
        for (int i = 1; i < lines.size(); i++) {
            int lineIdx = CharMatcher.whitespace().negate().indexIn(lines.get(i));
            if (lineIdx >= 0 && (startCol == -1 || lineIdx < startCol)) {
                startCol = lineIdx;
            }
        }
        builder.append(lines.get(0));
        for (int i2 = 1; i2 < lines.size(); i2++) {
            builder.append(this.lineSeparator);
            builder.append(Strings.repeat(" ", column0));
            if (lines.get(i2).length() >= startCol) {
                builder.append(lines.get(i2).substring(startCol));
            } else {
                builder.append(lines.get(i2));
            }
        }
        return builder.toString();
    }

    private String indentLineComments(List<String> lines, int column0) {
        List<String> lines2 = wrapLineComments(lines, column0, this.options);
        StringBuilder builder = new StringBuilder();
        builder.append(lines2.get(0).trim());
        String indentString = Strings.repeat(" ", column0);
        for (int i = 1; i < lines2.size(); i++) {
            builder.append(this.lineSeparator);
            builder.append(indentString);
            builder.append(lines2.get(i).trim());
        }
        return builder.toString();
    }

    private List<String> wrapLineComments(List<String> lines, int column0, JavaFormatterOptions options) {
        List<String> result = new ArrayList<>();
        Iterator<String> it = lines.iterator();
        while (it.hasNext()) {
            String line = it.next();
            if (!line.startsWith("// ")) {
                line = "// " + line.substring("//".length());
            }
            while (line.length() + column0 > options.maxLineLength()) {
                int idx = options.maxLineLength() - column0;
                while (idx >= 2 && !CharMatcher.whitespace().matches(line.charAt(idx))) {
                    idx--;
                }
                if (idx <= 2) {
                    break;
                }
                result.add(line.substring(0, idx));
                line = "//" + line.substring(idx);
            }
            result.add(line);
        }
        return result;
    }

    private String indentJavadoc(List<String> lines, int column0) {
        StringBuilder builder = new StringBuilder();
        builder.append(lines.get(0).trim());
        int indent = column0 + 1;
        String indentString = Strings.repeat(" ", indent);
        for (int i = 1; i < lines.size(); i++) {
            builder.append(this.lineSeparator);
            builder.append(indentString);
            String line = lines.get(i).trim();
            if (!line.startsWith("*")) {
                builder.append("* ");
            }
            builder.append(line);
        }
        return builder.toString();
    }
}
