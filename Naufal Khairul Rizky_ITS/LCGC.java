/*
 * Penjelasan di main
 */

public class LCGC extends Car {

    /*
    * speed gear setiap jenis car berbeda
    */

    public LCGC(String name, boolean isManual) {
        super(name, 4, 6, isManual, "Sedan");
    }

    public void accelerate (int rate){
        int newSpeed = getCurrentSpeed() + rate;
        
        
        /*
        *speed = 0 --> gear 1
        *speed = 10 - 30 --> gear 2
        *speed = 30 - 50 --> gear 3
        *speed = 50 - 70 --> gear 4
        *speed = 80 - 90 --> gear 5
        *speed > 90 --> gear 6
        */
        if (newSpeed == 0){
            stop();
            changeGear(1);
        } else if (newSpeed > 0 && newSpeed <= 10) {
            changeGear(1);
        } else if (newSpeed > 10 && newSpeed <= 20) {
            changeGear(2);
        } else if (newSpeed > 30 && newSpeed <= 50) {
            changeGear(3);
        } else if (newSpeed > 50 && newSpeed <= 70) {
            changeGear(4);
        } else if (newSpeed > 70 && newSpeed <= 90) {
            changeGear(5);
        } else{
            changeGear(6);
        }
        
        if (newSpeed > 0){
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
