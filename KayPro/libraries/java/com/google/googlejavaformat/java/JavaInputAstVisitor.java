package com.google.googlejavaformat.java;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.base.Throwables;
import com.google.common.base.Verify;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Multiset;
import com.google.common.collect.PeekingIterator;
import com.google.common.collect.UnmodifiableIterator;
import com.google.googlejavaformat.AbstractDoc;
import com.google.googlejavaformat.CloseOp;
import com.google.googlejavaformat.FormattingError;
import com.google.googlejavaformat.Indent;
import com.google.googlejavaformat.Input;
import com.google.googlejavaformat.InterfaceOp;
import com.google.googlejavaformat.OpenOp;
import com.google.googlejavaformat.OpsBuilder;
import com.google.googlejavaformat.Output;
import com.sun.source.tree.AnnotationTree;
import com.sun.source.tree.ArrayAccessTree;
import com.sun.source.tree.ArrayTypeTree;
import com.sun.source.tree.AssertTree;
import com.sun.source.tree.AssignmentTree;
import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.BlockTree;
import com.sun.source.tree.BreakTree;
import com.sun.source.tree.CaseTree;
import com.sun.source.tree.CatchTree;
import com.sun.source.tree.ClassTree;
import com.sun.source.tree.CompilationUnitTree;
import com.sun.source.tree.CompoundAssignmentTree;
import com.sun.source.tree.ConditionalExpressionTree;
import com.sun.source.tree.ContinueTree;
import com.sun.source.tree.DoWhileLoopTree;
import com.sun.source.tree.EmptyStatementTree;
import com.sun.source.tree.EnhancedForLoopTree;
import com.sun.source.tree.ExpressionStatementTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.ForLoopTree;
import com.sun.source.tree.IdentifierTree;
import com.sun.source.tree.IfTree;
import com.sun.source.tree.ImportTree;
import com.sun.source.tree.InstanceOfTree;
import com.sun.source.tree.LabeledStatementTree;
import com.sun.source.tree.LiteralTree;
import com.sun.source.tree.MemberSelectTree;
import com.sun.source.tree.MethodInvocationTree;
import com.sun.source.tree.MethodTree;
import com.sun.source.tree.ModifiersTree;
import com.sun.source.tree.NewArrayTree;
import com.sun.source.tree.NewClassTree;
import com.sun.source.tree.ParameterizedTypeTree;
import com.sun.source.tree.ParenthesizedTree;
import com.sun.source.tree.PrimitiveTypeTree;
import com.sun.source.tree.ReturnTree;
import com.sun.source.tree.StatementTree;
import com.sun.source.tree.SwitchTree;
import com.sun.source.tree.SynchronizedTree;
import com.sun.source.tree.ThrowTree;
import com.sun.source.tree.Tree;
import com.sun.source.tree.TryTree;
import com.sun.source.tree.TypeCastTree;
import com.sun.source.tree.TypeParameterTree;
import com.sun.source.tree.UnaryTree;
import com.sun.source.tree.UnionTypeTree;
import com.sun.source.tree.VariableTree;
import com.sun.source.tree.WhileLoopTree;
import com.sun.source.tree.WildcardTree;
import com.sun.source.util.TreePath;
import com.sun.source.util.TreePathScanner;
import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeScanner;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.lang.model.element.Name;
import javax.lang.model.type.TypeKind;

public final class JavaInputAstVisitor extends TreePathScanner<Void, Void> {
    private static final int MAX_ITEM_LENGTH_FOR_FILLING = 10;
    private final OpsBuilder builder;
    private final Deque<Boolean> inExpression = new ArrayDeque(Arrays.asList(false));
    private final int indentMultiplier;
    private final Indent.Const minusFour;
    private final Indent.Const minusTwo;
    private final Indent.Const plusFour;
    private final Indent.Const plusTwo;
    private static final Indent.Const ZERO = Indent.Const.ZERO;
    private static final ImmutableList<InterfaceOp> EMPTY_LIST = ImmutableList.m160of();
    private static final Predicate<ExpressionTree> IS_ARRAY_VALUE = new Predicate<ExpressionTree>() {
        @Override
        public boolean apply(ExpressionTree argument) {
            if (!(argument instanceof AssignmentTree)) {
                return false;
            }
            ExpressionTree expression = ((AssignmentTree) argument).getExpression();
            return (expression instanceof NewArrayTree) && ((NewArrayTree) expression).getType() == null;
        }
    };
    private static final Pattern FORMAT_SPECIFIER = Pattern.compile("%|\\{[0-9]\\}");

    enum DeclarationKind {
        NONE,
        FIELD,
        PARAMETER
    }

    public JavaInputAstVisitor(OpsBuilder builder, int indentMultiplier) {
        this.builder = builder;
        this.indentMultiplier = indentMultiplier;
        this.minusTwo = Indent.Const.make(-2, indentMultiplier);
        this.minusFour = Indent.Const.make(-4, indentMultiplier);
        this.plusTwo = Indent.Const.make(2, indentMultiplier);
        this.plusFour = Indent.Const.make(4, indentMultiplier);
    }

    private static final ImmutableList<InterfaceOp> breakList(Optional<Output.BreakTag> breakTag) {
        return ImmutableList.m161of(AbstractDoc.Break.make(AbstractDoc.FillMode.UNIFIED, " ", ZERO, breakTag));
    }

    private static final ImmutableList<InterfaceOp> breakFillList(Optional<Output.BreakTag> breakTag) {
        return ImmutableList.m163of(OpenOp.make(ZERO), (InterfaceOp) AbstractDoc.Break.make(AbstractDoc.FillMode.INDEPENDENT, " ", ZERO, breakTag), CloseOp.make());
    }

    private static final ImmutableList<InterfaceOp> forceBreakList(Optional<Output.BreakTag> breakTag) {
        return ImmutableList.m161of(AbstractDoc.Break.make(AbstractDoc.FillMode.FORCED, "", Indent.Const.ZERO, breakTag));
    }

    private static void walkInfix(int precedence, ExpressionTree expression, List<ExpressionTree> operands, List<String> operators) {
        if (expression instanceof BinaryTree) {
            BinaryTree binaryTree = (BinaryTree) expression;
            if (Trees.precedence(binaryTree) == precedence) {
                walkInfix(precedence, binaryTree.getLeftOperand(), operands, operators);
                operators.add(Trees.operatorName(expression));
                walkInfix(precedence, binaryTree.getRightOperand(), operands, operators);
                return;
            }
            operands.add(expression);
            return;
        }
        operands.add(expression);
    }

    static int rowLength(List<? extends ExpressionTree> row) {
        int size = 0;
        for (ExpressionTree tree : row) {
            if (tree.getKind() != Tree.Kind.NEW_ARRAY) {
                size++;
            } else {
                NewArrayTree array = (NewArrayTree) tree;
                if (array.getInitializers() == null) {
                    size++;
                } else {
                    size += rowLength(array.getInitializers());
                }
            }
        }
        return size;
    }

    private static boolean expressionsAreParallel(List<List<ExpressionTree>> rows, int column, int atLeastM) {
        Multiset<Tree.Kind> nodeTypes = HashMultiset.create();
        for (List<? extends ExpressionTree> row : rows) {
            if (column < row.size()) {
                nodeTypes.add(row.get(column).getKind());
            }
        }
        for (Multiset.Entry<Tree.Kind> nodeType : nodeTypes.entrySet()) {
            if (nodeType.getCount() >= atLeastM) {
                return true;
            }
        }
        return false;
    }

    private static Optional<? extends Input.Token> getNextToken(Input input, int position) {
        return Optional.fromNullable(input.getPositionTokenMap().mo204get(Integer.valueOf(position)));
    }

    private boolean inExpression() {
        return this.inExpression.peekLast().booleanValue();
    }

    @Override
    public Void scan(Tree tree, Void unused) {
        Deque<Boolean> deque = this.inExpression;
        deque.addLast(Boolean.valueOf((tree instanceof ExpressionTree) || deque.peekLast().booleanValue()));
        int previous = this.builder.depth();
        try {
            try {
                super.scan(tree, (Object) null);
                this.inExpression.removeLast();
                this.builder.checkClosed(previous);
                return null;
            } catch (Throwable e) {
                this.inExpression.removeLast();
                throw e;
            }
        } catch (FormattingError e2) {
            throw e2;
        } catch (Throwable t) {
            throw new FormattingError(this.builder.diagnostic(Throwables.getStackTraceAsString(t)));
        }
    }

    @Override
    public Void visitCompilationUnit(CompilationUnitTree node, Void unused) {
        boolean first = true;
        if (node.getPackageName() != null) {
            markForPartialFormat();
            visitPackage(node.getPackageName(), node.getPackageAnnotations());
            this.builder.forcedBreak();
            first = false;
        }
        if (!node.getImports().isEmpty()) {
            if (!first) {
                this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.f248YES);
            }
            for (ImportTree importDeclaration : node.getImports()) {
                markForPartialFormat();
                this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.PRESERVE);
                scan((Tree) importDeclaration, (Void) null);
                this.builder.forcedBreak();
            }
            first = false;
        }
        dropEmptyDeclarations();
        for (Tree type : node.getTypeDecls()) {
            if (type.getKind() != Tree.Kind.IMPORT) {
                if (!first) {
                    this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.f248YES);
                }
                markForPartialFormat();
                scan(type, (Void) null);
                this.builder.forcedBreak();
                first = false;
                dropEmptyDeclarations();
            }
        }
        markForPartialFormat();
        return null;
    }

    private void dropEmptyDeclarations() {
        if (this.builder.peekToken().equals(Optional.m95of(";"))) {
            while (this.builder.peekToken().equals(Optional.m95of(";"))) {
                markForPartialFormat();
                token(";");
            }
        }
    }

    @Override
    public Void visitClass(ClassTree tree, Void unused) {
        int i = C05433.$SwitchMap$com$sun$source$tree$Tree$Kind[tree.getKind().ordinal()];
        if (i == 1) {
            visitAnnotationType(tree);
            return null;
        }
        if (i == 2 || i == 3) {
            visitClassDeclaration(tree);
            return null;
        }
        if (i == 4) {
            visitEnumDeclaration(tree);
            return null;
        }
        throw new AssertionError(tree.getKind());
    }

    public void visitAnnotationType(ClassTree node) {
        sync(node);
        this.builder.open(ZERO);
        visitAndBreakModifiers(node.getModifiers(), Direction.VERTICAL, Optional.absent());
        this.builder.open(ZERO);
        token("@");
        token("interface");
        this.builder.breakOp(" ");
        visit(node.getSimpleName());
        this.builder.close();
        this.builder.close();
        if (node.getMembers() == null) {
            this.builder.open(this.plusFour);
            token(";");
            this.builder.close();
        } else {
            addBodyDeclarations(node.getMembers(), BracesOrNot.YES, FirstDeclarationsOrNot.YES);
        }
        this.builder.guessToken(";");
    }

    @Override
    public Void visitArrayAccess(ArrayAccessTree node, Void unused) {
        sync(node);
        visitDot(node);
        return null;
    }

    @Override
    public Void visitNewArray(NewArrayTree node, Void unused) {
        if (node.getType() != null) {
            this.builder.open(this.plusFour);
            token("new");
            this.builder.space();
            DimensionHelpers.TypeWithDims extractedDims = DimensionHelpers.extractDims(node.getType(), DimensionHelpers.SortedDims.YES);
            Tree base = extractedDims.node;
            Deque<ExpressionTree> dimExpressions = new ArrayDeque<>(node.getDimensions());
            Deque<List<AnnotationTree>> annotations = new ArrayDeque<>();
            annotations.addAll(extractedDims.dims);
            scan(base, (Void) null);
            this.builder.open(ZERO);
            maybeAddDims(dimExpressions, annotations);
            this.builder.close();
            this.builder.close();
        }
        if (node.getInitializers() != null) {
            if (node.getType() != null) {
                this.builder.space();
            }
            visitArrayInitializer(node.getInitializers());
        }
        return null;
    }

    public boolean visitArrayInitializer(List<? extends ExpressionTree> expressions) {
        if (expressions.isEmpty()) {
            tokenBreakTrailingComment("{", this.plusTwo);
            if (this.builder.peekToken().equals(Optional.m95of(","))) {
                token(",");
            }
            token("}", this.plusTwo);
            return false;
        }
        int cols = argumentsAreTabular(expressions);
        boolean allowFilledElementsOnOwnLine = true;
        if (cols != -1) {
            this.builder.open(this.plusTwo);
            token("{");
            this.builder.forcedBreak();
            boolean first = true;
            for (Iterable<? extends ExpressionTree> row : Iterables.partition(expressions, cols)) {
                if (!first) {
                    this.builder.forcedBreak();
                }
                this.builder.open((((ExpressionTree) row.iterator().next()).getKind() == Tree.Kind.NEW_ARRAY || cols == 1) ? ZERO : this.plusFour);
                boolean firstInRow = true;
                for (ExpressionTree item : row) {
                    if (!firstInRow) {
                        token(",");
                        this.builder.breakToFill(" ");
                    }
                    scan((Tree) item, (Void) null);
                    firstInRow = false;
                }
                this.builder.guessToken(",");
                this.builder.close();
                first = false;
            }
            this.builder.breakOp(this.minusTwo);
            this.builder.close();
            token("}", this.plusTwo);
            return false;
        }
        boolean inMemberValuePair = false;
        TreePath path = getCurrentPath();
        for (int i = 0; i < 2 && path != null; i++) {
            if (path.getLeaf().getKind() == Tree.Kind.ANNOTATION) {
                inMemberValuePair = true;
                break;
            }
            path = path.getParentPath();
        }
        boolean shortItems = hasOnlyShortItems(expressions);
        if (!shortItems && inMemberValuePair) {
            allowFilledElementsOnOwnLine = false;
        }
        this.builder.open(this.plusTwo);
        tokenBreakTrailingComment("{", this.plusTwo);
        boolean hasTrailingComma = hasTrailingToken(this.builder.getInput(), expressions, ",");
        this.builder.breakOp(hasTrailingComma ? AbstractDoc.FillMode.FORCED : AbstractDoc.FillMode.UNIFIED, "", ZERO);
        if (allowFilledElementsOnOwnLine) {
            this.builder.open(ZERO);
        }
        boolean first2 = true;
        AbstractDoc.FillMode fillMode = shortItems ? AbstractDoc.FillMode.INDEPENDENT : AbstractDoc.FillMode.UNIFIED;
        for (ExpressionTree expression : expressions) {
            if (!first2) {
                token(",");
                this.builder.breakOp(fillMode, " ", ZERO);
            }
            scan((Tree) expression, (Void) null);
            first2 = false;
        }
        this.builder.guessToken(",");
        if (allowFilledElementsOnOwnLine) {
            this.builder.close();
        }
        this.builder.breakOp(this.minusTwo);
        this.builder.close();
        token("}", this.plusTwo);
        return false;
    }

    private boolean hasOnlyShortItems(List<? extends ExpressionTree> expressions) {
        for (ExpressionTree expression : expressions) {
            int startPosition = Trees.getStartPosition(expression);
            if (this.builder.actualSize(startPosition, Trees.getEndPosition(expression, getCurrentPath()) - startPosition) >= 10) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Void visitArrayType(ArrayTypeTree node, Void unused) {
        sync(node);
        visitAnnotatedArrayType(node);
        return null;
    }

    private void visitAnnotatedArrayType(Tree node) {
        DimensionHelpers.TypeWithDims extractedDims = DimensionHelpers.extractDims(node, DimensionHelpers.SortedDims.YES);
        this.builder.open(this.plusFour);
        scan(extractedDims.node, (Void) null);
        Deque<List<AnnotationTree>> dims = new ArrayDeque<>(extractedDims.dims);
        maybeAddDims(dims);
        Verify.verify(dims.isEmpty());
        this.builder.close();
    }

    @Override
    public Void visitAssert(AssertTree node, Void unused) {
        sync(node);
        this.builder.open(ZERO);
        token("assert");
        this.builder.space();
        this.builder.open(node.getDetail() == null ? ZERO : this.plusFour);
        scan((Tree) node.getCondition(), (Void) null);
        if (node.getDetail() != null) {
            this.builder.breakOp(" ");
            token(":");
            this.builder.space();
            scan((Tree) node.getDetail(), (Void) null);
        }
        this.builder.close();
        this.builder.close();
        token(";");
        return null;
    }

    @Override
    public Void visitAssignment(AssignmentTree node, Void unused) {
        sync(node);
        this.builder.open(this.plusFour);
        scan((Tree) node.getVariable(), (Void) null);
        this.builder.space();
        splitToken(Trees.operatorName(node));
        this.builder.breakOp(" ");
        scan((Tree) node.getExpression(), (Void) null);
        this.builder.close();
        return null;
    }

    @Override
    public Void visitBlock(BlockTree node, Void unused) {
        visitBlock(node, CollapseEmptyOrNot.NO, AllowLeadingBlankLine.NO, AllowTrailingBlankLine.NO);
        return null;
    }

    @Override
    public Void visitCompoundAssignment(CompoundAssignmentTree node, Void unused) {
        sync(node);
        this.builder.open(this.plusFour);
        scan((Tree) node.getVariable(), (Void) null);
        this.builder.space();
        splitToken(Trees.operatorName(node));
        this.builder.breakOp(" ");
        scan((Tree) node.getExpression(), (Void) null);
        this.builder.close();
        return null;
    }

    @Override
    public Void visitBreak(BreakTree node, Void unused) {
        sync(node);
        this.builder.open(this.plusFour);
        token("break");
        if (node.getLabel() != null) {
            this.builder.breakOp(" ");
            visit(node.getLabel());
        }
        this.builder.close();
        token(";");
        return null;
    }

    @Override
    public Void visitTypeCast(TypeCastTree node, Void unused) {
        sync(node);
        this.builder.open(this.plusFour);
        token("(");
        scan(node.getType(), (Void) null);
        token(")");
        this.builder.breakOp(" ");
        scan((Tree) node.getExpression(), (Void) null);
        this.builder.close();
        return null;
    }

    @Override
    public Void visitNewClass(NewClassTree node, Void unused) {
        sync(node);
        this.builder.open(ZERO);
        if (node.getEnclosingExpression() != null) {
            scan((Tree) node.getEnclosingExpression(), (Void) null);
            this.builder.breakOp();
            token(".");
        }
        token("new");
        this.builder.space();
        addTypeArguments(node.getTypeArguments(), this.plusFour);
        if (node.getClassBody() != null) {
            List<InterfaceOp> ops = visitModifiers(node.getClassBody().getModifiers(), Direction.HORIZONTAL, Optional.absent());
            this.builder.addAll(ops);
        }
        scan((Tree) node.getIdentifier(), (Void) null);
        addArguments(node.getArguments(), this.plusFour);
        this.builder.close();
        if (node.getClassBody() != null) {
            addBodyDeclarations(node.getClassBody().getMembers(), BracesOrNot.YES, FirstDeclarationsOrNot.YES);
        }
        return null;
    }

    @Override
    public Void visitConditionalExpression(ConditionalExpressionTree node, Void unused) {
        sync(node);
        this.builder.open(this.plusFour);
        scan((Tree) node.getCondition(), (Void) null);
        this.builder.breakOp(" ");
        token("?");
        this.builder.space();
        scan((Tree) node.getTrueExpression(), (Void) null);
        this.builder.breakOp(" ");
        token(":");
        this.builder.space();
        scan((Tree) node.getFalseExpression(), (Void) null);
        this.builder.close();
        return null;
    }

    @Override
    public Void visitContinue(ContinueTree node, Void unused) {
        sync(node);
        this.builder.open(this.plusFour);
        token("continue");
        if (node.getLabel() != null) {
            this.builder.breakOp(" ");
            visit(node.getLabel());
        }
        token(";");
        this.builder.close();
        return null;
    }

    @Override
    public Void visitDoWhileLoop(DoWhileLoopTree node, Void unused) {
        sync(node);
        token("do");
        visitStatement(node.getStatement(), CollapseEmptyOrNot.YES, AllowLeadingBlankLine.YES, AllowTrailingBlankLine.YES);
        if (node.getStatement().getKind() == Tree.Kind.BLOCK) {
            this.builder.space();
        } else {
            this.builder.breakOp(" ");
        }
        token("while");
        this.builder.space();
        token("(");
        scan((Tree) Trees.skipParen(node.getCondition()), (Void) null);
        token(")");
        token(";");
        return null;
    }

    @Override
    public Void visitEmptyStatement(EmptyStatementTree node, Void unused) {
        sync(node);
        dropEmptyDeclarations();
        return null;
    }

    @Override
    public Void visitEnhancedForLoop(EnhancedForLoopTree node, Void unused) {
        sync(node);
        this.builder.open(ZERO);
        token("for");
        this.builder.space();
        token("(");
        this.builder.open(ZERO);
        visitToDeclare(DeclarationKind.NONE, Direction.HORIZONTAL, node.getVariable(), Optional.m95of(node.getExpression()), ":", Optional.absent());
        this.builder.close();
        token(")");
        this.builder.close();
        visitStatement(node.getStatement(), CollapseEmptyOrNot.YES, AllowLeadingBlankLine.YES, AllowTrailingBlankLine.NO);
        return null;
    }

    private void visitEnumConstantDeclaration(VariableTree enumConstant) {
        for (AnnotationTree annotation : enumConstant.getModifiers().getAnnotations()) {
            scan((Tree) annotation, (Void) null);
            this.builder.forcedBreak();
        }
        visit(enumConstant.getName());
        NewClassTree init = (NewClassTree) enumConstant.getInitializer();
        if (init.getArguments().isEmpty()) {
            this.builder.guessToken("(");
            this.builder.guessToken(")");
        } else {
            addArguments(init.getArguments(), this.plusFour);
        }
        if (init.getClassBody() != null) {
            addBodyDeclarations(init.getClassBody().getMembers(), BracesOrNot.YES, FirstDeclarationsOrNot.YES);
        }
    }

    public boolean visitEnumDeclaration(ClassTree node) {
        sync(node);
        this.builder.open(ZERO);
        visitAndBreakModifiers(node.getModifiers(), Direction.VERTICAL, Optional.absent());
        this.builder.open(this.plusFour);
        token("enum");
        this.builder.breakOp(" ");
        visit(node.getSimpleName());
        this.builder.close();
        this.builder.close();
        if (!node.getImplementsClause().isEmpty()) {
            this.builder.open(this.plusFour);
            this.builder.breakOp(" ");
            this.builder.open(this.plusFour);
            token("implements");
            this.builder.breakOp(" ");
            this.builder.open(ZERO);
            boolean first = true;
            for (Tree superInterfaceType : node.getImplementsClause()) {
                if (!first) {
                    token(",");
                    this.builder.breakToFill(" ");
                }
                scan(superInterfaceType, (Void) null);
                first = false;
            }
            this.builder.close();
            this.builder.close();
            this.builder.close();
        }
        this.builder.space();
        tokenBreakTrailingComment("{", this.plusTwo);
        ArrayList<VariableTree> enumConstants = new ArrayList<>();
        ArrayList<Tree> members = new ArrayList<>();
        for (Tree member : node.getMembers()) {
            if (member instanceof JCTree.JCVariableDecl) {
                JCTree.JCVariableDecl variableDecl = (JCTree.JCVariableDecl) member;
                if ((variableDecl.mods.flags & 16384) == 16384) {
                    enumConstants.add(variableDecl);
                }
            }
            members.add(member);
        }
        if (enumConstants.isEmpty() && members.isEmpty()) {
            this.builder.open(ZERO);
            this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.f247NO);
            token("}");
            this.builder.close();
        } else {
            this.builder.open(this.plusTwo);
            this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.f247NO);
            this.builder.forcedBreak();
            this.builder.open(ZERO);
            boolean first2 = true;
            for (VariableTree enumConstant : enumConstants) {
                if (!first2) {
                    token(",");
                    this.builder.forcedBreak();
                    this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.PRESERVE);
                }
                markForPartialFormat();
                visitEnumConstantDeclaration(enumConstant);
                first2 = false;
            }
            if (this.builder.peekToken().mo78or("").equals(",")) {
                token(",");
                this.builder.forcedBreak();
            }
            this.builder.close();
            this.builder.close();
            if (this.builder.peekToken().equals(Optional.m95of(";"))) {
                this.builder.open(this.plusTwo);
                token(";");
                this.builder.forcedBreak();
                dropEmptyDeclarations();
                this.builder.close();
            }
            this.builder.open(ZERO);
            addBodyDeclarations(members, BracesOrNot.NO, FirstDeclarationsOrNot.NO);
            this.builder.forcedBreak();
            this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.f247NO);
            token("}", this.plusTwo);
            this.builder.close();
        }
        this.builder.guessToken(";");
        return false;
    }

    @Override
    public Void visitExpressionStatement(ExpressionStatementTree node, Void unused) {
        sync(node);
        scan((Tree) node.getExpression(), (Void) null);
        token(";");
        return null;
    }

    @Override
    public Void visitVariable(VariableTree node, Void unused) {
        sync(node);
        visitVariables(ImmutableList.m161of(node), DeclarationKind.NONE, fieldAnnotationDirection(node.getModifiers()));
        return null;
    }

    void visitVariables(List<VariableTree> fragments, DeclarationKind declarationKind, Direction annotationDirection) {
        if (fragments.size() != 1) {
            declareMany(fragments, annotationDirection);
        } else {
            VariableTree fragment = fragments.get(0);
            declareOne(declarationKind, annotationDirection, Optional.m95of(fragment.getModifiers()), fragment.getType(), VarArgsOrNot.fromVariable(fragment), ImmutableList.m160of(), fragment.getName(), "", "=", Optional.fromNullable(fragment.getInitializer()), Optional.m95of(";"), Optional.absent(), Optional.fromNullable(variableFragmentDims(true, 0, fragment.getType())));
        }
    }

    private DimensionHelpers.TypeWithDims variableFragmentDims(boolean first, int leadingDims, Tree type) {
        if (type == null) {
            return null;
        }
        if (first) {
            return DimensionHelpers.extractDims(type, DimensionHelpers.SortedDims.YES);
        }
        DimensionHelpers.TypeWithDims dims = DimensionHelpers.extractDims(type, DimensionHelpers.SortedDims.NO);
        ImmutableList<List<AnnotationTree>> immutableListSubList = dims.dims;
        if (leadingDims > 0) {
            immutableListSubList = immutableListSubList.subList(0, dims.dims.size() - leadingDims);
        }
        return new DimensionHelpers.TypeWithDims(null, immutableListSubList);
    }

    @Override
    public Void visitForLoop(ForLoopTree node, Void unused) {
        Indent.Const r1;
        sync(node);
        token("for");
        this.builder.space();
        token("(");
        this.builder.open(this.plusFour);
        OpsBuilder opsBuilder = this.builder;
        if (node.getInitializer().size() > 1 && node.getInitializer().get(0).getKind() == Tree.Kind.EXPRESSION_STATEMENT) {
            r1 = this.plusFour;
        } else {
            r1 = ZERO;
        }
        opsBuilder.open(r1);
        if (!node.getInitializer().isEmpty()) {
            if (node.getInitializer().get(0).getKind() == Tree.Kind.VARIABLE) {
                PeekingIterator<StatementTree> it = Iterators.peekingIterator(node.getInitializer().iterator());
                visitVariables(variableFragments(it, it.next()), DeclarationKind.NONE, Direction.HORIZONTAL);
            } else {
                boolean first = true;
                this.builder.open(ZERO);
                for (StatementTree t : node.getInitializer()) {
                    if (!first) {
                        token(",");
                        this.builder.breakOp(" ");
                    }
                    scan((Tree) ((ExpressionStatementTree) t).getExpression(), (Void) null);
                    first = false;
                }
                token(";");
                this.builder.close();
            }
        } else {
            token(";");
        }
        this.builder.close();
        this.builder.breakOp(" ");
        if (node.getCondition() != null) {
            scan((Tree) node.getCondition(), (Void) null);
        }
        token(";");
        if (!node.getUpdate().isEmpty()) {
            this.builder.breakOp(" ");
            this.builder.open(node.getUpdate().size() <= 1 ? ZERO : this.plusFour);
            boolean firstUpdater = true;
            for (ExpressionStatementTree updater : node.getUpdate()) {
                if (!firstUpdater) {
                    token(",");
                    this.builder.breakToFill(" ");
                }
                scan((Tree) updater.getExpression(), (Void) null);
                firstUpdater = false;
            }
            this.builder.guessToken(";");
            this.builder.close();
        } else {
            this.builder.space();
        }
        this.builder.close();
        token(")");
        visitStatement(node.getStatement(), CollapseEmptyOrNot.YES, AllowLeadingBlankLine.YES, AllowTrailingBlankLine.NO);
        return null;
    }

    @Override
    public Void visitIf(IfTree node, Void unused) {
        sync(node);
        List<ExpressionTree> expressions = new ArrayList<>();
        List<StatementTree> statements = new ArrayList<>();
        IfTree node2 = node;
        while (true) {
            expressions.add(node2.getCondition());
            statements.add(node2.getThenStatement());
            if (node2.getElseStatement() == null || node2.getElseStatement().getKind() != Tree.Kind.IF) {
                break;
            }
            node2 = (IfTree) node2.getElseStatement();
        }
        this.builder.open(ZERO);
        boolean first = true;
        boolean followingBlock = false;
        int expressionsN = expressions.size();
        int i = 0;
        while (i < expressionsN) {
            if (!first) {
                if (followingBlock) {
                    this.builder.space();
                } else {
                    this.builder.forcedBreak();
                }
                token("else");
                this.builder.space();
            }
            token("if");
            this.builder.space();
            token("(");
            scan((Tree) Trees.skipParen(expressions.get(i)), (Void) null);
            token(")");
            boolean z = false;
            boolean onlyClause = expressionsN == 1 && node2.getElseStatement() == null;
            boolean trailingClauses = i < expressionsN + (-1) || node2.getElseStatement() != null;
            visitStatement(statements.get(i), CollapseEmptyOrNot.valueOf(onlyClause), AllowLeadingBlankLine.YES, AllowTrailingBlankLine.valueOf(trailingClauses));
            if (statements.get(i).getKind() == Tree.Kind.BLOCK) {
                z = true;
            }
            followingBlock = z;
            first = false;
            i++;
        }
        if (node2.getElseStatement() != null) {
            if (followingBlock) {
                this.builder.space();
            } else {
                this.builder.forcedBreak();
            }
            token("else");
            visitStatement(node2.getElseStatement(), CollapseEmptyOrNot.NO, AllowLeadingBlankLine.YES, AllowTrailingBlankLine.NO);
        }
        this.builder.close();
        return null;
    }

    @Override
    public Void visitImport(ImportTree node, Void unused) {
        sync(node);
        token("import");
        this.builder.space();
        if (node.isStatic()) {
            token("static");
            this.builder.space();
        }
        visitName(node.getQualifiedIdentifier());
        token(";");
        dropEmptyDeclarations();
        return null;
    }

    @Override
    public Void visitBinary(BinaryTree node, Void unused) {
        sync(node);
        List<ExpressionTree> operands = new ArrayList<>();
        List<String> operators = new ArrayList<>();
        walkInfix(Trees.precedence(node), node, operands, operators);
        AbstractDoc.FillMode fillMode = hasOnlyShortItems(operands) ? AbstractDoc.FillMode.INDEPENDENT : AbstractDoc.FillMode.UNIFIED;
        this.builder.open(this.plusFour);
        scan((Tree) operands.get(0), (Void) null);
        int operatorsN = operators.size();
        for (int i = 0; i < operatorsN; i++) {
            this.builder.breakOp(fillMode, " ", ZERO);
            this.builder.m443op(operators.get(i));
            this.builder.space();
            scan((Tree) operands.get(i + 1), (Void) null);
        }
        this.builder.close();
        return null;
    }

    @Override
    public Void visitInstanceOf(InstanceOfTree node, Void unused) {
        sync(node);
        this.builder.open(this.plusFour);
        scan((Tree) node.getExpression(), (Void) null);
        this.builder.breakOp(" ");
        this.builder.open(ZERO);
        token("instanceof");
        this.builder.breakOp(" ");
        scan(node.getType(), (Void) null);
        this.builder.close();
        this.builder.close();
        return null;
    }

    @Override
    public Void visitLabeledStatement(LabeledStatementTree node, Void unused) {
        sync(node);
        this.builder.open(ZERO);
        visit(node.getLabel());
        token(":");
        this.builder.forcedBreak();
        this.builder.close();
        scan((Tree) node.getStatement(), (Void) null);
        return null;
    }

    @Override
    public Void visitAnnotation(AnnotationTree node, Void unused) {
        sync(node);
        if (visitSingleMemberAnnotation(node)) {
            return null;
        }
        this.builder.open(ZERO);
        token("@");
        scan(node.getAnnotationType(), (Void) null);
        if (!node.getArguments().isEmpty()) {
            this.builder.open(this.plusTwo);
            token("(");
            this.builder.breakOp();
            boolean first = true;
            boolean hasArrayInitializer = Iterables.m267any(node.getArguments(), IS_ARRAY_VALUE);
            for (ExpressionTree argument : node.getArguments()) {
                if (!first) {
                    token(",");
                    if (hasArrayInitializer) {
                        this.builder.forcedBreak();
                    } else {
                        this.builder.breakOp(" ");
                    }
                }
                if (argument instanceof AssignmentTree) {
                    visitAnnotationArgument((AssignmentTree) argument);
                } else {
                    scan((Tree) argument, (Void) null);
                }
                first = false;
            }
            this.builder.breakOp(AbstractDoc.FillMode.UNIFIED, "", this.minusTwo, Optional.absent());
            this.builder.close();
            token(")", this.plusTwo);
            this.builder.close();
            return null;
        }
        if (this.builder.peekToken().equals(Optional.m95of("("))) {
            token("(");
            token(")");
        }
        this.builder.close();
        return null;
    }

    public void visitAnnotationArgument(AssignmentTree node) {
        boolean isArrayInitializer = node.getExpression().getKind() == Tree.Kind.NEW_ARRAY;
        sync(node);
        this.builder.open(isArrayInitializer ? ZERO : this.plusFour);
        scan((Tree) node.getVariable(), (Void) null);
        this.builder.space();
        token("=");
        if (isArrayInitializer) {
            this.builder.space();
        } else {
            this.builder.breakOp(" ");
        }
        scan((Tree) node.getExpression(), (Void) null);
        this.builder.close();
    }

    @Override
    public Void visitMethod(MethodTree node, Void unused) {
        sync(node);
        List<? extends AnnotationTree> annotations = node.getModifiers().getAnnotations();
        List<? extends AnnotationTree> returnTypeAnnotations = ImmutableList.m160of();
        if (!node.getTypeParameters().isEmpty() && !annotations.isEmpty()) {
            int typeParameterStart = Trees.getStartPosition(node.getTypeParameters().get(0));
            for (int i = 0; i < annotations.size(); i++) {
                if (Trees.getStartPosition(annotations.get(i)) > typeParameterStart) {
                    returnTypeAnnotations = annotations.subList(i, annotations.size());
                    annotations = annotations.subList(0, i);
                    break;
                }
            }
        }
        this.builder.addAll(visitModifiers(annotations, Direction.VERTICAL, Optional.absent()));
        Tree baseReturnType = null;
        Deque<List<AnnotationTree>> dims = null;
        if (node.getReturnType() != null) {
            DimensionHelpers.TypeWithDims extractedDims = DimensionHelpers.extractDims(node.getReturnType(), DimensionHelpers.SortedDims.YES);
            baseReturnType = extractedDims.node;
            dims = new ArrayDeque<>(extractedDims.dims);
        }
        this.builder.open(this.plusFour);
        Output.BreakTag breakBeforeName = genSym();
        Output.BreakTag breakBeforeType = genSym();
        this.builder.open(ZERO);
        boolean first = true;
        if (!node.getTypeParameters().isEmpty()) {
            token("<");
            typeParametersRest(node.getTypeParameters(), this.plusFour);
            if (!returnTypeAnnotations.isEmpty()) {
                this.builder.breakToFill(" ");
                visitAnnotations(returnTypeAnnotations, BreakOrNot.NO, BreakOrNot.NO);
            }
            first = false;
        }
        boolean openedNameAndTypeScope = false;
        if (baseReturnType != null) {
            if (!first) {
                this.builder.breakOp(AbstractDoc.FillMode.INDEPENDENT, " ", ZERO, Optional.m95of(breakBeforeType));
            } else {
                first = false;
            }
            if (0 == 0) {
                this.builder.open(Indent.C0531If.make(breakBeforeType, this.plusFour, ZERO));
                openedNameAndTypeScope = true;
            }
            scan(baseReturnType, (Void) null);
            maybeAddDims(dims);
        }
        if (!first) {
            this.builder.breakOp(AbstractDoc.FillMode.INDEPENDENT, " ", ZERO, Optional.m95of(breakBeforeName));
        }
        if (!openedNameAndTypeScope) {
            this.builder.open(ZERO);
        }
        String name = node.getName().toString();
        if (name.equals("<init>")) {
            name = this.builder.peekToken().mo75get();
        }
        token(name);
        token("(");
        this.builder.close();
        this.builder.close();
        this.builder.open(Indent.C0531If.make(breakBeforeName, this.plusFour, ZERO));
        this.builder.open(Indent.C0531If.make(breakBeforeType, this.plusFour, ZERO));
        this.builder.open(ZERO);
        if (!node.getParameters().isEmpty()) {
            this.builder.breakToFill("");
            visitFormals(Optional.absent(), node.getParameters());
        }
        token(")");
        if (dims != null) {
            maybeAddDims(dims);
        }
        if (!node.getThrows().isEmpty()) {
            this.builder.breakToFill(" ");
            this.builder.open(this.plusFour);
            visitThrowsClause(node.getThrows());
            this.builder.close();
        }
        if (node.getDefaultValue() != null) {
            this.builder.space();
            token("default");
            if (node.getDefaultValue().getKind() == Tree.Kind.NEW_ARRAY) {
                this.builder.open(this.minusFour);
                this.builder.space();
                scan(node.getDefaultValue(), (Void) null);
                this.builder.close();
            } else {
                this.builder.open(ZERO);
                this.builder.breakToFill(" ");
                scan(node.getDefaultValue(), (Void) null);
                this.builder.close();
            }
        }
        this.builder.close();
        this.builder.close();
        this.builder.close();
        if (node.getBody() == null) {
            token(";");
        } else {
            this.builder.space();
            OpsBuilder opsBuilder = this.builder;
            AbstractDoc.Token.RealOrImaginary realOrImaginary = AbstractDoc.Token.RealOrImaginary.REAL;
            Indent.Const r9 = this.plusTwo;
            opsBuilder.token("{", realOrImaginary, r9, Optional.m95of(r9));
        }
        this.builder.close();
        if (node.getBody() != null) {
            methodBody(node);
        }
        return null;
    }

    private void methodBody(MethodTree node) {
        if (node.getBody().getStatements().isEmpty()) {
            this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.f247NO);
        } else {
            this.builder.open(this.plusTwo);
            this.builder.forcedBreak();
            this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.PRESERVE);
            visitStatements(node.getBody().getStatements());
            this.builder.close();
            this.builder.forcedBreak();
            this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.f247NO);
            markForPartialFormat();
        }
        token("}", this.plusTwo);
    }

    @Override
    public Void visitMethodInvocation(MethodInvocationTree node, Void unused) {
        sync(node);
        visitDot(node);
        return null;
    }

    @Override
    public Void visitMemberSelect(MemberSelectTree node, Void unused) {
        sync(node);
        visitDot(node);
        return null;
    }

    @Override
    public Void visitLiteral(LiteralTree node, Void unused) {
        sync(node);
        String sourceForNode = Trees.getSourceForNode(node, getCurrentPath());
        if (sourceForNode.startsWith("-")) {
            token("-");
            sourceForNode = sourceForNode.substring(1).trim();
        }
        token(sourceForNode);
        return null;
    }

    private void visitPackage(ExpressionTree packageName, List<? extends AnnotationTree> packageAnnotations) {
        if (!packageAnnotations.isEmpty()) {
            for (AnnotationTree annotation : packageAnnotations) {
                this.builder.forcedBreak();
                scan((Tree) annotation, (Void) null);
            }
            this.builder.forcedBreak();
        }
        this.builder.open(this.plusFour);
        token("package");
        this.builder.space();
        visitName(packageName);
        this.builder.close();
        token(";");
    }

    @Override
    public Void visitParameterizedType(ParameterizedTypeTree node, Void unused) {
        sync(node);
        if (node.getTypeArguments().isEmpty()) {
            scan(node.getType(), (Void) null);
            token("<");
            token(">");
        } else {
            this.builder.open(this.plusFour);
            scan(node.getType(), (Void) null);
            token("<");
            this.builder.breakOp();
            this.builder.open(ZERO);
            boolean first = true;
            for (Tree typeArgument : node.getTypeArguments()) {
                if (!first) {
                    token(",");
                    this.builder.breakToFill(" ");
                }
                scan(typeArgument, (Void) null);
                first = false;
            }
            this.builder.close();
            this.builder.close();
            token(">");
        }
        return null;
    }

    @Override
    public Void visitParenthesized(ParenthesizedTree node, Void unused) {
        token("(");
        scan((Tree) node.getExpression(), (Void) null);
        token(")");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public Void visitUnary(UnaryTree unaryTree, Void unused) {
        sync(unaryTree);
        String operatorName = Trees.operatorName(unaryTree);
        if (OpUtil.isPostUnaryOp(((JCTree) unaryTree).getTag())) {
            scan((Tree) unaryTree.getExpression(), (Void) null);
            splitToken(operatorName);
        } else {
            splitToken(operatorName);
            if (ambiguousUnaryOperator(unaryTree, operatorName)) {
                this.builder.space();
            }
            scan((Tree) unaryTree.getExpression(), (Void) null);
        }
        return null;
    }

    private void splitToken(String operatorName) {
        for (int i = 0; i < operatorName.length(); i++) {
            token(String.valueOf(operatorName.charAt(i)));
        }
    }

    private boolean ambiguousUnaryOperator(UnaryTree node, String operatorName) {
        int i = C05433.$SwitchMap$com$sun$source$tree$Tree$Kind[node.getKind().ordinal()];
        if ((i != 5 && i != 6) || !(node.getExpression() instanceof UnaryTree)) {
            return false;
        }
        int tag = ((JCTree) node.getExpression()).getTag();
        return !OpUtil.isPostUnaryOp(tag) && Trees.operatorName(node).startsWith(operatorName);
    }

    static class C05433 {
        static final int[] $SwitchMap$javax$lang$model$type$TypeKind;

        static {
            int[] iArr = new int[TypeKind.values().length];
            $SwitchMap$javax$lang$model$type$TypeKind = iArr;
            try {
                iArr[TypeKind.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.INT.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.CHAR.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.VOID.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            int[] iArr2 = new int[Tree.Kind.values().length];
            $SwitchMap$com$sun$source$tree$Tree$Kind = iArr2;
            try {
                iArr2[Tree.Kind.ANNOTATION_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError e10) {
            }
            try {
                $SwitchMap$com$sun$source$tree$Tree$Kind[Tree.Kind.CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError e11) {
            }
            try {
                $SwitchMap$com$sun$source$tree$Tree$Kind[Tree.Kind.INTERFACE.ordinal()] = 3;
            } catch (NoSuchFieldError e12) {
            }
            try {
                $SwitchMap$com$sun$source$tree$Tree$Kind[Tree.Kind.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError e13) {
            }
            try {
                $SwitchMap$com$sun$source$tree$Tree$Kind[Tree.Kind.UNARY_MINUS.ordinal()] = 5;
            } catch (NoSuchFieldError e14) {
            }
            try {
                $SwitchMap$com$sun$source$tree$Tree$Kind[Tree.Kind.UNARY_PLUS.ordinal()] = 6;
            } catch (NoSuchFieldError e15) {
            }
            try {
                $SwitchMap$com$sun$source$tree$Tree$Kind[Tree.Kind.BLOCK.ordinal()] = 7;
            } catch (NoSuchFieldError e16) {
            }
            try {
                $SwitchMap$com$sun$source$tree$Tree$Kind[Tree.Kind.MEMBER_SELECT.ordinal()] = 8;
            } catch (NoSuchFieldError e17) {
            }
            try {
                $SwitchMap$com$sun$source$tree$Tree$Kind[Tree.Kind.METHOD_INVOCATION.ordinal()] = 9;
            } catch (NoSuchFieldError e18) {
            }
            try {
                $SwitchMap$com$sun$source$tree$Tree$Kind[Tree.Kind.IDENTIFIER.ordinal()] = 10;
            } catch (NoSuchFieldError e19) {
            }
            try {
                $SwitchMap$com$sun$source$tree$Tree$Kind[Tree.Kind.STRING_LITERAL.ordinal()] = 11;
            } catch (NoSuchFieldError e20) {
            }
            try {
                $SwitchMap$com$sun$source$tree$Tree$Kind[Tree.Kind.PLUS.ordinal()] = 12;
            } catch (NoSuchFieldError e21) {
            }
        }
    }

    @Override
    public Void visitPrimitiveType(PrimitiveTypeTree node, Void unused) {
        sync(node);
        switch (C05433.$SwitchMap$javax$lang$model$type$TypeKind[node.getPrimitiveTypeKind().ordinal()]) {
            case 1:
                token("boolean");
                return null;
            case 2:
                token("byte");
                return null;
            case 3:
                token("short");
                return null;
            case 4:
                token("int");
                return null;
            case 5:
                token("long");
                return null;
            case 6:
                token("char");
                return null;
            case 7:
                token("float");
                return null;
            case 8:
                token("double");
                return null;
            case 9:
                token("void");
                return null;
            default:
                throw new AssertionError(node.getPrimitiveTypeKind());
        }
    }

    public boolean visit(Name name) {
        token(name.toString());
        return false;
    }

    @Override
    public Void visitReturn(ReturnTree node, Void unused) {
        sync(node);
        token("return");
        if (node.getExpression() != null) {
            this.builder.space();
            scan((Tree) node.getExpression(), (Void) null);
        }
        token(";");
        return null;
    }

    boolean visitSingleMemberAnnotation(AnnotationTree node) {
        if (node.getArguments().size() != 1) {
            return false;
        }
        ExpressionTree value = (ExpressionTree) Iterables.getOnlyElement(node.getArguments());
        if (value.getKind() == Tree.Kind.ASSIGNMENT) {
            return false;
        }
        boolean isArrayInitializer = value.getKind() == Tree.Kind.NEW_ARRAY;
        this.builder.open(isArrayInitializer ? ZERO : this.plusFour);
        token("@");
        scan(node.getAnnotationType(), (Void) null);
        token("(");
        if (!isArrayInitializer) {
            this.builder.breakOp();
        }
        scan((Tree) value, (Void) null);
        this.builder.close();
        token(")");
        return true;
    }

    @Override
    public Void visitCase(CaseTree node, Void unused) {
        sync(node);
        markForPartialFormat();
        this.builder.forcedBreak();
        if (node.getExpression() == null) {
            token("default", this.plusTwo);
            token(":");
        } else {
            token("case", this.plusTwo);
            this.builder.space();
            scan((Tree) node.getExpression(), (Void) null);
            token(":");
        }
        this.builder.open(this.plusTwo);
        try {
            this.inExpression.addLast(true);
            visitStatements(node.getStatements());
            this.inExpression.removeLast();
            this.builder.close();
            return null;
        } catch (Throwable th) {
            this.inExpression.removeLast();
            throw th;
        }
    }

    @Override
    public Void visitSwitch(SwitchTree node, Void unused) {
        sync(node);
        token("switch");
        this.builder.space();
        token("(");
        scan((Tree) Trees.skipParen(node.getExpression()), (Void) null);
        token(")");
        this.builder.space();
        tokenBreakTrailingComment("{", this.plusTwo);
        this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.f247NO);
        this.builder.open(this.plusTwo);
        boolean first = true;
        for (CaseTree caseTree : node.getCases()) {
            if (!first) {
                this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.PRESERVE);
            }
            scan((Tree) caseTree, (Void) null);
            first = false;
        }
        this.builder.close();
        this.builder.forcedBreak();
        this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.f247NO);
        token("}", this.plusFour);
        return null;
    }

    @Override
    public Void visitSynchronized(SynchronizedTree node, Void unused) {
        sync(node);
        token("synchronized");
        this.builder.space();
        token("(");
        this.builder.open(this.plusFour);
        this.builder.breakOp();
        scan((Tree) Trees.skipParen(node.getExpression()), (Void) null);
        this.builder.close();
        token(")");
        this.builder.space();
        scan((Tree) node.getBlock(), (Void) null);
        return null;
    }

    @Override
    public Void visitThrow(ThrowTree node, Void unused) {
        sync(node);
        token("throw");
        this.builder.space();
        scan((Tree) node.getExpression(), (Void) null);
        token(";");
        return null;
    }

    @Override
    public Void visitTry(TryTree node, Void unused) {
        sync(node);
        this.builder.open(ZERO);
        token("try");
        this.builder.space();
        if (!node.getResources().isEmpty()) {
            token("(");
            this.builder.open(node.getResources().size() > 1 ? this.plusFour : ZERO);
            Iterator<? extends Tree> it = node.getResources().iterator();
            boolean first = true;
            while (first) {
                Tree resource = it.next();
                if (!first) {
                    this.builder.forcedBreak();
                }
                VariableTree variableTree = (VariableTree) resource;
                declareOne(DeclarationKind.PARAMETER, fieldAnnotationDirection(variableTree.getModifiers()), Optional.m95of(variableTree.getModifiers()), variableTree.getType(), VarArgsOrNot.NO, ImmutableList.m160of(), variableTree.getName(), "", "=", Optional.fromNullable(variableTree.getInitializer()), Optional.absent(), Optional.absent(), Optional.absent());
                if (this.builder.peekToken().equals(Optional.m95of(";"))) {
                    token(";");
                    this.builder.space();
                }
                first = false;
            }
            if (this.builder.peekToken().equals(Optional.m95of(";"))) {
                token(";");
                this.builder.space();
            }
            token(")");
            this.builder.close();
            this.builder.space();
        }
        boolean trailingClauses = (node.getCatches().isEmpty() && node.getFinallyBlock() == null) ? false : true;
        visitBlock(node.getBlock(), CollapseEmptyOrNot.valueOf(!trailingClauses), AllowLeadingBlankLine.YES, AllowTrailingBlankLine.valueOf(trailingClauses));
        int i = 0;
        while (i < node.getCatches().size()) {
            CatchTree catchClause = node.getCatches().get(i);
            visitCatchClause(catchClause, AllowTrailingBlankLine.valueOf(i < node.getCatches().size() - 1 || node.getFinallyBlock() != null));
            i++;
        }
        if (node.getFinallyBlock() != null) {
            this.builder.space();
            token("finally");
            this.builder.space();
            visitBlock(node.getFinallyBlock(), CollapseEmptyOrNot.NO, AllowLeadingBlankLine.YES, AllowTrailingBlankLine.NO);
        }
        this.builder.close();
        return null;
    }

    public void visitClassDeclaration(ClassTree node) {
        sync(node);
        List<InterfaceOp> breaks = visitModifiers(node.getModifiers(), Direction.VERTICAL, Optional.absent());
        boolean hasSuperclassType = node.getExtendsClause() != null;
        boolean hasSuperInterfaceTypes = !node.getImplementsClause().isEmpty();
        this.builder.addAll(breaks);
        token(node.getKind() == Tree.Kind.INTERFACE ? "interface" : "class");
        this.builder.space();
        visit(node.getSimpleName());
        if (!node.getTypeParameters().isEmpty()) {
            token("<");
        }
        this.builder.open(this.plusFour);
        if (!node.getTypeParameters().isEmpty()) {
            typeParametersRest(node.getTypeParameters(), (hasSuperclassType || hasSuperInterfaceTypes) ? this.plusFour : ZERO);
        }
        if (hasSuperclassType) {
            this.builder.breakToFill(" ");
            token("extends");
            this.builder.space();
            scan(node.getExtendsClause(), (Void) null);
        }
        if (hasSuperInterfaceTypes) {
            this.builder.breakToFill(" ");
            this.builder.open(node.getImplementsClause().size() > 1 ? this.plusFour : ZERO);
            token(node.getKind() != Tree.Kind.INTERFACE ? "implements" : "extends");
            this.builder.space();
            boolean first = true;
            for (Tree superInterfaceType : node.getImplementsClause()) {
                if (!first) {
                    token(",");
                    this.builder.breakOp(" ");
                }
                scan(superInterfaceType, (Void) null);
                first = false;
            }
            this.builder.close();
        }
        this.builder.close();
        if (node.getMembers() == null) {
            token(";");
        } else {
            addBodyDeclarations(node.getMembers(), BracesOrNot.YES, FirstDeclarationsOrNot.YES);
        }
        dropEmptyDeclarations();
    }

    @Override
    public Void visitTypeParameter(TypeParameterTree node, Void unused) {
        sync(node);
        this.builder.open(ZERO);
        visit(node.getName());
        if (!node.getBounds().isEmpty()) {
            this.builder.space();
            token("extends");
            this.builder.open(this.plusFour);
            this.builder.breakOp(" ");
            this.builder.open(this.plusFour);
            boolean first = true;
            for (Tree typeBound : node.getBounds()) {
                if (!first) {
                    this.builder.breakToFill(" ");
                    token("&");
                    this.builder.space();
                }
                scan(typeBound, (Void) null);
                first = false;
            }
            this.builder.close();
            this.builder.close();
        }
        this.builder.close();
        return null;
    }

    @Override
    public Void visitUnionType(UnionTypeTree node, Void unused) {
        throw new IllegalStateException("expected manual descent into union types");
    }

    @Override
    public Void visitWhileLoop(WhileLoopTree node, Void unused) {
        sync(node);
        token("while");
        this.builder.space();
        token("(");
        scan((Tree) Trees.skipParen(node.getCondition()), (Void) null);
        token(")");
        visitStatement(node.getStatement(), CollapseEmptyOrNot.YES, AllowLeadingBlankLine.YES, AllowTrailingBlankLine.NO);
        return null;
    }

    @Override
    public Void visitWildcard(WildcardTree node, Void unused) {
        sync(node);
        this.builder.open(ZERO);
        token("?");
        if (node.getBound() != null) {
            this.builder.open(this.plusFour);
            this.builder.space();
            token(node.getKind() == Tree.Kind.EXTENDS_WILDCARD ? "extends" : "super");
            this.builder.breakOp(" ");
            scan(node.getBound(), (Void) null);
            this.builder.close();
        }
        this.builder.close();
        return null;
    }

    private void visitAnnotations(List<? extends AnnotationTree> annotations, BreakOrNot breakBefore, BreakOrNot breakAfter) {
        if (!annotations.isEmpty()) {
            if (breakBefore.isYes()) {
                this.builder.breakToFill(" ");
            }
            boolean first = true;
            for (AnnotationTree annotation : annotations) {
                if (!first) {
                    this.builder.breakToFill(" ");
                }
                scan((Tree) annotation, (Void) null);
                first = false;
            }
            if (breakAfter.isYes()) {
                this.builder.breakToFill(" ");
            }
        }
    }

    private void visitBlock(BlockTree node, CollapseEmptyOrNot collapseEmptyOrNot, AllowLeadingBlankLine allowLeadingBlankLine, AllowTrailingBlankLine allowTrailingBlankLine) {
        sync(node);
        if (node.isStatic()) {
            token("static");
            this.builder.space();
        }
        if (collapseEmptyOrNot.isYes() && node.getStatements().isEmpty()) {
            if (this.builder.peekToken().equals(Optional.m95of(";"))) {
                token(";");
                return;
            }
            tokenBreakTrailingComment("{", this.plusTwo);
            this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.f247NO);
            token("}", this.plusTwo);
            return;
        }
        this.builder.open(ZERO);
        this.builder.open(this.plusTwo);
        tokenBreakTrailingComment("{", this.plusTwo);
        if (allowLeadingBlankLine == AllowLeadingBlankLine.NO) {
            this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.f247NO);
        } else {
            this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.PRESERVE);
        }
        visitStatements(node.getStatements());
        this.builder.close();
        this.builder.forcedBreak();
        this.builder.close();
        if (allowTrailingBlankLine == AllowTrailingBlankLine.NO) {
            this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.f247NO);
        } else {
            this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.PRESERVE);
        }
        markForPartialFormat();
        token("}", this.plusTwo);
    }

    private void visitStatement(StatementTree node, CollapseEmptyOrNot collapseEmptyOrNot, AllowLeadingBlankLine allowLeadingBlank, AllowTrailingBlankLine allowTrailingBlank) {
        sync(node);
        if (C05433.$SwitchMap$com$sun$source$tree$Tree$Kind[node.getKind().ordinal()] == 7) {
            this.builder.space();
            visitBlock((BlockTree) node, collapseEmptyOrNot, allowLeadingBlank, allowTrailingBlank);
        } else {
            this.builder.open(this.plusTwo);
            this.builder.breakOp(" ");
            scan((Tree) node, (Void) null);
            this.builder.close();
        }
    }

    private void visitStatements(List<? extends StatementTree> statements) {
        boolean first = true;
        PeekingIterator<StatementTree> it = Iterators.peekingIterator(statements.iterator());
        dropEmptyDeclarations();
        while (it.hasNext()) {
            StatementTree tree = it.next();
            this.builder.forcedBreak();
            if (!first) {
                this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.PRESERVE);
            }
            markForPartialFormat();
            first = false;
            List<VariableTree> fragments = variableFragments(it, tree);
            if (!fragments.isEmpty()) {
                visitVariables(fragments, DeclarationKind.NONE, canLocalHaveHorizontalAnnotations(fragments.get(0).getModifiers()));
            } else {
                scan((Tree) tree, (Void) null);
            }
        }
    }

    void visitAndBreakModifiers(ModifiersTree modifiers, Direction annotationDirection, Optional<Output.BreakTag> declarationAnnotationBreak) {
        this.builder.addAll(visitModifiers(modifiers, annotationDirection, declarationAnnotationBreak));
    }

    @Override
    public Void visitModifiers(ModifiersTree node, Void unused) {
        throw new IllegalStateException("expected manual descent into modifiers");
    }

    private List<InterfaceOp> visitModifiers(ModifiersTree modifiersTree, Direction annotationsDirection, Optional<Output.BreakTag> declarationAnnotationBreak) {
        return visitModifiers(modifiersTree.getAnnotations(), annotationsDirection, declarationAnnotationBreak);
    }

    private List<InterfaceOp> visitModifiers(List<? extends AnnotationTree> annotationTrees, Direction annotationsDirection, Optional<Output.BreakTag> declarationAnnotationBreak) {
        ImmutableList<InterfaceOp> trailingBreak;
        ImmutableList<InterfaceOp> immutableListBreakList;
        if (annotationTrees.isEmpty() && !nextIsModifier()) {
            return EMPTY_LIST;
        }
        Deque<AnnotationTree> annotations = new ArrayDeque<>(annotationTrees);
        this.builder.open(ZERO);
        boolean first = true;
        boolean lastWasAnnotation = false;
        while (!annotations.isEmpty() && !nextIsModifier()) {
            if (!first) {
                OpsBuilder opsBuilder = this.builder;
                if (annotationsDirection.isVertical()) {
                    immutableListBreakList = forceBreakList(declarationAnnotationBreak);
                } else {
                    immutableListBreakList = breakList(declarationAnnotationBreak);
                }
                opsBuilder.addAll(immutableListBreakList);
            }
            scan((Tree) annotations.removeFirst(), (Void) null);
            first = false;
            lastWasAnnotation = true;
        }
        this.builder.close();
        if (annotationsDirection.isVertical()) {
            trailingBreak = forceBreakList(declarationAnnotationBreak);
        } else {
            trailingBreak = breakList(declarationAnnotationBreak);
        }
        if (annotations.isEmpty() && !nextIsModifier()) {
            return trailingBreak;
        }
        if (lastWasAnnotation) {
            this.builder.addAll(trailingBreak);
        }
        this.builder.open(ZERO);
        boolean first2 = true;
        while (true) {
            if (nextIsModifier() || !annotations.isEmpty()) {
                if (!first2) {
                    this.builder.addAll(breakFillList(Optional.absent()));
                }
                if (nextIsModifier()) {
                    token(this.builder.peekToken().mo75get());
                } else {
                    scan((Tree) annotations.removeFirst(), (Void) null);
                }
                first2 = false;
            } else {
                this.builder.close();
                return breakFillList(Optional.absent());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    boolean nextIsModifier() {
        switch (this.builder.peekToken().mo75get()) {
            case "public":
            case "protected":
            case "private":
            case "abstract":
            case "static":
            case "final":
            case "transient":
            case "volatile":
            case "synchronized":
            case "native":
            case "strictfp":
            case "default":
                return true;
            default:
                return false;
        }
    }

    @Override
    public Void visitCatch(CatchTree node, Void unused) {
        throw new IllegalStateException("expected manual descent into catch trees");
    }

    private void visitCatchClause(CatchTree node, AllowTrailingBlankLine allowTrailingBlankLine) {
        sync(node);
        this.builder.space();
        token("catch");
        this.builder.space();
        token("(");
        this.builder.open(this.plusFour);
        VariableTree ex = node.getParameter();
        if (ex.getType().getKind() == Tree.Kind.UNION_TYPE) {
            this.builder.open(ZERO);
            visitUnionType(ex);
            this.builder.close();
        } else {
            this.builder.breakToFill();
            this.builder.open(ZERO);
            scan((Tree) ex, (Void) null);
            this.builder.close();
        }
        this.builder.close();
        token(")");
        this.builder.space();
        visitBlock(node.getBlock(), CollapseEmptyOrNot.NO, AllowLeadingBlankLine.YES, allowTrailingBlankLine);
    }

    private void visitUnionType(VariableTree declaration) {
        UnionTypeTree type = (UnionTypeTree) declaration.getType();
        this.builder.open(ZERO);
        sync(declaration);
        visitAndBreakModifiers(declaration.getModifiers(), Direction.HORIZONTAL, Optional.absent());
        List<? extends Tree> union = type.getTypeAlternatives();
        boolean first = true;
        for (int i = 0; i < union.size() - 1; i++) {
            if (!first) {
                this.builder.breakOp(" ");
                token("|");
                this.builder.space();
            } else {
                first = false;
            }
            scan(union.get(i), (Void) null);
        }
        this.builder.breakOp(" ");
        token("|");
        this.builder.space();
        Tree last = union.get(union.size() - 1);
        declareOne(DeclarationKind.NONE, Direction.HORIZONTAL, Optional.absent(), last, VarArgsOrNot.NO, ImmutableList.m160of(), declaration.getName(), "", "=", Optional.fromNullable(declaration.getInitializer()), Optional.absent(), Optional.absent(), Optional.absent());
        this.builder.close();
    }

    private void visitFormals(Optional<VariableTree> receiver, List<? extends VariableTree> parameters) {
        if (!receiver.isPresent() && parameters.isEmpty()) {
            return;
        }
        this.builder.open(ZERO);
        boolean first = true;
        receiver.isPresent();
        int i = 0;
        while (i < parameters.size()) {
            VariableTree parameter = parameters.get(i);
            if (!first) {
                this.builder.breakOp(" ");
            }
            visitToDeclare(DeclarationKind.PARAMETER, Direction.HORIZONTAL, parameter, Optional.absent(), "=", i < parameters.size() + (-1) ? Optional.m95of(",") : Optional.absent());
            first = false;
            i++;
        }
        this.builder.close();
    }

    private void visitThrowsClause(List<? extends ExpressionTree> thrownExceptionTypes) {
        token("throws");
        this.builder.breakToFill(" ");
        boolean first = true;
        for (ExpressionTree thrownExceptionType : thrownExceptionTypes) {
            if (!first) {
                token(",");
                this.builder.breakToFill(" ");
            }
            scan((Tree) thrownExceptionType, (Void) null);
            first = false;
        }
    }

    @Override
    public Void visitIdentifier(IdentifierTree node, Void unused) {
        sync(node);
        token(node.getName().toString());
        return null;
    }

    private void visitName(Tree node) {
        Deque<Name> stack = new ArrayDeque<>();
        while (node instanceof MemberSelectTree) {
            stack.addFirst(((MemberSelectTree) node).getIdentifier());
            node = ((MemberSelectTree) node).getExpression();
        }
        stack.addFirst(((IdentifierTree) node).getName());
        boolean first = true;
        for (Name name : stack) {
            if (!first) {
                token(".");
            }
            token(name.toString());
            first = false;
        }
    }

    private void visitToDeclare(DeclarationKind kind, Direction annotationsDirection, VariableTree node, Optional<ExpressionTree> initializer, String equals, Optional<String> trailing) {
        sync(node);
        boolean varargs = VarArgsOrNot.fromVariable(node).isYes();
        List<? extends AnnotationTree> varargsAnnotations = ImmutableList.m160of();
        Tree type = node.getType();
        declareOne(kind, annotationsDirection, Optional.m95of(node.getModifiers()), type, VarArgsOrNot.valueOf(varargs), varargsAnnotations, node.getName(), "", equals, initializer, trailing, Optional.absent(), Optional.absent());
    }

    private void typeParametersRest(List<? extends TypeParameterTree> typeParameters, Indent plusIndent) {
        this.builder.open(plusIndent);
        this.builder.breakOp();
        this.builder.open(ZERO);
        boolean first = true;
        for (TypeParameterTree typeParameter : typeParameters) {
            if (!first) {
                token(",");
                this.builder.breakOp(" ");
            }
            scan((Tree) typeParameter, (Void) null);
            first = false;
        }
        token(">");
        this.builder.close();
        this.builder.close();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:57:0x0105  */
    /* JADX WARN: Code duplicated, block: B:59:0x0108  */
    /* JADX WARN: Code duplicated, block: B:60:0x010c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0111  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    void visitDot(ExpressionTree node0) {
        List<ExpressionTree> items;
        boolean needDot;
        int prefixIndex;
        int invocationCount;
        int firstInvocationIndex;
        int i;
        byte b;
        String string;
        int iHashCode;
        ExpressionTree expression;
        ExpressionTree node = node0;
        Deque<ExpressionTree> stack = new ArrayDeque<>();
        do {
            stack.addFirst(node);
            if (node.getKind() == Tree.Kind.ARRAY_ACCESS) {
                node = getArrayBase(node);
            }
            switch (node.getKind()) {
                case MEMBER_SELECT:
                    node = ((MemberSelectTree) node).getExpression();
                    break;
                case METHOD_INVOCATION:
                    node = getMethodReceiver((MethodInvocationTree) node);
                    break;
                case IDENTIFIER:
                    node = null;
                    break;
                default:
                    ExpressionTree node2 = stack.removeFirst();
                    node = node2;
                    break;
            }
            items = new ArrayList<>(stack);
            needDot = false;
            if (node != null) {
                if (node.getKind() != Tree.Kind.NEW_CLASS && ((NewClassTree) node).getClassBody() != null) {
                    this.builder.open(ZERO);
                    scan((Tree) getArrayBase(node), (Void) null);
                    token(".");
                } else {
                    this.builder.open(this.plusFour);
                    scan((Tree) getArrayBase(node), (Void) null);
                    this.builder.breakOp();
                    needDot = true;
                }
                formatArrayIndices(getArrayIndices(node));
                if (stack.isEmpty()) {
                    this.builder.close();
                    return;
                }
            }
            prefixIndex = TypeNameClassifier.typePrefixLength(simpleNames(stack));
            invocationCount = 0;
            firstInvocationIndex = -1;
            for (i = 0; i < items.size(); i++) {
                expression = items.get(i);
                if (expression.getKind() != Tree.Kind.METHOD_INVOCATION) {
                    if (i <= 0 || node != null) {
                        invocationCount++;
                    }
                    if (firstInvocationIndex < 0) {
                        firstInvocationIndex = i;
                    }
                }
            }
            if (invocationCount == 1) {
                prefixIndex = firstInvocationIndex;
            }
            b = -1;
            if (prefixIndex == -1 && (items.get(0) instanceof IdentifierTree)) {
                string = ((IdentifierTree) items.get(0)).getName().toString();
                iHashCode = string.hashCode();
                if (iHashCode != 3559070) {
                    if (iHashCode == 109801339 && string.equals("super")) {
                        b = 1;
                    }
                } else if (string.equals("this")) {
                    b = 0;
                }
                if (b != 0 || b == 1) {
                    prefixIndex = 1;
                }
            }
            if (prefixIndex > 0) {
                visitDotWithPrefix(items, needDot, prefixIndex);
            } else {
                visitRegularDot(items, needDot);
            }
            if (node != null) {
                this.builder.close();
            }
        } while (node != null);
        items = new ArrayList<>(stack);
        needDot = false;
        if (node != null) {
            if (node.getKind() != Tree.Kind.NEW_CLASS) {
                this.builder.open(this.plusFour);
                scan((Tree) getArrayBase(node), (Void) null);
                this.builder.breakOp();
                needDot = true;
            } else {
                this.builder.open(this.plusFour);
                scan((Tree) getArrayBase(node), (Void) null);
                this.builder.breakOp();
                needDot = true;
            }
            formatArrayIndices(getArrayIndices(node));
            if (stack.isEmpty()) {
                this.builder.close();
                return;
            }
        }
        prefixIndex = TypeNameClassifier.typePrefixLength(simpleNames(stack));
        invocationCount = 0;
        firstInvocationIndex = -1;
        while (i < items.size()) {
            expression = items.get(i);
            if (expression.getKind() != Tree.Kind.METHOD_INVOCATION) {
                if (i <= 0) {
                    invocationCount++;
                } else {
                    invocationCount++;
                }
                if (firstInvocationIndex < 0) {
                    firstInvocationIndex = i;
                }
            }
        }
        if (invocationCount == 1) {
            prefixIndex = firstInvocationIndex;
        }
        b = -1;
        if (prefixIndex == -1) {
            string = ((IdentifierTree) items.get(0)).getName().toString();
            iHashCode = string.hashCode();
            if (iHashCode != 3559070) {
                if (iHashCode == 109801339) {
                    b = 1;
                }
            } else if (string.equals("this")) {
                b = 0;
            }
            if (b != 0) {
                prefixIndex = 1;
            } else {
                prefixIndex = 1;
            }
        }
        if (prefixIndex > 0) {
            visitDotWithPrefix(items, needDot, prefixIndex);
        } else {
            visitRegularDot(items, needDot);
        }
        if (node != null) {
            this.builder.close();
        }
    }

    private void visitRegularDot(List<ExpressionTree> items, boolean needDot) {
        boolean trailingDereferences = items.size() > 1;
        if (!needDot) {
            this.builder.open(this.plusFour);
        }
        int minLength = this.indentMultiplier * 4;
        int length = needDot ? minLength : 0;
        for (ExpressionTree e : items) {
            if (needDot) {
                if (length > minLength) {
                    this.builder.breakOp(AbstractDoc.FillMode.UNIFIED, "", ZERO);
                }
                token(".");
                length++;
            }
            if (!fillFirstArgument(e, items, trailingDereferences ? ZERO : this.minusFour)) {
                Output.BreakTag tyargTag = genSym();
                dotExpressionUpToArgs(e, Optional.m95of(tyargTag));
                Indent tyargIndent = Indent.C0531If.make(tyargTag, this.plusFour, ZERO);
                dotExpressionArgsAndParen(e, tyargIndent, (trailingDereferences || needDot) ? this.plusFour : ZERO);
            }
            length += Trees.getLength(e, getCurrentPath());
            needDot = true;
        }
        if (!needDot) {
            this.builder.close();
        }
    }

    private boolean fillFirstArgument(ExpressionTree e, List<ExpressionTree> items, Indent indent) {
        if (items.size() < 2 || e.getKind() != Tree.Kind.METHOD_INVOCATION) {
            return false;
        }
        MethodInvocationTree methodInvocation = (MethodInvocationTree) e;
        Name name = Trees.getMethodName(methodInvocation);
        if (!(methodInvocation.getMethodSelect() instanceof IdentifierTree) || name.length() > 4 || !methodInvocation.getTypeArguments().isEmpty() || methodInvocation.getArguments().size() != 1) {
            return false;
        }
        this.builder.open(ZERO);
        this.builder.open(indent);
        visit(name);
        token("(");
        ExpressionTree arg = (ExpressionTree) Iterables.getOnlyElement(methodInvocation.getArguments());
        scan((Tree) arg, (Void) null);
        this.builder.close();
        token(")");
        this.builder.close();
        return true;
    }

    private void visitDotWithPrefix(List<ExpressionTree> items, boolean needDot, int prefixIndex) {
        AbstractDoc.FillMode fillMode;
        boolean trailingDereferences = prefixIndex >= 0 && prefixIndex < items.size() - 1;
        this.builder.open(this.plusFour);
        this.builder.open(ZERO);
        Output.BreakTag nameTag = genSym();
        for (int i = 0; i < items.size(); i++) {
            ExpressionTree e = items.get(i);
            if (needDot) {
                if (prefixIndex >= 0 && i <= prefixIndex) {
                    fillMode = AbstractDoc.FillMode.INDEPENDENT;
                } else {
                    fillMode = AbstractDoc.FillMode.UNIFIED;
                }
                this.builder.breakOp(fillMode, "", ZERO, Optional.m95of(nameTag));
                token(".");
            }
            Output.BreakTag tyargTag = genSym();
            dotExpressionUpToArgs(e, Optional.m95of(tyargTag));
            if (prefixIndex >= 0 && i == prefixIndex) {
                this.builder.close();
            }
            Indent tyargIndent = Indent.C0531If.make(tyargTag, this.plusFour, ZERO);
            Indent.Const r6 = this.plusFour;
            Indent argsIndent = Indent.C0531If.make(nameTag, r6, trailingDereferences ? r6 : ZERO);
            dotExpressionArgsAndParen(e, tyargIndent, argsIndent);
            needDot = true;
        }
        this.builder.close();
    }

    private List<String> simpleNames(Deque<ExpressionTree> stack) {
        ImmutableList.Builder<String> simpleNames = ImmutableList.builder();
        for (ExpressionTree expression : stack) {
            boolean isArray = expression.getKind() == Tree.Kind.ARRAY_ACCESS;
            ExpressionTree expression2 = getArrayBase(expression);
            switch (expression2.getKind()) {
                case MEMBER_SELECT:
                    simpleNames.mo158add(((MemberSelectTree) expression2).getIdentifier().toString());
                    break;
                case METHOD_INVOCATION:
                    simpleNames.mo158add(Trees.getMethodName((MethodInvocationTree) expression2).toString());
                    return simpleNames.build();
                case IDENTIFIER:
                    simpleNames.mo158add(((IdentifierTree) expression2).getName().toString());
                    break;
                default:
                    return simpleNames.build();
            }
            if (isArray) {
                return simpleNames.build();
            }
        }
        return simpleNames.build();
    }

    private void dotExpressionUpToArgs(ExpressionTree expression, Optional<Output.BreakTag> tyargTag) {
        ExpressionTree expression2 = getArrayBase(expression);
        switch (expression2.getKind()) {
            case MEMBER_SELECT:
                MemberSelectTree fieldAccess = (MemberSelectTree) expression2;
                visit(fieldAccess.getIdentifier());
                break;
            case METHOD_INVOCATION:
                MethodInvocationTree methodInvocation = (MethodInvocationTree) expression2;
                if (!methodInvocation.getTypeArguments().isEmpty()) {
                    this.builder.open(this.plusFour);
                    addTypeArguments(methodInvocation.getTypeArguments(), ZERO);
                    this.builder.breakOp(AbstractDoc.FillMode.UNIFIED, "", ZERO, tyargTag);
                    this.builder.close();
                }
                visit(Trees.getMethodName(methodInvocation));
                break;
            case IDENTIFIER:
                visit(((IdentifierTree) expression2).getName());
                break;
            default:
                scan((Tree) expression2, (Void) null);
                break;
        }
    }

    private ExpressionTree getArrayBase(ExpressionTree node) {
        while (node instanceof ArrayAccessTree) {
            node = ((ArrayAccessTree) node).getExpression();
        }
        return node;
    }

    private ExpressionTree getMethodReceiver(MethodInvocationTree methodInvocation) {
        ExpressionTree select = methodInvocation.getMethodSelect();
        if (select instanceof MemberSelectTree) {
            return ((MemberSelectTree) select).getExpression();
        }
        return null;
    }

    private void dotExpressionArgsAndParen(ExpressionTree expression, Indent tyargIndent, Indent indent) {
        Deque<ExpressionTree> indices = getArrayIndices(expression);
        ExpressionTree expression2 = getArrayBase(expression);
        if (C05433.$SwitchMap$com$sun$source$tree$Tree$Kind[expression2.getKind().ordinal()] == 9) {
            this.builder.open(tyargIndent);
            MethodInvocationTree methodInvocation = (MethodInvocationTree) expression2;
            addArguments(methodInvocation.getArguments(), indent);
            this.builder.close();
        }
        formatArrayIndices(indices);
    }

    private void formatArrayIndices(Deque<ExpressionTree> indices) {
        if (indices.isEmpty()) {
            return;
        }
        this.builder.open(ZERO);
        do {
            token("[");
            this.builder.breakToFill();
            scan((Tree) indices.removeLast(), (Void) null);
            token("]");
        } while (!indices.isEmpty());
        this.builder.close();
    }

    private Deque<ExpressionTree> getArrayIndices(ExpressionTree expression) {
        Deque<ExpressionTree> indices = new ArrayDeque<>();
        while (expression instanceof ArrayAccessTree) {
            ArrayAccessTree array = (ArrayAccessTree) expression;
            indices.addLast(array.getIndex());
            expression = array.getExpression();
        }
        return indices;
    }

    void addTypeArguments(List<? extends Tree> typeArguments, Indent plusIndent) {
        if (typeArguments == null || typeArguments.isEmpty()) {
            return;
        }
        token("<");
        this.builder.open(plusIndent);
        boolean first = true;
        for (Tree typeArgument : typeArguments) {
            if (!first) {
                token(",");
                this.builder.breakToFill(" ");
            }
            scan(typeArgument, (Void) null);
            first = false;
        }
        this.builder.close();
        token(">");
    }

    void addArguments(List<? extends ExpressionTree> arguments, Indent plusIndent) {
        this.builder.open(plusIndent);
        token("(");
        if (!arguments.isEmpty()) {
            if (arguments.size() % 2 == 0 && argumentsAreTabular(arguments) == 2) {
                this.builder.forcedBreak();
                this.builder.open(ZERO);
                boolean first = true;
                for (int i = 0; i < arguments.size() - 1; i += 2) {
                    ExpressionTree argument0 = arguments.get(i);
                    ExpressionTree argument1 = arguments.get(i + 1);
                    if (!first) {
                        token(",");
                        this.builder.forcedBreak();
                    }
                    this.builder.open(this.plusFour);
                    scan((Tree) argument0, (Void) null);
                    token(",");
                    this.builder.breakOp(" ");
                    scan((Tree) argument1, (Void) null);
                    this.builder.close();
                    first = false;
                }
                this.builder.close();
            } else if (isFormatMethod(arguments)) {
                this.builder.breakOp();
                this.builder.open(ZERO);
                scan((Tree) arguments.get(0), (Void) null);
                token(",");
                this.builder.breakOp(" ");
                this.builder.open(ZERO);
                argList(arguments.subList(1, arguments.size()));
                this.builder.close();
                this.builder.close();
            } else {
                this.builder.breakOp();
                argList(arguments);
            }
        }
        token(")");
        this.builder.close();
    }

    private void argList(List<? extends ExpressionTree> arguments) {
        this.builder.open(ZERO);
        boolean first = true;
        AbstractDoc.FillMode fillMode = hasOnlyShortItems(arguments) ? AbstractDoc.FillMode.INDEPENDENT : AbstractDoc.FillMode.UNIFIED;
        for (ExpressionTree argument : arguments) {
            if (!first) {
                token(",");
                this.builder.breakOp(fillMode, " ", ZERO);
            }
            scan((Tree) argument, (Void) null);
            first = false;
        }
        this.builder.close();
    }

    private boolean isFormatMethod(List<? extends ExpressionTree> arguments) {
        if (arguments.size() < 2) {
            return false;
        }
        return isStringConcat(arguments.get(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isStringConcat(ExpressionTree expressionTree) {
        final boolean[] stringLiteral = {true};
        final boolean[] formatString = {false};
        new TreeScanner() {
            /* JADX WARN: Multi-variable type inference failed */
            @Override
            public void scan(JCTree jCTree) {
                if (jCTree == 0) {
                    return;
                }
                int i = C05433.$SwitchMap$com$sun$source$tree$Tree$Kind[jCTree.getKind().ordinal()];
                if (i != 11) {
                    if (i == 12) {
                        super.scan(jCTree);
                    } else {
                        stringLiteral[0] = false;
                    }
                }
                if (jCTree.getKind() == Tree.Kind.STRING_LITERAL) {
                    Object value = ((LiteralTree) jCTree).getValue();
                    if ((value instanceof String) && JavaInputAstVisitor.FORMAT_SPECIFIER.matcher(value.toString()).find()) {
                        formatString[0] = true;
                    }
                }
            }
        }.scan((JCTree) expressionTree);
        return stringLiteral[0] && formatString[0];
    }

    private int argumentsAreTabular(List<? extends ExpressionTree> arguments) {
        if (arguments.isEmpty()) {
            return -1;
        }
        List<List<ExpressionTree>> rows = new ArrayList<>();
        PeekingIterator<ExpressionTree> it = Iterators.peekingIterator(arguments.iterator());
        int start0 = actualColumn(it.peek()).intValue();
        List<ExpressionTree> row = new ArrayList<>();
        row.add(it.next());
        while (it.hasNext() && actualColumn(it.peek()).intValue() > start0) {
            row.add(it.next());
        }
        if (!it.hasNext() || rowLength(row) <= 1) {
            return -1;
        }
        rows.add(row);
        while (it.hasNext()) {
            List<ExpressionTree> row2 = new ArrayList<>();
            int start = actualColumn(it.peek()).intValue();
            if (start != start0) {
                return -1;
            }
            row2.add(it.next());
            while (it.hasNext() && actualColumn(it.peek()).intValue() > start0) {
                row2.add(it.next());
            }
            rows.add(row2);
        }
        int size0 = rows.get(0).size();
        if (!expressionsAreParallel(rows, 0, rows.size())) {
            return -1;
        }
        for (int i = 1; i < size0; i++) {
            if (!expressionsAreParallel(rows, i, (rows.size() / 2) + 1)) {
                return -1;
            }
        }
        int i2 = rows.size();
        if (i2 == 2) {
            if (size0 == rows.get(1).size()) {
                return size0;
            }
            return -1;
        }
        for (int i3 = 1; i3 < rows.size() - 1; i3++) {
            if (size0 != rows.get(i3).size()) {
                return -1;
            }
        }
        if (size0 < ((List) Iterables.getLast(rows)).size()) {
            return -1;
        }
        return size0;
    }

    private Integer actualColumn(ExpressionTree expression) {
        Map<Integer, Integer> positionToColumnMap = this.builder.getInput().getPositionToColumnMap();
        return positionToColumnMap.get(this.builder.actualStartColumn(Trees.getStartPosition(expression)));
    }

    int declareOne(DeclarationKind kind, Direction annotationsDirection, Optional<ModifiersTree> modifiers, Tree type, VarArgsOrNot isVarargs, List<? extends AnnotationTree> varargsAnnotations, Name name, String op, String equals, Optional<ExpressionTree> initializer, Optional<String> trailing, Optional<ExpressionTree> receiverExpression, Optional<DimensionHelpers.TypeWithDims> typeWithDims) {
        Collection collectionEmptyList;
        Indent.Const r9;
        Output.BreakTag typeBreak = genSym();
        Output.BreakTag verticalAnnotationBreak = genSym();
        boolean isField = kind == DeclarationKind.FIELD;
        if (isField) {
            this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.conditional(verticalAnnotationBreak));
        }
        if (typeWithDims.isPresent()) {
            collectionEmptyList = typeWithDims.mo75get().dims;
        } else {
            collectionEmptyList = Collections.emptyList();
        }
        Deque<List<AnnotationTree>> dims = new ArrayDeque<>((Collection<? extends List<AnnotationTree>>) collectionEmptyList);
        int baseDims = 0;
        OpsBuilder opsBuilder = this.builder;
        if (kind == DeclarationKind.PARAMETER && modifiers.isPresent() && !modifiers.mo75get().getAnnotations().isEmpty()) {
            r9 = this.plusFour;
        } else {
            r9 = ZERO;
        }
        opsBuilder.open(r9);
        if (modifiers.isPresent()) {
            visitAndBreakModifiers(modifiers.mo75get(), annotationsDirection, Optional.m95of(verticalAnnotationBreak));
        }
        this.builder.open(type != null ? this.plusFour : ZERO);
        this.builder.open(ZERO);
        this.builder.open(ZERO);
        if (typeWithDims.isPresent() && typeWithDims.mo75get().node != null) {
            scan(typeWithDims.mo75get().node, (Void) null);
            int totalDims = dims.size();
            this.builder.open(this.plusFour);
            maybeAddDims(dims);
            this.builder.close();
            baseDims = totalDims - dims.size();
        } else {
            scan(type, (Void) null);
        }
        if (isVarargs.isYes()) {
            visitAnnotations(varargsAnnotations, BreakOrNot.YES, BreakOrNot.YES);
            this.builder.m443op("...");
        }
        this.builder.close();
        if (type != null) {
            this.builder.breakOp(AbstractDoc.FillMode.INDEPENDENT, " ", ZERO, Optional.m95of(typeBreak));
        }
        this.builder.open(Indent.C0531If.make(typeBreak, this.plusFour, ZERO));
        if (receiverExpression.isPresent()) {
            scan((Tree) receiverExpression.mo75get(), (Void) null);
        } else {
            visit(name);
        }
        this.builder.m443op(op);
        maybeAddDims(dims);
        this.builder.close();
        this.builder.close();
        if (initializer.isPresent()) {
            this.builder.space();
            token(equals);
            if (initializer.mo75get().getKind() != Tree.Kind.NEW_ARRAY || ((NewArrayTree) initializer.mo75get()).getType() != null) {
                this.builder.open(Indent.C0531If.make(typeBreak, this.plusFour, ZERO));
                this.builder.breakToFill(" ");
                scan((Tree) initializer.mo75get(), (Void) null);
                this.builder.close();
            } else {
                this.builder.open(this.minusFour);
                this.builder.space();
                initializer.mo75get().accept(this, null);
                this.builder.close();
            }
        }
        if (trailing.isPresent() && this.builder.peekToken().equals(trailing)) {
            this.builder.guessToken(trailing.mo75get());
        }
        this.builder.close();
        this.builder.close();
        if (isField) {
            this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.conditional(verticalAnnotationBreak));
        }
        return baseDims;
    }

    private void maybeAddDims(Deque<List<AnnotationTree>> annotations) {
        maybeAddDims(new ArrayDeque(), annotations);
    }

    private void maybeAddDims(Deque<ExpressionTree> dimExpressions, Deque<List<AnnotationTree>> annotations) {
        boolean lastWasAnnotation = false;
        while (this.builder.peekToken().isPresent()) {
            String strMo75get = this.builder.peekToken().mo75get();
            byte b = -1;
            int iHashCode = strMo75get.hashCode();
            if (iHashCode != 64) {
                if (iHashCode == 91 && strMo75get.equals("[")) {
                    b = 1;
                }
            } else if (strMo75get.equals("@")) {
                b = 0;
            }
            if (b != 0) {
                if (b == 1) {
                    if (lastWasAnnotation) {
                        this.builder.breakToFill(" ");
                    } else {
                        this.builder.breakToFill();
                    }
                    token("[");
                    if (!this.builder.peekToken().mo75get().equals("]")) {
                        scan((Tree) dimExpressions.removeFirst(), (Void) null);
                    }
                    token("]");
                    lastWasAnnotation = false;
                } else {
                    return;
                }
            } else {
                if (annotations.isEmpty()) {
                    return;
                }
                List<AnnotationTree> dimAnnotations = annotations.removeFirst();
                if (!dimAnnotations.isEmpty()) {
                    this.builder.breakToFill(" ");
                    visitAnnotations(dimAnnotations, BreakOrNot.NO, BreakOrNot.NO);
                    lastWasAnnotation = true;
                }
            }
        }
    }

    private void declareMany(List<VariableTree> fragments, Direction annotationDirection) {
        this.builder.open(ZERO);
        ModifiersTree modifiers = fragments.get(0).getModifiers();
        Tree type = fragments.get(0).getType();
        visitAndBreakModifiers(modifiers, annotationDirection, Optional.absent());
        this.builder.open(this.plusFour);
        this.builder.open(ZERO);
        DimensionHelpers.TypeWithDims extractedDims = DimensionHelpers.extractDims(type, DimensionHelpers.SortedDims.YES);
        Deque<List<AnnotationTree>> dims = new ArrayDeque<>(extractedDims.dims);
        scan(extractedDims.node, (Void) null);
        int baseDims = dims.size();
        maybeAddDims(dims);
        int baseDims2 = baseDims - dims.size();
        boolean first = true;
        for (VariableTree fragment : fragments) {
            if (!first) {
                token(",");
            }
            DimensionHelpers.TypeWithDims fragmentDims = variableFragmentDims(first, baseDims2, fragment.getType());
            Deque<List<AnnotationTree>> dims2 = new ArrayDeque<>(fragmentDims.dims);
            this.builder.breakOp(" ");
            this.builder.open(ZERO);
            maybeAddDims(dims2);
            visit(fragment.getName());
            maybeAddDims(dims2);
            ExpressionTree initializer = fragment.getInitializer();
            if (initializer != null) {
                this.builder.space();
                token("=");
                this.builder.open(this.plusFour);
                this.builder.breakOp(" ");
                scan((Tree) initializer, (Void) null);
                this.builder.close();
            }
            this.builder.close();
            if (first) {
                this.builder.close();
            }
            first = false;
        }
        this.builder.close();
        token(";");
        this.builder.close();
    }

    void addBodyDeclarations(List<? extends Tree> bodyDeclarations, BracesOrNot braces, FirstDeclarationsOrNot first0) {
        if (bodyDeclarations.isEmpty()) {
            if (braces.isYes()) {
                this.builder.space();
                tokenBreakTrailingComment("{", this.plusTwo);
                this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.f247NO);
                this.builder.open(ZERO);
                token("}", this.plusTwo);
                this.builder.close();
                return;
            }
            return;
        }
        if (braces.isYes()) {
            this.builder.space();
            tokenBreakTrailingComment("{", this.plusTwo);
            this.builder.open(ZERO);
        }
        this.builder.open(this.plusTwo);
        boolean first = first0.isYes();
        boolean lastOneGotBlankLineBefore = false;
        PeekingIterator<Tree> it = Iterators.peekingIterator(bodyDeclarations.iterator());
        while (it.hasNext()) {
            Tree bodyDeclaration = it.next();
            dropEmptyDeclarations();
            this.builder.forcedBreak();
            boolean thisOneGetsBlankLineBefore = bodyDeclaration.getKind() != Tree.Kind.VARIABLE || hasJavaDoc(bodyDeclaration);
            if (first) {
                this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.PRESERVE);
            } else if (!first && (thisOneGetsBlankLineBefore || lastOneGotBlankLineBefore)) {
                this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.f248YES);
            }
            markForPartialFormat();
            if (bodyDeclaration.getKind() == Tree.Kind.VARIABLE) {
                visitVariables(variableFragments(it, bodyDeclaration), DeclarationKind.FIELD, fieldAnnotationDirection(((VariableTree) bodyDeclaration).getModifiers()));
            } else {
                scan(bodyDeclaration, (Void) null);
            }
            first = false;
            lastOneGotBlankLineBefore = thisOneGetsBlankLineBefore;
        }
        dropEmptyDeclarations();
        this.builder.forcedBreak();
        this.builder.close();
        this.builder.forcedBreak();
        markForPartialFormat();
        if (braces.isYes()) {
            this.builder.blankLineWanted(OpsBuilder.BlankLineWanted.f247NO);
            token("}", this.plusTwo);
            this.builder.close();
        }
    }

    private List<VariableTree> variableFragments(PeekingIterator<? extends Tree> it, Tree first) {
        List<VariableTree> fragments = new ArrayList<>();
        if (first.getKind() == Tree.Kind.VARIABLE) {
            int start = Trees.getStartPosition(first);
            fragments.add((VariableTree) first);
            while (it.hasNext() && it.peek().getKind() == Tree.Kind.VARIABLE && Trees.getStartPosition(it.peek()) == start) {
                fragments.add((VariableTree) it.next());
            }
        }
        return fragments;
    }

    private boolean hasJavaDoc(Tree bodyDeclaration) {
        int position = ((JCTree) bodyDeclaration).getStartPosition();
        Input.Token token = this.builder.getInput().getPositionTokenMap().mo204get(Integer.valueOf(position));
        if (token != null) {
            UnmodifiableIterator<? extends Input.InterfaceC0532Tok> it = token.getToksBefore().iterator();
            while (it.hasNext()) {
                Input.InterfaceC0532Tok tok = it.next();
                if (tok.getText().startsWith("/**")) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private boolean hasTrailingToken(Input input, List<? extends Tree> nodes, String token) {
        if (nodes.isEmpty()) {
            return false;
        }
        Tree lastNode = (Tree) Iterables.getLast(nodes);
        Optional<? extends Input.Token> nextToken = getNextToken(input, Trees.getEndPosition(lastNode, getCurrentPath()));
        return nextToken.isPresent() && nextToken.mo75get().getTok().getText().equals(token);
    }

    private Direction canLocalHaveHorizontalAnnotations(ModifiersTree modifiers) {
        int markerAnnotations = 0;
        for (AnnotationTree annotation : modifiers.getAnnotations()) {
            if (annotation.getArguments().isEmpty()) {
                markerAnnotations++;
            }
        }
        if (markerAnnotations <= 1 && markerAnnotations == modifiers.getAnnotations().size()) {
            return Direction.HORIZONTAL;
        }
        return Direction.VERTICAL;
    }

    private Direction fieldAnnotationDirection(ModifiersTree modifiers) {
        for (AnnotationTree annotation : modifiers.getAnnotations()) {
            if (!annotation.getArguments().isEmpty()) {
                return Direction.VERTICAL;
            }
        }
        return Direction.HORIZONTAL;
    }

    final void token(String token) {
        this.builder.token(token, AbstractDoc.Token.RealOrImaginary.REAL, ZERO, Optional.absent());
    }

    final void token(String token, Indent plusIndentCommentsBefore) {
        this.builder.token(token, AbstractDoc.Token.RealOrImaginary.REAL, plusIndentCommentsBefore, Optional.absent());
    }

    final void tokenBreakTrailingComment(String token, Indent breakAndIndentTrailingComment) {
        this.builder.token(token, AbstractDoc.Token.RealOrImaginary.REAL, ZERO, Optional.m95of(breakAndIndentTrailingComment));
    }

    private void markForPartialFormat() {
        if (!inExpression()) {
            this.builder.markForPartialFormat();
        }
    }

    final void sync(Tree node) {
        this.builder.sync(((JCTree) node).getStartPosition());
    }

    final Output.BreakTag genSym() {
        return new Output.BreakTag();
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).m93add("builder", this.builder).toString();
    }

    enum Direction {
        VERTICAL,
        HORIZONTAL;

        boolean isVertical() {
            return this == VERTICAL;
        }
    }

    enum BreakOrNot {
        YES,
        NO;

        boolean isYes() {
            return this == YES;
        }
    }

    enum CollapseEmptyOrNot {
        YES,
        NO;

        static CollapseEmptyOrNot valueOf(boolean b) {
            return b ? YES : NO;
        }

        boolean isYes() {
            return this == YES;
        }
    }

    enum AllowLeadingBlankLine {
        YES,
        NO;

        static AllowLeadingBlankLine valueOf(boolean b) {
            return b ? YES : NO;
        }
    }

    enum AllowTrailingBlankLine {
        YES,
        NO;

        static AllowTrailingBlankLine valueOf(boolean b) {
            return b ? YES : NO;
        }
    }

    enum BracesOrNot {
        YES,
        NO;

        boolean isYes() {
            return this == YES;
        }
    }

    enum DimensionsOrNot {
        YES,
        NO;

        boolean isYes() {
            return this == YES;
        }
    }

    enum VarArgsOrNot {
        YES,
        NO;

        static VarArgsOrNot valueOf(boolean b) {
            return b ? YES : NO;
        }

        static VarArgsOrNot fromVariable(VariableTree node) {
            return valueOf((((JCTree.JCVariableDecl) node).mods.flags & Flags.VARARGS) == Flags.VARARGS);
        }

        boolean isYes() {
            return this == YES;
        }
    }

    enum ReceiverParameter {
        YES,
        NO;

        boolean isYes() {
            return this == YES;
        }
    }

    enum FirstDeclarationsOrNot {
        YES,
        NO;

        boolean isYes() {
            return this == YES;
        }
    }
}
