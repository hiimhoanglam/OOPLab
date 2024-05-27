package midterm.bookmanager;

import java.util.*;

public class BookManager {
    private List<Book> bookList;

    public BookManager() {
        bookList = new LinkedList<>();
    }

    public List<Book> getBookList() {
        /* TODO */
        return this.bookList;
    }

    /**
     * Phương thức kiểm tra xem chỉ số index có nằm trong đoạn [0 - limit] hay không.
     * @param index
     * @param limit
     * @return
     */
    private boolean checkBoundaries(int index, int limit) {
        /* TODO */
        return index < 0 || index > limit;
    }

    /**
     * Thêm book vào cuối danh sách.
     * @param book
     */
    public void append(Book book) {
        /* TODO */
        bookList.add(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * @param book
     * @param index
     */
    public void add(Book book, int index) {
        /* TODO */
        if(checkBoundaries(index, bookList.size() - 1)) {
            throw new IndexOutOfBoundsException();
        }
        bookList.add(index, book);
    }

    /**
     * Xóa book ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        if(checkBoundaries(index, bookList.size() - 1)) {
            throw new IndexOutOfBoundsException();
        }
        bookList.remove(index);
    }

    /**
     * Bỏ book như tham số truyền vào.
     * @param book
     */
    public void remove(Book book) {
        /* TODO */
        if (book == null) {
            return;
        }
        bookList.remove(book);
    }

    /**
     * Lấy ra book ở vị trí index
     * @param index
     * @return
     */
    public Book bookAt(int index) {
        /* TODO */
        if(checkBoundaries(index, bookList.size() - 1)) {
            throw new IndexOutOfBoundsException();
        }
        return bookList.get(index);
    }

    /**
     * Sắp xếp danh sách book theo thứ tự tăng dần theo genre và sau đó đến title.
     * @return
     */
    public List<Book> sortIncreasingByGenreAndTitle() {
        /* TODO */
        Book[] array = bookList.toArray(new Book[0]);
        int n = array.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i+1; j < n; j++)
                if (array[j].compareTo(array[minIndex]) < 0)
                    minIndex = j;

            // Swap the found minimum element with the first
            // element
            Book temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return new ArrayList<>(Arrays.asList(array));
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo genre tăng dần, nếu genre như nhau thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * @return
     */
    public List<Book> sortIncreasingGenreAndPrice() {
        /* TODO */
        List<Book> result = bookList;
        MyBookComparator myBookComparator = new MyBookComparator() {
            @Override
            public int compare(Book left, Book right) {
                int genreComparison = left.getGenre().compareTo(right.getGenre());
                if (genreComparison != 0) {
                    return genreComparison;
                }
                return Double.compare(right.getPrice(), left.getPrice());
            }
        };
        Book[] array = bookList.toArray(new Book[0]);;
        int n = array.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i+1; j < n; j++)
                if (myBookComparator.compare(array[j], array[minIndex]) < 0) {
                    minIndex = j;
                }

            // Swap the found minimum element with the first
            // element
            Book temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return new ArrayList<>(Arrays.asList(array));

    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo genre giảm dần, nếu genre như nhau thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * @return
     */
    public List<Book> sortDecreasingGenreAndPrice() {
        /* TODO */
        List<Book> result = bookList;
        MyBookComparator myBookComparator = new MyBookComparator() {
            @Override
            public int compare(Book left, Book right) {
                int genreComparison = left.getGenre().compareTo(right.getGenre());
                if (genreComparison != 0) {
                    return genreComparison;
                }
                return Double.compare(left.getPrice(), right.getPrice());
            }
        };
        Book[] array = bookList.toArray(new Book[0]);;
        int n = array.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the maximum element in unsorted array
            int maxIndex = i;
            for (int j = i+1; j < n; j++)
                if (myBookComparator.compare(array[j], array[maxIndex]) > 0) {
                    maxIndex = j;
                }

            // Swap the found minimum element with the first
            // element
            Book temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }
        return new ArrayList<>(Arrays.asList(array));
    }

    /**
     * Sắp xếp sách theo giá tăng dần.
     * @return
     */
    public List<Book> sortIncreasingPrice() {
        Book[] array = bookList.toArray(new Book[0]);;
        int n = array.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i+1; j < n; j++)
                if (array[j].getPrice() < array[minIndex].getPrice())
                    minIndex = j;

            // Swap the found minimum element with the first
            // element
            Book temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return new ArrayList<>(Arrays.asList(array));
    }

    /**
     * Sắp xếp sách theo giá giảm dần.
     * @return
     */
    public List<Book> sortDecreasingPrice() {
        /* TODO */
        Book[] array = bookList.toArray(new Book[0]);;
        int n = array.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the maximum element in unsorted array
            int maxIndex = i;
            for (int j = i+1; j < n; j++)
                if (array[j].getPrice() > array[maxIndex].getPrice())
                    maxIndex = j;

            // Swap the found maximum element with the first
            // element
            Book temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }
        return new ArrayList<>(Arrays.asList(array));
    }

    /**
     * Sắp xếp sách theo số trang tăng dần.
     * @return
     */
    public List<Book> sortIncreasingPages() {
        Book[] array = bookList.toArray(new Book[0]);;
        int n = array.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i+1; j < n; j++)
                if (array[j].getPages() < array[minIndex].getPages())
                    minIndex = j;

            // Swap the found minimum element with the first
            // element
            Book temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return new ArrayList<>(Arrays.asList(array));
    }

    /**
     * Sắp xếp sách theo số trang giảm dần.
     * @return
     */
    public List<Book> sortDecreasingPages() {
        Book[] array = bookList.toArray(new Book[0]);;
        int n = array.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the maximum element in unsorted array
            int maxIndex = i;
            for (int j = i+1; j < n; j++)
                if (array[j].getPages() > array[maxIndex].getPages())
                    maxIndex = j;

            // Swap the found maximum element with the first element
            Book temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }
        return new ArrayList<>(Arrays.asList(array));
    }

    /**
     * Lọc ra howMany sách có số trang lớn nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterHighestPages(int howMany) {
        /* TODO */
        int maxPage = bookList.get(0).getPages();
        for (Book book: bookList) {
            if (book.getPages() > maxPage) {
                maxPage = book.getPages();
            }
        }
        List<Book> result = new ArrayList<>();
        int currentNumber = 0;
        for (Book book: bookList) {
            if (book.getPages() == maxPage) {
                result.add(book);
                currentNumber++;
            }
            if (currentNumber == howMany) {
                break;
            }
        }
        return result;
    }

    /**
     * Lọc ra những sách có số trang cao hơn lowerBound.
     * @param lowerBound
     * @return
     */
    public List<Book> filterBooksPagesHigherThan(double lowerBound) {
        /* TODO */
        List<Book> result = new ArrayList<>();
        for (Book book: bookList) {
            if (book.getPages() > lowerBound) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * Lọc ra howMany sách có số trang nhỏ nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterBookLowestPages(int howMany) {
        /* TODO */
        int minPage = bookList.get(0).getPages();
        for (Book book: bookList) {
            if (book.getPages() < minPage) {
                minPage = book.getPages();
            }
        }
        List<Book> result = new ArrayList<>();
        int currentNumber = 0;
        for (Book book: bookList) {
            if (book.getPages() == minPage) {
                result.add(book);
                currentNumber++;
            }
            if (currentNumber == howMany) {
                break;
            }
        }
        return result;
    }

    /**
     * Lọc ra howMany sách có số trang nhỏ hơn upperBound.
     * @param upperBound
     * @return
     */
    public List<Book> filterBooksPagesLowerThan(double upperBound) {
        /* TODO */
        List<Book> result = new ArrayList<>();
        for (Book book: bookList) {
            if (book.getPages() < upperBound) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * Lọc ra những sách theo nhà xuất bản.
     * @param publisher
     * @return
     */
    public List<Book> filterBooksOfPublisher(String publisher) {
        /* TODO */
        List<Book> result = new ArrayList<>();
        for (Book book: bookList) {
            if (book.getPublisher().equals(publisher)) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * Lọc ra những sách theo thể loại.
     * @param genre
     * @return
     */
    public List<Book> filterBooksOfGenre(String genre) {
        /* TODO */
        List<Book> result = new ArrayList<>();
        for (Book book: bookList) {
            if (book.getGenre().equals(genre)) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * Lọc ra những sách theo tác giả.
     * @param author
     * @return
     */
    public List<Book> filterBooksOfAuthor(String author) {
        /* TODO */
        List<Book> result = new ArrayList<>();
        for (Book book: bookList) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public static String titleOfBooksToString(List<Book> bookList) {
        StringBuilder titleOfBooks = new StringBuilder();
        titleOfBooks.append("[\n");
        for (Book book : bookList) {
            titleOfBooks.append(book.getTitle()).append("\n");
        }
        return titleOfBooks.toString().trim() + "\n]";
    }

    public static void print(List<Book> bookList) {
        StringBuilder booksString = new StringBuilder();
        booksString.append("[\n");
        for (Book book : bookList) {
            booksString.append(book.toString()).append("\n");
        }
        System.out.print(booksString.toString().trim() + "\n]");
    }
}
