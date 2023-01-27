package com.oop;

class Polos{
    String dataString ;
    int dataInteger ;
}

// class dengan constructor
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK; 
    int umur;

    // constructor dipanggil saat object pertama kali dibuat
    // Mahasiswa(){
    //     System.out.println("Ini adalah constructor");
    // }

    // constructor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan, double inputIPK, int inputUmur){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;
    }
}

public class Constructor {

    public static void main (String[] args) throws Exception{

        Mahasiswa mahasiswa1 = new Mahasiswa("Antonio Passaka Adi Wijaya", "1201204186", "Teknik Informatika", 3.5, 19);
        Mahasiswa mahasiswa2 = new Mahasiswa("Ucup", "19104002", "Teknik Informatika", 3.5, 19);
        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa2.nama);

        // Polos objectPolos1 = new Polos();
        // objectPolos1.dataString = "Polos";
        // objectPolos1.dataInteger = 0;

        // System.out.println(objectPolos1.dataString);
        // System.out.println(objectPolos1.dataInteger);
    }
}
