public class Mangga extends Buah {
    public Mangga(int persediaan, int hargaPerKilo) {
        this.persediaan = persediaan;
        this.hargaPerKilo = hargaPerKilo;
    }

    @Override
    public int getHarga(int bobot) {
         return hargaPerKilo * bobot;
    }
}