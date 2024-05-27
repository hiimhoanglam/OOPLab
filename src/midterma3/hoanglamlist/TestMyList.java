package midterma3.mylist;

public class TestMyList {
    public static void main(String[] args) {
        /*
         * TODO
         * Chạy demo các hàm test.
         * Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyList>.txt
         * (ví dụ, NguyenVanA_123456_MyList.txt)
         */
        System.out.println("-----------Testing array list-----------");
        testMyArrayList();
//        System.out.println("-----------Testing linked list-----------");
//        testMyLinkedList();
    }

    public static void testMyArrayList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyArrayList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        MyArrayList arrayList = new MyArrayList();
        arrayList.append(0);
        arrayList.append(1.5);
        arrayList.append(2.5);
        arrayList.append(3.5);
        arrayList.append(4.5);
        arrayList.append(5.5);
        arrayList.insert(7.5, 3);
        arrayList.remove(3);
        arrayList.remove(arrayList.size() - 1);
        arrayList.remove(0);
        System.out.println(arrayList);
        MyIterator myArrayListIterator = arrayList.iterator();
        while (myArrayListIterator.hasNext()) {
            System.out.println(myArrayListIterator.next());
        }

        BasicStatistic basicStatistic = new BasicStatistic(arrayList);
        System.out.println("max = " + basicStatistic.max());
        System.out.println("min = " + basicStatistic.min());
        System.out.println("mean = " + basicStatistic.mean());
        System.out.println("variance = " + basicStatistic.variance());
    }

    public static void testMyLinkedList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyLinkedList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.append(0);
        linkedList.append(1.5);
        linkedList.append(2.5);
        linkedList.append(3.5);
        linkedList.append(4.5);
        linkedList.append(5.5);
        linkedList.insert(7.5, 3);
        linkedList.remove(3);
        linkedList.remove(linkedList.size() - 1);
        linkedList.remove(0);
        System.out.println(linkedList);
        MyIterator myIterator = linkedList.iterator();
        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }

        BasicStatistic basicStatistic = new BasicStatistic(linkedList);
        System.out.println("max = " + basicStatistic.max());
        System.out.println("min = " + basicStatistic.min());
        System.out.println("mean = " + basicStatistic.mean());
        System.out.println("variance = " + basicStatistic.variance());
    }
}
