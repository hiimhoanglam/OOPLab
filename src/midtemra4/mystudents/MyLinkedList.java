package midtemra4.mystudents;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        checkBoundaries(index, size);
        MyLinkedListNode tempNode = head;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.getNext();
        }
        return tempNode;
    }
    @Override
    public void insert(Object payload, int index) {
        checkBoundaries(index,size+1);
        if (index == size) {
            append(payload);
        }
        else if (index == 0) {
            MyLinkedListNode currentNode = new MyLinkedListNode(payload,head);
            this.head = currentNode;
            size++;
        }
        else {
            MyLinkedListNode prevNode = this.getNodeByIndex(index-1);
            MyLinkedListNode nextNode = this.getNodeByIndex(index);
            MyLinkedListNode currentNode = new MyLinkedListNode(payload,nextNode);
            prevNode.setNext(currentNode);
            size++;
        }

    }
    @Override
    public void set(Object payload, int index) {
        /* TODO */
        if (index == 0 && head != null) {
            head = new MyLinkedListNode(payload, head.getNext());
            return;
        }
        remove(index);
        insert(payload, index);
    }

    @Override
    public void append(Object payLoad) {
        if (size == 0) {
            this.head = new MyLinkedListNode(payLoad);
            size++;
        }
        else {
            MyLinkedListNode lastNode = this.getNodeByIndex(size -1);
            MyLinkedListNode newNode = new MyLinkedListNode(payLoad);
            lastNode.setNext(newNode);
            size++;
        }
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index,size);
        if (index == 0) {
            if (size > 1) {
                this.head = head.getNext();
            }
            else {
                this.head = null;
            }
            size--;
            return;
        }
        if (index == size -1) {
            MyLinkedListNode prevNode = this.getNodeByIndex(index - 1);
            prevNode.setNext(null);
            size--;
            return;
        }
        MyLinkedListNode prevNode = this.getNodeByIndex(index - 1);
        MyLinkedListNode nextNode = this.getNodeByIndex(index + 1);
        prevNode.setNext(nextNode);
        size--;

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index,size);
        return this.getNodeByIndex(index).getPayload();
    }

    @Override
    public MyIterator iterator() {
        MyLinkedListNode before = new MyLinkedListNode(head.getPayload(),head);
        return new MyLinkedListIterator(before);
    }
}
