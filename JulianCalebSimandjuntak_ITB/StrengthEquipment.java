// Peralatan gym kekuatan
public class StrengthEquipment extends GymEquipment {
    private int weight;

    public StrengthEquipment(String name, boolean used, int weight) {
        super(name, used);;
        this.weight = weight;
    }

    // Mengambil, mengembalikan, dan menentukan data berat alat yang digunakan;
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void use() {}
}