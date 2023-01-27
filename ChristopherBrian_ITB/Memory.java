package Java.ChristopherBrian_ITB;

//class Memory merupakan child class dari class Component
class Memory extends Component {
    private int kapasitas; //menambahkan variabel kapasitas
    
    public Memory(String nama, int harga, int kapasitas) {
        super(nama, harga);
        this.kapasitas = kapasitas;
    }
    
    @Override
    public void display() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Kapasitas: " + kapasitas);
    }
}