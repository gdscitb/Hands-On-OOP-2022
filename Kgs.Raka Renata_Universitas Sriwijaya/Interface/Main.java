//dalam interface ini, saya menggunakan Factory pattern, karena sangat direkomendasikan jika dalam kondisi 
//di mana tipe objek tidak dapat didefinisikan secara langsung


interface Vehicle {
    void honk();
    
}

class Toyota implements Vehicle{
    public void honk(){
        System.out.println("Tut tut! toyota car is here!");
    }
}

class Honda implements Vehicle{
    public void honk() {
        System.out.println("Tut tut! Honda car is here!");
        
    }
}

class Main {
    public static Vehicle getVehicle(String vehicleType){
        if(vehicleType == null){
            return null;
        }
        if(vehicleType.equalsIgnoreCase("TOYOTA")){
            return new Toyota();
        }
        if(vehicleType.equalsIgnoreCase("HONDA")){
            return new Honda();
        }
        return null;
    }
    public static void main(String[] args) {
        getVehicle("toyota").honk();
        getVehicle("honda").honk();
    }
}
