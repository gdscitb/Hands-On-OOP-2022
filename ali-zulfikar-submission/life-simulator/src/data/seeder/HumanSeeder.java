package data.seeder;

import data.generator.HumanGenerator;
import entity.Human;
import data.factory.HumanFactory;
import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class HumanSeeder {
    static HumanGenerator humanData = new HumanGenerator();
    public HumanSeeder(int amount) {
        create(amount);
    }
    public static void create(int amount) {
        ArrayList<Human> humans = new ArrayList<>();
        System.out.print("Creating humans...");
        try {
            for (int i = 0; i < 10; i++) {
                sleep(100);
                System.out.print(".");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < amount; i++) {
            HumanFactory hf = new HumanFactory();
            humanData.addHuman(hf.createRandomHuman());
        }
        System.out.println("\nHumans created!");
    }

    public ArrayList<Human> getHumans() {
        return humanData.getHumans();
    }

    public void printHumans() {
        humanData.printHumans();
    }
}
