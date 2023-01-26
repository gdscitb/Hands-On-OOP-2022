import java.util.Scanner;

public class MainDecorator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Selamat Datang Di Warung Gudeg DIY ===");

        System.out.println("\nSedia Nasi Gudeg : ");

        System.out.println("a. Original");
        System.out.println("b. Telur");
        System.out.println("c. Ayam");
        System.out.println("d. Daging");

        System.out.println("\nPilih lauk anda (a / b / c / d) : ");

        String inp = input.nextLine();

        System.out.println("Banyak pesanan : ");
        int jml = input.nextInt();
        
        Makanan a = new NasiGudeg();
        a = new Original(a);
        Makanan b = new NasiGudeg();
        b = new Telur(b);
        Makanan c = new NasiGudeg();
        c = new Ayam(c);
        Makanan d = new NasiGudeg();
        d = new Daging(d);
        
        System.out.println("\nAnda memesan ");

        if (null != inp)switch (inp) {
            case "a":
                System.out.print(a.getKomposisi());
                System.out.println(a.getHarga());
                System.out.println("Banyak Pesanan : " + jml);
                System.out.println("Total Bayar : " + a.getHarga()*jml);
                break;
            case "b":
                System.out.print(b.getKomposisi());
                System.out.println(b.getHarga());
                System.out.println("Banyak Pesanan : " + jml);
                System.out.println("Total Bayar : " + b.getHarga()*jml);
                break;
            case "c":
                System.out.print(c.getKomposisi());
                System.out.println(c.getHarga());
                System.out.println("Banyak Pesanan : " + jml);
                System.out.println("Total Bayar : " + c.getHarga()*jml);
                break;
                case "d":
                System.out.print(d.getKomposisi());
                System.out.println(d.getHarga());
                System.out.println("Banyak Pesanan : " + jml);
                System.out.println("Total Bayar : " + d.getHarga()*jml);
                break;
            default: System.out.println("Sesuaikan input anda dgn Buku Menu!");
                break;
        }

                }
}
