package midterma3.mylist;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        /* TODO */
    }

    /**
     * Lấy kích thước của list.
     * @return
     */
    @Override
    public int size() {
        return this.size;
    }
    //Check for index out of bounds
    private boolean checkBoundaries(int index) {
        return index < 0 || index > size;
    }
    /**
     * Lấy phần tử ở vị trí index trong list.
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        if (checkBoundaries(index)) {
            return null;
        }
        MyLinkedListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.getNext();
        }
        return curr.getPayload();
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        if (checkBoundaries(index)) {
            return;
        }
        if (index == 0) {
            head = head.getNext();
        }
        else if (index == size - 1) {
            MyLinkedListNode curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(null);
        }
        else {
            MyLinkedListNode curr = head;
            MyLinkedListNode prev = head;
            for (int i = 0; i < index; i++) {
                prev = curr;
                curr = curr.getNext();
            }
            prev.setNext(curr.getNext());
            curr.setNext(null);
        }
        size--;
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     * @param payload
     */
    @Override
    public void append(Object payload) {
        /* TODO */
        if (size == 0) {
            head = new MyLinkedListNode(payload);
        }
        else {
            MyLinkedListNode curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(new MyLinkedListNode(payload));
        }
        size++;
    }

    /**
     * Thêm vào list phần tử có dữ liệu payload ở vị trí index.
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        /* TODO */
        if (checkBoundaries(index)) {
            return;
        }
        if (index == 0) {
            MyLinkedListNode node = new MyLinkedListNode(payload);
            node.setNext(head);
            head = node;
        }
        else if (index == size - 1) {
            append(payload);
        }
        else {
            MyLinkedListNode curr = head;
            MyLinkedListNode prev = head;
            for (int i = 0; i < index; i++) {
                prev = curr;
                curr = curr.getNext();
            }
            MyLinkedListNode node = new MyLinkedListNode(payload);
            prev.setNext(node);
            node.setNext(curr);
        }
        size++;
    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     * @return
     */
    @Override
    public MyIterator iterator() {
        /* TODO */
        return new MyLinkedListIterator(head);
    }

    /**
     * Lấy node ở vị trí index.
     * @param index
     * @return
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        /* TODO */
        if (checkBoundaries(index)) {
            return null;
        }
        MyLinkedListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.getNext();
        }
        return curr;
    }
}
