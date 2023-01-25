package types.Utility;

public enum FriendShip {
    BEST_FRIEND("Best Friend", 100),
    FRIEND("Friend", 50),
    ACQUAINTANCE("Acquaintance", 25),
    STRANGER("Stranger", 0);

    private final String name;
    private final int value;

    FriendShip(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getFriendShip() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
