package org.dom4j.tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.dom4j.IllegalAddException;
import org.dom4j.Node;

public class BackedList extends ArrayList {
    private AbstractBranch branch;
    private List branchContent;

    public BackedList(AbstractBranch abstractBranch, List list) {
        this(abstractBranch, list, list.size());
    }

    public BackedList(AbstractBranch abstractBranch, List list, int i) {
        super(i);
        this.branch = abstractBranch;
        this.branchContent = list;
    }

    public BackedList(AbstractBranch abstractBranch, List list, List list2) {
        super(list2);
        this.branch = abstractBranch;
        this.branchContent = list;
    }

    @Override
    public void add(int i, Object obj) {
        int iIndexOf;
        int size = size();
        if (i < 0) {
            throw new IndexOutOfBoundsException(new StringBuffer().append("Index value: ").append(i).append(" is less than zero").toString());
        }
        if (i > size) {
            throw new IndexOutOfBoundsException(new StringBuffer().append("Index value: ").append(i).append(" cannot be greater than ").append("the size: ").append(size).toString());
        }
        if (size == 0) {
            iIndexOf = this.branchContent.size();
        } else {
            iIndexOf = i < size ? this.branchContent.indexOf(get(i)) : this.branchContent.indexOf(get(size - 1)) + 1;
        }
        this.branch.addNode(iIndexOf, asNode(obj));
        super.add(i, obj);
    }

    @Override
    public boolean add(Object obj) {
        this.branch.addNode(asNode(obj));
        return super.add(obj);
    }

    @Override
    public boolean addAll(int i, Collection collection) {
        ensureCapacity(size() + collection.size());
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            add(i, it.next());
            size--;
            i++;
        }
        return size != 0;
    }

    @Override
    public boolean addAll(Collection collection) {
        ensureCapacity(size() + collection.size());
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            add(it.next());
            size--;
        }
        return size != 0;
    }

    public void addLocal(Object obj) {
        super.add(obj);
    }

    protected Node asNode(Object obj) {
        if (obj instanceof Node) {
            return (Node) obj;
        }
        throw new IllegalAddException(new StringBuffer().append("This list must contain instances of Node. Invalid type: ").append(obj).toString());
    }

    @Override
    public void clear() {
        for (Object obj : this) {
            this.branchContent.remove(obj);
            this.branch.childRemoved(asNode(obj));
        }
        super.clear();
    }

    @Override
    public Object remove(int i) {
        Object objRemove = super.remove(i);
        if (objRemove != null) {
            this.branch.removeNode(asNode(objRemove));
        }
        return objRemove;
    }

    @Override
    public boolean remove(Object obj) {
        this.branch.removeNode(asNode(obj));
        return super.remove(obj);
    }

    @Override
    public Object set(int i, Object obj) {
        int iIndexOf = this.branchContent.indexOf(get(i));
        if (iIndexOf < 0) {
            iIndexOf = i == 0 ? 0 : Integer.MAX_VALUE;
        }
        if (iIndexOf < this.branchContent.size()) {
            this.branch.removeNode(asNode(get(i)));
            this.branch.addNode(iIndexOf, asNode(obj));
        } else {
            this.branch.removeNode(asNode(get(i)));
            this.branch.addNode(asNode(obj));
        }
        this.branch.childAdded(asNode(obj));
        return super.set(i, obj);
    }
}
