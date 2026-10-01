package com.google.googlejavaformat;

import com.google.common.base.Preconditions;

public class FormatterDiagnostic {
    private final int column;
    private final int lineNumber;
    private final String message;

    public static FormatterDiagnostic create(String message) {
        return new FormatterDiagnostic(-1, -1, message);
    }

    public static FormatterDiagnostic create(int lineNumber, int column, String message) {
        Preconditions.checkArgument(lineNumber >= 0);
        Preconditions.checkArgument(column >= 0);
        Preconditions.checkNotNull(message);
        return new FormatterDiagnostic(lineNumber, column, message);
    }

    private FormatterDiagnostic(int lineNumber, int column, String message) {
        this.lineNumber = lineNumber;
        this.column = column;
        this.message = message;
    }

    public int line() {
        return this.lineNumber;
    }

    public int column() {
        return this.column;
    }

    public String message() {
        return this.message;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.lineNumber;
        if (i >= 0) {
            sb.append(i);
            sb.append(':');
        }
        int i2 = this.column;
        if (i2 >= 0) {
            sb.append(i2 + 1);
            sb.append(':');
        }
        if (this.lineNumber >= 0 || this.column >= 0) {
            sb.append(' ');
        }
        sb.append("error: ");
        sb.append(this.message);
        return sb.toString();
    }
}
