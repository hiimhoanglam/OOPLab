package week12.mylist;

public class TestMyList {
    public static void main(String[] args) {
        /*
         * TODO
         * Chạy demo các hàm test.
         */
        testMyArrayList();
        System.out.println("-----------------");
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyArrayList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        MyList myList = new MyArrayList();
        myList.append(4);
        myList.append(2);
        myList.append(5);
        myList.append(1);
        myList.append(7);
        myList.append(6);
        myList.append(10);
        System.out.println(myList);
        BasicStatistic basicStatistic = new BasicStatistic(myList);
        System.out.println(basicStatistic.min());
        System.out.println(basicStatistic.max());
        System.out.println(basicStatistic.mean());
        System.out.println(basicStatistic.variance());
    }

    public static void testMyLinkedList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyLinkedList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        MyList myList = new MyLinkedList();
        myList.append(4);
        myList.append(2);
        myList.append(5);
        myList.append(1);
        myList.append(7);
        myList.append(6);
        myList.append(10);
        BasicStatistic basicStatistic = new BasicStatistic(myList);
        System.out.println(basicStatistic.min());
        System.out.println(basicStatistic.max());
        System.out.println(basicStatistic.mean());
        System.out.println(basicStatistic.variance());
    }
}
