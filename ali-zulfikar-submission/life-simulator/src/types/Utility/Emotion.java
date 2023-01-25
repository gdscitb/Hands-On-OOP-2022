package types.Utility;

public enum Emotion {
    HAPPY("HAPPY", 5),
    SAD("SAD", -5),
    ANGRY("ANGRY", -10),
    EXCITED("EXCITED", 10),
    RELAXED("RELAXED", 5),
    TIRED("TIRED", -5),
    STRESSED("STRESSED", -10),
    CALM("CALM", 5),
    CONFIDENT("CONFIDENT", 10),
    NERVOUS("NERVOUS", -9);

    private final String value;
    private final int energy;

    Emotion(String value, int energy) {
        this.value = value;
        this.energy = energy;
    }

    public String getValue() {
        return value;
    }

    public int getEnergy() {
        return energy;
    }

    public static void printAll() {
        for (Emotion emotion : Emotion.values()) {
            System.out.println(emotion.getValue() + " " + emotion.getEnergy());
        }
    }
}

