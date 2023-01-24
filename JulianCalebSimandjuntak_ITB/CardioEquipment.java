// Peralatan gym cardio
public class CardioEquipment extends GymEquipment {
    private int speed;

    public CardioEquipment(String name, boolean used, int speed) {
        super(name, used);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void use() {}

}