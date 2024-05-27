package finalweek12.mylist;

public class TestMyList {
    public static void main(String[] args) {
        testMyArrayList();
        System.out.println("******************************************");
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
        System.out.println("Initial empty list size = " + myList.size());
        System.out.println("Empty list: " + myList);
//        System.out.println("Trying to remove an element off an empty list");
//        myList.remove(0);
//        System.out.println("Trying to get an element with index out of bounds");
//        System.out.println(myList.get(1));
        myList.append(-1.5);
        myList.append(-1);
        myList.append(-0.5);
        myList.append(10);
        myList.append(2.5);
        System.out.println("After appending -1.5, -1, -0.5, 10, 2.5: " + myList);
        MyIterator myIterator = myList.iterator();
        System.out.println("Testing with iterator");
        while (myIterator.hasNext()) {
            System.out.print(myIterator.next() + " ");
        }
        System.out.println();
        myList.insert(20.5, 3);
        System.out.println("Adding an element at index 3: " + myList);
        myList.remove(3);
        System.out.println("Removing the element at index 3: " + myList);
        myList.insert(5.6, 0);
        System.out.println("Adding an element at index 0: " + myList);
        myList.remove(0);
        System.out.println("Removing the element at index 0: " + myList);
        System.out.println("-------------------------");
        BasicStatistic statistic = new BasicStatistic(myList);
        System.out.println("Max of original list = " + statistic.max());
        System.out.println("Min of original list = " + statistic.min());
        System.out.println("Mean of original list = " + statistic.mean());
        System.out.println("Variance of original list = " + statistic.variance());
    }

    public static void testMyLinkedList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyLinkedList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        MyLinkedList myList = new MyLinkedList();
        System.out.println("Initial empty list size = " + myList.size());
        System.out.println("Empty list: " + myList);
//        System.out.println("Trying to remove an element off an empty list");
//        myList.remove(0);
//        System.out.println("Trying to get an element with index out of bounds");
//        System.out.println(myList.get(1));
        myList.append(-1.5);
        myList.append(-1);
        myList.append(-0.5);
        myList.append(10);
        myList.append(2.5);
        System.out.println("After appending -1.5, -1, -0.5, 10, 2.5: " + myList);
        MyIterator myIterator = myList.iterator();
        System.out.println("Testing with iterator");
        while (myIterator.hasNext()) {
            System.out.print(myIterator.next() + " ");
        }
        System.out.println();
        myList.insert(20.5, 3);
        System.out.println("Adding an element at index 3: " + myList);
        myList.remove(3);
        System.out.println("Removing the element at index 3: " + myList);
        myList.insert(5.6, 0);
        System.out.println("Adding an element at index 0: " + myList);
        myList.remove(0);
        System.out.println("Removing the element at index 0: " + myList);
        System.out.println("-------------------------");
        BasicStatistic statistic = new BasicStatistic(myList);
        System.out.println("Max of original list = " + statistic.max());
        System.out.println("Min of original list = " + statistic.min());
        System.out.println("Mean of original list = " + statistic.mean());
        System.out.println("Variance of original list = " + statistic.variance());
    }
}
