/*
 * Penjelasan di main
 */

public class MPV extends Car {

    /*
    * speed gear setiap jenis car berbeda
    */

    public MPV(String name, boolean isManual) {
        super(name, 5, 6, isManual, "MPV");
    }

    public void accelerate (int rate){
        int newSpeed = getCurrentSpeed() + rate;
        
        
        /*
        *speed = 0 --> gear 1
        *speed = 10 - 40 --> gear 2
        *speed = 50 - 70 --> gear 3
        *speed = 70 - 100 --> gear 4
        *speed = 90 - 130 --> gear 5
        *speed > 130 --> gear 6
        */
        if (newSpeed == 0){
            stop();
            changeGear(1);
        } else if (newSpeed > 0 && newSpeed <= 10) {
            changeGear(1);
        } else if (newSpeed > 10 && newSpeed <= 40) {
            changeGear(2);
        } else if (newSpeed > 40 && newSpeed <= 70) {
            changeGear(3);
        } else if (newSpeed > 70 && newSpeed <= 100) {
            changeGear(4);
        } else if (newSpeed > 100 && newSpeed <= 130) {
            changeGear(5);
        } else{
            changeGear(6);
        }
        
        if (newSpeed > 0){
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
