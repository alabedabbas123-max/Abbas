package com.google.googlejavaformat.java.javadoc;

import com.google.common.base.Preconditions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class CharStream {
    String remaining;
    int toConsume;

    CharStream(String input) {
        this.remaining = (String) Preconditions.checkNotNull(input);
    }

    boolean tryConsume(String expected) {
        if (!this.remaining.startsWith(expected)) {
            return false;
        }
        this.toConsume = expected.length();
        return true;
    }

    boolean tryConsumeRegex(Pattern pattern) {
        Matcher matcher = pattern.matcher(this.remaining);
        if (!matcher.find()) {
            return false;
        }
        Preconditions.checkArgument(matcher.start() == 0);
        this.toConsume = matcher.end();
        return true;
    }

    String readAndResetRecorded() {
        String result = this.remaining.substring(0, this.toConsume);
        this.remaining = this.remaining.substring(this.toConsume);
        this.toConsume = 0;
        return result;
    }

    boolean isExhausted() {
        return this.remaining.isEmpty();
    }
}
