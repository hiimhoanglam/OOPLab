package week9.mylist;

public class MyLinkedList extends MyAbstractList{
    int size;
    MyLinkedListNode head;

    public MyLinkedList() {
        head = null;
        size = 0;
    }
    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr;
    }

    @Override
    public void add(Object o) {
        if (size == 0) {
            head = new MyLinkedListNode(o);
        }
        else {
            MyLinkedListNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new MyLinkedListNode(o);
        }
        size++;
    }

    @Override
    public void add(Object o, int index) {
        checkBoundaries(index, size);
        MyLinkedListNode newNode = new MyLinkedListNode(o);
        if (index == 0) {
            newNode.next = head;
            this.head = newNode;
        }
        else if (index == size) {
            MyLinkedListNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        else {
            MyLinkedListNode prev = head;
            MyLinkedListNode curr = head;
            for (int i = 0; i < index; i++) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = newNode;
            newNode.next = curr;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (size == 0 || head == null) {
            return;
        }
        if (index == 0) {
            head = head.next;
        }
        else if (index == size - 1) {
            MyLinkedListNode curr = head;
            while (curr.next.next != null) {
                curr = curr.next;
            }
            curr.next = null;
        }
        else {
            MyLinkedListNode prev = head;
            MyLinkedListNode curr = head;
            for (int i = 0; i < index; i++) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;
        }
        size--;
    }

    @Override
    public Object get(int index) {
        if (size == 0 || head == null) {
            return null;
        }
        checkBoundaries(index, size);
        MyLinkedListNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.getPayload();
    }

    @Override
    public int size() {
        return size;
    }
}
