import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Set up objek dan variabel
        Scanner input = new Scanner(System.in);
        String buyExit;
        int pilihanBuah;

        // Set up bobot dan persediaan
        Buah mangga = new Mangga(15, 23000);
        Buah pisang = new Pisang(18,23000);
        Buah apel = new Apel(12, 41000);
        Buah durian = new Durian(7, 50000);
        Buah melon = new Melon(14, 26000);
        Buah semangka = new Semangka(13, 17000);

        Output.tampilkanWelcome();
        buyExit = input.next();
        while (!(buyExit.equals("1") || buyExit.equals("2"))) {
            System.out.println("Masukan tidak sesuai\n");
            Output.tampilkanWelcome();
            buyExit = input.next();
        }

        while (buyExit.equals("1")) {
            Output.tampilkanPilihanBuah();
            pilihanBuah = input.nextInt();
            while (!(1 <= pilihanBuah && pilihanBuah <= 6)) {
                System.out.println("Masukan tidak sesuai\n");
                Output.tampilkanPilihanBuah();
                pilihanBuah = input.nextInt();
            }
            System.out.println();
            Output.tampilkanDetailBuah(pilihanBuah, mangga, apel, durian, melon, pisang, semangka);
            Output.tampilkanWelcome();
            buyExit = input.next();
            while (!(buyExit.equals("1") || buyExit.equals("2"))) {
                System.out.println("Masukan tidak sesuai\n");
                Output.tampilkanWelcome();
                buyExit = input.next();
            }
        }
    }
}