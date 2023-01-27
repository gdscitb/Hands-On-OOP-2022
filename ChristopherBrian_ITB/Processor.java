package Java.ChristopherBrian_ITB;

//class Processor merupakan child class dari class Component
class Processor extends Component {
    private int kecepatan; // menambahkan variabel kecepatan
    
    public Processor(String nama, int harga, int kecepatan) {
        super(nama, harga);
        this.kecepatan = kecepatan;
    }
    
    @Override
    public void display() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Kecepatan: " + kecepatan);
    }
}
