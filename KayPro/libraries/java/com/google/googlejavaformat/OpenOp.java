package com.google.googlejavaformat;

import com.google.common.base.MoreObjects;

public final class OpenOp implements InterfaceOp {
    private final Indent plusIndent;

    private OpenOp(Indent plusIndent) {
        this.plusIndent = plusIndent;
    }

    public static InterfaceOp make(Indent plusIndent) {
        return new OpenOp(plusIndent);
    }

    @Override
    public void mo439add(DocBuilder builder) {
        builder.open(this.plusIndent);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).m93add("plusIndent", this.plusIndent).toString();
    }
}
