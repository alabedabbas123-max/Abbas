package org.objectweb.asm.tree;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.objectweb.asm.MethodVisitor;

public class InsnList {
    AbstractInsnNode[] cache;
    private AbstractInsnNode first;
    private AbstractInsnNode last;
    private int size;

    final class InsnListIterator implements ListIterator {
        AbstractInsnNode next;
        AbstractInsnNode prev;
        AbstractInsnNode remove;
        final InsnList this$0;

        InsnListIterator(InsnList insnList, int i) {
            this.this$0 = insnList;
            if (i == insnList.size()) {
                this.next = null;
                this.prev = insnList.getLast();
            } else {
                this.next = insnList.m9027get(i);
                this.prev = this.next.prev;
            }
        }

        @Override
        public void add(Object obj) {
            this.this$0.insertBefore(this.next, (AbstractInsnNode) obj);
            this.prev = (AbstractInsnNode) obj;
            this.remove = null;
        }

        @Override
        public boolean hasNext() {
            return this.next != null;
        }

        @Override
        public boolean hasPrevious() {
            return this.prev != null;
        }

        @Override
        public Object next() {
            if (this.next == null) {
                throw new NoSuchElementException();
            }
            AbstractInsnNode abstractInsnNode = this.next;
            this.prev = abstractInsnNode;
            this.next = abstractInsnNode.next;
            this.remove = abstractInsnNode;
            return abstractInsnNode;
        }

        @Override
        public int nextIndex() {
            if (this.next == null) {
                return this.this$0.size();
            }
            if (this.this$0.cache == null) {
                this.this$0.cache = this.this$0.toArray();
            }
            return this.next.index;
        }

        @Override
        public Object previous() {
            AbstractInsnNode abstractInsnNode = this.prev;
            this.next = abstractInsnNode;
            this.prev = abstractInsnNode.prev;
            this.remove = abstractInsnNode;
            return abstractInsnNode;
        }

        @Override
        public int previousIndex() {
            if (this.prev == null) {
                return -1;
            }
            if (this.this$0.cache == null) {
                this.this$0.cache = this.this$0.toArray();
            }
            return this.prev.index;
        }

        @Override
        public void remove() {
            if (this.remove == null) {
                throw new IllegalStateException();
            }
            if (this.remove == this.next) {
                this.next = this.next.next;
            } else {
                this.prev = this.prev.prev;
            }
            this.this$0.remove(this.remove);
            this.remove = null;
        }

        @Override
        public void set(Object obj) {
            this.this$0.m9028set(this.next.prev, (AbstractInsnNode) obj);
            this.prev = (AbstractInsnNode) obj;
        }
    }

    public void accept(MethodVisitor methodVisitor) {
        for (AbstractInsnNode abstractInsnNode = this.first; abstractInsnNode != null; abstractInsnNode = abstractInsnNode.next) {
            abstractInsnNode.accept(methodVisitor);
        }
    }

    public void m9025add(AbstractInsnNode abstractInsnNode) {
        this.size++;
        if (this.last == null) {
            this.first = abstractInsnNode;
            this.last = abstractInsnNode;
        } else {
            this.last.next = abstractInsnNode;
            abstractInsnNode.prev = this.last;
        }
        this.last = abstractInsnNode;
        this.cache = null;
        abstractInsnNode.index = 0;
    }

    public void m9026add(InsnList insnList) {
        if (insnList.size == 0) {
            return;
        }
        this.size += insnList.size;
        if (this.last == null) {
            this.first = insnList.first;
            this.last = insnList.last;
        } else {
            AbstractInsnNode abstractInsnNode = insnList.first;
            this.last.next = abstractInsnNode;
            abstractInsnNode.prev = this.last;
            this.last = insnList.last;
        }
        this.cache = null;
        insnList.removeAll(false);
    }

    public void clear() {
        removeAll(false);
    }

    public boolean contains(AbstractInsnNode abstractInsnNode) {
        AbstractInsnNode abstractInsnNode2 = this.first;
        while (abstractInsnNode2 != null && abstractInsnNode2 != abstractInsnNode) {
            abstractInsnNode2 = abstractInsnNode2.next;
        }
        return abstractInsnNode2 != null;
    }

    public AbstractInsnNode m9027get(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        if (this.cache == null) {
            this.cache = toArray();
        }
        return this.cache[i];
    }

    public AbstractInsnNode getFirst() {
        return this.first;
    }

    public AbstractInsnNode getLast() {
        return this.last;
    }

    public int indexOf(AbstractInsnNode abstractInsnNode) {
        if (this.cache == null) {
            this.cache = toArray();
        }
        return abstractInsnNode.index;
    }

    public void insert(AbstractInsnNode abstractInsnNode) {
        this.size++;
        if (this.first == null) {
            this.first = abstractInsnNode;
            this.last = abstractInsnNode;
        } else {
            this.first.prev = abstractInsnNode;
            abstractInsnNode.next = this.first;
        }
        this.first = abstractInsnNode;
        this.cache = null;
        abstractInsnNode.index = 0;
    }

    public void insert(AbstractInsnNode abstractInsnNode, AbstractInsnNode abstractInsnNode2) {
        this.size++;
        AbstractInsnNode abstractInsnNode3 = abstractInsnNode.next;
        if (abstractInsnNode3 == null) {
            this.last = abstractInsnNode2;
        } else {
            abstractInsnNode3.prev = abstractInsnNode2;
        }
        abstractInsnNode.next = abstractInsnNode2;
        abstractInsnNode2.next = abstractInsnNode3;
        abstractInsnNode2.prev = abstractInsnNode;
        this.cache = null;
        abstractInsnNode2.index = 0;
    }

    public void insert(AbstractInsnNode abstractInsnNode, InsnList insnList) {
        if (insnList.size == 0) {
            return;
        }
        this.size += insnList.size;
        AbstractInsnNode abstractInsnNode2 = insnList.first;
        AbstractInsnNode abstractInsnNode3 = insnList.last;
        AbstractInsnNode abstractInsnNode4 = abstractInsnNode.next;
        if (abstractInsnNode4 == null) {
            this.last = abstractInsnNode3;
        } else {
            abstractInsnNode4.prev = abstractInsnNode3;
        }
        abstractInsnNode.next = abstractInsnNode2;
        abstractInsnNode3.next = abstractInsnNode4;
        abstractInsnNode2.prev = abstractInsnNode;
        this.cache = null;
        insnList.removeAll(false);
    }

    public void insert(InsnList insnList) {
        if (insnList.size == 0) {
            return;
        }
        this.size += insnList.size;
        if (this.first == null) {
            this.first = insnList.first;
            this.last = insnList.last;
        } else {
            AbstractInsnNode abstractInsnNode = insnList.last;
            this.first.prev = abstractInsnNode;
            abstractInsnNode.next = this.first;
            this.first = insnList.first;
        }
        this.cache = null;
        insnList.removeAll(false);
    }

    public void insertBefore(AbstractInsnNode abstractInsnNode, AbstractInsnNode abstractInsnNode2) {
        this.size++;
        AbstractInsnNode abstractInsnNode3 = abstractInsnNode.prev;
        if (abstractInsnNode3 == null) {
            this.first = abstractInsnNode2;
        } else {
            abstractInsnNode3.next = abstractInsnNode2;
        }
        abstractInsnNode.prev = abstractInsnNode2;
        abstractInsnNode2.next = abstractInsnNode;
        abstractInsnNode2.prev = abstractInsnNode3;
        this.cache = null;
        abstractInsnNode2.index = 0;
    }

    public void insertBefore(AbstractInsnNode abstractInsnNode, InsnList insnList) {
        if (insnList.size == 0) {
            return;
        }
        this.size += insnList.size;
        AbstractInsnNode abstractInsnNode2 = insnList.first;
        AbstractInsnNode abstractInsnNode3 = insnList.last;
        AbstractInsnNode abstractInsnNode4 = abstractInsnNode.prev;
        if (abstractInsnNode4 == null) {
            this.first = abstractInsnNode2;
        } else {
            abstractInsnNode4.next = abstractInsnNode2;
        }
        abstractInsnNode.prev = abstractInsnNode3;
        abstractInsnNode3.next = abstractInsnNode;
        abstractInsnNode2.prev = abstractInsnNode4;
        this.cache = null;
        insnList.removeAll(false);
    }

    public ListIterator iterator() {
        return iterator(0);
    }

    public ListIterator iterator(int i) {
        return new InsnListIterator(this, i);
    }

    public void remove(AbstractInsnNode abstractInsnNode) {
        this.size--;
        AbstractInsnNode abstractInsnNode2 = abstractInsnNode.next;
        AbstractInsnNode abstractInsnNode3 = abstractInsnNode.prev;
        if (abstractInsnNode2 == null) {
            if (abstractInsnNode3 == null) {
                this.first = null;
                this.last = null;
            } else {
                abstractInsnNode3.next = null;
                this.last = abstractInsnNode3;
            }
        } else if (abstractInsnNode3 == null) {
            this.first = abstractInsnNode2;
            abstractInsnNode2.prev = null;
        } else {
            abstractInsnNode3.next = abstractInsnNode2;
            abstractInsnNode2.prev = abstractInsnNode3;
        }
        this.cache = null;
        abstractInsnNode.index = -1;
        abstractInsnNode.prev = null;
        abstractInsnNode.next = null;
    }

    void removeAll(boolean z) {
        if (z) {
            AbstractInsnNode abstractInsnNode = this.first;
            while (abstractInsnNode != null) {
                AbstractInsnNode abstractInsnNode2 = abstractInsnNode.next;
                abstractInsnNode.index = -1;
                abstractInsnNode.prev = null;
                abstractInsnNode.next = null;
                abstractInsnNode = abstractInsnNode2;
            }
        }
        this.size = 0;
        this.first = null;
        this.last = null;
        this.cache = null;
    }

    public void resetLabels() {
        for (AbstractInsnNode abstractInsnNode = this.first; abstractInsnNode != null; abstractInsnNode = abstractInsnNode.next) {
            if (abstractInsnNode instanceof LabelNode) {
                ((LabelNode) abstractInsnNode).resetLabel();
            }
        }
    }

    public void m9028set(AbstractInsnNode abstractInsnNode, AbstractInsnNode abstractInsnNode2) {
        AbstractInsnNode abstractInsnNode3 = abstractInsnNode.next;
        abstractInsnNode2.next = abstractInsnNode3;
        if (abstractInsnNode3 != null) {
            abstractInsnNode3.prev = abstractInsnNode2;
        } else {
            this.last = abstractInsnNode2;
        }
        AbstractInsnNode abstractInsnNode4 = abstractInsnNode.prev;
        abstractInsnNode2.prev = abstractInsnNode4;
        if (abstractInsnNode4 != null) {
            abstractInsnNode4.next = abstractInsnNode2;
        } else {
            this.first = abstractInsnNode2;
        }
        if (this.cache != null) {
            int i = abstractInsnNode.index;
            this.cache[i] = abstractInsnNode2;
            abstractInsnNode2.index = i;
        } else {
            abstractInsnNode2.index = 0;
        }
        abstractInsnNode.index = -1;
        abstractInsnNode.prev = null;
        abstractInsnNode.next = null;
    }

    public int size() {
        return this.size;
    }

    public AbstractInsnNode[] toArray() {
        int i = 0;
        AbstractInsnNode abstractInsnNode = this.first;
        AbstractInsnNode[] abstractInsnNodeArr = new AbstractInsnNode[this.size];
        while (abstractInsnNode != null) {
            abstractInsnNodeArr[i] = abstractInsnNode;
            abstractInsnNode.index = i;
            abstractInsnNode = abstractInsnNode.next;
            i++;
        }
        return abstractInsnNodeArr;
    }
}
