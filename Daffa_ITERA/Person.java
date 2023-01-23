//abstract class Person sebagai parent class dari Visitor
abstract class Person {
    //atribut yang digunakan untuk menyimpan nama, alamat, dan usia
    private String name;
    private String address;
    private int age;

    //constructor untuk inisialisasi nama,alamat, dan usia
    public Person(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    //method getter dan setter untuk mengambil dan mengubah nama, alamat, dan usia
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //method untuk nantinya dapat di inisialisasi di class visitor
    public abstract void detVisitor();
}
