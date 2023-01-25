package Menu;

public enum GameMenuOption {
    GO_TO_SCHOOL(1, "Go to school"),
    GO_TO_WORK(2, "Go to work"),
    GO_TO_TALK(3, "Go to talk with someones"),
    GO_TO_EAT(4, "Go to eat"),
    GO_TO_DRINK(5, "Go to drink"),
    GO_TO_WALK(6, "Go to walk"),
    GO_TO_SLEEP(7, "Go to sleep"),
    EXIT_GAMES(8, "Exit Games");

    private final int value;
    private final String text;

    GameMenuOption(int value, String text) {
        this.value = value;
        this.text = text;
    }

    public int getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

    public static GameMenuOption fromValue(int value) {
        for (GameMenuOption option : GameMenuOption.values()) {
            if (option.getValue() == value) {
                return option;
            }
        }
        throw new IllegalArgumentException("Invalid value for GameMenuOption: " + value);
    }

    @Override
    public String toString() {
        return switch (this) {
            case GO_TO_SCHOOL -> "Go to school";
            case GO_TO_WORK -> "Go to work";
            case GO_TO_TALK -> "Go to talk with someones";
            case GO_TO_EAT -> "Go to eat";
            case GO_TO_DRINK -> "Go to drink";
            case GO_TO_WALK -> "Go to walk";
            case GO_TO_SLEEP -> "Go to sleep";
            case EXIT_GAMES -> "Exit Games";
            default -> throw new IllegalArgumentException();
        };
    }
}
