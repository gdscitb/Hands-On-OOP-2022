package jutsu;

import character.StatsEffect;

public abstract class Jutsu {
    private String name;
    private int chakraCost;

    public Jutsu(String name, int chakraCost) {
        this.name = name;
        this.chakraCost = chakraCost;
    }

    public String getName() {
        return name;
    }

    public int getChakraCost() {
        return chakraCost;
    }

    public abstract void display();

    public abstract void useJutsu(StatsEffect effect);
}
