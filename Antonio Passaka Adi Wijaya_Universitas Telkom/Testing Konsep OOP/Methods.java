package com.oop;

class Mahasiswa{
    // Data member
    String nama;
    String NIM;
    

    //Constructor
    Mahasiswa(String Nama, String NIM){
        this.nama = Nama;
        this.NIM = NIM;
    }

    // Method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama " + this.nama);
        System.out.println("NIM " + this.NIM);
    }
    // Method tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;
            this.nama = nama;
    }
    // Method dengan return dan tanpa parameter
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }

    // Method dengan return dan dengan parameter
    String sayHello(String message){
        return message + "juga, nama saya adalah " + this.nama;
    }

class Dosen{
    String nama;

    Dosen(String nama)
}

}
public class Methods {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Antonio Passaka Adi Wijaya", "1201204186");
        System.out.println(mahasiswa1.nama);
        // method
        mahasiswa1.show();
        mahasiswa1.setNama("Ucup");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());


        String data = mahasiswa1.sayHello("Kasep");
        System.out.println(data);
    }
}
