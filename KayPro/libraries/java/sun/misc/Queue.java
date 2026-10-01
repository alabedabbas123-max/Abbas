package sun.misc;

import java.io.PrintStream;
import java.util.Enumeration;

public class Queue {
    int length = 0;
    Queue4 head = null;
    Queue4 tail = null;

    public synchronized void enqueue(Object obj) {
        Queue4 newElt = new Queue4(obj);
        if (this.head == null) {
            this.head = newElt;
            this.tail = newElt;
            this.length = 1;
        } else {
            newElt.next = this.head;
            this.head.prev = newElt;
            this.head = newElt;
            this.length++;
        }
        notify();
    }

    public Object dequeue() throws InterruptedException {
        return dequeue(0L);
    }

    public synchronized Object dequeue(long timeOut) throws InterruptedException {
        Queue4 elt;
        while (this.tail == null) {
            wait(timeOut);
        }
        elt = this.tail;
        Queue4 queue4 = elt.prev;
        this.tail = queue4;
        if (queue4 == null) {
            this.head = null;
        } else {
            queue4.next = null;
        }
        this.length--;
        return elt.f598obj;
    }

    public synchronized boolean isEmpty() {
        return this.tail == null;
    }

    public final synchronized Enumeration elements() {
        return new Queue3(this);
    }

    public final synchronized Enumeration reverseElements() {
        return new Queue2(this);
    }

    public synchronized void dump(String msg) {
        System.err.println(">> " + msg);
        PrintStream printStream = System.err;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.length);
        sb.append(" elt(s); head = ");
        sb.append(this.head == null ? "null" : this.head.f598obj + "");
        sb.append(" tail = ");
        sb.append(this.tail == null ? "null" : this.tail.f598obj + "");
        printStream.println(sb.toString());
        Queue4 last = null;
        for (Queue4 cursor = this.head; cursor != null; cursor = cursor.next) {
            System.err.println("  " + cursor);
            last = cursor;
        }
        if (last != this.tail) {
            System.err.println("  tail != last: " + this.tail + ", " + last);
        }
        System.err.println("]");
    }
}
