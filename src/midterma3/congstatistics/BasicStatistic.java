package midterma3.congstatistics;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class BasicStatistic implements Statistic {
    private DataSet dataSet;

    /**
     * Hàm dựng khởi tạo tập dữ liệu.
     */
    public BasicStatistic() {
        dataSet = new ListDataSet();
    }

    public BasicStatistic(DataSet dataSet) {
        this.dataSet = dataSet;
    }

    public void setDataSet(DataSet dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public int size() {
        return dataSet.size();
    }

    @Override
    public double max() {
        if (dataSet.size() == 0) {
            throw new NoSuchElementException("Cannot find max or min value.");
        } else {
            double maxValue = dataSet.element(0);
            for (int i = 0; i < dataSet.size(); i++) {
                if (dataSet.element(i) > maxValue) {
                    maxValue = dataSet.element(i);
                }
            }
            return maxValue;
        }
    }

    @Override
    public double min() {
        if (dataSet.size() == 0) {
            throw new NoSuchElementException("Cannot find max or min value.");
        } else {
            double minValue = dataSet.element(0);
            for (int i = 0; i < dataSet.size(); i++) {
                if (dataSet.element(i) < minValue) {
                    minValue = dataSet.element(i);
                }
            }
            return minValue;
        }
    }

    @Override
    public double mean() {
        if (dataSet.size() == 0) {
            return -1;
        } else {
            double sum = 0;
            for (int i = 0; i < dataSet.size(); i++) {
                sum += dataSet.element(i);
            }
            return sum / dataSet.size();
        }
    }

    @Override
    public double variance() {
        if (dataSet.size() == 0) {
            return -1;
        } else {
            double mean = this.mean();
            double sum = 0;
            for (int i = 0; i < dataSet.size(); i++) {
                double temp = dataSet.element(i) - mean;
                sum += temp * temp;
            }
            return sum / dataSet.size();
        }
    }

    @Override
    public double[] rank() {
        if (dataSet.size() == 0) {
            throw new IllegalStateException("Data set is empty.");
        } else {
            double result[] = new double[dataSet.size()];

            // Sweep through all elements in A
            // for each element count the number
            // of less than and equal elements
            // separately in r and s
            for (int i = 0; i < dataSet.size(); i++) {
                int numLessThan = 1;
                int numEqualTo = 1;

                for (int j = 0; j < dataSet.size(); j++)
                {
                    if (j != i && dataSet.element(j) < dataSet.element(i))
                        numLessThan += 1;

                    if (j != i && dataSet.element(j) == dataSet.element(i))
                        numEqualTo += 1;
                }

                // Use formula to obtain  rank
                result[i] = numLessThan + (double)(numEqualTo - 1) / (double) 2;

            }
            return result;
        }
    }

    @Override
    public double median() {
        double[] sortedData = dataSet.elements(0, dataSet.size() - 1);
        Arrays.sort(sortedData);
        int middleIndex = dataSet.size() / 2;
        if (dataSet.size() % 2 == 0) {
            return (sortedData[middleIndex - 1] + sortedData[middleIndex]) / 2;
        } else {
            return sortedData[middleIndex];
        }
    }
}
