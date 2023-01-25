package data.generator;
import entity.Human;

import java.util.ArrayList;

public class HumanGenerator {
    ArrayList<Human> humans = new ArrayList<>();
    /**
     *
     * @param human The human to add to the database.
     */
    public void addHuman(Human human) {
        humans.add(human);
    }
    /**
     *
     * @param human The human to remove from the database.
     */
    public void removeHuman(Human human) {
        humans.remove(human);
    }
    /**
     *
     * @param name The name of the human to find.
     * @return The human with the given name.
     */
    public Human findHuman(String name) {
        for (Human human : humans) {
            if (human.getStatus().getName().equals(name)) {
                return human;
            }
        }
        return null;
    }
    /**
     * Prints all humans in the database.
     */
    public void printHumans() {
        for (Human human : humans) {
            System.out.println(human.getStatus().getName());
        }
    }
    /**
     *
     * @param human The human to print.
     */
    public void printHuman(Human human) {
        System.out.println(human.getStatus().getName());
    }

    public ArrayList<Human> getHumans() {
        return humans;
    }

}
