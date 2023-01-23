public class Room {
    //atribut yang digunakan untuk menyimpan pesanan(book) buku dengan object Visitor
    private Visitor book;
    //atribut yang digunakan untuk menyimpan data no kamar dan tanggal
    private String noRoom, date;

    //constructor untuk inisialisasi no karam, tanggal, dan book
    public Room(String noRoom, String date, Visitor book){
        this.book = book;
        this.noRoom = noRoom;
        this.date = date;
    }

    //method untuk menampilkan data detail kamar dan tanggal nya
    public void detRoom(){
        System.out.println("Detail Room");
        System.out.println("No Room : " + noRoom);
        System.out.println("Date Check in : " + date);
        book.detVisitor(); //memanggil method yang ada di class visitor
    }
    //method getter dan setter untuk mengambil dan merubah pesanan, no kamar, dan tanggal
    public Visitor getBook() {
        return book;
    }

    public void setBook(Visitor book) {
        this.book = book;
    }

    public String getNoRoom() {
        return noRoom;
    }

    public void setNoRoom(String noRoom) {
        this.noRoom = noRoom;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
