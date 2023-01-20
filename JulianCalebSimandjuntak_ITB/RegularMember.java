// Regular member
public class RegularMember extends Member {
    public RegularMember (String name, String password, int age, int height, int weight) {
        super(name, password, age, height, weight);
    }

    @Override
    public void status() {
        System.out.println("\nAnda adalah member regular! Selamat berolahraga!");;
    }
}