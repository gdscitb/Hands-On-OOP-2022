package jutsu;

import character.StatsEffect;

// Jutsu dengan efek memberi buff pada pengguna
public class BuffJutsu extends Jutsu {
    private int buffHP;
    private int buffAttack;
    private int buffDefense;

    public BuffJutsu(String name, int chakraCost, int buffHP, int buffAttack, int buffDefense) {
        super(name, chakraCost);
        this.buffHP = buffHP;
        this.buffAttack = buffAttack;
        this.buffDefense = buffDefense;
    }

    public int getBuffHP() {
        return buffHP;
    }

    public int getBuffAttack() {
        return buffAttack;
    }

    public int getBuffDefense() {
        return buffDefense;
    }

    public void display() {
        System.out.printf("Jutsu Name: %s\nChakra Cost: %d\nBuff HP: %d\nBuff Attack: %d\nBuff Defense: %d\n", getName(), getChakraCost(), buffHP, buffAttack, buffDefense);
    }

    @Override
    public void useJutsu(StatsEffect effect) {
        effect.setHpDelta(buffHP);
        effect.setAttackDelta(buffAttack);
        effect.setDefenseDelta(buffDefense);
    }
}
