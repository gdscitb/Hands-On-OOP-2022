package Java.ChristopherBrian_ITB;

//Abstract class Component merupakan parent class untuk class bagian-bagian PC
abstract class Component {
    protected String nama;
    protected int harga;
    
    public Component(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    public abstract void display(); //metode abstract akan mengeluarkan informasi bagian PC
}

//interface Buildable merupakan penanda bahwa class yang mengimplementasikan interface ini dapat dibangun
interface Buildable {
    public void build();
}
