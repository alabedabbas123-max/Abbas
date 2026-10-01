package org.dom4j.tree;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.dom4j.IllegalAddException;
import org.dom4j.Node;

public class ContentListFacade extends AbstractList {
    private AbstractBranch branch;
    private List branchContent;

    public ContentListFacade(AbstractBranch abstractBranch, List list) {
        this.branch = abstractBranch;
        this.branchContent = list;
    }

    @Override
    public void add(int i, Object obj) {
        this.branch.childAdded(asNode(obj));
        this.branchContent.add(i, obj);
    }

    @Override
    public boolean add(Object obj) {
        this.branch.childAdded(asNode(obj));
        return this.branchContent.add(obj);
    }

    @Override
    public boolean addAll(int i, Collection collection) {
        int size = this.branchContent.size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            add(i, it.next());
            size--;
            i++;
        }
        return size == this.branchContent.size();
    }

    @Override
    public boolean addAll(Collection collection) {
        int size = this.branchContent.size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            add(it.next());
            size++;
        }
        return size == this.branchContent.size();
    }

    protected Node asNode(Object obj) {
        if (obj instanceof Node) {
            return (Node) obj;
        }
        throw new IllegalAddException(new StringBuffer().append("This list must contain instances of Node. Invalid type: ").append(obj).toString());
    }

    @Override
    public void clear() {
        Iterator it = iterator();
        while (it.hasNext()) {
            this.branch.childRemoved(asNode(it.next()));
        }
        this.branchContent.clear();
    }

    @Override
    public boolean contains(Object obj) {
        return this.branchContent.contains(obj);
    }

    @Override
    public boolean containsAll(Collection collection) {
        return this.branchContent.containsAll(collection);
    }

    @Override
    public Object get(int i) {
        return this.branchContent.get(i);
    }

    protected List getBackingList() {
        return this.branchContent;
    }

    @Override
    public int indexOf(Object obj) {
        return this.branchContent.indexOf(obj);
    }

    @Override
    public boolean isEmpty() {
        return this.branchContent.isEmpty();
    }

    @Override
    public int lastIndexOf(Object obj) {
        return this.branchContent.lastIndexOf(obj);
    }

    @Override
    public Object remove(int i) {
        Object objRemove = this.branchContent.remove(i);
        if (objRemove != null) {
            this.branch.childRemoved(asNode(objRemove));
        }
        return objRemove;
    }

    @Override
    public boolean remove(Object obj) {
        this.branch.childRemoved(asNode(obj));
        return this.branchContent.remove(obj);
    }

    @Override
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.branch.childRemoved(asNode(it.next()));
        }
        return this.branchContent.removeAll(collection);
    }

    @Override
    public Object set(int i, Object obj) {
        this.branch.childAdded(asNode(obj));
        return this.branchContent.set(i, obj);
    }

    @Override
    public int size() {
        return this.branchContent.size();
    }

    @Override
    public Object[] toArray() {
        return this.branchContent.toArray();
    }

    @Override
    public Object[] toArray(Object[] objArr) {
        return this.branchContent.toArray(objArr);
    }
}
