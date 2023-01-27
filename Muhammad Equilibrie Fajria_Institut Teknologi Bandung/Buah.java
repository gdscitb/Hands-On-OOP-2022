abstract public class Buah {
    int persediaan; // Bobot semua buah yang tersedia (Dalam Kg)
    int hargaPerKilo;
    abstract int getHarga(int bobot);
    boolean bisaBeli(int amount) {
        return amount <= persediaan;
    }
    void beli(int amount) {
        this.persediaan = persediaan - amount;
    }
}