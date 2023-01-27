package com.oop;

//player
class Player{
    String name;
    double health;
    int level;
    //object member
    Weapon weapon;
    Khodam khodam;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void attack(Player musuh){
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " attacking " + musuh.name + " with power " + attackPower);
        musuh.defence(attackPower);
    }

    void defence(double attackPower){
        System.out.println(this.name + " gets power " + attackPower);

        // akan mengambil damage
        double damage;
        if (this.khodam.defencePower < attackPower){
            damage = attackPower - this.khodam.defencePower;
        } else{
            damage = 0;
        }
        this.health -= damage;
        System.out.println(this.name + " gets spiritual damage " + damage);

    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipKhodam(Khodam khodam){
        this.khodam = khodam;
    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " hp");
        this.weapon.display();
        this.khodam.display();
    }
}
//senjata
class Weapon{
    double attackPower;
    String name;

    Weapon(String name,double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }
    void display(){
        System.out.println("Weapon : " + this.name + " , attack : " + this.attackPower);
    }
}

//khodam
class Khodam{
    double defencePower;
    String name;

    Khodam(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }
    void display(){
        System.out.println("Khodam: " + this.name + " , defence : " + this.defencePower);
    }

    
}
public class Main{
        public static void main(String[] args) {

        // membuat object player
        Player player1 = new Player("Tukul Arwana", 100);
        Player player2 = new Player("Wiro Sableng", 50);

        // membuat object weapon
        Weapon clurit = new Weapon("clurit",15);
        Weapon keris = new Weapon("keris",30);
        // membuat object khodam
        Khodam maung = new Khodam("maung",10);
        Khodam naga = new Khodam("naga",10);

        // Player 1
        player1.equipWeapon(clurit);
        player1.equipKhodam(maung);
        player1.display();

        // Player 2
        player2.equipWeapon(keris);
        player2.equipKhodam(naga);
        player2.display();

        System.out.println("\nPERSANTETAAAAN");
        System.out.println("\n-Malam Pertama-\n");
        player1.attack(player2);
        player1.display();
        player2.display();
        System.out.println("\n-Malam Kedua-\n");
        player2.attack(player1);
        player1.display();
        player2.display();
    }
}