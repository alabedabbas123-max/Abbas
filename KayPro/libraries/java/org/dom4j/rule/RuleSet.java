package org.dom4j.rule;

import java.util.ArrayList;
import java.util.Collections;
import org.dom4j.Node;

public class RuleSet {
    private Rule[] ruleArray;
    private ArrayList rules = new ArrayList();

    public void addAll(RuleSet ruleSet) {
        this.rules.addAll(ruleSet.rules);
        this.ruleArray = null;
    }

    public void addRule(Rule rule) {
        this.rules.add(rule);
        this.ruleArray = null;
    }

    public Rule getMatchingRule(Node node) {
        Rule[] ruleArray = getRuleArray();
        for (int length = ruleArray.length - 1; length >= 0; length--) {
            Rule rule = ruleArray[length];
            if (rule.matches(node)) {
                return rule;
            }
        }
        return null;
    }

    protected Rule[] getRuleArray() {
        if (this.ruleArray == null) {
            Collections.sort(this.rules);
            this.ruleArray = new Rule[this.rules.size()];
            this.rules.toArray(this.ruleArray);
        }
        return this.ruleArray;
    }

    public void removeRule(Rule rule) {
        this.rules.remove(rule);
        this.ruleArray = null;
    }

    public String toString() {
        return new StringBuffer().append(super.toString()).append(" [RuleSet: ").append(this.rules).append(" ]").toString();
    }
}
