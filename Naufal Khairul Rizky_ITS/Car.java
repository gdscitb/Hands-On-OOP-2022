/*
 * Penjelasan di main
 */

public abstract class Car extends Vehicle {
    private String type;
    private boolean isManual;
    private int doors;
    private int gears;
    private int currentGear;

    public Car(String name, int doors, int gears, boolean isManual, String type){
        super(name);
        this.type = type;
        this.doors = doors;
        this.isManual = isManual;
        currentGear = 1;
    }

    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("Changed to " + this.currentGear + " gear");
    }
    
    public void changeSpeed (int newSpeed, int newDirection){
        move(newSpeed, newDirection);
        System.out.println("Speed: " + newSpeed + " &  direction: " + newDirection);
    }
}
