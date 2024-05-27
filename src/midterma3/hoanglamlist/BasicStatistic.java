package midterma3.mylist;

public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        /* TODO */
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     * @return giá trị lớn nhất.
     */
    public double max() {
        /* TODO */
        double max = (double)data.get(0);
        for (int i = 1; i < data.size(); i++) {
            if (Double.compare((double)data.get(i), max) > 0) {
                max = (double)data.get(i);
            }
        }
        return max;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        /* TODO */
        double min = (double)data.get(0);
        for (int i = 1; i < data.size(); i++) {
            if (Double.compare((double)data.get(i), min) < 0) {
                min = (double)data.get(i);
            }
        }
        return min;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     * @return kỳ vọng.
     */
    public double mean() {
        /* TODO */
        double sum = 0;
        for (int i = 0; i < data.size(); i++) {
            sum += (double) data.get(i);
        }
        return sum / data.size();
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     * @return phương sai.
     */
    public double variance() {
        /* TODO */
        double sum = 0;

        for (int i = 0; i < data.size(); i++)
            sum += (double)data.get(i);
        double mean = sum / data.size();

        // Compute sum squared
        // differences with mean.
        double sqDiff = 0;
        for (int i = 0; i < data.size(); i++)
            sqDiff += ((double)data.get(i) - mean) *
                    ((double)data.get(i) - mean);

        return (double)sqDiff / data.size();
    }
}
