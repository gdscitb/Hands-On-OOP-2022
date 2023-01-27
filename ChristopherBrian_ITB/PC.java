package Java.ChristopherBrian_ITB;

//class PC merupakan child class dari class Component dan mengimplementasikan interface Buildable
class PC extends Component implements Buildable {
    private Processor processor;
    private Memory memory;
    private GraphicsCard graphicscard;
    
    public PC(String nama, int harga, Processor processor, Memory memory, GraphicsCard graphicscard) {
        super(nama, harga);
        this.processor = processor;
        this.memory = memory;
        this.graphicscard = graphicscard;
    }
    
    @Override
    public void display() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Processor: ");
        processor.display();
        System.out.println("Memory: ");
        memory.display();
        System.out.println("Graphics Card: ");
        graphicscard.display();
    }
    
    @Override
    public void build() {
        System.out.println("Membangun PC...");
    }
}
