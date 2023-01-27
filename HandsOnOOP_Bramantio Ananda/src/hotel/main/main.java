package hotel.main;
import hotel.start.*;
import hotel.data.*;

public class main {
    public static void main(String[] args) {
        daftarkamar kamar = new daftarkamar();
        data user = new data();
        System.out.println("-------------------------------------------------------------");
        System.out.println("|                  RESERVASI HOTEL ANANDA                   |");
        System.out.println("-------------------------------------------------------------");
        kamar.daftar();
        user.data();
        user.output();
        user.harga();
        System.out.println("-------------------------------------------------------------");
        System.out.println("|                       TERIMA KASIH                        |");
    }
}