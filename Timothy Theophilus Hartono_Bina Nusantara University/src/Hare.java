import java.util.concurrent.ThreadLocalRandom;

public class Hare extends Runner {

	public Hare(String name, String type) {
		super(name, type);
		this.speed = generateRunSpeed();
	}
	
	@Override
	public Integer move() {
		Integer rand = ThreadLocalRandom.current().nextInt(1, this.speed+1);
		return rand;
	}
	
	@Override
	public Integer generateRunSpeed() {
		Integer speed = ThreadLocalRandom.current().nextInt(0, 51);
		return speed + 25;
	}

	

}
