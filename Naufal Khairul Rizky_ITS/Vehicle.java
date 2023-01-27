/*
 * Penjelasan di main
 */


public class Vehicle {
    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle (String name){
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Move steering to " + currentDirection + "degrees");
    }

    public void move (int speed, int direction) {
        currentSpeed = speed;
        currentDirection = direction;
        System.out.println("Moving at " + currentSpeed + " in direction " + currentDirection);
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    
    public int getCurrentSpeed(){
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed){
        this.currentSpeed = currentSpeed;
    }

    
    public int getCurrentDirection(){
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection){
        this.currentDirection = currentDirection;
    }

    public void stop(){
        this.currentSpeed = 0;
    }

}
