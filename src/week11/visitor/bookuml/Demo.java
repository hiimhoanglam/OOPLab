package week11.visitor.bookuml;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new BusinessBook());
        bookList.add(new DesignPatternBook());
        bookList.add(new JavaCoreBook());
        Visitor v = new VisitorImplementation();
        for (Book book: bookList) {
            book.accept(v);
        }
    }
}
