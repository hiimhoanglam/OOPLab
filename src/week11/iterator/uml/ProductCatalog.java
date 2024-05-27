package week11.iterator.uml;

public class ProductCatalog implements Iterable{
    String[] products;

    public ProductCatalog(String[] products) {
        this.products = products;
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator(products);
    }
}
