package sun.misc;

class Queue4 {

    Object f598obj;
    Queue4 next = null;
    Queue4 prev = null;

    Queue4(Object obj) {
        this.f598obj = null;
        this.f598obj = obj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("QueueElement[obj=");
        sb.append(this.f598obj);
        sb.append(this.prev == null ? " null" : " prev");
        sb.append(this.next != null ? " next" : " null");
        sb.append("]");
        return sb.toString();
    }
}
