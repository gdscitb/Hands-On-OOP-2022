package inheritance;
class Vehicle {
    protected String brand = "Ford"; //attribute
    public void honk(){
        System.out.println("HONK!");
    }
    
}


class Car extends Vehicle{
    private String modelName = "Mustang"; //Car attribute
    public static void main(String[] args) {
        //create object
        Car myCar = new Car();


        myCar.honk();


        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}