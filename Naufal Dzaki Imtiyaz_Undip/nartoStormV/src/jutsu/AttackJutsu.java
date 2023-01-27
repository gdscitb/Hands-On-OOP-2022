package jutsu;

import character.StatsEffect;

// Jutsu menyerang memberi damage pada lawan
public class AttackJutsu extends Jutsu{
    private int damage;

    public AttackJutsu(String name, int chakraCost, int damage) {
        super(name, chakraCost);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void display() {
        System.out.printf("Jutsu Name: %s\nChakra Cost: %d\nDamage: %d\n", getName(), getChakraCost(), damage);
    }

    @Override
    public void useJutsu(StatsEffect effect) {
        effect.setDamage(damage);
    }
}
