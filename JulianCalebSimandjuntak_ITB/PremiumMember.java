// Premium member
public class PremiumMember extends Member {
    protected PremiumMember  (String name, String password, int age, int height, int weight) {
        super(name, password, age, height, weight);
    }

    @Override
    public void status() {
        System.out.println("\nAnda adalah member premium! Selamat berolahraga!");
    }
}