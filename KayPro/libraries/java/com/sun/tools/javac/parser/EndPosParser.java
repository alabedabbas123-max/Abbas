package com.sun.tools.javac.parser;

import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeInfo;
import java.util.HashMap;
import java.util.Map;

public class EndPosParser extends JavacParser {

    private Lexer f477S;
    Map<JCTree, Integer> endPositions;

    public EndPosParser(ParserFactory fac, Lexer S, boolean keepDocComments, boolean keepLineMap) {
        super(fac, S, keepDocComments, keepLineMap);
        this.f477S = S;
        this.endPositions = new HashMap();
    }

    @Override
    protected void storeEnd(JCTree tree, int endpos) {
        int errorEndPos = getErrorEndPos();
        this.endPositions.put(tree, Integer.valueOf(errorEndPos > endpos ? errorEndPos : endpos));
    }

    @Override
    protected <T extends JCTree> T mo484to(T t) {
        storeEnd(t, this.f477S.endPos());
        return t;
    }

    @Override
    protected <T extends JCTree> T mo485toP(T t) {
        storeEnd(t, this.f477S.prevEndPos());
        return t;
    }

    @Override
    public JCTree.JCCompilationUnit parseCompilationUnit() {
        JCTree.JCCompilationUnit t = super.parseCompilationUnit();
        t.endPositions = this.endPositions;
        return t;
    }

    @Override
    JCTree.JCExpression parExpression() {
        int pos = this.f477S.mo487pos();
        JCTree.JCExpression t = super.parExpression();
        return (JCTree.JCExpression) mo485toP(this.f478F.m495at(pos).Parens(t));
    }

    @Override
    public int getEndPos(JCTree tree) {
        return TreeInfo.getEndPos(tree, this.endPositions);
    }
}
