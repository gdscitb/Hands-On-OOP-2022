package character;

import java.util.ArrayList;
import java.util.List;
import jutsu.*;

// Class character set
public class Shinobi {
    private String name;
    private int hp;
    private int chakra;
    private int attack;
    private int defense;
    private List <Jutsu> masteredJutsu = new ArrayList<Jutsu>();

    public Shinobi(String name, int attack, int defense) {
        this.name = name;
        this.hp = 100;
        this.chakra = 100;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getChakra() {
        return chakra;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setChakra(int chakra) {
        this.chakra = chakra;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    // Status dari character
    public void status() {
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp + "/100");
        System.out.println("Chakra: " + chakra + "/100");
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
        System.out.println();
    }

    // Memberikan damage pada lawan
    private void attack(Shinobi enemy, int attackDmg) {
        int damageDealt = attackDmg - (enemy.getDefense()/2);
        enemy.takeDamage(damageDealt);
        System.out.println(enemy.getName() + " takes " + damageDealt + " damage from " + name);
    }

    // Menerima damage dari lawan
    private void takeDamage(int damage) {
        setHp(getHp() - damage);
    }

    // Menyerang lawan dengan basic attack
    public void basicAttack(Shinobi enemy) {
        attack(enemy, attack);
    }

    // Mengisi ulang chakra
    public void healChakra() {
        this.chakra += 25;
        System.out.println(name + " heals 25 chakra");
        if(chakra > 100) {
            chakra = 100;
        }
    }

    // Menambah jutsu yang dikuasai
    public void learnJutsu(Jutsu jutsu) {
        masteredJutsu.add(jutsu);
    }

    // Mengambil jutsu dari jutsu-jutsu yang dikuasai
    public Jutsu pickMasteredJutsu(int index) {
        return masteredJutsu.get(index);
    }

    // Mengirim seluruh jutsu yang dikuasai
    public List <Jutsu> getMasteredJutsu() {
        return masteredJutsu;
    }

    // Menampilkan daftar jutsu yang dikuasai
    public void showMasteredJutsu() {
        for(int i = 0; i < masteredJutsu.size(); i++) {
            System.out.println((i+1) + ". " + masteredJutsu.get(i).getName());
        }
    }

    // Mengaktifkan jutsu, semua tipe jutsu dapat digunakan karena adanya adaptor StatsEffect
    public void castJutsu(Jutsu jutsu, Shinobi enemy) {
        StatsEffect effect = new StatsEffect();
        jutsu.useJutsu(effect);
        if(this.chakra < jutsu.getChakraCost()) {          // Gagal aktifkan jutsu karena chakra tidak cukup
            System.out.println("Not enough chakra!");
        }

        else {
            System.out.println(name + " uses " + jutsu.getName() + "!");
            System.out.println("Jutsu cost " + jutsu.getChakraCost() + " chakra");
            System.out.println();
            this.chakra -= jutsu.getChakraCost();

            if(effect.getHpDelta() > 0) {         // Jutsu ngebuff HP
                System.out.println(name + " heals " + effect.getHpDelta() + " amounts of HP");
                this.hp += effect.getHpDelta();

                if(hp > 100) {
                    hp = 100;
                }
            }

            if(effect.getAttackDelta() > 0){       // Jutsu ngebuff attack
                System.out.println(name + " increases attack by " + effect.getAttackDelta());
                this.attack += effect.getAttackDelta();
            }

            if(effect.getDefenseDelta() > 0) {     // Jutsu ngebuff defense
                System.out.println(name + " increases defense by " + effect.getDefenseDelta());
                this.defense += effect.getDefenseDelta();
            }

            if(effect.getDamage() > 0) {           // Jutsu menyerang lawan dan memberikan damage
                attack(enemy, effect.getDamage());
            }

        }

    }
}
