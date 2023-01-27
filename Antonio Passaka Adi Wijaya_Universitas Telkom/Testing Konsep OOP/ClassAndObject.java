package com.oop;

// membuat class sebagai template
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK; 
    int umur;
}

public class ClassAndObject{

    public static void main(String[] args) {
        //instansiasi/ membuat objek
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Antonio Passaka Adi Wijaya";
        mahasiswa1.NIM = "1201204186";
        mahasiswa1.jurusan = "Teknik Industri";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur= 20;
    
        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Ucup";
        mahasiswa2.NIM = "1201204189";
        mahasiswa1.jurusan = "Teknik Informatika";
        mahasiswa2.IPK = 4.0;
        mahasiswa2.umur= 18;
    
        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }

}