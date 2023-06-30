package BookList;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Sadece Aptallar 8 Saat Uyur", 344, "Erdal Demirkıran", 2006));
        books.add(new Book("Her Şey Seninle Başlar", 240, "Mümin Sekman", 2019));
        books.add(new Book("Rahel Tanrı'yla Hesaplaşıyor", 80, "Stefan Zweig", 2021));
        books.add(new Book("Eroinle Dans", 450, "Canan Tan", 2016));
        books.add(new Book("Parayı Bulduğum An Alayını", 245, "Erdal Demirkıran", 2011));
        books.add(new Book("Başarı Üniversitesi", 180, "Mümin Sekman", 2016));
        books.add(new Book("Peygamberler Tarihi", 721, "M. Asım Köksal", 2021));
        books.add(new Book("Beyaz Zambaklar Ülkesinde", 140, "Grigory Petrov", 2007));
        books.add(new Book("Yapay Zeka", 384, "Atınç Yılmaz", 2022));
        books.add(new Book("PROJELERLE YAPAY ZEKA VE BİLGİSAYARLI GÖRÜ", 608, "Ümit Aksoylu", 2021));

        Map<String, String> mapBooks = books.stream()
                .collect(HashMap::new, (map, book) -> map.put(book.getName(), book.getAuthorName()), HashMap::putAll);

        mapBooks.forEach((book, author) -> System.out.println("Kitap : " + book + "\tYazar : " + author));

        System.out.println("******************************************************************************************************");

        List<Book> filterBook = books.stream().filter(i -> i.getPageNumber() > 250).toList();

        filterBook.stream().forEach(i -> System.out.println("Kitap : " + i.getName()
                + "\tYazar : " + i.getAuthorName()
                + "\tSayfa Sayısı : " + i.getPageNumber()));
    }
}
