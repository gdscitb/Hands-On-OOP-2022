import java.util.Scanner;

public class Menu {
    public static int getMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nApa yang ingin anda lakukan?");
        System.out.println("1. Meminjam buku");
        System.out.println("2. Mengembalikan buku");
        System.out.println("3. Donasi buku");
        System.out.println("4. Lihat daftar buku");
        System.out.println("5. Keluar");
        int choice = input.nextInt();
        input.nextLine();
        return choice;
    }
}
