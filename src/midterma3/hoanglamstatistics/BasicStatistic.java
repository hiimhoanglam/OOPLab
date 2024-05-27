package midterma3.statistics;

import java.util.Arrays;

public class BasicStatistic implements Statistic {
    private DataSet dataSet;

    /**
     * Hàm dựng khởi tạo tập dữ liệu.
     */
    public BasicStatistic() {
        /* TODO */
        this.dataSet = new ListDataSet();
    }

    public void setDataSet(DataSet dataSet) {
        /* TODO */
        this.dataSet = dataSet;
    }

    @Override
    public int size() {
        /* TODO */
        return dataSet.size();
    }

    @Override
    public double max() {
        /* TODO */
        double max = dataSet.element(0);
        for (int i = 1; i < dataSet.size(); i++) {
            if (Double.compare(dataSet.element(i), max) > 0) {
                max = dataSet.element(i);
            }
        }
        return max;
    }

    @Override
    public double min() {
        /* TODO */
        double min = dataSet.element(0);
        for (int i = 1; i < dataSet.size(); i++) {
            if (Double.compare(dataSet.element(i), min) < 0) {
                min = dataSet.element(i);
            }
        }
        return min;
    }

    @Override
    public double mean() {
        /* TODO */
        double sum = dataSet.element(0);
        for (int i = 1; i < dataSet.size(); i++) {
            sum += dataSet.element(i);
        }
        return sum / dataSet.size();
    }

    @Override
    public double variance() {
        /* TODO */
        double sum = 0;
        int n = dataSet.size();
        for (int i = 0; i < n; i++)
            sum += dataSet.element(i);
        double mean = sum / (double)n;

        // Compute sum squared
        // differences with mean.
        double sqDiff = 0;
        for (int i = 0; i < n; i++)
            sqDiff += (dataSet.element(i) - mean) * (dataSet.element(i)- mean);

        return sqDiff / n;
    }

    @Override
    public double[] rank() {
        int n = dataSet.size();
        double[] element = new double[dataSet.size()];
        for (int i = 0; i < element.length; i++) {
            element[i] = dataSet.element(i);
        }
        double[] R= new double[n];

        // Sweep through all elements in A
        // for each element count the number
        // of less than and equal elements
        // separately in r and s
        for (int i = 0; i < n; i++) {
            int r = 1, s = 1;

            for (int j = 0; j < n; j++)
            {
                if (j != i && element[j] < element[i])
                    r += 1;

                if (j != i && element[j] == element[i])
                    s += 1;
            }

            // Use formula to obtain  rank
            R[i] = r + (float)(s - 1) / (float) 2;
        }
        return R;
    }

    @Override
    public double median() {
        /* TODO */
        double[] element = new double[dataSet.size()];
        for (int i = 0; i < element.length; i++) {
            element[i] = dataSet.element(i);
        }
        Arrays.sort(element);
        int n = dataSet.size();
        if (n % 2 != 0)
            return element[n / 2];

        return (element[(n - 1) / 2] + element[n / 2]) / 2.0;
    }
}
