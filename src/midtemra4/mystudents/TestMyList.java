package mystudents;

public class TestMyList {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyList>.txt
           (ví dụ, NguyenVanA_123456_MyList.txt)
         - Nộp kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
        System.out.println("***********Testing array list***********");
        testMyArrayList();
        System.out.println("***********Testing linked list***********");
        testMyLinkedList();

    }
    private static void insertStudents(MyList myList) {
        myList.insert(new Student("A", "Nguyen", 8), 0);
        myList.append(new Student("B", "Thieu", 9));
        myList.insert(new Student("N", "Cu", 10), 1);
        myList.append(new Student("H", "Hoang", 9));
        myList.insert(new Student("H", "Pham", 8), 1);
        myList.append(new Student("D", "Nguyen", 7));
        myList.insert(new Student("A", "Luong", 6.5), 1);
        myList.append(new Student("D", "Bui", 5));
        myList.insert(new Student("A", "Vu", 7), 1);
        myList.append(new Student("P", "Nguyen", 8));
    }
    private static void sortAndPrint(MyList myList) {
        StudentStatistics studentStatistics = new StudentStatistics(myList);
        System.out.println("Sort name ascending");
        testIterator(studentStatistics.sortByFullname(true));
        System.out.println("Sort name descending");
        testIterator(studentStatistics.sortByFullname(false));
        System.out.println("Sort average ascending");
        testIterator(studentStatistics.sortByAverage(true));
        System.out.println("Sort average descending");
        testIterator(studentStatistics.sortByAverage(false));
        testIterator(myList);
    }
    public static void testMyArrayList() {
        /*
         TODO

         - Tạo ra một list kiểu MyArrayList có ít nhất 10 Student.

         - Sử dụng StudentStatistics để
             + Sắp xếp và in ra danh sách các Student theo thứ tự tăng dần theo tên và họ.
             + Sắp xếp và in ra danh sách các Student theo thứ tự giảm dần theo tên và họ.
             + Sắp xếp và in ra danh sách các Student theo thứ tự tăng dần về average.
             + Sắp xếp và in ra danh sách các Student theo thứ tự giảm dần về average.
         */
        MyList myList = new MyArrayList();
        insertStudents(myList);
        sortAndPrint(myList);

    }

    public static void testMyLinkedList() {
        /*
         TODO

         - Tạo ra một list kiểu MyLinkedList có ít nhất 10 Student.

         - Sử dụng StudentStatistics để
             + Sắp xếp và in ra danh sách các Student theo thứ tự tăng dần theo tên và họ.
             + Sắp xếp và in ra danh sách các Student theo thứ tự giảm dần theo tên và họ.
             + Sắp xếp và in ra danh sách các Student theo thứ tự tăng dần về average.
             + Sắp xếp và in ra danh sách các Student theo thứ tự giảm dần về average.
         */
        MyList myList = new MyLinkedList();
        insertStudents(myList);
        sortAndPrint(myList);
    }

    public static void testIterator(MyList myList) {
        /*
         TODO

         Sử dụng iterator duyệt qua tất cả các phần tử trong danh sách myList và in ra thông tin về phần tử đó.
         */
        MyIterator myIterator = myList.iterator();
        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }
    }
}
