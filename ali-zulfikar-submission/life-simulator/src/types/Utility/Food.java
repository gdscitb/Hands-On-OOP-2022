package types.Utility;

public enum Food {
    APPLE("Apple", 3),
    BANANA("Banana", 5),
    ORANGE("Orange", 4),
    PEAR("Pear", 2),
    PINEAPPLE("Pineapple", 4),
    WATERMELON("Watermelon", 3),
    BREAD("Bread", 1),
    PIZZA("Pizza", 5),
    PASTA("Pasta", 3),
    RICE("Rice", 10),
    CHICKEN("Chicken", 10);

    private final String name;
    private final int value;

    Food(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public static void printAll() {
        for (Food food : Food.values()) {
            System.out.println(food.getFood() + " " + food.getValue());
        }
    }

    public String getFood() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
