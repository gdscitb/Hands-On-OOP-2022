// Member abstract class
public abstract class Member implements LoggedIn{
    private String name;
    private String password;
    private int age;
    private int height;
    private int weight;

    // Isi dari objek Member
    protected Member(String name, String password, int age, int height, int weight) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // Mengambil dan mengembalikan nama dan password
    public String getName() {
        return name;
    }
    
    public String getPassword() {
        return password;
    }

    // Implementasi
    @Override
    public void loggedin() {
        System.out.println("Selamat berolahraga, " + this.name + "!\n");
    }

    // Mencetak regular atau premium
    public void status() {};

    // Mencetak pesan berdasarkan dua fungsi sebelumnya
    public void welcome() {
        status();
        loggedin();
    }

}