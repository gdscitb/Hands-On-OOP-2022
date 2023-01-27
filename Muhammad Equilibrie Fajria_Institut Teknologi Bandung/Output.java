import java.util.Scanner;

public class Output {
    public static void tampilkanWelcome() {
        System.out.println("Selamat datang di toko buah Pak Warmi");
        System.out.println("1. Belanja");
        System.out.println("2. Exit");
    }
    public static void tampilkanPilihanBuah() {
        System.out.println("Berikut buah-buahan yang tersedia di toko kami:");
        System.out.println("1. Mangga");
        System.out.println("2. Apel");
        System.out.println("3. Durian");
        System.out.println("4. Melon");
        System.out.println("5. Pisang");
        System.out.println("6. Semangka");
        System.out.println("Silahkan pilih buah yang ingin anda beli");
    }
    public static void tampilkanDetailBuah(int pilihanBuah, Buah mangga, Buah apel, Buah durian, Buah melon, Buah pisang, Buah semangka) {
        Scanner input = new Scanner(System.in);
        int amountBeli;

        switch (pilihanBuah) {
           case (1) -> {
               System.out.println("Mangga");
               System.out.printf("Persediaan: %d Kg%n", mangga.persediaan);
               System.out.printf("Harga per Kilogram: Rp %d%n%n", mangga.hargaPerKilo);
               System.out.println("Ingin beli berapa Kilogram?");
               amountBeli = input.nextInt();
               if (mangga.bisaBeli(amountBeli)) {
                   System.out.printf("Harga yang harus dibayar: Rp %d%n", mangga.getHarga(amountBeli));
                   mangga.beli(amountBeli);
                   System.out.println("Terima kasih sudah berbelanja di toko Pak Warmi\n");
               }
               else {
                   System.out.println("Maaf, jumlah pemesanan melebihi persediaan\n");
               }
           }
           case (2) -> {
               System.out.println("Apel");
               System.out.printf("Persediaan: %d Kg%n", apel.persediaan);
               System.out.printf("Harga per Kilogram: Rp %d%n%n", apel.hargaPerKilo);
               System.out.println("Ingin beli berapa Kilogram?");
               amountBeli = input.nextInt();
               if (apel.bisaBeli(amountBeli)) {
                   System.out.printf("Harga yang harus dibayar: Rp %d%n", apel.getHarga(amountBeli));
                   apel.beli(amountBeli);
                   System.out.println("Terima kasih sudah berbelanja di toko Pak Warmi\n");
               }
               else {
                   System.out.println("Maaf, jumlah pemesanan melebihi persediaan\n");
               }
           }
           case (3) -> {
               System.out.println("Durian");
               System.out.printf("Persediaan: %d Kg%n", durian.persediaan);
               System.out.printf("Harga per Kilogram: Rp %d%n%n", durian.hargaPerKilo);
               System.out.println("Ingin beli berapa Kilogram?");
               amountBeli = input.nextInt();
               if (durian.bisaBeli(amountBeli)) {
                   System.out.printf("Harga yang harus dibayar: Rp %d%n", durian.getHarga(amountBeli));
                   durian.beli(amountBeli);
                   System.out.println("Terima kasih sudah berbelanja di toko Pak Warmi\n");
               }
               else {
                   System.out.println("Maaf, jumlah pemesanan melebihi persediaan\n");
               }
           }
           case (4) -> {
               System.out.println("Melon");
               System.out.printf("Persediaan: %d Kg%n", melon.persediaan);
               System.out.printf("Harga per Kilogram: Rp %d%n%n", melon.hargaPerKilo);
               System.out.println("Ingin beli berapa Kilogram?");
               amountBeli = input.nextInt();
               if (melon.bisaBeli(amountBeli)) {
                   System.out.printf("Harga yang harus dibayar: Rp %d%n", melon.getHarga(amountBeli));
                   melon.beli(amountBeli);
                   System.out.println("Terima kasih sudah berbelanja di toko Pak Warmi\n");
               }
               else {
                   System.out.println("Maaf, jumlah pemesanan melebihi persediaan\n");
               }
           }
           case (5) -> {
               System.out.println("Pisang");
               System.out.printf("Persediaan: %d Kg%n", pisang.persediaan);
               System.out.printf("Harga per Kilogram: Rp %d%n%n", pisang.hargaPerKilo);
               System.out.println("Ingin beli berapa Kilogram?");
               amountBeli = input.nextInt();
               if (pisang.bisaBeli(amountBeli)) {
                   System.out.printf("Harga yang harus dibayar: Rp %d%n", pisang.getHarga(amountBeli));
                   pisang.beli(amountBeli);
                   System.out.println("Terima kasih sudah berbelanja di toko Pak Warmi\n");
               }
               else {
                   System.out.println("Maaf, jumlah pemesanan melebihi persediaan\n");
               }
           }
           default -> {
               System.out.println("Semangka");
               System.out.printf("Persediaan: %d Kg%n", semangka.persediaan);
               System.out.printf("Harga per Kilogram: Rp %d%n%n", semangka.hargaPerKilo);
               System.out.println("Ingin beli berapa Kilogram?");
               amountBeli = input.nextInt();
               if (semangka.bisaBeli(amountBeli)) {
                   System.out.printf("Harga yang harus dibayar: Rp %d%n", semangka.getHarga(amountBeli));
                   semangka.beli(amountBeli);
                   System.out.println("Terima kasih sudah berbelanja di toko Pak Warmi\n");
               }
               else {
                   System.out.println("Maaf, jumlah pemesanan melebihi persediaan\n");
               }
           }
       }
    }
}