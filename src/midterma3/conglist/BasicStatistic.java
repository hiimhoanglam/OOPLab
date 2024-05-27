package midterma3.conglist;

import java.util.NoSuchElementException;

public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     *
     * @return giá trị lớn nhất.
     */
    public double max() {
        if (data.size() == 0) {
            throw new NoSuchElementException("Cannot find max or min value.");
        } else {
            double maxValue = (double) data.get(0);
            for (int i = 0; i < data.size(); i++) {
                if ((double) data.get(i) > maxValue) {
                    maxValue = (double) data.get(i);
                }
            }
            return maxValue;
        }
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     *
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        if (data.size() == 0) {
            throw new NoSuchElementException("Cannot find max or min value.");
        }
        double minValue = (double) data.get(0);
        for (int i = 0; i < data.size(); i++) {
            if ((double) data.get(i) < minValue) {
                minValue = (double) data.get(i);
            }
        }
        return minValue;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     *
     * @return kỳ vọng.
     */
    public double mean() {
        if (data.size() == 0) {
            throw new NoSuchElementException("Cannot calculate.");
        }
        double minValue = (double) data.get(0);
        for (int i = 0; i < data.size(); i++) {
            if ((double) data.get(i) < minValue) {
                minValue = (double) data.get(i);
            }
        }
        return minValue;
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     *
     * @return phương sai.
     */
    public double variance() {
        if (data.size() == 0) {
            throw new NoSuchElementException("Cannot calculate.");
        } else {
            double mean = this.mean();
            double sum = 0;
            for (int i = 0; i < data.size(); i++) {
                double temp = (double) data.get(i) - mean;
                sum += temp * temp;
            }
            return sum / data.size();
        }
    }
}