package Menu;

public enum MenuOption {
    PLAY(1, "Play"),
    CREATE(2, "Create"),
    EXIT(3, "Exit");

    private final int value;
    private final String text;

    MenuOption(int value, String text) {
        this.value = value;
        this.text = text;
    }

    public int getValue() {
        return value;
    }

    public static MenuOption fromValue(int value) {
        for (MenuOption option : MenuOption.values()) {
            if (option.getValue() == value) {
                return option;
            }
        }
        throw new IllegalArgumentException("Invalid value for MenuOption: " + value);
    }

    @Override
    public String toString() {
        return switch (this) {
            case PLAY -> "Play";
            case CREATE -> "Create";
            case EXIT -> "Exit";
            default -> throw new IllegalArgumentException();
        };
    }


}
