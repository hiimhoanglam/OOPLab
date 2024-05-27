package week12.mylist;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        this.head = new MyLinkedListNode(0);
    }

    /**
     * Lấy kích thước của list.
     * @return
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        return getNodeByIndex(index).getPayload();
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        checkIndex(index);
        if (index == 0) {
            head = head.getNext();
        }
        else {
            MyLinkedListNode curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.getNext();
            }
            curr.setNext(getNodeByIndex(index).getNext());
        }
        size--;
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     * @param payload
     */
    @Override
    public void append(Object payload) {
        MyLinkedListNode newNode = new MyLinkedListNode(payload);
        if (size == 0) {
            head = newNode;
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
        if (index == size) {
            append(payload);
            return;
        }
        checkIndex(index);
        MyLinkedListNode newNode = new MyLinkedListNode(payload);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        }
        else {
            MyLinkedListNode curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.getNext();
            }
            newNode.setNext(curr.getNext());
            curr.setNext(newNode);
        }
        size++;
    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     * @return
     */
    @Override
    public MyIterator iterator() {
        return new MyLinkedListIterator(head);
    }

    /**
     * Lấy node ở vị trí index.
     * @param index
     * @return
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        checkIndex(index);
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }
}
