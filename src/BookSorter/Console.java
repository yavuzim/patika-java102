package BookSorter;

import java.util.TreeSet;

public class Console {
    public static void write(TreeSet<Book> books){
        for (Book book : books) {
            System.out.println("Kitap Adı : " + book.getBookName() + " - Yazar : " + book.getAuthor() + " - Sayfa Sayısı : " + book.getPageNumber());
        }
    }
}
