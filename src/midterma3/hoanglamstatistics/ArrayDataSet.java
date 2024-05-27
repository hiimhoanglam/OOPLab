package midterma3.statistics;

import java.util.Arrays;

public class ArrayDataSet extends AbstractDataSet {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] data;
    private int size;

    /**
     * Hàm dựng để khởi tạo dữ liệu.
     */
    public ArrayDataSet() {
        /* TODO */
        this.data = new double[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        /* TODO */
        return this.size;
    }

    private boolean checkBoundaries(int index) {
        return index < 0 || index > size;
    }

    @Override
    public double element(int index) {
        /* TODO */
        if (checkBoundaries(index)) {
            return -1;
        }
        return data[index];
    }

    @Override
    public double[] elements(int from, int to) {
        if (from >= to || checkBoundaries(from) || checkBoundaries(to)) {
            return null;
        }
        /* TODO */
        return Arrays.copyOfRange(data,from,to);
    }

    /**
     * Thêm phần tử dữ liệu vào cuối mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void append(double value) {
        /* TODO */
        if (size >= data.length) {
            enlarge();
        }
        data[size] = value;
        size++;
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     * @param value
     * @param index
     */
    @Override
    public void insert(double value, int index) {
        /* TODO */
        if (checkBoundaries(index)) {
            return;
        }
        if (size >= data.length) {
            enlarge();
        }
        for (int i = size; i > index; i--) {
            data[i] = data[i-1];
        }
        data[index] = value;
        size++;
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        if (checkBoundaries(index)) {
            return;
        }
        if (size == 0) {
            return;
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i+1];
        }
        data[size - 1] = -1000000;
        size--;
    }

    /**
     * Xóa tất cả các phần tử dữ liệu có giá trị bằng value.
     * @param value
     */
    @Override
    public void remove(double value) {
        /* TODO */
        int i = 0;
        while (i < size) {
            if (data[i] == value) {
                remove(i);
            }
        }
    }

    /**
     * Mở rộng gấp đôi kích thước mảng nếu hết chỗ để chứa dữ liệu.
     */
    private void enlarge() {
        /* TODO */
        data = Arrays.copyOf(data, size * 2);
    }
}
