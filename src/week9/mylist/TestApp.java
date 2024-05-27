package week9.mylist;

public class TestApp {
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        // Test accessing elements
        System.out.println("Test accessing elements:");
        System.out.println(arrayList);

        // Test removing element at index 1
        arrayList.remove(1);
        System.out.println("\nAfter removing element at index 1:");
        System.out.println(arrayList);

        // Test adding elements at specific index
        arrayList.add(5, 1);
        System.out.println("\nAfter adding 5 at index 1:");
        System.out.println(arrayList);

        // Test size
        System.out.println("\nSize of the array list: " + arrayList.size());

        System.out.println("-----------------------------------------------");

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        // Test accessing elements
        System.out.println("Test accessing elements:");
        System.out.println(linkedList);

        // Test removing element at index 1
        linkedList.remove(1);
        System.out.println("\nAfter removing element at index 1:");
        System.out.println(linkedList);

        // Test adding elements at specific index
        linkedList.add(5, 1);
        System.out.println("\nAfter adding 5 at index 1:");
        System.out.println(linkedList);

        // Test size
        System.out.println("\nSize of the linked list: " + linkedList.size());
    }
}
