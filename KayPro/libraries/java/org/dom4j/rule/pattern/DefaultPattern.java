package org.dom4j.rule.pattern;

import org.dom4j.Node;
import org.dom4j.NodeFilter;
import org.dom4j.rule.Pattern;

public class DefaultPattern implements Pattern {
    private NodeFilter filter;

    public DefaultPattern(NodeFilter nodeFilter) {
        this.filter = nodeFilter;
    }

    @Override
    public short getMatchType() {
        return (short) 0;
    }

    @Override
    public String getMatchesNodeName() {
        return null;
    }

    @Override
    public double getPriority() {
        return 0.5d;
    }

    @Override
    public Pattern[] getUnionPatterns() {
        return null;
    }

    @Override
    public boolean matches(Node node) {
        return this.filter.matches(node);
    }
}
