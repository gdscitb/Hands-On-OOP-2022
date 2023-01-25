package Validator;

import data.seeder.HumanSeeder;
import entity.Human;

import java.util.List;
import java.util.Scanner;

public class Validator {
    public static String getHumanName(Scanner sc, HumanSeeder humans) {
        while (true) {
            humans.printHumans();
            System.out.print("Enter the name of the human you want to play as: ");
            String name = sc.nextLine();
            if (!name.isEmpty()) {
                return name;
            }
            System.out.println("Invalid input!");
        }
    }

    public static Human getHumanByName(List<Human> humans, String name) {
        return humans.stream().filter(h -> h.getStatus().getName().equals(name)).findFirst().orElse(null);
    }
}
