

class Tool {
    public void getTool(){

    }
}

class Gunting extends Tool{
    public void getTool(){
        System.out.println("This is gunting!");
    }
    
}

class Gergaji extends Tool{
    public void getTool(){
        System.out.println("This is gergaji!");
    }
}

class Main {
    public static void main(String[] args) {
        Tool myGunting = new Gunting();
        Tool myGergaji = new Gergaji();

        myGunting.getTool();
        myGergaji.getTool();
    }
}
