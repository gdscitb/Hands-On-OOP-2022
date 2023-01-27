package fruit.watermelon;

public class YellowWatermelon extends Watermelon {
	
	@Override
	public String color() {
		return "kuning";
	}
	
	@Override
	public String name() {
		return "Yellow Flesh";
	}

	@Override
	public String flavor() {
		return "manis dan juicy";
	}

	@Override
	public Integer price() {
		return 12000;
	}
}