package character;

// Adaptor untuk class Jutsu agar bisa digunakan class Shinobi
public class StatsEffect {
    private int hpDelta;
    private int attackDelta;
    private int defenseDelta;
    private int damage;

    public StatsEffect() {
        this.hpDelta = 0;
        this.attackDelta = 0;
        this.defenseDelta = 0;
        this.damage = 0;
    }

    public int getHpDelta() {
        return hpDelta;
    }

    public int getAttackDelta() {
        return attackDelta;
    }

    public int getDefenseDelta() {
        return defenseDelta;
    }

    public int getDamage() {
        return damage;
    }

    public void setHpDelta(int hpDelta) {
        this.hpDelta = hpDelta;
    }

    public void setAttackDelta(int attackDelta) {
        this.attackDelta = attackDelta;
    }

    public void setDefenseDelta(int defenseDelta) {
        this.defenseDelta = defenseDelta;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
