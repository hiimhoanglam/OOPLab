package week12.mylist;

import java.util.Arrays;

public class MyArrayList extends MyAbstractList {
    private static final int DEFAULT_CAPACITY = 2;
    private Object[] data;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyArrayList() {
        this.data = new Object[DEFAULT_CAPACITY];
        this.size = 0;
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
        checkIndex(index);
        return data[index];
    }

    /**
     * Xóa phần tử ở vị trí index trong list.
     * @param index
     */
    @Override
    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < this.size - 1; i++) {
            data[i] = data[i+1];
        }
        size--;
    }

    /**
     * Thêm phần tử có dữ liệu payload vào cuối list.
     * Nếu danh sách hết chỗ, cấp phát thêm gấp đôi chỗ cho list.
     * @param payload
     */
    @Override
    public void append(Object payload) {
        if (payload == null) {
            return;
        }
        if (size == data.length) {
            enlarge();
        }
        data[size] = payload;
        size++;
    }

    /**
     * Thêm phần tử có dữ liệu payload vào list ở vị trí index.
     * Nếu list hết chỗ, cấp phát thêm gấp đôi chỗ cho list.
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
       for (int i = size; i > index; i--) {
           data[i] = data[i-1];
       }
       data[index] = payload;
       size++;
    }

    /**
     * Tạo iterator để có thể duyệt qua các phần tử của list.
     * @return
     */
    @Override
    public MyIterator iterator() {
        return new MyArrayListIterator(data);
    }

    /**
     * Cấp phát gấp đôi chỗ cho list khi cần thiết.
     */
    private void enlarge() {
        /* TODO */
        data = Arrays.copyOf(data, data.length * 2);
    }
}
