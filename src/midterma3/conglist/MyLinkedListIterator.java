package midterma3.conglist;

public class MyLinkedListIterator implements MyIterator {
    private MyLinkedListNode currentNode;

    /**
     * Khởi tạo dữ liệu cho Iterator là node hiện tại trong MyLinkedList.
     * @param node
     */
    public MyLinkedListIterator(MyLinkedListNode node) {
        this.currentNode = node;
    }

    /**
     * Kiểm tra trong MyLinkedList có còn phần tử tiếp theo không.
     * Nếu còn thì trả về true, nếu không còn thì trả về false.
     * @return
     */
    @Override
    public boolean hasNext() {
        return currentNode != null;
    }

    /**
     * iterator dịch chuyển sang phần tử kế tiếp của MyLinkedList và trả ra dữ liệu (payload) của phần tử hiện tại của MyLinkedList.
     * @return payload của phần tử hiện tại.
     */
    @Override
    public Object next() {
        if (!hasNext()) {
            return null;
        }
        Object payload = currentNode.getPayload();
        currentNode = currentNode.getNext();
        return payload;
    }
}