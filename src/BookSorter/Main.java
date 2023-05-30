package BookSorter;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Kitap nesneleri oluşturuldu.
        Book b1 = new Book("Dönüşüm", "Franz Kafka", 80);
        Book b2 = new Book("Gece Yarısı Kütüphanesi", "Matt Haig", 296);
        Book b3 = new Book("Kürk Mantolu Madonna", "Sabahattin Ali", 160);
        Book b4 = new Book("Tutunamayanlar", "Oğuz Atay", 724);
        Book b5 = new Book("Hayvan Çiftliği", "George Orwell", 152);

        // Kitap nesneleri TreeSet'e eklendi ve yazara göre sıralama yapıldı.
        TreeSet<Book> bookAuther = new TreeSet<>();
        bookAuther.add(b1);
        bookAuther.add(b2);
        bookAuther.add(b3);
        bookAuther.add(b4);
        bookAuther.add(b5);

        // TreeSet'te sıralanan kitaplar ekrana yazıldı.
        Console.write(bookAuther);

        System.out.println("--------------------------------------------------------------------------------------------------------------");

        // Kitap nesneleri TreeSet'e eklendi ve sayfa numarasına göre sıralama yapıldı.
        TreeSet<Book> bookPageNumber = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });
        bookPageNumber.add(b1);
        bookPageNumber.add(b2);
        bookPageNumber.add(b3);
        bookPageNumber.add(b4);
        bookPageNumber.add(b5);

        // TreeSet'te sıralanan kitaplar ekrana yazıldı.
        Console.write(bookPageNumber);
    }
}
