package hotel.start;

interface daftar{
    public void daftar();
}

public class daftarkamar implements daftar{

    @Override
    public void daftar() {
        System.out.println("------- DAFTAR JENIS KAMAR BESERTA TARIF HOTEL ANANDA -------");
        System.out.println("1. Single Room Rp.300.000,- / malam");
        System.out.println("2. Double Room Rp.450.000,- / malam");
        System.out.println("3. Standard Room Rp.500.000,- / malam");
        System.out.println("4. Superior Room Rp.600.000,- / malam");
        System.out.println("5. Deluxe Room Rp.700.000,- / malam");
        System.out.println("6. Family Room Rp.800.000,- / malam");
        System.out.println("7. Junior Suite Room Rp.900.000,- / malam");
        System.out.println("8. Suite Room Rp.1.000.000,- /malam");
        System.out.println("9. Penthouse Room Rp.1.250.000,- /malam");
        System.out.println("10. Presidential Suite Room Rp.1.500.000,- /malam");
    }

}