package org.dom4j.swing;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.swing.tree.TreeNode;
import org.dom4j.Branch;
import org.dom4j.CharacterData;
import org.dom4j.Node;

public class BranchTreeNode extends LeafTreeNode {
    protected List children;

    public BranchTreeNode() {
    }

    public BranchTreeNode(TreeNode treeNode, Branch branch) {
        super(treeNode, branch);
    }

    public BranchTreeNode(Branch branch) {
        super(branch);
    }

    @Override
    public Enumeration children() {
        return new Enumeration(this) {
            private int index = -1;
            private final BranchTreeNode this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean hasMoreElements() {
                return this.index + 1 < this.this$0.getChildCount();
            }

            @Override
            public Object nextElement() {
                BranchTreeNode branchTreeNode = this.this$0;
                int i = this.index + 1;
                this.index = i;
                return branchTreeNode.getChildAt(i);
            }
        };
    }

    protected List createChildList() {
        String text;
        Branch xmlBranch = getXmlBranch();
        int iNodeCount = xmlBranch.nodeCount();
        ArrayList arrayList = new ArrayList(iNodeCount);
        for (int i = 0; i < iNodeCount; i++) {
            Node node = xmlBranch.node(i);
            if (!(node instanceof CharacterData) || ((text = node.getText()) != null && text.trim().length() > 0)) {
                arrayList.add(createChildTreeNode(node));
            }
        }
        return arrayList;
    }

    protected TreeNode createChildTreeNode(Node node) {
        return node instanceof Branch ? new BranchTreeNode(this, (Branch) node) : new LeafTreeNode(this, node);
    }

    @Override
    public boolean getAllowsChildren() {
        return true;
    }

    @Override
    public TreeNode getChildAt(int i) {
        return (TreeNode) getChildList().get(i);
    }

    @Override
    public int getChildCount() {
        return getChildList().size();
    }

    protected List getChildList() {
        if (this.children == null) {
            this.children = createChildList();
        }
        return this.children;
    }

    @Override
    public int getIndex(TreeNode treeNode) {
        return getChildList().indexOf(treeNode);
    }

    protected Branch getXmlBranch() {
        return (Branch) this.xmlNode;
    }

    @Override
    public boolean isLeaf() {
        return getXmlBranch().nodeCount() <= 0;
    }

    @Override
    public String toString() {
        return this.xmlNode.getName();
    }
}
