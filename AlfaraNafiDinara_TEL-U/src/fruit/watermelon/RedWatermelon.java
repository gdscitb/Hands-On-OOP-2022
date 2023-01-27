package fruit.watermelon;

public class RedWatermelon extends Watermelon {
	
	@Override
	public String color() {
		return "merah";
	}
	
	@Override
	public String name() {
		return "Crimson Sweet";
	}

	@Override
	public String flavor() {
		return "manis dan segar";
	}

	@Override
	public Integer price() {
		return 15000;
	}
}