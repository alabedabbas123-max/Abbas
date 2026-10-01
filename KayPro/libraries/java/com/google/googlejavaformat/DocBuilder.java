package com.google.googlejavaformat;

import com.google.common.base.MoreObjects;
import java.util.ArrayDeque;
import java.util.List;

public final class DocBuilder {
    private AbstractDoc.Level appendLevel;
    private final AbstractDoc.Level base = AbstractDoc.Level.make(Indent.Const.ZERO);
    private final ArrayDeque<AbstractDoc.Level> stack;

    public DocBuilder() {
        ArrayDeque<AbstractDoc.Level> arrayDeque = new ArrayDeque<>();
        this.stack = arrayDeque;
        AbstractDoc.Level level = this.base;
        this.appendLevel = level;
        arrayDeque.addLast(level);
    }

    public DocBuilder withOps(List<InterfaceOp> ops) {
        for (InterfaceOp op : ops) {
            op.mo439add(this);
        }
        return this;
    }

    void open(Indent plusIndent) {
        AbstractDoc.Level level = AbstractDoc.Level.make(plusIndent);
        this.stack.addLast(level);
    }

    void close() {
        AbstractDoc.Level top = this.stack.removeLast();
        this.stack.peekLast().m440add(top);
    }

    void m441add(AbstractDoc doc) {
        this.appendLevel.m440add(doc);
    }

    void breakDoc(AbstractDoc.Break breakDoc) {
        AbstractDoc.Level levelPeekLast = this.stack.peekLast();
        this.appendLevel = levelPeekLast;
        levelPeekLast.m440add(breakDoc);
    }

    public AbstractDoc build() {
        return this.base;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).m93add("base", this.base).m93add("stack", this.stack).m93add("appendLevel", this.appendLevel).toString();
    }
}
