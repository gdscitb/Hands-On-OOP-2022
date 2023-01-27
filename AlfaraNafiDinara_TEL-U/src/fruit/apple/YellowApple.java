package fruit.apple;

public class YellowApple extends Apple {
	
	@Override
	public String color() {
		return "kuning";
	}
	
	@Override
	public String name() {
		return "Golden Delicious ";
	}

	@Override
	public String flavor() {
		return "manis dan lembut";
	}

	@Override
	public Integer price() {
		return 25000;
	}
}