import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// Peralatan gym list
// Kumpulan alat-alat gym
class Treadmill extends CardioEquipment {
    public Treadmill(String name, boolean used, int speed) {
        super(name, used, speed);
    }

    @Override
    public void use() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nMasukkan kecepatan treadmill (m/s) : ");
        int speed = input.nextInt();
        setSpeed(speed);
        System.out.println("\nMenggunakan treadmill: " + getName() + " dengan kecepatan " + getSpeed() + " m/s.");
    }
}

class Elliptical extends CardioEquipment {
    public Elliptical(String name, boolean used, int speed) {
        super(name, used, speed);
    }

    @Override
    public void use() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nMasukkan kecepatan elliptical (m/s) : ");
        int speed = input.nextInt();
        setSpeed(speed);
        System.out.println("\nMenggunakan elliptical: " + getName() + " dengan kecepatan " + getSpeed() + " m/s.");
    }
}

class BenchPress extends StrengthEquipment {
    public BenchPress(String name, boolean used, int weight) {
        super(name, used, weight);
    }

    @Override
    public void use() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nMasukkan berat beban (kg) : ");
        int weight = input.nextInt();
        setWeight(weight);
        System.out.println("\nMenggunakan bench press: " + getName() + " dengan berat " + getWeight() + " kg.");
    }
}

class SquatRack extends StrengthEquipment {
    public SquatRack(String name, boolean used, int weight) {
        super(name, used, weight);
    }

    @Override
    public void use() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nMasukkan berat beban (kg) : ");
        int weight = input.nextInt();
        setWeight(weight);
        System.out.println("\nMenggunakan bench press: " + getName() + " dengan berat " + getWeight() + " kg.");
    }
}

// Manajemen peralatan gym
class EquipmentManager {
    private List<GymEquipment> equipmentList;

    public EquipmentManager() {
        equipmentList = new ArrayList<>();
        equipmentList.add(new Treadmill("Treadmill 1", true, 0));
        equipmentList.add(new Treadmill("Treadmill 2", false, 0));

        equipmentList.add(new Elliptical("Elliptical 1", false, 0));
        equipmentList.add(new Elliptical("Elliptical 2",false, 0));


        equipmentList.add(new BenchPress("Bench Press 1",false, 0));
        equipmentList.add(new BenchPress("Bench Press 2", true, 0));

        equipmentList.add(new SquatRack("Squat Rack 1", true, 0));
        equipmentList.add(new SquatRack("Squat Rack 2", false, 0));

    }

    public List<GymEquipment> getEquipmentList() {
        return equipmentList;
    }
}