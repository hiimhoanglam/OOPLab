package hus.oop.midterm.statistics;

import java.util.ArrayList;
import java.util.List;

public class ListDataSet extends AbstractDataSet {
    private List<Double> data;

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public ListDataSet() {
        data = new ArrayList<>();
    }

    public ListDataSet(List<Double> data) {
        this.data = data;
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public double element(int index) {
        return data.get(index);
    }

    @Override
    public double[] elements(int from, int to) {
        int index = 0;
        double[] result = new double[to - from + 1];
        for (int i = from; i <= to; i++) {
            result[index++] = data.get(i);
        }
        return result;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void append(double value) {
        data.add(value);
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * @param value
     * @param index
     */
    @Override
    public void insert(double value, int index) {
        data.add(index, value);
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        data.remove(index);
    }

    /**
     * Xóa tất cả các phần tử dữ liệu có giá trị bằng value.
     * @param value
     */
    @Override
    public void remove(double value) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) == value) {
                data.remove(i);
            }
        }
    }
}
