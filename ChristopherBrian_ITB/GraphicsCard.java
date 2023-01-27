package Java.ChristopherBrian_ITB;

//class GraphicsCard merupakan child class dari class Component
class GraphicsCard extends Component {
    private int memori; //menambahkan variabel kapasitas
    
    public GraphicsCard(String nama, int harga, int memori) {
        super(nama, harga);
        this.memori = memori;
    }
    
    @Override
    public void display() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Memori: " + memori);
    }
}