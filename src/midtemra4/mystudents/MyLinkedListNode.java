package mystudents;

public class MyLinkedListNode {
    private Object payload;
    private MyLinkedListNode next;

    public MyLinkedListNode(Object payload) {
        /* TODO */
        this.payload = payload;
        this.next = null;
    }

    public MyLinkedListNode(Object payload, MyLinkedListNode next) {
        /* TODO */
        this.payload = payload;
        this.next = next;
    }

    public Object getPayload() {
        /* TODO */
        return this.payload;
    }

    public MyLinkedListNode getNext() {
        /* TODO */
        return this.next;
    }

    public void setNext(MyLinkedListNode node) {
        /* TODO */
        this.next = node;
    }
}
