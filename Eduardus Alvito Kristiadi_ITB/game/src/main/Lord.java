package main;

public class Lord extends Hero {
    String role = "Lord";

    public Lord(String name, double health, double atk) {
        super(name,health,atk);  
    }

    public void levelUp() {
        this.setLevel(5);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type \t: " + this.role);
    }

    void showoff() {
        System.out.println("Saya imba dan cita2 saya menjadi dewa shinobi !!");
    }

    @Override()
    void takeDamage(double damage) {
        this.health = this.health - damage;
    }
}
