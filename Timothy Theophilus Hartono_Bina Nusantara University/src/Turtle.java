import java.util.concurrent.ThreadLocalRandom;

public class Turtle extends Runner {

	public Turtle(String name, String type) {
		super(name, type);
		this.speed = generateRunSpeed();
	}
	
	@Override
	public Integer move() {
		Integer rand = ThreadLocalRandom.current().nextInt(1, 11);
		Integer speed = ThreadLocalRandom.current().nextInt(1, this.speed+1);
		Integer specialMove = ThreadLocalRandom.current().nextInt(1, 11);
		
		if(specialMove > 7) {
			speed += 15;
		}
		return rand+speed+specialMove;
	}
	
	@Override
	public Integer generateRunSpeed() {
		Integer speed = ThreadLocalRandom.current().nextInt(0, 26);
		return speed + 25;
	}

	

}
