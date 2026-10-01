package org.dom4j.rule;

import org.dom4j.Node;

public class NullAction implements Action {
    public static final NullAction SINGLETON = new NullAction();

    @Override
    public void mo8873run(Node node) throws Exception {
    }
}
