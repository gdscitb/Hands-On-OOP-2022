import java.util.List;
import java.util.Scanner;

public class Main extends Menu {
    public static void main(String[] args) {
        System.out.println("Selamat datang di perpustakaan abal abal!");
        Scanner input = new Scanner(System.in);

        BookList buku = new BookList();

        int choice = Menu.getMenu();
        while (choice != 5) {
            if (choice == 1) {
                System.out.println("Masukkan judul buku: ");
                String title = input.nextLine();
                buku.pinjam(title);
                choice = Menu.getMenu();
            } else if (choice == 2) {
                System.out.println("Masukkan judul buku: ");
                String title = input.nextLine();
                buku.kembali(title);
                choice = Menu.getMenu();
            } else if (choice == 3) {
                System.out.println("Masukkan judul buku: ");
                String title = input.nextLine();
                System.out.println("Masukkan penulis buku: ");
                String author = input.nextLine();
                System.out.println("Pilih genre buku: ");
                System.out.println("1. Fiksi");
                System.out.println("2. Non-fiksi");
                int genre = input.nextInt(); input.nextLine();
                System.out.println("Masukkan jumlah buku: ");
                int stock = input.nextInt(); input.nextLine();

                donationGenre donatedBook = new donationGenre();
                Book newBook = donatedBook.donateBook(title, author, genre, stock);
                newBook.status();
                choice = Menu.getMenu();
            } else if (choice == 4) {
                List<Book> books = buku.getList();
                System.out.println("JUDUL   | PENULIS   | STOK  ");
                for (Book book : books) {
                    System.out.println(book.getTitle() + " | " + book.getAuthor() + " | " + book.stock());
                }
                choice = Menu.getMenu();
            }
        }
    }
}
