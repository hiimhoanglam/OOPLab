package week12.mylist;

public class TestClass {
    public static void main(String[] args) {
        MyList myArrayList = new MyArrayList();
        myArrayList.append(1);
        myArrayList.append(2);
        myArrayList.append(3);
        myArrayList.append(4);
        myArrayList.append(5);
        System.out.println(myArrayList);

        myArrayList.insert(10,3);
        System.out.println(myArrayList);
        myArrayList.remove(3);
        System.out.println(myArrayList);
        myArrayList.insert(100, 0);
        System.out.println(myArrayList);
        myArrayList.insert(200, myArrayList.size());
        System.out.println(myArrayList);
        myArrayList.remove(0);
        System.out.println(myArrayList);
        myArrayList.remove(myArrayList.size() - 1);
        System.out.println(myArrayList);
//
//        System.out.println(myArrayList.get(2));
//        System.out.println(myArrayList.size());
//        MyIterator myIterator = myArrayList.iterator();
//        while (myIterator.hasNext()) {
//            System.out.println(myIterator.next());
//        }
    }
}
