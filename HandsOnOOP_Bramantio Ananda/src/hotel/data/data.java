package hotel.data;

import java.util.Scanner;

public class data extends startdata{
    private String nama;
    private String alamat;
    private String email;
    private int pilihan_kamar;
    private int tanggal_check_in;
    private int lama_waktu_inap;
    private int harga;

    Scanner input = new Scanner (System.in);

    @Override
    public void data() {
        System.out.println("--------------- Silahkan Masukkan Data Anda ----------------");
        System.out.print("Nama : ");
        nama = input.nextLine() ;
        System.out.print("Alamat : ");
        alamat = input.nextLine() ;
        System.out.print("Email : ");
        email = input.nextLine();
        System.out.print("Pilihan Kamar : ");
        pilihan_kamar = input.nextInt() ;
        System.out.print("Tanggal Check In: ");
        tanggal_check_in = input.nextInt();
        System.out.print("Lama Waktu Inap: ");
        lama_waktu_inap = input.nextInt();
    }

    @Override
    public void harga() {
        switch (pilihan_kamar) {
            case 1:
                harga = 300000;
                System.out.println("Jenis Kamar : Single Room");
                System.out.println("Total Harga : Rp." +(harga*lama_waktu_inap) +",-");
                System.out.println("Periode Inap : " +lama_waktu_inap +" malam");
                break;
            case 2:
                harga = 450000;
                System.out.println("Jenis Kamar : Double Room");
                System.out.println("Total Harga : Rp." +(harga*lama_waktu_inap) +",-");
                System.out.println("Periode Inap : " +lama_waktu_inap +" malam");
                break;
            case 3:
                harga = 500000;
                System.out.println("Jenis Kamar : Standard Room");
                System.out.println("Total Harga : Rp." +(harga*lama_waktu_inap) +",-");
                System.out.println("Periode Inap : " +lama_waktu_inap +" malam");
                break;
            case 4:
                harga = 600000;
                System.out.println("Jenis Kamar : Superior Room");
                System.out.println("Total Harga : Rp." +(harga*lama_waktu_inap) +",-");
                System.out.println("Periode Inap : " +lama_waktu_inap +" malam");
                break;
            case 5:
                harga = 700000;
                System.out.println("Jenis Kamar : Deluxe Room");
                System.out.println("Total Harga : Rp." +(harga*lama_waktu_inap) +",-");
                System.out.println("Periode Inap : " +lama_waktu_inap +" malam");
                break;
            case 6:
                harga = 800000;
                System.out.println("Jenis Kamar : Family Room");
                System.out.println("Total Harga : Rp." +(harga*lama_waktu_inap) +",-");
                System.out.println("Periode Inap : " +lama_waktu_inap +" malam");
                break;
            case 7:
                harga = 900000;
                System.out.println("Jenis Kamar : Junior Suite Room");
                System.out.println("Total Harga : Rp." +(harga*lama_waktu_inap) +",-");
                System.out.println("Periode Inap : " +lama_waktu_inap +" malam");
                break;
            case 8:
                harga = 1000000;
                System.out.println("Jenis Kamar : Suite Room");
                System.out.println("Total Harga : Rp." +(harga*lama_waktu_inap) +",-");
                System.out.println("Periode Inap : " +lama_waktu_inap +" malam");
                break;
            case 9:
                harga = 1250000;
                System.out.println("Jenis Kamar : Penthouse Room");
                System.out.println("Total Harga : Rp." +(harga*lama_waktu_inap) +",-");
                System.out.println("Periode Inap : " +lama_waktu_inap +" malam");
                break;
            case 10:
                harga = 1500000;
                System.out.println("Jenis Kamar : Presidential Suite Room");
                System.out.println("Total Harga : Rp." +(harga*lama_waktu_inap) +",-");
                System.out.println("Periode Inap : " +lama_waktu_inap +" malam");
                break;
            default:
                System.out.println("Tidak Ada Dalam Pilihan");
        }
        
    }

    @Override
    public void output() {
        System.out.println("------------ BUKTI RESERVASI KAMAR HOTEL ANANDA -------------");
        System.out.println("Nama : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("Email : "+email);
    }
    
}