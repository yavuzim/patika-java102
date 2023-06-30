package BookList;

import java.util.Date;

public class Book {
    private String name;
    private int pageNumber;
    private String authorName;
    private int publictionDate;

    public Book(String name, int pageNumber, String authorName, int publictionDate) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.publictionDate = publictionDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublictionDate() {
        return publictionDate;
    }

    public void setPublictionDate(int publictionDate) {
        this.publictionDate = publictionDate;
    }
}
