package fruit.apple;
public class RedApple extends Apple {
	
	@Override
	public String color() {
		return "merah";
	}
	
	@Override
	public String name() {
		return "Red Delicious";
	}

	@Override
	public String flavor() {
		return "manis dan sedikit asam";
	}

	@Override
	public Integer price() {
		return 21000;
	}
}