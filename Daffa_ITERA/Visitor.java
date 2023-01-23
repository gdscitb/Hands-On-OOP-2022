
//class visitor merupakan turunan dari class Person
public class Visitor extends Person {
    //atribut yang digunakan untuk menyimpan data no telfon dan email
    private String phoneNum, email;

    //constructor dari Visitor
    public Visitor (String name, String address, int age, String phoneNum, String email){
        super(name, address, age);
        this.phoneNum = phoneNum;
        this.email = email;
    }

    //method overide dari class Person untuk menampilkan data2
    @Override
    public void detVisitor(){
        System.out.println("Detail Visitor");
        System.out.println("Name : " + getName());
        System.out.println("Address : " + getAddress());
        System.out.println("Age : " + getAge());
        System.out.println("Phone Number : " + phoneNum);
        System.out.println("Email : " + email);
    }

    //method getter dan setter untuk mengambil dan mengubah data no telfon dan email
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
