public class Staff {
    //atribut untuk menyimpan nama staf, jumlah kamar, index, dan total
    private String staffName;
    private Room[] room;
    private int index, total;

    //constructor untuk inisialisasi nama staf, dan mencari total kamar
    public Staff(String staffName, int r){
        this.staffName = staffName;
        total = r;
        room = new Room[total];
        for (int i = 0; i < room.length; i++){
            room[i]=null;
        }
        index = -1;
    }

    //method untuk menambah kamar
    public void addRoom(Room x){
        index = index + 1;
        room[index] = x;
    }

    //method untuk menghapus kamar
    public Room delRoom(){
        Room temp = room [index];
        index = index - 1;
        return temp;
    }

    //method untuk nemapilkan data nama staf serta memanggil method detRoom pada class Room dan menampilkannya sesuai jumlah index
    public void infoRoom(){
        System.out.println("staff name : " + staffName);
        System.out.println("");
        for (int i=0; i<=index; i++){
            room[i].detRoom();
        }
    }
}
