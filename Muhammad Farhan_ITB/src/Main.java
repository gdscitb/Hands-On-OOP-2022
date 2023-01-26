import java.util.Scanner;
import java.util.ArrayList;

interface LibraryItem {
    // Metode check in and check out
    void checkOut();
    void checkIn();
}

abstract class LibraryMaterial {
    // Buat atribut benda perpus
    private String title;
    private String author;
    protected boolean isCheckedOut;
    private String itemId;

    // Constructor
    public LibraryMaterial(String title, String author, String itemId) {
        this.title = title;
        this.author = author;
        this.itemId = itemId;
        this.isCheckedOut = false;
    }

    // buat getters untuk mengambil informasi
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isCheckedOut() { return isCheckedOut; }
    public String getItemId() { return itemId; }
}

class Book extends LibraryMaterial implements LibraryItem {
    // deklarasi atribut buku
    private int numberOfPages;

    // konstruktor
    public Book(String title, String author, String itemId, int numberOfPages) {
        super(title, author, itemId);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() { return numberOfPages; }

    public void checkOut() {
        if (!this.isCheckedOut()) {
            this.isCheckedOut = true;
            System.out.println("Buku '" + this.getTitle() + "' berhasil dipinjam.");
        } else {
            System.out.println("Buku '" + this.getTitle() + "' sudah dipinjam.");
        }
    }

    public void checkIn() {
        if (this.isCheckedOut()) {
            this.isCheckedOut = false;
            System.out.println("Buku '" + this.getTitle() + "' berhasil dikembalkan.");
        } else {
            System.out.println("Buku '" + this.getTitle() + "' tidak sedang dipinjam.");
        }
    }
}


// MAIN LOOP
public class Main {
    public static void main(String[] args) {
        // buat ArrayList untuk menyimpan data buku
        ArrayList<Book> books = new ArrayList<Book>();

        // buat scanner untuk membaca input user
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Print menu
            System.out.println("Menu:");
            System.out.println("1. Tambahkan Buku");
            System.out.println("2. Ambil Buku");
            System.out.println("3. Kembalikan Buku");
            System.out.println("4. Lihat Status book");
            System.out.println("5. Exit");

            // baca input user
            System.out.print("Masukkan pilihan anda: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                // tambahkan buku dengan meminta input user
                System.out.print("Masukkan Judul: ");
                String title = scanner.next();
                System.out.print("Masukkan Penulis: ");
                String author = scanner.next();
                System.out.print("Masukkan ISBN: ");
                String itemId = scanner.next();
                System.out.print("Masukkan Jumlah Halaman: ");
                int numberOfPages = scanner.nextInt();

                Book book = new Book(title, author, itemId, numberOfPages);
                books.add(book);
                System.out.println("Buku '" + title + "' telah ditambahkan.");

            } else if (choice == 2) {

                // pinjam buku dengan memasukkan ISBN
                System.out.print("Masukkan ISBN: ");
                String itemId = scanner.next();

                Book book = findBook(books, itemId);
                if (book != null) {
                    book.checkOut();

                } else {
                    System.out.println("Buku tidak ditemukan.");
                }

            } else if (choice == 3) {
                // Kembalikan buku dengan memasukkan ISBN
                System.out.print("Masukkan ISBN: ");
                String itemId = scanner.next();

                Book book = findBook(books, itemId);
               
                if (book != null) {
                    book.checkIn();

                } else {
                    System.out.println("Buku tidak ditemukan.");
                    }   
                } 
                else if (choice == 4) {
                    // Berikan status buku berdasarkan ISBN
                    System.out.print("Masukkan ISBN: ");
                    String itemId = scanner.next();

                    Book book = findBook(books, itemId);
                    if (book != null) {
                        if (book.isCheckedOut()) {
                            System.out.println("Buku '" + book.getTitle() + "' sedang dipinjam.");
                        } else {
                            System.out.println("Buku '" + book.getTitle() + "' tidak sedang dipinjam.");
                        }
                    } else {
                        System.out.println("Buku tidak ditemukan.");
                    }
                } else if (choice == 5) {
                    // Exit
                    break;
                } else {
                    System.out.println("Pilihan tidak ditemukan");
                }
            }
            scanner.close();
        }
        
        // method untu mencari buku berdasarkan ISBN di arraylist
        public static Book findBook(ArrayList<Book> books, String itemId) {
            for (Book book : books) {
                if (book.getItemId().equals(itemId)) {
                    return book;
                }
            }
            return null;
        }
    }        