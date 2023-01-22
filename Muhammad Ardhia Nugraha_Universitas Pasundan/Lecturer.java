
//class Lecturer sebagai turunan dari class Person
class Lecturer extends Person {
//atribut yang digunakan untuk menyimpan nip, bidang keahlian, dan jenis kelamin

    private String nip;
    private String expertise;
    private String gender;

    public Lecturer(String nip, String expertise, String gender, String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
        this.nip = nip;
        this.expertise = expertise;
        this.gender = gender;
    }

//method untuk mengambil nip
    public String getNip() {
        return nip;
    }

//method untuk mengambil bidang keahlian
    public String getExpertise() {
        return expertise;
    }

//method untuk mengambil jenis kelamin
    public String getGender() {
        return gender;
    }

//method untuk mengubah nip
    public void setNip(String nip) {
        this.nip = nip;
    }

//method untuk mengubah bidang keahlian
    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

//method untuk mengubah jenis kelamin
    public void setGender(String gender) {
        this.gender = gender;
    }

//method untuk menampilkan informasi
    @Override
    public void showPersonalInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone Number: " + getPhoneNumber());
    }

    @Override
    public void showAdditionalInfo() {
        System.out.println("NIP: " + getNip());
        System.out.println("Expertise: " + getExpertise());
        System.out.println("Gender: " + getGender());
    }
}
