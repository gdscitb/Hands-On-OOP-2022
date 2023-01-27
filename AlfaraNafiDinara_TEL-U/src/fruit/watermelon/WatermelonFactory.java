package fruit.watermelon;

import fruit.apple.Apple;
import fruit.AbstractFactory;

public class WatermelonFactory extends AbstractFactory {
	
    @Override
	protected Apple getApple(String type) {
		return null;
	}

	@Override
	protected Watermelon getWatermelon(String type) {
		
		if (type.equals("hijau")) {
			return new GreenWatermelon();
		}
		
		if (type.equals("merah")) {
			return new RedWatermelon();
		}
		
		if (type.equals("kuning")) {
			return new YellowWatermelon();
		}
		
		return null;
	}
}