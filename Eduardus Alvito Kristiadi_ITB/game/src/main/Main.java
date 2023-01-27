package main;

public class Main {
    public static void main(String[] args) {
        // intro
        System.out.println("Selamat datang di perang dunia shinobi ke 5");
        
        // membuat object dari kelas non-abstract
        // intro stats dari Hero : HP, def, atk, type
        Hero hero1 = new Fighter("Naruto Uzumaki",100, 20);
        hero1.display();

        Assassin hero2 = new Assassin("Sasuke Uchiha",100, 15);
        hero2.display();

        Lord hero3 = new Lord("Madara Uchicha",200, 20);
        hero3.display();
        hero3.showoff();
        
        // MULAI MENYERANG
        // ROUND 1
        System.out.println("======= ROUND 1 START =======");
        System.out.println("\n====== FAITOOOO !!! ======");
        hero1.attack(hero3);
        hero2.attack(hero3);
        // level up setelah menyerang
        hero1.levelUp();
        hero2.levelUp();

        System.out.println("======= STATS =======");
        hero1.display();
        hero2.display();
        hero3.display();


        System.out.println("======= ROUND 2 START =======");
        System.out.println("\n====== FAITOOOO !!! ======");
        hero3.attack(hero1);
        hero3.attack(hero2);
        // level up setelah menyerang
        hero3.levelUp();

        System.out.println("======= STATS =======");
        hero1.display();
        hero2.display();
        hero3.display();


        System.out.println("======= ROUND 3 START =======");
        System.out.println("\n====== FAITOOOO !!! ======");
        hero1.attack(hero3);
        hero2.attack(hero3);
        // level up setelah menyerang
        hero1.levelUp();
        hero2.levelUp();

        System.out.println("======= STATS =======");
        hero1.display();
        hero2.display();
        hero3.display();


        System.out.println("======= ROUND 4 START =======");
        System.out.println("\n====== FAITOOOO !!! ======");
        hero3.attack(hero1);
        hero3.attack(hero2);
        // level up setelah menyerang
        hero3.levelUp();

        System.out.println("======= STATS =======");
        hero1.display();
        hero2.display();
        hero3.display();


        System.out.println("======= ROUND 5 START =======");
        System.out.println("\n====== FAITOOOO !!! ======");
        hero1.attack(hero3);
        hero2.attack(hero3);
        // level up setelah menyerang
        hero1.levelUp();
        hero2.levelUp();

        System.out.println("======= STATS =======");
        hero1.display();
        hero2.display();
        hero3.display();


        System.out.println("======= ROUND 6 START =======");
        System.out.println("\n====== FAITOOOO !!! ======");
        hero3.attack(hero1);
        hero3.attack(hero2);
        // level up setelah menyerang
        hero3.levelUp();

        System.out.println("======= STATS =======");
        hero1.display();
        hero2.display();
        hero3.display();


        System.out.println("======= ROUND 7 START =======");
        System.out.println("\n====== FAITOOOO !!! ======");
        hero1.attack(hero3);
        hero2.attack(hero3);
        // level up setelah menyerang
        hero1.levelUp();
        hero2.levelUp();

        System.out.println("======= STATS =======");
        hero1.display();
        hero2.display();
        hero3.display();


        System.out.println("======= ROUND 8 START =======");
        System.out.println("\n====== FAITOOOO !!! ======");
        hero3.attack(hero1);
        hero3.attack(hero2);
        // level up setelah menyerang
        hero3.levelUp();

        System.out.println("======= STATS =======");
        hero1.display();
        hero2.display();
        hero3.display();


        System.out.println("======= ROUND 9 START =======");
        System.out.println("\n====== FAITOOOO !!! ======");
        hero1.attack(hero3);
        hero2.attack(hero3);
        // level up setelah menyerang
        hero1.levelUp();
        hero2.levelUp();

        System.out.println("======= STATS =======");
        hero1.display();
        hero2.display();
        hero3.display();


        System.out.println("======= ROUND 10 START =======");
        System.out.println("\n====== FAITOOOO !!! ======");
        hero3.attack(hero1);
        hero3.attack(hero2);
        // level up setelah menyerang
        hero3.levelUp();

        System.out.println("======= STATS =======");
        hero1.display();
        hero2.display();
        hero3.display();

        // MADARA WINS
        // GAME OVER
        System.out.println("\n\n========== MADARA WINS ==========");
    }
}