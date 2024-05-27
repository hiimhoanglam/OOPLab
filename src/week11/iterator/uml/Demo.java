package week11.iterator.uml;

public class Demo {
    public static void main(String[] args) {
        String[] products = new String[]{"Apple", "Orange", "Pineapple", "Pen", "Kiwi", "Avocado"};
        ProductCatalog productCatalog = new ProductCatalog(products);
        Iterator iterator = productCatalog.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator.reset();
        System.out.println("-----------");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
