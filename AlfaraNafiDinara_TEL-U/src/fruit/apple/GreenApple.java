package fruit.apple;

public class GreenApple extends Apple {
	
	@Override
	public String color() {
		return "hijau";
	}
	
	@Override
	public String name() {
		return "Granny Smith";
	}

	@Override
	public String flavor() {
		return "asam dan segar";
	}

	@Override
	public Integer price() {
		return 17000;
	}
}