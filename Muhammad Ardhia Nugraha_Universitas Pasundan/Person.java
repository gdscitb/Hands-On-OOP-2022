
//abstract class Person sebagai parent class dari Student dan Lecturer
abstract class Person {

    //atribut yang digunakan untuk menyimpan nama, alamat, dan nomor telepon
    private String name;
    private String address;
    private String phoneNumber;

    //constructor untuk inisialisasi nama, alamat, dan nomor telepon
    public Person(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    //method untuk mengambil nama
    public String getName() {
        return name;
    }

    //method untuk mengambil alamat
    public String getAddress() {
        return address;
    }

    //method untuk mengambil nomor telepon
    public String getPhoneNumber() {
        return phoneNumber;
    }

    //method untuk mengubah nama
    public void setName(String name) {
        this.name = name;
    }

    //method untuk mengubah alamat
    public void setAddress(String address) {
        this.address = address;
    }

    //method untuk mengubah nomor telepon
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void showInfo() {
        showPersonalInfo();
        showAdditionalInfo();
    }

    public abstract void showPersonalInfo();

    public abstract void showAdditionalInfo();
}
