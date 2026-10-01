package sun.misc;

import java.util.Enumeration;
import java.util.NoSuchElementException;

final class Queue3 implements Enumeration {
    Queue4 cursor;
    Queue queue;

    Queue3(Queue q) {
        this.queue = q;
        this.cursor = q.head;
    }

    @Override
    public boolean hasMoreElements() {
        return this.cursor != null;
    }

    @Override
    public Object nextElement() {
        synchronized (this.queue) {
            if (this.cursor != null) {
                Queue4 result = this.cursor;
                this.cursor = this.cursor.next;
                return result.f598obj;
            }
            throw new NoSuchElementException("LIFOQueueEnumerator");
        }
    }
}
