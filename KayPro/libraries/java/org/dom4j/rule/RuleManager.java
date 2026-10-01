package org.dom4j.rule;

import java.util.HashMap;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.rule.pattern.NodeTypePattern;

public class RuleManager {
    private int appearenceCount;
    private HashMap modes = new HashMap();
    private Action valueOfAction;

    protected void addDefaultRule(Mode mode, Pattern pattern, Action action) {
        mode.addRule(createDefaultRule(pattern, action));
    }

    protected void addDefaultRules(Mode mode) {
        Action action = new Action(this, mode) {
            private final RuleManager this$0;
            private final Mode val$mode;

            {
                this.this$0 = this;
                this.val$mode = mode;
            }

            @Override
            public void mo8873run(Node node) throws Exception {
                if (node instanceof Element) {
                    this.val$mode.applyTemplates((Element) node);
                } else if (node instanceof Document) {
                    this.val$mode.applyTemplates((Document) node);
                }
            }
        };
        Action valueOfAction = getValueOfAction();
        addDefaultRule(mode, NodeTypePattern.ANY_DOCUMENT, action);
        addDefaultRule(mode, NodeTypePattern.ANY_ELEMENT, action);
        if (valueOfAction != null) {
            addDefaultRule(mode, NodeTypePattern.ANY_ATTRIBUTE, valueOfAction);
            addDefaultRule(mode, NodeTypePattern.ANY_TEXT, valueOfAction);
        }
    }

    public void addRule(Rule rule) {
        int i = this.appearenceCount + 1;
        this.appearenceCount = i;
        rule.setAppearenceCount(i);
        Mode mode = getMode(rule.getMode());
        Rule[] unionRules = rule.getUnionRules();
        if (unionRules == null) {
            mode.addRule(rule);
            return;
        }
        for (Rule rule2 : unionRules) {
            mode.addRule(rule2);
        }
    }

    public void clear() {
        this.modes.clear();
        this.appearenceCount = 0;
    }

    protected Rule createDefaultRule(Pattern pattern, Action action) {
        Rule rule = new Rule(pattern, action);
        rule.setImportPrecedence(-1);
        return rule;
    }

    protected Mode createMode() {
        Mode mode = new Mode();
        addDefaultRules(mode);
        return mode;
    }

    public Rule getMatchingRule(String str, Node node) {
        Mode mode = (Mode) this.modes.get(str);
        if (mode != null) {
            return mode.getMatchingRule(node);
        }
        System.out.println(new StringBuffer().append("Warning: No Mode for mode: ").append(mode).toString());
        return null;
    }

    public Mode getMode(String str) {
        Mode mode = (Mode) this.modes.get(str);
        if (mode != null) {
            return mode;
        }
        Mode modeCreateMode = createMode();
        this.modes.put(str, modeCreateMode);
        return modeCreateMode;
    }

    public Action getValueOfAction() {
        return this.valueOfAction;
    }

    public void removeRule(Rule rule) {
        Mode mode = getMode(rule.getMode());
        Rule[] unionRules = rule.getUnionRules();
        if (unionRules == null) {
            mode.removeRule(rule);
            return;
        }
        for (Rule rule2 : unionRules) {
            mode.removeRule(rule2);
        }
    }

    public void setValueOfAction(Action action) {
        this.valueOfAction = action;
    }
}
