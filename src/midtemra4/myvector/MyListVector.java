package midtemra4.myvector;

import java.util.ArrayList;
import java.util.List;

public class MyListVector extends AbstractMyVector {
    private List<Double> data;

    /**
     * Khởi tạo mặc định cho vector.
     */
    public MyListVector() {
        /* TODO */
        this.data = new ArrayList<>();
    }

    @Override
    public int size() {
        /* TODO */
        return data.size();
    }

    @Override
    public double coordinate(int index) {
        /* TODO */
        checkBoundaries(index,size());
        return data.get(index);
    }

    @Override
    public double[] coordinates() {
        /* TODO */
        double[] result = new double[this.size()];
        for (int i = 0; i < size(); i++) {
            result[i] = data.get(i);
        }
        return result;
    }

    @Override
    public void set(double value, int index) {
        /* TODO */
        checkBoundaries(index,size());
        data.set(index,value);
    }

    /**
     * Cộng các giá trị tọa độ với value.
     * @param value
     * @return vector hiện tại.
     */
    public MyListVector add(double value) {
        /* TODO */
        checkEmpty(size());
        for (int i = 0; i < size(); i++) {
            data.set(i,data.get(i) + value);
        }
        return this;
    }

    /**
     * Cộng vector khác vào vector hiện tại.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     * @param another
     * @return vector hiện tại.
     */
    public MyListVector add(MyListVector another) {
        /* TODO */
        checkEmpty(size());
        checkEmpty(another.size());
        if (this.size() != another.size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = 0; i < size(); i++) {
            data.set(i,data.get(i) + another.coordinate(i));
        }
        return this;
    }

    /**
     * Trừ các giá trị tọa độ của vector cho value.
     * @return vector hiện tại.
     */
    public MyListVector minus(double value) {
        /* TODO */
        checkEmpty(size());
        for (int i = 0; i < size(); i++) {
            data.set(i,data.get(i) - value);
        }
        return this;
    }

    /**
     * Trừ vector hiện tại với vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * @return vector hiện tại.
     */
    public MyListVector minus(MyListVector another) {
        /* TODO */
        checkEmpty(size());
        checkEmpty(another.size());
        if (this.size() != another.size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = 0; i < size(); i++) {
            data.set(i,data.get(i) - another.coordinate(i));
        }
        return this;
    }

    /**
     * Tích vô hướng của hai vector.
     * Hai vector chỉ có tích vô hướng nếu có cùng số chiều.
     * Nếu hai vector không cùng số chiều, in ra thông báo lỗi hoặc ném exception.
     * @return vector hiện tại.
     */
    public double dot(MyListVector another) {
        /* TODO */
        checkEmpty(size());
        checkEmpty(another.size());
        if (this.size() != another.size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        double result = 0;
        for (int i = 0; i < size(); i++) {
            result += data.get(i) * another.coordinate(i);
        }
        return result;
    }

    /**
     * Các giá trị của vector được lấy mũ power.
     * @param power
     * @return vector hiện tại.
     */
    public MyListVector pow(double power) {
        /* TODO */
        checkEmpty(size());
        for (int i = 0; i < size(); i++) {
            data.set(i,Math.pow(data.get(i),power));
        }
        return this;
    }

    /**
     * Các giá trị tọa độ của vector được nhân với value.
     * @return vector hiện tại.
     */
    public MyListVector scale(double value) {
        /* TODO */
        checkEmpty(size());
        for (int i = 0; i < size(); i++) {
            data.set(i,data.get(i) * value);
        }
        return this;
    }

    /**
     * Lấy chuẩn của vector.
     * @return chuẩn của vector.
     */
    @Override
    public double norm() {
        /* TODO */
        checkEmpty(size());
        return Math.sqrt(this.dot(this));
    }

    /**
     * Thêm một giá trị value vào tọa độ vector ở vị trí cuối cùng.
     * @param value
     * @return vector hiện tại.
     */
    public MyListVector insert(double value) {
        /* TODO */
        data.add( value);
        return this;
    }

    /**
     * Thêm một giá trị vào tọa độ vector ở vị trí index.
     * @param value
     * @param index
     * @return vector hiện tại.
     */
    public MyListVector insert(double value, int index) {
        /* TODO */
        checkBoundaries(index,size()+1);
        data.add(index,value);
        return this;
    }

    /**
     * Xóa giá trị ở tọa độ thứ index.
     * Nếu index không hợp lệ thì in ra thông báo lỗi hoặc ném exception.
     * @param index
     * @return vector hiện tại.
     */
    public MyListVector remove(int index) {
        /* TODO */
        checkBoundaries(index,size());
        data.remove(index);
        return this;
    }

    /**
     * Trích xuất ra một vector con của vector ban đầu, có các giá trị tọa độ
     * được lấy theo các chỉ số của mảng đầu vào.
     * Ví dụ, cho vector [1 2 3 4 5], cho mảng đầu vào là {2, 1} thì vector trích xuất ra
     * có tọa độ là [2 1].
     * Nếu có thỉ số trong mảng đầu vào không hợp lệ thì in ra thông báo lỗi,
     * hoặc ném exception.
     * @param indices
     * @return vector mới có tọa độ được trích xuất từ vector hiện tại.
     */
    public MyListVector extract(int[] indices) {
        /* TODO */
        checkEmpty(size());
        checkEmpty(indices.length);
        MyListVector result = new MyListVector();
        for (int i = 0; i < indices.length; i++) {
            checkBoundaries(indices[i]-1,size());
            result.insert(this.coordinate(indices[i] - 1));
        }
        return result;
    }

}
