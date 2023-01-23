//kelas main untuk menguji program
public class Main {
    public static void main(String[] args) {
        //membuat object dari class Visitor
        Visitor Lavine = new Visitor("Lavine", "Depok", 25, "08123", "chicago@bulls.com");
        //membuat object dari class Room
        Room vip = new Room("10", "5 July", Lavine);
        //membuat object dari class Staff
        Staff doncic = new Staff("Luka Doncic", 100);

        //menampilkan informasi dari semua object yang telah di inisialisasikan
        doncic.addRoom(vip);
        doncic.infoRoom();
    }
}
