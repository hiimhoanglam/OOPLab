package hus.oop.midterm.statistics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class TestStatistics {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        TODO
        I. Viết các chức năng test cho chương trình.
        Viết hàm test cho ArrayDataSet:
            1. Tạo một tập dữ liệu ít nhất 10 phần tử. Trong đó có test các chức năng:
                + Thêm phần tử vào cuối tập dữ liệu.
                + Thêm phần tử vào đầu tập dữ liệu.
            2. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
            3. Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu.
            4. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).

         Viết hàm test cho ListDataSet:
            1. Tạo một tập dữ liệu ít nhất 10 phần tử. Trong đó có test các chức năng:
                + Thêm phần tử vào cuối tập dữ liệu.
                + Thêm phần tử vào đầu tập dữ liệu.
            2. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
            3. Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu.
            4. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).

         II. Chạy các hàm test để test chương trình.
         Copy kết quả chạy chương trình và lưu vào file text có tên <Ten_MaSinhVien_Statistics>.txt
         (ví dụ, NguyenVanA_123456S_Statistics.txt).
         Nén các file source code và file text kết quả chạy chương trình theo định dạng .zip,
         đặt tên là <Ten_MaSinhVien_Statistics>.zip (ví dụ, NguyenVanA_123456_Statistics.zip) và nộp lên classroom.
         */

        System.out.println("Test ArrayDataSet");
        double[] arr = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
        DataSet arrayDataSet1 = new ArrayDataSet(arr);

        System.out.println("Test append: ");
        arrayDataSet1.append(11);
        System.out.println(arrayDataSet1.toString());

        System.out.println("Test indert: ");
        arrayDataSet1.insert(0.0, 0);
        System.out.println(arrayDataSet1.toString());

        // Test statistics
        Statistic statistic1 = new BasicStatistic(arrayDataSet1);
        System.out.println("Size: " + statistic1.size());
        System.out.println("Max: " + statistic1.max());
        System.out.println("Min: " + statistic1.min());
        System.out.println("Mean: " + statistic1.mean());
        System.out.println("Variance: " + statistic1.variance());
        System.out.println("Rank: " + Arrays.toString(statistic1.rank()));
        System.out.println("Median: " + statistic1.median());

        System.out.println("Test remove: ");
        arrayDataSet1.remove(0);
        System.out.println(arrayDataSet1.toString());

        System.out.println("");
        //Test 2
        System.out.println("Test ListDataSet: ");
        List<Double> testData = new ArrayList<>(Arrays.asList(3.2, 2.7, 1.5, 4.9, 6.1, 0.8, 2.4, 5.3, 4.2, 3.6));
        ListDataSet dataSet = new ListDataSet(testData);

        System.out.println("Test append: ");
        dataSet.append(11);
        System.out.println(dataSet.toString());

        System.out.println("Test indert: ");
        dataSet.insert(0.0, 0);
        System.out.println(dataSet.toString());

        // Test statistics
        Statistic statistic2 = new BasicStatistic(dataSet);
        System.out.println("Size: " + statistic2.size());
        System.out.println("Max: " + statistic2.max());
        System.out.println("Min: " + statistic2.min());
        System.out.println("Mean: " + statistic2.mean());
        System.out.println("Variance: " + statistic2.variance());
        System.out.println("Rank: " + Arrays.toString(statistic2.rank()));
        System.out.println("Median: " + statistic2.median());

        System.out.println("Test remove: ");
        dataSet.remove(0);
        System.out.println(dataSet.toString());

    }
}
