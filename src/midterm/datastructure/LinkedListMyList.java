package midterm.datastructure;

import midterma3.conglist.MyLinkedListNode;

public class LinkedListMyList extends AbstractMyList {
    private Node start;
    private Node end;
    private int size;

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public LinkedListMyList() {
        this.start = null;
        this.end = null;
    }

    @Override
    public int size() {
        /* TODO */
        return this.size;
    }

    /**
     * Lấy giá trị của phần tử ở vị trí index.
     * @param index
     * @return
     */
    @Override
    public int get(int index) {
        /* TODO */
        Node node = getNodeByIndex(index);
        return node.data;
    }

    /**
     * Sửa dữ liệu ở vị trí index thành data.
     * @param data
     * @param index
     */
    @Override
    public void set(int data, int index) {
        /* TODO */
        Node node = getNodeByIndex(index);
        node.data = data;
    }

    /**
     * Thêm phần tử dữ liệu vào đầu tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtStart(int value) {
        Node newNode = new Node(value);
        if (size == 0) {
            start = newNode;
            end = newNode;
        }
        else {
            newNode.next = start;
            start = newNode;
        }
        size++;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtEnd(int value) {
        /* TODO */
        Node newNode = new Node(value);
        if (size == 0) {
            start = newNode;
        }
        else {
            end.next = newNode;
        }
        end = newNode;
        size++;
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * Chỉ thêm được nếu index nằm trong đoạn [0 - size()].
     * @param value
     * @param index
     */
    @Override
    public void insertAtPos(int value, int index) {
        /* TODO */
        checkBoundaries(index, size);
        if (index == 0) {
            insertAtStart(value);
        }
        else if (index == size) {
            insertAtEnd(value);
        }
        else {
            Node prev = getNodeByIndex(index - 1);
            Node curr = getNodeByIndex(index);
            Node newNode = new Node(value);
            prev.next = newNode;
            newNode.next = curr;
            size++;
        }
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * Chỉ xóa được nếu index nằm trong đoạn [0 - (size() - 1)]
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        checkBoundaries(index, size - 1);
        if (index == 0) {
            start = start.next;
        } else if (index == size - 1){
            Node prev = getNodeByIndex(size - 2);
            prev.next = null;
            end = prev;
        }
        else {
            Node prevNode = getNodeByIndex(index - 1);
            Node currNode = prevNode.next;
            prevNode.next = currNode.next;
        }
        size--;
    }

    /**
     * Phương thức lấy Node ở vị trí index.
     * @param index
     * @return
     */
    private Node getNodeByIndex(int index) {
        /* TODO */
        checkBoundaries(index, size - 1);
        Node currentNode = start;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    /**
     * Lấy ra dữ liệu được lưu theo cấu trúc dữ liệu kiểu mảng.
     * @return
     */
    @Override
    public int[] toArray() {
        /* TODO */
        int[] result = new int[size];
        Node curr = start;
        for (int i = 0; i < size; i++) {
            result[i] = curr.data;
            curr = curr.next;
        }
        return result;
    }
}
