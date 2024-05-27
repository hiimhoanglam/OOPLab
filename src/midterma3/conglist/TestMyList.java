package hus.oop.midterm.mylist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestMyList {
    public static void main(String[] args) throws FileNotFoundException {
        /*
         * TODO
         * Chạy demo các hàm test.
         * Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyList>.txt
         * (ví dụ, NguyenVanA_123456_MyList.txt)
         */
        testMyArrayList();
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyArrayList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        Double[] arr = new Double[]{1.0, 2.0, 3.0, 4.0, 5.0};
        MyList arrList = new MyArrayList(arr);
        arrList.append(0.0);
        System.out.println(arrList.toString());

        BasicStatistic statistic = new BasicStatistic(arrList);
        System.out.println("Max: " + statistic.max());
        System.out.println("Min: " + statistic.min());
        System.out.println("Mean: " + statistic.mean());
        System.out.println("Variance: " + statistic.variance());
        System.out.println("");
    }

    public static void testMyLinkedList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyLinkedList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        MyList linkList = new MyLinkedList();
        linkList.append(0.0);
        linkList.append(1.0);
        linkList.append(2.0);
        linkList.append(3.0);
        linkList.append(4.0);
        System.out.println(linkList.toString());

        BasicStatistic statistic = new BasicStatistic(linkList);
        System.out.println("Max: " + statistic.max());
        System.out.println("Min: " + statistic.min());
        System.out.println("Mean: " + statistic.mean());
        System.out.println("Variance: " + statistic.variance());
    }
}
