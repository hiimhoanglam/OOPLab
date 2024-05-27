package midterma3.statistics;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
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
        System.out.println("--------------Testing array data set--------------");
        testArrayDataSet();
        System.out.println("--------------Testing list data set--------------");
        testListDataSet();
    }
    public static void testBasicStatistics(DataSet dataSet) {
        BasicStatistic basicStatistic = new BasicStatistic();
        basicStatistic.setDataSet(dataSet);
        System.out.println("Size = " + basicStatistic.size());
        System.out.println("Max = " + basicStatistic.max());
        System.out.println("Min = " + basicStatistic.min());
        System.out.println("Mean = " + basicStatistic.mean());
        System.out.println("Variance = " + basicStatistic.variance());
        System.out.println("Median = " + basicStatistic.median());
        System.out.println("Rank = " + Arrays.toString(basicStatistic.rank()));
    }
    public static void testArrayDataSet() {
        DataSet dataSet = new ArrayDataSet();
        dataSet.append(2.5);
        dataSet.append(1.5);
        dataSet.append(5.5);
        dataSet.append(4.5);
        dataSet.append(3.5);
        dataSet.append(7.5);
        dataSet.append(6.5);
        System.out.println(dataSet);
        dataSet.insert(10.5,0);
        dataSet.insert(8.5,4);
        System.out.println(dataSet);
        testBasicStatistics(dataSet);
        dataSet.remove(0);
        dataSet.remove(dataSet.size() - 1);
        testBasicStatistics(dataSet);
    }
    public static void testListDataSet() {
        DataSet dataSet = new ListDataSet();
        dataSet.append(2.5);
        dataSet.append(1.5);
        dataSet.append(5.5);
        dataSet.append(4.5);
        dataSet.append(3.5);
        dataSet.append(7.5);
        dataSet.append(6.5);
        System.out.println(dataSet);
        dataSet.insert(10.5,0);
        dataSet.insert(8.5,4);
        System.out.println(dataSet);
        testBasicStatistics(dataSet);
        dataSet.remove(0);
        dataSet.remove(dataSet.size() - 1);
        testBasicStatistics(dataSet);
    }
}
