
class Student extends Person {

    //atribut yang digunakan untuk menyimpan nim, jurusan, dan IPK
    private String nim;
    private String major;
    private double gpa;

    //constructor untuk inisialisasi nim, jurusan, IPK, nama, alamat, dan nomor telepon
    public Student(String nim, String major, double gpa, String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
        this.nim = nim;
        this.major = major;
        this.gpa = gpa;
    }

    //method untuk mengambil nim
    public String getNim() {
        return nim;
    }

    //method untuk mengambil jurusan
    public String getMajor() {
        return major;
    }

    //method untuk mengambil IPK
    public double getGpa() {
        return gpa;
    }

    //method untuk mengubah nim
    public void setNim(String nim) {
        this.nim = nim;
    }

    //method untuk mengubah jurusan
    public void setMajor(String major) {
        this.major = major;
    }

    //method untuk mengubah IPK
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // method yang digunakan untuk menampilkan info
    @Override
    public void showPersonalInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone Number: " + getPhoneNumber());
    }

    @Override
    public void showAdditionalInfo() {
        System.out.println("NIM: " + getNim());
        System.out.println("Major: " + getMajor());
        System.out.println("GPA: " + getGpa());
    }
}
