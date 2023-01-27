package fruit;
import fruit.apple.AppleFactory;
import fruit.watermelon.WatermelonFactory;

public class FruitFactory {
    public static AbstractFactory getFactory(String type) {
		if (type.equals("apple")) {
			return new AppleFactory();
		}
		if (type.equals("watermelon")) {
			return new WatermelonFactory();
		}
		return null;
	}
}
