package main;

// inheritance dari abstract hero
public class Assassin extends Hero {
    String role = "Assassin";

    public Assassin(String name, double health, double atk) {
        super(name,health,atk);
    }

        // abstract method
    public void levelUp() {
        this.setLevel(1);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type \t: " + this.role);
    }

    @Override()
    void takeDamage(double damage) {
        this.health = this.health - damage;
    }

}
