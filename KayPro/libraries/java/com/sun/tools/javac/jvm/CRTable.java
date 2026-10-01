package com.sun.tools.javac.jvm;

import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.util.Assert;
import com.sun.tools.javac.util.ByteBuffer;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Position;
import java.util.HashMap;
import java.util.Map;

public class CRTable implements CRTFlags {
    private Map<JCTree, Integer> endPositions;
    JCTree.JCMethodDecl methodTree;
    private final boolean crtDebug = false;
    private ListBuffer<CRTEntry> entries = new ListBuffer<>();
    private Map<Object, SourceRange> positions = new HashMap();

    public CRTable(JCTree.JCMethodDecl tree, Map<JCTree, Integer> endPositions) {
        this.methodTree = tree;
        this.endPositions = endPositions;
    }

    public void m467put(Object tree, int flags, int startPc, int endPc) {
        this.entries.append(new CRTEntry(tree, flags, startPc, endPc));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int writeCRT(ByteBuffer databuf, Position.LineMap lineMap, Log log) {
        int startPos;
        int endPos;
        int crtEntries = 0;
        new SourceComputer().m468csp(this.methodTree);
        for (List list = this.entries.toList(); list.nonEmpty(); list = list.tail) {
            CRTEntry entry = (CRTEntry) list.head;
            if (entry.startPc != entry.endPc) {
                SourceRange pos = this.positions.get(entry.tree);
                Assert.checkNonNull(pos, "CRT: tree source positions are undefined");
                if (pos.startPos != -1 && pos.endPos != -1 && (startPos = encodePosition(pos.startPos, lineMap, log)) != -1 && (endPos = encodePosition(pos.endPos, lineMap, log)) != -1) {
                    databuf.appendChar(entry.startPc);
                    databuf.appendChar(entry.endPc - 1);
                    databuf.appendInt(startPos);
                    databuf.appendInt(endPos);
                    databuf.appendChar(entry.flags);
                    crtEntries++;
                }
            }
        }
        return crtEntries;
    }

    public int length() {
        return this.entries.length();
    }

    private String getTypes(int flags) {
        String types = "";
        if ((flags & 1) != 0) {
            types = " CRT_STATEMENT";
        }
        if ((flags & 2) != 0) {
            types = types + " CRT_BLOCK";
        }
        if ((flags & 4) != 0) {
            types = types + " CRT_ASSIGNMENT";
        }
        if ((flags & 8) != 0) {
            types = types + " CRT_FLOW_CONTROLLER";
        }
        if ((flags & 16) != 0) {
            types = types + " CRT_FLOW_TARGET";
        }
        if ((flags & 32) != 0) {
            types = types + " CRT_INVOKE";
        }
        if ((flags & 64) != 0) {
            types = types + " CRT_CREATE";
        }
        if ((flags & 128) != 0) {
            types = types + " CRT_BRANCH_TRUE";
        }
        if ((flags & 256) != 0) {
            return types + " CRT_BRANCH_FALSE";
        }
        return types;
    }

    private int encodePosition(int pos, Position.LineMap lineMap, Log log) {
        int line = lineMap.getLineNumber(pos);
        int col = lineMap.getColumnNumber(pos);
        int new_pos = Position.encodePosition(line, col);
        if (new_pos == -1) {
            log.warning(pos, "position.overflow", Integer.valueOf(line));
        }
        return new_pos;
    }

    class SourceComputer extends JCTree.Visitor {
        SourceRange result;

        SourceComputer() {
        }

        public SourceRange m468csp(JCTree tree) {
            if (tree == null) {
                return null;
            }
            tree.accept(this);
            if (this.result != null) {
                CRTable.this.positions.put(tree, this.result);
            }
            return this.result;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SourceRange m469csp(List<? extends JCTree> trees) {
            if (trees == null || !trees.nonEmpty()) {
                return null;
            }
            SourceRange list_sr = new SourceRange();
            for (List list = trees; list.nonEmpty(); list = list.tail) {
                list_sr.mergeWith(m468csp((JCTree) list.head));
            }
            CRTable.this.positions.put(trees, list_sr);
            return list_sr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SourceRange cspCases(List<JCTree.JCCase> trees) {
            if (trees == null || !trees.nonEmpty()) {
                return null;
            }
            SourceRange list_sr = new SourceRange();
            for (List list = trees; list.nonEmpty(); list = list.tail) {
                list_sr.mergeWith(m468csp((JCTree) list.head));
            }
            CRTable.this.positions.put(trees, list_sr);
            return list_sr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SourceRange cspCatchers(List<JCTree.JCCatch> trees) {
            if (trees == null || !trees.nonEmpty()) {
                return null;
            }
            SourceRange list_sr = new SourceRange();
            for (List list = trees; list.nonEmpty(); list = list.tail) {
                list_sr.mergeWith(m468csp((JCTree) list.head));
            }
            CRTable.this.positions.put(trees, list_sr);
            return list_sr;
        }

        @Override
        public void visitMethodDef(JCTree.JCMethodDecl tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.body));
            this.result = sr;
        }

        @Override
        public void visitVarDef(JCTree.JCVariableDecl tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            m468csp(tree.vartype);
            sr.mergeWith(m468csp(tree.init));
            this.result = sr;
        }

        @Override
        public void visitSkip(JCTree.JCSkip tree) {
            SourceRange sr = new SourceRange(startPos(tree), startPos(tree));
            this.result = sr;
        }

        @Override
        public void visitBlock(JCTree.JCBlock tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            m469csp(tree.stats);
            this.result = sr;
        }

        @Override
        public void visitDoLoop(JCTree.JCDoWhileLoop tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.body));
            sr.mergeWith(m468csp(tree.cond));
            this.result = sr;
        }

        @Override
        public void visitWhileLoop(JCTree.JCWhileLoop tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.cond));
            sr.mergeWith(m468csp(tree.body));
            this.result = sr;
        }

        @Override
        public void visitForLoop(JCTree.JCForLoop tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m469csp(tree.init));
            sr.mergeWith(m468csp(tree.cond));
            sr.mergeWith(m469csp(tree.step));
            sr.mergeWith(m468csp(tree.body));
            this.result = sr;
        }

        @Override
        public void visitForeachLoop(JCTree.JCEnhancedForLoop tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.f541var));
            sr.mergeWith(m468csp(tree.expr));
            sr.mergeWith(m468csp(tree.body));
            this.result = sr;
        }

        @Override
        public void visitLabelled(JCTree.JCLabeledStatement tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.body));
            this.result = sr;
        }

        @Override
        public void visitSwitch(JCTree.JCSwitch tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.selector));
            sr.mergeWith(cspCases(tree.cases));
            this.result = sr;
        }

        @Override
        public void visitCase(JCTree.JCCase tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.f538pat));
            sr.mergeWith(m469csp(tree.stats));
            this.result = sr;
        }

        @Override
        public void visitSynchronized(JCTree.JCSynchronized tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.lock));
            sr.mergeWith(m468csp(tree.body));
            this.result = sr;
        }

        @Override
        public void visitTry(JCTree.JCTry tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m469csp(tree.resources));
            sr.mergeWith(m468csp(tree.body));
            sr.mergeWith(cspCatchers(tree.catchers));
            sr.mergeWith(m468csp(tree.finalizer));
            this.result = sr;
        }

        @Override
        public void visitCatch(JCTree.JCCatch tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.param));
            sr.mergeWith(m468csp(tree.body));
            this.result = sr;
        }

        @Override
        public void visitConditional(JCTree.JCConditional tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.cond));
            sr.mergeWith(m468csp(tree.truepart));
            sr.mergeWith(m468csp(tree.falsepart));
            this.result = sr;
        }

        @Override
        public void visitIf(JCTree.JCIf tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.cond));
            sr.mergeWith(m468csp(tree.thenpart));
            sr.mergeWith(m468csp(tree.elsepart));
            this.result = sr;
        }

        @Override
        public void visitExec(JCTree.JCExpressionStatement tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.expr));
            this.result = sr;
        }

        @Override
        public void visitBreak(JCTree.JCBreak tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            this.result = sr;
        }

        @Override
        public void visitContinue(JCTree.JCContinue tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            this.result = sr;
        }

        @Override
        public void visitReturn(JCTree.JCReturn tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.expr));
            this.result = sr;
        }

        @Override
        public void visitThrow(JCTree.JCThrow tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.expr));
            this.result = sr;
        }

        @Override
        public void visitAssert(JCTree.JCAssert tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.cond));
            sr.mergeWith(m468csp(tree.detail));
            this.result = sr;
        }

        @Override
        public void visitApply(JCTree.JCMethodInvocation tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.meth));
            sr.mergeWith(m469csp(tree.args));
            this.result = sr;
        }

        @Override
        public void visitNewClass(JCTree.JCNewClass tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.encl));
            sr.mergeWith(m468csp(tree.clazz));
            sr.mergeWith(m469csp(tree.args));
            sr.mergeWith(m468csp(tree.f545def));
            this.result = sr;
        }

        @Override
        public void visitNewArray(JCTree.JCNewArray tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.elemtype));
            sr.mergeWith(m469csp(tree.dims));
            sr.mergeWith(m469csp(tree.elems));
            this.result = sr;
        }

        @Override
        public void visitParens(JCTree.JCParens tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.expr));
            this.result = sr;
        }

        @Override
        public void visitAssign(JCTree.JCAssign tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.f532lhs));
            sr.mergeWith(m468csp(tree.f533rhs));
            this.result = sr;
        }

        @Override
        public void visitAssignop(JCTree.JCAssignOp tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.f534lhs));
            sr.mergeWith(m468csp(tree.f535rhs));
            this.result = sr;
        }

        @Override
        public void visitUnary(JCTree.JCUnary tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.f546arg));
            this.result = sr;
        }

        @Override
        public void visitBinary(JCTree.JCBinary tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.f536lhs));
            sr.mergeWith(m468csp(tree.f537rhs));
            this.result = sr;
        }

        @Override
        public void visitTypeCast(JCTree.JCTypeCast tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.clazz));
            sr.mergeWith(m468csp(tree.expr));
            this.result = sr;
        }

        @Override
        public void visitTypeTest(JCTree.JCInstanceOf tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.expr));
            sr.mergeWith(m468csp(tree.clazz));
            this.result = sr;
        }

        @Override
        public void visitIndexed(JCTree.JCArrayAccess tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.indexed));
            sr.mergeWith(m468csp(tree.index));
            this.result = sr;
        }

        @Override
        public void visitSelect(JCTree.JCFieldAccess tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.selected));
            this.result = sr;
        }

        @Override
        public void visitIdent(JCTree.JCIdent tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            this.result = sr;
        }

        @Override
        public void visitLiteral(JCTree.JCLiteral tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            this.result = sr;
        }

        @Override
        public void visitTypeIdent(JCTree.JCPrimitiveTypeTree tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            this.result = sr;
        }

        @Override
        public void visitTypeArray(JCTree.JCArrayTypeTree tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.elemtype));
            this.result = sr;
        }

        @Override
        public void visitTypeApply(JCTree.JCTypeApply tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m468csp(tree.clazz));
            sr.mergeWith(m469csp(tree.arguments));
            this.result = sr;
        }

        @Override
        public void visitTypeParameter(JCTree.JCTypeParameter tree) {
            SourceRange sr = new SourceRange(startPos(tree), endPos(tree));
            sr.mergeWith(m469csp(tree.bounds));
            this.result = sr;
        }

        @Override
        public void visitWildcard(JCTree.JCWildcard tree) {
            this.result = null;
        }

        @Override
        public void visitErroneous(JCTree.JCErroneous tree) {
            this.result = null;
        }

        @Override
        public void visitTree(JCTree tree) {
            Assert.error();
        }

        public int startPos(JCTree tree) {
            if (tree == null) {
                return -1;
            }
            return tree.f531pos;
        }

        public int endPos(JCTree tree) {
            if (tree == null) {
                return -1;
            }
            if (tree.getTag() != 7) {
                Integer endpos = (Integer) CRTable.this.endPositions.get(tree);
                if (endpos == null) {
                    return -1;
                }
                return endpos.intValue();
            }
            return ((JCTree.JCBlock) tree).endpos;
        }
    }

    static class CRTEntry {
        int endPc;
        int flags;
        int startPc;
        Object tree;

        CRTEntry(Object tree, int flags, int startPc, int endPc) {
            this.tree = tree;
            this.flags = flags;
            this.startPc = startPc;
            this.endPc = endPc;
        }
    }

    static class SourceRange {
        int endPos;
        int startPos;

        SourceRange() {
            this.startPos = -1;
            this.endPos = -1;
        }

        SourceRange(int startPos, int endPos) {
            this.startPos = startPos;
            this.endPos = endPos;
        }

        SourceRange mergeWith(SourceRange sr) {
            if (sr == null) {
                return this;
            }
            int i = this.startPos;
            if (i == -1) {
                this.startPos = sr.startPos;
            } else {
                int i2 = sr.startPos;
                if (i2 != -1) {
                    if (i >= i2) {
                        i = i2;
                    }
                    this.startPos = i;
                }
            }
            int i3 = this.endPos;
            if (i3 == -1) {
                this.endPos = sr.endPos;
            } else {
                int i4 = sr.endPos;
                if (i4 != -1) {
                    if (i3 <= i4) {
                        i3 = i4;
                    }
                    this.endPos = i3;
                }
            }
            return this;
        }
    }
}
