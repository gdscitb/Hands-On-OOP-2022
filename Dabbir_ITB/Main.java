class Card {
    String name;
    double strength;
    double health;
    
    strongCard strong;
    miracleCard miracle;

    void attack(Card enemy) {
        double strengthPoint = this.strong.strength + strength;
        double healthPoint = enemy.strong.defense + enemy.health;
        System.out.println(this.name + " attacking " + enemy.name + "...");
        enemy.takeDamage(enemy.name,strengthPoint,healthPoint);
    }
    
    void takeDamage(String name,double strength, double health) {
        System.out.println(this.name + " HEALTH -" + strength + "...");
        health -= strength;
        System.out.println(name + " Stat :" + "\nHEALTH : " + health + "\n");
        if (health <= 0) {
            endRound(name);
        }
    }

    void endRound(String name) {
        System.out.println("\n" + name + " LOSE.");
    }

    void addMiracle(Card enemy) {
        if (this.miracle.miracle < enemy.miracle.miracle) {
            System.out.println(enemy.name + " Miracle WIN.");
        } else {
            System.out.println(this.name + " Miracle WIN.");
        }
    }
    
    void equipment(strongCard strong) {
        this.strong = strong;
    }

    void skill(miracleCard miracle) {
        this.miracle = miracle;
    }

    void stat() {
        System.out.println("\n====== Player ======");
        System.out.println("Animal Card");
        System.out.println("NAME : " + this.name);
        System.out.println("STRENGTH : " + this.strength);
        System.out.println("HEALTH : " + this.health);
        this.strong.stat();
        this.miracle.stat();
    }

}

class animalCard extends Card {
    animalCard(String name, double strength, double health) {
        this.name = name;
        this.strength = strength;
        this.health = health;
    }
}

class strongCard extends Card {
    double defense;
    
    strongCard(String name, double strength, double defense) {
        this.name = name;
        this.strength = strength;
        this.defense = defense;
    }
    
    void stat() {
        System.out.println("\nStrong Card");
        System.out.println("Buff : " + this.name + "\nSTRENGTH : +" + this.strength + "\nDEFENSE : +" + this.defense);
    }
    
}

class miracleCard extends Card {
    double miracle;
    
    miracleCard(String name, double miracle) {
        this.name = name;
        this.miracle = miracle;
    }
    
    void stat() {
        System.out.println("\nMiracle Card");
        System.out.println("MIRACLE : " + this.miracle);
    }
}


public class Main {
    public static void main(String[] args) throws Exception {

        Card animal1 = new animalCard("SCORCH",6000,6500);
        Card animal2 = new animalCard("GALLEON",7300,7500);

        strongCard awakening = new strongCard("Awakening Fever", 1000, 1000);
        strongCard buff = new strongCard("Primal Fight",200,500);

        miracleCard miracle2 = new miracleCard("Alien Egg E", 3200);
        miracleCard miracle1 = new miracleCard("Alien Egg S", 3600);

        animal1.equipment(awakening);
        animal1.skill(miracle2);
        animal1.stat();
        
        animal2.equipment(buff);
        animal2.skill(miracle1);
        animal2.stat();

        System.out.println("\n------ ROUND 1 ------");
        animal1.attack(animal2);
        animal2.attack(animal1);

        animal1.addMiracle(animal2);
    }
}
