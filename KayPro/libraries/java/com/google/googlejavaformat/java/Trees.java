package com.google.googlejavaformat.java;

import com.sun.source.tree.ClassTree;
import com.sun.source.tree.CompoundAssignmentTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.IdentifierTree;
import com.sun.source.tree.MemberSelectTree;
import com.sun.source.tree.MethodInvocationTree;
import com.sun.source.tree.ParenthesizedTree;
import com.sun.source.tree.Tree;
import com.sun.source.util.TreePath;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.Pretty;
import com.sun.tools.javac.tree.TreeInfo;
import java.io.IOError;
import java.io.IOException;
import javax.lang.model.element.Name;

public class Trees {
    static int getLength(Tree tree, TreePath path) {
        return getEndPosition(tree, path) - getStartPosition(tree);
    }

    static int getStartPosition(Tree expression) {
        return ((JCTree) expression).getStartPosition();
    }

    static int getEndPosition(Tree expression, TreePath path) {
        return ((JCTree) expression).getEndPosition(((JCTree.JCCompilationUnit) path.getCompilationUnit()).endPositions);
    }

    static String getSourceForNode(Tree node, TreePath path) {
        try {
            CharSequence source = path.getCompilationUnit().getSourceFile().getCharContent(false);
            return source.subSequence(getStartPosition(node), getEndPosition(node, path)).toString();
        } catch (IOException e) {
            throw new IOError(e);
        }
    }

    static Name getMethodName(MethodInvocationTree methodInvocation) {
        ExpressionTree select = methodInvocation.getMethodSelect();
        if (select instanceof MemberSelectTree) {
            return ((MemberSelectTree) select).getIdentifier();
        }
        return ((IdentifierTree) select).getName();
    }

    static ExpressionTree getMethodReceiver(MethodInvocationTree methodInvocation) {
        ExpressionTree select = methodInvocation.getMethodSelect();
        if (select instanceof MemberSelectTree) {
            return ((MemberSelectTree) select).getExpression();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static String operatorName(ExpressionTree expressionTree) {
        int tag = ((JCTree) expressionTree).getTag();
        if (tag == 30) {
            return "=";
        }
        boolean assignOp = expressionTree instanceof CompoundAssignmentTree;
        String name = new Pretty(null, true).operatorName(tag);
        if (!assignOp) {
            return name;
        }
        return name + "=";
    }

    /* JADX WARN: Multi-variable type inference failed */
    static int precedence(ExpressionTree expressionTree) {
        return TreeInfo.opPrec(((JCTree) expressionTree).getTag());
    }

    static class C05471 {
        static final int[] $SwitchMap$com$sun$source$tree$Tree$Kind;

        static {
            int[] iArr = new int[Tree.Kind.values().length];
            $SwitchMap$com$sun$source$tree$Tree$Kind = iArr;
            try {
                iArr[Tree.Kind.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$sun$source$tree$Tree$Kind[Tree.Kind.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$sun$source$tree$Tree$Kind[Tree.Kind.INTERFACE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$sun$source$tree$Tree$Kind[Tree.Kind.ANNOTATION_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    static ClassTree getEnclosingTypeDeclaration(TreePath path) {
        while (path != null) {
            int i = C05471.$SwitchMap$com$sun$source$tree$Tree$Kind[path.getLeaf().getKind().ordinal()];
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                path = path.getParentPath();
            } else {
                return (ClassTree) path.getLeaf();
            }
        }
        throw new AssertionError();
    }

    static ExpressionTree skipParen(ExpressionTree node) {
        return ((ParenthesizedTree) node).getExpression();
    }
}
