import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>();
        books.add(new Book("Nutuk",543,"Mustafa Kemal Atatürk",1927));
        books.add(new Book("Osmanlı Tarihinde Efsaneler ve Gerçekler",272,"Halil İnalcık",2015));
        books.add(new Book("Türkiye'nin Yakın Tarihi",256,"İlber Ortaylı",2018));
        books.add(new Book("Sultanın Korsanları",592,"Emrah Safa Gürkan",2021));
        books.add(new Book("Galata, Pera, Beyoğlu: A Biography",274,"Brendan Freely",2016));

        System.out.println("Kitapların isme göre sıralaması: ");
        for (Book book : books) {
            System.out.println(book.getName());
        }
        System.out.println();

        System.out.println("Kitapların sayfa sayısına göre sıralaması: ");
        Set<Book> books2 = new TreeSet<>(Comparator.comparing(Book::getPageNumber));
         books2.addAll(books);

         for (Book book2 : books2) {
            System.out.println(book2.getPageNumber());
        }


    }
}