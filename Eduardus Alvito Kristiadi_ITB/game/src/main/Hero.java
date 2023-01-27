package main;

// abstract class
public abstract class Hero {
    private String name;
    private int level;
    double health;
    double atk;

    public Hero(String name, double health, double atk) {
        this.name = name;
        this.level = 1;
        this.health = health;
        this.atk = atk;
    }

        // getter
        public double getHealth() {
            return this.health;
        }
    
        // setter
        final void setHealth(double newHealth) {
            this.health = newHealth;
        }
    
        // bisa di overload
        void setHealth(String mode) {
            if (mode.equals("reset")) {
                this.health = 100;
            }
        }

    public void display() {
        System.out.println("\nWatashi no namae wa " + this.name + " desu!");
        System.out.println("HP \t: " + this.health);
        System.out.println("Attack \t: " + this.atk);
        System.out.println("Level \t: " + this.level);
    }

    // abstract method untuk naik level
    public abstract void levelUp();

    // setter
    public void setLevel(int deltaLevel) {
        this.level += deltaLevel;
    }

    // method attack
    void attack(Hero enemy) {
        System.out.println("\n" + this.name + " attacks " + enemy.name);
        enemy.takeDamage(this.atk);
    }

    void takeDamage(double damage) {
        System.out.println(this.name + " receive damege " + damage);
        this.health = this.health - damage;
    }
}

