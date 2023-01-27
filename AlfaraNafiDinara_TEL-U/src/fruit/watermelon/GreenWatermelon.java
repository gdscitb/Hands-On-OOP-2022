package fruit.watermelon;

public class GreenWatermelon extends Watermelon {
	
	@Override
	public String color() {
		return "hijau";
	}
	
	@Override
	public String name() {
		return "Honeydew";
	}

	@Override
	public String flavor() {
		return "manis dan sedikit asam";
	}

	@Override
	public Integer price() {
		return 10000;
	}
}