package midterm.datastructure;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        /*
        Yêu cầu:

        - Hoàn thiện code chương trình theo mẫu đã cho.

        - Sinh ra một số tự nhiên ngẫu nhiên nằm trong đoạn [15 - 30], gọi là n.
        - Sinh ra n số nguyên ngẫu nhiên, cho vào stack.
            + In ra các phần tử trong stack.
            + Lần lượt xóa các phần tử trong stack. Sau mỗi lần xóa, in ra các phần tử còn lại trong stack.

        - Sinh ra n số nguyên ngẫu nhiên, cho vào queue.
            + In ra các phần tử trong queue.
            + Lần lượt xóa các phần tử trong queue. Sau mỗi lần xóa, in ra các phần tử còn lại trong queue.
        */
        System.out.println("--------------------------Testing stack--------------------");
        testStack();
        System.out.println("--------------------------Testing queue--------------------");
        testQueue();
    }

    public static void testStack() {
        /* TODO */
        MyStack myStack = new MyStack();
        Random random = new Random();
        int n = random.nextInt(30 - 15 + 1) + 15;
        for (int i = 0; i < n; i++) {
            myStack.push(random.nextInt(30 - 15 + 1) + 15);
        }
        myStack.printData();
        while (!myStack.isEmpty()) {
            myStack.pop();
            myStack.printData();
        }
    }

    public static void testQueue() {
        /* TODO */
        MyQueue myStack = new MyQueue();
        Random random = new Random();
        int n = random.nextInt(30 - 15 + 1) + 15;
        for (int i = 0; i < n; i++) {
            myStack.add(random.nextInt(30 - 15 + 1) + 15);
        }
        myStack.printData();
        while (!myStack.isEmpty()) {
            myStack.remove();
            myStack.printData();
        }
    }
}
