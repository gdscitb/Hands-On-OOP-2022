package fruit.apple;
import fruit.watermelon.Watermelon;
import fruit.AbstractFactory;

public class AppleFactory extends AbstractFactory {
	
    @Override
	protected Watermelon getWatermelon(String type) {
		return null;
	}

	@Override
	protected Apple getApple(String type) {
		
		if (type.equals("hijau")) {
			return new GreenApple();
		}
		
		if (type.equals("merah")) {
			return new RedApple();
		}
		
		if (type.equals("kuning")) {
			return new YellowApple();
		}
		
		return null;
	}
}