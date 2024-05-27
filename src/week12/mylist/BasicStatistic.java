package week12.mylist;

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
        MyIterator myIterator = data.iterator();
        double max = Double.MIN_VALUE;
        while (myIterator.hasNext()) {
            double currentValue = Double.parseDouble(myIterator.next().toString());
            if (currentValue > max) {
                max = currentValue;
            }
        }
        return max;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     *
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        MyIterator myIterator = data.iterator();
        double min = Double.MAX_VALUE;
        while (myIterator.hasNext()) {
            double currentValue = Double.parseDouble(myIterator.next().toString());
            if (currentValue < min) {
                min = currentValue;
            }
        }
        return min;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     *
     * @return kỳ vọng.
     */
    public double mean() {
        MyIterator myIterator = data.iterator();
        double mean = 0;
        while (myIterator.hasNext()) {
            mean += Double.parseDouble(myIterator.next().toString());
        }
        return mean / data.size();
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     *
     * @return phương sai.
     */
    public double variance() {
        MyIterator myIterator = data.iterator();
        double variance = 0;
        while (myIterator.hasNext()) {
            variance += Math.pow(Double.parseDouble(myIterator.next().toString()) - mean(), 2);
        }
        return variance / data.size();
    }
}
