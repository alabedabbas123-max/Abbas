package com.google.googlejavaformat;

import com.google.common.base.MoreObjects;

public enum CloseOp implements InterfaceOp {
    CLOSE;

    public static InterfaceOp make() {
        return CLOSE;
    }

    @Override
    public void mo439add(DocBuilder builder) {
        builder.close();
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).toString();
    }
}
