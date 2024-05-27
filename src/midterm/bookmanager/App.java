package midterm.bookmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    private static final BookManager bookManager = new BookManager();

    public static void main(String[] args) {
        init();
        System.out.println("------------Test original data----------------");
        testOriginalData();

        /* Yêu cầu:
        - Hoàn thiện code chương trình theo mẫu đã cho.
        - Viết code để test cho tất cả các hàm test bên dưới.

        - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
          là <TenSinhVien_MaSinhVien_BookManager>.txt (Ví dụ, NguyenVanA_123456_BookManager.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_BookManager>.zip (Ví dụ, NguyenVanA_123456_BookManager.zip),
          nộp lên classroom.
         */
        System.out.println("---------Test highest price---------");
        testFilterBooksHighestPrice();
        System.out.println("---------Test lowest price---------");
        testFilterBooksLowestPrice();
        System.out.println("---------Test filter book of author---------");
        testFilterBooksOfAuthor();
        System.out.println("---------Test filter book of genre---------");
        testFilterBooksOfGenre();
        System.out.println("---------Test filter book of publisher---------");
        testFilterBooksOfPublisher();
        System.out.println("---------Test price of book decreasing---------");
        testPriceOfBooksDecreasing();
        System.out.println("---------Test price of book increasing---------");
        testPriceOfBooksIncreasing();
        System.out.println("---------Test sort decreasing genre and price---------");
        testSortDecreasingGenreAndPrice();
        System.out.println("---------Test sort increasing genre and price---------");
        testSortIncreasingGenreAndPrice();
    }

    public static void init() {
        String filePath = "D:\\OOP2\\src\\midterm\\books.csv";
        readListData(filePath);
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 6) {
                    continue;
                }

                if (dataList.get(0).equals("title")) {
                    continue;
                }
                String title = dataList.get(0);
                String author = dataList.get(1);
                String genre = dataList.get(2);
                int pages = Integer.parseInt(dataList.get(3));
                double price = Double.parseDouble(dataList.get(4));
                String publisher = dataList.get(5);
                Book newBook = new Book.BookBuilder(title)
                        .withAuthor(author)
                        .withGenre(genre)
                        .withPages(pages)
                        .withPrice(price)
                        .withPublisher(publisher)
                        .build();
                bookManager.append(newBook);
                /*
                TODO
                Đọc được dữ liệu, tạo ra các đối tượng sinh viên ở đây, và cho vào bookManager để quản lý.

                Gợi ý:
                Các đội tượng Book không thể được tạo trực tiếp ở đây do hàm dựng là private,
                các đối tượng này được tạo ra bằng cách sử dụng Builder Pattern, ví dụ theo cách sau:
                Book newBook = new Book.BookBuilder(title).
                    .withAuthor(author)
                    .withGenre(genre)
                    ...
                    .build();
                */
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void testOriginalData() {
        List<Book> books = bookManager.getBookList();
        System.out.print(books);
    }

    /**
     * Test sắp xếp sách theo tiêu chí, đầu tiên theo genre tăng dần, sau đó theo giá giảm dần.
     */
    public static void testSortIncreasingGenreAndPrice() {
        /* TODO */
        List<Book> books = bookManager.sortIncreasingGenreAndPrice();
        System.out.println(books);
    }

    /**
     * Test sắp xếp sách theo tiêu chí, đầu tiên theo genre giảm dần, sau đó theo giá giảm dần.
     */
    public static void testSortDecreasingGenreAndPrice() {
        List<Book> books = bookManager.sortDecreasingGenreAndPrice();
        System.out.println(books);
    }

    /**
     * Test sắp xếp sách theo giá tăng dần.
     */
    public static void testPriceOfBooksIncreasing() {
        List<Book> books = bookManager.sortIncreasingPrice();
        System.out.println(books);
    }

    /**
     * Test sắp xếp sách theo giá giảm dần
     */
    public static void testPriceOfBooksDecreasing() {
        List<Book> books = bookManager.sortDecreasingPrice();
        System.out.println(books);
    }

    /**
     * Test lọc sách có giá rẻ nhất.
     */
    public static void testFilterBooksLowestPrice() {
        Book books = bookManager.sortIncreasingPrice().get(0);
        System.out.println(books);
    }

    /**
     * Test lọc sách có giá cao nhất.
     */
    public static void testFilterBooksHighestPrice() {
        Book books = bookManager.sortDecreasingPrice().get(0);
        System.out.println(books);
    }

    /**
     * Test lọc sách theo tác giả.
     */
    public static void testFilterBooksOfAuthor() {
        /* TODO */
        List<Book> books = bookManager.filterBooksOfAuthor("Maugham William S");
        System.out.println(books);
    }

    /**
     * Test lọc sách theo nhà xuất bản.
     */
    public static void testFilterBooksOfPublisher() {
        /* TODO */
        List<Book> books = bookManager.filterBooksOfPublisher("Random House");
        System.out.println(books);
    }

    /**
     * Test lọc sách theo thể loại.
     */
    public static void testFilterBooksOfGenre() {
        /* TODO */
        List<Book> books = bookManager.filterBooksOfGenre("data_science");
        System.out.println(books);
    }
}
