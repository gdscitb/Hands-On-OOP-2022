import java.util.Scanner;

/* Testing
asdasd
/* Program ini adalah program untuk membuat KTM.
Saya menggunakan pola Creational Pattern untuk membuat program ini. Dengan menggunakan pattern Builder, saya berhasil
membuat program ini dengan membuat class secara step-by-step. Program yang kompleks saya sederhanakan menjadi 4 bagian,
yaitu membuat variabel, membuat class berisikan input berupa nama, membuat class berisikan input nim, dan terakhir
memanggil tiap-tiap class untuk menjadikan hasil akhirnya sebagai sebuah KTM. */

/* Cara menjalankan program ialah dengan melakukan run/debug setelah itu akan muncul output berupa suruh untuk melakukan
input nama dan NIM dan menghasilkan hasil akhir KTM berupa nama dan nim.
Disini saya juga melakukan import sebagai alat membuat input user. */

jhkasdf
class Main {                                    // Class utama (instance) berisikan variabel-variabel yang dibutuhkan dalam pemograman
    String inputname;                           // Terdapat 3 variabel yaitu 2 String (Nantinya 1 akan diubah ke integer karena berupa angka)
    String inputnim;                            // dan satunya lagi berupa Scanner (berfungsi untuk menginput dari user)
    Scanner input = new Scanner(System.in);   
}

class Name extends Main {                           // Class Method (), terdapat 3 class methode yaitu :     
    void nama() {                                   // class Name berfungsi untuk membuat input nama dan Class Nim berfungsi untuk membuat input nim
        System.out.print("Write your Name: "); 
        inputname = input.nextLine(); 
    }
}
class NIM extends Name{
    void nim() {
        System.out.print("Write your NIM: ");
        inputnim = input.nextLine();
    }
}

public class Github {                           // Untuk Methode Class public ini berfungsi sebagai runner code yang akan membuat
    public static void main(String [] agrs) {   // Berbagai macam objek yang akan dijalankan nantinya
        NIM print = new NIM();                  // Disini pula terjadi perpindahan type variabel dari string ke integer yaitu pada variabel nim
        print.nama();
        print.nim();
        String nama = print.inputname;
        String nim = print.inputnim;
        int nimInt = Integer.parseInt(nim);

            System.out.println("Here's your KTM!"); 
            System.out.println("Nama : " + nama); 
            System.out.print("Nim : " + nimInt);
    }
}
