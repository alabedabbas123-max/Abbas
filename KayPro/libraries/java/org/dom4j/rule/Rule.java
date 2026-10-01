package org.dom4j.rule;

import org.dom4j.Node;

public class Rule implements Comparable {
    private Action action;
    private int appearenceCount;
    private int importPrecedence;
    private String mode;
    private Pattern pattern;
    private double priority;

    public Rule() {
        this.priority = 0.5d;
    }

    public Rule(Pattern pattern) {
        this.pattern = pattern;
        this.priority = pattern.getPriority();
    }

    public Rule(Pattern pattern, Action action) {
        this(pattern);
        this.action = action;
    }

    public Rule(Rule rule, Pattern pattern) {
        this.mode = rule.mode;
        this.importPrecedence = rule.importPrecedence;
        this.priority = rule.priority;
        this.appearenceCount = rule.appearenceCount;
        this.action = rule.action;
        this.pattern = pattern;
    }

    @Override
    public int compareTo(Object obj) {
        return obj instanceof Rule ? compareTo((Rule) obj) : getClass().getName().compareTo(obj.getClass().getName());
    }

    public int compareTo(Rule rule) {
        int i = this.importPrecedence - rule.importPrecedence;
        if (i != 0) {
            return i;
        }
        int iRound = (int) Math.round(this.priority - rule.priority);
        return iRound == 0 ? this.appearenceCount - rule.appearenceCount : iRound;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Rule) && compareTo((Rule) obj) == 0;
    }

    public Action getAction() {
        return this.action;
    }

    public int getAppearenceCount() {
        return this.appearenceCount;
    }

    public int getImportPrecedence() {
        return this.importPrecedence;
    }

    public final short getMatchType() {
        return this.pattern.getMatchType();
    }

    public final String getMatchesNodeName() {
        return this.pattern.getMatchesNodeName();
    }

    public String getMode() {
        return this.mode;
    }

    public Pattern getPattern() {
        return this.pattern;
    }

    public double getPriority() {
        return this.priority;
    }

    public Rule[] getUnionRules() {
        Pattern[] unionPatterns = this.pattern.getUnionPatterns();
        if (unionPatterns == null) {
            return null;
        }
        int length = unionPatterns.length;
        Rule[] ruleArr = new Rule[length];
        for (int i = 0; i < length; i++) {
            ruleArr[i] = new Rule(this, unionPatterns[i]);
        }
        return ruleArr;
    }

    public int hashCode() {
        return this.importPrecedence + this.appearenceCount;
    }

    public final boolean matches(Node node) {
        return this.pattern.matches(node);
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public void setAppearenceCount(int i) {
        this.appearenceCount = i;
    }

    public void setImportPrecedence(int i) {
        this.importPrecedence = i;
    }

    public void setMode(String str) {
        this.mode = str;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public void setPriority(double d) {
        this.priority = d;
    }

    public String toString() {
        return new StringBuffer().append(super.toString()).append("[ pattern: ").append(getPattern()).append(" action: ").append(getAction()).append(" ]").toString();
    }
}
