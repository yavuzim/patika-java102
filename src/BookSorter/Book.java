package BookSorter;

import java.util.Comparator;

public class Book implements Comparable<Book> {
    private String bookName;
    private String author;
    private int pageNumber;

    public Book() {

    }

    public Book(String bookName, String author, int pageNumber) {
        this.bookName = bookName;
        this.author = author;
        this.pageNumber = pageNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public int compareTo(Book o) {
        return this.getBookName().compareTo(o.getBookName());
    }

}
