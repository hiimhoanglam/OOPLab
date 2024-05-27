package week11.iterator.uml;

public class ProductIterator implements Iterator{
    String[] products;

    public ProductIterator(String[] products) {
        this.products = products;
    }
    int currentPosition;
    @Override
    public String next() {
        String currentProduct = products[currentPosition];
        currentPosition++;
        return currentProduct;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < products.length && products[currentPosition] != null;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
