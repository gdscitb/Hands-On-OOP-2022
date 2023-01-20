// GymEquipment abstract class
abstract class GymEquipment implements IsUsed {
    private String name;
    private boolean used;

    // Isi dari objek GymEquipment
    GymEquipment(String name, boolean used) {
        this.name = name;
        this.used = used; // Belum dipakai
    }

    // Mengambil dan mengembalikan nama alat
    public String getName() {
        return name;
    }

    // Menentukan apakah peralatan gym dipakai atau tidak
    public void setUsed(boolean used) {
        this.used = used;
    }

    // Mengambil dan mengembalikan data apakah peralatan gym dipakai atau tidak
    @Override
    public boolean isUsed() {
        return this.used;
    }

    // Fungsi untuk mencetak apakah peralatan gym dipakai atau tidak
    public abstract void use();

}