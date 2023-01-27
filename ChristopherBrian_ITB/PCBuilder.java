package Java.ChristopherBrian_ITB;

import java.util.Scanner; //import Scanner untuk meminta input dari user

public class PCBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //meminta input dari pengguna untuk nama, harga, kecepatan, dan kapasitas dari processor dan memory
        System.out.print("Masukkan nama processor: ");
        String namaProcessor = input.nextLine();
        System.out.print("Masukkan harga processor: ");
        int hargaProcessor = input.nextInt();
        System.out.print("Masukkan kecepatan processor: ");
        int kecepatanProcessor = input.nextInt();
    
        System.out.print("Masukkan nama memory: ");
        input.nextLine();
        String namaMemory = input.nextLine();
        System.out.print("Masukkan harga memory: ");
        int hargaMemory = input.nextInt();
        System.out.print("Masukkan kapasitas memory: ");
        int kapasitasMemory = input.nextInt();

        System.out.print("Masukkan nama graphics card: ");
        input.nextLine();
        String namaGraphicsCard = input.nextLine();
        System.out.print("Masukkan harga graphics card: ");
        int hargaGraphicsCard = input.nextInt();
        System.out.print("Masukkan memori graphics card: ");
        int memoriGraphicsCard = input.nextInt();
    
        //membuat objek dari class Processor dan Memory
        Processor processor = new Processor(namaProcessor, hargaProcessor, kecepatanProcessor);
        Memory memory = new Memory(namaMemory, hargaMemory, kapasitasMemory);
        GraphicsCard graphicscard = new GraphicsCard(namaGraphicsCard, hargaGraphicsCard, memoriGraphicsCard);
    
        //membuat objek dari class PC dengan menggunakan objek processor dan memory yang sudah dibuat
        PC pc = new PC("PC Saya", hargaProcessor + hargaMemory, processor, memory, graphicscard);
    
        //menampilkan informasi PC yang dibangun
        System.out.println("Informasi PC yang dibangun: ");
        pc.display();
    
        //memanggil method build() untuk membangun PC
        pc.build();
    }
}
