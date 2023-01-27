import java.util.ArrayList;
import java.util.List;

public class BookList {
    List<Book> books = new ArrayList<>();
    public BookList(){
        books.add(new Fiction("Harrypota", "Anton", 0));
        books.add(new Fiction("Persijeksen", "Budiman", 3));
        books.add(new nonFiction("Kalkulus", "Caca", 1));
        books.add(new nonFiction("Fisika", "Suparman", 0));
    }

    public List<Book> getList() {
        return books;
    }

    public void pinjam(String title) {
        boolean match = false;
        for(Book book : books) {
            if (book.getTitle().equals(title) && book.stock() > 0) {
                book.keterangan();
                System.out.println("Anda meminjam buku " + title + ".");
                book.stock -= 1;
                match = true;
                break;
            } else if(book.getTitle().equals(title) && book.stock() == 0){
                System.out.println("Buku " + title + " sedang kosong.");
                match = true;
                break;
            }
        }
        if(!match) {
            System.out.println("Buku yang anda cari tidak tersedia.");
        }
    }

    public void kembali(String title) {
        boolean match = false;
        for(Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println("Buku " + title + " telah dikembalikan.");
                match = true;
                book.stock += 1;
                break;
            }
        }
        if(!match) {
            System.out.println("Buku yang anda cari invalid.");
        }
    }
}
